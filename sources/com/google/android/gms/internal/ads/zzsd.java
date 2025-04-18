package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.util.ArrayDeque;
import r.d;

/* JADX INFO: Access modifiers changed from: package-private */
@RequiresApi(23)
/* loaded from: classes3.dex */
public final class zzsd extends MediaCodec.Callback {
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

    @Nullable
    private zzsm zzo;
    private final Object zza = new Object();
    private final d zzd = new d();
    private final d zze = new d();
    private final ArrayDeque zzf = new ArrayDeque();
    private final ArrayDeque zzg = new ArrayDeque();

    public zzsd(HandlerThread handlerThread) {
        this.zzb = handlerThread;
    }

    public static /* synthetic */ void zzd(zzsd zzsdVar) {
        synchronized (zzsdVar.zza) {
            if (zzsdVar.zzm) {
                return;
            }
            long j3 = zzsdVar.zzl - 1;
            zzsdVar.zzl = j3;
            if (j3 > 0) {
                return;
            }
            if (j3 < 0) {
                IllegalStateException illegalStateException = new IllegalStateException();
                synchronized (zzsdVar.zza) {
                    zzsdVar.zzn = illegalStateException;
                }
                return;
            }
            zzsdVar.zzj();
        }
    }

    private final void zzi(MediaFormat mediaFormat) {
        this.zze.a(-2);
        this.zzg.add(mediaFormat);
    }

    private final void zzj() {
        if (!this.zzg.isEmpty()) {
            this.zzi = (MediaFormat) this.zzg.getLast();
        }
        d dVar = this.zzd;
        dVar.f23930c = dVar.f23929b;
        d dVar2 = this.zze;
        dVar2.f23930c = dVar2.f23929b;
        this.zzf.clear();
        this.zzg.clear();
    }

    private final void zzk() {
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
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i10) {
        zzlm zzlmVar;
        zzlm zzlmVar2;
        synchronized (this.zza) {
            this.zzd.a(i10);
            zzsm zzsmVar = this.zzo;
            if (zzsmVar != null) {
                zzsy zzsyVar = ((zzsv) zzsmVar).zza;
                zzlmVar = zzsyVar.zzo;
                if (zzlmVar != null) {
                    zzlmVar2 = zzsyVar.zzo;
                    zzlmVar2.zza();
                }
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i10, MediaCodec.BufferInfo bufferInfo) {
        zzlm zzlmVar;
        zzlm zzlmVar2;
        synchronized (this.zza) {
            MediaFormat mediaFormat = this.zzi;
            if (mediaFormat != null) {
                zzi(mediaFormat);
                this.zzi = null;
            }
            this.zze.a(i10);
            this.zzf.add(bufferInfo);
            zzsm zzsmVar = this.zzo;
            if (zzsmVar != null) {
                zzsy zzsyVar = ((zzsv) zzsmVar).zza;
                zzlmVar = zzsyVar.zzo;
                if (zzlmVar != null) {
                    zzlmVar2 = zzsyVar.zzo;
                    zzlmVar2.zza();
                }
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
        boolean z10;
        synchronized (this.zza) {
            zzk();
            int i10 = -1;
            if (zzl()) {
                return -1;
            }
            d dVar = this.zzd;
            int i11 = dVar.f23929b;
            int i12 = dVar.f23930c;
            if (i11 == i12) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                if (i11 != i12) {
                    i10 = dVar.a[i11];
                    dVar.f23929b = (i11 + 1) & dVar.f23931d;
                } else {
                    throw new ArrayIndexOutOfBoundsException();
                }
            }
            return i10;
        }
    }

    public final int zzb(MediaCodec.BufferInfo bufferInfo) {
        boolean z10;
        synchronized (this.zza) {
            zzk();
            if (zzl()) {
                return -1;
            }
            d dVar = this.zze;
            int i10 = dVar.f23929b;
            int i11 = dVar.f23930c;
            if (i10 == i11) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                return -1;
            }
            if (i10 != i11) {
                int i12 = dVar.a[i10];
                dVar.f23929b = (i10 + 1) & dVar.f23931d;
                if (i12 >= 0) {
                    zzdb.zzb(this.zzh);
                    MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) this.zzf.remove();
                    bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, bufferInfo2.presentationTimeUs, bufferInfo2.flags);
                } else if (i12 == -2) {
                    this.zzh = (MediaFormat) this.zzg.remove();
                    i12 = -2;
                }
                return i12;
            }
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public final MediaFormat zzc() {
        MediaFormat mediaFormat;
        synchronized (this.zza) {
            mediaFormat = this.zzh;
            if (mediaFormat == null) {
                throw new IllegalStateException();
            }
        }
        return mediaFormat;
    }

    public final void zze() {
        synchronized (this.zza) {
            this.zzl++;
            Handler handler = this.zzc;
            int i10 = zzen.zza;
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzsc
                @Override // java.lang.Runnable
                public final void run() {
                    zzsd.zzd(zzsd.this);
                }
            });
        }
    }

    public final void zzf(MediaCodec mediaCodec) {
        boolean z10;
        if (this.zzc == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        zzdb.zzf(z10);
        this.zzb.start();
        Handler handler = new Handler(this.zzb.getLooper());
        mediaCodec.setCallback(this, handler);
        this.zzc = handler;
    }

    public final void zzg(zzsm zzsmVar) {
        synchronized (this.zza) {
            this.zzo = zzsmVar;
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
