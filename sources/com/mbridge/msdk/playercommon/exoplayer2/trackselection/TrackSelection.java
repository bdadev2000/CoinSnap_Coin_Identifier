package com.mbridge.msdk.playercommon.exoplayer2.trackselection;

import com.mbridge.msdk.playercommon.exoplayer2.Format;
import com.mbridge.msdk.playercommon.exoplayer2.source.TrackGroup;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.MediaChunk;
import java.util.List;

/* loaded from: classes4.dex */
public interface TrackSelection {

    /* loaded from: classes4.dex */
    public interface Factory {
        TrackSelection createTrackSelection(TrackGroup trackGroup, int... iArr);
    }

    boolean blacklist(int i10, long j3);

    void disable();

    void enable();

    int evaluateQueueSize(long j3, List<? extends MediaChunk> list);

    Format getFormat(int i10);

    int getIndexInTrackGroup(int i10);

    Format getSelectedFormat();

    int getSelectedIndex();

    int getSelectedIndexInTrackGroup();

    Object getSelectionData();

    int getSelectionReason();

    TrackGroup getTrackGroup();

    int indexOf(int i10);

    int indexOf(Format format);

    int length();

    void onPlaybackSpeed(float f10);

    void updateSelectedTrack(long j3, long j10, long j11);
}
