package com.google.android.play.core.appupdate;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.install.InstallException;

/* loaded from: classes2.dex */
final class zzp extends zzo {
    public zzp(zzr zzrVar, TaskCompletionSource taskCompletionSource) {
        super(zzrVar, new com.google.android.play.core.appupdate.internal.zzm("OnCompleteUpdateCallback"), taskCompletionSource);
    }

    @Override // com.google.android.play.core.appupdate.zzo, com.google.android.play.core.appupdate.internal.zzh
    public final void zzb(Bundle bundle) throws RemoteException {
        int i2;
        int i3;
        super.zzb(bundle);
        i2 = bundle.getInt("error.code", -2);
        if (i2 == 0) {
            this.zzb.trySetResult(null);
            return;
        }
        TaskCompletionSource taskCompletionSource = this.zzb;
        i3 = bundle.getInt("error.code", -2);
        taskCompletionSource.trySetException(new InstallException(i3));
    }
}
