package okio.internal;

import java.util.Arrays;
import okio.Utf8;
import org.jetbrains.annotations.NotNull;
import org.objectweb.asm.Opcodes;
import p0.a;

/* loaded from: classes4.dex */
public final class _Utf8Kt {
    @NotNull
    public static final byte[] commonAsUtf8ToByteArray(@NotNull String str) {
        int i2;
        char charAt;
        a.s(str, "<this>");
        byte[] bArr = new byte[str.length() * 4];
        int length = str.length();
        int i3 = 0;
        while (i3 < length) {
            char charAt2 = str.charAt(i3);
            if (a.E(charAt2, 128) >= 0) {
                int length2 = str.length();
                int i4 = i3;
                while (i3 < length2) {
                    char charAt3 = str.charAt(i3);
                    if (a.E(charAt3, 128) < 0) {
                        int i5 = i4 + 1;
                        bArr[i4] = (byte) charAt3;
                        i3++;
                        while (true) {
                            i4 = i5;
                            if (i3 < length2 && a.E(str.charAt(i3), 128) < 0) {
                                i5 = i4 + 1;
                                bArr[i4] = (byte) str.charAt(i3);
                                i3++;
                            }
                        }
                    } else {
                        if (a.E(charAt3, Opcodes.ACC_STRICT) < 0) {
                            bArr[i4] = (byte) ((charAt3 >> 6) | Opcodes.CHECKCAST);
                            i4 += 2;
                            bArr[i4 + 1] = (byte) ((charAt3 & '?') | 128);
                        } else if (55296 > charAt3 || charAt3 >= 57344) {
                            bArr[i4] = (byte) ((charAt3 >> '\f') | 224);
                            bArr[i4 + 1] = (byte) (((charAt3 >> 6) & 63) | 128);
                            i4 += 3;
                            bArr[i4 + 2] = (byte) ((charAt3 & '?') | 128);
                        } else if (a.E(charAt3, 56319) > 0 || length2 <= (i2 = i3 + 1) || 56320 > (charAt = str.charAt(i2)) || charAt >= 57344) {
                            bArr[i4] = Utf8.REPLACEMENT_BYTE;
                            i3++;
                            i4++;
                        } else {
                            int charAt4 = (str.charAt(i2) + (charAt3 << '\n')) - 56613888;
                            bArr[i4] = (byte) ((charAt4 >> 18) | 240);
                            bArr[i4 + 1] = (byte) (((charAt4 >> 12) & 63) | 128);
                            bArr[i4 + 2] = (byte) (((charAt4 >> 6) & 63) | 128);
                            i4 += 4;
                            bArr[i4 + 3] = (byte) ((charAt4 & 63) | 128);
                            i3 += 2;
                        }
                        i3++;
                    }
                }
                byte[] copyOf = Arrays.copyOf(bArr, i4);
                a.r(copyOf, "copyOf(...)");
                return copyOf;
            }
            bArr[i3] = (byte) charAt2;
            i3++;
        }
        byte[] copyOf2 = Arrays.copyOf(bArr, str.length());
        a.r(copyOf2, "copyOf(...)");
        return copyOf2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ec, code lost:
    
        if ((r16[r5] & 192) == 128) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x008a, code lost:
    
        if ((r16[r5] & 192) == 128) goto L30;
     */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.String commonToUtf8String(@org.jetbrains.annotations.NotNull byte[] r16, int r17, int r18) {
        /*
            Method dump skipped, instructions count: 409
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.internal._Utf8Kt.commonToUtf8String(byte[], int, int):java.lang.String");
    }

    public static /* synthetic */ String commonToUtf8String$default(byte[] bArr, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i2 = 0;
        }
        if ((i4 & 2) != 0) {
            i3 = bArr.length;
        }
        return commonToUtf8String(bArr, i2, i3);
    }
}
