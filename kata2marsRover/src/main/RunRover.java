package src.main;

public class RunRover {

    //Position of rover (and output): XYorientation (3:0:N for example, or 0:3:0:N if there is an obstacle)
    //Grid is 10x10
    //input: L (left), R (right), M (move)
    //given a grid with no obstacles, input MMRMMLM gives output 2:3:N
    //given a grid with no obstacles, input MMMMMMMMMM gives output 0:0:N (due to wrap-around)
    //given a grid with an obstacle at (0, 3), input MMMM gives output O:0:2:N
    public String moveForward() {
        return "a";
    }
}
