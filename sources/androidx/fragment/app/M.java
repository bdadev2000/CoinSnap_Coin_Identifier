package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;

/* loaded from: classes.dex */
public final class M extends AnimationSet implements Runnable {
    public final ViewGroup b;

    /* renamed from: c, reason: collision with root package name */
    public final View f4676c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f4677d;

    /* renamed from: f, reason: collision with root package name */
    public boolean f4678f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f4679g;

    public M(Animation animation, ViewGroup viewGroup, View view) {
        super(false);
        this.f4679g = true;
        this.b = viewGroup;
        this.f4676c = view;
        addAnimation(animation);
        viewGroup.post(this);
    }

    @Override // android.view.animation.AnimationSet, android.view.animation.Animation
    public final boolean getTransformation(long j7, Transformation transformation) {
        this.f4679g = true;
        if (this.f4677d) {
            return !this.f4678f;
        }
        if (!super.getTransformation(j7, transformation)) {
            this.f4677d = true;
            T.A.a(this.b, this);
        }
        return true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z8 = this.f4677d;
        ViewGroup viewGroup = this.b;
        if (!z8 && this.f4679g) {
            this.f4679g = false;
            viewGroup.post(this);
        } else {
            viewGroup.endViewTransition(this.f4676c);
            this.f4678f = true;
        }
    }

    @Override // android.view.animation.Animation
    public final boolean getTransformation(long j7, Transformation transformation, float f9) {
        this.f4679g = true;
        if (this.f4677d) {
            return !this.f4678f;
        }
        if (!super.getTransformation(j7, transformation, f9)) {
            this.f4677d = true;
            T.A.a(this.b, this);
        }
        return true;
    }
}
