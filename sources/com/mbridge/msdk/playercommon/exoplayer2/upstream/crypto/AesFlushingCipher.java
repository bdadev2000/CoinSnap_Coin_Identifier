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

/* loaded from: classes3.dex */
public final class AesFlushingCipher {
    private final int blockSize;
    private final Cipher cipher;
    private final byte[] flushedBlock;
    private int pendingXorBytes;
    private final byte[] zerosBlock;

    public AesFlushingCipher(int i9, byte[] bArr, long j7, long j9) {
        try {
            Cipher cipher = Cipher.getInstance("AES/CTR/NoPadding");
            this.cipher = cipher;
            int blockSize = cipher.getBlockSize();
            this.blockSize = blockSize;
            this.zerosBlock = new byte[blockSize];
            this.flushedBlock = new byte[blockSize];
            long j10 = j9 / blockSize;
            int i10 = (int) (j9 % blockSize);
            cipher.init(i9, new SecretKeySpec(bArr, Util.splitAtFirst(cipher.getAlgorithm(), "/")[0]), new IvParameterSpec(getInitializationVector(j7, j10)));
            if (i10 != 0) {
                updateInPlace(new byte[i10], 0, i10);
            }
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException e4) {
            throw new RuntimeException(e4);
        }
    }

    private byte[] getInitializationVector(long j7, long j9) {
        return ByteBuffer.allocate(16).putLong(j7).putLong(j9).array();
    }

    private int nonFlushingUpdate(byte[] bArr, int i9, int i10, byte[] bArr2, int i11) {
        try {
            return this.cipher.update(bArr, i9, i10, bArr2, i11);
        } catch (ShortBufferException e4) {
            throw new RuntimeException(e4);
        }
    }

    public final void update(byte[] bArr, int i9, int i10, byte[] bArr2, int i11) {
        boolean z8;
        int i12 = i9;
        do {
            int i13 = this.pendingXorBytes;
            if (i13 > 0) {
                bArr2[i11] = (byte) (bArr[i12] ^ this.flushedBlock[this.blockSize - i13]);
                i11++;
                i12++;
                this.pendingXorBytes = i13 - 1;
                i10--;
            } else {
                int nonFlushingUpdate = nonFlushingUpdate(bArr, i12, i10, bArr2, i11);
                if (i10 == nonFlushingUpdate) {
                    return;
                }
                int i14 = i10 - nonFlushingUpdate;
                int i15 = 0;
                boolean z9 = true;
                if (i14 < this.blockSize) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                Assertions.checkState(z8);
                int i16 = i11 + nonFlushingUpdate;
                int i17 = this.blockSize - i14;
                this.pendingXorBytes = i17;
                if (nonFlushingUpdate(this.zerosBlock, 0, i17, this.flushedBlock, 0) != this.blockSize) {
                    z9 = false;
                }
                Assertions.checkState(z9);
                while (i15 < i14) {
                    bArr2[i16] = this.flushedBlock[i15];
                    i15++;
                    i16++;
                }
                return;
            }
        } while (i10 != 0);
    }

    public final void updateInPlace(byte[] bArr, int i9, int i10) {
        update(bArr, i9, i10, bArr, i9);
    }
}
