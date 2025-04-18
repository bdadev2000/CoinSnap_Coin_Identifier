package androidx.compose.foundation.text.selection;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;
import q0.p;
import q0.q;

/* loaded from: classes3.dex */
final class SelectionMagnifierKt$animatedSelectionMagnifier$1 extends r implements q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q0.a f7203a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f7204b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectionMagnifierKt$animatedSelectionMagnifier$1(q0.a aVar, l lVar) {
        super(3);
        this.f7203a = aVar;
        this.f7204b = lVar;
    }

    @Override // q0.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Composer composer = (Composer) obj2;
        ((Number) obj3).intValue();
        composer.J(759876635);
        AnimationVector2D animationVector2D = SelectionMagnifierKt.f7198a;
        Object u2 = composer.u();
        Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f13690a;
        if (u2 == composer$Companion$Empty$1) {
            u2 = SnapshotStateKt.e(this.f7203a);
            composer.o(u2);
        }
        State state = (State) u2;
        Object u3 = composer.u();
        if (u3 == composer$Companion$Empty$1) {
            u3 = new Animatable(new Offset(((Offset) state.getValue()).f14913a), SelectionMagnifierKt.f7199b, new Offset(SelectionMagnifierKt.f7200c), 8);
            composer.o(u3);
        }
        Animatable animatable = (Animatable) u3;
        b0 b0Var = b0.f30125a;
        boolean w = composer.w(animatable);
        Object u4 = composer.u();
        if (w || u4 == composer$Companion$Empty$1) {
            u4 = new SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1(state, animatable, null);
            composer.o(u4);
        }
        EffectsKt.f(b0Var, (p) u4, composer);
        AnimationState animationState = animatable.f1983c;
        boolean I = composer.I(animationState);
        Object u5 = composer.u();
        if (I || u5 == composer$Companion$Empty$1) {
            u5 = new SelectionMagnifierKt$animatedSelectionMagnifier$1$1$1(animationState);
            composer.o(u5);
        }
        Modifier modifier = (Modifier) this.f7204b.invoke((q0.a) u5);
        composer.D();
        return modifier;
    }
}
