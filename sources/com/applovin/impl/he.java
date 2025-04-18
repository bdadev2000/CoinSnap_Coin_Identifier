package com.applovin.impl;

import com.applovin.mediation.MaxAdFormat;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class he extends ne {
    public he(int i2, Map map, JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.sdk.j jVar) {
        super(i2, map, jSONObject, jSONObject2, null, jVar);
    }

    @Override // com.applovin.impl.ge
    public ge a(com.applovin.impl.mediation.g gVar) {
        return new he(this, gVar);
    }

    public long p0() {
        long a2 = a("ad_refresh_ms", -1L);
        return a2 >= 0 ? a2 : b("ad_refresh_ms", ((Long) this.f26025a.a(ve.a7)).longValue());
    }

    public long q0() {
        return yp.c(a("bg_color", (String) null));
    }

    public int r0() {
        int a2 = a("ad_view_height", -2);
        if (a2 != -2) {
            return a2;
        }
        MaxAdFormat format = getFormat();
        if (format.isAdViewAd()) {
            return format.getSize().getHeight();
        }
        throw new IllegalStateException("Invalid ad format");
    }

    public long s0() {
        return a("viewability_imp_delay_ms", ((Long) this.f26025a.a(sj.J1)).longValue());
    }

    public int t0() {
        int a2 = a("ad_view_width", -2);
        if (a2 != -2) {
            return a2;
        }
        MaxAdFormat format = getFormat();
        if (format.isAdViewAd()) {
            return format.getSize().getWidth();
        }
        throw new IllegalStateException("Invalid ad format");
    }

    public boolean u0() {
        return p0() >= 0;
    }

    public boolean v0() {
        return a("proe", (Boolean) this.f26025a.a(ve.B7)).booleanValue();
    }

    private he(he heVar, com.applovin.impl.mediation.g gVar) {
        super(heVar.J(), heVar.i(), heVar.a(), heVar.g(), gVar, heVar.f26025a);
    }
}
