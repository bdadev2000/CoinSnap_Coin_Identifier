package com.applovin.impl.sdk;

import android.app.Activity;
import android.content.Intent;
import android.webkit.WebView;
import com.applovin.impl.c4;
import com.applovin.impl.oj;
import com.applovin.impl.qu;
import com.applovin.impl.sdk.i;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.zp;
import com.applovin.sdk.AppLovinPrivacySettings;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.AppLovinUserService;
import com.applovin.sdk.AppLovinWebViewActivity;
import h.o0;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class j implements AppLovinWebViewActivity.EventListener, i.a {

    /* renamed from: h */
    private static final AtomicBoolean f7698h = new AtomicBoolean();

    /* renamed from: i */
    private static WeakReference f7699i;
    private final k a;

    /* renamed from: b */
    private final t f7700b;

    /* renamed from: c */
    private AppLovinUserService.OnConsentDialogDismissListener f7701c;

    /* renamed from: d */
    private i f7702d;

    /* renamed from: e */
    private WeakReference f7703e;

    /* renamed from: f */
    private com.applovin.impl.p f7704f;

    /* renamed from: g */
    private AtomicBoolean f7705g = new AtomicBoolean();

    /* loaded from: classes.dex */
    public class a extends com.applovin.impl.p {
        public a() {
        }

        @Override // com.applovin.impl.p, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            j.this.f7703e = new WeakReference(activity);
        }
    }

    /* loaded from: classes.dex */
    public class b extends com.applovin.impl.p {
        public b() {
        }

        @Override // com.applovin.impl.p, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            if (activity instanceof AppLovinWebViewActivity) {
                if (!j.this.f() || j.f7699i.get() != activity) {
                    AppLovinWebViewActivity appLovinWebViewActivity = (AppLovinWebViewActivity) activity;
                    WeakReference unused = j.f7699i = new WeakReference(appLovinWebViewActivity);
                    appLovinWebViewActivity.loadUrl((String) j.this.a.a(oj.f6665h0), j.this);
                }
                j.f7698h.set(false);
            }
        }
    }

    public j(k kVar) {
        this.f7703e = new WeakReference(null);
        this.a = kVar;
        this.f7700b = kVar.L();
        if (kVar.H() != null) {
            this.f7703e = new WeakReference(kVar.H());
        }
        k.a(k.k()).a(new a());
        this.f7702d = new i(this, kVar);
    }

    private void e() {
        this.a.e().b(this.f7704f);
        if (f()) {
            AppLovinWebViewActivity appLovinWebViewActivity = (AppLovinWebViewActivity) f7699i.get();
            f7699i = null;
            if (appLovinWebViewActivity != null) {
                appLovinWebViewActivity.finish();
                AppLovinUserService.OnConsentDialogDismissListener onConsentDialogDismissListener = this.f7701c;
                if (onConsentDialogDismissListener != null) {
                    onConsentDialogDismissListener.onDismiss();
                    this.f7701c = null;
                }
            }
        }
    }

    public boolean f() {
        WeakReference weakReference = f7699i;
        return (weakReference == null || weakReference.get() == null) ? false : true;
    }

    public void g() {
        if (this.f7705g.getAndSet(true)) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new o0(15, this, (String) this.a.a(oj.f6665h0)));
    }

    @Override // com.applovin.sdk.AppLovinWebViewActivity.EventListener
    public void onReceivedEvent(String str) {
        if ("accepted".equalsIgnoreCase(str)) {
            AppLovinPrivacySettings.setHasUserConsent(true, k.k());
            e();
        } else if ("rejected".equalsIgnoreCase(str)) {
            AppLovinPrivacySettings.setHasUserConsent(false, k.k());
            a(((Boolean) this.a.a(oj.f6688k0)).booleanValue(), ((Long) this.a.a(oj.f6728p0)).longValue());
        } else if ("closed".equalsIgnoreCase(str)) {
            a(((Boolean) this.a.a(oj.f6696l0)).booleanValue(), ((Long) this.a.a(oj.f6736q0)).longValue());
        } else if (AppLovinWebViewActivity.EVENT_DISMISSED_VIA_BACK_BUTTON.equalsIgnoreCase(str)) {
            a(((Boolean) this.a.a(oj.f6704m0)).booleanValue(), ((Long) this.a.a(oj.f6744r0)).longValue());
        }
    }

    @Override // com.applovin.impl.sdk.i.a
    public void a() {
    }

    public void b(long j3) {
        AppLovinSdkUtils.runOnUiThread(new qu(this, j3, 1));
    }

    @Override // com.applovin.impl.sdk.i.a
    public void b() {
        Activity activity = (Activity) this.f7703e.get();
        if (activity != null) {
            AppLovinSdkUtils.runOnUiThreadDelayed(new o0(16, this, activity), ((Long) this.a.a(oj.f6681j0)).longValue());
        }
    }

    public /* synthetic */ void a(String str) {
        WebView a10 = zp.a(k.k(), "preloading consent dialog", true);
        if (a10 == null) {
            return;
        }
        a10.loadUrl(str);
    }

    public void a(Activity activity, AppLovinUserService.OnConsentDialogDismissListener onConsentDialogDismissListener) {
        activity.runOnUiThread(new y(2, this, onConsentDialogDismissListener, activity));
    }

    public /* synthetic */ void a(AppLovinUserService.OnConsentDialogDismissListener onConsentDialogDismissListener, Activity activity) {
        if (!a(this.a) || f7698h.getAndSet(true)) {
            if (onConsentDialogDismissListener != null) {
                onConsentDialogDismissListener.onDismiss();
                return;
            }
            return;
        }
        this.f7703e = new WeakReference(activity);
        this.f7701c = onConsentDialogDismissListener;
        this.f7704f = new b();
        this.a.e().a(this.f7704f);
        Intent intent = new Intent(activity, (Class<?>) AppLovinWebViewActivity.class);
        intent.putExtra(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.a.d0());
        intent.putExtra(AppLovinWebViewActivity.INTENT_EXTRA_KEY_IMMERSIVE_MODE_ON, (Serializable) this.a.a(oj.f6673i0));
        activity.startActivity(intent);
    }

    public /* synthetic */ void a(long j3) {
        if (t.a()) {
            this.f7700b.a("ConsentDialogManager", "Scheduling repeating consent alert");
        }
        this.f7702d.a(j3, this.a, this);
    }

    private void a(boolean z10, long j3) {
        e();
        if (z10) {
            b(j3);
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
        if (!((Boolean) kVar.a(oj.f6657g0)).booleanValue()) {
            if (t.a()) {
                this.f7700b.b("ConsentDialogManager", "Blocked publisher from showing consent dialog");
            }
            return false;
        }
        if (StringUtils.isValidString((String) kVar.a(oj.f6665h0))) {
            return true;
        }
        if (t.a()) {
            this.f7700b.b("ConsentDialogManager", "AdServer returned empty consent dialog URL");
        }
        return false;
    }
}
