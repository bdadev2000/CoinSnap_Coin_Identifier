package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes2.dex */
public final /* synthetic */ class zzfmb {
    /* JADX WARN: Removed duplicated region for block: B:26:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.zzfmc zza(android.content.Context r2, com.google.android.gms.internal.ads.zzfmu r3) {
        /*
            boolean r0 = com.google.android.gms.internal.ads.zzfmq.zza()
            if (r0 == 0) goto L70
            com.google.android.gms.internal.ads.zzfmu r0 = com.google.android.gms.internal.ads.zzfmu.CUI_NAME_UNKNOWN
            int r0 = r3.ordinal()
            r1 = 4
            if (r0 == r1) goto L5c
            r1 = 5
            if (r0 == r1) goto L5c
            r1 = 6
            if (r0 == r1) goto L4f
            r1 = 18
            if (r0 == r1) goto L4f
            r1 = 20
            if (r0 == r1) goto L4f
            r1 = 23
            if (r0 == r1) goto L4f
            r1 = 31
            if (r0 == r1) goto L4f
            r1 = 32
            if (r0 == r1) goto L4f
            r1 = 39
            if (r0 == r1) goto L42
            r1 = 40
            if (r0 == r1) goto L42
            switch(r0) {
                case 13: goto L35;
                case 14: goto L5c;
                case 15: goto L5c;
                case 16: goto L5c;
                default: goto L34;
            }
        L34:
            goto L70
        L35:
            com.google.android.gms.internal.ads.zzbfv r0 = com.google.android.gms.internal.ads.zzbgd.zzb
            java.lang.Object r0 = r0.zze()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            goto L68
        L42:
            com.google.android.gms.internal.ads.zzbfv r0 = com.google.android.gms.internal.ads.zzbgd.zze
            java.lang.Object r0 = r0.zze()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            goto L68
        L4f:
            com.google.android.gms.internal.ads.zzbfv r0 = com.google.android.gms.internal.ads.zzbgd.zzd
            java.lang.Object r0 = r0.zze()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            goto L68
        L5c:
            com.google.android.gms.internal.ads.zzbfv r0 = com.google.android.gms.internal.ads.zzbgd.zzc
            java.lang.Object r0 = r0.zze()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
        L68:
            if (r0 == 0) goto L70
            com.google.android.gms.internal.ads.zzfme r0 = new com.google.android.gms.internal.ads.zzfme
            r0.<init>(r2, r3)
            return r0
        L70:
            com.google.android.gms.internal.ads.zzfnr r2 = new com.google.android.gms.internal.ads.zzfnr
            r2.<init>()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfmb.zza(android.content.Context, com.google.android.gms.internal.ads.zzfmu):com.google.android.gms.internal.ads.zzfmc");
    }

    public static zzfmc zzb(Context context, zzfmu zzfmuVar, zzfmw zzfmwVar, com.google.android.gms.ads.internal.client.zzl zzlVar) {
        zzfmc zza = zza(context, zzfmuVar);
        if (zza instanceof zzfme) {
            zza.zzj();
            zza.zzd(zzfmwVar);
            zza.zzg(com.google.android.gms.ads.nonagon.signalgeneration.zzp.zza(zzlVar.zzm));
            if (zzfmm.zzf(zzlVar.zzp)) {
                zza.zzf(zzlVar.zzp);
            }
        }
        return zza;
    }
}
