package com.applovin.adview;

import Q7.n0;
import android.R;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import com.applovin.impl.C0745s;
import com.applovin.impl.adview.activity.FullscreenAdService;
import com.applovin.impl.n9;
import com.applovin.impl.ob;
import com.applovin.impl.oj;
import com.applovin.impl.qj;
import com.applovin.impl.r;
import com.applovin.impl.r6;
import com.applovin.impl.s9;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.t;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.x3;
import com.applovin.impl.zp;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkSettings;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class AppLovinFullscreenActivity extends Activity implements r6 {

    @SuppressLint({"StaticFieldLeak"})
    public static ob parentInterstitialWrapper;

    /* renamed from: a */
    private k f6089a;
    private n9 b;

    /* renamed from: c */
    private final AtomicBoolean f6090c = new AtomicBoolean(true);

    /* renamed from: d */
    private com.applovin.impl.adview.activity.a f6091d;

    /* renamed from: f */
    private b f6092f;

    /* renamed from: g */
    private boolean f6093g;

    /* loaded from: classes.dex */
    public static class b implements OnBackInvokedCallback {

        /* renamed from: a */
        private final Runnable f6095a;

        public b(Runnable runnable) {
            this.f6095a = runnable;
        }

        public void onBackInvoked() {
            this.f6095a.run();
        }
    }

    public void b() {
        n9 n9Var = this.b;
        if (n9Var != null) {
            n9Var.u();
        }
        if (zp.e(getApplicationContext())) {
            super.onBackPressed();
        }
    }

    @Override // com.applovin.impl.r6
    public void dismiss() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (x3.l() && this.f6092f != null) {
            onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            onBackInvokedDispatcher.unregisterOnBackInvokedCallback(this.f6092f);
            this.f6092f = null;
        }
        n9 n9Var = this.b;
        if (n9Var != null) {
            n9Var.f();
        } else {
            finish();
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        b();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NonNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
        n9 n9Var = this.b;
        if (n9Var != null) {
            n9Var.a(configuration);
        }
    }

    @Override // android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        super.onCreate(bundle);
        if (bundle != null && parentInterstitialWrapper == null) {
            t.j("AppLovinFullscreenActivity", "Dismissing ad. Activity was destroyed while in background.");
            dismiss();
            return;
        }
        try {
            requestWindowFeature(1);
        } catch (Throwable th) {
            t.c("AppLovinFullscreenActivity", "Failed to request window feature", th);
        }
        getWindow().setFlags(1024, 1024);
        getWindow().addFlags(16777216);
        getWindow().addFlags(128);
        View findViewById = findViewById(R.id.content);
        findViewById.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        String stringExtra = getIntent().getStringExtra("com.applovin.interstitial.sdk_key");
        if (TextUtils.isEmpty(stringExtra)) {
            ob obVar = parentInterstitialWrapper;
            if (obVar != null && obVar.f() != null) {
                ob.a(parentInterstitialWrapper.f(), parentInterstitialWrapper.c(), "Empty SDK key", null, this);
            }
            finish();
            return;
        }
        k a6 = AppLovinSdk.getInstance(stringExtra, new AppLovinSdkSettings(this), this).a();
        this.f6089a = a6;
        this.f6093g = ((Boolean) a6.a(oj.f9607I2)).booleanValue();
        findViewById.setFitsSystemWindows(true);
        r.a(this.f6093g, this);
        if (x3.l() && ((Boolean) this.f6089a.a(oj.f9707X5)).booleanValue()) {
            this.f6092f = new b(new D3.b(this, 18));
            onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            onBackInvokedDispatcher.registerOnBackInvokedCallback(0, this.f6092f);
        }
        a();
        ob obVar2 = parentInterstitialWrapper;
        if (obVar2 != null) {
            n9.a(obVar2.f(), parentInterstitialWrapper.b(), parentInterstitialWrapper.c(), parentInterstitialWrapper.d(), parentInterstitialWrapper.g(), this.f6089a, this, new a());
            return;
        }
        Intent intent = new Intent(this, (Class<?>) FullscreenAdService.class);
        com.applovin.impl.adview.activity.a aVar = new com.applovin.impl.adview.activity.a(this, this.f6089a);
        this.f6091d = aVar;
        bindService(intent, aVar, 1);
        if (x3.j()) {
            String str = (String) n0.d(this.f6089a, "disable_set_data_dir_suffix");
            if (!StringUtils.isValidString(str) || !Boolean.parseBoolean(str)) {
                try {
                    WebView.setDataDirectorySuffix(String.valueOf(Process.myPid()));
                } catch (Throwable unused) {
                }
            }
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        k kVar = this.f6089a;
        if (kVar != null && ((Boolean) kVar.a(oj.f9847s2)).booleanValue()) {
            this.f6089a.i0().b(qj.f10364M);
            this.f6089a.i0().b(qj.f10365N);
        }
        com.applovin.impl.adview.activity.a aVar = this.f6091d;
        if (aVar != null) {
            try {
                unbindService(aVar);
            } catch (Throwable unused) {
            }
        }
        n9 n9Var = this.b;
        if (n9Var != null) {
            if (n9Var.B()) {
                parentInterstitialWrapper.i();
            }
            if (!this.b.k()) {
                this.b.f();
            }
            this.b.v();
        }
        parentInterstitialWrapper = null;
        super.onDestroy();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i9, KeyEvent keyEvent) {
        n9 n9Var = this.b;
        if (n9Var != null) {
            n9Var.a(i9, keyEvent);
        }
        return super.onKeyDown(i9, keyEvent);
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        n9 n9Var = this.b;
        if (n9Var != null) {
            n9Var.w();
        }
    }

    @Override // android.app.Activity
    public void onResume() {
        n9 n9Var;
        try {
            super.onResume();
            if (!this.f6090c.get() && (n9Var = this.b) != null) {
                n9Var.x();
            }
        } catch (IllegalArgumentException e4) {
            this.f6089a.L();
            if (t.a()) {
                this.f6089a.L().a("AppLovinFullscreenActivity", "Error was encountered in onResume().", e4);
            }
            this.f6089a.B().a("AppLovinFullscreenActivity", "onResume", e4);
            dismiss();
        }
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        n9 n9Var = this.b;
        if (n9Var != null) {
            n9Var.y();
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z8) {
        if (this.b != null) {
            if (!this.f6090c.getAndSet(false) || (this.b instanceof s9)) {
                this.b.c(z8);
            }
            if (z8) {
                r.a(this.f6093g, this);
            }
        }
        super.onWindowFocusChanged(z8);
    }

    public void setPresenter(n9 n9Var) {
        this.b = n9Var;
    }

    /* loaded from: classes.dex */
    public class a implements n9.d {
        public a() {
        }

        @Override // com.applovin.impl.n9.d
        public void a(n9 n9Var) {
            AppLovinFullscreenActivity.this.b = n9Var;
            n9Var.A();
        }

        @Override // com.applovin.impl.n9.d
        public void a(String str, Throwable th) {
            ob.a(AppLovinFullscreenActivity.parentInterstitialWrapper.f(), AppLovinFullscreenActivity.parentInterstitialWrapper.c(), str, th, AppLovinFullscreenActivity.this);
        }
    }

    private void a() {
        ob obVar;
        if (!((Boolean) this.f6089a.a(oj.f9847s2)).booleanValue() || (obVar = parentInterstitialWrapper) == null || obVar.f() == null) {
            return;
        }
        List g9 = parentInterstitialWrapper.f().g();
        if (CollectionUtils.isEmpty(g9)) {
            return;
        }
        C0745s c0745s = (C0745s) g9.get(0);
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putStringIfValid(jSONObject, "app_killed_postback_url", c0745s.c());
        JsonUtils.putStringIfValid(jSONObject, "app_killed_postback_backup_url", c0745s.a());
        this.f6089a.i0().b(qj.f10365N, jSONObject.toString());
        this.f6089a.i0().b(qj.f10364M, Long.valueOf(System.currentTimeMillis()));
    }
}
