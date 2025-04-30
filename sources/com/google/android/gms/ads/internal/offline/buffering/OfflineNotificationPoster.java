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
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbrb;
import com.google.android.gms.internal.ads.zzbuz;
import com.mbridge.msdk.foundation.entity.CampaignEx;

@KeepForSdk
/* loaded from: classes2.dex */
public class OfflineNotificationPoster extends Worker {
    private final zzbuz zza;

    public OfflineNotificationPoster(@NonNull Context context, @NonNull WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.zza = zzay.zza().zzm(context, new zzbrb());
    }

    @Override // androidx.work.Worker
    @NonNull
    public final n doWork() {
        try {
            this.zza.zzj(ObjectWrapper.wrap(getApplicationContext()), new zza(getInputData().b("uri"), getInputData().b("gws_query_id"), getInputData().b(CampaignEx.JSON_KEY_IMAGE_URL)));
            return new m(g.f5213c);
        } catch (RemoteException unused) {
            return new k();
        }
    }
}
