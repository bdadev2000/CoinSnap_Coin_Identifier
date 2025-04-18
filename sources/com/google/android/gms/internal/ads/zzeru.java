package com.google.android.gms.internal.ads;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: classes.dex */
public final class zzeru implements zzexh {

    @Nullable
    private final zzfdf zza;

    public zzeru(@Nullable zzfdf zzfdfVar) {
        this.zza = zzfdfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzexh
    public final int zza() {
        return 15;
    }

    @Override // com.google.android.gms.internal.ads.zzexh
    public final ListenableFuture zzb() {
        zzfdf zzfdfVar = this.zza;
        zzexg zzexgVar = null;
        if (zzfdfVar != null && zzfdfVar.zza() != null && !zzfdfVar.zza().isEmpty()) {
            zzexgVar = new zzexg() { // from class: com.google.android.gms.internal.ads.zzert
                @Override // com.google.android.gms.internal.ads.zzexg
                public final void zzj(Object obj) {
                    zzeru.this.zzc((Bundle) obj);
                }
            };
        }
        return zzgfo.zzh(zzexgVar);
    }

    public final /* synthetic */ void zzc(Bundle bundle) {
        bundle.putString("key_schema", this.zza.zza());
    }
}
