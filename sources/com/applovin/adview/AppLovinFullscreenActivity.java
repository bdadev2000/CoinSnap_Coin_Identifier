package com.applovin.adview;

import android.R;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.applovin.impl.adview.activity.FullscreenAdService;
import com.applovin.impl.ma;
import com.applovin.impl.p9;
import com.applovin.impl.r;
import com.applovin.impl.s;
import com.applovin.impl.sdk.j;
import com.applovin.impl.sdk.n;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sj;
import com.applovin.impl.t6;
import com.applovin.impl.tb;
import com.applovin.impl.u9;
import com.applovin.impl.uj;
import com.applovin.impl.x1;
import com.applovin.impl.yp;
import com.applovin.impl.z3;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkSettings;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import okhttp3.internal.http2.Http2Connection;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class AppLovinFullscreenActivity extends Activity implements t6 {

    @SuppressLint({"StaticFieldLeak"})
    public static tb parentInterstitialWrapper;

    /* renamed from: a */
    private j f22419a;

    /* renamed from: b */
    private p9 f22420b;

    /* renamed from: c */
    private final AtomicBoolean f22421c = new AtomicBoolean(true);
    private com.applovin.impl.adview.activity.a d;

    /* renamed from: f */
    private b f22422f;

    /* renamed from: g */
    private boolean f22423g;

    /* renamed from: h */
    private x1 f22424h;

    /* renamed from: i */
    private long f22425i;

    /* loaded from: classes3.dex */
    public static class b implements OnBackInvokedCallback {

        /* renamed from: a */
        private final Runnable f22427a;

        public b(Runnable runnable) {
            this.f22427a = runnable;
        }

        public void onBackInvoked() {
            this.f22427a.run();
        }
    }

    public static /* synthetic */ void b(AppLovinFullscreenActivity appLovinFullscreenActivity) {
        appLovinFullscreenActivity.c();
    }

    public void c() {
        p9 p9Var = this.f22420b;
        if (p9Var != null) {
            p9Var.s();
        }
        if (yp.e(getApplicationContext())) {
            super.onBackPressed();
        }
    }

    @Override // com.applovin.impl.t6
    public void dismiss() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (z3.l() && this.f22422f != null) {
            onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            onBackInvokedDispatcher.unregisterOnBackInvokedCallback(this.f22422f);
            this.f22422f = null;
        }
        p9 p9Var = this.f22420b;
        if (p9Var != null) {
            p9Var.f();
        } else {
            finish();
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.activityOnTouch(g.f30048a, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        c();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NonNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
        p9 p9Var = this.f22420b;
        if (p9Var != null) {
            p9Var.a(configuration);
        }
    }

    @Override // android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        super.onCreate(bundle);
        if (bundle != null && parentInterstitialWrapper == null) {
            n.j("AppLovinFullscreenActivity", "Dismissing ad. Activity was destroyed while in background.");
            dismiss();
            return;
        }
        try {
            requestWindowFeature(1);
        } catch (Throwable th) {
            n.c("AppLovinFullscreenActivity", "Failed to request window feature", th);
        }
        getWindow().setFlags(1024, 1024);
        getWindow().addFlags(Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE);
        getWindow().addFlags(128);
        View findViewById = findViewById(R.id.content);
        findViewById.setBackgroundColor(-16777216);
        String stringExtra = getIntent().getStringExtra("com.applovin.interstitial.sdk_key");
        if (TextUtils.isEmpty(stringExtra)) {
            tb tbVar = parentInterstitialWrapper;
            if (tbVar != null && tbVar.f() != null) {
                tb.a(parentInterstitialWrapper.f(), parentInterstitialWrapper.c(), "Empty SDK key", null, this);
            }
            finish();
            return;
        }
        j a2 = AppLovinSdk.getInstance(stringExtra, new AppLovinSdkSettings(this), this).a();
        this.f22419a = a2;
        this.f22423g = ((Boolean) a2.a(sj.N2)).booleanValue();
        findViewById.setFitsSystemWindows(true);
        r.a(this.f22423g, this);
        if (z3.l() && ((Boolean) this.f22419a.a(sj.c6)).booleanValue()) {
            this.f22422f = new b(new androidx.compose.material.ripple.a(this, 6));
            onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            onBackInvokedDispatcher.registerOnBackInvokedCallback(0, this.f22422f);
        }
        a();
        b();
        tb tbVar2 = parentInterstitialWrapper;
        if (tbVar2 != null) {
            p9.a(tbVar2.f(), parentInterstitialWrapper.b(), parentInterstitialWrapper.c(), parentInterstitialWrapper.d(), parentInterstitialWrapper.h(), this.f22419a, this, new a());
            return;
        }
        Intent intent = new Intent(this, (Class<?>) FullscreenAdService.class);
        com.applovin.impl.adview.activity.a aVar = new com.applovin.impl.adview.activity.a(this, this.f22419a);
        this.d = aVar;
        bindService(intent, aVar, 1);
        if (z3.j()) {
            String str = this.f22419a.g0().getExtraParameters().get("disable_set_data_dir_suffix");
            if (StringUtils.isValidString(str) && Boolean.parseBoolean(str)) {
                return;
            }
            try {
                WebView.setDataDirectorySuffix(String.valueOf(Process.myPid()));
            } catch (Throwable unused) {
            }
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        j jVar = this.f22419a;
        if (jVar != null && ((Boolean) jVar.a(sj.u2)).booleanValue()) {
            this.f22419a.i0().b(uj.L);
            this.f22419a.i0().b(uj.N);
            this.f22419a.i0().b(uj.O);
        }
        if (this.f22424h != null) {
            this.f22419a.i0().b(uj.M);
            this.f22424h.a();
            this.f22424h = null;
        }
        com.applovin.impl.adview.activity.a aVar = this.d;
        if (aVar != null) {
            try {
                unbindService(aVar);
            } catch (Throwable unused) {
            }
        }
        p9 p9Var = this.f22420b;
        if (p9Var != null) {
            if (!p9Var.j()) {
                this.f22420b.f();
            }
            this.f22420b.t();
        }
        parentInterstitialWrapper = null;
        super.onDestroy();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        p9 p9Var = this.f22420b;
        if (p9Var != null) {
            p9Var.a(i2, keyEvent);
        }
        return super.onKeyDown(i2, keyEvent);
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        p9 p9Var = this.f22420b;
        if (p9Var != null) {
            p9Var.u();
        }
    }

    @Override // android.app.Activity
    public void onResume() {
        p9 p9Var;
        try {
            super.onResume();
            if (this.f22421c.get() || (p9Var = this.f22420b) == null) {
                return;
            }
            p9Var.v();
        } catch (IllegalArgumentException e) {
            this.f22419a.J();
            if (n.a()) {
                this.f22419a.J().a("AppLovinFullscreenActivity", "Error was encountered in onResume().", e);
            }
            this.f22419a.E().a("AppLovinFullscreenActivity", "onResume", e);
            dismiss();
        }
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        p9 p9Var = this.f22420b;
        if (p9Var != null) {
            p9Var.w();
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z2) {
        if (this.f22420b != null) {
            if (!this.f22421c.getAndSet(false) || (this.f22420b instanceof u9)) {
                this.f22420b.b(z2);
            }
            if (z2) {
                r.a(this.f22423g, this);
            }
        }
        super.onWindowFocusChanged(z2);
    }

    public void setPresenter(@Nullable p9 p9Var) {
        this.f22420b = p9Var;
    }

    /* loaded from: classes3.dex */
    public class a implements p9.d {
        public a() {
        }

        @Override // com.applovin.impl.p9.d
        public void a(p9 p9Var) {
            AppLovinFullscreenActivity.this.f22420b = p9Var;
            p9Var.y();
        }

        @Override // com.applovin.impl.p9.d
        public void a(String str, Throwable th) {
            tb.a(AppLovinFullscreenActivity.parentInterstitialWrapper.f(), AppLovinFullscreenActivity.parentInterstitialWrapper.c(), str, th, AppLovinFullscreenActivity.this);
        }
    }

    private void b() {
        j jVar = this.f22419a;
        if (jVar == null || !((Boolean) jVar.a(sj.v2)).booleanValue()) {
            return;
        }
        Long l2 = (Long) this.f22419a.a(sj.w2);
        this.f22424h = x1.a(l2.longValue(), true, this.f22419a, new androidx.core.content.res.a(7, this, l2));
    }

    private void a() {
        tb tbVar;
        j jVar = this.f22419a;
        if (jVar == null || !((Boolean) jVar.a(sj.u2)).booleanValue() || (tbVar = parentInterstitialWrapper) == null || tbVar.f() == null) {
            return;
        }
        com.applovin.impl.sdk.ad.b f2 = parentInterstitialWrapper.f();
        List f3 = f2.f();
        if (CollectionUtils.isEmpty(f3)) {
            return;
        }
        s sVar = (s) f3.get(0);
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putStringIfValid(jSONObject, "app_killed_postback_url", sVar.c());
        JsonUtils.putStringIfValid(jSONObject, "app_killed_postback_backup_url", sVar.a());
        this.f22419a.i0().b(uj.N, jSONObject.toString());
        this.f22419a.i0().b(uj.L, Long.valueOf(System.currentTimeMillis()));
        this.f22419a.i0().b(uj.O, CollectionUtils.toJsonString(ma.a(f2), JsonUtils.EMPTY_JSON));
    }

    public /* synthetic */ void a(Long l2) {
        this.f22425i = l2.longValue() + this.f22425i;
        this.f22419a.i0().b(uj.M, Long.valueOf(this.f22425i));
    }
}
