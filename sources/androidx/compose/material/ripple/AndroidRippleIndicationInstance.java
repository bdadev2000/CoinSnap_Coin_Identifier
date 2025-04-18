package androidx.compose.material.ripple;

import android.view.ViewGroup;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.StructuralEqualityPolicy;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import b1.d0;
import java.util.LinkedHashMap;

@StabilityInferred
@d0.a
/* loaded from: classes3.dex */
public final class AndroidRippleIndicationInstance extends RippleIndicationInstance implements RememberObserver, RippleHostKey {

    /* renamed from: c, reason: collision with root package name */
    public final boolean f7373c;
    public final float d;

    /* renamed from: f, reason: collision with root package name */
    public final State f7374f;

    /* renamed from: g, reason: collision with root package name */
    public final State f7375g;

    /* renamed from: h, reason: collision with root package name */
    public final ViewGroup f7376h;

    /* renamed from: i, reason: collision with root package name */
    public RippleContainer f7377i;

    /* renamed from: j, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f7378j;

    /* renamed from: k, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f7379k;

    /* renamed from: l, reason: collision with root package name */
    public long f7380l;

    /* renamed from: m, reason: collision with root package name */
    public int f7381m;

    /* renamed from: n, reason: collision with root package name */
    public final q0.a f7382n;

    public AndroidRippleIndicationInstance(boolean z2, float f2, MutableState mutableState, MutableState mutableState2, ViewGroup viewGroup) {
        super(mutableState2, z2);
        ParcelableSnapshotMutableState f3;
        ParcelableSnapshotMutableState f4;
        this.f7373c = z2;
        this.d = f2;
        this.f7374f = mutableState;
        this.f7375g = mutableState2;
        this.f7376h = viewGroup;
        f3 = SnapshotStateKt.f(null, StructuralEqualityPolicy.f14078a);
        this.f7378j = f3;
        f4 = SnapshotStateKt.f(Boolean.TRUE, StructuralEqualityPolicy.f14078a);
        this.f7379k = f4;
        this.f7380l = 0L;
        this.f7381m = -1;
        this.f7382n = new AndroidRippleIndicationInstance$onInvalidateRipple$1(this);
    }

    @Override // androidx.compose.foundation.IndicationInstance
    public final void a(ContentDrawScope contentDrawScope) {
        this.f7380l = contentDrawScope.b();
        float f2 = this.d;
        this.f7381m = Float.isNaN(f2) ? p0.a.t0(RippleAnimationKt.a(contentDrawScope, this.f7373c, contentDrawScope.b())) : contentDrawScope.F0(f2);
        long j2 = ((Color) this.f7374f.getValue()).f14964a;
        float f3 = ((RippleAlpha) this.f7375g.getValue()).d;
        contentDrawScope.P1();
        this.f7449b.a(contentDrawScope, Float.isNaN(f2) ? RippleAnimationKt.a(contentDrawScope, this.f7448a, contentDrawScope.b()) : contentDrawScope.y1(f2), j2);
        Canvas a2 = contentDrawScope.A1().a();
        ((Boolean) this.f7379k.getValue()).booleanValue();
        RippleHostView rippleHostView = (RippleHostView) this.f7378j.getValue();
        if (rippleHostView != null) {
            rippleHostView.e(contentDrawScope.b(), j2, f3);
            rippleHostView.draw(AndroidCanvas_androidKt.b(a2));
        }
    }

    @Override // androidx.compose.material.ripple.RippleIndicationInstance
    public final void b(PressInteraction.Press press, d0 d0Var) {
        RippleContainer rippleContainer = this.f7377i;
        if (rippleContainer == null) {
            rippleContainer = Ripple_androidKt.a(this.f7376h);
            this.f7377i = rippleContainer;
            p0.a.p(rippleContainer);
        }
        RippleHostView a2 = rippleContainer.a(this);
        a2.b(press, this.f7373c, this.f7380l, this.f7381m, ((Color) this.f7374f.getValue()).f14964a, ((RippleAlpha) this.f7375g.getValue()).d, this.f7382n);
        this.f7378j.setValue(a2);
    }

    @Override // androidx.compose.material.ripple.RippleIndicationInstance
    public final void c(PressInteraction.Press press) {
        RippleHostView rippleHostView = (RippleHostView) this.f7378j.getValue();
        if (rippleHostView != null) {
            rippleHostView.d();
        }
    }

    @Override // androidx.compose.material.ripple.RippleHostKey
    public final void o1() {
        this.f7378j.setValue(null);
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void onAbandoned() {
        RippleContainer rippleContainer = this.f7377i;
        if (rippleContainer != null) {
            o1();
            RippleHostMap rippleHostMap = rippleContainer.d;
            RippleHostView rippleHostView = (RippleHostView) rippleHostMap.f7440a.get(this);
            if (rippleHostView != null) {
                rippleHostView.c();
                LinkedHashMap linkedHashMap = rippleHostMap.f7440a;
                RippleHostView rippleHostView2 = (RippleHostView) linkedHashMap.get(this);
                if (rippleHostView2 != null) {
                }
                linkedHashMap.remove(this);
                rippleContainer.f7438c.add(rippleHostView);
            }
        }
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void onForgotten() {
        RippleContainer rippleContainer = this.f7377i;
        if (rippleContainer != null) {
            o1();
            RippleHostMap rippleHostMap = rippleContainer.d;
            RippleHostView rippleHostView = (RippleHostView) rippleHostMap.f7440a.get(this);
            if (rippleHostView != null) {
                rippleHostView.c();
                LinkedHashMap linkedHashMap = rippleHostMap.f7440a;
                RippleHostView rippleHostView2 = (RippleHostView) linkedHashMap.get(this);
                if (rippleHostView2 != null) {
                }
                linkedHashMap.remove(this);
                rippleContainer.f7438c.add(rippleHostView);
            }
        }
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void onRemembered() {
    }
}
