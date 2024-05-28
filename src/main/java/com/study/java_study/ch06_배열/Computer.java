package com.study.java_study.ch06_배열;

public class Computer {
    private String cpu;
    private String ram;


    //생성자
    public Computer(String cpu, String ram) {
        this.cpu = cpu;
        this.ram = ram;
    }

    // Getter 와 Setter
    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", ram='" + ram + '\'' +
                '}';
    }
}



