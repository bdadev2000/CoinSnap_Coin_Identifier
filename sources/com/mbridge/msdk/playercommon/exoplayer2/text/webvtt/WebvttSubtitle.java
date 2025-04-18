package com.mbridge.msdk.playercommon.exoplayer2.text.webvtt;

import android.text.SpannableStringBuilder;
import com.mbridge.msdk.playercommon.exoplayer2.text.Cue;
import com.mbridge.msdk.playercommon.exoplayer2.text.Subtitle;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
final class WebvttSubtitle implements Subtitle {
    private final long[] cueTimesUs;
    private final List<WebvttCue> cues;
    private final int numCues;
    private final long[] sortedCueTimesUs;

    public WebvttSubtitle(List<WebvttCue> list) {
        this.cues = list;
        int size = list.size();
        this.numCues = size;
        this.cueTimesUs = new long[size * 2];
        for (int i10 = 0; i10 < this.numCues; i10++) {
            WebvttCue webvttCue = list.get(i10);
            int i11 = i10 * 2;
            long[] jArr = this.cueTimesUs;
            jArr[i11] = webvttCue.startTime;
            jArr[i11 + 1] = webvttCue.endTime;
        }
        long[] jArr2 = this.cueTimesUs;
        long[] copyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.sortedCueTimesUs = copyOf;
        Arrays.sort(copyOf);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.text.Subtitle
    public final List<Cue> getCues(long j3) {
        SpannableStringBuilder spannableStringBuilder = null;
        ArrayList arrayList = null;
        WebvttCue webvttCue = null;
        for (int i10 = 0; i10 < this.numCues; i10++) {
            long[] jArr = this.cueTimesUs;
            int i11 = i10 * 2;
            if (jArr[i11] <= j3 && j3 < jArr[i11 + 1]) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                WebvttCue webvttCue2 = this.cues.get(i10);
                if (webvttCue2.isNormalCue()) {
                    if (webvttCue == null) {
                        webvttCue = webvttCue2;
                    } else if (spannableStringBuilder == null) {
                        spannableStringBuilder = new SpannableStringBuilder();
                        spannableStringBuilder.append(webvttCue.text).append((CharSequence) "\n").append(webvttCue2.text);
                    } else {
                        spannableStringBuilder.append((CharSequence) "\n").append(webvttCue2.text);
                    }
                } else {
                    arrayList.add(webvttCue2);
                }
            }
        }
        if (spannableStringBuilder != null) {
            arrayList.add(new WebvttCue(spannableStringBuilder));
        } else if (webvttCue != null) {
            arrayList.add(webvttCue);
        }
        if (arrayList != null) {
            return arrayList;
        }
        return Collections.emptyList();
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.text.Subtitle
    public final long getEventTime(int i10) {
        boolean z10;
        boolean z11 = true;
        if (i10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        Assertions.checkArgument(z10);
        if (i10 >= this.sortedCueTimesUs.length) {
            z11 = false;
        }
        Assertions.checkArgument(z11);
        return this.sortedCueTimesUs[i10];
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.text.Subtitle
    public final int getEventTimeCount() {
        return this.sortedCueTimesUs.length;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.text.Subtitle
    public final int getNextEventTimeIndex(long j3) {
        int binarySearchCeil = Util.binarySearchCeil(this.sortedCueTimesUs, j3, false, false);
        if (binarySearchCeil >= this.sortedCueTimesUs.length) {
            return -1;
        }
        return binarySearchCeil;
    }
}
