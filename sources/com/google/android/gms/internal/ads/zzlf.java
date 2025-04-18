package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.util.Pair;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzlf {
    private final zzoj zza;
    private final zzle zze;
    private final zzlw zzh;
    private final zzdm zzi;
    private boolean zzj;

    @Nullable
    private zzhd zzk;
    private zzwj zzl = new zzwj(0);
    private final IdentityHashMap zzc = new IdentityHashMap();
    private final Map zzd = new HashMap();
    private final List zzb = new ArrayList();
    private final HashMap zzf = new HashMap();
    private final Set zzg = new HashSet();

    public zzlf(zzle zzleVar, zzlw zzlwVar, zzdm zzdmVar, zzoj zzojVar) {
        this.zza = zzojVar;
        this.zze = zzleVar;
        this.zzh = zzlwVar;
        this.zzi = zzdmVar;
    }

    private final void zzr(int i10, int i11) {
        while (i10 < this.zzb.size()) {
            ((zzld) this.zzb.get(i10)).zzd += i11;
            i10++;
        }
    }

    private final void zzs(zzld zzldVar) {
        zzlc zzlcVar = (zzlc) this.zzf.get(zzldVar);
        if (zzlcVar != null) {
            zzlcVar.zza.zzi(zzlcVar.zzb);
        }
    }

    private final void zzt() {
        Iterator it = this.zzg.iterator();
        while (it.hasNext()) {
            zzld zzldVar = (zzld) it.next();
            if (zzldVar.zzc.isEmpty()) {
                zzs(zzldVar);
                it.remove();
            }
        }
    }

    private final void zzu(zzld zzldVar) {
        if (zzldVar.zze && zzldVar.zzc.isEmpty()) {
            zzlc zzlcVar = (zzlc) this.zzf.remove(zzldVar);
            zzlcVar.getClass();
            zzlcVar.zza.zzp(zzlcVar.zzb);
            zzlcVar.zza.zzs(zzlcVar.zzc);
            zzlcVar.zza.zzr(zzlcVar.zzc);
            this.zzg.remove(zzldVar);
        }
    }

    private final void zzv(zzld zzldVar) {
        zzum zzumVar = zzldVar.zza;
        zzus zzusVar = new zzus() { // from class: com.google.android.gms.internal.ads.zzkv
            @Override // com.google.android.gms.internal.ads.zzus
            public final void zza(zzut zzutVar, zzbv zzbvVar) {
                zzlf.this.zzf(zzutVar, zzbvVar);
            }
        };
        zzlb zzlbVar = new zzlb(this, zzldVar);
        this.zzf.put(zzldVar, new zzlc(zzumVar, zzusVar, zzlbVar));
        zzumVar.zzh(new Handler(zzen.zzz(), null), zzlbVar);
        zzumVar.zzg(new Handler(zzen.zzz(), null), zzlbVar);
        zzumVar.zzm(zzusVar, this.zzk, this.zza);
    }

    private final void zzw(int i10, int i11) {
        while (true) {
            i11--;
            if (i11 >= i10) {
                zzld zzldVar = (zzld) this.zzb.remove(i11);
                this.zzd.remove(zzldVar.zzb);
                zzr(i11, -zzldVar.zza.zzC().zzc());
                zzldVar.zze = true;
                if (this.zzj) {
                    zzu(zzldVar);
                }
            } else {
                return;
            }
        }
    }

    public final int zza() {
        return this.zzb.size();
    }

    public final zzbv zzb() {
        if (!this.zzb.isEmpty()) {
            int i10 = 0;
            for (int i11 = 0; i11 < this.zzb.size(); i11++) {
                zzld zzldVar = (zzld) this.zzb.get(i11);
                zzldVar.zzd = i10;
                i10 += zzldVar.zza.zzC().zzc();
            }
            return new zzll(this.zzb, this.zzl);
        }
        return zzbv.zza;
    }

    public final zzbv zzc(int i10, int i11, List list) {
        boolean z10;
        boolean z11 = true;
        if (i10 >= 0 && i10 <= i11 && i11 <= zza()) {
            z10 = true;
        } else {
            z10 = false;
        }
        zzdb.zzd(z10);
        if (list.size() != i11 - i10) {
            z11 = false;
        }
        zzdb.zzd(z11);
        for (int i12 = i10; i12 < i11; i12++) {
            ((zzld) this.zzb.get(i12)).zza.zzt((zzaw) list.get(i12 - i10));
        }
        return zzb();
    }

    public final /* synthetic */ void zzf(zzut zzutVar, zzbv zzbvVar) {
        this.zze.zzh();
    }

    public final void zzg(@Nullable zzhd zzhdVar) {
        zzdb.zzf(!this.zzj);
        this.zzk = zzhdVar;
        for (int i10 = 0; i10 < this.zzb.size(); i10++) {
            zzld zzldVar = (zzld) this.zzb.get(i10);
            zzv(zzldVar);
            this.zzg.add(zzldVar);
        }
        this.zzj = true;
    }

    public final void zzh() {
        for (zzlc zzlcVar : this.zzf.values()) {
            try {
                zzlcVar.zza.zzp(zzlcVar.zzb);
            } catch (RuntimeException e2) {
                zzdt.zzd("MediaSourceList", "Failed to release child source.", e2);
            }
            zzlcVar.zza.zzs(zzlcVar.zzc);
            zzlcVar.zza.zzr(zzlcVar.zzc);
        }
        this.zzf.clear();
        this.zzg.clear();
        this.zzj = false;
    }

    public final void zzi(zzup zzupVar) {
        zzld zzldVar = (zzld) this.zzc.remove(zzupVar);
        zzldVar.getClass();
        zzldVar.zza.zzG(zzupVar);
        zzldVar.zzc.remove(((zzuj) zzupVar).zza);
        if (!this.zzc.isEmpty()) {
            zzt();
        }
        zzu(zzldVar);
    }

    public final boolean zzj() {
        return this.zzj;
    }

    public final zzbv zzk(int i10, List list, zzwj zzwjVar) {
        if (!list.isEmpty()) {
            this.zzl = zzwjVar;
            for (int i11 = i10; i11 < list.size() + i10; i11++) {
                zzld zzldVar = (zzld) list.get(i11 - i10);
                if (i11 > 0) {
                    zzld zzldVar2 = (zzld) this.zzb.get(i11 - 1);
                    zzldVar.zzc(zzldVar2.zza.zzC().zzc() + zzldVar2.zzd);
                } else {
                    zzldVar.zzc(0);
                }
                zzr(i11, zzldVar.zza.zzC().zzc());
                this.zzb.add(i11, zzldVar);
                this.zzd.put(zzldVar.zzb, zzldVar);
                if (this.zzj) {
                    zzv(zzldVar);
                    if (this.zzc.isEmpty()) {
                        this.zzg.add(zzldVar);
                    } else {
                        zzs(zzldVar);
                    }
                }
            }
        }
        return zzb();
    }

    public final zzbv zzl(int i10, int i11, int i12, zzwj zzwjVar) {
        boolean z10;
        if (zza() >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        zzdb.zzd(z10);
        this.zzl = null;
        return zzb();
    }

    public final zzbv zzm(int i10, int i11, zzwj zzwjVar) {
        boolean z10 = false;
        if (i10 >= 0 && i10 <= i11 && i11 <= zza()) {
            z10 = true;
        }
        zzdb.zzd(z10);
        this.zzl = zzwjVar;
        zzw(i10, i11);
        return zzb();
    }

    public final zzbv zzn(List list, zzwj zzwjVar) {
        zzw(0, this.zzb.size());
        return zzk(this.zzb.size(), list, zzwjVar);
    }

    public final zzbv zzo(zzwj zzwjVar) {
        int zza = zza();
        if (zzwjVar.zzc() != zza) {
            zzwjVar = zzwjVar.zzf().zzg(0, zza);
        }
        this.zzl = zzwjVar;
        return zzb();
    }

    public final zzup zzp(zzur zzurVar, zzys zzysVar, long j3) {
        int i10 = zzll.zzb;
        Object obj = zzurVar.zza;
        Object obj2 = ((Pair) obj).first;
        zzur zza = zzurVar.zza(((Pair) obj).second);
        zzld zzldVar = (zzld) this.zzd.get(obj2);
        zzldVar.getClass();
        this.zzg.add(zzldVar);
        zzlc zzlcVar = (zzlc) this.zzf.get(zzldVar);
        if (zzlcVar != null) {
            zzlcVar.zza.zzk(zzlcVar.zzb);
        }
        zzldVar.zzc.add(zza);
        zzuj zzI = zzldVar.zza.zzI(zza, zzysVar, j3);
        this.zzc.put(zzI, zzldVar);
        zzt();
        return zzI;
    }

    public final zzwj zzq() {
        return this.zzl;
    }
}
