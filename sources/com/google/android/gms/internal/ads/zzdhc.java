package com.google.android.gms.internal.ads;

import android.view.View;
import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes4.dex */
public class zzdhc {
    private final zzdik zza;

    @Nullable
    private final zzcfo zzb;

    public zzdhc(zzdik zzdikVar, @Nullable zzcfo zzcfoVar) {
        this.zza = zzdikVar;
        this.zzb = zzcfoVar;
    }

    @Nullable
    public final View zza() {
        zzcfo zzcfoVar = this.zzb;
        if (zzcfoVar == null) {
            return null;
        }
        return zzcfoVar.zzG();
    }

    @Nullable
    public final View zzb() {
        zzcfo zzcfoVar = this.zzb;
        if (zzcfoVar != null) {
            return zzcfoVar.zzG();
        }
        return null;
    }

    @Nullable
    public final zzcfo zzc() {
        return this.zzb;
    }

    public final zzdfs zzd(Executor executor) {
        final zzcfo zzcfoVar = this.zzb;
        return new zzdfs(new zzdcq() { // from class: com.google.android.gms.internal.ads.zzdhb
            @Override // com.google.android.gms.internal.ads.zzdcq
            public final void zza() {
                com.google.android.gms.ads.internal.overlay.zzm zzL;
                zzcfo zzcfoVar2 = zzcfo.this;
                if (zzcfoVar2 == null || (zzL = zzcfoVar2.zzL()) == null) {
                    return;
                }
                zzL.zzb();
            }
        }, executor);
    }

    public final zzdik zze() {
        return this.zza;
    }

    public Set zzf(zzcwx zzcwxVar) {
        return Collections.singleton(new zzdfs(zzcwxVar, zzcan.zzf));
    }

    public Set zzg(zzcwx zzcwxVar) {
        return Collections.singleton(new zzdfs(zzcwxVar, zzcan.zzf));
    }
}
