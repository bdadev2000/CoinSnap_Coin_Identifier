package androidx.core.app;

import android.view.FrameMetrics;
import android.view.Window;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes2.dex */
public class FrameMetricsAggregator {

    @RequiresApi
    /* loaded from: classes2.dex */
    public static class FrameMetricsApi24Impl extends FrameMetricsBaseImpl {

        /* renamed from: androidx.core.app.FrameMetricsAggregator$FrameMetricsApi24Impl$1, reason: invalid class name */
        /* loaded from: classes2.dex */
        public class AnonymousClass1 implements Window.OnFrameMetricsAvailableListener {
            @Override // android.view.Window.OnFrameMetricsAvailableListener
            public final void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i2) {
                throw null;
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class FrameMetricsBaseImpl {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    /* loaded from: classes2.dex */
    public @interface MetricType {
    }
}
