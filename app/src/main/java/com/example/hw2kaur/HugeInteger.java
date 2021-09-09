package com.example.hw2kaur;

import java.util.logging.Handler;

public class HugeInteger
{
    private LinkedList theNumber;
    private String stringRep;

    public HugeInteger(String num)
    {
        this.theNumber = new LinkedList();
        this.stringRep = num;

        for (int i = 0; i < num.length(); i++)
        {
            this.theNumber.addFront(Integer.parseInt("" + num.charAt(i)));
        }
    }

    public String toString()
    {
        return this.stringRep;
    }

    public HugeInteger add(HugeInteger i)
    {
        //add this huge integer to i to produce a new huge integer
        int carry = 0;
        int thisCount = this.theNumber.count();
        int thisPos = 0;
        int iCount = i.theNumber.count();
        int iPos = 0;

        String answer = "";

        while (thisPos < thisCount || iPos < iCount)
        {
            int sum = 0;
            if (thisPos < thisCount)
            {
                sum = sum + this.theNumber.getAtPos(thisPos);
                thisPos++;
            }
            if (iPos < iCount)
            {
                sum = sum + i.theNumber.getAtPos(iPos);
                iPos++;
            }

            sum = sum + carry;
            if (sum > 10)
            {
                carry = 1;
                sum = sum - 10;
            }
            else
                {
                carry = 0;
                }
            answer = sum + answer;
        }

        if(carry == 1)
        {
            answer = carry + answer;
        }
        return new HugeInteger(answer);
    }
}
