package c5;

import a5.C0397a;
import com.google.firebase.perf.v1.TraceMetric;
import java.util.Iterator;
import java.util.Map;

/* renamed from: c5.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0611d extends AbstractC0612e {
    public static final C0397a b = C0397a.d();

    /* renamed from: a, reason: collision with root package name */
    public final TraceMetric f5418a;

    public C0611d(TraceMetric traceMetric) {
        this.f5418a = traceMetric;
    }

    public static boolean d(TraceMetric traceMetric, int i9) {
        if (traceMetric == null) {
            return false;
        }
        C0397a c0397a = b;
        if (i9 > 1) {
            c0397a.f("Exceed MAX_SUBTRACE_DEEP:1");
            return false;
        }
        for (Map.Entry<String, Long> entry : traceMetric.getCountersMap().entrySet()) {
            String key = entry.getKey();
            if (key != null) {
                String trim = key.trim();
                if (trim.isEmpty()) {
                    c0397a.f("counterId is empty");
                } else if (trim.length() > 100) {
                    c0397a.f("counterId exceeded max length 100");
                } else if (entry.getValue() == null) {
                    c0397a.f("invalid CounterValue:" + entry.getValue());
                    return false;
                }
            }
            c0397a.f("invalid CounterId:" + entry.getKey());
            return false;
        }
        Iterator<TraceMetric> it = traceMetric.getSubtracesList().iterator();
        while (it.hasNext()) {
            if (!d(it.next(), i9 + 1)) {
                return false;
            }
        }
        return true;
    }

    public static boolean e(TraceMetric traceMetric, int i9) {
        Long l;
        C0397a c0397a = b;
        if (traceMetric == null) {
            c0397a.f("TraceMetric is null");
            return false;
        }
        if (i9 > 1) {
            c0397a.f("Exceed MAX_SUBTRACE_DEEP:1");
            return false;
        }
        String name = traceMetric.getName();
        if (name != null) {
            String trim = name.trim();
            if (!trim.isEmpty() && trim.length() <= 100) {
                if (traceMetric.getDurationUs() > 0) {
                    if (!traceMetric.hasClientStartTimeUs()) {
                        c0397a.f("clientStartTimeUs is null.");
                        return false;
                    }
                    if (traceMetric.getName().startsWith("_st_") && ((l = traceMetric.getCountersMap().get("_fr_tot")) == null || l.compareTo((Long) 0L) <= 0)) {
                        c0397a.f("non-positive totalFrames in screen trace " + traceMetric.getName());
                        return false;
                    }
                    Iterator<TraceMetric> it = traceMetric.getSubtracesList().iterator();
                    while (it.hasNext()) {
                        if (!e(it.next(), i9 + 1)) {
                            return false;
                        }
                    }
                    for (Map.Entry<String, String> entry : traceMetric.getCustomAttributesMap().entrySet()) {
                        try {
                            AbstractC0612e.b(entry.getKey(), entry.getValue());
                        } catch (IllegalArgumentException e4) {
                            c0397a.f(e4.getLocalizedMessage());
                            return false;
                        }
                    }
                    return true;
                }
                c0397a.f("invalid TraceDuration:" + traceMetric.getDurationUs());
                return false;
            }
        }
        c0397a.f("invalid TraceId:" + traceMetric.getName());
        return false;
    }

    @Override // c5.AbstractC0612e
    public final boolean a() {
        TraceMetric traceMetric = this.f5418a;
        boolean e4 = e(traceMetric, 0);
        C0397a c0397a = b;
        if (!e4) {
            c0397a.f("Invalid Trace:" + traceMetric.getName());
            return false;
        }
        if (traceMetric.getCountersCount() <= 0) {
            Iterator<TraceMetric> it = traceMetric.getSubtracesList().iterator();
            while (it.hasNext()) {
                if (it.next().getCountersCount() > 0) {
                }
            }
            return true;
        }
        if (!d(traceMetric, 0)) {
            c0397a.f("Invalid Counters for Trace:" + traceMetric.getName());
            return false;
        }
        return true;
    }
}
