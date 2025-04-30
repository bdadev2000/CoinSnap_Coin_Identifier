package com.mbridge.msdk.playercommon.exoplayer2.text;

import java.util.List;

/* loaded from: classes3.dex */
public interface Subtitle {
    List<Cue> getCues(long j7);

    long getEventTime(int i9);

    int getEventTimeCount();

    int getNextEventTimeIndex(long j7);
}
