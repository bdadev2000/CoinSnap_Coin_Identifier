package com.google.android.gms.internal.ads;

import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zzfpg extends zzfpc {
    public zzfpg(zzfov zzfovVar, HashSet hashSet, JSONObject jSONObject, long j3) {
        super(zzfovVar, hashSet, jSONObject, j3);
    }

    private final void zzc(String str) {
        zzfnr zza = zzfnr.zza();
        if (zza != null) {
            for (zzfna zzfnaVar : zza.zzc()) {
                if (((zzfpc) this).zza.contains(zzfnaVar.zzh())) {
                    zzfnaVar.zzg().zzd(str, this.zzc);
                }
            }
        }
    }

    @Override // android.os.AsyncTask
    public final /* synthetic */ Object doInBackground(Object[] objArr) {
        return this.zzb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfpd, android.os.AsyncTask
    public final /* synthetic */ void onPostExecute(Object obj) {
        String str = (String) obj;
        zzc(str);
        super.onPostExecute(str);
    }

    @Override // com.google.android.gms.internal.ads.zzfpd
    /* renamed from: zza */
    public final void onPostExecute(String str) {
        zzc(str);
        super.onPostExecute(str);
    }
}
