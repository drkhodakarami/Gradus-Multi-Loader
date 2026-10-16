package com.dynamero.materias.utils;

/**
 * This exception class is used to prevent instantiation of the {@link InitCtorException} class.
 * <p>
 * The purpose of this exception is to ensure that the {@link InitCtorException} class should not be instantiated, which can lead to unexpected behavior or security issues if it were allowed.
 * </p>
 *
 * @author Alireza Khodakarami (TheMentor)
 * @version 1.0
 * @since 2025-04-18
 */
public class InitCtorException extends RuntimeException
{
    /**
     * The default message thrown by the {@link InitCtorException}.
     */
    public static String METHOD_CTOR_ASSERTION_TEXT = "This class should not be instantiated";

    /**
     * Constructor that throws the {@link InitCtorException} with a default message.
     */
    public InitCtorException()
    {
        super(METHOD_CTOR_ASSERTION_TEXT);
    }
}