package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.IBinder;
import android.text.TextUtils;
import androidx.annotation.Nullable;

/* loaded from: classes2.dex */
public final class zzfme implements zzfmc {
    private final Context zza;
    private final zzfmu zzb;
    private long zzc = 0;
    private long zzd = -1;
    private boolean zze = false;
    private zzfmw zzf = zzfmw.FORMAT_UNKNOWN;
    private zzfmy zzg = zzfmy.ORIENTATION_UNKNOWN;
    private int zzh = 0;
    private String zzi = "";
    private String zzj = "";
    private String zzk = "";
    private String zzl = "";
    private zzfnc zzm = zzfnc.SCAR_REQUEST_TYPE_UNSPECIFIED;
    private String zzn = "";
    private String zzo = "";
    private String zzp = "";
    private boolean zzq = false;
    private boolean zzr = false;

    public zzfme(Context context, zzfmu zzfmuVar) {
        this.zza = context;
        this.zzb = zzfmuVar;
    }

    public final synchronized zzfme zzA() {
        zzfmy zzfmyVar;
        try {
            this.zzh = com.google.android.gms.ads.internal.zzu.zzq().zzm(this.zza);
            Resources resources = this.zza.getResources();
            if (resources == null) {
                zzfmyVar = zzfmy.ORIENTATION_UNKNOWN;
            } else {
                Configuration configuration = resources.getConfiguration();
                if (configuration == null) {
                    zzfmyVar = zzfmy.ORIENTATION_UNKNOWN;
                } else if (configuration.orientation == 2) {
                    zzfmyVar = zzfmy.ORIENTATION_LANDSCAPE;
                } else {
                    zzfmyVar = zzfmy.ORIENTATION_PORTRAIT;
                }
            }
            this.zzg = zzfmyVar;
            this.zzc = com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime();
            this.zzr = true;
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    public final synchronized zzfme zzB() {
        this.zzd = com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime();
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfmc
    public final /* bridge */ /* synthetic */ zzfmc zza(com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzr(zzeVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfmc
    public final /* bridge */ /* synthetic */ zzfmc zzb(zzfhe zzfheVar) {
        zzs(zzfheVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfmc
    public final /* bridge */ /* synthetic */ zzfmc zzc(String str) {
        zzt(str);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfmc
    public final /* bridge */ /* synthetic */ zzfmc zzd(zzfmw zzfmwVar) {
        zzu(zzfmwVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfmc
    public final /* bridge */ /* synthetic */ zzfmc zze(String str) {
        zzv(str);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfmc
    public final /* bridge */ /* synthetic */ zzfmc zzf(String str) {
        zzw(str);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfmc
    public final /* bridge */ /* synthetic */ zzfmc zzg(zzfnc zzfncVar) {
        zzx(zzfncVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfmc
    public final /* bridge */ /* synthetic */ zzfmc zzh(boolean z8) {
        zzy(z8);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfmc
    public final /* bridge */ /* synthetic */ zzfmc zzi(Throwable th) {
        zzz(th);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfmc
    public final /* bridge */ /* synthetic */ zzfmc zzj() {
        zzA();
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfmc
    public final /* bridge */ /* synthetic */ zzfmc zzk() {
        zzB();
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfmc
    public final synchronized boolean zzl() {
        return this.zzr;
    }

    @Override // com.google.android.gms.internal.ads.zzfmc
    public final boolean zzm() {
        if (!TextUtils.isEmpty(this.zzk)) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzfmc
    @Nullable
    public final synchronized zzfmg zzn() {
        try {
            if (this.zzq) {
                return null;
            }
            this.zzq = true;
            if (!this.zzr) {
                zzA();
            }
            if (this.zzd < 0) {
                zzB();
            }
            return new zzfmg(this, null);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized zzfme zzr(com.google.android.gms.ads.internal.client.zze zzeVar) {
        try {
            IBinder iBinder = zzeVar.zze;
            if (iBinder != null) {
                zzcze zzczeVar = (zzcze) iBinder;
                String zzk = zzczeVar.zzk();
                if (!TextUtils.isEmpty(zzk)) {
                    this.zzi = zzk;
                }
                String zzi = zzczeVar.zzi();
                if (!TextUtils.isEmpty(zzi)) {
                    this.zzj = zzi;
                }
            }
        } finally {
        }
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002e, code lost:
    
        r2.zzj = r0.zzac;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized com.google.android.gms.internal.ads.zzfme zzs(com.google.android.gms.internal.ads.zzfhe r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            com.google.android.gms.internal.ads.zzfgw r0 = r3.zzb     // Catch: java.lang.Throwable -> L12
            java.lang.String r0 = r0.zzb     // Catch: java.lang.Throwable -> L12
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L12
            if (r0 != 0) goto L14
            com.google.android.gms.internal.ads.zzfgw r0 = r3.zzb     // Catch: java.lang.Throwable -> L12
            java.lang.String r0 = r0.zzb     // Catch: java.lang.Throwable -> L12
            r2.zzi = r0     // Catch: java.lang.Throwable -> L12
            goto L14
        L12:
            r3 = move-exception
            goto L34
        L14:
            java.util.List r3 = r3.zza     // Catch: java.lang.Throwable -> L12
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L12
        L1a:
            boolean r0 = r3.hasNext()     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L32
            java.lang.Object r0 = r3.next()     // Catch: java.lang.Throwable -> L12
            com.google.android.gms.internal.ads.zzfgt r0 = (com.google.android.gms.internal.ads.zzfgt) r0     // Catch: java.lang.Throwable -> L12
            java.lang.String r1 = r0.zzac     // Catch: java.lang.Throwable -> L12
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L12
            if (r1 != 0) goto L1a
            java.lang.String r3 = r0.zzac     // Catch: java.lang.Throwable -> L12
            r2.zzj = r3     // Catch: java.lang.Throwable -> L12
        L32:
            monitor-exit(r2)
            return r2
        L34:
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfme.zzs(com.google.android.gms.internal.ads.zzfhe):com.google.android.gms.internal.ads.zzfme");
    }

    public final synchronized zzfme zzt(String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zziP)).booleanValue()) {
            this.zzp = str;
        }
        return this;
    }

    public final synchronized zzfme zzu(zzfmw zzfmwVar) {
        this.zzf = zzfmwVar;
        return this;
    }

    public final synchronized zzfme zzv(String str) {
        this.zzk = str;
        return this;
    }

    public final synchronized zzfme zzw(String str) {
        this.zzl = str;
        return this;
    }

    public final synchronized zzfme zzx(zzfnc zzfncVar) {
        this.zzm = zzfncVar;
        return this;
    }

    public final synchronized zzfme zzy(boolean z8) {
        this.zze = z8;
        return this;
    }

    public final synchronized zzfme zzz(Throwable th) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zziP)).booleanValue()) {
            this.zzo = zzbwj.zzf(th);
            this.zzn = (String) zzfyt.zzc(zzfxr.zzc('\n')).zzd(zzbwj.zze(th)).iterator().next();
        }
        return this;
    }
}
