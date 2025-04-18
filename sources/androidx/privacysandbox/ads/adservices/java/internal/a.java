package androidx.privacysandbox.ads.adservices.java.internal;

import androidx.concurrent.futures.CallbackToFutureAdapter;
import b1.i0;
import b1.r1;
import com.facebook.appevents.codeless.CodelessManager;
import com.facebook.appevents.codeless.ViewIndexingTrigger;
import com.facebook.appevents.internal.FileDownloadTask;
import com.facebook.appevents.ml.Model;
import com.facebook.appevents.ml.ModelManager;
import com.facebook.internal.FetchedAppSettings;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.remoteconfig.internal.ConfigFetchHandler;
import com.google.firebase.remoteconfig.internal.ConfigRealtimeHttpClient;
import java.io.File;
import java.util.Date;
import java.util.Map;

/* loaded from: classes4.dex */
public final /* synthetic */ class a implements CallbackToFutureAdapter.Resolver, ViewIndexingTrigger.OnShakeListener, FileDownloadTask.Callback, SynchronizationGuard.CriticalSection, Continuation {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f20835b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f20836c;
    public final /* synthetic */ Object d;

    public /* synthetic */ a(int i2, Object obj, Object obj2) {
        this.f20835b = i2;
        this.f20836c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object a(CallbackToFutureAdapter.Completer completer) {
        i0 i0Var = (i0) this.f20836c;
        p0.a.s(i0Var, "$this_asListenableFuture");
        ((r1) i0Var).g0(new CoroutineAdapterKt$asListenableFuture$1$1(completer, i0Var));
        return this.d;
    }

    @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
    public final Object execute() {
        Object lambda$logAndUpdateState$5;
        Object lambda$logAndUpdateState$7;
        int i2 = this.f20835b;
        Object obj = this.d;
        Uploader uploader = (Uploader) this.f20836c;
        switch (i2) {
            case 3:
                lambda$logAndUpdateState$5 = uploader.lambda$logAndUpdateState$5((Iterable) obj);
                return lambda$logAndUpdateState$5;
            default:
                lambda$logAndUpdateState$7 = uploader.lambda$logAndUpdateState$7((Map) obj);
                return lambda$logAndUpdateState$7;
        }
    }

    @Override // com.facebook.appevents.internal.FileDownloadTask.Callback
    public final void onComplete(File file) {
        ModelManager.TaskHandler.Companion.b((ModelManager.TaskHandler) this.f20836c, (Model) this.d, file);
    }

    @Override // com.facebook.appevents.codeless.ViewIndexingTrigger.OnShakeListener
    public final void onShake() {
        CodelessManager.m465onActivityResumed$lambda0((FetchedAppSettings) this.f20836c, (String) this.d);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        Task lambda$fetchIfCacheExpiredAndNotThrottled$3;
        Task lambda$fetchNowWithTypeAndAttemptNumber$1;
        int i2 = this.f20835b;
        Object obj = this.d;
        Object obj2 = this.f20836c;
        switch (i2) {
            case 5:
                lambda$fetchIfCacheExpiredAndNotThrottled$3 = ((ConfigFetchHandler) obj2).lambda$fetchIfCacheExpiredAndNotThrottled$3((Date) obj, task);
                return lambda$fetchIfCacheExpiredAndNotThrottled$3;
            case 6:
                lambda$fetchNowWithTypeAndAttemptNumber$1 = ((ConfigFetchHandler) obj2).lambda$fetchNowWithTypeAndAttemptNumber$1((Map) obj, task);
                return lambda$fetchNowWithTypeAndAttemptNumber$1;
            default:
                return ConfigRealtimeHttpClient.a((ConfigRealtimeHttpClient) obj2, (Task) obj, task);
        }
    }
}
