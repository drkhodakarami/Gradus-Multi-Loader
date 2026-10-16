package com.dynamero.materias.utils;

/**
 * This exception class is used to prevent instantiation of the {@link RuntimeException} class.
 * <p>
 * The purpose of this exception is to ensure that the {@link RuntimeException} class should not be instantiated, which can lead to unexpected behavior or security issues if it were allowed.
 * </p>
 *
 * @author Alireza Khodakarami (TheMentor)
 * @version 1.0
 * @since 2025-04-18
 */
public class RuntimeExeException extends RuntimeException
{
    /**
     * The default message thrown by the {@link RuntimeException}.
     */
    public static String RUNTIME_ERROR_TEXT = "Error executing code!";

    /**
     * Constructor that throws the {@link RuntimeException} with a default message.
     */
    public RuntimeExeException()
    {
        super(RUNTIME_ERROR_TEXT);
    }
}