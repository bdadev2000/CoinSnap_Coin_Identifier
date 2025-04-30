package com.mbridge.msdk.playercommon.exoplayer2.source;

import java.util.Arrays;
import java.util.Random;

/* loaded from: classes3.dex */
public interface ShuffleOrder {

    /* loaded from: classes3.dex */
    public static class DefaultShuffleOrder implements ShuffleOrder {
        private final int[] indexInShuffled;
        private final Random random;
        private final int[] shuffled;

        public DefaultShuffleOrder(int i9) {
            this(i9, new Random());
        }

        private static int[] createShuffledList(int i9, Random random) {
            int[] iArr = new int[i9];
            int i10 = 0;
            while (i10 < i9) {
                int i11 = i10 + 1;
                int nextInt = random.nextInt(i11);
                iArr[i10] = iArr[nextInt];
                iArr[nextInt] = i10;
                i10 = i11;
            }
            return iArr;
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.source.ShuffleOrder
        public ShuffleOrder cloneAndClear() {
            return new DefaultShuffleOrder(0, new Random(this.random.nextLong()));
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.source.ShuffleOrder
        public ShuffleOrder cloneAndInsert(int i9, int i10) {
            int[] iArr = new int[i10];
            int[] iArr2 = new int[i10];
            int i11 = 0;
            int i12 = 0;
            while (i12 < i10) {
                iArr[i12] = this.random.nextInt(this.shuffled.length + 1);
                int i13 = i12 + 1;
                int nextInt = this.random.nextInt(i13);
                iArr2[i12] = iArr2[nextInt];
                iArr2[nextInt] = i12 + i9;
                i12 = i13;
            }
            Arrays.sort(iArr);
            int[] iArr3 = new int[this.shuffled.length + i10];
            int i14 = 0;
            int i15 = 0;
            while (true) {
                int[] iArr4 = this.shuffled;
                if (i11 < iArr4.length + i10) {
                    if (i14 < i10 && i15 == iArr[i14]) {
                        iArr3[i11] = iArr2[i14];
                        i14++;
                    } else {
                        int i16 = i15 + 1;
                        int i17 = iArr4[i15];
                        iArr3[i11] = i17;
                        if (i17 >= i9) {
                            iArr3[i11] = i17 + i10;
                        }
                        i15 = i16;
                    }
                    i11++;
                } else {
                    return new DefaultShuffleOrder(iArr3, new Random(this.random.nextLong()));
                }
            }
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.source.ShuffleOrder
        public ShuffleOrder cloneAndRemove(int i9) {
            int i10;
            int[] iArr = new int[this.shuffled.length - 1];
            int i11 = 0;
            boolean z8 = false;
            while (true) {
                int[] iArr2 = this.shuffled;
                if (i11 < iArr2.length) {
                    int i12 = iArr2[i11];
                    if (i12 == i9) {
                        z8 = true;
                    } else {
                        if (z8) {
                            i10 = i11 - 1;
                        } else {
                            i10 = i11;
                        }
                        if (i12 > i9) {
                            i12--;
                        }
                        iArr[i10] = i12;
                    }
                    i11++;
                } else {
                    return new DefaultShuffleOrder(iArr, new Random(this.random.nextLong()));
                }
            }
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.source.ShuffleOrder
        public int getFirstIndex() {
            int[] iArr = this.shuffled;
            if (iArr.length > 0) {
                return iArr[0];
            }
            return -1;
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.source.ShuffleOrder
        public int getLastIndex() {
            int[] iArr = this.shuffled;
            if (iArr.length > 0) {
                return iArr[iArr.length - 1];
            }
            return -1;
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.source.ShuffleOrder
        public int getLength() {
            return this.shuffled.length;
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.source.ShuffleOrder
        public int getNextIndex(int i9) {
            int i10 = this.indexInShuffled[i9] + 1;
            int[] iArr = this.shuffled;
            if (i10 < iArr.length) {
                return iArr[i10];
            }
            return -1;
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.source.ShuffleOrder
        public int getPreviousIndex(int i9) {
            int i10 = this.indexInShuffled[i9] - 1;
            if (i10 < 0) {
                return -1;
            }
            return this.shuffled[i10];
        }

        public DefaultShuffleOrder(int i9, long j7) {
            this(i9, new Random(j7));
        }

        private DefaultShuffleOrder(int i9, Random random) {
            this(createShuffledList(i9, random), random);
        }

        private DefaultShuffleOrder(int[] iArr, Random random) {
            this.shuffled = iArr;
            this.random = random;
            this.indexInShuffled = new int[iArr.length];
            for (int i9 = 0; i9 < iArr.length; i9++) {
                this.indexInShuffled[iArr[i9]] = i9;
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class UnshuffledShuffleOrder implements ShuffleOrder {
        private final int length;

        public UnshuffledShuffleOrder(int i9) {
            this.length = i9;
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.source.ShuffleOrder
        public final ShuffleOrder cloneAndClear() {
            return new UnshuffledShuffleOrder(0);
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.source.ShuffleOrder
        public final ShuffleOrder cloneAndInsert(int i9, int i10) {
            return new UnshuffledShuffleOrder(this.length + i10);
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.source.ShuffleOrder
        public final ShuffleOrder cloneAndRemove(int i9) {
            return new UnshuffledShuffleOrder(this.length - 1);
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.source.ShuffleOrder
        public final int getFirstIndex() {
            if (this.length > 0) {
                return 0;
            }
            return -1;
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.source.ShuffleOrder
        public final int getLastIndex() {
            int i9 = this.length;
            if (i9 > 0) {
                return i9 - 1;
            }
            return -1;
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.source.ShuffleOrder
        public final int getLength() {
            return this.length;
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.source.ShuffleOrder
        public final int getNextIndex(int i9) {
            int i10 = i9 + 1;
            if (i10 >= this.length) {
                return -1;
            }
            return i10;
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.source.ShuffleOrder
        public final int getPreviousIndex(int i9) {
            int i10 = i9 - 1;
            if (i10 >= 0) {
                return i10;
            }
            return -1;
        }
    }

    ShuffleOrder cloneAndClear();

    ShuffleOrder cloneAndInsert(int i9, int i10);

    ShuffleOrder cloneAndRemove(int i9);

    int getFirstIndex();

    int getLastIndex();

    int getLength();

    int getNextIndex(int i9);

    int getPreviousIndex(int i9);
}
