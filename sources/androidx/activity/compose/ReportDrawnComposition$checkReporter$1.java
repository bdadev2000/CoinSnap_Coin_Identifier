package androidx.activity.compose;

import androidx.activity.FullyDrawnReporter;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import d0.b0;
import kotlin.jvm.internal.o;
import q0.l;

/* loaded from: classes4.dex */
final /* synthetic */ class ReportDrawnComposition$checkReporter$1 extends o implements l {
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.jvm.internal.b0] */
    public final void b(q0.a aVar) {
        boolean z2;
        ReportDrawnComposition reportDrawnComposition = (ReportDrawnComposition) this.receiver;
        reportDrawnComposition.getClass();
        ?? obj = new Object();
        reportDrawnComposition.f247c.e(aVar, reportDrawnComposition.d, new ReportDrawnComposition$observeReporter$1(obj, aVar));
        if (obj.f30919a) {
            reportDrawnComposition.f247c.c(reportDrawnComposition.f246b);
            FullyDrawnReporter fullyDrawnReporter = reportDrawnComposition.f245a;
            synchronized (fullyDrawnReporter.f156c) {
                z2 = fullyDrawnReporter.f157f;
            }
            if (!z2) {
                fullyDrawnReporter.b();
            }
            SnapshotStateObserver snapshotStateObserver = reportDrawnComposition.f247c;
            snapshotStateObserver.b();
            androidx.compose.runtime.snapshots.a aVar2 = snapshotStateObserver.f14602g;
            if (aVar2 != null) {
                aVar2.dispose();
            }
        }
    }

    @Override // q0.l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((q0.a) obj);
        return b0.f30125a;
    }
}
