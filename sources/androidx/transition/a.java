package androidx.transition;

import androidx.core.os.CancellationSignal;
import androidx.fragment.app.i;
import b1.r;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.SkuDetailsResponseListener;
import com.cooldev.gba.emulator.gameboy.features.paywalls.logic.IAPViewModel;
import com.google.android.datatransport.runtime.EventInternal;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.scheduling.DefaultScheduler;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsTasks;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.internal.ConfigRealtimeHttpClient;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements CancellationSignal.OnCancelListener, SkuDetailsResponseListener, SynchronizationGuard.CriticalSection, Continuation {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f21647b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f21648c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ a(Transition transition, i iVar) {
        this.f21647b = 0;
        this.f21648c = null;
        this.e = transition;
        this.d = iVar;
    }

    @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
    public final Object execute() {
        Object lambda$schedule$0;
        lambda$schedule$0 = ((DefaultScheduler) this.f21648c).lambda$schedule$0((TransportContext) this.d, (EventInternal) this.e);
        return lambda$schedule$0;
    }

    @Override // androidx.core.os.CancellationSignal.OnCancelListener
    public final void onCancel() {
        Runnable runnable = (Runnable) this.f21648c;
        Transition transition = (Transition) this.e;
        Runnable runnable2 = (Runnable) this.d;
        if (runnable != null) {
            runnable.run();
        } else {
            transition.cancel();
            runnable2.run();
        }
    }

    @Override // com.android.billingclient.api.SkuDetailsResponseListener
    public final void onSkuDetailsResponse(BillingResult billingResult, List list) {
        IAPViewModel.b((IAPViewModel) this.f21648c, (r) this.d, (List) this.e, billingResult, list);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        Task lambda$race$0;
        Task lambda$activate$2;
        int i2 = this.f21647b;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.f21648c;
        switch (i2) {
            case 3:
                lambda$race$0 = CrashlyticsTasks.lambda$race$0((TaskCompletionSource) obj3, (AtomicBoolean) obj2, (CancellationTokenSource) obj, task);
                return lambda$race$0;
            case 4:
                lambda$activate$2 = ((FirebaseRemoteConfig) obj3).lambda$activate$2((Task) obj2, (Task) obj, task);
                return lambda$activate$2;
            default:
                return ConfigRealtimeHttpClient.b((ConfigRealtimeHttpClient) obj3, (Task) obj2, (Task) obj, task);
        }
    }

    public /* synthetic */ a(Object obj, int i2, Object obj2, Object obj3) {
        this.f21647b = i2;
        this.f21648c = obj;
        this.d = obj2;
        this.e = obj3;
    }
}
