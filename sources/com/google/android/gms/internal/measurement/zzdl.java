package com.google.android.gms.internal.measurement;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zzdl extends zzbu implements zzdj {
    public zzdl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public final void beginAdUnitExposure(String str, long j2) throws RemoteException {
        Parcel a_ = a_();
        a_.writeString(str);
        a_.writeLong(j2);
        zzb(23, a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) throws RemoteException {
        Parcel a_ = a_();
        a_.writeString(str);
        a_.writeString(str2);
        zzbw.zza(a_, bundle);
        zzb(9, a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public final void clearMeasurementEnabled(long j2) throws RemoteException {
        Parcel a_ = a_();
        a_.writeLong(j2);
        zzb(43, a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public final void endAdUnitExposure(String str, long j2) throws RemoteException {
        Parcel a_ = a_();
        a_.writeString(str);
        a_.writeLong(j2);
        zzb(24, a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public final void generateEventId(zzdo zzdoVar) throws RemoteException {
        Parcel a_ = a_();
        zzbw.zza(a_, zzdoVar);
        zzb(22, a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public final void getAppInstanceId(zzdo zzdoVar) throws RemoteException {
        Parcel a_ = a_();
        zzbw.zza(a_, zzdoVar);
        zzb(20, a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public final void getCachedAppInstanceId(zzdo zzdoVar) throws RemoteException {
        Parcel a_ = a_();
        zzbw.zza(a_, zzdoVar);
        zzb(19, a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public final void getConditionalUserProperties(String str, String str2, zzdo zzdoVar) throws RemoteException {
        Parcel a_ = a_();
        a_.writeString(str);
        a_.writeString(str2);
        zzbw.zza(a_, zzdoVar);
        zzb(10, a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public final void getCurrentScreenClass(zzdo zzdoVar) throws RemoteException {
        Parcel a_ = a_();
        zzbw.zza(a_, zzdoVar);
        zzb(17, a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public final void getCurrentScreenName(zzdo zzdoVar) throws RemoteException {
        Parcel a_ = a_();
        zzbw.zza(a_, zzdoVar);
        zzb(16, a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public final void getGmpAppId(zzdo zzdoVar) throws RemoteException {
        Parcel a_ = a_();
        zzbw.zza(a_, zzdoVar);
        zzb(21, a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public final void getMaxUserProperties(String str, zzdo zzdoVar) throws RemoteException {
        Parcel a_ = a_();
        a_.writeString(str);
        zzbw.zza(a_, zzdoVar);
        zzb(6, a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public final void getSessionId(zzdo zzdoVar) throws RemoteException {
        Parcel a_ = a_();
        zzbw.zza(a_, zzdoVar);
        zzb(46, a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public final void getTestFlag(zzdo zzdoVar, int i2) throws RemoteException {
        Parcel a_ = a_();
        zzbw.zza(a_, zzdoVar);
        a_.writeInt(i2);
        zzb(38, a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public final void getUserProperties(String str, String str2, boolean z2, zzdo zzdoVar) throws RemoteException {
        Parcel a_ = a_();
        a_.writeString(str);
        a_.writeString(str2);
        zzbw.zza(a_, z2);
        zzbw.zza(a_, zzdoVar);
        zzb(5, a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public final void initForTests(Map map) throws RemoteException {
        Parcel a_ = a_();
        a_.writeMap(map);
        zzb(37, a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public final void initialize(IObjectWrapper iObjectWrapper, zzdw zzdwVar, long j2) throws RemoteException {
        Parcel a_ = a_();
        zzbw.zza(a_, iObjectWrapper);
        zzbw.zza(a_, zzdwVar);
        a_.writeLong(j2);
        zzb(1, a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public final void isDataCollectionEnabled(zzdo zzdoVar) throws RemoteException {
        Parcel a_ = a_();
        zzbw.zza(a_, zzdoVar);
        zzb(40, a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public final void logEvent(String str, String str2, Bundle bundle, boolean z2, boolean z3, long j2) throws RemoteException {
        Parcel a_ = a_();
        a_.writeString(str);
        a_.writeString(str2);
        zzbw.zza(a_, bundle);
        zzbw.zza(a_, z2);
        zzbw.zza(a_, z3);
        a_.writeLong(j2);
        zzb(2, a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public final void logEventAndBundle(String str, String str2, Bundle bundle, zzdo zzdoVar, long j2) throws RemoteException {
        Parcel a_ = a_();
        a_.writeString(str);
        a_.writeString(str2);
        zzbw.zza(a_, bundle);
        zzbw.zza(a_, zzdoVar);
        a_.writeLong(j2);
        zzb(3, a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public final void logHealthData(int i2, String str, IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) throws RemoteException {
        Parcel a_ = a_();
        a_.writeInt(i2);
        a_.writeString(str);
        zzbw.zza(a_, iObjectWrapper);
        zzbw.zza(a_, iObjectWrapper2);
        zzbw.zza(a_, iObjectWrapper3);
        zzb(33, a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public final void onActivityCreated(IObjectWrapper iObjectWrapper, Bundle bundle, long j2) throws RemoteException {
        Parcel a_ = a_();
        zzbw.zza(a_, iObjectWrapper);
        zzbw.zza(a_, bundle);
        a_.writeLong(j2);
        zzb(27, a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public final void onActivityDestroyed(IObjectWrapper iObjectWrapper, long j2) throws RemoteException {
        Parcel a_ = a_();
        zzbw.zza(a_, iObjectWrapper);
        a_.writeLong(j2);
        zzb(28, a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public final void onActivityPaused(IObjectWrapper iObjectWrapper, long j2) throws RemoteException {
        Parcel a_ = a_();
        zzbw.zza(a_, iObjectWrapper);
        a_.writeLong(j2);
        zzb(29, a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public final void onActivityResumed(IObjectWrapper iObjectWrapper, long j2) throws RemoteException {
        Parcel a_ = a_();
        zzbw.zza(a_, iObjectWrapper);
        a_.writeLong(j2);
        zzb(30, a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public final void onActivitySaveInstanceState(IObjectWrapper iObjectWrapper, zzdo zzdoVar, long j2) throws RemoteException {
        Parcel a_ = a_();
        zzbw.zza(a_, iObjectWrapper);
        zzbw.zza(a_, zzdoVar);
        a_.writeLong(j2);
        zzb(31, a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public final void onActivityStarted(IObjectWrapper iObjectWrapper, long j2) throws RemoteException {
        Parcel a_ = a_();
        zzbw.zza(a_, iObjectWrapper);
        a_.writeLong(j2);
        zzb(25, a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public final void onActivityStopped(IObjectWrapper iObjectWrapper, long j2) throws RemoteException {
        Parcel a_ = a_();
        zzbw.zza(a_, iObjectWrapper);
        a_.writeLong(j2);
        zzb(26, a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public final void performAction(Bundle bundle, zzdo zzdoVar, long j2) throws RemoteException {
        Parcel a_ = a_();
        zzbw.zza(a_, bundle);
        zzbw.zza(a_, zzdoVar);
        a_.writeLong(j2);
        zzb(32, a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public final void registerOnMeasurementEventListener(zzdp zzdpVar) throws RemoteException {
        Parcel a_ = a_();
        zzbw.zza(a_, zzdpVar);
        zzb(35, a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public final void resetAnalyticsData(long j2) throws RemoteException {
        Parcel a_ = a_();
        a_.writeLong(j2);
        zzb(12, a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public final void setConditionalUserProperty(Bundle bundle, long j2) throws RemoteException {
        Parcel a_ = a_();
        zzbw.zza(a_, bundle);
        a_.writeLong(j2);
        zzb(8, a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public final void setConsent(Bundle bundle, long j2) throws RemoteException {
        Parcel a_ = a_();
        zzbw.zza(a_, bundle);
        a_.writeLong(j2);
        zzb(44, a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public final void setConsentThirdParty(Bundle bundle, long j2) throws RemoteException {
        Parcel a_ = a_();
        zzbw.zza(a_, bundle);
        a_.writeLong(j2);
        zzb(45, a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public final void setCurrentScreen(IObjectWrapper iObjectWrapper, String str, String str2, long j2) throws RemoteException {
        Parcel a_ = a_();
        zzbw.zza(a_, iObjectWrapper);
        a_.writeString(str);
        a_.writeString(str2);
        a_.writeLong(j2);
        zzb(15, a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public final void setDataCollectionEnabled(boolean z2) throws RemoteException {
        Parcel a_ = a_();
        zzbw.zza(a_, z2);
        zzb(39, a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public final void setDefaultEventParameters(Bundle bundle) throws RemoteException {
        Parcel a_ = a_();
        zzbw.zza(a_, bundle);
        zzb(42, a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public final void setEventInterceptor(zzdp zzdpVar) throws RemoteException {
        Parcel a_ = a_();
        zzbw.zza(a_, zzdpVar);
        zzb(34, a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public final void setInstanceIdProvider(zzdu zzduVar) throws RemoteException {
        Parcel a_ = a_();
        zzbw.zza(a_, zzduVar);
        zzb(18, a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public final void setMeasurementEnabled(boolean z2, long j2) throws RemoteException {
        Parcel a_ = a_();
        zzbw.zza(a_, z2);
        a_.writeLong(j2);
        zzb(11, a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public final void setMinimumSessionDuration(long j2) throws RemoteException {
        Parcel a_ = a_();
        a_.writeLong(j2);
        zzb(13, a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public final void setSessionTimeoutDuration(long j2) throws RemoteException {
        Parcel a_ = a_();
        a_.writeLong(j2);
        zzb(14, a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public final void setSgtmDebugInfo(Intent intent) throws RemoteException {
        Parcel a_ = a_();
        zzbw.zza(a_, intent);
        zzb(48, a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public final void setUserId(String str, long j2) throws RemoteException {
        Parcel a_ = a_();
        a_.writeString(str);
        a_.writeLong(j2);
        zzb(7, a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public final void setUserProperty(String str, String str2, IObjectWrapper iObjectWrapper, boolean z2, long j2) throws RemoteException {
        Parcel a_ = a_();
        a_.writeString(str);
        a_.writeString(str2);
        zzbw.zza(a_, iObjectWrapper);
        zzbw.zza(a_, z2);
        a_.writeLong(j2);
        zzb(4, a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public final void unregisterOnMeasurementEventListener(zzdp zzdpVar) throws RemoteException {
        Parcel a_ = a_();
        zzbw.zza(a_, zzdpVar);
        zzb(36, a_);
    }
}
