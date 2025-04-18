package com.google.android.gms.measurement.internal;

import a4.j;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Iterator;
import vd.e;

/* loaded from: classes3.dex */
public final class zzbc {
    final String zza;
    final String zzb;
    final String zzc;
    final long zzd;
    final long zze;
    final zzbe zzf;

    public zzbc(zzhy zzhyVar, String str, String str2, String str3, long j3, long j10, Bundle bundle) {
        zzbe zzbeVar;
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotEmpty(str3);
        this.zza = str2;
        this.zzb = str3;
        this.zzc = TextUtils.isEmpty(str) ? null : str;
        this.zzd = j3;
        this.zze = j10;
        if (j10 != 0 && j10 > j3) {
            zzhyVar.zzj().zzu().zza("Event created with reverse previous/current timestamps. appId", zzgo.zza(str2));
        }
        if (bundle != null && !bundle.isEmpty()) {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    zzhyVar.zzj().zzg().zza("Param name can't be null");
                    it.remove();
                } else {
                    Object zzb = zzhyVar.zzt().zzb(next, bundle2.get(next));
                    if (zzb == null) {
                        zzhyVar.zzj().zzu().zza("Param value can't be null", zzhyVar.zzk().zzb(next));
                        it.remove();
                    } else {
                        zzhyVar.zzt().zza(bundle2, next, zzb);
                    }
                }
            }
            zzbeVar = new zzbe(bundle2);
        } else {
            zzbeVar = new zzbe(new Bundle());
        }
        this.zzf = zzbeVar;
    }

    public final String toString() {
        String str = this.zza;
        String str2 = this.zzb;
        return e.h(j.p("Event{appId='", str, "', name='", str2, "', params="), String.valueOf(this.zzf), "}");
    }

    public final zzbc zza(zzhy zzhyVar, long j3) {
        return new zzbc(zzhyVar, this.zzc, this.zza, this.zzb, this.zzd, j3, this.zzf);
    }

    private zzbc(zzhy zzhyVar, String str, String str2, String str3, long j3, long j10, zzbe zzbeVar) {
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotEmpty(str3);
        Preconditions.checkNotNull(zzbeVar);
        this.zza = str2;
        this.zzb = str3;
        this.zzc = TextUtils.isEmpty(str) ? null : str;
        this.zzd = j3;
        this.zze = j10;
        if (j10 != 0 && j10 > j3) {
            zzhyVar.zzj().zzu().zza("Event created with reverse previous/current timestamps. appId, name", zzgo.zza(str2), zzgo.zza(str3));
        }
        this.zzf = zzbeVar;
    }
}
