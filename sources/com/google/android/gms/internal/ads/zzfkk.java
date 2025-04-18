package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public final class zzfkk {
    public static void zza(ua.b bVar, zzfkl zzfklVar, zzfka zzfkaVar) {
        zzg(bVar, zzfklVar, zzfkaVar, false);
    }

    public static void zzb(ua.b bVar, zzfkl zzfklVar, zzfka zzfkaVar) {
        zzg(bVar, zzfklVar, zzfkaVar, true);
    }

    public static void zzc(ua.b bVar, zzfkl zzfklVar, zzfka zzfkaVar) {
        if (!((Boolean) zzbeg.zzc.zze()).booleanValue()) {
            return;
        }
        zzgei.zzr(zzgdz.zzu(bVar), new zzfkj(zzfklVar, zzfkaVar), zzcaj.zzf);
    }

    public static void zzd(ua.b bVar, zzfka zzfkaVar) {
        if (!((Boolean) zzbeg.zzc.zze()).booleanValue()) {
            return;
        }
        zzgei.zzr(zzgdz.zzu(bVar), new zzfkh(zzfkaVar), zzcaj.zzf);
    }

    public static boolean zze(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return Pattern.matches((String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzit), str);
    }

    public static int zzf(zzffo zzffoVar) {
        int zzf = com.google.android.gms.ads.nonagon.signalgeneration.zzv.zzf(zzffoVar) - 1;
        return (zzf == 0 || zzf == 1) ? 7 : 23;
    }

    private static void zzg(ua.b bVar, zzfkl zzfklVar, zzfka zzfkaVar, boolean z10) {
        if (!((Boolean) zzbeg.zzc.zze()).booleanValue()) {
            return;
        }
        zzgei.zzr(zzgdz.zzu(bVar), new zzfki(zzfklVar, zzfkaVar, z10), zzcaj.zzf);
    }
}
