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
/* loaded from: classes2.dex */
public final class zzmf {
    private final zzpj zza;
    private final zzme zze;
    private final zzmx zzh;
    private final zzfb zzi;
    private boolean zzj;

    @Nullable
    private zzie zzk;
    private zzxi zzl = new zzxi(0);
    private final IdentityHashMap zzc = new IdentityHashMap();
    private final Map zzd = new HashMap();
    private final List zzb = new ArrayList();
    private final HashMap zzf = new HashMap();
    private final Set zzg = new HashSet();

    public zzmf(zzme zzmeVar, zzmx zzmxVar, zzfb zzfbVar, zzpj zzpjVar) {
        this.zza = zzpjVar;
        this.zze = zzmeVar;
        this.zzh = zzmxVar;
        this.zzi = zzfbVar;
    }

    private final void zzr(int i9, int i10) {
        while (i9 < this.zzb.size()) {
            ((zzmd) this.zzb.get(i9)).zzd += i10;
            i9++;
        }
    }

    private final void zzs(zzmd zzmdVar) {
        zzmc zzmcVar = (zzmc) this.zzf.get(zzmdVar);
        if (zzmcVar != null) {
            zzmcVar.zza.zzi(zzmcVar.zzb);
        }
    }

    private final void zzt() {
        Iterator it = this.zzg.iterator();
        while (it.hasNext()) {
            zzmd zzmdVar = (zzmd) it.next();
            if (zzmdVar.zzc.isEmpty()) {
                zzs(zzmdVar);
                it.remove();
            }
        }
    }

    private final void zzu(zzmd zzmdVar) {
        if (zzmdVar.zze && zzmdVar.zzc.isEmpty()) {
            zzmc zzmcVar = (zzmc) this.zzf.remove(zzmdVar);
            zzmcVar.getClass();
            zzmcVar.zza.zzp(zzmcVar.zzb);
            zzmcVar.zza.zzs(zzmcVar.zzc);
            zzmcVar.zza.zzr(zzmcVar.zzc);
            this.zzg.remove(zzmdVar);
        }
    }

    private final void zzv(zzmd zzmdVar) {
        zzvj zzvjVar = zzmdVar.zza;
        zzvp zzvpVar = new zzvp() { // from class: com.google.android.gms.internal.ads.zzlv
            @Override // com.google.android.gms.internal.ads.zzvp
            public final void zza(zzvq zzvqVar, zzdc zzdcVar) {
                zzmf.this.zzf(zzvqVar, zzdcVar);
            }
        };
        zzmb zzmbVar = new zzmb(this, zzmdVar);
        this.zzf.put(zzmdVar, new zzmc(zzvjVar, zzvpVar, zzmbVar));
        zzvjVar.zzh(new Handler(zzgd.zzy(), null), zzmbVar);
        zzvjVar.zzg(new Handler(zzgd.zzy(), null), zzmbVar);
        zzvjVar.zzm(zzvpVar, this.zzk, this.zza);
    }

    private final void zzw(int i9, int i10) {
        while (true) {
            i10--;
            if (i10 >= i9) {
                zzmd zzmdVar = (zzmd) this.zzb.remove(i10);
                this.zzd.remove(zzmdVar.zzb);
                zzr(i10, -zzmdVar.zza.zzC().zzc());
                zzmdVar.zze = true;
                if (this.zzj) {
                    zzu(zzmdVar);
                }
            } else {
                return;
            }
        }
    }

    public final int zza() {
        return this.zzb.size();
    }

    public final zzdc zzb() {
        if (!this.zzb.isEmpty()) {
            int i9 = 0;
            for (int i10 = 0; i10 < this.zzb.size(); i10++) {
                zzmd zzmdVar = (zzmd) this.zzb.get(i10);
                zzmdVar.zzd = i9;
                i9 += zzmdVar.zza.zzC().zzc();
            }
            return new zzml(this.zzb, this.zzl);
        }
        return zzdc.zza;
    }

    public final zzdc zzc(int i9, int i10, List list) {
        boolean z8;
        boolean z9 = true;
        if (i9 >= 0 && i9 <= i10 && i10 <= zza()) {
            z8 = true;
        } else {
            z8 = false;
        }
        zzeq.zzd(z8);
        if (list.size() != i10 - i9) {
            z9 = false;
        }
        zzeq.zzd(z9);
        for (int i11 = i9; i11 < i10; i11++) {
            ((zzmd) this.zzb.get(i11)).zza.zzt((zzbu) list.get(i11 - i9));
        }
        return zzb();
    }

    public final /* synthetic */ void zzf(zzvq zzvqVar, zzdc zzdcVar) {
        this.zze.zzh();
    }

    public final void zzg(@Nullable zzie zzieVar) {
        zzeq.zzf(!this.zzj);
        this.zzk = zzieVar;
        for (int i9 = 0; i9 < this.zzb.size(); i9++) {
            zzmd zzmdVar = (zzmd) this.zzb.get(i9);
            zzv(zzmdVar);
            this.zzg.add(zzmdVar);
        }
        this.zzj = true;
    }

    public final void zzh() {
        for (zzmc zzmcVar : this.zzf.values()) {
            try {
                zzmcVar.zza.zzp(zzmcVar.zzb);
            } catch (RuntimeException e4) {
                zzfk.zzd("MediaSourceList", "Failed to release child source.", e4);
            }
            zzmcVar.zza.zzs(zzmcVar.zzc);
            zzmcVar.zza.zzr(zzmcVar.zzc);
        }
        this.zzf.clear();
        this.zzg.clear();
        this.zzj = false;
    }

    public final void zzi(zzvm zzvmVar) {
        zzmd zzmdVar = (zzmd) this.zzc.remove(zzvmVar);
        zzmdVar.getClass();
        zzmdVar.zza.zzG(zzvmVar);
        zzmdVar.zzc.remove(((zzvg) zzvmVar).zza);
        if (!this.zzc.isEmpty()) {
            zzt();
        }
        zzu(zzmdVar);
    }

    public final boolean zzj() {
        return this.zzj;
    }

    public final zzdc zzk(int i9, List list, zzxi zzxiVar) {
        if (!list.isEmpty()) {
            this.zzl = zzxiVar;
            for (int i10 = i9; i10 < list.size() + i9; i10++) {
                zzmd zzmdVar = (zzmd) list.get(i10 - i9);
                if (i10 > 0) {
                    zzmd zzmdVar2 = (zzmd) this.zzb.get(i10 - 1);
                    zzmdVar.zzc(zzmdVar2.zza.zzC().zzc() + zzmdVar2.zzd);
                } else {
                    zzmdVar.zzc(0);
                }
                zzr(i10, zzmdVar.zza.zzC().zzc());
                this.zzb.add(i10, zzmdVar);
                this.zzd.put(zzmdVar.zzb, zzmdVar);
                if (this.zzj) {
                    zzv(zzmdVar);
                    if (this.zzc.isEmpty()) {
                        this.zzg.add(zzmdVar);
                    } else {
                        zzs(zzmdVar);
                    }
                }
            }
        }
        return zzb();
    }

    public final zzdc zzl(int i9, int i10, int i11, zzxi zzxiVar) {
        boolean z8;
        if (zza() >= 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        zzeq.zzd(z8);
        this.zzl = null;
        return zzb();
    }

    public final zzdc zzm(int i9, int i10, zzxi zzxiVar) {
        boolean z8 = false;
        if (i9 >= 0 && i9 <= i10 && i10 <= zza()) {
            z8 = true;
        }
        zzeq.zzd(z8);
        this.zzl = zzxiVar;
        zzw(i9, i10);
        return zzb();
    }

    public final zzdc zzn(List list, zzxi zzxiVar) {
        zzw(0, this.zzb.size());
        return zzk(this.zzb.size(), list, zzxiVar);
    }

    public final zzdc zzo(zzxi zzxiVar) {
        int zza = zza();
        if (zzxiVar.zzc() != zza) {
            zzxiVar = zzxiVar.zzf().zzg(0, zza);
        }
        this.zzl = zzxiVar;
        return zzb();
    }

    public final zzvm zzp(zzvo zzvoVar, zzzv zzzvVar, long j7) {
        int i9 = zzml.zzc;
        Object obj = zzvoVar.zza;
        Object obj2 = ((Pair) obj).first;
        zzvo zza = zzvoVar.zza(((Pair) obj).second);
        zzmd zzmdVar = (zzmd) this.zzd.get(obj2);
        zzmdVar.getClass();
        this.zzg.add(zzmdVar);
        zzmc zzmcVar = (zzmc) this.zzf.get(zzmdVar);
        if (zzmcVar != null) {
            zzmcVar.zza.zzk(zzmcVar.zzb);
        }
        zzmdVar.zzc.add(zza);
        zzvg zzI = zzmdVar.zza.zzI(zza, zzzvVar, j7);
        this.zzc.put(zzI, zzmdVar);
        zzt();
        return zzI;
    }

    public final zzxi zzq() {
        return this.zzl;
    }
}
