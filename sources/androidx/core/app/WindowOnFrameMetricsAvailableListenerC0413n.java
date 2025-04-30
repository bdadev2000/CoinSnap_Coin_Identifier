package androidx.core.app;

import android.view.FrameMetrics;
import android.view.Window;

/* renamed from: androidx.core.app.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class WindowOnFrameMetricsAvailableListenerC0413n implements Window.OnFrameMetricsAvailableListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0414o f4416a;

    public WindowOnFrameMetricsAvailableListenerC0413n(C0414o c0414o) {
        this.f4416a = c0414o;
    }

    @Override // android.view.Window.OnFrameMetricsAvailableListener
    public final void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i9) {
        C0414o c0414o = this.f4416a;
        if ((c0414o.f4420a & 1) != 0) {
            C0414o.a(c0414o.b[0], frameMetrics.getMetric(8));
        }
        if ((c0414o.f4420a & 2) != 0) {
            C0414o.a(c0414o.b[1], frameMetrics.getMetric(1));
        }
        if ((c0414o.f4420a & 4) != 0) {
            C0414o.a(c0414o.b[2], frameMetrics.getMetric(3));
        }
        if ((c0414o.f4420a & 8) != 0) {
            C0414o.a(c0414o.b[3], frameMetrics.getMetric(4));
        }
        if ((c0414o.f4420a & 16) != 0) {
            C0414o.a(c0414o.b[4], frameMetrics.getMetric(5));
        }
        if ((c0414o.f4420a & 64) != 0) {
            C0414o.a(c0414o.b[6], frameMetrics.getMetric(7));
        }
        if ((c0414o.f4420a & 32) != 0) {
            C0414o.a(c0414o.b[5], frameMetrics.getMetric(6));
        }
        if ((c0414o.f4420a & 128) != 0) {
            C0414o.a(c0414o.b[7], frameMetrics.getMetric(0));
        }
        if ((c0414o.f4420a & NotificationCompat.FLAG_LOCAL_ONLY) != 0) {
            C0414o.a(c0414o.b[8], frameMetrics.getMetric(2));
        }
    }
}
