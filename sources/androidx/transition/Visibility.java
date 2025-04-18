package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.transition.Transition;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class Visibility extends Transition {
    public static final int MODE_IN = 1;
    public static final int MODE_OUT = 2;
    private static final String PROPNAME_SCREEN_LOCATION = "android:visibility:screenLocation";
    private int mMode = 3;
    static final String PROPNAME_VISIBILITY = "android:visibility:visibility";
    private static final String PROPNAME_PARENT = "android:visibility:parent";
    private static final String[] sTransitionProperties = {PROPNAME_VISIBILITY, PROPNAME_PARENT};

    /* loaded from: classes.dex */
    public static class DisappearListener extends AnimatorListenerAdapter implements Transition.TransitionListener {

        /* renamed from: a, reason: collision with root package name */
        public final View f21635a;

        /* renamed from: b, reason: collision with root package name */
        public final int f21636b;

        /* renamed from: c, reason: collision with root package name */
        public final ViewGroup f21637c;
        public boolean e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f21638f = false;
        public final boolean d = true;

        public DisappearListener(View view, int i2) {
            this.f21635a = view;
            this.f21636b = i2;
            this.f21637c = (ViewGroup) view.getParent();
            a(true);
        }

        public final void a(boolean z2) {
            ViewGroup viewGroup;
            if (!this.d || this.e == z2 || (viewGroup = this.f21637c) == null) {
                return;
            }
            this.e = z2;
            ViewGroupUtils.a(viewGroup, z2);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            this.f21638f = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            if (!this.f21638f) {
                ViewUtils.b(this.f21635a, this.f21636b);
                ViewGroup viewGroup = this.f21637c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            a(false);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void onTransitionCancel(Transition transition) {
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void onTransitionEnd(Transition transition) {
            transition.removeListener(this);
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void onTransitionPause(Transition transition) {
            a(false);
            if (this.f21638f) {
                return;
            }
            ViewUtils.b(this.f21635a, this.f21636b);
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void onTransitionResume(Transition transition) {
            a(true);
            if (this.f21638f) {
                return;
            }
            ViewUtils.b(this.f21635a, 0);
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void onTransitionStart(Transition transition) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator, boolean z2) {
            if (z2) {
                ViewUtils.b(this.f21635a, 0);
                ViewGroup viewGroup = this.f21637c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator, boolean z2) {
            if (z2) {
                return;
            }
            if (!this.f21638f) {
                ViewUtils.b(this.f21635a, this.f21636b);
                ViewGroup viewGroup = this.f21637c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            a(false);
        }
    }

    @SuppressLint({"UniqueConstants"})
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    /* loaded from: classes.dex */
    public @interface Mode {
    }

    /* loaded from: classes.dex */
    public class OverlayListener extends AnimatorListenerAdapter implements Transition.TransitionListener {

        /* renamed from: a, reason: collision with root package name */
        public final ViewGroup f21639a;

        /* renamed from: b, reason: collision with root package name */
        public final View f21640b;

        /* renamed from: c, reason: collision with root package name */
        public final View f21641c;
        public boolean d = true;

        public OverlayListener(ViewGroup viewGroup, View view, View view2) {
            this.f21639a = viewGroup;
            this.f21640b = view;
            this.f21641c = view2;
        }

        public final void a() {
            this.f21641c.setTag(com.cooldev.gba.emulator.gameboy.R.id.save_overlay_view, null);
            this.f21639a.getOverlay().remove(this.f21640b);
            this.d = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            a();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public final void onAnimationPause(Animator animator) {
            this.f21639a.getOverlay().remove(this.f21640b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public final void onAnimationResume(Animator animator) {
            View view = this.f21640b;
            if (view.getParent() == null) {
                this.f21639a.getOverlay().add(view);
            } else {
                Visibility.this.cancel();
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator, boolean z2) {
            if (z2) {
                View view = this.f21641c;
                View view2 = this.f21640b;
                view.setTag(com.cooldev.gba.emulator.gameboy.R.id.save_overlay_view, view2);
                this.f21639a.getOverlay().add(view2);
                this.d = true;
            }
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void onTransitionCancel(Transition transition) {
            if (this.d) {
                a();
            }
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void onTransitionEnd(Transition transition) {
            transition.removeListener(this);
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void onTransitionPause(Transition transition) {
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void onTransitionResume(Transition transition) {
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void onTransitionStart(Transition transition) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator, boolean z2) {
            if (z2) {
                return;
            }
            a();
        }
    }

    /* loaded from: classes.dex */
    public static class VisibilityInfo {

        /* renamed from: a, reason: collision with root package name */
        public boolean f21642a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f21643b;

        /* renamed from: c, reason: collision with root package name */
        public int f21644c;
        public int d;
        public ViewGroup e;

        /* renamed from: f, reason: collision with root package name */
        public ViewGroup f21645f;
    }

    public static void g(TransitionValues transitionValues) {
        int visibility = transitionValues.f21618b.getVisibility();
        HashMap hashMap = transitionValues.f21617a;
        hashMap.put(PROPNAME_VISIBILITY, Integer.valueOf(visibility));
        hashMap.put(PROPNAME_PARENT, transitionValues.f21618b.getParent());
        int[] iArr = new int[2];
        transitionValues.f21618b.getLocationOnScreen(iArr);
        hashMap.put(PROPNAME_SCREEN_LOCATION, iArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0059 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0035  */
    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.transition.Visibility$VisibilityInfo, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static androidx.transition.Visibility.VisibilityInfo h(androidx.transition.TransitionValues r8, androidx.transition.TransitionValues r9) {
        /*
            androidx.transition.Visibility$VisibilityInfo r0 = new androidx.transition.Visibility$VisibilityInfo
            r0.<init>()
            r1 = 0
            r0.f21642a = r1
            r0.f21643b = r1
            r2 = 0
            r3 = -1
            java.lang.String r4 = "android:visibility:parent"
            java.lang.String r5 = "android:visibility:visibility"
            if (r8 == 0) goto L2f
            java.util.HashMap r6 = r8.f21617a
            boolean r7 = r6.containsKey(r5)
            if (r7 == 0) goto L2f
            java.lang.Object r7 = r6.get(r5)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r0.f21644c = r7
            java.lang.Object r6 = r6.get(r4)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r0.e = r6
            goto L33
        L2f:
            r0.f21644c = r3
            r0.e = r2
        L33:
            if (r9 == 0) goto L52
            java.util.HashMap r6 = r9.f21617a
            boolean r7 = r6.containsKey(r5)
            if (r7 == 0) goto L52
            java.lang.Object r2 = r6.get(r5)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r0.d = r2
            java.lang.Object r2 = r6.get(r4)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r0.f21645f = r2
            goto L56
        L52:
            r0.d = r3
            r0.f21645f = r2
        L56:
            r2 = 1
            if (r8 == 0) goto L8a
            if (r9 == 0) goto L8a
            int r8 = r0.f21644c
            int r9 = r0.d
            if (r8 != r9) goto L68
            android.view.ViewGroup r3 = r0.e
            android.view.ViewGroup r4 = r0.f21645f
            if (r3 != r4) goto L68
            return r0
        L68:
            if (r8 == r9) goto L78
            if (r8 != 0) goto L71
            r0.f21643b = r1
            r0.f21642a = r2
            goto L9f
        L71:
            if (r9 != 0) goto L9f
            r0.f21643b = r2
            r0.f21642a = r2
            goto L9f
        L78:
            android.view.ViewGroup r8 = r0.f21645f
            if (r8 != 0) goto L81
            r0.f21643b = r1
            r0.f21642a = r2
            goto L9f
        L81:
            android.view.ViewGroup r8 = r0.e
            if (r8 != 0) goto L9f
            r0.f21643b = r2
            r0.f21642a = r2
            goto L9f
        L8a:
            if (r8 != 0) goto L95
            int r8 = r0.d
            if (r8 != 0) goto L95
            r0.f21643b = r2
            r0.f21642a = r2
            goto L9f
        L95:
            if (r9 != 0) goto L9f
            int r8 = r0.f21644c
            if (r8 != 0) goto L9f
            r0.f21643b = r1
            r0.f21642a = r2
        L9f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.Visibility.h(androidx.transition.TransitionValues, androidx.transition.TransitionValues):androidx.transition.Visibility$VisibilityInfo");
    }

    @Override // androidx.transition.Transition
    public void captureEndValues(@NonNull TransitionValues transitionValues) {
        g(transitionValues);
    }

    @Override // androidx.transition.Transition
    public void captureStartValues(@NonNull TransitionValues transitionValues) {
        g(transitionValues);
    }

    @Override // androidx.transition.Transition
    @Nullable
    public Animator createAnimator(@NonNull ViewGroup viewGroup, @Nullable TransitionValues transitionValues, @Nullable TransitionValues transitionValues2) {
        VisibilityInfo h2 = h(transitionValues, transitionValues2);
        if (!h2.f21642a) {
            return null;
        }
        if (h2.e == null && h2.f21645f == null) {
            return null;
        }
        return h2.f21643b ? onAppear(viewGroup, transitionValues, h2.f21644c, transitionValues2, h2.d) : onDisappear(viewGroup, transitionValues, h2.f21644c, transitionValues2, h2.d);
    }

    public int getMode() {
        return this.mMode;
    }

    @Override // androidx.transition.Transition
    @Nullable
    public String[] getTransitionProperties() {
        return sTransitionProperties;
    }

    @Override // androidx.transition.Transition
    public boolean isTransitionRequired(@Nullable TransitionValues transitionValues, @Nullable TransitionValues transitionValues2) {
        if (transitionValues == null && transitionValues2 == null) {
            return false;
        }
        if (transitionValues != null && transitionValues2 != null && transitionValues2.f21617a.containsKey(PROPNAME_VISIBILITY) != transitionValues.f21617a.containsKey(PROPNAME_VISIBILITY)) {
            return false;
        }
        VisibilityInfo h2 = h(transitionValues, transitionValues2);
        if (h2.f21642a) {
            return h2.f21644c == 0 || h2.d == 0;
        }
        return false;
    }

    public boolean isVisible(@Nullable TransitionValues transitionValues) {
        if (transitionValues == null) {
            return false;
        }
        HashMap hashMap = transitionValues.f21617a;
        return ((Integer) hashMap.get(PROPNAME_VISIBILITY)).intValue() == 0 && ((View) hashMap.get(PROPNAME_PARENT)) != null;
    }

    public Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return null;
    }

    public Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return null;
    }

    public void setMode(int i2) {
        if ((i2 & (-4)) != 0) {
            throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
        }
        this.mMode = i2;
    }

    @Nullable
    public Animator onAppear(@NonNull ViewGroup viewGroup, @Nullable TransitionValues transitionValues, int i2, @Nullable TransitionValues transitionValues2, int i3) {
        if ((this.mMode & 1) != 1 || transitionValues2 == null) {
            return null;
        }
        if (transitionValues == null) {
            View view = (View) transitionValues2.f21618b.getParent();
            if (h(getMatchedTransitionValues(view, false), getTransitionValues(view, false)).f21642a) {
                return null;
            }
        }
        return onAppear(viewGroup, transitionValues2.f21618b, transitionValues, transitionValues2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x01aa, code lost:
    
        if (r0.mCanRemoveViews != false) goto L67;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0173  */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.animation.Animator onDisappear(@androidx.annotation.NonNull android.view.ViewGroup r19, @androidx.annotation.Nullable androidx.transition.TransitionValues r20, int r21, @androidx.annotation.Nullable androidx.transition.TransitionValues r22, int r23) {
        /*
            Method dump skipped, instructions count: 581
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.Visibility.onDisappear(android.view.ViewGroup, androidx.transition.TransitionValues, int, androidx.transition.TransitionValues, int):android.animation.Animator");
    }
}
