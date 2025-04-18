package com.google.android.gms.internal.ads;

import android.util.Pair;
import com.adjust.sdk.Constants;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import eb.j;
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

/* loaded from: classes3.dex */
public final class zzaov {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.io.RandomAccessFile] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r6v10, types: [java.io.RandomAccessFile] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.nio.Buffer, java.nio.ByteBuffer] */
    /* JADX WARN: Type inference failed for: r6v3 */
    public static X509Certificate[][] zza(String str) throws zzaor, SecurityException, IOException {
        ?? r12 = "end > capacity: ";
        RandomAccessFile randomAccessFile = new RandomAccessFile(str, CampaignEx.JSON_KEY_AD_R);
        try {
            Pair zzc = zzaow.zzc(randomAccessFile);
            try {
                if (zzc != null) {
                    ByteBuffer byteBuffer = (ByteBuffer) zzc.first;
                    long longValue = ((Long) zzc.second).longValue();
                    long j3 = (-20) + longValue;
                    if (j3 >= 0) {
                        randomAccessFile.seek(j3);
                        if (randomAccessFile.readInt() == 1347094023) {
                            throw new zzaor("ZIP64 APK not supported");
                        }
                    }
                    long zza = zzaow.zza(byteBuffer);
                    if (zza < longValue) {
                        if (zzaow.zzb(byteBuffer) + zza == longValue) {
                            if (zza >= 32) {
                                ?? allocate = ByteBuffer.allocate(24);
                                ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                                allocate.order(byteOrder);
                                long j10 = longValue;
                                randomAccessFile.seek(zza - allocate.capacity());
                                randomAccessFile.readFully(allocate.array(), allocate.arrayOffset(), allocate.capacity());
                                try {
                                    if (allocate.getLong(8) == 2334950737559900225L && allocate.getLong(16) == 3617552046287187010L) {
                                        long j11 = allocate.getLong(0);
                                        if (j11 >= allocate.capacity() && j11 <= 2147483639) {
                                            int i10 = (int) (8 + j11);
                                            long j12 = zza - i10;
                                            if (j12 >= 0) {
                                                try {
                                                    ByteBuffer allocate2 = ByteBuffer.allocate(i10);
                                                    allocate2.order(byteOrder);
                                                    allocate = randomAccessFile;
                                                    allocate.seek(j12);
                                                    allocate.readFully(allocate2.array(), allocate2.arrayOffset(), allocate2.capacity());
                                                    long j13 = zza;
                                                    long j14 = allocate2.getLong(0);
                                                    if (j14 == j11) {
                                                        Pair create = Pair.create(allocate2, Long.valueOf(j12));
                                                        ByteBuffer byteBuffer2 = (ByteBuffer) create.first;
                                                        long longValue2 = ((Long) create.second).longValue();
                                                        if (byteBuffer2.order() == byteOrder) {
                                                            int capacity = byteBuffer2.capacity() - 24;
                                                            if (capacity >= 8) {
                                                                int capacity2 = byteBuffer2.capacity();
                                                                if (capacity <= byteBuffer2.capacity()) {
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
                                                                        int i11 = 0;
                                                                        while (slice.hasRemaining()) {
                                                                            i11++;
                                                                            if (slice.remaining() >= 8) {
                                                                                long j15 = slice.getLong();
                                                                                if (j15 >= 4 && j15 <= 2147483647L) {
                                                                                    int i12 = (int) j15;
                                                                                    int position2 = slice.position() + i12;
                                                                                    if (i12 <= slice.remaining()) {
                                                                                        if (slice.getInt() == 1896449818) {
                                                                                            X509Certificate[][] zzl = zzl(allocate.getChannel(), new zzaoq(zze(slice, i12 - 4), longValue2, j13, j10, byteBuffer, null));
                                                                                            allocate.close();
                                                                                            try {
                                                                                                allocate.close();
                                                                                            } catch (IOException unused) {
                                                                                            }
                                                                                            return zzl;
                                                                                        }
                                                                                        long j16 = j10;
                                                                                        long j17 = j13;
                                                                                        slice.position(position2);
                                                                                        j13 = j17;
                                                                                        j10 = j16;
                                                                                    } else {
                                                                                        throw new zzaor("APK Signing Block entry #" + i11 + " size out of range: " + i12 + ", available: " + slice.remaining());
                                                                                    }
                                                                                } else {
                                                                                    throw new zzaor("APK Signing Block entry #" + i11 + " size out of range: " + j15);
                                                                                }
                                                                            } else {
                                                                                throw new zzaor("Insufficient data to read size of APK Signing Block entry #" + i11);
                                                                            }
                                                                        }
                                                                        throw new zzaor("No APK Signature Scheme v2 block in APK Signing Block");
                                                                    } catch (Throwable th2) {
                                                                        byteBuffer2.position(0);
                                                                        byteBuffer2.limit(limit);
                                                                        byteBuffer2.position(position);
                                                                        throw th2;
                                                                    }
                                                                }
                                                                throw new IllegalArgumentException("end > capacity: " + capacity + " > " + capacity2);
                                                            }
                                                            throw new IllegalArgumentException("end < start: " + capacity + " < 8");
                                                        }
                                                        throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
                                                    }
                                                    throw new zzaor("APK Signing Block sizes in header and footer do not match: " + j14 + " vs " + j11);
                                                } catch (Throwable th3) {
                                                    th = th3;
                                                    r12 = randomAccessFile;
                                                    try {
                                                        r12.close();
                                                    } catch (IOException unused2) {
                                                    }
                                                    throw th;
                                                }
                                            }
                                            throw new zzaor("APK Signing Block offset out of range: " + j12);
                                        }
                                        throw new zzaor("APK Signing Block size out of range: " + j11);
                                    }
                                    throw new zzaor("No APK Signing Block before ZIP Central Directory");
                                } catch (Throwable th4) {
                                    th = th4;
                                    r12 = allocate;
                                    r12.close();
                                    throw th;
                                }
                            }
                            throw new zzaor("APK too small for APK Signing Block. ZIP Central Directory offset: " + zza);
                        }
                        throw new zzaor("ZIP Central Directory is not immediately followed by End of Central Directory");
                    }
                    throw new zzaor("ZIP Central Directory offset out of range: " + zza + ". ZIP End of Central Directory offset: " + longValue);
                }
                throw new zzaor("Not an APK file: ZIP End of Central Directory record not found in file with " + randomAccessFile.length() + " bytes");
            } catch (Throwable th5) {
                th = th5;
            }
        } catch (Throwable th6) {
            th = th6;
            r12 = randomAccessFile;
        }
    }

    private static int zzb(int i10) {
        if (i10 != 1) {
            if (i10 == 2) {
                return 64;
            }
            throw new IllegalArgumentException(j.i("Unknown content digest algorthm: ", i10));
        }
        return 32;
    }

    private static int zzc(int i10) {
        if (i10 == 513) {
            return 1;
        }
        if (i10 == 514) {
            return 2;
        }
        if (i10 == 769) {
            return 1;
        }
        switch (i10) {
            case 257:
            case 259:
                return 1;
            case 258:
            case 260:
                return 2;
            default:
                throw new IllegalArgumentException("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i10))));
        }
    }

    private static String zzd(int i10) {
        if (i10 != 1) {
            if (i10 == 2) {
                return "SHA-512";
            }
            throw new IllegalArgumentException(j.i("Unknown content digest algorthm: ", i10));
        }
        return Constants.SHA256;
    }

    private static ByteBuffer zze(ByteBuffer byteBuffer, int i10) throws BufferUnderflowException {
        int limit = byteBuffer.limit();
        int position = byteBuffer.position();
        int i11 = i10 + position;
        if (i11 >= position && i11 <= limit) {
            byteBuffer.limit(i11);
            try {
                ByteBuffer slice = byteBuffer.slice();
                slice.order(byteBuffer.order());
                byteBuffer.position(i11);
                return slice;
            } finally {
                byteBuffer.limit(limit);
            }
        }
        throw new BufferUnderflowException();
    }

    private static ByteBuffer zzf(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer.remaining() >= 4) {
            int i10 = byteBuffer.getInt();
            if (i10 >= 0) {
                if (i10 <= byteBuffer.remaining()) {
                    return zze(byteBuffer, i10);
                }
                throw new IOException(a4.j.e("Length-prefixed field longer than remaining buffer. Field length: ", i10, ", remaining: ", byteBuffer.remaining()));
            }
            throw new IllegalArgumentException("Negative length");
        }
        throw new IOException(j.i("Remaining buffer too short to contain length of length-prefixed field. Remaining: ", byteBuffer.remaining()));
    }

    private static void zzg(int i10, byte[] bArr, int i11) {
        bArr[1] = (byte) (i10 & 255);
        bArr[2] = (byte) ((i10 >>> 8) & 255);
        bArr[3] = (byte) ((i10 >>> 16) & 255);
        bArr[4] = (byte) (i10 >> 24);
    }

    private static void zzh(Map map, FileChannel fileChannel, long j3, long j10, long j11, ByteBuffer byteBuffer) throws SecurityException {
        if (!map.isEmpty()) {
            zzaop zzaopVar = new zzaop(fileChannel, 0L, j3);
            zzaop zzaopVar2 = new zzaop(fileChannel, j10, j11 - j10);
            ByteBuffer duplicate = byteBuffer.duplicate();
            duplicate.order(ByteOrder.LITTLE_ENDIAN);
            zzaow.zzd(duplicate, j3);
            zzaon zzaonVar = new zzaon(duplicate);
            int size = map.size();
            int[] iArr = new int[size];
            Iterator it = map.keySet().iterator();
            int i10 = 0;
            while (it.hasNext()) {
                iArr[i10] = ((Integer) it.next()).intValue();
                i10++;
            }
            try {
                byte[][] zzk = zzk(iArr, new zzaoo[]{zzaopVar, zzaopVar2, zzaonVar});
                for (int i11 = 0; i11 < size; i11++) {
                    int i12 = iArr[i11];
                    if (!MessageDigest.isEqual((byte[]) map.get(Integer.valueOf(i12)), zzk[i11])) {
                        throw new SecurityException(zzd(i12).concat(" digest of contents did not verify"));
                    }
                }
                return;
            } catch (DigestException e2) {
                throw new SecurityException("Failed to compute digest(s) of contents", e2);
            }
        }
        throw new SecurityException("No digests provided");
    }

    private static byte[] zzi(ByteBuffer byteBuffer) throws IOException {
        int i10 = byteBuffer.getInt();
        if (i10 >= 0) {
            if (i10 <= byteBuffer.remaining()) {
                byte[] bArr = new byte[i10];
                byteBuffer.get(bArr);
                return bArr;
            }
            throw new IOException(a4.j.e("Underflow while reading length-prefixed value. Length: ", i10, ", available: ", byteBuffer.remaining()));
        }
        throw new IOException("Negative length");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0048, code lost:
    
        r11 = zzc(r10);
        r12 = zzc(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0050, code lost:
    
        if (r11 == 1) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0052, code lost:
    
        if (r12 == 1) goto L138;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.security.cert.X509Certificate[] zzj(java.nio.ByteBuffer r21, java.util.Map r22, java.security.cert.CertificateFactory r23) throws java.lang.SecurityException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 636
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaov.zzj(java.nio.ByteBuffer, java.util.Map, java.security.cert.CertificateFactory):java.security.cert.X509Certificate[]");
    }

    private static byte[][] zzk(int[] iArr, zzaoo[] zzaooVarArr) throws DigestException {
        int length;
        int i10 = 0;
        long j3 = 0;
        for (int i11 = 0; i11 < 3; i11++) {
            j3 += (zzaooVarArr[i11].zza() + 1048575) / 1048576;
        }
        if (j3 < 2097151) {
            byte[][] bArr = new byte[iArr.length];
            int i12 = 0;
            while (true) {
                length = iArr.length;
                if (i12 >= length) {
                    break;
                }
                int i13 = (int) j3;
                byte[] bArr2 = new byte[(zzb(iArr[i12]) * i13) + 5];
                bArr2[0] = 90;
                zzg(i13, bArr2, 1);
                bArr[i12] = bArr2;
                i12++;
            }
            byte[] bArr3 = new byte[5];
            bArr3[0] = -91;
            MessageDigest[] messageDigestArr = new MessageDigest[length];
            for (int i14 = 0; i14 < iArr.length; i14++) {
                String zzd = zzd(iArr[i14]);
                try {
                    messageDigestArr[i14] = MessageDigest.getInstance(zzd);
                } catch (NoSuchAlgorithmException e2) {
                    throw new RuntimeException(zzd.concat(" digest not supported"), e2);
                }
            }
            int i15 = 3;
            long j10 = 1048576;
            long j11 = 0;
            int i16 = 0;
            int i17 = 0;
            while (i10 < i15) {
                zzaoo zzaooVar = zzaooVarArr[i10];
                int i18 = i10;
                int i19 = i16;
                long zza = zzaooVar.zza();
                long j12 = j10;
                long j13 = j11;
                while (zza > j11) {
                    int min = (int) Math.min(zza, j12);
                    zzg(min, bArr3, 1);
                    for (int i20 = 0; i20 < length; i20++) {
                        messageDigestArr[i20].update(bArr3);
                    }
                    try {
                        zzaooVar.zzb(messageDigestArr, j13, min);
                        int i21 = 0;
                        while (i21 < iArr.length) {
                            int i22 = iArr[i21];
                            byte[] bArr4 = bArr[i21];
                            int zzb = zzb(i22);
                            byte[] bArr5 = bArr3;
                            MessageDigest messageDigest = messageDigestArr[i21];
                            MessageDigest[] messageDigestArr2 = messageDigestArr;
                            int digest = messageDigest.digest(bArr4, (i17 * zzb) + 5, zzb);
                            if (digest == zzb) {
                                i21++;
                                bArr3 = bArr5;
                                messageDigestArr = messageDigestArr2;
                            } else {
                                throw new RuntimeException("Unexpected output size of " + messageDigest.getAlgorithm() + " digest: " + digest);
                            }
                        }
                        byte[] bArr6 = bArr3;
                        long j14 = min;
                        j13 += j14;
                        zza -= j14;
                        i17++;
                        j11 = 0;
                        j12 = 1048576;
                        bArr3 = bArr6;
                        messageDigestArr = messageDigestArr;
                    } catch (IOException e10) {
                        throw new DigestException(a4.j.e("Failed to digest chunk #", i17, " of section #", i19), e10);
                    }
                }
                i16 = i19 + 1;
                i10 = i18 + 1;
                j11 = 0;
                j10 = 1048576;
                i15 = 3;
                bArr3 = bArr3;
            }
            byte[][] bArr7 = new byte[iArr.length];
            for (int i23 = 0; i23 < iArr.length; i23++) {
                int i24 = iArr[i23];
                byte[] bArr8 = bArr[i23];
                String zzd2 = zzd(i24);
                try {
                    bArr7[i23] = MessageDigest.getInstance(zzd2).digest(bArr8);
                } catch (NoSuchAlgorithmException e11) {
                    throw new RuntimeException(zzd2.concat(" digest not supported"), e11);
                }
            }
            return bArr7;
        }
        throw new DigestException(kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.k("Too many chunks: ", j3));
    }

    private static X509Certificate[][] zzl(FileChannel fileChannel, zzaoq zzaoqVar) throws SecurityException {
        ByteBuffer byteBuffer;
        long j3;
        long j10;
        long j11;
        ByteBuffer byteBuffer2;
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            try {
                byteBuffer = zzaoqVar.zza;
                ByteBuffer zzf = zzf(byteBuffer);
                int i10 = 0;
                while (zzf.hasRemaining()) {
                    i10++;
                    try {
                        arrayList.add(zzj(zzf(zzf), hashMap, certificateFactory));
                    } catch (IOException | SecurityException | BufferUnderflowException e2) {
                        throw new SecurityException(kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.i("Failed to parse/verify signer #", i10, " block"), e2);
                    }
                }
                if (i10 > 0) {
                    if (!hashMap.isEmpty()) {
                        j3 = zzaoqVar.zzb;
                        j10 = zzaoqVar.zzc;
                        j11 = zzaoqVar.zzd;
                        byteBuffer2 = zzaoqVar.zze;
                        zzh(hashMap, fileChannel, j3, j10, j11, byteBuffer2);
                        return (X509Certificate[][]) arrayList.toArray(new X509Certificate[arrayList.size()]);
                    }
                    throw new SecurityException("No content digests found");
                }
                throw new SecurityException("No signers found");
            } catch (IOException e10) {
                throw new SecurityException("Failed to read list of signers", e10);
            }
        } catch (CertificateException e11) {
            throw new RuntimeException("Failed to obtain X.509 CertificateFactory", e11);
        }
    }
}
