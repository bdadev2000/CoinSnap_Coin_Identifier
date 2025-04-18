package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zzfph extends zzfpc {
    public zzfph(zzfov zzfovVar, HashSet hashSet, JSONObject jSONObject, long j3) {
        super(zzfovVar, hashSet, jSONObject, j3);
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        if (zzfon.zzg(this.zzb, this.zzd.zza())) {
            return null;
        }
        this.zzd.zze(this.zzb);
        return this.zzb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfpd, android.os.AsyncTask
    /* renamed from: zza */
    public final void onPostExecute(String str) {
        zzfnr zza;
        if (!TextUtils.isEmpty(str) && (zza = zzfnr.zza()) != null) {
            for (zzfna zzfnaVar : zza.zzc()) {
                if (((zzfpc) this).zza.contains(zzfnaVar.zzh())) {
                    zzfnaVar.zzg().zzh(str, this.zzc);
                }
            }
        }
        super.onPostExecute(str);
    }
}
