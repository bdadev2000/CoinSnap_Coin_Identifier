package com.google.android.gms.internal.ads;

import android.view.View;
import androidx.annotation.Nullable;
import java.util.Collection;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzfon extends zzfoj {
    private final zzfol zza;
    private final zzfok zzb;
    private zzfqv zzd;
    private zzfps zze;
    private final String zzh;
    private final zzfpi zzc = new zzfpi();
    private boolean zzf = false;
    private boolean zzg = false;

    public zzfon(zzfok zzfokVar, zzfol zzfolVar, String str) {
        this.zzb = zzfokVar;
        this.zza = zzfolVar;
        this.zzh = str;
        zzk(null);
        if (zzfolVar.zzd() != zzfom.HTML && zzfolVar.zzd() != zzfom.JAVASCRIPT) {
            this.zze = new zzfpw(str, zzfolVar.zzi(), null);
        } else {
            this.zze = new zzfpt(str, zzfolVar.zza());
        }
        this.zze.zzn();
        zzfpe.zza().zzd(this);
        this.zze.zzf(zzfokVar);
    }

    private final void zzk(View view) {
        this.zzd = new zzfqv(view);
    }

    @Override // com.google.android.gms.internal.ads.zzfoj
    public final void zzb(View view, zzfoq zzfoqVar, @Nullable String str) {
        if (this.zzg) {
            return;
        }
        this.zzc.zzb(view, zzfoqVar, "Ad overlay");
    }

    @Override // com.google.android.gms.internal.ads.zzfoj
    public final void zzc() {
        if (this.zzg) {
            return;
        }
        this.zzd.clear();
        if (!this.zzg) {
            this.zzc.zzc();
        }
        this.zzg = true;
        this.zze.zze();
        zzfpe.zza().zze(this);
        this.zze.zzc();
        this.zze = null;
    }

    @Override // com.google.android.gms.internal.ads.zzfoj
    public final void zzd(View view) {
        if (!this.zzg && zzf() != view) {
            zzk(view);
            this.zze.zzb();
            Collection<zzfon> zzc = zzfpe.zza().zzc();
            if (zzc != null && !zzc.isEmpty()) {
                for (zzfon zzfonVar : zzc) {
                    if (zzfonVar != this && zzfonVar.zzf() == view) {
                        zzfonVar.zzd.clear();
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfoj
    public final void zze() {
        if (this.zzf) {
            return;
        }
        this.zzf = true;
        zzfpe.zza().zzf(this);
        this.zze.zzl(zzfpm.zzb().zza());
        this.zze.zzg(zzfpc.zza().zzb());
        this.zze.zzi(this, this.zza);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View zzf() {
        return (View) this.zzd.get();
    }

    public final zzfps zzg() {
        return this.zze;
    }

    public final String zzh() {
        return this.zzh;
    }

    public final List zzi() {
        return this.zzc.zza();
    }

    public final boolean zzj() {
        return this.zzf && !this.zzg;
    }
}
