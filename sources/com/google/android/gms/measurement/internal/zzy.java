package com.google.android.gms.measurement.internal;

import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzfn;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzy {
    private zzfn.zzf zza;
    private Long zzb;
    private long zzc;
    private final /* synthetic */ zzu zzd;

    public final zzfn.zzf zza(String str, zzfn.zzf zzfVar) {
        boolean z8;
        Object obj;
        String zzg = zzfVar.zzg();
        List<zzfn.zzh> zzh = zzfVar.zzh();
        this.zzd.g_();
        Long l = (Long) zznl.zzb(zzfVar, "_eid");
        if (l != null) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z8 && zzg.equals("_ep")) {
            Preconditions.checkNotNull(l);
            this.zzd.g_();
            zzg = (String) zznl.zzb(zzfVar, "_en");
            if (TextUtils.isEmpty(zzg)) {
                this.zzd.zzj().zzm().zza("Extra parameter without an event name. eventId", l);
                return null;
            }
            if (this.zza == null || this.zzb == null || l.longValue() != this.zzb.longValue()) {
                Pair<zzfn.zzf, Long> zza = this.zzd.zzh().zza(str, l);
                if (zza != null && (obj = zza.first) != null) {
                    this.zza = (zzfn.zzf) obj;
                    this.zzc = ((Long) zza.second).longValue();
                    this.zzd.g_();
                    this.zzb = (Long) zznl.zzb(this.zza, "_eid");
                } else {
                    this.zzd.zzj().zzm().zza("Extra parameter without existing main event. eventName, eventId", zzg, l);
                    return null;
                }
            }
            long j7 = this.zzc - 1;
            this.zzc = j7;
            if (j7 <= 0) {
                zzal zzh2 = this.zzd.zzh();
                zzh2.zzt();
                zzh2.zzj().zzp().zza("Clearing complex main event info. appId", str);
                try {
                    zzh2.e_().execSQL("delete from main_event_params where app_id=?", new String[]{str});
                } catch (SQLiteException e4) {
                    zzh2.zzj().zzg().zza("Error clearing complex main event", e4);
                }
            } else {
                this.zzd.zzh().zza(str, l, this.zzc, this.zza);
            }
            ArrayList arrayList = new ArrayList();
            for (zzfn.zzh zzhVar : this.zza.zzh()) {
                this.zzd.g_();
                if (zznl.zza(zzfVar, zzhVar.zzg()) == null) {
                    arrayList.add(zzhVar);
                }
            }
            if (!arrayList.isEmpty()) {
                arrayList.addAll(zzh);
                zzh = arrayList;
            } else {
                this.zzd.zzj().zzm().zza("No unique parameters in main event. eventName", zzg);
            }
        } else if (z8) {
            this.zzb = l;
            this.zza = zzfVar;
            this.zzd.g_();
            long longValue = ((Long) zznl.zza(zzfVar, "_epc", (Object) 0L)).longValue();
            this.zzc = longValue;
            if (longValue <= 0) {
                this.zzd.zzj().zzm().zza("Complex event with zero extra param count. eventName", zzg);
            } else {
                this.zzd.zzh().zza(str, (Long) Preconditions.checkNotNull(l), this.zzc, zzfVar);
            }
        }
        return (zzfn.zzf) ((com.google.android.gms.internal.measurement.zzjk) zzfVar.zzcc().zza(zzg).zzd().zza(zzh).zzai());
    }

    private zzy(zzu zzuVar) {
        this.zzd = zzuVar;
    }
}
