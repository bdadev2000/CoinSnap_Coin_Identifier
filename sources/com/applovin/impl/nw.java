package com.applovin.impl;

import android.app.Activity;
import android.os.Bundle;
import com.applovin.impl.ec;
import com.applovin.impl.r;
import com.applovin.mediation.MaxDebuggerAdUnitDetailActivity;
import com.facebook.LoginStatusCallback;
import com.facebook.internal.PlatformServiceClient;
import com.facebook.login.LoginLogger;
import com.facebook.login.LoginManager;

/* loaded from: classes.dex */
public final /* synthetic */ class nw implements r.b, ec.a, PlatformServiceClient.CompletedListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f25797b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f25798c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ nw(x xVar, com.applovin.impl.sdk.j jVar, z zVar, a0 a0Var) {
        this.e = xVar;
        this.f25797b = jVar;
        this.f25798c = zVar;
        this.d = a0Var;
    }

    @Override // com.applovin.impl.r.b
    public final void a(Activity activity) {
        x.a((dc) this.e, (z) this.f25798c, (a0) this.d, (com.applovin.impl.sdk.j) this.f25797b, (MaxDebuggerAdUnitDetailActivity) activity);
    }

    @Override // com.facebook.internal.PlatformServiceClient.CompletedListener
    public final void completed(Bundle bundle) {
        LoginManager.m570retrieveLoginStatusImpl$lambda2((String) this.e, (LoginLogger) this.f25798c, (LoginStatusCallback) this.d, (String) this.f25797b, bundle);
    }

    public /* synthetic */ nw(Object obj, Object obj2, Object obj3, Object obj4) {
        this.e = obj;
        this.f25798c = obj2;
        this.d = obj3;
        this.f25797b = obj4;
    }

    @Override // com.applovin.impl.ec.a
    public final void a(lb lbVar, dc dcVar) {
        ((x) this.e).a((com.applovin.impl.sdk.j) this.f25797b, (z) this.f25798c, (a0) this.d, lbVar, dcVar);
    }
}
