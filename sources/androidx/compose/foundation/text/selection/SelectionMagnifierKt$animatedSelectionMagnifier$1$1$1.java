package androidx.compose.foundation.text.selection;

import androidx.compose.animation.core.AnimationState;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import kotlin.jvm.internal.r;

/* loaded from: classes3.dex */
final class SelectionMagnifierKt$animatedSelectionMagnifier$1$1$1 extends r implements q0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ State f7205a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectionMagnifierKt$animatedSelectionMagnifier$1$1$1(AnimationState animationState) {
        super(0);
        this.f7205a = animationState;
    }

    @Override // q0.a
    public final Object invoke() {
        return new Offset(((Offset) this.f7205a.getValue()).f14913a);
    }
}
