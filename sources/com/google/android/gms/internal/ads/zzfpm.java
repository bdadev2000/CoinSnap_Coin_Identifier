package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class zzfpm implements zzfpf {
    private static zzfpm zza;
    private float zzb = 0.0f;
    private final zzfpb zzc;
    private final zzfoz zzd;
    private zzfpa zze;
    private zzfpe zzf;

    public zzfpm(zzfpb zzfpbVar, zzfoz zzfozVar) {
        this.zzc = zzfpbVar;
        this.zzd = zzfozVar;
    }

    public static zzfpm zzb() {
        if (zza == null) {
            zza = new zzfpm(new zzfpb(), new zzfoz());
        }
        return zza;
    }

    public final float zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfpf
    public final void zzc(boolean z8) {
        if (z8) {
            zzfqo.zzd().zzi();
        } else {
            zzfqo.zzd().zzh();
        }
    }

    public final void zzd(Context context) {
        this.zze = new zzfpa(new Handler(), context, new zzfoy(), this);
    }

    public final void zze(float f9) {
        this.zzb = f9;
        if (this.zzf == null) {
            this.zzf = zzfpe.zza();
        }
        Iterator it = this.zzf.zzb().iterator();
        while (it.hasNext()) {
            ((zzfon) it.next()).zzg().zzl(f9);
        }
    }

    public final void zzf() {
        zzfpd.zza().zze(this);
        zzfpd.zza().zzf();
        zzfqo.zzd().zzi();
        this.zze.zza();
    }

    public final void zzg() {
        zzfqo.zzd().zzj();
        zzfpd.zza().zzg();
        this.zze.zzb();
    }
}
