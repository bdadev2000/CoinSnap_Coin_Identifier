package androidx.activity.compose;

import androidx.activity.FullyDrawnReporter;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import d0.b0;
import kotlin.jvm.internal.n;
import q0.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class ReportDrawnComposition implements q0.a {

    /* renamed from: a, reason: collision with root package name */
    public final FullyDrawnReporter f245a;

    /* renamed from: b, reason: collision with root package name */
    public final q0.a f246b;

    /* renamed from: c, reason: collision with root package name */
    public final SnapshotStateObserver f247c;
    public final l d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [kotlin.jvm.internal.n, q0.l] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, kotlin.jvm.internal.b0] */
    public ReportDrawnComposition(FullyDrawnReporter fullyDrawnReporter, q0.a aVar) {
        boolean z2;
        boolean z3;
        boolean z4;
        this.f245a = fullyDrawnReporter;
        this.f246b = aVar;
        SnapshotStateObserver snapshotStateObserver = new SnapshotStateObserver(ReportDrawnComposition$snapshotStateObserver$1.f250a);
        snapshotStateObserver.f14602g = Snapshot.Companion.e(snapshotStateObserver.d);
        this.f247c = snapshotStateObserver;
        ?? nVar = new n(1, this, ReportDrawnComposition.class, "observeReporter", "observeReporter(Lkotlin/jvm/functions/Function0;)V", 0);
        this.d = nVar;
        fullyDrawnReporter.getClass();
        synchronized (fullyDrawnReporter.f156c) {
            if (fullyDrawnReporter.f157f) {
                z2 = true;
            } else {
                fullyDrawnReporter.f158g.add(this);
                z2 = false;
            }
        }
        if (z2) {
            invoke();
        }
        synchronized (fullyDrawnReporter.f156c) {
            z3 = fullyDrawnReporter.f157f;
        }
        if (z3) {
            return;
        }
        synchronized (fullyDrawnReporter.f156c) {
            if (!fullyDrawnReporter.f157f) {
                fullyDrawnReporter.d++;
            }
        }
        ?? obj = new Object();
        snapshotStateObserver.e(aVar, nVar, new ReportDrawnComposition$observeReporter$1(obj, aVar));
        if (obj.f30919a) {
            snapshotStateObserver.c(aVar);
            synchronized (fullyDrawnReporter.f156c) {
                z4 = fullyDrawnReporter.f157f;
            }
            if (!z4) {
                fullyDrawnReporter.b();
            }
            snapshotStateObserver.b();
            androidx.compose.runtime.snapshots.a aVar2 = snapshotStateObserver.f14602g;
            if (aVar2 != null) {
                aVar2.dispose();
            }
        }
    }

    @Override // q0.a
    public final Object invoke() {
        SnapshotStateObserver snapshotStateObserver = this.f247c;
        snapshotStateObserver.b();
        androidx.compose.runtime.snapshots.a aVar = snapshotStateObserver.f14602g;
        if (aVar != null) {
            aVar.dispose();
        }
        return b0.f30125a;
    }
}
