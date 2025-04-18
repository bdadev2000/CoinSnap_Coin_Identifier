package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;

/* loaded from: classes4.dex */
final class zzdzz implements zzday {
    private final Context zza;
    private final zzbyz zzb;

    public zzdzz(Context context, zzbyz zzbyzVar) {
        this.zza = context;
        this.zzb = zzbyzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzday
    public final void zzdn(zzbwa zzbwaVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzday
    public final void zzdo(zzfgt zzfgtVar) {
        if (TextUtils.isEmpty(zzfgtVar.zzb.zzb.zze)) {
            return;
        }
        this.zzb.zzm(this.zza, zzfgtVar.zza.zza.zzd);
        this.zzb.zzi(this.zza, zzfgtVar.zzb.zzb.zze);
    }
}
