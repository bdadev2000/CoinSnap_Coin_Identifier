package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;
import java.util.ArrayList;

/* loaded from: classes2.dex */
final class zzcxa implements zzczo, zzcyv {
    private final zzfgh zza;

    public zzcxa(Context context, zzfgh zzfghVar, zzbtr zzbtrVar) {
        this.zza = zzfghVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcyv
    public final void zzdj(@Nullable Context context) {
    }

    @Override // com.google.android.gms.internal.ads.zzcyv
    public final void zzdl(@Nullable Context context) {
    }

    @Override // com.google.android.gms.internal.ads.zzcyv
    public final void zzdm(@Nullable Context context) {
    }

    @Override // com.google.android.gms.internal.ads.zzczo
    public final void zzs() {
        zzbts zzbtsVar = this.zza.zzad;
        if (zzbtsVar == null || !zzbtsVar.zza) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (this.zza.zzad.zzb.isEmpty()) {
            return;
        }
        arrayList.add(this.zza.zzad.zzb);
    }
}
