package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.CollectionUtils;
import com.google.android.gms.common.util.Strings;
import com.google.android.gms.internal.measurement.zzpg;
import com.google.android.gms.internal.measurement.zzpn;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.measurement.internal.zzin;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultRenderersFactory;
import com.vungle.ads.internal.protos.n;
import f4.b;
import f4.c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Function;
import y0.e;

/* loaded from: classes2.dex */
public final class zziv extends zze {
    final zzr zza;
    private zzki zzb;
    private zzir zzc;
    private final Set<zziu> zzd;
    private boolean zze;
    private final AtomicReference<String> zzf;
    private final Object zzg;
    private boolean zzh;
    private int zzi;
    private zzat zzj;
    private PriorityQueue<zzmu> zzk;
    private zzin zzl;
    private final AtomicLong zzm;
    private long zzn;
    private boolean zzo;
    private zzat zzp;
    private SharedPreferences.OnSharedPreferenceChangeListener zzq;
    private zzat zzr;
    private final zznr zzs;

    public zziv(zzhj zzhjVar) {
        super(zzhjVar);
        this.zzd = new CopyOnWriteArraySet();
        this.zzg = new Object();
        this.zzh = false;
        this.zzi = 1;
        this.zzo = true;
        this.zzs = new zzka(this);
        this.zzf = new AtomicReference<>();
        this.zzl = zzin.zza;
        this.zzn = -1L;
        this.zzm = new AtomicLong(0L);
        this.zza = new zzr(zzhjVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzat() {
        long j7;
        zzt();
        String zza = zzk().zzh.zza();
        if (zza != null) {
            if ("unset".equals(zza)) {
                zza(MBridgeConstans.DYNAMIC_VIEW_WX_APP, "_npa", (Object) null, zzb().currentTimeMillis());
            } else {
                if ("true".equals(zza)) {
                    j7 = 1;
                } else {
                    j7 = 0;
                }
                zza(MBridgeConstans.DYNAMIC_VIEW_WX_APP, "_npa", Long.valueOf(j7), zzb().currentTimeMillis());
            }
        }
        if (this.zzu.zzac() && this.zzo) {
            zzj().zzc().zza("Recording app launch after enabling measurement for the first time (FE)");
            zzam();
            zzp().zza.zza();
            zzl().zzb(new zzjm(this));
            return;
        }
        zzj().zzc().zza("Updating Scion state (FE)");
        zzo().zzaj();
    }

    public final Application.ActivityLifecycleCallbacks zzaa() {
        return this.zzb;
    }

    public final zzaj zzab() {
        zzt();
        return zzo().zzaa();
    }

    public final Boolean zzac() {
        AtomicReference atomicReference = new AtomicReference();
        return (Boolean) zzl().zza(atomicReference, 15000L, "boolean test flag value", new zzjf(this, atomicReference));
    }

    public final Double zzad() {
        AtomicReference atomicReference = new AtomicReference();
        return (Double) zzl().zza(atomicReference, 15000L, "double test flag value", new zzkb(this, atomicReference));
    }

    public final Integer zzae() {
        AtomicReference atomicReference = new AtomicReference();
        return (Integer) zzl().zza(atomicReference, 15000L, "int test flag value", new zzkc(this, atomicReference));
    }

    public final Long zzaf() {
        AtomicReference atomicReference = new AtomicReference();
        return (Long) zzl().zza(atomicReference, 15000L, "long test flag value", new zzjz(this, atomicReference));
    }

    public final String zzag() {
        return this.zzf.get();
    }

    public final String zzah() {
        zzkp zzaa = this.zzu.zzq().zzaa();
        if (zzaa != null) {
            return zzaa.zzb;
        }
        return null;
    }

    public final String zzai() {
        zzkp zzaa = this.zzu.zzq().zzaa();
        if (zzaa != null) {
            return zzaa.zza;
        }
        return null;
    }

    public final String zzaj() {
        if (this.zzu.zzu() != null) {
            return this.zzu.zzu();
        }
        try {
            return new zzhd(zza(), this.zzu.zzx()).zza("google_app_id");
        } catch (IllegalStateException e4) {
            this.zzu.zzj().zzg().zza("getGoogleAppId failed with exception", e4);
            return null;
        }
    }

    public final String zzak() {
        AtomicReference atomicReference = new AtomicReference();
        return (String) zzl().zza(atomicReference, 15000L, "String test flag value", new zzjs(this, atomicReference));
    }

    @TargetApi(n.AD_PLAY_RESET_ON_DEINIT_VALUE)
    public final PriorityQueue<zzmu> zzal() {
        if (this.zzk == null) {
            this.zzk = new PriorityQueue<>(Comparator.comparing(new Function() { // from class: com.google.android.gms.measurement.internal.zziy
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    Long valueOf;
                    valueOf = Long.valueOf(((zzmu) obj).zzb);
                    return valueOf;
                }
            }, new Comparator() { // from class: com.google.android.gms.measurement.internal.zzix
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int compare;
                    compare = Long.compare(((Long) obj).longValue(), ((Long) obj2).longValue());
                    return compare;
                }
            }));
        }
        return this.zzk;
    }

    public final void zzam() {
        zzt();
        zzu();
        if (!this.zzu.zzaf()) {
            return;
        }
        Boolean zze = zze().zze("google_analytics_deferred_deep_link_enabled");
        if (zze != null && zze.booleanValue()) {
            zzj().zzc().zza("Deferred Deep Link feature enabled.");
            zzl().zzb(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzje
                @Override // java.lang.Runnable
                public final void run() {
                    zziv.this.zzap();
                }
            });
        }
        zzo().zzac();
        this.zzo = false;
        String zzw = zzk().zzw();
        if (!TextUtils.isEmpty(zzw)) {
            zzf().zzac();
            if (!zzw.equals(Build.VERSION.RELEASE)) {
                Bundle bundle = new Bundle();
                bundle.putString("_po", zzw);
                zzc("auto", "_ou", bundle);
            }
        }
    }

    public final void zzan() {
        if ((zza().getApplicationContext() instanceof Application) && this.zzb != null) {
            ((Application) zza().getApplicationContext()).unregisterActivityLifecycleCallbacks(this.zzb);
        }
    }

    public final void zzao() {
        if (zzpg.zza() && zze().zza(zzbf.zzca)) {
            if (zzl().zzg()) {
                zzj().zzg().zza("Cannot get trigger URIs from analytics worker thread");
                return;
            }
            if (zzab.zza()) {
                zzj().zzg().zza("Cannot get trigger URIs from main thread");
                return;
            }
            zzu();
            zzj().zzp().zza("Getting trigger URIs (FE)");
            final AtomicReference atomicReference = new AtomicReference();
            zzl().zza(atomicReference, DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS, "get trigger URIs", new Runnable() { // from class: com.google.android.gms.measurement.internal.zzja
                @Override // java.lang.Runnable
                public final void run() {
                    zziv.this.zza(atomicReference);
                }
            });
            final List list = (List) atomicReference.get();
            if (list == null) {
                zzj().zzg().zza("Timed out waiting for get trigger URIs");
            } else {
                zzl().zzb(new Runnable() { // from class: com.google.android.gms.measurement.internal.zziz
                    @Override // java.lang.Runnable
                    public final void run() {
                        zziv.this.zza(list);
                    }
                });
            }
        }
    }

    public final void zzap() {
        zzt();
        if (zzk().zzo.zza()) {
            zzj().zzc().zza("Deferred Deep Link already retrieved. Not fetching again.");
            return;
        }
        long zza = zzk().zzp.zza();
        zzk().zzp.zza(1 + zza);
        if (zza >= 5) {
            zzj().zzu().zza("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
            zzk().zzo.zza(true);
        } else {
            if (this.zzp == null) {
                this.zzp = new zzjr(this, this.zzu);
            }
            this.zzp.zza(0L);
        }
    }

    public final void zzaq() {
        zzt();
        zzj().zzc().zza("Handle tcf update.");
        zzms zza = zzms.zza(zzk().zzc());
        zzj().zzp().zza("Tcf preferences read", zza);
        if (zzk().zza(zza)) {
            Bundle zza2 = zza.zza();
            zzj().zzp().zza("Consent generated from Tcf", zza2);
            if (zza2 != Bundle.EMPTY) {
                zza(zza2, -30, zzb().currentTimeMillis());
            }
            Bundle bundle = new Bundle();
            bundle.putString("_tcfd", zza.zzb());
            zzc("auto", "_tcf", bundle);
        }
    }

    @TargetApi(n.AD_PLAY_RESET_ON_DEINIT_VALUE)
    public final void zzar() {
        zzmu poll;
        e zzn;
        zzt();
        if (zzal().isEmpty() || this.zzh || (poll = zzal().poll()) == null || (zzn = zzq().zzn()) == null) {
            return;
        }
        this.zzh = true;
        zzj().zzp().zza("Registering trigger URI", poll.zza);
        c d2 = zzn.d(Uri.parse(poll.zza));
        if (d2 == null) {
            this.zzh = false;
            zzal().add(poll);
            return;
        }
        if (!zze().zza(zzbf.zzcf)) {
            SparseArray<Long> zzh = zzk().zzh();
            zzh.put(poll.zzc, Long.valueOf(poll.zzb));
            zzk().zza(zzh);
        }
        d2.addListener(new b(0, d2, new zzjh(this, poll)), new zzji(this));
    }

    public final void zzas() {
        zzt();
        zzj().zzc().zza("Register tcfPrefChangeListener.");
        if (this.zzq == null) {
            this.zzr = new zzjo(this, this.zzu);
            this.zzq = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.google.android.gms.measurement.internal.zzjd
                @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
                    zziv.this.zza(sharedPreferences, str);
                }
            };
        }
        zzk().zzc().registerOnSharedPreferenceChangeListener(this.zzq);
    }

    @Override // com.google.android.gms.measurement.internal.zzij, com.google.android.gms.measurement.internal.zzil
    public final /* bridge */ /* synthetic */ zzab zzd() {
        return super.zzd();
    }

    @Override // com.google.android.gms.measurement.internal.zzij
    public final /* bridge */ /* synthetic */ zzag zze() {
        return super.zze();
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

    @Override // com.google.android.gms.measurement.internal.zzij, com.google.android.gms.measurement.internal.zzil
    public final /* bridge */ /* synthetic */ Clock zzb() {
        return super.zzb();
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final /* bridge */ /* synthetic */ zzb zzc() {
        return super.zzc();
    }

    public final void zzd(Bundle bundle, long j7) {
        zza(bundle, -20, j7);
    }

    public static /* synthetic */ void zzb(zziv zzivVar, Bundle bundle) {
        zzivVar.zzt();
        zzivVar.zzu();
        Preconditions.checkNotNull(bundle);
        String string = bundle.getString("name");
        String string2 = bundle.getString("origin");
        Preconditions.checkNotEmpty(string);
        Preconditions.checkNotEmpty(string2);
        Preconditions.checkNotNull(bundle.get(AppMeasurementSdk.ConditionalUserProperty.VALUE));
        if (!zzivVar.zzu.zzac()) {
            zzivVar.zzj().zzp().zza("Conditional property not set since app measurement is disabled");
            return;
        }
        zzno zznoVar = new zzno(string, bundle.getLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP), bundle.get(AppMeasurementSdk.ConditionalUserProperty.VALUE), string2);
        try {
            zzbd zza = zzivVar.zzq().zza(bundle.getString(MBridgeConstans.APP_ID), bundle.getString(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_NAME), bundle.getBundle(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_PARAMS), string2, 0L, true, true);
            zzivVar.zzo().zza(new zzae(bundle.getString(MBridgeConstans.APP_ID), string2, zznoVar, bundle.getLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP), false, bundle.getString(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME), zzivVar.zzq().zza(bundle.getString(MBridgeConstans.APP_ID), bundle.getString(AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_NAME), bundle.getBundle(AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_PARAMS), string2, 0L, true, true), bundle.getLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT), zza, bundle.getLong(AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE), zzivVar.zzq().zza(bundle.getString(MBridgeConstans.APP_ID), bundle.getString(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME), bundle.getBundle(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS), string2, 0L, true, true)));
        } catch (IllegalArgumentException unused) {
        }
    }

    public final void zzc(String str, String str2, Bundle bundle) {
        zzt();
        zza(str, str2, zzb().currentTimeMillis(), bundle);
    }

    public static int zza(String str) {
        Preconditions.checkNotEmpty(str);
        return 25;
    }

    public final void zzc(String str) {
        this.zzf.set(str);
    }

    public final void zzc(final Bundle bundle, final long j7) {
        zzl().zzc(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzjb
            @Override // java.lang.Runnable
            public final void run() {
                zziv.this.zza(bundle, j7);
            }
        });
    }

    @Override // com.google.android.gms.measurement.internal.zzij, com.google.android.gms.measurement.internal.zzil
    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }

    public final void zzc(boolean z8) {
        zzu();
        zzl().zzb(new zzjj(this, z8));
    }

    public final ArrayList<Bundle> zza(String str, String str2) {
        if (zzl().zzg()) {
            zzj().zzg().zza("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList<>(0);
        }
        if (zzab.zza()) {
            zzj().zzg().zza("Cannot get conditional user properties from main thread");
            return new ArrayList<>(0);
        }
        AtomicReference atomicReference = new AtomicReference();
        this.zzu.zzl().zza(atomicReference, DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS, "get conditional user properties", new zzjv(this, atomicReference, null, str, str2));
        List list = (List) atomicReference.get();
        if (list == null) {
            zzj().zzg().zza("Timed out waiting for get conditional user properties", null);
            return new ArrayList<>();
        }
        return zznp.zzb((List<zzae>) list);
    }

    public final void zzc(Bundle bundle) {
        final Bundle bundle2 = bundle == null ? null : new Bundle(bundle);
        zzl().zzb(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzjc
            @Override // java.lang.Runnable
            public final void run() {
                zziv.this.zza(bundle2);
            }
        });
    }

    public final void zzc(long j7) {
        zzl().zzb(new zzjl(this, j7));
    }

    public final List<zzno> zza(boolean z8) {
        zzu();
        zzj().zzp().zza("Getting user properties (FE)");
        if (zzl().zzg()) {
            zzj().zzg().zza("Cannot get all user properties from analytics worker thread");
            return Collections.emptyList();
        }
        if (zzab.zza()) {
            zzj().zzg().zza("Cannot get all user properties from main thread");
            return Collections.emptyList();
        }
        AtomicReference atomicReference = new AtomicReference();
        this.zzu.zzl().zza(atomicReference, DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS, "get user properties", new zzjp(this, atomicReference, z8));
        List<zzno> list = (List) atomicReference.get();
        if (list != null) {
            return list;
        }
        zzj().zzg().zza("Timed out waiting for get user properties, includeInternal", Boolean.valueOf(z8));
        return Collections.emptyList();
    }

    public static /* synthetic */ void zzb(zziv zzivVar, int i9) {
        if (zzivVar.zzj == null) {
            zzivVar.zzj = new zzjk(zzivVar, zzivVar.zzu);
        }
        zzivVar.zzj.zza(i9 * 1000);
    }

    public final /* synthetic */ void zzb(String str) {
        if (zzg().zzb(str)) {
            zzg().zzag();
        }
    }

    public final void zzb(String str, String str2, Bundle bundle) {
        zza(str, str2, bundle, true, true, zzb().currentTimeMillis());
    }

    public final Map<String, Object> zza(String str, String str2, boolean z8) {
        if (zzl().zzg()) {
            zzj().zzg().zza("Cannot get user properties from analytics worker thread");
            return Collections.emptyMap();
        }
        if (zzab.zza()) {
            zzj().zzg().zza("Cannot get user properties from main thread");
            return Collections.emptyMap();
        }
        AtomicReference atomicReference = new AtomicReference();
        this.zzu.zzl().zza(atomicReference, DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS, "get user properties", new zzjy(this, atomicReference, null, str, str2, z8));
        List<zzno> list = (List) atomicReference.get();
        if (list == null) {
            zzj().zzg().zza("Timed out waiting for handle get user properties, includeInternal", Boolean.valueOf(z8));
            return Collections.emptyMap();
        }
        x.b bVar = new x.b(list.size());
        for (zzno zznoVar : list) {
            Object zza = zznoVar.zza();
            if (zza != null) {
                bVar.put(zznoVar.zza, zza);
            }
        }
        return bVar;
    }

    public final void zzb(long j7) {
        zza(j7, true);
    }

    private final void zzb(String str, String str2, long j7, Bundle bundle, boolean z8, boolean z9, boolean z10, String str3) {
        zzl().zzb(new zzjn(this, str, str2, j7, zznp.zza(bundle), z8, z9, z10, str3));
    }

    public final void zzb(boolean z8) {
        if (zza().getApplicationContext() instanceof Application) {
            Application application = (Application) zza().getApplicationContext();
            if (this.zzb == null) {
                this.zzb = new zzki(this);
            }
            if (z8) {
                application.unregisterActivityLifecycleCallbacks(this.zzb);
                application.registerActivityLifecycleCallbacks(this.zzb);
                zzj().zzp().zza("Registered activity lifecycle callback");
            }
        }
    }

    public final void zzb(Bundle bundle) {
        zzb(bundle, zzb().currentTimeMillis());
    }

    public final void zzb(Bundle bundle, long j7) {
        Preconditions.checkNotNull(bundle);
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString(MBridgeConstans.APP_ID))) {
            zzj().zzu().zza("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove(MBridgeConstans.APP_ID);
        Preconditions.checkNotNull(bundle2);
        zzik.zza(bundle2, MBridgeConstans.APP_ID, String.class, null);
        zzik.zza(bundle2, "origin", String.class, null);
        zzik.zza(bundle2, "name", String.class, null);
        zzik.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.VALUE, Object.class, null);
        zzik.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, String.class, null);
        zzik.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, Long.class, 0L);
        zzik.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_NAME, String.class, null);
        zzik.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_PARAMS, Bundle.class, null);
        zzik.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_NAME, String.class, null);
        zzik.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_PARAMS, Bundle.class, null);
        zzik.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, Long.class, 0L);
        zzik.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, String.class, null);
        zzik.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, Bundle.class, null);
        Preconditions.checkNotEmpty(bundle2.getString("name"));
        Preconditions.checkNotEmpty(bundle2.getString("origin"));
        Preconditions.checkNotNull(bundle2.get(AppMeasurementSdk.ConditionalUserProperty.VALUE));
        bundle2.putLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, j7);
        String string = bundle2.getString("name");
        Object obj = bundle2.get(AppMeasurementSdk.ConditionalUserProperty.VALUE);
        if (zzq().zzb(string) != 0) {
            zzj().zzg().zza("Invalid conditional user property name", zzi().zzc(string));
            return;
        }
        if (zzq().zza(string, obj) != 0) {
            zzj().zzg().zza("Invalid conditional user property value", zzi().zzc(string), obj);
            return;
        }
        Object zzc = zzq().zzc(string, obj);
        if (zzc == null) {
            zzj().zzg().zza("Unable to normalize conditional user property value", zzi().zzc(string), obj);
            return;
        }
        zzik.zza(bundle2, zzc);
        long j9 = bundle2.getLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT);
        if (!TextUtils.isEmpty(bundle2.getString(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME)) && (j9 > 15552000000L || j9 < 1)) {
            zzj().zzg().zza("Invalid conditional user property timeout", zzi().zzc(string), Long.valueOf(j9));
            return;
        }
        long j10 = bundle2.getLong(AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE);
        if (j10 <= 15552000000L && j10 >= 1) {
            zzl().zzb(new zzjt(this, bundle2));
        } else {
            zzj().zzg().zza("Invalid conditional user property time to live", zzi().zzc(string), Long.valueOf(j10));
        }
    }

    public static /* synthetic */ void zza(zziv zzivVar, Bundle bundle) {
        zzivVar.zzt();
        zzivVar.zzu();
        Preconditions.checkNotNull(bundle);
        String checkNotEmpty = Preconditions.checkNotEmpty(bundle.getString("name"));
        if (!zzivVar.zzu.zzac()) {
            zzivVar.zzj().zzp().zza("Conditional property not cleared since app measurement is disabled");
            return;
        }
        try {
            zzivVar.zzo().zza(new zzae(bundle.getString(MBridgeConstans.APP_ID), "", new zzno(checkNotEmpty, 0L, null, ""), bundle.getLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP), bundle.getBoolean(AppMeasurementSdk.ConditionalUserProperty.ACTIVE), bundle.getString(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME), null, bundle.getLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT), null, bundle.getLong(AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE), zzivVar.zzq().zza(bundle.getString(MBridgeConstans.APP_ID), bundle.getString(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME), bundle.getBundle(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS), "", bundle.getLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP), true, true)));
        } catch (IllegalArgumentException unused) {
        }
    }

    public static /* synthetic */ void zza(zziv zzivVar, zzin zzinVar, zzin zzinVar2) {
        if (com.google.android.gms.internal.measurement.zznk.zza() && zzivVar.zze().zza(zzbf.zzcu)) {
            return;
        }
        zzin.zza zzaVar = zzin.zza.ANALYTICS_STORAGE;
        zzin.zza zzaVar2 = zzin.zza.AD_STORAGE;
        boolean zza = zzinVar.zza(zzinVar2, zzaVar, zzaVar2);
        boolean zzb = zzinVar.zzb(zzinVar2, zzaVar, zzaVar2);
        if (zza || zzb) {
            zzivVar.zzg().zzag();
        }
    }

    public static /* synthetic */ void zza(zziv zzivVar, zzin zzinVar, long j7, boolean z8, boolean z9) {
        zzivVar.zzt();
        zzivVar.zzu();
        zzin zzn = zzivVar.zzk().zzn();
        if (j7 <= zzivVar.zzn && zzin.zza(zzn.zza(), zzinVar.zza())) {
            zzivVar.zzj().zzn().zza("Dropped out-of-date consent setting, proposed settings", zzinVar);
            return;
        }
        if (zzivVar.zzk().zza(zzinVar)) {
            zzivVar.zzj().zzp().zza("Setting storage consent(FE)", zzinVar);
            zzivVar.zzn = j7;
            if (zzivVar.zzo().zzan()) {
                zzivVar.zzo().zzb(z8);
            } else {
                zzivVar.zzo().zza(z8);
            }
            if (z9) {
                zzivVar.zzo().zza(new AtomicReference<>());
                return;
            }
            return;
        }
        zzivVar.zzj().zzn().zza("Lower precedence consent source ignored, proposed source", Integer.valueOf(zzinVar.zza()));
    }

    public final void zza(String str, String str2, Bundle bundle) {
        long currentTimeMillis = zzb().currentTimeMillis();
        Preconditions.checkNotEmpty(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str);
        bundle2.putLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, currentTimeMillis);
        if (str2 != null) {
            bundle2.putString(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, str2);
            bundle2.putBundle(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, bundle);
        }
        zzl().zzb(new zzjw(this, bundle2));
    }

    public final void zzb(zziu zziuVar) {
        zzu();
        Preconditions.checkNotNull(zziuVar);
        if (this.zzd.remove(zziuVar)) {
            return;
        }
        zzj().zzu().zza("OnEventListener had not been registered");
    }

    public final void zza(com.google.android.gms.internal.measurement.zzdg zzdgVar) throws RemoteException {
        zzl().zzb(new zzjx(this, zzdgVar));
    }

    public final /* synthetic */ void zza(AtomicReference atomicReference) {
        Bundle zza = zzk().zzi.zza();
        zzkx zzo = zzo();
        if (zza == null) {
            zza = new Bundle();
        }
        zzo.zza((AtomicReference<List<zzmu>>) atomicReference, zza);
    }

    public final /* synthetic */ void zza(List list) {
        boolean contains;
        zzt();
        if (Build.VERSION.SDK_INT >= 30) {
            SparseArray<Long> zzh = zzk().zzh();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                zzmu zzmuVar = (zzmu) it.next();
                contains = zzh.contains(zzmuVar.zzc);
                if (!contains || zzh.get(zzmuVar.zzc).longValue() < zzmuVar.zzb) {
                    zzal().add(zzmuVar);
                }
            }
            zzar();
        }
    }

    public final /* synthetic */ void zza(SharedPreferences sharedPreferences, String str) {
        if ("IABTCF_TCString".equals(str)) {
            zzj().zzp().zza("IABTCF_TCString change picked up in listener.");
            ((zzat) Preconditions.checkNotNull(this.zzr)).zza(500L);
        }
    }

    public final /* synthetic */ void zza(Bundle bundle, long j7) {
        if (TextUtils.isEmpty(zzg().zzae())) {
            zza(bundle, 0, j7);
        } else {
            zzj().zzv().zza("Using developer consent only; google app id found");
        }
    }

    public final /* synthetic */ void zza(Bundle bundle) {
        if (bundle == null) {
            zzk().zzt.zza(new Bundle());
            return;
        }
        Bundle zza = zzk().zzt.zza();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                zzq();
                if (zznp.zza(obj)) {
                    zzq();
                    zznp.zza(this.zzs, 27, (String) null, (String) null, 0);
                }
                zzj().zzv().zza("Invalid default event parameter type. Name, value", str, obj);
            } else if (zznp.zzg(str)) {
                zzj().zzv().zza("Invalid default event parameter name. Name", str);
            } else if (obj == null) {
                zza.remove(str);
            } else if (zzq().zza("param", str, zze().zza((String) null, false), obj)) {
                zzq().zza(zza, str, obj);
            }
        }
        zzq();
        if (zznp.zza(zza, zze().zzg())) {
            zzq();
            zznp.zza(this.zzs, 26, (String) null, (String) null, 0);
            zzj().zzv().zza("Too many default event parameters set. Discarding beyond event parameter limit");
        }
        zzk().zzt.zza(zza);
        zzo().zza(zza);
    }

    public final void zza(String str, String str2, Bundle bundle, boolean z8, boolean z9, long j7) {
        String str3 = str == null ? MBridgeConstans.DYNAMIC_VIEW_WX_APP : str;
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        if (Objects.equals(str2, "screen_view")) {
            zzn().zza(bundle2, j7);
        } else {
            zzb(str3, str2, j7, bundle2, z9, !z9 || this.zzc == null || zznp.zzg(str2), z8, null);
        }
    }

    public final void zza(String str, String str2, Bundle bundle, String str3) {
        zzs();
        zzb(str, str2, zzb().currentTimeMillis(), bundle, false, true, true, str3);
    }

    public final void zza(String str, String str2, Bundle bundle, long j7) {
        zza(str, str2, bundle, true, false, j7);
    }

    public final void zza(String str, String str2, long j7, Bundle bundle) {
        zzt();
        zza(str, str2, j7, bundle, true, this.zzc == null || zznp.zzg(str2), true, null);
    }

    public final void zza(String str, String str2, long j7, Bundle bundle, boolean z8, boolean z9, boolean z10, String str3) {
        boolean zza;
        String str4;
        ArrayList arrayList;
        long j9;
        int i9;
        Object obj;
        int length;
        Class<?> cls;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(bundle);
        zzt();
        zzu();
        if (!this.zzu.zzac()) {
            zzj().zzc().zza("Event not sent since app measurement is disabled");
            return;
        }
        List<String> zzaf = zzg().zzaf();
        if (zzaf != null && !zzaf.contains(str2)) {
            zzj().zzc().zza("Dropping non-safelisted event. event name, origin", str2, str);
            return;
        }
        if (!this.zze) {
            this.zze = true;
            try {
                if (!this.zzu.zzag()) {
                    cls = Class.forName("com.google.android.gms.tagmanager.TagManagerService", true, zza().getClassLoader());
                } else {
                    cls = Class.forName("com.google.android.gms.tagmanager.TagManagerService");
                }
                try {
                    cls.getDeclaredMethod("initialize", Context.class).invoke(null, zza());
                } catch (Exception e4) {
                    zzj().zzu().zza("Failed to invoke Tag Manager's initialize() method", e4);
                }
            } catch (ClassNotFoundException unused) {
                zzj().zzn().zza("Tag Manager is not found and thus will not be used");
            }
        }
        if ("_cmp".equals(str2) && bundle.containsKey("gclid")) {
            zza("auto", "_lgclid", bundle.getString("gclid"), zzb().currentTimeMillis());
        }
        if (z8 && zznp.zzj(str2)) {
            zzq().zza(bundle, zzk().zzt.zza());
        }
        if (!z10 && !"_iap".equals(str2)) {
            zznp zzt = this.zzu.zzt();
            int i10 = 2;
            if (zzt.zzc(NotificationCompat.CATEGORY_EVENT, str2)) {
                if (!zzt.zza(NotificationCompat.CATEGORY_EVENT, zziq.zza, zziq.zzb, str2)) {
                    i10 = 13;
                } else if (zzt.zza(NotificationCompat.CATEGORY_EVENT, 40, str2)) {
                    i10 = 0;
                }
            }
            if (i10 != 0) {
                zzj().zzh().zza("Invalid public event name. Event will not be logged (FE)", zzi().zza(str2));
                this.zzu.zzt();
                String zza2 = zznp.zza(str2, 40, true);
                length = str2 != null ? str2.length() : 0;
                this.zzu.zzt();
                zznp.zza(this.zzs, i10, "_ev", zza2, length);
                return;
            }
        }
        zzkp zza3 = zzn().zza(false);
        if (zza3 != null && !bundle.containsKey("_sc")) {
            zza3.zzd = true;
        }
        zznp.zza(zza3, bundle, z8 && !z10);
        boolean equals = "am".equals(str);
        boolean zzg = zznp.zzg(str2);
        if (z8 && this.zzc != null && !zzg && !equals) {
            zzj().zzc().zza("Passing event to registered event handler (FE)", zzi().zza(str2), zzi().zza(bundle));
            Preconditions.checkNotNull(this.zzc);
            this.zzc.interceptEvent(str, str2, bundle, j7);
            return;
        }
        if (this.zzu.zzaf()) {
            int zza4 = zzq().zza(str2);
            if (zza4 != 0) {
                zzj().zzh().zza("Invalid event name. Event will not be logged (FE)", zzi().zza(str2));
                zzq();
                String zza5 = zznp.zza(str2, 40, true);
                length = str2 != null ? str2.length() : 0;
                this.zzu.zzt();
                zznp.zza(this.zzs, str3, zza4, "_ev", zza5, length);
                return;
            }
            String str5 = "_o";
            Bundle zza6 = zzq().zza(str3, str2, bundle, CollectionUtils.listOf((Object[]) new String[]{"_o", "_sn", "_sc", "_si"}), z10);
            Preconditions.checkNotNull(zza6);
            if (zzn().zza(false) != null && "_ae".equals(str2)) {
                zzmn zzmnVar = zzp().zzb;
                long elapsedRealtime = zzmnVar.zzb.zzb().elapsedRealtime();
                long j10 = elapsedRealtime - zzmnVar.zza;
                zzmnVar.zza = elapsedRealtime;
                if (j10 > 0) {
                    zzq().zza(zza6, j10);
                }
            }
            if (!"auto".equals(str) && "_ssr".equals(str2)) {
                zznp zzq = zzq();
                String string = zza6.getString("_ffr");
                if (Strings.isEmptyOrWhitespace(string)) {
                    string = null;
                } else if (string != null) {
                    string = string.trim();
                }
                if (Objects.equals(string, zzq.zzk().zzq.zza())) {
                    zzq.zzj().zzc().zza("Not logging duplicate session_start_with_rollout event");
                    return;
                }
                zzq.zzk().zzq.zza(string);
            } else if ("_ae".equals(str2)) {
                String zza7 = zzq().zzk().zzq.zza();
                if (!TextUtils.isEmpty(zza7)) {
                    zza6.putString("_ffr", zza7);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(zza6);
            if (zze().zza(zzbf.zzcg)) {
                zza = zzp().zzaa();
            } else {
                zza = zzk().zzn.zza();
            }
            if (zzk().zzk.zza() <= 0 || !zzk().zza(j7) || !zza) {
                str4 = "_ae";
                arrayList = arrayList2;
                j9 = 0;
            } else {
                zzj().zzp().zza("Current session is expired, remove the session number, ID, and engagement time");
                arrayList = arrayList2;
                j9 = 0;
                str4 = "_ae";
                zza("auto", "_sid", (Object) null, zzb().currentTimeMillis());
                zza("auto", "_sno", (Object) null, zzb().currentTimeMillis());
                zza("auto", "_se", (Object) null, zzb().currentTimeMillis());
                zzk().zzl.zza(0L);
            }
            if (zza6.getLong("extend_session", j9) == 1) {
                zzj().zzp().zza("EXTEND_SESSION param attached: initiate a new session or extend the current active session");
                i9 = 1;
                this.zzu.zzs().zza.zza(j7, true);
            } else {
                i9 = 1;
            }
            ArrayList arrayList3 = new ArrayList(zza6.keySet());
            Collections.sort(arrayList3);
            int size = arrayList3.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj2 = arrayList3.get(i11);
                i11 += i9;
                String str6 = (String) obj2;
                if (str6 != null) {
                    zzq();
                    Bundle[] zzb = zznp.zzb(zza6.get(str6));
                    if (zzb != null) {
                        zza6.putParcelableArray(str6, zzb);
                    }
                }
                i9 = 1;
            }
            int i12 = 0;
            while (i12 < arrayList.size()) {
                ArrayList arrayList4 = arrayList;
                Bundle bundle2 = (Bundle) arrayList4.get(i12);
                String str7 = i12 != 0 ? "_ep" : str2;
                bundle2.putString(str5, str);
                if (z9) {
                    obj = null;
                    bundle2 = zzq().zza(bundle2, (String) null);
                } else {
                    obj = null;
                }
                Bundle bundle3 = bundle2;
                String str8 = str5;
                zzo().zza(new zzbd(str7, new zzbc(bundle3), str, j7), str3);
                if (!equals) {
                    Iterator<zziu> it = this.zzd.iterator();
                    while (it.hasNext()) {
                        it.next().onEvent(str, str2, new Bundle(bundle3), j7);
                    }
                }
                i12++;
                arrayList = arrayList4;
                str5 = str8;
            }
            if (zzn().zza(false) == null || !str4.equals(str2)) {
                return;
            }
            zzp().zza(true, true, zzb().elapsedRealtime());
        }
    }

    public final void zza(zziu zziuVar) {
        zzu();
        Preconditions.checkNotNull(zziuVar);
        if (this.zzd.add(zziuVar)) {
            return;
        }
        zzj().zzu().zza("OnEventListener already registered");
    }

    public final void zza(long j7) {
        zzc((String) null);
        zzl().zzb(new zzju(this, j7));
    }

    public final void zza(long j7, boolean z8) {
        zzt();
        zzu();
        zzj().zzc().zza("Resetting analytics data (FE)");
        zzmh zzp = zzp();
        zzp.zzt();
        zzp.zzb.zza();
        zzg().zzag();
        boolean zzac = this.zzu.zzac();
        zzgh zzk = zzk();
        zzk.zzc.zza(j7);
        if (!TextUtils.isEmpty(zzk.zzk().zzq.zza())) {
            zzk.zzq.zza(null);
        }
        zzk.zzk.zza(0L);
        zzk.zzl.zza(0L);
        if (!zzk.zze().zzw()) {
            zzk.zzb(!zzac);
        }
        zzk.zzr.zza(null);
        zzk.zzs.zza(0L);
        zzk.zzt.zza(null);
        if (z8) {
            zzo().zzah();
        }
        zzp().zza.zza();
        this.zzo = !zzac;
    }

    private final void zza(String str, String str2, long j7, Object obj) {
        zzl().zzb(new zzjq(this, str, str2, obj, j7));
    }

    private final void zza(Bundle bundle, int i9, long j7) {
        String str;
        zzu();
        String zza = zzin.zza(bundle);
        if (zza != null) {
            zzj().zzv().zza("Ignoring invalid consent setting", zza);
            zzj().zzv().zza("Valid consent values are 'granted', 'denied'");
        }
        boolean zzg = zzl().zzg();
        zzin zza2 = zzin.zza(bundle, i9);
        if (zza2.zzk()) {
            zza(zza2, j7, zzg);
        }
        zzav zza3 = zzav.zza(bundle, i9);
        if (zza3.zzg()) {
            zza(zza3, zzg);
        }
        Boolean zza4 = zzav.zza(bundle);
        if (zza4 != null) {
            if (i9 == -30) {
                str = "tcf";
            } else {
                str = MBridgeConstans.DYNAMIC_VIEW_WX_APP;
            }
            zza(str, "allow_personalized_ads", (Object) zza4.toString(), false);
        }
    }

    public final void zza(zzav zzavVar, boolean z8) {
        zzkd zzkdVar = new zzkd(this, zzavVar);
        if (z8) {
            zzt();
            zzkdVar.run();
        } else {
            zzl().zzb(zzkdVar);
        }
    }

    public final void zza(zzir zzirVar) {
        zzir zzirVar2;
        zzt();
        zzu();
        if (zzirVar != null && zzirVar != (zzirVar2 = this.zzc)) {
            Preconditions.checkState(zzirVar2 == null, "EventInterceptor already set.");
        }
        this.zzc = zzirVar;
    }

    public final void zza(Boolean bool) {
        zzu();
        zzl().zzb(new zzke(this, bool));
    }

    public final void zza(zzin zzinVar) {
        zzt();
        boolean z8 = (zzinVar.zzj() && zzinVar.zzi()) || zzo().zzam();
        if (z8 != this.zzu.zzad()) {
            this.zzu.zzb(z8);
            Boolean zzu = zzk().zzu();
            if (!z8 || zzu == null || zzu.booleanValue()) {
                zza(Boolean.valueOf(z8), false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(Boolean bool, boolean z8) {
        zzt();
        zzu();
        zzj().zzc().zza("Setting app measurement enabled (FE)", bool);
        zzk().zza(bool);
        if (z8) {
            zzk().zzb(bool);
        }
        if (this.zzu.zzad() || !(bool == null || bool.booleanValue())) {
            zzat();
        }
    }

    public final void zza(Intent intent) {
        if (zzpn.zza() && zze().zza(zzbf.zzbt)) {
            Uri data = intent.getData();
            if (data == null) {
                zzj().zzn().zza("Activity intent has no data. Preview Mode was not enabled.");
                return;
            }
            String queryParameter = data.getQueryParameter("sgtm_debug_enable");
            if (queryParameter != null && queryParameter.equals("1")) {
                String queryParameter2 = data.getQueryParameter("sgtm_preview_key");
                if (TextUtils.isEmpty(queryParameter2)) {
                    return;
                }
                zzj().zzn().zza("Preview Mode was enabled. Using the sgtmPreviewKey: ", queryParameter2);
                zze().zzh(queryParameter2);
                return;
            }
            zzj().zzn().zza("Preview Mode was not enabled.");
            zze().zzh(null);
        }
    }

    public final void zza(zzin zzinVar, long j7, boolean z8) {
        zzin zzinVar2;
        boolean z9;
        boolean z10;
        boolean z11;
        zzin zzinVar3 = zzinVar;
        zzu();
        int zza = zzinVar.zza();
        if (com.google.android.gms.internal.measurement.zzne.zza() && zze().zza(zzbf.zzcq)) {
            if (zza != -10) {
                zzim zzc = zzinVar.zzc();
                zzim zzimVar = zzim.UNINITIALIZED;
                if (zzc == zzimVar && zzinVar.zzd() == zzimVar) {
                    zzj().zzv().zza("Ignoring empty consent settings");
                    return;
                }
            }
        } else if (zza != -10 && zzinVar.zze() == null && zzinVar.zzf() == null) {
            zzj().zzv().zza("Discarding empty consent settings");
            return;
        }
        synchronized (this.zzg) {
            try {
                zzinVar2 = this.zzl;
                z9 = false;
                if (zzin.zza(zza, zzinVar2.zza())) {
                    z10 = zzinVar.zzc(this.zzl);
                    if (zzinVar.zzj() && !this.zzl.zzj()) {
                        z9 = true;
                    }
                    zzinVar3 = zzinVar.zzb(this.zzl);
                    this.zzl = zzinVar3;
                    z11 = z9;
                    z9 = true;
                } else {
                    z10 = false;
                    z11 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z9) {
            zzj().zzn().zza("Ignoring lower-priority consent settings, proposed settings", zzinVar3);
            return;
        }
        long andIncrement = this.zzm.getAndIncrement();
        if (z10) {
            zzc((String) null);
            zzkg zzkgVar = new zzkg(this, zzinVar3, j7, andIncrement, z11, zzinVar2);
            if (z8) {
                zzt();
                zzkgVar.run();
                return;
            } else {
                zzl().zzc(zzkgVar);
                return;
            }
        }
        zzkf zzkfVar = new zzkf(this, zzinVar3, andIncrement, z11, zzinVar2);
        if (z8) {
            zzt();
            zzkfVar.run();
        } else if (zza != 30 && zza != -10) {
            zzl().zzb(zzkfVar);
        } else {
            zzl().zzc(zzkfVar);
        }
    }

    public final void zza(final String str, long j7) {
        if (str != null && TextUtils.isEmpty(str)) {
            this.zzu.zzj().zzu().zza("User ID must be non-empty or null");
        } else {
            zzl().zzb(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzjg
                @Override // java.lang.Runnable
                public final void run() {
                    zziv.this.zzb(str);
                }
            });
            zza((String) null, "_id", (Object) str, true, j7);
        }
    }

    public final void zza(String str, String str2, Object obj, boolean z8) {
        zza(str, str2, obj, z8, zzb().currentTimeMillis());
    }

    public final void zza(String str, String str2, Object obj, boolean z8, long j7) {
        int i9;
        int length;
        if (str == null) {
            str = MBridgeConstans.DYNAMIC_VIEW_WX_APP;
        }
        String str3 = str;
        if (z8) {
            i9 = zzq().zzb(str2);
        } else {
            zznp zzq = zzq();
            if (zzq.zzc("user property", str2)) {
                if (!zzq.zza("user property", zzis.zza, str2)) {
                    i9 = 15;
                } else if (zzq.zza("user property", 24, str2)) {
                    i9 = 0;
                }
            }
            i9 = 6;
        }
        if (i9 != 0) {
            zzq();
            String zza = zznp.zza(str2, 24, true);
            length = str2 != null ? str2.length() : 0;
            this.zzu.zzt();
            zznp.zza(this.zzs, i9, "_ev", zza, length);
            return;
        }
        if (obj != null) {
            int zza2 = zzq().zza(str2, obj);
            if (zza2 != 0) {
                zzq();
                String zza3 = zznp.zza(str2, 24, true);
                length = ((obj instanceof String) || (obj instanceof CharSequence)) ? String.valueOf(obj).length() : 0;
                this.zzu.zzt();
                zznp.zza(this.zzs, zza2, "_ev", zza3, length);
                return;
            }
            Object zzc = zzq().zzc(str2, obj);
            if (zzc != null) {
                zza(str3, str2, j7, zzc);
                return;
            }
            return;
        }
        zza(str3, str2, j7, (Object) null);
    }

    public final void zza(String str, String str2, Object obj, long j7) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzt();
        zzu();
        if ("allow_personalized_ads".equals(str2)) {
            if (obj instanceof String) {
                String str3 = (String) obj;
                if (!TextUtils.isEmpty(str3)) {
                    Long valueOf = Long.valueOf("false".equals(str3.toLowerCase(Locale.ENGLISH)) ? 1L : 0L);
                    zzk().zzh.zza(valueOf.longValue() == 1 ? "true" : "false");
                    obj = valueOf;
                    str2 = "_npa";
                    zzj().zzp().zza("Setting user property(FE)", "non_personalized_ads(_npa)", obj);
                }
            }
            if (obj == null) {
                zzk().zzh.zza("unset");
                str2 = "_npa";
            }
            zzj().zzp().zza("Setting user property(FE)", "non_personalized_ads(_npa)", obj);
        }
        String str4 = str2;
        Object obj2 = obj;
        if (!this.zzu.zzac()) {
            zzj().zzp().zza("User property not set since app measurement is disabled");
        } else if (this.zzu.zzaf()) {
            zzo().zza(new zzno(str4, j7, obj2, str));
        }
    }
}
