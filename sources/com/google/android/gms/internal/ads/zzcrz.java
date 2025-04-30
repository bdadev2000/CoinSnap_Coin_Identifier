package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;

/* loaded from: classes2.dex */
public final class zzcrz extends zzcup {

    @Nullable
    private final zzchd zzc;
    private final int zzd;
    private final Context zze;
    private final zzcrn zzf;
    private final zzdjp zzg;
    private final zzdgm zzh;
    private final zzczy zzi;
    private final boolean zzj;
    private final zzccc zzk;
    private boolean zzl;

    public zzcrz(zzcuo zzcuoVar, Context context, @Nullable zzchd zzchdVar, int i9, zzcrn zzcrnVar, zzdjp zzdjpVar, zzdgm zzdgmVar, zzczy zzczyVar, zzccc zzcccVar) {
        super(zzcuoVar);
        this.zzl = false;
        this.zzc = zzchdVar;
        this.zze = context;
        this.zzd = i9;
        this.zzf = zzcrnVar;
        this.zzg = zzdjpVar;
        this.zzh = zzdgmVar;
        this.zzi = zzczyVar;
        this.zzj = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzfs)).booleanValue();
        this.zzk = zzcccVar;
    }

    public final int zza() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzcup
    public final void zzb() {
        super.zzb();
        zzchd zzchdVar = this.zzc;
        if (zzchdVar != null) {
            zzchdVar.destroy();
        }
    }

    public final void zzc(zzbca zzbcaVar) {
        zzchd zzchdVar = this.zzc;
        if (zzchdVar != null) {
            zzchdVar.zzak(zzbcaVar);
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
    public final void zzd(android.app.Activity r3, com.google.android.gms.internal.ads.zzbcn r4, boolean r5) throws android.os.RemoteException {
        /*
            r2 = this;
            if (r3 != 0) goto L4
            android.content.Context r3 = r2.zze
        L4:
            boolean r4 = r2.zzj
            if (r4 == 0) goto Ld
            com.google.android.gms.internal.ads.zzdgm r4 = r2.zzh
            r4.zzb()
        Ld:
            com.google.android.gms.internal.ads.zzbeg r4 = com.google.android.gms.internal.ads.zzbep.zzaC
            com.google.android.gms.internal.ads.zzben r0 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r4 = r0.zza(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L61
            com.google.android.gms.ads.internal.zzu.zzp()
            boolean r4 = com.google.android.gms.ads.internal.util.zzt.zzG(r3)
            if (r4 == 0) goto L61
            java.lang.String r4 = "Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit  https://googlemobileadssdk.page.link/admob-interstitial-policies"
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r4)
            com.google.android.gms.internal.ads.zzczy r4 = r2.zzi
            r4.zzb()
            com.google.android.gms.internal.ads.zzbeg r4 = com.google.android.gms.internal.ads.zzbep.zzaD
            com.google.android.gms.internal.ads.zzben r5 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r4 = r5.zza(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto Ld4
            com.google.android.gms.internal.ads.zzfrp r4 = new com.google.android.gms.internal.ads.zzfrp
            android.content.Context r3 = r3.getApplicationContext()
            com.google.android.gms.ads.internal.util.zzbx r5 = com.google.android.gms.ads.internal.zzu.zzt()
            android.os.Looper r5 = r5.zzb()
            r4.<init>(r3, r5)
            com.google.android.gms.internal.ads.zzfhf r3 = r2.zza
            com.google.android.gms.internal.ads.zzfhe r3 = r3.zzb
            com.google.android.gms.internal.ads.zzfgw r3 = r3.zzb
            java.lang.String r3 = r3.zzb
            r4.zza(r3)
            return
        L61:
            com.google.android.gms.internal.ads.zzbeg r4 = com.google.android.gms.internal.ads.zzbep.zzlQ
            com.google.android.gms.internal.ads.zzben r0 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r4 = r0.zza(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            r0 = 0
            if (r4 == 0) goto La0
            com.google.android.gms.internal.ads.zzchd r4 = r2.zzc
            if (r4 == 0) goto La0
            com.google.android.gms.internal.ads.zzfgt r4 = r4.zzD()
            if (r4 == 0) goto La0
            boolean r1 = r4.zzas
            if (r1 == 0) goto La0
            int r4 = r4.zzat
            com.google.android.gms.internal.ads.zzccc r1 = r2.zzk
            int r1 = r1.zzb()
            if (r4 != r1) goto L8d
            goto La0
        L8d:
            java.lang.String r3 = "The app open consent form has been shown."
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r3)
            com.google.android.gms.internal.ads.zzczy r3 = r2.zzi
            r4 = 12
            java.lang.String r5 = "The consent form has already been shown."
            com.google.android.gms.ads.internal.client.zze r4 = com.google.android.gms.internal.ads.zzfiq.zzd(r4, r5, r0)
            r3.zza(r4)
            return
        La0:
            boolean r4 = r2.zzl
            if (r4 == 0) goto Lb4
            java.lang.String r4 = "App open interstitial ad is already visible."
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r4)
            com.google.android.gms.internal.ads.zzczy r4 = r2.zzi
            r1 = 10
            com.google.android.gms.ads.internal.client.zze r0 = com.google.android.gms.internal.ads.zzfiq.zzd(r1, r0, r0)
            r4.zza(r0)
        Lb4:
            boolean r4 = r2.zzl
            if (r4 != 0) goto Ld4
            com.google.android.gms.internal.ads.zzdjp r4 = r2.zzg     // Catch: com.google.android.gms.internal.ads.zzdjo -> Lc9
            com.google.android.gms.internal.ads.zzczy r0 = r2.zzi     // Catch: com.google.android.gms.internal.ads.zzdjo -> Lc9
            r4.zza(r5, r3, r0)     // Catch: com.google.android.gms.internal.ads.zzdjo -> Lc9
            boolean r3 = r2.zzj     // Catch: com.google.android.gms.internal.ads.zzdjo -> Lc9
            if (r3 == 0) goto Lcb
            com.google.android.gms.internal.ads.zzdgm r3 = r2.zzh     // Catch: com.google.android.gms.internal.ads.zzdjo -> Lc9
            r3.zza()     // Catch: com.google.android.gms.internal.ads.zzdjo -> Lc9
            goto Lcb
        Lc9:
            r3 = move-exception
            goto Lcf
        Lcb:
            r3 = 1
            r2.zzl = r3
            return
        Lcf:
            com.google.android.gms.internal.ads.zzczy r4 = r2.zzi
            r4.zzc(r3)
        Ld4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcrz.zzd(android.app.Activity, com.google.android.gms.internal.ads.zzbcn, boolean):void");
    }

    public final void zze(long j7, int i9) {
        this.zzf.zza(j7, i9);
    }
}
