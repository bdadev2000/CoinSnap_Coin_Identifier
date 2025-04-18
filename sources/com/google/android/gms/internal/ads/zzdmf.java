package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.function.Consumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzdmf implements zzgee {
    final /* synthetic */ zzcao zza;

    public zzdmf(zzdmg zzdmgVar, zzcao zzcaoVar) {
        this.zza = zzcaoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgee
    public final void zza(Throwable th2) {
        com.google.android.gms.ads.internal.util.client.zzm.zzg("Failed to load media data due to video view load failure.");
        this.zza.zzd(th2);
    }

    @Override // com.google.android.gms.internal.ads.zzgee
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcfk zzcfkVar = (zzcfk) obj;
        if (zzcfkVar != null) {
            zzcfkVar.zzag("/video", new zzcdd(new Consumer() { // from class: com.google.android.gms.internal.ads.zzdme
                @Override // java.util.function.Consumer
                public final void accept(Object obj2) {
                    Bundle bundle = new Bundle();
                    bundle.putString("mediaUrl", (String) obj2);
                    zzdmf.this.zza.zzc(bundle);
                }
            }));
            zzcfkVar.zzaa();
        } else {
            this.zza.zzd(new zzeiz(1, "Missing webview from video view future."));
        }
    }
}
