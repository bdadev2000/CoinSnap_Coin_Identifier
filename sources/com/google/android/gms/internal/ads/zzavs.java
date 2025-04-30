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
/* loaded from: classes2.dex */
public final class zzavs {
    static boolean zza = false;
    public static final /* synthetic */ int zzc = 0;
    private static MessageDigest zzd;
    private static final Object zze = new Object();
    private static final Object zzf = new Object();
    static final CountDownLatch zzb = new CountDownLatch(1);

    public static zzaus zza(zzauj zzaujVar) {
        zzatp zza2 = zzaus.zza();
        zza2.zzJ(zzaujVar.zza());
        return (zzaus) zza2.zzbr();
    }

    public static String zzb(byte[] bArr, String str) throws GeneralSecurityException, UnsupportedEncodingException {
        byte[] zzg;
        Vector zzc2 = zzc(bArr, 255);
        if (zzc2 != null && !zzc2.isEmpty()) {
            zzavk zza2 = zzavl.zza();
            int size = zzc2.size();
            for (int i9 = 0; i9 < size; i9++) {
                zza2.zza(zzhac.zzv(zzg((byte[]) zzc2.get(i9), str, false), 0, NotificationCompat.FLAG_LOCAL_ONLY));
            }
            byte[] zzf2 = zzf(bArr);
            zzhac zzhacVar = zzhac.zzb;
            zza2.zzc(zzhac.zzv(zzf2, 0, zzf2.length));
            zzg = ((zzavl) zza2.zzbr()).zzaV();
        } else {
            zzg = zzg(zza(zzauj.PSN_ENCODE_SIZE_FAIL).zzaV(), str, true);
        }
        return zzavo.zza(zzg, true);
    }

    public static Vector zzc(byte[] bArr, int i9) {
        int length = bArr.length;
        if (length <= 0) {
            return null;
        }
        int i10 = length + 254;
        Vector vector = new Vector();
        for (int i11 = 0; i11 < i10 / 255; i11++) {
            int i12 = i11 * 255;
            try {
                int length2 = bArr.length;
                if (length2 - i12 > 255) {
                    length2 = i12 + 255;
                }
                vector.add(Arrays.copyOfRange(bArr, i12, length2));
            } catch (IndexOutOfBoundsException unused) {
                return null;
            }
        }
        return vector;
    }

    public static void zze() {
        synchronized (zzf) {
            try {
                if (!zza) {
                    zza = true;
                    new Thread(new zzavr(null)).start();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x001f, code lost:
    
        r1.reset();
        r1.update(r6);
        r6 = com.google.android.gms.internal.ads.zzavs.zzd.digest();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static byte[] zzf(byte[] r6) throws java.security.NoSuchAlgorithmException {
        /*
            java.lang.Object r0 = com.google.android.gms.internal.ads.zzavs.zze
            monitor-enter(r0)
            zze()     // Catch: java.lang.Throwable -> L1b
            r1 = 0
            java.util.concurrent.CountDownLatch r2 = com.google.android.gms.internal.ads.zzavs.zzb     // Catch: java.lang.Throwable -> L1b java.lang.InterruptedException -> L1d
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Throwable -> L1b java.lang.InterruptedException -> L1d
            r4 = 2
            boolean r2 = r2.await(r4, r3)     // Catch: java.lang.Throwable -> L1b java.lang.InterruptedException -> L1d
            if (r2 != 0) goto L14
            goto L1d
        L14:
            java.security.MessageDigest r2 = com.google.android.gms.internal.ads.zzavs.zzd     // Catch: java.lang.Throwable -> L1b
            if (r2 != 0) goto L19
            goto L1d
        L19:
            r1 = r2
            goto L1d
        L1b:
            r6 = move-exception
            goto L35
        L1d:
            if (r1 == 0) goto L2d
            r1.reset()     // Catch: java.lang.Throwable -> L1b
            r1.update(r6)     // Catch: java.lang.Throwable -> L1b
            java.security.MessageDigest r6 = com.google.android.gms.internal.ads.zzavs.zzd     // Catch: java.lang.Throwable -> L1b
            byte[] r6 = r6.digest()     // Catch: java.lang.Throwable -> L1b
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            return r6
        L2d:
            java.security.NoSuchAlgorithmException r6 = new java.security.NoSuchAlgorithmException     // Catch: java.lang.Throwable -> L1b
            java.lang.String r1 = "Cannot compute hash"
            r6.<init>(r1)     // Catch: java.lang.Throwable -> L1b
            throw r6     // Catch: java.lang.Throwable -> L1b
        L35:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzavs.zzf(byte[]):byte[]");
    }

    private static byte[] zzg(byte[] bArr, String str, boolean z8) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        int i9;
        byte[] array;
        int length = bArr.length;
        if (true != z8) {
            i9 = 255;
        } else {
            i9 = 239;
        }
        if (length > i9) {
            bArr = zza(zzauj.PSN_ENCODE_SIZE_FAIL).zzaV();
        }
        int i10 = i9 + 1;
        int length2 = bArr.length;
        byte b = (byte) length2;
        if (length2 < i9) {
            byte[] bArr2 = new byte[i9 - length2];
            new SecureRandom().nextBytes(bArr2);
            array = ByteBuffer.allocate(i10).put(b).put(bArr).put(bArr2).array();
        } else {
            array = ByteBuffer.allocate(i10).put(b).put(bArr).array();
        }
        if (z8) {
            array = ByteBuffer.allocate(NotificationCompat.FLAG_LOCAL_ONLY).put(zzf(array)).put(array).array();
        }
        byte[] bArr3 = new byte[NotificationCompat.FLAG_LOCAL_ONLY];
        zzavt[] zzavtVarArr = new zzaws().zzcG;
        int length3 = zzavtVarArr.length;
        for (int i11 = 0; i11 < 12; i11++) {
            zzavtVarArr[i11].zza(array, bArr3);
        }
        if (str != null && str.length() > 0) {
            if (str.length() > 32) {
                str = str.substring(0, 32);
            }
            new zzavm(str.getBytes("UTF-8")).zza(bArr3);
        }
        return bArr3;
    }
}
