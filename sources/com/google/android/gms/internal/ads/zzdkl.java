package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzdkl implements zzblp {
    private final WeakReference zza;

    public /* synthetic */ zzdkl(zzdkq zzdkqVar, zzdkk zzdkkVar) {
        this.zza = new WeakReference(zzdkqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzblp
    public final void zza(Object obj, Map map) {
        zzczj zzczjVar;
        zzdhg zzdhgVar;
        zzdhg zzdhgVar2;
        zzdkq zzdkqVar = (zzdkq) this.zza.get();
        if (zzdkqVar != null && "_ac".equals((String) map.get("eventName"))) {
            zzczjVar = zzdkqVar.zzh;
            zzczjVar.onAdClicked();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzkM)).booleanValue()) {
                zzdhgVar = zzdkqVar.zzi;
                zzdhgVar.zzdG();
                if (!TextUtils.isEmpty((CharSequence) map.get("sccg"))) {
                    zzdhgVar2 = zzdkqVar.zzi;
                    zzdhgVar2.zzdf();
                }
            }
        }
    }
}
