package i5;

import com.google.firebase.perf.v1.PerfSession;
import com.google.protobuf.D2;

/* loaded from: classes2.dex */
public final class F extends D2 implements G {
    public final void a() {
        H h6 = H.GAUGES_AND_SYSTEM_EVENTS;
        copyOnWrite();
        ((PerfSession) this.instance).addSessionVerbosity(h6);
    }

    public final void b(String str) {
        copyOnWrite();
        ((PerfSession) this.instance).setSessionId(str);
    }
}
