package com.google.android.gms.internal.ads;

import android.view.View;
import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public class zzdik {
    private final zzdjp zza;

    @Nullable
    private final zzchd zzb;

    public zzdik(zzdjp zzdjpVar, @Nullable zzchd zzchdVar) {
        this.zza = zzdjpVar;
        this.zzb = zzchdVar;
    }

    public static final zzdha zzh(zzflz zzflzVar) {
        return new zzdha(zzflzVar, zzcci.zzf);
    }

    public static final zzdha zzi(zzdju zzdjuVar) {
        return new zzdha(zzdjuVar, zzcci.zzf);
    }

    @Nullable
    public final View zza() {
        zzchd zzchdVar = this.zzb;
        if (zzchdVar == null) {
            return null;
        }
        return zzchdVar.zzG();
    }

    @Nullable
    public final View zzb() {
        zzchd zzchdVar = this.zzb;
        if (zzchdVar != null) {
            return zzchdVar.zzG();
        }
        return null;
    }

    @Nullable
    public final zzchd zzc() {
        return this.zzb;
    }

    public final zzdha zzd(Executor executor) {
        final zzchd zzchdVar = this.zzb;
        return new zzdha(new zzddy() { // from class: com.google.android.gms.internal.ads.zzdij
            @Override // com.google.android.gms.internal.ads.zzddy
            public final void zza() {
                com.google.android.gms.ads.internal.overlay.zzm zzL;
                zzchd zzchdVar2 = zzchd.this;
                if (zzchdVar2 != null && (zzL = zzchdVar2.zzL()) != null) {
                    zzL.zzb();
                }
            }
        }, executor);
    }

    public final zzdjp zze() {
        return this.zza;
    }

    public Set zzf(zzcyi zzcyiVar) {
        return Collections.singleton(new zzdha(zzcyiVar, zzcci.zzf));
    }

    public Set zzg(zzcyi zzcyiVar) {
        return Collections.singleton(new zzdha(zzcyiVar, zzcci.zzf));
    }
}
