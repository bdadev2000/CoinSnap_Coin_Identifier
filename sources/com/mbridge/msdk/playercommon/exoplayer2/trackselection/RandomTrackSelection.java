package com.mbridge.msdk.playercommon.exoplayer2.trackselection;

import android.os.SystemClock;
import com.mbridge.msdk.playercommon.exoplayer2.source.TrackGroup;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.TrackSelection;
import java.util.Random;

/* loaded from: classes4.dex */
public final class RandomTrackSelection extends BaseTrackSelection {
    private final Random random;
    private int selectedIndex;

    /* loaded from: classes4.dex */
    public static final class Factory implements TrackSelection.Factory {
        private final Random random;

        public Factory() {
            this.random = new Random();
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.trackselection.TrackSelection.Factory
        public final RandomTrackSelection createTrackSelection(TrackGroup trackGroup, int... iArr) {
            return new RandomTrackSelection(trackGroup, iArr, this.random);
        }

        public Factory(int i10) {
            this.random = new Random(i10);
        }
    }

    public RandomTrackSelection(TrackGroup trackGroup, int... iArr) {
        super(trackGroup, iArr);
        Random random = new Random();
        this.random = random;
        this.selectedIndex = random.nextInt(this.length);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.trackselection.TrackSelection
    public final int getSelectedIndex() {
        return this.selectedIndex;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.trackselection.TrackSelection
    public final Object getSelectionData() {
        return null;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.trackselection.TrackSelection
    public final int getSelectionReason() {
        return 3;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.trackselection.TrackSelection
    public final void updateSelectedTrack(long j3, long j10, long j11) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int i10 = 0;
        for (int i11 = 0; i11 < this.length; i11++) {
            if (!isBlacklisted(i11, elapsedRealtime)) {
                i10++;
            }
        }
        this.selectedIndex = this.random.nextInt(i10);
        if (i10 != this.length) {
            int i12 = 0;
            for (int i13 = 0; i13 < this.length; i13++) {
                if (!isBlacklisted(i13, elapsedRealtime)) {
                    int i14 = i12 + 1;
                    if (this.selectedIndex == i12) {
                        this.selectedIndex = i13;
                        return;
                    }
                    i12 = i14;
                }
            }
        }
    }

    public RandomTrackSelection(TrackGroup trackGroup, int[] iArr, long j3) {
        this(trackGroup, iArr, new Random(j3));
    }

    public RandomTrackSelection(TrackGroup trackGroup, int[] iArr, Random random) {
        super(trackGroup, iArr);
        this.random = random;
        this.selectedIndex = random.nextInt(this.length);
    }
}
