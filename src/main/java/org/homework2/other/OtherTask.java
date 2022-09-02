package org.homework2.other;

public class OtherTask {

    private byte byteValue;
    private short shortValue;
    private long longValue;
    private float floatValue;
    private boolean booleanValue;
    private char symbol;
    private int intFirstValue;
    private double doubleFirstValue;
    private String example;

    public OtherTask() {
    }

    public OtherTask(byte byteValue) {
        this.byteValue = byteValue;
    }

    public OtherTask(byte byteValue, short shortValue) {
        this.byteValue = byteValue;
        this.shortValue = shortValue;
    }

    public OtherTask(byte byteValue, short shortValue, long longValue) {
        this.byteValue = byteValue;
        this.shortValue = shortValue;
        this.longValue = longValue;
    }

    public OtherTask(byte byteValue, short shortValue, long longValue, float floatValue) {
        this.byteValue = byteValue;
        this.shortValue = shortValue;
        this.longValue = longValue;
        this.floatValue = floatValue;
    }

    public OtherTask(byte byteValue, short shortValue, long longValue, float floatValue, boolean booleanValue) {
        this.byteValue = byteValue;
        this.shortValue = shortValue;
        this.longValue = longValue;
        this.floatValue = floatValue;
        this.booleanValue = booleanValue;
    }

    public OtherTask(byte byteValue, short shortValue, long longValue, float floatValue, boolean booleanValue, char symbol) {
        this.byteValue = byteValue;
        this.shortValue = shortValue;
        this.longValue = longValue;
        this.floatValue = floatValue;
        this.booleanValue = booleanValue;
        this.symbol = symbol;
    }

    public OtherTask(byte byteValue, short shortValue, long longValue, float floatValue, boolean booleanValue, char symbol, int intFirstValue, double doubleFirstValue) {
        this.byteValue = byteValue;
        this.shortValue = shortValue;
        this.longValue = longValue;
        this.floatValue = floatValue;
        this.booleanValue = booleanValue;
        this.symbol = symbol;
        this.intFirstValue = intFirstValue;
        this.doubleFirstValue = doubleFirstValue;
    }

    public OtherTask(byte byteValue, short shortValue, long longValue, float floatValue, boolean booleanValue, char symbol, int intFirstValue, double doubleFirstValue, String example) {
        this.byteValue = byteValue;
        this.shortValue = shortValue;
        this.longValue = longValue;
        this.floatValue = floatValue;
        this.booleanValue = booleanValue;
        this.symbol = symbol;
        this.intFirstValue = intFirstValue;
        this.doubleFirstValue = doubleFirstValue;
        this.example = example;
    }

    public byte getByteValue() {
        return byteValue;
    }

    public void setByteValue(byte byteValue) {
        this.byteValue = byteValue;
    }

    public short getShortValue() {
        return shortValue;
    }

    public void setShortValue(short shortValue) {
        this.shortValue = shortValue;
    }

    public long getLongValue() {
        return longValue;
    }

    public void setLongValue(long longValue) {
        this.longValue = longValue;
    }

    public float getFloatValue() {
        return floatValue;
    }

    public void setFloatValue(float floatValue) {
        this.floatValue = floatValue;
    }

    public boolean isBooleanValue() {
        return booleanValue;
    }

    public void setBooleanValue(boolean booleanValue) {
        this.booleanValue = booleanValue;
    }

    public char getSymbol() {
        return symbol;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }

    public int getIntFirstValue() {
        return intFirstValue;
    }

    public void setIntFirstValue(int intFirstValue) {
        this.intFirstValue = intFirstValue;
    }

    public double getDoubleFirstValue() {
        return doubleFirstValue;
    }

    public void setDoubleFirstValue(double doubleFirstValue) {
        this.doubleFirstValue = doubleFirstValue;
    }

    public String getExample() {
        return example;
    }

    public void setExample(String example) {
        this.example = example;
    }
}
