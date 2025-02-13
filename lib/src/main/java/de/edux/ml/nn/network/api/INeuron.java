package de.edux.ml.nn.network.api;

public interface INeuron {
    double calculateOutput(double[] inputs);

    double calculateError(double targetOutput);

    void updateWeights(double[] inputs, double error);

}