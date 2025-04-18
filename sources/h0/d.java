package h0;

import kotlin.jvm.internal.r;
import q0.p;

/* loaded from: classes4.dex */
public final class d extends r implements p {

    /* renamed from: b, reason: collision with root package name */
    public static final d f30718b = new d(0);

    /* renamed from: c, reason: collision with root package name */
    public static final d f30719c = new d(1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30720a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i2) {
        super(2);
        this.f30720a = i2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        f fVar;
        switch (this.f30720a) {
            case 0:
                String str = (String) obj;
                j jVar = (j) obj2;
                p0.a.s(str, "acc");
                p0.a.s(jVar, "element");
                if (str.length() == 0) {
                    return jVar.toString();
                }
                return str + ", " + jVar;
            default:
                l lVar = (l) obj;
                j jVar2 = (j) obj2;
                p0.a.s(lVar, "acc");
                p0.a.s(jVar2, "element");
                l s2 = lVar.s(jVar2.getKey());
                m mVar = m.f30726a;
                if (s2 == mVar) {
                    return jVar2;
                }
                h hVar = h.f30725a;
                i iVar = (i) s2.i(hVar);
                if (iVar == null) {
                    fVar = new f(jVar2, s2);
                } else {
                    l s3 = s2.s(hVar);
                    if (s3 == mVar) {
                        return new f(iVar, jVar2);
                    }
                    fVar = new f(iVar, new f(jVar2, s3));
                }
                return fVar;
        }
    }
}
