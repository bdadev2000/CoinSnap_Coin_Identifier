package com.google.android.gms.internal.ads;

import android.os.Bundle;
import androidx.annotation.Nullable;

/* loaded from: classes2.dex */
public final class zzesr implements zzexw {

    @Nullable
    private final zzfdr zza;

    public zzesr(@Nullable zzfdr zzfdrVar) {
        this.zza = zzfdrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzexw
    public final int zza() {
        return 15;
    }

    @Override // com.google.android.gms.internal.ads.zzexw
    public final f4.c zzb() {
        zzfdr zzfdrVar = this.zza;
        zzexv zzexvVar = null;
        if (zzfdrVar != null && zzfdrVar.zza() != null && !zzfdrVar.zza().isEmpty()) {
            zzexvVar = new zzexv() { // from class: com.google.android.gms.internal.ads.zzesq
                @Override // com.google.android.gms.internal.ads.zzexv
                public final void zzj(Object obj) {
                    zzesr.this.zzc((Bundle) obj);
                }
            };
        }
        return zzgft.zzh(zzexvVar);
    }

    public final /* synthetic */ void zzc(Bundle bundle) {
        bundle.putString("key_schema", this.zza.zza());
    }
}
