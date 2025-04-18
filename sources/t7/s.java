package t7;

import android.media.metrics.MediaMetricsManager;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class s {
    public static /* bridge */ /* synthetic */ MediaMetricsManager b(Object obj) {
        return (MediaMetricsManager) obj;
    }

    public static /* synthetic */ PlaybackErrorEvent.Builder f() {
        return new PlaybackErrorEvent.Builder();
    }

    public static /* bridge */ /* synthetic */ PlaybackMetrics.Builder l(Object obj) {
        return (PlaybackMetrics.Builder) obj;
    }
}
