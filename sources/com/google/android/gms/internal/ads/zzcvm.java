package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;
import java.util.ArrayList;

/* loaded from: classes3.dex */
final class zzcvm implements zzcya, zzcxh {
    private final zzfet zza;

    public zzcvm(Context context, zzfet zzfetVar, zzbtl zzbtlVar) {
        this.zza = zzfetVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcxh
    public final void zzdj(@Nullable Context context) {
    }

    @Override // com.google.android.gms.internal.ads.zzcxh
    public final void zzdl(@Nullable Context context) {
    }

    @Override // com.google.android.gms.internal.ads.zzcxh
    public final void zzdm(@Nullable Context context) {
    }

    @Override // com.google.android.gms.internal.ads.zzcya
    public final void zzs() {
        zzbtm zzbtmVar = this.zza.zzad;
        if (zzbtmVar != null && zzbtmVar.zza) {
            ArrayList arrayList = new ArrayList();
            if (!this.zza.zzad.zzb.isEmpty()) {
                arrayList.add(this.zza.zzad.zzb);
            }
        }
    }
}
