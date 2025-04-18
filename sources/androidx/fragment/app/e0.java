package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;

/* loaded from: classes.dex */
public final class e0 extends AnimationSet implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final ViewGroup f1612b;

    /* renamed from: c, reason: collision with root package name */
    public final View f1613c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1614d;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1615f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1616g;

    public e0(Animation animation, ViewGroup viewGroup, View view) {
        super(false);
        this.f1616g = true;
        this.f1612b = viewGroup;
        this.f1613c = view;
        addAnimation(animation);
        viewGroup.post(this);
    }

    @Override // android.view.animation.AnimationSet, android.view.animation.Animation
    public final boolean getTransformation(long j3, Transformation transformation) {
        this.f1616g = true;
        if (this.f1614d) {
            return !this.f1615f;
        }
        if (!super.getTransformation(j3, transformation)) {
            this.f1614d = true;
            n0.c0.a(this.f1612b, this);
        }
        return true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10 = this.f1614d;
        ViewGroup viewGroup = this.f1612b;
        if (!z10 && this.f1616g) {
            this.f1616g = false;
            viewGroup.post(this);
        } else {
            viewGroup.endViewTransition(this.f1613c);
            this.f1615f = true;
        }
    }

    @Override // android.view.animation.Animation
    public final boolean getTransformation(long j3, Transformation transformation, float f10) {
        this.f1616g = true;
        if (this.f1614d) {
            return !this.f1615f;
        }
        if (!super.getTransformation(j3, transformation, f10)) {
            this.f1614d = true;
            n0.c0.a(this.f1612b, this);
        }
        return true;
    }
}
