package com.applovin.adview;

import a4.j;
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
import androidx.activity.d;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import com.applovin.impl.adview.activity.FullscreenAdService;
import com.applovin.impl.n9;
import com.applovin.impl.ob;
import com.applovin.impl.oj;
import com.applovin.impl.qj;
import com.applovin.impl.r;
import com.applovin.impl.r6;
import com.applovin.impl.s;
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
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class AppLovinFullscreenActivity extends Activity implements r6 {

    @SuppressLint({"StaticFieldLeak"})
    public static ob parentInterstitialWrapper;
    private k a;

    /* renamed from: b */
    private n9 f3370b;

    /* renamed from: c */
    private final AtomicBoolean f3371c = new AtomicBoolean(true);

    /* renamed from: d */
    private com.applovin.impl.adview.activity.a f3372d;

    /* renamed from: f */
    private b f3373f;

    /* renamed from: g */
    private boolean f3374g;

    /* loaded from: classes.dex */
    public static class b implements OnBackInvokedCallback {
        private final Runnable a;

        public b(Runnable runnable) {
            this.a = runnable;
        }

        @Override // android.window.OnBackInvokedCallback
        public void onBackInvoked() {
            this.a.run();
        }
    }

    public void b() {
        n9 n9Var = this.f3370b;
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
        if (x3.l() && this.f3373f != null) {
            onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            onBackInvokedDispatcher.unregisterOnBackInvokedCallback(this.f3373f);
            this.f3373f = null;
        }
        n9 n9Var = this.f3370b;
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
        n9 n9Var = this.f3370b;
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
        } catch (Throwable th2) {
            t.c("AppLovinFullscreenActivity", "Failed to request window feature", th2);
        }
        getWindow().setFlags(LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY, LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);
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
        k a10 = AppLovinSdk.getInstance(stringExtra, new AppLovinSdkSettings(this), this).a();
        this.a = a10;
        this.f3374g = ((Boolean) a10.a(oj.I2)).booleanValue();
        findViewById.setFitsSystemWindows(true);
        r.a(this.f3374g, this);
        if (x3.l() && ((Boolean) this.a.a(oj.X5)).booleanValue()) {
            this.f3373f = new b(new d(this, 12));
            onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            onBackInvokedDispatcher.registerOnBackInvokedCallback(0, this.f3373f);
        }
        a();
        ob obVar2 = parentInterstitialWrapper;
        if (obVar2 != null) {
            n9.a(obVar2.f(), parentInterstitialWrapper.b(), parentInterstitialWrapper.c(), parentInterstitialWrapper.d(), parentInterstitialWrapper.g(), this.a, this, new a());
            return;
        }
        Intent intent = new Intent(this, (Class<?>) FullscreenAdService.class);
        com.applovin.impl.adview.activity.a aVar = new com.applovin.impl.adview.activity.a(this, this.a);
        this.f3372d = aVar;
        bindService(intent, aVar, 1);
        if (x3.j()) {
            String str = (String) j.b(this.a, "disable_set_data_dir_suffix");
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
        k kVar = this.a;
        if (kVar != null && ((Boolean) kVar.a(oj.f6753s2)).booleanValue()) {
            this.a.i0().b(qj.M);
            this.a.i0().b(qj.N);
        }
        com.applovin.impl.adview.activity.a aVar = this.f3372d;
        if (aVar != null) {
            try {
                unbindService(aVar);
            } catch (Throwable unused) {
            }
        }
        n9 n9Var = this.f3370b;
        if (n9Var != null) {
            if (n9Var.B()) {
                parentInterstitialWrapper.i();
            }
            if (!this.f3370b.k()) {
                this.f3370b.f();
            }
            this.f3370b.v();
        }
        parentInterstitialWrapper = null;
        super.onDestroy();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        n9 n9Var = this.f3370b;
        if (n9Var != null) {
            n9Var.a(i10, keyEvent);
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        n9 n9Var = this.f3370b;
        if (n9Var != null) {
            n9Var.w();
        }
    }

    @Override // android.app.Activity
    public void onResume() {
        n9 n9Var;
        try {
            super.onResume();
            if (!this.f3371c.get() && (n9Var = this.f3370b) != null) {
                n9Var.x();
            }
        } catch (IllegalArgumentException e2) {
            this.a.L();
            if (t.a()) {
                this.a.L().a("AppLovinFullscreenActivity", "Error was encountered in onResume().", e2);
            }
            this.a.B().a("AppLovinFullscreenActivity", "onResume", e2);
            dismiss();
        }
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        n9 n9Var = this.f3370b;
        if (n9Var != null) {
            n9Var.y();
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z10) {
        if (this.f3370b != null) {
            if (!this.f3371c.getAndSet(false) || (this.f3370b instanceof s9)) {
                this.f3370b.c(z10);
            }
            if (z10) {
                r.a(this.f3374g, this);
            }
        }
        super.onWindowFocusChanged(z10);
    }

    public void setPresenter(n9 n9Var) {
        this.f3370b = n9Var;
    }

    /* loaded from: classes.dex */
    public class a implements n9.d {
        public a() {
        }

        @Override // com.applovin.impl.n9.d
        public void a(n9 n9Var) {
            AppLovinFullscreenActivity.this.f3370b = n9Var;
            n9Var.A();
        }

        @Override // com.applovin.impl.n9.d
        public void a(String str, Throwable th2) {
            ob.a(AppLovinFullscreenActivity.parentInterstitialWrapper.f(), AppLovinFullscreenActivity.parentInterstitialWrapper.c(), str, th2, AppLovinFullscreenActivity.this);
        }
    }

    private void a() {
        ob obVar;
        if (!((Boolean) this.a.a(oj.f6753s2)).booleanValue() || (obVar = parentInterstitialWrapper) == null || obVar.f() == null) {
            return;
        }
        List g10 = parentInterstitialWrapper.f().g();
        if (CollectionUtils.isEmpty(g10)) {
            return;
        }
        s sVar = (s) g10.get(0);
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putStringIfValid(jSONObject, "app_killed_postback_url", sVar.c());
        JsonUtils.putStringIfValid(jSONObject, "app_killed_postback_backup_url", sVar.a());
        this.a.i0().b(qj.N, jSONObject.toString());
        this.a.i0().b(qj.M, Long.valueOf(System.currentTimeMillis()));
    }
}
