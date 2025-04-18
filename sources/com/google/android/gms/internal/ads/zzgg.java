package com.google.android.gms.internal.ads;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zzgg {

    @Nullable
    private Uri zza;
    private Map zzb;
    private long zzc;
    private final long zzd;
    private int zze;

    public /* synthetic */ zzgg(zzgi zzgiVar, zzgh zzghVar) {
        this.zza = zzgiVar.zza;
        this.zzb = zzgiVar.zzd;
        this.zzc = zzgiVar.zze;
        this.zzd = zzgiVar.zzf;
        this.zze = zzgiVar.zzg;
    }

    public final zzgg zza(int i10) {
        this.zze = 6;
        return this;
    }

    public final zzgg zzb(Map map) {
        this.zzb = map;
        return this;
    }

    public final zzgg zzc(long j3) {
        this.zzc = j3;
        return this;
    }

    public final zzgg zzd(Uri uri) {
        this.zza = uri;
        return this;
    }

    public final zzgi zze() {
        if (this.zza != null) {
            return new zzgi(this.zza, this.zzb, this.zzc, this.zzd, this.zze);
        }
        throw new IllegalStateException("The uri must be set.");
    }

    public zzgg() {
        this.zzb = Collections.emptyMap();
        this.zzd = -1L;
    }
}
