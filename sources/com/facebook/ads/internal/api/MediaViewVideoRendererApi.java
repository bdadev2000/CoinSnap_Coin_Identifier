package com.facebook.ads.internal.api;

import android.view.View;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.Keep;
import com.facebook.ads.MediaViewVideoRenderer;
import com.facebook.ads.VideoStartReason;

@Keep
/* loaded from: classes2.dex */
public interface MediaViewVideoRendererApi extends AdComponentViewApiProvider {
    void destroy();

    void disengageSeek(VideoStartReason videoStartReason);

    void engageSeek();

    @IntRange
    int getCurrentTimeMs();

    @IntRange
    int getDuration();

    View getVideoView();

    @FloatRange
    float getVolume();

    void initialize(AdViewConstructorParams adViewConstructorParams, MediaViewVideoRenderer mediaViewVideoRenderer);

    void pause(boolean z2);

    void play(VideoStartReason videoStartReason);

    void seekTo(@IntRange int i2);

    void setVolume(@FloatRange float f2);

    boolean shouldAutoplay();
}
