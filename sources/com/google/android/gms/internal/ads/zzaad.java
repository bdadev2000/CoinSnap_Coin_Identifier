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
import java.util.concurrent.ExecutorService;

/* JADX INFO: Access modifiers changed from: package-private */
@SuppressLint({"HandlerLeak"})
/* loaded from: classes2.dex */
public final class zzaad extends Handler implements Runnable {
    final /* synthetic */ zzaai zza;
    private final zzaae zzb;
    private final long zzc;

    @Nullable
    private zzaaa zzd;

    @Nullable
    private IOException zze;
    private int zzf;

    @Nullable
    private Thread zzg;
    private boolean zzh;
    private volatile boolean zzi;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzaad(zzaai zzaaiVar, Looper looper, zzaae zzaaeVar, zzaaa zzaaaVar, int i9, long j7) {
        super(looper);
        this.zza = zzaaiVar;
        this.zzb = zzaaeVar;
        this.zzd = zzaaaVar;
        this.zzc = j7;
    }

    private final void zzd() {
        ExecutorService executorService;
        zzaad zzaadVar;
        this.zze = null;
        zzaai zzaaiVar = this.zza;
        executorService = zzaaiVar.zze;
        zzaadVar = zzaaiVar.zzf;
        zzaadVar.getClass();
        executorService.execute(zzaadVar);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i9;
        int i10;
        int i11;
        long j7;
        long min;
        if (!this.zzi) {
            int i12 = message.what;
            if (i12 == 0) {
                zzd();
                return;
            }
            if (i12 != 3) {
                this.zza.zzf = null;
                long j9 = this.zzc;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j10 = elapsedRealtime - j9;
                zzaaa zzaaaVar = this.zzd;
                zzaaaVar.getClass();
                if (this.zzh) {
                    zzaaaVar.zzJ(this.zzb, elapsedRealtime, j10, false);
                    return;
                }
                int i13 = message.what;
                if (i13 != 1) {
                    if (i13 == 2) {
                        IOException iOException = (IOException) message.obj;
                        this.zze = iOException;
                        int i14 = this.zzf + 1;
                        this.zzf = i14;
                        zzaac zzu = zzaaaVar.zzu(this.zzb, elapsedRealtime, j10, iOException, i14);
                        i9 = zzu.zza;
                        if (i9 == 3) {
                            this.zza.zzg = this.zze;
                            return;
                        }
                        i10 = zzu.zza;
                        if (i10 != 2) {
                            i11 = zzu.zza;
                            if (i11 == 1) {
                                this.zzf = 1;
                            }
                            j7 = zzu.zzb;
                            if (j7 != C.TIME_UNSET) {
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
                    zzaaaVar.zzK(this.zzb, elapsedRealtime, j10);
                    return;
                } catch (RuntimeException e4) {
                    zzfk.zzd("LoadTask", "Unexpected exception handling load completed", e4);
                    this.zza.zzg = new zzaah(e4);
                    return;
                }
            }
            throw ((Error) message.obj);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z8;
        try {
            synchronized (this) {
                z8 = !this.zzh;
                this.zzg = Thread.currentThread();
            }
            if (z8) {
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
            if (!this.zzi) {
                sendEmptyMessage(1);
            }
        } catch (IOException e4) {
            if (!this.zzi) {
                obtainMessage(2, e4).sendToTarget();
            }
        } catch (Error e9) {
            if (!this.zzi) {
                zzfk.zzd("LoadTask", "Unexpected error loading stream", e9);
                obtainMessage(3, e9).sendToTarget();
            }
            throw e9;
        } catch (Exception e10) {
            if (!this.zzi) {
                zzfk.zzd("LoadTask", "Unexpected exception loading stream", e10);
                obtainMessage(2, new zzaah(e10)).sendToTarget();
            }
        } catch (OutOfMemoryError e11) {
            if (!this.zzi) {
                zzfk.zzd("LoadTask", "OutOfMemory error loading stream", e11);
                obtainMessage(2, new zzaah(e11)).sendToTarget();
            }
        }
    }

    public final void zza(boolean z8) {
        this.zzi = z8;
        this.zze = null;
        if (hasMessages(0)) {
            this.zzh = true;
            removeMessages(0);
            if (!z8) {
                sendEmptyMessage(1);
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
        if (z8) {
            this.zza.zzf = null;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            zzaaa zzaaaVar = this.zzd;
            zzaaaVar.getClass();
            zzaaaVar.zzJ(this.zzb, elapsedRealtime, elapsedRealtime - this.zzc, true);
            this.zzd = null;
        }
    }

    public final void zzb(int i9) throws IOException {
        IOException iOException = this.zze;
        if (iOException != null && this.zzf > i9) {
            throw iOException;
        }
    }

    public final void zzc(long j7) {
        zzaad zzaadVar;
        boolean z8;
        zzaadVar = this.zza.zzf;
        if (zzaadVar == null) {
            z8 = true;
        } else {
            z8 = false;
        }
        zzeq.zzf(z8);
        this.zza.zzf = this;
        if (j7 > 0) {
            sendEmptyMessageDelayed(0, j7);
        } else {
            zzd();
        }
    }
}
