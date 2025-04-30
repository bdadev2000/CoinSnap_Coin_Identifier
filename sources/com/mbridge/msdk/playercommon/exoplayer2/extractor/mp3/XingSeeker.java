package com.mbridge.msdk.playercommon.exoplayer2.extractor.mp3;

import android.util.Log;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.MpegAudioHeader;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.SeekMap;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.SeekPoint;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.mp3.Mp3Extractor;
import com.mbridge.msdk.playercommon.exoplayer2.util.ParsableByteArray;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;
import y.AbstractC2933a;

/* loaded from: classes3.dex */
final class XingSeeker implements Mp3Extractor.Seeker {
    private static final String TAG = "XingSeeker";
    private final long dataSize;
    private final long dataStartPosition;
    private final long durationUs;
    private final long[] tableOfContents;
    private final int xingFrameSize;

    private XingSeeker(long j7, int i9, long j9) {
        this(j7, i9, j9, -1L, null);
    }

    public static XingSeeker create(long j7, long j9, MpegAudioHeader mpegAudioHeader, ParsableByteArray parsableByteArray) {
        int readUnsignedIntToInt;
        int i9 = mpegAudioHeader.samplesPerFrame;
        int i10 = mpegAudioHeader.sampleRate;
        int readInt = parsableByteArray.readInt();
        if ((readInt & 1) == 1 && (readUnsignedIntToInt = parsableByteArray.readUnsignedIntToInt()) != 0) {
            long scaleLargeTimestamp = Util.scaleLargeTimestamp(readUnsignedIntToInt, i9 * 1000000, i10);
            if ((readInt & 6) != 6) {
                return new XingSeeker(j9, mpegAudioHeader.frameSize, scaleLargeTimestamp);
            }
            long readUnsignedIntToInt2 = parsableByteArray.readUnsignedIntToInt();
            long[] jArr = new long[100];
            for (int i11 = 0; i11 < 100; i11++) {
                jArr[i11] = parsableByteArray.readUnsignedByte();
            }
            if (j7 != -1) {
                long j10 = j9 + readUnsignedIntToInt2;
                if (j7 != j10) {
                    StringBuilder a6 = AbstractC2933a.a("XING data size mismatch: ", j7, ", ");
                    a6.append(j10);
                    Log.w(TAG, a6.toString());
                }
            }
            return new XingSeeker(j9, mpegAudioHeader.frameSize, scaleLargeTimestamp, readUnsignedIntToInt2, jArr);
        }
        return null;
    }

    private long getTimeUsForTableIndex(int i9) {
        return (this.durationUs * i9) / 100;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.SeekMap
    public final long getDurationUs() {
        return this.durationUs;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.SeekMap
    public final SeekMap.SeekPoints getSeekPoints(long j7) {
        double d2;
        if (!isSeekable()) {
            return new SeekMap.SeekPoints(new SeekPoint(0L, this.dataStartPosition + this.xingFrameSize));
        }
        long constrainValue = Util.constrainValue(j7, 0L, this.durationUs);
        double d9 = (constrainValue * 100.0d) / this.durationUs;
        double d10 = 0.0d;
        if (d9 > 0.0d) {
            if (d9 >= 100.0d) {
                d10 = 256.0d;
            } else {
                int i9 = (int) d9;
                long[] jArr = this.tableOfContents;
                double d11 = jArr[i9];
                if (i9 == 99) {
                    d2 = 256.0d;
                } else {
                    d2 = jArr[i9 + 1];
                }
                d10 = d11 + ((d2 - d11) * (d9 - i9));
            }
        }
        return new SeekMap.SeekPoints(new SeekPoint(constrainValue, this.dataStartPosition + Util.constrainValue(Math.round((d10 / 256.0d) * this.dataSize), this.xingFrameSize, this.dataSize - 1)));
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.mp3.Mp3Extractor.Seeker
    public final long getTimeUs(long j7) {
        long j9;
        double d2;
        long j10 = j7 - this.dataStartPosition;
        if (isSeekable() && j10 > this.xingFrameSize) {
            double d9 = (j10 * 256.0d) / this.dataSize;
            int binarySearchFloor = Util.binarySearchFloor(this.tableOfContents, (long) d9, true, true);
            long timeUsForTableIndex = getTimeUsForTableIndex(binarySearchFloor);
            long j11 = this.tableOfContents[binarySearchFloor];
            int i9 = binarySearchFloor + 1;
            long timeUsForTableIndex2 = getTimeUsForTableIndex(i9);
            if (binarySearchFloor == 99) {
                j9 = 256;
            } else {
                j9 = this.tableOfContents[i9];
            }
            if (j11 == j9) {
                d2 = 0.0d;
            } else {
                d2 = (d9 - j11) / (j9 - j11);
            }
            return Math.round(d2 * (timeUsForTableIndex2 - timeUsForTableIndex)) + timeUsForTableIndex;
        }
        return 0L;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.SeekMap
    public final boolean isSeekable() {
        if (this.tableOfContents != null) {
            return true;
        }
        return false;
    }

    private XingSeeker(long j7, int i9, long j9, long j10, long[] jArr) {
        this.dataStartPosition = j7;
        this.xingFrameSize = i9;
        this.durationUs = j9;
        this.dataSize = j10;
        this.tableOfContents = jArr;
    }
}
