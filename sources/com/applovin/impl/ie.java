package com.applovin.impl;

import com.applovin.mediation.MaxAdFormat;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class ie extends be {
    public ie(int i9, Map map, JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.mediation.g gVar, com.applovin.impl.sdk.k kVar) {
        super(i9, map, jSONObject, jSONObject2, gVar, kVar);
    }

    public float c0() {
        return b("viewability_min_alpha", ((Float) this.f8655a.a(oj.f9657Q1)).floatValue() / 100.0f);
    }

    public int d0() {
        return a("viewability_min_pixels", -1);
    }

    public int e0() {
        oj ojVar;
        MaxAdFormat format = getFormat();
        if (format == MaxAdFormat.BANNER) {
            ojVar = oj.f9612J1;
        } else if (format == MaxAdFormat.MREC) {
            ojVar = oj.f9624L1;
        } else if (format == MaxAdFormat.LEADER) {
            ojVar = oj.f9638N1;
        } else if (format == MaxAdFormat.NATIVE) {
            ojVar = oj.f9650P1;
        } else {
            ojVar = null;
        }
        if (ojVar != null) {
            return a("viewability_min_height", ((Integer) this.f8655a.a(ojVar)).intValue());
        }
        return 0;
    }

    public float f0() {
        return b("viewability_min_percentage_dp", -1.0f);
    }

    public float g0() {
        return b("viewability_min_percentage_pixels", -1.0f);
    }

    public long h0() {
        return a("viewability_timer_min_visible_ms", ((Long) this.f8655a.a(oj.f9664R1)).longValue());
    }

    public int i0() {
        oj ojVar;
        MaxAdFormat format = getFormat();
        if (format == MaxAdFormat.BANNER) {
            ojVar = oj.f9606I1;
        } else if (format == MaxAdFormat.MREC) {
            ojVar = oj.f9618K1;
        } else if (format == MaxAdFormat.LEADER) {
            ojVar = oj.f9631M1;
        } else if (format == MaxAdFormat.NATIVE) {
            ojVar = oj.f9644O1;
        } else {
            ojVar = null;
        }
        if (ojVar != null) {
            return a("viewability_min_width", ((Integer) this.f8655a.a(ojVar)).intValue());
        }
        return 0;
    }

    public boolean j0() {
        if (d0() < 0 && f0() < 0.0f && g0() < 0.0f) {
            return false;
        }
        return true;
    }
}
