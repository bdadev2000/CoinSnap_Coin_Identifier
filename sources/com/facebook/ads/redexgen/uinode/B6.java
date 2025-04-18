package com.facebook.ads.redexgen.uinode;

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

    public B6(int i10, int i11, float f10, float f11, int i12) {
        this.A0H = i10;
        this.A0G = i11;
        this.A0F = f10;
        this.A0D = f11;
        this.A0E = i10 / i12;
        this.A0K = i10 / 400;
        int i13 = i10 / 65;
        this.A0I = i13;
        int i14 = i13 * 2;
        this.A0J = i14;
        this.A0L = new short[i14];
        this.A0A = new short[i14 * i11];
        this.A0B = new short[i14 * i11];
        this.A0C = new short[i14 * i11];
    }

    private int A00(int i10) {
        int min = Math.min(this.A0J, this.A09);
        A0D(this.A0A, i10, min);
        int frameCount = this.A09;
        this.A09 = frameCount - min;
        return min;
    }

    private int A01(short[] sArr, int i10) {
        int minP;
        int period;
        int i11 = this.A0H;
        int i12 = i11 > 4000 ? i11 / 4000 : 1;
        int skip = this.A0G;
        if (skip == 1 && i12 == 1) {
            int i13 = this.A0K;
            int skip2 = this.A0I;
            minP = A04(sArr, i10, i13, skip2);
        } else {
            A0E(sArr, i10, i12);
            short[] sArr2 = this.A0L;
            int i14 = this.A0K / i12;
            int skip3 = this.A0I;
            minP = A04(sArr2, 0, i14, skip3 / i12);
            if (i12 != 1) {
                int minP2 = minP * i12;
                int skip4 = i12 * 4;
                int period2 = minP2 - skip4;
                int i15 = (i12 * 4) + minP2;
                int skip5 = this.A0K;
                if (period2 < skip5) {
                    period2 = this.A0K;
                }
                int skip6 = this.A0I;
                if (i15 > skip6) {
                    i15 = this.A0I;
                }
                int skip7 = this.A0G;
                if (skip7 == 1) {
                    minP = A04(sArr, i10, period2, i15);
                } else {
                    A0E(sArr, i10, 1);
                    minP = A04(this.A0L, 0, period2, i15);
                }
            }
        }
        int i16 = this.A02;
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
        if (A0F(i16, maxP)) {
            period = this.A08;
        } else {
            period = minP;
        }
        int skip9 = this.A02;
        this.A07 = skip9;
        this.A08 = minP;
        return period;
    }

    private int A02(short[] sArr, int i10, float f10, int i11) {
        int i12;
        if (f10 < 0.5f) {
            i12 = (int) ((i11 * f10) / (1.0f - f10));
        } else {
            i12 = i11;
            int newFrameCount = (int) ((i11 * ((2.0f * f10) - 1.0f)) / (1.0f - f10));
            this.A09 = newFrameCount;
        }
        int newFrameCount2 = i11 + i12;
        short[] A0G = A0G(this.A0B, this.A05, newFrameCount2);
        this.A0B = A0G;
        int i13 = this.A0G;
        int newFrameCount3 = this.A05;
        System.arraycopy(sArr, i10 * i13, A0G, newFrameCount3 * i13, i13 * i11);
        A0C(i12, this.A0G, this.A0B, this.A05 + i11, sArr, i10 + i11, sArr, i10);
        int newFrameCount4 = this.A05;
        this.A05 = newFrameCount4 + i11 + i12;
        return i12;
    }

    private int A03(short[] sArr, int i10, float f10, int i11) {
        int newFrameCount;
        if (f10 >= 2.0f) {
            newFrameCount = (int) (i11 / (f10 - 1.0f));
        } else {
            this.A09 = (int) ((i11 * (2.0f - f10)) / (f10 - 1.0f));
            newFrameCount = i11;
        }
        short[] sArr2 = this.A0B;
        int newFrameCount2 = this.A05;
        short[] A0G = A0G(sArr2, newFrameCount2, newFrameCount);
        this.A0B = A0G;
        A0C(newFrameCount, this.A0G, A0G, this.A05, sArr, i10, sArr, i10 + i11);
        int newFrameCount3 = this.A05;
        this.A05 = newFrameCount3 + newFrameCount;
        return newFrameCount;
    }

    private int A04(short[] sArr, int i10, int i11, int i12) {
        int i13 = 0;
        int i14 = 255;
        int period = 1;
        int maxDiff = 0;
        int bestPeriod = this.A0G;
        int i15 = i10 * bestPeriod;
        while (i11 <= i12) {
            int diff = 0;
            for (int minDiff = 0; minDiff < i11; minDiff++) {
                int bestPeriod2 = i15 + minDiff;
                short s5 = sArr[bestPeriod2];
                int bestPeriod3 = i15 + i11;
                int worstPeriod = s5 - sArr[bestPeriod3 + minDiff];
                int bestPeriod4 = Math.abs(worstPeriod);
                diff += bestPeriod4;
            }
            int worstPeriod2 = diff * i13;
            int bestPeriod5 = period * i11;
            if (worstPeriod2 < bestPeriod5) {
                period = diff;
                i13 = i11;
            }
            int worstPeriod3 = diff * i14;
            int bestPeriod6 = maxDiff * i11;
            if (worstPeriod3 > bestPeriod6) {
                maxDiff = diff;
                i14 = i11;
            }
            i11++;
        }
        this.A02 = period / i13;
        this.A01 = maxDiff / i14;
        return i13;
    }

    private short A05(short[] sArr, int i10, int i11, int i12) {
        short s5 = sArr[i10];
        short s10 = sArr[this.A0G + i10];
        int rightPosition = this.A03 * i11;
        int i13 = this.A04;
        int i14 = i13 * i12;
        int position = (i13 + 1) * i12;
        int i15 = position - rightPosition;
        int position2 = position - i14;
        short left = (short) (((i15 * s5) + ((position2 - i15) * s10)) / position2);
        return left;
    }

    private void A06() {
        int i10 = this.A05;
        float f10 = this.A0F;
        float f11 = this.A0D;
        float f12 = f10 / f11;
        float f13 = this.A0E * f11;
        if (f12 > 1.00001d || f12 < 0.99999d) {
            A07(f12);
        } else {
            A0D(this.A0A, 0, this.A00);
            this.A00 = 0;
        }
        if (f13 != 1.0f) {
            A08(f13, i10);
        }
    }

    private void A07(float f10) {
        int frameCount;
        if (this.A00 < this.A0J) {
            return;
        }
        int i10 = this.A00;
        int i11 = 0;
        do {
            int frameCount2 = this.A09;
            if (frameCount2 > 0) {
                int frameCount3 = A00(i11);
                i11 += frameCount3;
            } else {
                int A01 = A01(this.A0A, i11);
                if (f10 > 1.0d) {
                    int frameCount4 = A03(this.A0A, i11, f10, A01);
                    i11 += frameCount4 + A01;
                } else {
                    int frameCount5 = A02(this.A0A, i11, f10, A01);
                    i11 += frameCount5;
                }
            }
            frameCount = this.A0J;
        } while (frameCount + i11 <= i10);
        A0B(i11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x009b, code lost:
    
        r0 = r8 + 1;
        r9.A04 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x009f, code lost:
    
        if (r0 != r5) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a1, code lost:
    
        r2 = com.facebook.ads.redexgen.uinode.B6.A0M;
        r1 = r2[5];
        r0 = r2[0];
        r1 = r1.length();
        r0 = r0.length();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b2, code lost:
    
        if (r1 == r0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ba, code lost:
    
        com.facebook.ads.redexgen.uinode.B6.A0M[6] = "dm69MZtNxJx8v5BsJDIKlnc92CG6PQ3Q";
        r9.A04 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c3, code lost:
    
        if (r3 != r6) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c5, code lost:
    
        com.facebook.ads.redexgen.uinode.AbstractC0626Ha.A04(r4);
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
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.uinode.B6.A08(float, int):void");
    }

    private void A09(int i10) {
        int i11 = this.A05 - i10;
        short[] sArr = this.A0C;
        int frameCount = this.A06;
        short[] A0G = A0G(sArr, frameCount, i11);
        this.A0C = A0G;
        short[] sArr2 = this.A0B;
        int i12 = this.A0G;
        int frameCount2 = this.A06;
        System.arraycopy(sArr2, i10 * i12, A0G, frameCount2 * i12, i12 * i11);
        this.A05 = i10;
        int frameCount3 = this.A06;
        this.A06 = frameCount3 + i11;
    }

    private void A0A(int i10) {
        if (i10 == 0) {
            return;
        }
        short[] sArr = this.A0C;
        int i11 = this.A0G;
        System.arraycopy(sArr, i10 * i11, sArr, 0, (this.A06 - i10) * i11);
        this.A06 -= i10;
    }

    private void A0B(int i10) {
        int i11 = this.A00 - i10;
        short[] sArr = this.A0A;
        int i12 = this.A0G;
        System.arraycopy(sArr, i10 * i12, sArr, 0, i12 * i11);
        this.A00 = i11;
    }

    public static void A0C(int i10, int i11, short[] sArr, int i12, short[] sArr2, int i13, short[] sArr3, int i14) {
        for (int i15 = 0; i15 < i11; i15++) {
            int i16 = (i12 * i11) + i15;
            int t5 = (i14 * i11) + i15;
            int d10 = (i13 * i11) + i15;
            for (int u = 0; u < i10; u++) {
                int i17 = i10 - u;
                int o10 = sArr2[d10] * i17;
                int i18 = sArr3[t5] * u;
                sArr[i16] = (short) ((o10 + i18) / i10);
                i16 += i11;
                d10 += i11;
                t5 += i11;
            }
        }
    }

    private void A0D(short[] sArr, int i10, int i11) {
        short[] A0G = A0G(this.A0B, this.A05, i11);
        this.A0B = A0G;
        int i12 = this.A0G;
        System.arraycopy(sArr, i10 * i12, A0G, this.A05 * i12, i12 * i11);
        this.A05 += i11;
    }

    private void A0E(short[] sArr, int i10, int i11) {
        int i12 = this.A0J / i11;
        int frameCount = this.A0G;
        int j3 = frameCount * i11;
        int i13 = i10 * frameCount;
        for (int value = 0; value < i12; value++) {
            int samplesPerValue = 0;
            for (int i14 = 0; i14 < j3; i14++) {
                samplesPerValue += sArr[(value * j3) + i13 + i14];
            }
            this.A0L[value] = (short) (samplesPerValue / j3);
        }
    }

    private boolean A0F(int i10, int i11) {
        if (i10 == 0 || this.A08 == 0 || i11 > i10 * 3 || i10 * 2 <= this.A07 * 3) {
            return false;
        }
        return true;
    }

    private short[] A0G(short[] sArr, int i10, int i11) {
        int length = sArr.length;
        int i12 = this.A0G;
        int currentCapacityFrames = length / i12;
        if (i10 + i11 <= currentCapacityFrames) {
            return sArr;
        }
        return Arrays.copyOf(sArr, i12 * (((currentCapacityFrames * 3) / 2) + i11));
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
        int i10;
        int i11 = this.A00;
        float f10 = this.A0F;
        float f11 = this.A0D;
        float r6 = f10 / f11;
        float f12 = this.A0E * f11;
        int i12 = this.A05;
        float s5 = i11;
        int remainingFrameCount = this.A06;
        int i13 = i12 + ((int) ((((s5 / r6) + remainingFrameCount) / f12) + 0.5f));
        short[] sArr = this.A0A;
        int i14 = this.A00;
        int remainingFrameCount2 = this.A0J;
        this.A0A = A0G(sArr, i14, (remainingFrameCount2 * 2) + i11);
        int xSample = 0;
        while (true) {
            i10 = this.A0J;
            int remainingFrameCount3 = i10 * 2;
            int i15 = this.A0G;
            if (xSample >= remainingFrameCount3 * i15) {
                break;
            }
            this.A0A[(i15 * i11) + xSample] = 0;
            xSample++;
        }
        int remainingFrameCount4 = i10 * 2;
        this.A00 += remainingFrameCount4;
        A06();
        int remainingFrameCount5 = this.A05;
        if (remainingFrameCount5 > i13) {
            this.A05 = i13;
        }
        this.A00 = 0;
        this.A09 = 0;
        this.A06 = 0;
    }

    public final void A0K(ShortBuffer shortBuffer) {
        int min = Math.min(shortBuffer.remaining() / this.A0G, this.A05);
        shortBuffer.put(this.A0B, 0, this.A0G * min);
        int i10 = this.A05 - min;
        this.A05 = i10;
        short[] sArr = this.A0B;
        int framesToRead = this.A0G;
        System.arraycopy(sArr, min * framesToRead, sArr, 0, i10 * framesToRead);
    }

    public final void A0L(ShortBuffer shortBuffer) {
        int remaining = shortBuffer.remaining();
        int framesToWrite = this.A0G;
        int i10 = remaining / framesToWrite;
        short[] A0G = A0G(this.A0A, this.A00, i10);
        this.A0A = A0G;
        int bytesToWrite = this.A00;
        shortBuffer.get(A0G, bytesToWrite * this.A0G, ((framesToWrite * i10) * 2) / 2);
        this.A00 += i10;
        A06();
    }
}
