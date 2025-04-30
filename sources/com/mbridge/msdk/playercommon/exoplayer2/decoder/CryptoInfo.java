package com.mbridge.msdk.playercommon.exoplayer2.decoder;

import android.media.MediaCodec;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;

/* loaded from: classes3.dex */
public final class CryptoInfo {
    public int clearBlocks;
    public int encryptedBlocks;
    private final MediaCodec.CryptoInfo frameworkCryptoInfo;
    public byte[] iv;
    public byte[] key;
    public int mode;
    public int[] numBytesOfClearData;
    public int[] numBytesOfEncryptedData;
    public int numSubSamples;
    private final PatternHolderV24 patternHolder;

    /* loaded from: classes3.dex */
    public static final class PatternHolderV24 {
        private final MediaCodec.CryptoInfo frameworkCryptoInfo;
        private final MediaCodec.CryptoInfo.Pattern pattern;

        /* JADX INFO: Access modifiers changed from: private */
        public void set(int i9, int i10) {
            this.pattern.set(i9, i10);
            this.frameworkCryptoInfo.setPattern(this.pattern);
        }

        private PatternHolderV24(MediaCodec.CryptoInfo cryptoInfo) {
            this.frameworkCryptoInfo = cryptoInfo;
            this.pattern = new MediaCodec.CryptoInfo.Pattern(0, 0);
        }
    }

    public CryptoInfo() {
        MediaCodec.CryptoInfo cryptoInfo;
        int i9 = Util.SDK_INT;
        byte b = 0;
        if (i9 >= 16) {
            cryptoInfo = newFrameworkCryptoInfoV16();
        } else {
            cryptoInfo = null;
        }
        this.frameworkCryptoInfo = cryptoInfo;
        this.patternHolder = i9 >= 24 ? new PatternHolderV24(cryptoInfo) : null;
    }

    private MediaCodec.CryptoInfo newFrameworkCryptoInfoV16() {
        return new MediaCodec.CryptoInfo();
    }

    private void updateFrameworkCryptoInfoV16() {
        MediaCodec.CryptoInfo cryptoInfo = this.frameworkCryptoInfo;
        cryptoInfo.numSubSamples = this.numSubSamples;
        cryptoInfo.numBytesOfClearData = this.numBytesOfClearData;
        cryptoInfo.numBytesOfEncryptedData = this.numBytesOfEncryptedData;
        cryptoInfo.key = this.key;
        cryptoInfo.iv = this.iv;
        cryptoInfo.mode = this.mode;
        if (Util.SDK_INT >= 24) {
            this.patternHolder.set(this.encryptedBlocks, this.clearBlocks);
        }
    }

    public final MediaCodec.CryptoInfo getFrameworkCryptoInfoV16() {
        return this.frameworkCryptoInfo;
    }

    public final void set(int i9, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i10, int i11, int i12) {
        this.numSubSamples = i9;
        this.numBytesOfClearData = iArr;
        this.numBytesOfEncryptedData = iArr2;
        this.key = bArr;
        this.iv = bArr2;
        this.mode = i10;
        this.encryptedBlocks = i11;
        this.clearBlocks = i12;
        if (Util.SDK_INT >= 16) {
            updateFrameworkCryptoInfoV16();
        }
    }
}
