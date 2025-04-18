package androidx.arch.core.executor;

import java.util.concurrent.Executor;

/* loaded from: classes4.dex */
public final /* synthetic */ class a implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1308a;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f1308a) {
            case 1:
                ArchTaskExecutor.a().f1303a.f1305b.execute(runnable);
                return;
            case 2:
                runnable.run();
                return;
            case 3:
            case 6:
            case 7:
            case 10:
            case 11:
            default:
                runnable.run();
                return;
            case 4:
                runnable.run();
                return;
            case 5:
                runnable.run();
                return;
            case 8:
                runnable.run();
                return;
            case 9:
                runnable.run();
                return;
            case 12:
                runnable.run();
                return;
            case 13:
                runnable.run();
                return;
            case 14:
                runnable.run();
                return;
            case 15:
                runnable.run();
                return;
            case 16:
                runnable.run();
                return;
            case 17:
                runnable.run();
                return;
            case 18:
                runnable.run();
                return;
            case 19:
                runnable.run();
                return;
        }
    }
}
