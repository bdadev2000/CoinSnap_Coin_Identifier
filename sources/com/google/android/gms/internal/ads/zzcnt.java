package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class zzcnt {
    private final String zza;
    private final zzbor zzb;
    private final Executor zzc;
    private zzcny zzd;
    private final zzbjr zze = new zzcnq(this);
    private final zzbjr zzf = new zzcns(this);

    public zzcnt(String str, zzbor zzborVar, Executor executor) {
        this.zza = str;
        this.zzb = zzborVar;
        this.zzc = executor;
    }

    public static /* bridge */ /* synthetic */ boolean zzg(zzcnt zzcntVar, Map map) {
        if (map != null) {
            String str = (String) map.get("hashCode");
            if (!TextUtils.isEmpty(str) && str.equals(zzcntVar.zza)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void zzc(zzcny zzcnyVar) {
        this.zzb.zzb("/updateActiveView", this.zze);
        this.zzb.zzb("/untrackActiveViewUnit", this.zzf);
        this.zzd = zzcnyVar;
    }

    public final void zzd(zzcfk zzcfkVar) {
        zzcfkVar.zzag("/updateActiveView", this.zze);
        zzcfkVar.zzag("/untrackActiveViewUnit", this.zzf);
    }

    public final void zze() {
        this.zzb.zzc("/updateActiveView", this.zze);
        this.zzb.zzc("/untrackActiveViewUnit", this.zzf);
    }

    public final void zzf(zzcfk zzcfkVar) {
        zzcfkVar.zzaz("/updateActiveView", this.zze);
        zzcfkVar.zzaz("/untrackActiveViewUnit", this.zzf);
    }
}
