package session2;

import java.util.Scanner;

public class Matrix {
    private int row;
    private int column;
    private double[][] matrix;

    public Matrix(int row, int column) {
        this.row = row;
        this.column = column;
        this.matrix = new double[row][column];
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public void inputMatrix() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.printf("[%d][%d] = ", i, j);
                matrix[i][j] = sc.nextDouble();
            }
        }
    }
    
    public void printMatrix() {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.printf("%5.1f", matrix[i][j]);
            }
            System.out.println("");
        }
    }
    
    public Matrix addMatrix(Matrix m1, Matrix m2) {
        Matrix result = new Matrix(m1.row, m1.column);
        
        if(m1.row == m2.row && m1.column == m2.column) {
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < column; j++) {
                    result.matrix[i][j] = m1.matrix[i][j] + m2.matrix[i][j];
                }
            }
            return result;
        } else {
            return null;
        }
    }
    
    public Matrix subMatrix(Matrix m1, Matrix m2) {
        Matrix result = new Matrix(m1.row, m1.column);
        
        if(m1.row == m2.row && m1.column == m2.column) {
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < column; j++) {
                    result.matrix[i][j] = m1.matrix[i][j] - m2.matrix[i][j];
                }
            }
            return result;
        } else {
            return null;
        }
    }
    
    public Matrix mulMatrix(Matrix m1, Matrix m2) {
        Matrix result = new Matrix(m1.row, m2.column);
        
        if(m1.column == m2.row) {
            for (int i = 0; i < m1.row; i++) {
                for (int j = 0; j < m2.column; j++) {
                    result.matrix[i][j] = 0;
                    for (int k = 0; k < m1.column; k++) {
                        result.matrix[i][j] += m1.matrix[i][k] * m2.matrix[k][j];
                    }
                }
            }
            return result;
        } else {
            return null;
        }
    }
    
    public static void main(String[] args) {
        Matrix m1 = new Matrix(2, 3);
        Matrix m2 = new Matrix(3, 3);
        System.out.println("Nhap ma tran thu nhat");
        m1.inputMatrix();
        System.out.println("Nhap ma tran thu hai");
        m2.inputMatrix();
        System.out.println("Ma tran thu nhat la");
        m1.printMatrix();
        System.out.println("Ma tran thu hai la");
        m2.printMatrix();
        
        if(m1.addMatrix(m1, m2) != null) {
            System.out.println("Tong hai ma tran");
            m1.addMatrix(m1, m2).printMatrix();
        } else{
            System.out.println("Khong co TONG vi ma tran khong hop le");
        }
        
        if(m1.subMatrix(m1, m2) != null) {
            System.out.println("Hieu hai ma tran");
            m1.subMatrix(m1, m2).printMatrix();
        } else{
            System.out.println("Khong co HIEU vi ma tran khong hop le");
        }
        
        if(m1.mulMatrix(m1, m2) != null) {
            System.out.println("Tich hai ma tran");
            m1.mulMatrix(m1, m2).printMatrix();
        } else{
            System.out.println("Khong co TICH vi ma tran khong hop le");
        }
    }
}
