package u4;

import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.io.File;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import z4.C2972a;

/* renamed from: u4.k, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class CallableC2766k implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23129a;
    public final /* synthetic */ Object b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f23130c;

    public /* synthetic */ CallableC2766k(int i9, Object obj, Object obj2) {
        this.f23129a = i9;
        this.f23130c = obj;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [k8.c, com.google.android.gms.tasks.SuccessContinuation, java.lang.Object] */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f23129a) {
            case 0:
                Boolean bool = (Boolean) this.b;
                boolean booleanValue = bool.booleanValue();
                r4.c cVar = (r4.c) this.f23130c;
                if (!booleanValue) {
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", "Deleting cached crash reports...", null);
                    }
                    C2769n c2769n = (C2769n) cVar.f22841d;
                    Iterator it = z4.c.e(((File) c2769n.f23140g.f24546c).listFiles(C2769n.f23134r)).iterator();
                    while (it.hasNext()) {
                        ((File) it.next()).delete();
                    }
                    C2769n c2769n2 = (C2769n) cVar.f22841d;
                    z4.c cVar2 = ((C2972a) c2769n2.m.b).b;
                    C2972a.a(z4.c.e(((File) cVar2.f24548e).listFiles()));
                    C2972a.a(z4.c.e(((File) cVar2.f24549f).listFiles()));
                    C2972a.a(z4.c.e(((File) cVar2.f24550g).listFiles()));
                    c2769n2.f23148q.trySetResult(null);
                    return Tasks.forResult(null);
                }
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "Sending cached crash reports...", null);
                }
                boolean booleanValue2 = bool.booleanValue();
                J1.B b = ((C2769n) cVar.f22841d).b;
                if (booleanValue2) {
                    ((TaskCompletionSource) b.f1491f).trySetResult(null);
                    Executor executor = (Executor) ((C2769n) cVar.f22841d).f23138e.f3334a;
                    ?? obj = new Object();
                    obj.f21500c = this;
                    obj.b = executor;
                    return ((Task) cVar.f22840c).onSuccessTask(executor, obj);
                }
                b.getClass();
                throw new IllegalStateException("An invalid data collection token was used.");
            case 1:
                C2769n.a((C2769n) this.f23130c, (String) this.b, Boolean.FALSE);
                return null;
            default:
                return C2772q.a((C2772q) this.f23130c, (B4.c) this.b);
        }
    }
}
