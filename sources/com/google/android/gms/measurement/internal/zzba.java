package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.mbridge.msdk.foundation.entity.o;
import java.util.Iterator;
import x0.AbstractC2914a;

/* loaded from: classes2.dex */
public final class zzba {
    final String zza;
    final String zzb;
    final long zzc;
    final long zzd;
    final zzbc zze;
    private final String zzf;

    public zzba(zzhj zzhjVar, String str, String str2, String str3, long j7, long j9, Bundle bundle) {
        zzbc zzbcVar;
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotEmpty(str3);
        this.zza = str2;
        this.zzb = str3;
        this.zzf = TextUtils.isEmpty(str) ? null : str;
        this.zzc = j7;
        this.zzd = j9;
        if (j9 != 0 && j9 > j7) {
            zzhjVar.zzj().zzu().zza("Event created with reverse previous/current timestamps. appId", zzfw.zza(str2));
        }
        if (bundle != null && !bundle.isEmpty()) {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    zzhjVar.zzj().zzg().zza("Param name can't be null");
                    it.remove();
                } else {
                    Object zzb = zzhjVar.zzt().zzb(next, bundle2.get(next));
                    if (zzb == null) {
                        zzhjVar.zzj().zzu().zza("Param value can't be null", zzhjVar.zzk().zzb(next));
                        it.remove();
                    } else {
                        zzhjVar.zzt().zza(bundle2, next, zzb);
                    }
                }
            }
            zzbcVar = new zzbc(bundle2);
        } else {
            zzbcVar = new zzbc(new Bundle());
        }
        this.zze = zzbcVar;
    }

    public final String toString() {
        String str = this.zza;
        String str2 = this.zzb;
        return AbstractC2914a.h(o.o("Event{appId='", str, "', name='", str2, "', params="), String.valueOf(this.zze), "}");
    }

    public final zzba zza(zzhj zzhjVar, long j7) {
        return new zzba(zzhjVar, this.zzf, this.zza, this.zzb, this.zzc, j7, this.zze);
    }

    private zzba(zzhj zzhjVar, String str, String str2, String str3, long j7, long j9, zzbc zzbcVar) {
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotEmpty(str3);
        Preconditions.checkNotNull(zzbcVar);
        this.zza = str2;
        this.zzb = str3;
        this.zzf = TextUtils.isEmpty(str) ? null : str;
        this.zzc = j7;
        this.zzd = j9;
        if (j9 != 0 && j9 > j7) {
            zzhjVar.zzj().zzu().zza("Event created with reverse previous/current timestamps. appId, name", zzfw.zza(str2), zzfw.zza(str3));
        }
        this.zze = zzbcVar;
    }
}
