package j8;

import G7.j;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f21213a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ a(String str, boolean z8) {
        this.f21213a = str;
        this.b = z8;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        String str = this.f21213a;
        j.e(str, "$name");
        Thread thread = new Thread(runnable, str);
        thread.setDaemon(this.b);
        return thread;
    }
}
