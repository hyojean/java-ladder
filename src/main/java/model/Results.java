package model;

import java.util.List;

public class Results {

    private final List<String> resultValues;

    public Results(List<String> resultValues) {
        this.resultValues = resultValues;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (String resultValue : resultValues) {
            stringBuilder.append(resultValue);
            stringBuilder.append("\t");
        }
        return stringBuilder.toString();
    }
}