package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import androidx.annotation.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzabk extends HandlerThread implements Handler.Callback {
    private zzex zza;
    private Handler zzb;

    @Nullable
    private Error zzc;

    @Nullable
    private RuntimeException zzd;

    @Nullable
    private zzabm zze;

    public zzabk() {
        super("ExoPlayer:PlaceholderSurface");
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        boolean z8;
        int i9 = message.what;
        try {
            if (i9 != 1) {
                if (i9 == 2) {
                    try {
                        zzex zzexVar = this.zza;
                        zzexVar.getClass();
                        zzexVar.zzc();
                    } finally {
                        try {
                            return true;
                        } finally {
                        }
                    }
                    return true;
                }
            } else {
                try {
                    try {
                        int i10 = message.arg1;
                        zzex zzexVar2 = this.zza;
                        zzexVar2.getClass();
                        zzexVar2.zzb(i10);
                        SurfaceTexture zza = this.zza.zza();
                        if (i10 != 0) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        this.zze = new zzabm(this, zza, z8, null);
                        synchronized (this) {
                            notify();
                        }
                    } catch (Error e4) {
                        zzfk.zzd("PlaceholderSurface", "Failed to initialize placeholder surface", e4);
                        this.zzc = e4;
                        synchronized (this) {
                            notify();
                        }
                    } catch (RuntimeException e9) {
                        zzfk.zzd("PlaceholderSurface", "Failed to initialize placeholder surface", e9);
                        this.zzd = e9;
                        synchronized (this) {
                            notify();
                        }
                    }
                } catch (zzey e10) {
                    zzfk.zzd("PlaceholderSurface", "Failed to initialize placeholder surface", e10);
                    this.zzd = new IllegalStateException(e10);
                    synchronized (this) {
                        notify();
                    }
                }
            }
            return true;
        } catch (Throwable th) {
            synchronized (this) {
                notify();
                throw th;
            }
        }
    }

    public final zzabm zza(int i9) {
        boolean z8;
        start();
        Handler handler = new Handler(getLooper(), this);
        this.zzb = handler;
        this.zza = new zzex(handler, null);
        synchronized (this) {
            z8 = false;
            this.zzb.obtainMessage(1, i9, 0).sendToTarget();
            while (this.zze == null && this.zzd == null && this.zzc == null) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                    z8 = true;
                }
            }
        }
        if (z8) {
            Thread.currentThread().interrupt();
        }
        RuntimeException runtimeException = this.zzd;
        if (runtimeException == null) {
            Error error = this.zzc;
            if (error == null) {
                zzabm zzabmVar = this.zze;
                zzabmVar.getClass();
                return zzabmVar;
            }
            throw error;
        }
        throw runtimeException;
    }

    public final void zzb() {
        Handler handler = this.zzb;
        handler.getClass();
        handler.sendEmptyMessage(2);
    }
}
