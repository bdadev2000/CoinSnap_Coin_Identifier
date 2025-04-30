package com.google.android.gms.ads.internal;

import android.os.AsyncTask;
import com.google.android.gms.internal.ads.zzaxd;
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
        if (zzt.zze(zztVar) != null && str != null) {
            zzt.zze(zztVar).loadUrl(str);
        }
    }

    @Override // android.os.AsyncTask
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final String doInBackground(Void... voidArr) {
        try {
            zzt zztVar = this.zza;
            zzt.zzv(zztVar, (zzaxd) zzt.zzu(zztVar).get(1000L, TimeUnit.MILLISECONDS));
        } catch (InterruptedException e4) {
            e = e4;
            com.google.android.gms.ads.internal.util.client.zzm.zzk("", e);
        } catch (ExecutionException e9) {
            e = e9;
            com.google.android.gms.ads.internal.util.client.zzm.zzk("", e);
        } catch (TimeoutException e10) {
            com.google.android.gms.ads.internal.util.client.zzm.zzk("", e10);
        }
        return this.zza.zzp();
    }
}
