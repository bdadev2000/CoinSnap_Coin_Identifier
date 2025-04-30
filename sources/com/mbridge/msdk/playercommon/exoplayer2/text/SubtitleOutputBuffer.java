package com.mbridge.msdk.playercommon.exoplayer2.text;

import com.mbridge.msdk.playercommon.exoplayer2.decoder.OutputBuffer;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class SubtitleOutputBuffer extends OutputBuffer implements Subtitle {
    private long subsampleOffsetUs;
    private Subtitle subtitle;

    @Override // com.mbridge.msdk.playercommon.exoplayer2.decoder.Buffer
    public void clear() {
        super.clear();
        this.subtitle = null;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.text.Subtitle
    public List<Cue> getCues(long j7) {
        return this.subtitle.getCues(j7 - this.subsampleOffsetUs);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.text.Subtitle
    public long getEventTime(int i9) {
        return this.subtitle.getEventTime(i9) + this.subsampleOffsetUs;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.text.Subtitle
    public int getEventTimeCount() {
        return this.subtitle.getEventTimeCount();
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.text.Subtitle
    public int getNextEventTimeIndex(long j7) {
        return this.subtitle.getNextEventTimeIndex(j7 - this.subsampleOffsetUs);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.decoder.OutputBuffer
    public abstract void release();

    public void setContent(long j7, Subtitle subtitle, long j9) {
        this.timeUs = j7;
        this.subtitle = subtitle;
        if (j9 != Long.MAX_VALUE) {
            j7 = j9;
        }
        this.subsampleOffsetUs = j7;
    }
}
