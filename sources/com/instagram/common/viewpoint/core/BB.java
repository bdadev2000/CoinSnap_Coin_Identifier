package com.instagram.common.viewpoint.core;

import java.nio.ShortBuffer;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class BB {
    public static String[] A0M = {"12WRHCRvrf7uzS15EjKhAcUJZG2MzuRW", "ORqZ7gMxbJJ1LCIrF8kx2625eiWSr61b", "xtkEmeQamovtvU2Z3hw2mSUwMXjMbz0B", "2SWBRQD5cFodCmXbUuvI5Vs4hvMM", "Ld", "Zx", "oWcxHzaW6r7lBy9gASpUpQY2t5hecS1n", "ItURT5NzCCJzRXO1EoFfUiDaBsWLxBKc"};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public short[] A0A;
    public short[] A0B;
    public short[] A0C;
    public final float A0D;
    public final float A0E;
    public final float A0F;
    public final int A0G;
    public final int A0H;
    public final int A0I;
    public final int A0J;
    public final int A0K;
    public final short[] A0L;

    public BB(int i2, int i3, float f2, float f3, int i4) {
        this.A0H = i2;
        this.A0G = i3;
        this.A0F = f2;
        this.A0D = f3;
        this.A0E = i2 / i4;
        this.A0K = i2 / 400;
        this.A0I = i2 / 65;
        this.A0J = this.A0I * 2;
        this.A0L = new short[this.A0J];
        this.A0A = new short[this.A0J * i3];
        this.A0B = new short[this.A0J * i3];
        this.A0C = new short[this.A0J * i3];
    }

    private int A00(int i2) {
        int min = Math.min(this.A0J, this.A09);
        A0D(this.A0A, i2, min);
        int frameCount = this.A09;
        this.A09 = frameCount - min;
        return min;
    }

    private int A01(short[] sArr, int i2) {
        int minP;
        int period;
        int i3 = this.A0H > 4000 ? this.A0H / 4000 : 1;
        int skip = this.A0G;
        if (skip == 1 && i3 == 1) {
            int i4 = this.A0K;
            int skip2 = this.A0I;
            minP = A04(sArr, i2, i4, skip2);
        } else {
            A0E(sArr, i2, i3);
            short[] sArr2 = this.A0L;
            int i5 = this.A0K / i3;
            int skip3 = this.A0I;
            minP = A04(sArr2, 0, i5, skip3 / i3);
            if (i3 != 1) {
                int minP2 = minP * i3;
                int skip4 = i3 * 4;
                int period2 = minP2 - skip4;
                int i6 = (i3 * 4) + minP2;
                int skip5 = this.A0K;
                if (period2 < skip5) {
                    period2 = this.A0K;
                }
                int skip6 = this.A0I;
                if (i6 > skip6) {
                    i6 = this.A0I;
                }
                int skip7 = this.A0G;
                if (skip7 == 1) {
                    minP = A04(sArr, i2, period2, i6);
                } else {
                    A0E(sArr, i2, 1);
                    minP = A04(this.A0L, 0, period2, i6);
                }
            }
        }
        int period3 = this.A02;
        int skip8 = this.A01;
        if (A0F(period3, skip8)) {
            period = this.A08;
        } else {
            period = minP;
        }
        int skip9 = this.A02;
        this.A07 = skip9;
        this.A08 = minP;
        return period;
    }

    private int A02(short[] sArr, int i2, float f2, int i3) {
        int i4;
        if (f2 < 0.5f) {
            i4 = (int) ((i3 * f2) / (1.0f - f2));
        } else {
            i4 = i3;
            float f3 = i3;
            float f4 = (2.0f * f2) - 1.0f;
            String[] strArr = A0M;
            String str = strArr[7];
            String str2 = strArr[1];
            int charAt = str.charAt(26);
            int newFrameCount = str2.charAt(26);
            if (charAt != newFrameCount) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0M;
            strArr2[0] = "eziTD2o98diJZALFyHxZfIO5bO0xqfa9";
            strArr2[6] = "GKD0g5jHSgdF3gp0Ot79FF6iF1GE2cl5";
            int newFrameCount2 = (int) ((f3 * f4) / (1.0f - f2));
            this.A09 = newFrameCount2;
        }
        int newFrameCount3 = i3 + i4;
        this.A0B = A0G(this.A0B, this.A05, newFrameCount3);
        int i5 = this.A0G * i2;
        short[] sArr2 = this.A0B;
        int i6 = this.A05;
        int newFrameCount4 = this.A0G;
        int i7 = i6 * newFrameCount4;
        int newFrameCount5 = this.A0G;
        System.arraycopy(sArr, i5, sArr2, i7, newFrameCount5 * i3);
        A0C(i4, this.A0G, this.A0B, this.A05 + i3, sArr, i2 + i3, sArr, i2);
        int newFrameCount6 = this.A05;
        this.A05 = newFrameCount6 + i3 + i4;
        return i4;
    }

    private int A03(short[] sArr, int i2, float f2, int i3) {
        int newFrameCount;
        if (f2 >= 2.0f) {
            newFrameCount = (int) (i3 / (f2 - 1.0f));
        } else {
            this.A09 = (int) ((i3 * (2.0f - f2)) / (f2 - 1.0f));
            newFrameCount = i3;
        }
        short[] sArr2 = this.A0B;
        int newFrameCount2 = this.A05;
        this.A0B = A0G(sArr2, newFrameCount2, newFrameCount);
        A0C(newFrameCount, this.A0G, this.A0B, this.A05, sArr, i2, sArr, i2 + i3);
        int newFrameCount3 = this.A05;
        this.A05 = newFrameCount3 + newFrameCount;
        return newFrameCount;
    }

    private int A04(short[] sArr, int i2, int i3, int i4) {
        int i5 = 0;
        int i6 = 255;
        int i7 = 1;
        int diff = 0;
        int bestPeriod = this.A0G;
        int i8 = i2 * bestPeriod;
        while (i3 <= i4) {
            int i9 = 0;
            for (int minDiff = 0; minDiff < i3; minDiff++) {
                int bestPeriod2 = i8 + minDiff;
                short s2 = sArr[bestPeriod2];
                int bestPeriod3 = i8 + i3;
                int worstPeriod = s2 - sArr[bestPeriod3 + minDiff];
                int bestPeriod4 = Math.abs(worstPeriod);
                i9 += bestPeriod4;
            }
            int worstPeriod2 = i9 * i5;
            int bestPeriod5 = i7 * i3;
            if (worstPeriod2 < bestPeriod5) {
                i7 = i9;
                i5 = i3;
            }
            int period = i9 * i6;
            int maxDiff = diff * i3;
            int worstPeriod3 = A0M[3].length();
            if (worstPeriod3 == 11) {
                throw new RuntimeException();
            }
            String[] strArr = A0M;
            strArr[0] = "7654Ro0ah2nKancwMT2DmdIGdIXFgRyE";
            strArr[6] = "tMgWvda3QkwFD9DtGaYlEy8rynMhOKHT";
            if (period > maxDiff) {
                diff = i9;
                i6 = i3;
            }
            i3++;
        }
        this.A02 = i7 / i5;
        this.A01 = diff / i6;
        return i5;
    }

    private short A05(short[] sArr, int i2, int i3, int i4) {
        short s2 = sArr[i2];
        short s3 = sArr[this.A0G + i2];
        int leftPosition = this.A03 * i3;
        int i5 = this.A04 * i4;
        int position = (this.A04 + 1) * i4;
        int i6 = position - leftPosition;
        int position2 = position - i5;
        short left = (short) (((i6 * s2) + ((position2 - i6) * s3)) / position2);
        return left;
    }

    private void A06() {
        int i2 = this.A05;
        float f2 = this.A0F / this.A0D;
        float f3 = this.A0E * this.A0D;
        if (f2 > 1.00001d || f2 < 0.99999d) {
            A07(f2);
        } else {
            A0D(this.A0A, 0, this.A00);
            this.A00 = 0;
        }
        if (f3 != 1.0f) {
            A08(f3, i2);
        }
    }

    private void A07(float f2) {
        int frameCount;
        if (this.A00 < this.A0J) {
            return;
        }
        int i2 = this.A00;
        int i3 = 0;
        do {
            int frameCount2 = this.A09;
            if (frameCount2 > 0) {
                int frameCount3 = A00(i3);
                i3 += frameCount3;
            } else {
                int A01 = A01(this.A0A, i3);
                if (f2 > 1.0d) {
                    int A03 = A03(this.A0A, i3, f2, A01);
                    String[] strArr = A0M;
                    String str = strArr[0];
                    String str2 = strArr[6];
                    int positionFrames = str.charAt(25);
                    int frameCount4 = str2.charAt(25);
                    if (positionFrames == frameCount4) {
                        throw new RuntimeException();
                    }
                    A0M[2] = "xDmSay9THM0s0a1UzRtMZ3OA7t2IbfqA";
                    i3 += A03 + A01;
                } else {
                    int frameCount5 = A02(this.A0A, i3, f2, A01);
                    i3 += frameCount5;
                }
            }
            frameCount = this.A0J;
        } while (frameCount + i3 <= i2);
        A0B(i3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x007c, code lost:
    
        r0 = r9.A04;
        r9.A04 = r0 + 1;
        r0 = r9.A04;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0083, code lost:
    
        if (r0 != r4) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0085, code lost:
    
        r9.A04 = 0;
        r0 = r9.A03;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x008a, code lost:
    
        if (r0 != r5) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008c, code lost:
    
        com.instagram.common.viewpoint.core.AbstractC0576Hf.A04(r3);
        r9.A03 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0094, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Incorrect condition in loop: B:17:0x0037 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A08(float r10, int r11) {
        /*
            r9 = this;
            int r0 = r9.A05
            if (r0 != r11) goto L5
            return
        L5:
            int r0 = r9.A0H
            float r0 = (float) r0
            float r0 = r0 / r10
            int r5 = (int) r0
            int r4 = r9.A0H
        Lc:
            r0 = 16384(0x4000, float:2.2959E-41)
            if (r5 > r0) goto L12
            if (r4 <= r0) goto L17
        L12:
            int r5 = r5 / 2
            int r4 = r4 / 2
            goto Lc
        L17:
            r9.A09(r11)
            r6 = 0
        L1b:
            int r0 = r9.A06
            r3 = 1
            int r0 = r0 - r3
            if (r6 >= r0) goto L96
        L21:
            int r1 = r9.A04
            int r1 = r1 + r3
            int r1 = r1 * r5
            int r0 = r9.A03
            int r0 = r0 * r4
            if (r1 <= r0) goto L7c
            short[] r1 = r9.A0B
            int r0 = r9.A05
            short[] r0 = r9.A0G(r1, r0, r3)
            r9.A0B = r0
            r8 = 0
        L35:
            int r0 = r9.A0G
            if (r8 >= r0) goto L50
            short[] r7 = r9.A0B
            int r2 = r9.A05
            int r0 = r9.A0G
            int r2 = r2 * r0
            int r2 = r2 + r8
            short[] r1 = r9.A0C
            int r0 = r9.A0G
            int r0 = r0 * r6
            int r0 = r0 + r8
            short r0 = r9.A05(r1, r0, r4, r5)
            r7[r2] = r0
            int r8 = r8 + 1
            goto L35
        L50:
            int r7 = r9.A03
            int r7 = r7 + r3
            java.lang.String[] r2 = com.instagram.common.viewpoint.core.BB.A0M
            r0 = 7
            r1 = r2[r0]
            r0 = 1
            r2 = r2[r0]
            r0 = 26
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto L6d
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L6d:
            java.lang.String[] r2 = com.instagram.common.viewpoint.core.BB.A0M
            java.lang.String r1 = "gKQ25B6uZCLlveN"
            r0 = 3
            r2[r0] = r1
            r9.A03 = r7
            int r0 = r9.A05
            int r0 = r0 + r3
            r9.A05 = r0
            goto L21
        L7c:
            int r0 = r9.A04
            int r0 = r0 + r3
            r9.A04 = r0
            int r0 = r9.A04
            if (r0 != r4) goto L91
            r1 = 0
            r9.A04 = r1
            int r0 = r9.A03
            if (r0 != r5) goto L94
        L8c:
            com.instagram.common.viewpoint.core.AbstractC0576Hf.A04(r3)
            r9.A03 = r1
        L91:
            int r6 = r6 + 1
            goto L1b
        L94:
            r3 = 0
            goto L8c
        L96:
            int r0 = r9.A06
            int r0 = r0 - r3
            r9.A0A(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.viewpoint.core.BB.A08(float, int):void");
    }

    private void A09(int i2) {
        int i3 = this.A05 - i2;
        short[] sArr = this.A0C;
        int frameCount = this.A06;
        this.A0C = A0G(sArr, frameCount, i3);
        short[] sArr2 = this.A0B;
        int i4 = this.A0G * i2;
        short[] sArr3 = this.A0C;
        int i5 = this.A06;
        int frameCount2 = this.A0G;
        int i6 = i5 * frameCount2;
        int frameCount3 = this.A0G;
        System.arraycopy(sArr2, i4, sArr3, i6, frameCount3 * i3);
        this.A05 = i2;
        int frameCount4 = this.A06;
        this.A06 = frameCount4 + i3;
    }

    private void A0A(int i2) {
        if (i2 == 0) {
            return;
        }
        System.arraycopy(this.A0C, this.A0G * i2, this.A0C, 0, (this.A06 - i2) * this.A0G);
        this.A06 -= i2;
    }

    private void A0B(int i2) {
        int i3 = this.A00 - i2;
        System.arraycopy(this.A0A, this.A0G * i2, this.A0A, 0, this.A0G * i3);
        this.A00 = i3;
    }

    public static void A0C(int i2, int i3, short[] sArr, int i4, short[] sArr2, int i5, short[] sArr3, int i6) {
        for (int i7 = 0; i7 < i3; i7++) {
            int i8 = (i4 * i3) + i7;
            int t2 = (i6 * i3) + i7;
            int d = (i5 * i3) + i7;
            for (int u2 = 0; u2 < i2; u2++) {
                int i9 = i2 - u2;
                int o2 = sArr2[d] * i9;
                int i10 = sArr3[t2] * u2;
                sArr[i8] = (short) ((o2 + i10) / i2);
                i8 += i3;
                d += i3;
                t2 += i3;
            }
        }
    }

    private void A0D(short[] sArr, int i2, int i3) {
        this.A0B = A0G(this.A0B, this.A05, i3);
        System.arraycopy(sArr, this.A0G * i2, this.A0B, this.A05 * this.A0G, this.A0G * i3);
        this.A05 += i3;
    }

    private void A0E(short[] sArr, int i2, int i3) {
        int i4 = this.A0J / i3;
        int value = this.A0G * i3;
        int frameCount = this.A0G;
        int i5 = i2 * frameCount;
        int i6 = 0;
        while (i6 < i4) {
            int i7 = 0;
            for (int i8 = 0; i8 < value; i8++) {
                int frameCount2 = i6 * value;
                i7 += sArr[frameCount2 + i5 + i8];
                int samplesPerValue = A0M[2].charAt(12);
                if (samplesPerValue == 103) {
                    throw new RuntimeException();
                }
                A0M[3] = "EUYS5WQpJRPmKwOGT0we5n4rvI";
            }
            short[] sArr2 = this.A0L;
            short s2 = (short) (i7 / value);
            int samplesPerValue2 = A0M[2].charAt(12);
            if (samplesPerValue2 != 103) {
                String[] strArr = A0M;
                strArr[7] = "BC56aeWxCRgsWp8W5KdRe7bjNbWCzUgr";
                strArr[1] = "XTykDGyd0HT9mdygUoRpzOWOuHWjRRUi";
                sArr2[i6] = s2;
                i6++;
            } else {
                sArr2[i6] = s2;
                i6++;
            }
        }
    }

    private boolean A0F(int i2, int i3) {
        if (i2 == 0 || this.A08 == 0) {
            return false;
        }
        int i4 = i2 * 3;
        String[] strArr = A0M;
        if (strArr[4].length() != strArr[5].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0M;
        strArr2[0] = "EZb49YdFLYqoOlZSlgWLmpmtHQMVBG5j";
        strArr2[6] = "6kSbIZyXrbBrsP3zIABXbItVIHW5EGN4";
        if (i3 > i4 || i2 * 2 <= this.A07 * 3) {
            return false;
        }
        return true;
    }

    private short[] A0G(short[] sArr, int i2, int i3) {
        int length = sArr.length / this.A0G;
        if (i2 + i3 <= length) {
            return sArr;
        }
        int currentCapacityFrames = length * 3;
        int newCapacityFrames = (currentCapacityFrames / 2) + i3;
        int currentCapacityFrames2 = this.A0G;
        short[] copyOf = Arrays.copyOf(sArr, currentCapacityFrames2 * newCapacityFrames);
        String[] strArr = A0M;
        String str = strArr[4];
        String str2 = strArr[5];
        int newCapacityFrames2 = str.length();
        int currentCapacityFrames3 = str2.length();
        if (newCapacityFrames2 != currentCapacityFrames3) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0M;
        strArr2[4] = "bD";
        strArr2[5] = "UF";
        return copyOf;
    }

    public final int A0H() {
        return this.A05;
    }

    public final void A0I() {
        this.A00 = 0;
        this.A05 = 0;
        this.A06 = 0;
        this.A04 = 0;
        this.A03 = 0;
        this.A09 = 0;
        this.A08 = 0;
        this.A07 = 0;
        this.A02 = 0;
        this.A01 = 0;
    }

    public final void A0J() {
        int i2 = this.A00;
        float f2 = this.A0F / this.A0D;
        float r2 = this.A0E * this.A0D;
        int i3 = this.A05;
        float s2 = i2;
        int remainingFrameCount = this.A06;
        int i4 = i3 + ((int) ((((s2 / f2) + remainingFrameCount) / r2) + 0.5f));
        short[] sArr = this.A0A;
        int i5 = this.A00;
        int remainingFrameCount2 = this.A0J;
        this.A0A = A0G(sArr, i5, (remainingFrameCount2 * 2) + i2);
        int expectedOutputFrames = 0;
        while (true) {
            int remainingFrameCount3 = this.A0J;
            int i6 = remainingFrameCount3 * 2;
            int remainingFrameCount4 = this.A0G;
            if (expectedOutputFrames >= i6 * remainingFrameCount4) {
                break;
            }
            short[] sArr2 = this.A0A;
            int remainingFrameCount5 = this.A0G;
            sArr2[(remainingFrameCount5 * i2) + expectedOutputFrames] = 0;
            expectedOutputFrames++;
        }
        int i7 = this.A00;
        int remainingFrameCount6 = this.A0J;
        this.A00 = i7 + (remainingFrameCount6 * 2);
        A06();
        int remainingFrameCount7 = this.A05;
        if (remainingFrameCount7 > i4) {
            this.A05 = i4;
        }
        this.A00 = 0;
        this.A09 = 0;
        this.A06 = 0;
    }

    public final void A0K(ShortBuffer shortBuffer) {
        int min = Math.min(shortBuffer.remaining() / this.A0G, this.A05);
        short[] sArr = this.A0B;
        int framesToRead = this.A0G;
        shortBuffer.put(sArr, 0, framesToRead * min);
        int framesToRead2 = this.A05;
        this.A05 = framesToRead2 - min;
        short[] sArr2 = this.A0B;
        int i2 = this.A0G * min;
        short[] sArr3 = this.A0B;
        int i3 = this.A05;
        int framesToRead3 = this.A0G;
        System.arraycopy(sArr2, i2, sArr3, 0, i3 * framesToRead3);
    }

    public final void A0L(ShortBuffer shortBuffer) {
        int remaining = shortBuffer.remaining() / this.A0G;
        int framesToWrite = this.A0G;
        int i2 = framesToWrite * remaining * 2;
        short[] sArr = this.A0A;
        int framesToWrite2 = this.A00;
        this.A0A = A0G(sArr, framesToWrite2, remaining);
        short[] sArr2 = this.A0A;
        int bytesToWrite = this.A00;
        int framesToWrite3 = this.A0G;
        int bytesToWrite2 = bytesToWrite * framesToWrite3;
        int framesToWrite4 = i2 / 2;
        shortBuffer.get(sArr2, bytesToWrite2, framesToWrite4);
        int framesToWrite5 = this.A00;
        this.A00 = framesToWrite5 + remaining;
        A06();
    }
}
