package com.google.common.hash;

import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import com.google.common.primitives.UnsignedBytes;

@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
final class FarmHashFingerprint64 extends AbstractNonStreamingHashFunction {
    static final HashFunction FARMHASH_FINGERPRINT_64 = new FarmHashFingerprint64();
    private static final long K0 = -4348849565147123417L;
    private static final long K1 = -5435081209227447693L;
    private static final long K2 = -7286425919675154353L;

    @VisibleForTesting
    public static long fingerprint(byte[] bArr, int i2, int i3) {
        return i3 <= 32 ? i3 <= 16 ? hashLength0to16(bArr, i2, i3) : hashLength17to32(bArr, i2, i3) : i3 <= 64 ? hashLength33To64(bArr, i2, i3) : hashLength65Plus(bArr, i2, i3);
    }

    private static long hashLength0to16(byte[] bArr, int i2, int i3) {
        if (i3 >= 8) {
            long j2 = (i3 * 2) + K2;
            long load64 = LittleEndianByteArray.load64(bArr, i2) + K2;
            long load642 = LittleEndianByteArray.load64(bArr, (i2 + i3) - 8);
            return hashLength16((Long.rotateRight(load642, 37) * j2) + load64, (Long.rotateRight(load64, 25) + load642) * j2, j2);
        }
        if (i3 >= 4) {
            return hashLength16(i3 + ((LittleEndianByteArray.load32(bArr, i2) & 4294967295L) << 3), LittleEndianByteArray.load32(bArr, (i2 + i3) - 4) & 4294967295L, (i3 * 2) + K2);
        }
        if (i3 <= 0) {
            return K2;
        }
        return shiftMix((((bArr[i2] & UnsignedBytes.MAX_VALUE) + ((bArr[(i3 >> 1) + i2] & UnsignedBytes.MAX_VALUE) << 8)) * K2) ^ ((i3 + ((bArr[(i3 - 1) + i2] & 255) << 2)) * K0)) * K2;
    }

    private static long hashLength16(long j2, long j3, long j4) {
        long j5 = (j2 ^ j3) * j4;
        long j6 = ((j5 ^ (j5 >>> 47)) ^ j3) * j4;
        return (j6 ^ (j6 >>> 47)) * j4;
    }

    private static long hashLength17to32(byte[] bArr, int i2, int i3) {
        long j2 = (i3 * 2) + K2;
        long load64 = LittleEndianByteArray.load64(bArr, i2) * K1;
        long load642 = LittleEndianByteArray.load64(bArr, i2 + 8);
        int i4 = i2 + i3;
        long load643 = LittleEndianByteArray.load64(bArr, i4 - 8) * j2;
        return hashLength16((LittleEndianByteArray.load64(bArr, i4 - 16) * K2) + Long.rotateRight(load643, 30) + Long.rotateRight(load64 + load642, 43), Long.rotateRight(load642 + K2, 18) + load64 + load643, j2);
    }

    private static long hashLength33To64(byte[] bArr, int i2, int i3) {
        long j2 = (i3 * 2) + K2;
        long load64 = LittleEndianByteArray.load64(bArr, i2) * K2;
        long load642 = LittleEndianByteArray.load64(bArr, i2 + 8);
        int i4 = i2 + i3;
        long load643 = LittleEndianByteArray.load64(bArr, i4 - 8) * j2;
        long rotateRight = Long.rotateRight(load643, 30) + Long.rotateRight(load64 + load642, 43) + (LittleEndianByteArray.load64(bArr, i4 - 16) * K2);
        long hashLength16 = hashLength16(rotateRight, load643 + Long.rotateRight(load642 + K2, 18) + load64, j2);
        long load644 = LittleEndianByteArray.load64(bArr, i2 + 16) * j2;
        long load645 = LittleEndianByteArray.load64(bArr, i2 + 24);
        long load646 = (rotateRight + LittleEndianByteArray.load64(bArr, i4 - 32)) * j2;
        return hashLength16(((hashLength16 + LittleEndianByteArray.load64(bArr, i4 - 24)) * j2) + Long.rotateRight(load646, 30) + Long.rotateRight(load644 + load645, 43), Long.rotateRight(load645 + load64, 18) + load644 + load646, j2);
    }

    private static long hashLength65Plus(byte[] bArr, int i2, int i3) {
        long j2 = 81;
        long j3 = (j2 * K1) + 113;
        long shiftMix = shiftMix((j3 * K2) + 113) * K2;
        long[] jArr = new long[2];
        long[] jArr2 = new long[2];
        long load64 = (j2 * K2) + LittleEndianByteArray.load64(bArr, i2);
        int i4 = i3 - 1;
        int i5 = ((i4 / 64) * 64) + i2;
        int i6 = i4 & 63;
        int i7 = i5 + i6;
        int i8 = i7 - 63;
        int i9 = i2;
        while (true) {
            long rotateRight = Long.rotateRight(load64 + j3 + jArr[0] + LittleEndianByteArray.load64(bArr, i9 + 8), 37) * K1;
            long rotateRight2 = Long.rotateRight(j3 + jArr[1] + LittleEndianByteArray.load64(bArr, i9 + 48), 42) * K1;
            long j4 = rotateRight ^ jArr2[1];
            long load642 = jArr[0] + LittleEndianByteArray.load64(bArr, i9 + 40) + rotateRight2;
            long rotateRight3 = Long.rotateRight(shiftMix + jArr2[0], 33) * K1;
            weakHashLength32WithSeeds(bArr, i9, jArr[1] * K1, j4 + jArr2[0], jArr);
            weakHashLength32WithSeeds(bArr, i9 + 32, rotateRight3 + jArr2[1], load642 + LittleEndianByteArray.load64(bArr, i9 + 16), jArr2);
            int i10 = i9 + 64;
            if (i10 == i5) {
                long j5 = K1 + ((j4 & 255) << 1);
                long j6 = jArr2[0] + i6;
                jArr2[0] = j6;
                long j7 = jArr[0] + j6;
                jArr[0] = j7;
                jArr2[0] = jArr2[0] + j7;
                long rotateRight4 = Long.rotateRight(rotateRight3 + load642 + jArr[0] + LittleEndianByteArray.load64(bArr, i7 - 55), 37) * j5;
                long rotateRight5 = Long.rotateRight(load642 + jArr[1] + LittleEndianByteArray.load64(bArr, i7 - 15), 42) * j5;
                long j8 = rotateRight4 ^ (jArr2[1] * 9);
                long load643 = (jArr[0] * 9) + LittleEndianByteArray.load64(bArr, i7 - 23) + rotateRight5;
                long rotateRight6 = Long.rotateRight(j4 + jArr2[0], 33) * j5;
                weakHashLength32WithSeeds(bArr, i8, jArr[1] * j5, j8 + jArr2[0], jArr);
                weakHashLength32WithSeeds(bArr, i7 - 31, rotateRight6 + jArr2[1], load643 + LittleEndianByteArray.load64(bArr, i7 - 47), jArr2);
                return hashLength16((shiftMix(load643) * K0) + hashLength16(jArr[0], jArr2[0], j5) + j8, hashLength16(jArr[1], jArr2[1], j5) + rotateRight6, j5);
            }
            i9 = i10;
            shiftMix = j4;
            j3 = load642;
            load64 = rotateRight3;
        }
    }

    private static long shiftMix(long j2) {
        return j2 ^ (j2 >>> 47);
    }

    private static void weakHashLength32WithSeeds(byte[] bArr, int i2, long j2, long j3, long[] jArr) {
        long load64 = LittleEndianByteArray.load64(bArr, i2);
        long load642 = LittleEndianByteArray.load64(bArr, i2 + 8);
        long load643 = LittleEndianByteArray.load64(bArr, i2 + 16);
        long load644 = LittleEndianByteArray.load64(bArr, i2 + 24);
        long j4 = j2 + load64;
        long j5 = load642 + j4 + load643;
        long rotateRight = Long.rotateRight(j5, 44) + Long.rotateRight(j3 + j4 + load644, 21);
        jArr[0] = j5 + load644;
        jArr[1] = rotateRight + j4;
    }

    @Override // com.google.common.hash.HashFunction
    public int bits() {
        return 64;
    }

    @Override // com.google.common.hash.AbstractNonStreamingHashFunction, com.google.common.hash.AbstractHashFunction, com.google.common.hash.HashFunction
    public HashCode hashBytes(byte[] bArr, int i2, int i3) {
        Preconditions.checkPositionIndexes(i2, i2 + i3, bArr.length);
        return HashCode.fromLong(fingerprint(bArr, i2, i3));
    }

    public String toString() {
        return "Hashing.farmHashFingerprint64()";
    }
}
