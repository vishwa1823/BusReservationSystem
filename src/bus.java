public class bus {
    private int busNo;
    private int capacity;
    private boolean ac;

    public  int getBusNo() {
        return busNo;
    }

    public void setBusNo(int busNo) {
        this.busNo = busNo;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public boolean isAc() {
        return ac;
    }

    public void setAc(boolean ac) {
        this.ac = ac;
    }

    public bus(int busNo, int capacity, boolean ac) {
        this.busNo = busNo;
        this.capacity = capacity;
        this.ac = ac;

    }
    public void Displaybusinfo(){
        System.out.println("BUS NUMBER-"+busNo+"AC OR NOT-"+ac +"CAPACITY OF BUS-"+capacity);
    }
}
