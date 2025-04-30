package com.mbridge.msdk.thrid.okhttp.internal.ws;

import Q7.n0;
import com.mbridge.msdk.foundation.entity.o;
import com.mbridge.msdk.thrid.okio.Buffer;
import com.mbridge.msdk.thrid.okio.ByteString;

/* loaded from: classes3.dex */
public final class WebSocketProtocol {
    static final String ACCEPT_MAGIC = "258EAFA5-E914-47DA-95CA-C5AB0DC85B11";
    static final int B0_FLAG_FIN = 128;
    static final int B0_FLAG_RSV1 = 64;
    static final int B0_FLAG_RSV2 = 32;
    static final int B0_FLAG_RSV3 = 16;
    static final int B0_MASK_OPCODE = 15;
    static final int B1_FLAG_MASK = 128;
    static final int B1_MASK_LENGTH = 127;
    static final int CLOSE_CLIENT_GOING_AWAY = 1001;
    static final long CLOSE_MESSAGE_MAX = 123;
    static final int CLOSE_NO_STATUS_CODE = 1005;
    static final int OPCODE_BINARY = 2;
    static final int OPCODE_CONTINUATION = 0;
    static final int OPCODE_CONTROL_CLOSE = 8;
    static final int OPCODE_CONTROL_PING = 9;
    static final int OPCODE_CONTROL_PONG = 10;
    static final int OPCODE_FLAG_CONTROL = 8;
    static final int OPCODE_TEXT = 1;
    static final long PAYLOAD_BYTE_MAX = 125;
    static final int PAYLOAD_LONG = 127;
    static final int PAYLOAD_SHORT = 126;
    static final long PAYLOAD_SHORT_MAX = 65535;

    private WebSocketProtocol() {
        throw new AssertionError("No instances.");
    }

    public static String acceptHeader(String str) {
        return ByteString.encodeUtf8(str + ACCEPT_MAGIC).sha1().base64();
    }

    public static String closeCodeExceptionMessage(int i9) {
        if (i9 >= 1000 && i9 < 5000) {
            if ((i9 >= 1004 && i9 <= 1006) || (i9 >= 1012 && i9 <= 2999)) {
                return n0.f(i9, "Code ", " is reserved and may not be used.");
            }
            return null;
        }
        return o.h(i9, "Code must be in range [1000,5000): ");
    }

    public static void toggleMask(Buffer.UnsafeCursor unsafeCursor, byte[] bArr) {
        int length = bArr.length;
        int i9 = 0;
        do {
            byte[] bArr2 = unsafeCursor.data;
            int i10 = unsafeCursor.start;
            int i11 = unsafeCursor.end;
            while (i10 < i11) {
                int i12 = i9 % length;
                bArr2[i10] = (byte) (bArr2[i10] ^ bArr[i12]);
                i10++;
                i9 = i12 + 1;
            }
        } while (unsafeCursor.next() != -1);
    }

    public static void validateCloseCode(int i9) {
        String closeCodeExceptionMessage = closeCodeExceptionMessage(i9);
        if (closeCodeExceptionMessage == null) {
        } else {
            throw new IllegalArgumentException(closeCodeExceptionMessage);
        }
    }
}
