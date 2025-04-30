package com.google.android.gms.internal.consent_sdk;

import com.google.android.ump.ConsentInformation;

/* loaded from: classes2.dex */
final class zzw {
    private final zzx zza;
    private final zzck zzb;
    private int zzc = 0;
    private ConsentInformation.PrivacyOptionsRequirementStatus zzd = ConsentInformation.PrivacyOptionsRequirementStatus.UNKNOWN;

    public zzw(zzx zzxVar, zzck zzckVar) {
        this.zza = zzxVar;
        this.zzb = zzckVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00a2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0081 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.consent_sdk.zzz zza() throws com.google.android.gms.internal.consent_sdk.zzg {
        /*
            r11 = this;
            r0 = 1
            com.google.android.gms.internal.consent_sdk.zzck r1 = r11.zzb
            int r2 = r1.zzf
            int r3 = r2 + (-1)
            r4 = 0
            if (r2 == 0) goto Lc3
            java.lang.String r2 = "Invalid response from server."
            r5 = 2
            r6 = 3
            switch(r3) {
                case 1: goto L41;
                case 2: goto L41;
                case 3: goto L41;
                case 4: goto L3e;
                case 5: goto L3b;
                case 6: goto L29;
                case 7: goto L17;
                default: goto L11;
            }
        L11:
            com.google.android.gms.internal.consent_sdk.zzg r1 = new com.google.android.gms.internal.consent_sdk.zzg
            r1.<init>(r0, r2)
            throw r1
        L17:
            com.google.android.gms.internal.consent_sdk.zzg r0 = new com.google.android.gms.internal.consent_sdk.zzg
            java.lang.String r1 = r1.zzc
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = "Publisher misconfiguration: "
            java.lang.String r1 = r2.concat(r1)
            r0.<init>(r6, r1)
            throw r0
        L29:
            com.google.android.gms.internal.consent_sdk.zzg r2 = new com.google.android.gms.internal.consent_sdk.zzg
            java.lang.String r1 = r1.zzc
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r3 = "Invalid response from server: "
            java.lang.String r1 = r3.concat(r1)
            r2.<init>(r0, r1)
            throw r2
        L3b:
            r11.zzc = r0
            goto L43
        L3e:
            r11.zzc = r5
            goto L43
        L41:
            r11.zzc = r6
        L43:
            int r3 = r1.zzg
            int r6 = r3 + (-1)
            if (r3 == 0) goto Lc2
            if (r6 == r0) goto L58
            if (r6 != r5) goto L52
            com.google.android.ump.ConsentInformation$PrivacyOptionsRequirementStatus r2 = com.google.android.ump.ConsentInformation.PrivacyOptionsRequirementStatus.NOT_REQUIRED
            r11.zzd = r2
            goto L5c
        L52:
            com.google.android.gms.internal.consent_sdk.zzg r1 = new com.google.android.gms.internal.consent_sdk.zzg
            r1.<init>(r0, r2)
            throw r1
        L58:
            com.google.android.ump.ConsentInformation$PrivacyOptionsRequirementStatus r2 = com.google.android.ump.ConsentInformation.PrivacyOptionsRequirementStatus.REQUIRED
            r11.zzd = r2
        L5c:
            java.lang.String r2 = r1.zza
            if (r2 != 0) goto L62
            r3 = r4
            goto L69
        L62:
            com.google.android.gms.internal.consent_sdk.zzbp r3 = new com.google.android.gms.internal.consent_sdk.zzbp
            java.lang.String r6 = r1.zzb
            r3.<init>(r6, r2)
        L69:
            com.google.android.gms.internal.consent_sdk.zzx r2 = r11.zza
            com.google.android.gms.internal.consent_sdk.zzap r2 = com.google.android.gms.internal.consent_sdk.zzx.zzc(r2)
            java.util.HashSet r6 = new java.util.HashSet
            java.util.List r1 = r1.zzd
            r6.<init>(r1)
            r2.zzi(r6)
            com.google.android.gms.internal.consent_sdk.zzck r1 = r11.zzb
            java.util.List r1 = r1.zze
            java.util.Iterator r1 = r1.iterator()
        L81:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Lb8
            java.lang.Object r2 = r1.next()
            com.google.android.gms.internal.consent_sdk.zzcj r2 = (com.google.android.gms.internal.consent_sdk.zzcj) r2
            int r6 = r2.zzb
            int r7 = r6 + (-1)
            if (r6 == 0) goto Lb7
            if (r7 == 0) goto L99
            if (r7 == r0) goto L9e
            if (r7 == r5) goto L9b
        L99:
            r6 = r4
            goto La0
        L9b:
            java.lang.String r6 = "clear"
            goto La0
        L9e:
            java.lang.String r6 = "write"
        La0:
            if (r6 == 0) goto L81
            com.google.android.gms.internal.consent_sdk.zzx r7 = r11.zza
            com.google.android.gms.internal.consent_sdk.zze r8 = com.google.android.gms.internal.consent_sdk.zzx.zza(r7)
            java.lang.String r2 = r2.zza
            com.google.android.gms.internal.consent_sdk.zzan r7 = com.google.android.gms.internal.consent_sdk.zzx.zzb(r7)
            com.google.android.gms.internal.consent_sdk.zzd[] r9 = new com.google.android.gms.internal.consent_sdk.zzd[r0]
            r10 = 0
            r9[r10] = r7
            r8.zzb(r6, r2, r9)
            goto L81
        Lb7:
            throw r4
        Lb8:
            com.google.android.gms.internal.consent_sdk.zzz r0 = new com.google.android.gms.internal.consent_sdk.zzz
            int r1 = r11.zzc
            com.google.android.ump.ConsentInformation$PrivacyOptionsRequirementStatus r2 = r11.zzd
            r0.<init>(r1, r2, r3, r4)
            return r0
        Lc2:
            throw r4
        Lc3:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.consent_sdk.zzw.zza():com.google.android.gms.internal.consent_sdk.zzz");
    }
}
