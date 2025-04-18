package com.mbridge.msdk.foundation.tools;

import android.text.TextUtils;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.HashMap;
import java.util.Map;
import kotlin.io.encoding.Base64;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes4.dex */
public class x {
    private static final String a = "x";

    /* renamed from: b, reason: collision with root package name */
    private static Map<Character, Character> f13639b;

    /* renamed from: c, reason: collision with root package name */
    private static Map<Character, Character> f13640c;

    /* renamed from: d, reason: collision with root package name */
    private static byte[] f13641d = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, Base64.padSymbol, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, Ascii.VT, Ascii.FF, Ascii.CR, Ascii.SO, Ascii.SI, Ascii.DLE, 17, Ascii.DC2, 19, Ascii.DC4, Ascii.NAK, Ascii.SYN, Ascii.ETB, Ascii.CAN, Ascii.EM, -1, -1, -1, -1, -1, -1, Ascii.SUB, Ascii.ESC, Ascii.FS, Ascii.GS, Ascii.RS, Ascii.US, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1};

    /* renamed from: e, reason: collision with root package name */
    private static char[] f13642e = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', AbstractJsonLexerKt.UNICODE_ESC, 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/'};

    static {
        HashMap hashMap = new HashMap();
        f13639b = hashMap;
        hashMap.put('v', 'A');
        f13639b.put('S', 'B');
        f13639b.put('o', 'C');
        f13639b.put('a', 'D');
        f13639b.put('j', 'E');
        f13639b.put('c', 'F');
        f13639b.put('7', 'G');
        f13639b.put('d', 'H');
        f13639b.put('R', 'I');
        f13639b.put('z', 'J');
        f13639b.put('p', 'K');
        f13639b.put('W', 'L');
        f13639b.put('i', 'M');
        f13639b.put('f', 'N');
        f13639b.put('G', 'O');
        f13639b.put('y', 'P');
        f13639b.put('N', 'Q');
        f13639b.put('x', 'R');
        f13639b.put('Z', 'S');
        f13639b.put('n', 'T');
        f13639b.put('V', 'U');
        f13639b.put('5', 'V');
        f13639b.put('k', 'W');
        f13639b.put('+', 'X');
        f13639b.put('D', 'Y');
        f13639b.put('H', 'Z');
        f13639b.put('L', 'a');
        f13639b.put('Y', 'b');
        f13639b.put('h', 'c');
        f13639b.put('J', 'd');
        f13639b.put('4', 'e');
        f13639b.put('6', 'f');
        f13639b.put('l', 'g');
        f13639b.put('t', 'h');
        f13639b.put('0', 'i');
        f13639b.put('U', 'j');
        f13639b.put('3', 'k');
        f13639b.put('Q', 'l');
        f13639b.put('r', 'm');
        f13639b.put('g', 'n');
        f13639b.put('E', 'o');
        f13639b.put(Character.valueOf(AbstractJsonLexerKt.UNICODE_ESC), 'p');
        f13639b.put('q', 'q');
        f13639b.put('8', 'r');
        f13639b.put('s', 's');
        f13639b.put('w', 't');
        f13639b.put('/', Character.valueOf(AbstractJsonLexerKt.UNICODE_ESC));
        f13639b.put('X', 'v');
        f13639b.put('M', 'w');
        f13639b.put('e', 'x');
        f13639b.put('B', 'y');
        f13639b.put('A', 'z');
        f13639b.put('T', '0');
        f13639b.put('2', '1');
        f13639b.put('F', '2');
        f13639b.put('b', '3');
        f13639b.put('9', '4');
        f13639b.put('P', '5');
        f13639b.put('1', '6');
        f13639b.put('O', '7');
        f13639b.put('I', '8');
        f13639b.put('K', '9');
        f13639b.put('m', '+');
        f13639b.put('C', '/');
        HashMap hashMap2 = new HashMap();
        f13640c = hashMap2;
        hashMap2.put('A', 'v');
        f13640c.put('B', 'S');
        f13640c.put('C', 'o');
        f13640c.put('D', 'a');
        f13640c.put('E', 'j');
        f13640c.put('F', 'c');
        f13640c.put('G', '7');
        f13640c.put('H', 'd');
        f13640c.put('I', 'R');
        f13640c.put('J', 'z');
        f13640c.put('K', 'p');
        f13640c.put('L', 'W');
        f13640c.put('M', 'i');
        f13640c.put('N', 'f');
        f13640c.put('O', 'G');
        f13640c.put('P', 'y');
        f13640c.put('Q', 'N');
        f13640c.put('R', 'x');
        f13640c.put('S', 'Z');
        f13640c.put('T', 'n');
        f13640c.put('U', 'V');
        f13640c.put('V', '5');
        f13640c.put('W', 'k');
        f13640c.put('X', '+');
        f13640c.put('Y', 'D');
        f13640c.put('Z', 'H');
        f13640c.put('a', 'L');
        f13640c.put('b', 'Y');
        f13640c.put('c', 'h');
        f13640c.put('d', 'J');
        f13640c.put('e', '4');
        f13640c.put('f', '6');
        f13640c.put('g', 'l');
        f13640c.put('h', 't');
        f13640c.put('i', '0');
        f13640c.put('j', 'U');
        f13640c.put('k', '3');
        f13640c.put('l', 'Q');
        f13640c.put('m', 'r');
        f13640c.put('n', 'g');
        f13640c.put('o', 'E');
        f13640c.put('p', Character.valueOf(AbstractJsonLexerKt.UNICODE_ESC));
        f13640c.put('q', 'q');
        f13640c.put('r', '8');
        f13640c.put('s', 's');
        f13640c.put('t', 'w');
        f13640c.put(Character.valueOf(AbstractJsonLexerKt.UNICODE_ESC), '/');
        f13640c.put('v', 'X');
        f13640c.put('w', 'M');
        f13640c.put('x', 'e');
        f13640c.put('y', 'B');
        f13640c.put('z', 'A');
        f13640c.put('0', 'T');
        f13640c.put('1', '2');
        f13640c.put('2', 'F');
        f13640c.put('3', 'b');
        f13640c.put('4', '9');
        f13640c.put('5', 'P');
        f13640c.put('6', '1');
        f13640c.put('7', 'O');
        f13640c.put('8', 'I');
        f13640c.put('9', 'K');
        f13640c.put('+', 'm');
        f13640c.put('/', 'C');
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
