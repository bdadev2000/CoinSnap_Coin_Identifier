package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzeuv implements zzevy {
    private zzfth zza;
    private zzfth zzb;
    private boolean zzc;
    private boolean zzd;
    private final boolean zze = false;
    private final boolean zzf;

    public zzeuv(zzfth zzfthVar, zzfth zzfthVar2, boolean z10, boolean z11, boolean z12) {
        this.zza = zzfthVar;
        this.zzb = zzfthVar2;
        this.zzc = z10;
        this.zzd = z11;
        this.zzf = z12;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0070, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcn.zzde)).booleanValue() == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x008e, code lost:
    
        if (r5.zzb.zzc() == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0090, code lost:
    
        r1.putString("paidv2_id_android", r5.zzb.zza());
        r2 = r5.zzb.zzb().toEpochMilli();
        r1.putLong("paidv2_creation_time_android", r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00aa, code lost:
    
        r1.putBoolean("paidv2_pub_option_android", r5.zzc);
        r1.putBoolean("paidv2_user_option_android", r5.zzd);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0086, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcn.zzdg)).booleanValue() != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0038, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcn.zzdf)).booleanValue() != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0022, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcn.zzdd)).booleanValue() == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0040, code lost:
    
        if (r5.zza.zzc() == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0042, code lost:
    
        r1.putString("paidv1_id_android", r5.zza.zza());
        r2 = r5.zza.zzb().toEpochMilli();
        r1.putLong("paidv1_creation_time_android", r2);
     */
    @Override // com.google.android.gms.internal.ads.zzevy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* bridge */ /* synthetic */ void zzj(java.lang.Object r6) {
        /*
            r5 = this;
            android.os.Bundle r6 = (android.os.Bundle) r6
            boolean r0 = r5.zze
            if (r0 == 0) goto L8
            goto Lc1
        L8:
            java.lang.String r0 = "pii"
            android.os.Bundle r1 = com.google.android.gms.internal.ads.zzfgc.zza(r6, r0)
            boolean r2 = r5.zzf
            if (r2 != 0) goto L24
            com.google.android.gms.internal.ads.zzbce r2 = com.google.android.gms.internal.ads.zzbcn.zzdd
            com.google.android.gms.internal.ads.zzbcl r3 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r2 = r3.zza(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L3a
        L24:
            boolean r2 = r5.zzf
            if (r2 == 0) goto L5c
            com.google.android.gms.internal.ads.zzbce r2 = com.google.android.gms.internal.ads.zzbcn.zzdf
            com.google.android.gms.internal.ads.zzbcl r3 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r2 = r3.zza(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L5c
        L3a:
            com.google.android.gms.internal.ads.zzfth r2 = r5.zza
            boolean r2 = r2.zzc()
            if (r2 == 0) goto L5c
            com.google.android.gms.internal.ads.zzfth r2 = r5.zza
            java.lang.String r2 = r2.zza()
            java.lang.String r3 = "paidv1_id_android"
            r1.putString(r3, r2)
            com.google.android.gms.internal.ads.zzfth r2 = r5.zza
            java.time.Instant r2 = r2.zzb()
            long r2 = com.bytedance.sdk.openadsdk.oem.a.a(r2)
            java.lang.String r4 = "paidv1_creation_time_android"
            r1.putLong(r4, r2)
        L5c:
            boolean r2 = r5.zzf
            if (r2 != 0) goto L72
            com.google.android.gms.internal.ads.zzbce r2 = com.google.android.gms.internal.ads.zzbcn.zzde
            com.google.android.gms.internal.ads.zzbcl r3 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r2 = r3.zza(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L88
        L72:
            boolean r2 = r5.zzf
            if (r2 == 0) goto Lb8
            com.google.android.gms.internal.ads.zzbce r2 = com.google.android.gms.internal.ads.zzbcn.zzdg
            com.google.android.gms.internal.ads.zzbcl r3 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r2 = r3.zza(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto Lb8
        L88:
            com.google.android.gms.internal.ads.zzfth r2 = r5.zzb
            boolean r2 = r2.zzc()
            if (r2 == 0) goto Laa
            com.google.android.gms.internal.ads.zzfth r2 = r5.zzb
            java.lang.String r2 = r2.zza()
            java.lang.String r3 = "paidv2_id_android"
            r1.putString(r3, r2)
            com.google.android.gms.internal.ads.zzfth r2 = r5.zzb
            java.time.Instant r2 = r2.zzb()
            long r2 = com.bytedance.sdk.openadsdk.oem.a.a(r2)
            java.lang.String r4 = "paidv2_creation_time_android"
            r1.putLong(r4, r2)
        Laa:
            boolean r2 = r5.zzc
            java.lang.String r3 = "paidv2_pub_option_android"
            r1.putBoolean(r3, r2)
            boolean r2 = r5.zzd
            java.lang.String r3 = "paidv2_user_option_android"
            r1.putBoolean(r3, r2)
        Lb8:
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto Lc1
            r6.putBundle(r0, r1)
        Lc1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeuv.zzj(java.lang.Object):void");
    }

    public zzeuv(boolean z10) {
        this.zzf = z10;
    }
}
