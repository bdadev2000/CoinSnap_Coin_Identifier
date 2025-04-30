package com.bytedance.sdk.component.lMd.zp.lMd;

import java.net.IDN;
import java.net.InetAddress;
import java.nio.charset.Charset;
import java.util.Locale;
import x0.AbstractC2914a;

/* loaded from: classes.dex */
public final class YW {
    public static final Charset zp = Charset.forName("UTF-8");

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0077, code lost:
    
        return null;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.net.InetAddress KS(java.lang.String r12, int r13, int r14) {
        /*
            r0 = 16
            byte[] r1 = new byte[r0]
            r2 = 0
            r3 = -1
            r4 = r2
            r5 = r3
            r6 = r5
        L9:
            r7 = 0
            if (r13 >= r14) goto L78
            if (r4 != r0) goto Lf
            return r7
        Lf:
            int r8 = r13 + 2
            r9 = 2
            if (r8 > r14) goto L27
            java.lang.String r10 = "::"
            boolean r10 = r12.regionMatches(r13, r10, r2, r9)
            if (r10 == 0) goto L27
            if (r5 == r3) goto L1f
            return r7
        L1f:
            int r4 = r4 + 2
            r5 = r4
            if (r8 != r14) goto L25
            goto L78
        L25:
            r6 = r8
            goto L4b
        L27:
            if (r4 == 0) goto L34
            java.lang.String r8 = ":"
            r10 = 1
            boolean r8 = r12.regionMatches(r13, r8, r2, r10)
            if (r8 == 0) goto L36
            int r13 = r13 + 1
        L34:
            r6 = r13
            goto L4b
        L36:
            java.lang.String r8 = "."
            boolean r13 = r12.regionMatches(r13, r8, r2, r10)
            if (r13 == 0) goto L4a
            int r13 = r4 + (-2)
            boolean r12 = zp(r12, r6, r14, r1, r13)
            if (r12 != 0) goto L47
            return r7
        L47:
            int r4 = r4 + 2
            goto L78
        L4a:
            return r7
        L4b:
            r8 = r2
            r13 = r6
        L4d:
            if (r13 >= r14) goto L5f
            char r10 = r12.charAt(r13)
            int r10 = zp(r10)
            if (r10 == r3) goto L5f
            int r8 = r8 << 4
            int r8 = r8 + r10
            int r13 = r13 + 1
            goto L4d
        L5f:
            int r10 = r13 - r6
            if (r10 == 0) goto L77
            r11 = 4
            if (r10 <= r11) goto L67
            goto L77
        L67:
            int r7 = r4 + 1
            int r10 = r8 >>> 8
            r10 = r10 & 255(0xff, float:3.57E-43)
            byte r10 = (byte) r10
            r1[r4] = r10
            int r4 = r4 + r9
            r8 = r8 & 255(0xff, float:3.57E-43)
            byte r8 = (byte) r8
            r1[r7] = r8
            goto L9
        L77:
            return r7
        L78:
            if (r4 == r0) goto L89
            if (r5 != r3) goto L7d
            return r7
        L7d:
            int r12 = r4 - r5
            int r13 = 16 - r12
            java.lang.System.arraycopy(r1, r5, r1, r13, r12)
            int r0 = r0 - r4
            int r0 = r0 + r5
            java.util.Arrays.fill(r1, r5, r0, r2)
        L89:
            java.net.InetAddress r12 = java.net.InetAddress.getByAddress(r1)     // Catch: java.net.UnknownHostException -> L8e
            return r12
        L8e:
            java.lang.AssertionError r12 = new java.lang.AssertionError
            r12.<init>()
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.lMd.zp.lMd.YW.KS(java.lang.String, int, int):java.net.InetAddress");
    }

    public static int lMd(String str, int i9, int i10) {
        for (int i11 = i10 - 1; i11 >= i9; i11--) {
            char charAt = str.charAt(i11);
            if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                return i11 + 1;
            }
        }
        return i9;
    }

    public static int zp(char c9) {
        if (c9 >= '0' && c9 <= '9') {
            return c9 - '0';
        }
        if (c9 >= 'a' && c9 <= 'f') {
            return c9 - 'W';
        }
        if (c9 < 'A' || c9 > 'F') {
            return -1;
        }
        return c9 - '7';
    }

    private static boolean lMd(String str) {
        for (int i9 = 0; i9 < str.length(); i9++) {
            char charAt = str.charAt(i9);
            if (charAt <= 31 || charAt >= 127 || " #%/:?@[\\]".indexOf(charAt) != -1) {
                return true;
            }
        }
        return false;
    }

    public static void zp(long j7, long j9, long j10) {
        if ((j9 | j10) < 0 || j9 > j7 || j7 - j9 < j10) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static int zp(String str, int i9, int i10) {
        while (i9 < i10) {
            char charAt = str.charAt(i9);
            if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                return i9;
            }
            i9++;
        }
        return i10;
    }

    public static int zp(String str, int i9, int i10, String str2) {
        while (i9 < i10) {
            if (str2.indexOf(str.charAt(i9)) != -1) {
                return i9;
            }
            i9++;
        }
        return i10;
    }

    public static int zp(String str, int i9, int i10, char c9) {
        while (i9 < i10) {
            if (str.charAt(i9) == c9) {
                return i9;
            }
            i9++;
        }
        return i10;
    }

    public static String zp(String str) {
        InetAddress KS;
        if (str.contains(":")) {
            if (str.startsWith("[") && str.endsWith("]")) {
                KS = KS(str, 1, str.length() - 1);
            } else {
                KS = KS(str, 0, str.length());
            }
            if (KS == null) {
                return null;
            }
            byte[] address = KS.getAddress();
            if (address.length == 16) {
                return zp(address);
            }
            throw new AssertionError(AbstractC2914a.e("Invalid IPv6 address: '", str, "'"));
        }
        try {
            String lowerCase = IDN.toASCII(str).toLowerCase(Locale.US);
            if (lowerCase.isEmpty()) {
                return null;
            }
            if (lMd(lowerCase)) {
                return null;
            }
            return lowerCase;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    private static boolean zp(String str, int i9, int i10, byte[] bArr, int i11) {
        int i12 = i11;
        while (i9 < i10) {
            if (i12 == bArr.length) {
                return false;
            }
            if (i12 != i11) {
                if (str.charAt(i9) != '.') {
                    return false;
                }
                i9++;
            }
            int i13 = i9;
            int i14 = 0;
            while (i13 < i10) {
                char charAt = str.charAt(i13);
                if (charAt < '0' || charAt > '9') {
                    break;
                }
                if ((i14 == 0 && i9 != i13) || (i14 = ((i14 * 10) + charAt) - 48) > 255) {
                    return false;
                }
                i13++;
            }
            if (i13 - i9 == 0) {
                return false;
            }
            bArr[i12] = (byte) i14;
            i12++;
            i9 = i13;
        }
        return i12 == i11 + 4;
    }

    private static String zp(byte[] bArr) {
        int i9 = -1;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i11 < bArr.length) {
            int i13 = i11;
            while (i13 < 16 && bArr[i13] == 0 && bArr[i13 + 1] == 0) {
                i13 += 2;
            }
            int i14 = i13 - i11;
            if (i14 > i12 && i14 >= 4) {
                i9 = i11;
                i12 = i14;
            }
            i11 = i13 + 2;
        }
        zp zpVar = new zp();
        while (i10 < bArr.length) {
            if (i10 == i9) {
                zpVar.lMd(58);
                i10 += i12;
                if (i10 == 16) {
                    zpVar.lMd(58);
                }
            } else {
                if (i10 > 0) {
                    zpVar.lMd(58);
                }
                zpVar.lMd(((bArr[i10] & 255) << 8) | (bArr[i10 + 1] & 255));
                i10 += 2;
            }
        }
        return zpVar.KS();
    }

    public static boolean zp(byte[] bArr, int i9, byte[] bArr2, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            if (bArr[i12 + i9] != bArr2[i12 + i10]) {
                return false;
            }
        }
        return true;
    }
}
