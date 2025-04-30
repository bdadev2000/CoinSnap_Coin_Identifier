package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzdpz implements zzbhj {
    final /* synthetic */ String zza = NativeCustomFormatAd.ASSET_NAME_VIDEO;
    final /* synthetic */ zzdqa zzb;

    public zzdpz(zzdqa zzdqaVar, String str) {
        this.zzb = zzdqaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbhj
    public final JSONObject zza() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbhj
    public final JSONObject zzb() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbhj
    public final void zzc() {
        zzdlo zzdloVar;
        zzdlo zzdloVar2;
        zzdqa zzdqaVar = this.zzb;
        zzdloVar = zzdqaVar.zzd;
        if (zzdloVar != null) {
            String str = this.zza;
            zzdloVar2 = zzdqaVar.zzd;
            zzdloVar2.zzF(str);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbhj
    public final void zzd(MotionEvent motionEvent) {
    }
}
