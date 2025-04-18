package com.google.android.gms.ads.internal.offline.buffering;

import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.h;
import androidx.work.l;
import androidx.work.n;
import androidx.work.o;
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.ads.zzbpc;
import com.google.android.gms.internal.ads.zzbsz;

@KeepForSdk
/* loaded from: classes3.dex */
public class OfflinePingSender extends Worker {
    private final zzbsz zza;

    public OfflinePingSender(@NonNull Context context, @NonNull WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.zza = zzbc.zza().zzo(context, new zzbpc());
    }

    @Override // androidx.work.Worker
    @NonNull
    public final o doWork() {
        try {
            this.zza.zzh();
            return new n(h.f2197c);
        } catch (RemoteException unused) {
            return new l();
        }
    }
}
