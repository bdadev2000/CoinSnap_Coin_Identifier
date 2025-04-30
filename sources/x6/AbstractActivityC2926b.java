package x6;

import G7.j;
import O7.o;
import T.H0;
import T.K0;
import a7.C0399a;
import android.R;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.databinding.DataBinderMapperImpl;
import d0.AbstractC2155b;
import d0.AbstractC2158e;
import java.util.Locale;
import k.AbstractActivityC2417f;
import m4.AbstractC2466a;

/* renamed from: x6.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractActivityC2926b extends AbstractActivityC2417f {

    /* renamed from: c, reason: collision with root package name */
    public AbstractC2158e f24237c;

    /* renamed from: d, reason: collision with root package name */
    public SharedPreferences f24238d;

    public static boolean l() {
        a7.b bVar = a7.b.f4076f;
        if (bVar != null) {
            return ((SharedPreferences) bVar.f4078d).getBoolean("FIRST_OPEN_APP", false);
        }
        throw new IllegalStateException(a7.b.class.getSimpleName().concat(" is not initialized, call initializeInstance(..) method first."));
    }

    public final AbstractC2158e k() {
        AbstractC2158e abstractC2158e = this.f24237c;
        if (abstractC2158e != null) {
            return abstractC2158e;
        }
        j.k("binding");
        throw null;
    }

    public abstract int m();

    public final SharedPreferences n() {
        SharedPreferences sharedPreferences = this.f24238d;
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        j.k("prefs");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void o() {
        H0 h02;
        if (Build.VERSION.SDK_INT >= 30) {
            com.bumptech.glide.c.S(getWindow(), false);
            Window window = getWindow();
            E1.c cVar = new E1.c(getWindow().getDecorView());
            int i9 = Build.VERSION.SDK_INT;
            if (i9 >= 30) {
                K0 k02 = new K0(I3.b.l(window), cVar);
                k02.f2868n = window;
                h02 = k02;
            } else if (i9 >= 26) {
                h02 = new H0(window, cVar);
            } else {
                h02 = new H0(window, cVar);
            }
            h02.O(7);
            h02.X();
            return;
        }
        View decorView = getWindow().getDecorView();
        j.d(decorView, "getDecorView(...)");
        decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 6147);
    }

    @Override // k.AbstractActivityC2417f, f.l, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        j.e(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        o();
    }

    @Override // androidx.fragment.app.FragmentActivity, f.l, androidx.core.app.AbstractActivityC0412m, android.app.Activity
    public void onCreate(Bundle bundle) {
        AbstractC2158e c9;
        super.onCreate(bundle);
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        j.d(defaultSharedPreferences, "getDefaultSharedPreferences(...)");
        this.f24238d = defaultSharedPreferences;
        String string = n().getString("KEY_LANGUAGE", "");
        if (j.a(string, "")) {
            Configuration configuration = new Configuration();
            Locale locale = Locale.getDefault();
            Locale.setDefault(locale);
            configuration.locale = locale;
            getResources().updateConfiguration(configuration, getResources().getDisplayMetrics());
        } else if (!o.y(string, "")) {
            Locale locale2 = new Locale(string);
            Locale.setDefault(locale2);
            Configuration configuration2 = new Configuration();
            configuration2.locale = locale2;
            getResources().updateConfiguration(configuration2, getResources().getDisplayMetrics());
        }
        int m = m();
        DataBinderMapperImpl dataBinderMapperImpl = AbstractC2155b.f19779a;
        setContentView(m);
        ViewGroup viewGroup = (ViewGroup) getWindow().getDecorView().findViewById(R.id.content);
        int childCount = viewGroup.getChildCount();
        int i9 = childCount + 0;
        DataBinderMapperImpl dataBinderMapperImpl2 = AbstractC2155b.f19779a;
        if (i9 == 1) {
            c9 = dataBinderMapperImpl2.b(viewGroup.getChildAt(childCount - 1), m);
        } else {
            View[] viewArr = new View[i9];
            for (int i10 = 0; i10 < i9; i10++) {
                viewArr[i10] = viewGroup.getChildAt(i10 + 0);
            }
            c9 = dataBinderMapperImpl2.c(viewArr, m);
        }
        j.e(c9, "<set-?>");
        this.f24237c = c9;
        Log.d("BaseActivity", "onCreate: name Class: ".concat(getClass().getSimpleName()));
        int i11 = C0399a.f4075a;
        AbstractC2466a.a().a(null, getClass().getSimpleName());
        if (getIntent().getStringExtra("key_tracking_screen_from") != null) {
            String valueOf = String.valueOf(getIntent().getStringExtra("key_tracking_screen_from"));
            String simpleName = getClass().getSimpleName();
            Log.d("ITGTrackingHelper", "fromScreenToScreen: " + valueOf + " to " + simpleName);
            AbstractC2466a.a().a(null, valueOf + "_" + simpleName);
        }
        k().M(this);
        p();
        r();
        q();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        o();
    }

    public abstract void p();

    public final void s(Class cls, Bundle bundle) {
        Intent intent = new Intent(this, (Class<?>) cls);
        if (bundle == null) {
            bundle = new Bundle();
        }
        intent.putExtras(bundle);
        startActivity(intent);
        overridePendingTransition(com.tools.arruler.photomeasure.camera.ruler.R.anim.slide_in_right, com.tools.arruler.photomeasure.camera.ruler.R.anim.slide_out_left);
    }

    public void q() {
    }

    public void r() {
    }
}
