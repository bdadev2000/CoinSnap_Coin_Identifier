package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.Map;
import r.b;

@DynamiteApi
/* loaded from: classes3.dex */
public class AppMeasurementDynamiteService extends com.google.android.gms.internal.measurement.zzdm {
    zzhy zza = null;
    private final Map<Integer, zzjl> zzb = new b();

    /* loaded from: classes3.dex */
    public class zza implements zzjm {
        private com.google.android.gms.internal.measurement.zzdp zza;

        public zza(com.google.android.gms.internal.measurement.zzdp zzdpVar) {
            this.zza = zzdpVar;
        }

        @Override // com.google.android.gms.measurement.internal.zzjm
        public final void interceptEvent(String str, String str2, Bundle bundle, long j3) {
            try {
                this.zza.zza(str, str2, bundle, j3);
            } catch (RemoteException e2) {
                zzhy zzhyVar = AppMeasurementDynamiteService.this.zza;
                if (zzhyVar != null) {
                    zzhyVar.zzj().zzu().zza("Event interceptor threw exception", e2);
                }
            }
        }
    }

    /* loaded from: classes3.dex */
    public class zzb implements zzjl {
        private com.google.android.gms.internal.measurement.zzdp zza;

        public zzb(com.google.android.gms.internal.measurement.zzdp zzdpVar) {
            this.zza = zzdpVar;
        }

        @Override // com.google.android.gms.measurement.internal.zzjl
        public final void onEvent(String str, String str2, Bundle bundle, long j3) {
            try {
                this.zza.zza(str, str2, bundle, j3);
            } catch (RemoteException e2) {
                zzhy zzhyVar = AppMeasurementDynamiteService.this.zza;
                if (zzhyVar != null) {
                    zzhyVar.zzj().zzu().zza("Event listener threw exception", e2);
                }
            }
        }
    }

    private final void zza() {
        if (this.zza == null) {
            throw new IllegalStateException("Attempting to perform action before initialize.");
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public void beginAdUnitExposure(@NonNull String str, long j3) throws RemoteException {
        zza();
        this.zza.zze().zza(str, j3);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public void clearConditionalUserProperty(@NonNull String str, @NonNull String str2, @NonNull Bundle bundle) throws RemoteException {
        zza();
        this.zza.zzp().zza(str, str2, bundle);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public void clearMeasurementEnabled(long j3) throws RemoteException {
        zza();
        this.zza.zzp().zza((Boolean) null);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public void endAdUnitExposure(@NonNull String str, long j3) throws RemoteException {
        zza();
        this.zza.zze().zzb(str, j3);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public void generateEventId(com.google.android.gms.internal.measurement.zzdo zzdoVar) throws RemoteException {
        zza();
        long zzn = this.zza.zzt().zzn();
        zza();
        this.zza.zzt().zza(zzdoVar, zzn);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public void getAppInstanceId(com.google.android.gms.internal.measurement.zzdo zzdoVar) throws RemoteException {
        zza();
        this.zza.zzl().zzb(new zzi(this, zzdoVar));
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public void getCachedAppInstanceId(com.google.android.gms.internal.measurement.zzdo zzdoVar) throws RemoteException {
        zza();
        zza(zzdoVar, this.zza.zzp().zzag());
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public void getConditionalUserProperties(String str, String str2, com.google.android.gms.internal.measurement.zzdo zzdoVar) throws RemoteException {
        zza();
        this.zza.zzl().zzb(new zzl(this, zzdoVar, str, str2));
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public void getCurrentScreenClass(com.google.android.gms.internal.measurement.zzdo zzdoVar) throws RemoteException {
        zza();
        zza(zzdoVar, this.zza.zzp().zzah());
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public void getCurrentScreenName(com.google.android.gms.internal.measurement.zzdo zzdoVar) throws RemoteException {
        zza();
        zza(zzdoVar, this.zza.zzp().zzai());
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public void getGmpAppId(com.google.android.gms.internal.measurement.zzdo zzdoVar) throws RemoteException {
        zza();
        zza(zzdoVar, this.zza.zzp().zzaj());
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public void getMaxUserProperties(String str, com.google.android.gms.internal.measurement.zzdo zzdoVar) throws RemoteException {
        zza();
        this.zza.zzp();
        zzjq.zza(str);
        zza();
        this.zza.zzt().zza(zzdoVar, 25);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public void getSessionId(com.google.android.gms.internal.measurement.zzdo zzdoVar) throws RemoteException {
        zza();
        this.zza.zzp().zza(zzdoVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public void getTestFlag(com.google.android.gms.internal.measurement.zzdo zzdoVar, int i10) throws RemoteException {
        zza();
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 == 4) {
                            this.zza.zzt().zza(zzdoVar, this.zza.zzp().zzac().booleanValue());
                            return;
                        }
                        return;
                    }
                    this.zza.zzt().zza(zzdoVar, this.zza.zzp().zzae().intValue());
                    return;
                }
                zzos zzt = this.zza.zzt();
                double doubleValue = this.zza.zzp().zzad().doubleValue();
                Bundle bundle = new Bundle();
                bundle.putDouble(CampaignEx.JSON_KEY_AD_R, doubleValue);
                try {
                    zzdoVar.zza(bundle);
                    return;
                } catch (RemoteException e2) {
                    zzt.zzu.zzj().zzu().zza("Error returning double value to wrapper", e2);
                    return;
                }
            }
            this.zza.zzt().zza(zzdoVar, this.zza.zzp().zzaf().longValue());
            return;
        }
        this.zza.zzt().zza(zzdoVar, this.zza.zzp().zzak());
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public void getUserProperties(String str, String str2, boolean z10, com.google.android.gms.internal.measurement.zzdo zzdoVar) throws RemoteException {
        zza();
        this.zza.zzl().zzb(new zzj(this, zzdoVar, str, str2, z10));
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public void initForTests(@NonNull Map map) throws RemoteException {
        zza();
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public void initialize(IObjectWrapper iObjectWrapper, com.google.android.gms.internal.measurement.zzdw zzdwVar, long j3) throws RemoteException {
        zzhy zzhyVar = this.zza;
        if (zzhyVar == null) {
            this.zza = zzhy.zza((Context) Preconditions.checkNotNull((Context) ObjectWrapper.unwrap(iObjectWrapper)), zzdwVar, Long.valueOf(j3));
        } else {
            zzhyVar.zzj().zzu().zza("Attempting to initialize multiple times");
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public void isDataCollectionEnabled(com.google.android.gms.internal.measurement.zzdo zzdoVar) throws RemoteException {
        zza();
        this.zza.zzl().zzb(new zzn(this, zzdoVar));
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public void logEvent(@NonNull String str, @NonNull String str2, @NonNull Bundle bundle, boolean z10, boolean z11, long j3) throws RemoteException {
        zza();
        this.zza.zzp().zza(str, str2, bundle, z10, z11, j3);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public void logEventAndBundle(String str, String str2, Bundle bundle, com.google.android.gms.internal.measurement.zzdo zzdoVar, long j3) throws RemoteException {
        Bundle bundle2;
        zza();
        Preconditions.checkNotEmpty(str2);
        if (bundle != null) {
            bundle2 = new Bundle(bundle);
        } else {
            bundle2 = new Bundle();
        }
        bundle2.putString("_o", MBridgeConstans.DYNAMIC_VIEW_WX_APP);
        this.zza.zzl().zzb(new zzk(this, zzdoVar, new zzbf(str2, new zzbe(bundle), MBridgeConstans.DYNAMIC_VIEW_WX_APP, j3), str));
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public void logHealthData(int i10, @NonNull String str, @NonNull IObjectWrapper iObjectWrapper, @NonNull IObjectWrapper iObjectWrapper2, @NonNull IObjectWrapper iObjectWrapper3) throws RemoteException {
        Object unwrap;
        Object unwrap2;
        zza();
        Object obj = null;
        if (iObjectWrapper == null) {
            unwrap = null;
        } else {
            unwrap = ObjectWrapper.unwrap(iObjectWrapper);
        }
        if (iObjectWrapper2 == null) {
            unwrap2 = null;
        } else {
            unwrap2 = ObjectWrapper.unwrap(iObjectWrapper2);
        }
        if (iObjectWrapper3 != null) {
            obj = ObjectWrapper.unwrap(iObjectWrapper3);
        }
        this.zza.zzj().zza(i10, true, false, str, unwrap, unwrap2, obj);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public void onActivityCreated(@NonNull IObjectWrapper iObjectWrapper, @NonNull Bundle bundle, long j3) throws RemoteException {
        zza();
        Application.ActivityLifecycleCallbacks zzaa = this.zza.zzp().zzaa();
        if (zzaa != null) {
            this.zza.zzp().zzao();
            zzaa.onActivityCreated((Activity) ObjectWrapper.unwrap(iObjectWrapper), bundle);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public void onActivityDestroyed(@NonNull IObjectWrapper iObjectWrapper, long j3) throws RemoteException {
        zza();
        Application.ActivityLifecycleCallbacks zzaa = this.zza.zzp().zzaa();
        if (zzaa != null) {
            this.zza.zzp().zzao();
            zzaa.onActivityDestroyed((Activity) ObjectWrapper.unwrap(iObjectWrapper));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public void onActivityPaused(@NonNull IObjectWrapper iObjectWrapper, long j3) throws RemoteException {
        zza();
        Application.ActivityLifecycleCallbacks zzaa = this.zza.zzp().zzaa();
        if (zzaa != null) {
            this.zza.zzp().zzao();
            zzaa.onActivityPaused((Activity) ObjectWrapper.unwrap(iObjectWrapper));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public void onActivityResumed(@NonNull IObjectWrapper iObjectWrapper, long j3) throws RemoteException {
        zza();
        Application.ActivityLifecycleCallbacks zzaa = this.zza.zzp().zzaa();
        if (zzaa != null) {
            this.zza.zzp().zzao();
            zzaa.onActivityResumed((Activity) ObjectWrapper.unwrap(iObjectWrapper));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public void onActivitySaveInstanceState(IObjectWrapper iObjectWrapper, com.google.android.gms.internal.measurement.zzdo zzdoVar, long j3) throws RemoteException {
        zza();
        Application.ActivityLifecycleCallbacks zzaa = this.zza.zzp().zzaa();
        Bundle bundle = new Bundle();
        if (zzaa != null) {
            this.zza.zzp().zzao();
            zzaa.onActivitySaveInstanceState((Activity) ObjectWrapper.unwrap(iObjectWrapper), bundle);
        }
        try {
            zzdoVar.zza(bundle);
        } catch (RemoteException e2) {
            this.zza.zzj().zzu().zza("Error returning bundle value to wrapper", e2);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public void onActivityStarted(@NonNull IObjectWrapper iObjectWrapper, long j3) throws RemoteException {
        zza();
        Application.ActivityLifecycleCallbacks zzaa = this.zza.zzp().zzaa();
        if (zzaa != null) {
            this.zza.zzp().zzao();
            zzaa.onActivityStarted((Activity) ObjectWrapper.unwrap(iObjectWrapper));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public void onActivityStopped(@NonNull IObjectWrapper iObjectWrapper, long j3) throws RemoteException {
        zza();
        Application.ActivityLifecycleCallbacks zzaa = this.zza.zzp().zzaa();
        if (zzaa != null) {
            this.zza.zzp().zzao();
            zzaa.onActivityStopped((Activity) ObjectWrapper.unwrap(iObjectWrapper));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public void performAction(Bundle bundle, com.google.android.gms.internal.measurement.zzdo zzdoVar, long j3) throws RemoteException {
        zza();
        zzdoVar.zza(null);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public void registerOnMeasurementEventListener(com.google.android.gms.internal.measurement.zzdp zzdpVar) throws RemoteException {
        zzjl zzjlVar;
        zza();
        synchronized (this.zzb) {
            zzjlVar = this.zzb.get(Integer.valueOf(zzdpVar.zza()));
            if (zzjlVar == null) {
                zzjlVar = new zzb(zzdpVar);
                this.zzb.put(Integer.valueOf(zzdpVar.zza()), zzjlVar);
            }
        }
        this.zza.zzp().zza(zzjlVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public void resetAnalyticsData(long j3) throws RemoteException {
        zza();
        this.zza.zzp().zza(j3);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public void setConditionalUserProperty(@NonNull Bundle bundle, long j3) throws RemoteException {
        zza();
        if (bundle == null) {
            this.zza.zzj().zzg().zza("Conditional user property must not be null");
        } else {
            this.zza.zzp().zzb(bundle, j3);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public void setConsent(@NonNull Bundle bundle, long j3) throws RemoteException {
        zza();
        this.zza.zzp().zzc(bundle, j3);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public void setConsentThirdParty(@NonNull Bundle bundle, long j3) throws RemoteException {
        zza();
        this.zza.zzp().zzd(bundle, j3);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public void setCurrentScreen(@NonNull IObjectWrapper iObjectWrapper, @NonNull String str, @NonNull String str2, long j3) throws RemoteException {
        zza();
        this.zza.zzq().zza((Activity) ObjectWrapper.unwrap(iObjectWrapper), str, str2);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public void setDataCollectionEnabled(boolean z10) throws RemoteException {
        zza();
        this.zza.zzp().zzc(z10);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public void setDefaultEventParameters(@NonNull Bundle bundle) {
        zza();
        this.zza.zzp().zzc(bundle);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public void setEventInterceptor(com.google.android.gms.internal.measurement.zzdp zzdpVar) throws RemoteException {
        zza();
        zza zzaVar = new zza(zzdpVar);
        if (this.zza.zzl().zzg()) {
            this.zza.zzp().zza(zzaVar);
        } else {
            this.zza.zzl().zzb(new zzm(this, zzaVar));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public void setInstanceIdProvider(com.google.android.gms.internal.measurement.zzdu zzduVar) throws RemoteException {
        zza();
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public void setMeasurementEnabled(boolean z10, long j3) throws RemoteException {
        zza();
        this.zza.zzp().zza(Boolean.valueOf(z10));
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public void setMinimumSessionDuration(long j3) throws RemoteException {
        zza();
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public void setSessionTimeoutDuration(long j3) throws RemoteException {
        zza();
        this.zza.zzp().zzc(j3);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public void setSgtmDebugInfo(@NonNull Intent intent) throws RemoteException {
        zza();
        this.zza.zzp().zza(intent);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public void setUserId(@NonNull String str, long j3) throws RemoteException {
        zza();
        this.zza.zzp().zza(str, j3);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public void setUserProperty(@NonNull String str, @NonNull String str2, @NonNull IObjectWrapper iObjectWrapper, boolean z10, long j3) throws RemoteException {
        zza();
        this.zza.zzp().zza(str, str2, ObjectWrapper.unwrap(iObjectWrapper), z10, j3);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public void unregisterOnMeasurementEventListener(com.google.android.gms.internal.measurement.zzdp zzdpVar) throws RemoteException {
        zzjl remove;
        zza();
        synchronized (this.zzb) {
            remove = this.zzb.remove(Integer.valueOf(zzdpVar.zza()));
        }
        if (remove == null) {
            remove = new zzb(zzdpVar);
        }
        this.zza.zzp().zzb(remove);
    }

    private final void zza(com.google.android.gms.internal.measurement.zzdo zzdoVar, String str) {
        zza();
        this.zza.zzt().zza(zzdoVar, str);
    }
}
