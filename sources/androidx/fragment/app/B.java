package androidx.fragment.app;

import android.view.View;
import androidx.lifecycle.EnumC0503m;
import androidx.lifecycle.InterfaceC0509t;
import androidx.lifecycle.InterfaceC0511v;

/* loaded from: classes.dex */
public final class B implements InterfaceC0509t {
    public final /* synthetic */ Fragment b;

    public B(Fragment fragment) {
        this.b = fragment;
    }

    @Override // androidx.lifecycle.InterfaceC0509t
    public final void b(InterfaceC0511v interfaceC0511v, EnumC0503m enumC0503m) {
        View view;
        if (enumC0503m == EnumC0503m.ON_STOP && (view = this.b.mView) != null) {
            view.cancelPendingInputEvents();
        }
    }
}
