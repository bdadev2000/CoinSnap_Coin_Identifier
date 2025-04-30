package h5;

import Q7.n0;
import a5.C0397a;
import com.google.firebase.perf.metrics.Trace;

/* renamed from: h5.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2327h {

    /* renamed from: a, reason: collision with root package name */
    public static final C0397a f20609a = C0397a.d();

    public static void a(Trace trace, b5.d dVar) {
        int i9 = dVar.f5322a;
        if (i9 > 0) {
            trace.putMetric("_fr_tot", i9);
        }
        int i10 = dVar.b;
        if (i10 > 0) {
            trace.putMetric("_fr_slo", i10);
        }
        int i11 = dVar.f5323c;
        if (i11 > 0) {
            trace.putMetric("_fr_fzn", i11);
        }
        StringBuilder sb = new StringBuilder("Screen trace: ");
        sb.append(trace.f14365f);
        sb.append(" _fr_tot:");
        n0.t(sb, dVar.f5322a, " _fr_slo:", i10, " _fr_fzn:");
        sb.append(i11);
        f20609a.a(sb.toString());
    }
}
