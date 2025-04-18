package com.mbridge.msdk.playercommon.exoplayer2.util;

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
import eb.j;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.Locale;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.a;
import vd.e;

/* loaded from: classes4.dex */
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

    private static String getAdaptiveSupportString(int i10, int i11) {
        return i10 < 2 ? "N/A" : i11 != 0 ? i11 != 8 ? i11 != 16 ? "?" : "YES" : "YES_NOT_SEAMLESS" : "NO";
    }

    private static String getDiscontinuityReasonString(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? "?" : "INTERNAL" : "AD_INSERTION" : "SEEK_ADJUSTMENT" : "SEEK" : "PERIOD_TRANSITION";
    }

    private String getEventString(AnalyticsListener.EventTime eventTime, String str) {
        return e.h(j.n(str, " ["), getEventTimeString(eventTime), "]");
    }

    private String getEventTimeString(AnalyticsListener.EventTime eventTime) {
        String str = "window=" + eventTime.windowIndex;
        if (eventTime.mediaPeriodId != null) {
            StringBuilder n10 = j.n(str, ", period=");
            n10.append(eventTime.mediaPeriodId.periodIndex);
            str = n10.toString();
            if (eventTime.mediaPeriodId.isAd()) {
                StringBuilder n11 = j.n(str, ", adGroup=");
                n11.append(eventTime.mediaPeriodId.adGroupIndex);
                StringBuilder n12 = j.n(n11.toString(), ", ad=");
                n12.append(eventTime.mediaPeriodId.adIndexInAdGroup);
                str = n12.toString();
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getTimeString(eventTime.realtimeMs - this.startTimeMs));
        sb2.append(", ");
        return a.n(sb2, getTimeString(eventTime.currentPlaybackPositionMs), ", ", str);
    }

    private static String getFormatSupportString(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? "?" : "YES" : "NO_EXCEEDS_CAPABILITIES" : "NO_UNSUPPORTED_DRM" : "NO_UNSUPPORTED_TYPE" : "NO";
    }

    private static String getRepeatModeString(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? "?" : "ALL" : "ONE" : "OFF";
    }

    private static String getStateString(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? "?" : "ENDED" : "READY" : "BUFFERING" : "IDLE";
    }

    private static String getTimeString(long j3) {
        if (j3 == C.TIME_UNSET) {
            return "?";
        }
        return TIME_FORMAT.format(((float) j3) / 1000.0f);
    }

    private static String getTimelineChangeReasonString(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? "?" : "DYNAMIC" : "RESET" : "PREPARED";
    }

    private static String getTrackStatusString(boolean z10) {
        return z10 ? "[X]" : "[ ]";
    }

    private static String getTrackTypeString(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 != 5) {
                                if (i10 >= 10000) {
                                    return a.i("custom (", i10, ")");
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
        for (int i10 = 0; i10 < metadata.length(); i10++) {
            StringBuilder m10 = j.m(str);
            m10.append(metadata.get(i10));
            logd(m10.toString());
        }
    }

    public void logd(String str) {
        Log.d(TAG, str);
    }

    public void loge(String str, Throwable th2) {
        Log.e(TAG, str, th2);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.analytics.AnalyticsListener
    public void onAudioSessionId(AnalyticsListener.EventTime eventTime, int i10) {
        logd(eventTime, "audioSessionId", Integer.toString(i10));
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.analytics.AnalyticsListener
    public void onAudioUnderrun(AnalyticsListener.EventTime eventTime, int i10, long j3, long j10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(i10);
        sb2.append(", ");
        sb2.append(j3);
        sb2.append(", ");
        loge(eventTime, "audioTrackUnderrun", a4.j.j(sb2, j10, "]"), null);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.analytics.AnalyticsListener
    public void onBandwidthEstimate(AnalyticsListener.EventTime eventTime, int i10, long j3, long j10) {
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.analytics.AnalyticsListener
    public void onDecoderDisabled(AnalyticsListener.EventTime eventTime, int i10, DecoderCounters decoderCounters) {
        logd(eventTime, "decoderDisabled", getTrackTypeString(i10));
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.analytics.AnalyticsListener
    public void onDecoderEnabled(AnalyticsListener.EventTime eventTime, int i10, DecoderCounters decoderCounters) {
        logd(eventTime, "decoderEnabled", getTrackTypeString(i10));
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.analytics.AnalyticsListener
    public void onDecoderInitialized(AnalyticsListener.EventTime eventTime, int i10, String str, long j3) {
        logd(eventTime, "decoderInitialized", a.n(new StringBuilder(), getTrackTypeString(i10), ", ", str));
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.analytics.AnalyticsListener
    public void onDecoderInputFormatChanged(AnalyticsListener.EventTime eventTime, int i10, Format format) {
        logd(eventTime, "decoderInputFormatChanged", getTrackTypeString(i10) + ", " + Format.toLogString(format));
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
    public void onDroppedVideoFrames(AnalyticsListener.EventTime eventTime, int i10, long j3) {
        logd(eventTime, "droppedFrames", Integer.toString(i10));
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.analytics.AnalyticsListener
    public void onLoadCanceled(AnalyticsListener.EventTime eventTime, MediaSourceEventListener.LoadEventInfo loadEventInfo, MediaSourceEventListener.MediaLoadData mediaLoadData) {
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.analytics.AnalyticsListener
    public void onLoadCompleted(AnalyticsListener.EventTime eventTime, MediaSourceEventListener.LoadEventInfo loadEventInfo, MediaSourceEventListener.MediaLoadData mediaLoadData) {
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.analytics.AnalyticsListener
    public void onLoadError(AnalyticsListener.EventTime eventTime, MediaSourceEventListener.LoadEventInfo loadEventInfo, MediaSourceEventListener.MediaLoadData mediaLoadData, IOException iOException, boolean z10) {
        printInternalError(eventTime, "loadError", iOException);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.analytics.AnalyticsListener
    public void onLoadStarted(AnalyticsListener.EventTime eventTime, MediaSourceEventListener.LoadEventInfo loadEventInfo, MediaSourceEventListener.MediaLoadData mediaLoadData) {
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.analytics.AnalyticsListener
    public void onLoadingChanged(AnalyticsListener.EventTime eventTime, boolean z10) {
        logd(eventTime, "loading", Boolean.toString(z10));
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
    public void onPlayerStateChanged(AnalyticsListener.EventTime eventTime, boolean z10, int i10) {
        logd(eventTime, "state", z10 + ", " + getStateString(i10));
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.analytics.AnalyticsListener
    public void onPositionDiscontinuity(AnalyticsListener.EventTime eventTime, int i10) {
        logd(eventTime, "positionDiscontinuity", getDiscontinuityReasonString(i10));
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
    public void onRepeatModeChanged(AnalyticsListener.EventTime eventTime, int i10) {
        logd(eventTime, "repeatMode", getRepeatModeString(i10));
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
    public void onShuffleModeChanged(AnalyticsListener.EventTime eventTime, boolean z10) {
        logd(eventTime, "shuffleModeEnabled", Boolean.toString(z10));
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.analytics.AnalyticsListener
    public void onTimelineChanged(AnalyticsListener.EventTime eventTime, int i10) {
        int periodCount = eventTime.timeline.getPeriodCount();
        int windowCount = eventTime.timeline.getWindowCount();
        logd("timelineChanged [" + getEventTimeString(eventTime) + ", periodCount=" + periodCount + ", windowCount=" + windowCount + ", reason=" + getTimelineChangeReasonString(i10));
        for (int i11 = 0; i11 < Math.min(periodCount, 3); i11++) {
            eventTime.timeline.getPeriod(i11, this.period);
            logd("  period [" + getTimeString(this.period.getDurationMs()) + "]");
        }
        if (periodCount > 3) {
            logd("  ...");
        }
        for (int i12 = 0; i12 < Math.min(windowCount, 3); i12++) {
            eventTime.timeline.getWindow(i12, this.window);
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
        int i10;
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
        int i11 = 0;
        while (true) {
            String str = "  ]";
            String str2 = " [";
            if (i11 >= rendererCount) {
                break;
            }
            TrackGroupArray trackGroups = mappedTrackInfo.getTrackGroups(i11);
            TrackSelection trackSelection = trackSelectionArray.get(i11);
            if (trackGroups.length > 0) {
                i10 = rendererCount;
                logd("  Renderer:" + i11 + " [");
                int i12 = 0;
                while (i12 < trackGroups.length) {
                    TrackGroup trackGroup = trackGroups.get(i12);
                    TrackGroupArray trackGroupArray2 = trackGroups;
                    String str3 = str;
                    logd("    Group:" + i12 + ", adaptive_supported=" + getAdaptiveSupportString(trackGroup.length, mappedTrackInfo.getAdaptiveSupport(i11, i12, false)) + str2);
                    int i13 = 0;
                    while (i13 < trackGroup.length) {
                        logd("      " + getTrackStatusString(trackSelection, trackGroup, i13) + " Track:" + i13 + ", " + Format.toLogString(trackGroup.getFormat(i13)) + ", supported=" + getFormatSupportString(mappedTrackInfo.getTrackSupport(i11, i12, i13)));
                        i13++;
                        str2 = str2;
                    }
                    logd("    ]");
                    i12++;
                    trackGroups = trackGroupArray2;
                    str = str3;
                }
                String str4 = str;
                if (trackSelection != null) {
                    int i14 = 0;
                    while (true) {
                        if (i14 >= trackSelection.length()) {
                            break;
                        }
                        Metadata metadata = trackSelection.getFormat(i14).metadata;
                        if (metadata != null) {
                            logd("    Metadata [");
                            printMetadata(metadata, "      ");
                            logd("    ]");
                            break;
                        }
                        i14++;
                    }
                }
                logd(str4);
            } else {
                i10 = rendererCount;
            }
            i11++;
            rendererCount = i10;
        }
        String str5 = " [";
        TrackGroupArray unmappedTrackGroups = mappedTrackInfo.getUnmappedTrackGroups();
        if (unmappedTrackGroups.length > 0) {
            logd("  Renderer:None [");
            int i15 = 0;
            while (i15 < unmappedTrackGroups.length) {
                StringBuilder sb2 = new StringBuilder("    Group:");
                sb2.append(i15);
                String str6 = str5;
                sb2.append(str6);
                logd(sb2.toString());
                TrackGroup trackGroup2 = unmappedTrackGroups.get(i15);
                for (int i16 = 0; i16 < trackGroup2.length; i16++) {
                    logd("      " + getTrackStatusString(false) + " Track:" + i16 + ", " + Format.toLogString(trackGroup2.getFormat(i16)) + ", supported=" + getFormatSupportString(0));
                }
                logd("    ]");
                i15++;
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
    public void onVideoSizeChanged(AnalyticsListener.EventTime eventTime, int i10, int i11, int i12, float f10) {
        logd(eventTime, "videoSizeChanged", i10 + ", " + i11);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.analytics.AnalyticsListener
    public void onViewportSizeChange(AnalyticsListener.EventTime eventTime, int i10, int i11) {
        logd(eventTime, "viewportSizeChanged", i10 + ", " + i11);
    }

    private static String getTrackStatusString(TrackSelection trackSelection, TrackGroup trackGroup, int i10) {
        return getTrackStatusString((trackSelection == null || trackSelection.getTrackGroup() != trackGroup || trackSelection.indexOf(i10) == -1) ? false : true);
    }

    private void logd(AnalyticsListener.EventTime eventTime, String str) {
        logd(getEventString(eventTime, str));
    }

    private void loge(AnalyticsListener.EventTime eventTime, String str, Throwable th2) {
        loge(getEventString(eventTime, str), th2);
    }

    private void logd(AnalyticsListener.EventTime eventTime, String str, String str2) {
        logd(getEventString(eventTime, str, str2));
    }

    private void loge(AnalyticsListener.EventTime eventTime, String str, String str2, Throwable th2) {
        loge(getEventString(eventTime, str, str2), th2);
    }

    private String getEventString(AnalyticsListener.EventTime eventTime, String str, String str2) {
        return a4.j.k(j.n(str, " ["), getEventTimeString(eventTime), ", ", str2, "]");
    }
}
