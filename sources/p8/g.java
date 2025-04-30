package p8;

import androidx.core.app.NotificationCompat;

/* loaded from: classes3.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final w8.i f22413a;
    public static final String[] b;

    /* renamed from: c, reason: collision with root package name */
    public static final String[] f22414c;

    /* renamed from: d, reason: collision with root package name */
    public static final String[] f22415d;

    static {
        w8.i iVar = w8.i.f24015f;
        f22413a = r6.b.c("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
        b = new String[]{"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
        f22414c = new String[64];
        String[] strArr = new String[NotificationCompat.FLAG_LOCAL_ONLY];
        int i9 = 0;
        for (int i10 = 0; i10 < 256; i10++) {
            String binaryString = Integer.toBinaryString(i10);
            G7.j.d(binaryString, "toBinaryString(it)");
            String replace = j8.b.h("%8s", binaryString).replace(' ', '0');
            G7.j.d(replace, "replace(...)");
            strArr[i10] = replace;
        }
        f22415d = strArr;
        String[] strArr2 = f22414c;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i11 = iArr[0];
        strArr2[i11 | 8] = G7.j.j("|PADDED", strArr2[i11]);
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        int i12 = 0;
        while (i12 < 3) {
            int i13 = iArr2[i12];
            i12++;
            int i14 = iArr[0];
            String[] strArr3 = f22414c;
            int i15 = i14 | i13;
            StringBuilder sb = new StringBuilder();
            sb.append((Object) strArr3[i14]);
            sb.append('|');
            sb.append((Object) strArr3[i13]);
            strArr3[i15] = sb.toString();
            strArr3[i15 | 8] = ((Object) strArr3[i14]) + '|' + ((Object) strArr3[i13]) + "|PADDED";
        }
        int length = f22414c.length;
        while (i9 < length) {
            int i16 = i9 + 1;
            String[] strArr4 = f22414c;
            if (strArr4[i9] == null) {
                strArr4[i9] = f22415d[i9];
            }
            i9 = i16;
        }
    }

    public static String a(boolean z8, int i9, int i10, int i11, int i12) {
        String h6;
        String str;
        String str2;
        String str3;
        String[] strArr = b;
        if (i11 < strArr.length) {
            h6 = strArr[i11];
        } else {
            h6 = j8.b.h("0x%02x", Integer.valueOf(i11));
        }
        if (i12 == 0) {
            str = "";
        } else {
            String[] strArr2 = f22415d;
            if (i11 != 2 && i11 != 3) {
                if (i11 != 4 && i11 != 6) {
                    if (i11 != 7 && i11 != 8) {
                        String[] strArr3 = f22414c;
                        if (i12 < strArr3.length) {
                            str2 = strArr3[i12];
                            G7.j.b(str2);
                        } else {
                            str2 = strArr2[i12];
                        }
                        if (i11 == 5 && (i12 & 4) != 0) {
                            str = O7.o.A(str2, "HEADERS", "PUSH_PROMISE");
                        } else if (i11 == 0 && (i12 & 32) != 0) {
                            str = O7.o.A(str2, "PRIORITY", "COMPRESSED");
                        } else {
                            str = str2;
                        }
                    }
                } else if (i12 == 1) {
                    str = "ACK";
                } else {
                    str = strArr2[i12];
                }
            }
            str = strArr2[i12];
        }
        if (z8) {
            str3 = "<<";
        } else {
            str3 = ">>";
        }
        return j8.b.h("%s 0x%08x %5d %-13s %s", str3, Integer.valueOf(i9), Integer.valueOf(i10), h6, str);
    }
}
