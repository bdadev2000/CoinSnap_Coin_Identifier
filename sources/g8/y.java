package g8;

import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* loaded from: classes3.dex */
public abstract class y {

    /* renamed from: a, reason: collision with root package name */
    public static final String[] f20550a;
    public static final byte[] b;

    static {
        String[] strArr = new String[93];
        for (int i9 = 0; i9 < 32; i9++) {
            strArr[i9] = "\\u" + b(i9 >> 12) + b(i9 >> 8) + b(i9 >> 4) + b(i9);
        }
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        f20550a = strArr;
        byte[] bArr = new byte[93];
        for (int i10 = 0; i10 < 32; i10++) {
            bArr[i10] = 1;
        }
        bArr[34] = 34;
        bArr[92] = 92;
        bArr[9] = 116;
        bArr[8] = 98;
        bArr[10] = 110;
        bArr[13] = 114;
        bArr[12] = 102;
        b = bArr;
    }

    public static final void a(StringBuilder sb, String str) {
        G7.j.e(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        sb.append('\"');
        int length = str.length();
        int i9 = 0;
        for (int i10 = 0; i10 < length; i10++) {
            char charAt = str.charAt(i10);
            String[] strArr = f20550a;
            if (charAt < strArr.length && strArr[charAt] != null) {
                sb.append((CharSequence) str, i9, i10);
                sb.append(strArr[charAt]);
                i9 = i10 + 1;
            }
        }
        if (i9 != 0) {
            sb.append((CharSequence) str, i9, str.length());
        } else {
            sb.append(str);
        }
        sb.append('\"');
    }

    public static final char b(int i9) {
        int i10;
        int i11 = i9 & 15;
        if (i11 < 10) {
            i10 = i11 + 48;
        } else {
            i10 = i11 + 87;
        }
        return (char) i10;
    }
}
