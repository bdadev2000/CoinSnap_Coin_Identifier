package androidx.profileinstaller;

import android.content.Context;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20912a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f20913b;

    public /* synthetic */ b(Context context, int i2) {
        this.f20912a = i2;
        this.f20913b = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f20912a;
        Context context = this.f20913b;
        switch (i2) {
            case 0:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new b(context, 1));
                return;
            default:
                ProfileInstaller.b(context, new androidx.arch.core.executor.a(18), ProfileInstaller.f20891a, false);
                return;
        }
    }
}
