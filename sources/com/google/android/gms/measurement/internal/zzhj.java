package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.adjust.sdk.Constants;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.measurement.zzoj;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.net.URL;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;
import x0.AbstractC2914a;

/* loaded from: classes2.dex */
public class zzhj implements zzil {
    private static volatile zzhj zzb;
    final long zza;
    private Boolean zzaa;
    private long zzab;
    private volatile Boolean zzac;
    private Boolean zzad;
    private Boolean zzae;
    private volatile boolean zzaf;
    private int zzag;
    private int zzah;
    private final Context zzc;
    private final String zzd;
    private final String zze;
    private final String zzf;
    private final boolean zzg;
    private final zzab zzh;
    private final zzag zzi;
    private final zzgh zzj;
    private final zzfw zzk;
    private final zzhc zzl;
    private final zzmh zzm;
    private final zznp zzn;
    private final zzfr zzo;
    private final Clock zzp;
    private final zzks zzq;
    private final zziv zzr;
    private final zzb zzs;
    private final zzkj zzt;
    private final String zzu;
    private zzfp zzv;
    private zzkx zzw;
    private zzax zzx;
    private zzfq zzy;
    private boolean zzz = false;
    private AtomicInteger zzai = new AtomicInteger(0);

    private zzhj(zzit zzitVar) {
        long currentTimeMillis;
        Bundle bundle;
        boolean z8 = false;
        Preconditions.checkNotNull(zzitVar);
        zzab zzabVar = new zzab(zzitVar.zza);
        this.zzh = zzabVar;
        zzfk.zza = zzabVar;
        Context context = zzitVar.zza;
        this.zzc = context;
        this.zzd = zzitVar.zzb;
        this.zze = zzitVar.zzc;
        this.zzf = zzitVar.zzd;
        this.zzg = zzitVar.zzh;
        this.zzac = zzitVar.zze;
        this.zzu = zzitVar.zzj;
        this.zzaf = true;
        com.google.android.gms.internal.measurement.zzdo zzdoVar = zzitVar.zzg;
        if (zzdoVar != null && (bundle = zzdoVar.zzg) != null) {
            Object obj = bundle.get("measurementEnabled");
            if (obj instanceof Boolean) {
                this.zzad = (Boolean) obj;
            }
            Object obj2 = zzdoVar.zzg.get("measurementDeactivated");
            if (obj2 instanceof Boolean) {
                this.zzae = (Boolean) obj2;
            }
        }
        com.google.android.gms.internal.measurement.zzgz.zzb(context);
        Clock defaultClock = DefaultClock.getInstance();
        this.zzp = defaultClock;
        Long l = zzitVar.zzi;
        if (l != null) {
            currentTimeMillis = l.longValue();
        } else {
            currentTimeMillis = defaultClock.currentTimeMillis();
        }
        this.zza = currentTimeMillis;
        this.zzi = new zzag(this);
        zzgh zzghVar = new zzgh(this);
        zzghVar.zzad();
        this.zzj = zzghVar;
        zzfw zzfwVar = new zzfw(this);
        zzfwVar.zzad();
        this.zzk = zzfwVar;
        zznp zznpVar = new zznp(this);
        zznpVar.zzad();
        this.zzn = zznpVar;
        this.zzo = new zzfr(new zziw(zzitVar, this));
        this.zzs = new zzb(this);
        zzks zzksVar = new zzks(this);
        zzksVar.zzv();
        this.zzq = zzksVar;
        zziv zzivVar = new zziv(this);
        zzivVar.zzv();
        this.zzr = zzivVar;
        zzmh zzmhVar = new zzmh(this);
        zzmhVar.zzv();
        this.zzm = zzmhVar;
        zzkj zzkjVar = new zzkj(this);
        zzkjVar.zzad();
        this.zzt = zzkjVar;
        zzhc zzhcVar = new zzhc(this);
        zzhcVar.zzad();
        this.zzl = zzhcVar;
        com.google.android.gms.internal.measurement.zzdo zzdoVar2 = zzitVar.zzg;
        if (zzdoVar2 != null && zzdoVar2.zzb != 0) {
            z8 = true;
        }
        boolean z9 = !z8;
        if (context.getApplicationContext() instanceof Application) {
            zzp().zzb(z9);
        } else {
            zzj().zzu().zza("Application context is not an Application");
        }
        zzhcVar.zzb(new zzhk(this, zzitVar));
    }

    private final zzkj zzai() {
        zza((zzii) this.zzt);
        return this.zzt;
    }

    @Override // com.google.android.gms.measurement.internal.zzil
    public final Context zza() {
        return this.zzc;
    }

    public final void zzaa() {
        this.zzag++;
    }

    public final boolean zzab() {
        if (this.zzac != null && this.zzac.booleanValue()) {
            return true;
        }
        return false;
    }

    public final boolean zzac() {
        if (zzc() == 0) {
            return true;
        }
        return false;
    }

    public final boolean zzad() {
        zzl().zzt();
        return this.zzaf;
    }

    public final boolean zzae() {
        return TextUtils.isEmpty(this.zzd);
    }

    public final boolean zzaf() {
        boolean z8;
        if (this.zzz) {
            zzl().zzt();
            Boolean bool = this.zzaa;
            if (bool == null || this.zzab == 0 || (bool != null && !bool.booleanValue() && Math.abs(this.zzp.elapsedRealtime() - this.zzab) > 1000)) {
                this.zzab = this.zzp.elapsedRealtime();
                boolean z9 = true;
                if (zzt().zze("android.permission.INTERNET") && zzt().zze("android.permission.ACCESS_NETWORK_STATE") && (Wrappers.packageManager(this.zzc).isCallerInstantApp() || this.zzi.zzx() || (zznp.zza(this.zzc) && zznp.zza(this.zzc, false)))) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                Boolean valueOf = Boolean.valueOf(z8);
                this.zzaa = valueOf;
                if (valueOf.booleanValue()) {
                    if (!zzt().zza(zzh().zzae(), zzh().zzac()) && TextUtils.isEmpty(zzh().zzac())) {
                        z9 = false;
                    }
                    this.zzaa = Boolean.valueOf(z9);
                }
            }
            return this.zzaa.booleanValue();
        }
        throw new IllegalStateException("AppMeasurement is not initialized");
    }

    public final boolean zzag() {
        return this.zzg;
    }

    public final boolean zzah() {
        Bundle bundle;
        int i9;
        String str;
        zzl().zzt();
        zza((zzii) zzai());
        String zzad = zzh().zzad();
        Pair<String, Boolean> zza = zzn().zza(zzad);
        boolean z8 = false;
        if (this.zzi.zzu() && !((Boolean) zza.second).booleanValue() && !TextUtils.isEmpty((CharSequence) zza.first)) {
            if (!zzai().zzc()) {
                zzj().zzu().zza("Network is not available for Deferred Deep Link request. Skipping");
                return false;
            }
            StringBuilder sb = new StringBuilder();
            zzkx zzr = zzr();
            zzr.zzt();
            zzr.zzu();
            if (!zzr.zzao() || zzr.zzq().zzg() >= 234200) {
                zzaj zzab = zzp().zzab();
                if (zzab != null) {
                    bundle = zzab.zza;
                } else {
                    bundle = null;
                }
                int i10 = 1;
                if (bundle == null) {
                    int i11 = this.zzah;
                    this.zzah = i11 + 1;
                    if (i11 < 10) {
                        z8 = true;
                    }
                    zzfy zzc = zzj().zzc();
                    if (z8) {
                        str = "Retrying.";
                    } else {
                        str = "Skipping.";
                    }
                    zzc.zza(AbstractC2914a.e("Failed to retrieve DMA consent from the service, ", str, " retryCount"), Integer.valueOf(this.zzah));
                    return z8;
                }
                zzin zza2 = zzin.zza(bundle, 100);
                sb.append("&gcs=");
                sb.append(zza2.zzg());
                zzav zza3 = zzav.zza(bundle, 100);
                sb.append("&dma=");
                if (zza3.zzd() == Boolean.FALSE) {
                    i9 = 0;
                } else {
                    i9 = 1;
                }
                sb.append(i9);
                if (!TextUtils.isEmpty(zza3.zze())) {
                    sb.append("&dma_cps=");
                    sb.append(zza3.zze());
                }
                if (zzav.zza(bundle) == Boolean.TRUE) {
                    i10 = 0;
                }
                sb.append("&npa=");
                sb.append(i10);
                zzj().zzp().zza("Consent query parameters to Bow", sb);
            }
            zznp zzt = zzt();
            zzh();
            URL zza4 = zzt.zza(97001L, zzad, (String) zza.first, zzn().zzp.zza() - 1, sb.toString());
            if (zza4 != null) {
                zzkj zzai = zzai();
                zzkm zzkmVar = new zzkm() { // from class: com.google.android.gms.measurement.internal.zzhl
                    @Override // com.google.android.gms.measurement.internal.zzkm
                    public final void zza(String str2, int i12, Throwable th, byte[] bArr, Map map) {
                        zzhj.this.zza(str2, i12, th, bArr, map);
                    }
                };
                zzai.zzt();
                zzai.zzac();
                Preconditions.checkNotNull(zza4);
                Preconditions.checkNotNull(zzkmVar);
                zzai.zzl().zza(new zzkl(zzai, zzad, zza4, null, null, zzkmVar));
            }
            return false;
        }
        zzj().zzc().zza("ADID unavailable to retrieve Deferred Deep Link. Skipping");
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.zzil
    public final Clock zzb() {
        return this.zzp;
    }

    public final int zzc() {
        zzl().zzt();
        if (this.zzi.zzw()) {
            return 1;
        }
        Boolean bool = this.zzae;
        if (bool != null && bool.booleanValue()) {
            return 2;
        }
        if (!zzad()) {
            return 8;
        }
        Boolean zzv = zzn().zzv();
        if (zzv != null) {
            if (zzv.booleanValue()) {
                return 0;
            }
            return 3;
        }
        Boolean zze = this.zzi.zze("firebase_analytics_collection_enabled");
        if (zze != null) {
            if (zze.booleanValue()) {
                return 0;
            }
            return 4;
        }
        Boolean bool2 = this.zzad;
        if (bool2 != null) {
            if (bool2.booleanValue()) {
                return 0;
            }
            return 5;
        }
        if (this.zzac == null || this.zzac.booleanValue()) {
            return 0;
        }
        return 7;
    }

    @Override // com.google.android.gms.measurement.internal.zzil
    public final zzab zzd() {
        return this.zzh;
    }

    public final zzb zze() {
        zzb zzbVar = this.zzs;
        if (zzbVar != null) {
            return zzbVar;
        }
        throw new IllegalStateException("Component not created");
    }

    public final zzag zzf() {
        return this.zzi;
    }

    public final zzax zzg() {
        zza((zzii) this.zzx);
        return this.zzx;
    }

    public final zzfq zzh() {
        zza((zze) this.zzy);
        return this.zzy;
    }

    public final zzfp zzi() {
        zza((zze) this.zzv);
        return this.zzv;
    }

    @Override // com.google.android.gms.measurement.internal.zzil
    public final zzfw zzj() {
        zza((zzii) this.zzk);
        return this.zzk;
    }

    public final zzfr zzk() {
        return this.zzo;
    }

    @Override // com.google.android.gms.measurement.internal.zzil
    public final zzhc zzl() {
        zza((zzii) this.zzl);
        return this.zzl;
    }

    public final zzfw zzm() {
        zzfw zzfwVar = this.zzk;
        if (zzfwVar != null && zzfwVar.zzaf()) {
            return this.zzk;
        }
        return null;
    }

    public final zzgh zzn() {
        zza((zzij) this.zzj);
        return this.zzj;
    }

    public final zzhc zzo() {
        return this.zzl;
    }

    public final zziv zzp() {
        zza((zze) this.zzr);
        return this.zzr;
    }

    public final zzks zzq() {
        zza((zze) this.zzq);
        return this.zzq;
    }

    public final zzkx zzr() {
        zza((zze) this.zzw);
        return this.zzw;
    }

    public final zzmh zzs() {
        zza((zze) this.zzm);
        return this.zzm;
    }

    public final zznp zzt() {
        zza((zzij) this.zzn);
        return this.zzn;
    }

    public final String zzu() {
        return this.zzd;
    }

    public final String zzv() {
        return this.zze;
    }

    public final String zzw() {
        return this.zzf;
    }

    public final String zzx() {
        return this.zzu;
    }

    public final void zzy() {
        throw new IllegalStateException("Unexpected call on client side");
    }

    public final void zzz() {
        this.zzai.incrementAndGet();
    }

    public static zzhj zza(Context context, com.google.android.gms.internal.measurement.zzdo zzdoVar, Long l) {
        Bundle bundle;
        if (zzdoVar != null && (zzdoVar.zze == null || zzdoVar.zzf == null)) {
            zzdoVar = new com.google.android.gms.internal.measurement.zzdo(zzdoVar.zza, zzdoVar.zzb, zzdoVar.zzc, zzdoVar.zzd, null, null, zzdoVar.zzg, null);
        }
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(context.getApplicationContext());
        if (zzb == null) {
            synchronized (zzhj.class) {
                try {
                    if (zzb == null) {
                        zzb = new zzhj(new zzit(context, zzdoVar, l));
                    }
                } finally {
                }
            }
        } else if (zzdoVar != null && (bundle = zzdoVar.zzg) != null && bundle.containsKey("dataCollectionDefaultEnabled")) {
            Preconditions.checkNotNull(zzb);
            zzb.zza(zzdoVar.zzg.getBoolean("dataCollectionDefaultEnabled"));
        }
        Preconditions.checkNotNull(zzb);
        return zzb;
    }

    public final void zzb(boolean z8) {
        zzl().zzt();
        this.zzaf = z8;
    }

    public static /* synthetic */ void zza(zzhj zzhjVar, zzit zzitVar) {
        zzhjVar.zzl().zzt();
        zzax zzaxVar = new zzax(zzhjVar);
        zzaxVar.zzad();
        zzhjVar.zzx = zzaxVar;
        zzfq zzfqVar = new zzfq(zzhjVar, zzitVar.zzf);
        zzfqVar.zzv();
        zzhjVar.zzy = zzfqVar;
        zzfp zzfpVar = new zzfp(zzhjVar);
        zzfpVar.zzv();
        zzhjVar.zzv = zzfpVar;
        zzkx zzkxVar = new zzkx(zzhjVar);
        zzkxVar.zzv();
        zzhjVar.zzw = zzkxVar;
        zzhjVar.zzn.zzae();
        zzhjVar.zzj.zzae();
        zzhjVar.zzy.zzw();
        zzhjVar.zzj().zzn().zza("App measurement initialized, version", 97001L);
        zzhjVar.zzj().zzn().zza("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
        String zzad = zzfqVar.zzad();
        if (TextUtils.isEmpty(zzhjVar.zzd)) {
            if (zzhjVar.zzt().zzd(zzad, zzhjVar.zzi.zzp())) {
                zzhjVar.zzj().zzn().zza("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
            } else {
                zzhjVar.zzj().zzn().zza("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app " + zzad);
            }
        }
        zzhjVar.zzj().zzc().zza("Debug-level message logging enabled");
        if (zzhjVar.zzag != zzhjVar.zzai.get()) {
            zzhjVar.zzj().zzg().zza("Not all components initialized", Integer.valueOf(zzhjVar.zzag), Integer.valueOf(zzhjVar.zzai.get()));
        }
        zzhjVar.zzz = true;
    }

    private static void zza(zzij zzijVar) {
        if (zzijVar == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    private static void zza(zze zzeVar) {
        if (zzeVar != null) {
            if (!zzeVar.zzy()) {
                throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(zzeVar.getClass())));
            }
            return;
        }
        throw new IllegalStateException("Component not created");
    }

    private static void zza(zzii zziiVar) {
        if (zziiVar != null) {
            if (!zziiVar.zzaf()) {
                throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(zziiVar.getClass())));
            }
            return;
        }
        throw new IllegalStateException("Component not created");
    }

    public final /* synthetic */ void zza(String str, int i9, Throwable th, byte[] bArr, Map map) {
        if ((i9 == 200 || i9 == 204 || i9 == 304) && th == null) {
            zzn().zzo.zza(true);
            if (bArr != null && bArr.length != 0) {
                try {
                    JSONObject jSONObject = new JSONObject(new String(bArr));
                    String optString = jSONObject.optString(Constants.DEEPLINK, "");
                    if (TextUtils.isEmpty(optString)) {
                        zzj().zzc().zza("Deferred Deep Link is empty.");
                        return;
                    }
                    String optString2 = jSONObject.optString("gclid", "");
                    String optString3 = jSONObject.optString("gbraid", "");
                    String optString4 = jSONObject.optString("gad_source", "");
                    double optDouble = jSONObject.optDouble(CampaignEx.JSON_KEY_TIMESTAMP, 0.0d);
                    Bundle bundle = new Bundle();
                    if (zzoj.zza() && this.zzi.zza(zzbf.zzcl)) {
                        if (!zzt().zzi(optString)) {
                            zzj().zzu().zza("Deferred Deep Link validation failed. gclid, gbraid, deep link", optString2, optString3, optString);
                            return;
                        }
                        if (!TextUtils.isEmpty(optString3)) {
                            bundle.putString("gbraid", optString3);
                        }
                        if (!TextUtils.isEmpty(optString4)) {
                            bundle.putString("gad_source", optString4);
                        }
                    } else if (!zzt().zzi(optString)) {
                        zzj().zzu().zza("Deferred Deep Link validation failed. gclid, deep link", optString2, optString);
                        return;
                    }
                    if (zzoj.zza()) {
                        this.zzi.zza(zzbf.zzcl);
                    }
                    bundle.putString("gclid", optString2);
                    bundle.putString("_cis", "ddp");
                    this.zzr.zzc("auto", "_cmp", bundle);
                    zznp zzt = zzt();
                    if (TextUtils.isEmpty(optString) || !zzt.zza(optString, optDouble)) {
                        return;
                    }
                    zzt.zza().sendBroadcast(new Intent("android.google.analytics.action.DEEPLINK_ACTION"));
                    return;
                } catch (JSONException e4) {
                    zzj().zzg().zza("Failed to parse the Deferred Deep Link response. exception", e4);
                    return;
                }
            }
            zzj().zzc().zza("Deferred Deep Link response empty.");
            return;
        }
        zzj().zzu().zza("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i9), th);
    }

    public final void zza(boolean z8) {
        this.zzac = Boolean.valueOf(z8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:145:0x00ec, code lost:
    
        if (r1.zzk() != false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0161, code lost:
    
        if (r1.zzk() != false) goto L64;
     */
    /* JADX WARN: Removed duplicated region for block: B:121:0x024c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(com.google.android.gms.internal.measurement.zzdo r13) {
        /*
            Method dump skipped, instructions count: 1305
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzhj.zza(com.google.android.gms.internal.measurement.zzdo):void");
    }
}
