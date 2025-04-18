package androidx.compose.foundation;

import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes3.dex */
final class FocusableInteractionNode$emitWithFallback$handler$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MutableInteractionSource f2707a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Interaction f2708b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FocusableInteractionNode$emitWithFallback$handler$1(MutableInteractionSource mutableInteractionSource, FocusInteraction focusInteraction) {
        super(1);
        this.f2707a = mutableInteractionSource;
        this.f2708b = focusInteraction;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        this.f2707a.b(this.f2708b);
        return b0.f30125a;
    }
}
