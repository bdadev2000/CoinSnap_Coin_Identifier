package com.google.android.exoplayer2.util;

import com.google.android.exoplayer2.PlaybackParameters;

/* loaded from: classes12.dex */
public interface MediaClock {
    PlaybackParameters getPlaybackParameters();

    long getPositionUs();

    void setPlaybackParameters(PlaybackParameters playbackParameters);
}
