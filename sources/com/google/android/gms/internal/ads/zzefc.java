package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzefc implements zzgfp {
    final /* synthetic */ boolean zza;
    final /* synthetic */ zzefd zzb;

    public zzefc(zzefd zzefdVar, boolean z8) {
        this.zza = z8;
        this.zzb = zzefdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgfp
    public final void zza(Throwable th) {
        com.google.android.gms.ads.internal.util.client.zzm.zzg("Failed to get signals bundle");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005b  */
    @Override // com.google.android.gms.internal.ads.zzgfp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* bridge */ /* synthetic */ void zzb(java.lang.Object r8) {
        /*
            r7 = this;
            com.google.android.gms.internal.ads.zzefd r0 = r7.zzb
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
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r0 = r0.iterator()
        L55:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Laf
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            int r2 = r1.hashCode()
            r3 = 2
            r5 = 3
            r6 = 1
            switch(r2) {
                case -1396342996: goto L8a;
                case -1052618729: goto L80;
                case -239580146: goto L76;
                case 604727084: goto L6c;
                default: goto L6b;
            }
        L6b:
            goto L94
        L6c:
            java.lang.String r2 = "interstitial"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L94
            r1 = r6
            goto L95
        L76:
            java.lang.String r2 = "rewarded"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L94
            r1 = r5
            goto L95
        L80:
            java.lang.String r2 = "native"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L94
            r1 = r3
            goto L95
        L8a:
            java.lang.String r2 = "banner"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L94
            r1 = 0
            goto L95
        L94:
            r1 = -1
        L95:
            if (r1 == 0) goto La9
            if (r1 == r6) goto La6
            if (r1 == r3) goto La3
            if (r1 == r5) goto La0
            com.google.android.gms.internal.ads.zzbdv$zzd$zza r1 = com.google.android.gms.internal.ads.zzbdv.zzd.zza.AD_FORMAT_TYPE_UNSPECIFIED
            goto Lab
        La0:
            com.google.android.gms.internal.ads.zzbdv$zzd$zza r1 = com.google.android.gms.internal.ads.zzbdv.zzd.zza.REWARD_BASED_VIDEO_AD
            goto Lab
        La3:
            com.google.android.gms.internal.ads.zzbdv$zzd$zza r1 = com.google.android.gms.internal.ads.zzbdv.zzd.zza.NATIVE_APP_INSTALL
            goto Lab
        La6:
            com.google.android.gms.internal.ads.zzbdv$zzd$zza r1 = com.google.android.gms.internal.ads.zzbdv.zzd.zza.INTERSTITIAL
            goto Lab
        La9:
            com.google.android.gms.internal.ads.zzbdv$zzd$zza r1 = com.google.android.gms.internal.ads.zzbdv.zzd.zza.BANNER
        Lab:
            r4.add(r1)
            goto L55
        Laf:
            com.google.android.gms.internal.ads.zzefd r0 = r7.zzb
            com.google.android.gms.internal.ads.zzbdv$zzaf$zzd r6 = com.google.android.gms.internal.ads.zzefd.zzb(r0, r8)
            com.google.android.gms.internal.ads.zzefd r0 = r7.zzb
            com.google.android.gms.internal.ads.zzbdv$zzab r5 = com.google.android.gms.internal.ads.zzefd.zza(r0, r8)
            com.google.android.gms.internal.ads.zzefd r8 = r7.zzb
            boolean r3 = r7.zza
            com.google.android.gms.internal.ads.zzefb r0 = new com.google.android.gms.internal.ads.zzefb
            r1 = r0
            r2 = r7
            r1.<init>()
            com.google.android.gms.internal.ads.zzeer r8 = r8.zza
            r8.zza(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzefc.zzb(java.lang.Object):void");
    }
}
