package androidx.work.impl.utils;

import androidx.annotation.RestrictTo;
import androidx.work.Logger;
import androidx.work.Operation;
import androidx.work.impl.OperationImpl;
import androidx.work.impl.Schedulers;
import androidx.work.impl.WorkContinuationImpl;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import java.util.HashSet;

@RestrictTo
/* loaded from: classes4.dex */
public class EnqueueRunnable implements Runnable {

    /* renamed from: c, reason: collision with root package name */
    public static final String f22185c = Logger.e("EnqueueRunnable");

    /* renamed from: a, reason: collision with root package name */
    public final WorkContinuationImpl f22186a;

    /* renamed from: b, reason: collision with root package name */
    public final OperationImpl f22187b = new OperationImpl();

    public EnqueueRunnable(WorkContinuationImpl workContinuationImpl) {
        this.f22186a = workContinuationImpl;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x025f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0236 A[LOOP:6: B:95:0x0230->B:97:0x0236, LOOP_END] */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean a(androidx.work.impl.WorkContinuationImpl r26) {
        /*
            Method dump skipped, instructions count: 624
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.utils.EnqueueRunnable.a(androidx.work.impl.WorkContinuationImpl):boolean");
    }

    @Override // java.lang.Runnable
    public final void run() {
        OperationImpl operationImpl = this.f22187b;
        WorkContinuationImpl workContinuationImpl = this.f22186a;
        try {
            workContinuationImpl.getClass();
            WorkManagerImpl workManagerImpl = workContinuationImpl.f21941a;
            if (WorkContinuationImpl.a(workContinuationImpl, new HashSet())) {
                throw new IllegalStateException(String.format("WorkContinuation has cycles (%s)", workContinuationImpl));
            }
            WorkDatabase workDatabase = workManagerImpl.f21971c;
            workDatabase.beginTransaction();
            try {
                boolean a2 = a(workContinuationImpl);
                workDatabase.setTransactionSuccessful();
                if (a2) {
                    PackageManagerHelper.a(workManagerImpl.f21969a, RescheduleReceiver.class, true);
                    Schedulers.a(workManagerImpl.f21970b, workManagerImpl.f21971c, workManagerImpl.e);
                }
                operationImpl.a(Operation.f21887a);
            } finally {
                workDatabase.endTransaction();
            }
        } catch (Throwable th) {
            operationImpl.a(new Operation.State.FAILURE(th));
        }
    }
}
