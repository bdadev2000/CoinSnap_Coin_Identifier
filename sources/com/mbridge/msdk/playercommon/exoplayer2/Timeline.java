package com.mbridge.msdk.playercommon.exoplayer2;

import android.util.Pair;
import com.mbridge.msdk.playercommon.exoplayer2.source.ads.AdPlaybackState;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;

/* loaded from: classes4.dex */
public abstract class Timeline {
    public static final Timeline EMPTY = new Timeline() { // from class: com.mbridge.msdk.playercommon.exoplayer2.Timeline.1
        @Override // com.mbridge.msdk.playercommon.exoplayer2.Timeline
        public int getIndexOfPeriod(Object obj) {
            return -1;
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.Timeline
        public Period getPeriod(int i10, Period period, boolean z10) {
            throw new IndexOutOfBoundsException();
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.Timeline
        public int getPeriodCount() {
            return 0;
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.Timeline
        public Window getWindow(int i10, Window window, boolean z10, long j3) {
            throw new IndexOutOfBoundsException();
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.Timeline
        public int getWindowCount() {
            return 0;
        }
    };

    /* loaded from: classes4.dex */
    public static final class Period {
        private AdPlaybackState adPlaybackState;
        public long durationUs;

        /* renamed from: id, reason: collision with root package name */
        public Object f14726id;
        private long positionInWindowUs;
        public Object uid;
        public int windowIndex;

        public final int getAdCountInAdGroup(int i10) {
            return this.adPlaybackState.adGroups[i10].count;
        }

        public final long getAdDurationUs(int i10, int i11) {
            AdPlaybackState.AdGroup adGroup = this.adPlaybackState.adGroups[i10];
            if (adGroup.count != -1) {
                return adGroup.durationsUs[i11];
            }
            return C.TIME_UNSET;
        }

        public final int getAdGroupCount() {
            return this.adPlaybackState.adGroupCount;
        }

        public final int getAdGroupIndexAfterPositionUs(long j3) {
            return this.adPlaybackState.getAdGroupIndexAfterPositionUs(j3);
        }

        public final int getAdGroupIndexForPositionUs(long j3) {
            return this.adPlaybackState.getAdGroupIndexForPositionUs(j3);
        }

        public final long getAdGroupTimeUs(int i10) {
            return this.adPlaybackState.adGroupTimesUs[i10];
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

        public final int getFirstAdIndexToPlay(int i10) {
            return this.adPlaybackState.adGroups[i10].getFirstAdIndexToPlay();
        }

        public final int getNextAdIndexToPlay(int i10, int i11) {
            return this.adPlaybackState.adGroups[i10].getNextAdIndexToPlay(i11);
        }

        public final long getPositionInWindowMs() {
            return C.usToMs(this.positionInWindowUs);
        }

        public final long getPositionInWindowUs() {
            return this.positionInWindowUs;
        }

        public final boolean hasPlayedAdGroup(int i10) {
            return !this.adPlaybackState.adGroups[i10].hasUnplayedAds();
        }

        public final boolean isAdAvailable(int i10, int i11) {
            AdPlaybackState.AdGroup adGroup = this.adPlaybackState.adGroups[i10];
            if (adGroup.count != -1 && adGroup.states[i11] != 0) {
                return true;
            }
            return false;
        }

        public final Period set(Object obj, Object obj2, int i10, long j3, long j10) {
            return set(obj, obj2, i10, j3, j10, AdPlaybackState.NONE);
        }

        public final Period set(Object obj, Object obj2, int i10, long j3, long j10, AdPlaybackState adPlaybackState) {
            this.f14726id = obj;
            this.uid = obj2;
            this.windowIndex = i10;
            this.durationUs = j3;
            this.positionInWindowUs = j10;
            this.adPlaybackState = adPlaybackState;
            return this;
        }
    }

    /* loaded from: classes4.dex */
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

        public final Window set(Object obj, long j3, long j10, boolean z10, boolean z11, long j11, long j12, int i10, int i11, long j13) {
            this.tag = obj;
            this.presentationStartTimeMs = j3;
            this.windowStartTimeMs = j10;
            this.isSeekable = z10;
            this.isDynamic = z11;
            this.defaultPositionUs = j11;
            this.durationUs = j12;
            this.firstPeriodIndex = i10;
            this.lastPeriodIndex = i11;
            this.positionInFirstPeriodUs = j13;
            return this;
        }
    }

    public int getFirstWindowIndex(boolean z10) {
        return isEmpty() ? -1 : 0;
    }

    public abstract int getIndexOfPeriod(Object obj);

    public int getLastWindowIndex(boolean z10) {
        if (isEmpty()) {
            return -1;
        }
        return getWindowCount() - 1;
    }

    public final int getNextPeriodIndex(int i10, Period period, Window window, int i11, boolean z10) {
        int i12 = getPeriod(i10, period).windowIndex;
        if (getWindow(i12, window).lastPeriodIndex == i10) {
            int nextWindowIndex = getNextWindowIndex(i12, i11, z10);
            if (nextWindowIndex == -1) {
                return -1;
            }
            return getWindow(nextWindowIndex, window).firstPeriodIndex;
        }
        return i10 + 1;
    }

    public int getNextWindowIndex(int i10, int i11, boolean z10) {
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    if (i10 == getLastWindowIndex(z10)) {
                        return getFirstWindowIndex(z10);
                    }
                    return i10 + 1;
                }
                throw new IllegalStateException();
            }
            return i10;
        }
        if (i10 == getLastWindowIndex(z10)) {
            return -1;
        }
        return i10 + 1;
    }

    public final Period getPeriod(int i10, Period period) {
        return getPeriod(i10, period, false);
    }

    public abstract Period getPeriod(int i10, Period period, boolean z10);

    public abstract int getPeriodCount();

    public final Pair<Integer, Long> getPeriodPosition(Window window, Period period, int i10, long j3) {
        return getPeriodPosition(window, period, i10, j3, 0L);
    }

    public int getPreviousWindowIndex(int i10, int i11, boolean z10) {
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    if (i10 == getFirstWindowIndex(z10)) {
                        return getLastWindowIndex(z10);
                    }
                    return i10 - 1;
                }
                throw new IllegalStateException();
            }
            return i10;
        }
        if (i10 == getFirstWindowIndex(z10)) {
            return -1;
        }
        return i10 - 1;
    }

    public final Window getWindow(int i10, Window window) {
        return getWindow(i10, window, false);
    }

    public abstract Window getWindow(int i10, Window window, boolean z10, long j3);

    public abstract int getWindowCount();

    public final boolean isEmpty() {
        return getWindowCount() == 0;
    }

    public final boolean isLastPeriod(int i10, Period period, Window window, int i11, boolean z10) {
        return getNextPeriodIndex(i10, period, window, i11, z10) == -1;
    }

    public final Pair<Integer, Long> getPeriodPosition(Window window, Period period, int i10, long j3, long j10) {
        Assertions.checkIndex(i10, 0, getWindowCount());
        getWindow(i10, window, false, j10);
        if (j3 == C.TIME_UNSET) {
            j3 = window.getDefaultPositionUs();
            if (j3 == C.TIME_UNSET) {
                return null;
            }
        }
        int i11 = window.firstPeriodIndex;
        long positionInFirstPeriodUs = window.getPositionInFirstPeriodUs() + j3;
        long durationUs = getPeriod(i11, period).getDurationUs();
        while (durationUs != C.TIME_UNSET && positionInFirstPeriodUs >= durationUs && i11 < window.lastPeriodIndex) {
            positionInFirstPeriodUs -= durationUs;
            i11++;
            durationUs = getPeriod(i11, period).getDurationUs();
        }
        return Pair.create(Integer.valueOf(i11), Long.valueOf(positionInFirstPeriodUs));
    }

    public final Window getWindow(int i10, Window window, boolean z10) {
        return getWindow(i10, window, z10, 0L);
    }
}
