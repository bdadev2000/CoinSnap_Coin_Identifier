package a8;

import G7.w;
import a5.C0398b;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import e8.W;
import java.util.List;
import u7.AbstractC2815f;

/* loaded from: classes3.dex */
public final class a implements b {

    /* renamed from: a, reason: collision with root package name */
    public final M7.b f4080a;
    public final List b;

    /* renamed from: c, reason: collision with root package name */
    public final c8.b f4081c;

    public a(G7.e eVar, b[] bVarArr) {
        this.f4080a = eVar;
        this.b = AbstractC2815f.t(bVarArr);
        this.f4081c = new c8.b(android.support.v4.media.session.a.e("kotlinx.serialization.ContextualSerializer", c8.k.f5451d, new c8.g[0], new w(this, 4)), eVar);
    }

    @Override // a8.b
    public final Object deserialize(d8.c cVar) {
        G7.j.e(cVar, "decoder");
        C0398b a6 = cVar.a();
        List list = this.b;
        M7.b bVar = this.f4080a;
        a6.t(bVar, list);
        W.g(bVar);
        throw null;
    }

    @Override // a8.b
    public final c8.g getDescriptor() {
        return this.f4081c;
    }

    @Override // a8.b
    public final void serialize(d8.d dVar, Object obj) {
        G7.j.e(dVar, "encoder");
        G7.j.e(obj, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        C0398b a6 = dVar.a();
        List list = this.b;
        M7.b bVar = this.f4080a;
        a6.t(bVar, list);
        W.g(bVar);
        throw null;
    }
}
