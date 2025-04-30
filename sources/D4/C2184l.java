package d4;

import java.io.Serializable;

/* renamed from: d4.l, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2184l implements Serializable {
    private static final long serialVersionUID = 0;
    public final Object[] b;

    public C2184l(Object[] objArr) {
        this.b = objArr;
    }

    public Object readResolve() {
        C2182j c2182j = AbstractC2186n.f19876c;
        Object[] objArr = this.b;
        if (objArr.length == 0) {
            return E.f19825g;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        R2.b.i(objArr2.length, objArr2);
        return AbstractC2186n.h(objArr2.length, objArr2);
    }
}
