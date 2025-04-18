package androidx.activity;

import androidx.activity.ComponentActivity;

/* loaded from: classes3.dex */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f270a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f271b;

    public /* synthetic */ d(Object obj, int i2) {
        this.f270a = i2;
        this.f271b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f270a) {
            case 0:
                ComponentActivity.ReportFullyDrawnExecutorApi16Impl reportFullyDrawnExecutorApi16Impl = (ComponentActivity.ReportFullyDrawnExecutorApi16Impl) this.f271b;
                Runnable runnable = reportFullyDrawnExecutorApi16Impl.f152b;
                if (runnable != null) {
                    runnable.run();
                    reportFullyDrawnExecutorApi16Impl.f152b = null;
                    return;
                }
                return;
            case 1:
                ((ComponentActivity) this.f271b).invalidateMenu();
                return;
            case 2:
                ComponentDialog.a((ComponentDialog) this.f271b);
                return;
            default:
                FullyDrawnReporter fullyDrawnReporter = (FullyDrawnReporter) this.f271b;
                p0.a.s(fullyDrawnReporter, "this$0");
                synchronized (fullyDrawnReporter.f156c) {
                    fullyDrawnReporter.e = false;
                    if (fullyDrawnReporter.d == 0 && !fullyDrawnReporter.f157f) {
                        fullyDrawnReporter.f155b.invoke();
                        fullyDrawnReporter.a();
                    }
                }
                return;
        }
    }
}
