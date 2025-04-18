package androidx.appcompat.graphics.drawable;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.res.Resources;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import androidx.appcompat.graphics.drawable.DrawableContainerCompat;
import androidx.appcompat.graphics.drawable.StateListDrawableCompat;
import androidx.collection.LongSparseArray;
import androidx.collection.SparseArrayCompat;
import androidx.collection.SparseArrayCompatKt;
import androidx.collection.internal.ContainerHelpersKt;
import androidx.core.graphics.drawable.TintAwareDrawable;
import androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat;

/* loaded from: classes.dex */
public class AnimatedStateListDrawableCompat extends StateListDrawableCompat implements TintAwareDrawable {

    /* renamed from: q, reason: collision with root package name */
    public AnimatedStateListState f531q;

    /* renamed from: r, reason: collision with root package name */
    public Transition f532r;

    /* renamed from: s, reason: collision with root package name */
    public int f533s = -1;

    /* renamed from: t, reason: collision with root package name */
    public int f534t = -1;

    /* renamed from: u, reason: collision with root package name */
    public boolean f535u;

    /* loaded from: classes.dex */
    public static class AnimatableTransition extends Transition {

        /* renamed from: a, reason: collision with root package name */
        public final Animatable f536a;

        public AnimatableTransition(Animatable animatable) {
            this.f536a = animatable;
        }

        @Override // androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.Transition
        public final void c() {
            this.f536a.start();
        }

        @Override // androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.Transition
        public final void d() {
            this.f536a.stop();
        }
    }

    /* loaded from: classes.dex */
    public static class AnimatedStateListState extends StateListDrawableCompat.StateListState {
        public LongSparseArray J;
        public SparseArrayCompat K;

        public AnimatedStateListState(AnimatedStateListState animatedStateListState, AnimatedStateListDrawableCompat animatedStateListDrawableCompat, Resources resources) {
            super(animatedStateListState, animatedStateListDrawableCompat, resources);
            if (animatedStateListState != null) {
                this.J = animatedStateListState.J;
                this.K = animatedStateListState.K;
            } else {
                this.J = new LongSparseArray();
                this.K = new SparseArrayCompat();
            }
        }

        @Override // androidx.appcompat.graphics.drawable.StateListDrawableCompat.StateListState, androidx.appcompat.graphics.drawable.DrawableContainerCompat.DrawableContainerState
        public final void d() {
            this.J = this.J.clone();
            this.K = this.K.clone();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object[]] */
        /* JADX WARN: Type inference failed for: r5v2 */
        public final int f(int i2) {
            ?? r5;
            if (i2 < 0) {
                return 0;
            }
            SparseArrayCompat sparseArrayCompat = this.K;
            int i3 = 0;
            sparseArrayCompat.getClass();
            Object obj = SparseArrayCompatKt.f1612a;
            int a2 = ContainerHelpersKt.a(sparseArrayCompat.d, i2, sparseArrayCompat.f1610b);
            if (a2 >= 0 && (r5 = sparseArrayCompat.f1611c[a2]) != SparseArrayCompatKt.f1612a) {
                i3 = r5;
            }
            return i3.intValue();
        }

        @Override // androidx.appcompat.graphics.drawable.StateListDrawableCompat.StateListState, android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            return new AnimatedStateListDrawableCompat(this, null);
        }

        @Override // androidx.appcompat.graphics.drawable.StateListDrawableCompat.StateListState, android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources) {
            return new AnimatedStateListDrawableCompat(this, resources);
        }
    }

    /* loaded from: classes.dex */
    public static class AnimatedVectorDrawableTransition extends Transition {

        /* renamed from: a, reason: collision with root package name */
        public final AnimatedVectorDrawableCompat f537a;

        public AnimatedVectorDrawableTransition(AnimatedVectorDrawableCompat animatedVectorDrawableCompat) {
            this.f537a = animatedVectorDrawableCompat;
        }

        @Override // androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.Transition
        public final void c() {
            this.f537a.start();
        }

        @Override // androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.Transition
        public final void d() {
            this.f537a.stop();
        }
    }

    /* loaded from: classes.dex */
    public static class AnimationDrawableTransition extends Transition {

        /* renamed from: a, reason: collision with root package name */
        public final ObjectAnimator f538a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f539b;

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v0, types: [androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat$FrameInterpolator, android.animation.TimeInterpolator, java.lang.Object] */
        public AnimationDrawableTransition(AnimationDrawable animationDrawable, boolean z2, boolean z3) {
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            int i2 = z2 ? numberOfFrames - 1 : 0;
            int i3 = z2 ? 0 : numberOfFrames - 1;
            ?? obj = new Object();
            int numberOfFrames2 = animationDrawable.getNumberOfFrames();
            obj.f541b = numberOfFrames2;
            int[] iArr = obj.f540a;
            if (iArr == null || iArr.length < numberOfFrames2) {
                obj.f540a = new int[numberOfFrames2];
            }
            int[] iArr2 = obj.f540a;
            int i4 = 0;
            for (int i5 = 0; i5 < numberOfFrames2; i5++) {
                int duration = animationDrawable.getDuration(z2 ? (numberOfFrames2 - i5) - 1 : i5);
                iArr2[i5] = duration;
                i4 += duration;
            }
            obj.f542c = i4;
            ObjectAnimator ofInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i2, i3);
            ofInt.setAutoCancel(true);
            ofInt.setDuration(obj.f542c);
            ofInt.setInterpolator(obj);
            this.f539b = z3;
            this.f538a = ofInt;
        }

        @Override // androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.Transition
        public final boolean a() {
            return this.f539b;
        }

        @Override // androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.Transition
        public final void b() {
            this.f538a.reverse();
        }

        @Override // androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.Transition
        public final void c() {
            this.f538a.start();
        }

        @Override // androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.Transition
        public final void d() {
            this.f538a.cancel();
        }
    }

    /* loaded from: classes.dex */
    public static class FrameInterpolator implements TimeInterpolator {

        /* renamed from: a, reason: collision with root package name */
        public int[] f540a;

        /* renamed from: b, reason: collision with root package name */
        public int f541b;

        /* renamed from: c, reason: collision with root package name */
        public int f542c;

        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f2) {
            int i2 = (int) ((f2 * this.f542c) + 0.5f);
            int i3 = this.f541b;
            int[] iArr = this.f540a;
            int i4 = 0;
            while (i4 < i3) {
                int i5 = iArr[i4];
                if (i2 < i5) {
                    break;
                }
                i2 -= i5;
                i4++;
            }
            return (i4 / i3) + (i4 < i3 ? i2 / this.f542c : 0.0f);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class Transition {
        public boolean a() {
            return false;
        }

        public void b() {
        }

        public abstract void c();

        public abstract void d();
    }

    public AnimatedStateListDrawableCompat(AnimatedStateListState animatedStateListState, Resources resources) {
        e(new AnimatedStateListState(animatedStateListState, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }

    @Override // androidx.appcompat.graphics.drawable.StateListDrawableCompat, androidx.appcompat.graphics.drawable.DrawableContainerCompat
    public final DrawableContainerCompat.DrawableContainerState b() {
        return new AnimatedStateListState(this.f531q, this, null);
    }

    @Override // androidx.appcompat.graphics.drawable.StateListDrawableCompat, androidx.appcompat.graphics.drawable.DrawableContainerCompat
    public final void e(DrawableContainerCompat.DrawableContainerState drawableContainerState) {
        super.e(drawableContainerState);
        if (drawableContainerState instanceof AnimatedStateListState) {
            this.f531q = (AnimatedStateListState) drawableContainerState;
        }
    }

    @Override // androidx.appcompat.graphics.drawable.StateListDrawableCompat
    /* renamed from: f */
    public final StateListDrawableCompat.StateListState b() {
        return new AnimatedStateListState(this.f531q, this, null);
    }

    @Override // androidx.appcompat.graphics.drawable.DrawableContainerCompat, android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        super.jumpToCurrentState();
        Transition transition = this.f532r;
        if (transition != null) {
            transition.d();
            this.f532r = null;
            d(this.f533s);
            this.f533s = -1;
            this.f534t = -1;
        }
    }

    @Override // androidx.appcompat.graphics.drawable.StateListDrawableCompat, androidx.appcompat.graphics.drawable.DrawableContainerCompat, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        if (!this.f535u) {
            super.mutate();
            this.f531q.d();
            this.f535u = true;
        }
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00e0, code lost:
    
        if (d(r1) != false) goto L45;
     */
    @Override // androidx.appcompat.graphics.drawable.StateListDrawableCompat, androidx.appcompat.graphics.drawable.DrawableContainerCompat, android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onStateChange(int[] r15) {
        /*
            Method dump skipped, instructions count: 239
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.onStateChange(int[]):boolean");
    }

    @Override // androidx.appcompat.graphics.drawable.DrawableContainerCompat, android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z2, boolean z3) {
        boolean visible = super.setVisible(z2, z3);
        Transition transition = this.f532r;
        if (transition != null && (visible || z3)) {
            if (z2) {
                transition.c();
            } else {
                jumpToCurrentState();
            }
        }
        return visible;
    }
}
