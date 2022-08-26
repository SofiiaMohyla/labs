public class LucasNumbers {
    /** {@code int} field that shows the order of the Lucas Number */
    private int number;
    /** {@code long} field that shows the value of the Lucas Number */
    private long value;
    /** Default constructor */
    LucasNumbers() {
        number = 2;
    }
    int GetNumber() {
        return number;
    }
    void SetNumber(int num) {
        number = num;
    }
    long GetValue()  {
        return value;
    }
    void SetValue(long val) {
        value = val;
    }
    /**
     * Assigns  {@code val} to the field {@code value}
     * and increases field {@code number} by 1
     * @param val long parameter that is assigned to the field {@code value}
     *
     */
    void NextValue(long val) {
        value = val;
        number++;
    }
}


