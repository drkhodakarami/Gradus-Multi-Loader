package com.dynamero.materias.utils;

/**
 * This exception class is used to prevent instantiation of the {@link ArgumentException} class.
 * <p>
 * The purpose of this exception is to ensure that the {@link ArgumentException} class should not be instantiated, which can lead to unexpected behavior or security issues if it were allowed.
 * </p>
 *
 * @author Alireza Khodakarami (TheMentor)
 * @version 1.0
 * @since 2025-04-18
 */
public class ArgumentException extends RuntimeException
{
    /**
     * The default message thrown by the {@link ArgumentException}.
     */
    public static String ARGUMENT_ERROR_TEXT = "Argument not acceptable!";

    /**
     * Constructor that throws the {@link ArgumentException} with a default message.
     */
    public ArgumentException()
    {
        super(ARGUMENT_ERROR_TEXT);
    }
}