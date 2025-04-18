package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class zzfpl implements zzfpe {
    private static zzfpl zza;
    private float zzb = 0.0f;
    private zzfoz zzc;
    private zzfpd zzd;

    public zzfpl(zzfpa zzfpaVar, zzfoy zzfoyVar) {
    }

    public static zzfpl zzb() {
        if (zza == null) {
            zza = new zzfpl(new zzfpa(), new zzfoy());
        }
        return zza;
    }

    public final float zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfpe
    public final void zzc(boolean z2) {
        if (z2) {
            zzfql.zzd().zzi();
        } else {
            zzfql.zzd().zzh();
        }
    }

    public final void zzd(Context context) {
        this.zzc = new zzfoz(new Handler(), context, new zzfox(), this);
    }

    public final void zze(float f2) {
        this.zzb = f2;
        if (this.zzd == null) {
            this.zzd = zzfpd.zza();
        }
        Iterator it = this.zzd.zzb().iterator();
        while (it.hasNext()) {
            ((zzfom) it.next()).zzg().zzl(f2);
        }
    }

    public final void zzf() {
        zzfpc.zza().zze(this);
        zzfpc.zza().zzf();
        zzfql.zzd().zzi();
        this.zzc.zza();
    }

    public final void zzg() {
        zzfql.zzd().zzj();
        zzfpc.zza().zzg();
        this.zzc.zzb();
    }
}
