package com.google.android.gms.internal.ads;

import android.media.AudioProfile;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackStateEvent;
import android.media.metrics.TrackChangeEvent;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class c {
    public static /* bridge */ /* synthetic */ AudioProfile b(Object obj) {
        return (AudioProfile) obj;
    }

    public static /* bridge */ /* synthetic */ MediaMetricsManager d(Object obj) {
        return (MediaMetricsManager) obj;
    }

    public static /* synthetic */ NetworkEvent.Builder e() {
        return new NetworkEvent.Builder();
    }

    public static /* synthetic */ PlaybackErrorEvent.Builder f() {
        return new PlaybackErrorEvent.Builder();
    }

    public static /* synthetic */ PlaybackMetrics.Builder g() {
        return new PlaybackMetrics.Builder();
    }

    public static /* synthetic */ PlaybackStateEvent.Builder k() {
        return new PlaybackStateEvent.Builder();
    }

    public static /* synthetic */ TrackChangeEvent.Builder l(int i9) {
        return new TrackChangeEvent.Builder(i9);
    }
}
