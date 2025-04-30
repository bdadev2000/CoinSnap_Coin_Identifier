package com.mbridge.msdk.playercommon.exoplayer2;

import android.util.Pair;
import com.mbridge.msdk.playercommon.exoplayer2.source.ads.AdPlaybackState;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;

/* loaded from: classes3.dex */
public abstract class Timeline {
    public static final Timeline EMPTY = new Timeline() { // from class: com.mbridge.msdk.playercommon.exoplayer2.Timeline.1
        @Override // com.mbridge.msdk.playercommon.exoplayer2.Timeline
        public int getIndexOfPeriod(Object obj) {
            return -1;
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.Timeline
        public Period getPeriod(int i9, Period period, boolean z8) {
            throw new IndexOutOfBoundsException();
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.Timeline
        public int getPeriodCount() {
            return 0;
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.Timeline
        public Window getWindow(int i9, Window window, boolean z8, long j7) {
            throw new IndexOutOfBoundsException();
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.Timeline
        public int getWindowCount() {
            return 0;
        }
    };

    /* loaded from: classes3.dex */
    public static final class Period {
        private AdPlaybackState adPlaybackState;
        public long durationUs;
        public Object id;
        private long positionInWindowUs;
        public Object uid;
        public int windowIndex;

        public final int getAdCountInAdGroup(int i9) {
            return this.adPlaybackState.adGroups[i9].count;
        }

        public final long getAdDurationUs(int i9, int i10) {
            AdPlaybackState.AdGroup adGroup = this.adPlaybackState.adGroups[i9];
            if (adGroup.count != -1) {
                return adGroup.durationsUs[i10];
            }
            return C.TIME_UNSET;
        }

        public final int getAdGroupCount() {
            return this.adPlaybackState.adGroupCount;
        }

        public final int getAdGroupIndexAfterPositionUs(long j7) {
            return this.adPlaybackState.getAdGroupIndexAfterPositionUs(j7);
        }

        public final int getAdGroupIndexForPositionUs(long j7) {
            return this.adPlaybackState.getAdGroupIndexForPositionUs(j7);
        }

        public final long getAdGroupTimeUs(int i9) {
            return this.adPlaybackState.adGroupTimesUs[i9];
        }

        public final long getAdResumePositionUs() {
            return this.adPlaybackState.adResumePositionUs;
        }

        public final long getDurationMs() {
            return C.usToMs(this.durationUs);
        }

        public final long getDurationUs() {
            return this.durationUs;
        }

        public final int getFirstAdIndexToPlay(int i9) {
            return this.adPlaybackState.adGroups[i9].getFirstAdIndexToPlay();
        }

        public final int getNextAdIndexToPlay(int i9, int i10) {
            return this.adPlaybackState.adGroups[i9].getNextAdIndexToPlay(i10);
        }

        public final long getPositionInWindowMs() {
            return C.usToMs(this.positionInWindowUs);
        }

        public final long getPositionInWindowUs() {
            return this.positionInWindowUs;
        }

        public final boolean hasPlayedAdGroup(int i9) {
            return !this.adPlaybackState.adGroups[i9].hasUnplayedAds();
        }

        public final boolean isAdAvailable(int i9, int i10) {
            AdPlaybackState.AdGroup adGroup = this.adPlaybackState.adGroups[i9];
            if (adGroup.count != -1 && adGroup.states[i10] != 0) {
                return true;
            }
            return false;
        }

        public final Period set(Object obj, Object obj2, int i9, long j7, long j9) {
            return set(obj, obj2, i9, j7, j9, AdPlaybackState.NONE);
        }

        public final Period set(Object obj, Object obj2, int i9, long j7, long j9, AdPlaybackState adPlaybackState) {
            this.id = obj;
            this.uid = obj2;
            this.windowIndex = i9;
            this.durationUs = j7;
            this.positionInWindowUs = j9;
            this.adPlaybackState = adPlaybackState;
            return this;
        }
    }

    /* loaded from: classes3.dex */
    public static final class Window {
        public long defaultPositionUs;
        public long durationUs;
        public int firstPeriodIndex;
        public boolean isDynamic;
        public boolean isSeekable;
        public int lastPeriodIndex;
        public long positionInFirstPeriodUs;
        public long presentationStartTimeMs;
        public Object tag;
        public long windowStartTimeMs;

        public final long getDefaultPositionMs() {
            return C.usToMs(this.defaultPositionUs);
        }

        public final long getDefaultPositionUs() {
            return this.defaultPositionUs;
        }

        public final long getDurationMs() {
            return C.usToMs(this.durationUs);
        }

        public final long getDurationUs() {
            return this.durationUs;
        }

        public final long getPositionInFirstPeriodMs() {
            return C.usToMs(this.positionInFirstPeriodUs);
        }

        public final long getPositionInFirstPeriodUs() {
            return this.positionInFirstPeriodUs;
        }

        public final Window set(Object obj, long j7, long j9, boolean z8, boolean z9, long j10, long j11, int i9, int i10, long j12) {
            this.tag = obj;
            this.presentationStartTimeMs = j7;
            this.windowStartTimeMs = j9;
            this.isSeekable = z8;
            this.isDynamic = z9;
            this.defaultPositionUs = j10;
            this.durationUs = j11;
            this.firstPeriodIndex = i9;
            this.lastPeriodIndex = i10;
            this.positionInFirstPeriodUs = j12;
            return this;
        }
    }

    public int getFirstWindowIndex(boolean z8) {
        if (isEmpty()) {
            return -1;
        }
        return 0;
    }

    public abstract int getIndexOfPeriod(Object obj);

    public int getLastWindowIndex(boolean z8) {
        if (isEmpty()) {
            return -1;
        }
        return getWindowCount() - 1;
    }

    public final int getNextPeriodIndex(int i9, Period period, Window window, int i10, boolean z8) {
        int i11 = getPeriod(i9, period).windowIndex;
        if (getWindow(i11, window).lastPeriodIndex == i9) {
            int nextWindowIndex = getNextWindowIndex(i11, i10, z8);
            if (nextWindowIndex == -1) {
                return -1;
            }
            return getWindow(nextWindowIndex, window).firstPeriodIndex;
        }
        return i9 + 1;
    }

    public int getNextWindowIndex(int i9, int i10, boolean z8) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    if (i9 == getLastWindowIndex(z8)) {
                        return getFirstWindowIndex(z8);
                    }
                    return i9 + 1;
                }
                throw new IllegalStateException();
            }
            return i9;
        }
        if (i9 == getLastWindowIndex(z8)) {
            return -1;
        }
        return i9 + 1;
    }

    public final Period getPeriod(int i9, Period period) {
        return getPeriod(i9, period, false);
    }

    public abstract Period getPeriod(int i9, Period period, boolean z8);

    public abstract int getPeriodCount();

    public final Pair<Integer, Long> getPeriodPosition(Window window, Period period, int i9, long j7) {
        return getPeriodPosition(window, period, i9, j7, 0L);
    }

    public int getPreviousWindowIndex(int i9, int i10, boolean z8) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    if (i9 == getFirstWindowIndex(z8)) {
                        return getLastWindowIndex(z8);
                    }
                    return i9 - 1;
                }
                throw new IllegalStateException();
            }
            return i9;
        }
        if (i9 == getFirstWindowIndex(z8)) {
            return -1;
        }
        return i9 - 1;
    }

    public final Window getWindow(int i9, Window window) {
        return getWindow(i9, window, false);
    }

    public abstract Window getWindow(int i9, Window window, boolean z8, long j7);

    public abstract int getWindowCount();

    public final boolean isEmpty() {
        if (getWindowCount() == 0) {
            return true;
        }
        return false;
    }

    public final boolean isLastPeriod(int i9, Period period, Window window, int i10, boolean z8) {
        if (getNextPeriodIndex(i9, period, window, i10, z8) == -1) {
            return true;
        }
        return false;
    }

    public final Pair<Integer, Long> getPeriodPosition(Window window, Period period, int i9, long j7, long j9) {
        Assertions.checkIndex(i9, 0, getWindowCount());
        getWindow(i9, window, false, j9);
        if (j7 == C.TIME_UNSET) {
            j7 = window.getDefaultPositionUs();
            if (j7 == C.TIME_UNSET) {
                return null;
            }
        }
        int i10 = window.firstPeriodIndex;
        long positionInFirstPeriodUs = window.getPositionInFirstPeriodUs() + j7;
        long durationUs = getPeriod(i10, period).getDurationUs();
        while (durationUs != C.TIME_UNSET && positionInFirstPeriodUs >= durationUs && i10 < window.lastPeriodIndex) {
            positionInFirstPeriodUs -= durationUs;
            i10++;
            durationUs = getPeriod(i10, period).getDurationUs();
        }
        return Pair.create(Integer.valueOf(i10), Long.valueOf(positionInFirstPeriodUs));
    }

    public final Window getWindow(int i9, Window window, boolean z8) {
        return getWindow(i9, window, z8, 0L);
    }
}
