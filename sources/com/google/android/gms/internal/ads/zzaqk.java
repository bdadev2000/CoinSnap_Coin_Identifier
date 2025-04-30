package com.google.android.gms.internal.ads;

import Q7.n0;
import android.util.Pair;
import com.adjust.sdk.Constants;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.o;
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
public final class zzaqk {
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
    public static X509Certificate[][] zza(String str) throws zzaqh, SecurityException, IOException {
        ?? r22;
        String str2 = "end > capacity: ";
        RandomAccessFile randomAccessFile = new RandomAccessFile(str, CampaignEx.JSON_KEY_AD_R);
        try {
            Pair zzc = zzaql.zzc(randomAccessFile);
            try {
                if (zzc != null) {
                    ByteBuffer byteBuffer = (ByteBuffer) zzc.first;
                    long longValue = ((Long) zzc.second).longValue();
                    long j7 = (-20) + longValue;
                    if (j7 >= 0) {
                        randomAccessFile.seek(j7);
                        if (randomAccessFile.readInt() == 1347094023) {
                            throw new zzaqh("ZIP64 APK not supported");
                        }
                    }
                    long zza = zzaql.zza(byteBuffer);
                    if (zza < longValue) {
                        if (zza + zzaql.zzb(byteBuffer) == longValue) {
                            if (zza >= 32) {
                                ByteBuffer allocate = ByteBuffer.allocate(24);
                                ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                                allocate.order(byteOrder);
                                long j9 = longValue;
                                randomAccessFile.seek(zza - allocate.capacity());
                                randomAccessFile.readFully(allocate.array(), allocate.arrayOffset(), allocate.capacity());
                                if (allocate.getLong(8) == 2334950737559900225L && allocate.getLong(16) == 3617552046287187010L) {
                                    long j10 = allocate.getLong(0);
                                    if (j10 >= allocate.capacity() && j10 <= 2147483639) {
                                        int i9 = (int) (8 + j10);
                                        long j11 = zza - i9;
                                        ?? r12 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
                                        try {
                                            if (r12 >= 0) {
                                                try {
                                                    ByteBuffer allocate2 = ByteBuffer.allocate(i9);
                                                    allocate2.order(byteOrder);
                                                    r12 = randomAccessFile;
                                                    r12.seek(j11);
                                                    r12.readFully(allocate2.array(), allocate2.arrayOffset(), allocate2.capacity());
                                                    long j12 = zza;
                                                    long j13 = allocate2.getLong(0);
                                                    if (j13 == j10) {
                                                        Pair create = Pair.create(allocate2, Long.valueOf(j11));
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
                                                                        int i10 = 0;
                                                                        while (slice.hasRemaining()) {
                                                                            i10++;
                                                                            if (slice.remaining() >= 8) {
                                                                                long j14 = slice.getLong();
                                                                                if (j14 >= 4 && j14 <= 2147483647L) {
                                                                                    int i11 = (int) j14;
                                                                                    int position2 = slice.position() + i11;
                                                                                    if (i11 <= slice.remaining()) {
                                                                                        if (slice.getInt() == 1896449818) {
                                                                                            X509Certificate[][] zzl = zzl(r12.getChannel(), new zzaqg(zze(slice, i11 - 4), longValue2, j12, j9, byteBuffer, null));
                                                                                            r12.close();
                                                                                            try {
                                                                                                r12.close();
                                                                                            } catch (IOException unused) {
                                                                                            }
                                                                                            return zzl;
                                                                                        }
                                                                                        long j15 = j9;
                                                                                        long j16 = j12;
                                                                                        slice.position(position2);
                                                                                        j12 = j16;
                                                                                        j9 = j15;
                                                                                    } else {
                                                                                        throw new zzaqh("APK Signing Block entry #" + i10 + " size out of range: " + i11 + ", available: " + slice.remaining());
                                                                                    }
                                                                                } else {
                                                                                    throw new zzaqh("APK Signing Block entry #" + i10 + " size out of range: " + j14);
                                                                                }
                                                                            } else {
                                                                                throw new zzaqh("Insufficient data to read size of APK Signing Block entry #" + i10);
                                                                            }
                                                                        }
                                                                        throw new zzaqh("No APK Signature Scheme v2 block in APK Signing Block");
                                                                    } catch (Throwable th) {
                                                                        byteBuffer2.position(0);
                                                                        byteBuffer2.limit(limit);
                                                                        byteBuffer2.position(position);
                                                                        throw th;
                                                                    }
                                                                }
                                                                throw new IllegalArgumentException("end > capacity: " + capacity + " > " + capacity2);
                                                            }
                                                            throw new IllegalArgumentException("end < start: " + capacity + " < 8");
                                                        }
                                                        throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
                                                    }
                                                    throw new zzaqh("APK Signing Block sizes in header and footer do not match: " + j13 + " vs " + j10);
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    r12 = randomAccessFile;
                                                    r22 = r12;
                                                    try {
                                                        r22.close();
                                                    } catch (IOException unused2) {
                                                    }
                                                    throw th;
                                                }
                                            }
                                            throw new zzaqh("APK Signing Block offset out of range: " + j11);
                                        } catch (Throwable th3) {
                                            th = th3;
                                        }
                                    } else {
                                        throw new zzaqh("APK Signing Block size out of range: " + j10);
                                    }
                                } else {
                                    throw new zzaqh("No APK Signing Block before ZIP Central Directory");
                                }
                            } else {
                                throw new zzaqh("APK too small for APK Signing Block. ZIP Central Directory offset: " + zza);
                            }
                        } else {
                            throw new zzaqh("ZIP Central Directory is not immediately followed by End of Central Directory");
                        }
                    } else {
                        throw new zzaqh("ZIP Central Directory offset out of range: " + zza + ". ZIP End of Central Directory offset: " + longValue);
                    }
                } else {
                    throw new zzaqh("Not an APK file: ZIP End of Central Directory record not found in file with " + randomAccessFile.length() + " bytes");
                }
            } catch (Throwable th4) {
                th = th4;
                r22 = str2;
            }
        } catch (Throwable th5) {
            th = th5;
            r22 = randomAccessFile;
        }
    }

    private static int zzb(int i9) {
        if (i9 != 1) {
            if (i9 == 2) {
                return 64;
            }
            throw new IllegalArgumentException(o.h(i9, "Unknown content digest algorthm: "));
        }
        return 32;
    }

    private static int zzc(int i9) {
        if (i9 != 513) {
            if (i9 != 514) {
                if (i9 != 769) {
                    switch (i9) {
                        case 257:
                        case 259:
                            return 1;
                        case 258:
                        case 260:
                            return 2;
                        default:
                            throw new IllegalArgumentException("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i9))));
                    }
                }
                return 1;
            }
            return 2;
        }
        return 1;
    }

    private static String zzd(int i9) {
        if (i9 != 1) {
            if (i9 == 2) {
                return "SHA-512";
            }
            throw new IllegalArgumentException(o.h(i9, "Unknown content digest algorthm: "));
        }
        return Constants.SHA256;
    }

    private static ByteBuffer zze(ByteBuffer byteBuffer, int i9) throws BufferUnderflowException {
        int limit = byteBuffer.limit();
        int position = byteBuffer.position();
        int i10 = i9 + position;
        if (i10 >= position && i10 <= limit) {
            byteBuffer.limit(i10);
            try {
                ByteBuffer slice = byteBuffer.slice();
                slice.order(byteBuffer.order());
                byteBuffer.position(i10);
                return slice;
            } finally {
                byteBuffer.limit(limit);
            }
        }
        throw new BufferUnderflowException();
    }

    private static ByteBuffer zzf(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer.remaining() >= 4) {
            int i9 = byteBuffer.getInt();
            if (i9 >= 0) {
                if (i9 <= byteBuffer.remaining()) {
                    return zze(byteBuffer, i9);
                }
                throw new IOException(n0.e(i9, byteBuffer.remaining(), "Length-prefixed field longer than remaining buffer. Field length: ", ", remaining: "));
            }
            throw new IllegalArgumentException("Negative length");
        }
        throw new IOException(o.h(byteBuffer.remaining(), "Remaining buffer too short to contain length of length-prefixed field. Remaining: "));
    }

    private static void zzg(int i9, byte[] bArr, int i10) {
        bArr[1] = (byte) (i9 & 255);
        bArr[2] = (byte) ((i9 >>> 8) & 255);
        bArr[3] = (byte) ((i9 >>> 16) & 255);
        bArr[4] = (byte) (i9 >> 24);
    }

    private static void zzh(Map map, FileChannel fileChannel, long j7, long j9, long j10, ByteBuffer byteBuffer) throws SecurityException {
        if (!map.isEmpty()) {
            zzaqe zzaqeVar = new zzaqe(fileChannel, 0L, j7);
            zzaqe zzaqeVar2 = new zzaqe(fileChannel, j9, j10 - j9);
            ByteBuffer duplicate = byteBuffer.duplicate();
            duplicate.order(ByteOrder.LITTLE_ENDIAN);
            zzaql.zzd(duplicate, j7);
            zzaqc zzaqcVar = new zzaqc(duplicate);
            int size = map.size();
            int[] iArr = new int[size];
            Iterator it = map.keySet().iterator();
            int i9 = 0;
            while (it.hasNext()) {
                iArr[i9] = ((Integer) it.next()).intValue();
                i9++;
            }
            try {
                byte[][] zzk = zzk(iArr, new zzaqd[]{zzaqeVar, zzaqeVar2, zzaqcVar});
                for (int i10 = 0; i10 < size; i10++) {
                    int i11 = iArr[i10];
                    if (!MessageDigest.isEqual((byte[]) map.get(Integer.valueOf(i11)), zzk[i10])) {
                        throw new SecurityException(zzd(i11).concat(" digest of contents did not verify"));
                    }
                }
                return;
            } catch (DigestException e4) {
                throw new SecurityException("Failed to compute digest(s) of contents", e4);
            }
        }
        throw new SecurityException("No digests provided");
    }

    private static byte[] zzi(ByteBuffer byteBuffer) throws IOException {
        int i9 = byteBuffer.getInt();
        if (i9 >= 0) {
            if (i9 <= byteBuffer.remaining()) {
                byte[] bArr = new byte[i9];
                byteBuffer.get(bArr);
                return bArr;
            }
            throw new IOException(n0.e(i9, byteBuffer.remaining(), "Underflow while reading length-prefixed value. Length: ", ", available: "));
        }
        throw new IOException("Negative length");
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaqk.zzj(java.nio.ByteBuffer, java.util.Map, java.security.cert.CertificateFactory):java.security.cert.X509Certificate[]");
    }

    private static byte[][] zzk(int[] iArr, zzaqd[] zzaqdVarArr) throws DigestException {
        long j7;
        int i9;
        int length;
        int i10 = 0;
        long j9 = 0;
        int i11 = 0;
        long j10 = 0;
        while (true) {
            j7 = 1048576;
            if (i11 >= 3) {
                break;
            }
            j10 += (zzaqdVarArr[i11].zza() + 1048575) / 1048576;
            i11++;
        }
        if (j10 < 2097151) {
            byte[][] bArr = new byte[iArr.length];
            int i12 = 0;
            while (true) {
                length = iArr.length;
                if (i12 >= length) {
                    break;
                }
                int i13 = (int) j10;
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
                } catch (NoSuchAlgorithmException e4) {
                    throw new RuntimeException(zzd.concat(" digest not supported"), e4);
                }
            }
            int i15 = 0;
            int i16 = 0;
            for (i9 = 3; i15 < i9; i9 = 3) {
                zzaqd zzaqdVar = zzaqdVarArr[i15];
                long j11 = j9;
                long zza = zzaqdVar.zza();
                while (zza > j9) {
                    int min = (int) Math.min(zza, j7);
                    zzg(min, bArr3, 1);
                    for (int i17 = 0; i17 < length; i17++) {
                        messageDigestArr[i17].update(bArr3);
                    }
                    long j12 = j11;
                    try {
                        zzaqdVar.zzb(messageDigestArr, j12, min);
                        byte[] bArr4 = bArr3;
                        int i18 = 0;
                        while (i18 < iArr.length) {
                            int i19 = iArr[i18];
                            zzaqd zzaqdVar2 = zzaqdVar;
                            byte[] bArr5 = bArr[i18];
                            int zzb = zzb(i19);
                            int i20 = length;
                            MessageDigest messageDigest = messageDigestArr[i18];
                            MessageDigest[] messageDigestArr2 = messageDigestArr;
                            int digest = messageDigest.digest(bArr5, (i16 * zzb) + 5, zzb);
                            if (digest == zzb) {
                                i18++;
                                zzaqdVar = zzaqdVar2;
                                length = i20;
                                messageDigestArr = messageDigestArr2;
                            } else {
                                throw new RuntimeException("Unexpected output size of " + messageDigest.getAlgorithm() + " digest: " + digest);
                            }
                        }
                        long j13 = min;
                        long j14 = j12 + j13;
                        zza -= j13;
                        i16++;
                        j9 = 0;
                        j7 = 1048576;
                        bArr3 = bArr4;
                        j11 = j14;
                        messageDigestArr = messageDigestArr;
                    } catch (IOException e9) {
                        throw new DigestException(n0.e(i16, i10, "Failed to digest chunk #", " of section #"), e9);
                    }
                }
                i10++;
                i15++;
                j9 = 0;
                j7 = 1048576;
            }
            byte[][] bArr6 = new byte[iArr.length];
            for (int i21 = 0; i21 < iArr.length; i21++) {
                int i22 = iArr[i21];
                byte[] bArr7 = bArr[i21];
                String zzd2 = zzd(i22);
                try {
                    bArr6[i21] = MessageDigest.getInstance(zzd2).digest(bArr7);
                } catch (NoSuchAlgorithmException e10) {
                    throw new RuntimeException(zzd2.concat(" digest not supported"), e10);
                }
            }
            return bArr6;
        }
        throw new DigestException(n0.g(j10, "Too many chunks: "));
    }

    private static X509Certificate[][] zzl(FileChannel fileChannel, zzaqg zzaqgVar) throws SecurityException {
        ByteBuffer byteBuffer;
        long j7;
        long j9;
        long j10;
        ByteBuffer byteBuffer2;
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            try {
                byteBuffer = zzaqgVar.zza;
                ByteBuffer zzf = zzf(byteBuffer);
                int i9 = 0;
                while (zzf.hasRemaining()) {
                    i9++;
                    try {
                        arrayList.add(zzj(zzf(zzf), hashMap, certificateFactory));
                    } catch (IOException | SecurityException | BufferUnderflowException e4) {
                        throw new SecurityException(n0.f(i9, "Failed to parse/verify signer #", " block"), e4);
                    }
                }
                if (i9 > 0) {
                    if (!hashMap.isEmpty()) {
                        j7 = zzaqgVar.zzb;
                        j9 = zzaqgVar.zzc;
                        j10 = zzaqgVar.zzd;
                        byteBuffer2 = zzaqgVar.zze;
                        zzh(hashMap, fileChannel, j7, j9, j10, byteBuffer2);
                        return (X509Certificate[][]) arrayList.toArray(new X509Certificate[arrayList.size()]);
                    }
                    throw new SecurityException("No content digests found");
                }
                throw new SecurityException("No signers found");
            } catch (IOException e9) {
                throw new SecurityException("Failed to read list of signers", e9);
            }
        } catch (CertificateException e10) {
            throw new RuntimeException("Failed to obtain X.509 CertificateFactory", e10);
        }
    }
}
