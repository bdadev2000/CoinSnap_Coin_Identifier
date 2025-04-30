package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzfqu extends zzfqp {
    public zzfqu(zzfqi zzfqiVar, HashSet hashSet, JSONObject jSONObject, long j7) {
        super(zzfqiVar, hashSet, jSONObject, j7);
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        if (zzfpy.zzg(this.zzb, this.zzd.zza())) {
            return null;
        }
        this.zzd.zze(this.zzb);
        return this.zzb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfqq, android.os.AsyncTask
    /* renamed from: zza */
    public final void onPostExecute(String str) {
        zzfpe zza;
        if (!TextUtils.isEmpty(str) && (zza = zzfpe.zza()) != null) {
            for (zzfon zzfonVar : zza.zzc()) {
                if (((zzfqp) this).zza.contains(zzfonVar.zzh())) {
                    zzfonVar.zzg().zzh(str, this.zzc);
                }
            }
        }
        super.onPostExecute(str);
    }
}
