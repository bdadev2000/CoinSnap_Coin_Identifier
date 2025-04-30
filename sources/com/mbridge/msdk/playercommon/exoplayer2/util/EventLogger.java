package com.mbridge.msdk.playercommon.exoplayer2.util;

import Q7.n0;
import android.net.NetworkInfo;
import android.util.Log;
import android.view.Surface;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.ExoPlaybackException;
import com.mbridge.msdk.playercommon.exoplayer2.Format;
import com.mbridge.msdk.playercommon.exoplayer2.PlaybackParameters;
import com.mbridge.msdk.playercommon.exoplayer2.Timeline;
import com.mbridge.msdk.playercommon.exoplayer2.analytics.AnalyticsListener;
import com.mbridge.msdk.playercommon.exoplayer2.decoder.DecoderCounters;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.Metadata;
import com.mbridge.msdk.playercommon.exoplayer2.source.MediaSourceEventListener;
import com.mbridge.msdk.playercommon.exoplayer2.source.TrackGroup;
import com.mbridge.msdk.playercommon.exoplayer2.source.TrackGroupArray;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.MappingTrackSelector;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.TrackSelection;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.TrackSelectionArray;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.Locale;
import x0.AbstractC2914a;
import z.AbstractC2965e;

/* loaded from: classes3.dex */
public class EventLogger implements AnalyticsListener {
    private static final int MAX_TIMELINE_ITEM_LINES = 3;
    private static final String TAG = "EventLogger";
    private static final NumberFormat TIME_FORMAT;
    private final MappingTrackSelector trackSelector;
    private final Timeline.Window window = new Timeline.Window();
    private final Timeline.Period period = new Timeline.Period();
    private final long startTimeMs = android.os.SystemClock.elapsedRealtime();

    static {
        NumberFormat numberFormat = NumberFormat.getInstance(Locale.US);
        TIME_FORMAT = numberFormat;
        numberFormat.setMinimumFractionDigits(2);
        numberFormat.setMaximumFractionDigits(2);
        numberFormat.setGroupingUsed(false);
    }

    public EventLogger(MappingTrackSelector mappingTrackSelector) {
        this.trackSelector = mappingTrackSelector;
    }

    private static String getAdaptiveSupportString(int i9, int i10) {
        if (i9 < 2) {
            return "N/A";
        }
        if (i10 != 0) {
            if (i10 != 8) {
                if (i10 != 16) {
                    return "?";
                }
                return "YES";
            }
            return "YES_NOT_SEAMLESS";
        }
        return "NO";
    }

    private static String getDiscontinuityReasonString(int i9) {
        if (i9 != 0) {
            if (i9 != 1) {
                if (i9 != 2) {
                    if (i9 != 3) {
                        if (i9 != 4) {
                            return "?";
                        }
                        return "INTERNAL";
                    }
                    return "AD_INSERTION";
                }
                return "SEEK_ADJUSTMENT";
            }
            return "SEEK";
        }
        return "PERIOD_TRANSITION";
    }

    private String getEventString(AnalyticsListener.EventTime eventTime, String str) {
        return AbstractC2914a.h(AbstractC2965e.c(str, " ["), getEventTimeString(eventTime), "]");
    }

    private String getEventTimeString(AnalyticsListener.EventTime eventTime) {
        String str = "window=" + eventTime.windowIndex;
        if (eventTime.mediaPeriodId != null) {
            StringBuilder c9 = AbstractC2965e.c(str, ", period=");
            c9.append(eventTime.mediaPeriodId.periodIndex);
            str = c9.toString();
            if (eventTime.mediaPeriodId.isAd()) {
                StringBuilder c10 = AbstractC2965e.c(str, ", adGroup=");
                c10.append(eventTime.mediaPeriodId.adGroupIndex);
                StringBuilder c11 = AbstractC2965e.c(c10.toString(), ", ad=");
                c11.append(eventTime.mediaPeriodId.adIndexInAdGroup);
                str = c11.toString();
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(getTimeString(eventTime.realtimeMs - this.startTimeMs));
        sb.append(", ");
        return n0.l(sb, getTimeString(eventTime.currentPlaybackPositionMs), ", ", str);
    }

    private static String getFormatSupportString(int i9) {
        if (i9 != 0) {
            if (i9 != 1) {
                if (i9 != 2) {
                    if (i9 != 3) {
                        if (i9 != 4) {
                            return "?";
                        }
                        return "YES";
                    }
                    return "NO_EXCEEDS_CAPABILITIES";
                }
                return "NO_UNSUPPORTED_DRM";
            }
            return "NO_UNSUPPORTED_TYPE";
        }
        return "NO";
    }

    private static String getRepeatModeString(int i9) {
        if (i9 != 0) {
            if (i9 != 1) {
                if (i9 != 2) {
                    return "?";
                }
                return "ALL";
            }
            return "ONE";
        }
        return "OFF";
    }

    private static String getStateString(int i9) {
        if (i9 != 1) {
            if (i9 != 2) {
                if (i9 != 3) {
                    if (i9 != 4) {
                        return "?";
                    }
                    return "ENDED";
                }
                return "READY";
            }
            return "BUFFERING";
        }
        return "IDLE";
    }

    private static String getTimeString(long j7) {
        if (j7 == C.TIME_UNSET) {
            return "?";
        }
        return TIME_FORMAT.format(((float) j7) / 1000.0f);
    }

    private static String getTimelineChangeReasonString(int i9) {
        if (i9 != 0) {
            if (i9 != 1) {
                if (i9 != 2) {
                    return "?";
                }
                return "DYNAMIC";
            }
            return "RESET";
        }
        return "PREPARED";
    }

    private static String getTrackStatusString(TrackSelection trackSelection, TrackGroup trackGroup, int i9) {
        return getTrackStatusString((trackSelection == null || trackSelection.getTrackGroup() != trackGroup || trackSelection.indexOf(i9) == -1) ? false : true);
    }

    private static String getTrackTypeString(int i9) {
        if (i9 != 0) {
            if (i9 != 1) {
                if (i9 != 2) {
                    if (i9 != 3) {
                        if (i9 != 4) {
                            if (i9 != 5) {
                                if (i9 >= 10000) {
                                    return n0.f(i9, "custom (", ")");
                                }
                                return "?";
                            }
                            return "none";
                        }
                        return TtmlNode.TAG_METADATA;
                    }
                    return MimeTypes.BASE_TYPE_TEXT;
                }
                return MimeTypes.BASE_TYPE_VIDEO;
            }
            return MimeTypes.BASE_TYPE_AUDIO;
        }
        return "default";
    }

    private void printInternalError(AnalyticsListener.EventTime eventTime, String str, Exception exc) {
        loge(eventTime, "internalError", str, exc);
    }

    private void printMetadata(Metadata metadata, String str) {
        for (int i9 = 0; i9 < metadata.length(); i9++) {
            StringBuilder b = AbstractC2965e.b(str);
            b.append(metadata.get(i9));
            logd(b.toString());
        }
    }

    public void logd(String str) {
        Log.d(TAG, str);
    }

    public void loge(String str, Throwable th) {
        Log.e(TAG, str, th);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.analytics.AnalyticsListener
    public void onAudioSessionId(AnalyticsListener.EventTime eventTime, int i9) {
        logd(eventTime, "audioSessionId", Integer.toString(i9));
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.analytics.AnalyticsListener
    public void onAudioUnderrun(AnalyticsListener.EventTime eventTime, int i9, long j7, long j9) {
        StringBuilder sb = new StringBuilder();
        sb.append(i9);
        sb.append(", ");
        sb.append(j7);
        sb.append(", ");
        loge(eventTime, "audioTrackUnderrun", n0.k(sb, j9, "]"), null);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.analytics.AnalyticsListener
    public void onBandwidthEstimate(AnalyticsListener.EventTime eventTime, int i9, long j7, long j9) {
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.analytics.AnalyticsListener
    public void onDecoderDisabled(AnalyticsListener.EventTime eventTime, int i9, DecoderCounters decoderCounters) {
        logd(eventTime, "decoderDisabled", getTrackTypeString(i9));
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.analytics.AnalyticsListener
    public void onDecoderEnabled(AnalyticsListener.EventTime eventTime, int i9, DecoderCounters decoderCounters) {
        logd(eventTime, "decoderEnabled", getTrackTypeString(i9));
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.analytics.AnalyticsListener
    public void onDecoderInitialized(AnalyticsListener.EventTime eventTime, int i9, String str, long j7) {
        logd(eventTime, "decoderInitialized", n0.l(new StringBuilder(), getTrackTypeString(i9), ", ", str));
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.analytics.AnalyticsListener
    public void onDecoderInputFormatChanged(AnalyticsListener.EventTime eventTime, int i9, Format format) {
        logd(eventTime, "decoderInputFormatChanged", getTrackTypeString(i9) + ", " + Format.toLogString(format));
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.analytics.AnalyticsListener
    public void onDownstreamFormatChanged(AnalyticsListener.EventTime eventTime, MediaSourceEventListener.MediaLoadData mediaLoadData) {
        logd(eventTime, "downstreamFormatChanged", Format.toLogString(mediaLoadData.trackFormat));
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.analytics.AnalyticsListener
    public void onDrmKeysLoaded(AnalyticsListener.EventTime eventTime) {
        logd(eventTime, "drmKeysLoaded");
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.analytics.AnalyticsListener
    public void onDrmKeysRemoved(AnalyticsListener.EventTime eventTime) {
        logd(eventTime, "drmKeysRemoved");
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.analytics.AnalyticsListener
    public void onDrmKeysRestored(AnalyticsListener.EventTime eventTime) {
        logd(eventTime, "drmKeysRestored");
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.analytics.AnalyticsListener
    public void onDrmSessionManagerError(AnalyticsListener.EventTime eventTime, Exception exc) {
        printInternalError(eventTime, "drmSessionManagerError", exc);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.analytics.AnalyticsListener
    public void onDroppedVideoFrames(AnalyticsListener.EventTime eventTime, int i9, long j7) {
        logd(eventTime, "droppedFrames", Integer.toString(i9));
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.analytics.AnalyticsListener
    public void onLoadCanceled(AnalyticsListener.EventTime eventTime, MediaSourceEventListener.LoadEventInfo loadEventInfo, MediaSourceEventListener.MediaLoadData mediaLoadData) {
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.analytics.AnalyticsListener
    public void onLoadCompleted(AnalyticsListener.EventTime eventTime, MediaSourceEventListener.LoadEventInfo loadEventInfo, MediaSourceEventListener.MediaLoadData mediaLoadData) {
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.analytics.AnalyticsListener
    public void onLoadError(AnalyticsListener.EventTime eventTime, MediaSourceEventListener.LoadEventInfo loadEventInfo, MediaSourceEventListener.MediaLoadData mediaLoadData, IOException iOException, boolean z8) {
        printInternalError(eventTime, "loadError", iOException);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.analytics.AnalyticsListener
    public void onLoadStarted(AnalyticsListener.EventTime eventTime, MediaSourceEventListener.LoadEventInfo loadEventInfo, MediaSourceEventListener.MediaLoadData mediaLoadData) {
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.analytics.AnalyticsListener
    public void onLoadingChanged(AnalyticsListener.EventTime eventTime, boolean z8) {
        logd(eventTime, "loading", Boolean.toString(z8));
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.analytics.AnalyticsListener
    public void onMediaPeriodCreated(AnalyticsListener.EventTime eventTime) {
        logd(eventTime, "mediaPeriodCreated");
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.analytics.AnalyticsListener
    public void onMediaPeriodReleased(AnalyticsListener.EventTime eventTime) {
        logd(eventTime, "mediaPeriodReleased");
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.analytics.AnalyticsListener
    public void onMetadata(AnalyticsListener.EventTime eventTime, Metadata metadata) {
        logd("metadata [" + getEventTimeString(eventTime) + ", ");
        printMetadata(metadata, "  ");
        logd("]");
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.analytics.AnalyticsListener
    public void onNetworkTypeChanged(AnalyticsListener.EventTime eventTime, NetworkInfo networkInfo) {
        String networkInfo2;
        if (networkInfo == null) {
            networkInfo2 = "none";
        } else {
            networkInfo2 = networkInfo.toString();
        }
        logd(eventTime, "networkTypeChanged", networkInfo2);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.analytics.AnalyticsListener
    public void onPlaybackParametersChanged(AnalyticsListener.EventTime eventTime, PlaybackParameters playbackParameters) {
        logd(eventTime, "playbackParameters", Util.formatInvariant("speed=%.2f, pitch=%.2f, skipSilence=%s", Float.valueOf(playbackParameters.speed), Float.valueOf(playbackParameters.pitch), Boolean.valueOf(playbackParameters.skipSilence)));
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.analytics.AnalyticsListener
    public void onPlayerError(AnalyticsListener.EventTime eventTime, ExoPlaybackException exoPlaybackException) {
        loge(eventTime, "playerFailed", exoPlaybackException);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.analytics.AnalyticsListener
    public void onPlayerStateChanged(AnalyticsListener.EventTime eventTime, boolean z8, int i9) {
        logd(eventTime, "state", z8 + ", " + getStateString(i9));
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.analytics.AnalyticsListener
    public void onPositionDiscontinuity(AnalyticsListener.EventTime eventTime, int i9) {
        logd(eventTime, "positionDiscontinuity", getDiscontinuityReasonString(i9));
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.analytics.AnalyticsListener
    public void onReadingStarted(AnalyticsListener.EventTime eventTime) {
        logd(eventTime, "mediaPeriodReadingStarted");
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.analytics.AnalyticsListener
    public void onRenderedFirstFrame(AnalyticsListener.EventTime eventTime, Surface surface) {
        logd(eventTime, "renderedFirstFrame", surface.toString());
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.analytics.AnalyticsListener
    public void onRepeatModeChanged(AnalyticsListener.EventTime eventTime, int i9) {
        logd(eventTime, "repeatMode", getRepeatModeString(i9));
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.analytics.AnalyticsListener
    public void onSeekProcessed(AnalyticsListener.EventTime eventTime) {
        logd(eventTime, "seekProcessed");
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.analytics.AnalyticsListener
    public void onSeekStarted(AnalyticsListener.EventTime eventTime) {
        logd(eventTime, "seekStarted");
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.analytics.AnalyticsListener
    public void onShuffleModeChanged(AnalyticsListener.EventTime eventTime, boolean z8) {
        logd(eventTime, "shuffleModeEnabled", Boolean.toString(z8));
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.analytics.AnalyticsListener
    public void onTimelineChanged(AnalyticsListener.EventTime eventTime, int i9) {
        int periodCount = eventTime.timeline.getPeriodCount();
        int windowCount = eventTime.timeline.getWindowCount();
        logd("timelineChanged [" + getEventTimeString(eventTime) + ", periodCount=" + periodCount + ", windowCount=" + windowCount + ", reason=" + getTimelineChangeReasonString(i9));
        for (int i10 = 0; i10 < Math.min(periodCount, 3); i10++) {
            eventTime.timeline.getPeriod(i10, this.period);
            logd("  period [" + getTimeString(this.period.getDurationMs()) + "]");
        }
        if (periodCount > 3) {
            logd("  ...");
        }
        for (int i11 = 0; i11 < Math.min(windowCount, 3); i11++) {
            eventTime.timeline.getWindow(i11, this.window);
            logd("  window [" + getTimeString(this.window.getDurationMs()) + ", " + this.window.isSeekable + ", " + this.window.isDynamic + "]");
        }
        if (windowCount > 3) {
            logd("  ...");
        }
        logd("]");
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.analytics.AnalyticsListener
    public void onTracksChanged(AnalyticsListener.EventTime eventTime, TrackGroupArray trackGroupArray, TrackSelectionArray trackSelectionArray) {
        MappingTrackSelector.MappedTrackInfo mappedTrackInfo;
        int i9;
        MappingTrackSelector mappingTrackSelector = this.trackSelector;
        if (mappingTrackSelector != null) {
            mappedTrackInfo = mappingTrackSelector.getCurrentMappedTrackInfo();
        } else {
            mappedTrackInfo = null;
        }
        if (mappedTrackInfo == null) {
            logd(eventTime, "tracksChanged", "[]");
            return;
        }
        logd("tracksChanged [" + getEventTimeString(eventTime) + ", ");
        int rendererCount = mappedTrackInfo.getRendererCount();
        int i10 = 0;
        while (true) {
            String str = "  ]";
            String str2 = " [";
            if (i10 >= rendererCount) {
                break;
            }
            TrackGroupArray trackGroups = mappedTrackInfo.getTrackGroups(i10);
            TrackSelection trackSelection = trackSelectionArray.get(i10);
            if (trackGroups.length > 0) {
                i9 = rendererCount;
                logd("  Renderer:" + i10 + " [");
                int i11 = 0;
                while (i11 < trackGroups.length) {
                    TrackGroup trackGroup = trackGroups.get(i11);
                    TrackGroupArray trackGroupArray2 = trackGroups;
                    String str3 = str;
                    logd("    Group:" + i11 + ", adaptive_supported=" + getAdaptiveSupportString(trackGroup.length, mappedTrackInfo.getAdaptiveSupport(i10, i11, false)) + str2);
                    int i12 = 0;
                    while (i12 < trackGroup.length) {
                        logd("      " + getTrackStatusString(trackSelection, trackGroup, i12) + " Track:" + i12 + ", " + Format.toLogString(trackGroup.getFormat(i12)) + ", supported=" + getFormatSupportString(mappedTrackInfo.getTrackSupport(i10, i11, i12)));
                        i12++;
                        str2 = str2;
                    }
                    logd("    ]");
                    i11++;
                    trackGroups = trackGroupArray2;
                    str = str3;
                }
                String str4 = str;
                if (trackSelection != null) {
                    int i13 = 0;
                    while (true) {
                        if (i13 >= trackSelection.length()) {
                            break;
                        }
                        Metadata metadata = trackSelection.getFormat(i13).metadata;
                        if (metadata != null) {
                            logd("    Metadata [");
                            printMetadata(metadata, "      ");
                            logd("    ]");
                            break;
                        }
                        i13++;
                    }
                }
                logd(str4);
            } else {
                i9 = rendererCount;
            }
            i10++;
            rendererCount = i9;
        }
        String str5 = " [";
        TrackGroupArray unmappedTrackGroups = mappedTrackInfo.getUnmappedTrackGroups();
        if (unmappedTrackGroups.length > 0) {
            logd("  Renderer:None [");
            int i14 = 0;
            while (i14 < unmappedTrackGroups.length) {
                StringBuilder sb = new StringBuilder("    Group:");
                sb.append(i14);
                String str6 = str5;
                sb.append(str6);
                logd(sb.toString());
                TrackGroup trackGroup2 = unmappedTrackGroups.get(i14);
                for (int i15 = 0; i15 < trackGroup2.length; i15++) {
                    logd("      " + getTrackStatusString(false) + " Track:" + i15 + ", " + Format.toLogString(trackGroup2.getFormat(i15)) + ", supported=" + getFormatSupportString(0));
                }
                logd("    ]");
                i14++;
                str5 = str6;
            }
            logd("  ]");
        }
        logd("]");
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.analytics.AnalyticsListener
    public void onUpstreamDiscarded(AnalyticsListener.EventTime eventTime, MediaSourceEventListener.MediaLoadData mediaLoadData) {
        logd(eventTime, "upstreamDiscarded", Format.toLogString(mediaLoadData.trackFormat));
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.analytics.AnalyticsListener
    public void onVideoSizeChanged(AnalyticsListener.EventTime eventTime, int i9, int i10, int i11, float f9) {
        logd(eventTime, "videoSizeChanged", i9 + ", " + i10);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.analytics.AnalyticsListener
    public void onViewportSizeChange(AnalyticsListener.EventTime eventTime, int i9, int i10) {
        logd(eventTime, "viewportSizeChanged", i9 + ", " + i10);
    }

    private void logd(AnalyticsListener.EventTime eventTime, String str) {
        logd(getEventString(eventTime, str));
    }

    private void loge(AnalyticsListener.EventTime eventTime, String str, Throwable th) {
        loge(getEventString(eventTime, str), th);
    }

    private void logd(AnalyticsListener.EventTime eventTime, String str, String str2) {
        logd(getEventString(eventTime, str, str2));
    }

    private void loge(AnalyticsListener.EventTime eventTime, String str, String str2, Throwable th) {
        loge(getEventString(eventTime, str, str2), th);
    }

    private static String getTrackStatusString(boolean z8) {
        return z8 ? "[X]" : "[ ]";
    }

    private String getEventString(AnalyticsListener.EventTime eventTime, String str, String str2) {
        return n0.m(AbstractC2965e.c(str, " ["), getEventTimeString(eventTime), ", ", str2, "]");
    }
}
