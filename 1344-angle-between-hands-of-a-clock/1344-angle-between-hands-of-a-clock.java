class Solution {
    public double angleClock(int hour, int minutes) {
    double angle = Math.abs(hour * 30 - minutes * 11.0 / 2);
     return Math.min(angle, 360 - angle);
    }
}