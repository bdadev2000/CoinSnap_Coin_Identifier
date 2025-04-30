package k3;

import java.util.concurrent.Executors;
import r3.C2658a;
import r3.C2668k;
import s7.InterfaceC2701a;
import t3.C2707b;

/* loaded from: classes.dex */
public final class o implements InterfaceC2701a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21442a;

    @Override // s7.InterfaceC2701a
    public final Object get() {
        switch (this.f21442a) {
            case 0:
                return new P.h(Executors.newSingleThreadExecutor(), 2);
            case 1:
                return "com.google.android.datatransport.events";
            case 2:
                return Integer.valueOf(C2668k.f22834f);
            case 3:
                return C2658a.f22817f;
            case 4:
                return new C2707b(1);
            default:
                return new C2707b(0);
        }
    }
}
