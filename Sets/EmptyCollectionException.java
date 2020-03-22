/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package bingoballs;

/**
 *
 * @author agomezdg
 */
public class EmptyCollectionException extends RuntimeException{
    public EmptyCollectionException() {
        super("The collection is empty.");
    }

    public EmptyCollectionException(String message) {
        super(message);
    }
}
