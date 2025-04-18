package androidx.transition;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes2.dex */
public class Slide extends Visibility {

    /* renamed from: androidx.transition.Slide$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass1 extends CalculateSlideHorizontal {
    }

    /* renamed from: androidx.transition.Slide$2, reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass2 extends CalculateSlideHorizontal {
    }

    /* renamed from: androidx.transition.Slide$3, reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass3 extends CalculateSlideVertical {
    }

    /* renamed from: androidx.transition.Slide$4, reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass4 extends CalculateSlideHorizontal {
    }

    /* renamed from: androidx.transition.Slide$5, reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass5 extends CalculateSlideHorizontal {
    }

    /* renamed from: androidx.transition.Slide$6, reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass6 extends CalculateSlideVertical {
    }

    /* loaded from: classes2.dex */
    public interface CalculateSlide {
    }

    /* loaded from: classes2.dex */
    public static abstract class CalculateSlideHorizontal implements CalculateSlide {
    }

    /* loaded from: classes2.dex */
    public static abstract class CalculateSlideVertical implements CalculateSlide {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    /* loaded from: classes2.dex */
    public @interface GravityFlag {
    }

    static {
        new DecelerateInterpolator();
        new AccelerateInterpolator();
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    public final void captureEndValues(TransitionValues transitionValues) {
        super.captureEndValues(transitionValues);
        int[] iArr = new int[2];
        transitionValues.f21618b.getLocationOnScreen(iArr);
        transitionValues.f21617a.put("android:slide:screenPosition", iArr);
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    public final void captureStartValues(TransitionValues transitionValues) {
        super.captureStartValues(transitionValues);
        int[] iArr = new int[2];
        transitionValues.f21618b.getLocationOnScreen(iArr);
        transitionValues.f21617a.put("android:slide:screenPosition", iArr);
    }

    @Override // androidx.transition.Transition
    public final boolean isSeekingSupported() {
        return true;
    }

    @Override // androidx.transition.Visibility
    public final Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        if (transitionValues2 == null) {
            return null;
        }
        view.getTranslationX();
        view.getTranslationY();
        throw null;
    }

    @Override // androidx.transition.Visibility
    public final Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        if (transitionValues == null) {
            return null;
        }
        view.getTranslationX();
        view.getTranslationY();
        throw null;
    }
}
