package com.google.android.gms.ads.internal.offline.buffering;

import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.g;
import androidx.work.k;
import androidx.work.m;
import androidx.work.n;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.ads.zzbrb;
import com.google.android.gms.internal.ads.zzbuz;

@KeepForSdk
/* loaded from: classes2.dex */
public class OfflinePingSender extends Worker {
    private final zzbuz zza;

    public OfflinePingSender(@NonNull Context context, @NonNull WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.zza = zzay.zza().zzm(context, new zzbrb());
    }

    @Override // androidx.work.Worker
    @NonNull
    public final n doWork() {
        try {
            this.zza.zzh();
            return new m(g.f5213c);
        } catch (RemoteException unused) {
            return new k();
        }
    }
}
