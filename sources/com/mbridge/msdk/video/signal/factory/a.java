package com.mbridge.msdk.video.signal.factory;

import com.mbridge.msdk.video.signal.a.e;
import com.mbridge.msdk.video.signal.a.h;
import com.mbridge.msdk.video.signal.c;
import com.mbridge.msdk.video.signal.d;
import com.mbridge.msdk.video.signal.f;
import com.mbridge.msdk.video.signal.g;
import com.mbridge.msdk.video.signal.i;
import com.mbridge.msdk.video.signal.j;

/* loaded from: classes3.dex */
public class a implements IJSFactory {

    /* renamed from: a, reason: collision with root package name */
    protected com.mbridge.msdk.video.signal.b f19299a;
    protected d b;

    /* renamed from: c, reason: collision with root package name */
    protected j f19300c;

    /* renamed from: d, reason: collision with root package name */
    protected g f19301d;

    /* renamed from: e, reason: collision with root package name */
    protected f f19302e;

    /* renamed from: f, reason: collision with root package name */
    protected i f19303f;

    /* renamed from: g, reason: collision with root package name */
    protected c f19304g;

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public com.mbridge.msdk.video.signal.b getActivityProxy() {
        if (this.f19299a == null) {
            this.f19299a = new com.mbridge.msdk.video.signal.a.b();
        }
        return this.f19299a;
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public i getIJSRewardVideoV1() {
        if (this.f19303f == null) {
            this.f19303f = new com.mbridge.msdk.video.signal.a.g();
        }
        return this.f19303f;
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public c getJSBTModule() {
        if (this.f19304g == null) {
            this.f19304g = new com.mbridge.msdk.video.signal.a.c();
        }
        return this.f19304g;
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public d getJSCommon() {
        if (this.b == null) {
            this.b = new com.mbridge.msdk.video.signal.a.d();
        }
        return this.b;
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public f getJSContainerModule() {
        if (this.f19302e == null) {
            this.f19302e = new e();
        }
        return this.f19302e;
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public g getJSNotifyProxy() {
        if (this.f19301d == null) {
            this.f19301d = new com.mbridge.msdk.video.signal.a.f();
        }
        return this.f19301d;
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public j getJSVideoModule() {
        if (this.f19300c == null) {
            this.f19300c = new h();
        }
        return this.f19300c;
    }
}
