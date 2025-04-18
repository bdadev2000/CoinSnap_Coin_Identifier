package com.google.android.gms.internal.ads;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zzgk {

    @Nullable
    private Uri zza;
    private Map zzb;
    private long zzc;
    private final long zzd;
    private int zze;

    public /* synthetic */ zzgk(zzgm zzgmVar, zzgj zzgjVar) {
        this.zza = zzgmVar.zza;
        this.zzb = zzgmVar.zzd;
        this.zzc = zzgmVar.zze;
        this.zzd = zzgmVar.zzf;
        this.zze = zzgmVar.zzg;
    }

    public final zzgk zza(int i2) {
        this.zze = 6;
        return this;
    }

    public final zzgk zzb(Map map) {
        this.zzb = map;
        return this;
    }

    public final zzgk zzc(long j2) {
        this.zzc = j2;
        return this;
    }

    public final zzgk zzd(Uri uri) {
        this.zza = uri;
        return this;
    }

    public final zzgm zze() {
        if (this.zza != null) {
            return new zzgm(this.zza, this.zzb, this.zzc, this.zzd, this.zze);
        }
        throw new IllegalStateException("The uri must be set.");
    }

    public zzgk() {
        this.zzb = Collections.emptyMap();
        this.zzd = -1L;
    }
}
