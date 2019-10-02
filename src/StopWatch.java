public class StopWatch {
    private double startTime, endTime;

    public StopWatch() {
    }

    public double getStartTime() {
        return startTime;
    }

    //ko can dung den tham so startTime?
    public void setStartTime() {
        this.startTime = System.currentTimeMillis();
    }

    public double getEndTime() {
        return endTime;
    }

    public void setEndTime() {
        this.endTime = System.currentTimeMillis();
    }

    //getEndTime-getStartTime hay endTime-startTime
    public double getElapsedTime() {
        return getEndTime() - getStartTime();
    }
}
