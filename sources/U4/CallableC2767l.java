package u4;

import java.util.concurrent.Callable;
import v4.InterfaceC2851c;

/* renamed from: u4.l, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class CallableC2767l implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f23131a;
    public final /* synthetic */ String b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C2769n f23132c;

    public CallableC2767l(C2769n c2769n, long j7, String str) {
        this.f23132c = c2769n;
        this.f23131a = j7;
        this.b = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        C2769n c2769n = this.f23132c;
        C2774s c2774s = c2769n.f23145n;
        if (c2774s == null || !c2774s.f23173e.get()) {
            ((InterfaceC2851c) c2769n.f23142i.b).c(this.f23131a, this.b);
            return null;
        }
        return null;
    }
}
