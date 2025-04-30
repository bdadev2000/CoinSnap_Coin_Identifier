package e8;

import t7.AbstractC2712a;
import t7.C2721j;

/* renamed from: e8.l, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2237l {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f20173a;

    static {
        Object b;
        try {
            b = Class.forName("java.lang.ClassValue");
        } catch (Throwable th) {
            b = AbstractC2712a.b(th);
        }
        if (!(b instanceof C2721j)) {
            b = Boolean.TRUE;
        }
        Object obj = Boolean.FALSE;
        if (b instanceof C2721j) {
            b = obj;
        }
        f20173a = ((Boolean) b).booleanValue();
    }
}
