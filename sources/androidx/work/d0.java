package androidx.work;

import android.content.Context;

/* loaded from: classes.dex */
public abstract class d0 {
    public static final String a = p.g("WorkerFactory");

    public final ListenableWorker a(Context context, String str, WorkerParameters workerParameters) {
        Class cls;
        String str2 = a;
        ListenableWorker listenableWorker = null;
        try {
            cls = Class.forName(str).asSubclass(ListenableWorker.class);
        } catch (Throwable th2) {
            p.e().c(str2, vd.e.e("Invalid class: ", str), th2);
            cls = null;
        }
        if (cls != null) {
            try {
                listenableWorker = (ListenableWorker) cls.getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(context, workerParameters);
            } catch (Throwable th3) {
                p.e().c(str2, vd.e.e("Could not instantiate ", str), th3);
            }
        }
        if (listenableWorker != null && listenableWorker.isUsed()) {
            throw new IllegalStateException(String.format("WorkerFactory (%s) returned an instance of a ListenableWorker (%s) which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.", getClass().getName(), str));
        }
        return listenableWorker;
    }
}
