package com.google.android.gms.internal.ads;

import androidx.core.app.NotificationCompat;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzaua {
    static boolean zza = false;
    public static final /* synthetic */ int zzc = 0;
    private static MessageDigest zzd;
    private static final Object zze = new Object();
    private static final Object zzf = new Object();
    static final CountDownLatch zzb = new CountDownLatch(1);

    public static zzato zza(byte[] bArr, String str) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        Vector zzc2 = zzc(bArr, 255);
        if (zzc2 != null && !zzc2.isEmpty()) {
            zzato zza2 = zzatp.zza();
            int size = zzc2.size();
            for (int i10 = 0; i10 < size; i10++) {
                zza2.zza(zzgxp.zzv(zzh((byte[]) zzc2.get(i10), str, false), 0, NotificationCompat.FLAG_LOCAL_ONLY));
            }
            byte[] zzf2 = zzf(bArr);
            zzgxp zzgxpVar = zzgxp.zzb;
            zza2.zzb(zzgxp.zzv(zzf2, 0, zzf2.length));
            return zza2;
        }
        return null;
    }

    public static String zzb(byte[] bArr, String str) throws GeneralSecurityException, UnsupportedEncodingException {
        byte[] zzaV;
        zzato zza2 = zza(bArr, str);
        if (zza2 == null) {
            zzaV = zzh(zzg(4096).zzaV(), str, true);
        } else {
            zzaV = ((zzatp) zza2.zzbr()).zzaV();
        }
        return zzatt.zza(zzaV, true);
    }

    public static Vector zzc(byte[] bArr, int i10) {
        int length = bArr.length;
        if (length <= 0) {
            return null;
        }
        int i11 = length + 254;
        Vector vector = new Vector();
        for (int i12 = 0; i12 < i11 / 255; i12++) {
            int i13 = i12 * 255;
            try {
                int length2 = bArr.length;
                if (length2 - i13 > 255) {
                    length2 = i13 + 255;
                }
                vector.add(Arrays.copyOfRange(bArr, i13, length2));
            } catch (IndexOutOfBoundsException unused) {
                return null;
            }
        }
        return vector;
    }

    public static void zze() {
        synchronized (zzf) {
            if (!zza) {
                zza = true;
                new Thread(new zzaty(null)).start();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x001c, code lost:
    
        r1.reset();
        r1.update(r6);
        r6 = com.google.android.gms.internal.ads.zzaua.zzd.digest();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static byte[] zzf(byte[] r6) throws java.security.NoSuchAlgorithmException {
        /*
            java.lang.Object r0 = com.google.android.gms.internal.ads.zzaua.zze
            monitor-enter(r0)
            zze()     // Catch: java.lang.Throwable -> L32
            r1 = 0
            java.util.concurrent.CountDownLatch r2 = com.google.android.gms.internal.ads.zzaua.zzb     // Catch: java.lang.InterruptedException -> L1a java.lang.Throwable -> L32
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.InterruptedException -> L1a java.lang.Throwable -> L32
            r4 = 2
            boolean r2 = r2.await(r4, r3)     // Catch: java.lang.InterruptedException -> L1a java.lang.Throwable -> L32
            if (r2 != 0) goto L14
            goto L1a
        L14:
            java.security.MessageDigest r2 = com.google.android.gms.internal.ads.zzaua.zzd     // Catch: java.lang.Throwable -> L32
            if (r2 != 0) goto L19
            goto L1a
        L19:
            r1 = r2
        L1a:
            if (r1 == 0) goto L2a
            r1.reset()     // Catch: java.lang.Throwable -> L32
            r1.update(r6)     // Catch: java.lang.Throwable -> L32
            java.security.MessageDigest r6 = com.google.android.gms.internal.ads.zzaua.zzd     // Catch: java.lang.Throwable -> L32
            byte[] r6 = r6.digest()     // Catch: java.lang.Throwable -> L32
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            return r6
        L2a:
            java.security.NoSuchAlgorithmException r6 = new java.security.NoSuchAlgorithmException     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = "Cannot compute hash"
            r6.<init>(r1)     // Catch: java.lang.Throwable -> L32
            throw r6     // Catch: java.lang.Throwable -> L32
        L32:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaua.zzf(byte[]):byte[]");
    }

    public static zzata zzg(int i10) {
        zzasf zza2 = zzata.zza();
        zza2.zzD(4096L);
        return (zzata) zza2.zzbr();
    }

    private static byte[] zzh(byte[] bArr, String str, boolean z10) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        int i10;
        byte[] array;
        int length = bArr.length;
        if (true != z10) {
            i10 = 255;
        } else {
            i10 = 239;
        }
        if (length > i10) {
            bArr = zzg(4096).zzaV();
        }
        int i11 = i10 + 1;
        int length2 = bArr.length;
        byte b3 = (byte) length2;
        if (length2 < i10) {
            byte[] bArr2 = new byte[i10 - length2];
            new SecureRandom().nextBytes(bArr2);
            array = ByteBuffer.allocate(i11).put(b3).put(bArr).put(bArr2).array();
        } else {
            array = ByteBuffer.allocate(i11).put(b3).put(bArr).array();
        }
        if (z10) {
            array = ByteBuffer.allocate(NotificationCompat.FLAG_LOCAL_ONLY).put(zzf(array)).put(array).array();
        }
        byte[] bArr3 = new byte[NotificationCompat.FLAG_LOCAL_ONLY];
        zzaub[] zzaubVarArr = new zzaup().zzcG;
        int length3 = zzaubVarArr.length;
        for (int i12 = 0; i12 < 12; i12++) {
            zzaubVarArr[i12].zza(array, bArr3);
        }
        if (str != null && str.length() > 0) {
            if (str.length() > 32) {
                str = str.substring(0, 32);
            }
            new zzatr(str.getBytes("UTF-8")).zza(bArr3);
        }
        return bArr3;
    }
}
