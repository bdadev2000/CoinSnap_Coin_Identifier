package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public final class zzcox extends zzcrq {

    @Nullable
    private final zzcfk zzc;
    private final int zzd;
    private final Context zze;
    private final zzcol zzf;
    private final zzdgv zzg;
    private final zzddp zzh;
    private final zzcwz zzi;
    private final boolean zzj;
    private final zzcad zzk;
    private boolean zzl;

    public zzcox(zzcrp zzcrpVar, Context context, @Nullable zzcfk zzcfkVar, int i10, zzcol zzcolVar, zzdgv zzdgvVar, zzddp zzddpVar, zzcwz zzcwzVar, zzcad zzcadVar) {
        super(zzcrpVar);
        this.zzl = false;
        this.zzc = zzcfkVar;
        this.zze = context;
        this.zzd = i10;
        this.zzf = zzcolVar;
        this.zzg = zzdgvVar;
        this.zzh = zzddpVar;
        this.zzi = zzcwzVar;
        this.zzj = ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzfp)).booleanValue();
        this.zzk = zzcadVar;
    }

    public final int zza() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzcrq
    public final void zzb() {
        super.zzb();
        zzcfk zzcfkVar = this.zzc;
        if (zzcfkVar != null) {
            zzcfkVar.destroy();
        }
    }

    public final void zzc(zzazz zzazzVar) {
        zzcfk zzcfkVar = this.zzc;
        if (zzcfkVar != null) {
            zzcfkVar.zzak(zzazzVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
    
        r3 = r3;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v13, types: [android.content.Context] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzd(android.app.Activity r3, com.google.android.gms.internal.ads.zzbam r4, boolean r5) throws android.os.RemoteException {
        /*
            r2 = this;
            if (r3 != 0) goto L4
            android.content.Context r3 = r2.zze
        L4:
            boolean r4 = r2.zzj
            if (r4 == 0) goto Ld
            com.google.android.gms.internal.ads.zzddp r4 = r2.zzh
            r4.zzb()
        Ld:
            com.google.android.gms.internal.ads.zzbce r4 = com.google.android.gms.internal.ads.zzbcn.zzaJ
            com.google.android.gms.internal.ads.zzbcl r0 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r4 = r0.zza(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L61
            com.google.android.gms.ads.internal.zzv.zzq()
            boolean r4 = com.google.android.gms.ads.internal.util.zzs.zzG(r3)
            if (r4 == 0) goto L61
            java.lang.String r4 = "Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit  https://googlemobileadssdk.page.link/admob-interstitial-policies"
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r4)
            com.google.android.gms.internal.ads.zzcwz r4 = r2.zzi
            r4.zzb()
            com.google.android.gms.internal.ads.zzbce r4 = com.google.android.gms.internal.ads.zzbcn.zzaK
            com.google.android.gms.internal.ads.zzbcl r5 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r4 = r5.zza(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto Ld2
            com.google.android.gms.internal.ads.zzfqa r4 = new com.google.android.gms.internal.ads.zzfqa
            android.content.Context r3 = r3.getApplicationContext()
            com.google.android.gms.ads.internal.util.zzbs r5 = com.google.android.gms.ads.internal.zzv.zzu()
            android.os.Looper r5 = r5.zzb()
            r4.<init>(r3, r5)
            com.google.android.gms.internal.ads.zzfff r3 = r2.zza
            com.google.android.gms.internal.ads.zzffe r3 = r3.zzb
            com.google.android.gms.internal.ads.zzfew r3 = r3.zzb
            java.lang.String r3 = r3.zzb
            r4.zza(r3)
            return
        L61:
            com.google.android.gms.internal.ads.zzbce r4 = com.google.android.gms.internal.ads.zzbcn.zzlC
            com.google.android.gms.internal.ads.zzbcl r0 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r4 = r0.zza(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            r0 = 0
            if (r4 == 0) goto La0
            com.google.android.gms.internal.ads.zzcfk r4 = r2.zzc
            if (r4 == 0) goto La0
            com.google.android.gms.internal.ads.zzfet r4 = r4.zzD()
            if (r4 == 0) goto La0
            boolean r1 = r4.zzar
            if (r1 == 0) goto La0
            int r4 = r4.zzas
            com.google.android.gms.internal.ads.zzcad r1 = r2.zzk
            int r1 = r1.zzb()
            if (r4 != r1) goto L8d
            goto La0
        L8d:
            java.lang.String r3 = "The app open consent form has been shown."
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r3)
            com.google.android.gms.internal.ads.zzcwz r3 = r2.zzi
            r4 = 12
            java.lang.String r5 = "The consent form has already been shown."
            com.google.android.gms.ads.internal.client.zze r4 = com.google.android.gms.internal.ads.zzfgq.zzd(r4, r5, r0)
            r3.zza(r4)
            return
        La0:
            boolean r4 = r2.zzl
            if (r4 == 0) goto Lb4
            java.lang.String r4 = "App open interstitial ad is already visible."
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r4)
            com.google.android.gms.internal.ads.zzcwz r4 = r2.zzi
            r1 = 10
            com.google.android.gms.ads.internal.client.zze r0 = com.google.android.gms.internal.ads.zzfgq.zzd(r1, r0, r0)
            r4.zza(r0)
        Lb4:
            boolean r4 = r2.zzl
            if (r4 != 0) goto Ld2
            com.google.android.gms.internal.ads.zzdgv r4 = r2.zzg     // Catch: com.google.android.gms.internal.ads.zzdgu -> Lcc
            com.google.android.gms.internal.ads.zzcwz r0 = r2.zzi     // Catch: com.google.android.gms.internal.ads.zzdgu -> Lcc
            r4.zza(r5, r3, r0)     // Catch: com.google.android.gms.internal.ads.zzdgu -> Lcc
            boolean r3 = r2.zzj     // Catch: com.google.android.gms.internal.ads.zzdgu -> Lcc
            if (r3 == 0) goto Lc8
            com.google.android.gms.internal.ads.zzddp r3 = r2.zzh     // Catch: com.google.android.gms.internal.ads.zzdgu -> Lcc
            r3.zza()     // Catch: com.google.android.gms.internal.ads.zzdgu -> Lcc
        Lc8:
            r3 = 1
            r2.zzl = r3
            return
        Lcc:
            r3 = move-exception
            com.google.android.gms.internal.ads.zzcwz r4 = r2.zzi
            r4.zzc(r3)
        Ld2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcox.zzd(android.app.Activity, com.google.android.gms.internal.ads.zzbam, boolean):void");
    }

    public final void zze(long j3, int i10) {
        this.zzf.zza(j3, i10);
    }
}
