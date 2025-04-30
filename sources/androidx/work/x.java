package androidx.work;

import Q7.n0;
import android.content.Context;
import x0.AbstractC2914a;

/* loaded from: classes.dex */
public abstract class x {

    /* renamed from: a, reason: collision with root package name */
    public static final String f5253a = o.g("WorkerFactory");

    public final ListenableWorker a(Context context, String str, WorkerParameters workerParameters) {
        Class cls;
        String str2 = f5253a;
        ListenableWorker listenableWorker = null;
        try {
            cls = Class.forName(str).asSubclass(ListenableWorker.class);
        } catch (Throwable th) {
            o.e().d(str2, AbstractC2914a.d("Invalid class: ", str), th);
            cls = null;
        }
        if (cls != null) {
            try {
                listenableWorker = (ListenableWorker) cls.getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(context, workerParameters);
            } catch (Throwable th2) {
                o.e().d(str2, AbstractC2914a.d("Could not instantiate ", str), th2);
            }
        }
        if (listenableWorker != null && listenableWorker.isUsed()) {
            throw new IllegalStateException(n0.j("WorkerFactory (", getClass().getName(), ") returned an instance of a ListenableWorker (", str, ") which has already been invoked. createWorker() must always return a new instance of a ListenableWorker."));
        }
        return listenableWorker;
    }
}
