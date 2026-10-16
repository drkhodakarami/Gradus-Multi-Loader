package com.dynamero.materias.utils;

/**
 * Contains custom exceptions for the Jibase project.
 */
public class Exceptions
{
    /**
     * Private constructor to prevent instantiation.
     */
    public Exceptions()
    {
        throwCtorAssertion();
    }

    /**
     * Throws an assertion error if the constructor is invoked directly.
     *
     * @throws InitCtorException always, as this method is a singleton and should not be instantiated
     */
    public static void throwCtorAssertion()
    {
        throw new InitCtorException();
    }

    public static void throwRuntimeException()
    {
        throw new RuntimeExeException();
    }

    public static void throwArgumentException()
    {
        throw new ArgumentException();
    }
}