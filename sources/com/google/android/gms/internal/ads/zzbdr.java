package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import o.s;
import org.json.JSONException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzbdr extends QueryInfoGenerationCallback {
    final /* synthetic */ String zza;
    final /* synthetic */ zzbds zzb;

    public zzbdr(zzbds zzbdsVar, String str) {
        this.zza = str;
        this.zzb = zzbdsVar;
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public final void onFailure(String str) {
        s sVar;
        com.google.android.gms.ads.internal.util.client.zzm.zzj("Failed to generate query info for Custom Tab error: ".concat(String.valueOf(str)));
        try {
            zzbds zzbdsVar = this.zzb;
            sVar = zzbdsVar.zzg;
            sVar.b(zzbdsVar.zzc(this.zza, str).toString());
        } catch (JSONException e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Error creating PACT Error Response JSON: ", e2);
        }
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public final void onSuccess(QueryInfo queryInfo) {
        s sVar;
        String query = queryInfo.getQuery();
        try {
            zzbds zzbdsVar = this.zzb;
            sVar = zzbdsVar.zzg;
            sVar.b(zzbdsVar.zzd(this.zza, query).toString());
        } catch (JSONException e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Error creating PACT Signal Response JSON: ", e2);
        }
    }
}
