package f8;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import e8.F;

/* loaded from: classes3.dex */
public abstract class A implements a8.b {
    private final a8.b tSerializer;

    public A(F f9) {
        this.tSerializer = f9;
    }

    @Override // a8.b
    public final Object deserialize(d8.c cVar) {
        boolean equals;
        i mVar;
        G7.j.e(cVar, "decoder");
        i b = F2.h.b(cVar);
        j l = b.l();
        b d2 = b.d();
        a8.b bVar = this.tSerializer;
        j transformDeserialize = transformDeserialize(l);
        d2.getClass();
        G7.j.e(bVar, "deserializer");
        G7.j.e(transformDeserialize, "element");
        if (transformDeserialize instanceof v) {
            mVar = new g8.o(d2, (v) transformDeserialize, null, null);
        } else if (transformDeserialize instanceof c) {
            mVar = new g8.p(d2, (c) transformDeserialize);
        } else {
            if (transformDeserialize instanceof q) {
                equals = true;
            } else {
                equals = transformDeserialize.equals(t.b);
            }
            if (equals) {
                mVar = new g8.m(d2, (y) transformDeserialize);
            } else {
                throw new RuntimeException();
            }
        }
        return g8.k.i(mVar, bVar);
    }

    @Override // a8.b
    public c8.g getDescriptor() {
        return this.tSerializer.getDescriptor();
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [G7.r, java.lang.Object] */
    @Override // a8.b
    public final void serialize(d8.d dVar, Object obj) {
        G7.j.e(dVar, "encoder");
        G7.j.e(obj, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        o c9 = F2.h.c(dVar);
        b d2 = c9.d();
        a8.b bVar = this.tSerializer;
        G7.j.e(d2, "<this>");
        G7.j.e(bVar, "serializer");
        ?? obj2 = new Object();
        new g8.n(d2, new G7.w(obj2, 13), 1).g(bVar, obj);
        Object obj3 = obj2.b;
        if (obj3 != null) {
            c9.E(transformSerialize((j) obj3));
        } else {
            G7.j.k("result");
            throw null;
        }
    }

    public abstract j transformDeserialize(j jVar);

    public j transformSerialize(j jVar) {
        G7.j.e(jVar, "element");
        return jVar;
    }
}
