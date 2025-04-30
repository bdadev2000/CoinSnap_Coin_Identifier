package com.google.android.gms.internal.measurement;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzdd extends zzbu implements zzdb {
    public zzdd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public final void beginAdUnitExposure(String str, long j7) throws RemoteException {
        Parcel a_ = a_();
        a_.writeString(str);
        a_.writeLong(j7);
        zzb(23, a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) throws RemoteException {
        Parcel a_ = a_();
        a_.writeString(str);
        a_.writeString(str2);
        zzbw.zza(a_, bundle);
        zzb(9, a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public final void clearMeasurementEnabled(long j7) throws RemoteException {
        Parcel a_ = a_();
        a_.writeLong(j7);
        zzb(43, a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public final void endAdUnitExposure(String str, long j7) throws RemoteException {
        Parcel a_ = a_();
        a_.writeString(str);
        a_.writeLong(j7);
        zzb(24, a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public final void generateEventId(zzdg zzdgVar) throws RemoteException {
        Parcel a_ = a_();
        zzbw.zza(a_, zzdgVar);
        zzb(22, a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public final void getAppInstanceId(zzdg zzdgVar) throws RemoteException {
        Parcel a_ = a_();
        zzbw.zza(a_, zzdgVar);
        zzb(20, a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public final void getCachedAppInstanceId(zzdg zzdgVar) throws RemoteException {
        Parcel a_ = a_();
        zzbw.zza(a_, zzdgVar);
        zzb(19, a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public final void getConditionalUserProperties(String str, String str2, zzdg zzdgVar) throws RemoteException {
        Parcel a_ = a_();
        a_.writeString(str);
        a_.writeString(str2);
        zzbw.zza(a_, zzdgVar);
        zzb(10, a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public final void getCurrentScreenClass(zzdg zzdgVar) throws RemoteException {
        Parcel a_ = a_();
        zzbw.zza(a_, zzdgVar);
        zzb(17, a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public final void getCurrentScreenName(zzdg zzdgVar) throws RemoteException {
        Parcel a_ = a_();
        zzbw.zza(a_, zzdgVar);
        zzb(16, a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public final void getGmpAppId(zzdg zzdgVar) throws RemoteException {
        Parcel a_ = a_();
        zzbw.zza(a_, zzdgVar);
        zzb(21, a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public final void getMaxUserProperties(String str, zzdg zzdgVar) throws RemoteException {
        Parcel a_ = a_();
        a_.writeString(str);
        zzbw.zza(a_, zzdgVar);
        zzb(6, a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public final void getSessionId(zzdg zzdgVar) throws RemoteException {
        Parcel a_ = a_();
        zzbw.zza(a_, zzdgVar);
        zzb(46, a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public final void getTestFlag(zzdg zzdgVar, int i9) throws RemoteException {
        Parcel a_ = a_();
        zzbw.zza(a_, zzdgVar);
        a_.writeInt(i9);
        zzb(38, a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public final void getUserProperties(String str, String str2, boolean z8, zzdg zzdgVar) throws RemoteException {
        Parcel a_ = a_();
        a_.writeString(str);
        a_.writeString(str2);
        zzbw.zza(a_, z8);
        zzbw.zza(a_, zzdgVar);
        zzb(5, a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public final void initForTests(Map map) throws RemoteException {
        Parcel a_ = a_();
        a_.writeMap(map);
        zzb(37, a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public final void initialize(IObjectWrapper iObjectWrapper, zzdo zzdoVar, long j7) throws RemoteException {
        Parcel a_ = a_();
        zzbw.zza(a_, iObjectWrapper);
        zzbw.zza(a_, zzdoVar);
        a_.writeLong(j7);
        zzb(1, a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public final void isDataCollectionEnabled(zzdg zzdgVar) throws RemoteException {
        Parcel a_ = a_();
        zzbw.zza(a_, zzdgVar);
        zzb(40, a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public final void logEvent(String str, String str2, Bundle bundle, boolean z8, boolean z9, long j7) throws RemoteException {
        Parcel a_ = a_();
        a_.writeString(str);
        a_.writeString(str2);
        zzbw.zza(a_, bundle);
        zzbw.zza(a_, z8);
        zzbw.zza(a_, z9);
        a_.writeLong(j7);
        zzb(2, a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public final void logEventAndBundle(String str, String str2, Bundle bundle, zzdg zzdgVar, long j7) throws RemoteException {
        Parcel a_ = a_();
        a_.writeString(str);
        a_.writeString(str2);
        zzbw.zza(a_, bundle);
        zzbw.zza(a_, zzdgVar);
        a_.writeLong(j7);
        zzb(3, a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public final void logHealthData(int i9, String str, IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) throws RemoteException {
        Parcel a_ = a_();
        a_.writeInt(i9);
        a_.writeString(str);
        zzbw.zza(a_, iObjectWrapper);
        zzbw.zza(a_, iObjectWrapper2);
        zzbw.zza(a_, iObjectWrapper3);
        zzb(33, a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public final void onActivityCreated(IObjectWrapper iObjectWrapper, Bundle bundle, long j7) throws RemoteException {
        Parcel a_ = a_();
        zzbw.zza(a_, iObjectWrapper);
        zzbw.zza(a_, bundle);
        a_.writeLong(j7);
        zzb(27, a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public final void onActivityDestroyed(IObjectWrapper iObjectWrapper, long j7) throws RemoteException {
        Parcel a_ = a_();
        zzbw.zza(a_, iObjectWrapper);
        a_.writeLong(j7);
        zzb(28, a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public final void onActivityPaused(IObjectWrapper iObjectWrapper, long j7) throws RemoteException {
        Parcel a_ = a_();
        zzbw.zza(a_, iObjectWrapper);
        a_.writeLong(j7);
        zzb(29, a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public final void onActivityResumed(IObjectWrapper iObjectWrapper, long j7) throws RemoteException {
        Parcel a_ = a_();
        zzbw.zza(a_, iObjectWrapper);
        a_.writeLong(j7);
        zzb(30, a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public final void onActivitySaveInstanceState(IObjectWrapper iObjectWrapper, zzdg zzdgVar, long j7) throws RemoteException {
        Parcel a_ = a_();
        zzbw.zza(a_, iObjectWrapper);
        zzbw.zza(a_, zzdgVar);
        a_.writeLong(j7);
        zzb(31, a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public final void onActivityStarted(IObjectWrapper iObjectWrapper, long j7) throws RemoteException {
        Parcel a_ = a_();
        zzbw.zza(a_, iObjectWrapper);
        a_.writeLong(j7);
        zzb(25, a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public final void onActivityStopped(IObjectWrapper iObjectWrapper, long j7) throws RemoteException {
        Parcel a_ = a_();
        zzbw.zza(a_, iObjectWrapper);
        a_.writeLong(j7);
        zzb(26, a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public final void performAction(Bundle bundle, zzdg zzdgVar, long j7) throws RemoteException {
        Parcel a_ = a_();
        zzbw.zza(a_, bundle);
        zzbw.zza(a_, zzdgVar);
        a_.writeLong(j7);
        zzb(32, a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public final void registerOnMeasurementEventListener(zzdh zzdhVar) throws RemoteException {
        Parcel a_ = a_();
        zzbw.zza(a_, zzdhVar);
        zzb(35, a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public final void resetAnalyticsData(long j7) throws RemoteException {
        Parcel a_ = a_();
        a_.writeLong(j7);
        zzb(12, a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public final void setConditionalUserProperty(Bundle bundle, long j7) throws RemoteException {
        Parcel a_ = a_();
        zzbw.zza(a_, bundle);
        a_.writeLong(j7);
        zzb(8, a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public final void setConsent(Bundle bundle, long j7) throws RemoteException {
        Parcel a_ = a_();
        zzbw.zza(a_, bundle);
        a_.writeLong(j7);
        zzb(44, a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public final void setConsentThirdParty(Bundle bundle, long j7) throws RemoteException {
        Parcel a_ = a_();
        zzbw.zza(a_, bundle);
        a_.writeLong(j7);
        zzb(45, a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public final void setCurrentScreen(IObjectWrapper iObjectWrapper, String str, String str2, long j7) throws RemoteException {
        Parcel a_ = a_();
        zzbw.zza(a_, iObjectWrapper);
        a_.writeString(str);
        a_.writeString(str2);
        a_.writeLong(j7);
        zzb(15, a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public final void setDataCollectionEnabled(boolean z8) throws RemoteException {
        Parcel a_ = a_();
        zzbw.zza(a_, z8);
        zzb(39, a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public final void setDefaultEventParameters(Bundle bundle) throws RemoteException {
        Parcel a_ = a_();
        zzbw.zza(a_, bundle);
        zzb(42, a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public final void setEventInterceptor(zzdh zzdhVar) throws RemoteException {
        Parcel a_ = a_();
        zzbw.zza(a_, zzdhVar);
        zzb(34, a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public final void setInstanceIdProvider(zzdm zzdmVar) throws RemoteException {
        Parcel a_ = a_();
        zzbw.zza(a_, zzdmVar);
        zzb(18, a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public final void setMeasurementEnabled(boolean z8, long j7) throws RemoteException {
        Parcel a_ = a_();
        zzbw.zza(a_, z8);
        a_.writeLong(j7);
        zzb(11, a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public final void setMinimumSessionDuration(long j7) throws RemoteException {
        Parcel a_ = a_();
        a_.writeLong(j7);
        zzb(13, a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public final void setSessionTimeoutDuration(long j7) throws RemoteException {
        Parcel a_ = a_();
        a_.writeLong(j7);
        zzb(14, a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public final void setSgtmDebugInfo(Intent intent) throws RemoteException {
        Parcel a_ = a_();
        zzbw.zza(a_, intent);
        zzb(48, a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public final void setUserId(String str, long j7) throws RemoteException {
        Parcel a_ = a_();
        a_.writeString(str);
        a_.writeLong(j7);
        zzb(7, a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public final void setUserProperty(String str, String str2, IObjectWrapper iObjectWrapper, boolean z8, long j7) throws RemoteException {
        Parcel a_ = a_();
        a_.writeString(str);
        a_.writeString(str2);
        zzbw.zza(a_, iObjectWrapper);
        zzbw.zza(a_, z8);
        a_.writeLong(j7);
        zzb(4, a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public final void unregisterOnMeasurementEventListener(zzdh zzdhVar) throws RemoteException {
        Parcel a_ = a_();
        zzbw.zza(a_, zzdhVar);
        zzb(36, a_);
    }
}
