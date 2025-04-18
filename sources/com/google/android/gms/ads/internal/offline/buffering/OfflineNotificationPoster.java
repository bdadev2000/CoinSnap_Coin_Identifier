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
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbpc;
import com.google.android.gms.internal.ads.zzbsz;
import com.mbridge.msdk.foundation.entity.CampaignEx;

@KeepForSdk
/* loaded from: classes3.dex */
public class OfflineNotificationPoster extends Worker {
    private final zzbsz zza;

    public OfflineNotificationPoster(@NonNull Context context, @NonNull WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.zza = zzbc.zza().zzo(context, new zzbpc());
    }

    @Override // androidx.work.Worker
    @NonNull
    public final o doWork() {
        try {
            this.zza.zzj(ObjectWrapper.wrap(getApplicationContext()), new zza(getInputData().b("uri"), getInputData().b("gws_query_id"), getInputData().b(CampaignEx.JSON_KEY_IMAGE_URL)));
            return new n(h.f2197c);
        } catch (RemoteException unused) {
            return new l();
        }
    }
}
