package com.polytech.bsm.strategy;

import com.polytech.bsm.clock.FullTime;

//import org.apache.commons.net.ntp.NTPUDPClient;
//import org.apache.commons.net.ntp.TimeInfo;

//import javax.xml.crypto.Data;
//import java.io.IOException;
//import java.net.InetAddress;
//import java.net.UnknownHostException;
//import java.util.Date;


public class StrategyServer implements Strategy
{
//    private String TIME_SERVER;
//    private NTPUDPClient timeClient;
//    private InetAddress inetAddress;
//
//    public StrategyServer(String server)
//    {
//        TIME_SERVER = server;
//        timeClient = new NTPUDPClient();
//
//    }
//
    public FullTime getTime()
    {
//        try {
//            inetAddress = InetAddress.getByName(TIME_SERVER);
//            TimeInfo timeInfo = timeClient.getTime(inetAddress);
//            long returnTime = timeInfo.getMessage().getTransmitTimeStamp().getTime();
//            Date time = new Date(returnTime);
//            System.out.println("Time from " + TIME_SERVER + ": " + time);
//        }
//        catch (IOException e)
//        {
//            System.out.println(e);
//        }
        return null;
    }
}
