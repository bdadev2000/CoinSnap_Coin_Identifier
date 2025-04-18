package androidx.work.impl.utils;

import androidx.annotation.RestrictTo;
import androidx.work.Logger;
import androidx.work.WorkInfo;
import androidx.work.impl.Processor;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.model.WorkSpecDao;

@RestrictTo
/* loaded from: classes4.dex */
public class StopWorkRunnable implements Runnable {
    public static final String d = Logger.e("StopWorkRunnable");

    /* renamed from: a, reason: collision with root package name */
    public final WorkManagerImpl f22205a;

    /* renamed from: b, reason: collision with root package name */
    public final String f22206b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f22207c;

    public StopWorkRunnable(WorkManagerImpl workManagerImpl, String str, boolean z2) {
        this.f22205a = workManagerImpl;
        this.f22206b = str;
        this.f22207c = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean containsKey;
        boolean k2;
        WorkManagerImpl workManagerImpl = this.f22205a;
        WorkDatabase workDatabase = workManagerImpl.f21971c;
        Processor processor = workManagerImpl.f21972f;
        WorkSpecDao h2 = workDatabase.h();
        workDatabase.beginTransaction();
        try {
            String str = this.f22206b;
            synchronized (processor.f21935l) {
                containsKey = processor.f21930g.containsKey(str);
            }
            if (this.f22207c) {
                k2 = this.f22205a.f21972f.j(this.f22206b);
            } else {
                if (!containsKey && h2.i(this.f22206b) == WorkInfo.State.f21898b) {
                    h2.b(WorkInfo.State.f21897a, this.f22206b);
                }
                k2 = this.f22205a.f21972f.k(this.f22206b);
            }
            Logger.c().a(d, String.format("StopWorkRunnable for %s; Processor.stopWork = %s", this.f22206b, Boolean.valueOf(k2)), new Throwable[0]);
            workDatabase.setTransactionSuccessful();
            workDatabase.endTransaction();
        } catch (Throwable th) {
            workDatabase.endTransaction();
            throw th;
        }
    }
}
