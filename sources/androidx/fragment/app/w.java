package androidx.fragment.app;

import android.animation.Animator;
import android.view.animation.Animation;

/* loaded from: classes.dex */
public final class w implements n.a {

    /* renamed from: b, reason: collision with root package name */
    public final Object f1731b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f1732c;

    public w(Animation animation) {
        this.f1731b = animation;
        this.f1732c = null;
    }

    @Override // n.a, o7.h
    public final Object apply(Object obj) {
        return (androidx.activity.result.g) this.f1731b;
    }

    public w(Animator animator) {
        this.f1731b = null;
        this.f1732c = animator;
    }

    public w(Fragment fragment, androidx.activity.result.g gVar) {
        this.f1732c = fragment;
        this.f1731b = gVar;
    }
}
