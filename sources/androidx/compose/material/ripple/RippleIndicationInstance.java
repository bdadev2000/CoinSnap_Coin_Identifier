package androidx.compose.material.ripple;

import androidx.compose.foundation.IndicationInstance;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.StabilityInferred;
import b1.d0;

@StabilityInferred
@d0.a
/* loaded from: classes4.dex */
public abstract class RippleIndicationInstance implements IndicationInstance {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f7448a;

    /* renamed from: b, reason: collision with root package name */
    public final StateLayer f7449b;

    public RippleIndicationInstance(MutableState mutableState, boolean z2) {
        this.f7448a = z2;
        this.f7449b = new StateLayer(new RippleIndicationInstance$stateLayer$1(mutableState), z2);
    }

    public abstract void b(PressInteraction.Press press, d0 d0Var);

    public abstract void c(PressInteraction.Press press);
}
