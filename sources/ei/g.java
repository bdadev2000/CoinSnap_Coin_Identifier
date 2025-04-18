package ei;

import androidx.core.app.NotificationCompat;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;

/* loaded from: classes5.dex */
public abstract class g {
    public static final ki.l a;

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f17418b;

    /* renamed from: c, reason: collision with root package name */
    public static final String[] f17419c;

    /* renamed from: d, reason: collision with root package name */
    public static final String[] f17420d;

    static {
        String replace$default;
        ki.l lVar = ki.l.f20996f;
        a = wh.a0.p("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
        f17418b = new String[]{"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
        f17419c = new String[64];
        String[] strArr = new String[NotificationCompat.FLAG_LOCAL_ONLY];
        int i10 = 0;
        for (int i11 = 0; i11 < 256; i11++) {
            String binaryString = Integer.toBinaryString(i11);
            Intrinsics.checkNotNullExpressionValue(binaryString, "toBinaryString(it)");
            replace$default = StringsKt__StringsJVMKt.replace$default(xh.b.h("%8s", binaryString), ' ', '0', false, 4, (Object) null);
            strArr[i11] = replace$default;
        }
        f17420d = strArr;
        String[] strArr2 = f17419c;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        strArr2[9] = Intrinsics.stringPlus("END_STREAM", "|PADDED");
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        int i12 = 0;
        while (i12 < 3) {
            int i13 = iArr2[i12];
            i12++;
            int i14 = iArr[0];
            String[] strArr3 = f17419c;
            int i15 = i14 | i13;
            StringBuilder sb2 = new StringBuilder();
            sb2.append((Object) strArr3[i14]);
            sb2.append('|');
            sb2.append((Object) strArr3[i13]);
            strArr3[i15] = sb2.toString();
            strArr3[i15 | 8] = ((Object) strArr3[i14]) + '|' + ((Object) strArr3[i13]) + "|PADDED";
        }
        int length = f17419c.length;
        while (i10 < length) {
            int i16 = i10 + 1;
            String[] strArr4 = f17419c;
            if (strArr4[i10] == null) {
                strArr4[i10] = f17420d[i10];
            }
            i10 = i16;
        }
    }

    public static String a(int i10, int i11, int i12, int i13, boolean z10) {
        String h10;
        String str;
        String str2;
        String str3;
        String[] strArr = f17418b;
        if (i12 < strArr.length) {
            h10 = strArr[i12];
        } else {
            h10 = xh.b.h("0x%02x", Integer.valueOf(i12));
        }
        if (i13 == 0) {
            str = "";
        } else {
            String[] strArr2 = f17420d;
            if (i12 != 2 && i12 != 3) {
                if (i12 != 4 && i12 != 6) {
                    if (i12 != 7 && i12 != 8) {
                        String[] strArr3 = f17419c;
                        if (i13 < strArr3.length) {
                            str2 = strArr3[i13];
                            Intrinsics.checkNotNull(str2);
                        } else {
                            str2 = strArr2[i13];
                        }
                        if (i12 == 5 && (i13 & 4) != 0) {
                            str = StringsKt__StringsJVMKt.replace$default(str2, "HEADERS", "PUSH_PROMISE", false, 4, (Object) null);
                        } else if (i12 == 0 && (i13 & 32) != 0) {
                            str = StringsKt__StringsJVMKt.replace$default(str2, "PRIORITY", "COMPRESSED", false, 4, (Object) null);
                        } else {
                            str = str2;
                        }
                    }
                } else if (i13 == 1) {
                    str = "ACK";
                } else {
                    str = strArr2[i13];
                }
            }
            str = strArr2[i13];
        }
        if (z10) {
            str3 = "<<";
        } else {
            str3 = ">>";
        }
        return xh.b.h("%s 0x%08x %5d %-13s %s", str3, Integer.valueOf(i10), Integer.valueOf(i11), h10, str);
    }
}
