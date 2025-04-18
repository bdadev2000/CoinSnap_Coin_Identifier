package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
final class zznz {
    private final zzbt zza;
    private zzfzo zzb = zzfzo.zzn();
    private zzfzr zzc = zzfzr.zzd();

    @Nullable
    private zzur zzd;
    private zzur zze;
    private zzur zzf;

    public zznz(zzbt zzbtVar) {
        this.zza = zzbtVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    private static zzur zzj(zzbp zzbpVar, zzfzo zzfzoVar, @Nullable zzur zzurVar, zzbt zzbtVar) {
        Object zzf;
        int i10;
        zzbv zzn = zzbpVar.zzn();
        int zze = zzbpVar.zze();
        if (zzn.zzo()) {
            zzf = null;
        } else {
            zzf = zzn.zzf(zze);
        }
        if (!zzbpVar.zzw() && !zzn.zzo()) {
            i10 = zzn.zzd(zze, zzbtVar, false).zzc(zzen.zzs(zzbpVar.zzk()));
        } else {
            i10 = -1;
        }
        for (int i11 = 0; i11 < zzfzoVar.size(); i11++) {
            zzur zzurVar2 = (zzur) zzfzoVar.get(i11);
            if (zzm(zzurVar2, zzf, zzbpVar.zzw(), zzbpVar.zzb(), zzbpVar.zzc(), i10)) {
                return zzurVar2;
            }
        }
        if (zzfzoVar.isEmpty() && zzurVar != null) {
            if (zzm(zzurVar, zzf, zzbpVar.zzw(), zzbpVar.zzb(), zzbpVar.zzc(), i10)) {
                return zzurVar;
            }
        }
        return null;
    }

    private final void zzk(zzfzq zzfzqVar, @Nullable zzur zzurVar, zzbv zzbvVar) {
        if (zzurVar != null) {
            if (zzbvVar.zza(zzurVar.zza) != -1) {
                zzfzqVar.zza(zzurVar, zzbvVar);
                return;
            }
            zzbv zzbvVar2 = (zzbv) this.zzc.get(zzurVar);
            if (zzbvVar2 != null) {
                zzfzqVar.zza(zzurVar, zzbvVar2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void zzl(zzbv zzbvVar) {
        zzfzq zzfzqVar = new zzfzq();
        if (this.zzb.isEmpty()) {
            zzk(zzfzqVar, this.zze, zzbvVar);
            if (!zzfwn.zza(this.zzf, this.zze)) {
                zzk(zzfzqVar, this.zzf, zzbvVar);
            }
            if (!zzfwn.zza(this.zzd, this.zze) && !zzfwn.zza(this.zzd, this.zzf)) {
                zzk(zzfzqVar, this.zzd, zzbvVar);
            }
        } else {
            for (int i10 = 0; i10 < this.zzb.size(); i10++) {
                zzk(zzfzqVar, (zzur) this.zzb.get(i10), zzbvVar);
            }
            if (!this.zzb.contains(this.zzd)) {
                zzk(zzfzqVar, this.zzd, zzbvVar);
            }
        }
        this.zzc = zzfzqVar.zzc();
    }

    private static boolean zzm(zzur zzurVar, @Nullable Object obj, boolean z10, int i10, int i11, int i12) {
        if (!zzurVar.zza.equals(obj)) {
            return false;
        }
        if (z10) {
            if (zzurVar.zzb != i10 || zzurVar.zzc != i11) {
                return false;
            }
        } else if (zzurVar.zzb != -1 || zzurVar.zze != i12) {
            return false;
        }
        return true;
    }

    @Nullable
    public final zzbv zza(zzur zzurVar) {
        return (zzbv) this.zzc.get(zzurVar);
    }

    @Nullable
    public final zzur zzb() {
        return this.zzd;
    }

    @Nullable
    public final zzur zzc() {
        Object next;
        Object obj;
        if (this.zzb.isEmpty()) {
            return null;
        }
        zzfzo zzfzoVar = this.zzb;
        if (zzfzoVar instanceof List) {
            if (!zzfzoVar.isEmpty()) {
                obj = zzfzoVar.get(zzfzoVar.size() - 1);
            } else {
                throw new NoSuchElementException();
            }
        } else {
            Iterator<E> it = zzfzoVar.iterator();
            do {
                next = it.next();
            } while (it.hasNext());
            obj = next;
        }
        return (zzur) obj;
    }

    @Nullable
    public final zzur zzd() {
        return this.zze;
    }

    @Nullable
    public final zzur zze() {
        return this.zzf;
    }

    public final void zzg(zzbp zzbpVar) {
        this.zzd = zzj(zzbpVar, this.zzb, this.zze, this.zza);
    }

    public final void zzh(List list, @Nullable zzur zzurVar, zzbp zzbpVar) {
        this.zzb = zzfzo.zzl(list);
        if (!list.isEmpty()) {
            this.zze = (zzur) list.get(0);
            zzurVar.getClass();
            this.zzf = zzurVar;
        }
        if (this.zzd == null) {
            this.zzd = zzj(zzbpVar, this.zzb, this.zze, this.zza);
        }
        zzl(zzbpVar.zzn());
    }

    public final void zzi(zzbp zzbpVar) {
        this.zzd = zzj(zzbpVar, this.zzb, this.zze, this.zza);
        zzl(zzbpVar.zzn());
    }
}
