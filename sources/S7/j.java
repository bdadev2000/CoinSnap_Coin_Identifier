package S7;

/* loaded from: classes3.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final i f2842a = new Object();

    public static c a(int i9, a aVar, int i10) {
        c nVar;
        if ((i10 & 1) != 0) {
            i9 = 0;
        }
        int i11 = i10 & 2;
        a aVar2 = a.b;
        if (i11 != 0) {
            aVar = aVar2;
        }
        if (i9 != -2) {
            if (i9 != -1) {
                if (i9 != 0) {
                    if (i9 != Integer.MAX_VALUE) {
                        if (aVar == aVar2) {
                            return new c(i9, null);
                        }
                        return new n(i9, aVar, null);
                    }
                    return new c(Integer.MAX_VALUE, null);
                }
                if (aVar == aVar2) {
                    nVar = new c(0, null);
                } else {
                    nVar = new n(1, aVar, null);
                }
            } else {
                if (aVar == aVar2) {
                    return new n(1, a.f2809c, null);
                }
                throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow".toString());
            }
        } else if (aVar == aVar2) {
            g.f2840X7.getClass();
            nVar = new c(f.b, null);
        } else {
            nVar = new n(1, aVar, null);
        }
        return nVar;
    }
}
