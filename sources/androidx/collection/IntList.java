package androidx.collection;

import android.support.v4.media.d;
import p0.a;
import w0.g;

/* loaded from: classes3.dex */
public abstract class IntList {

    /* renamed from: a, reason: collision with root package name */
    public int[] f1433a;

    /* renamed from: b, reason: collision with root package name */
    public int f1434b;

    public final int a(int i2) {
        if (i2 >= 0 && i2 < this.f1434b) {
            return this.f1433a[i2];
        }
        StringBuilder t2 = d.t("Index ", i2, " must be in 0..");
        t2.append(this.f1434b - 1);
        throw new IndexOutOfBoundsException(t2.toString());
    }

    public final boolean equals(Object obj) {
        if (obj instanceof IntList) {
            IntList intList = (IntList) obj;
            int i2 = intList.f1434b;
            int i3 = this.f1434b;
            if (i2 == i3) {
                int[] iArr = this.f1433a;
                int[] iArr2 = intList.f1433a;
                g F0 = a.F0(0, i3);
                int i4 = F0.f31406a;
                int i5 = F0.f31407b;
                if (i4 > i5) {
                    return true;
                }
                while (iArr[i4] == iArr2[i4]) {
                    if (i4 == i5) {
                        return true;
                    }
                    i4++;
                }
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        int[] iArr = this.f1433a;
        int i2 = this.f1434b;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 += Integer.hashCode(iArr[i4]) * 31;
        }
        return i3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        int[] iArr = this.f1433a;
        int i2 = this.f1434b;
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                sb.append((CharSequence) "]");
                break;
            }
            int i4 = iArr[i3];
            if (i3 == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            if (i3 != 0) {
                sb.append((CharSequence) ", ");
            }
            sb.append(i4);
            i3++;
        }
        String sb2 = sb.toString();
        a.r(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
