import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.StdStats;
import edu.princeton.cs.algs4.WeightedQuickUnionUF;

public class Percolation {
    private boolean[][] grid;
    private int counter;
    private int n;

    // creates n-by-n grid, with all sites initially blocked
    public Percolation(int n){
        this.grid = new boolean[n][n];
        this.counter = 0;
        this.n = n;
    }

    // opens the site (row, col) if it is not open already
    public void open(int row, int col){
        grid[row][col] = true;
        counter ++;
    }

    // is the site (row, col) open?
    public boolean isOpen(int row, int col){
        return grid[row][col];
    }

    // is the site (row, col) full?
    public boolean isFull(int row, int col){
        return find(1, 1, row, col);    // need to be fixed
    }

    // returns the number of open sites
    public int numberOfOpenSites(){
        return counter;
    }

    // does the system percolate?
    public boolean percolates(){
        return find(1, 1, n, n); // need to be fixed
    }

    // to find if 2 point is connected?
    private boolean find(int s1, int s2, int e1, int e2){

        return true; //did not finished
    }

    // test client (optional)
    public static void main(String[] args){
        
    }
}
