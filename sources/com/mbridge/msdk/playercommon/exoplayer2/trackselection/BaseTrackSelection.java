package com.mbridge.msdk.playercommon.exoplayer2.trackselection;

import android.os.SystemClock;
import com.mbridge.msdk.playercommon.exoplayer2.Format;
import com.mbridge.msdk.playercommon.exoplayer2.source.TrackGroup;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.MediaChunk;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class BaseTrackSelection implements TrackSelection {
    private final long[] blacklistUntilTimes;
    private final Format[] formats;
    protected final TrackGroup group;
    private int hashCode;
    protected final int length;
    protected final int[] tracks;

    /* loaded from: classes4.dex */
    public static final class DecreasingBandwidthComparator implements Comparator<Format> {
        private DecreasingBandwidthComparator() {
        }

        @Override // java.util.Comparator
        public final int compare(Format format, Format format2) {
            return format2.bitrate - format.bitrate;
        }
    }

    public BaseTrackSelection(TrackGroup trackGroup, int... iArr) {
        boolean z10;
        int i10 = 0;
        if (iArr.length > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        Assertions.checkState(z10);
        this.group = (TrackGroup) Assertions.checkNotNull(trackGroup);
        int length = iArr.length;
        this.length = length;
        this.formats = new Format[length];
        for (int i11 = 0; i11 < iArr.length; i11++) {
            this.formats[i11] = trackGroup.getFormat(iArr[i11]);
        }
        Arrays.sort(this.formats, new DecreasingBandwidthComparator());
        this.tracks = new int[this.length];
        while (true) {
            int i12 = this.length;
            if (i10 < i12) {
                this.tracks[i10] = trackGroup.indexOf(this.formats[i10]);
                i10++;
            } else {
                this.blacklistUntilTimes = new long[i12];
                return;
            }
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.trackselection.TrackSelection
    public final boolean blacklist(int i10, long j3) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean isBlacklisted = isBlacklisted(i10, elapsedRealtime);
        for (int i11 = 0; i11 < this.length && !isBlacklisted; i11++) {
            if (i11 != i10 && !isBlacklisted(i11, elapsedRealtime)) {
                isBlacklisted = true;
            } else {
                isBlacklisted = false;
            }
        }
        if (!isBlacklisted) {
            return false;
        }
        long[] jArr = this.blacklistUntilTimes;
        jArr[i10] = Math.max(jArr[i10], elapsedRealtime + j3);
        return true;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.trackselection.TrackSelection
    public void disable() {
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.trackselection.TrackSelection
    public void enable() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BaseTrackSelection baseTrackSelection = (BaseTrackSelection) obj;
        if (this.group == baseTrackSelection.group && Arrays.equals(this.tracks, baseTrackSelection.tracks)) {
            return true;
        }
        return false;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.trackselection.TrackSelection
    public int evaluateQueueSize(long j3, List<? extends MediaChunk> list) {
        return list.size();
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.trackselection.TrackSelection
    public final Format getFormat(int i10) {
        return this.formats[i10];
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.trackselection.TrackSelection
    public final int getIndexInTrackGroup(int i10) {
        return this.tracks[i10];
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.trackselection.TrackSelection
    public final Format getSelectedFormat() {
        return this.formats[getSelectedIndex()];
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.trackselection.TrackSelection
    public final int getSelectedIndexInTrackGroup() {
        return this.tracks[getSelectedIndex()];
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.trackselection.TrackSelection
    public final TrackGroup getTrackGroup() {
        return this.group;
    }

    public int hashCode() {
        if (this.hashCode == 0) {
            this.hashCode = Arrays.hashCode(this.tracks) + (System.identityHashCode(this.group) * 31);
        }
        return this.hashCode;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.trackselection.TrackSelection
    public final int indexOf(Format format) {
        for (int i10 = 0; i10 < this.length; i10++) {
            if (this.formats[i10] == format) {
                return i10;
            }
        }
        return -1;
    }

    public final boolean isBlacklisted(int i10, long j3) {
        return this.blacklistUntilTimes[i10] > j3;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.trackselection.TrackSelection
    public final int length() {
        return this.tracks.length;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.trackselection.TrackSelection
    public void onPlaybackSpeed(float f10) {
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.trackselection.TrackSelection
    public final int indexOf(int i10) {
        for (int i11 = 0; i11 < this.length; i11++) {
            if (this.tracks[i11] == i10) {
                return i11;
            }
        }
        return -1;
    }
}
