package a8;

import G7.v;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import e8.W;
import t7.AbstractC2712a;
import t7.EnumC2718g;
import t7.InterfaceC2717f;
import x0.AbstractC2914a;

/* loaded from: classes3.dex */
public final class f implements b {

    /* renamed from: a, reason: collision with root package name */
    public final M7.b f4083a;
    public final InterfaceC2717f b = AbstractC2712a.c(EnumC2718g.f23018c, new e(this, 0));

    public f(G7.e eVar) {
        this.f4083a = eVar;
    }

    public final void a(d8.a aVar) {
        G7.j.e(aVar, "decoder");
        aVar.a().getClass();
        G7.j.e(this.f4083a, "baseClass");
        v.c(1, null);
    }

    @Override // a8.b
    public final Object deserialize(d8.c cVar) {
        G7.j.e(cVar, "decoder");
        d8.a b = cVar.b(getDescriptor());
        String str = null;
        while (true) {
            int h6 = b.h(getDescriptor());
            if (h6 != -1) {
                if (h6 != 0) {
                    if (h6 != 1) {
                        StringBuilder sb = new StringBuilder("Invalid index in polymorphic deserialization of ");
                        if (str == null) {
                            str = "unknown class";
                        }
                        sb.append(str);
                        sb.append("\n Expected 0, 1 or DECODE_DONE(-1), but found ");
                        sb.append(h6);
                        throw new IllegalArgumentException(sb.toString());
                    }
                    if (str == null) {
                        throw new IllegalArgumentException("Cannot read polymorphic value before its type token".toString());
                    }
                    a(b);
                    W.i(this.f4083a, str);
                    throw null;
                }
                str = b.w(getDescriptor(), h6);
            } else {
                throw new IllegalArgumentException(AbstractC2914a.d("Polymorphic value has not been read for class ", str).toString());
            }
        }
    }

    @Override // a8.b
    public final c8.g getDescriptor() {
        return (c8.g) this.b.getValue();
    }

    @Override // a8.b
    public final void serialize(d8.d dVar, Object obj) {
        G7.j.e(dVar, "encoder");
        G7.j.e(obj, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        R2.b.m(this, dVar, obj);
        throw null;
    }

    public final String toString() {
        return "kotlinx.serialization.PolymorphicSerializer(baseClass: " + this.f4083a + ')';
    }
}
