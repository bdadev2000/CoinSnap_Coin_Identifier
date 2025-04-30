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
/* loaded from: classes2.dex */
public final class zzekq {
    private final zzggm zzc;
    private zzelg zzf;
    private final String zzh;
    private final int zzi;
    private final zzelf zzj;
    private zzfgt zzk;
    private final Map zza = new HashMap();
    private final List zzb = new ArrayList();
    private final List zzd = new ArrayList();
    private final Set zze = new HashSet();
    private int zzg = Integer.MAX_VALUE;
    private boolean zzl = false;

    public zzekq(zzfhf zzfhfVar, zzelf zzelfVar, zzggm zzggmVar) {
        this.zzi = zzfhfVar.zzb.zzb.zzq;
        this.zzj = zzelfVar;
        this.zzc = zzggmVar;
        this.zzh = zzelm.zzc(zzfhfVar);
        List list = zzfhfVar.zzb.zza;
        for (int i9 = 0; i9 < list.size(); i9++) {
            this.zza.put((zzfgt) list.get(i9), Integer.valueOf(i9));
        }
        this.zzb.addAll(list);
    }

    private final synchronized void zze() {
        this.zzj.zzi(this.zzk);
        zzelg zzelgVar = this.zzf;
        if (zzelgVar != null) {
            this.zzc.zzc(zzelgVar);
        } else {
            this.zzc.zzd(new zzelj(3, this.zzh));
        }
    }

    private final synchronized boolean zzf(boolean z8) {
        int i9;
        try {
            for (zzfgt zzfgtVar : this.zzb) {
                Integer num = (Integer) this.zza.get(zzfgtVar);
                if (num != null) {
                    i9 = num.intValue();
                } else {
                    i9 = Integer.MAX_VALUE;
                }
                if (z8 || !this.zze.contains(zzfgtVar.zzau)) {
                    int i10 = this.zzg;
                    if (i9 < i10) {
                        return true;
                    }
                    if (i9 > i10) {
                        break;
                    }
                }
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized boolean zzg() {
        int i9;
        try {
            Iterator it = this.zzd.iterator();
            while (it.hasNext()) {
                Integer num = (Integer) this.zza.get((zzfgt) it.next());
                if (num != null) {
                    i9 = num.intValue();
                } else {
                    i9 = Integer.MAX_VALUE;
                }
                if (i9 < this.zzg) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
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
        if (!this.zzb.isEmpty() && ((zzfgt) this.zzb.get(0)).zzaw && !this.zzd.isEmpty()) {
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

    public final synchronized zzfgt zza() {
        try {
            if (zzi()) {
                for (int i9 = 0; i9 < this.zzb.size(); i9++) {
                    zzfgt zzfgtVar = (zzfgt) this.zzb.get(i9);
                    String str = zzfgtVar.zzau;
                    if (!this.zze.contains(str)) {
                        if (zzfgtVar.zzaw) {
                            this.zzl = true;
                        }
                        if (!TextUtils.isEmpty(str)) {
                            this.zze.add(str);
                        }
                        this.zzd.add(zzfgtVar);
                        return (zzfgt) this.zzb.remove(i9);
                    }
                }
            }
            return null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zzb(Throwable th, zzfgt zzfgtVar) {
        this.zzl = false;
        this.zzd.remove(zzfgtVar);
        this.zze.remove(zzfgtVar.zzau);
        if (!zzd() && !zzh()) {
            zze();
        }
    }

    public final synchronized void zzc(zzelg zzelgVar, zzfgt zzfgtVar) {
        int i9;
        this.zzl = false;
        this.zzd.remove(zzfgtVar);
        if (zzd()) {
            zzelgVar.zzq();
            return;
        }
        Integer num = (Integer) this.zza.get(zzfgtVar);
        if (num != null) {
            i9 = num.intValue();
        } else {
            i9 = Integer.MAX_VALUE;
        }
        if (i9 > this.zzg) {
            this.zzj.zzm(zzfgtVar);
            return;
        }
        if (this.zzf != null) {
            this.zzj.zzm(this.zzk);
        }
        this.zzg = i9;
        this.zzf = zzelgVar;
        this.zzk = zzfgtVar;
        if (!zzh()) {
            zze();
        }
    }

    public final synchronized boolean zzd() {
        return this.zzc.isDone();
    }
}
