package com.mbridge.msdk.thrid.okhttp.internal.http2;

import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.thrid.okhttp.internal.Util;
import com.mbridge.msdk.thrid.okio.ByteString;
import java.io.IOException;
import x0.AbstractC2914a;

/* loaded from: classes3.dex */
public final class Http2 {
    static final byte FLAG_ACK = 1;
    static final byte FLAG_COMPRESSED = 32;
    static final byte FLAG_END_HEADERS = 4;
    static final byte FLAG_END_PUSH_PROMISE = 4;
    static final byte FLAG_END_STREAM = 1;
    static final byte FLAG_NONE = 0;
    static final byte FLAG_PADDED = 8;
    static final byte FLAG_PRIORITY = 32;
    static final int INITIAL_MAX_FRAME_SIZE = 16384;
    static final byte TYPE_CONTINUATION = 9;
    static final byte TYPE_DATA = 0;
    static final byte TYPE_GOAWAY = 7;
    static final byte TYPE_HEADERS = 1;
    static final byte TYPE_PING = 6;
    static final byte TYPE_PRIORITY = 2;
    static final byte TYPE_PUSH_PROMISE = 5;
    static final byte TYPE_RST_STREAM = 3;
    static final byte TYPE_SETTINGS = 4;
    static final byte TYPE_WINDOW_UPDATE = 8;
    static final ByteString CONNECTION_PREFACE = ByteString.encodeUtf8("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
    private static final String[] FRAME_NAMES = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
    static final String[] FLAGS = new String[64];
    static final String[] BINARY = new String[NotificationCompat.FLAG_LOCAL_ONLY];

    static {
        int i9 = 0;
        int i10 = 0;
        while (true) {
            String[] strArr = BINARY;
            if (i10 >= strArr.length) {
                break;
            }
            strArr[i10] = Util.format("%8s", Integer.toBinaryString(i10)).replace(' ', '0');
            i10++;
        }
        String[] strArr2 = FLAGS;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i11 = iArr[0];
        strArr2[i11 | 8] = AbstractC2914a.h(new StringBuilder(), strArr2[i11], "|PADDED");
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i12 = 0; i12 < 3; i12++) {
            int i13 = iArr2[i12];
            int i14 = iArr[0];
            String[] strArr3 = FLAGS;
            int i15 = i14 | i13;
            strArr3[i15] = strArr3[i14] + '|' + strArr3[i13];
            StringBuilder sb = new StringBuilder();
            sb.append(strArr3[i14]);
            sb.append('|');
            strArr3[i15 | 8] = AbstractC2914a.h(sb, strArr3[i13], "|PADDED");
        }
        while (true) {
            String[] strArr4 = FLAGS;
            if (i9 < strArr4.length) {
                if (strArr4[i9] == null) {
                    strArr4[i9] = BINARY[i9];
                }
                i9++;
            } else {
                return;
            }
        }
    }

    private Http2() {
    }

    public static String formatFlags(byte b, byte b8) {
        String str;
        if (b8 == 0) {
            return "";
        }
        if (b != 2 && b != 3) {
            if (b != 4 && b != 6) {
                if (b != 7 && b != 8) {
                    String[] strArr = FLAGS;
                    if (b8 < strArr.length) {
                        str = strArr[b8];
                    } else {
                        str = BINARY[b8];
                    }
                    if (b == 5 && (b8 & 4) != 0) {
                        return str.replace("HEADERS", "PUSH_PROMISE");
                    }
                    if (b == 0 && (b8 & 32) != 0) {
                        return str.replace("PRIORITY", "COMPRESSED");
                    }
                    return str;
                }
            } else {
                if (b8 == 1) {
                    return "ACK";
                }
                return BINARY[b8];
            }
        }
        return BINARY[b8];
    }

    public static String frameLog(boolean z8, int i9, int i10, byte b, byte b8) {
        String format;
        String str;
        String[] strArr = FRAME_NAMES;
        if (b < strArr.length) {
            format = strArr[b];
        } else {
            format = Util.format("0x%02x", Byte.valueOf(b));
        }
        String formatFlags = formatFlags(b, b8);
        if (z8) {
            str = "<<";
        } else {
            str = ">>";
        }
        return Util.format("%s 0x%08x %5d %-13s %s", str, Integer.valueOf(i9), Integer.valueOf(i10), format, formatFlags);
    }

    public static IllegalArgumentException illegalArgument(String str, Object... objArr) {
        throw new IllegalArgumentException(Util.format(str, objArr));
    }

    public static IOException ioException(String str, Object... objArr) throws IOException {
        throw new IOException(Util.format(str, objArr));
    }
}
