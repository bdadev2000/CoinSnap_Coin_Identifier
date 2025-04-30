package w7;

import F7.p;
import G7.q;
import t7.y;

/* loaded from: classes3.dex */
public final class d extends G7.k implements p {
    public final /* synthetic */ k[] b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q f23997c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(k[] kVarArr, q qVar) {
        super(2);
        this.b = kVarArr;
        this.f23997c = qVar;
    }

    @Override // F7.p
    public final Object g(Object obj, Object obj2) {
        i iVar = (i) obj2;
        G7.j.e((y) obj, "<anonymous parameter 0>");
        G7.j.e(iVar, "element");
        q qVar = this.f23997c;
        int i9 = qVar.b;
        qVar.b = i9 + 1;
        this.b[i9] = iVar;
        return y.f23029a;
    }
}
