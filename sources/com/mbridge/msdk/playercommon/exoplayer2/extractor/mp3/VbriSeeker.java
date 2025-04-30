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
final class VbriSeeker implements Mp3Extractor.Seeker {
    private static final String TAG = "VbriSeeker";
    private final long durationUs;
    private final long[] positions;
    private final long[] timesUs;

    private VbriSeeker(long[] jArr, long[] jArr2, long j7) {
        this.timesUs = jArr;
        this.positions = jArr2;
        this.durationUs = j7;
    }

    public static VbriSeeker create(long j7, long j9, MpegAudioHeader mpegAudioHeader, ParsableByteArray parsableByteArray) {
        int i9;
        int readUnsignedByte;
        parsableByteArray.skipBytes(10);
        int readInt = parsableByteArray.readInt();
        if (readInt <= 0) {
            return null;
        }
        int i10 = mpegAudioHeader.sampleRate;
        long j10 = readInt;
        if (i10 >= 32000) {
            i9 = 1152;
        } else {
            i9 = 576;
        }
        long scaleLargeTimestamp = Util.scaleLargeTimestamp(j10, i9 * 1000000, i10);
        int readUnsignedShort = parsableByteArray.readUnsignedShort();
        int readUnsignedShort2 = parsableByteArray.readUnsignedShort();
        int readUnsignedShort3 = parsableByteArray.readUnsignedShort();
        parsableByteArray.skipBytes(2);
        long j11 = j9 + mpegAudioHeader.frameSize;
        long[] jArr = new long[readUnsignedShort];
        long[] jArr2 = new long[readUnsignedShort];
        int i11 = 0;
        long j12 = j9;
        while (i11 < readUnsignedShort) {
            long j13 = j11;
            long j14 = scaleLargeTimestamp;
            jArr[i11] = (i11 * scaleLargeTimestamp) / readUnsignedShort;
            jArr2[i11] = Math.max(j12, j13);
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
            j12 += readUnsignedByte * readUnsignedShort2;
            i11++;
            j11 = j13;
            scaleLargeTimestamp = j14;
        }
        long j15 = scaleLargeTimestamp;
        if (j7 != -1 && j7 != j12) {
            StringBuilder a6 = AbstractC2933a.a("VBRI data size mismatch: ", j7, ", ");
            a6.append(j12);
            Log.w(TAG, a6.toString());
        }
        return new VbriSeeker(jArr, jArr2, j15);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.SeekMap
    public final long getDurationUs() {
        return this.durationUs;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.SeekMap
    public final SeekMap.SeekPoints getSeekPoints(long j7) {
        int binarySearchFloor = Util.binarySearchFloor(this.timesUs, j7, true, true);
        SeekPoint seekPoint = new SeekPoint(this.timesUs[binarySearchFloor], this.positions[binarySearchFloor]);
        if (seekPoint.timeUs < j7 && binarySearchFloor != this.timesUs.length - 1) {
            int i9 = binarySearchFloor + 1;
            return new SeekMap.SeekPoints(seekPoint, new SeekPoint(this.timesUs[i9], this.positions[i9]));
        }
        return new SeekMap.SeekPoints(seekPoint);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.mp3.Mp3Extractor.Seeker
    public final long getTimeUs(long j7) {
        return this.timesUs[Util.binarySearchFloor(this.positions, j7, true, true)];
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.SeekMap
    public final boolean isSeekable() {
        return true;
    }
}
