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

/* loaded from: classes3.dex */
public final class zzfpp {
    public static final /* synthetic */ int zza = 0;
    private static volatile int zzf = 1;
    private final Context zzb;
    private final Executor zzc;
    private final Task zzd;
    private final boolean zze;

    public zzfpp(@NonNull Context context, @NonNull Executor executor, @NonNull Task task, boolean z10) {
        this.zzb = context;
        this.zzc = executor;
        this.zzd = task;
        this.zze = z10;
    }

    public static zzfpp zza(@NonNull final Context context, @NonNull Executor executor, boolean z10) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        if (z10) {
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfpn
                @Override // java.lang.Runnable
                public final void run() {
                    taskCompletionSource.setResult(zzfrr.zzb(context, "GLAS", null));
                }
            });
        } else {
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfpo
                @Override // java.lang.Runnable
                public final void run() {
                    TaskCompletionSource.this.setResult(zzfrr.zzc());
                }
            });
        }
        return new zzfpp(context, executor, taskCompletionSource.getTask(), z10);
    }

    public static void zzg(int i10) {
        zzf = i10;
    }

    private final Task zzh(final int i10, long j3, Exception exc, String str, Map map, String str2) {
        if (!this.zze) {
            return this.zzd.continueWith(this.zzc, new Continuation() { // from class: com.google.android.gms.internal.ads.zzfpl
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task) {
                    return Boolean.valueOf(task.isSuccessful());
                }
            });
        }
        Context context = this.zzb;
        final zzarl zza2 = zzarp.zza();
        zza2.zza(context.getPackageName());
        zza2.zze(j3);
        zza2.zzg(zzf);
        if (exc != null) {
            StringWriter stringWriter = new StringWriter();
            exc.printStackTrace(new PrintWriter(stringWriter));
            zza2.zzf(stringWriter.toString());
            zza2.zzd(exc.getClass().getName());
        }
        if (str2 != null) {
            zza2.zzb(str2);
        }
        if (str != null) {
            zza2.zzc(str);
        }
        return this.zzd.continueWith(this.zzc, new Continuation() { // from class: com.google.android.gms.internal.ads.zzfpm
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                int i11 = zzfpp.zza;
                if (task.isSuccessful()) {
                    int i12 = i10;
                    zzfrp zza3 = ((zzfrr) task.getResult()).zza(((zzarp) zzarl.this.zzbn()).zzaV());
                    zza3.zza(i12);
                    zza3.zzc();
                    return Boolean.TRUE;
                }
                return Boolean.FALSE;
            }
        });
    }

    public final Task zzb(int i10, String str) {
        return zzh(i10, 0L, null, null, null, str);
    }

    public final Task zzc(int i10, long j3, Exception exc) {
        return zzh(i10, j3, exc, null, null, null);
    }

    public final Task zzd(int i10, long j3) {
        return zzh(i10, j3, null, null, null, null);
    }

    public final Task zze(int i10, long j3, String str) {
        return zzh(i10, j3, null, null, null, str);
    }

    public final Task zzf(int i10, long j3, String str, Map map) {
        return zzh(i10, j3, null, str, null, null);
    }
}
