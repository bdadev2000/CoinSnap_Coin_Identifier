package com.mbridge.msdk.playercommon.exoplayer2.extractor;

import com.mbridge.msdk.playercommon.exoplayer2.Format;
import com.mbridge.msdk.playercommon.exoplayer2.util.ParsableByteArray;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes3.dex */
public interface TrackOutput {

    /* loaded from: classes3.dex */
    public static final class CryptoData {
        public final int clearBlocks;
        public final int cryptoMode;
        public final int encryptedBlocks;
        public final byte[] encryptionKey;

        public CryptoData(int i9, byte[] bArr, int i10, int i11) {
            this.cryptoMode = i9;
            this.encryptionKey = bArr;
            this.encryptedBlocks = i10;
            this.clearBlocks = i11;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || CryptoData.class != obj.getClass()) {
                return false;
            }
            CryptoData cryptoData = (CryptoData) obj;
            if (this.cryptoMode == cryptoData.cryptoMode && this.encryptedBlocks == cryptoData.encryptedBlocks && this.clearBlocks == cryptoData.clearBlocks && Arrays.equals(this.encryptionKey, cryptoData.encryptionKey)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return ((((Arrays.hashCode(this.encryptionKey) + (this.cryptoMode * 31)) * 31) + this.encryptedBlocks) * 31) + this.clearBlocks;
        }
    }

    void format(Format format);

    int sampleData(ExtractorInput extractorInput, int i9, boolean z8) throws IOException, InterruptedException;

    void sampleData(ParsableByteArray parsableByteArray, int i9);

    void sampleMetadata(long j7, int i9, int i10, int i11, CryptoData cryptoData);
}
