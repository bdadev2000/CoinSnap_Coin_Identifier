package androidx.fragment.app;

import android.os.Bundle;

/* loaded from: classes.dex */
public final /* synthetic */ class H implements G0.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4653a;
    public final /* synthetic */ Object b;

    public /* synthetic */ H(Object obj, int i9) {
        this.f4653a = i9;
        this.b = obj;
    }

    @Override // G0.d
    public final Bundle a() {
        Bundle lambda$init$0;
        switch (this.f4653a) {
            case 0:
                lambda$init$0 = ((FragmentActivity) this.b).lambda$init$0();
                return lambda$init$0;
            case 1:
                return FragmentManager.b((FragmentManager) this.b);
            case 2:
                return androidx.lifecycle.S.a((androidx.lifecycle.S) this.b);
            default:
                return f.l.d((f.l) this.b);
        }
    }
}
