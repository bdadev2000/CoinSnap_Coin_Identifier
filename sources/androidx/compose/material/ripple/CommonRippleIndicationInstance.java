package androidx.compose.material.ripple;

import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.State;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import b1.d0;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.e;

/* JADX INFO: Access modifiers changed from: package-private */
@d0.a
/* loaded from: classes2.dex */
public final class CommonRippleIndicationInstance extends RippleIndicationInstance implements RememberObserver {

    /* renamed from: c, reason: collision with root package name */
    public final boolean f7387c;
    public final float d;

    /* renamed from: f, reason: collision with root package name */
    public final State f7388f;

    /* renamed from: g, reason: collision with root package name */
    public final State f7389g;

    /* renamed from: h, reason: collision with root package name */
    public final SnapshotStateMap f7390h;

    /* renamed from: i, reason: collision with root package name */
    public float f7391i;

    public CommonRippleIndicationInstance(boolean z2, float f2, MutableState mutableState, MutableState mutableState2) {
        super(mutableState2, z2);
        this.f7387c = z2;
        this.d = f2;
        this.f7388f = mutableState;
        this.f7389g = mutableState2;
        this.f7390h = new SnapshotStateMap();
        this.f7391i = Float.NaN;
    }

    @Override // androidx.compose.foundation.IndicationInstance
    public final void a(ContentDrawScope contentDrawScope) {
        float f2 = this.d;
        this.f7391i = Float.isNaN(f2) ? RippleAnimationKt.a(contentDrawScope, this.f7387c, contentDrawScope.b()) : contentDrawScope.y1(f2);
        long j2 = ((Color) this.f7388f.getValue()).f14964a;
        contentDrawScope.P1();
        this.f7449b.a(contentDrawScope, Float.isNaN(f2) ? RippleAnimationKt.a(contentDrawScope, this.f7448a, contentDrawScope.b()) : contentDrawScope.y1(f2), j2);
        Iterator it = this.f7390h.f14594b.iterator();
        while (it.hasNext()) {
            RippleAnimation rippleAnimation = (RippleAnimation) ((Map.Entry) it.next()).getValue();
            float f3 = ((RippleAlpha) this.f7389g.getValue()).d;
            if (f3 != 0.0f) {
                rippleAnimation.b(contentDrawScope, Color.b(j2, f3));
            }
        }
    }

    @Override // androidx.compose.material.ripple.RippleIndicationInstance
    public final void b(PressInteraction.Press press, d0 d0Var) {
        SnapshotStateMap snapshotStateMap = this.f7390h;
        Iterator it = snapshotStateMap.f14594b.iterator();
        while (it.hasNext()) {
            ((RippleAnimation) ((Map.Entry) it.next()).getValue()).c();
        }
        boolean z2 = this.f7387c;
        RippleAnimation rippleAnimation = new RippleAnimation(z2 ? new Offset(press.f3741a) : null, this.f7391i, z2);
        snapshotStateMap.put(press, rippleAnimation);
        e.v(d0Var, null, 0, new CommonRippleIndicationInstance$addRipple$2(rippleAnimation, this, press, null), 3);
    }

    @Override // androidx.compose.material.ripple.RippleIndicationInstance
    public final void c(PressInteraction.Press press) {
        RippleAnimation rippleAnimation = (RippleAnimation) this.f7390h.get(press);
        if (rippleAnimation != null) {
            rippleAnimation.c();
        }
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void onAbandoned() {
        this.f7390h.clear();
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void onForgotten() {
        this.f7390h.clear();
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void onRemembered() {
    }
}
