package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzeeb implements zzgfk {
    final /* synthetic */ boolean zza;
    final /* synthetic */ zzeec zzb;

    public zzeeb(zzeec zzeecVar, boolean z2) {
        this.zza = z2;
        this.zzb = zzeecVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgfk
    public final void zza(Throwable th) {
        com.google.android.gms.ads.internal.util.client.zzm.zzg("Failed to get signals bundle");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005b  */
    @Override // com.google.android.gms.internal.ads.zzgfk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* bridge */ /* synthetic */ void zzb(java.lang.Object r8) {
        /*
            r7 = this;
            com.google.android.gms.internal.ads.zzeec r0 = r7.zzb
            android.os.Bundle r8 = (android.os.Bundle) r8
            boolean r0 = r0.zzf()
            if (r0 == 0) goto Lb
            return
        Lb:
            java.lang.String r0 = "ad_types"
            java.lang.Object r0 = r8.get(r0)
            boolean r1 = r0 instanceof java.util.List
            if (r1 == 0) goto L18
            java.util.List r0 = (java.util.List) r0
            goto L22
        L18:
            boolean r1 = r0 instanceof java.lang.String[]
            if (r1 == 0) goto L48
            java.lang.String[] r0 = (java.lang.String[]) r0
            java.util.List r0 = java.util.Arrays.asList(r0)
        L22:
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r0.size()
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        L2f:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L43
            java.lang.Object r2 = r0.next()
            boolean r3 = r2 instanceof java.lang.String
            if (r3 == 0) goto L2f
            java.lang.String r2 = (java.lang.String) r2
            r1.add(r2)
            goto L2f
        L43:
            java.util.List r0 = java.util.Collections.unmodifiableList(r1)
            goto L4c
        L48:
            java.util.List r0 = java.util.Collections.emptyList()
        L4c:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L55:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto Laf
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            int r3 = r2.hashCode()
            r4 = 2
            r5 = 3
            r6 = 1
            switch(r3) {
                case -1396342996: goto L8a;
                case -1052618729: goto L80;
                case -239580146: goto L76;
                case 604727084: goto L6c;
                default: goto L6b;
            }
        L6b:
            goto L94
        L6c:
            java.lang.String r3 = "interstitial"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L94
            r2 = r6
            goto L95
        L76:
            java.lang.String r3 = "rewarded"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L94
            r2 = r5
            goto L95
        L80:
            java.lang.String r3 = "native"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L94
            r2 = r4
            goto L95
        L8a:
            java.lang.String r3 = "banner"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L94
            r2 = 0
            goto L95
        L94:
            r2 = -1
        L95:
            if (r2 == 0) goto La9
            if (r2 == r6) goto La6
            if (r2 == r4) goto La3
            if (r2 == r5) goto La0
            com.google.android.gms.internal.ads.zzbcb$zzd$zza r2 = com.google.android.gms.internal.ads.zzbcb.zzd.zza.AD_FORMAT_TYPE_UNSPECIFIED
            goto Lab
        La0:
            com.google.android.gms.internal.ads.zzbcb$zzd$zza r2 = com.google.android.gms.internal.ads.zzbcb.zzd.zza.REWARD_BASED_VIDEO_AD
            goto Lab
        La3:
            com.google.android.gms.internal.ads.zzbcb$zzd$zza r2 = com.google.android.gms.internal.ads.zzbcb.zzd.zza.NATIVE_APP_INSTALL
            goto Lab
        La6:
            com.google.android.gms.internal.ads.zzbcb$zzd$zza r2 = com.google.android.gms.internal.ads.zzbcb.zzd.zza.INTERSTITIAL
            goto Lab
        La9:
            com.google.android.gms.internal.ads.zzbcb$zzd$zza r2 = com.google.android.gms.internal.ads.zzbcb.zzd.zza.BANNER
        Lab:
            r1.add(r2)
            goto L55
        Laf:
            com.google.android.gms.internal.ads.zzeec r0 = r7.zzb
            com.google.android.gms.internal.ads.zzbcb$zzaf$zzd r0 = com.google.android.gms.internal.ads.zzeec.zzb(r0, r8)
            com.google.android.gms.internal.ads.zzeec r2 = r7.zzb
            com.google.android.gms.internal.ads.zzbcb$zzab r8 = com.google.android.gms.internal.ads.zzeec.zza(r2, r8)
            com.google.android.gms.internal.ads.zzeec r2 = r7.zzb
            com.google.android.gms.internal.ads.zzeea r3 = new com.google.android.gms.internal.ads.zzeea
            r3.<init>()
            com.google.android.gms.internal.ads.zzedq r8 = r2.zza
            r8.zza(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeeb.zzb(java.lang.Object):void");
    }
}
