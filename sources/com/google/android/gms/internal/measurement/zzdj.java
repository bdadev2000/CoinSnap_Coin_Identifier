package com.google.android.gms.internal.measurement;

import android.content.Intent;
import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.Map;

/* loaded from: classes3.dex */
public interface zzdj extends IInterface {
    void beginAdUnitExposure(String str, long j2) throws RemoteException;

    void clearConditionalUserProperty(String str, String str2, Bundle bundle) throws RemoteException;

    void clearMeasurementEnabled(long j2) throws RemoteException;

    void endAdUnitExposure(String str, long j2) throws RemoteException;

    void generateEventId(zzdo zzdoVar) throws RemoteException;

    void getAppInstanceId(zzdo zzdoVar) throws RemoteException;

    void getCachedAppInstanceId(zzdo zzdoVar) throws RemoteException;

    void getConditionalUserProperties(String str, String str2, zzdo zzdoVar) throws RemoteException;

    void getCurrentScreenClass(zzdo zzdoVar) throws RemoteException;

    void getCurrentScreenName(zzdo zzdoVar) throws RemoteException;

    void getGmpAppId(zzdo zzdoVar) throws RemoteException;

    void getMaxUserProperties(String str, zzdo zzdoVar) throws RemoteException;

    void getSessionId(zzdo zzdoVar) throws RemoteException;

    void getTestFlag(zzdo zzdoVar, int i2) throws RemoteException;

    void getUserProperties(String str, String str2, boolean z2, zzdo zzdoVar) throws RemoteException;

    void initForTests(Map map) throws RemoteException;

    void initialize(IObjectWrapper iObjectWrapper, zzdw zzdwVar, long j2) throws RemoteException;

    void isDataCollectionEnabled(zzdo zzdoVar) throws RemoteException;

    void logEvent(String str, String str2, Bundle bundle, boolean z2, boolean z3, long j2) throws RemoteException;

    void logEventAndBundle(String str, String str2, Bundle bundle, zzdo zzdoVar, long j2) throws RemoteException;

    void logHealthData(int i2, String str, IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) throws RemoteException;

    void onActivityCreated(IObjectWrapper iObjectWrapper, Bundle bundle, long j2) throws RemoteException;

    void onActivityDestroyed(IObjectWrapper iObjectWrapper, long j2) throws RemoteException;

    void onActivityPaused(IObjectWrapper iObjectWrapper, long j2) throws RemoteException;

    void onActivityResumed(IObjectWrapper iObjectWrapper, long j2) throws RemoteException;

    void onActivitySaveInstanceState(IObjectWrapper iObjectWrapper, zzdo zzdoVar, long j2) throws RemoteException;

    void onActivityStarted(IObjectWrapper iObjectWrapper, long j2) throws RemoteException;

    void onActivityStopped(IObjectWrapper iObjectWrapper, long j2) throws RemoteException;

    void performAction(Bundle bundle, zzdo zzdoVar, long j2) throws RemoteException;

    void registerOnMeasurementEventListener(zzdp zzdpVar) throws RemoteException;

    void resetAnalyticsData(long j2) throws RemoteException;

    void setConditionalUserProperty(Bundle bundle, long j2) throws RemoteException;

    void setConsent(Bundle bundle, long j2) throws RemoteException;

    void setConsentThirdParty(Bundle bundle, long j2) throws RemoteException;

    void setCurrentScreen(IObjectWrapper iObjectWrapper, String str, String str2, long j2) throws RemoteException;

    void setDataCollectionEnabled(boolean z2) throws RemoteException;

    void setDefaultEventParameters(Bundle bundle) throws RemoteException;

    void setEventInterceptor(zzdp zzdpVar) throws RemoteException;

    void setInstanceIdProvider(zzdu zzduVar) throws RemoteException;

    void setMeasurementEnabled(boolean z2, long j2) throws RemoteException;

    void setMinimumSessionDuration(long j2) throws RemoteException;

    void setSessionTimeoutDuration(long j2) throws RemoteException;

    void setSgtmDebugInfo(Intent intent) throws RemoteException;

    void setUserId(String str, long j2) throws RemoteException;

    void setUserProperty(String str, String str2, IObjectWrapper iObjectWrapper, boolean z2, long j2) throws RemoteException;

    void unregisterOnMeasurementEventListener(zzdp zzdpVar) throws RemoteException;
}
