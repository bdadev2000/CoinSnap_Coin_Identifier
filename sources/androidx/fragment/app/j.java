package androidx.fragment.app;

import android.graphics.Canvas;
import android.view.View;
import androidx.arch.core.util.Function;
import androidx.core.os.CancellationSignal;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import androidx.fragment.app.SpecialEffectsController;
import com.applovin.impl.tl;
import com.facebook.GraphResponse;
import com.facebook.appevents.internal.FileDownloadTask;
import com.facebook.appevents.ml.ModelManager;
import com.facebook.gamingservices.ContextChooseDialog;
import com.facebook.gamingservices.ContextCreateDialog;
import com.facebook.gamingservices.ContextSwitchDialog;
import com.facebook.gamingservices.cloudgaming.DaemonRequest;
import com.facebook.internal.ImageRequest;
import com.facebook.internal.ImageResponse;
import com.facebook.login.LoginClient;
import com.facebook.login.LoginFragment;
import com.facebook.login.widget.ProfilePictureView;
import com.google.android.datatransport.Transformer;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer;
import com.google.android.datatransport.runtime.scheduling.persistence.ClientHealthMetricsStore;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.material.bottomsheet.BottomSheetDragHandleView;
import com.google.android.material.canvas.CanvasCompat;
import com.google.android.material.carousel.MaskableFrameLayout;
import com.google.android.material.navigation.NavigationView;
import com.google.firebase.crashlytics.internal.CrashlyticsNativeComponentDeferredProxy;
import com.google.firebase.crashlytics.internal.CrashlyticsRemoteConfigListener;
import com.google.firebase.crashlytics.internal.RemoteConfigDeferredProxy;
import com.google.firebase.crashlytics.internal.common.SessionReportingCoordinator;
import com.google.firebase.crashlytics.internal.common.Utils;
import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorker;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigInfo;
import com.google.firebase.remoteconfig.internal.ConfigFetchHandler;
import com.google.firebase.sessions.EventGDTLogger;
import com.google.firebase.sessions.SessionEvent;
import java.io.File;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.internal.Util;

/* loaded from: classes3.dex */
public final /* synthetic */ class j implements CancellationSignal.OnCancelListener, Function, FileDownloadTask.Callback, DaemonRequest.Callback, LoginClient.OnCompletedListener, ImageRequest.Callback, SynchronizationGuard.CriticalSection, AccessibilityViewCommand, CanvasCompat.CanvasOperation, Deferred.DeferredHandler, Continuation, SuccessContinuation, Transformer, EventListener.Factory {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f19899b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f19900c;

    public /* synthetic */ j(Object obj, int i2) {
        this.f19899b = i2;
        this.f19900c = obj;
    }

    @Override // androidx.arch.core.util.Function
    public final Object apply(Object obj) {
        List a2;
        int i2 = this.f19899b;
        Object obj2 = this.f19900c;
        switch (i2) {
            case 1:
                a2 = com.applovin.impl.sdk.ad.b.a((Function) obj2, (tl) obj);
                return a2;
            default:
                return EventGDTLogger.a((EventGDTLogger) obj2, (SessionEvent) obj);
        }
    }

    @Override // okhttp3.EventListener.Factory
    public final EventListener create(Call call) {
        return Util.a((EventListener) this.f19900c, call);
    }

    @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
    public final Object execute() {
        Object lambda$logAndUpdateState$6;
        Object lambda$ensureContextsScheduled$0;
        int i2 = this.f19899b;
        Object obj = this.f19900c;
        switch (i2) {
            case 8:
                return ((ClientHealthMetricsStore) obj).loadClientMetrics();
            case 9:
                return Integer.valueOf(((EventStore) obj).cleanUp());
            case 10:
                lambda$logAndUpdateState$6 = ((Uploader) obj).lambda$logAndUpdateState$6();
                return lambda$logAndUpdateState$6;
            default:
                lambda$ensureContextsScheduled$0 = ((WorkInitializer) obj).lambda$ensureContextsScheduled$0();
                return lambda$ensureContextsScheduled$0;
        }
    }

    @Override // com.google.firebase.inject.Deferred.DeferredHandler
    public final void handle(Provider provider) {
        int i2 = this.f19899b;
        Object obj = this.f19900c;
        switch (i2) {
            case 15:
                CrashlyticsNativeComponentDeferredProxy.a((CrashlyticsNativeComponentDeferredProxy) obj, provider);
                return;
            default:
                RemoteConfigDeferredProxy.a((CrashlyticsRemoteConfigListener) obj, provider);
                return;
        }
    }

    @Override // androidx.core.os.CancellationSignal.OnCancelListener
    public final void onCancel() {
        SpecialEffectsController.Operation operation = (SpecialEffectsController.Operation) this.f19900c;
        p0.a.s(operation, "this$0");
        operation.a();
    }

    @Override // com.facebook.appevents.internal.FileDownloadTask.Callback
    public final void onComplete(File file) {
        ModelManager.TaskHandler.Companion.a((List) this.f19900c, file);
    }

    @Override // com.facebook.gamingservices.cloudgaming.DaemonRequest.Callback
    public final void onCompleted(GraphResponse graphResponse) {
        int i2 = this.f19899b;
        Object obj = this.f19900c;
        switch (i2) {
            case 3:
                ContextChooseDialog.b((ContextChooseDialog) obj, graphResponse);
                return;
            case 4:
                ContextCreateDialog.b((ContextCreateDialog) obj, graphResponse);
                return;
            default:
                ContextSwitchDialog.b((ContextSwitchDialog) obj, graphResponse);
                return;
        }
    }

    @Override // androidx.core.view.accessibility.AccessibilityViewCommand
    public final boolean perform(View view, AccessibilityViewCommand.CommandArguments commandArguments) {
        return BottomSheetDragHandleView.c((BottomSheetDragHandleView) this.f19900c, view, commandArguments);
    }

    @Override // com.google.android.material.canvas.CanvasCompat.CanvasOperation
    public final void run(Canvas canvas) {
        int i2 = this.f19899b;
        Object obj = this.f19900c;
        switch (i2) {
            case 13:
                MaskableFrameLayout.a((MaskableFrameLayout) obj, canvas);
                return;
            default:
                NavigationView.a((NavigationView) obj, canvas);
                return;
        }
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public final Task then(Object obj) {
        Task forResult;
        forResult = Tasks.forResult((ConfigFetchHandler.FetchResponse) this.f19900c);
        return forResult;
    }

    @Override // com.facebook.internal.ImageRequest.Callback
    public final void onCompleted(ImageResponse imageResponse) {
        ProfilePictureView.a((ProfilePictureView) this.f19900c, imageResponse);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        Task lambda$submit$1;
        Task lambda$submitTaskOnSuccess$5;
        FirebaseRemoteConfigInfo lambda$ensureInitialized$0;
        int i2 = this.f19899b;
        Object obj = this.f19900c;
        switch (i2) {
            case 17:
                return Boolean.valueOf(SessionReportingCoordinator.a((SessionReportingCoordinator) obj, task));
            case 18:
                return Utils.a((CountDownLatch) obj, task);
            case 19:
                lambda$submit$1 = CrashlyticsWorker.lambda$submit$1((Runnable) obj, task);
                return lambda$submit$1;
            case 20:
                lambda$submitTaskOnSuccess$5 = CrashlyticsWorker.lambda$submitTaskOnSuccess$5((SuccessContinuation) obj, task);
                return lambda$submitTaskOnSuccess$5;
            default:
                lambda$ensureInitialized$0 = FirebaseRemoteConfig.lambda$ensureInitialized$0((Task) obj, task);
                return lambda$ensureInitialized$0;
        }
    }

    @Override // com.facebook.login.LoginClient.OnCompletedListener
    public final void onCompleted(LoginClient.Result result) {
        LoginFragment.m566onCreate$lambda0((LoginFragment) this.f19900c, result);
    }
}
