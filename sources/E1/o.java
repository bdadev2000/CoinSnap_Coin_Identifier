package e1;

import androidx.work.impl.WorkDatabase;
import c1.InterfaceC0586a;
import g1.InterfaceC2286a;

/* loaded from: classes.dex */
public final class o implements androidx.work.i {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC2286a f20056a;
    public final InterfaceC0586a b;

    /* renamed from: c, reason: collision with root package name */
    public final B4.c f20057c;

    static {
        androidx.work.o.g("WMFgUpdater");
    }

    public o(WorkDatabase workDatabase, InterfaceC0586a interfaceC0586a, InterfaceC2286a interfaceC2286a) {
        this.b = interfaceC0586a;
        this.f20056a = interfaceC2286a;
        this.f20057c = workDatabase.n();
    }
}
