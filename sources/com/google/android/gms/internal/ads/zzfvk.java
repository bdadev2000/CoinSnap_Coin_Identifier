package com.google.android.gms.internal.ads;

import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* loaded from: classes2.dex */
public final class zzfvk {
    public static f4.c zza(Task task, CancellationTokenSource cancellationTokenSource) {
        final zzfvj zzfvjVar = new zzfvj(task, null);
        task.addOnCompleteListener(zzggk.zzb(), new OnCompleteListener() { // from class: com.google.android.gms.internal.ads.zzfvi
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task2) {
                zzfvj zzfvjVar2 = zzfvj.this;
                if (task2.isCanceled()) {
                    zzfvjVar2.cancel(false);
                    return;
                }
                if (task2.isSuccessful()) {
                    zzfvjVar2.zzc(task2.getResult());
                    return;
                }
                Exception exception = task2.getException();
                if (exception != null) {
                    zzfvjVar2.zzd(exception);
                    return;
                }
                throw new IllegalStateException();
            }
        });
        return zzfvjVar;
    }
}
