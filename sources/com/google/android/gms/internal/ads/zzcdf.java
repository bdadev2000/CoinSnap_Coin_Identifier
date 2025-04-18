package com.google.android.gms.internal.ads;

import a4.j;
import android.content.Context;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zzcdf implements zzbjr {
    private boolean zza;

    private static int zzb(Context context, Map map, String str, int i10) {
        String str2 = (String) map.get(str);
        if (str2 != null) {
            try {
                com.google.android.gms.ads.internal.client.zzbc.zzb();
                i10 = com.google.android.gms.ads.internal.util.client.zzf.zzy(context, Integer.parseInt(str2));
            } catch (NumberFormatException unused) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("Could not parse " + str + " in a video GMSG: " + str2);
            }
        }
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            StringBuilder p10 = j.p("Parse pixels for ", str, ", got string ", str2, ", int ");
            p10.append(i10);
            p10.append(".");
            com.google.android.gms.ads.internal.util.zze.zza(p10.toString());
        }
        return i10;
    }

    private static void zzc(zzcbt zzcbtVar, Map map) {
        String str = (String) map.get("minBufferMs");
        String str2 = (String) map.get("maxBufferMs");
        String str3 = (String) map.get("bufferForPlaybackMs");
        String str4 = (String) map.get("bufferForPlaybackAfterRebufferMs");
        String str5 = (String) map.get("socketReceiveBufferSize");
        if (str != null) {
            try {
                zzcbtVar.zzB(Integer.parseInt(str));
            } catch (NumberFormatException unused) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj(String.format("Could not parse buffer parameters in loadControl video GMSG: (%s, %s)", str, str2));
                return;
            }
        }
        if (str2 != null) {
            zzcbtVar.zzA(Integer.parseInt(str2));
        }
        if (str3 != null) {
            zzcbtVar.zzy(Integer.parseInt(str3));
        }
        if (str4 != null) {
            zzcbtVar.zzz(Integer.parseInt(str4));
        }
        if (str5 != null) {
            zzcbtVar.zzD(Integer.parseInt(str5));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:149:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02c3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzbjr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* bridge */ /* synthetic */ void zza(java.lang.Object r21, java.util.Map r22) {
        /*
            Method dump skipped, instructions count: 1114
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcdf.zza(java.lang.Object, java.util.Map):void");
    }
}
