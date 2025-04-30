package com.mbridge.msdk.playercommon.exoplayer2.audio;

import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import java.nio.ShortBuffer;
import java.util.Arrays;

/* loaded from: classes3.dex */
final class Sonic {
    private static final int AMDF_FREQUENCY = 4000;
    private static final int MAXIMUM_PITCH = 400;
    private static final int MINIMUM_PITCH = 65;
    private final int channelCount;
    private final short[] downSampleBuffer;
    private short[] inputBuffer;
    private int inputFrameCount;
    private final int inputSampleRateHz;
    private int maxDiff;
    private final int maxPeriod;
    private final int maxRequiredFrameCount;
    private int minDiff;
    private final int minPeriod;
    private int newRatePosition;
    private int oldRatePosition;
    private short[] outputBuffer;
    private int outputFrameCount;
    private final float pitch;
    private short[] pitchBuffer;
    private int pitchFrameCount;
    private int prevMinDiff;
    private int prevPeriod;
    private final float rate;
    private int remainingInputToCopyFrameCount;
    private final float speed;

    public Sonic(int i9, int i10, float f9, float f10, int i11) {
        this.inputSampleRateHz = i9;
        this.channelCount = i10;
        this.speed = f9;
        this.pitch = f10;
        this.rate = i9 / i11;
        this.minPeriod = i9 / 400;
        int i12 = i9 / MINIMUM_PITCH;
        this.maxPeriod = i12;
        int i13 = i12 * 2;
        this.maxRequiredFrameCount = i13;
        this.downSampleBuffer = new short[i13];
        this.inputBuffer = new short[i13 * i10];
        this.outputBuffer = new short[i13 * i10];
        this.pitchBuffer = new short[i13 * i10];
    }

    private void adjustRate(float f9, int i9) {
        int i10;
        int i11;
        if (this.outputFrameCount == i9) {
            return;
        }
        int i12 = this.inputSampleRateHz;
        int i13 = (int) (i12 / f9);
        while (true) {
            if (i13 <= 16384 && i12 <= 16384) {
                break;
            }
            i13 /= 2;
            i12 /= 2;
        }
        moveNewSamplesToPitchBuffer(i9);
        int i14 = 0;
        while (true) {
            int i15 = this.pitchFrameCount;
            boolean z8 = true;
            if (i14 < i15 - 1) {
                while (true) {
                    i10 = this.oldRatePosition;
                    int i16 = (i10 + 1) * i13;
                    i11 = this.newRatePosition;
                    if (i16 <= i11 * i12) {
                        break;
                    }
                    this.outputBuffer = ensureSpaceForAdditionalFrames(this.outputBuffer, this.outputFrameCount, 1);
                    int i17 = 0;
                    while (true) {
                        int i18 = this.channelCount;
                        if (i17 < i18) {
                            this.outputBuffer[(this.outputFrameCount * i18) + i17] = interpolate(this.pitchBuffer, (i18 * i14) + i17, i12, i13);
                            i17++;
                        }
                    }
                    this.newRatePosition++;
                    this.outputFrameCount++;
                }
                int i19 = i10 + 1;
                this.oldRatePosition = i19;
                if (i19 == i12) {
                    this.oldRatePosition = 0;
                    if (i11 != i13) {
                        z8 = false;
                    }
                    Assertions.checkState(z8);
                    this.newRatePosition = 0;
                }
                i14++;
            } else {
                removePitchFrames(i15 - 1);
                return;
            }
        }
    }

    private void changeSpeed(float f9) {
        int insertPitchPeriod;
        int i9 = this.inputFrameCount;
        if (i9 < this.maxRequiredFrameCount) {
            return;
        }
        int i10 = 0;
        do {
            if (this.remainingInputToCopyFrameCount > 0) {
                insertPitchPeriod = copyInputToOutput(i10);
            } else {
                int findPitchPeriod = findPitchPeriod(this.inputBuffer, i10);
                if (f9 > 1.0d) {
                    i10 = findPitchPeriod + skipPitchPeriod(this.inputBuffer, i10, f9, findPitchPeriod) + i10;
                } else {
                    insertPitchPeriod = insertPitchPeriod(this.inputBuffer, i10, f9, findPitchPeriod);
                }
            }
            i10 += insertPitchPeriod;
        } while (this.maxRequiredFrameCount + i10 <= i9);
        removeProcessedInputFrames(i10);
    }

    private int copyInputToOutput(int i9) {
        int min = Math.min(this.maxRequiredFrameCount, this.remainingInputToCopyFrameCount);
        copyToOutput(this.inputBuffer, i9, min);
        this.remainingInputToCopyFrameCount -= min;
        return min;
    }

    private void copyToOutput(short[] sArr, int i9, int i10) {
        short[] ensureSpaceForAdditionalFrames = ensureSpaceForAdditionalFrames(this.outputBuffer, this.outputFrameCount, i10);
        this.outputBuffer = ensureSpaceForAdditionalFrames;
        int i11 = this.channelCount;
        System.arraycopy(sArr, i9 * i11, ensureSpaceForAdditionalFrames, this.outputFrameCount * i11, i11 * i10);
        this.outputFrameCount += i10;
    }

    private void downSampleInput(short[] sArr, int i9, int i10) {
        int i11 = this.maxRequiredFrameCount / i10;
        int i12 = this.channelCount;
        int i13 = i10 * i12;
        int i14 = i9 * i12;
        for (int i15 = 0; i15 < i11; i15++) {
            int i16 = 0;
            for (int i17 = 0; i17 < i13; i17++) {
                i16 += sArr[(i15 * i13) + i14 + i17];
            }
            this.downSampleBuffer[i15] = (short) (i16 / i13);
        }
    }

    private short[] ensureSpaceForAdditionalFrames(short[] sArr, int i9, int i10) {
        int length = sArr.length;
        int i11 = this.channelCount;
        int i12 = length / i11;
        if (i9 + i10 <= i12) {
            return sArr;
        }
        return Arrays.copyOf(sArr, (((i12 * 3) / 2) + i10) * i11);
    }

    private int findPitchPeriod(short[] sArr, int i9) {
        int i10;
        int i11;
        int i12;
        int i13 = this.inputSampleRateHz;
        if (i13 > 4000) {
            i10 = i13 / 4000;
        } else {
            i10 = 1;
        }
        if (this.channelCount == 1 && i10 == 1) {
            i11 = findPitchPeriodInRange(sArr, i9, this.minPeriod, this.maxPeriod);
        } else {
            downSampleInput(sArr, i9, i10);
            int findPitchPeriodInRange = findPitchPeriodInRange(this.downSampleBuffer, 0, this.minPeriod / i10, this.maxPeriod / i10);
            if (i10 != 1) {
                int i14 = findPitchPeriodInRange * i10;
                int i15 = i10 * 4;
                int i16 = i14 - i15;
                int i17 = i14 + i15;
                int i18 = this.minPeriod;
                if (i16 < i18) {
                    i16 = i18;
                }
                int i19 = this.maxPeriod;
                if (i17 > i19) {
                    i17 = i19;
                }
                if (this.channelCount == 1) {
                    i11 = findPitchPeriodInRange(sArr, i9, i16, i17);
                } else {
                    downSampleInput(sArr, i9, 1);
                    i11 = findPitchPeriodInRange(this.downSampleBuffer, 0, i16, i17);
                }
            } else {
                i11 = findPitchPeriodInRange;
            }
        }
        if (previousPeriodBetter(this.minDiff, this.maxDiff)) {
            i12 = this.prevPeriod;
        } else {
            i12 = i11;
        }
        this.prevMinDiff = this.minDiff;
        this.prevPeriod = i11;
        return i12;
    }

    private int findPitchPeriodInRange(short[] sArr, int i9, int i10, int i11) {
        int i12 = i9 * this.channelCount;
        int i13 = 255;
        int i14 = 1;
        int i15 = 0;
        int i16 = 0;
        while (i10 <= i11) {
            int i17 = 0;
            for (int i18 = 0; i18 < i10; i18++) {
                i17 += Math.abs(sArr[i12 + i18] - sArr[(i12 + i10) + i18]);
            }
            if (i17 * i15 < i14 * i10) {
                i15 = i10;
                i14 = i17;
            }
            if (i17 * i13 > i16 * i10) {
                i13 = i10;
                i16 = i17;
            }
            i10++;
        }
        this.minDiff = i14 / i15;
        this.maxDiff = i16 / i13;
        return i15;
    }

    private int insertPitchPeriod(short[] sArr, int i9, float f9, int i10) {
        int i11;
        if (f9 < 0.5f) {
            i11 = (int) ((i10 * f9) / (1.0f - f9));
        } else {
            this.remainingInputToCopyFrameCount = (int) ((((2.0f * f9) - 1.0f) * i10) / (1.0f - f9));
            i11 = i10;
        }
        int i12 = i10 + i11;
        short[] ensureSpaceForAdditionalFrames = ensureSpaceForAdditionalFrames(this.outputBuffer, this.outputFrameCount, i12);
        this.outputBuffer = ensureSpaceForAdditionalFrames;
        int i13 = this.channelCount;
        System.arraycopy(sArr, i9 * i13, ensureSpaceForAdditionalFrames, this.outputFrameCount * i13, i13 * i10);
        overlapAdd(i11, this.channelCount, this.outputBuffer, this.outputFrameCount + i10, sArr, i9 + i10, sArr, i9);
        this.outputFrameCount += i12;
        return i11;
    }

    private short interpolate(short[] sArr, int i9, int i10, int i11) {
        short s5 = sArr[i9];
        short s9 = sArr[i9 + this.channelCount];
        int i12 = this.newRatePosition * i10;
        int i13 = this.oldRatePosition;
        int i14 = i13 * i11;
        int i15 = (i13 + 1) * i11;
        int i16 = i15 - i12;
        int i17 = i15 - i14;
        return (short) ((((i17 - i16) * s9) + (s5 * i16)) / i17);
    }

    private void moveNewSamplesToPitchBuffer(int i9) {
        int i10 = this.outputFrameCount - i9;
        short[] ensureSpaceForAdditionalFrames = ensureSpaceForAdditionalFrames(this.pitchBuffer, this.pitchFrameCount, i10);
        this.pitchBuffer = ensureSpaceForAdditionalFrames;
        short[] sArr = this.outputBuffer;
        int i11 = this.channelCount;
        System.arraycopy(sArr, i9 * i11, ensureSpaceForAdditionalFrames, this.pitchFrameCount * i11, i11 * i10);
        this.outputFrameCount = i9;
        this.pitchFrameCount += i10;
    }

    private static void overlapAdd(int i9, int i10, short[] sArr, int i11, short[] sArr2, int i12, short[] sArr3, int i13) {
        for (int i14 = 0; i14 < i10; i14++) {
            int i15 = (i11 * i10) + i14;
            int i16 = (i13 * i10) + i14;
            int i17 = (i12 * i10) + i14;
            for (int i18 = 0; i18 < i9; i18++) {
                sArr[i15] = (short) (((sArr3[i16] * i18) + ((i9 - i18) * sArr2[i17])) / i9);
                i15 += i10;
                i17 += i10;
                i16 += i10;
            }
        }
    }

    private boolean previousPeriodBetter(int i9, int i10) {
        if (i9 == 0 || this.prevPeriod == 0 || i10 > i9 * 3 || i9 * 2 <= this.prevMinDiff * 3) {
            return false;
        }
        return true;
    }

    private void processStreamInput() {
        int i9 = this.outputFrameCount;
        float f9 = this.speed;
        float f10 = this.pitch;
        float f11 = f9 / f10;
        float f12 = this.rate * f10;
        double d2 = f11;
        if (d2 <= 1.00001d && d2 >= 0.99999d) {
            copyToOutput(this.inputBuffer, 0, this.inputFrameCount);
            this.inputFrameCount = 0;
        } else {
            changeSpeed(f11);
        }
        if (f12 != 1.0f) {
            adjustRate(f12, i9);
        }
    }

    private void removePitchFrames(int i9) {
        if (i9 == 0) {
            return;
        }
        short[] sArr = this.pitchBuffer;
        int i10 = this.channelCount;
        System.arraycopy(sArr, i9 * i10, sArr, 0, (this.pitchFrameCount - i9) * i10);
        this.pitchFrameCount -= i9;
    }

    private void removeProcessedInputFrames(int i9) {
        int i10 = this.inputFrameCount - i9;
        short[] sArr = this.inputBuffer;
        int i11 = this.channelCount;
        System.arraycopy(sArr, i9 * i11, sArr, 0, i11 * i10);
        this.inputFrameCount = i10;
    }

    private int skipPitchPeriod(short[] sArr, int i9, float f9, int i10) {
        int i11;
        if (f9 >= 2.0f) {
            i11 = (int) (i10 / (f9 - 1.0f));
        } else {
            this.remainingInputToCopyFrameCount = (int) (((2.0f - f9) * i10) / (f9 - 1.0f));
            i11 = i10;
        }
        short[] ensureSpaceForAdditionalFrames = ensureSpaceForAdditionalFrames(this.outputBuffer, this.outputFrameCount, i11);
        this.outputBuffer = ensureSpaceForAdditionalFrames;
        overlapAdd(i11, this.channelCount, ensureSpaceForAdditionalFrames, this.outputFrameCount, sArr, i9, sArr, i9 + i10);
        this.outputFrameCount += i11;
        return i11;
    }

    public final void flush() {
        this.inputFrameCount = 0;
        this.outputFrameCount = 0;
        this.pitchFrameCount = 0;
        this.oldRatePosition = 0;
        this.newRatePosition = 0;
        this.remainingInputToCopyFrameCount = 0;
        this.prevPeriod = 0;
        this.prevMinDiff = 0;
        this.minDiff = 0;
        this.maxDiff = 0;
    }

    public final int getFramesAvailable() {
        return this.outputFrameCount;
    }

    public final void getOutput(ShortBuffer shortBuffer) {
        int min = Math.min(shortBuffer.remaining() / this.channelCount, this.outputFrameCount);
        shortBuffer.put(this.outputBuffer, 0, this.channelCount * min);
        int i9 = this.outputFrameCount - min;
        this.outputFrameCount = i9;
        short[] sArr = this.outputBuffer;
        int i10 = this.channelCount;
        System.arraycopy(sArr, min * i10, sArr, 0, i9 * i10);
    }

    public final void queueEndOfStream() {
        int i9;
        int i10 = this.inputFrameCount;
        float f9 = this.speed;
        float f10 = this.pitch;
        int i11 = this.outputFrameCount + ((int) ((((i10 / (f9 / f10)) + this.pitchFrameCount) / (this.rate * f10)) + 0.5f));
        this.inputBuffer = ensureSpaceForAdditionalFrames(this.inputBuffer, i10, (this.maxRequiredFrameCount * 2) + i10);
        int i12 = 0;
        while (true) {
            i9 = this.maxRequiredFrameCount;
            int i13 = this.channelCount;
            if (i12 >= i9 * 2 * i13) {
                break;
            }
            this.inputBuffer[(i13 * i10) + i12] = 0;
            i12++;
        }
        this.inputFrameCount = (i9 * 2) + this.inputFrameCount;
        processStreamInput();
        if (this.outputFrameCount > i11) {
            this.outputFrameCount = i11;
        }
        this.inputFrameCount = 0;
        this.remainingInputToCopyFrameCount = 0;
        this.pitchFrameCount = 0;
    }

    public final void queueInput(ShortBuffer shortBuffer) {
        int remaining = shortBuffer.remaining();
        int i9 = this.channelCount;
        int i10 = remaining / i9;
        short[] ensureSpaceForAdditionalFrames = ensureSpaceForAdditionalFrames(this.inputBuffer, this.inputFrameCount, i10);
        this.inputBuffer = ensureSpaceForAdditionalFrames;
        shortBuffer.get(ensureSpaceForAdditionalFrames, this.inputFrameCount * this.channelCount, ((i9 * i10) * 2) / 2);
        this.inputFrameCount += i10;
        processStreamInput();
    }
}
