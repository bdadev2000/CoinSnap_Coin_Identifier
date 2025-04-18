package n1;

import java.util.Map;

/* loaded from: classes3.dex */
public abstract class g0 implements k1.a {

    /* renamed from: a, reason: collision with root package name */
    public final k1.a f31076a;

    /* renamed from: b, reason: collision with root package name */
    public final k1.a f31077b;

    public g0(k1.a aVar, k1.a aVar2) {
        this.f31076a = aVar;
        this.f31077b = aVar2;
    }

    @Override // k1.a
    public final void a(p0.a aVar, Object obj) {
        Object key;
        Object value;
        p0.a.s(aVar, "encoder");
        l0 l0Var = (l0) this;
        l1.g gVar = l0Var.d;
        p0.a.s(gVar, "descriptor");
        int i2 = l0Var.f31100c;
        switch (i2) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                p0.a.s(entry, "<this>");
                key = entry.getKey();
                break;
            default:
                d0.k kVar = (d0.k) obj;
                p0.a.s(kVar, "<this>");
                key = kVar.f30134a;
                break;
        }
        aVar.Y(gVar, 0, this.f31076a, key);
        switch (i2) {
            case 0:
                Map.Entry entry2 = (Map.Entry) obj;
                p0.a.s(entry2, "<this>");
                value = entry2.getValue();
                break;
            default:
                d0.k kVar2 = (d0.k) obj;
                p0.a.s(kVar2, "<this>");
                value = kVar2.f30135b;
                break;
        }
        aVar.Y(gVar, 1, this.f31077b, value);
    }
}
