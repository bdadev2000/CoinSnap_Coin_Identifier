package com.google.android.gms.internal.ads;

import java.util.function.Consumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzdnw implements zzgfk {
    final /* synthetic */ zzcas zza;

    public zzdnw(zzdnx zzdnxVar, zzcas zzcasVar) {
        this.zza = zzcasVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgfk
    public final void zza(Throwable th) {
        com.google.android.gms.ads.internal.util.client.zzm.zzg("Failed to load media data due to video view load failure.");
        this.zza.zzd(th);
    }

    @Override // com.google.android.gms.internal.ads.zzgfk
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcfo zzcfoVar = (zzcfo) obj;
        if (zzcfoVar == null) {
            this.zza.zzd(new zzeki(1, "Missing webview from video view future."));
        } else {
            zzcfoVar.zzag("/video", new zzcdh(new Consumer() { // from class: com.google.android.gms.internal.ads.zzdnv
                @Override // java.util.function.Consumer
                public final void accept(Object obj2) {
                    zzdnw.this.zza.zzc(androidx.compose.foundation.text.input.a.c("mediaUrl", (String) obj2));
                }
            }));
            zzcfoVar.zzaa();
        }
    }
}
