package com.google.android.gms.measurement.internal;

import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.GoogleSignatureVerifier;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.UidVerifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes2.dex */
public final class zzhn extends zzfo {
    private final zznc zza;
    private Boolean zzb;
    private String zzc;

    public zzhn(zznc zzncVar) {
        this(zzncVar, null);
    }

    private final void zzd(zzbd zzbdVar, zzo zzoVar) {
        this.zza.zzr();
        this.zza.zza(zzbdVar, zzoVar);
    }

    public final zzbd zzb(zzbd zzbdVar, zzo zzoVar) {
        zzbc zzbcVar;
        if ("_cmp".equals(zzbdVar.zza) && (zzbcVar = zzbdVar.zzb) != null && zzbcVar.zza() != 0) {
            String zzd = zzbdVar.zzb.zzd("_cis");
            if ("referrer broadcast".equals(zzd) || "referrer API".equals(zzd)) {
                this.zza.zzj().zzn().zza("Event has been filtered ", zzbdVar.toString());
                return new zzbd("_cmpx", zzbdVar.zzb, zzbdVar.zzc, zzbdVar.zzd);
            }
        }
        return zzbdVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzfl
    public final void zzc(zzo zzoVar) {
        zzb(zzoVar, false);
        zzb(new zzhq(this, zzoVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzfl
    public final void zze(zzo zzoVar) {
        Preconditions.checkNotEmpty(zzoVar.zza);
        Preconditions.checkNotNull(zzoVar.zzt);
        zza(new zzib(this, zzoVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzfl
    public final void zzf(final zzo zzoVar) {
        Preconditions.checkNotEmpty(zzoVar.zza);
        Preconditions.checkNotNull(zzoVar.zzt);
        zza(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzhp
            @Override // java.lang.Runnable
            public final void run() {
                zzhn.this.zzi(zzoVar);
            }
        });
    }

    @Override // com.google.android.gms.measurement.internal.zzfl
    public final void zzg(zzo zzoVar) {
        zzb(zzoVar, false);
        zzb(new zzhr(this, zzoVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzfl
    public final void zzh(final zzo zzoVar) {
        Preconditions.checkNotEmpty(zzoVar.zza);
        Preconditions.checkNotNull(zzoVar.zzt);
        zza(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzhm
            @Override // java.lang.Runnable
            public final void run() {
                zzhn.this.zzj(zzoVar);
            }
        });
    }

    public final /* synthetic */ void zzi(zzo zzoVar) {
        this.zza.zzr();
        this.zza.zze(zzoVar);
    }

    public final /* synthetic */ void zzj(zzo zzoVar) {
        this.zza.zzr();
        this.zza.zzf(zzoVar);
    }

    private zzhn(zznc zzncVar, String str) {
        Preconditions.checkNotNull(zzncVar);
        this.zza = zzncVar;
        this.zzc = null;
    }

    @Override // com.google.android.gms.measurement.internal.zzfl
    public final zzaj zza(zzo zzoVar) {
        zzb(zzoVar, false);
        Preconditions.checkNotEmpty(zzoVar.zza);
        try {
            return (zzaj) this.zza.zzl().zzb(new zzia(this, zzoVar)).get(10000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e4) {
            this.zza.zzj().zzg().zza("Failed to get consent. appId", zzfw.zza(zzoVar.zza), e4);
            return new zzaj(null);
        }
    }

    public final void zzc(zzbd zzbdVar, zzo zzoVar) {
        boolean z8;
        if (!this.zza.zzi().zzl(zzoVar.zza)) {
            zzd(zzbdVar, zzoVar);
            return;
        }
        this.zza.zzj().zzp().zza("EES config found for", zzoVar.zza);
        zzgt zzi = this.zza.zzi();
        String str = zzoVar.zza;
        com.google.android.gms.internal.measurement.zzb zzbVar = TextUtils.isEmpty(str) ? null : (com.google.android.gms.internal.measurement.zzb) zzi.zza.get(str);
        if (zzbVar == null) {
            this.zza.zzj().zzp().zza("EES not loaded for", zzoVar.zza);
            zzd(zzbdVar, zzoVar);
            return;
        }
        try {
            Map<String, Object> zza = this.zza.zzp().zza(zzbdVar.zzb.zzb(), true);
            String zza2 = zziq.zza(zzbdVar.zza);
            if (zza2 == null) {
                zza2 = zzbdVar.zza;
            }
            z8 = zzbVar.zza(new com.google.android.gms.internal.measurement.zzad(zza2, zzbdVar.zzd, zza));
        } catch (com.google.android.gms.internal.measurement.zzc unused) {
            this.zza.zzj().zzg().zza("EES error. appId, eventName", zzoVar.zzb, zzbdVar.zza);
            z8 = false;
        }
        if (!z8) {
            this.zza.zzj().zzp().zza("EES was not applied to event", zzbdVar.zza);
            zzd(zzbdVar, zzoVar);
            return;
        }
        if (zzbVar.zzd()) {
            this.zza.zzj().zzp().zza("EES edited event", zzbdVar.zza);
            zzd(this.zza.zzp().zza(zzbVar.zza().zzb()), zzoVar);
        } else {
            zzd(zzbdVar, zzoVar);
        }
        if (zzbVar.zzc()) {
            for (com.google.android.gms.internal.measurement.zzad zzadVar : zzbVar.zza().zzc()) {
                this.zza.zzj().zzp().zza("EES logging created event", zzadVar.zzb());
                zzd(this.zza.zzp().zza(zzadVar), zzoVar);
            }
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzfl
    public final void zzd(zzo zzoVar) {
        Preconditions.checkNotEmpty(zzoVar.zza);
        zza(zzoVar.zza, false);
        zzb(new zzhy(this, zzoVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzfl
    public final String zzb(zzo zzoVar) {
        zzb(zzoVar, false);
        return this.zza.zzb(zzoVar);
    }

    private final void zzb(zzo zzoVar, boolean z8) {
        Preconditions.checkNotNull(zzoVar);
        Preconditions.checkNotEmpty(zzoVar.zza);
        zza(zzoVar.zza, false);
        this.zza.zzq().zza(zzoVar.zzb, zzoVar.zzp);
    }

    @Override // com.google.android.gms.measurement.internal.zzfl
    public final List<zzmu> zza(zzo zzoVar, Bundle bundle) {
        zzb(zzoVar, false);
        Preconditions.checkNotNull(zzoVar.zza);
        try {
            return (List) this.zza.zzl().zza(new zzih(this, zzoVar, bundle)).get();
        } catch (InterruptedException | ExecutionException e4) {
            this.zza.zzj().zzg().zza("Failed to get trigger URIs. appId", zzfw.zza(zzoVar.zza), e4);
            return Collections.emptyList();
        }
    }

    private final void zzb(Runnable runnable) {
        Preconditions.checkNotNull(runnable);
        if (this.zza.zzl().zzg()) {
            runnable.run();
        } else {
            this.zza.zzl().zzb(runnable);
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzfl
    public final List<zzno> zza(zzo zzoVar, boolean z8) {
        zzb(zzoVar, false);
        String str = zzoVar.zza;
        Preconditions.checkNotNull(str);
        try {
            List<zznq> list = (List) this.zza.zzl().zza(new zzig(this, str)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (zznq zznqVar : list) {
                if (!z8 && zznp.zzg(zznqVar.zzc)) {
                }
                arrayList.add(new zzno(zznqVar));
            }
            return arrayList;
        } catch (InterruptedException e4) {
            e = e4;
            this.zza.zzj().zzg().zza("Failed to get user properties. appId", zzfw.zza(zzoVar.zza), e);
            return null;
        } catch (ExecutionException e9) {
            e = e9;
            this.zza.zzj().zzg().zza("Failed to get user properties. appId", zzfw.zza(zzoVar.zza), e);
            return null;
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzfl
    public final List<zzae> zza(String str, String str2, zzo zzoVar) {
        zzb(zzoVar, false);
        String str3 = zzoVar.zza;
        Preconditions.checkNotNull(str3);
        try {
            return (List) this.zza.zzl().zza(new zzhw(this, str3, str, str2)).get();
        } catch (InterruptedException | ExecutionException e4) {
            this.zza.zzj().zzg().zza("Failed to get conditional user properties", e4);
            return Collections.emptyList();
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzfl
    public final List<zzae> zza(String str, String str2, String str3) {
        zza(str, true);
        try {
            return (List) this.zza.zzl().zza(new zzhz(this, str, str2, str3)).get();
        } catch (InterruptedException | ExecutionException e4) {
            this.zza.zzj().zzg().zza("Failed to get conditional user properties as", e4);
            return Collections.emptyList();
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzfl
    public final List<zzno> zza(String str, String str2, boolean z8, zzo zzoVar) {
        zzb(zzoVar, false);
        String str3 = zzoVar.zza;
        Preconditions.checkNotNull(str3);
        try {
            List<zznq> list = (List) this.zza.zzl().zza(new zzhu(this, str3, str, str2)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (zznq zznqVar : list) {
                if (!z8 && zznp.zzg(zznqVar.zzc)) {
                }
                arrayList.add(new zzno(zznqVar));
            }
            return arrayList;
        } catch (InterruptedException e4) {
            e = e4;
            this.zza.zzj().zzg().zza("Failed to query user properties. appId", zzfw.zza(zzoVar.zza), e);
            return Collections.emptyList();
        } catch (ExecutionException e9) {
            e = e9;
            this.zza.zzj().zzg().zza("Failed to query user properties. appId", zzfw.zza(zzoVar.zza), e);
            return Collections.emptyList();
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzfl
    public final List<zzno> zza(String str, String str2, String str3, boolean z8) {
        zza(str, true);
        try {
            List<zznq> list = (List) this.zza.zzl().zza(new zzhx(this, str, str2, str3)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (zznq zznqVar : list) {
                if (!z8 && zznp.zzg(zznqVar.zzc)) {
                }
                arrayList.add(new zzno(zznqVar));
            }
            return arrayList;
        } catch (InterruptedException e4) {
            e = e4;
            this.zza.zzj().zzg().zza("Failed to get user properties as. appId", zzfw.zza(str), e);
            return Collections.emptyList();
        } catch (ExecutionException e9) {
            e = e9;
            this.zza.zzj().zzg().zza("Failed to get user properties as. appId", zzfw.zza(str), e);
            return Collections.emptyList();
        }
    }

    private final void zza(String str, boolean z8) {
        boolean z9;
        if (!TextUtils.isEmpty(str)) {
            if (z8) {
                try {
                    if (this.zzb == null) {
                        if (!"com.google.android.gms".equals(this.zzc) && !UidVerifier.isGooglePlayServicesUid(this.zza.zza(), Binder.getCallingUid()) && !GoogleSignatureVerifier.getInstance(this.zza.zza()).isUidGoogleSigned(Binder.getCallingUid())) {
                            z9 = false;
                            this.zzb = Boolean.valueOf(z9);
                        }
                        z9 = true;
                        this.zzb = Boolean.valueOf(z9);
                    }
                    if (this.zzb.booleanValue()) {
                        return;
                    }
                } catch (SecurityException e4) {
                    this.zza.zzj().zzg().zza("Measurement Service called with invalid calling package. appId", zzfw.zza(str));
                    throw e4;
                }
            }
            if (this.zzc == null && GooglePlayServicesUtilLight.uidHasPackageName(this.zza.zza(), Binder.getCallingUid(), str)) {
                this.zzc = str;
            }
            if (str.equals(this.zzc)) {
                return;
            }
            throw new SecurityException("Unknown calling package name '" + str + "'.");
        }
        this.zza.zzj().zzg().zza("Measurement Service called without app package");
        throw new SecurityException("Measurement Service called without app package");
    }

    public final /* synthetic */ void zza(String str, Bundle bundle) {
        this.zza.zzf().zza(str, bundle);
    }

    @Override // com.google.android.gms.measurement.internal.zzfl
    public final void zza(zzbd zzbdVar, zzo zzoVar) {
        Preconditions.checkNotNull(zzbdVar);
        zzb(zzoVar, false);
        zzb(new zzid(this, zzbdVar, zzoVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzfl
    public final void zza(zzbd zzbdVar, String str, String str2) {
        Preconditions.checkNotNull(zzbdVar);
        Preconditions.checkNotEmpty(str);
        zza(str, true);
        zzb(new zzic(this, zzbdVar, str));
    }

    private final void zza(Runnable runnable) {
        Preconditions.checkNotNull(runnable);
        if (this.zza.zzl().zzg()) {
            runnable.run();
        } else {
            this.zza.zzl().zzc(runnable);
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzfl
    public final void zza(zzae zzaeVar, zzo zzoVar) {
        Preconditions.checkNotNull(zzaeVar);
        Preconditions.checkNotNull(zzaeVar.zzc);
        zzb(zzoVar, false);
        zzae zzaeVar2 = new zzae(zzaeVar);
        zzaeVar2.zza = zzoVar.zza;
        zzb(new zzhs(this, zzaeVar2, zzoVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzfl
    public final void zza(zzae zzaeVar) {
        Preconditions.checkNotNull(zzaeVar);
        Preconditions.checkNotNull(zzaeVar.zzc);
        Preconditions.checkNotEmpty(zzaeVar.zza);
        zza(zzaeVar.zza, true);
        zzb(new zzhv(this, new zzae(zzaeVar)));
    }

    @Override // com.google.android.gms.measurement.internal.zzfl
    public final void zza(long j7, String str, String str2, String str3) {
        zzb(new zzht(this, str2, str3, str, j7));
    }

    @Override // com.google.android.gms.measurement.internal.zzfl
    public final void zza(final Bundle bundle, zzo zzoVar) {
        zzb(zzoVar, false);
        final String str = zzoVar.zza;
        Preconditions.checkNotNull(str);
        zzb(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzho
            @Override // java.lang.Runnable
            public final void run() {
                zzhn.this.zza(str, bundle);
            }
        });
    }

    @Override // com.google.android.gms.measurement.internal.zzfl
    public final void zza(zzno zznoVar, zzo zzoVar) {
        Preconditions.checkNotNull(zznoVar);
        zzb(zzoVar, false);
        zzb(new zzie(this, zznoVar, zzoVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzfl
    public final byte[] zza(zzbd zzbdVar, String str) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(zzbdVar);
        zza(str, true);
        this.zza.zzj().zzc().zza("Log and bundle. event", this.zza.zzg().zza(zzbdVar.zza));
        long nanoTime = this.zza.zzb().nanoTime() / 1000000;
        try {
            byte[] bArr = (byte[]) this.zza.zzl().zzb(new zzif(this, zzbdVar, str)).get();
            if (bArr == null) {
                this.zza.zzj().zzg().zza("Log and bundle returned null. appId", zzfw.zza(str));
                bArr = new byte[0];
            }
            this.zza.zzj().zzc().zza("Log and bundle processed. event, size, time_ms", this.zza.zzg().zza(zzbdVar.zza), Integer.valueOf(bArr.length), Long.valueOf((this.zza.zzb().nanoTime() / 1000000) - nanoTime));
            return bArr;
        } catch (InterruptedException e4) {
            e = e4;
            this.zza.zzj().zzg().zza("Failed to log and bundle. appId, event, error", zzfw.zza(str), this.zza.zzg().zza(zzbdVar.zza), e);
            return null;
        } catch (ExecutionException e9) {
            e = e9;
            this.zza.zzj().zzg().zza("Failed to log and bundle. appId, event, error", zzfw.zza(str), this.zza.zzg().zza(zzbdVar.zza), e);
            return null;
        }
    }
}
