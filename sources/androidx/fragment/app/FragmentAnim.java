package androidx.fragment.app;

import android.R;
import android.animation.Animator;
import android.content.Context;
import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;
import androidx.core.view.OneShotPreDrawListener;

/* loaded from: classes3.dex */
class FragmentAnim {

    /* loaded from: classes3.dex */
    public static class AnimationOrAnimator {

        /* renamed from: a, reason: collision with root package name */
        public final Animation f19721a;

        /* renamed from: b, reason: collision with root package name */
        public final Animator f19722b;

        public AnimationOrAnimator(Animation animation) {
            this.f19721a = animation;
            this.f19722b = null;
        }

        public AnimationOrAnimator(Animator animator) {
            this.f19721a = null;
            this.f19722b = animator;
        }
    }

    public static int a(int i2, Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(R.style.Animation.Activity, new int[]{i2});
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    /* loaded from: classes3.dex */
    public static class EndViewTransitionAnimation extends AnimationSet implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final ViewGroup f19723a;

        /* renamed from: b, reason: collision with root package name */
        public final View f19724b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f19725c;
        public boolean d;

        /* renamed from: f, reason: collision with root package name */
        public boolean f19726f;

        public EndViewTransitionAnimation(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.f19726f = true;
            this.f19723a = viewGroup;
            this.f19724b = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        @Override // android.view.animation.AnimationSet, android.view.animation.Animation
        public final boolean getTransformation(long j2, Transformation transformation) {
            this.f19726f = true;
            if (this.f19725c) {
                return !this.d;
            }
            if (!super.getTransformation(j2, transformation)) {
                this.f19725c = true;
                OneShotPreDrawListener.a(this.f19723a, this);
            }
            return true;
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean z2 = this.f19725c;
            ViewGroup viewGroup = this.f19723a;
            if (z2 || !this.f19726f) {
                viewGroup.endViewTransition(this.f19724b);
                this.d = true;
            } else {
                this.f19726f = false;
                viewGroup.post(this);
            }
        }

        @Override // android.view.animation.Animation
        public final boolean getTransformation(long j2, Transformation transformation, float f2) {
            this.f19726f = true;
            if (this.f19725c) {
                return !this.d;
            }
            if (!super.getTransformation(j2, transformation, f2)) {
                this.f19725c = true;
                OneShotPreDrawListener.a(this.f19723a, this);
            }
            return true;
        }
    }
}
