package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;

/* loaded from: classes3.dex */
public final class zzeli {
    private final zzdgn zza;

    public zzeli(zzdgn zzdgnVar) {
        this.zza = zzdgnVar;
    }

    public final /* bridge */ /* synthetic */ Object zza(zzfff zzfffVar, zzfet zzfetVar, View view, zzele zzeleVar) {
        zzelg zzelgVar = new zzelg(this, new zzdgv() { // from class: com.google.android.gms.internal.ads.zzelf
            @Override // com.google.android.gms.internal.ads.zzdgv
            public final void zza(boolean z10, Context context, zzcwz zzcwzVar) {
            }
        });
        zzdfk zze = this.zza.zze(new zzcsg(zzfffVar, zzfetVar, null), zzelgVar);
        zzeleVar.zzd(new zzelh(this, zze));
        return zze.zzg();
    }
}
