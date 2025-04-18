package com.google.android.gms.ads.internal.offline.buffering;

import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.work.Data;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.ads.zzbph;
import com.google.android.gms.internal.ads.zzbtf;

@KeepForSdk
/* loaded from: classes4.dex */
public class OfflinePingSender extends Worker {
    private final zzbtf zza;

    public OfflinePingSender(@NonNull Context context, @NonNull WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.zza = zzbc.zza().zzo(context, new zzbph());
    }

    @Override // androidx.work.Worker
    @NonNull
    public final ListenableWorker.Result doWork() {
        try {
            this.zza.zzh();
            return new ListenableWorker.Result.Success(Data.f21866c);
        } catch (RemoteException unused) {
            return new ListenableWorker.Result.Failure();
        }
    }
}
