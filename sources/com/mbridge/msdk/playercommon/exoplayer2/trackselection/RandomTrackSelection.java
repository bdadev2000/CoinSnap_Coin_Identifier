package com.mbridge.msdk.playercommon.exoplayer2.trackselection;

import android.os.SystemClock;
import com.mbridge.msdk.playercommon.exoplayer2.source.TrackGroup;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.TrackSelection;
import java.util.Random;

/* loaded from: classes3.dex */
public final class RandomTrackSelection extends BaseTrackSelection {
    private final Random random;
    private int selectedIndex;

    /* loaded from: classes3.dex */
    public static final class Factory implements TrackSelection.Factory {
        private final Random random;

        public Factory() {
            this.random = new Random();
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.trackselection.TrackSelection.Factory
        public final RandomTrackSelection createTrackSelection(TrackGroup trackGroup, int... iArr) {
            return new RandomTrackSelection(trackGroup, iArr, this.random);
        }

        public Factory(int i9) {
            this.random = new Random(i9);
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
    public final void updateSelectedTrack(long j7, long j9, long j10) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int i9 = 0;
        for (int i10 = 0; i10 < this.length; i10++) {
            if (!isBlacklisted(i10, elapsedRealtime)) {
                i9++;
            }
        }
        this.selectedIndex = this.random.nextInt(i9);
        if (i9 != this.length) {
            int i11 = 0;
            for (int i12 = 0; i12 < this.length; i12++) {
                if (!isBlacklisted(i12, elapsedRealtime)) {
                    int i13 = i11 + 1;
                    if (this.selectedIndex == i11) {
                        this.selectedIndex = i12;
                        return;
                    }
                    i11 = i13;
                }
            }
        }
    }

    public RandomTrackSelection(TrackGroup trackGroup, int[] iArr, long j7) {
        this(trackGroup, iArr, new Random(j7));
    }

    public RandomTrackSelection(TrackGroup trackGroup, int[] iArr, Random random) {
        super(trackGroup, iArr);
        this.random = random;
        this.selectedIndex = random.nextInt(this.length);
    }
}
