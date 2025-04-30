package w7;

import F7.p;

/* loaded from: classes3.dex */
public final class c extends G7.k implements p {

    /* renamed from: c, reason: collision with root package name */
    public static final c f23995c = new c(2, 0);

    /* renamed from: d, reason: collision with root package name */
    public static final c f23996d = new c(2, 1);
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i9, int i10) {
        super(i9);
        this.b = i10;
    }

    @Override // F7.p
    public final Object g(Object obj, Object obj2) {
        e eVar;
        switch (this.b) {
            case 0:
                String str = (String) obj;
                i iVar = (i) obj2;
                G7.j.e(str, "acc");
                G7.j.e(iVar, "element");
                if (str.length() == 0) {
                    return iVar.toString();
                }
                return str + ", " + iVar;
            default:
                k kVar = (k) obj;
                i iVar2 = (i) obj2;
                G7.j.e(kVar, "acc");
                G7.j.e(iVar2, "element");
                k i9 = kVar.i(iVar2.getKey());
                l lVar = l.b;
                if (i9 != lVar) {
                    g gVar = g.b;
                    h hVar = (h) i9.h(gVar);
                    if (hVar == null) {
                        eVar = new e(i9, iVar2);
                    } else {
                        k i10 = i9.i(gVar);
                        if (i10 == lVar) {
                            return new e(iVar2, hVar);
                        }
                        eVar = new e(new e(i10, iVar2), hVar);
                    }
                    return eVar;
                }
                return iVar2;
        }
    }
}
