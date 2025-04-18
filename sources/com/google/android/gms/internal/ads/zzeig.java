package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzeig {
    private final zzgfa zzc;
    private zzeiw zzf;
    private final String zzh;
    private final int zzi;
    private final zzeiv zzj;
    private zzfet zzk;
    private final Map zza = new HashMap();
    private final List zzb = new ArrayList();
    private final List zzd = new ArrayList();
    private final Set zze = new HashSet();
    private int zzg = Integer.MAX_VALUE;
    private boolean zzl = false;

    public zzeig(zzfff zzfffVar, zzeiv zzeivVar, zzgfa zzgfaVar) {
        this.zzi = zzfffVar.zzb.zzb.zzr;
        this.zzj = zzeivVar;
        this.zzc = zzgfaVar;
        this.zzh = zzejc.zzc(zzfffVar);
        List list = zzfffVar.zzb.zza;
        for (int i10 = 0; i10 < list.size(); i10++) {
            this.zza.put((zzfet) list.get(i10), Integer.valueOf(i10));
        }
        this.zzb.addAll(list);
    }

    private final synchronized void zze() {
        this.zzj.zzi(this.zzk);
        zzeiw zzeiwVar = this.zzf;
        if (zzeiwVar != null) {
            this.zzc.zzc(zzeiwVar);
        } else {
            this.zzc.zzd(new zzeiz(3, this.zzh));
        }
    }

    private final synchronized boolean zzf(boolean z10) {
        int i10;
        for (zzfet zzfetVar : this.zzb) {
            Integer num = (Integer) this.zza.get(zzfetVar);
            if (num != null) {
                i10 = num.intValue();
            } else {
                i10 = Integer.MAX_VALUE;
            }
            Integer valueOf = Integer.valueOf(i10);
            if (z10 || !this.zze.contains(zzfetVar.zzat)) {
                if (valueOf.intValue() < this.zzg) {
                    return true;
                }
                if (valueOf.intValue() > this.zzg) {
                    break;
                }
            }
        }
        return false;
    }

    private final synchronized boolean zzg() {
        int i10;
        Iterator it = this.zzd.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) this.zza.get((zzfet) it.next());
            if (num != null) {
                i10 = num.intValue();
            } else {
                i10 = Integer.MAX_VALUE;
            }
            if (Integer.valueOf(i10).intValue() < this.zzg) {
                return true;
            }
        }
        return false;
    }

    private final synchronized boolean zzh() {
        if (!zzf(true)) {
            if (!zzg()) {
                return false;
            }
        }
        return true;
    }

    private final synchronized boolean zzi() {
        if (this.zzl) {
            return false;
        }
        if (!this.zzb.isEmpty() && ((zzfet) this.zzb.get(0)).zzav && !this.zzd.isEmpty()) {
            return false;
        }
        if (!zzd()) {
            List list = this.zzd;
            if (list.size() < this.zzi) {
                if (zzf(false)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final synchronized zzfet zza() {
        if (zzi()) {
            for (int i10 = 0; i10 < this.zzb.size(); i10++) {
                zzfet zzfetVar = (zzfet) this.zzb.get(i10);
                String str = zzfetVar.zzat;
                if (!this.zze.contains(str)) {
                    if (zzfetVar.zzav) {
                        this.zzl = true;
                    }
                    if (!TextUtils.isEmpty(str)) {
                        this.zze.add(str);
                    }
                    this.zzd.add(zzfetVar);
                    return (zzfet) this.zzb.remove(i10);
                }
            }
        }
        return null;
    }

    public final synchronized void zzb(Throwable th2, zzfet zzfetVar) {
        this.zzl = false;
        this.zzd.remove(zzfetVar);
        this.zze.remove(zzfetVar.zzat);
        if (!zzd() && !zzh()) {
            zze();
        }
    }

    public final synchronized void zzc(zzeiw zzeiwVar, zzfet zzfetVar) {
        int i10;
        this.zzl = false;
        this.zzd.remove(zzfetVar);
        if (zzd()) {
            zzeiwVar.zzr();
            return;
        }
        Integer num = (Integer) this.zza.get(zzfetVar);
        if (num != null) {
            i10 = num.intValue();
        } else {
            i10 = Integer.MAX_VALUE;
        }
        Integer valueOf = Integer.valueOf(i10);
        if (valueOf.intValue() > this.zzg) {
            this.zzj.zzm(zzfetVar);
            return;
        }
        if (this.zzf != null) {
            this.zzj.zzm(this.zzk);
        }
        this.zzg = valueOf.intValue();
        this.zzf = zzeiwVar;
        this.zzk = zzfetVar;
        if (!zzh()) {
            zze();
        }
    }

    public final synchronized boolean zzd() {
        return this.zzc.isDone();
    }
}
