package com.google.android.gms.internal.ads;

import android.view.View;
import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public class zzdfn {
    private final zzdgv zza;

    @Nullable
    private final zzcfk zzb;

    public zzdfn(zzdgv zzdgvVar, @Nullable zzcfk zzcfkVar) {
        this.zza = zzdgvVar;
        this.zzb = zzcfkVar;
    }

    @Nullable
    public final View zza() {
        zzcfk zzcfkVar = this.zzb;
        if (zzcfkVar == null) {
            return null;
        }
        return zzcfkVar.zzG();
    }

    @Nullable
    public final View zzb() {
        zzcfk zzcfkVar = this.zzb;
        if (zzcfkVar != null) {
            return zzcfkVar.zzG();
        }
        return null;
    }

    @Nullable
    public final zzcfk zzc() {
        return this.zzb;
    }

    public final zzded zzd(Executor executor) {
        final zzcfk zzcfkVar = this.zzb;
        return new zzded(new zzdbb() { // from class: com.google.android.gms.internal.ads.zzdfm
            @Override // com.google.android.gms.internal.ads.zzdbb
            public final void zza() {
                com.google.android.gms.ads.internal.overlay.zzm zzL;
                zzcfk zzcfkVar2 = zzcfk.this;
                if (zzcfkVar2 != null && (zzL = zzcfkVar2.zzL()) != null) {
                    zzL.zzb();
                }
            }
        }, executor);
    }

    public final zzdgv zze() {
        return this.zza;
    }

    public Set zzf(zzcvj zzcvjVar) {
        return Collections.singleton(new zzded(zzcvjVar, zzcaj.zzf));
    }

    public Set zzg(zzcvj zzcvjVar) {
        return Collections.singleton(new zzded(zzcvjVar, zzcaj.zzf));
    }
}
