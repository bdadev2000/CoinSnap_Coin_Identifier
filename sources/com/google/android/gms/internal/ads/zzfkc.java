package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.IBinder;
import android.text.TextUtils;
import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public final class zzfkc implements zzfka {
    private final Context zza;
    private final int zzp;
    private long zzb = 0;
    private long zzc = -1;
    private boolean zzd = false;
    private int zzq = 2;
    private int zzr = 2;
    private int zze = 0;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private zzfkq zzj = zzfkq.SCAR_REQUEST_TYPE_UNSPECIFIED;
    private String zzk = "";
    private String zzl = "";
    private String zzm = "";
    private boolean zzn = false;
    private boolean zzo = false;

    public zzfkc(Context context, int i10) {
        this.zza = context;
        this.zzp = i10;
    }

    public static /* bridge */ /* synthetic */ zzfkq zzB(zzfkc zzfkcVar) {
        return zzfkcVar.zzj;
    }

    public static /* bridge */ /* synthetic */ String zzC(zzfkc zzfkcVar) {
        return zzfkcVar.zzg;
    }

    public static /* bridge */ /* synthetic */ String zzD(zzfkc zzfkcVar) {
        return zzfkcVar.zzm;
    }

    public static /* bridge */ /* synthetic */ String zzE(zzfkc zzfkcVar) {
        return zzfkcVar.zzf;
    }

    public static /* bridge */ /* synthetic */ String zzF(zzfkc zzfkcVar) {
        return zzfkcVar.zzh;
    }

    public static /* bridge */ /* synthetic */ String zzG(zzfkc zzfkcVar) {
        return zzfkcVar.zzi;
    }

    public static /* bridge */ /* synthetic */ String zzH(zzfkc zzfkcVar) {
        return zzfkcVar.zzl;
    }

    public static /* bridge */ /* synthetic */ String zzI(zzfkc zzfkcVar) {
        return zzfkcVar.zzk;
    }

    public static /* bridge */ /* synthetic */ boolean zzJ(zzfkc zzfkcVar) {
        return zzfkcVar.zzd;
    }

    public static /* bridge */ /* synthetic */ int zzL(zzfkc zzfkcVar) {
        return zzfkcVar.zzp;
    }

    public static /* bridge */ /* synthetic */ int zzM(zzfkc zzfkcVar) {
        return zzfkcVar.zzq;
    }

    public static /* bridge */ /* synthetic */ int zzN(zzfkc zzfkcVar) {
        return zzfkcVar.zzr;
    }

    public static /* bridge */ /* synthetic */ int zzo(zzfkc zzfkcVar) {
        return zzfkcVar.zze;
    }

    public static /* bridge */ /* synthetic */ long zzp(zzfkc zzfkcVar) {
        return zzfkcVar.zzb;
    }

    public static /* bridge */ /* synthetic */ long zzq(zzfkc zzfkcVar) {
        return zzfkcVar.zzc;
    }

    public final synchronized zzfkc zzA() {
        this.zzc = com.google.android.gms.ads.internal.zzv.zzC().elapsedRealtime();
        return this;
    }

    public final synchronized zzfkc zzK(int i10) {
        this.zzq = i10;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfka
    public final /* bridge */ /* synthetic */ zzfka zza(com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzr(zzeVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfka
    public final /* bridge */ /* synthetic */ zzfka zzb(zzffe zzffeVar) {
        zzs(zzffeVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfka
    public final /* bridge */ /* synthetic */ zzfka zzc(String str) {
        zzt(str);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfka
    public final /* bridge */ /* synthetic */ zzfka zzd(String str) {
        zzu(str);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfka
    public final /* bridge */ /* synthetic */ zzfka zze(String str) {
        zzv(str);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfka
    public final /* bridge */ /* synthetic */ zzfka zzf(zzfkq zzfkqVar) {
        zzw(zzfkqVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfka
    public final /* bridge */ /* synthetic */ zzfka zzg(boolean z10) {
        zzx(z10);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfka
    public final /* bridge */ /* synthetic */ zzfka zzh(Throwable th2) {
        zzy(th2);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfka
    public final /* bridge */ /* synthetic */ zzfka zzi() {
        zzz();
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfka
    public final /* bridge */ /* synthetic */ zzfka zzj() {
        zzA();
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfka
    public final synchronized boolean zzk() {
        return this.zzo;
    }

    @Override // com.google.android.gms.internal.ads.zzfka
    public final boolean zzl() {
        return !TextUtils.isEmpty(this.zzh);
    }

    @Override // com.google.android.gms.internal.ads.zzfka
    @Nullable
    public final synchronized zzfke zzm() {
        zzfkd zzfkdVar = null;
        if (this.zzn) {
            return null;
        }
        this.zzn = true;
        if (!this.zzo) {
            zzz();
        }
        if (this.zzc < 0) {
            zzA();
        }
        return new zzfke(this, zzfkdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfka
    public final /* bridge */ /* synthetic */ zzfka zzn(int i10) {
        zzK(i10);
        return this;
    }

    public final synchronized zzfkc zzr(com.google.android.gms.ads.internal.client.zze zzeVar) {
        IBinder iBinder = zzeVar.zze;
        if (iBinder != null) {
            zzcwf zzcwfVar = (zzcwf) iBinder;
            String zzk = zzcwfVar.zzk();
            if (!TextUtils.isEmpty(zzk)) {
                this.zzf = zzk;
            }
            String zzi = zzcwfVar.zzi();
            if (!TextUtils.isEmpty(zzi)) {
                this.zzg = zzi;
            }
        }
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002b, code lost:
    
        r2.zzg = r0.zzab;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized com.google.android.gms.internal.ads.zzfkc zzs(com.google.android.gms.internal.ads.zzffe r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            com.google.android.gms.internal.ads.zzfew r0 = r3.zzb     // Catch: java.lang.Throwable -> L31
            java.lang.String r0 = r0.zzb     // Catch: java.lang.Throwable -> L31
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L31
            if (r0 != 0) goto L11
            com.google.android.gms.internal.ads.zzfew r0 = r3.zzb     // Catch: java.lang.Throwable -> L31
            java.lang.String r0 = r0.zzb     // Catch: java.lang.Throwable -> L31
            r2.zzf = r0     // Catch: java.lang.Throwable -> L31
        L11:
            java.util.List r3 = r3.zza     // Catch: java.lang.Throwable -> L31
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L31
        L17:
            boolean r0 = r3.hasNext()     // Catch: java.lang.Throwable -> L31
            if (r0 == 0) goto L2f
            java.lang.Object r0 = r3.next()     // Catch: java.lang.Throwable -> L31
            com.google.android.gms.internal.ads.zzfet r0 = (com.google.android.gms.internal.ads.zzfet) r0     // Catch: java.lang.Throwable -> L31
            java.lang.String r1 = r0.zzab     // Catch: java.lang.Throwable -> L31
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L31
            if (r1 != 0) goto L17
            java.lang.String r3 = r0.zzab     // Catch: java.lang.Throwable -> L31
            r2.zzg = r3     // Catch: java.lang.Throwable -> L31
        L2f:
            monitor-exit(r2)
            return r2
        L31:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfkc.zzs(com.google.android.gms.internal.ads.zzffe):com.google.android.gms.internal.ads.zzfkc");
    }

    public final synchronized zzfkc zzt(String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zziu)).booleanValue()) {
            this.zzm = str;
        }
        return this;
    }

    public final synchronized zzfkc zzu(String str) {
        this.zzh = str;
        return this;
    }

    public final synchronized zzfkc zzv(String str) {
        this.zzi = str;
        return this;
    }

    public final synchronized zzfkc zzw(zzfkq zzfkqVar) {
        this.zzj = zzfkqVar;
        return this;
    }

    public final synchronized zzfkc zzx(boolean z10) {
        this.zzd = z10;
        return this;
    }

    public final synchronized zzfkc zzy(Throwable th2) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zziu)).booleanValue()) {
            this.zzl = zzbuj.zzf(th2);
            this.zzk = (String) zzfxd.zzb(zzfwf.zzc('\n')).zzc(zzbuj.zze(th2)).iterator().next();
        }
        return this;
    }

    public final synchronized zzfkc zzz() {
        Configuration configuration;
        this.zze = com.google.android.gms.ads.internal.zzv.zzr().zzm(this.zza);
        Resources resources = this.zza.getResources();
        int i10 = 2;
        if (resources != null && (configuration = resources.getConfiguration()) != null) {
            i10 = configuration.orientation == 2 ? 4 : 3;
        }
        this.zzr = i10;
        this.zzb = com.google.android.gms.ads.internal.zzv.zzC().elapsedRealtime();
        this.zzo = true;
        return this;
    }
}
