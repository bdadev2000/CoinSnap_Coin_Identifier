package com.google.android.gms.internal.ads;

import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzfqt extends zzfqp {
    public zzfqt(zzfqi zzfqiVar, HashSet hashSet, JSONObject jSONObject, long j7) {
        super(zzfqiVar, hashSet, jSONObject, j7);
    }

    private final void zzc(String str) {
        zzfpe zza = zzfpe.zza();
        if (zza != null) {
            for (zzfon zzfonVar : zza.zzc()) {
                if (((zzfqp) this).zza.contains(zzfonVar.zzh())) {
                    zzfonVar.zzg().zzd(str, this.zzc);
                }
            }
        }
    }

    @Override // android.os.AsyncTask
    public final /* synthetic */ Object doInBackground(Object[] objArr) {
        return this.zzb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfqq, android.os.AsyncTask
    public final /* synthetic */ void onPostExecute(Object obj) {
        String str = (String) obj;
        zzc(str);
        super.onPostExecute(str);
    }

    @Override // com.google.android.gms.internal.ads.zzfqq
    /* renamed from: zza */
    public final void onPostExecute(String str) {
        zzc(str);
        super.onPostExecute(str);
    }
}
