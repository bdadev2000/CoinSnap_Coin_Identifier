package com.mbridge.msdk.foundation.tools;

import android.text.TextUtils;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class x {

    /* renamed from: a, reason: collision with root package name */
    private static final String f16080a = "x";
    private static Map<Character, Character> b;

    /* renamed from: c, reason: collision with root package name */
    private static Map<Character, Character> f16081c;

    /* renamed from: d, reason: collision with root package name */
    private static byte[] f16082d = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, Ascii.VT, Ascii.FF, Ascii.CR, Ascii.SO, Ascii.SI, Ascii.DLE, 17, Ascii.DC2, 19, Ascii.DC4, Ascii.NAK, Ascii.SYN, Ascii.ETB, Ascii.CAN, Ascii.EM, -1, -1, -1, -1, -1, -1, Ascii.SUB, Ascii.ESC, Ascii.FS, Ascii.GS, Ascii.RS, Ascii.US, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1};

    /* renamed from: e, reason: collision with root package name */
    private static char[] f16083e = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/'};

    static {
        HashMap hashMap = new HashMap();
        b = hashMap;
        hashMap.put('v', 'A');
        b.put('S', 'B');
        b.put('o', 'C');
        b.put('a', 'D');
        b.put('j', 'E');
        b.put('c', 'F');
        b.put('7', 'G');
        b.put('d', 'H');
        b.put('R', 'I');
        b.put('z', 'J');
        b.put('p', 'K');
        b.put('W', 'L');
        b.put('i', 'M');
        b.put('f', 'N');
        b.put('G', 'O');
        b.put('y', 'P');
        b.put('N', 'Q');
        b.put('x', 'R');
        b.put('Z', 'S');
        b.put('n', 'T');
        b.put('V', 'U');
        b.put('5', 'V');
        b.put('k', 'W');
        b.put('+', 'X');
        b.put('D', 'Y');
        b.put('H', 'Z');
        b.put('L', 'a');
        b.put('Y', 'b');
        b.put('h', 'c');
        b.put('J', 'd');
        b.put('4', 'e');
        b.put('6', 'f');
        b.put('l', 'g');
        b.put('t', 'h');
        b.put('0', 'i');
        b.put('U', 'j');
        b.put('3', 'k');
        b.put('Q', 'l');
        b.put('r', 'm');
        b.put('g', 'n');
        b.put('E', 'o');
        b.put('u', 'p');
        b.put('q', 'q');
        b.put('8', 'r');
        b.put('s', 's');
        b.put('w', 't');
        b.put('/', 'u');
        b.put('X', 'v');
        b.put('M', 'w');
        b.put('e', 'x');
        b.put('B', 'y');
        b.put('A', 'z');
        b.put('T', '0');
        b.put('2', '1');
        b.put('F', '2');
        b.put('b', '3');
        b.put('9', '4');
        b.put('P', '5');
        b.put('1', '6');
        b.put('O', '7');
        b.put('I', '8');
        b.put('K', '9');
        b.put('m', '+');
        b.put('C', '/');
        HashMap hashMap2 = new HashMap();
        f16081c = hashMap2;
        hashMap2.put('A', 'v');
        f16081c.put('B', 'S');
        f16081c.put('C', 'o');
        f16081c.put('D', 'a');
        f16081c.put('E', 'j');
        f16081c.put('F', 'c');
        f16081c.put('G', '7');
        f16081c.put('H', 'd');
        f16081c.put('I', 'R');
        f16081c.put('J', 'z');
        f16081c.put('K', 'p');
        f16081c.put('L', 'W');
        f16081c.put('M', 'i');
        f16081c.put('N', 'f');
        f16081c.put('O', 'G');
        f16081c.put('P', 'y');
        f16081c.put('Q', 'N');
        f16081c.put('R', 'x');
        f16081c.put('S', 'Z');
        f16081c.put('T', 'n');
        f16081c.put('U', 'V');
        f16081c.put('V', '5');
        f16081c.put('W', 'k');
        f16081c.put('X', '+');
        f16081c.put('Y', 'D');
        f16081c.put('Z', 'H');
        f16081c.put('a', 'L');
        f16081c.put('b', 'Y');
        f16081c.put('c', 'h');
        f16081c.put('d', 'J');
        f16081c.put('e', '4');
        f16081c.put('f', '6');
        f16081c.put('g', 'l');
        f16081c.put('h', 't');
        f16081c.put('i', '0');
        f16081c.put('j', 'U');
        f16081c.put('k', '3');
        f16081c.put('l', 'Q');
        f16081c.put('m', 'r');
        f16081c.put('n', 'g');
        f16081c.put('o', 'E');
        f16081c.put('p', 'u');
        f16081c.put('q', 'q');
        f16081c.put('r', '8');
        f16081c.put('s', 's');
        f16081c.put('t', 'w');
        f16081c.put('u', '/');
        f16081c.put('v', 'X');
        f16081c.put('w', 'M');
        f16081c.put('x', 'e');
        f16081c.put('y', 'B');
        f16081c.put('z', 'A');
        f16081c.put('0', 'T');
        f16081c.put('1', '2');
        f16081c.put('2', 'F');
        f16081c.put('3', 'b');
        f16081c.put('4', '9');
        f16081c.put('5', 'P');
        f16081c.put('6', '1');
        f16081c.put('7', 'O');
        f16081c.put('8', 'I');
        f16081c.put('9', 'K');
        f16081c.put('+', 'm');
        f16081c.put('/', 'C');
    }

    private x() {
    }

    public static String a(String str) {
        return ae.a(str);
    }

    public static String b(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return ae.b(str);
    }
}
