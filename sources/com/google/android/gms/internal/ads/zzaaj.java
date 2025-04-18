package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import androidx.annotation.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzaaj extends HandlerThread implements Handler.Callback {
    private zzdi zza;
    private Handler zzb;

    @Nullable
    private Error zzc;

    @Nullable
    private RuntimeException zzd;

    @Nullable
    private zzaal zze;

    public zzaaj() {
        super("ExoPlayer:PlaceholderSurface");
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        boolean z10;
        int i10 = message.what;
        try {
            if (i10 != 1) {
                if (i10 == 2) {
                    try {
                        zzdi zzdiVar = this.zza;
                        zzdiVar.getClass();
                        zzdiVar.zzc();
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
                        int i11 = message.arg1;
                        zzdi zzdiVar2 = this.zza;
                        zzdiVar2.getClass();
                        zzdiVar2.zzb(i11);
                        SurfaceTexture zza = this.zza.zza();
                        if (i11 != 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        this.zze = new zzaal(this, zza, z10, null);
                        synchronized (this) {
                            notify();
                        }
                    } catch (Error e2) {
                        zzdt.zzd("PlaceholderSurface", "Failed to initialize placeholder surface", e2);
                        this.zzc = e2;
                        synchronized (this) {
                            notify();
                        }
                    } catch (RuntimeException e10) {
                        zzdt.zzd("PlaceholderSurface", "Failed to initialize placeholder surface", e10);
                        this.zzd = e10;
                        synchronized (this) {
                            notify();
                        }
                    }
                } catch (zzdj e11) {
                    zzdt.zzd("PlaceholderSurface", "Failed to initialize placeholder surface", e11);
                    this.zzd = new IllegalStateException(e11);
                    synchronized (this) {
                        notify();
                    }
                }
            }
            return true;
        } catch (Throwable th2) {
            synchronized (this) {
                notify();
                throw th2;
            }
        }
    }

    public final zzaal zza(int i10) {
        boolean z10;
        start();
        Handler handler = new Handler(getLooper(), this);
        this.zzb = handler;
        this.zza = new zzdi(handler, null);
        synchronized (this) {
            z10 = false;
            this.zzb.obtainMessage(1, i10, 0).sendToTarget();
            while (this.zze == null && this.zzd == null && this.zzc == null) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                    z10 = true;
                }
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        RuntimeException runtimeException = this.zzd;
        if (runtimeException == null) {
            Error error = this.zzc;
            if (error == null) {
                zzaal zzaalVar = this.zze;
                zzaalVar.getClass();
                return zzaalVar;
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
