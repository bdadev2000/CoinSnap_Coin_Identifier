package n1;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class n0 extends a {

    /* renamed from: a, reason: collision with root package name */
    public final k1.a f31110a;

    /* renamed from: b, reason: collision with root package name */
    public final k1.a f31111b;

    public n0(k1.a aVar, k1.a aVar2) {
        this.f31110a = aVar;
        this.f31111b = aVar2;
    }

    @Override // k1.a
    public final void a(p0.a aVar, Object obj) {
        p0.a.s(aVar, "encoder");
        d(obj);
        z zVar = ((a0) this).d;
        p0.a.s(zVar, "descriptor");
        Iterator c2 = c(obj);
        int i2 = 0;
        while (c2.hasNext()) {
            Map.Entry entry = (Map.Entry) c2.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            int i3 = i2 + 1;
            aVar.Y(zVar, i2, this.f31110a, key);
            i2 += 2;
            aVar.Y(zVar, i3, this.f31111b, value);
        }
    }
}
