package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
final class zzoc {
    private final zzca zza;
    private zzgax zzb = zzgax.zzn();
    private zzgba zzc = zzgba.zzd();

    @Nullable
    private zzuy zzd;
    private zzuy zze;
    private zzuy zzf;

    public zzoc(zzca zzcaVar) {
        this.zza = zzcaVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    private static zzuy zzj(zzbw zzbwVar, zzgax zzgaxVar, @Nullable zzuy zzuyVar, zzca zzcaVar) {
        zzcc zzn = zzbwVar.zzn();
        int zze = zzbwVar.zze();
        Object zzf = zzn.zzo() ? null : zzn.zzf(zze);
        int zzc = (zzbwVar.zzw() || zzn.zzo()) ? -1 : zzn.zzd(zze, zzcaVar, false).zzc(zzeu.zzr(zzbwVar.zzk()));
        for (int i2 = 0; i2 < zzgaxVar.size(); i2++) {
            zzuy zzuyVar2 = (zzuy) zzgaxVar.get(i2);
            if (zzm(zzuyVar2, zzf, zzbwVar.zzw(), zzbwVar.zzb(), zzbwVar.zzc(), zzc)) {
                return zzuyVar2;
            }
        }
        if (zzgaxVar.isEmpty() && zzuyVar != null) {
            if (zzm(zzuyVar, zzf, zzbwVar.zzw(), zzbwVar.zzb(), zzbwVar.zzc(), zzc)) {
                return zzuyVar;
            }
        }
        return null;
    }

    private final void zzk(zzgaz zzgazVar, @Nullable zzuy zzuyVar, zzcc zzccVar) {
        if (zzuyVar == null) {
            return;
        }
        if (zzccVar.zza(zzuyVar.zza) != -1) {
            zzgazVar.zza(zzuyVar, zzccVar);
            return;
        }
        zzcc zzccVar2 = (zzcc) this.zzc.get(zzuyVar);
        if (zzccVar2 != null) {
            zzgazVar.zza(zzuyVar, zzccVar2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void zzl(zzcc zzccVar) {
        zzgaz zzgazVar = new zzgaz();
        if (this.zzb.isEmpty()) {
            zzk(zzgazVar, this.zze, zzccVar);
            if (!zzfxw.zza(this.zzf, this.zze)) {
                zzk(zzgazVar, this.zzf, zzccVar);
            }
            if (!zzfxw.zza(this.zzd, this.zze) && !zzfxw.zza(this.zzd, this.zzf)) {
                zzk(zzgazVar, this.zzd, zzccVar);
            }
        } else {
            for (int i2 = 0; i2 < this.zzb.size(); i2++) {
                zzk(zzgazVar, (zzuy) this.zzb.get(i2), zzccVar);
            }
            if (!this.zzb.contains(this.zzd)) {
                zzk(zzgazVar, this.zzd, zzccVar);
            }
        }
        this.zzc = zzgazVar.zzc();
    }

    private static boolean zzm(zzuy zzuyVar, @Nullable Object obj, boolean z2, int i2, int i3, int i4) {
        if (!zzuyVar.zza.equals(obj)) {
            return false;
        }
        if (z2) {
            if (zzuyVar.zzb != i2 || zzuyVar.zzc != i3) {
                return false;
            }
        } else if (zzuyVar.zzb != -1 || zzuyVar.zze != i4) {
            return false;
        }
        return true;
    }

    @Nullable
    public final zzcc zza(zzuy zzuyVar) {
        return (zzcc) this.zzc.get(zzuyVar);
    }

    @Nullable
    public final zzuy zzb() {
        return this.zzd;
    }

    @Nullable
    public final zzuy zzc() {
        Object next;
        Object obj;
        if (this.zzb.isEmpty()) {
            return null;
        }
        zzgax zzgaxVar = this.zzb;
        if (!(zzgaxVar instanceof List)) {
            Iterator<E> it = zzgaxVar.iterator();
            do {
                next = it.next();
            } while (it.hasNext());
            obj = next;
        } else {
            if (zzgaxVar.isEmpty()) {
                throw new NoSuchElementException();
            }
            obj = zzgaxVar.get(zzgaxVar.size() - 1);
        }
        return (zzuy) obj;
    }

    @Nullable
    public final zzuy zzd() {
        return this.zze;
    }

    @Nullable
    public final zzuy zze() {
        return this.zzf;
    }

    public final void zzg(zzbw zzbwVar) {
        this.zzd = zzj(zzbwVar, this.zzb, this.zze, this.zza);
    }

    public final void zzh(List list, @Nullable zzuy zzuyVar, zzbw zzbwVar) {
        this.zzb = zzgax.zzl(list);
        if (!list.isEmpty()) {
            this.zze = (zzuy) list.get(0);
            zzuyVar.getClass();
            this.zzf = zzuyVar;
        }
        if (this.zzd == null) {
            this.zzd = zzj(zzbwVar, this.zzb, this.zze, this.zza);
        }
        zzl(zzbwVar.zzn());
    }

    public final void zzi(zzbw zzbwVar) {
        this.zzd = zzj(zzbwVar, this.zzb, this.zze, this.zza);
        zzl(zzbwVar.zzn());
    }
}
