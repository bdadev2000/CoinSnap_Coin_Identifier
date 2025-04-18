package ni;

import java.lang.reflect.Array;
import java.util.Iterator;

/* loaded from: classes5.dex */
public final class d0 extends va.b {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f22787i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ va.b f22788j;

    public /* synthetic */ d0(va.b bVar, int i10) {
        this.f22787i = i10;
        this.f22788j = bVar;
    }

    @Override // va.b
    public final void e(p0 p0Var, Object obj) {
        int i10 = this.f22787i;
        va.b bVar = this.f22788j;
        switch (i10) {
            case 0:
                Iterable iterable = (Iterable) obj;
                if (iterable != null) {
                    Iterator it = iterable.iterator();
                    while (it.hasNext()) {
                        bVar.e(p0Var, it.next());
                    }
                    return;
                }
                return;
            default:
                if (obj != null) {
                    int length = Array.getLength(obj);
                    for (int i11 = 0; i11 < length; i11++) {
                        bVar.e(p0Var, Array.get(obj, i11));
                    }
                    return;
                }
                return;
        }
    }
}
