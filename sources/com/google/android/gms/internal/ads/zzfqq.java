package com.google.android.gms.internal.ads;

import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class zzfqq extends zzfqm {
    public zzfqq(zzfqf zzfqfVar, HashSet hashSet, JSONObject jSONObject, long j2) {
        super(zzfqfVar, hashSet, jSONObject, j2);
    }

    private final void zzc(String str) {
        zzfpd zza = zzfpd.zza();
        if (zza != null) {
            for (zzfom zzfomVar : zza.zzc()) {
                if (((zzfqm) this).zza.contains(zzfomVar.zzh())) {
                    zzfomVar.zzg().zzd(str, this.zzc);
                }
            }
        }
    }

    @Override // android.os.AsyncTask
    public final /* synthetic */ Object doInBackground(Object[] objArr) {
        return this.zzb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfqn, android.os.AsyncTask
    public final /* synthetic */ void onPostExecute(Object obj) {
        String str = (String) obj;
        zzc(str);
        super.onPostExecute(str);
    }

    @Override // com.google.android.gms.internal.ads.zzfqn
    /* renamed from: zza */
    public final void onPostExecute(String str) {
        zzc(str);
        super.onPostExecute(str);
    }
}
