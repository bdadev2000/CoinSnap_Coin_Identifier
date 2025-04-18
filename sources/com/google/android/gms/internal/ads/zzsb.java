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
/* loaded from: classes3.dex */
public final class zzsb implements zzso {
    private static final ArrayDeque zza = new ArrayDeque();
    private static final Object zzb = new Object();
    private final MediaCodec zzc;
    private final HandlerThread zzd;
    private Handler zze;
    private final AtomicReference zzf;
    private final zzdf zzg;
    private boolean zzh;

    public zzsb(MediaCodec mediaCodec, HandlerThread handlerThread) {
        zzdf zzdfVar = new zzdf(zzdc.zza);
        this.zzc = mediaCodec;
        this.zzd = handlerThread;
        this.zzg = zzdfVar;
        this.zzf = new AtomicReference();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007f A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* bridge */ /* synthetic */ void zza(com.google.android.gms.internal.ads.zzsb r10, android.os.Message r11) {
        /*
            int r0 = r11.what
            r1 = 1
            r2 = 0
            if (r0 == r1) goto L58
            r1 = 2
            if (r0 == r1) goto L37
            r1 = 3
            if (r0 == r1) goto L31
            r1 = 4
            if (r0 == r1) goto L20
            java.util.concurrent.atomic.AtomicReference r10 = r10.zzf
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            int r11 = r11.what
            java.lang.String r11 = java.lang.String.valueOf(r11)
            r0.<init>(r11)
            com.google.android.gms.internal.ads.zzry.zza(r10, r2, r0)
            goto L72
        L20:
            java.lang.Object r11 = r11.obj
            android.os.Bundle r11 = (android.os.Bundle) r11
            android.media.MediaCodec r0 = r10.zzc     // Catch: java.lang.RuntimeException -> L2a
            r0.setParameters(r11)     // Catch: java.lang.RuntimeException -> L2a
            goto L72
        L2a:
            r11 = move-exception
            java.util.concurrent.atomic.AtomicReference r10 = r10.zzf
            com.google.android.gms.internal.ads.zzry.zza(r10, r2, r11)
            goto L72
        L31:
            com.google.android.gms.internal.ads.zzdf r10 = r10.zzg
            r10.zze()
            goto L72
        L37:
            java.lang.Object r11 = r11.obj
            com.google.android.gms.internal.ads.zzsa r11 = (com.google.android.gms.internal.ads.zzsa) r11
            int r4 = r11.zza
            android.media.MediaCodec$CryptoInfo r6 = r11.zzd
            long r7 = r11.zze
            int r9 = r11.zzf
            java.lang.Object r0 = com.google.android.gms.internal.ads.zzsb.zzb     // Catch: java.lang.RuntimeException -> L51
            monitor-enter(r0)     // Catch: java.lang.RuntimeException -> L51
            android.media.MediaCodec r3 = r10.zzc     // Catch: java.lang.Throwable -> L4e
            r5 = 0
            r3.queueSecureInputBuffer(r4, r5, r6, r7, r9)     // Catch: java.lang.Throwable -> L4e
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4e
            goto L71
        L4e:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4e
            throw r1     // Catch: java.lang.RuntimeException -> L51
        L51:
            r0 = move-exception
            java.util.concurrent.atomic.AtomicReference r10 = r10.zzf
            com.google.android.gms.internal.ads.zzry.zza(r10, r2, r0)
            goto L71
        L58:
            java.lang.Object r11 = r11.obj
            com.google.android.gms.internal.ads.zzsa r11 = (com.google.android.gms.internal.ads.zzsa) r11
            int r4 = r11.zza
            int r6 = r11.zzc
            long r7 = r11.zze
            int r9 = r11.zzf
            android.media.MediaCodec r3 = r10.zzc     // Catch: java.lang.RuntimeException -> L6b
            r5 = 0
            r3.queueInputBuffer(r4, r5, r6, r7, r9)     // Catch: java.lang.RuntimeException -> L6b
            goto L71
        L6b:
            r0 = move-exception
            java.util.concurrent.atomic.AtomicReference r10 = r10.zzf
            com.google.android.gms.internal.ads.zzry.zza(r10, r2, r0)
        L71:
            r2 = r11
        L72:
            if (r2 == 0) goto L7f
            java.util.ArrayDeque r10 = com.google.android.gms.internal.ads.zzsb.zza
            monitor-enter(r10)
            r10.add(r2)     // Catch: java.lang.Throwable -> L7c
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L7c
            return
        L7c:
            r11 = move-exception
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L7c
            throw r11
        L7f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzsb.zza(com.google.android.gms.internal.ads.zzsb, android.os.Message):void");
    }

    private static zzsa zzi() {
        ArrayDeque arrayDeque = zza;
        synchronized (arrayDeque) {
            if (arrayDeque.isEmpty()) {
                return new zzsa();
            }
            return (zzsa) arrayDeque.removeFirst();
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

    @Override // com.google.android.gms.internal.ads.zzso
    public final void zzb() {
        if (this.zzh) {
            try {
                Handler handler = this.zze;
                handler.getClass();
                handler.removeCallbacksAndMessages(null);
                this.zzg.zzc();
                Handler handler2 = this.zze;
                handler2.getClass();
                handler2.obtainMessage(3).sendToTarget();
                this.zzg.zza();
            } catch (InterruptedException e2) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e2);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzso
    public final void zzc() {
        RuntimeException runtimeException = (RuntimeException) this.zzf.getAndSet(null);
        if (runtimeException == null) {
        } else {
            throw runtimeException;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzso
    public final void zzd(int i10, int i11, int i12, long j3, int i13) {
        zzc();
        zzsa zzi = zzi();
        zzi.zza(i10, 0, i12, j3, i13);
        Handler handler = this.zze;
        int i14 = zzen.zza;
        handler.obtainMessage(1, zzi).sendToTarget();
    }

    @Override // com.google.android.gms.internal.ads.zzso
    public final void zze(int i10, int i11, zzhj zzhjVar, long j3, int i12) {
        zzc();
        zzsa zzi = zzi();
        zzi.zza(i10, 0, 0, j3, 0);
        MediaCodec.CryptoInfo cryptoInfo = zzi.zzd;
        cryptoInfo.numSubSamples = zzhjVar.zzf;
        cryptoInfo.numBytesOfClearData = zzk(zzhjVar.zzd, cryptoInfo.numBytesOfClearData);
        cryptoInfo.numBytesOfEncryptedData = zzk(zzhjVar.zze, cryptoInfo.numBytesOfEncryptedData);
        byte[] zzj = zzj(zzhjVar.zzb, cryptoInfo.key);
        zzj.getClass();
        cryptoInfo.key = zzj;
        byte[] zzj2 = zzj(zzhjVar.zza, cryptoInfo.iv);
        zzj2.getClass();
        cryptoInfo.iv = zzj2;
        cryptoInfo.mode = zzhjVar.zzc;
        if (zzen.zza >= 24) {
            cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(zzhjVar.zzg, zzhjVar.zzh));
        }
        this.zze.obtainMessage(2, zzi).sendToTarget();
    }

    @Override // com.google.android.gms.internal.ads.zzso
    public final void zzf(Bundle bundle) {
        zzc();
        Handler handler = this.zze;
        int i10 = zzen.zza;
        handler.obtainMessage(4, bundle).sendToTarget();
    }

    @Override // com.google.android.gms.internal.ads.zzso
    public final void zzg() {
        if (this.zzh) {
            zzb();
            this.zzd.quit();
        }
        this.zzh = false;
    }

    @Override // com.google.android.gms.internal.ads.zzso
    public final void zzh() {
        if (!this.zzh) {
            this.zzd.start();
            this.zze = new zzrz(this, this.zzd.getLooper());
            this.zzh = true;
        }
    }
}
