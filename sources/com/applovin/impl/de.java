package com.applovin.impl;

import android.os.Bundle;
import android.os.SystemClock;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class de extends be implements h8 {
    private boolean A;

    /* renamed from: v, reason: collision with root package name */
    private final Bundle f4292v;

    /* renamed from: w, reason: collision with root package name */
    private final AtomicReference f4293w;

    /* renamed from: x, reason: collision with root package name */
    private final AtomicBoolean f4294x;

    /* renamed from: y, reason: collision with root package name */
    private final AtomicBoolean f4295y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f4296z;

    public de(int i10, Map map, JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.sdk.k kVar) {
        super(i10, map, jSONObject, jSONObject2, null, kVar);
        this.f4292v = new Bundle();
        this.f4295y = new AtomicBoolean();
        this.f4293w = new AtomicReference();
        this.f4294x = new AtomicBoolean();
    }

    private long d0() {
        long a = a("ad_expiration_ms", -1L);
        if (a < 0) {
            return b("ad_expiration_ms", ((Long) this.a.a(qe.f7199k7)).longValue());
        }
        return a;
    }

    public void a(boolean z10) {
        this.f4296z = z10;
    }

    public void c0() {
        this.f4294x.set(true);
    }

    public long e0() {
        return a("ahdm", ((Long) this.a.a(qe.f7192d7)).longValue());
    }

    public long f0() {
        long a = a("ad_hidden_on_ad_dismiss_callback_delay_ms", -1L);
        if (a >= 0) {
            return a;
        }
        return b("ad_hidden_on_ad_dismiss_callback_delay_ms", ((Long) this.a.a(qe.f7207s7)).longValue());
    }

    public long g0() {
        long a = a("ad_hidden_timeout_ms", -1L);
        if (a >= 0) {
            return a;
        }
        return b("ad_hidden_timeout_ms", ((Long) this.a.a(qe.f7204p7)).longValue());
    }

    @Override // com.applovin.impl.h8
    public long getTimeToLiveMillis() {
        return d0() - (SystemClock.elapsedRealtime() - J());
    }

    public ch h0() {
        return (ch) this.f4293w.getAndSet(null);
    }

    public long i0() {
        if (J() > 0) {
            return SystemClock.elapsedRealtime() - J();
        }
        return -1L;
    }

    public Bundle j0() {
        return this.f4292v;
    }

    public long k0() {
        long a = a("fullscreen_display_delay_ms", -1L);
        if (a >= 0) {
            return a;
        }
        return ((Long) this.a.a(qe.f7190b7)).longValue();
    }

    public String l0() {
        return b("mcode", "");
    }

    public AtomicBoolean m0() {
        return this.f4295y;
    }

    public boolean n0() {
        return this.f4296z;
    }

    public boolean o0() {
        return this.f4294x.get();
    }

    public boolean p0() {
        if (a("schedule_ad_hidden_on_ad_dismiss", Boolean.FALSE).booleanValue()) {
            return true;
        }
        return b("schedule_ad_hidden_on_ad_dismiss", (Boolean) this.a.a(qe.f7205q7)).booleanValue();
    }

    public boolean q0() {
        if (a("schedule_ad_hidden_on_single_task_app_relaunch", Boolean.FALSE).booleanValue()) {
            return true;
        }
        return b("schedule_ad_hidden_on_single_task_app_relaunch", (Boolean) this.a.a(qe.f7206r7)).booleanValue();
    }

    public boolean r0() {
        return a("susaode", (Boolean) this.a.a(qe.f7191c7)).booleanValue();
    }

    @Override // com.applovin.impl.h8
    public void setExpired() {
        this.A = true;
    }

    public void a(ch chVar) {
        this.f4293w.set(chVar);
    }

    @Override // com.applovin.impl.be
    public void a(Bundle bundle) {
        Bundle bundle2;
        super.a(bundle);
        if (bundle == null || (bundle2 = bundle.getBundle("applovin_ad_view_info")) == null) {
            return;
        }
        this.f4292v.putBundle("applovin_ad_view_info", bundle2);
    }

    private de(de deVar, com.applovin.impl.mediation.g gVar) {
        super(deVar.I(), deVar.i(), deVar.a(), deVar.g(), gVar, deVar.a);
        this.f4292v = new Bundle();
        this.f4295y = new AtomicBoolean();
        this.f4293w = deVar.f4293w;
        this.f4294x = deVar.f4294x;
    }

    @Override // com.applovin.impl.be
    public be a(com.applovin.impl.mediation.g gVar) {
        return new de(this, gVar);
    }
}
