package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.Transition;
import java.util.HashMap;

/* loaded from: classes2.dex */
public class ChangeClipBounds extends Transition {

    /* renamed from: a, reason: collision with root package name */
    public static final String[] f21531a = {"android:clipBounds:clip"};

    /* renamed from: b, reason: collision with root package name */
    public static final Rect f21532b = new Rect();

    /* loaded from: classes2.dex */
    public static class Listener extends AnimatorListenerAdapter implements Transition.TransitionListener {

        /* renamed from: a, reason: collision with root package name */
        public final Rect f21533a;

        /* renamed from: b, reason: collision with root package name */
        public final Rect f21534b;

        /* renamed from: c, reason: collision with root package name */
        public final View f21535c;

        public Listener(View view, Rect rect, Rect rect2) {
            this.f21535c = view;
            this.f21533a = rect;
            this.f21534b = rect2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            onAnimationEnd(animator, false);
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void onTransitionCancel(Transition transition) {
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void onTransitionEnd(Transition transition) {
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void onTransitionPause(Transition transition) {
            View view = this.f21535c;
            Rect clipBounds = view.getClipBounds();
            if (clipBounds == null) {
                clipBounds = ChangeClipBounds.f21532b;
            }
            view.setTag(com.cooldev.gba.emulator.gameboy.R.id.transition_clip, clipBounds);
            view.setClipBounds(this.f21534b);
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void onTransitionResume(Transition transition) {
            View view = this.f21535c;
            view.setClipBounds((Rect) view.getTag(com.cooldev.gba.emulator.gameboy.R.id.transition_clip));
            view.setTag(com.cooldev.gba.emulator.gameboy.R.id.transition_clip, null);
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void onTransitionStart(Transition transition) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator, boolean z2) {
            View view = this.f21535c;
            if (!z2) {
                view.setClipBounds(this.f21534b);
            } else {
                view.setClipBounds(this.f21533a);
            }
        }
    }

    public static void g(TransitionValues transitionValues, boolean z2) {
        View view = transitionValues.f21618b;
        if (view.getVisibility() == 8) {
            return;
        }
        Rect rect = z2 ? (Rect) view.getTag(com.cooldev.gba.emulator.gameboy.R.id.transition_clip) : null;
        if (rect == null) {
            rect = view.getClipBounds();
        }
        Rect rect2 = rect != f21532b ? rect : null;
        HashMap hashMap = transitionValues.f21617a;
        hashMap.put("android:clipBounds:clip", rect2);
        if (rect2 == null) {
            hashMap.put("android:clipBounds:bounds", new Rect(0, 0, view.getWidth(), view.getHeight()));
        }
    }

    @Override // androidx.transition.Transition
    public final void captureEndValues(TransitionValues transitionValues) {
        g(transitionValues, false);
    }

    @Override // androidx.transition.Transition
    public final void captureStartValues(TransitionValues transitionValues) {
        g(transitionValues, true);
    }

    /* JADX WARN: Type inference failed for: r8v3, types: [android.animation.TypeEvaluator, java.lang.Object, androidx.transition.RectEvaluator] */
    @Override // androidx.transition.Transition
    public final Animator createAnimator(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
        if (transitionValues == null || transitionValues2 == null) {
            return null;
        }
        HashMap hashMap = transitionValues.f21617a;
        if (!hashMap.containsKey("android:clipBounds:clip")) {
            return null;
        }
        HashMap hashMap2 = transitionValues2.f21617a;
        if (!hashMap2.containsKey("android:clipBounds:clip")) {
            return null;
        }
        Rect rect = (Rect) hashMap.get("android:clipBounds:clip");
        Rect rect2 = (Rect) hashMap2.get("android:clipBounds:clip");
        if (rect == null && rect2 == null) {
            return null;
        }
        Rect rect3 = rect == null ? (Rect) hashMap.get("android:clipBounds:bounds") : rect;
        Rect rect4 = rect2 == null ? (Rect) hashMap2.get("android:clipBounds:bounds") : rect2;
        if (rect3.equals(rect4)) {
            return null;
        }
        transitionValues2.f21618b.setClipBounds(rect);
        Rect rect5 = new Rect();
        ?? obj = new Object();
        obj.f21586a = rect5;
        ObjectAnimator ofObject = ObjectAnimator.ofObject(transitionValues2.f21618b, (Property<View, V>) ViewUtils.f21628c, (TypeEvaluator) obj, rect3, rect4);
        Listener listener = new Listener(transitionValues2.f21618b, rect, rect2);
        ofObject.addListener(listener);
        addListener(listener);
        return ofObject;
    }

    @Override // androidx.transition.Transition
    public final String[] getTransitionProperties() {
        return f21531a;
    }

    @Override // androidx.transition.Transition
    public final boolean isSeekingSupported() {
        return true;
    }
}
