package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.Transition;

/* loaded from: classes.dex */
public class Fade extends Visibility {

    /* loaded from: classes.dex */
    public static class FadeAnimatorListener extends AnimatorListenerAdapter implements Transition.TransitionListener {

        /* renamed from: a, reason: collision with root package name */
        public final View f21562a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f21563b = false;

        public FadeAnimatorListener(View view) {
            this.f21562a = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            ViewUtils.f21626a.b(this.f21562a, 1.0f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            onAnimationEnd(animator, false);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            View view = this.f21562a;
            if (view.hasOverlappingRendering() && view.getLayerType() == 0) {
                this.f21563b = true;
                view.setLayerType(2, null);
            }
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void onTransitionCancel(Transition transition) {
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void onTransitionEnd(Transition transition) {
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void onTransitionPause(Transition transition) {
            View view = this.f21562a;
            view.setTag(com.cooldev.gba.emulator.gameboy.R.id.transition_pause_alpha, Float.valueOf(view.getVisibility() == 0 ? ViewUtils.f21626a.a(view) : 0.0f));
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void onTransitionResume(Transition transition) {
            this.f21562a.setTag(com.cooldev.gba.emulator.gameboy.R.id.transition_pause_alpha, null);
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void onTransitionStart(Transition transition) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator, boolean z2) {
            boolean z3 = this.f21563b;
            View view = this.f21562a;
            if (z3) {
                view.setLayerType(0, null);
            }
            if (z2) {
                return;
            }
            ViewUtilsApi23 viewUtilsApi23 = ViewUtils.f21626a;
            viewUtilsApi23.b(view, 1.0f);
            viewUtilsApi23.getClass();
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void onTransitionStart(Transition transition, boolean z2) {
        }
    }

    public Fade(int i2) {
        setMode(i2);
    }

    public static float j(TransitionValues transitionValues, float f2) {
        Float f3;
        return (transitionValues == null || (f3 = (Float) transitionValues.f21617a.get("android:fade:transitionAlpha")) == null) ? f2 : f3.floatValue();
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    public final void captureStartValues(TransitionValues transitionValues) {
        super.captureStartValues(transitionValues);
        Float f2 = (Float) transitionValues.f21618b.getTag(com.cooldev.gba.emulator.gameboy.R.id.transition_pause_alpha);
        if (f2 == null) {
            if (transitionValues.f21618b.getVisibility() == 0) {
                f2 = Float.valueOf(ViewUtils.f21626a.a(transitionValues.f21618b));
            } else {
                f2 = Float.valueOf(0.0f);
            }
        }
        transitionValues.f21617a.put("android:fade:transitionAlpha", f2);
    }

    public final ObjectAnimator i(float f2, float f3, View view) {
        if (f2 == f3) {
            return null;
        }
        ViewUtils.f21626a.b(view, f2);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) ViewUtils.f21627b, f3);
        FadeAnimatorListener fadeAnimatorListener = new FadeAnimatorListener(view);
        ofFloat.addListener(fadeAnimatorListener);
        getRootTransition().addListener(fadeAnimatorListener);
        return ofFloat;
    }

    @Override // androidx.transition.Transition
    public final boolean isSeekingSupported() {
        return true;
    }

    @Override // androidx.transition.Visibility
    public final Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        ViewUtils.f21626a.getClass();
        return i(j(transitionValues, 0.0f), 1.0f, view);
    }

    @Override // androidx.transition.Visibility
    public final Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        ViewUtilsApi23 viewUtilsApi23 = ViewUtils.f21626a;
        viewUtilsApi23.getClass();
        ObjectAnimator i2 = i(j(transitionValues, 1.0f), 0.0f, view);
        if (i2 == null) {
            viewUtilsApi23.b(view, j(transitionValues2, 1.0f));
        }
        return i2;
    }
}
