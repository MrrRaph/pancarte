package client.utils;

import java.util.Arrays;
import opencard.core.util.*;

import client.codes.ResponseCode;

public final class ResponseAPDUtils {
    public static ResponseCode byteArrayToResponseCode(byte[] arr) {
        return ResponseCode.fromString(
            HexString.hexify(Arrays.copyOfRange(arr, arr.length - 2, arr.length))
        );
    }

    public static byte[] getDataFromResponseCodeByteArray(byte[] resp) {
        return Arrays.copyOfRange(resp, 0, resp.length - 2);
    }

    public static void printError(ResponseCode responseCode) {
        System.out.println("[!] ERROR: " + responseCode);
    }
}