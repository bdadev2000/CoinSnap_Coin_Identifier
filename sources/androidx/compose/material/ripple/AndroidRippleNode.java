package androidx.compose.material.ripple;

import android.view.View;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.node.DrawModifierNodeKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.LinkedHashMap;

@StabilityInferred
/* loaded from: classes3.dex */
public final class AndroidRippleNode extends RippleNode implements RippleHostKey {

    /* renamed from: y, reason: collision with root package name */
    public RippleContainer f7384y;

    /* renamed from: z, reason: collision with root package name */
    public RippleHostView f7385z;

    @Override // androidx.compose.ui.Modifier.Node
    public final void X1() {
        RippleContainer rippleContainer = this.f7384y;
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

    @Override // androidx.compose.material.ripple.RippleNode
    public final void e2(PressInteraction.Press press, long j2, float f2) {
        RippleContainer rippleContainer = this.f7384y;
        if (rippleContainer == null) {
            rippleContainer = Ripple_androidKt.a(Ripple_androidKt.b((View) CompositionLocalConsumerModifierNodeKt.a(this, AndroidCompositionLocals_androidKt.f16327f)));
            this.f7384y = rippleContainer;
            p0.a.p(rippleContainer);
        }
        RippleHostView a2 = rippleContainer.a(this);
        a2.b(press, this.f7453p, j2, p0.a.t0(f2), this.f7455r.a(), ((RippleAlpha) this.f7456s.invoke()).d, new AndroidRippleNode$addRipple$1$1$1(this));
        this.f7385z = a2;
        DrawModifierNodeKt.a(this);
    }

    @Override // androidx.compose.material.ripple.RippleNode
    public final void f2(DrawScope drawScope) {
        Canvas a2 = drawScope.A1().a();
        RippleHostView rippleHostView = this.f7385z;
        if (rippleHostView != null) {
            rippleHostView.e(this.f7459v, this.f7455r.a(), ((RippleAlpha) this.f7456s.invoke()).d);
            rippleHostView.draw(AndroidCanvas_androidKt.b(a2));
        }
    }

    @Override // androidx.compose.material.ripple.RippleNode
    public final void h2(PressInteraction.Press press) {
        RippleHostView rippleHostView = this.f7385z;
        if (rippleHostView != null) {
            rippleHostView.d();
        }
    }

    @Override // androidx.compose.material.ripple.RippleHostKey
    public final void o1() {
        this.f7385z = null;
        DrawModifierNodeKt.a(this);
    }
}
