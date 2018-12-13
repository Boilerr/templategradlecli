package com.boilerr.templategradlecli;


import org.apache.commons.math3.stat.StatUtils;

class StatsAndPrint {

    private double[] data;

    StatsAndPrint(double[] data) {
        this.data = data;
    }


    void doFirstStats() {
        System.out.println();
        System.out.println("Start of doFirstStats");

        System.out.format("Geometric mean: %f%n", StatUtils.geometricMean(data));
        System.out.format("Arithmetic mean: %f%n", StatUtils.mean(data));
        System.out.format("Max: %f%n", StatUtils.max(data));
        System.out.format("Min: %f%n", StatUtils.min(data));
        System.out.format("Sum: %f%n", StatUtils.sum(data));
        System.out.format("Variance: %f%n", StatUtils.variance(data));

        System.out.println("End of doFirstStats");

    }

    void doSecondStats() {
        System.out.println();
        System.out.println("Start of doSecondStats");

        System.out.format("min 1,2: %f%n", StatUtils.min(data, 1, 2));
        System.out.format("populationVariance: %f%n", StatUtils.populationVariance(data));
        System.out.format("sumLog: %f%n", StatUtils.sumLog(data));
        System.out.format("product: %f%n", StatUtils.product(data));
        System.out.format("sumSq: %f%n", StatUtils.sumSq(data));
        System.out.format("variance: %f%n", StatUtils.variance(data));

        System.out.println("End of doSecondStats");

    }
}
