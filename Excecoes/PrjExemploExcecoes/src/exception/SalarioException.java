/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Exception.java to edit this template
 */
package exception;

/**
 *
 * @author mpisc
 */
public class SalarioException extends Exception{

    /**
     * Creates a new instance of <code>NewException</code> without detail
     * message.
     */
    public SalarioException() {
    }

    /**
     * Constructs an instance of <code>NewException</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public SalarioException(String msg) {
        super(msg);
    }
}
