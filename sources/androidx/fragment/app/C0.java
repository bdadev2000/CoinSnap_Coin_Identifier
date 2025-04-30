package androidx.fragment.app;

import android.transition.Transition;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class C0 implements Transition.TransitionListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f4619a;
    public final /* synthetic */ ArrayList b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4620c = null;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ArrayList f4621d = null;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f4622e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ArrayList f4623f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ E0 f4624g;

    public C0(E0 e02, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2) {
        this.f4624g = e02;
        this.f4619a = obj;
        this.b = arrayList;
        this.f4622e = obj2;
        this.f4623f = arrayList2;
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
        E0 e02 = this.f4624g;
        Object obj = this.f4619a;
        if (obj != null) {
            e02.A(obj, this.b, null);
        }
        Object obj2 = this.f4620c;
        if (obj2 != null) {
            e02.A(obj2, this.f4621d, null);
        }
        Object obj3 = this.f4622e;
        if (obj3 != null) {
            e02.A(obj3, this.f4623f, null);
        }
    }
}
