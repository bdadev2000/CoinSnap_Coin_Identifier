package mf;

import android.R;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBinderMapperImpl;
import h.m;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import n0.w2;
import x5.i;

/* loaded from: classes4.dex */
public abstract class a extends m {

    /* renamed from: c, reason: collision with root package name */
    public androidx.databinding.e f22232c;

    /* renamed from: d, reason: collision with root package name */
    public SharedPreferences f22233d;

    public abstract int m();

    public final androidx.databinding.e n() {
        androidx.databinding.e eVar = this.f22232c;
        if (eVar != null) {
            return eVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        return null;
    }

    public final SharedPreferences o() {
        SharedPreferences sharedPreferences = this.f22233d;
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        Intrinsics.throwUninitializedPropertyAccessException("prefs");
        return null;
    }

    @Override // h.m, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        p();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.p, android.app.Activity
    public final void onCreate(Bundle bundle) {
        boolean equals;
        super.onCreate(bundle);
        Intrinsics.checkNotNullParameter(this, "context");
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        Intrinsics.checkNotNullExpressionValue(defaultSharedPreferences, "getDefaultSharedPreferences(...)");
        Intrinsics.checkNotNullParameter(defaultSharedPreferences, "<set-?>");
        this.f22233d = defaultSharedPreferences;
        String string = o().getString("KEY_LANGUAGE", "");
        if (Intrinsics.areEqual(string, "")) {
            Configuration configuration = new Configuration();
            Locale locale = Locale.getDefault();
            Locale.setDefault(locale);
            configuration.locale = locale;
            getResources().updateConfiguration(configuration, getResources().getDisplayMetrics());
        } else {
            equals = StringsKt__StringsJVMKt.equals(string, "", true);
            if (!equals) {
                Locale locale2 = new Locale(string);
                Locale.setDefault(locale2);
                Configuration configuration2 = new Configuration();
                configuration2.locale = locale2;
                getResources().updateConfiguration(configuration2, getResources().getDisplayMetrics());
            }
        }
        int m10 = m();
        DataBinderMapperImpl dataBinderMapperImpl = androidx.databinding.b.a;
        setContentView(m10);
        androidx.databinding.e b3 = androidx.databinding.b.b((ViewGroup) getWindow().getDecorView().findViewById(R.id.content), 0, m10);
        Intrinsics.checkNotNullExpressionValue(b3, "setContentView(...)");
        Intrinsics.checkNotNullParameter(b3, "<set-?>");
        this.f22232c = b3;
        Log.d("BaseActivity", "onCreate: name Class: ".concat(getClass().getSimpleName()));
        xg.b bVar = xg.b.a;
        String screenName = getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(screenName, "getSimpleName(...)");
        Intrinsics.checkNotNullParameter(screenName, "screenName");
        bb.a.a().a(null, screenName);
        if (getIntent().getStringExtra("key_tracking_screen_from") != null) {
            String fromScreen = String.valueOf(getIntent().getStringExtra("key_tracking_screen_from"));
            String toScreen = getClass().getSimpleName();
            Intrinsics.checkNotNullExpressionValue(toScreen, "getSimpleName(...)");
            Intrinsics.checkNotNullParameter(fromScreen, "fromActivity");
            Intrinsics.checkNotNullParameter(toScreen, "toActivity");
            Intrinsics.checkNotNullParameter(fromScreen, "fromScreen");
            Intrinsics.checkNotNullParameter(toScreen, "toScreen");
            Log.d("ITGTrackingHelper", "fromScreenToScreen: " + fromScreen + " to " + toScreen);
            bb.a.a().a(null, fromScreen + '_' + toScreen);
        }
        n().M(this);
        q();
        s();
        r();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (i.l()) {
            setTheme(com.plantcare.ai.identifier.plantid.R.style.Theme_Main_ShowNav);
            return;
        }
        if (i.k()) {
            if (i.b()) {
                setTheme(com.plantcare.ai.identifier.plantid.R.style.Theme_Main_ShowNav);
                return;
            } else {
                p();
                setTheme(com.plantcare.ai.identifier.plantid.R.style.Theme_Main);
                return;
            }
        }
        p();
        setTheme(com.plantcare.ai.identifier.plantid.R.style.Theme_Main);
    }

    public final void p() {
        if (Build.VERSION.SDK_INT >= 30) {
            com.bumptech.glide.e.R(getWindow(), false);
            ka.e eVar = new w2(getWindow(), getWindow().getDecorView()).a;
            eVar.m();
            eVar.u();
            return;
        }
        View decorView = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "getDecorView(...)");
        decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 1 | 2 | 2048 | 4096);
    }

    public void q() {
    }

    public void r() {
    }

    public void s() {
    }
}
