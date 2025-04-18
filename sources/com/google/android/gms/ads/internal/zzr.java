package com.google.android.gms.ads.internal;

import android.os.AsyncTask;
import com.google.android.gms.internal.ads.zzavc;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes3.dex */
final class zzr extends AsyncTask {
    final /* synthetic */ zzu zza;

    public /* synthetic */ zzr(zzu zzuVar, zzt zztVar) {
        this.zza = zzuVar;
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        zzu zzuVar = this.zza;
        String str = (String) obj;
        if (zzu.zze(zzuVar) != null && str != null) {
            zzu.zze(zzuVar).loadUrl(str);
        }
    }

    @Override // android.os.AsyncTask
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final String doInBackground(Void... voidArr) {
        try {
            zzu zzuVar = this.zza;
            zzu.zzv(zzuVar, (zzavc) zzu.zzu(zzuVar).get(1000L, TimeUnit.MILLISECONDS));
        } catch (InterruptedException e2) {
            e = e2;
            com.google.android.gms.ads.internal.util.client.zzm.zzk("", e);
        } catch (ExecutionException e10) {
            e = e10;
            com.google.android.gms.ads.internal.util.client.zzm.zzk("", e);
        } catch (TimeoutException e11) {
            com.google.android.gms.ads.internal.util.client.zzm.zzk("", e11);
        }
        return this.zza.zzp();
    }
}
