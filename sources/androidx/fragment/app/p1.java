package androidx.fragment.app;

import android.transition.Transition;
import android.view.View;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class p1 implements Transition.TransitionListener {
    public final /* synthetic */ View a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f1703b;

    public p1(View view, ArrayList arrayList) {
        this.a = view;
        this.f1703b = arrayList;
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionCancel(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        transition.removeListener(this);
        this.a.setVisibility(8);
        ArrayList arrayList = this.f1703b;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((View) arrayList.get(i10)).setVisibility(0);
        }
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionPause(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionResume(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
        transition.removeListener(this);
        transition.addListener(this);
    }
}
