package com.google.android.gms.internal.ads;

import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* loaded from: classes3.dex */
public final class zzftq {
    public static ua.b zza(Task task, CancellationTokenSource cancellationTokenSource) {
        final zzftp zzftpVar = new zzftp(task, null);
        task.addOnCompleteListener(zzgey.zzb(), new OnCompleteListener() { // from class: com.google.android.gms.internal.ads.zzfto
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task2) {
                zzftp zzftpVar2 = zzftp.this;
                if (task2.isCanceled()) {
                    zzftpVar2.cancel(false);
                    return;
                }
                if (task2.isSuccessful()) {
                    zzftpVar2.zzc(task2.getResult());
                    return;
                }
                Exception exception = task2.getException();
                if (exception != null) {
                    zzftpVar2.zzd(exception);
                    return;
                }
                throw new IllegalStateException();
            }
        });
        return zzftpVar;
    }
}
