package com.applovin.impl.sdk;

import com.applovin.impl.yp;
import com.facebook.appevents.AnalyticsUserIDStore;
import com.facebook.appevents.AppEventQueue;
import com.facebook.appevents.AppEventsLoggerImpl;
import com.facebook.appevents.UserDataStore;
import com.facebook.appevents.aam.MetadataIndexer;
import com.facebook.appevents.iap.InAppPurchaseActivityLifecycleTracker$initializeIfNotInitialized$2;
import com.facebook.appevents.iap.InAppPurchaseAutoLogger;
import com.facebook.appevents.internal.ActivityLifecycleTracker;
import com.facebook.appevents.ml.ModelManager;
import com.facebook.appevents.suggestedevents.SuggestedEventsManager;
import com.facebook.internal.instrument.anrreport.ANRDetector;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver;
import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorker;

/* loaded from: classes2.dex */
public final /* synthetic */ class z implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26874a;

    public /* synthetic */ z(int i2) {
        this.f26874a = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f26874a) {
            case 0:
                yp.c();
                return;
            case 1:
                AnalyticsUserIDStore.m434initStore$lambda0();
                return;
            case 2:
                AppEventQueue.a();
                return;
            case 3:
                AppEventQueue.b();
                return;
            case 4:
                AppEventsLoggerImpl.Companion.a();
                return;
            case 5:
                UserDataStore.m455clear$lambda2();
                return;
            case 6:
                MetadataIndexer.a();
                return;
            case 7:
                InAppPurchaseActivityLifecycleTracker$initializeIfNotInitialized$2.a();
                return;
            case 8:
                InAppPurchaseActivityLifecycleTracker$initializeIfNotInitialized$2.b();
                return;
            case 9:
                InAppPurchaseAutoLogger.a();
                return;
            case 10:
                InAppPurchaseAutoLogger.b();
                return;
            case 11:
                ActivityLifecycleTracker.m475onActivityCreated$lambda1();
                return;
            case 12:
                ModelManager.m480enable$lambda0();
                return;
            case 13:
                ModelManager.m481enableMTML$lambda1();
                return;
            case 14:
                ModelManager.m482enableMTML$lambda2();
                return;
            case 15:
                SuggestedEventsManager.a();
                return;
            case 16:
                ANRDetector.a();
                return;
            case 17:
                AlarmManagerSchedulerBroadcastReceiver.lambda$onReceive$0();
                return;
            default:
                CrashlyticsWorker.lambda$await$6();
                return;
        }
    }
}
