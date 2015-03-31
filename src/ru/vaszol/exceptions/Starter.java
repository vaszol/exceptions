package ru.vaszol.exceptions;

/**
 * Created by vas on 31.03.2015.
 */
public class Starter {
    public static void main(String[] args)
    {
        // ������� ��� ����� ��� ��������� ����������
        Generator generator = new Generator();

        // ������ ���� ����� ������������ ����������
        // � ��� ��� ������������� ��������� - �� �� �������� null
        try {
            String answer = generator.helloMessage(null);
            System.out.println("Answer 1:" + answer);
        } catch (SimpleException ex) {
            // ����� �� ����� ���������� ������-����������,
            // �������� ��������� �����������
            System.out.println("Error code:" + ex.getErrorCode());
            System.out.println("Error message:" + ex.getMessage());
        }

        // ������ ���� ����� ������������ ����������
        // �� ��� �� ����� - �� �������� ���������� ��������
        try {
            String answer = generator.helloMessage("Yoda");
            System.out.println("Answer 2:" + answer);
        } catch (SimpleException ex) {
            // ����� �� ����� ���������� ������-����������,
            // �������� ��������� �����������
            System.out.println("Error:" + ex.getMessage());
        }
    }
}
