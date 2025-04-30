package androidx.fragment.app;

import t.InterfaceC2702a;

/* loaded from: classes.dex */
public final class C implements InterfaceC2702a, androidx.lifecycle.D {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4618c;

    public /* synthetic */ C(Object obj, int i9) {
        this.b = i9;
        this.f4618c = obj;
    }

    @Override // t.InterfaceC2702a
    public Object apply(Object obj) {
        switch (this.b) {
            case 0:
                Fragment fragment = (Fragment) this.f4618c;
                Object obj2 = fragment.mHost;
                if (obj2 instanceof h.j) {
                    return ((h.j) obj2).getActivityResultRegistry();
                }
                return fragment.requireActivity().getActivityResultRegistry();
            default:
                return (h.i) this.f4618c;
        }
    }
}
