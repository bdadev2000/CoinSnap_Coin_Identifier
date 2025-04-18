package com.google.android.gms.ads.internal;

import android.os.AsyncTask;
import com.google.android.gms.internal.ads.zzavn;
import com.safedk.android.internal.partials.AdMobNetworkBridge;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes2.dex */
final class zzr extends AsyncTask {
    final /* synthetic */ zzt zza;

    public /* synthetic */ zzr(zzt zztVar, zzq zzqVar) {
        this.zza = zztVar;
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        zzt zztVar = this.zza;
        String str = (String) obj;
        if (zzt.zze(zztVar) == null || str == null) {
            return;
        }
        AdMobNetworkBridge.webviewLoadUrl(zzt.zze(zztVar), str);
    }

    @Override // android.os.AsyncTask
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final String doInBackground(Void... voidArr) {
        try {
            zzt zztVar = this.zza;
            zzt.zzv(zztVar, (zzavn) zzt.zzu(zztVar).get(1000L, TimeUnit.MILLISECONDS));
        } catch (InterruptedException e) {
            e = e;
            com.google.android.gms.ads.internal.util.client.zzm.zzk("", e);
        } catch (ExecutionException e2) {
            e = e2;
            com.google.android.gms.ads.internal.util.client.zzm.zzk("", e);
        } catch (TimeoutException e3) {
            com.google.android.gms.ads.internal.util.client.zzm.zzk("", e3);
        }
        return this.zza.zzp();
    }
}
