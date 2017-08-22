/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game.debug;
import game.framework.Matrix;

/**
 *
 * @author octavian.bodnariu
 */
public class MatrixDebug {
    private static Matrix mat;
    
    public static void main(String args[])
    {
        mat = new Matrix(new float[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, 3, 3);
        System.out.println(mat.toString());
    }
}
