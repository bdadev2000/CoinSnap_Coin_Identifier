package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.common.util.Clock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zzeiv {
    private final Clock zza;
    private final zzeix zzb;
    private final zzflr zzc;
    private final LinkedHashMap zzd = new LinkedHashMap();
    private final boolean zze = ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzgI)).booleanValue();
    private final zzefg zzf;
    private boolean zzg;
    private long zzh;
    private long zzi;

    public zzeiv(Clock clock, zzeix zzeixVar, zzefg zzefgVar, zzflr zzflrVar) {
        this.zza = clock;
        this.zzb = zzeixVar;
        this.zzf = zzefgVar;
        this.zzc = zzflrVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized boolean zzq(zzfet zzfetVar) {
        zzeiu zzeiuVar = (zzeiu) this.zzd.get(zzfetVar);
        if (zzeiuVar == null) {
            return false;
        }
        if (zzeiuVar.zzc != 8) {
            return false;
        }
        return true;
    }

    public final synchronized long zza() {
        return this.zzh;
    }

    public final synchronized ua.b zzf(zzfff zzfffVar, zzfet zzfetVar, ua.b bVar, zzfln zzflnVar) {
        zzfew zzfewVar = zzfffVar.zzb.zzb;
        long elapsedRealtime = this.zza.elapsedRealtime();
        String str = zzfetVar.zzw;
        if (str != null) {
            this.zzd.put(zzfetVar, new zzeiu(str, zzfetVar.zzaf, 9, 0L, null));
            zzgei.zzr(bVar, new zzeit(this, elapsedRealtime, zzfewVar, zzfetVar, str, zzflnVar, zzfffVar), zzcaj.zzf);
        }
        return bVar;
    }

    public final synchronized String zzg() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.zzd.entrySet().iterator();
        while (it.hasNext()) {
            zzeiu zzeiuVar = (zzeiu) ((Map.Entry) it.next()).getValue();
            if (zzeiuVar.zzc != Integer.MAX_VALUE) {
                arrayList.add(zzeiuVar.toString());
            }
        }
        return TextUtils.join("_", arrayList);
    }

    public final synchronized void zzi(@Nullable zzfet zzfetVar) {
        this.zzh = this.zza.elapsedRealtime() - this.zzi;
        if (zzfetVar != null) {
            this.zzf.zze(zzfetVar);
        }
        this.zzg = true;
    }

    public final synchronized void zzj() {
        this.zzh = this.zza.elapsedRealtime() - this.zzi;
    }

    public final synchronized void zzk(List list) {
        this.zzi = this.zza.elapsedRealtime();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzfet zzfetVar = (zzfet) it.next();
            if (!TextUtils.isEmpty(zzfetVar.zzw)) {
                this.zzd.put(zzfetVar, new zzeiu(zzfetVar.zzw, zzfetVar.zzaf, Integer.MAX_VALUE, 0L, null));
            }
        }
    }

    public final synchronized void zzl() {
        this.zzi = this.zza.elapsedRealtime();
    }

    public final synchronized void zzm(zzfet zzfetVar) {
        zzeiu zzeiuVar = (zzeiu) this.zzd.get(zzfetVar);
        if (zzeiuVar != null && !this.zzg) {
            zzeiuVar.zzc = 8;
        }
    }
}
