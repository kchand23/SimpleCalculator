package com.example.mymath;

public class CalcClass {
    public CalcClass() {

    }

    public float evaluateTypeOne(String a)
    {
        String[] statement = a.split(" ");
        int num1 = Integer.parseInt(statement[0]);
        int num2 = Integer.parseInt(statement[2]);
        String  op = statement[1];
        float ans;
        if(op.equals("+"))
        {
            return num1 + num2;
        }
        else if(op.equals("-"))
        {
            return num1 - num2;
        }

        else if(op.equals("/"))
        {
            if(num2 != 0)
            {
                return  num1/num2;
            }
        }

        else if(op.equals("*"))
        {
            return num1 * num2;
        }

        return (float) 0.0;
    }

    public float evaluateTypeTwo(String s)
    {
        String[]  statement = s.split(" ");
        String trig = statement[0];
        int num = Integer.parseInt(statement[1]);

        if(trig.equals("sin"))
        {
            return (float) Math.sin(Math.toRadians(num));
        }
        else if(trig.equals("cos"))
        {
            return (float) Math.cos(Math.toRadians(num));
        }

        else if(trig.equals("tan"))
        {
            return (float) Math.tan(Math.toRadians(num));
        }

        return (float) 0.0;
    }


}
