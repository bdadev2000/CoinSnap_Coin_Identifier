package com.google.android.gms.internal.measurement;

import android.content.Intent;
import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.Map;

/* loaded from: classes2.dex */
public interface zzdb extends IInterface {
    void beginAdUnitExposure(String str, long j7) throws RemoteException;

    void clearConditionalUserProperty(String str, String str2, Bundle bundle) throws RemoteException;

    void clearMeasurementEnabled(long j7) throws RemoteException;

    void endAdUnitExposure(String str, long j7) throws RemoteException;

    void generateEventId(zzdg zzdgVar) throws RemoteException;

    void getAppInstanceId(zzdg zzdgVar) throws RemoteException;

    void getCachedAppInstanceId(zzdg zzdgVar) throws RemoteException;

    void getConditionalUserProperties(String str, String str2, zzdg zzdgVar) throws RemoteException;

    void getCurrentScreenClass(zzdg zzdgVar) throws RemoteException;

    void getCurrentScreenName(zzdg zzdgVar) throws RemoteException;

    void getGmpAppId(zzdg zzdgVar) throws RemoteException;

    void getMaxUserProperties(String str, zzdg zzdgVar) throws RemoteException;

    void getSessionId(zzdg zzdgVar) throws RemoteException;

    void getTestFlag(zzdg zzdgVar, int i9) throws RemoteException;

    void getUserProperties(String str, String str2, boolean z8, zzdg zzdgVar) throws RemoteException;

    void initForTests(Map map) throws RemoteException;

    void initialize(IObjectWrapper iObjectWrapper, zzdo zzdoVar, long j7) throws RemoteException;

    void isDataCollectionEnabled(zzdg zzdgVar) throws RemoteException;

    void logEvent(String str, String str2, Bundle bundle, boolean z8, boolean z9, long j7) throws RemoteException;

    void logEventAndBundle(String str, String str2, Bundle bundle, zzdg zzdgVar, long j7) throws RemoteException;

    void logHealthData(int i9, String str, IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) throws RemoteException;

    void onActivityCreated(IObjectWrapper iObjectWrapper, Bundle bundle, long j7) throws RemoteException;

    void onActivityDestroyed(IObjectWrapper iObjectWrapper, long j7) throws RemoteException;

    void onActivityPaused(IObjectWrapper iObjectWrapper, long j7) throws RemoteException;

    void onActivityResumed(IObjectWrapper iObjectWrapper, long j7) throws RemoteException;

    void onActivitySaveInstanceState(IObjectWrapper iObjectWrapper, zzdg zzdgVar, long j7) throws RemoteException;

    void onActivityStarted(IObjectWrapper iObjectWrapper, long j7) throws RemoteException;

    void onActivityStopped(IObjectWrapper iObjectWrapper, long j7) throws RemoteException;

    void performAction(Bundle bundle, zzdg zzdgVar, long j7) throws RemoteException;

    void registerOnMeasurementEventListener(zzdh zzdhVar) throws RemoteException;

    void resetAnalyticsData(long j7) throws RemoteException;

    void setConditionalUserProperty(Bundle bundle, long j7) throws RemoteException;

    void setConsent(Bundle bundle, long j7) throws RemoteException;

    void setConsentThirdParty(Bundle bundle, long j7) throws RemoteException;

    void setCurrentScreen(IObjectWrapper iObjectWrapper, String str, String str2, long j7) throws RemoteException;

    void setDataCollectionEnabled(boolean z8) throws RemoteException;

    void setDefaultEventParameters(Bundle bundle) throws RemoteException;

    void setEventInterceptor(zzdh zzdhVar) throws RemoteException;

    void setInstanceIdProvider(zzdm zzdmVar) throws RemoteException;

    void setMeasurementEnabled(boolean z8, long j7) throws RemoteException;

    void setMinimumSessionDuration(long j7) throws RemoteException;

    void setSessionTimeoutDuration(long j7) throws RemoteException;

    void setSgtmDebugInfo(Intent intent) throws RemoteException;

    void setUserId(String str, long j7) throws RemoteException;

    void setUserProperty(String str, String str2, IObjectWrapper iObjectWrapper, boolean z8, long j7) throws RemoteException;

    void unregisterOnMeasurementEventListener(zzdh zzdhVar) throws RemoteException;
}
