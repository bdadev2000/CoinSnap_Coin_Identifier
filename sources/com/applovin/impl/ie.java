package com.applovin.impl;

import android.os.Bundle;
import android.os.SystemClock;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ie extends ge implements j8 {
    private boolean A;

    /* renamed from: v, reason: collision with root package name */
    private final Bundle f24461v;
    private final AtomicReference w;
    private final AtomicBoolean x;

    /* renamed from: y, reason: collision with root package name */
    private final AtomicBoolean f24462y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f24463z;

    public ie(int i2, Map map, JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.sdk.j jVar) {
        super(i2, map, jSONObject, jSONObject2, null, jVar);
        this.f24461v = new Bundle();
        this.f24462y = new AtomicBoolean();
        this.w = new AtomicReference();
        this.x = new AtomicBoolean();
    }

    private long i0() {
        long a2 = a("ad_expiration_ms", -1L);
        return a2 < 0 ? b("ad_expiration_ms", ((Long) this.f26025a.a(ve.s7)).longValue()) : a2;
    }

    public void a(boolean z2) {
        this.f24463z = z2;
    }

    @Override // com.applovin.impl.j8
    public long getTimeToLiveMillis() {
        return i0() - (SystemClock.elapsedRealtime() - K());
    }

    public void h0() {
        this.x.set(true);
    }

    public long j0() {
        return a("ahdm", ((Long) this.f26025a.a(ve.m7)).longValue());
    }

    public long k0() {
        long a2 = a("ad_hidden_on_ad_dismiss_callback_delay_ms", -1L);
        return a2 >= 0 ? a2 : b("ad_hidden_on_ad_dismiss_callback_delay_ms", ((Long) this.f26025a.a(ve.A7)).longValue());
    }

    public long l0() {
        long a2 = a("ad_hidden_timeout_ms", -1L);
        return a2 >= 0 ? a2 : b("ad_hidden_timeout_ms", ((Long) this.f26025a.a(ve.x7)).longValue());
    }

    public fh m0() {
        return (fh) this.w.getAndSet(null);
    }

    public long n0() {
        if (K() > 0) {
            return SystemClock.elapsedRealtime() - K();
        }
        return -1L;
    }

    public Bundle o0() {
        return this.f24461v;
    }

    public long p0() {
        long a2 = a("fullscreen_display_delay_ms", -1L);
        return a2 >= 0 ? a2 : ((Long) this.f26025a.a(ve.k7)).longValue();
    }

    public String q0() {
        return b("mcode", "");
    }

    public AtomicBoolean r0() {
        return this.f24462y;
    }

    public boolean s0() {
        return this.f24463z;
    }

    @Override // com.applovin.impl.j8
    public void setExpired() {
        this.A = true;
    }

    public boolean t0() {
        return this.x.get();
    }

    public boolean u0() {
        if (a("schedule_ad_hidden_on_ad_dismiss", Boolean.FALSE).booleanValue()) {
            return true;
        }
        return b("schedule_ad_hidden_on_ad_dismiss", (Boolean) this.f26025a.a(ve.y7)).booleanValue();
    }

    public boolean v0() {
        if (a("schedule_ad_hidden_on_single_task_app_relaunch", Boolean.FALSE).booleanValue()) {
            return true;
        }
        return b("schedule_ad_hidden_on_single_task_app_relaunch", (Boolean) this.f26025a.a(ve.z7)).booleanValue();
    }

    public boolean w0() {
        return a("susaode", (Boolean) this.f26025a.a(ve.l7)).booleanValue();
    }

    public void a(fh fhVar) {
        this.w.set(fhVar);
    }

    @Override // com.applovin.impl.ge
    public void a(Bundle bundle) {
        Bundle bundle2;
        super.a(bundle);
        if (bundle == null || (bundle2 = bundle.getBundle("applovin_ad_view_info")) == null) {
            return;
        }
        this.f24461v.putBundle("applovin_ad_view_info", bundle2);
    }

    private ie(ie ieVar, com.applovin.impl.mediation.g gVar) {
        super(ieVar.J(), ieVar.i(), ieVar.a(), ieVar.g(), gVar, ieVar.f26025a);
        this.f24461v = new Bundle();
        this.f24462y = new AtomicBoolean();
        this.w = ieVar.w;
        this.x = ieVar.x;
    }

    @Override // com.applovin.impl.ge
    public ge a(com.applovin.impl.mediation.g gVar) {
        return new ie(this, gVar);
    }
}
