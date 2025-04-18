package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.NetworkOnMainThreadException;
import android.os.RemoteException;
import android.util.Log;
import android.util.Pair;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultRenderersFactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutorService;

/* loaded from: classes3.dex */
public class zzdy {
    private static volatile zzdy zzb;
    protected final Clock zza;
    private final String zzc;
    private final ExecutorService zzd;
    private final AppMeasurementSdk zze;
    private final List<Pair<com.google.android.gms.measurement.internal.zzjl, zzb>> zzf;
    private int zzg;
    private boolean zzh;
    private String zzi;
    private volatile zzdj zzj;

    /* loaded from: classes3.dex */
    public abstract class zza implements Runnable {
        final long zza;
        final long zzb;
        private final boolean zzc;

        public zza(zzdy zzdyVar) {
            this(true);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (zzdy.this.zzh) {
                zzb();
                return;
            }
            try {
                zza();
            } catch (Exception e2) {
                zzdy.this.zza(e2, false, this.zzc);
                zzb();
            }
        }

        public abstract void zza() throws RemoteException;

        public void zzb() {
        }

        public zza(boolean z10) {
            this.zza = zzdy.this.zza.currentTimeMillis();
            this.zzb = zzdy.this.zza.elapsedRealtime();
            this.zzc = z10;
        }
    }

    /* loaded from: classes3.dex */
    public static class zzb extends zzds {
        private final com.google.android.gms.measurement.internal.zzjl zza;

        public zzb(com.google.android.gms.measurement.internal.zzjl zzjlVar) {
            this.zza = zzjlVar;
        }

        @Override // com.google.android.gms.internal.measurement.zzdp
        public final int zza() {
            return System.identityHashCode(this.zza);
        }

        @Override // com.google.android.gms.internal.measurement.zzdp
        public final void zza(String str, String str2, Bundle bundle, long j3) {
            this.zza.onEvent(str, str2, bundle, j3);
        }
    }

    /* loaded from: classes3.dex */
    public static class zzc extends zzds {
        private final com.google.android.gms.measurement.internal.zzjm zza;

        public zzc(com.google.android.gms.measurement.internal.zzjm zzjmVar) {
            this.zza = zzjmVar;
        }

        @Override // com.google.android.gms.internal.measurement.zzdp
        public final int zza() {
            return System.identityHashCode(this.zza);
        }

        @Override // com.google.android.gms.internal.measurement.zzdp
        public final void zza(String str, String str2, Bundle bundle, long j3) {
            this.zza.interceptEvent(str, str2, bundle, j3);
        }
    }

    /* loaded from: classes3.dex */
    public class zzd implements Application.ActivityLifecycleCallbacks {
        public zzd() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(Activity activity, Bundle bundle) {
            zzdy.this.zza(new zzfg(this, bundle, activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
            zzdy.this.zza(new zzfl(this, activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(Activity activity) {
            zzdy.this.zza(new zzfk(this, activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity) {
            zzdy.this.zza(new zzfh(this, activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            zzdk zzdkVar = new zzdk();
            zzdy.this.zza(new zzfm(this, activity, zzdkVar));
            Bundle zza = zzdkVar.zza(50L);
            if (zza != null) {
                bundle.putAll(zza);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(Activity activity) {
            zzdy.this.zza(new zzfi(this, activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity activity) {
            zzdy.this.zza(new zzfj(this, activity));
        }
    }

    private zzdy(Context context, String str, String str2, String str3, Bundle bundle) {
        boolean z10;
        boolean z11;
        if (str != null && zzc(str2, str3)) {
            this.zzc = str;
        } else {
            this.zzc = "FA";
        }
        this.zza = DefaultClock.getInstance();
        this.zzd = zzdc.zza().zza(new zzek(this), 1);
        this.zze = new AppMeasurementSdk(this);
        this.zzf = new ArrayList();
        if (zzb(context) && !zzk()) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            this.zzi = null;
            this.zzh = true;
            Log.w(this.zzc, "Disabling data collection. Found google_app_id in strings.xml but Google Analytics for Firebase is missing. Remove this value or add Google Analytics for Firebase to resume data collection.");
            return;
        }
        if (!zzc(str2, str3)) {
            this.zzi = "fa";
            if (str2 != null && str3 != null) {
                Log.v(this.zzc, "Deferring to Google Analytics for Firebase for event data collection. https://firebase.google.com/docs/analytics");
            } else {
                if (str2 == null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11 ^ (str3 == null)) {
                    Log.w(this.zzc, "Specified origin or custom app id is null. Both parameters will be ignored.");
                }
            }
        } else {
            this.zzi = str2;
        }
        zza(new zzdx(this, str2, str3, context, bundle));
        Application application = (Application) context.getApplicationContext();
        if (application == null) {
            Log.w(this.zzc, "Unable to register lifecycle notifications. Application null.");
        } else {
            application.registerActivityLifecycleCallbacks(new zzd());
        }
    }

    private final boolean zzk() {
        try {
            Class.forName("com.google.firebase.analytics.FirebaseAnalytics", false, getClass().getClassLoader());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public final String zzd() {
        return this.zzi;
    }

    public final String zze() {
        zzdk zzdkVar = new zzdk();
        zza(new zzey(this, zzdkVar));
        return zzdkVar.zzc(120000L);
    }

    public final String zzf() {
        zzdk zzdkVar = new zzdk();
        zza(new zzen(this, zzdkVar));
        return zzdkVar.zzc(50L);
    }

    public final String zzg() {
        zzdk zzdkVar = new zzdk();
        zza(new zzes(this, zzdkVar));
        return zzdkVar.zzc(500L);
    }

    public final String zzh() {
        zzdk zzdkVar = new zzdk();
        zza(new zzep(this, zzdkVar));
        return zzdkVar.zzc(500L);
    }

    public final String zzi() {
        zzdk zzdkVar = new zzdk();
        zza(new zzeo(this, zzdkVar));
        return zzdkVar.zzc(500L);
    }

    public final void zzj() {
        zza(new zzeh(this));
    }

    public final AppMeasurementSdk zzb() {
        return this.zze;
    }

    public final Long zzc() {
        zzdk zzdkVar = new zzdk();
        zza(new zzex(this, zzdkVar));
        return zzdkVar.zzb(120000L);
    }

    public final void zzd(Bundle bundle) {
        zza(new zzfc(this, bundle));
    }

    public final void zzb(String str) {
        zza(new zzem(this, str));
    }

    public final void zzd(String str) {
        zza(new zzee(this, str));
    }

    public final void zzb(String str, String str2, Bundle bundle) {
        zza(str, str2, bundle, true, true, null);
    }

    public final void zzb(Bundle bundle) {
        zza(new zzef(this, bundle));
    }

    public final void zzc(String str) {
        zza(new zzel(this, str));
    }

    public final int zza(String str) {
        zzdk zzdkVar = new zzdk();
        zza(new zzev(this, str, zzdkVar));
        Integer num = (Integer) zzdk.zza(zzdkVar.zza(10000L), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    public final void zzb(String str, String str2) {
        zza((String) null, str, (Object) str2, false);
    }

    public final void zzc(Bundle bundle) {
        zza(new zzei(this, bundle));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean zzc(String str, String str2) {
        return (str2 == null || str == null || zzk()) ? false : true;
    }

    public final void zzb(com.google.android.gms.measurement.internal.zzjl zzjlVar) {
        Pair<com.google.android.gms.measurement.internal.zzjl, zzb> pair;
        Preconditions.checkNotNull(zzjlVar);
        synchronized (this.zzf) {
            int i10 = 0;
            while (true) {
                if (i10 >= this.zzf.size()) {
                    pair = null;
                    break;
                } else {
                    if (zzjlVar.equals(this.zzf.get(i10).first)) {
                        pair = this.zzf.get(i10);
                        break;
                    }
                    i10++;
                }
            }
            if (pair == null) {
                Log.w(this.zzc, "OnEventListener had not been registered.");
                return;
            }
            this.zzf.remove(pair);
            zzb zzbVar = (zzb) pair.second;
            if (this.zzj != null) {
                try {
                    this.zzj.unregisterOnMeasurementEventListener(zzbVar);
                    return;
                } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
                    Log.w(this.zzc, "Failed to unregister event listener on calling thread. Trying again on the dynamite thread.");
                }
            }
            zza(new zzfd(this, zzbVar));
        }
    }

    public final long zza() {
        zzdk zzdkVar = new zzdk();
        zza(new zzeq(this, zzdkVar));
        Long zzb2 = zzdkVar.zzb(500L);
        if (zzb2 == null) {
            long nextLong = new Random(System.nanoTime() ^ this.zza.currentTimeMillis()).nextLong();
            int i10 = this.zzg + 1;
            this.zzg = i10;
            return nextLong + i10;
        }
        return zzb2.longValue();
    }

    public final Bundle zza(Bundle bundle, boolean z10) {
        zzdk zzdkVar = new zzdk();
        zza(new zzew(this, bundle, zzdkVar));
        if (z10) {
            return zzdkVar.zza(DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS);
        }
        return null;
    }

    public final zzdj zza(Context context, boolean z10) {
        try {
            return zzdm.asInterface(DynamiteModule.load(context, DynamiteModule.PREFER_HIGHEST_OR_LOCAL_VERSION, ModuleDescriptor.MODULE_ID).instantiate("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
        } catch (DynamiteModule.LoadingException e2) {
            zza((Exception) e2, true, false);
            return null;
        }
    }

    private static boolean zzb(Context context) {
        return new com.google.android.gms.measurement.internal.zzhs(context, com.google.android.gms.measurement.internal.zzhs.zza(context)).zza("google_app_id") != null;
    }

    public static zzdy zza(@NonNull Context context) {
        return zza(context, (String) null, (String) null, (String) null, (Bundle) null);
    }

    public static zzdy zza(Context context, String str, String str2, String str3, Bundle bundle) {
        Preconditions.checkNotNull(context);
        if (zzb == null) {
            synchronized (zzdy.class) {
                if (zzb == null) {
                    zzb = new zzdy(context, str, str2, str3, bundle);
                }
            }
        }
        return zzb;
    }

    public final Object zza(int i10) {
        zzdk zzdkVar = new zzdk();
        zza(new zzfa(this, zzdkVar, i10));
        return zzdk.zza(zzdkVar.zza(15000L), Object.class);
    }

    public final List<Bundle> zza(String str, String str2) {
        zzdk zzdkVar = new zzdk();
        zza(new zzeb(this, str, str2, zzdkVar));
        List<Bundle> list = (List) zzdk.zza(zzdkVar.zza(DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS), List.class);
        return list == null ? Collections.emptyList() : list;
    }

    public final Map<String, Object> zza(String str, String str2, boolean z10) {
        zzdk zzdkVar = new zzdk();
        zza(new zzer(this, str, str2, z10, zzdkVar));
        Bundle zza2 = zzdkVar.zza(DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS);
        if (zza2 != null && zza2.size() != 0) {
            HashMap hashMap = new HashMap(zza2.size());
            for (String str3 : zza2.keySet()) {
                Object obj = zza2.get(str3);
                if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                    hashMap.put(str3, obj);
                }
            }
            return hashMap;
        }
        return Collections.emptyMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(Exception exc, boolean z10, boolean z11) {
        this.zzh |= z10;
        if (z10) {
            Log.w(this.zzc, "Data collection startup failed. No data will be collected.", exc);
            return;
        }
        if (z11) {
            zza(5, "Error with data collection. Data lost.", exc, (Object) null, (Object) null);
        }
        Log.w(this.zzc, "Error with data collection. Data lost.", exc);
    }

    public final void zza(String str, String str2, Bundle bundle) {
        zza(new zzec(this, str, str2, bundle));
    }

    public final void zza(@NonNull String str, Bundle bundle) {
        zza(null, str, bundle, false, true, null);
    }

    public final void zza(String str, String str2, Bundle bundle, long j3) {
        zza(str, str2, bundle, true, false, Long.valueOf(j3));
    }

    private final void zza(String str, String str2, Bundle bundle, boolean z10, boolean z11, Long l10) {
        zza(new zzff(this, l10, str, str2, bundle, z10, z11));
    }

    public final void zza(int i10, String str, Object obj, Object obj2, Object obj3) {
        zza(new zzeu(this, false, 5, str, obj, null, null));
    }

    public final void zza(com.google.android.gms.measurement.internal.zzjl zzjlVar) {
        Preconditions.checkNotNull(zzjlVar);
        synchronized (this.zzf) {
            for (int i10 = 0; i10 < this.zzf.size(); i10++) {
                if (zzjlVar.equals(this.zzf.get(i10).first)) {
                    Log.w(this.zzc, "OnEventListener already registered.");
                    return;
                }
            }
            zzb zzbVar = new zzb(zzjlVar);
            this.zzf.add(new Pair<>(zzjlVar, zzbVar));
            if (this.zzj != null) {
                try {
                    this.zzj.registerOnMeasurementEventListener(zzbVar);
                    return;
                } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
                    Log.w(this.zzc, "Failed to register event listener on calling thread. Trying again on the dynamite thread.");
                }
            }
            zza(new zzfe(this, zzbVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zza zzaVar) {
        this.zzd.execute(zzaVar);
    }

    public final void zza(Bundle bundle) {
        zza(new zzdz(this, bundle));
    }

    public final void zza(Activity activity, String str, String str2) {
        zza(new zzed(this, activity, str, str2));
    }

    public final void zza(boolean z10) {
        zza(new zzez(this, z10));
    }

    public final void zza(com.google.android.gms.measurement.internal.zzjm zzjmVar) {
        zzc zzcVar = new zzc(zzjmVar);
        if (this.zzj != null) {
            try {
                this.zzj.setEventInterceptor(zzcVar);
                return;
            } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
                Log.w(this.zzc, "Failed to set event interceptor on calling thread. Trying again on the dynamite thread.");
            }
        }
        zza(new zzet(this, zzcVar));
    }

    public final void zza(Boolean bool) {
        zza(new zzeg(this, bool));
    }

    public final void zza(long j3) {
        zza(new zzej(this, j3));
    }

    public final void zza(Intent intent) {
        zza(new zzfb(this, intent));
    }

    public final void zza(String str, String str2, Object obj, boolean z10) {
        zza(new zzea(this, str, str2, obj, z10));
    }
}
