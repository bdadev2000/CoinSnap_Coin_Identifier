package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.annotation.GuardedBy;
import com.google.android.gms.common.api.Api;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzejp {

    @GuardedBy
    private final zzggh zzc;

    @GuardedBy
    private zzekf zzf;
    private final String zzh;
    private final int zzi;
    private final zzeke zzj;
    private zzfgh zzk;

    @GuardedBy
    private final Map zza = new HashMap();

    @GuardedBy
    private final List zzb = new ArrayList();

    @GuardedBy
    private final List zzd = new ArrayList();

    @GuardedBy
    private final Set zze = new HashSet();

    @GuardedBy
    private int zzg = Api.BaseClientBuilder.API_PRIORITY_OTHER;

    @GuardedBy
    private boolean zzl = false;

    public zzejp(zzfgt zzfgtVar, zzeke zzekeVar, zzggh zzgghVar) {
        this.zzi = zzfgtVar.zzb.zzb.zzr;
        this.zzj = zzekeVar;
        this.zzc = zzgghVar;
        this.zzh = zzekl.zzc(zzfgtVar);
        List list = zzfgtVar.zzb.zza;
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.zza.put((zzfgh) list.get(i2), Integer.valueOf(i2));
        }
        this.zzb.addAll(list);
    }

    private final synchronized void zze() {
        this.zzj.zzi(this.zzk);
        zzekf zzekfVar = this.zzf;
        if (zzekfVar != null) {
            this.zzc.zzc(zzekfVar);
        } else {
            this.zzc.zzd(new zzeki(3, this.zzh));
        }
    }

    private final synchronized boolean zzf(boolean z2) {
        try {
            for (zzfgh zzfghVar : this.zzb) {
                Integer num = (Integer) this.zza.get(zzfghVar);
                Integer valueOf = Integer.valueOf(num != null ? num.intValue() : Api.BaseClientBuilder.API_PRIORITY_OTHER);
                if (z2 || !this.zze.contains(zzfghVar.zzat)) {
                    if (valueOf.intValue() < this.zzg) {
                        return true;
                    }
                    if (valueOf.intValue() > this.zzg) {
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
        try {
            Iterator it = this.zzd.iterator();
            while (it.hasNext()) {
                Integer num = (Integer) this.zza.get((zzfgh) it.next());
                if (Integer.valueOf(num != null ? num.intValue() : Api.BaseClientBuilder.API_PRIORITY_OTHER).intValue() < this.zzg) {
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
        if (!this.zzb.isEmpty() && ((zzfgh) this.zzb.get(0)).zzav && !this.zzd.isEmpty()) {
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

    public final synchronized zzfgh zza() {
        try {
            if (zzi()) {
                for (int i2 = 0; i2 < this.zzb.size(); i2++) {
                    zzfgh zzfghVar = (zzfgh) this.zzb.get(i2);
                    String str = zzfghVar.zzat;
                    if (!this.zze.contains(str)) {
                        if (zzfghVar.zzav) {
                            this.zzl = true;
                        }
                        if (!TextUtils.isEmpty(str)) {
                            this.zze.add(str);
                        }
                        this.zzd.add(zzfghVar);
                        return (zzfgh) this.zzb.remove(i2);
                    }
                }
            }
            return null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zzb(Throwable th, zzfgh zzfghVar) {
        this.zzl = false;
        this.zzd.remove(zzfghVar);
        this.zze.remove(zzfghVar.zzat);
        if (zzd() || zzh()) {
            return;
        }
        zze();
    }

    public final synchronized void zzc(zzekf zzekfVar, zzfgh zzfghVar) {
        this.zzl = false;
        this.zzd.remove(zzfghVar);
        if (zzd()) {
            zzekfVar.zzr();
            return;
        }
        Integer num = (Integer) this.zza.get(zzfghVar);
        Integer valueOf = Integer.valueOf(num != null ? num.intValue() : Api.BaseClientBuilder.API_PRIORITY_OTHER);
        if (valueOf.intValue() > this.zzg) {
            this.zzj.zzm(zzfghVar);
            return;
        }
        if (this.zzf != null) {
            this.zzj.zzm(this.zzk);
        }
        this.zzg = valueOf.intValue();
        this.zzf = zzekfVar;
        this.zzk = zzfghVar;
        if (zzh()) {
            return;
        }
        zze();
    }

    public final synchronized boolean zzd() {
        return this.zzc.isDone();
    }
}
