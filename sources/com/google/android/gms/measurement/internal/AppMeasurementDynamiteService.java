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
import x.l;

@DynamiteApi
/* loaded from: classes2.dex */
public class AppMeasurementDynamiteService extends com.google.android.gms.internal.measurement.zzde {
    zzhj zza = null;
    private final Map<Integer, zziu> zzb = new l();

    /* loaded from: classes2.dex */
    public class zza implements zziu {
        private com.google.android.gms.internal.measurement.zzdh zza;

        public zza(com.google.android.gms.internal.measurement.zzdh zzdhVar) {
            this.zza = zzdhVar;
        }

        @Override // com.google.android.gms.measurement.internal.zziu
        public final void onEvent(String str, String str2, Bundle bundle, long j7) {
            try {
                this.zza.zza(str, str2, bundle, j7);
            } catch (RemoteException e4) {
                zzhj zzhjVar = AppMeasurementDynamiteService.this.zza;
                if (zzhjVar != null) {
                    zzhjVar.zzj().zzu().zza("Event listener threw exception", e4);
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    public class zzb implements zzir {
        private com.google.android.gms.internal.measurement.zzdh zza;

        public zzb(com.google.android.gms.internal.measurement.zzdh zzdhVar) {
            this.zza = zzdhVar;
        }

        @Override // com.google.android.gms.measurement.internal.zzir
        public final void interceptEvent(String str, String str2, Bundle bundle, long j7) {
            try {
                this.zza.zza(str, str2, bundle, j7);
            } catch (RemoteException e4) {
                zzhj zzhjVar = AppMeasurementDynamiteService.this.zza;
                if (zzhjVar != null) {
                    zzhjVar.zzj().zzu().zza("Event interceptor threw exception", e4);
                }
            }
        }
    }

    private final void zza() {
        if (this.zza == null) {
            throw new IllegalStateException("Attempting to perform action before initialize.");
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public void beginAdUnitExposure(@NonNull String str, long j7) throws RemoteException {
        zza();
        this.zza.zze().zza(str, j7);
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public void clearConditionalUserProperty(@NonNull String str, @NonNull String str2, @NonNull Bundle bundle) throws RemoteException {
        zza();
        this.zza.zzp().zza(str, str2, bundle);
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public void clearMeasurementEnabled(long j7) throws RemoteException {
        zza();
        this.zza.zzp().zza((Boolean) null);
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public void endAdUnitExposure(@NonNull String str, long j7) throws RemoteException {
        zza();
        this.zza.zze().zzb(str, j7);
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public void generateEventId(com.google.android.gms.internal.measurement.zzdg zzdgVar) throws RemoteException {
        zza();
        long zzm = this.zza.zzt().zzm();
        zza();
        this.zza.zzt().zza(zzdgVar, zzm);
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public void getAppInstanceId(com.google.android.gms.internal.measurement.zzdg zzdgVar) throws RemoteException {
        zza();
        this.zza.zzl().zzb(new zzi(this, zzdgVar));
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public void getCachedAppInstanceId(com.google.android.gms.internal.measurement.zzdg zzdgVar) throws RemoteException {
        zza();
        zza(zzdgVar, this.zza.zzp().zzag());
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public void getConditionalUserProperties(String str, String str2, com.google.android.gms.internal.measurement.zzdg zzdgVar) throws RemoteException {
        zza();
        this.zza.zzl().zzb(new zzm(this, zzdgVar, str, str2));
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public void getCurrentScreenClass(com.google.android.gms.internal.measurement.zzdg zzdgVar) throws RemoteException {
        zza();
        zza(zzdgVar, this.zza.zzp().zzah());
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public void getCurrentScreenName(com.google.android.gms.internal.measurement.zzdg zzdgVar) throws RemoteException {
        zza();
        zza(zzdgVar, this.zza.zzp().zzai());
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public void getGmpAppId(com.google.android.gms.internal.measurement.zzdg zzdgVar) throws RemoteException {
        zza();
        zza(zzdgVar, this.zza.zzp().zzaj());
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public void getMaxUserProperties(String str, com.google.android.gms.internal.measurement.zzdg zzdgVar) throws RemoteException {
        zza();
        this.zza.zzp();
        zziv.zza(str);
        zza();
        this.zza.zzt().zza(zzdgVar, 25);
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public void getSessionId(com.google.android.gms.internal.measurement.zzdg zzdgVar) throws RemoteException {
        zza();
        this.zza.zzp().zza(zzdgVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public void getTestFlag(com.google.android.gms.internal.measurement.zzdg zzdgVar, int i9) throws RemoteException {
        zza();
        if (i9 != 0) {
            if (i9 != 1) {
                if (i9 != 2) {
                    if (i9 != 3) {
                        if (i9 == 4) {
                            this.zza.zzt().zza(zzdgVar, this.zza.zzp().zzac().booleanValue());
                            return;
                        }
                        return;
                    }
                    this.zza.zzt().zza(zzdgVar, this.zza.zzp().zzae().intValue());
                    return;
                }
                zznp zzt = this.zza.zzt();
                double doubleValue = this.zza.zzp().zzad().doubleValue();
                Bundle bundle = new Bundle();
                bundle.putDouble(CampaignEx.JSON_KEY_AD_R, doubleValue);
                try {
                    zzdgVar.zza(bundle);
                    return;
                } catch (RemoteException e4) {
                    zzt.zzu.zzj().zzu().zza("Error returning double value to wrapper", e4);
                    return;
                }
            }
            this.zza.zzt().zza(zzdgVar, this.zza.zzp().zzaf().longValue());
            return;
        }
        this.zza.zzt().zza(zzdgVar, this.zza.zzp().zzak());
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public void getUserProperties(String str, String str2, boolean z8, com.google.android.gms.internal.measurement.zzdg zzdgVar) throws RemoteException {
        zza();
        this.zza.zzl().zzb(new zzk(this, zzdgVar, str, str2, z8));
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public void initForTests(@NonNull Map map) throws RemoteException {
        zza();
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public void initialize(IObjectWrapper iObjectWrapper, com.google.android.gms.internal.measurement.zzdo zzdoVar, long j7) throws RemoteException {
        zzhj zzhjVar = this.zza;
        if (zzhjVar == null) {
            this.zza = zzhj.zza((Context) Preconditions.checkNotNull((Context) ObjectWrapper.unwrap(iObjectWrapper)), zzdoVar, Long.valueOf(j7));
        } else {
            zzhjVar.zzj().zzu().zza("Attempting to initialize multiple times");
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public void isDataCollectionEnabled(com.google.android.gms.internal.measurement.zzdg zzdgVar) throws RemoteException {
        zza();
        this.zza.zzl().zzb(new zzl(this, zzdgVar));
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public void logEvent(@NonNull String str, @NonNull String str2, @NonNull Bundle bundle, boolean z8, boolean z9, long j7) throws RemoteException {
        zza();
        this.zza.zzp().zza(str, str2, bundle, z8, z9, j7);
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public void logEventAndBundle(String str, String str2, Bundle bundle, com.google.android.gms.internal.measurement.zzdg zzdgVar, long j7) throws RemoteException {
        Bundle bundle2;
        zza();
        Preconditions.checkNotEmpty(str2);
        if (bundle != null) {
            bundle2 = new Bundle(bundle);
        } else {
            bundle2 = new Bundle();
        }
        bundle2.putString("_o", MBridgeConstans.DYNAMIC_VIEW_WX_APP);
        this.zza.zzl().zzb(new zzh(this, zzdgVar, new zzbd(str2, new zzbc(bundle), MBridgeConstans.DYNAMIC_VIEW_WX_APP, j7), str));
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public void logHealthData(int i9, @NonNull String str, @NonNull IObjectWrapper iObjectWrapper, @NonNull IObjectWrapper iObjectWrapper2, @NonNull IObjectWrapper iObjectWrapper3) throws RemoteException {
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
        this.zza.zzj().zza(i9, true, false, str, unwrap, unwrap2, obj);
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public void onActivityCreated(@NonNull IObjectWrapper iObjectWrapper, @NonNull Bundle bundle, long j7) throws RemoteException {
        zza();
        Application.ActivityLifecycleCallbacks zzaa = this.zza.zzp().zzaa();
        if (zzaa != null) {
            this.zza.zzp().zzan();
            zzaa.onActivityCreated((Activity) ObjectWrapper.unwrap(iObjectWrapper), bundle);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public void onActivityDestroyed(@NonNull IObjectWrapper iObjectWrapper, long j7) throws RemoteException {
        zza();
        Application.ActivityLifecycleCallbacks zzaa = this.zza.zzp().zzaa();
        if (zzaa != null) {
            this.zza.zzp().zzan();
            zzaa.onActivityDestroyed((Activity) ObjectWrapper.unwrap(iObjectWrapper));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public void onActivityPaused(@NonNull IObjectWrapper iObjectWrapper, long j7) throws RemoteException {
        zza();
        Application.ActivityLifecycleCallbacks zzaa = this.zza.zzp().zzaa();
        if (zzaa != null) {
            this.zza.zzp().zzan();
            zzaa.onActivityPaused((Activity) ObjectWrapper.unwrap(iObjectWrapper));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public void onActivityResumed(@NonNull IObjectWrapper iObjectWrapper, long j7) throws RemoteException {
        zza();
        Application.ActivityLifecycleCallbacks zzaa = this.zza.zzp().zzaa();
        if (zzaa != null) {
            this.zza.zzp().zzan();
            zzaa.onActivityResumed((Activity) ObjectWrapper.unwrap(iObjectWrapper));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public void onActivitySaveInstanceState(IObjectWrapper iObjectWrapper, com.google.android.gms.internal.measurement.zzdg zzdgVar, long j7) throws RemoteException {
        zza();
        Application.ActivityLifecycleCallbacks zzaa = this.zza.zzp().zzaa();
        Bundle bundle = new Bundle();
        if (zzaa != null) {
            this.zza.zzp().zzan();
            zzaa.onActivitySaveInstanceState((Activity) ObjectWrapper.unwrap(iObjectWrapper), bundle);
        }
        try {
            zzdgVar.zza(bundle);
        } catch (RemoteException e4) {
            this.zza.zzj().zzu().zza("Error returning bundle value to wrapper", e4);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public void onActivityStarted(@NonNull IObjectWrapper iObjectWrapper, long j7) throws RemoteException {
        zza();
        Application.ActivityLifecycleCallbacks zzaa = this.zza.zzp().zzaa();
        if (zzaa != null) {
            this.zza.zzp().zzan();
            zzaa.onActivityStarted((Activity) ObjectWrapper.unwrap(iObjectWrapper));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public void onActivityStopped(@NonNull IObjectWrapper iObjectWrapper, long j7) throws RemoteException {
        zza();
        Application.ActivityLifecycleCallbacks zzaa = this.zza.zzp().zzaa();
        if (zzaa != null) {
            this.zza.zzp().zzan();
            zzaa.onActivityStopped((Activity) ObjectWrapper.unwrap(iObjectWrapper));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public void performAction(Bundle bundle, com.google.android.gms.internal.measurement.zzdg zzdgVar, long j7) throws RemoteException {
        zza();
        zzdgVar.zza(null);
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public void registerOnMeasurementEventListener(com.google.android.gms.internal.measurement.zzdh zzdhVar) throws RemoteException {
        zziu zziuVar;
        zza();
        synchronized (this.zzb) {
            try {
                zziuVar = this.zzb.get(Integer.valueOf(zzdhVar.zza()));
                if (zziuVar == null) {
                    zziuVar = new zza(zzdhVar);
                    this.zzb.put(Integer.valueOf(zzdhVar.zza()), zziuVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.zza.zzp().zza(zziuVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public void resetAnalyticsData(long j7) throws RemoteException {
        zza();
        this.zza.zzp().zza(j7);
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public void setConditionalUserProperty(@NonNull Bundle bundle, long j7) throws RemoteException {
        zza();
        if (bundle == null) {
            this.zza.zzj().zzg().zza("Conditional user property must not be null");
        } else {
            this.zza.zzp().zzb(bundle, j7);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public void setConsent(@NonNull Bundle bundle, long j7) throws RemoteException {
        zza();
        this.zza.zzp().zzc(bundle, j7);
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public void setConsentThirdParty(@NonNull Bundle bundle, long j7) throws RemoteException {
        zza();
        this.zza.zzp().zzd(bundle, j7);
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public void setCurrentScreen(@NonNull IObjectWrapper iObjectWrapper, @NonNull String str, @NonNull String str2, long j7) throws RemoteException {
        zza();
        this.zza.zzq().zza((Activity) ObjectWrapper.unwrap(iObjectWrapper), str, str2);
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public void setDataCollectionEnabled(boolean z8) throws RemoteException {
        zza();
        this.zza.zzp().zzc(z8);
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public void setDefaultEventParameters(@NonNull Bundle bundle) {
        zza();
        this.zza.zzp().zzc(bundle);
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public void setEventInterceptor(com.google.android.gms.internal.measurement.zzdh zzdhVar) throws RemoteException {
        zza();
        zzb zzbVar = new zzb(zzdhVar);
        if (this.zza.zzl().zzg()) {
            this.zza.zzp().zza(zzbVar);
        } else {
            this.zza.zzl().zzb(new zzj(this, zzbVar));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public void setInstanceIdProvider(com.google.android.gms.internal.measurement.zzdm zzdmVar) throws RemoteException {
        zza();
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public void setMeasurementEnabled(boolean z8, long j7) throws RemoteException {
        zza();
        this.zza.zzp().zza(Boolean.valueOf(z8));
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public void setMinimumSessionDuration(long j7) throws RemoteException {
        zza();
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public void setSessionTimeoutDuration(long j7) throws RemoteException {
        zza();
        this.zza.zzp().zzc(j7);
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public void setSgtmDebugInfo(@NonNull Intent intent) throws RemoteException {
        zza();
        this.zza.zzp().zza(intent);
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public void setUserId(@NonNull String str, long j7) throws RemoteException {
        zza();
        this.zza.zzp().zza(str, j7);
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public void setUserProperty(@NonNull String str, @NonNull String str2, @NonNull IObjectWrapper iObjectWrapper, boolean z8, long j7) throws RemoteException {
        zza();
        this.zza.zzp().zza(str, str2, ObjectWrapper.unwrap(iObjectWrapper), z8, j7);
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public void unregisterOnMeasurementEventListener(com.google.android.gms.internal.measurement.zzdh zzdhVar) throws RemoteException {
        zziu remove;
        zza();
        synchronized (this.zzb) {
            remove = this.zzb.remove(Integer.valueOf(zzdhVar.zza()));
        }
        if (remove == null) {
            remove = new zza(zzdhVar);
        }
        this.zza.zzp().zzb(remove);
    }

    private final void zza(com.google.android.gms.internal.measurement.zzdg zzdgVar, String str) {
        zza();
        this.zza.zzt().zza(zzdgVar, str);
    }
}
