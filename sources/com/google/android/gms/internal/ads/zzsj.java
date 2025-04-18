package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.collection.CircularIntArray;
import java.util.ArrayDeque;

/* JADX INFO: Access modifiers changed from: package-private */
@RequiresApi
/* loaded from: classes3.dex */
public final class zzsj extends MediaCodec.Callback {
    private final HandlerThread zzb;
    private Handler zzc;

    @Nullable
    @GuardedBy
    private MediaFormat zzh;

    @Nullable
    @GuardedBy
    private MediaFormat zzi;

    @Nullable
    @GuardedBy
    private MediaCodec.CodecException zzj;

    @Nullable
    @GuardedBy
    private MediaCodec.CryptoException zzk;

    @GuardedBy
    private long zzl;

    @GuardedBy
    private boolean zzm;

    @Nullable
    @GuardedBy
    private IllegalStateException zzn;

    @Nullable
    @GuardedBy
    private zzss zzo;
    private final Object zza = new Object();

    @GuardedBy
    private final CircularIntArray zzd = new CircularIntArray();

    @GuardedBy
    private final CircularIntArray zze = new CircularIntArray();

    @GuardedBy
    private final ArrayDeque zzf = new ArrayDeque();

    @GuardedBy
    private final ArrayDeque zzg = new ArrayDeque();

    public zzsj(HandlerThread handlerThread) {
        this.zzb = handlerThread;
    }

    public static /* synthetic */ void zzd(zzsj zzsjVar) {
        synchronized (zzsjVar.zza) {
            try {
                if (zzsjVar.zzm) {
                    return;
                }
                long j2 = zzsjVar.zzl - 1;
                zzsjVar.zzl = j2;
                if (j2 > 0) {
                    return;
                }
                if (j2 >= 0) {
                    zzsjVar.zzj();
                    return;
                }
                IllegalStateException illegalStateException = new IllegalStateException();
                synchronized (zzsjVar.zza) {
                    zzsjVar.zzn = illegalStateException;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @GuardedBy
    private final void zzi(MediaFormat mediaFormat) {
        this.zze.a(-2);
        this.zzg.add(mediaFormat);
    }

    @GuardedBy
    private final void zzj() {
        if (!this.zzg.isEmpty()) {
            this.zzi = (MediaFormat) this.zzg.getLast();
        }
        CircularIntArray circularIntArray = this.zzd;
        circularIntArray.f1403c = circularIntArray.f1402b;
        CircularIntArray circularIntArray2 = this.zze;
        circularIntArray2.f1403c = circularIntArray2.f1402b;
        this.zzf.clear();
        this.zzg.clear();
    }

    @GuardedBy
    private final void zzk() {
        IllegalStateException illegalStateException = this.zzn;
        if (illegalStateException != null) {
            this.zzn = null;
            throw illegalStateException;
        }
        MediaCodec.CodecException codecException = this.zzj;
        if (codecException != null) {
            this.zzj = null;
            throw codecException;
        }
        MediaCodec.CryptoException cryptoException = this.zzk;
        if (cryptoException == null) {
            return;
        }
        this.zzk = null;
        throw cryptoException;
    }

    @GuardedBy
    private final boolean zzl() {
        return this.zzl > 0 || this.zzm;
    }

    @Override // android.media.MediaCodec.Callback
    public final void onCryptoError(MediaCodec mediaCodec, MediaCodec.CryptoException cryptoException) {
        synchronized (this.zza) {
            this.zzk = cryptoException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.zza) {
            this.zzj = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i2) {
        zzlq zzlqVar;
        zzlq zzlqVar2;
        synchronized (this.zza) {
            try {
                this.zzd.a(i2);
                zzss zzssVar = this.zzo;
                if (zzssVar != null) {
                    zzte zzteVar = ((zztc) zzssVar).zza;
                    zzlqVar = zzteVar.zzo;
                    if (zzlqVar != null) {
                        zzlqVar2 = zzteVar.zzo;
                        zzlqVar2.zza();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i2, MediaCodec.BufferInfo bufferInfo) {
        zzlq zzlqVar;
        zzlq zzlqVar2;
        synchronized (this.zza) {
            try {
                MediaFormat mediaFormat = this.zzi;
                if (mediaFormat != null) {
                    zzi(mediaFormat);
                    this.zzi = null;
                }
                this.zze.a(i2);
                this.zzf.add(bufferInfo);
                zzss zzssVar = this.zzo;
                if (zzssVar != null) {
                    zzte zzteVar = ((zztc) zzssVar).zza;
                    zzlqVar = zzteVar.zzo;
                    if (zzlqVar != null) {
                        zzlqVar2 = zzteVar.zzo;
                        zzlqVar2.zza();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.zza) {
            zzi(mediaFormat);
            this.zzi = null;
        }
    }

    public final int zza() {
        synchronized (this.zza) {
            try {
                zzk();
                int i2 = -1;
                if (zzl()) {
                    return -1;
                }
                CircularIntArray circularIntArray = this.zzd;
                int i3 = circularIntArray.f1402b;
                int i4 = circularIntArray.f1403c;
                if (i3 != i4) {
                    if (i3 == i4) {
                        throw new ArrayIndexOutOfBoundsException();
                    }
                    i2 = circularIntArray.f1401a[i3];
                    circularIntArray.f1402b = (i3 + 1) & circularIntArray.d;
                }
                return i2;
            } finally {
            }
        }
    }

    public final int zzb(MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.zza) {
            try {
                zzk();
                if (zzl()) {
                    return -1;
                }
                CircularIntArray circularIntArray = this.zze;
                int i2 = circularIntArray.f1402b;
                int i3 = circularIntArray.f1403c;
                if (i2 == i3) {
                    return -1;
                }
                if (i2 == i3) {
                    throw new ArrayIndexOutOfBoundsException();
                }
                int i4 = circularIntArray.f1401a[i2];
                circularIntArray.f1402b = (i2 + 1) & circularIntArray.d;
                if (i4 >= 0) {
                    zzdi.zzb(this.zzh);
                    MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) this.zzf.remove();
                    bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, bufferInfo2.presentationTimeUs, bufferInfo2.flags);
                } else if (i4 == -2) {
                    this.zzh = (MediaFormat) this.zzg.remove();
                    i4 = -2;
                }
                return i4;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final MediaFormat zzc() {
        MediaFormat mediaFormat;
        synchronized (this.zza) {
            try {
                mediaFormat = this.zzh;
                if (mediaFormat == null) {
                    throw new IllegalStateException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return mediaFormat;
    }

    public final void zze() {
        synchronized (this.zza) {
            this.zzl++;
            Handler handler = this.zzc;
            int i2 = zzeu.zza;
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzsi
                @Override // java.lang.Runnable
                public final void run() {
                    zzsj.zzd(zzsj.this);
                }
            });
        }
    }

    public final void zzf(MediaCodec mediaCodec) {
        zzdi.zzf(this.zzc == null);
        this.zzb.start();
        Handler handler = new Handler(this.zzb.getLooper());
        mediaCodec.setCallback(this, handler);
        this.zzc = handler;
    }

    public final void zzg(zzss zzssVar) {
        synchronized (this.zza) {
            this.zzo = zzssVar;
        }
    }

    public final void zzh() {
        synchronized (this.zza) {
            this.zzm = true;
            this.zzb.quit();
            zzj();
        }
    }
}
