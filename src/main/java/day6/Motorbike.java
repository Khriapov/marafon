package day6;

class Motorbike {
    private String model;
    private String color;
    private int year;

    public Motorbike(String model, String color, int year) {
        this.model = model;
        this.color = color;
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public void info() {
        System.out.println("Это мотоцикл");
    }

    public int yearDifference(int inputYear) {
        return Math.abs(inputYear - year);
    }


    public void getInfo() {
        System.out.println("Модель мотобайка: " + getModel());
        System.out.println("Цвет мотобайка: " + getColor());
        System.out.println("Год выпуска мотобайка: " + getYear());
    }
}
