package ru.vaszol.exceptions;

/**
 * Created by vas on 31.03.2015.
 */
public class Starter {
    public static void main(String[] args)
    {
        Generator generator = new Generator();

        try {
            String answer = generator.helloMessage("FIRST");
            //String answer = generator.helloMessage("SECOND");
            //String answer = generator.helloMessage("OTHER");
            System.out.println("Answer 1:" + answer);
        } catch (FirstException ex) {
            System.out.println("Error message:" + ex.getMessage());
        } catch (SecondException ex) {
            System.out.println("Error message:" + ex.getMessage());
        } catch (Exception ex) {
            System.out.println("Error message:" + ex.getMessage());
        }
    }
}
