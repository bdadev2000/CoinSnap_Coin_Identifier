package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class zzfqr extends zzfqm {
    public zzfqr(zzfqf zzfqfVar, HashSet hashSet, JSONObject jSONObject, long j2) {
        super(zzfqfVar, hashSet, jSONObject, j2);
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        if (zzfpx.zzg(this.zzb, this.zzd.zza())) {
            return null;
        }
        this.zzd.zze(this.zzb);
        return this.zzb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfqn, android.os.AsyncTask
    /* renamed from: zza */
    public final void onPostExecute(String str) {
        zzfpd zza;
        if (!TextUtils.isEmpty(str) && (zza = zzfpd.zza()) != null) {
            for (zzfom zzfomVar : zza.zzc()) {
                if (((zzfqm) this).zza.contains(zzfomVar.zzh())) {
                    zzfomVar.zzg().zzh(str, this.zzc);
                }
            }
        }
        super.onPostExecute(str);
    }
}
