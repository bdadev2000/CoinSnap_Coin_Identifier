package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd;
import org.json.JSONObject;

/* loaded from: classes3.dex */
final class zzdpa implements zzbfq {
    final /* synthetic */ String zza = NativeCustomFormatAd.ASSET_NAME_VIDEO;
    final /* synthetic */ zzdpb zzb;

    public zzdpa(zzdpb zzdpbVar, String str) {
        this.zzb = zzdpbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbfq
    public final JSONObject zza() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbfq
    public final JSONObject zzb() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbfq
    public final void zzc() {
        zzdkk zzdkkVar;
        zzdkk zzdkkVar2;
        zzdpb zzdpbVar = this.zzb;
        zzdkkVar = zzdpbVar.zzd;
        if (zzdkkVar != null) {
            String str = this.zza;
            zzdkkVar2 = zzdpbVar.zzd;
            zzdkkVar2.zzF(str);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbfq
    public final void zzd(MotionEvent motionEvent) {
    }
}
