package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class zzdjg implements zzbjw {
    private final WeakReference zza;

    public /* synthetic */ zzdjg(zzdjl zzdjlVar, zzdjf zzdjfVar) {
        this.zza = new WeakReference(zzdjlVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbjw
    public final void zza(Object obj, Map map) {
        zzcxy zzcxyVar;
        zzdfy zzdfyVar;
        zzdfy zzdfyVar2;
        zzdjl zzdjlVar = (zzdjl) this.zza.get();
        if (zzdjlVar != null && "_ac".equals((String) map.get("eventName"))) {
            zzcxyVar = zzdjlVar.zzh;
            zzcxyVar.onAdClicked();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzkr)).booleanValue()) {
                zzdfyVar = zzdjlVar.zzi;
                zzdfyVar.zzdG();
                if (TextUtils.isEmpty((CharSequence) map.get("sccg"))) {
                    return;
                }
                zzdfyVar2 = zzdjlVar.zzi;
                zzdfyVar2.zzdf();
            }
        }
    }
}
