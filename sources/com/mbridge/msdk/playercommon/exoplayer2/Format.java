package com.mbridge.msdk.playercommon.exoplayer2;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.drm.DrmInitData;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.Metadata;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;
import com.mbridge.msdk.playercommon.exoplayer2.video.ColorInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import vd.e;

/* loaded from: classes4.dex */
public final class Format implements Parcelable {
    public static final Parcelable.Creator<Format> CREATOR = new Parcelable.Creator<Format>() { // from class: com.mbridge.msdk.playercommon.exoplayer2.Format.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Format createFromParcel(Parcel parcel) {
            return new Format(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Format[] newArray(int i10) {
            return new Format[i10];
        }
    };
    public static final int NO_VALUE = -1;
    public static final long OFFSET_SAMPLE_RELATIVE = Long.MAX_VALUE;
    public final int accessibilityChannel;
    public final int bitrate;
    public final int channelCount;
    public final String codecs;
    public final ColorInfo colorInfo;
    public final String containerMimeType;
    public final DrmInitData drmInitData;
    public final int encoderDelay;
    public final int encoderPadding;
    public final float frameRate;
    private int hashCode;
    public final int height;

    /* renamed from: id, reason: collision with root package name */
    public final String f14724id;
    public final List<byte[]> initializationData;
    public final String language;
    public final int maxInputSize;
    public final Metadata metadata;
    public final int pcmEncoding;
    public final float pixelWidthHeightRatio;
    public final byte[] projectionData;
    public final int rotationDegrees;
    public final String sampleMimeType;
    public final int sampleRate;
    public final int selectionFlags;
    public final int stereoMode;
    public final long subsampleOffsetUs;
    public final int width;

    public Format(String str, String str2, String str3, String str4, int i10, int i11, int i12, int i13, float f10, int i14, float f11, byte[] bArr, int i15, ColorInfo colorInfo, int i16, int i17, int i18, int i19, int i20, int i21, String str5, int i22, long j3, List<byte[]> list, DrmInitData drmInitData, Metadata metadata) {
        this.f14724id = str;
        this.containerMimeType = str2;
        this.sampleMimeType = str3;
        this.codecs = str4;
        this.bitrate = i10;
        this.maxInputSize = i11;
        this.width = i12;
        this.height = i13;
        this.frameRate = f10;
        int i23 = i14;
        this.rotationDegrees = i23 == -1 ? 0 : i23;
        this.pixelWidthHeightRatio = f11 == -1.0f ? 1.0f : f11;
        this.projectionData = bArr;
        this.stereoMode = i15;
        this.colorInfo = colorInfo;
        this.channelCount = i16;
        this.sampleRate = i17;
        this.pcmEncoding = i18;
        int i24 = i19;
        this.encoderDelay = i24 == -1 ? 0 : i24;
        this.encoderPadding = i20 != -1 ? i20 : 0;
        this.selectionFlags = i21;
        this.language = str5;
        this.accessibilityChannel = i22;
        this.subsampleOffsetUs = j3;
        this.initializationData = list == null ? Collections.emptyList() : list;
        this.drmInitData = drmInitData;
        this.metadata = metadata;
    }

    public static Format createAudioContainerFormat(String str, String str2, String str3, String str4, int i10, int i11, int i12, List<byte[]> list, int i13, String str5) {
        return new Format(str, str2, str3, str4, i10, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, i11, i12, -1, -1, -1, i13, str5, -1, Long.MAX_VALUE, list, null, null);
    }

    public static Format createAudioSampleFormat(String str, String str2, String str3, int i10, int i11, int i12, int i13, List<byte[]> list, DrmInitData drmInitData, int i14, String str4) {
        return createAudioSampleFormat(str, str2, str3, i10, i11, i12, i13, -1, list, drmInitData, i14, str4);
    }

    public static Format createContainerFormat(String str, String str2, String str3, String str4, int i10, int i11, String str5) {
        return new Format(str, str2, str3, str4, i10, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, i11, str5, -1, Long.MAX_VALUE, null, null, null);
    }

    public static Format createImageSampleFormat(String str, String str2, String str3, int i10, int i11, List<byte[]> list, String str4, DrmInitData drmInitData) {
        return new Format(str, null, str2, str3, i10, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, i11, str4, -1, Long.MAX_VALUE, list, drmInitData, null);
    }

    public static Format createSampleFormat(String str, String str2, long j3) {
        return new Format(str, null, str2, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, null, -1, j3, null, null, null);
    }

    public static Format createTextContainerFormat(String str, String str2, String str3, String str4, int i10, int i11, String str5) {
        return createTextContainerFormat(str, str2, str3, str4, i10, i11, str5, -1);
    }

    public static Format createTextSampleFormat(String str, String str2, int i10, String str3) {
        return createTextSampleFormat(str, str2, i10, str3, null);
    }

    public static Format createVideoContainerFormat(String str, String str2, String str3, String str4, int i10, int i11, int i12, float f10, List<byte[]> list, int i13) {
        return new Format(str, str2, str3, str4, i10, -1, i11, i12, f10, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, i13, null, -1, Long.MAX_VALUE, list, null, null);
    }

    public static Format createVideoSampleFormat(String str, String str2, String str3, int i10, int i11, int i12, int i13, float f10, List<byte[]> list, DrmInitData drmInitData) {
        return createVideoSampleFormat(str, str2, str3, i10, i11, i12, i13, f10, list, -1, -1.0f, drmInitData);
    }

    public static String toLogString(Format format) {
        if (format == null) {
            return AbstractJsonLexerKt.NULL;
        }
        StringBuilder sb2 = new StringBuilder("id=");
        sb2.append(format.f14724id);
        sb2.append(", mimeType=");
        sb2.append(format.sampleMimeType);
        if (format.bitrate != -1) {
            sb2.append(", bitrate=");
            sb2.append(format.bitrate);
        }
        if (format.width != -1 && format.height != -1) {
            sb2.append(", res=");
            sb2.append(format.width);
            sb2.append("x");
            sb2.append(format.height);
        }
        if (format.frameRate != -1.0f) {
            sb2.append(", fps=");
            sb2.append(format.frameRate);
        }
        if (format.channelCount != -1) {
            sb2.append(", channels=");
            sb2.append(format.channelCount);
        }
        if (format.sampleRate != -1) {
            sb2.append(", sample_rate=");
            sb2.append(format.sampleRate);
        }
        if (format.language != null) {
            sb2.append(", language=");
            sb2.append(format.language);
        }
        return sb2.toString();
    }

    public final Format copyWithContainerInfo(String str, String str2, String str3, int i10, int i11, int i12, int i13, String str4) {
        return new Format(str, this.containerMimeType, str2, str3, i10, this.maxInputSize, i11, i12, this.frameRate, this.rotationDegrees, this.pixelWidthHeightRatio, this.projectionData, this.stereoMode, this.colorInfo, this.channelCount, this.sampleRate, this.pcmEncoding, this.encoderDelay, this.encoderPadding, i13, str4, this.accessibilityChannel, this.subsampleOffsetUs, this.initializationData, this.drmInitData, this.metadata);
    }

    public final Format copyWithDrmInitData(DrmInitData drmInitData) {
        return new Format(this.f14724id, this.containerMimeType, this.sampleMimeType, this.codecs, this.bitrate, this.maxInputSize, this.width, this.height, this.frameRate, this.rotationDegrees, this.pixelWidthHeightRatio, this.projectionData, this.stereoMode, this.colorInfo, this.channelCount, this.sampleRate, this.pcmEncoding, this.encoderDelay, this.encoderPadding, this.selectionFlags, this.language, this.accessibilityChannel, this.subsampleOffsetUs, this.initializationData, drmInitData, this.metadata);
    }

    public final Format copyWithGaplessInfo(int i10, int i11) {
        return new Format(this.f14724id, this.containerMimeType, this.sampleMimeType, this.codecs, this.bitrate, this.maxInputSize, this.width, this.height, this.frameRate, this.rotationDegrees, this.pixelWidthHeightRatio, this.projectionData, this.stereoMode, this.colorInfo, this.channelCount, this.sampleRate, this.pcmEncoding, i10, i11, this.selectionFlags, this.language, this.accessibilityChannel, this.subsampleOffsetUs, this.initializationData, this.drmInitData, this.metadata);
    }

    public final Format copyWithManifestFormatInfo(Format format) {
        if (this == format) {
            return this;
        }
        String str = format.f14724id;
        String str2 = this.codecs;
        if (str2 == null) {
            str2 = format.codecs;
        }
        String str3 = str2;
        int i10 = this.bitrate;
        if (i10 == -1) {
            i10 = format.bitrate;
        }
        int i11 = i10;
        float f10 = this.frameRate;
        if (f10 == -1.0f) {
            f10 = format.frameRate;
        }
        float f11 = f10;
        int i12 = this.selectionFlags | format.selectionFlags;
        String str4 = this.language;
        if (str4 == null) {
            str4 = format.language;
        }
        return new Format(str, this.containerMimeType, this.sampleMimeType, str3, i11, this.maxInputSize, this.width, this.height, f11, this.rotationDegrees, this.pixelWidthHeightRatio, this.projectionData, this.stereoMode, this.colorInfo, this.channelCount, this.sampleRate, this.pcmEncoding, this.encoderDelay, this.encoderPadding, i12, str4, this.accessibilityChannel, this.subsampleOffsetUs, this.initializationData, DrmInitData.createSessionCreationData(format.drmInitData, this.drmInitData), this.metadata);
    }

    public final Format copyWithMaxInputSize(int i10) {
        return new Format(this.f14724id, this.containerMimeType, this.sampleMimeType, this.codecs, this.bitrate, i10, this.width, this.height, this.frameRate, this.rotationDegrees, this.pixelWidthHeightRatio, this.projectionData, this.stereoMode, this.colorInfo, this.channelCount, this.sampleRate, this.pcmEncoding, this.encoderDelay, this.encoderPadding, this.selectionFlags, this.language, this.accessibilityChannel, this.subsampleOffsetUs, this.initializationData, this.drmInitData, this.metadata);
    }

    public final Format copyWithMetadata(Metadata metadata) {
        return new Format(this.f14724id, this.containerMimeType, this.sampleMimeType, this.codecs, this.bitrate, this.maxInputSize, this.width, this.height, this.frameRate, this.rotationDegrees, this.pixelWidthHeightRatio, this.projectionData, this.stereoMode, this.colorInfo, this.channelCount, this.sampleRate, this.pcmEncoding, this.encoderDelay, this.encoderPadding, this.selectionFlags, this.language, this.accessibilityChannel, this.subsampleOffsetUs, this.initializationData, this.drmInitData, metadata);
    }

    public final Format copyWithRotationDegrees(int i10) {
        return new Format(this.f14724id, this.containerMimeType, this.sampleMimeType, this.codecs, this.bitrate, this.maxInputSize, this.width, this.height, this.frameRate, i10, this.pixelWidthHeightRatio, this.projectionData, this.stereoMode, this.colorInfo, this.channelCount, this.sampleRate, this.pcmEncoding, this.encoderDelay, this.encoderPadding, this.selectionFlags, this.language, this.accessibilityChannel, this.subsampleOffsetUs, this.initializationData, this.drmInitData, this.metadata);
    }

    public final Format copyWithSubsampleOffsetUs(long j3) {
        return new Format(this.f14724id, this.containerMimeType, this.sampleMimeType, this.codecs, this.bitrate, this.maxInputSize, this.width, this.height, this.frameRate, this.rotationDegrees, this.pixelWidthHeightRatio, this.projectionData, this.stereoMode, this.colorInfo, this.channelCount, this.sampleRate, this.pcmEncoding, this.encoderDelay, this.encoderPadding, this.selectionFlags, this.language, this.accessibilityChannel, j3, this.initializationData, this.drmInitData, this.metadata);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Format.class != obj.getClass()) {
            return false;
        }
        Format format = (Format) obj;
        if (this.bitrate == format.bitrate && this.maxInputSize == format.maxInputSize && this.width == format.width && this.height == format.height && this.frameRate == format.frameRate && this.rotationDegrees == format.rotationDegrees && this.pixelWidthHeightRatio == format.pixelWidthHeightRatio && this.stereoMode == format.stereoMode && this.channelCount == format.channelCount && this.sampleRate == format.sampleRate && this.pcmEncoding == format.pcmEncoding && this.encoderDelay == format.encoderDelay && this.encoderPadding == format.encoderPadding && this.subsampleOffsetUs == format.subsampleOffsetUs && this.selectionFlags == format.selectionFlags && Util.areEqual(this.f14724id, format.f14724id) && Util.areEqual(this.language, format.language) && this.accessibilityChannel == format.accessibilityChannel && Util.areEqual(this.containerMimeType, format.containerMimeType) && Util.areEqual(this.sampleMimeType, format.sampleMimeType) && Util.areEqual(this.codecs, format.codecs) && Util.areEqual(this.drmInitData, format.drmInitData) && Util.areEqual(this.metadata, format.metadata) && Util.areEqual(this.colorInfo, format.colorInfo) && Arrays.equals(this.projectionData, format.projectionData) && initializationDataEquals(format)) {
            return true;
        }
        return false;
    }

    public final int getPixelCount() {
        int i10;
        int i11 = this.width;
        if (i11 == -1 || (i10 = this.height) == -1) {
            return -1;
        }
        return i11 * i10;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        if (this.hashCode == 0) {
            String str = this.f14724id;
            int i10 = 0;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i11 = (527 + hashCode) * 31;
            String str2 = this.containerMimeType;
            if (str2 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str2.hashCode();
            }
            int i12 = (i11 + hashCode2) * 31;
            String str3 = this.sampleMimeType;
            if (str3 == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = str3.hashCode();
            }
            int i13 = (i12 + hashCode3) * 31;
            String str4 = this.codecs;
            if (str4 == null) {
                hashCode4 = 0;
            } else {
                hashCode4 = str4.hashCode();
            }
            int i14 = (((((((((((i13 + hashCode4) * 31) + this.bitrate) * 31) + this.width) * 31) + this.height) * 31) + this.channelCount) * 31) + this.sampleRate) * 31;
            String str5 = this.language;
            if (str5 == null) {
                hashCode5 = 0;
            } else {
                hashCode5 = str5.hashCode();
            }
            int i15 = (((i14 + hashCode5) * 31) + this.accessibilityChannel) * 31;
            DrmInitData drmInitData = this.drmInitData;
            if (drmInitData == null) {
                hashCode6 = 0;
            } else {
                hashCode6 = drmInitData.hashCode();
            }
            int i16 = (i15 + hashCode6) * 31;
            Metadata metadata = this.metadata;
            if (metadata != null) {
                i10 = metadata.hashCode();
            }
            this.hashCode = i16 + i10;
        }
        return this.hashCode;
    }

    public final boolean initializationDataEquals(Format format) {
        if (this.initializationData.size() != format.initializationData.size()) {
            return false;
        }
        for (int i10 = 0; i10 < this.initializationData.size(); i10++) {
            if (!Arrays.equals(this.initializationData.get(i10), format.initializationData.get(i10))) {
                return false;
            }
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Format(");
        sb2.append(this.f14724id);
        sb2.append(", ");
        sb2.append(this.containerMimeType);
        sb2.append(", ");
        sb2.append(this.sampleMimeType);
        sb2.append(", ");
        sb2.append(this.bitrate);
        sb2.append(", ");
        sb2.append(this.language);
        sb2.append(", [");
        sb2.append(this.width);
        sb2.append(", ");
        sb2.append(this.height);
        sb2.append(", ");
        sb2.append(this.frameRate);
        sb2.append("], [");
        sb2.append(this.channelCount);
        sb2.append(", ");
        return e.g(sb2, this.sampleRate, "])");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        boolean z10;
        parcel.writeString(this.f14724id);
        parcel.writeString(this.containerMimeType);
        parcel.writeString(this.sampleMimeType);
        parcel.writeString(this.codecs);
        parcel.writeInt(this.bitrate);
        parcel.writeInt(this.maxInputSize);
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
        parcel.writeFloat(this.frameRate);
        parcel.writeInt(this.rotationDegrees);
        parcel.writeFloat(this.pixelWidthHeightRatio);
        if (this.projectionData != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        Util.writeBoolean(parcel, z10);
        byte[] bArr = this.projectionData;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
        parcel.writeInt(this.stereoMode);
        parcel.writeParcelable(this.colorInfo, i10);
        parcel.writeInt(this.channelCount);
        parcel.writeInt(this.sampleRate);
        parcel.writeInt(this.pcmEncoding);
        parcel.writeInt(this.encoderDelay);
        parcel.writeInt(this.encoderPadding);
        parcel.writeInt(this.selectionFlags);
        parcel.writeString(this.language);
        parcel.writeInt(this.accessibilityChannel);
        parcel.writeLong(this.subsampleOffsetUs);
        int size = this.initializationData.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            parcel.writeByteArray(this.initializationData.get(i11));
        }
        parcel.writeParcelable(this.drmInitData, 0);
        parcel.writeParcelable(this.metadata, 0);
    }

    public static Format createAudioSampleFormat(String str, String str2, String str3, int i10, int i11, int i12, int i13, int i14, List<byte[]> list, DrmInitData drmInitData, int i15, String str4) {
        return createAudioSampleFormat(str, str2, str3, i10, i11, i12, i13, i14, -1, -1, list, drmInitData, i15, str4, null);
    }

    public static Format createSampleFormat(String str, String str2, String str3, int i10, DrmInitData drmInitData) {
        return new Format(str, null, str2, str3, i10, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, null, -1, Long.MAX_VALUE, null, drmInitData, null);
    }

    public static Format createTextContainerFormat(String str, String str2, String str3, String str4, int i10, int i11, String str5, int i12) {
        return new Format(str, str2, str3, str4, i10, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, i11, str5, i12, Long.MAX_VALUE, null, null, null);
    }

    public static Format createTextSampleFormat(String str, String str2, int i10, String str3, DrmInitData drmInitData) {
        return createTextSampleFormat(str, str2, null, -1, i10, str3, -1, drmInitData, Long.MAX_VALUE, Collections.emptyList());
    }

    public static Format createVideoSampleFormat(String str, String str2, String str3, int i10, int i11, int i12, int i13, float f10, List<byte[]> list, int i14, float f11, DrmInitData drmInitData) {
        return createVideoSampleFormat(str, str2, str3, i10, i11, i12, i13, f10, list, i14, f11, null, -1, null, drmInitData);
    }

    public static Format createAudioSampleFormat(String str, String str2, String str3, int i10, int i11, int i12, int i13, int i14, int i15, int i16, List<byte[]> list, DrmInitData drmInitData, int i17, String str4, Metadata metadata) {
        return new Format(str, null, str2, str3, i10, i11, -1, -1, -1.0f, -1, -1.0f, null, -1, null, i12, i13, i14, i15, i16, i17, str4, -1, Long.MAX_VALUE, list, drmInitData, metadata);
    }

    public static Format createVideoSampleFormat(String str, String str2, String str3, int i10, int i11, int i12, int i13, float f10, List<byte[]> list, int i14, float f11, byte[] bArr, int i15, ColorInfo colorInfo, DrmInitData drmInitData) {
        return new Format(str, null, str2, str3, i10, i11, i12, i13, f10, i14, f11, bArr, i15, colorInfo, -1, -1, -1, -1, -1, 0, null, -1, Long.MAX_VALUE, list, drmInitData, null);
    }

    public static Format createTextSampleFormat(String str, String str2, String str3, int i10, int i11, String str4, int i12, DrmInitData drmInitData) {
        return createTextSampleFormat(str, str2, str3, i10, i11, str4, i12, drmInitData, Long.MAX_VALUE, Collections.emptyList());
    }

    public static Format createTextSampleFormat(String str, String str2, String str3, int i10, int i11, String str4, DrmInitData drmInitData, long j3) {
        return createTextSampleFormat(str, str2, str3, i10, i11, str4, -1, drmInitData, j3, Collections.emptyList());
    }

    public static Format createTextSampleFormat(String str, String str2, String str3, int i10, int i11, String str4, int i12, DrmInitData drmInitData, long j3, List<byte[]> list) {
        return new Format(str, null, str2, str3, i10, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, i11, str4, i12, j3, list, drmInitData, null);
    }

    public Format(Parcel parcel) {
        this.f14724id = parcel.readString();
        this.containerMimeType = parcel.readString();
        this.sampleMimeType = parcel.readString();
        this.codecs = parcel.readString();
        this.bitrate = parcel.readInt();
        this.maxInputSize = parcel.readInt();
        this.width = parcel.readInt();
        this.height = parcel.readInt();
        this.frameRate = parcel.readFloat();
        this.rotationDegrees = parcel.readInt();
        this.pixelWidthHeightRatio = parcel.readFloat();
        this.projectionData = Util.readBoolean(parcel) ? parcel.createByteArray() : null;
        this.stereoMode = parcel.readInt();
        this.colorInfo = (ColorInfo) parcel.readParcelable(ColorInfo.class.getClassLoader());
        this.channelCount = parcel.readInt();
        this.sampleRate = parcel.readInt();
        this.pcmEncoding = parcel.readInt();
        this.encoderDelay = parcel.readInt();
        this.encoderPadding = parcel.readInt();
        this.selectionFlags = parcel.readInt();
        this.language = parcel.readString();
        this.accessibilityChannel = parcel.readInt();
        this.subsampleOffsetUs = parcel.readLong();
        int readInt = parcel.readInt();
        this.initializationData = new ArrayList(readInt);
        for (int i10 = 0; i10 < readInt; i10++) {
            this.initializationData.add(parcel.createByteArray());
        }
        this.drmInitData = (DrmInitData) parcel.readParcelable(DrmInitData.class.getClassLoader());
        this.metadata = (Metadata) parcel.readParcelable(Metadata.class.getClassLoader());
    }
}
