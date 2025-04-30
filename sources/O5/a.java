package O5;

import C2.m;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final k f2197a;

    public a(k kVar) {
        this.f2197a = kVar;
    }

    public static a a(b bVar) {
        k kVar = (k) bVar;
        R2.b.c(bVar, "AdSession is null");
        if (kVar.f2232e.f3020c == null) {
            R2.b.e(kVar);
            a aVar = new a(kVar);
            kVar.f2232e.f3020c = aVar;
            return aVar;
        }
        throw new IllegalStateException("AdEvents already exists for AdSession");
    }

    public final void b() {
        k kVar = this.f2197a;
        R2.b.e(kVar);
        R2.b.l(kVar);
        if (!kVar.f2233f || kVar.f2234g) {
            try {
                kVar.f();
            } catch (Exception unused) {
            }
        }
        if (kVar.f2233f && !kVar.f2234g) {
            if (!kVar.f2236i) {
                T5.a aVar = kVar.f2232e;
                R5.i.f2751a.a(aVar.f(), "publishImpressionEvent", aVar.f3019a);
                kVar.f2236i = true;
                return;
            }
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    public final void c() {
        k kVar = this.f2197a;
        R2.b.b(kVar);
        R2.b.l(kVar);
        if (!kVar.f2237j) {
            T5.a aVar = kVar.f2232e;
            R5.i.f2751a.a(aVar.f(), "publishLoadedEvent", null, aVar.f3019a);
            kVar.f2237j = true;
            return;
        }
        throw new IllegalStateException("Loaded event can only be sent once");
    }

    public final void d(B3.e eVar) {
        k kVar = this.f2197a;
        R2.b.b(kVar);
        R2.b.l(kVar);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("skippable", false);
            jSONObject.put("autoPlay", eVar.f283a);
            jSONObject.put("position", (P5.d) eVar.b);
        } catch (JSONException e4) {
            m.c("VastProperties: JSON error", e4);
        }
        if (!kVar.f2237j) {
            T5.a aVar = kVar.f2232e;
            R5.i.f2751a.a(aVar.f(), "publishLoadedEvent", jSONObject, aVar.f3019a);
            kVar.f2237j = true;
            return;
        }
        throw new IllegalStateException("Loaded event can only be sent once");
    }
}
