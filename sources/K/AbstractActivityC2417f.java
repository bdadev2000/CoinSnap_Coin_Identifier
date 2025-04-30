package k;

import android.R;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.core.app.AbstractC0408i;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.V;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import g4.AbstractC2292b;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import q.C2624t;
import q.J0;
import q.Y0;
import q.d1;
import w4.v0;

/* renamed from: k.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractActivityC2417f extends FragmentActivity implements InterfaceC2418g {
    public w b;

    public AbstractActivityC2417f() {
        getSavedStateRegistry().c("androidx:appcompat", new G0.a(this));
        addOnContextAvailableListener(new E6.b(this, 5));
    }

    @Override // f.l, android.app.Activity
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        j();
        w wVar = (w) i();
        wVar.w();
        ((ViewGroup) wVar.f21347C.findViewById(R.id.content)).addView(view, layoutParams);
        wVar.f21379o.a(wVar.f21378n.getCallback());
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        Configuration configuration;
        w wVar = (w) i();
        wVar.f21360Q = true;
        int i9 = wVar.f21364U;
        if (i9 == -100) {
            i9 = AbstractC2422k.f21310c;
        }
        int B5 = wVar.B(context, i9);
        if (AbstractC2422k.d(context) && AbstractC2422k.d(context)) {
            if (Build.VERSION.SDK_INT >= 33) {
                if (!AbstractC2422k.f21314h) {
                    AbstractC2422k.b.execute(new C0.f(context, 2));
                }
            } else {
                synchronized (AbstractC2422k.f21317k) {
                    try {
                        P.l lVar = AbstractC2422k.f21311d;
                        if (lVar == null) {
                            if (AbstractC2422k.f21312f == null) {
                                AbstractC2422k.f21312f = P.l.a(AbstractC0408i.f(context));
                            }
                            if (!AbstractC2422k.f21312f.f2264a.f2265a.isEmpty()) {
                                AbstractC2422k.f21311d = AbstractC2422k.f21312f;
                            }
                        } else if (!lVar.equals(AbstractC2422k.f21312f)) {
                            P.l lVar2 = AbstractC2422k.f21311d;
                            AbstractC2422k.f21312f = lVar2;
                            AbstractC0408i.e(context, lVar2.f2264a.f2265a.toLanguageTags());
                        }
                    } finally {
                    }
                }
            }
        }
        P.l p2 = w.p(context);
        if (context instanceof ContextThemeWrapper) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(w.t(context, B5, p2, null, false));
            } catch (IllegalStateException unused) {
            }
            super.attachBaseContext(context);
        }
        if (context instanceof o.d) {
            try {
                ((o.d) context).a(w.t(context, B5, p2, null, false));
            } catch (IllegalStateException unused2) {
            }
            super.attachBaseContext(context);
        }
        if (w.f21344l0) {
            Configuration configuration2 = new Configuration();
            configuration2.uiMode = -1;
            configuration2.fontScale = 0.0f;
            Configuration configuration3 = context.createConfigurationContext(configuration2).getResources().getConfiguration();
            Configuration configuration4 = context.getResources().getConfiguration();
            configuration3.uiMode = configuration4.uiMode;
            if (!configuration3.equals(configuration4)) {
                configuration = new Configuration();
                configuration.fontScale = 0.0f;
                if (configuration3.diff(configuration4) != 0) {
                    float f9 = configuration3.fontScale;
                    float f10 = configuration4.fontScale;
                    if (f9 != f10) {
                        configuration.fontScale = f10;
                    }
                    int i10 = configuration3.mcc;
                    int i11 = configuration4.mcc;
                    if (i10 != i11) {
                        configuration.mcc = i11;
                    }
                    int i12 = configuration3.mnc;
                    int i13 = configuration4.mnc;
                    if (i12 != i13) {
                        configuration.mnc = i13;
                    }
                    int i14 = Build.VERSION.SDK_INT;
                    q.a(configuration3, configuration4, configuration);
                    int i15 = configuration3.touchscreen;
                    int i16 = configuration4.touchscreen;
                    if (i15 != i16) {
                        configuration.touchscreen = i16;
                    }
                    int i17 = configuration3.keyboard;
                    int i18 = configuration4.keyboard;
                    if (i17 != i18) {
                        configuration.keyboard = i18;
                    }
                    int i19 = configuration3.keyboardHidden;
                    int i20 = configuration4.keyboardHidden;
                    if (i19 != i20) {
                        configuration.keyboardHidden = i20;
                    }
                    int i21 = configuration3.navigation;
                    int i22 = configuration4.navigation;
                    if (i21 != i22) {
                        configuration.navigation = i22;
                    }
                    int i23 = configuration3.navigationHidden;
                    int i24 = configuration4.navigationHidden;
                    if (i23 != i24) {
                        configuration.navigationHidden = i24;
                    }
                    int i25 = configuration3.orientation;
                    int i26 = configuration4.orientation;
                    if (i25 != i26) {
                        configuration.orientation = i26;
                    }
                    int i27 = configuration3.screenLayout & 15;
                    int i28 = configuration4.screenLayout & 15;
                    if (i27 != i28) {
                        configuration.screenLayout |= i28;
                    }
                    int i29 = configuration3.screenLayout & PsExtractor.AUDIO_STREAM;
                    int i30 = configuration4.screenLayout & PsExtractor.AUDIO_STREAM;
                    if (i29 != i30) {
                        configuration.screenLayout |= i30;
                    }
                    int i31 = configuration3.screenLayout & 48;
                    int i32 = configuration4.screenLayout & 48;
                    if (i31 != i32) {
                        configuration.screenLayout |= i32;
                    }
                    int i33 = configuration3.screenLayout & 768;
                    int i34 = configuration4.screenLayout & 768;
                    if (i33 != i34) {
                        configuration.screenLayout |= i34;
                    }
                    if (i14 >= 26) {
                        if ((com.google.ar.core.G.a(configuration3) & 3) != (com.google.ar.core.G.a(configuration4) & 3)) {
                            com.google.ar.core.G.j(configuration, com.google.ar.core.G.a(configuration) | (com.google.ar.core.G.a(configuration4) & 3));
                        }
                        if ((com.google.ar.core.G.a(configuration3) & 12) != (com.google.ar.core.G.a(configuration4) & 12)) {
                            com.google.ar.core.G.j(configuration, com.google.ar.core.G.a(configuration) | (com.google.ar.core.G.a(configuration4) & 12));
                        }
                    }
                    int i35 = configuration3.uiMode & 15;
                    int i36 = configuration4.uiMode & 15;
                    if (i35 != i36) {
                        configuration.uiMode |= i36;
                    }
                    int i37 = configuration3.uiMode & 48;
                    int i38 = configuration4.uiMode & 48;
                    if (i37 != i38) {
                        configuration.uiMode |= i38;
                    }
                    int i39 = configuration3.screenWidthDp;
                    int i40 = configuration4.screenWidthDp;
                    if (i39 != i40) {
                        configuration.screenWidthDp = i40;
                    }
                    int i41 = configuration3.screenHeightDp;
                    int i42 = configuration4.screenHeightDp;
                    if (i41 != i42) {
                        configuration.screenHeightDp = i42;
                    }
                    int i43 = configuration3.smallestScreenWidthDp;
                    int i44 = configuration4.smallestScreenWidthDp;
                    if (i43 != i44) {
                        configuration.smallestScreenWidthDp = i44;
                    }
                    int i45 = configuration3.densityDpi;
                    int i46 = configuration4.densityDpi;
                    if (i45 != i46) {
                        configuration.densityDpi = i46;
                    }
                }
            } else {
                configuration = null;
            }
            Configuration t9 = w.t(context, B5, p2, configuration, true);
            o.d dVar = new o.d(context, com.tools.arruler.photomeasure.camera.ruler.R.style.Theme_AppCompat_Empty);
            dVar.a(t9);
            try {
                if (context.getTheme() != null) {
                    Resources.Theme theme = dVar.getTheme();
                    if (Build.VERSION.SDK_INT >= 29) {
                        K.n.a(theme);
                    } else {
                        synchronized (K.b.f1614e) {
                            if (!K.b.f1616g) {
                                try {
                                    Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", null);
                                    K.b.f1615f = declaredMethod;
                                    declaredMethod.setAccessible(true);
                                } catch (NoSuchMethodException e4) {
                                    Log.i("ResourcesCompat", "Failed to retrieve rebase() method", e4);
                                }
                                K.b.f1616g = true;
                            }
                            Method method = K.b.f1615f;
                            if (method != null) {
                                try {
                                    method.invoke(theme, null);
                                } catch (IllegalAccessException | InvocationTargetException e9) {
                                    Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", e9);
                                    K.b.f1615f = null;
                                }
                            }
                        }
                    }
                }
            } catch (NullPointerException unused3) {
            }
            context = dVar;
        }
        super.attachBaseContext(context);
    }

    @Override // android.app.Activity
    public final void closeOptionsMenu() {
        ((w) i()).A();
        if (getWindow().hasFeature(0)) {
            super.closeOptionsMenu();
        }
    }

    @Override // androidx.core.app.AbstractActivityC0412m, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        keyEvent.getKeyCode();
        ((w) i()).A();
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public final View findViewById(int i9) {
        w wVar = (w) i();
        wVar.w();
        return wVar.f21378n.findViewById(i9);
    }

    @Override // android.app.Activity
    public final MenuInflater getMenuInflater() {
        Context context;
        w wVar = (w) i();
        if (wVar.f21382r == null) {
            wVar.A();
            C2411H c2411h = wVar.f21381q;
            if (c2411h != null) {
                context = c2411h.z();
            } else {
                context = wVar.m;
            }
            wVar.f21382r = new o.i(context);
        }
        return wVar.f21382r;
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        int i9 = d1.f22642a;
        return super.getResources();
    }

    public final AbstractC2422k i() {
        if (this.b == null) {
            ExecutorC2421j executorC2421j = AbstractC2422k.b;
            this.b = new w(this, null, this, this);
        }
        return this.b;
    }

    @Override // android.app.Activity
    public final void invalidateOptionsMenu() {
        i().c();
    }

    public final void j() {
        V.k(getWindow().getDecorView(), this);
        View decorView = getWindow().getDecorView();
        G7.j.e(decorView, "<this>");
        decorView.setTag(com.tools.arruler.photomeasure.camera.ruler.R.id.view_tree_view_model_store_owner, this);
        AbstractC2292b.j(getWindow().getDecorView(), this);
        v0.z(getWindow().getDecorView(), this);
    }

    @Override // f.l, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        w wVar = (w) i();
        if (wVar.f21352H && wVar.f21346B) {
            wVar.A();
            C2411H c2411h = wVar.f21381q;
            if (c2411h != null) {
                c2411h.C(c2411h.b.getResources().getBoolean(com.tools.arruler.photomeasure.camera.ruler.R.bool.abc_action_bar_embed_tabs));
            }
        }
        C2624t a6 = C2624t.a();
        Context context = wVar.m;
        synchronized (a6) {
            J0 j02 = a6.f22726a;
            synchronized (j02) {
                x.f fVar = (x.f) j02.b.get(context);
                if (fVar != null) {
                    fVar.a();
                }
            }
        }
        wVar.f21363T = new Configuration(wVar.m.getResources().getConfiguration());
        wVar.n(false, false);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        i().f();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i9, KeyEvent keyEvent) {
        Window window;
        if (Build.VERSION.SDK_INT < 26 && !keyEvent.isCtrlPressed() && !KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) && keyEvent.getRepeatCount() == 0 && !KeyEvent.isModifierKey(keyEvent.getKeyCode()) && (window = getWindow()) != null && window.getDecorView() != null && window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i9, keyEvent);
    }

    @Override // androidx.fragment.app.FragmentActivity, f.l, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i9, MenuItem menuItem) {
        Intent b;
        if (super.onMenuItemSelected(i9, menuItem)) {
            return true;
        }
        w wVar = (w) i();
        wVar.A();
        C2411H c2411h = wVar.f21381q;
        if (menuItem.getItemId() == 16908332 && c2411h != null && (((Y0) c2411h.f21243g).b & 4) != 0 && (b = AbstractC0408i.b(this)) != null) {
            if (shouldUpRecreateTask(b)) {
                ArrayList arrayList = new ArrayList();
                Intent b8 = AbstractC0408i.b(this);
                if (b8 == null) {
                    b8 = AbstractC0408i.b(this);
                }
                if (b8 != null) {
                    ComponentName component = b8.getComponent();
                    if (component == null) {
                        component = b8.resolveActivity(getPackageManager());
                    }
                    int size = arrayList.size();
                    try {
                        Intent c9 = AbstractC0408i.c(this, component);
                        while (c9 != null) {
                            arrayList.add(size, c9);
                            c9 = AbstractC0408i.c(this, c9.getComponent());
                        }
                        arrayList.add(b8);
                    } catch (PackageManager.NameNotFoundException e4) {
                        Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
                        throw new IllegalArgumentException(e4);
                    }
                }
                if (!arrayList.isEmpty()) {
                    Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
                    intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
                    if (!I.h.startActivities(this, intentArr, null)) {
                        Intent intent = new Intent(intentArr[intentArr.length - 1]);
                        intent.addFlags(268435456);
                        startActivity(intent);
                    }
                    try {
                        finishAffinity();
                        return true;
                    } catch (IllegalStateException unused) {
                        finish();
                        return true;
                    }
                }
                throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
            }
            navigateUpTo(b);
            return true;
        }
        return false;
    }

    @Override // android.app.Activity
    public final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        ((w) i()).w();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPostResume() {
        super.onPostResume();
        w wVar = (w) i();
        wVar.A();
        C2411H c2411h = wVar.f21381q;
        if (c2411h != null) {
            c2411h.f21256v = true;
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStart() {
        super.onStart();
        ((w) i()).n(true, false);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStop() {
        super.onStop();
        w wVar = (w) i();
        wVar.A();
        C2411H c2411h = wVar.f21381q;
        if (c2411h != null) {
            c2411h.f21256v = false;
            o.k kVar = c2411h.f21255u;
            if (kVar != null) {
                kVar.a();
            }
        }
    }

    @Override // android.app.Activity
    public final void onTitleChanged(CharSequence charSequence, int i9) {
        super.onTitleChanged(charSequence, i9);
        i().m(charSequence);
    }

    @Override // android.app.Activity
    public final void openOptionsMenu() {
        ((w) i()).A();
        if (getWindow().hasFeature(0)) {
            super.openOptionsMenu();
        }
    }

    @Override // f.l, android.app.Activity
    public final void setContentView(int i9) {
        j();
        i().j(i9);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i9) {
        super.setTheme(i9);
        ((w) i()).f21365V = i9;
    }

    @Override // androidx.fragment.app.FragmentActivity
    public final void supportInvalidateOptionsMenu() {
        i().c();
    }

    @Override // f.l, android.app.Activity
    public void setContentView(View view) {
        j();
        i().k(view);
    }

    @Override // f.l, android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        j();
        i().l(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onContentChanged() {
    }
}
