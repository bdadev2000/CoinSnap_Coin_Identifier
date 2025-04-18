package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd;
import org.json.JSONObject;

/* loaded from: classes3.dex */
final class zzdnj implements zzbfm {
    final /* synthetic */ String zza = NativeCustomFormatAd.ASSET_NAME_VIDEO;
    final /* synthetic */ zzdnk zzb;

    public zzdnj(zzdnk zzdnkVar, String str) {
        this.zzb = zzdnkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbfm
    public final JSONObject zza() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbfm
    public final JSONObject zzb() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbfm
    public final void zzc() {
        zzdit zzditVar;
        zzdit zzditVar2;
        zzdnk zzdnkVar = this.zzb;
        zzditVar = zzdnkVar.zzd;
        if (zzditVar != null) {
            String str = this.zza;
            zzditVar2 = zzdnkVar.zzd;
            zzditVar2.zzF(str);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbfm
    public final void zzd(MotionEvent motionEvent) {
    }
}
