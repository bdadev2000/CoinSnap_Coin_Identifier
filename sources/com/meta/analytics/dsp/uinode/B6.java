package com.meta.analytics.dsp.uinode;

import java.nio.ShortBuffer;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class B6 {
    public static String[] A0M = {"OjKCpSHRaQgRVuqtUlgsb9O8", "00OaDgM7p4igg1vHbesCR74DVTlAeC7z", "TzmlGabo8AOjcKFjChfq2OdnE6jP", "eUJX5SGKEEZf9vIFl", "j2zFnhkJHUredpBjDjfUiogYLN6sD6KJ", "gWZYAfYL2BaqEY2VQTncveV2", "fwiYKc5SQMrWihGSp5I7vQU09P9mYkrS", "9p8sUcgEmhCbeCaZ4cFvJcsv2VoCKNVu"};
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

    public B6(int i9, int i10, float f9, float f10, int i11) {
        this.A0H = i9;
        this.A0G = i10;
        this.A0F = f9;
        this.A0D = f10;
        this.A0E = i9 / i11;
        this.A0K = i9 / 400;
        int i12 = i9 / 65;
        this.A0I = i12;
        int i13 = i12 * 2;
        this.A0J = i13;
        this.A0L = new short[i13];
        this.A0A = new short[i13 * i10];
        this.A0B = new short[i13 * i10];
        this.A0C = new short[i13 * i10];
    }

    private int A00(int i9) {
        int min = Math.min(this.A0J, this.A09);
        A0D(this.A0A, i9, min);
        int frameCount = this.A09;
        this.A09 = frameCount - min;
        return min;
    }

    private int A01(short[] sArr, int i9) {
        int minP;
        int period;
        int i10 = this.A0H;
        int i11 = i10 > 4000 ? i10 / 4000 : 1;
        int skip = this.A0G;
        if (skip == 1 && i11 == 1) {
            int i12 = this.A0K;
            int skip2 = this.A0I;
            minP = A04(sArr, i9, i12, skip2);
        } else {
            A0E(sArr, i9, i11);
            short[] sArr2 = this.A0L;
            int i13 = this.A0K / i11;
            int skip3 = this.A0I;
            minP = A04(sArr2, 0, i13, skip3 / i11);
            if (i11 != 1) {
                int minP2 = minP * i11;
                int skip4 = i11 * 4;
                int period2 = minP2 - skip4;
                int i14 = (i11 * 4) + minP2;
                int skip5 = this.A0K;
                if (period2 < skip5) {
                    period2 = this.A0K;
                }
                int skip6 = this.A0I;
                if (i14 > skip6) {
                    i14 = this.A0I;
                }
                int skip7 = this.A0G;
                if (skip7 == 1) {
                    minP = A04(sArr, i9, period2, i14);
                } else {
                    A0E(sArr, i9, 1);
                    minP = A04(this.A0L, 0, period2, i14);
                }
            }
        }
        int i15 = this.A02;
        int maxP = this.A01;
        String[] strArr = A0M;
        String str = strArr[5];
        String str2 = strArr[0];
        int period3 = str.length();
        int skip8 = str2.length();
        if (period3 != skip8) {
            throw new RuntimeException();
        }
        A0M[1] = "8bhQeTnLevaZP1Rdp3IHUAHszuXZY5fw";
        if (A0F(i15, maxP)) {
            period = this.A08;
        } else {
            period = minP;
        }
        int skip9 = this.A02;
        this.A07 = skip9;
        this.A08 = minP;
        return period;
    }

    private int A02(short[] sArr, int i9, float f9, int i10) {
        int i11;
        if (f9 < 0.5f) {
            i11 = (int) ((i10 * f9) / (1.0f - f9));
        } else {
            i11 = i10;
            int newFrameCount = (int) ((i10 * ((2.0f * f9) - 1.0f)) / (1.0f - f9));
            this.A09 = newFrameCount;
        }
        int newFrameCount2 = i10 + i11;
        short[] A0G = A0G(this.A0B, this.A05, newFrameCount2);
        this.A0B = A0G;
        int i12 = this.A0G;
        int newFrameCount3 = this.A05;
        System.arraycopy(sArr, i9 * i12, A0G, newFrameCount3 * i12, i12 * i10);
        A0C(i11, this.A0G, this.A0B, this.A05 + i10, sArr, i9 + i10, sArr, i9);
        int newFrameCount4 = this.A05;
        this.A05 = newFrameCount4 + i10 + i11;
        return i11;
    }

    private int A03(short[] sArr, int i9, float f9, int i10) {
        int newFrameCount;
        if (f9 >= 2.0f) {
            newFrameCount = (int) (i10 / (f9 - 1.0f));
        } else {
            this.A09 = (int) ((i10 * (2.0f - f9)) / (f9 - 1.0f));
            newFrameCount = i10;
        }
        short[] sArr2 = this.A0B;
        int newFrameCount2 = this.A05;
        short[] A0G = A0G(sArr2, newFrameCount2, newFrameCount);
        this.A0B = A0G;
        A0C(newFrameCount, this.A0G, A0G, this.A05, sArr, i9, sArr, i9 + i10);
        int newFrameCount3 = this.A05;
        this.A05 = newFrameCount3 + newFrameCount;
        return newFrameCount;
    }

    private int A04(short[] sArr, int i9, int i10, int i11) {
        int i12 = 0;
        int i13 = 255;
        int period = 1;
        int maxDiff = 0;
        int bestPeriod = this.A0G;
        int i14 = i9 * bestPeriod;
        while (i10 <= i11) {
            int diff = 0;
            for (int minDiff = 0; minDiff < i10; minDiff++) {
                int bestPeriod2 = i14 + minDiff;
                short s5 = sArr[bestPeriod2];
                int bestPeriod3 = i14 + i10;
                int worstPeriod = s5 - sArr[bestPeriod3 + minDiff];
                int bestPeriod4 = Math.abs(worstPeriod);
                diff += bestPeriod4;
            }
            int worstPeriod2 = diff * i12;
            int bestPeriod5 = period * i10;
            if (worstPeriod2 < bestPeriod5) {
                period = diff;
                i12 = i10;
            }
            int worstPeriod3 = diff * i13;
            int bestPeriod6 = maxDiff * i10;
            if (worstPeriod3 > bestPeriod6) {
                maxDiff = diff;
                i13 = i10;
            }
            i10++;
        }
        this.A02 = period / i12;
        this.A01 = maxDiff / i13;
        return i12;
    }

    private short A05(short[] sArr, int i9, int i10, int i11) {
        short s5 = sArr[i9];
        short s9 = sArr[this.A0G + i9];
        int rightPosition = this.A03 * i10;
        int i12 = this.A04;
        int i13 = i12 * i11;
        int position = (i12 + 1) * i11;
        int i14 = position - rightPosition;
        int position2 = position - i13;
        short left = (short) (((i14 * s5) + ((position2 - i14) * s9)) / position2);
        return left;
    }

    private void A06() {
        int i9 = this.A05;
        float f9 = this.A0F;
        float f10 = this.A0D;
        float f11 = f9 / f10;
        float f12 = this.A0E * f10;
        if (f11 > 1.00001d || f11 < 0.99999d) {
            A07(f11);
        } else {
            A0D(this.A0A, 0, this.A00);
            this.A00 = 0;
        }
        if (f12 != 1.0f) {
            A08(f12, i9);
        }
    }

    private void A07(float f9) {
        int frameCount;
        if (this.A00 < this.A0J) {
            return;
        }
        int i9 = this.A00;
        int i10 = 0;
        do {
            int frameCount2 = this.A09;
            if (frameCount2 > 0) {
                int frameCount3 = A00(i10);
                i10 += frameCount3;
            } else {
                int A01 = A01(this.A0A, i10);
                if (f9 > 1.0d) {
                    int frameCount4 = A03(this.A0A, i10, f9, A01);
                    i10 += frameCount4 + A01;
                } else {
                    int frameCount5 = A02(this.A0A, i10, f9, A01);
                    i10 += frameCount5;
                }
            }
            frameCount = this.A0J;
        } while (frameCount + i10 <= i9);
        A0B(i10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x009b, code lost:
    
        r0 = r8 + 1;
        r9.A04 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x009f, code lost:
    
        if (r0 != r5) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a1, code lost:
    
        r2 = com.meta.analytics.dsp.uinode.B6.A0M;
        r1 = r2[5];
        r0 = r2[0];
        r1 = r1.length();
        r0 = r0.length();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b2, code lost:
    
        if (r1 == r0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ba, code lost:
    
        com.meta.analytics.dsp.uinode.B6.A0M[6] = "dm69MZtNxJx8v5BsJDIKlnc92CG6PQ3Q";
        r9.A04 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c3, code lost:
    
        if (r3 != r6) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c5, code lost:
    
        com.meta.analytics.dsp.uinode.AbstractC1192Ha.A04(r4);
        r9.A03 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ce, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b9, code lost:
    
        throw new java.lang.RuntimeException();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A08(float r10, int r11) {
        /*
            Method dump skipped, instructions count: 213
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.analytics.dsp.uinode.B6.A08(float, int):void");
    }

    private void A09(int i9) {
        int i10 = this.A05 - i9;
        short[] sArr = this.A0C;
        int frameCount = this.A06;
        short[] A0G = A0G(sArr, frameCount, i10);
        this.A0C = A0G;
        short[] sArr2 = this.A0B;
        int i11 = this.A0G;
        int frameCount2 = this.A06;
        System.arraycopy(sArr2, i9 * i11, A0G, frameCount2 * i11, i11 * i10);
        this.A05 = i9;
        int frameCount3 = this.A06;
        this.A06 = frameCount3 + i10;
    }

    private void A0A(int i9) {
        if (i9 == 0) {
            return;
        }
        short[] sArr = this.A0C;
        int i10 = this.A0G;
        System.arraycopy(sArr, i9 * i10, sArr, 0, (this.A06 - i9) * i10);
        this.A06 -= i9;
    }

    private void A0B(int i9) {
        int i10 = this.A00 - i9;
        short[] sArr = this.A0A;
        int i11 = this.A0G;
        System.arraycopy(sArr, i9 * i11, sArr, 0, i11 * i10);
        this.A00 = i10;
    }

    public static void A0C(int i9, int i10, short[] sArr, int i11, short[] sArr2, int i12, short[] sArr3, int i13) {
        for (int i14 = 0; i14 < i10; i14++) {
            int i15 = (i11 * i10) + i14;
            int t9 = (i13 * i10) + i14;
            int d2 = (i12 * i10) + i14;
            for (int u8 = 0; u8 < i9; u8++) {
                int i16 = i9 - u8;
                int o3 = sArr2[d2] * i16;
                int i17 = sArr3[t9] * u8;
                sArr[i15] = (short) ((o3 + i17) / i9);
                i15 += i10;
                d2 += i10;
                t9 += i10;
            }
        }
    }

    private void A0D(short[] sArr, int i9, int i10) {
        short[] A0G = A0G(this.A0B, this.A05, i10);
        this.A0B = A0G;
        int i11 = this.A0G;
        System.arraycopy(sArr, i9 * i11, A0G, this.A05 * i11, i11 * i10);
        this.A05 += i10;
    }

    private void A0E(short[] sArr, int i9, int i10) {
        int i11 = this.A0J / i10;
        int frameCount = this.A0G;
        int j7 = frameCount * i10;
        int i12 = i9 * frameCount;
        for (int value = 0; value < i11; value++) {
            int samplesPerValue = 0;
            for (int i13 = 0; i13 < j7; i13++) {
                samplesPerValue += sArr[(value * j7) + i12 + i13];
            }
            this.A0L[value] = (short) (samplesPerValue / j7);
        }
    }

    private boolean A0F(int i9, int i10) {
        if (i9 == 0 || this.A08 == 0 || i10 > i9 * 3 || i9 * 2 <= this.A07 * 3) {
            return false;
        }
        return true;
    }

    private short[] A0G(short[] sArr, int i9, int i10) {
        int length = sArr.length;
        int i11 = this.A0G;
        int currentCapacityFrames = length / i11;
        if (i9 + i10 <= currentCapacityFrames) {
            return sArr;
        }
        return Arrays.copyOf(sArr, i11 * (((currentCapacityFrames * 3) / 2) + i10));
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
        int i9;
        int i10 = this.A00;
        float f9 = this.A0F;
        float f10 = this.A0D;
        float r9 = f9 / f10;
        float f11 = this.A0E * f10;
        int i11 = this.A05;
        float s5 = i10;
        int remainingFrameCount = this.A06;
        int i12 = i11 + ((int) ((((s5 / r9) + remainingFrameCount) / f11) + 0.5f));
        short[] sArr = this.A0A;
        int i13 = this.A00;
        int remainingFrameCount2 = this.A0J;
        this.A0A = A0G(sArr, i13, (remainingFrameCount2 * 2) + i10);
        int xSample = 0;
        while (true) {
            i9 = this.A0J;
            int remainingFrameCount3 = i9 * 2;
            int i14 = this.A0G;
            if (xSample >= remainingFrameCount3 * i14) {
                break;
            }
            this.A0A[(i14 * i10) + xSample] = 0;
            xSample++;
        }
        int remainingFrameCount4 = i9 * 2;
        this.A00 += remainingFrameCount4;
        A06();
        int remainingFrameCount5 = this.A05;
        if (remainingFrameCount5 > i12) {
            this.A05 = i12;
        }
        this.A00 = 0;
        this.A09 = 0;
        this.A06 = 0;
    }

    public final void A0K(ShortBuffer shortBuffer) {
        int min = Math.min(shortBuffer.remaining() / this.A0G, this.A05);
        shortBuffer.put(this.A0B, 0, this.A0G * min);
        int i9 = this.A05 - min;
        this.A05 = i9;
        short[] sArr = this.A0B;
        int framesToRead = this.A0G;
        System.arraycopy(sArr, min * framesToRead, sArr, 0, i9 * framesToRead);
    }

    public final void A0L(ShortBuffer shortBuffer) {
        int remaining = shortBuffer.remaining();
        int framesToWrite = this.A0G;
        int i9 = remaining / framesToWrite;
        short[] A0G = A0G(this.A0A, this.A00, i9);
        this.A0A = A0G;
        int bytesToWrite = this.A00;
        shortBuffer.get(A0G, bytesToWrite * this.A0G, ((framesToWrite * i9) * 2) / 2);
        this.A00 += i9;
        A06();
    }
}
