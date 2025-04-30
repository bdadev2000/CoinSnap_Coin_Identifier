package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
@RequiresApi(23)
/* loaded from: classes2.dex */
public final class zztf implements zztn {
    private static final ArrayDeque zza = new ArrayDeque();
    private static final Object zzb = new Object();
    private final MediaCodec zzc;
    private final HandlerThread zzd;
    private Handler zze;
    private final AtomicReference zzf;
    private final zzeu zzg;
    private boolean zzh;

    public zztf(MediaCodec mediaCodec, HandlerThread handlerThread) {
        zzeu zzeuVar = new zzeu(zzer.zza);
        this.zzc = mediaCodec;
        this.zzd = handlerThread;
        this.zzg = zzeuVar;
        this.zzf = new AtomicReference();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007f A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* bridge */ /* synthetic */ void zza(com.google.android.gms.internal.ads.zztf r9, android.os.Message r10) {
        /*
            int r0 = r10.what
            r1 = 0
            if (r0 == 0) goto L58
            r2 = 1
            if (r0 == r2) goto L36
            r2 = 2
            if (r0 == r2) goto L30
            r2 = 3
            if (r0 == r2) goto L1f
            java.util.concurrent.atomic.AtomicReference r9 = r9.zzf
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            int r10 = r10.what
            java.lang.String r10 = java.lang.String.valueOf(r10)
            r0.<init>(r10)
            com.google.android.gms.internal.ads.zztc.zza(r9, r1, r0)
            goto L72
        L1f:
            java.lang.Object r10 = r10.obj
            android.os.Bundle r10 = (android.os.Bundle) r10
            android.media.MediaCodec r0 = r9.zzc     // Catch: java.lang.RuntimeException -> L29
            r0.setParameters(r10)     // Catch: java.lang.RuntimeException -> L29
            goto L72
        L29:
            r10 = move-exception
            java.util.concurrent.atomic.AtomicReference r9 = r9.zzf
            com.google.android.gms.internal.ads.zztc.zza(r9, r1, r10)
            goto L72
        L30:
            com.google.android.gms.internal.ads.zzeu r9 = r9.zzg
            r9.zze()
            goto L72
        L36:
            java.lang.Object r10 = r10.obj
            com.google.android.gms.internal.ads.zzte r10 = (com.google.android.gms.internal.ads.zzte) r10
            int r3 = r10.zza
            android.media.MediaCodec$CryptoInfo r5 = r10.zzd
            long r6 = r10.zze
            int r8 = r10.zzf
            java.lang.Object r0 = com.google.android.gms.internal.ads.zztf.zzb     // Catch: java.lang.RuntimeException -> L50
            monitor-enter(r0)     // Catch: java.lang.RuntimeException -> L50
            android.media.MediaCodec r2 = r9.zzc     // Catch: java.lang.Throwable -> L4d
            r4 = 0
            r2.queueSecureInputBuffer(r3, r4, r5, r6, r8)     // Catch: java.lang.Throwable -> L4d
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4d
            goto L56
        L4d:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4d
            throw r2     // Catch: java.lang.RuntimeException -> L50
        L50:
            r0 = move-exception
            java.util.concurrent.atomic.AtomicReference r9 = r9.zzf
            com.google.android.gms.internal.ads.zztc.zza(r9, r1, r0)
        L56:
            r1 = r10
            goto L72
        L58:
            java.lang.Object r10 = r10.obj
            com.google.android.gms.internal.ads.zzte r10 = (com.google.android.gms.internal.ads.zzte) r10
            int r3 = r10.zza
            int r5 = r10.zzc
            long r6 = r10.zze
            int r8 = r10.zzf
            android.media.MediaCodec r2 = r9.zzc     // Catch: java.lang.RuntimeException -> L6b
            r4 = 0
            r2.queueInputBuffer(r3, r4, r5, r6, r8)     // Catch: java.lang.RuntimeException -> L6b
            goto L56
        L6b:
            r0 = move-exception
            java.util.concurrent.atomic.AtomicReference r9 = r9.zzf
            com.google.android.gms.internal.ads.zztc.zza(r9, r1, r0)
            goto L56
        L72:
            if (r1 == 0) goto L7f
            java.util.ArrayDeque r9 = com.google.android.gms.internal.ads.zztf.zza
            monitor-enter(r9)
            r9.add(r1)     // Catch: java.lang.Throwable -> L7c
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L7c
            return
        L7c:
            r10 = move-exception
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L7c
            throw r10
        L7f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zztf.zza(com.google.android.gms.internal.ads.zztf, android.os.Message):void");
    }

    private static zzte zzi() {
        ArrayDeque arrayDeque = zza;
        synchronized (arrayDeque) {
            try {
                if (arrayDeque.isEmpty()) {
                    return new zzte();
                }
                return (zzte) arrayDeque.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Nullable
    private static byte[] zzj(@Nullable byte[] bArr, @Nullable byte[] bArr2) {
        int length;
        if (bArr == null) {
            return bArr2;
        }
        if (bArr2 != null && bArr2.length >= (length = bArr.length)) {
            System.arraycopy(bArr, 0, bArr2, 0, length);
            return bArr2;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }

    @Nullable
    private static int[] zzk(@Nullable int[] iArr, @Nullable int[] iArr2) {
        int length;
        if (iArr == null) {
            return iArr2;
        }
        if (iArr2 != null && iArr2.length >= (length = iArr.length)) {
            System.arraycopy(iArr, 0, iArr2, 0, length);
            return iArr2;
        }
        return Arrays.copyOf(iArr, iArr.length);
    }

    @Override // com.google.android.gms.internal.ads.zztn
    public final void zzb() {
        if (this.zzh) {
            try {
                Handler handler = this.zze;
                handler.getClass();
                handler.removeCallbacksAndMessages(null);
                this.zzg.zzc();
                Handler handler2 = this.zze;
                handler2.getClass();
                handler2.obtainMessage(2).sendToTarget();
                this.zzg.zza();
            } catch (InterruptedException e4) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e4);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zztn
    public final void zzc() {
        RuntimeException runtimeException = (RuntimeException) this.zzf.getAndSet(null);
        if (runtimeException == null) {
        } else {
            throw runtimeException;
        }
    }

    @Override // com.google.android.gms.internal.ads.zztn
    public final void zzd(int i9, int i10, int i11, long j7, int i12) {
        zzc();
        zzte zzi = zzi();
        zzi.zza(i9, 0, i11, j7, i12);
        Handler handler = this.zze;
        int i13 = zzgd.zza;
        handler.obtainMessage(0, zzi).sendToTarget();
    }

    @Override // com.google.android.gms.internal.ads.zztn
    public final void zze(int i9, int i10, zzik zzikVar, long j7, int i11) {
        zzc();
        zzte zzi = zzi();
        zzi.zza(i9, 0, 0, j7, 0);
        MediaCodec.CryptoInfo cryptoInfo = zzi.zzd;
        cryptoInfo.numSubSamples = zzikVar.zzf;
        cryptoInfo.numBytesOfClearData = zzk(zzikVar.zzd, cryptoInfo.numBytesOfClearData);
        cryptoInfo.numBytesOfEncryptedData = zzk(zzikVar.zze, cryptoInfo.numBytesOfEncryptedData);
        byte[] zzj = zzj(zzikVar.zzb, cryptoInfo.key);
        zzj.getClass();
        cryptoInfo.key = zzj;
        byte[] zzj2 = zzj(zzikVar.zza, cryptoInfo.iv);
        zzj2.getClass();
        cryptoInfo.iv = zzj2;
        cryptoInfo.mode = zzikVar.zzc;
        if (zzgd.zza >= 24) {
            cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(zzikVar.zzg, zzikVar.zzh));
        }
        this.zze.obtainMessage(1, zzi).sendToTarget();
    }

    @Override // com.google.android.gms.internal.ads.zztn
    public final void zzf(Bundle bundle) {
        zzc();
        Handler handler = this.zze;
        int i9 = zzgd.zza;
        handler.obtainMessage(3, bundle).sendToTarget();
    }

    @Override // com.google.android.gms.internal.ads.zztn
    public final void zzg() {
        if (this.zzh) {
            zzb();
            this.zzd.quit();
        }
        this.zzh = false;
    }

    @Override // com.google.android.gms.internal.ads.zztn
    public final void zzh() {
        if (!this.zzh) {
            this.zzd.start();
            this.zze = new zztd(this, this.zzd.getLooper());
            this.zzh = true;
        }
    }
}
