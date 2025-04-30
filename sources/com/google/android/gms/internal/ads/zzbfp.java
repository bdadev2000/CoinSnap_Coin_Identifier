package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import org.json.JSONException;
import u.C2744m;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzbfp extends QueryInfoGenerationCallback {
    final /* synthetic */ String zza;
    final /* synthetic */ zzbfq zzb;

    public zzbfp(zzbfq zzbfqVar, String str) {
        this.zza = str;
        this.zzb = zzbfqVar;
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public final void onFailure(String str) {
        C2744m c2744m;
        com.google.android.gms.ads.internal.util.client.zzm.zzj("Failed to generate query info for Custom Tab error: ".concat(String.valueOf(str)));
        try {
            zzbfq zzbfqVar = this.zzb;
            c2744m = zzbfqVar.zze;
            c2744m.a(zzbfqVar.zzc(this.zza, str).toString());
        } catch (JSONException e4) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Error creating PACT Error Response JSON: ", e4);
        }
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public final void onSuccess(QueryInfo queryInfo) {
        C2744m c2744m;
        String query = queryInfo.getQuery();
        try {
            zzbfq zzbfqVar = this.zzb;
            c2744m = zzbfqVar.zze;
            c2744m.a(zzbfqVar.zzd(this.zza, query).toString());
        } catch (JSONException e4) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Error creating PACT Signal Response JSON: ", e4);
        }
    }
}
