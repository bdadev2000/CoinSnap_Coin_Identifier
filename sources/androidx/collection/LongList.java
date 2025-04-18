package androidx.collection;

import p0.a;
import w0.g;

/* loaded from: classes4.dex */
public abstract class LongList {

    /* renamed from: a, reason: collision with root package name */
    public long[] f1454a;

    public final boolean equals(Object obj) {
        if (!(obj instanceof LongList)) {
            return false;
        }
        LongList longList = (LongList) obj;
        longList.getClass();
        long[] jArr = longList.f1454a;
        g F0 = a.F0(0, 0);
        int i2 = F0.f31406a;
        int i3 = F0.f31407b;
        if (i2 > i3) {
            return true;
        }
        while (this.f1454a[i2] == jArr[i2]) {
            if (i2 == i3) {
                return true;
            }
            i2++;
        }
        return false;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        sb.append((CharSequence) "]");
        String sb2 = sb.toString();
        a.r(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
