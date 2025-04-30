package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.util.ArrayDeque;

/* JADX INFO: Access modifiers changed from: package-private */
@RequiresApi(23)
/* loaded from: classes2.dex */
public final class zzth extends MediaCodec.Callback {
    private final HandlerThread zzb;
    private Handler zzc;

    @Nullable
    private MediaFormat zzh;

    @Nullable
    private MediaFormat zzi;

    @Nullable
    private MediaCodec.CodecException zzj;

    @Nullable
    private MediaCodec.CryptoException zzk;
    private long zzl;
    private boolean zzm;

    @Nullable
    private IllegalStateException zzn;
    private final Object zza = new Object();
    private final x.d zzd = new x.d();
    private final x.d zze = new x.d();
    private final ArrayDeque zzf = new ArrayDeque();
    private final ArrayDeque zzg = new ArrayDeque();

    public zzth(HandlerThread handlerThread) {
        this.zzb = handlerThread;
    }

    public static /* synthetic */ void zzd(zzth zzthVar) {
        synchronized (zzthVar.zza) {
            try {
                if (zzthVar.zzm) {
                    return;
                }
                long j7 = zzthVar.zzl - 1;
                zzthVar.zzl = j7;
                if (j7 > 0) {
                    return;
                }
                if (j7 < 0) {
                    IllegalStateException illegalStateException = new IllegalStateException();
                    synchronized (zzthVar.zza) {
                        zzthVar.zzn = illegalStateException;
                    }
                    return;
                }
                zzthVar.zzi();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void zzh(MediaFormat mediaFormat) {
        this.zze.a(-2);
        this.zzg.add(mediaFormat);
    }

    private final void zzi() {
        if (!this.zzg.isEmpty()) {
            this.zzi = (MediaFormat) this.zzg.getLast();
        }
        x.d dVar = this.zzd;
        dVar.f24065c = dVar.b;
        x.d dVar2 = this.zze;
        dVar2.f24065c = dVar2.b;
        this.zzf.clear();
        this.zzg.clear();
    }

    private final void zzj() {
        IllegalStateException illegalStateException = this.zzn;
        if (illegalStateException == null) {
            MediaCodec.CodecException codecException = this.zzj;
            if (codecException == null) {
                MediaCodec.CryptoException cryptoException = this.zzk;
                if (cryptoException == null) {
                    return;
                }
                this.zzk = null;
                throw cryptoException;
            }
            this.zzj = null;
            throw codecException;
        }
        this.zzn = null;
        throw illegalStateException;
    }

    private final boolean zzk() {
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
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i9) {
        synchronized (this.zza) {
            this.zzd.a(i9);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i9, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.zza) {
            try {
                MediaFormat mediaFormat = this.zzi;
                if (mediaFormat != null) {
                    zzh(mediaFormat);
                    this.zzi = null;
                }
                this.zze.a(i9);
                this.zzf.add(bufferInfo);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.zza) {
            zzh(mediaFormat);
            this.zzi = null;
        }
    }

    public final int zza() {
        synchronized (this.zza) {
            try {
                zzj();
                int i9 = -1;
                if (zzk()) {
                    return -1;
                }
                x.d dVar = this.zzd;
                int i10 = dVar.b;
                int i11 = dVar.f24065c;
                if (i10 != i11) {
                    if (i10 != i11) {
                        i9 = dVar.f24064a[i10];
                        dVar.b = (i10 + 1) & dVar.f24066d;
                    } else {
                        throw new ArrayIndexOutOfBoundsException();
                    }
                }
                return i9;
            } finally {
            }
        }
    }

    public final int zzb(MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.zza) {
            try {
                zzj();
                if (zzk()) {
                    return -1;
                }
                x.d dVar = this.zze;
                int i9 = dVar.b;
                int i10 = dVar.f24065c;
                if (i9 == i10) {
                    return -1;
                }
                if (i9 != i10) {
                    int i11 = dVar.f24064a[i9];
                    dVar.b = (i9 + 1) & dVar.f24066d;
                    if (i11 >= 0) {
                        zzeq.zzb(this.zzh);
                        MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) this.zzf.remove();
                        bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, bufferInfo2.presentationTimeUs, bufferInfo2.flags);
                    } else if (i11 == -2) {
                        this.zzh = (MediaFormat) this.zzg.remove();
                        i11 = -2;
                    }
                    return i11;
                }
                throw new ArrayIndexOutOfBoundsException();
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
            int i9 = zzgd.zza;
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zztg
                @Override // java.lang.Runnable
                public final void run() {
                    zzth.zzd(zzth.this);
                }
            });
        }
    }

    public final void zzf(MediaCodec mediaCodec) {
        boolean z8;
        if (this.zzc == null) {
            z8 = true;
        } else {
            z8 = false;
        }
        zzeq.zzf(z8);
        this.zzb.start();
        Handler handler = new Handler(this.zzb.getLooper());
        mediaCodec.setCallback(this, handler);
        this.zzc = handler;
    }

    public final void zzg() {
        synchronized (this.zza) {
            this.zzm = true;
            this.zzb.quit();
            zzi();
        }
    }
}
