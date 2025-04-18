package androidx.fragment.app;

import android.transition.Transition;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class q1 implements Transition.TransitionListener {
    public final /* synthetic */ Object a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f1706b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1707c = null;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ArrayList f1708d = null;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f1709e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ArrayList f1710f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ s1 f1711g;

    public q1(s1 s1Var, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2) {
        this.f1711g = s1Var;
        this.a = obj;
        this.f1706b = arrayList;
        this.f1709e = obj2;
        this.f1710f = arrayList2;
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionCancel(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        transition.removeListener(this);
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionPause(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionResume(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
        s1 s1Var = this.f1711g;
        Object obj = this.a;
        if (obj != null) {
            s1Var.t(obj, this.f1706b, null);
        }
        Object obj2 = this.f1707c;
        if (obj2 != null) {
            s1Var.t(obj2, this.f1708d, null);
        }
        Object obj3 = this.f1709e;
        if (obj3 != null) {
            s1Var.t(obj3, this.f1710f, null);
        }
    }
}
