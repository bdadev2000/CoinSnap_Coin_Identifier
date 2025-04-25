package com.google.android.exoplayer2.extractor.ogg;

import com.google.android.exoplayer2.DefaultLoadControl;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.audio.OpusUtil;
import com.google.android.exoplayer2.extractor.ogg.StreamReader;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* loaded from: classes12.dex */
final class OpusReader extends StreamReader {
    private static final int OPUS_CODE = 1332770163;
    private static final byte[] OPUS_SIGNATURE = {79, 112, 117, 115, 72, 101, 97, 100};
    private boolean headerRead;

    public static boolean verifyBitstreamType(ParsableByteArray parsableByteArray) {
        int bytesLeft = parsableByteArray.bytesLeft();
        byte[] bArr = OPUS_SIGNATURE;
        if (bytesLeft < bArr.length) {
            return false;
        }
        byte[] bArr2 = new byte[bArr.length];
        parsableByteArray.readBytes(bArr2, 0, bArr.length);
        return Arrays.equals(bArr2, bArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.extractor.ogg.StreamReader
    public void reset(boolean z) {
        super.reset(z);
        if (z) {
            this.headerRead = false;
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ogg.StreamReader
    protected long preparePayload(ParsableByteArray parsableByteArray) {
        return convertTimeToGranule(getPacketDurationUs(parsableByteArray.getData()));
    }

    @Override // com.google.android.exoplayer2.extractor.ogg.StreamReader
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    protected boolean readHeaders(ParsableByteArray parsableByteArray, long j, StreamReader.SetupData setupData) {
        if (!this.headerRead) {
            byte[] copyOf = Arrays.copyOf(parsableByteArray.getData(), parsableByteArray.limit());
            setupData.format = new Format.Builder().setSampleMimeType(MimeTypes.AUDIO_OPUS).setChannelCount(OpusUtil.getChannelCount(copyOf)).setSampleRate(OpusUtil.SAMPLE_RATE).setInitializationData(OpusUtil.buildInitializationData(copyOf)).build();
            this.headerRead = true;
            return true;
        }
        Assertions.checkNotNull(setupData.format);
        boolean z = parsableByteArray.readInt() == 1332770163;
        parsableByteArray.setPosition(0);
        return z;
    }

    private long getPacketDurationUs(byte[] bArr) {
        int i;
        byte b = bArr[0];
        int i2 = b & 255;
        int i3 = b & 3;
        if (i3 != 0) {
            i = 2;
            if (i3 != 1 && i3 != 2) {
                i = bArr[1] & 63;
            }
        } else {
            i = 1;
        }
        int i4 = i2 >> 3;
        return i * (i4 >= 16 ? DefaultLoadControl.DEFAULT_BUFFER_FOR_PLAYBACK_MS << r0 : i4 >= 12 ? 10000 << (i4 & 1) : (i4 & 3) == 3 ? 60000 : 10000 << r0);
    }
}
