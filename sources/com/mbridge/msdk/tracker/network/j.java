package com.mbridge.msdk.tracker.network;

import com.mbridge.msdk.tracker.network.w;
import java.nio.charset.StandardCharsets;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class j extends i<JSONObject> implements w.a {
    private final k<JSONObject> b;

    public j(int i9, String str, String str2, long j7, k<JSONObject> kVar) {
        super(i9, str, 0, str2, j7);
        this.b = kVar;
        a((w.a) this);
    }

    private void b(w<JSONObject> wVar) {
        k<JSONObject> kVar = this.b;
        if (kVar != null) {
            try {
                kVar.b(this, wVar, wVar.f18286c.f18156a);
            } catch (Exception e4) {
                com.mbridge.msdk.foundation.tools.ad.b(i.f18178a, e4.getMessage());
            }
        }
    }

    @Override // com.mbridge.msdk.tracker.network.u
    public final /* bridge */ /* synthetic */ void a(Object obj) {
    }

    @Override // com.mbridge.msdk.tracker.network.u
    public final w<JSONObject> a(r rVar) {
        try {
            String str = new String(rVar.b, StandardCharsets.UTF_8);
            if (rVar.f18231a == 204) {
                w<JSONObject> a6 = w.a(new JSONObject(), com.mbridge.msdk.tracker.network.toolbox.f.a(rVar));
                a(a6, rVar);
                return a6;
            }
            w<JSONObject> a9 = w.a(new JSONObject(str), com.mbridge.msdk.tracker.network.toolbox.f.a(rVar));
            a(a9, rVar);
            return a9;
        } catch (JSONException e4) {
            com.mbridge.msdk.foundation.tools.ad.b(i.f18178a, e4.getMessage());
            w<JSONObject> a10 = w.a(new t(e4));
            b(a10);
            return a10;
        } catch (Throwable th) {
            w<JSONObject> a11 = w.a(new ac(th));
            b(a11);
            return a11;
        }
    }

    private void a(w<JSONObject> wVar, r rVar) {
        k<JSONObject> kVar = this.b;
        if (kVar != null) {
            try {
                kVar.a(this, wVar, rVar);
            } catch (Exception e4) {
                com.mbridge.msdk.foundation.tools.ad.b(i.f18178a, e4.getMessage());
            }
        }
    }

    @Override // com.mbridge.msdk.tracker.network.w.a
    public final void a(ad adVar) {
        b(w.a(adVar));
    }
}
