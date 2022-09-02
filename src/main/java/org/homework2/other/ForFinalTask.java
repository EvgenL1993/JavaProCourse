package org.homework2.other;

public class ForFinalTask {
    private final String first;
    private final String second;
    private final String example;

    public ForFinalTask(String first, String second, String example) {
        this.first = first;
        this.second = second;
        this.example = example;
    }
    // public ForFinalTask(){} - в таком случае нельзя использовать пустой конструктор
//   public void setFirst(String first) {  --- нельзя сетеры использовать
//       this.first = first;
//   }

    public String getFirst() {
        return first;
    }

    public String getSecond() {
        return second;
    }

    public String getExample() {
        return example;
    }
}
