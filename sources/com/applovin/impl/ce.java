package com.applovin.impl;

import com.applovin.mediation.MaxAdFormat;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ce extends ie {
    public ce(int i10, Map map, JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.sdk.k kVar) {
        super(i10, map, jSONObject, jSONObject2, null, kVar);
    }

    @Override // com.applovin.impl.be
    public be a(com.applovin.impl.mediation.g gVar) {
        return new ce(this, gVar);
    }

    public long k0() {
        long a = a("ad_refresh_ms", -1L);
        if (a >= 0) {
            return a;
        }
        return b("ad_refresh_ms", ((Long) this.a.a(qe.S6)).longValue());
    }

    public long l0() {
        return zp.d(a("bg_color", (String) null));
    }

    public int m0() {
        int a = a("ad_view_height", -2);
        if (a == -2) {
            MaxAdFormat format = getFormat();
            if (format.isAdViewAd()) {
                return format.getSize().getHeight();
            }
            throw new IllegalStateException("Invalid ad format");
        }
        return a;
    }

    public long n0() {
        return a("viewability_imp_delay_ms", ((Long) this.a.a(oj.H1)).longValue());
    }

    public int o0() {
        int a = a("ad_view_width", -2);
        if (a == -2) {
            MaxAdFormat format = getFormat();
            if (format.isAdViewAd()) {
                return format.getSize().getWidth();
            }
            throw new IllegalStateException("Invalid ad format");
        }
        return a;
    }

    public boolean p0() {
        return k0() >= 0;
    }

    public boolean q0() {
        return a("proe", (Boolean) this.a.a(qe.f7208t7)).booleanValue();
    }

    private ce(ce ceVar, com.applovin.impl.mediation.g gVar) {
        super(ceVar.I(), ceVar.i(), ceVar.a(), ceVar.g(), gVar, ceVar.a);
    }
}
