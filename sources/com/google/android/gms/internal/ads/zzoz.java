package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
final class zzoz {
    private final zzcz zza;
    private zzgbc zzb = zzgbc.zzm();
    private zzgbf zzc = zzgbf.zzd();

    @Nullable
    private zzvo zzd;
    private zzvo zze;
    private zzvo zzf;

    public zzoz(zzcz zzczVar) {
        this.zza = zzczVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    private static zzvo zzj(zzct zzctVar, zzgbc zzgbcVar, @Nullable zzvo zzvoVar, zzcz zzczVar) {
        Object zzf;
        int i9;
        zzdc zzn = zzctVar.zzn();
        int zze = zzctVar.zze();
        if (zzn.zzo()) {
            zzf = null;
        } else {
            zzf = zzn.zzf(zze);
        }
        if (zzctVar.zzx() || zzn.zzo()) {
            i9 = -1;
        } else {
            i9 = zzn.zzd(zze, zzczVar, false).zzc(zzgd.zzr(zzctVar.zzk()));
        }
        for (int i10 = 0; i10 < zzgbcVar.size(); i10++) {
            zzvo zzvoVar2 = (zzvo) zzgbcVar.get(i10);
            if (zzm(zzvoVar2, zzf, zzctVar.zzx(), zzctVar.zzb(), zzctVar.zzc(), i9)) {
                return zzvoVar2;
            }
        }
        if (zzgbcVar.isEmpty() && zzvoVar != null) {
            if (zzm(zzvoVar, zzf, zzctVar.zzx(), zzctVar.zzb(), zzctVar.zzc(), i9)) {
                return zzvoVar;
            }
        }
        return null;
    }

    private final void zzk(zzgbe zzgbeVar, @Nullable zzvo zzvoVar, zzdc zzdcVar) {
        if (zzvoVar != null) {
            if (zzdcVar.zza(zzvoVar.zza) != -1) {
                zzgbeVar.zza(zzvoVar, zzdcVar);
                return;
            }
            zzdc zzdcVar2 = (zzdc) this.zzc.get(zzvoVar);
            if (zzdcVar2 != null) {
                zzgbeVar.zza(zzvoVar, zzdcVar2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void zzl(zzdc zzdcVar) {
        zzgbe zzgbeVar = new zzgbe();
        if (this.zzb.isEmpty()) {
            zzk(zzgbeVar, this.zze, zzdcVar);
            if (!zzfya.zza(this.zzf, this.zze)) {
                zzk(zzgbeVar, this.zzf, zzdcVar);
            }
            if (!zzfya.zza(this.zzd, this.zze) && !zzfya.zza(this.zzd, this.zzf)) {
                zzk(zzgbeVar, this.zzd, zzdcVar);
            }
        } else {
            for (int i9 = 0; i9 < this.zzb.size(); i9++) {
                zzk(zzgbeVar, (zzvo) this.zzb.get(i9), zzdcVar);
            }
            if (!this.zzb.contains(this.zzd)) {
                zzk(zzgbeVar, this.zzd, zzdcVar);
            }
        }
        this.zzc = zzgbeVar.zzc();
    }

    private static boolean zzm(zzvo zzvoVar, @Nullable Object obj, boolean z8, int i9, int i10, int i11) {
        if (!zzvoVar.zza.equals(obj)) {
            return false;
        }
        if (z8) {
            if (zzvoVar.zzb != i9 || zzvoVar.zzc != i10) {
                return false;
            }
        } else if (zzvoVar.zzb != -1 || zzvoVar.zze != i11) {
            return false;
        }
        return true;
    }

    @Nullable
    public final zzdc zza(zzvo zzvoVar) {
        return (zzdc) this.zzc.get(zzvoVar);
    }

    @Nullable
    public final zzvo zzb() {
        return this.zzd;
    }

    @Nullable
    public final zzvo zzc() {
        Object next;
        Object obj;
        if (this.zzb.isEmpty()) {
            return null;
        }
        zzgbc zzgbcVar = this.zzb;
        if (zzgbcVar instanceof List) {
            if (!zzgbcVar.isEmpty()) {
                obj = zzgbcVar.get(zzgbcVar.size() - 1);
            } else {
                throw new NoSuchElementException();
            }
        } else {
            Iterator<E> it = zzgbcVar.iterator();
            do {
                next = it.next();
            } while (it.hasNext());
            obj = next;
        }
        return (zzvo) obj;
    }

    @Nullable
    public final zzvo zzd() {
        return this.zze;
    }

    @Nullable
    public final zzvo zze() {
        return this.zzf;
    }

    public final void zzg(zzct zzctVar) {
        this.zzd = zzj(zzctVar, this.zzb, this.zze, this.zza);
    }

    public final void zzh(List list, @Nullable zzvo zzvoVar, zzct zzctVar) {
        this.zzb = zzgbc.zzk(list);
        if (!list.isEmpty()) {
            this.zze = (zzvo) list.get(0);
            zzvoVar.getClass();
            this.zzf = zzvoVar;
        }
        if (this.zzd == null) {
            this.zzd = zzj(zzctVar, this.zzb, this.zze, this.zza);
        }
        zzl(zzctVar.zzn());
    }

    public final void zzi(zzct zzctVar) {
        this.zzd = zzj(zzctVar, this.zzb, this.zze, this.zza);
        zzl(zzctVar.zzn());
    }
}
