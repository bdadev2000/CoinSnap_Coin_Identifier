package com.facebook.appevents;

import android.app.job.JobParameters;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.facebook.appevents.AppEventsLoggerImpl;
import com.facebook.appevents.aam.MetadataViewObserver;
import com.facebook.appevents.codeless.CodelessLoggingEventListener;
import com.facebook.appevents.codeless.ViewIndexer;
import com.facebook.appevents.iap.InAppPurchaseBillingClientWrapper;
import com.facebook.appevents.ondeviceprocessing.OnDeviceProcessingManager;
import com.facebook.bolts.Task;
import com.facebook.bolts.TaskCompletionSource;
import com.facebook.internal.FetchedAppSettings;
import com.facebook.login.widget.LoginButton;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.common.cache.RemovalListener;
import com.google.common.cache.RemovalNotification;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.List;
import java.util.TimerTask;
import java.util.concurrent.ScheduledFuture;

/* loaded from: classes2.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28534a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f28535b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f28536c;

    public /* synthetic */ b(int i2, Object obj, Object obj2) {
        this.f28534a = i2;
        this.f28535b = obj;
        this.f28536c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f28534a;
        Object obj = this.f28536c;
        Object obj2 = this.f28535b;
        switch (i2) {
            case 0:
                AppEventsLoggerImpl.Companion.b((Context) obj2, (AppEventsLoggerImpl) obj);
                return;
            case 1:
                MetadataViewObserver.a((View) obj2, (MetadataViewObserver) obj);
                return;
            case 2:
                CodelessLoggingEventListener.a((Bundle) obj, (String) obj2);
                return;
            case 3:
                ViewIndexer.b((ViewIndexer) obj2, (TimerTask) obj);
                return;
            case 4:
                ViewIndexer.a((String) obj2, (ViewIndexer) obj);
                return;
            case 5:
                InAppPurchaseBillingClientWrapper.a((InAppPurchaseBillingClientWrapper) obj2, (Runnable) obj);
                return;
            case 6:
                OnDeviceProcessingManager.m485sendCustomEventAsync$lambda1((String) obj2, (AppEvent) obj);
                return;
            case 7:
                Task.Companion.m502delay$lambda1((ScheduledFuture) obj2, (TaskCompletionSource) obj);
                return;
            case 8:
                LoginButton.d((LoginButton) obj2, (FetchedAppSettings) obj);
                return;
            case 9:
                LoginButton.b((String) obj2, (LoginButton) obj);
                return;
            case 10:
                JobInfoSchedulerService.a((JobInfoSchedulerService) obj2, (JobParameters) obj);
                return;
            case 11:
                ((RemovalListener) obj2).onRemoval((RemovalNotification) obj);
                return;
            default:
                ((UserMetadata) obj2).lambda$updateRolloutsState$1((List) obj);
                return;
        }
    }
}
