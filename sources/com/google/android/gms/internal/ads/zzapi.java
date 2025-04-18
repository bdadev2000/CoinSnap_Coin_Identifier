package com.google.android.gms.internal.ads;

import android.support.v4.media.d;
import android.util.Pair;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.security.DigestException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzapi {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [int] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.io.RandomAccessFile] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.RandomAccessFile] */
    /* JADX WARN: Type inference failed for: r2v32 */
    public static X509Certificate[][] zza(String str) throws zzapf, SecurityException, IOException {
        ?? r2;
        String str2 = "end > capacity: ";
        RandomAccessFile randomAccessFile = new RandomAccessFile(str, "r");
        try {
            Pair zzc = zzapj.zzc(randomAccessFile);
            try {
                if (zzc == null) {
                    throw new zzapf("Not an APK file: ZIP End of Central Directory record not found in file with " + randomAccessFile.length() + " bytes");
                }
                ByteBuffer byteBuffer = (ByteBuffer) zzc.first;
                long longValue = ((Long) zzc.second).longValue();
                long j2 = (-20) + longValue;
                if (j2 >= 0) {
                    randomAccessFile.seek(j2);
                    if (randomAccessFile.readInt() == 1347094023) {
                        throw new zzapf("ZIP64 APK not supported");
                    }
                }
                long zza = zzapj.zza(byteBuffer);
                if (zza >= longValue) {
                    throw new zzapf("ZIP Central Directory offset out of range: " + zza + ". ZIP End of Central Directory offset: " + longValue);
                }
                if (zza + zzapj.zzb(byteBuffer) != longValue) {
                    throw new zzapf("ZIP Central Directory is not immediately followed by End of Central Directory");
                }
                if (zza < 32) {
                    throw new zzapf("APK too small for APK Signing Block. ZIP Central Directory offset: " + zza);
                }
                ByteBuffer allocate = ByteBuffer.allocate(24);
                ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                allocate.order(byteOrder);
                long j3 = longValue;
                randomAccessFile.seek(zza - allocate.capacity());
                randomAccessFile.readFully(allocate.array(), allocate.arrayOffset(), allocate.capacity());
                if (allocate.getLong(8) != 2334950737559900225L || allocate.getLong(16) != 3617552046287187010L) {
                    throw new zzapf("No APK Signing Block before ZIP Central Directory");
                }
                long j4 = allocate.getLong(0);
                if (j4 < allocate.capacity() || j4 > 2147483639) {
                    throw new zzapf("APK Signing Block size out of range: " + j4);
                }
                int i2 = (int) (8 + j4);
                long j5 = zza - i2;
                ?? r1 = (j5 > 0L ? 1 : (j5 == 0L ? 0 : -1));
                try {
                    if (r1 < 0) {
                        throw new zzapf("APK Signing Block offset out of range: " + j5);
                    }
                    try {
                        ByteBuffer allocate2 = ByteBuffer.allocate(i2);
                        allocate2.order(byteOrder);
                        r1 = randomAccessFile;
                        r1.seek(j5);
                        r1.readFully(allocate2.array(), allocate2.arrayOffset(), allocate2.capacity());
                        long j6 = zza;
                        long j7 = allocate2.getLong(0);
                        if (j7 != j4) {
                            throw new zzapf("APK Signing Block sizes in header and footer do not match: " + j7 + " vs " + j4);
                        }
                        Pair create = Pair.create(allocate2, Long.valueOf(j5));
                        ByteBuffer byteBuffer2 = (ByteBuffer) create.first;
                        long longValue2 = ((Long) create.second).longValue();
                        if (byteBuffer2.order() != byteOrder) {
                            throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
                        }
                        int capacity = byteBuffer2.capacity() - 24;
                        if (capacity < 8) {
                            throw new IllegalArgumentException("end < start: " + capacity + " < 8");
                        }
                        int capacity2 = byteBuffer2.capacity();
                        if (capacity > byteBuffer2.capacity()) {
                            throw new IllegalArgumentException("end > capacity: " + capacity + " > " + capacity2);
                        }
                        int limit = byteBuffer2.limit();
                        int position = byteBuffer2.position();
                        try {
                            byteBuffer2.position(0);
                            byteBuffer2.limit(capacity);
                            byteBuffer2.position(8);
                            ByteBuffer slice = byteBuffer2.slice();
                            slice.order(byteBuffer2.order());
                            byteBuffer2.position(0);
                            byteBuffer2.limit(limit);
                            byteBuffer2.position(position);
                            int i3 = 0;
                            while (slice.hasRemaining()) {
                                i3++;
                                if (slice.remaining() < 8) {
                                    throw new zzapf("Insufficient data to read size of APK Signing Block entry #" + i3);
                                }
                                long j8 = slice.getLong();
                                if (j8 < 4 || j8 > 2147483647L) {
                                    throw new zzapf("APK Signing Block entry #" + i3 + " size out of range: " + j8);
                                }
                                int i4 = (int) j8;
                                int position2 = slice.position() + i4;
                                if (i4 > slice.remaining()) {
                                    throw new zzapf("APK Signing Block entry #" + i3 + " size out of range: " + i4 + ", available: " + slice.remaining());
                                }
                                if (slice.getInt() == 1896449818) {
                                    X509Certificate[][] zzl = zzl(r1.getChannel(), new zzape(zze(slice, i4 - 4), longValue2, j6, j3, byteBuffer, null));
                                    r1.close();
                                    try {
                                        r1.close();
                                    } catch (IOException unused) {
                                    }
                                    return zzl;
                                }
                                long j9 = j3;
                                long j10 = j6;
                                slice.position(position2);
                                j6 = j10;
                                j3 = j9;
                            }
                            throw new zzapf("No APK Signature Scheme v2 block in APK Signing Block");
                        } catch (Throwable th) {
                            byteBuffer2.position(0);
                            byteBuffer2.limit(limit);
                            byteBuffer2.position(position);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        r1 = randomAccessFile;
                        r2 = r1;
                        try {
                            r2.close();
                        } catch (IOException unused2) {
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Throwable th4) {
                th = th4;
                r2 = str2;
            }
        } catch (Throwable th5) {
            th = th5;
            r2 = randomAccessFile;
        }
    }

    private static int zzb(int i2) {
        if (i2 == 1) {
            return 32;
        }
        if (i2 == 2) {
            return 64;
        }
        throw new IllegalArgumentException(d.i("Unknown content digest algorthm: ", i2));
    }

    private static int zzc(int i2) {
        if (i2 == 513) {
            return 1;
        }
        if (i2 == 514) {
            return 2;
        }
        if (i2 == 769) {
            return 1;
        }
        switch (i2) {
            case 257:
            case 259:
                return 1;
            case 258:
            case 260:
                return 2;
            default:
                throw new IllegalArgumentException("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i2))));
        }
    }

    private static String zzd(int i2) {
        if (i2 == 1) {
            return "SHA-256";
        }
        if (i2 == 2) {
            return "SHA-512";
        }
        throw new IllegalArgumentException(d.i("Unknown content digest algorthm: ", i2));
    }

    private static ByteBuffer zze(ByteBuffer byteBuffer, int i2) throws BufferUnderflowException {
        int limit = byteBuffer.limit();
        int position = byteBuffer.position();
        int i3 = i2 + position;
        if (i3 < position || i3 > limit) {
            throw new BufferUnderflowException();
        }
        byteBuffer.limit(i3);
        try {
            ByteBuffer slice = byteBuffer.slice();
            slice.order(byteBuffer.order());
            byteBuffer.position(i3);
            return slice;
        } finally {
            byteBuffer.limit(limit);
        }
    }

    private static ByteBuffer zzf(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer.remaining() < 4) {
            throw new IOException(d.i("Remaining buffer too short to contain length of length-prefixed field. Remaining: ", byteBuffer.remaining()));
        }
        int i2 = byteBuffer.getInt();
        if (i2 < 0) {
            throw new IllegalArgumentException("Negative length");
        }
        if (i2 <= byteBuffer.remaining()) {
            return zze(byteBuffer, i2);
        }
        throw new IOException(d.k("Length-prefixed field longer than remaining buffer. Field length: ", i2, ", remaining: ", byteBuffer.remaining()));
    }

    private static void zzg(int i2, byte[] bArr, int i3) {
        bArr[1] = (byte) (i2 & 255);
        bArr[2] = (byte) ((i2 >>> 8) & 255);
        bArr[3] = (byte) ((i2 >>> 16) & 255);
        bArr[4] = (byte) (i2 >> 24);
    }

    private static void zzh(Map map, FileChannel fileChannel, long j2, long j3, long j4, ByteBuffer byteBuffer) throws SecurityException {
        if (map.isEmpty()) {
            throw new SecurityException("No digests provided");
        }
        zzapc zzapcVar = new zzapc(fileChannel, 0L, j2);
        zzapc zzapcVar2 = new zzapc(fileChannel, j3, j4 - j3);
        ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.order(ByteOrder.LITTLE_ENDIAN);
        zzapj.zzd(duplicate, j2);
        zzapa zzapaVar = new zzapa(duplicate);
        int size = map.size();
        int[] iArr = new int[size];
        Iterator it = map.keySet().iterator();
        int i2 = 0;
        while (it.hasNext()) {
            iArr[i2] = ((Integer) it.next()).intValue();
            i2++;
        }
        try {
            byte[][] zzk = zzk(iArr, new zzapb[]{zzapcVar, zzapcVar2, zzapaVar});
            for (int i3 = 0; i3 < size; i3++) {
                int i4 = iArr[i3];
                if (!MessageDigest.isEqual((byte[]) map.get(Integer.valueOf(i4)), zzk[i3])) {
                    throw new SecurityException(zzd(i4).concat(" digest of contents did not verify"));
                }
            }
        } catch (DigestException e) {
            throw new SecurityException("Failed to compute digest(s) of contents", e);
        }
    }

    private static byte[] zzi(ByteBuffer byteBuffer) throws IOException {
        int i2 = byteBuffer.getInt();
        if (i2 < 0) {
            throw new IOException("Negative length");
        }
        if (i2 > byteBuffer.remaining()) {
            throw new IOException(d.k("Underflow while reading length-prefixed value. Length: ", i2, ", available: ", byteBuffer.remaining()));
        }
        byte[] bArr = new byte[i2];
        byteBuffer.get(bArr);
        return bArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0048, code lost:
    
        r11 = zzc(r6);
        r12 = zzc(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0050, code lost:
    
        if (r11 == 1) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0052, code lost:
    
        if (r12 == 1) goto L141;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.security.cert.X509Certificate[] zzj(java.nio.ByteBuffer r22, java.util.Map r23, java.security.cert.CertificateFactory r24) throws java.lang.SecurityException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 646
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzapi.zzj(java.nio.ByteBuffer, java.util.Map, java.security.cert.CertificateFactory):java.security.cert.X509Certificate[]");
    }

    private static byte[][] zzk(int[] iArr, zzapb[] zzapbVarArr) throws DigestException {
        long j2;
        int i2;
        int length;
        int i3 = 0;
        long j3 = 0;
        int i4 = 0;
        long j4 = 0;
        while (true) {
            j2 = 1048576;
            if (i4 >= 3) {
                break;
            }
            j4 += (zzapbVarArr[i4].zza() + 1048575) / 1048576;
            i4++;
        }
        if (j4 >= 2097151) {
            throw new DigestException(d.m("Too many chunks: ", j4));
        }
        byte[][] bArr = new byte[iArr.length];
        int i5 = 0;
        while (true) {
            length = iArr.length;
            if (i5 >= length) {
                break;
            }
            int i6 = (int) j4;
            byte[] bArr2 = new byte[(zzb(iArr[i5]) * i6) + 5];
            bArr2[0] = 90;
            zzg(i6, bArr2, 1);
            bArr[i5] = bArr2;
            i5++;
        }
        byte[] bArr3 = new byte[5];
        bArr3[0] = -91;
        MessageDigest[] messageDigestArr = new MessageDigest[length];
        for (int i7 = 0; i7 < iArr.length; i7++) {
            String zzd = zzd(iArr[i7]);
            try {
                messageDigestArr[i7] = MessageDigest.getInstance(zzd);
            } catch (NoSuchAlgorithmException e) {
                throw new RuntimeException(zzd.concat(" digest not supported"), e);
            }
        }
        int i8 = 0;
        int i9 = 0;
        for (i2 = 3; i8 < i2; i2 = 3) {
            zzapb zzapbVar = zzapbVarArr[i8];
            long j5 = j3;
            long zza = zzapbVar.zza();
            while (zza > j3) {
                int min = (int) Math.min(zza, j2);
                zzg(min, bArr3, 1);
                for (int i10 = 0; i10 < length; i10++) {
                    messageDigestArr[i10].update(bArr3);
                }
                long j6 = j5;
                try {
                    zzapbVar.zzb(messageDigestArr, j6, min);
                    byte[] bArr4 = bArr3;
                    int i11 = 0;
                    while (i11 < iArr.length) {
                        int i12 = iArr[i11];
                        zzapb zzapbVar2 = zzapbVar;
                        byte[] bArr5 = bArr[i11];
                        int zzb = zzb(i12);
                        int i13 = length;
                        MessageDigest messageDigest = messageDigestArr[i11];
                        MessageDigest[] messageDigestArr2 = messageDigestArr;
                        int digest = messageDigest.digest(bArr5, (i9 * zzb) + 5, zzb);
                        if (digest != zzb) {
                            throw new RuntimeException("Unexpected output size of " + messageDigest.getAlgorithm() + " digest: " + digest);
                        }
                        i11++;
                        zzapbVar = zzapbVar2;
                        length = i13;
                        messageDigestArr = messageDigestArr2;
                    }
                    long j7 = min;
                    long j8 = j6 + j7;
                    zza -= j7;
                    i9++;
                    j3 = 0;
                    j2 = 1048576;
                    bArr3 = bArr4;
                    j5 = j8;
                    messageDigestArr = messageDigestArr;
                } catch (IOException e2) {
                    throw new DigestException(d.k("Failed to digest chunk #", i9, " of section #", i3), e2);
                }
            }
            i3++;
            i8++;
            j3 = 0;
            j2 = 1048576;
        }
        byte[][] bArr6 = new byte[iArr.length];
        for (int i14 = 0; i14 < iArr.length; i14++) {
            int i15 = iArr[i14];
            byte[] bArr7 = bArr[i14];
            String zzd2 = zzd(i15);
            try {
                bArr6[i14] = MessageDigest.getInstance(zzd2).digest(bArr7);
            } catch (NoSuchAlgorithmException e3) {
                throw new RuntimeException(zzd2.concat(" digest not supported"), e3);
            }
        }
        return bArr6;
    }

    private static X509Certificate[][] zzl(FileChannel fileChannel, zzape zzapeVar) throws SecurityException {
        ByteBuffer byteBuffer;
        long j2;
        long j3;
        long j4;
        ByteBuffer byteBuffer2;
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            try {
                byteBuffer = zzapeVar.zza;
                ByteBuffer zzf = zzf(byteBuffer);
                int i2 = 0;
                while (zzf.hasRemaining()) {
                    i2++;
                    try {
                        arrayList.add(zzj(zzf(zzf), hashMap, certificateFactory));
                    } catch (IOException | SecurityException | BufferUnderflowException e) {
                        throw new SecurityException(d.j("Failed to parse/verify signer #", i2, " block"), e);
                    }
                }
                if (i2 <= 0) {
                    throw new SecurityException("No signers found");
                }
                if (hashMap.isEmpty()) {
                    throw new SecurityException("No content digests found");
                }
                j2 = zzapeVar.zzb;
                j3 = zzapeVar.zzc;
                j4 = zzapeVar.zzd;
                byteBuffer2 = zzapeVar.zze;
                zzh(hashMap, fileChannel, j2, j3, j4, byteBuffer2);
                return (X509Certificate[][]) arrayList.toArray(new X509Certificate[arrayList.size()]);
            } catch (IOException e2) {
                throw new SecurityException("Failed to read list of signers", e2);
            }
        } catch (CertificateException e3) {
            throw new RuntimeException("Failed to obtain X.509 CertificateFactory", e3);
        }
    }
}
