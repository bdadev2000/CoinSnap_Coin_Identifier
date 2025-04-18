package mf;

import androidx.lifecycle.x0;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.SupervisorKt;

/* loaded from: classes4.dex */
public class g extends x0 {
    public final CompletableJob a;

    /* renamed from: b, reason: collision with root package name */
    public final CoroutineScope f22241b;

    /* renamed from: c, reason: collision with root package name */
    public final CoroutineScope f22242c;

    public g() {
        CompletableJob SupervisorJob$default = SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null);
        this.a = SupervisorJob$default;
        MainCoroutineDispatcher main = Dispatchers.getMain();
        CoroutineDispatcher io = Dispatchers.getIO();
        Dispatchers.getDefault();
        this.f22241b = CoroutineScopeKt.CoroutineScope(main.plus(SupervisorJob$default));
        this.f22242c = CoroutineScopeKt.CoroutineScope(io.plus(SupervisorJob$default));
    }

    @Override // androidx.lifecycle.x0
    public final void onCleared() {
        super.onCleared();
        Job.DefaultImpls.cancel$default((Job) this.a, (CancellationException) null, 1, (Object) null);
        JobKt__JobKt.cancelChildren$default(this.f22241b.getCoroutineContext(), (CancellationException) null, 1, (Object) null);
        JobKt__JobKt.cancelChildren$default(this.f22242c.getCoroutineContext(), (CancellationException) null, 1, (Object) null);
    }
}
