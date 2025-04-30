package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class zad extends zac {
    protected final TaskCompletionSource zaa;

    public zad(int i9, TaskCompletionSource taskCompletionSource) {
        super(i9);
        this.zaa = taskCompletionSource;
    }

    public abstract void zac(zabq zabqVar) throws RemoteException;

    @Override // com.google.android.gms.common.api.internal.zai
    public final void zad(@NonNull Status status) {
        this.zaa.trySetException(new ApiException(status));
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void zae(@NonNull Exception exc) {
        this.zaa.trySetException(exc);
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void zaf(zabq zabqVar) throws DeadObjectException {
        try {
            zac(zabqVar);
        } catch (DeadObjectException e4) {
            zad(zai.zah(e4));
            throw e4;
        } catch (RemoteException e9) {
            zad(zai.zah(e9));
        } catch (RuntimeException e10) {
            this.zaa.trySetException(e10);
        }
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public void zag(@NonNull zaad zaadVar, boolean z8) {
    }
}
