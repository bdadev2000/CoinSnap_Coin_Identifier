package com.google.android.gms.internal.ads;

import android.view.View;
import androidx.annotation.Nullable;
import java.util.Collection;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzfna extends zzfmw {
    private final zzfmy zza;
    private zzfpi zzc;
    private zzfoh zzd;
    private final String zzg;
    private final zzfnv zzb = new zzfnv();
    private boolean zze = false;
    private boolean zzf = false;

    public zzfna(zzfmx zzfmxVar, zzfmy zzfmyVar, String str) {
        this.zza = zzfmyVar;
        this.zzg = str;
        zzk(null);
        if (zzfmyVar.zzd() != zzfmz.HTML && zzfmyVar.zzd() != zzfmz.JAVASCRIPT) {
            this.zzd = new zzfol(str, zzfmyVar.zzi(), null);
        } else {
            this.zzd = new zzfoi(str, zzfmyVar.zza());
        }
        this.zzd.zzo();
        zzfnr.zza().zzd(this);
        this.zzd.zzf(zzfmxVar);
    }

    private final void zzk(@Nullable View view) {
        this.zzc = new zzfpi(view);
    }

    @Override // com.google.android.gms.internal.ads.zzfmw
    public final void zzb(View view, zzfnd zzfndVar, @Nullable String str) {
        if (this.zzf) {
            return;
        }
        this.zzb.zzb(view, zzfndVar, "Ad overlay");
    }

    @Override // com.google.android.gms.internal.ads.zzfmw
    public final void zzc() {
        if (this.zzf) {
            return;
        }
        this.zzc.clear();
        if (!this.zzf) {
            this.zzb.zzc();
        }
        this.zzf = true;
        this.zzd.zze();
        zzfnr.zza().zze(this);
        this.zzd.zzc();
        this.zzd = null;
    }

    @Override // com.google.android.gms.internal.ads.zzfmw
    public final void zzd(@Nullable View view) {
        if (!this.zzf && zzf() != view) {
            zzk(view);
            this.zzd.zzb();
            Collection<zzfna> zzc = zzfnr.zza().zzc();
            if (zzc != null && !zzc.isEmpty()) {
                for (zzfna zzfnaVar : zzc) {
                    if (zzfnaVar != this && zzfnaVar.zzf() == view) {
                        zzfnaVar.zzc.clear();
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfmw
    public final void zze() {
        if (this.zze) {
            return;
        }
        this.zze = true;
        zzfnr.zza().zzf(this);
        this.zzd.zzl(zzfnz.zzb().zza());
        this.zzd.zzg(zzfnp.zza().zzb());
        this.zzd.zzi(this, this.zza);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View zzf() {
        return (View) this.zzc.get();
    }

    public final zzfoh zzg() {
        return this.zzd;
    }

    public final String zzh() {
        return this.zzg;
    }

    public final List zzi() {
        return this.zzb.zza();
    }

    public final boolean zzj() {
        return this.zze && !this.zzf;
    }
}
