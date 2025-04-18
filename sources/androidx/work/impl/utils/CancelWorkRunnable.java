package androidx.work.impl.utils;

import androidx.annotation.RestrictTo;
import androidx.work.Logger;
import androidx.work.Operation;
import androidx.work.WorkInfo;
import androidx.work.impl.OperationImpl;
import androidx.work.impl.Processor;
import androidx.work.impl.Scheduler;
import androidx.work.impl.Schedulers;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.WorkerWrapper;
import androidx.work.impl.model.DependencyDao;
import androidx.work.impl.model.WorkSpecDao;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.UUID;

@RestrictTo
/* loaded from: classes4.dex */
public abstract class CancelWorkRunnable implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final OperationImpl f22178a = new OperationImpl();

    /* renamed from: androidx.work.impl.utils.CancelWorkRunnable$4, reason: invalid class name */
    /* loaded from: classes4.dex */
    class AnonymousClass4 extends CancelWorkRunnable {
        @Override // androidx.work.impl.utils.CancelWorkRunnable
        public final void d() {
            throw null;
        }
    }

    public static void a(WorkManagerImpl workManagerImpl, String str) {
        WorkDatabase workDatabase = workManagerImpl.f21971c;
        WorkSpecDao h2 = workDatabase.h();
        DependencyDao c2 = workDatabase.c();
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            WorkInfo.State i2 = h2.i(str2);
            if (i2 != WorkInfo.State.f21899c && i2 != WorkInfo.State.d) {
                h2.b(WorkInfo.State.f21901g, str2);
            }
            linkedList.addAll(c2.b(str2));
        }
        Processor processor = workManagerImpl.f21972f;
        synchronized (processor.f21935l) {
            try {
                Logger.c().a(Processor.f21925m, String.format("Processor cancelling %s", str), new Throwable[0]);
                processor.f21933j.add(str);
                WorkerWrapper workerWrapper = (WorkerWrapper) processor.f21930g.remove(str);
                boolean z2 = workerWrapper != null;
                if (workerWrapper == null) {
                    workerWrapper = (WorkerWrapper) processor.f21931h.remove(str);
                }
                Processor.d(str, workerWrapper);
                if (z2) {
                    processor.i();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Iterator it = workManagerImpl.e.iterator();
        while (it.hasNext()) {
            ((Scheduler) it.next()).a(str);
        }
    }

    public static CancelWorkRunnable b(final WorkManagerImpl workManagerImpl, final UUID uuid) {
        return new CancelWorkRunnable() { // from class: androidx.work.impl.utils.CancelWorkRunnable.1
            @Override // androidx.work.impl.utils.CancelWorkRunnable
            public final void d() {
                WorkManagerImpl workManagerImpl2 = WorkManagerImpl.this;
                WorkDatabase workDatabase = workManagerImpl2.f21971c;
                workDatabase.beginTransaction();
                try {
                    CancelWorkRunnable.a(workManagerImpl2, uuid.toString());
                    workDatabase.setTransactionSuccessful();
                    workDatabase.endTransaction();
                    Schedulers.a(workManagerImpl2.f21970b, workManagerImpl2.f21971c, workManagerImpl2.e);
                } catch (Throwable th) {
                    workDatabase.endTransaction();
                    throw th;
                }
            }
        };
    }

    public static CancelWorkRunnable c(final WorkManagerImpl workManagerImpl) {
        return new CancelWorkRunnable() { // from class: androidx.work.impl.utils.CancelWorkRunnable.2

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ String f22182c = "offline_ping_sender_work";

            @Override // androidx.work.impl.utils.CancelWorkRunnable
            public final void d() {
                WorkManagerImpl workManagerImpl2 = WorkManagerImpl.this;
                WorkDatabase workDatabase = workManagerImpl2.f21971c;
                workDatabase.beginTransaction();
                try {
                    Iterator it = workDatabase.h().k(this.f22182c).iterator();
                    while (it.hasNext()) {
                        CancelWorkRunnable.a(workManagerImpl2, (String) it.next());
                    }
                    workDatabase.setTransactionSuccessful();
                    workDatabase.endTransaction();
                    Schedulers.a(workManagerImpl2.f21970b, workManagerImpl2.f21971c, workManagerImpl2.e);
                } catch (Throwable th) {
                    workDatabase.endTransaction();
                    throw th;
                }
            }
        };
    }

    public abstract void d();

    @Override // java.lang.Runnable
    public final void run() {
        OperationImpl operationImpl = this.f22178a;
        try {
            d();
            operationImpl.a(Operation.f21887a);
        } catch (Throwable th) {
            operationImpl.a(new Operation.State.FAILURE(th));
        }
    }
}
