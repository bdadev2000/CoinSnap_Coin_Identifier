package com.mbridge.msdk.playercommon.exoplayer2.extractor.mp3;

import android.util.Log;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.MpegAudioHeader;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.SeekMap;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.SeekPoint;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.mp3.Mp3Extractor;
import com.mbridge.msdk.playercommon.exoplayer2.util.ParsableByteArray;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.a;

/* loaded from: classes4.dex */
final class XingSeeker implements Mp3Extractor.Seeker {
    private static final String TAG = "XingSeeker";
    private final long dataSize;
    private final long dataStartPosition;
    private final long durationUs;
    private final long[] tableOfContents;
    private final int xingFrameSize;

    private XingSeeker(long j3, int i10, long j10) {
        this(j3, i10, j10, -1L, null);
    }

    public static XingSeeker create(long j3, long j10, MpegAudioHeader mpegAudioHeader, ParsableByteArray parsableByteArray) {
        int readUnsignedIntToInt;
        int i10 = mpegAudioHeader.samplesPerFrame;
        int i11 = mpegAudioHeader.sampleRate;
        int readInt = parsableByteArray.readInt();
        if ((readInt & 1) == 1 && (readUnsignedIntToInt = parsableByteArray.readUnsignedIntToInt()) != 0) {
            long scaleLargeTimestamp = Util.scaleLargeTimestamp(readUnsignedIntToInt, i10 * 1000000, i11);
            if ((readInt & 6) != 6) {
                return new XingSeeker(j10, mpegAudioHeader.frameSize, scaleLargeTimestamp);
            }
            long readUnsignedIntToInt2 = parsableByteArray.readUnsignedIntToInt();
            long[] jArr = new long[100];
            for (int i12 = 0; i12 < 100; i12++) {
                jArr[i12] = parsableByteArray.readUnsignedByte();
            }
            if (j3 != -1) {
                long j11 = j10 + readUnsignedIntToInt2;
                if (j3 != j11) {
                    StringBuilder o10 = a.o("XING data size mismatch: ", j3, ", ");
                    o10.append(j11);
                    Log.w(TAG, o10.toString());
                }
            }
            return new XingSeeker(j10, mpegAudioHeader.frameSize, scaleLargeTimestamp, readUnsignedIntToInt2, jArr);
        }
        return null;
    }

    private long getTimeUsForTableIndex(int i10) {
        return (this.durationUs * i10) / 100;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.SeekMap
    public final long getDurationUs() {
        return this.durationUs;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.SeekMap
    public final SeekMap.SeekPoints getSeekPoints(long j3) {
        double d10;
        if (!isSeekable()) {
            return new SeekMap.SeekPoints(new SeekPoint(0L, this.dataStartPosition + this.xingFrameSize));
        }
        long constrainValue = Util.constrainValue(j3, 0L, this.durationUs);
        double d11 = (constrainValue * 100.0d) / this.durationUs;
        double d12 = 0.0d;
        if (d11 > 0.0d) {
            if (d11 >= 100.0d) {
                d12 = 256.0d;
            } else {
                int i10 = (int) d11;
                long[] jArr = this.tableOfContents;
                double d13 = jArr[i10];
                if (i10 == 99) {
                    d10 = 256.0d;
                } else {
                    d10 = jArr[i10 + 1];
                }
                d12 = d13 + ((d10 - d13) * (d11 - i10));
            }
        }
        return new SeekMap.SeekPoints(new SeekPoint(constrainValue, this.dataStartPosition + Util.constrainValue(Math.round((d12 / 256.0d) * this.dataSize), this.xingFrameSize, this.dataSize - 1)));
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.mp3.Mp3Extractor.Seeker
    public final long getTimeUs(long j3) {
        long j10;
        double d10;
        long j11 = j3 - this.dataStartPosition;
        if (isSeekable() && j11 > this.xingFrameSize) {
            double d11 = (j11 * 256.0d) / this.dataSize;
            int binarySearchFloor = Util.binarySearchFloor(this.tableOfContents, (long) d11, true, true);
            long timeUsForTableIndex = getTimeUsForTableIndex(binarySearchFloor);
            long j12 = this.tableOfContents[binarySearchFloor];
            int i10 = binarySearchFloor + 1;
            long timeUsForTableIndex2 = getTimeUsForTableIndex(i10);
            if (binarySearchFloor == 99) {
                j10 = 256;
            } else {
                j10 = this.tableOfContents[i10];
            }
            if (j12 == j10) {
                d10 = 0.0d;
            } else {
                d10 = (d11 - j12) / (j10 - j12);
            }
            return Math.round(d10 * (timeUsForTableIndex2 - timeUsForTableIndex)) + timeUsForTableIndex;
        }
        return 0L;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.SeekMap
    public final boolean isSeekable() {
        return this.tableOfContents != null;
    }

    private XingSeeker(long j3, int i10, long j10, long j11, long[] jArr) {
        this.dataStartPosition = j3;
        this.xingFrameSize = i10;
        this.durationUs = j10;
        this.dataSize = j11;
        this.tableOfContents = jArr;
    }
}
