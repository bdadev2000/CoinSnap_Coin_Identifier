package d4;

import java.io.Serializable;
import java.util.Map;

/* loaded from: classes2.dex */
public final class p implements Serializable {
    private static final long serialVersionUID = 0;
    public final Object[] b;

    /* renamed from: c, reason: collision with root package name */
    public final Object[] f19879c;

    public p(q qVar) {
        int i9 = ((J) qVar).f19841h;
        Object[] objArr = new Object[i9];
        Object[] objArr2 = new Object[i9];
        O it = qVar.entrySet().iterator();
        int i10 = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            objArr[i10] = entry.getKey();
            objArr2[i10] = entry.getValue();
            i10++;
        }
        this.b = objArr;
        this.f19879c = objArr2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object readResolve() {
        Object[] objArr = this.b;
        boolean z8 = objArr instanceof u;
        Object[] objArr2 = this.f19879c;
        if (!z8) {
            D0.l lVar = new D0.l(objArr.length);
            for (int i9 = 0; i9 < objArr.length; i9++) {
                lVar.h(objArr[i9], objArr2[i9]);
            }
            return lVar.b();
        }
        u uVar = (u) objArr;
        D0.l lVar2 = new D0.l(uVar.size());
        O it = uVar.iterator();
        O it2 = ((AbstractC2180h) objArr2).iterator();
        while (it.hasNext()) {
            lVar2.h(it.next(), it2.next());
        }
        return lVar2.b();
    }
}
