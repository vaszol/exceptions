package ru.vaszol.exceptions;

/**
 * Created by vas on 31.03.2015.
 */
public class Generator {
    // ������ ����� ������ � ��������� ����, ��� �� �������� ������
    // ���������� ���� SimpleException
    public String helloMessage(String name) throws SimpleException
    {
        if (name == null) {
            // �� ������ ������� ������� ������-����������
            SimpleException se = new SimpleException(10, "Message is null");
            // ������ �� ����� "������" ��� ���������� - ��� ������ ������ �����
            // �� ������ - �������� �� �������� � return
            throw se;

            // ����� ���������� �������� � ������� - ������ ����������������
            // ���������� ������ � ������������ ���������������
            // throw new SimpleException(10, "Message is null");
        }
        return "Hello, " + name;
    }
}
