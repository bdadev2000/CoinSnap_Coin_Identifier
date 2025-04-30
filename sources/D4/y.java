package d4;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;

/* loaded from: classes2.dex */
public final class y implements Serializable {
    private static final long serialVersionUID = 0;
    public final Comparator b;

    /* renamed from: c, reason: collision with root package name */
    public final Object[] f19888c;

    public y(Comparator comparator, Object[] objArr) {
        this.b = comparator;
        this.f19888c = objArr;
    }

    public Object readResolve() {
        z2.i.c(4, "initialCapacity");
        Object[] objArr = new Object[4];
        Comparator comparator = this.b;
        comparator.getClass();
        Object[] objArr2 = this.f19888c;
        int length = objArr2.length;
        R2.b.i(length, objArr2);
        if (4 < length) {
            objArr = Arrays.copyOf(objArr, C2181i.d(4, length));
        }
        System.arraycopy(objArr2, 0, objArr, 0, length);
        L k6 = z.k(comparator, length, objArr);
        k6.f19849h.size();
        return k6;
    }
}
