package com.mbridge.msdk.tracker.network;

import com.mbridge.msdk.tracker.network.w;
import java.nio.charset.StandardCharsets;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class j extends i<JSONObject> implements w.a {

    /* renamed from: b, reason: collision with root package name */
    private final k<JSONObject> f15439b;

    public j(int i10, String str, String str2, long j3, k<JSONObject> kVar) {
        super(i10, str, 0, str2, j3);
        this.f15439b = kVar;
        a((w.a) this);
    }

    private void b(w<JSONObject> wVar) {
        k<JSONObject> kVar = this.f15439b;
        if (kVar != null) {
            try {
                kVar.b(this, wVar, wVar.f15522c.a);
            } catch (Exception e2) {
                com.mbridge.msdk.foundation.tools.ad.b(i.a, e2.getMessage());
            }
        }
    }

    @Override // com.mbridge.msdk.tracker.network.u
    public final /* bridge */ /* synthetic */ void a(Object obj) {
    }

    @Override // com.mbridge.msdk.tracker.network.u
    public final w<JSONObject> a(r rVar) {
        try {
            String str = new String(rVar.f15471b, StandardCharsets.UTF_8);
            if (rVar.a == 204) {
                w<JSONObject> a = w.a(new JSONObject(), com.mbridge.msdk.tracker.network.toolbox.f.a(rVar));
                a(a, rVar);
                return a;
            }
            w<JSONObject> a10 = w.a(new JSONObject(str), com.mbridge.msdk.tracker.network.toolbox.f.a(rVar));
            a(a10, rVar);
            return a10;
        } catch (JSONException e2) {
            com.mbridge.msdk.foundation.tools.ad.b(i.a, e2.getMessage());
            w<JSONObject> a11 = w.a(new t(e2));
            b(a11);
            return a11;
        } catch (Throwable th2) {
            w<JSONObject> a12 = w.a(new ac(th2));
            b(a12);
            return a12;
        }
    }

    private void a(w<JSONObject> wVar, r rVar) {
        k<JSONObject> kVar = this.f15439b;
        if (kVar != null) {
            try {
                kVar.a(this, wVar, rVar);
            } catch (Exception e2) {
                com.mbridge.msdk.foundation.tools.ad.b(i.a, e2.getMessage());
            }
        }
    }

    @Override // com.mbridge.msdk.tracker.network.w.a
    public final void a(ad adVar) {
        b(w.a(adVar));
    }
}
