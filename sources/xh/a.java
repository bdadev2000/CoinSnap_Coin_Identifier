package xh;

import java.util.concurrent.ThreadFactory;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final /* synthetic */ class a implements ThreadFactory {
    public final /* synthetic */ String a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f27676b;

    public /* synthetic */ a(String str, boolean z10) {
        this.a = str;
        this.f27676b = z10;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        String name = this.a;
        Intrinsics.checkNotNullParameter(name, "$name");
        Thread thread = new Thread(runnable, name);
        thread.setDaemon(this.f27676b);
        return thread;
    }
}
