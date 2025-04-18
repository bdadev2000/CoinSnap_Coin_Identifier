package androidx.compose.animation;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.layout.LookaheadScope;
import b1.d0;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;
import q0.q;

/* loaded from: classes4.dex */
final class SharedTransitionScopeKt$SharedTransitionScope$1 extends r implements q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q0.r f1934a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedTransitionScopeKt$SharedTransitionScope$1(q0.r rVar) {
        super(3);
        this.f1934a = rVar;
    }

    @Override // q0.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LookaheadScope lookaheadScope = (LookaheadScope) obj;
        Composer composer = (Composer) obj2;
        ((Number) obj3).intValue();
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
            u3 = new SharedTransitionScopeImpl(lookaheadScope, d0Var);
            composer.o(u3);
        }
        SharedTransitionScopeImpl sharedTransitionScopeImpl = (SharedTransitionScopeImpl) u3;
        Modifier.Companion companion = Modifier.Companion.f14687a;
        Object u4 = composer.u();
        if (u4 == composer$Companion$Empty$1) {
            u4 = new SharedTransitionScopeKt$SharedTransitionScope$1$1$1(sharedTransitionScopeImpl);
            composer.o(u4);
        }
        Modifier a2 = LayoutModifierKt.a(companion, (q) u4);
        Object u5 = composer.u();
        if (u5 == composer$Companion$Empty$1) {
            u5 = new SharedTransitionScopeKt$SharedTransitionScope$1$2$1(sharedTransitionScopeImpl);
            composer.o(u5);
        }
        this.f1934a.invoke(sharedTransitionScopeImpl, DrawModifierKt.d(a2, (l) u5), composer, 6);
        b0 b0Var = b0.f30125a;
        Object u6 = composer.u();
        if (u6 == composer$Companion$Empty$1) {
            u6 = new SharedTransitionScopeKt$SharedTransitionScope$1$3$1(sharedTransitionScopeImpl);
            composer.o(u6);
        }
        EffectsKt.c(b0Var, (l) u6, composer);
        return b0Var;
    }
}
