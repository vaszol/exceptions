package ru.vaszol.exceptions;

/**
 * Created by vas on 31.03.2015.
 */
public class Generator {
    // ƒанный метод описан с указанием того, что он способен кинуть
    // исключение типа SimpleException
    public String helloMessage(String name) throws FirstException, SecondException
    {
        if ("FIRST".equals(name)) {
            throw new FirstException("FirstException occured");
        }
        if("SECOND".equals(name)) {
            throw new SecondException("SecondException occured");
        }
        return "Hello, " + name;
    }
}
