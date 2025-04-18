package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
@SuppressLint({"HandlerLeak"})
/* loaded from: classes2.dex */
public final class zzzj extends Handler implements Runnable {
    final /* synthetic */ zzzo zza;
    private final zzzk zzb;
    private final long zzc;

    @Nullable
    private zzzg zzd;

    @Nullable
    private IOException zze;
    private int zzf;

    @Nullable
    private Thread zzg;
    private boolean zzh;
    private volatile boolean zzi;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzzj(zzzo zzzoVar, Looper looper, zzzk zzzkVar, zzzg zzzgVar, int i2, long j2) {
        super(looper);
        this.zza = zzzoVar;
        this.zzb = zzzkVar;
        this.zzd = zzzgVar;
        this.zzc = j2;
    }

    private final void zzd() {
        Executor executor;
        zzzj zzzjVar;
        this.zze = null;
        zzzo zzzoVar = this.zza;
        executor = zzzoVar.zzc;
        zzzjVar = zzzoVar.zze;
        zzzjVar.getClass();
        executor.execute(zzzjVar);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i2;
        int i3;
        int i4;
        long j2;
        if (this.zzi) {
            return;
        }
        int i5 = message.what;
        if (i5 == 1) {
            zzd();
            return;
        }
        if (i5 == 4) {
            throw ((Error) message.obj);
        }
        this.zza.zze = null;
        long j3 = this.zzc;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j4 = elapsedRealtime - j3;
        zzzg zzzgVar = this.zzd;
        zzzgVar.getClass();
        if (this.zzh) {
            zzzgVar.zzJ(this.zzb, elapsedRealtime, j4, false);
            return;
        }
        int i6 = message.what;
        if (i6 == 2) {
            try {
                zzzgVar.zzK(this.zzb, elapsedRealtime, j4);
                return;
            } catch (RuntimeException e) {
                zzea.zzd("LoadTask", "Unexpected exception handling load completed", e);
                this.zza.zzf = new zzzn(e);
                return;
            }
        }
        if (i6 != 3) {
            return;
        }
        IOException iOException = (IOException) message.obj;
        this.zze = iOException;
        int i7 = this.zzf + 1;
        this.zzf = i7;
        zzzi zzu = zzzgVar.zzu(this.zzb, elapsedRealtime, j4, iOException, i7);
        i2 = zzu.zza;
        if (i2 == 3) {
            this.zza.zzf = this.zze;
            return;
        }
        i3 = zzu.zza;
        if (i3 != 2) {
            i4 = zzu.zza;
            if (i4 == 1) {
                this.zzf = 1;
            }
            j2 = zzu.zzb;
            zzc(j2 != -9223372036854775807L ? zzu.zzb : Math.min((this.zzf - 1) * 1000, 5000));
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z2;
        try {
            synchronized (this) {
                z2 = !this.zzh;
                this.zzg = Thread.currentThread();
            }
            if (z2) {
                Trace.beginSection("load:".concat(this.zzb.getClass().getSimpleName()));
                try {
                    this.zzb.zzh();
                    Trace.endSection();
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            }
            synchronized (this) {
                this.zzg = null;
                Thread.interrupted();
            }
            if (this.zzi) {
                return;
            }
            sendEmptyMessage(2);
        } catch (IOException e) {
            if (this.zzi) {
                return;
            }
            obtainMessage(3, e).sendToTarget();
        } catch (Error e2) {
            if (!this.zzi) {
                zzea.zzd("LoadTask", "Unexpected error loading stream", e2);
                obtainMessage(4, e2).sendToTarget();
            }
            throw e2;
        } catch (Exception e3) {
            if (this.zzi) {
                return;
            }
            zzea.zzd("LoadTask", "Unexpected exception loading stream", e3);
            obtainMessage(3, new zzzn(e3)).sendToTarget();
        } catch (OutOfMemoryError e4) {
            if (this.zzi) {
                return;
            }
            zzea.zzd("LoadTask", "OutOfMemory error loading stream", e4);
            obtainMessage(3, new zzzn(e4)).sendToTarget();
        }
    }

    public final void zza(boolean z2) {
        this.zzi = z2;
        this.zze = null;
        if (hasMessages(1)) {
            this.zzh = true;
            removeMessages(1);
            if (!z2) {
                sendEmptyMessage(2);
            }
        } else {
            synchronized (this) {
                try {
                    this.zzh = true;
                    this.zzb.zzg();
                    Thread thread = this.zzg;
                    if (thread != null) {
                        thread.interrupt();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (z2) {
            this.zza.zze = null;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            zzzg zzzgVar = this.zzd;
            zzzgVar.getClass();
            zzzgVar.zzJ(this.zzb, elapsedRealtime, elapsedRealtime - this.zzc, true);
            this.zzd = null;
        }
    }

    public final void zzb(int i2) throws IOException {
        IOException iOException = this.zze;
        if (iOException != null && this.zzf > i2) {
            throw iOException;
        }
    }

    public final void zzc(long j2) {
        zzzj zzzjVar;
        zzzjVar = this.zza.zze;
        zzdi.zzf(zzzjVar == null);
        this.zza.zze = this;
        if (j2 > 0) {
            sendEmptyMessageDelayed(1, j2);
        } else {
            zzd();
        }
    }
}
