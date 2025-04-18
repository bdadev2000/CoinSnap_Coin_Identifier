package androidx.core.util;

import androidx.annotation.RestrictTo;
import org.objectweb.asm.signature.SignatureVisitor;

@RestrictTo
/* loaded from: classes3.dex */
public final class TimeUtils {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f18686a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static char[] f18687b = new char[24];

    public static int a(long j2) {
        char c2;
        int i2;
        int i3;
        int i4;
        int i5;
        if (f18687b.length < 0) {
            f18687b = new char[0];
        }
        char[] cArr = f18687b;
        if (j2 == 0) {
            cArr[0] = '0';
            return 1;
        }
        if (j2 > 0) {
            c2 = SignatureVisitor.EXTENDS;
        } else {
            j2 = -j2;
            c2 = SignatureVisitor.SUPER;
        }
        int i6 = (int) (j2 % 1000);
        int floor = (int) Math.floor(j2 / 1000);
        if (floor > 86400) {
            i2 = floor / 86400;
            floor -= 86400 * i2;
        } else {
            i2 = 0;
        }
        if (floor > 3600) {
            i3 = floor / 3600;
            floor -= i3 * 3600;
        } else {
            i3 = 0;
        }
        if (floor > 60) {
            int i7 = floor / 60;
            i4 = floor - (i7 * 60);
            i5 = i7;
        } else {
            i4 = floor;
            i5 = 0;
        }
        cArr[0] = c2;
        int b2 = b(cArr, i2, 'd', 1, false, 0);
        int b3 = b(cArr, i3, 'h', b2, b2 != 1, 0);
        int b4 = b(cArr, i5, 'm', b3, b3 != 1, 0);
        int b5 = b(cArr, i6, 'm', b(cArr, i4, 's', b4, b4 != 1, 0), true, 0);
        cArr[b5] = 's';
        return b5 + 1;
    }

    public static int b(char[] cArr, int i2, char c2, int i3, boolean z2, int i4) {
        int i5;
        if (!z2 && i2 <= 0) {
            return i3;
        }
        if ((!z2 || i4 < 3) && i2 <= 99) {
            i5 = i3;
        } else {
            int i6 = i2 / 100;
            cArr[i3] = (char) (i6 + 48);
            i5 = i3 + 1;
            i2 -= i6 * 100;
        }
        if ((z2 && i4 >= 2) || i2 > 9 || i3 != i5) {
            int i7 = i2 / 10;
            cArr[i5] = (char) (i7 + 48);
            i5++;
            i2 -= i7 * 10;
        }
        cArr[i5] = (char) (i2 + 48);
        cArr[i5 + 1] = c2;
        return i5 + 2;
    }
}
