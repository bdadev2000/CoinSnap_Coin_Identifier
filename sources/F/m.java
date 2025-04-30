package f;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.AbstractC0505o;
import androidx.lifecycle.C0513x;
import androidx.lifecycle.EnumC0503m;
import androidx.lifecycle.InterfaceC0511v;
import androidx.lifecycle.V;
import com.mbridge.msdk.MBridgeConstans;
import com.vungle.ads.L;
import g4.AbstractC2292b;
import w4.v0;

/* loaded from: classes.dex */
public class m extends Dialog implements InterfaceC0511v, y, G0.g {
    public C0513x b;

    /* renamed from: c, reason: collision with root package name */
    public final G0.f f20221c;

    /* renamed from: d, reason: collision with root package name */
    public final x f20222d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(Context context, int i9) {
        super(context, i9);
        G7.j.e(context, "context");
        this.f20221c = new G0.f(this);
        this.f20222d = new x(new L(this, 5));
    }

    public static void a(m mVar) {
        G7.j.e(mVar, "this$0");
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        G7.j.e(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        c();
        super.addContentView(view, layoutParams);
    }

    public final C0513x b() {
        C0513x c0513x = this.b;
        if (c0513x == null) {
            C0513x c0513x2 = new C0513x(this);
            this.b = c0513x2;
            return c0513x2;
        }
        return c0513x;
    }

    public final void c() {
        Window window = getWindow();
        G7.j.b(window);
        View decorView = window.getDecorView();
        G7.j.d(decorView, "window!!.decorView");
        V.k(decorView, this);
        Window window2 = getWindow();
        G7.j.b(window2);
        View decorView2 = window2.getDecorView();
        G7.j.d(decorView2, "window!!.decorView");
        v0.z(decorView2, this);
        Window window3 = getWindow();
        G7.j.b(window3);
        View decorView3 = window3.getDecorView();
        G7.j.d(decorView3, "window!!.decorView");
        AbstractC2292b.j(decorView3, this);
    }

    @Override // androidx.lifecycle.InterfaceC0511v
    public final AbstractC0505o getLifecycle() {
        return b();
    }

    @Override // f.y
    public final x getOnBackPressedDispatcher() {
        return this.f20222d;
    }

    @Override // G0.g
    public final G0.e getSavedStateRegistry() {
        return this.f20221c.b;
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        this.f20222d.d();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            G7.j.d(onBackInvokedDispatcher, "onBackInvokedDispatcher");
            x xVar = this.f20222d;
            xVar.getClass();
            xVar.f20243e = onBackInvokedDispatcher;
            xVar.e(xVar.f20245g);
        }
        this.f20221c.b(bundle);
        b().e(EnumC0503m.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle onSaveInstanceState = super.onSaveInstanceState();
        G7.j.d(onSaveInstanceState, "super.onSaveInstanceState()");
        this.f20221c.c(onSaveInstanceState);
        return onSaveInstanceState;
    }

    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
        b().e(EnumC0503m.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        b().e(EnumC0503m.ON_DESTROY);
        this.b = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(int i9) {
        c();
        super.setContentView(i9);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        G7.j.e(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        c();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        G7.j.e(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        c();
        super.setContentView(view, layoutParams);
    }
}
