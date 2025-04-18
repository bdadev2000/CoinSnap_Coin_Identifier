package androidx.activity;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public class o extends Dialog implements androidx.lifecycle.v, a0, y1.f {

    /* renamed from: b, reason: collision with root package name */
    public androidx.lifecycle.x f580b;

    /* renamed from: c, reason: collision with root package name */
    public final y1.e f581c;

    /* renamed from: d, reason: collision with root package name */
    public final z f582d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(Context context, int i10) {
        super(context, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f581c = ka.e.g(this);
        this.f582d = new z(new d(this, 2));
    }

    public static void d(o this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        Intrinsics.checkNotNullParameter(view, "view");
        e();
        super.addContentView(view, layoutParams);
    }

    public final void e() {
        Window window = getWindow();
        Intrinsics.checkNotNull(window);
        View decorView = window.getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "window!!.decorView");
        com.facebook.internal.i.H(decorView, this);
        Window window2 = getWindow();
        Intrinsics.checkNotNull(window2);
        View decorView2 = window2.getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView2, "window!!.decorView");
        com.bumptech.glide.e.Q(decorView2, this);
        Window window3 = getWindow();
        Intrinsics.checkNotNull(window3);
        View decorView3 = window3.getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView3, "window!!.decorView");
        com.facebook.appevents.o.v(decorView3, this);
    }

    @Override // androidx.lifecycle.v
    public final androidx.lifecycle.p getLifecycle() {
        androidx.lifecycle.x xVar = this.f580b;
        if (xVar == null) {
            androidx.lifecycle.x xVar2 = new androidx.lifecycle.x(this);
            this.f580b = xVar2;
            return xVar2;
        }
        return xVar;
    }

    @Override // androidx.activity.a0
    public final z getOnBackPressedDispatcher() {
        return this.f582d;
    }

    @Override // y1.f
    public final y1.d getSavedStateRegistry() {
        return this.f581c.f27886b;
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        this.f582d.b();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher invoker = getOnBackInvokedDispatcher();
            Intrinsics.checkNotNullExpressionValue(invoker, "onBackInvokedDispatcher");
            z zVar = this.f582d;
            zVar.getClass();
            Intrinsics.checkNotNullParameter(invoker, "invoker");
            zVar.f628e = invoker;
            zVar.c(zVar.f630g);
        }
        this.f581c.b(bundle);
        androidx.lifecycle.x xVar = this.f580b;
        if (xVar == null) {
            xVar = new androidx.lifecycle.x(this);
            this.f580b = xVar;
        }
        xVar.e(androidx.lifecycle.n.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle onSaveInstanceState = super.onSaveInstanceState();
        Intrinsics.checkNotNullExpressionValue(onSaveInstanceState, "super.onSaveInstanceState()");
        this.f581c.c(onSaveInstanceState);
        return onSaveInstanceState;
    }

    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
        androidx.lifecycle.x xVar = this.f580b;
        if (xVar == null) {
            xVar = new androidx.lifecycle.x(this);
            this.f580b = xVar;
        }
        xVar.e(androidx.lifecycle.n.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        androidx.lifecycle.x xVar = this.f580b;
        if (xVar == null) {
            xVar = new androidx.lifecycle.x(this);
            this.f580b = xVar;
        }
        xVar.e(androidx.lifecycle.n.ON_DESTROY);
        this.f580b = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(int i10) {
        e();
        super.setContentView(i10);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        e();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        Intrinsics.checkNotNullParameter(view, "view");
        e();
        super.setContentView(view, layoutParams);
    }
}
