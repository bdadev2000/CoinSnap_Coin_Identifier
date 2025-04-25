package com.google.android.exoplayer2;

import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.audio.AudioAttributes;
import com.google.android.exoplayer2.audio.AudioListener;
import com.google.android.exoplayer2.audio.AuxEffectInfo;
import com.google.android.exoplayer2.device.DeviceInfo;
import com.google.android.exoplayer2.device.DeviceListener;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.MetadataOutput;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.TextOutput;
import com.google.android.exoplayer2.trackselection.TrackSelectionArray;
import com.google.android.exoplayer2.util.MutableFlags;
import com.google.android.exoplayer2.video.VideoFrameMetadataListener;
import com.google.android.exoplayer2.video.VideoListener;
import com.google.android.exoplayer2.video.spherical.CameraMotionListener;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;

/* loaded from: classes12.dex */
public interface Player {
    public static final int DISCONTINUITY_REASON_AD_INSERTION = 3;
    public static final int DISCONTINUITY_REASON_INTERNAL = 4;
    public static final int DISCONTINUITY_REASON_PERIOD_TRANSITION = 0;
    public static final int DISCONTINUITY_REASON_SEEK = 1;
    public static final int DISCONTINUITY_REASON_SEEK_ADJUSTMENT = 2;
    public static final int EVENT_IS_LOADING_CHANGED = 4;
    public static final int EVENT_IS_PLAYING_CHANGED = 8;
    public static final int EVENT_MEDIA_ITEM_TRANSITION = 1;
    public static final int EVENT_PLAYBACK_PARAMETERS_CHANGED = 13;
    public static final int EVENT_PLAYBACK_STATE_CHANGED = 5;
    public static final int EVENT_PLAYBACK_SUPPRESSION_REASON_CHANGED = 7;
    public static final int EVENT_PLAYER_ERROR = 11;
    public static final int EVENT_PLAY_WHEN_READY_CHANGED = 6;
    public static final int EVENT_POSITION_DISCONTINUITY = 12;
    public static final int EVENT_REPEAT_MODE_CHANGED = 9;
    public static final int EVENT_SHUFFLE_MODE_ENABLED_CHANGED = 10;
    public static final int EVENT_STATIC_METADATA_CHANGED = 3;
    public static final int EVENT_TIMELINE_CHANGED = 0;
    public static final int EVENT_TRACKS_CHANGED = 2;
    public static final int MEDIA_ITEM_TRANSITION_REASON_AUTO = 1;
    public static final int MEDIA_ITEM_TRANSITION_REASON_PLAYLIST_CHANGED = 3;
    public static final int MEDIA_ITEM_TRANSITION_REASON_REPEAT = 0;
    public static final int MEDIA_ITEM_TRANSITION_REASON_SEEK = 2;
    public static final int PLAYBACK_SUPPRESSION_REASON_NONE = 0;
    public static final int PLAYBACK_SUPPRESSION_REASON_TRANSIENT_AUDIO_FOCUS_LOSS = 1;
    public static final int PLAY_WHEN_READY_CHANGE_REASON_AUDIO_BECOMING_NOISY = 3;
    public static final int PLAY_WHEN_READY_CHANGE_REASON_AUDIO_FOCUS_LOSS = 2;
    public static final int PLAY_WHEN_READY_CHANGE_REASON_END_OF_MEDIA_ITEM = 5;
    public static final int PLAY_WHEN_READY_CHANGE_REASON_REMOTE = 4;
    public static final int PLAY_WHEN_READY_CHANGE_REASON_USER_REQUEST = 1;
    public static final int REPEAT_MODE_ALL = 2;
    public static final int REPEAT_MODE_OFF = 0;
    public static final int REPEAT_MODE_ONE = 1;
    public static final int STATE_BUFFERING = 2;
    public static final int STATE_ENDED = 4;
    public static final int STATE_IDLE = 1;
    public static final int STATE_READY = 3;
    public static final int TIMELINE_CHANGE_REASON_PLAYLIST_CHANGED = 0;
    public static final int TIMELINE_CHANGE_REASON_SOURCE_UPDATE = 1;

    /* loaded from: classes12.dex */
    public interface AudioComponent {
        void addAudioListener(AudioListener audioListener);

        void clearAuxEffectInfo();

        AudioAttributes getAudioAttributes();

        int getAudioSessionId();

        boolean getSkipSilenceEnabled();

        float getVolume();

        void removeAudioListener(AudioListener audioListener);

        void setAudioAttributes(AudioAttributes audioAttributes, boolean z);

        void setAudioSessionId(int i);

        void setAuxEffectInfo(AuxEffectInfo auxEffectInfo);

        void setSkipSilenceEnabled(boolean z);

        void setVolume(float f);
    }

    /* loaded from: classes12.dex */
    public interface DeviceComponent {
        void addDeviceListener(DeviceListener deviceListener);

        void decreaseDeviceVolume();

        DeviceInfo getDeviceInfo();

        int getDeviceVolume();

        void increaseDeviceVolume();

        boolean isDeviceMuted();

        void removeDeviceListener(DeviceListener deviceListener);

        void setDeviceMuted(boolean z);

        void setDeviceVolume(int i);
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes12.dex */
    public @interface DiscontinuityReason {
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes12.dex */
    public @interface EventFlags {
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes12.dex */
    public @interface MediaItemTransitionReason {
    }

    /* loaded from: classes12.dex */
    public interface MetadataComponent {
        void addMetadataOutput(MetadataOutput metadataOutput);

        void removeMetadataOutput(MetadataOutput metadataOutput);
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes12.dex */
    public @interface PlayWhenReadyChangeReason {
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes12.dex */
    public @interface PlaybackSuppressionReason {
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes12.dex */
    public @interface RepeatMode {
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes12.dex */
    public @interface State {
    }

    /* loaded from: classes12.dex */
    public interface TextComponent {
        void addTextOutput(TextOutput textOutput);

        List<Cue> getCurrentCues();

        void removeTextOutput(TextOutput textOutput);
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes12.dex */
    public @interface TimelineChangeReason {
    }

    /* loaded from: classes12.dex */
    public interface VideoComponent {
        void addVideoListener(VideoListener videoListener);

        void clearCameraMotionListener(CameraMotionListener cameraMotionListener);

        void clearVideoFrameMetadataListener(VideoFrameMetadataListener videoFrameMetadataListener);

        void clearVideoSurface();

        void clearVideoSurface(Surface surface);

        void clearVideoSurfaceHolder(SurfaceHolder surfaceHolder);

        void clearVideoSurfaceView(SurfaceView surfaceView);

        void clearVideoTextureView(TextureView textureView);

        int getVideoScalingMode();

        void removeVideoListener(VideoListener videoListener);

        void setCameraMotionListener(CameraMotionListener cameraMotionListener);

        void setVideoFrameMetadataListener(VideoFrameMetadataListener videoFrameMetadataListener);

        void setVideoScalingMode(int i);

        void setVideoSurface(Surface surface);

        void setVideoSurfaceHolder(SurfaceHolder surfaceHolder);

        void setVideoSurfaceView(SurfaceView surfaceView);

        void setVideoTextureView(TextureView textureView);
    }

    void addListener(EventListener eventListener);

    void addMediaItem(int i, MediaItem mediaItem);

    void addMediaItem(MediaItem mediaItem);

    void addMediaItems(int i, List<MediaItem> list);

    void addMediaItems(List<MediaItem> list);

    void clearMediaItems();

    Looper getApplicationLooper();

    AudioComponent getAudioComponent();

    int getBufferedPercentage();

    long getBufferedPosition();

    long getContentBufferedPosition();

    long getContentDuration();

    long getContentPosition();

    int getCurrentAdGroupIndex();

    int getCurrentAdIndexInAdGroup();

    long getCurrentLiveOffset();

    Object getCurrentManifest();

    MediaItem getCurrentMediaItem();

    int getCurrentPeriodIndex();

    long getCurrentPosition();

    List<Metadata> getCurrentStaticMetadata();

    @Deprecated
    Object getCurrentTag();

    Timeline getCurrentTimeline();

    TrackGroupArray getCurrentTrackGroups();

    TrackSelectionArray getCurrentTrackSelections();

    int getCurrentWindowIndex();

    DeviceComponent getDeviceComponent();

    long getDuration();

    MediaItem getMediaItemAt(int i);

    int getMediaItemCount();

    MetadataComponent getMetadataComponent();

    int getNextWindowIndex();

    boolean getPlayWhenReady();

    @Deprecated
    ExoPlaybackException getPlaybackError();

    PlaybackParameters getPlaybackParameters();

    int getPlaybackState();

    int getPlaybackSuppressionReason();

    ExoPlaybackException getPlayerError();

    int getPreviousWindowIndex();

    int getRendererCount();

    int getRendererType(int i);

    int getRepeatMode();

    boolean getShuffleModeEnabled();

    TextComponent getTextComponent();

    long getTotalBufferedDuration();

    VideoComponent getVideoComponent();

    boolean hasNext();

    boolean hasPrevious();

    boolean isCurrentWindowDynamic();

    boolean isCurrentWindowLive();

    boolean isCurrentWindowSeekable();

    boolean isLoading();

    boolean isPlaying();

    boolean isPlayingAd();

    void moveMediaItem(int i, int i2);

    void moveMediaItems(int i, int i2, int i3);

    void next();

    void pause();

    void play();

    void prepare();

    void previous();

    void release();

    void removeListener(EventListener eventListener);

    void removeMediaItem(int i);

    void removeMediaItems(int i, int i2);

    void seekTo(int i, long j);

    void seekTo(long j);

    void seekToDefaultPosition();

    void seekToDefaultPosition(int i);

    void setMediaItem(MediaItem mediaItem);

    void setMediaItem(MediaItem mediaItem, long j);

    void setMediaItem(MediaItem mediaItem, boolean z);

    void setMediaItems(List<MediaItem> list);

    void setMediaItems(List<MediaItem> list, int i, long j);

    void setMediaItems(List<MediaItem> list, boolean z);

    void setPlayWhenReady(boolean z);

    void setPlaybackParameters(PlaybackParameters playbackParameters);

    void setRepeatMode(int i);

    void setShuffleModeEnabled(boolean z);

    void stop();

    @Deprecated
    void stop(boolean z);

    /* loaded from: classes12.dex */
    public interface EventListener {
        default void onEvents(Player player, Events events) {
        }

        default void onExperimentalOffloadSchedulingEnabledChanged(boolean z) {
        }

        default void onExperimentalSleepingForOffloadChanged(boolean z) {
        }

        default void onIsPlayingChanged(boolean z) {
        }

        @Deprecated
        default void onLoadingChanged(boolean z) {
        }

        default void onMediaItemTransition(MediaItem mediaItem, int i) {
        }

        default void onPlayWhenReadyChanged(boolean z, int i) {
        }

        default void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
        }

        default void onPlaybackStateChanged(int i) {
        }

        default void onPlaybackSuppressionReasonChanged(int i) {
        }

        default void onPlayerError(ExoPlaybackException exoPlaybackException) {
        }

        @Deprecated
        default void onPlayerStateChanged(boolean z, int i) {
        }

        default void onPositionDiscontinuity(int i) {
        }

        default void onRepeatModeChanged(int i) {
        }

        @Deprecated
        default void onSeekProcessed() {
        }

        default void onShuffleModeEnabledChanged(boolean z) {
        }

        default void onStaticMetadataChanged(List<Metadata> list) {
        }

        @Deprecated
        default void onTimelineChanged(Timeline timeline, Object obj, int i) {
        }

        default void onTracksChanged(TrackGroupArray trackGroupArray, TrackSelectionArray trackSelectionArray) {
        }

        default void onTimelineChanged(Timeline timeline, int i) {
            onTimelineChanged(timeline, timeline.getWindowCount() == 1 ? timeline.getWindow(0, new Timeline.Window()).manifest : null, i);
        }

        default void onIsLoadingChanged(boolean z) {
            onLoadingChanged(z);
        }
    }

    @Deprecated
    /* loaded from: classes12.dex */
    public static abstract class DefaultEventListener implements EventListener {
        @Override // com.google.android.exoplayer2.Player.EventListener
        public void onTimelineChanged(Timeline timeline, Object obj, int i) {
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public void onTimelineChanged(Timeline timeline, int i) {
            onTimelineChanged(timeline, timeline.getWindowCount() == 1 ? timeline.getWindow(0, new Timeline.Window()).manifest : null, i);
        }
    }

    /* loaded from: classes12.dex */
    public static final class Events extends MutableFlags {
        @Override // com.google.android.exoplayer2.util.MutableFlags
        public boolean contains(int i) {
            return super.contains(i);
        }

        @Override // com.google.android.exoplayer2.util.MutableFlags
        public boolean containsAny(int... iArr) {
            return super.containsAny(iArr);
        }

        @Override // com.google.android.exoplayer2.util.MutableFlags
        public int get(int i) {
            return super.get(i);
        }
    }
}
