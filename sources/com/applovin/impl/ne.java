package com.applovin.impl;

import com.applovin.mediation.MaxAdFormat;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class ne extends ge {
    public ne(int i2, Map map, JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.mediation.g gVar, com.applovin.impl.sdk.j jVar) {
        super(i2, map, jSONObject, jSONObject2, gVar, jVar);
    }

    public float h0() {
        return b("viewability_min_alpha", ((Float) this.f26025a.a(sj.S1)).floatValue() / 100.0f);
    }

    public int i0() {
        return a("viewability_min_pixels", -1);
    }

    public int j0() {
        MaxAdFormat format = getFormat();
        sj sjVar = format == MaxAdFormat.BANNER ? sj.L1 : format == MaxAdFormat.MREC ? sj.N1 : format == MaxAdFormat.LEADER ? sj.P1 : format == MaxAdFormat.NATIVE ? sj.R1 : null;
        if (sjVar != null) {
            return a("viewability_min_height", ((Integer) this.f26025a.a(sjVar)).intValue());
        }
        return 0;
    }

    public float k0() {
        return b("viewability_min_percentage_dp", -1.0f);
    }

    public float l0() {
        return b("viewability_min_percentage_pixels", -1.0f);
    }

    public long m0() {
        return a("viewability_timer_min_visible_ms", ((Long) this.f26025a.a(sj.T1)).longValue());
    }

    public int n0() {
        MaxAdFormat format = getFormat();
        sj sjVar = format == MaxAdFormat.BANNER ? sj.K1 : format == MaxAdFormat.MREC ? sj.M1 : format == MaxAdFormat.LEADER ? sj.O1 : format == MaxAdFormat.NATIVE ? sj.Q1 : null;
        if (sjVar != null) {
            return a("viewability_min_width", ((Integer) this.f26025a.a(sjVar)).intValue());
        }
        return 0;
    }

    public boolean o0() {
        return i0() >= 0 || k0() >= 0.0f || l0() >= 0.0f;
    }
}
