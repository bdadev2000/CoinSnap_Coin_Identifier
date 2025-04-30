package com.google.android.gms.measurement;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresPermission;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.internal.measurement.zzdo;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.measurement.internal.zzhj;
import com.google.android.gms.measurement.internal.zzik;
import com.google.android.gms.measurement.internal.zzir;
import com.google.android.gms.measurement.internal.zziu;
import com.google.android.gms.measurement.internal.zzkk;
import com.google.android.gms.measurement.internal.zzkq;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.mbridge.msdk.MBridgeConstans;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@ShowFirstParty
@KeepForSdk
@Deprecated
/* loaded from: classes2.dex */
public class AppMeasurement {

    @NonNull
    @ShowFirstParty
    @KeepForSdk
    public static final String CRASH_ORIGIN = "crash";

    @NonNull
    @ShowFirstParty
    @KeepForSdk
    public static final String FCM_ORIGIN = "fcm";

    @NonNull
    @ShowFirstParty
    @KeepForSdk
    public static final String FIAM_ORIGIN = "fiam";
    private static volatile AppMeasurement zza;
    private final zza zzb;

    @ShowFirstParty
    @KeepForSdk
    /* loaded from: classes2.dex */
    public static class ConditionalUserProperty {

        @ShowFirstParty
        @Keep
        @KeepForSdk
        public boolean mActive;

        @NonNull
        @Keep
        @ShowFirstParty
        @KeepForSdk
        public String mAppId;

        @ShowFirstParty
        @Keep
        @KeepForSdk
        public long mCreationTimestamp;

        @NonNull
        @Keep
        public String mExpiredEventName;

        @NonNull
        @Keep
        public Bundle mExpiredEventParams;

        @NonNull
        @Keep
        @ShowFirstParty
        @KeepForSdk
        public String mName;

        @NonNull
        @Keep
        @ShowFirstParty
        @KeepForSdk
        public String mOrigin;

        @ShowFirstParty
        @Keep
        @KeepForSdk
        public long mTimeToLive;

        @NonNull
        @Keep
        public String mTimedOutEventName;

        @NonNull
        @Keep
        public Bundle mTimedOutEventParams;

        @NonNull
        @Keep
        @ShowFirstParty
        @KeepForSdk
        public String mTriggerEventName;

        @ShowFirstParty
        @Keep
        @KeepForSdk
        public long mTriggerTimeout;

        @NonNull
        @Keep
        public String mTriggeredEventName;

        @NonNull
        @Keep
        public Bundle mTriggeredEventParams;

        @ShowFirstParty
        @Keep
        @KeepForSdk
        public long mTriggeredTimestamp;

        @NonNull
        @Keep
        @ShowFirstParty
        @KeepForSdk
        public Object mValue;

        @KeepForSdk
        public ConditionalUserProperty() {
        }

        public ConditionalUserProperty(@NonNull Bundle bundle) {
            Preconditions.checkNotNull(bundle);
            this.mAppId = (String) zzik.zza(bundle, MBridgeConstans.APP_ID, String.class, null);
            this.mOrigin = (String) zzik.zza(bundle, "origin", String.class, null);
            this.mName = (String) zzik.zza(bundle, "name", String.class, null);
            this.mValue = zzik.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.VALUE, Object.class, null);
            this.mTriggerEventName = (String) zzik.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, String.class, null);
            this.mTriggerTimeout = ((Long) zzik.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, Long.class, 0L)).longValue();
            this.mTimedOutEventName = (String) zzik.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_NAME, String.class, null);
            this.mTimedOutEventParams = (Bundle) zzik.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_PARAMS, Bundle.class, null);
            this.mTriggeredEventName = (String) zzik.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_NAME, String.class, null);
            this.mTriggeredEventParams = (Bundle) zzik.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_PARAMS, Bundle.class, null);
            this.mTimeToLive = ((Long) zzik.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, Long.class, 0L)).longValue();
            this.mExpiredEventName = (String) zzik.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, String.class, null);
            this.mExpiredEventParams = (Bundle) zzik.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, Bundle.class, null);
            this.mActive = ((Boolean) zzik.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.ACTIVE, Boolean.class, Boolean.FALSE)).booleanValue();
            this.mCreationTimestamp = ((Long) zzik.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, Long.class, 0L)).longValue();
            this.mTriggeredTimestamp = ((Long) zzik.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, Long.class, 0L)).longValue();
        }

        @KeepForSdk
        public ConditionalUserProperty(@NonNull ConditionalUserProperty conditionalUserProperty) {
            Preconditions.checkNotNull(conditionalUserProperty);
            this.mAppId = conditionalUserProperty.mAppId;
            this.mOrigin = conditionalUserProperty.mOrigin;
            this.mCreationTimestamp = conditionalUserProperty.mCreationTimestamp;
            this.mName = conditionalUserProperty.mName;
            Object obj = conditionalUserProperty.mValue;
            if (obj != null) {
                Object zza = zzkq.zza(obj);
                this.mValue = zza;
                if (zza == null) {
                    this.mValue = conditionalUserProperty.mValue;
                }
            }
            this.mActive = conditionalUserProperty.mActive;
            this.mTriggerEventName = conditionalUserProperty.mTriggerEventName;
            this.mTriggerTimeout = conditionalUserProperty.mTriggerTimeout;
            this.mTimedOutEventName = conditionalUserProperty.mTimedOutEventName;
            if (conditionalUserProperty.mTimedOutEventParams != null) {
                this.mTimedOutEventParams = new Bundle(conditionalUserProperty.mTimedOutEventParams);
            }
            this.mTriggeredEventName = conditionalUserProperty.mTriggeredEventName;
            if (conditionalUserProperty.mTriggeredEventParams != null) {
                this.mTriggeredEventParams = new Bundle(conditionalUserProperty.mTriggeredEventParams);
            }
            this.mTriggeredTimestamp = conditionalUserProperty.mTriggeredTimestamp;
            this.mTimeToLive = conditionalUserProperty.mTimeToLive;
            this.mExpiredEventName = conditionalUserProperty.mExpiredEventName;
            if (conditionalUserProperty.mExpiredEventParams != null) {
                this.mExpiredEventParams = new Bundle(conditionalUserProperty.mExpiredEventParams);
            }
        }
    }

    @ShowFirstParty
    @KeepForSdk
    /* loaded from: classes2.dex */
    public interface EventInterceptor extends zzir {
        @Override // com.google.android.gms.measurement.internal.zzir
        @ShowFirstParty
        @KeepForSdk
        void interceptEvent(@NonNull String str, @NonNull String str2, @NonNull Bundle bundle, long j7);
    }

    @ShowFirstParty
    @KeepForSdk
    /* loaded from: classes2.dex */
    public interface OnEventListener extends zziu {
        @Override // com.google.android.gms.measurement.internal.zziu
        @ShowFirstParty
        @KeepForSdk
        void onEvent(@NonNull String str, @NonNull String str2, @NonNull Bundle bundle, long j7);
    }

    /* loaded from: classes2.dex */
    public static abstract class zza implements zzkk {
        private zza() {
        }

        public abstract Boolean zza();

        public abstract Map<String, Object> zza(boolean z8);

        public abstract Double zzb();

        public abstract Integer zzc();

        public abstract Long zzd();

        public abstract String zze();
    }

    private AppMeasurement(zzhj zzhjVar) {
        this.zzb = new zzb(zzhjVar);
    }

    @NonNull
    @Keep
    @Deprecated
    @RequiresPermission(allOf = {"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE", "android.permission.WAKE_LOCK"})
    @ShowFirstParty
    @KeepForSdk
    public static AppMeasurement getInstance(@NonNull Context context) {
        return zza(context, null, null);
    }

    private static AppMeasurement zza(Context context, String str, String str2) {
        if (zza == null) {
            synchronized (AppMeasurement.class) {
                try {
                    if (zza == null) {
                        zzkk zza2 = zza(context, null);
                        if (zza2 != null) {
                            zza = new AppMeasurement(zza2);
                        } else {
                            zza = new AppMeasurement(zzhj.zza(context, new zzdo(0L, 0L, true, null, null, null, null, null), null));
                        }
                    }
                } finally {
                }
            }
        }
        return zza;
    }

    @Keep
    public void beginAdUnitExposure(@NonNull String str) {
        this.zzb.zzb(str);
    }

    @ShowFirstParty
    @Keep
    @KeepForSdk
    public void clearConditionalUserProperty(@NonNull String str, @NonNull String str2, @NonNull Bundle bundle) {
        this.zzb.zza(str, str2, bundle);
    }

    @Keep
    public void endAdUnitExposure(@NonNull String str) {
        this.zzb.zzc(str);
    }

    @Keep
    public long generateEventId() {
        return this.zzb.zzf();
    }

    @NonNull
    @Keep
    public String getAppInstanceId() {
        return this.zzb.zzg();
    }

    @NonNull
    @KeepForSdk
    public Boolean getBoolean() {
        return this.zzb.zza();
    }

    @NonNull
    @Keep
    @ShowFirstParty
    @KeepForSdk
    public List<ConditionalUserProperty> getConditionalUserProperties(@NonNull String str, @NonNull String str2) {
        int size;
        List<Bundle> zza2 = this.zzb.zza(str, str2);
        if (zza2 == null) {
            size = 0;
        } else {
            size = zza2.size();
        }
        ArrayList arrayList = new ArrayList(size);
        Iterator<Bundle> it = zza2.iterator();
        while (it.hasNext()) {
            arrayList.add(new ConditionalUserProperty(it.next()));
        }
        return arrayList;
    }

    @NonNull
    @Keep
    public String getCurrentScreenClass() {
        return this.zzb.zzh();
    }

    @NonNull
    @Keep
    public String getCurrentScreenName() {
        return this.zzb.zzi();
    }

    @NonNull
    @KeepForSdk
    public Double getDouble() {
        return this.zzb.zzb();
    }

    @NonNull
    @Keep
    public String getGmpAppId() {
        return this.zzb.zzj();
    }

    @NonNull
    @KeepForSdk
    public Integer getInteger() {
        return this.zzb.zzc();
    }

    @NonNull
    @KeepForSdk
    public Long getLong() {
        return this.zzb.zzd();
    }

    @ShowFirstParty
    @Keep
    @KeepForSdk
    public int getMaxUserProperties(@NonNull String str) {
        return this.zzb.zza(str);
    }

    @NonNull
    @KeepForSdk
    public String getString() {
        return this.zzb.zze();
    }

    @NonNull
    @ShowFirstParty
    @KeepForSdk
    public Map<String, Object> getUserProperties(boolean z8) {
        return this.zzb.zza(z8);
    }

    @ShowFirstParty
    @Keep
    public void logEventInternal(@NonNull String str, @NonNull String str2, @NonNull Bundle bundle) {
        this.zzb.zzb(str, str2, bundle);
    }

    @ShowFirstParty
    @KeepForSdk
    public void logEventInternalNoInterceptor(@NonNull String str, @NonNull String str2, @NonNull Bundle bundle, long j7) {
        this.zzb.zza(str, str2, bundle, j7);
    }

    @ShowFirstParty
    @KeepForSdk
    public void registerOnMeasurementEventListener(@NonNull OnEventListener onEventListener) {
        this.zzb.zza(onEventListener);
    }

    @ShowFirstParty
    @Keep
    @KeepForSdk
    public void setConditionalUserProperty(@NonNull ConditionalUserProperty conditionalUserProperty) {
        Preconditions.checkNotNull(conditionalUserProperty);
        zza zzaVar = this.zzb;
        Bundle bundle = new Bundle();
        String str = conditionalUserProperty.mAppId;
        if (str != null) {
            bundle.putString(MBridgeConstans.APP_ID, str);
        }
        String str2 = conditionalUserProperty.mOrigin;
        if (str2 != null) {
            bundle.putString("origin", str2);
        }
        String str3 = conditionalUserProperty.mName;
        if (str3 != null) {
            bundle.putString("name", str3);
        }
        Object obj = conditionalUserProperty.mValue;
        if (obj != null) {
            zzik.zza(bundle, obj);
        }
        String str4 = conditionalUserProperty.mTriggerEventName;
        if (str4 != null) {
            bundle.putString(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, str4);
        }
        bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, conditionalUserProperty.mTriggerTimeout);
        String str5 = conditionalUserProperty.mTimedOutEventName;
        if (str5 != null) {
            bundle.putString(AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_NAME, str5);
        }
        Bundle bundle2 = conditionalUserProperty.mTimedOutEventParams;
        if (bundle2 != null) {
            bundle.putBundle(AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_PARAMS, bundle2);
        }
        String str6 = conditionalUserProperty.mTriggeredEventName;
        if (str6 != null) {
            bundle.putString(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_NAME, str6);
        }
        Bundle bundle3 = conditionalUserProperty.mTriggeredEventParams;
        if (bundle3 != null) {
            bundle.putBundle(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_PARAMS, bundle3);
        }
        bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, conditionalUserProperty.mTimeToLive);
        String str7 = conditionalUserProperty.mExpiredEventName;
        if (str7 != null) {
            bundle.putString(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, str7);
        }
        Bundle bundle4 = conditionalUserProperty.mExpiredEventParams;
        if (bundle4 != null) {
            bundle.putBundle(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, bundle4);
        }
        bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, conditionalUserProperty.mCreationTimestamp);
        bundle.putBoolean(AppMeasurementSdk.ConditionalUserProperty.ACTIVE, conditionalUserProperty.mActive);
        bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, conditionalUserProperty.mTriggeredTimestamp);
        zzaVar.zza(bundle);
    }

    @ShowFirstParty
    @KeepForSdk
    public void setEventInterceptor(@NonNull EventInterceptor eventInterceptor) {
        this.zzb.zza(eventInterceptor);
    }

    @ShowFirstParty
    @KeepForSdk
    public void unregisterOnMeasurementEventListener(@NonNull OnEventListener onEventListener) {
        this.zzb.zzb(onEventListener);
    }

    @NonNull
    @Keep
    public Map<String, Object> getUserProperties(@NonNull String str, @NonNull String str2, boolean z8) {
        return this.zzb.zza(str, str2, z8);
    }

    private AppMeasurement(zzkk zzkkVar) {
        this.zzb = new com.google.android.gms.measurement.zza(zzkkVar);
    }

    private static zzkk zza(Context context, Bundle bundle) {
        return (zzkk) FirebaseAnalytics.class.getDeclaredMethod("getScionFrontendApiImplementation", Context.class, Bundle.class).invoke(null, context, null);
    }
}
