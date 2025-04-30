package i5;

import com.google.firebase.perf.v1.GaugeMetadata;
import com.google.protobuf.D2;
import com.google.protobuf.O3;

/* renamed from: i5.o, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2360o extends D2 implements O3 {
    public final void a(int i9) {
        copyOnWrite();
        ((GaugeMetadata) this.instance).setDeviceRamSizeKb(i9);
    }

    public final void b(int i9) {
        copyOnWrite();
        ((GaugeMetadata) this.instance).setMaxAppJavaHeapMemoryKb(i9);
    }

    public final void c(int i9) {
        copyOnWrite();
        ((GaugeMetadata) this.instance).setMaxEncouragedAppJavaHeapMemoryKb(i9);
    }
}
