package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.ObjectAnimatorUtils;
import androidx.transition.Transition;
import java.util.HashMap;

/* loaded from: classes.dex */
public class ChangeBounds extends Transition {

    /* renamed from: a, reason: collision with root package name */
    public static final String[] f21518a = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* renamed from: b, reason: collision with root package name */
    public static final Property f21519b = new Property(PointF.class, "topLeft");

    /* renamed from: c, reason: collision with root package name */
    public static final Property f21520c = new Property(PointF.class, "bottomRight");
    public static final Property d = new Property(PointF.class, "bottomRight");

    /* renamed from: f, reason: collision with root package name */
    public static final Property f21521f = new Property(PointF.class, "topLeft");

    /* renamed from: g, reason: collision with root package name */
    public static final Property f21522g = new Property(PointF.class, "position");

    /* renamed from: androidx.transition.ChangeBounds$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass1 extends Property<ViewBounds, PointF> {
        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(ViewBounds viewBounds) {
            return null;
        }

        @Override // android.util.Property
        public final void set(ViewBounds viewBounds, PointF pointF) {
            ViewBounds viewBounds2 = viewBounds;
            PointF pointF2 = pointF;
            viewBounds2.getClass();
            viewBounds2.f21526a = Math.round(pointF2.x);
            int round = Math.round(pointF2.y);
            viewBounds2.f21527b = round;
            int i2 = viewBounds2.f21529f + 1;
            viewBounds2.f21529f = i2;
            if (i2 == viewBounds2.f21530g) {
                ViewUtils.a(viewBounds2.e, viewBounds2.f21526a, round, viewBounds2.f21528c, viewBounds2.d);
                viewBounds2.f21529f = 0;
                viewBounds2.f21530g = 0;
            }
        }
    }

    /* renamed from: androidx.transition.ChangeBounds$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass2 extends Property<ViewBounds, PointF> {
        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(ViewBounds viewBounds) {
            return null;
        }

        @Override // android.util.Property
        public final void set(ViewBounds viewBounds, PointF pointF) {
            ViewBounds viewBounds2 = viewBounds;
            PointF pointF2 = pointF;
            viewBounds2.getClass();
            viewBounds2.f21528c = Math.round(pointF2.x);
            int round = Math.round(pointF2.y);
            viewBounds2.d = round;
            int i2 = viewBounds2.f21530g + 1;
            viewBounds2.f21530g = i2;
            if (viewBounds2.f21529f == i2) {
                ViewUtils.a(viewBounds2.e, viewBounds2.f21526a, viewBounds2.f21527b, viewBounds2.f21528c, round);
                viewBounds2.f21529f = 0;
                viewBounds2.f21530g = 0;
            }
        }
    }

    /* renamed from: androidx.transition.ChangeBounds$3, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass3 extends Property<View, PointF> {
        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        public final void set(View view, PointF pointF) {
            View view2 = view;
            PointF pointF2 = pointF;
            ViewUtils.a(view2, view2.getLeft(), view2.getTop(), Math.round(pointF2.x), Math.round(pointF2.y));
        }
    }

    /* renamed from: androidx.transition.ChangeBounds$4, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass4 extends Property<View, PointF> {
        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        public final void set(View view, PointF pointF) {
            View view2 = view;
            PointF pointF2 = pointF;
            ViewUtils.a(view2, Math.round(pointF2.x), Math.round(pointF2.y), view2.getRight(), view2.getBottom());
        }
    }

    /* renamed from: androidx.transition.ChangeBounds$5, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass5 extends Property<View, PointF> {
        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        public final void set(View view, PointF pointF) {
            View view2 = view;
            PointF pointF2 = pointF;
            int round = Math.round(pointF2.x);
            int round2 = Math.round(pointF2.y);
            ViewUtils.a(view2, round, round2, view2.getWidth() + round, view2.getHeight() + round2);
        }
    }

    /* loaded from: classes.dex */
    public static class ClipListener extends AnimatorListenerAdapter implements Transition.TransitionListener {

        /* renamed from: a, reason: collision with root package name */
        public boolean f21523a;

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            onAnimationEnd(animator, false);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            onAnimationStart(animator, false);
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void onTransitionCancel(Transition transition) {
            this.f21523a = true;
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void onTransitionEnd(Transition transition) {
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void onTransitionPause(Transition transition) {
            throw null;
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void onTransitionResume(Transition transition) {
            throw null;
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void onTransitionStart(Transition transition) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator, boolean z2) {
            if (!this.f21523a) {
                throw null;
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator, boolean z2) {
            ViewUtils.a(null, 0, 0, Math.max(0, 0), Math.max(0, 0));
            throw null;
        }
    }

    /* loaded from: classes.dex */
    public static class SuppressLayoutListener extends TransitionListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        public boolean f21524a = false;

        /* renamed from: b, reason: collision with root package name */
        public final ViewGroup f21525b;

        public SuppressLayoutListener(ViewGroup viewGroup) {
            this.f21525b = viewGroup;
        }

        @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
        public final void onTransitionCancel(Transition transition) {
            ViewGroupUtils.a(this.f21525b, false);
            this.f21524a = true;
        }

        @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
        public final void onTransitionEnd(Transition transition) {
            if (!this.f21524a) {
                ViewGroupUtils.a(this.f21525b, false);
            }
            transition.removeListener(this);
        }

        @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
        public final void onTransitionPause(Transition transition) {
            ViewGroupUtils.a(this.f21525b, false);
        }

        @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
        public final void onTransitionResume(Transition transition) {
            ViewGroupUtils.a(this.f21525b, true);
        }
    }

    /* loaded from: classes.dex */
    public static class ViewBounds {

        /* renamed from: a, reason: collision with root package name */
        public int f21526a;

        /* renamed from: b, reason: collision with root package name */
        public int f21527b;

        /* renamed from: c, reason: collision with root package name */
        public int f21528c;
        public int d;
        public final View e;

        /* renamed from: f, reason: collision with root package name */
        public int f21529f;

        /* renamed from: g, reason: collision with root package name */
        public int f21530g;

        public ViewBounds(View view) {
            this.e = view;
        }
    }

    public static void g(TransitionValues transitionValues) {
        View view = transitionValues.f21618b;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        HashMap hashMap = transitionValues.f21617a;
        hashMap.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        hashMap.put("android:changeBounds:parent", transitionValues.f21618b.getParent());
    }

    @Override // androidx.transition.Transition
    public final void captureEndValues(TransitionValues transitionValues) {
        g(transitionValues);
    }

    @Override // androidx.transition.Transition
    public final void captureStartValues(TransitionValues transitionValues) {
        g(transitionValues);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.transition.Transition
    public final Animator createAnimator(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
        int i2;
        ObjectAnimator a2;
        if (transitionValues == null || transitionValues2 == null) {
            return null;
        }
        HashMap hashMap = transitionValues.f21617a;
        HashMap hashMap2 = transitionValues2.f21617a;
        ViewGroup viewGroup2 = (ViewGroup) hashMap.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) hashMap2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view = transitionValues2.f21618b;
        Rect rect = (Rect) hashMap.get("android:changeBounds:bounds");
        Rect rect2 = (Rect) hashMap2.get("android:changeBounds:bounds");
        int i3 = rect.left;
        int i4 = rect2.left;
        int i5 = rect.top;
        int i6 = rect2.top;
        int i7 = rect.right;
        int i8 = rect2.right;
        int i9 = rect.bottom;
        int i10 = rect2.bottom;
        int i11 = i7 - i3;
        int i12 = i9 - i5;
        int i13 = i8 - i4;
        int i14 = i10 - i6;
        Rect rect3 = (Rect) hashMap.get("android:changeBounds:clip");
        Rect rect4 = (Rect) hashMap2.get("android:changeBounds:clip");
        if ((i11 == 0 || i12 == 0) && (i13 == 0 || i14 == 0)) {
            i2 = 0;
        } else {
            i2 = (i3 == i4 && i5 == i6) ? 0 : 1;
            if (i7 != i8 || i9 != i10) {
                i2++;
            }
        }
        if ((rect3 != null && !rect3.equals(rect4)) || (rect3 == null && rect4 != null)) {
            i2++;
        }
        int i15 = i2;
        if (i15 <= 0) {
            return null;
        }
        ViewUtils.a(view, i3, i5, i7, i9);
        if (i15 != 2) {
            a2 = (i3 == i4 && i5 == i6) ? ObjectAnimatorUtils.Api21Impl.a(view, d, getPathMotion().getPath(i7, i9, i8, i10)) : ObjectAnimatorUtils.Api21Impl.a(view, f21521f, getPathMotion().getPath(i3, i5, i4, i6));
        } else if (i11 == i13 && i12 == i14) {
            a2 = ObjectAnimatorUtils.Api21Impl.a(view, f21522g, getPathMotion().getPath(i3, i5, i4, i6));
        } else {
            ViewBounds viewBounds = new ViewBounds(view);
            ObjectAnimator a3 = ObjectAnimatorUtils.Api21Impl.a(viewBounds, f21519b, getPathMotion().getPath(i3, i5, i4, i6));
            ObjectAnimator a4 = ObjectAnimatorUtils.Api21Impl.a(viewBounds, f21520c, getPathMotion().getPath(i7, i9, i8, i10));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(a3, a4);
            animatorSet.addListener(new AnimatorListenerAdapter(viewBounds) { // from class: androidx.transition.ChangeBounds.6
                private final ViewBounds mViewBounds;

                {
                    this.mViewBounds = viewBounds;
                }
            });
            a2 = animatorSet;
        }
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
            ViewGroupUtils.a(viewGroup4, true);
            getRootTransition().addListener(new SuppressLayoutListener(viewGroup4));
        }
        return a2;
    }

    @Override // androidx.transition.Transition
    public final String[] getTransitionProperties() {
        return f21518a;
    }

    @Override // androidx.transition.Transition
    public final boolean isSeekingSupported() {
        return true;
    }
}
