package com.mbridge.msdk.playercommon.exoplayer2.extractor.mp4;

import com.mbridge.msdk.playercommon.exoplayer2.Format;

/* loaded from: classes4.dex */
public final class Track {
    public static final int TRANSFORMATION_CEA608_CDAT = 1;
    public static final int TRANSFORMATION_NONE = 0;
    public final long durationUs;
    public final long[] editListDurations;
    public final long[] editListMediaTimes;
    public final Format format;

    /* renamed from: id, reason: collision with root package name */
    public final int f14728id;
    public final long movieTimescale;
    public final int nalUnitLengthFieldLength;
    private final TrackEncryptionBox[] sampleDescriptionEncryptionBoxes;
    public final int sampleTransformation;
    public final long timescale;
    public final int type;

    /* loaded from: classes4.dex */
    public @interface Transformation {
    }

    public Track(int i10, int i11, long j3, long j10, long j11, Format format, int i12, TrackEncryptionBox[] trackEncryptionBoxArr, int i13, long[] jArr, long[] jArr2) {
        this.f14728id = i10;
        this.type = i11;
        this.timescale = j3;
        this.movieTimescale = j10;
        this.durationUs = j11;
        this.format = format;
        this.sampleTransformation = i12;
        this.sampleDescriptionEncryptionBoxes = trackEncryptionBoxArr;
        this.nalUnitLengthFieldLength = i13;
        this.editListDurations = jArr;
        this.editListMediaTimes = jArr2;
    }

    public final TrackEncryptionBox getSampleDescriptionEncryptionBox(int i10) {
        TrackEncryptionBox[] trackEncryptionBoxArr = this.sampleDescriptionEncryptionBoxes;
        if (trackEncryptionBoxArr == null) {
            return null;
        }
        return trackEncryptionBoxArr[i10];
    }
}
