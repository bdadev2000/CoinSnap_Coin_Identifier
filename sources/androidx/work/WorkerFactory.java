package androidx.work;

import android.content.Context;
import androidx.compose.ui.platform.j;

/* loaded from: classes2.dex */
public abstract class WorkerFactory {

    /* renamed from: a, reason: collision with root package name */
    public static final String f21911a = Logger.e("WorkerFactory");

    /* renamed from: androidx.work.WorkerFactory$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    class AnonymousClass1 extends WorkerFactory {
        @Override // androidx.work.WorkerFactory
        public final ListenableWorker a() {
            return null;
        }
    }

    public abstract ListenableWorker a();

    public final ListenableWorker b(Context context, String str, WorkerParameters workerParameters) {
        Class cls;
        String str2 = f21911a;
        ListenableWorker a2 = a();
        if (a2 == null) {
            try {
                cls = Class.forName(str).asSubclass(ListenableWorker.class);
            } catch (Throwable th) {
                Logger.c().b(str2, j.b("Invalid class: ", str), th);
                cls = null;
            }
            if (cls != null) {
                try {
                    a2 = (ListenableWorker) cls.getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(context, workerParameters);
                } catch (Throwable th2) {
                    Logger.c().b(str2, j.b("Could not instantiate ", str), th2);
                }
            }
        }
        if (a2 == null || !a2.isUsed()) {
            return a2;
        }
        throw new IllegalStateException(String.format("WorkerFactory (%s) returned an instance of a ListenableWorker (%s) which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.", getClass().getName(), str));
    }
}
