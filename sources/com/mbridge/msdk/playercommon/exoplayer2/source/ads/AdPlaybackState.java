package com.mbridge.msdk.playercommon.exoplayer2.source.ads;

import android.net.Uri;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class AdPlaybackState {
    public static final int AD_STATE_AVAILABLE = 1;
    public static final int AD_STATE_ERROR = 4;
    public static final int AD_STATE_PLAYED = 3;
    public static final int AD_STATE_SKIPPED = 2;
    public static final int AD_STATE_UNAVAILABLE = 0;
    public static final AdPlaybackState NONE = new AdPlaybackState(new long[0]);
    public final int adGroupCount;
    public final long[] adGroupTimesUs;
    public final AdGroup[] adGroups;
    public final long adResumePositionUs;
    public final long contentDurationUs;

    /* loaded from: classes3.dex */
    public static final class AdGroup {
        public final int count;
        public final long[] durationsUs;
        public final int[] states;
        public final Uri[] uris;

        public AdGroup() {
            this(-1, new int[0], new Uri[0], new long[0]);
        }

        private static long[] copyDurationsUsWithSpaceForAdCount(long[] jArr, int i9) {
            int length = jArr.length;
            int max = Math.max(i9, length);
            long[] copyOf = Arrays.copyOf(jArr, max);
            Arrays.fill(copyOf, length, max, C.TIME_UNSET);
            return copyOf;
        }

        private static int[] copyStatesWithSpaceForAdCount(int[] iArr, int i9) {
            int length = iArr.length;
            int max = Math.max(i9, length);
            int[] copyOf = Arrays.copyOf(iArr, max);
            Arrays.fill(copyOf, length, max, 0);
            return copyOf;
        }

        public final int getFirstAdIndexToPlay() {
            return getNextAdIndexToPlay(-1);
        }

        public final int getNextAdIndexToPlay(int i9) {
            int i10;
            int i11 = i9 + 1;
            while (true) {
                int[] iArr = this.states;
                if (i11 >= iArr.length || (i10 = iArr[i11]) == 0 || i10 == 1) {
                    break;
                }
                i11++;
            }
            return i11;
        }

        public final boolean hasUnplayedAds() {
            if (this.count != -1 && getFirstAdIndexToPlay() >= this.count) {
                return false;
            }
            return true;
        }

        public final AdGroup withAdCount(int i9) {
            boolean z8;
            if (this.count == -1 && this.states.length <= i9) {
                z8 = true;
            } else {
                z8 = false;
            }
            Assertions.checkArgument(z8);
            return new AdGroup(i9, copyStatesWithSpaceForAdCount(this.states, i9), (Uri[]) Arrays.copyOf(this.uris, i9), copyDurationsUsWithSpaceForAdCount(this.durationsUs, i9));
        }

        public final AdGroup withAdDurationsUs(long[] jArr) {
            boolean z8;
            if (this.count != -1 && jArr.length > this.uris.length) {
                z8 = false;
            } else {
                z8 = true;
            }
            Assertions.checkArgument(z8);
            int length = jArr.length;
            Uri[] uriArr = this.uris;
            if (length < uriArr.length) {
                jArr = copyDurationsUsWithSpaceForAdCount(jArr, uriArr.length);
            }
            return new AdGroup(this.count, this.states, this.uris, jArr);
        }

        public final AdGroup withAdState(int i9, int i10) {
            boolean z8;
            int i11 = this.count;
            boolean z9 = false;
            if (i11 != -1 && i10 >= i11) {
                z8 = false;
            } else {
                z8 = true;
            }
            Assertions.checkArgument(z8);
            int[] copyStatesWithSpaceForAdCount = copyStatesWithSpaceForAdCount(this.states, i10 + 1);
            int i12 = copyStatesWithSpaceForAdCount[i10];
            if (i12 == 0 || i12 == 1 || i12 == i9) {
                z9 = true;
            }
            Assertions.checkArgument(z9);
            long[] jArr = this.durationsUs;
            if (jArr.length != copyStatesWithSpaceForAdCount.length) {
                jArr = copyDurationsUsWithSpaceForAdCount(jArr, copyStatesWithSpaceForAdCount.length);
            }
            Uri[] uriArr = this.uris;
            if (uriArr.length != copyStatesWithSpaceForAdCount.length) {
                uriArr = (Uri[]) Arrays.copyOf(uriArr, copyStatesWithSpaceForAdCount.length);
            }
            copyStatesWithSpaceForAdCount[i10] = i9;
            return new AdGroup(this.count, copyStatesWithSpaceForAdCount, uriArr, jArr);
        }

        public final AdGroup withAdUri(Uri uri, int i9) {
            boolean z8;
            int i10 = this.count;
            boolean z9 = false;
            if (i10 != -1 && i9 >= i10) {
                z8 = false;
            } else {
                z8 = true;
            }
            Assertions.checkArgument(z8);
            int[] copyStatesWithSpaceForAdCount = copyStatesWithSpaceForAdCount(this.states, i9 + 1);
            if (copyStatesWithSpaceForAdCount[i9] == 0) {
                z9 = true;
            }
            Assertions.checkArgument(z9);
            long[] jArr = this.durationsUs;
            if (jArr.length != copyStatesWithSpaceForAdCount.length) {
                jArr = copyDurationsUsWithSpaceForAdCount(jArr, copyStatesWithSpaceForAdCount.length);
            }
            Uri[] uriArr = (Uri[]) Arrays.copyOf(this.uris, copyStatesWithSpaceForAdCount.length);
            uriArr[i9] = uri;
            copyStatesWithSpaceForAdCount[i9] = 1;
            return new AdGroup(this.count, copyStatesWithSpaceForAdCount, uriArr, jArr);
        }

        public final AdGroup withAllAdsSkipped() {
            if (this.count == -1) {
                return new AdGroup(0, new int[0], new Uri[0], new long[0]);
            }
            int[] iArr = this.states;
            int length = iArr.length;
            int[] copyOf = Arrays.copyOf(iArr, length);
            for (int i9 = 0; i9 < length; i9++) {
                int i10 = copyOf[i9];
                if (i10 == 1 || i10 == 0) {
                    copyOf[i9] = 2;
                }
            }
            return new AdGroup(length, copyOf, this.uris, this.durationsUs);
        }

        private AdGroup(int i9, int[] iArr, Uri[] uriArr, long[] jArr) {
            Assertions.checkArgument(iArr.length == uriArr.length);
            this.count = i9;
            this.states = iArr;
            this.uris = uriArr;
            this.durationsUs = jArr;
        }
    }

    /* loaded from: classes3.dex */
    public @interface AdState {
    }

    public AdPlaybackState(long... jArr) {
        int length = jArr.length;
        this.adGroupCount = length;
        this.adGroupTimesUs = Arrays.copyOf(jArr, length);
        this.adGroups = new AdGroup[length];
        for (int i9 = 0; i9 < length; i9++) {
            this.adGroups[i9] = new AdGroup();
        }
        this.adResumePositionUs = 0L;
        this.contentDurationUs = C.TIME_UNSET;
    }

    public final int getAdGroupIndexAfterPositionUs(long j7) {
        int i9 = 0;
        while (true) {
            long[] jArr = this.adGroupTimesUs;
            if (i9 >= jArr.length) {
                break;
            }
            long j9 = jArr[i9];
            if (j9 == Long.MIN_VALUE || (j7 < j9 && this.adGroups[i9].hasUnplayedAds())) {
                break;
            }
            i9++;
        }
        if (i9 >= this.adGroupTimesUs.length) {
            return -1;
        }
        return i9;
    }

    public final int getAdGroupIndexForPositionUs(long j7) {
        int length = this.adGroupTimesUs.length - 1;
        while (length >= 0) {
            long j9 = this.adGroupTimesUs[length];
            if (j9 != Long.MIN_VALUE && j9 <= j7) {
                break;
            }
            length--;
        }
        if (length < 0 || !this.adGroups[length].hasUnplayedAds()) {
            return -1;
        }
        return length;
    }

    public final AdPlaybackState withAdCount(int i9, int i10) {
        boolean z8;
        if (i10 > 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        Assertions.checkArgument(z8);
        AdGroup[] adGroupArr = this.adGroups;
        if (adGroupArr[i9].count == i10) {
            return this;
        }
        AdGroup[] adGroupArr2 = (AdGroup[]) Arrays.copyOf(adGroupArr, adGroupArr.length);
        adGroupArr2[i9] = this.adGroups[i9].withAdCount(i10);
        return new AdPlaybackState(this.adGroupTimesUs, adGroupArr2, this.adResumePositionUs, this.contentDurationUs);
    }

    public final AdPlaybackState withAdDurationsUs(long[][] jArr) {
        AdGroup[] adGroupArr = this.adGroups;
        AdGroup[] adGroupArr2 = (AdGroup[]) Arrays.copyOf(adGroupArr, adGroupArr.length);
        for (int i9 = 0; i9 < this.adGroupCount; i9++) {
            adGroupArr2[i9] = adGroupArr2[i9].withAdDurationsUs(jArr[i9]);
        }
        return new AdPlaybackState(this.adGroupTimesUs, adGroupArr2, this.adResumePositionUs, this.contentDurationUs);
    }

    public final AdPlaybackState withAdLoadError(int i9, int i10) {
        AdGroup[] adGroupArr = this.adGroups;
        AdGroup[] adGroupArr2 = (AdGroup[]) Arrays.copyOf(adGroupArr, adGroupArr.length);
        adGroupArr2[i9] = adGroupArr2[i9].withAdState(4, i10);
        return new AdPlaybackState(this.adGroupTimesUs, adGroupArr2, this.adResumePositionUs, this.contentDurationUs);
    }

    public final AdPlaybackState withAdResumePositionUs(long j7) {
        if (this.adResumePositionUs == j7) {
            return this;
        }
        return new AdPlaybackState(this.adGroupTimesUs, this.adGroups, j7, this.contentDurationUs);
    }

    public final AdPlaybackState withAdUri(int i9, int i10, Uri uri) {
        AdGroup[] adGroupArr = this.adGroups;
        AdGroup[] adGroupArr2 = (AdGroup[]) Arrays.copyOf(adGroupArr, adGroupArr.length);
        adGroupArr2[i9] = adGroupArr2[i9].withAdUri(uri, i10);
        return new AdPlaybackState(this.adGroupTimesUs, adGroupArr2, this.adResumePositionUs, this.contentDurationUs);
    }

    public final AdPlaybackState withContentDurationUs(long j7) {
        if (this.contentDurationUs == j7) {
            return this;
        }
        return new AdPlaybackState(this.adGroupTimesUs, this.adGroups, this.adResumePositionUs, j7);
    }

    public final AdPlaybackState withPlayedAd(int i9, int i10) {
        AdGroup[] adGroupArr = this.adGroups;
        AdGroup[] adGroupArr2 = (AdGroup[]) Arrays.copyOf(adGroupArr, adGroupArr.length);
        adGroupArr2[i9] = adGroupArr2[i9].withAdState(3, i10);
        return new AdPlaybackState(this.adGroupTimesUs, adGroupArr2, this.adResumePositionUs, this.contentDurationUs);
    }

    public final AdPlaybackState withSkippedAd(int i9, int i10) {
        AdGroup[] adGroupArr = this.adGroups;
        AdGroup[] adGroupArr2 = (AdGroup[]) Arrays.copyOf(adGroupArr, adGroupArr.length);
        adGroupArr2[i9] = adGroupArr2[i9].withAdState(2, i10);
        return new AdPlaybackState(this.adGroupTimesUs, adGroupArr2, this.adResumePositionUs, this.contentDurationUs);
    }

    public final AdPlaybackState withSkippedAdGroup(int i9) {
        AdGroup[] adGroupArr = this.adGroups;
        AdGroup[] adGroupArr2 = (AdGroup[]) Arrays.copyOf(adGroupArr, adGroupArr.length);
        adGroupArr2[i9] = adGroupArr2[i9].withAllAdsSkipped();
        return new AdPlaybackState(this.adGroupTimesUs, adGroupArr2, this.adResumePositionUs, this.contentDurationUs);
    }

    private AdPlaybackState(long[] jArr, AdGroup[] adGroupArr, long j7, long j9) {
        this.adGroupCount = adGroupArr.length;
        this.adGroupTimesUs = jArr;
        this.adGroups = adGroupArr;
        this.adResumePositionUs = j7;
        this.contentDurationUs = j9;
    }
}
