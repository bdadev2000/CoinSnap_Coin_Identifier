package androidx.compose.animation.core;

import android.support.v4.media.d;
import androidx.compose.animation.EnterExitState;
import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.EffectsKt;
import b1.f0;
import d0.h;
import d0.i;
import q0.l;
import q0.p;

/* loaded from: classes2.dex */
public final class TransitionKt {

    /* renamed from: a, reason: collision with root package name */
    public static final h f2311a = f0.s(i.f30133c, TransitionKt$SeekableStateObserver$2.f2320a);

    public static final Transition a(Transition transition, EnterExitState enterExitState, EnterExitState enterExitState2, Composer composer, int i2) {
        int i3 = (i2 & 14) ^ 6;
        boolean z2 = true;
        boolean z3 = (i3 > 4 && composer.I(transition)) || (i2 & 6) == 4;
        Object u2 = composer.u();
        Object obj = Composer.Companion.f13690a;
        if (z3 || u2 == obj) {
            u2 = new Transition(new MutableTransitionState(enterExitState), transition, d.r(new StringBuilder(), transition.f2269c, " > EnterExitTransition"));
            composer.o(u2);
        }
        Transition transition2 = (Transition) u2;
        if ((i3 <= 4 || !composer.I(transition)) && (i2 & 6) != 4) {
            z2 = false;
        }
        boolean I = composer.I(transition2) | z2;
        Object u3 = composer.u();
        if (I || u3 == obj) {
            u3 = new TransitionKt$createChildTransitionInternal$1$1(transition, transition2);
            composer.o(u3);
        }
        EffectsKt.c(transition2, (l) u3, composer);
        if (transition.g()) {
            transition2.l(enterExitState, transition.f2276l, enterExitState2);
        } else {
            transition2.q(enterExitState2);
            transition2.f2275k.setValue(Boolean.FALSE);
        }
        return transition2;
    }

    public static final Transition.DeferredAnimation b(Transition transition, TwoWayConverter twoWayConverter, String str, Composer composer, int i2, int i3) {
        Transition.DeferredAnimation.DeferredAnimationData deferredAnimationData;
        if ((i3 & 2) != 0) {
            str = "DeferredAnimation";
        }
        int i4 = (i2 & 14) ^ 6;
        boolean z2 = true;
        boolean z3 = (i4 > 4 && composer.I(transition)) || (i2 & 6) == 4;
        Object u2 = composer.u();
        Object obj = Composer.Companion.f13690a;
        if (z3 || u2 == obj) {
            u2 = new Transition.DeferredAnimation(twoWayConverter, str);
            composer.o(u2);
        }
        Transition.DeferredAnimation deferredAnimation = (Transition.DeferredAnimation) u2;
        if ((i4 <= 4 || !composer.I(transition)) && (i2 & 6) != 4) {
            z2 = false;
        }
        boolean w = composer.w(deferredAnimation) | z2;
        Object u3 = composer.u();
        if (w || u3 == obj) {
            u3 = new TransitionKt$createDeferredAnimation$1$1(transition, deferredAnimation);
            composer.o(u3);
        }
        EffectsKt.c(deferredAnimation, (l) u3, composer);
        if (transition.g() && (deferredAnimationData = (Transition.DeferredAnimation.DeferredAnimationData) deferredAnimation.f2279b.getValue()) != null) {
            l lVar = deferredAnimationData.f2283c;
            Transition transition2 = Transition.this;
            deferredAnimationData.f2281a.t(lVar.invoke(transition2.f().c()), deferredAnimationData.f2283c.invoke(transition2.f().a()), (FiniteAnimationSpec) deferredAnimationData.f2282b.invoke(transition2.f()));
        }
        return deferredAnimation;
    }

    public static final Transition.TransitionAnimationState c(Transition transition, Object obj, Object obj2, FiniteAnimationSpec finiteAnimationSpec, TwoWayConverter twoWayConverter, Composer composer, int i2) {
        int i3 = (i2 & 14) ^ 6;
        boolean z2 = true;
        boolean z3 = (i3 > 4 && composer.I(transition)) || (i2 & 6) == 4;
        Object u2 = composer.u();
        Object obj3 = Composer.Companion.f13690a;
        if (z3 || u2 == obj3) {
            AnimationVector animationVector = (AnimationVector) twoWayConverter.a().invoke(obj2);
            animationVector.d();
            u2 = new Transition.TransitionAnimationState(obj, animationVector, twoWayConverter);
            composer.o(u2);
        }
        Transition.TransitionAnimationState transitionAnimationState = (Transition.TransitionAnimationState) u2;
        if (transition.g()) {
            transitionAnimationState.t(obj, obj2, finiteAnimationSpec);
        } else {
            transitionAnimationState.u(obj2, finiteAnimationSpec);
        }
        if ((i3 <= 4 || !composer.I(transition)) && (i2 & 6) != 4) {
            z2 = false;
        }
        boolean I = composer.I(transitionAnimationState) | z2;
        Object u3 = composer.u();
        if (I || u3 == obj3) {
            u3 = new TransitionKt$createTransitionAnimation$1$1(transition, transitionAnimationState);
            composer.o(u3);
        }
        EffectsKt.c(transitionAnimationState, (l) u3, composer);
        return transitionAnimationState;
    }

    public static final Transition d(TransitionState transitionState, String str, Composer composer, int i2) {
        int i3 = (i2 & 14) ^ 6;
        boolean z2 = true;
        boolean z3 = (i3 > 4 && composer.I(transitionState)) || (i2 & 6) == 4;
        Object u2 = composer.u();
        Object obj = Composer.Companion.f13690a;
        if (z3 || u2 == obj) {
            u2 = new Transition(transitionState, null, str);
            composer.o(u2);
        }
        Transition transition = (Transition) u2;
        if (transitionState instanceof SeekableTransitionState) {
            composer.J(1030413636);
            Object a2 = transitionState.a();
            Object b2 = transitionState.b();
            if ((i3 <= 4 || !composer.I(transitionState)) && (i2 & 6) != 4) {
                z2 = false;
            }
            Object u3 = composer.u();
            if (z2 || u3 == obj) {
                u3 = new TransitionKt$rememberTransition$1$1(transitionState, null);
                composer.o(u3);
            }
            EffectsKt.e(a2, b2, (p) u3, composer);
            composer.D();
        } else {
            composer.J(1030875195);
            transition.a(transitionState.b(), composer, 0);
            composer.D();
        }
        boolean I = composer.I(transition);
        Object u4 = composer.u();
        if (I || u4 == obj) {
            u4 = new TransitionKt$rememberTransition$2$1(transition);
            composer.o(u4);
        }
        EffectsKt.c(transition, (l) u4, composer);
        return transition;
    }

    public static final Transition e(Object obj, String str, Composer composer, int i2, int i3) {
        if ((i3 & 2) != 0) {
            str = null;
        }
        Object u2 = composer.u();
        Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f13690a;
        if (u2 == composer$Companion$Empty$1) {
            u2 = new Transition(new MutableTransitionState(obj), null, str);
            composer.o(u2);
        }
        Transition transition = (Transition) u2;
        transition.a(obj, composer, (i2 & 8) | 48 | (i2 & 14));
        Object u3 = composer.u();
        if (u3 == composer$Companion$Empty$1) {
            u3 = new TransitionKt$updateTransition$1$1(transition);
            composer.o(u3);
        }
        EffectsKt.c(transition, (l) u3, composer);
        return transition;
    }
}
