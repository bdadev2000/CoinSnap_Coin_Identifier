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
final class VbriSeeker implements Mp3Extractor.Seeker {
    private static final String TAG = "VbriSeeker";
    private final long durationUs;
    private final long[] positions;
    private final long[] timesUs;

    private VbriSeeker(long[] jArr, long[] jArr2, long j3) {
        this.timesUs = jArr;
        this.positions = jArr2;
        this.durationUs = j3;
    }

    public static VbriSeeker create(long j3, long j10, MpegAudioHeader mpegAudioHeader, ParsableByteArray parsableByteArray) {
        int i10;
        int readUnsignedByte;
        parsableByteArray.skipBytes(10);
        int readInt = parsableByteArray.readInt();
        if (readInt <= 0) {
            return null;
        }
        int i11 = mpegAudioHeader.sampleRate;
        long j11 = readInt;
        if (i11 >= 32000) {
            i10 = 1152;
        } else {
            i10 = 576;
        }
        long scaleLargeTimestamp = Util.scaleLargeTimestamp(j11, i10 * 1000000, i11);
        int readUnsignedShort = parsableByteArray.readUnsignedShort();
        int readUnsignedShort2 = parsableByteArray.readUnsignedShort();
        int readUnsignedShort3 = parsableByteArray.readUnsignedShort();
        parsableByteArray.skipBytes(2);
        long j12 = j10 + mpegAudioHeader.frameSize;
        long[] jArr = new long[readUnsignedShort];
        long[] jArr2 = new long[readUnsignedShort];
        int i12 = 0;
        long j13 = j10;
        while (i12 < readUnsignedShort) {
            long j14 = scaleLargeTimestamp;
            jArr[i12] = (i12 * scaleLargeTimestamp) / readUnsignedShort;
            jArr2[i12] = Math.max(j13, j12);
            if (readUnsignedShort3 != 1) {
                if (readUnsignedShort3 != 2) {
                    if (readUnsignedShort3 != 3) {
                        if (readUnsignedShort3 != 4) {
                            return null;
                        }
                        readUnsignedByte = parsableByteArray.readUnsignedIntToInt();
                    } else {
                        readUnsignedByte = parsableByteArray.readUnsignedInt24();
                    }
                } else {
                    readUnsignedByte = parsableByteArray.readUnsignedShort();
                }
            } else {
                readUnsignedByte = parsableByteArray.readUnsignedByte();
            }
            j13 += readUnsignedByte * readUnsignedShort2;
            i12++;
            scaleLargeTimestamp = j14;
        }
        long j15 = scaleLargeTimestamp;
        if (j3 != -1 && j3 != j13) {
            StringBuilder o10 = a.o("VBRI data size mismatch: ", j3, ", ");
            o10.append(j13);
            Log.w(TAG, o10.toString());
        }
        return new VbriSeeker(jArr, jArr2, j15);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.SeekMap
    public final long getDurationUs() {
        return this.durationUs;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.SeekMap
    public final SeekMap.SeekPoints getSeekPoints(long j3) {
        int binarySearchFloor = Util.binarySearchFloor(this.timesUs, j3, true, true);
        SeekPoint seekPoint = new SeekPoint(this.timesUs[binarySearchFloor], this.positions[binarySearchFloor]);
        if (seekPoint.timeUs < j3 && binarySearchFloor != this.timesUs.length - 1) {
            int i10 = binarySearchFloor + 1;
            return new SeekMap.SeekPoints(seekPoint, new SeekPoint(this.timesUs[i10], this.positions[i10]));
        }
        return new SeekMap.SeekPoints(seekPoint);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.mp3.Mp3Extractor.Seeker
    public final long getTimeUs(long j3) {
        return this.timesUs[Util.binarySearchFloor(this.positions, j3, true, true)];
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.SeekMap
    public final boolean isSeekable() {
        return true;
    }
}
