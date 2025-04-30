package com.google.android.gms.internal.ads;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzhf {

    @Nullable
    private Uri zza;
    private Map zzb;
    private long zzc;
    private final long zzd;
    private int zze;

    public /* synthetic */ zzhf(zzhh zzhhVar, zzhe zzheVar) {
        this.zza = zzhhVar.zza;
        this.zzb = zzhhVar.zzd;
        this.zzc = zzhhVar.zze;
        this.zzd = zzhhVar.zzf;
        this.zze = zzhhVar.zzg;
    }

    public final zzhf zza(int i9) {
        this.zze = 6;
        return this;
    }

    public final zzhf zzb(Map map) {
        this.zzb = map;
        return this;
    }

    public final zzhf zzc(long j7) {
        this.zzc = j7;
        return this;
    }

    public final zzhf zzd(Uri uri) {
        this.zza = uri;
        return this;
    }

    public final zzhh zze() {
        if (this.zza != null) {
            return new zzhh(this.zza, this.zzb, this.zzc, this.zzd, this.zze);
        }
        throw new IllegalStateException("The uri must be set.");
    }

    public zzhf() {
        this.zzb = Collections.emptyMap();
        this.zzd = -1L;
    }
}
