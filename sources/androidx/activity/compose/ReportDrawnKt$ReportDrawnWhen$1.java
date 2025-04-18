package androidx.activity.compose;

import androidx.activity.FullyDrawnReporter;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes3.dex */
final class ReportDrawnKt$ReportDrawnWhen$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FullyDrawnReporter f261a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q0.a f262b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReportDrawnKt$ReportDrawnWhen$1(FullyDrawnReporter fullyDrawnReporter, q0.a aVar) {
        super(1);
        this.f261a = fullyDrawnReporter;
        this.f262b = aVar;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        boolean z2;
        FullyDrawnReporter fullyDrawnReporter = this.f261a;
        synchronized (fullyDrawnReporter.f156c) {
            z2 = fullyDrawnReporter.f157f;
        }
        if (z2) {
            return new Object();
        }
        final ReportDrawnComposition reportDrawnComposition = new ReportDrawnComposition(fullyDrawnReporter, this.f262b);
        return new DisposableEffectResult() { // from class: androidx.activity.compose.ReportDrawnKt$ReportDrawnWhen$1$invoke$$inlined$onDispose$2
            @Override // androidx.compose.runtime.DisposableEffectResult
            public final void dispose() {
                boolean z3;
                ReportDrawnComposition reportDrawnComposition2 = ReportDrawnComposition.this;
                reportDrawnComposition2.f247c.c(reportDrawnComposition2.f246b);
                FullyDrawnReporter fullyDrawnReporter2 = reportDrawnComposition2.f245a;
                synchronized (fullyDrawnReporter2.f156c) {
                    z3 = fullyDrawnReporter2.f157f;
                }
                if (!z3) {
                    fullyDrawnReporter2.b();
                }
                SnapshotStateObserver snapshotStateObserver = reportDrawnComposition2.f247c;
                snapshotStateObserver.b();
                androidx.compose.runtime.snapshots.a aVar = snapshotStateObserver.f14602g;
                if (aVar != null) {
                    aVar.dispose();
                }
            }
        };
    }
}
