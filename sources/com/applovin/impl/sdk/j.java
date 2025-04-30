package com.applovin.impl.sdk;

import android.app.Activity;
import android.content.Intent;
import android.webkit.WebView;
import com.applovin.impl.AbstractC0734p;
import com.applovin.impl.G1;
import com.applovin.impl.c4;
import com.applovin.impl.oj;
import com.applovin.impl.sdk.i;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.zp;
import com.applovin.sdk.AppLovinPrivacySettings;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.AppLovinUserService;
import com.applovin.sdk.AppLovinWebViewActivity;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class j implements AppLovinWebViewActivity.EventListener, i.a {

    /* renamed from: h */
    private static final AtomicBoolean f10822h = new AtomicBoolean();

    /* renamed from: i */
    private static WeakReference f10823i;

    /* renamed from: a */
    private final k f10824a;
    private final t b;

    /* renamed from: c */
    private AppLovinUserService.OnConsentDialogDismissListener f10825c;

    /* renamed from: d */
    private i f10826d;

    /* renamed from: e */
    private WeakReference f10827e;

    /* renamed from: f */
    private AbstractC0734p f10828f;

    /* renamed from: g */
    private AtomicBoolean f10829g = new AtomicBoolean();

    /* loaded from: classes.dex */
    public class a extends AbstractC0734p {
        public a() {
        }

        @Override // com.applovin.impl.AbstractC0734p, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            j.this.f10827e = new WeakReference(activity);
        }
    }

    /* loaded from: classes.dex */
    public class b extends AbstractC0734p {
        public b() {
        }

        @Override // com.applovin.impl.AbstractC0734p, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            if (activity instanceof AppLovinWebViewActivity) {
                if (!j.this.f() || j.f10823i.get() != activity) {
                    AppLovinWebViewActivity appLovinWebViewActivity = (AppLovinWebViewActivity) activity;
                    WeakReference unused = j.f10823i = new WeakReference(appLovinWebViewActivity);
                    appLovinWebViewActivity.loadUrl((String) j.this.f10824a.a(oj.f9771h0), j.this);
                }
                j.f10822h.set(false);
            }
        }
    }

    public j(k kVar) {
        this.f10827e = new WeakReference(null);
        this.f10824a = kVar;
        this.b = kVar.L();
        if (kVar.H() != null) {
            this.f10827e = new WeakReference(kVar.H());
        }
        k.a(k.k()).a(new a());
        this.f10826d = new i(this, kVar);
    }

    private void e() {
        this.f10824a.e().b(this.f10828f);
        if (f()) {
            AppLovinWebViewActivity appLovinWebViewActivity = (AppLovinWebViewActivity) f10823i.get();
            f10823i = null;
            if (appLovinWebViewActivity != null) {
                appLovinWebViewActivity.finish();
                AppLovinUserService.OnConsentDialogDismissListener onConsentDialogDismissListener = this.f10825c;
                if (onConsentDialogDismissListener != null) {
                    onConsentDialogDismissListener.onDismiss();
                    this.f10825c = null;
                }
            }
        }
    }

    public boolean f() {
        WeakReference weakReference = f10823i;
        if (weakReference != null && weakReference.get() != null) {
            return true;
        }
        return false;
    }

    public void g() {
        if (this.f10829g.getAndSet(true)) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new A4.d(15, this, (String) this.f10824a.a(oj.f9771h0)));
    }

    @Override // com.applovin.sdk.AppLovinWebViewActivity.EventListener
    public void onReceivedEvent(String str) {
        if ("accepted".equalsIgnoreCase(str)) {
            AppLovinPrivacySettings.setHasUserConsent(true, k.k());
            e();
        } else if ("rejected".equalsIgnoreCase(str)) {
            AppLovinPrivacySettings.setHasUserConsent(false, k.k());
            a(((Boolean) this.f10824a.a(oj.f9793k0)).booleanValue(), ((Long) this.f10824a.a(oj.f9823p0)).longValue());
        } else if ("closed".equalsIgnoreCase(str)) {
            a(((Boolean) this.f10824a.a(oj.f9799l0)).booleanValue(), ((Long) this.f10824a.a(oj.f9830q0)).longValue());
        } else if (AppLovinWebViewActivity.EVENT_DISMISSED_VIA_BACK_BUTTON.equalsIgnoreCase(str)) {
            a(((Boolean) this.f10824a.a(oj.f9803m0)).booleanValue(), ((Long) this.f10824a.a(oj.f9838r0)).longValue());
        }
    }

    @Override // com.applovin.impl.sdk.i.a
    public void a() {
    }

    public void b(long j7) {
        AppLovinSdkUtils.runOnUiThread(new G1(this, j7, 1));
    }

    @Override // com.applovin.impl.sdk.i.a
    public void b() {
        Activity activity = (Activity) this.f10827e.get();
        if (activity != null) {
            AppLovinSdkUtils.runOnUiThreadDelayed(new A4.d(14, this, activity), ((Long) this.f10824a.a(oj.f9785j0)).longValue());
        }
    }

    public /* synthetic */ void a(String str) {
        WebView a6 = zp.a(k.k(), "preloading consent dialog", true);
        if (a6 == null) {
            return;
        }
        a6.loadUrl(str);
    }

    public void a(Activity activity, AppLovinUserService.OnConsentDialogDismissListener onConsentDialogDismissListener) {
        activity.runOnUiThread(new y(this, onConsentDialogDismissListener, activity, 2));
    }

    public /* synthetic */ void a(AppLovinUserService.OnConsentDialogDismissListener onConsentDialogDismissListener, Activity activity) {
        if (!a(this.f10824a) || f10822h.getAndSet(true)) {
            if (onConsentDialogDismissListener != null) {
                onConsentDialogDismissListener.onDismiss();
                return;
            }
            return;
        }
        this.f10827e = new WeakReference(activity);
        this.f10825c = onConsentDialogDismissListener;
        this.f10828f = new b();
        this.f10824a.e().a(this.f10828f);
        Intent intent = new Intent(activity, (Class<?>) AppLovinWebViewActivity.class);
        intent.putExtra(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f10824a.d0());
        intent.putExtra(AppLovinWebViewActivity.INTENT_EXTRA_KEY_IMMERSIVE_MODE_ON, (Serializable) this.f10824a.a(oj.f9777i0));
        activity.startActivity(intent);
    }

    public /* synthetic */ void a(long j7) {
        if (t.a()) {
            this.b.a("ConsentDialogManager", "Scheduling repeating consent alert");
        }
        this.f10826d.a(j7, this.f10824a, this);
    }

    private void a(boolean z8, long j7) {
        e();
        if (z8) {
            b(j7);
        }
    }

    public /* synthetic */ void a(Activity activity) {
        a(activity, (AppLovinUserService.OnConsentDialogDismissListener) null);
    }

    private boolean a(k kVar) {
        if (f()) {
            t.h("AppLovinSdk", "Consent dialog already showing");
            return false;
        }
        if (!c4.a(k.k())) {
            t.h("AppLovinSdk", "No internet available, skip showing of consent dialog");
            return false;
        }
        if (!((Boolean) kVar.a(oj.f9763g0)).booleanValue()) {
            if (t.a()) {
                this.b.b("ConsentDialogManager", "Blocked publisher from showing consent dialog");
            }
            return false;
        }
        if (StringUtils.isValidString((String) kVar.a(oj.f9771h0))) {
            return true;
        }
        if (t.a()) {
            this.b.b("ConsentDialogManager", "AdServer returned empty consent dialog URL");
        }
        return false;
    }
}
