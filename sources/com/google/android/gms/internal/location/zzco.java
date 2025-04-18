package com.google.android.gms.internal.location;

import android.os.RemoteException;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes3.dex */
final class zzco extends zzj {
    final /* synthetic */ TaskCompletionSource zza;
    final /* synthetic */ com.google.android.gms.location.zzu zzb;

    public zzco(TaskCompletionSource taskCompletionSource, com.google.android.gms.location.zzu zzuVar) {
        this.zza = taskCompletionSource;
        this.zzb = zzuVar;
    }

    @Override // com.google.android.gms.internal.location.zzk
    public final void zzd(zzg zzgVar) {
        TaskUtil.setResultOrApiException(zzgVar.getStatus(), this.zza);
    }

    @Override // com.google.android.gms.internal.location.zzk
    public final void zze() throws RemoteException {
        this.zzb.zze();
    }
}
