package com.applovin.impl;

import com.applovin.impl.uj;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class wj extends ke {
    public wj(Map map, JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.sdk.k kVar) {
        super(map, jSONObject, jSONObject2, kVar);
    }

    public uj.b s() {
        return uj.b.values()[a("signal_cache_level", ((Integer) this.a.a(qe.f7198j7)).intValue())];
    }

    public long t() {
        return a("signal_expiration_ms", ((Long) this.a.a(qe.f7197i7)).longValue());
    }

    @Override // com.applovin.impl.ke
    public String toString() {
        return "SignalProviderSpec{adObject=" + a() + AbstractJsonLexerKt.END_OBJ;
    }

    public boolean u() {
        return a("initialize_before_collecting_signal", Boolean.TRUE).booleanValue();
    }

    public boolean v() {
        return a("only_collect_signal_when_initialized", Boolean.FALSE).booleanValue();
    }

    public boolean w() {
        return a("use_cached_adapter", Boolean.TRUE).booleanValue();
    }
}
