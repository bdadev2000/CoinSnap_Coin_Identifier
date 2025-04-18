package com.google.android.gms.measurement.internal;

import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzfy;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzy {
    private zzfy.zzf zza;
    private Long zzb;
    private long zzc;
    private final /* synthetic */ zzt zzd;

    public final zzfy.zzf zza(String str, zzfy.zzf zzfVar) {
        boolean z10;
        boolean z11;
        Object obj;
        String zzg = zzfVar.zzg();
        List<zzfy.zzh> zzh = zzfVar.zzh();
        this.zzd.g_();
        Long l10 = (Long) zzoo.zzb(zzfVar, "_eid");
        if (l10 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && zzg.equals("_ep")) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            Preconditions.checkNotNull(l10);
            this.zzd.g_();
            zzg = (String) zzoo.zzb(zzfVar, "_en");
            if (TextUtils.isEmpty(zzg)) {
                this.zzd.zzj().zzn().zza("Extra parameter without an event name. eventId", l10);
                return null;
            }
            if (this.zza == null || this.zzb == null || l10.longValue() != this.zzb.longValue()) {
                Pair<zzfy.zzf, Long> zza = this.zzd.zzh().zza(str, l10);
                if (zza != null && (obj = zza.first) != null) {
                    this.zza = (zzfy.zzf) obj;
                    this.zzc = ((Long) zza.second).longValue();
                    this.zzd.g_();
                    this.zzb = (Long) zzoo.zzb(this.zza, "_eid");
                } else {
                    this.zzd.zzj().zzn().zza("Extra parameter without existing main event. eventName, eventId", zzg, l10);
                    return null;
                }
            }
            long j3 = this.zzc - 1;
            this.zzc = j3;
            if (j3 <= 0) {
                zzal zzh2 = this.zzd.zzh();
                zzh2.zzt();
                zzh2.zzj().zzp().zza("Clearing complex main event info. appId", str);
                try {
                    zzh2.e_().execSQL("delete from main_event_params where app_id=?", new String[]{str});
                } catch (SQLiteException e2) {
                    zzh2.zzj().zzg().zza("Error clearing complex main event", e2);
                }
            } else {
                this.zzd.zzh().zza(str, l10, this.zzc, this.zza);
            }
            ArrayList arrayList = new ArrayList();
            for (zzfy.zzh zzhVar : this.zza.zzh()) {
                this.zzd.g_();
                if (zzoo.zza(zzfVar, zzhVar.zzg()) == null) {
                    arrayList.add(zzhVar);
                }
            }
            if (!arrayList.isEmpty()) {
                arrayList.addAll(zzh);
                zzh = arrayList;
            } else {
                this.zzd.zzj().zzn().zza("No unique parameters in main event. eventName", zzg);
            }
        } else if (z10) {
            this.zzb = l10;
            this.zza = zzfVar;
            this.zzd.g_();
            long longValue = ((Long) zzoo.zza(zzfVar, "_epc", (Object) 0L)).longValue();
            this.zzc = longValue;
            if (longValue <= 0) {
                this.zzd.zzj().zzn().zza("Complex event with zero extra param count. eventName", zzg);
            } else {
                this.zzd.zzh().zza(str, (Long) Preconditions.checkNotNull(l10), this.zzc, zzfVar);
            }
        }
        return (zzfy.zzf) ((com.google.android.gms.internal.measurement.zzjt) zzfVar.zzcd().zza(zzg).zzd().zza(zzh).zzai());
    }

    private zzy(zzt zztVar) {
        this.zzd = zztVar;
    }
}
