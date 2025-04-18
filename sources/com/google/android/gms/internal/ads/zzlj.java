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
public final class zzlj {
    private final zzom zza;
    private final zzli zze;
    private final zzma zzh;
    private final zzdt zzi;
    private boolean zzj;

    @Nullable
    private zzhh zzk;
    private zzwq zzl = new zzwq(0);
    private final IdentityHashMap zzc = new IdentityHashMap();
    private final Map zzd = new HashMap();
    private final List zzb = new ArrayList();
    private final HashMap zzf = new HashMap();
    private final Set zzg = new HashSet();

    public zzlj(zzli zzliVar, zzma zzmaVar, zzdt zzdtVar, zzom zzomVar) {
        this.zza = zzomVar;
        this.zze = zzliVar;
        this.zzh = zzmaVar;
        this.zzi = zzdtVar;
    }

    private final void zzr(int i2, int i3) {
        while (i2 < this.zzb.size()) {
            ((zzlh) this.zzb.get(i2)).zzd += i3;
            i2++;
        }
    }

    private final void zzs(zzlh zzlhVar) {
        zzlg zzlgVar = (zzlg) this.zzf.get(zzlhVar);
        if (zzlgVar != null) {
            zzlgVar.zza.zzi(zzlgVar.zzb);
        }
    }

    private final void zzt() {
        Iterator it = this.zzg.iterator();
        while (it.hasNext()) {
            zzlh zzlhVar = (zzlh) it.next();
            if (zzlhVar.zzc.isEmpty()) {
                zzs(zzlhVar);
                it.remove();
            }
        }
    }

    private final void zzu(zzlh zzlhVar) {
        if (zzlhVar.zze && zzlhVar.zzc.isEmpty()) {
            zzlg zzlgVar = (zzlg) this.zzf.remove(zzlhVar);
            zzlgVar.getClass();
            zzlgVar.zza.zzp(zzlgVar.zzb);
            zzlgVar.zza.zzs(zzlgVar.zzc);
            zzlgVar.zza.zzr(zzlgVar.zzc);
            this.zzg.remove(zzlhVar);
        }
    }

    private final void zzv(zzlh zzlhVar) {
        zzut zzutVar = zzlhVar.zza;
        zzuz zzuzVar = new zzuz() { // from class: com.google.android.gms.internal.ads.zzkz
            @Override // com.google.android.gms.internal.ads.zzuz
            public final void zza(zzva zzvaVar, zzcc zzccVar) {
                zzlj.this.zzf(zzvaVar, zzccVar);
            }
        };
        zzlf zzlfVar = new zzlf(this, zzlhVar);
        this.zzf.put(zzlhVar, new zzlg(zzutVar, zzuzVar, zzlfVar));
        zzutVar.zzh(new Handler(zzeu.zzy(), null), zzlfVar);
        zzutVar.zzg(new Handler(zzeu.zzy(), null), zzlfVar);
        zzutVar.zzm(zzuzVar, this.zzk, this.zza);
    }

    private final void zzw(int i2, int i3) {
        while (true) {
            i3--;
            if (i3 < i2) {
                return;
            }
            zzlh zzlhVar = (zzlh) this.zzb.remove(i3);
            this.zzd.remove(zzlhVar.zzb);
            zzr(i3, -zzlhVar.zza.zzC().zzc());
            zzlhVar.zze = true;
            if (this.zzj) {
                zzu(zzlhVar);
            }
        }
    }

    public final int zza() {
        return this.zzb.size();
    }

    public final zzcc zzb() {
        if (this.zzb.isEmpty()) {
            return zzcc.zza;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.zzb.size(); i3++) {
            zzlh zzlhVar = (zzlh) this.zzb.get(i3);
            zzlhVar.zzd = i2;
            i2 += zzlhVar.zza.zzC().zzc();
        }
        return new zzlp(this.zzb, this.zzl);
    }

    public final zzcc zzc(int i2, int i3, List list) {
        zzdi.zzd(i2 >= 0 && i2 <= i3 && i3 <= zza());
        zzdi.zzd(list.size() == i3 - i2);
        for (int i4 = i2; i4 < i3; i4++) {
            ((zzlh) this.zzb.get(i4)).zza.zzt((zzbc) list.get(i4 - i2));
        }
        return zzb();
    }

    public final /* synthetic */ void zzf(zzva zzvaVar, zzcc zzccVar) {
        this.zze.zzg();
    }

    public final void zzg(@Nullable zzhh zzhhVar) {
        zzdi.zzf(!this.zzj);
        this.zzk = zzhhVar;
        for (int i2 = 0; i2 < this.zzb.size(); i2++) {
            zzlh zzlhVar = (zzlh) this.zzb.get(i2);
            zzv(zzlhVar);
            this.zzg.add(zzlhVar);
        }
        this.zzj = true;
    }

    public final void zzh() {
        for (zzlg zzlgVar : this.zzf.values()) {
            try {
                zzlgVar.zza.zzp(zzlgVar.zzb);
            } catch (RuntimeException e) {
                zzea.zzd("MediaSourceList", "Failed to release child source.", e);
            }
            zzlgVar.zza.zzs(zzlgVar.zzc);
            zzlgVar.zza.zzr(zzlgVar.zzc);
        }
        this.zzf.clear();
        this.zzg.clear();
        this.zzj = false;
    }

    public final void zzi(zzuw zzuwVar) {
        zzlh zzlhVar = (zzlh) this.zzc.remove(zzuwVar);
        zzlhVar.getClass();
        zzlhVar.zza.zzG(zzuwVar);
        zzlhVar.zzc.remove(((zzuq) zzuwVar).zza);
        if (!this.zzc.isEmpty()) {
            zzt();
        }
        zzu(zzlhVar);
    }

    public final boolean zzj() {
        return this.zzj;
    }

    public final zzcc zzk(int i2, List list, zzwq zzwqVar) {
        if (!list.isEmpty()) {
            this.zzl = zzwqVar;
            for (int i3 = i2; i3 < list.size() + i2; i3++) {
                zzlh zzlhVar = (zzlh) list.get(i3 - i2);
                if (i3 > 0) {
                    zzlh zzlhVar2 = (zzlh) this.zzb.get(i3 - 1);
                    zzlhVar.zzc(zzlhVar2.zza.zzC().zzc() + zzlhVar2.zzd);
                } else {
                    zzlhVar.zzc(0);
                }
                zzr(i3, zzlhVar.zza.zzC().zzc());
                this.zzb.add(i3, zzlhVar);
                this.zzd.put(zzlhVar.zzb, zzlhVar);
                if (this.zzj) {
                    zzv(zzlhVar);
                    if (this.zzc.isEmpty()) {
                        this.zzg.add(zzlhVar);
                    } else {
                        zzs(zzlhVar);
                    }
                }
            }
        }
        return zzb();
    }

    public final zzcc zzl(int i2, int i3, int i4, zzwq zzwqVar) {
        zzdi.zzd(zza() >= 0);
        this.zzl = null;
        return zzb();
    }

    public final zzcc zzm(int i2, int i3, zzwq zzwqVar) {
        boolean z2 = false;
        if (i2 >= 0 && i2 <= i3 && i3 <= zza()) {
            z2 = true;
        }
        zzdi.zzd(z2);
        this.zzl = zzwqVar;
        zzw(i2, i3);
        return zzb();
    }

    public final zzcc zzn(List list, zzwq zzwqVar) {
        zzw(0, this.zzb.size());
        return zzk(this.zzb.size(), list, zzwqVar);
    }

    public final zzcc zzo(zzwq zzwqVar) {
        int zza = zza();
        if (zzwqVar.zzc() != zza) {
            zzwqVar = zzwqVar.zzf().zzg(0, zza);
        }
        this.zzl = zzwqVar;
        return zzb();
    }

    public final zzuw zzp(zzuy zzuyVar, zzza zzzaVar, long j2) {
        int i2 = zzlp.zzb;
        Object obj = zzuyVar.zza;
        Object obj2 = ((Pair) obj).first;
        zzuy zza = zzuyVar.zza(((Pair) obj).second);
        zzlh zzlhVar = (zzlh) this.zzd.get(obj2);
        zzlhVar.getClass();
        this.zzg.add(zzlhVar);
        zzlg zzlgVar = (zzlg) this.zzf.get(zzlhVar);
        if (zzlgVar != null) {
            zzlgVar.zza.zzk(zzlgVar.zzb);
        }
        zzlhVar.zzc.add(zza);
        zzuq zzI = zzlhVar.zza.zzI(zza, zzzaVar, j2);
        this.zzc.put(zzI, zzlhVar);
        zzt();
        return zzI;
    }

    public final zzwq zzq() {
        return this.zzl;
    }
}
