package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.regex.Pattern;

/* loaded from: classes4.dex */
public final class zzflz {
    public static void zza(ListenableFuture listenableFuture, zzfma zzfmaVar, zzflp zzflpVar) {
        zzg(listenableFuture, zzfmaVar, zzflpVar, false);
    }

    public static void zzb(ListenableFuture listenableFuture, zzfma zzfmaVar, zzflp zzflpVar) {
        zzg(listenableFuture, zzfmaVar, zzflpVar, true);
    }

    public static void zzc(ListenableFuture listenableFuture, zzfma zzfmaVar, zzflp zzflpVar) {
        if (((Boolean) zzbek.zzc.zze()).booleanValue()) {
            zzgfo.zzr(zzgff.zzu(listenableFuture), new zzfly(zzfmaVar, zzflpVar), zzcan.zzf);
        }
    }

    public static void zzd(ListenableFuture listenableFuture, zzflp zzflpVar) {
        if (((Boolean) zzbek.zzc.zze()).booleanValue()) {
            zzgfo.zzr(zzgff.zzu(listenableFuture), new zzflw(zzflpVar), zzcan.zzf);
        }
    }

    public static boolean zze(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return Pattern.matches((String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzir), str);
    }

    public static int zzf(zzfhc zzfhcVar) {
        int zzf = com.google.android.gms.ads.nonagon.signalgeneration.zzv.zzf(zzfhcVar) - 1;
        return (zzf == 0 || zzf == 1) ? 7 : 23;
    }

    private static void zzg(ListenableFuture listenableFuture, zzfma zzfmaVar, zzflp zzflpVar, boolean z2) {
        if (((Boolean) zzbek.zzc.zze()).booleanValue()) {
            zzgfo.zzr(zzgff.zzu(listenableFuture), new zzflx(zzfmaVar, zzflpVar, z2), zzcan.zzf);
        }
    }
}
