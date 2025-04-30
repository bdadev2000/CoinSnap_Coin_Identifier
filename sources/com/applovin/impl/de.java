package com.applovin.impl;

import android.os.Bundle;
import android.os.SystemClock;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class de extends be implements h8 {

    /* renamed from: A, reason: collision with root package name */
    private boolean f7286A;

    /* renamed from: v, reason: collision with root package name */
    private final Bundle f7287v;

    /* renamed from: w, reason: collision with root package name */
    private final AtomicReference f7288w;

    /* renamed from: x, reason: collision with root package name */
    private final AtomicBoolean f7289x;

    /* renamed from: y, reason: collision with root package name */
    private final AtomicBoolean f7290y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f7291z;

    public de(int i9, Map map, JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.sdk.k kVar) {
        super(i9, map, jSONObject, jSONObject2, null, kVar);
        this.f7287v = new Bundle();
        this.f7290y = new AtomicBoolean();
        this.f7288w = new AtomicReference();
        this.f7289x = new AtomicBoolean();
    }

    private long d0() {
        long a6 = a("ad_expiration_ms", -1L);
        if (a6 < 0) {
            return b("ad_expiration_ms", ((Long) this.f8655a.a(qe.k7)).longValue());
        }
        return a6;
    }

    public void a(boolean z8) {
        this.f7291z = z8;
    }

    public void c0() {
        this.f7289x.set(true);
    }

    public long e0() {
        return a("ahdm", ((Long) this.f8655a.a(qe.f10326d7)).longValue());
    }

    public long f0() {
        long a6 = a("ad_hidden_on_ad_dismiss_callback_delay_ms", -1L);
        if (a6 >= 0) {
            return a6;
        }
        return b("ad_hidden_on_ad_dismiss_callback_delay_ms", ((Long) this.f8655a.a(qe.f10336s7)).longValue());
    }

    public long g0() {
        long a6 = a("ad_hidden_timeout_ms", -1L);
        if (a6 >= 0) {
            return a6;
        }
        return b("ad_hidden_timeout_ms", ((Long) this.f8655a.a(qe.p7)).longValue());
    }

    @Override // com.applovin.impl.h8
    public long getTimeToLiveMillis() {
        return d0() - (SystemClock.elapsedRealtime() - J());
    }

    public ch h0() {
        return (ch) this.f7288w.getAndSet(null);
    }

    public long i0() {
        if (J() > 0) {
            return SystemClock.elapsedRealtime() - J();
        }
        return -1L;
    }

    public Bundle j0() {
        return this.f7287v;
    }

    public long k0() {
        long a6 = a("fullscreen_display_delay_ms", -1L);
        if (a6 >= 0) {
            return a6;
        }
        return ((Long) this.f8655a.a(qe.f10324b7)).longValue();
    }

    public String l0() {
        return b("mcode", "");
    }

    public AtomicBoolean m0() {
        return this.f7290y;
    }

    public boolean n0() {
        return this.f7291z;
    }

    public boolean o0() {
        return this.f7289x.get();
    }

    public boolean p0() {
        if (a("schedule_ad_hidden_on_ad_dismiss", Boolean.FALSE).booleanValue()) {
            return true;
        }
        return b("schedule_ad_hidden_on_ad_dismiss", (Boolean) this.f8655a.a(qe.f10334q7)).booleanValue();
    }

    public boolean q0() {
        if (a("schedule_ad_hidden_on_single_task_app_relaunch", Boolean.FALSE).booleanValue()) {
            return true;
        }
        return b("schedule_ad_hidden_on_single_task_app_relaunch", (Boolean) this.f8655a.a(qe.f10335r7)).booleanValue();
    }

    public boolean r0() {
        return a("susaode", (Boolean) this.f8655a.a(qe.f10325c7)).booleanValue();
    }

    @Override // com.applovin.impl.h8
    public void setExpired() {
        this.f7286A = true;
    }

    public void a(ch chVar) {
        this.f7288w.set(chVar);
    }

    @Override // com.applovin.impl.be
    public void a(Bundle bundle) {
        Bundle bundle2;
        super.a(bundle);
        if (bundle == null || (bundle2 = bundle.getBundle("applovin_ad_view_info")) == null) {
            return;
        }
        this.f7287v.putBundle("applovin_ad_view_info", bundle2);
    }

    private de(de deVar, com.applovin.impl.mediation.g gVar) {
        super(deVar.I(), deVar.i(), deVar.a(), deVar.g(), gVar, deVar.f8655a);
        this.f7287v = new Bundle();
        this.f7290y = new AtomicBoolean();
        this.f7288w = deVar.f7288w;
        this.f7289x = deVar.f7289x;
    }

    @Override // com.applovin.impl.be
    public be a(com.applovin.impl.mediation.g gVar) {
        return new de(this, gVar);
    }
}
