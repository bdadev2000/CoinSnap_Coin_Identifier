package com.mbridge.msdk.playercommon.exoplayer2.upstream.crypto;

import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;
import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes4.dex */
public final class AesFlushingCipher {
    private final int blockSize;
    private final Cipher cipher;
    private final byte[] flushedBlock;
    private int pendingXorBytes;
    private final byte[] zerosBlock;

    public AesFlushingCipher(int i10, byte[] bArr, long j3, long j10) {
        try {
            Cipher cipher = Cipher.getInstance("AES/CTR/NoPadding");
            this.cipher = cipher;
            int blockSize = cipher.getBlockSize();
            this.blockSize = blockSize;
            this.zerosBlock = new byte[blockSize];
            this.flushedBlock = new byte[blockSize];
            long j11 = j10 / blockSize;
            int i11 = (int) (j10 % blockSize);
            cipher.init(i10, new SecretKeySpec(bArr, Util.splitAtFirst(cipher.getAlgorithm(), "/")[0]), new IvParameterSpec(getInitializationVector(j3, j11)));
            if (i11 != 0) {
                updateInPlace(new byte[i11], 0, i11);
            }
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException e2) {
            throw new RuntimeException(e2);
        }
    }

    private byte[] getInitializationVector(long j3, long j10) {
        return ByteBuffer.allocate(16).putLong(j3).putLong(j10).array();
    }

    private int nonFlushingUpdate(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) {
        try {
            return this.cipher.update(bArr, i10, i11, bArr2, i12);
        } catch (ShortBufferException e2) {
            throw new RuntimeException(e2);
        }
    }

    public final void update(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) {
        boolean z10;
        int i13 = i10;
        do {
            int i14 = this.pendingXorBytes;
            if (i14 > 0) {
                bArr2[i12] = (byte) (bArr[i13] ^ this.flushedBlock[this.blockSize - i14]);
                i12++;
                i13++;
                this.pendingXorBytes = i14 - 1;
                i11--;
            } else {
                int nonFlushingUpdate = nonFlushingUpdate(bArr, i13, i11, bArr2, i12);
                if (i11 == nonFlushingUpdate) {
                    return;
                }
                int i15 = i11 - nonFlushingUpdate;
                int i16 = 0;
                boolean z11 = true;
                if (i15 < this.blockSize) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                Assertions.checkState(z10);
                int i17 = i12 + nonFlushingUpdate;
                int i18 = this.blockSize - i15;
                this.pendingXorBytes = i18;
                if (nonFlushingUpdate(this.zerosBlock, 0, i18, this.flushedBlock, 0) != this.blockSize) {
                    z11 = false;
                }
                Assertions.checkState(z11);
                while (i16 < i15) {
                    bArr2[i17] = this.flushedBlock[i16];
                    i16++;
                    i17++;
                }
                return;
            }
        } while (i11 != 0);
    }

    public final void updateInPlace(byte[] bArr, int i10, int i11) {
        update(bArr, i10, i11, bArr, i10);
    }
}
