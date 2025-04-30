package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;
import java.util.ArrayList;

/* loaded from: classes2.dex */
final class zzcyl implements zzdaz, zzdag {
    private final Context zza;
    private final zzfgt zzb;
    private final zzbvl zzc;

    public zzcyl(Context context, zzfgt zzfgtVar, zzbvl zzbvlVar) {
        this.zza = context;
        this.zzb = zzfgtVar;
        this.zzc = zzbvlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdag
    public final void zzdj(@Nullable Context context) {
    }

    @Override // com.google.android.gms.internal.ads.zzdag
    public final void zzdl(@Nullable Context context) {
    }

    @Override // com.google.android.gms.internal.ads.zzdag
    public final void zzdm(@Nullable Context context) {
    }

    @Override // com.google.android.gms.internal.ads.zzdaz
    public final void zzs() {
        zzbvm zzbvmVar = this.zzb.zzae;
        if (zzbvmVar != null && zzbvmVar.zza) {
            ArrayList arrayList = new ArrayList();
            if (!this.zzb.zzae.zzb.isEmpty()) {
                arrayList.add(this.zzb.zzae.zzb);
            }
        }
    }
}
