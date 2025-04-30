package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.Clock;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class zzkx extends zze {
    private final zzlw zza;
    private zzfl zzb;
    private volatile Boolean zzc;
    private final zzat zzd;
    private final zzmr zze;
    private final List<Runnable> zzf;
    private final zzat zzg;

    public zzkx(zzhj zzhjVar) {
        super(zzhjVar);
        this.zzf = new ArrayList();
        this.zze = new zzmr(zzhjVar.zzb());
        this.zza = new zzlw(this);
        this.zzd = new zzlc(this, zzhjVar);
        this.zzg = new zzll(this, zzhjVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzap() {
        zzt();
        zzj().zzp().zza("Processing queued up service tasks", Integer.valueOf(this.zzf.size()));
        Iterator<Runnable> it = this.zzf.iterator();
        while (it.hasNext()) {
            try {
                it.next().run();
            } catch (RuntimeException e4) {
                zzj().zzg().zza("Task exception while flushing queue", e4);
            }
        }
        this.zzf.clear();
        this.zzg.zza();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzaq() {
        zzt();
        this.zze.zzb();
        this.zzd.zza(zzbf.zzaj.zza(null).longValue());
    }

    public final zzaj zzaa() {
        zzt();
        zzu();
        zzfl zzflVar = this.zzb;
        if (zzflVar == null) {
            zzad();
            zzj().zzc().zza("Failed to get consents; not connected to service yet.");
            return null;
        }
        zzo zzc = zzc(false);
        Preconditions.checkNotNull(zzc);
        try {
            zzaj zza = zzflVar.zza(zzc);
            zzaq();
            return zza;
        } catch (RemoteException e4) {
            zzj().zzg().zza("Failed to get consents; remote exception", e4);
            return null;
        }
    }

    public final Boolean zzab() {
        return this.zzc;
    }

    public final void zzac() {
        zzt();
        zzu();
        zzo zzc = zzc(true);
        zzh().zzab();
        zza(new zzlk(this, zzc));
    }

    public final void zzad() {
        zzt();
        zzu();
        if (zzak()) {
            return;
        }
        if (zzao()) {
            this.zza.zza();
            return;
        }
        if (!zze().zzx()) {
            List<ResolveInfo> queryIntentServices = zza().getPackageManager().queryIntentServices(new Intent().setClassName(zza(), "com.google.android.gms.measurement.AppMeasurementService"), 65536);
            if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
                Intent intent = new Intent("com.google.android.gms.measurement.START");
                intent.setComponent(new ComponentName(zza(), "com.google.android.gms.measurement.AppMeasurementService"));
                this.zza.zza(intent);
                return;
            }
            zzj().zzg().zza("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
        }
    }

    public final void zzae() {
        zzt();
        zzu();
        this.zza.zzb();
        try {
            ConnectionTracker.getInstance().unbindService(zza(), this.zza);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.zzb = null;
    }

    public final /* synthetic */ void zzaf() {
        zzfl zzflVar = this.zzb;
        if (zzflVar == null) {
            zzj().zzg().zza("Failed to send Dma consent settings to service");
            return;
        }
        try {
            zzo zzc = zzc(false);
            Preconditions.checkNotNull(zzc);
            zzflVar.zzf(zzc);
            zzaq();
        } catch (RemoteException e4) {
            zzj().zzg().zza("Failed to send Dma consent settings to the service", e4);
        }
    }

    public final /* synthetic */ void zzag() {
        zzfl zzflVar = this.zzb;
        if (zzflVar == null) {
            zzj().zzg().zza("Failed to send storage consent settings to service");
            return;
        }
        try {
            zzo zzc = zzc(false);
            Preconditions.checkNotNull(zzc);
            zzflVar.zzh(zzc);
            zzaq();
        } catch (RemoteException e4) {
            zzj().zzg().zza("Failed to send storage consent settings to the service", e4);
        }
    }

    public final void zzah() {
        zzt();
        zzu();
        zzo zzc = zzc(false);
        zzh().zzaa();
        zza(new zzlf(this, zzc));
    }

    public final void zzai() {
        zzt();
        zzu();
        zza(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzkz
            @Override // java.lang.Runnable
            public final void run() {
                zzkx.this.zzaf();
            }
        });
    }

    public final void zzaj() {
        zzt();
        zzu();
        zza(new zzln(this, zzc(true)));
    }

    public final boolean zzak() {
        zzt();
        zzu();
        if (this.zzb != null) {
            return true;
        }
        return false;
    }

    public final boolean zzal() {
        zzt();
        zzu();
        if (!zzao() || zzq().zzg() >= 200900) {
            return true;
        }
        return false;
    }

    public final boolean zzam() {
        zzt();
        zzu();
        if (!zzao() || zzq().zzg() >= zzbf.zzbo.zza(null).intValue()) {
            return true;
        }
        return false;
    }

    public final boolean zzan() {
        zzt();
        zzu();
        if (!zzao() || zzq().zzg() >= 241200) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzao() {
        /*
            Method dump skipped, instructions count: 266
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzkx.zzao():boolean");
    }

    @Override // com.google.android.gms.measurement.internal.zzij, com.google.android.gms.measurement.internal.zzil
    public final /* bridge */ /* synthetic */ zzab zzd() {
        return super.zzd();
    }

    @Override // com.google.android.gms.measurement.internal.zzij
    public final /* bridge */ /* synthetic */ zzax zzf() {
        return super.zzf();
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final /* bridge */ /* synthetic */ zzfq zzg() {
        return super.zzg();
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final /* bridge */ /* synthetic */ zzfp zzh() {
        return super.zzh();
    }

    @Override // com.google.android.gms.measurement.internal.zzij
    public final /* bridge */ /* synthetic */ zzfr zzi() {
        return super.zzi();
    }

    @Override // com.google.android.gms.measurement.internal.zzij, com.google.android.gms.measurement.internal.zzil
    public final /* bridge */ /* synthetic */ zzfw zzj() {
        return super.zzj();
    }

    @Override // com.google.android.gms.measurement.internal.zzij
    public final /* bridge */ /* synthetic */ zzgh zzk() {
        return super.zzk();
    }

    @Override // com.google.android.gms.measurement.internal.zzij, com.google.android.gms.measurement.internal.zzil
    public final /* bridge */ /* synthetic */ zzhc zzl() {
        return super.zzl();
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final /* bridge */ /* synthetic */ zziv zzm() {
        return super.zzm();
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final /* bridge */ /* synthetic */ zzks zzn() {
        return super.zzn();
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final /* bridge */ /* synthetic */ zzkx zzo() {
        return super.zzo();
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final /* bridge */ /* synthetic */ zzmh zzp() {
        return super.zzp();
    }

    @Override // com.google.android.gms.measurement.internal.zzij
    public final /* bridge */ /* synthetic */ zznp zzq() {
        return super.zzq();
    }

    @Override // com.google.android.gms.measurement.internal.zzf, com.google.android.gms.measurement.internal.zzij
    public final /* bridge */ /* synthetic */ void zzr() {
        super.zzr();
    }

    @Override // com.google.android.gms.measurement.internal.zzf, com.google.android.gms.measurement.internal.zzij
    public final /* bridge */ /* synthetic */ void zzs() {
        super.zzs();
    }

    @Override // com.google.android.gms.measurement.internal.zzf, com.google.android.gms.measurement.internal.zzij
    public final /* bridge */ /* synthetic */ void zzt() {
        super.zzt();
    }

    @Override // com.google.android.gms.measurement.internal.zze
    public final boolean zzz() {
        return false;
    }

    public static /* synthetic */ void zzd(zzkx zzkxVar) {
        zzkxVar.zzt();
        if (zzkxVar.zzak()) {
            zzkxVar.zzj().zzp().zza("Inactivity, disconnecting from the service");
            zzkxVar.zzae();
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzij, com.google.android.gms.measurement.internal.zzil
    public final /* bridge */ /* synthetic */ Clock zzb() {
        return super.zzb();
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final /* bridge */ /* synthetic */ zzb zzc() {
        return super.zzc();
    }

    @Override // com.google.android.gms.measurement.internal.zzij
    public final /* bridge */ /* synthetic */ zzag zze() {
        return super.zze();
    }

    private final zzo zzc(boolean z8) {
        return zzg().zza(z8 ? zzj().zzx() : null);
    }

    @Override // com.google.android.gms.measurement.internal.zzij, com.google.android.gms.measurement.internal.zzil
    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }

    public final void zzb(boolean z8) {
        zzt();
        zzu();
        if ((!com.google.android.gms.internal.measurement.zznk.zza() || !zze().zza(zzbf.zzcu)) && z8) {
            zzh().zzaa();
        }
        zza(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzla
            @Override // java.lang.Runnable
            public final void run() {
                zzkx.this.zzag();
            }
        });
    }

    public static /* synthetic */ void zza(zzkx zzkxVar, ComponentName componentName) {
        zzkxVar.zzt();
        if (zzkxVar.zzb != null) {
            zzkxVar.zzb = null;
            zzkxVar.zzj().zzp().zza("Disconnected from device MeasurementService", componentName);
            zzkxVar.zzt();
            zzkxVar.zzad();
        }
    }

    public final void zza(com.google.android.gms.internal.measurement.zzdg zzdgVar) {
        zzt();
        zzu();
        zza(new zzlh(this, zzc(false), zzdgVar));
    }

    public final void zza(AtomicReference<String> atomicReference) {
        zzt();
        zzu();
        zza(new zzli(this, atomicReference, zzc(false)));
    }

    public final void zza(com.google.android.gms.internal.measurement.zzdg zzdgVar, String str, String str2) {
        zzt();
        zzu();
        zza(new zzlu(this, str, str2, zzc(false), zzdgVar));
    }

    public final void zza(AtomicReference<List<zzae>> atomicReference, String str, String str2, String str3) {
        zzt();
        zzu();
        zza(new zzlr(this, atomicReference, str, str2, str3, zzc(false)));
    }

    public final void zza(AtomicReference<List<zzmu>> atomicReference, Bundle bundle) {
        zzt();
        zzu();
        zza(new zzld(this, atomicReference, zzc(false), bundle));
    }

    public final void zza(AtomicReference<List<zzno>> atomicReference, boolean z8) {
        zzt();
        zzu();
        zza(new zzle(this, atomicReference, zzc(false), z8));
    }

    public final void zza(com.google.android.gms.internal.measurement.zzdg zzdgVar, String str, String str2, boolean z8) {
        zzt();
        zzu();
        zza(new zzlb(this, str, str2, zzc(false), z8, zzdgVar));
    }

    public final void zza(AtomicReference<List<zzno>> atomicReference, String str, String str2, String str3, boolean z8) {
        zzt();
        zzu();
        zza(new zzlt(this, atomicReference, str, str2, str3, zzc(false), z8));
    }

    public final void zza(zzbd zzbdVar, String str) {
        Preconditions.checkNotNull(zzbdVar);
        zzt();
        zzu();
        zza(new zzlp(this, true, zzc(true), zzh().zza(zzbdVar), zzbdVar, str));
    }

    public final void zza(com.google.android.gms.internal.measurement.zzdg zzdgVar, zzbd zzbdVar, String str) {
        zzt();
        zzu();
        if (zzq().zza(GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE) != 0) {
            zzj().zzu().zza("Not bundling data. Service unavailable or out of date");
            zzq().zza(zzdgVar, new byte[0]);
        } else {
            zza(new zzlo(this, zzbdVar, str, zzdgVar));
        }
    }

    private final void zza(Runnable runnable) throws IllegalStateException {
        zzt();
        if (zzak()) {
            runnable.run();
        } else {
            if (this.zzf.size() >= 1000) {
                zzj().zzg().zza("Discarding data. Max runnable queue size reached");
                return;
            }
            this.zzf.add(runnable);
            this.zzg.zza(ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS);
            zzad();
        }
    }

    public final void zza(zzfl zzflVar, AbstractSafeParcelable abstractSafeParcelable, zzo zzoVar) {
        int i9;
        zzt();
        zzu();
        int i10 = 100;
        int i11 = 0;
        while (i11 < 1001 && i10 == 100) {
            ArrayList arrayList = new ArrayList();
            List<AbstractSafeParcelable> zza = zzh().zza(100);
            if (zza != null) {
                arrayList.addAll(zza);
                i9 = zza.size();
            } else {
                i9 = 0;
            }
            if (abstractSafeParcelable != null && i9 < 100) {
                arrayList.add(abstractSafeParcelable);
            }
            int size = arrayList.size();
            int i12 = 0;
            while (i12 < size) {
                Object obj = arrayList.get(i12);
                i12++;
                AbstractSafeParcelable abstractSafeParcelable2 = (AbstractSafeParcelable) obj;
                if (abstractSafeParcelable2 instanceof zzbd) {
                    try {
                        zzflVar.zza((zzbd) abstractSafeParcelable2, zzoVar);
                    } catch (RemoteException e4) {
                        zzj().zzg().zza("Failed to send event to the service", e4);
                    }
                } else if (abstractSafeParcelable2 instanceof zzno) {
                    try {
                        zzflVar.zza((zzno) abstractSafeParcelable2, zzoVar);
                    } catch (RemoteException e9) {
                        zzj().zzg().zza("Failed to send user property to the service", e9);
                    }
                } else if (abstractSafeParcelable2 instanceof zzae) {
                    try {
                        zzflVar.zza((zzae) abstractSafeParcelable2, zzoVar);
                    } catch (RemoteException e10) {
                        zzj().zzg().zza("Failed to send conditional user property to the service", e10);
                    }
                } else {
                    zzj().zzg().zza("Discarding data. Unrecognized parcel type.");
                }
            }
            i11++;
            i10 = i9;
        }
    }

    public final void zza(zzae zzaeVar) {
        Preconditions.checkNotNull(zzaeVar);
        zzt();
        zzu();
        zza(new zzls(this, true, zzc(true), zzh().zza(zzaeVar), new zzae(zzaeVar), zzaeVar));
    }

    public final void zza(boolean z8) {
        zzt();
        zzu();
        if ((!com.google.android.gms.internal.measurement.zznk.zza() || !zze().zza(zzbf.zzcu)) && z8) {
            zzh().zzaa();
        }
        if (zzam()) {
            zza(new zzlq(this, zzc(false)));
        }
    }

    public final void zza(zzkp zzkpVar) {
        zzt();
        zzu();
        zza(new zzlj(this, zzkpVar));
    }

    public final void zza(Bundle bundle) {
        zzt();
        zzu();
        zza(new zzlm(this, zzc(false), bundle));
    }

    public final void zza(zzfl zzflVar) {
        zzt();
        Preconditions.checkNotNull(zzflVar);
        this.zzb = zzflVar;
        zzaq();
        zzap();
    }

    public final void zza(zzno zznoVar) {
        zzt();
        zzu();
        zza(new zzlg(this, zzc(true), zzh().zza(zznoVar), zznoVar));
    }
}
