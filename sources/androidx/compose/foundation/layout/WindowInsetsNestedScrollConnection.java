package androidx.compose.foundation.layout;

import android.graphics.Insets;
import android.os.CancellationSignal;
import android.view.View;
import android.view.WindowInsetsAnimationControlListener;
import android.view.WindowInsetsAnimationController;
import android.view.WindowInsetsController;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Velocity;
import b1.h1;
import b1.k;
import h0.g;

/* JADX INFO: Access modifiers changed from: package-private */
@RequiresApi
/* loaded from: classes4.dex */
public final class WindowInsetsNestedScrollConnection implements NestedScrollConnection, WindowInsetsAnimationControlListener {

    /* renamed from: a, reason: collision with root package name */
    public final AndroidWindowInsets f4161a;

    /* renamed from: b, reason: collision with root package name */
    public final View f4162b;

    /* renamed from: c, reason: collision with root package name */
    public final SideCalculator f4163c;
    public final Density d;

    /* renamed from: f, reason: collision with root package name */
    public WindowInsetsAnimationController f4164f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f4165g;

    /* renamed from: h, reason: collision with root package name */
    public final CancellationSignal f4166h = new CancellationSignal();

    /* renamed from: i, reason: collision with root package name */
    public float f4167i;

    /* renamed from: j, reason: collision with root package name */
    public h1 f4168j;

    /* renamed from: k, reason: collision with root package name */
    public k f4169k;

    public WindowInsetsNestedScrollConnection(AndroidWindowInsets androidWindowInsets, View view, SideCalculator sideCalculator, Density density) {
        this.f4161a = androidWindowInsets;
        this.f4162b = view;
        this.f4163c = sideCalculator;
        this.d = density;
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    public final long E0(int i2, long j2, long j3) {
        return d(j3, this.f4163c.a(Offset.g(j3), Offset.h(j3)));
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    public final Object W0(long j2, g gVar) {
        return b(j2, this.f4163c.d(Velocity.b(j2), Velocity.c(j2)), false, gVar);
    }

    public final void a() {
        boolean isReady;
        WindowInsetsAnimationController windowInsetsAnimationController;
        WindowInsetsAnimationController windowInsetsAnimationController2 = this.f4164f;
        if (windowInsetsAnimationController2 != null) {
            isReady = windowInsetsAnimationController2.isReady();
            if (isReady && (windowInsetsAnimationController = this.f4164f) != null) {
                windowInsetsAnimationController.finish(((Boolean) this.f4161a.d.getValue()).booleanValue());
            }
        }
        this.f4164f = null;
        k kVar = this.f4169k;
        if (kVar != null) {
            kVar.m(null, WindowInsetsNestedScrollConnection$animationEnded$1.f4170a);
        }
        this.f4169k = null;
        h1 h1Var = this.f4168j;
        if (h1Var != null) {
            h1Var.a(new WindowInsetsAnimationCancelledException());
        }
        this.f4168j = null;
        this.f4167i = 0.0f;
        this.f4165g = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.lang.Object, kotlin.jvm.internal.c0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(long r28, float r30, boolean r31, h0.g r32) {
        /*
            Method dump skipped, instructions count: 421
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection.b(long, float, boolean, h0.g):java.lang.Object");
    }

    public final void c() {
        WindowInsetsController windowInsetsController;
        if (this.f4165g) {
            return;
        }
        this.f4165g = true;
        windowInsetsController = this.f4162b.getWindowInsetsController();
        if (windowInsetsController != null) {
            windowInsetsController.controlWindowInsetsAnimation(this.f4161a.f3769a, -1L, null, this.f4166h, a.j(this));
        }
    }

    public final long d(long j2, float f2) {
        Insets hiddenStateInsets;
        Insets shownStateInsets;
        Insets currentInsets;
        h1 h1Var = this.f4168j;
        if (h1Var != null) {
            h1Var.a(new WindowInsetsAnimationCancelledException());
            this.f4168j = null;
        }
        WindowInsetsAnimationController windowInsetsAnimationController = this.f4164f;
        if (f2 != 0.0f) {
            if (((Boolean) this.f4161a.d.getValue()).booleanValue() != (f2 > 0.0f) || windowInsetsAnimationController != null) {
                if (windowInsetsAnimationController == null) {
                    this.f4167i = 0.0f;
                    c();
                    return this.f4163c.f(j2);
                }
                SideCalculator sideCalculator = this.f4163c;
                hiddenStateInsets = windowInsetsAnimationController.getHiddenStateInsets();
                int e = sideCalculator.e(hiddenStateInsets);
                SideCalculator sideCalculator2 = this.f4163c;
                shownStateInsets = windowInsetsAnimationController.getShownStateInsets();
                int e2 = sideCalculator2.e(shownStateInsets);
                currentInsets = windowInsetsAnimationController.getCurrentInsets();
                int e3 = this.f4163c.e(currentInsets);
                if (e3 == (f2 > 0.0f ? e2 : e)) {
                    this.f4167i = 0.0f;
                    return 0L;
                }
                float f3 = e3 + f2 + this.f4167i;
                int A = p0.a.A(Math.round(f3), e, e2);
                this.f4167i = f3 - Math.round(f3);
                if (A != e3) {
                    windowInsetsAnimationController.setInsetsAndAlpha(this.f4163c.c(currentInsets, A), 1.0f, 0.0f);
                }
                return this.f4163c.f(j2);
            }
        }
        return 0L;
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    public final long g0(int i2, long j2) {
        return d(j2, this.f4163c.d(Offset.g(j2), Offset.h(j2)));
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    public final Object h1(long j2, long j3, g gVar) {
        return b(j3, this.f4163c.a(Velocity.b(j3), Velocity.c(j3)), true, gVar);
    }

    public final void onCancelled(WindowInsetsAnimationController windowInsetsAnimationController) {
        a();
    }

    public final void onFinished(WindowInsetsAnimationController windowInsetsAnimationController) {
        a();
    }

    public final void onReady(WindowInsetsAnimationController windowInsetsAnimationController, int i2) {
        this.f4164f = windowInsetsAnimationController;
        this.f4165g = false;
        k kVar = this.f4169k;
        if (kVar != null) {
            kVar.m(windowInsetsAnimationController, WindowInsetsNestedScrollConnection$onReady$1.f4215a);
        }
        this.f4169k = null;
    }
}
