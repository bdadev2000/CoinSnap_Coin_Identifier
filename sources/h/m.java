package h;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.d4;
import androidx.appcompat.widget.s2;
import androidx.appcompat.widget.z3;
import androidx.core.app.z1;
import androidx.fragment.app.FragmentActivity;
import com.plantcare.ai.identifier.plantid.R;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class m extends FragmentActivity implements n {

    /* renamed from: b, reason: collision with root package name */
    public g0 f18636b;

    public m() {
        getSavedStateRegistry().c("androidx:appcompat", new k(this));
        addOnContextAvailableListener(new l(this, 0));
    }

    @Override // h.n
    public final void a() {
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        l();
        k().a(view, layoutParams);
    }

    /* JADX WARN: Removed duplicated region for block: B:130:0x0203  */
    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void attachBaseContext(final android.content.Context r12) {
        /*
            Method dump skipped, instructions count: 594
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h.m.attachBaseContext(android.content.Context):void");
    }

    @Override // h.n
    public final void b() {
    }

    @Override // h.n
    public final void c() {
    }

    @Override // android.app.Activity
    public final void closeOptionsMenu() {
        ((g0) k()).C();
        if (getWindow().hasFeature(0)) {
            super.closeOptionsMenu();
        }
    }

    @Override // androidx.core.app.p, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        keyEvent.getKeyCode();
        ((g0) k()).C();
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public final View findViewById(int i10) {
        g0 g0Var = (g0) k();
        g0Var.x();
        return g0Var.f18582n.findViewById(i10);
    }

    @Override // android.app.Activity
    public final MenuInflater getMenuInflater() {
        Context context;
        g0 g0Var = (g0) k();
        if (g0Var.f18586r == null) {
            g0Var.C();
            w0 w0Var = g0Var.f18585q;
            if (w0Var != null) {
                context = w0Var.F();
            } else {
                context = g0Var.f18581m;
            }
            g0Var.f18586r = new j.k(context);
        }
        return g0Var.f18586r;
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        int i10 = d4.a;
        return super.getResources();
    }

    @Override // android.app.Activity
    public final void invalidateOptionsMenu() {
        k().c();
    }

    public final r k() {
        if (this.f18636b == null) {
            p0 p0Var = r.f18648b;
            this.f18636b = new g0(this, null, this, this);
        }
        return this.f18636b;
    }

    public final void l() {
        com.facebook.internal.i.H(getWindow().getDecorView(), this);
        View decorView = getWindow().getDecorView();
        Intrinsics.checkNotNullParameter(decorView, "<this>");
        decorView.setTag(R.id.view_tree_view_model_store_owner, this);
        com.facebook.appevents.o.v(getWindow().getDecorView(), this);
        com.bumptech.glide.e.Q(getWindow().getDecorView(), this);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        g0 g0Var = (g0) k();
        if (g0Var.H && g0Var.B) {
            g0Var.C();
            w0 w0Var = g0Var.f18585q;
            if (w0Var != null) {
                w0Var.I(w0Var.f18677f.getResources().getBoolean(R.bool.abc_action_bar_embed_tabs));
            }
        }
        androidx.appcompat.widget.w a = androidx.appcompat.widget.w.a();
        Context context = g0Var.f18581m;
        synchronized (a) {
            s2 s2Var = a.a;
            synchronized (s2Var) {
                r.e eVar = (r.e) s2Var.f1022b.get(context);
                if (eVar != null) {
                    eVar.a();
                }
            }
        }
        g0Var.T = new Configuration(g0Var.f18581m.getResources().getConfiguration());
        g0Var.o(false, false);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onContentChanged() {
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        k().g();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        boolean z10;
        Window window;
        if (Build.VERSION.SDK_INT < 26 && !keyEvent.isCtrlPressed() && !KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) && keyEvent.getRepeatCount() == 0 && !KeyEvent.isModifierKey(keyEvent.getKeyCode()) && (window = getWindow()) != null && window.getDecorView() != null && window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        Intent z10;
        if (super.onMenuItemSelected(i10, menuItem)) {
            return true;
        }
        g0 g0Var = (g0) k();
        g0Var.C();
        w0 w0Var = g0Var.f18585q;
        if (menuItem.getItemId() == 16908332 && w0Var != null && (((z3) w0Var.f18682k).f1104b & 4) != 0 && (z10 = com.bumptech.glide.c.z(this)) != null) {
            if (shouldUpRecreateTask(z10)) {
                z1 z1Var = new z1(this);
                Intent z11 = com.bumptech.glide.c.z(this);
                if (z11 == null) {
                    z11 = com.bumptech.glide.c.z(this);
                }
                ArrayList arrayList = z1Var.f1276b;
                Context context = z1Var.f1277c;
                if (z11 != null) {
                    ComponentName component = z11.getComponent();
                    if (component == null) {
                        component = z11.resolveActivity(context.getPackageManager());
                    }
                    int size = arrayList.size();
                    try {
                        for (Intent A = com.bumptech.glide.c.A(context, component); A != null; A = com.bumptech.glide.c.A(context, A.getComponent())) {
                            arrayList.add(size, A);
                        }
                        arrayList.add(z11);
                    } catch (PackageManager.NameNotFoundException e2) {
                        Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
                        throw new IllegalArgumentException(e2);
                    }
                }
                if (!arrayList.isEmpty()) {
                    Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
                    intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
                    if (!d0.h.startActivities(context, intentArr, null)) {
                        Intent intent = new Intent(intentArr[intentArr.length - 1]);
                        intent.addFlags(268435456);
                        context.startActivity(intent);
                    }
                    try {
                        int i11 = androidx.core.app.i.a;
                        finishAffinity();
                        return true;
                    } catch (IllegalStateException unused) {
                        finish();
                        return true;
                    }
                }
                throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
            }
            navigateUpTo(z10);
            return true;
        }
        return false;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onMenuOpened(int i10, Menu menu) {
        return super.onMenuOpened(i10, menu);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public final void onPanelClosed(int i10, Menu menu) {
        super.onPanelClosed(i10, menu);
    }

    @Override // android.app.Activity
    public final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        ((g0) k()).x();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPostResume() {
        super.onPostResume();
        g0 g0Var = (g0) k();
        g0Var.C();
        w0 w0Var = g0Var.f18585q;
        if (w0Var != null) {
            w0Var.f18696z = true;
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStart() {
        super.onStart();
        ((g0) k()).o(true, false);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStop() {
        super.onStop();
        g0 g0Var = (g0) k();
        g0Var.C();
        w0 w0Var = g0Var.f18585q;
        if (w0Var != null) {
            w0Var.f18696z = false;
            j.m mVar = w0Var.f18695y;
            if (mVar != null) {
                mVar.a();
            }
        }
    }

    @Override // android.app.Activity
    public final void onTitleChanged(CharSequence charSequence, int i10) {
        super.onTitleChanged(charSequence, i10);
        k().n(charSequence);
    }

    @Override // android.app.Activity
    public final void openOptionsMenu() {
        ((g0) k()).C();
        if (getWindow().hasFeature(0)) {
            super.openOptionsMenu();
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void setContentView(int i10) {
        l();
        k().k(i10);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i10) {
        super.setTheme(i10);
        ((g0) k()).V = i10;
    }

    @Override // androidx.fragment.app.FragmentActivity
    public final void supportInvalidateOptionsMenu() {
        k().c();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        l();
        k().l(view);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        l();
        k().m(view, layoutParams);
    }
}
