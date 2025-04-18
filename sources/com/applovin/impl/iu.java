package com.applovin.impl;

import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.applovin.impl.mediation.MediationServiceImpl;
import com.applovin.impl.mediation.ads.a;
import com.facebook.internal.security.OidcSecurityUtil;
import java.net.URL;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final /* synthetic */ class iu implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24537a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f24538b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f24539c;
    public final /* synthetic */ Object d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f24540f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f24541g;

    public /* synthetic */ iu(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i2) {
        this.f24537a = i2;
        this.f24538b = obj;
        this.f24539c = obj2;
        this.d = obj3;
        this.f24540f = obj4;
        this.f24541g = obj5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f24537a;
        Object obj = this.f24541g;
        Object obj2 = this.f24540f;
        Object obj3 = this.f24539c;
        Object obj4 = this.d;
        Object obj5 = this.f24538b;
        switch (i2) {
            case 0:
                ((ma) obj5).a((String) obj3, (la) obj4, obj2, (JSONObject) obj);
                return;
            case 1:
                ((MediationServiceImpl) obj5).a((ie) obj3, (com.applovin.impl.mediation.g) obj4, (Activity) obj2, (a.InterfaceC0085a) obj);
                return;
            case 2:
                ((y4) obj5).a((View) obj3, (FrameLayout) obj4, (ViewTreeObserver) obj2, (ViewTreeObserver.OnGlobalLayoutListener) obj);
                return;
            default:
                OidcSecurityUtil.a((URL) obj5, (kotlin.jvm.internal.f0) obj4, (String) obj3, (ReentrantLock) obj2, (Condition) obj);
                return;
        }
    }

    public /* synthetic */ iu(URL url, kotlin.jvm.internal.f0 f0Var, String str, ReentrantLock reentrantLock, Condition condition) {
        this.f24537a = 3;
        this.f24538b = url;
        this.d = f0Var;
        this.f24539c = str;
        this.f24540f = reentrantLock;
        this.f24541g = condition;
    }
}
