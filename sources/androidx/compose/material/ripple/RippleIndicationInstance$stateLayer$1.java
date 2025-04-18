package androidx.compose.material.ripple;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import kotlin.jvm.internal.r;

/* loaded from: classes.dex */
final class RippleIndicationInstance$stateLayer$1 extends r implements q0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ State f7450a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RippleIndicationInstance$stateLayer$1(MutableState mutableState) {
        super(0);
        this.f7450a = mutableState;
    }

    @Override // q0.a
    public final Object invoke() {
        return (RippleAlpha) this.f7450a.getValue();
    }
}
