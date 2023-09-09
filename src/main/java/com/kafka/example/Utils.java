package com.kafka.example;

import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;
import java.util.UUID;

public class Utils {
    public static String generateUniqueKey() throws SocketException {
        Enumeration<NetworkInterface> interfaces = NetworkInterface.getNetworkInterfaces();
        while (interfaces.hasMoreElements()) {
            NetworkInterface networkInterface = interfaces.nextElement();
            byte[] macAddress = networkInterface.getHardwareAddress();
            if (macAddress != null) {
                StringBuilder macAddressString = new StringBuilder();
                for (int i = 0; i < macAddress.length; i++) {
                    macAddressString.append(String.format("%02x", macAddress[i])).append("-").append(UUID.randomUUID());
                }
                return macAddressString.toString();
            }
        }
        return "";
    }
}
