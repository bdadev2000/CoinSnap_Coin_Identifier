package i5;

import com.google.firebase.perf.v1.AndroidMemoryReading;
import com.google.protobuf.D2;

/* renamed from: i5.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2349d extends D2 implements InterfaceC2350e {
    public final void a(long j7) {
        copyOnWrite();
        ((AndroidMemoryReading) this.instance).setClientTimeUs(j7);
    }

    public final void b(int i9) {
        copyOnWrite();
        ((AndroidMemoryReading) this.instance).setUsedAppJavaHeapMemoryKb(i9);
    }
}
