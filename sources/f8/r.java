package f8;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import e8.c0;
import e8.d0;
import e8.v0;
import java.util.Iterator;
import t7.C2730s;

/* loaded from: classes3.dex */
public final class r implements a8.b {

    /* renamed from: a, reason: collision with root package name */
    public static final r f20406a = new Object();
    public static final c0 b;

    /* JADX WARN: Type inference failed for: r0v0, types: [f8.r, java.lang.Object] */
    static {
        c8.e eVar = c8.e.l;
        if (!O7.g.L("kotlinx.serialization.json.JsonLiteral")) {
            Iterator it = d0.f20159a.keySet().iterator();
            while (it.hasNext()) {
                String b8 = ((G7.e) ((M7.b) it.next())).b();
                G7.j.b(b8);
                String a6 = d0.a(b8);
                if ("kotlinx.serialization.json.JsonLiteral".equalsIgnoreCase("kotlin." + a6) || "kotlinx.serialization.json.JsonLiteral".equalsIgnoreCase(a6)) {
                    throw new IllegalArgumentException(O7.h.s("\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name kotlinx.serialization.json.JsonLiteral there already exist " + d0.a(a6) + "Serializer.\n                Please refer to SerialDescriptor documentation for additional information.\n            "));
                }
            }
            b = new c0("kotlinx.serialization.json.JsonLiteral", eVar);
            return;
        }
        throw new IllegalArgumentException("Blank serial names are prohibited".toString());
    }

    @Override // a8.b
    public final Object deserialize(d8.c cVar) {
        G7.j.e(cVar, "decoder");
        j l = F2.h.b(cVar).l();
        if (l instanceof q) {
            return (q) l;
        }
        throw g8.k.d(l.toString(), -1, "Unexpected JSON element, expected JsonLiteral, had " + G7.s.a(l.getClass()));
    }

    @Override // a8.b
    public final c8.g getDescriptor() {
        return b;
    }

    @Override // a8.b
    public final void serialize(d8.d dVar, Object obj) {
        q qVar = (q) obj;
        G7.j.e(dVar, "encoder");
        G7.j.e(qVar, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        F2.h.c(dVar);
        boolean z8 = qVar.b;
        String str = qVar.f20405c;
        if (z8) {
            dVar.F(str);
            return;
        }
        Long w2 = O7.n.w(str);
        if (w2 != null) {
            dVar.B(w2.longValue());
            return;
        }
        C2730s v6 = com.facebook.appevents.n.v(str);
        if (v6 != null) {
            dVar.q(v0.b).B(v6.b);
            return;
        }
        G7.j.e(str, "<this>");
        Double d2 = null;
        try {
            O7.e eVar = O7.f.f2255a;
            eVar.getClass();
            if (eVar.b.matcher(str).matches()) {
                d2 = Double.valueOf(Double.parseDouble(str));
            }
        } catch (NumberFormatException unused) {
        }
        if (d2 != null) {
            dVar.h(d2.doubleValue());
            return;
        }
        Boolean m = C2.m.m(qVar);
        if (m != null) {
            dVar.l(m.booleanValue());
        } else {
            dVar.F(str);
        }
    }
}
