package androidx.compose.animation;

import androidx.collection.MutableScatterMap;
import androidx.compose.animation.AnimatedContentTransitionScopeImpl;
import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutModifierKt;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;
import q0.p;
import q0.q;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class AnimatedContentKt$AnimatedContent$6$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Transition f1639a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1640b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f1641c;
    public final /* synthetic */ AnimatedContentTransitionScopeImpl d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ SnapshotStateList f1642f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ q0.r f1643g;

    /* renamed from: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$5, reason: invalid class name */
    /* loaded from: classes3.dex */
    final class AnonymousClass5 extends r implements q {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ SnapshotStateList f1649a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Object f1650b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ AnimatedContentTransitionScopeImpl f1651c;
        public final /* synthetic */ q0.r d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(SnapshotStateList snapshotStateList, Object obj, AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl, q0.r rVar) {
            super(3);
            this.f1649a = snapshotStateList;
            this.f1650b = obj;
            this.f1651c = animatedContentTransitionScopeImpl;
            this.d = rVar;
        }

        @Override // q0.q
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            AnimatedVisibilityScope animatedVisibilityScope = (AnimatedVisibilityScope) obj;
            Composer composer = (Composer) obj2;
            int intValue = ((Number) obj3).intValue();
            if ((intValue & 6) == 0) {
                intValue |= (intValue & 8) == 0 ? composer.I(animatedVisibilityScope) : composer.w(animatedVisibilityScope) ? 4 : 2;
            }
            if ((intValue & 19) == 18 && composer.i()) {
                composer.A();
            } else {
                SnapshotStateList snapshotStateList = this.f1649a;
                boolean I = composer.I(snapshotStateList);
                Object obj4 = this.f1650b;
                boolean w = I | composer.w(obj4);
                AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl = this.f1651c;
                boolean w2 = w | composer.w(animatedContentTransitionScopeImpl);
                Object u2 = composer.u();
                Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f13690a;
                if (w2 || u2 == composer$Companion$Empty$1) {
                    u2 = new AnimatedContentKt$AnimatedContent$6$1$5$1$1(snapshotStateList, obj4, animatedContentTransitionScopeImpl);
                    composer.o(u2);
                }
                EffectsKt.c(animatedVisibilityScope, (l) u2, composer);
                MutableScatterMap mutableScatterMap = animatedContentTransitionScopeImpl.d;
                p0.a.q(animatedVisibilityScope, "null cannot be cast to non-null type androidx.compose.animation.AnimatedVisibilityScopeImpl");
                mutableScatterMap.k(obj4, ((AnimatedVisibilityScopeImpl) animatedVisibilityScope).f1771a);
                Object u3 = composer.u();
                if (u3 == composer$Companion$Empty$1) {
                    u3 = new AnimatedContentScopeImpl(animatedVisibilityScope);
                    composer.o(u3);
                }
                this.d.invoke((AnimatedContentScopeImpl) u3, obj4, composer, 0);
            }
            return b0.f30125a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimatedContentKt$AnimatedContent$6$1(Transition transition, Object obj, l lVar, AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl, SnapshotStateList snapshotStateList, q0.r rVar) {
        super(2);
        this.f1639a = transition;
        this.f1640b = obj;
        this.f1641c = lVar;
        this.d = animatedContentTransitionScopeImpl;
        this.f1642f = snapshotStateList;
        this.f1643g = rVar;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.i()) {
            composer.A();
        } else {
            Object u2 = composer.u();
            Object obj3 = Composer.Companion.f13690a;
            l lVar = this.f1641c;
            AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl = this.d;
            if (u2 == obj3) {
                u2 = (ContentTransform) lVar.invoke(animatedContentTransitionScopeImpl);
                composer.o(u2);
            }
            ContentTransform contentTransform = (ContentTransform) u2;
            Transition transition = this.f1639a;
            Object a2 = transition.f().a();
            Object obj4 = this.f1640b;
            boolean a3 = composer.a(p0.a.g(a2, obj4));
            Object u3 = composer.u();
            if (a3 || u3 == obj3) {
                u3 = p0.a.g(transition.f().a(), obj4) ? ExitTransition.f1877a : ((ContentTransform) lVar.invoke(animatedContentTransitionScopeImpl)).f1780b;
                composer.o(u3);
            }
            ExitTransition exitTransition = (ExitTransition) u3;
            Object u4 = composer.u();
            ParcelableSnapshotMutableState parcelableSnapshotMutableState = transition.d;
            if (u4 == obj3) {
                u4 = new AnimatedContentTransitionScopeImpl.ChildData(p0.a.g(obj4, parcelableSnapshotMutableState.getValue()));
                composer.o(u4);
            }
            AnimatedContentTransitionScopeImpl.ChildData childData = (AnimatedContentTransitionScopeImpl.ChildData) u4;
            EnterTransition enterTransition = contentTransform.f1779a;
            Modifier.Companion companion = Modifier.Companion.f14687a;
            boolean w = composer.w(contentTransform);
            Object u5 = composer.u();
            if (w || u5 == obj3) {
                u5 = new AnimatedContentKt$AnimatedContent$6$1$1$1(contentTransform);
                composer.o(u5);
            }
            Modifier a4 = LayoutModifierKt.a(companion, (q) u5);
            childData.f1671a.setValue(Boolean.valueOf(p0.a.g(obj4, parcelableSnapshotMutableState.getValue())));
            Modifier T0 = a4.T0(childData);
            Transition transition2 = this.f1639a;
            boolean w2 = composer.w(obj4);
            Object u6 = composer.u();
            if (w2 || u6 == obj3) {
                u6 = new AnimatedContentKt$AnimatedContent$6$1$3$1(obj4);
                composer.o(u6);
            }
            l lVar2 = (l) u6;
            boolean I = composer.I(exitTransition);
            Object u7 = composer.u();
            if (I || u7 == obj3) {
                u7 = new AnimatedContentKt$AnimatedContent$6$1$4$1(exitTransition);
                composer.o(u7);
            }
            AnimatedVisibilityKt.a(transition2, lVar2, T0, enterTransition, exitTransition, (p) u7, null, ComposableLambdaKt.c(-616195562, new AnonymousClass5(this.f1642f, obj4, animatedContentTransitionScopeImpl, this.f1643g), composer), composer, 12582912, 64);
        }
        return b0.f30125a;
    }
}
