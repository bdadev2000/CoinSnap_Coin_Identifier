package q4;

import U4.RunnableC0311g;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import u4.AbstractC2755B;
import u4.C2772q;
import u4.CallableC2766k;

/* renamed from: q4.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class CallableC2644c implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f22786a;
    public final /* synthetic */ C2772q b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ B4.c f22787c;

    public CallableC2644c(boolean z8, C2772q c2772q, B4.c cVar) {
        this.f22786a = z8;
        this.b = c2772q;
        this.f22787c = cVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        if (this.f22786a) {
            C2772q c2772q = this.b;
            c2772q.getClass();
            CallableC2766k callableC2766k = new CallableC2766k(2, c2772q, this.f22787c);
            ExecutorService executorService = AbstractC2755B.f23108a;
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            ExecutorService executorService2 = c2772q.l;
            executorService2.execute(new RunnableC0311g(callableC2766k, executorService2, taskCompletionSource, 24));
            taskCompletionSource.getTask();
            return null;
        }
        return null;
    }
}
