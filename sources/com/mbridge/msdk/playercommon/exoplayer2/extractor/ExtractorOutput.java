package com.mbridge.msdk.playercommon.exoplayer2.extractor;

/* loaded from: classes3.dex */
public interface ExtractorOutput {
    void endTracks();

    void seekMap(SeekMap seekMap);

    TrackOutput track(int i9, int i10);
}
