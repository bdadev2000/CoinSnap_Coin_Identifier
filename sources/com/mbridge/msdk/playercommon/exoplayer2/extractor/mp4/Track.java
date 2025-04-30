package com.mbridge.msdk.playercommon.exoplayer2.extractor.mp4;

import com.mbridge.msdk.playercommon.exoplayer2.Format;

/* loaded from: classes3.dex */
public final class Track {
    public static final int TRANSFORMATION_CEA608_CDAT = 1;
    public static final int TRANSFORMATION_NONE = 0;
    public final long durationUs;
    public final long[] editListDurations;
    public final long[] editListMediaTimes;
    public final Format format;
    public final int id;
    public final long movieTimescale;
    public final int nalUnitLengthFieldLength;
    private final TrackEncryptionBox[] sampleDescriptionEncryptionBoxes;
    public final int sampleTransformation;
    public final long timescale;
    public final int type;

    /* loaded from: classes3.dex */
    public @interface Transformation {
    }

    public Track(int i9, int i10, long j7, long j9, long j10, Format format, int i11, TrackEncryptionBox[] trackEncryptionBoxArr, int i12, long[] jArr, long[] jArr2) {
        this.id = i9;
        this.type = i10;
        this.timescale = j7;
        this.movieTimescale = j9;
        this.durationUs = j10;
        this.format = format;
        this.sampleTransformation = i11;
        this.sampleDescriptionEncryptionBoxes = trackEncryptionBoxArr;
        this.nalUnitLengthFieldLength = i12;
        this.editListDurations = jArr;
        this.editListMediaTimes = jArr2;
    }

    public final TrackEncryptionBox getSampleDescriptionEncryptionBox(int i9) {
        TrackEncryptionBox[] trackEncryptionBoxArr = this.sampleDescriptionEncryptionBoxes;
        if (trackEncryptionBoxArr == null) {
            return null;
        }
        return trackEncryptionBoxArr[i9];
    }
}
