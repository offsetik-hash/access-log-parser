class Fraction extends Number {
    private int num;
    private int denum;

    public Fraction(int num, int denum) {
        if (denum == 0) {
            throw new IllegalArgumentException("Знаменатель не может быть равен нулю.");
        }
        this.num = num;
        this.denum = denum;
    }

    @Override
    public byte byteValue() {
        return (byte) (num / (double) denum);
    }

    @Override
    public short shortValue() {
        return (short) (num / (double) denum);
    }

    @Override
    public int intValue() {
        return num / denum;
    }

    @Override
    public long longValue() {
        return (long) (num / (double) denum);
    }

    @Override
    public float floatValue() {
        return (float) num / denum;
    }

    @Override
    public double doubleValue() {
        return (double) num / denum;
    }

    @Override
    public String toString() {
        return num + "/" + denum;
    }
}
