package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class zzfnz implements zzfns {
    private static zzfnz zza;
    private float zzb = 0.0f;
    private zzfnn zzc;
    private zzfnr zzd;

    public zzfnz(zzfno zzfnoVar, zzfnm zzfnmVar) {
    }

    public static zzfnz zzb() {
        if (zza == null) {
            zza = new zzfnz(new zzfno(), new zzfnm());
        }
        return zza;
    }

    public final float zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfns
    public final void zzc(boolean z10) {
        if (z10) {
            zzfpb.zzd().zzi();
        } else {
            zzfpb.zzd().zzh();
        }
    }

    public final void zzd(Context context) {
        this.zzc = new zzfnn(new Handler(), context, new zzfnl(), this);
    }

    public final void zze(float f10) {
        this.zzb = f10;
        if (this.zzd == null) {
            this.zzd = zzfnr.zza();
        }
        Iterator it = this.zzd.zzb().iterator();
        while (it.hasNext()) {
            ((zzfna) it.next()).zzg().zzl(f10);
        }
    }

    public final void zzf() {
        zzfnq.zza().zze(this);
        zzfnq.zza().zzf();
        zzfpb.zzd().zzi();
        this.zzc.zza();
    }

    public final void zzg() {
        zzfpb.zzd().zzj();
        zzfnq.zza().zzg();
        this.zzc.zzb();
    }
}
