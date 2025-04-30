package i5;

import com.google.firebase.perf.v1.PerfSession;
import com.google.firebase.perf.v1.TraceMetric;
import com.google.protobuf.D2;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class J extends D2 implements M {
    public final void a(List list) {
        copyOnWrite();
        ((TraceMetric) this.instance).addAllPerfSessions(list);
    }

    public final void b(ArrayList arrayList) {
        copyOnWrite();
        ((TraceMetric) this.instance).addAllSubtraces(arrayList);
    }

    public final void c(PerfSession perfSession) {
        copyOnWrite();
        ((TraceMetric) this.instance).addPerfSessions(perfSession);
    }

    public final void d(TraceMetric traceMetric) {
        copyOnWrite();
        ((TraceMetric) this.instance).addSubtraces(traceMetric);
    }

    public final void e(Map map) {
        Map mutableCountersMap;
        copyOnWrite();
        mutableCountersMap = ((TraceMetric) this.instance).getMutableCountersMap();
        mutableCountersMap.putAll(map);
    }

    public final void f(Map map) {
        Map mutableCustomAttributesMap;
        copyOnWrite();
        mutableCustomAttributesMap = ((TraceMetric) this.instance).getMutableCustomAttributesMap();
        mutableCustomAttributesMap.putAll(map);
    }

    public final void g(long j7, String str) {
        Map mutableCountersMap;
        str.getClass();
        copyOnWrite();
        mutableCountersMap = ((TraceMetric) this.instance).getMutableCountersMap();
        mutableCountersMap.put(str, Long.valueOf(j7));
    }

    public final void h(String str) {
        Map mutableCustomAttributesMap;
        copyOnWrite();
        mutableCustomAttributesMap = ((TraceMetric) this.instance).getMutableCustomAttributesMap();
        mutableCustomAttributesMap.put("systemDeterminedForeground", str);
    }

    public final void i(long j7) {
        copyOnWrite();
        ((TraceMetric) this.instance).setClientStartTimeUs(j7);
    }

    public final void j(long j7) {
        copyOnWrite();
        ((TraceMetric) this.instance).setDurationUs(j7);
    }

    public final void k(String str) {
        copyOnWrite();
        ((TraceMetric) this.instance).setName(str);
    }
}
