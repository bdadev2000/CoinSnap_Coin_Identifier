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

/* loaded from: classes4.dex */
public final class zzfqz {
    public static final /* synthetic */ int zza = 0;
    private static volatile int zzf = 1;
    private final Context zzb;
    private final Executor zzc;
    private final Task zzd;
    private final boolean zze;

    public zzfqz(@NonNull Context context, @NonNull Executor executor, @NonNull Task task, boolean z2) {
        this.zzb = context;
        this.zzc = executor;
        this.zzd = task;
        this.zze = z2;
    }

    public static zzfqz zza(@NonNull final Context context, @NonNull Executor executor, boolean z2) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        if (z2) {
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfqx
                @Override // java.lang.Runnable
                public final void run() {
                    taskCompletionSource.setResult(zzftb.zzb(context, "GLAS", null));
                }
            });
        } else {
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfqy
                @Override // java.lang.Runnable
                public final void run() {
                    TaskCompletionSource.this.setResult(zzftb.zzc());
                }
            });
        }
        return new zzfqz(context, executor, taskCompletionSource.getTask(), z2);
    }

    public static void zzg(int i2) {
        zzf = i2;
    }

    private final Task zzh(final int i2, long j2, Exception exc, String str, Map map, String str2) {
        if (!this.zze) {
            return this.zzd.continueWith(this.zzc, new Continuation() { // from class: com.google.android.gms.internal.ads.zzfqv
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task) {
                    return Boolean.valueOf(task.isSuccessful());
                }
            });
        }
        Context context = this.zzb;
        final zzarv zza2 = zzarz.zza();
        zza2.zza(context.getPackageName());
        zza2.zze(j2);
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
        return this.zzd.continueWith(this.zzc, new Continuation() { // from class: com.google.android.gms.internal.ads.zzfqw
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                if (!task.isSuccessful()) {
                    return Boolean.FALSE;
                }
                int i3 = i2;
                zzfta zza3 = ((zzftb) task.getResult()).zza(((zzarz) zzarv.this.zzbn()).zzaV());
                zza3.zza(i3);
                zza3.zzc();
                return Boolean.TRUE;
            }
        });
    }

    public final Task zzb(int i2, String str) {
        return zzh(i2, 0L, null, null, null, str);
    }

    public final Task zzc(int i2, long j2, Exception exc) {
        return zzh(i2, j2, exc, null, null, null);
    }

    public final Task zzd(int i2, long j2) {
        return zzh(i2, j2, null, null, null, null);
    }

    public final Task zze(int i2, long j2, String str) {
        return zzh(i2, j2, null, null, null, str);
    }

    public final Task zzf(int i2, long j2, String str, Map map) {
        return zzh(i2, j2, null, str, null, null);
    }
}
