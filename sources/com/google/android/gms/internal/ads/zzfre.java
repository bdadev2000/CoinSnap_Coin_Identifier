package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzfre {
    public static final /* synthetic */ int zza = 0;
    private static volatile zzatc zzb = zzatc.UNKNOWN;
    private final Context zzc;
    private final Executor zzd;
    private final Task zze;
    private final boolean zzf;

    public zzfre(@NonNull Context context, @NonNull Executor executor, @NonNull Task task, boolean z8) {
        this.zzc = context;
        this.zzd = executor;
        this.zze = task;
        this.zzf = z8;
    }

    public static zzfre zza(@NonNull final Context context, @NonNull Executor executor, boolean z8) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        if (z8) {
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfrc
                @Override // java.lang.Runnable
                public final void run() {
                    taskCompletionSource.setResult(zzftk.zzb(context, "GLAS", null));
                }
            });
        } else {
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfrd
                @Override // java.lang.Runnable
                public final void run() {
                    TaskCompletionSource.this.setResult(zzftk.zzc());
                }
            });
        }
        return new zzfre(context, executor, taskCompletionSource.getTask(), z8);
    }

    public static void zzg(zzatc zzatcVar) {
        zzb = zzatcVar;
    }

    private final Task zzh(final int i9, long j7, Exception exc, String str, Map map, String str2) {
        if (!this.zzf) {
            return this.zze.continueWith(this.zzd, new Continuation() { // from class: com.google.android.gms.internal.ads.zzfra
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task) {
                    return Boolean.valueOf(task.isSuccessful());
                }
            });
        }
        Context context = this.zzc;
        final zzasx zza2 = zzatd.zza();
        zza2.zza(context.getPackageName());
        zza2.zzf(j7);
        zza2.zze(zzb);
        if (exc != null) {
            StringWriter stringWriter = new StringWriter();
            exc.printStackTrace(new PrintWriter(stringWriter));
            zza2.zzg(stringWriter.toString());
            zza2.zzd(exc.getClass().getName());
        }
        if (str2 != null) {
            zza2.zzb(str2);
        }
        if (str != null) {
            zza2.zzc(str);
        }
        return this.zze.continueWith(this.zzd, new Continuation() { // from class: com.google.android.gms.internal.ads.zzfrb
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                int i10 = zzfre.zza;
                if (task.isSuccessful()) {
                    int i11 = i9;
                    zzftj zza3 = ((zzftk) task.getResult()).zza(((zzatd) zzasx.this.zzbr()).zzaV());
                    zza3.zza(i11);
                    zza3.zzc();
                    return Boolean.TRUE;
                }
                return Boolean.FALSE;
            }
        });
    }

    public final Task zzb(int i9, String str) {
        return zzh(i9, 0L, null, null, null, str);
    }

    public final Task zzc(int i9, long j7, Exception exc) {
        return zzh(i9, j7, exc, null, null, null);
    }

    public final Task zzd(int i9, long j7) {
        return zzh(i9, j7, null, null, null, null);
    }

    public final Task zze(int i9, long j7, String str) {
        return zzh(i9, j7, null, null, null, str);
    }

    public final Task zzf(int i9, long j7, String str, Map map) {
        return zzh(i9, j7, null, str, null, null);
    }
}
