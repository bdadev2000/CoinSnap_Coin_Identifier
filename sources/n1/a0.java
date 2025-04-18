package n1;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
public final class a0 extends n0 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f31051c;
    public final z d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(k1.a aVar, k1.a aVar2, int i2) {
        super(aVar, aVar2);
        this.f31051c = i2;
        if (i2 != 1) {
            p0.a.s(aVar, "kSerializer");
            p0.a.s(aVar2, "vSerializer");
            this.d = new z(aVar.b(), aVar2.b(), 0);
            return;
        }
        p0.a.s(aVar, "kSerializer");
        p0.a.s(aVar2, "vSerializer");
        super(aVar, aVar2);
        this.d = new z(aVar.b(), aVar2.b(), 1);
    }

    @Override // k1.a
    public final l1.f b() {
        return this.d;
    }

    @Override // n1.a
    public final Iterator c(Object obj) {
        int i2 = this.f31051c;
        switch (i2) {
            case 0:
                Map map = (Map) obj;
                switch (i2) {
                    case 0:
                        p0.a.s(map, "<this>");
                        return map.entrySet().iterator();
                    default:
                        p0.a.s(map, "<this>");
                        return map.entrySet().iterator();
                }
            default:
                Map map2 = (Map) obj;
                switch (i2) {
                    case 0:
                        p0.a.s(map2, "<this>");
                        return map2.entrySet().iterator();
                    default:
                        p0.a.s(map2, "<this>");
                        return map2.entrySet().iterator();
                }
        }
    }

    @Override // n1.a
    public final int d(Object obj) {
        int i2 = this.f31051c;
        switch (i2) {
            case 0:
                Map map = (Map) obj;
                switch (i2) {
                    case 0:
                        p0.a.s(map, "<this>");
                        return map.size();
                    default:
                        p0.a.s(map, "<this>");
                        return map.size();
                }
            default:
                Map map2 = (Map) obj;
                switch (i2) {
                    case 0:
                        p0.a.s(map2, "<this>");
                        return map2.size();
                    default:
                        p0.a.s(map2, "<this>");
                        return map2.size();
                }
        }
    }
}
