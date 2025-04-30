package i5;

import com.google.firebase.perf.v1.CpuMetricReading;
import com.google.protobuf.D2;

/* renamed from: i5.l, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2357l extends D2 implements InterfaceC2358m {
    public final void a(long j7) {
        copyOnWrite();
        ((CpuMetricReading) this.instance).setClientTimeUs(j7);
    }

    public final void b(long j7) {
        copyOnWrite();
        ((CpuMetricReading) this.instance).setSystemTimeUs(j7);
    }

    public final void c(long j7) {
        copyOnWrite();
        ((CpuMetricReading) this.instance).setUserTimeUs(j7);
    }
}
