package g8;

import com.applovin.exoplayer2.common.base.Ascii;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f20499a = new char[117];
    public static final byte[] b = new byte[126];

    static {
        int i9 = 0;
        for (int i10 = 0; i10 < 32; i10++) {
        }
        a(8, 'b');
        a(9, 't');
        a(10, 'n');
        a(12, 'f');
        a(13, 'r');
        a(47, '/');
        a(34, '\"');
        a(92, '\\');
        while (true) {
            byte[] bArr = b;
            if (i9 < 33) {
                bArr[i9] = Ascii.DEL;
                i9++;
            } else {
                bArr[9] = 3;
                bArr[10] = 3;
                bArr[13] = 3;
                bArr[32] = 3;
                bArr[44] = 4;
                bArr[58] = 5;
                bArr[123] = 6;
                bArr[125] = 7;
                bArr[91] = 8;
                bArr[93] = 9;
                bArr[34] = 1;
                bArr[92] = 2;
                return;
            }
        }
    }

    public static void a(int i9, char c9) {
        if (c9 != 'u') {
            f20499a[c9] = (char) i9;
        }
    }
}
