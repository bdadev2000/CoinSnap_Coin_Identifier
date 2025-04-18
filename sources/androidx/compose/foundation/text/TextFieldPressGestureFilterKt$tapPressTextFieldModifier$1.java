package androidx.compose.foundation.text;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.StructuralEqualityPolicy;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import b1.d0;
import kotlin.jvm.internal.r;
import q0.l;
import q0.p;
import q0.q;

/* loaded from: classes2.dex */
final class TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1 extends r implements q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f6165a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MutableInteractionSource f6166b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1(l lVar, MutableInteractionSource mutableInteractionSource) {
        super(3);
        this.f6165a = lVar;
        this.f6166b = mutableInteractionSource;
    }

    @Override // q0.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Composer composer = (Composer) obj2;
        ((Number) obj3).intValue();
        composer.J(-102778667);
        Object u2 = composer.u();
        Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f13690a;
        if (u2 == composer$Companion$Empty$1) {
            CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.g(composer));
            composer.o(compositionScopedCoroutineScopeCanceller);
            u2 = compositionScopedCoroutineScopeCanceller;
        }
        d0 d0Var = ((CompositionScopedCoroutineScopeCanceller) u2).f13774a;
        Object u3 = composer.u();
        if (u3 == composer$Companion$Empty$1) {
            u3 = SnapshotStateKt.f(null, StructuralEqualityPolicy.f14078a);
            composer.o(u3);
        }
        MutableState mutableState = (MutableState) u3;
        MutableState k2 = SnapshotStateKt.k(this.f6165a, composer);
        MutableInteractionSource mutableInteractionSource = this.f6166b;
        boolean I = composer.I(mutableInteractionSource);
        Object u4 = composer.u();
        if (I || u4 == composer$Companion$Empty$1) {
            u4 = new TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$1$1(mutableState, mutableInteractionSource);
            composer.o(u4);
        }
        EffectsKt.c(mutableInteractionSource, (l) u4, composer);
        Modifier.Companion companion = Modifier.Companion.f14687a;
        boolean w = composer.w(d0Var) | composer.I(mutableInteractionSource) | composer.I(k2);
        MutableInteractionSource mutableInteractionSource2 = this.f6166b;
        Object u5 = composer.u();
        if (w || u5 == composer$Companion$Empty$1) {
            TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1 textFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1 = new TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1(d0Var, mutableState, mutableInteractionSource2, k2, null);
            composer.o(textFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1);
            u5 = textFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1;
        }
        Modifier b2 = SuspendingPointerInputFilterKt.b(companion, mutableInteractionSource, (p) u5);
        composer.D();
        return b2;
    }
}
