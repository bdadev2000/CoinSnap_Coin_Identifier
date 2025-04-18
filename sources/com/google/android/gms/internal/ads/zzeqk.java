package com.google.android.gms.internal.ads;

import android.os.Bundle;
import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public final class zzeqk implements zzevz {

    @Nullable
    private final zzfbr zza;

    public zzeqk(@Nullable zzfbr zzfbrVar) {
        this.zza = zzfbrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzevz
    public final int zza() {
        return 15;
    }

    @Override // com.google.android.gms.internal.ads.zzevz
    public final ua.b zzb() {
        zzfbr zzfbrVar = this.zza;
        zzevy zzevyVar = null;
        if (zzfbrVar != null && zzfbrVar.zza() != null && !zzfbrVar.zza().isEmpty()) {
            zzevyVar = new zzevy() { // from class: com.google.android.gms.internal.ads.zzeqj
                @Override // com.google.android.gms.internal.ads.zzevy
                public final void zzj(Object obj) {
                    zzeqk.this.zzc((Bundle) obj);
                }
            };
        }
        return zzgei.zzh(zzevyVar);
    }

    public final /* synthetic */ void zzc(Bundle bundle) {
        bundle.putString("key_schema", this.zza.zza());
    }
}
