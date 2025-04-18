package com.applovin.impl.sdk;

import android.app.Activity;
import android.content.Intent;
import android.webkit.WebView;
import com.applovin.impl.e4;
import com.applovin.impl.sdk.h;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sj;
import com.applovin.impl.uu;
import com.applovin.impl.yp;
import com.applovin.sdk.AppLovinPrivacySettings;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.AppLovinUserService;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.internal.partials.AppLovinNetworkBridge;
import com.safedk.android.utils.Logger;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public class i implements AppLovinWebViewActivity.EventListener, h.a {

    /* renamed from: h */
    private static final AtomicBoolean f26626h = new AtomicBoolean();

    /* renamed from: i */
    private static WeakReference f26627i;

    /* renamed from: a */
    private final j f26628a;

    /* renamed from: b */
    private final n f26629b;

    /* renamed from: c */
    private AppLovinUserService.OnConsentDialogDismissListener f26630c;
    private h d;
    private WeakReference e;

    /* renamed from: f */
    private com.applovin.impl.p f26631f;

    /* renamed from: g */
    private AtomicBoolean f26632g = new AtomicBoolean();

    /* loaded from: classes2.dex */
    public class a extends com.applovin.impl.p {
        public a() {
        }

        @Override // com.applovin.impl.p, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            i.this.e = new WeakReference(activity);
        }
    }

    /* loaded from: classes2.dex */
    public class b extends com.applovin.impl.p {
        public b() {
        }

        @Override // com.applovin.impl.p, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            if (activity instanceof AppLovinWebViewActivity) {
                if (!i.this.f() || i.f26627i.get() != activity) {
                    AppLovinWebViewActivity appLovinWebViewActivity = (AppLovinWebViewActivity) activity;
                    WeakReference unused = i.f26627i = new WeakReference(appLovinWebViewActivity);
                    appLovinWebViewActivity.loadUrl((String) i.this.f26628a.a(sj.f26930k0), i.this);
                }
                i.f26626h.set(false);
            }
        }
    }

    public i(j jVar) {
        this.e = new WeakReference(null);
        this.f26628a = jVar;
        this.f26629b = jVar.J();
        if (jVar.G() != null) {
            this.e = new WeakReference(jVar.G());
        }
        j.a(j.l()).a(new a());
        this.d = new h(this, jVar);
    }

    private void e() {
        this.f26628a.e().b(this.f26631f);
        if (f()) {
            AppLovinWebViewActivity appLovinWebViewActivity = (AppLovinWebViewActivity) f26627i.get();
            f26627i = null;
            if (appLovinWebViewActivity != null) {
                appLovinWebViewActivity.finish();
                AppLovinUserService.OnConsentDialogDismissListener onConsentDialogDismissListener = this.f26630c;
                if (onConsentDialogDismissListener != null) {
                    onConsentDialogDismissListener.onDismiss();
                    this.f26630c = null;
                }
            }
        }
    }

    public static void safedk_Activity_startActivity_9d898b58165fa4ba0e12c3900a2b8533(Activity p02, Intent p12) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V");
        if (p12 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p12, com.safedk.android.utils.g.f30048a);
        p02.startActivity(p12);
    }

    public boolean f() {
        WeakReference weakReference = f26627i;
        return (weakReference == null || weakReference.get() == null) ? false : true;
    }

    public void g() {
        if (this.f26632g.getAndSet(true)) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new androidx.core.content.res.a(14, this, (String) this.f26628a.a(sj.f26930k0)));
    }

    @Override // com.applovin.sdk.AppLovinWebViewActivity.EventListener
    public void onReceivedEvent(String str) {
        if ("accepted".equalsIgnoreCase(str)) {
            AppLovinPrivacySettings.setHasUserConsent(true, j.l());
            e();
        } else if ("rejected".equalsIgnoreCase(str)) {
            AppLovinPrivacySettings.setHasUserConsent(false, j.l());
            a(((Boolean) this.f26628a.a(sj.f26938n0)).booleanValue(), ((Long) this.f26628a.a(sj.f26951s0)).longValue());
        } else if ("closed".equalsIgnoreCase(str)) {
            a(((Boolean) this.f26628a.a(sj.f26941o0)).booleanValue(), ((Long) this.f26628a.a(sj.f26953t0)).longValue());
        } else if (AppLovinWebViewActivity.EVENT_DISMISSED_VIA_BACK_BUTTON.equalsIgnoreCase(str)) {
            a(((Boolean) this.f26628a.a(sj.f26944p0)).booleanValue(), ((Long) this.f26628a.a(sj.f26955u0)).longValue());
        }
    }

    public void b(long j2) {
        AppLovinSdkUtils.runOnUiThread(new uu(this, j2, 1));
    }

    @Override // com.applovin.impl.sdk.h.a
    public void a() {
    }

    @Override // com.applovin.impl.sdk.h.a
    public void b() {
        Activity activity = (Activity) this.e.get();
        if (activity != null) {
            AppLovinSdkUtils.runOnUiThreadDelayed(new androidx.core.content.res.a(13, this, activity), ((Long) this.f26628a.a(sj.f26936m0)).longValue());
        }
    }

    public /* synthetic */ void a(String str) {
        WebView a2 = yp.a(j.l(), "preloading consent dialog", true);
        if (a2 == null) {
            return;
        }
        AppLovinNetworkBridge.webviewLoadUrl(a2, str);
    }

    public void a(Activity activity, AppLovinUserService.OnConsentDialogDismissListener onConsentDialogDismissListener) {
        activity.runOnUiThread(new r(this, 2, onConsentDialogDismissListener, activity));
    }

    public /* synthetic */ void a(AppLovinUserService.OnConsentDialogDismissListener onConsentDialogDismissListener, Activity activity) {
        if (!a(this.f26628a) || f26626h.getAndSet(true)) {
            if (onConsentDialogDismissListener != null) {
                onConsentDialogDismissListener.onDismiss();
                return;
            }
            return;
        }
        this.e = new WeakReference(activity);
        this.f26630c = onConsentDialogDismissListener;
        this.f26631f = new b();
        this.f26628a.e().a(this.f26631f);
        Intent intent = new Intent(activity, (Class<?>) AppLovinWebViewActivity.class);
        intent.putExtra("sdk_key", this.f26628a.b0());
        intent.putExtra(AppLovinWebViewActivity.INTENT_EXTRA_KEY_IMMERSIVE_MODE_ON, (Serializable) this.f26628a.a(sj.f26933l0));
        safedk_Activity_startActivity_9d898b58165fa4ba0e12c3900a2b8533(activity, intent);
    }

    public /* synthetic */ void a(long j2) {
        if (n.a()) {
            this.f26629b.a("ConsentDialogManager", "Scheduling repeating consent alert");
        }
        this.d.a(j2, this.f26628a, this);
    }

    private void a(boolean z2, long j2) {
        e();
        if (z2) {
            b(j2);
        }
    }

    public /* synthetic */ void a(Activity activity) {
        a(activity, (AppLovinUserService.OnConsentDialogDismissListener) null);
    }

    private boolean a(j jVar) {
        if (f()) {
            n.h("AppLovinSdk", "Consent dialog already showing");
            return false;
        }
        if (!e4.a(j.l())) {
            n.h("AppLovinSdk", "No internet available, skip showing of consent dialog");
            return false;
        }
        if (!((Boolean) jVar.a(sj.f26927j0)).booleanValue()) {
            if (n.a()) {
                this.f26629b.b("ConsentDialogManager", "Blocked publisher from showing consent dialog");
            }
            return false;
        }
        if (StringUtils.isValidString((String) jVar.a(sj.f26930k0))) {
            return true;
        }
        if (n.a()) {
            this.f26629b.b("ConsentDialogManager", "AdServer returned empty consent dialog URL");
        }
        return false;
    }
}
