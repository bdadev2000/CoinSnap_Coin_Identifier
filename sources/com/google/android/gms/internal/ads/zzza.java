package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
@SuppressLint({"HandlerLeak"})
/* loaded from: classes3.dex */
public final class zzza extends Handler implements Runnable {
    final /* synthetic */ zzzg zza;
    private final zzzb zzb;
    private final long zzc;

    @Nullable
    private zzyy zzd;

    @Nullable
    private IOException zze;
    private int zzf;

    @Nullable
    private Thread zzg;
    private boolean zzh;
    private volatile boolean zzi;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzza(zzzg zzzgVar, Looper looper, zzzb zzzbVar, zzyy zzyyVar, int i10, long j3) {
        super(looper);
        this.zza = zzzgVar;
        this.zzb = zzzbVar;
        this.zzd = zzyyVar;
        this.zzc = j3;
    }

    private final void zzd() {
        Executor executor;
        zzza zzzaVar;
        SystemClock.elapsedRealtime();
        this.zzd.getClass();
        this.zze = null;
        zzzg zzzgVar = this.zza;
        executor = zzzgVar.zzc;
        zzzaVar = zzzgVar.zze;
        zzzaVar.getClass();
        executor.execute(zzzaVar);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i10;
        int i11;
        int i12;
        long j3;
        long min;
        if (!this.zzi) {
            int i13 = message.what;
            if (i13 == 1) {
                zzd();
                return;
            }
            if (i13 != 4) {
                this.zza.zze = null;
                long j10 = this.zzc;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j11 = elapsedRealtime - j10;
                zzyy zzyyVar = this.zzd;
                zzyyVar.getClass();
                if (this.zzh) {
                    zzyyVar.zzJ(this.zzb, elapsedRealtime, j11, false);
                    return;
                }
                int i14 = message.what;
                if (i14 != 2) {
                    if (i14 == 3) {
                        IOException iOException = (IOException) message.obj;
                        this.zze = iOException;
                        int i15 = this.zzf + 1;
                        this.zzf = i15;
                        zzyz zzu = zzyyVar.zzu(this.zzb, elapsedRealtime, j11, iOException, i15);
                        i10 = zzu.zza;
                        if (i10 == 3) {
                            this.zza.zzf = this.zze;
                            return;
                        }
                        i11 = zzu.zza;
                        if (i11 != 2) {
                            i12 = zzu.zza;
                            if (i12 == 1) {
                                this.zzf = 1;
                            }
                            j3 = zzu.zzb;
                            if (j3 != C.TIME_UNSET) {
                                min = zzu.zzb;
                            } else {
                                min = Math.min((this.zzf - 1) * 1000, 5000);
                            }
                            zzc(min);
                            return;
                        }
                        return;
                    }
                    return;
                }
                try {
                    zzyyVar.zzK(this.zzb, elapsedRealtime, j11);
                    return;
                } catch (RuntimeException e2) {
                    zzdt.zzd("LoadTask", "Unexpected exception handling load completed", e2);
                    this.zza.zzf = new zzze(e2);
                    return;
                }
            }
            throw ((Error) message.obj);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        try {
            synchronized (this) {
                z10 = !this.zzh;
                this.zzg = Thread.currentThread();
            }
            if (z10) {
                Trace.beginSection("load:".concat(this.zzb.getClass().getSimpleName()));
                try {
                    this.zzb.zzh();
                    Trace.endSection();
                } catch (Throwable th2) {
                    Trace.endSection();
                    throw th2;
                }
            }
            synchronized (this) {
                this.zzg = null;
                Thread.interrupted();
            }
            if (!this.zzi) {
                sendEmptyMessage(2);
            }
        } catch (IOException e2) {
            if (!this.zzi) {
                obtainMessage(3, e2).sendToTarget();
            }
        } catch (Exception e10) {
            if (!this.zzi) {
                zzdt.zzd("LoadTask", "Unexpected exception loading stream", e10);
                obtainMessage(3, new zzze(e10)).sendToTarget();
            }
        } catch (OutOfMemoryError e11) {
            if (!this.zzi) {
                zzdt.zzd("LoadTask", "OutOfMemory error loading stream", e11);
                obtainMessage(3, new zzze(e11)).sendToTarget();
            }
        } catch (Error e12) {
            if (!this.zzi) {
                zzdt.zzd("LoadTask", "Unexpected error loading stream", e12);
                obtainMessage(4, e12).sendToTarget();
            }
            throw e12;
        }
    }

    public final void zza(boolean z10) {
        this.zzi = z10;
        this.zze = null;
        if (hasMessages(1)) {
            this.zzh = true;
            removeMessages(1);
            if (!z10) {
                sendEmptyMessage(2);
            }
        } else {
            synchronized (this) {
                this.zzh = true;
                this.zzb.zzg();
                Thread thread = this.zzg;
                if (thread != null) {
                    thread.interrupt();
                }
            }
        }
        if (z10) {
            this.zza.zze = null;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            zzyy zzyyVar = this.zzd;
            zzyyVar.getClass();
            zzyyVar.zzJ(this.zzb, elapsedRealtime, elapsedRealtime - this.zzc, true);
            this.zzd = null;
        }
    }

    public final void zzb(int i10) throws IOException {
        IOException iOException = this.zze;
        if (iOException != null && this.zzf > i10) {
            throw iOException;
        }
    }

    public final void zzc(long j3) {
        zzza zzzaVar;
        boolean z10;
        zzzaVar = this.zza.zze;
        if (zzzaVar == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        zzdb.zzf(z10);
        this.zza.zze = this;
        if (j3 > 0) {
            sendEmptyMessageDelayed(1, j3);
        } else {
            zzd();
        }
    }
}
