package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.common.util.Clock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzelf {
    private final Clock zza;
    private final zzelh zzb;
    private final zzfoe zzc;
    private final LinkedHashMap zzd = new LinkedHashMap();
    private final boolean zze = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzhb)).booleanValue();
    private final zzehq zzf;
    private boolean zzg;
    private long zzh;
    private long zzi;

    public zzelf(Clock clock, zzelh zzelhVar, zzehq zzehqVar, zzfoe zzfoeVar) {
        this.zza = clock;
        this.zzb = zzelhVar;
        this.zzf = zzehqVar;
        this.zzc = zzfoeVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized boolean zzq(zzfgt zzfgtVar) {
        zzele zzeleVar = (zzele) this.zzd.get(zzfgtVar);
        if (zzeleVar == null) {
            return false;
        }
        if (zzeleVar.zzc != 8) {
            return false;
        }
        return true;
    }

    public final synchronized long zza() {
        return this.zzh;
    }

    public final synchronized f4.c zzf(zzfhf zzfhfVar, zzfgt zzfgtVar, f4.c cVar, zzfoa zzfoaVar) {
        zzfgw zzfgwVar = zzfhfVar.zzb.zzb;
        long elapsedRealtime = this.zza.elapsedRealtime();
        String str = zzfgtVar.zzx;
        if (str != null) {
            this.zzd.put(zzfgtVar, new zzele(str, zzfgtVar.zzag, 9, 0L, null));
            zzgft.zzr(cVar, new zzeld(this, elapsedRealtime, zzfgwVar, zzfgtVar, str, zzfoaVar, zzfhfVar), zzcci.zzf);
        }
        return cVar;
    }

    public final synchronized String zzg() {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            Iterator it = this.zzd.entrySet().iterator();
            while (it.hasNext()) {
                zzele zzeleVar = (zzele) ((Map.Entry) it.next()).getValue();
                if (zzeleVar.zzc != Integer.MAX_VALUE) {
                    arrayList.add(zzeleVar.toString());
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return TextUtils.join("_", arrayList);
    }

    public final synchronized void zzi(@Nullable zzfgt zzfgtVar) {
        try {
            this.zzh = this.zza.elapsedRealtime() - this.zzi;
            if (zzfgtVar != null) {
                this.zzf.zze(zzfgtVar);
            }
            this.zzg = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zzj() {
        this.zzh = this.zza.elapsedRealtime() - this.zzi;
    }

    public final synchronized void zzk(List list) {
        this.zzi = this.zza.elapsedRealtime();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzfgt zzfgtVar = (zzfgt) it.next();
            if (!TextUtils.isEmpty(zzfgtVar.zzx)) {
                this.zzd.put(zzfgtVar, new zzele(zzfgtVar.zzx, zzfgtVar.zzag, Integer.MAX_VALUE, 0L, null));
            }
        }
    }

    public final synchronized void zzl() {
        this.zzi = this.zza.elapsedRealtime();
    }

    public final synchronized void zzm(zzfgt zzfgtVar) {
        zzele zzeleVar = (zzele) this.zzd.get(zzfgtVar);
        if (zzeleVar != null && !this.zzg) {
            zzeleVar.zzc = 8;
        }
    }
}
