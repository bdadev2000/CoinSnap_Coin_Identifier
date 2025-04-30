package com.mbridge.msdk.playercommon.exoplayer2.text.subrip;

import com.mbridge.msdk.playercommon.exoplayer2.text.Cue;
import com.mbridge.msdk.playercommon.exoplayer2.text.Subtitle;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
final class SubripSubtitle implements Subtitle {
    private final long[] cueTimesUs;
    private final Cue[] cues;

    public SubripSubtitle(Cue[] cueArr, long[] jArr) {
        this.cues = cueArr;
        this.cueTimesUs = jArr;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.text.Subtitle
    public final List<Cue> getCues(long j7) {
        Cue cue;
        int binarySearchFloor = Util.binarySearchFloor(this.cueTimesUs, j7, true, false);
        if (binarySearchFloor != -1 && (cue = this.cues[binarySearchFloor]) != null) {
            return Collections.singletonList(cue);
        }
        return Collections.emptyList();
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.text.Subtitle
    public final long getEventTime(int i9) {
        boolean z8;
        boolean z9 = false;
        if (i9 >= 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        Assertions.checkArgument(z8);
        if (i9 < this.cueTimesUs.length) {
            z9 = true;
        }
        Assertions.checkArgument(z9);
        return this.cueTimesUs[i9];
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.text.Subtitle
    public final int getEventTimeCount() {
        return this.cueTimesUs.length;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.text.Subtitle
    public final int getNextEventTimeIndex(long j7) {
        int binarySearchCeil = Util.binarySearchCeil(this.cueTimesUs, j7, false, false);
        if (binarySearchCeil >= this.cueTimesUs.length) {
            return -1;
        }
        return binarySearchCeil;
    }
}
