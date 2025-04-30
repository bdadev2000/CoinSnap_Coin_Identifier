package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class zzfmm {
    public static zzfmu zza(zzfho zzfhoVar) {
        int zzf = com.google.android.gms.ads.nonagon.signalgeneration.zzp.zzf(zzfhoVar) - 1;
        if (zzf != 0 && zzf != 1) {
            return zzfmu.CUI_NAME_SCAR_RENDERING;
        }
        return zzfmu.CUI_NAME_ADREQUEST;
    }

    public static void zzb(f4.c cVar, zzfmn zzfmnVar, zzfmc zzfmcVar) {
        zzg(cVar, zzfmnVar, zzfmcVar, false);
    }

    public static void zzc(f4.c cVar, zzfmn zzfmnVar, zzfmc zzfmcVar) {
        zzg(cVar, zzfmnVar, zzfmcVar, true);
    }

    public static void zzd(f4.c cVar, zzfmn zzfmnVar, zzfmc zzfmcVar) {
        if (!((Boolean) zzbgd.zzc.zze()).booleanValue()) {
            return;
        }
        zzgft.zzr(zzgfk.zzu(cVar), new zzfml(zzfmnVar, zzfmcVar), zzcci.zzf);
    }

    public static void zze(f4.c cVar, zzfmc zzfmcVar) {
        if (!((Boolean) zzbgd.zzc.zze()).booleanValue()) {
            return;
        }
        zzgft.zzr(zzgfk.zzu(cVar), new zzfmj(zzfmcVar), zzcci.zzf);
    }

    public static boolean zzf(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return Pattern.matches((String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zziO), str);
    }

    private static void zzg(f4.c cVar, zzfmn zzfmnVar, zzfmc zzfmcVar, boolean z8) {
        if (!((Boolean) zzbgd.zzc.zze()).booleanValue()) {
            return;
        }
        zzgft.zzr(zzgfk.zzu(cVar), new zzfmk(zzfmnVar, zzfmcVar, z8), zzcci.zzf);
    }
}
