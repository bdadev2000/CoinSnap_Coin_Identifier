package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public abstract class zzfcb implements zzeps {
    protected final zzcjd zza;
    private final Context zzb;
    private final Executor zzc;
    private final zzfcr zzd;
    private final zzfek zze;
    private final VersionInfoParcel zzf;
    private final ViewGroup zzg;
    private final zzfmq zzh;
    private final zzfhm zzi;
    private f4.c zzj;

    public zzfcb(Context context, Executor executor, zzcjd zzcjdVar, zzfek zzfekVar, zzfcr zzfcrVar, zzfhm zzfhmVar, VersionInfoParcel versionInfoParcel) {
        this.zzb = context;
        this.zzc = executor;
        this.zza = zzcjdVar;
        this.zze = zzfekVar;
        this.zzd = zzfcrVar;
        this.zzi = zzfhmVar;
        this.zzf = versionInfoParcel;
        this.zzg = new FrameLayout(context);
        this.zzh = zzcjdVar.zzz();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized zzcyr zzm(zzfei zzfeiVar) {
        zzfca zzfcaVar = (zzfca) zzfeiVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzil)).booleanValue()) {
            zzcsc zzcscVar = new zzcsc(this.zzg);
            zzcyt zzcytVar = new zzcyt();
            zzcytVar.zze(this.zzb);
            zzcytVar.zzi(zzfcaVar.zza);
            zzcyv zzj = zzcytVar.zzj();
            zzdfa zzdfaVar = new zzdfa();
            zzdfaVar.zzc(this.zzd, this.zzc);
            zzdfaVar.zzl(this.zzd, this.zzc);
            return zze(zzcscVar, zzj, zzdfaVar.zzn());
        }
        zzfcr zzi = zzfcr.zzi(this.zzd);
        zzdfa zzdfaVar2 = new zzdfa();
        zzdfaVar2.zzb(zzi, this.zzc);
        zzdfaVar2.zzg(zzi, this.zzc);
        zzdfaVar2.zzh(zzi, this.zzc);
        zzdfaVar2.zzi(zzi, this.zzc);
        zzdfaVar2.zzc(zzi, this.zzc);
        zzdfaVar2.zzl(zzi, this.zzc);
        zzdfaVar2.zzm(zzi);
        zzcsc zzcscVar2 = new zzcsc(this.zzg);
        zzcyt zzcytVar2 = new zzcyt();
        zzcytVar2.zze(this.zzb);
        zzcytVar2.zzi(zzfcaVar.zza);
        return zze(zzcscVar2, zzcytVar2.zzj(), zzdfaVar2.zzn());
    }

    @Override // com.google.android.gms.internal.ads.zzeps
    public final boolean zza() {
        f4.c cVar = this.zzj;
        if (cVar != null && !cVar.isDone()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0049 A[Catch: all -> 0x0027, TRY_LEAVE, TryCatch #0 {all -> 0x0027, blocks: (B:3:0x0001, B:5:0x0011, B:8:0x002a, B:12:0x0049, B:16:0x005a, B:20:0x0060, B:22:0x006f, B:24:0x0077, B:25:0x0093, B:27:0x00ac, B:29:0x00b0, B:30:0x00b9, B:34:0x0042), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005a A[Catch: all -> 0x0027, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0027, blocks: (B:3:0x0001, B:5:0x0011, B:8:0x002a, B:12:0x0049, B:16:0x005a, B:20:0x0060, B:22:0x006f, B:24:0x0077, B:25:0x0093, B:27:0x00ac, B:29:0x00b0, B:30:0x00b9, B:34:0x0042), top: B:2:0x0001 }] */
    @Override // com.google.android.gms.internal.ads.zzeps
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized boolean zzb(com.google.android.gms.ads.internal.client.zzl r8, java.lang.String r9, com.google.android.gms.internal.ads.zzepq r10, com.google.android.gms.internal.ads.zzepr r11) throws android.os.RemoteException {
        /*
            Method dump skipped, instructions count: 309
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfcb.zzb(com.google.android.gms.ads.internal.client.zzl, java.lang.String, com.google.android.gms.internal.ads.zzepq, com.google.android.gms.internal.ads.zzepr):boolean");
    }

    public abstract zzcyr zze(zzcsc zzcscVar, zzcyv zzcyvVar, zzdfc zzdfcVar);

    public final /* synthetic */ void zzk() {
        this.zzd.zzdB(zzfiq.zzd(6, null, null));
    }

    public final void zzl(com.google.android.gms.ads.internal.client.zzw zzwVar) {
        this.zzi.zzu(zzwVar);
    }
}
