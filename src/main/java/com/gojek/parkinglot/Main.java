package com.gojek.parkinglot;

import com.gojek.parkinglot.Engine.AbstractEngine;
import com.gojek.parkinglot.Engine.RequestEngine;
import com.gojek.parkinglot.Service.Impl.ServiceImpl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        args = new String[1];
        args[0] = "/Users/kumargaurav/Office/git/gojekparkinglot/src/main/resources/parklot_inputs.txt";
        BufferedReader bufferReader = null;
        String input = null;

        AbstractEngine engine = new RequestEngine();
        engine.setService(new ServiceImpl());

        File inputFile = new File(args[0]);
        try
        {
            bufferReader = new BufferedReader(new FileReader(inputFile));
            int lineNo = 1;
            while ((input = bufferReader.readLine()) != null)
            {
                input = input.trim();
                if(engine.validate(input)){
                    try
                    {
                        engine.execute(input);
                    }
                    catch (Exception e)
                    {
                        System.out.println(e.getMessage());
                    }
                }else
                    System.out.println("Incorrect Command Found at line: " + lineNo + " ,Input: " + input);

                lineNo++;
            }
        }
        catch (Exception e)
        {   e.printStackTrace();
            System.out.println(e.getMessage());
        }
        finally
        {
            try
            {
                if (bufferReader != null)
                    bufferReader.close();
            }
            catch (IOException e)
            {
            }
        }


    }

}
