package com.mbridge.msdk.video.signal.factory;

import com.mbridge.msdk.video.signal.a.e;
import com.mbridge.msdk.video.signal.a.h;
import com.mbridge.msdk.video.signal.c;
import com.mbridge.msdk.video.signal.d;
import com.mbridge.msdk.video.signal.f;
import com.mbridge.msdk.video.signal.g;
import com.mbridge.msdk.video.signal.i;
import com.mbridge.msdk.video.signal.j;

/* loaded from: classes4.dex */
public class a implements IJSFactory {
    protected com.mbridge.msdk.video.signal.b a;

    /* renamed from: b, reason: collision with root package name */
    protected d f16309b;

    /* renamed from: c, reason: collision with root package name */
    protected j f16310c;

    /* renamed from: d, reason: collision with root package name */
    protected g f16311d;

    /* renamed from: e, reason: collision with root package name */
    protected f f16312e;

    /* renamed from: f, reason: collision with root package name */
    protected i f16313f;

    /* renamed from: g, reason: collision with root package name */
    protected c f16314g;

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public com.mbridge.msdk.video.signal.b getActivityProxy() {
        if (this.a == null) {
            this.a = new com.mbridge.msdk.video.signal.a.b();
        }
        return this.a;
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public i getIJSRewardVideoV1() {
        if (this.f16313f == null) {
            this.f16313f = new com.mbridge.msdk.video.signal.a.g();
        }
        return this.f16313f;
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public c getJSBTModule() {
        if (this.f16314g == null) {
            this.f16314g = new com.mbridge.msdk.video.signal.a.c();
        }
        return this.f16314g;
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public d getJSCommon() {
        if (this.f16309b == null) {
            this.f16309b = new com.mbridge.msdk.video.signal.a.d();
        }
        return this.f16309b;
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public f getJSContainerModule() {
        if (this.f16312e == null) {
            this.f16312e = new e();
        }
        return this.f16312e;
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public g getJSNotifyProxy() {
        if (this.f16311d == null) {
            this.f16311d = new com.mbridge.msdk.video.signal.a.f();
        }
        return this.f16311d;
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public j getJSVideoModule() {
        if (this.f16310c == null) {
            this.f16310c = new h();
        }
        return this.f16310c;
    }
}
