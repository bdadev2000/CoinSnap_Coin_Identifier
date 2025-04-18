package bi;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.ExceptionsKt;
import kotlin.jvm.internal.Intrinsics;
import wh.l0;

/* loaded from: classes5.dex */
public final class f implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final wh.l f2463b;

    /* renamed from: c, reason: collision with root package name */
    public volatile AtomicInteger f2464c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i f2465d;

    public f(i this$0, wh.l responseCallback) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(responseCallback, "responseCallback");
        this.f2465d = this$0;
        this.f2463b = responseCallback;
        this.f2464c = new AtomicInteger(0);
    }

    @Override // java.lang.Runnable
    public final void run() {
        l0 l0Var;
        String stringPlus = Intrinsics.stringPlus("OkHttp ", this.f2465d.f2468c.a.g());
        i iVar = this.f2465d;
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        currentThread.setName(stringPlus);
        try {
            iVar.f2472h.h();
            boolean z10 = false;
            try {
                try {
                } catch (IOException e2) {
                    e = e2;
                } catch (Throwable th2) {
                    th = th2;
                }
                try {
                    this.f2463b.onResponse(iVar, iVar.g());
                    l0Var = iVar.f2467b;
                } catch (IOException e10) {
                    e = e10;
                    z10 = true;
                    if (z10) {
                        gi.l lVar = gi.l.a;
                        gi.l lVar2 = gi.l.a;
                        String stringPlus2 = Intrinsics.stringPlus("Callback failure for ", i.a(iVar));
                        lVar2.getClass();
                        gi.l.i(4, stringPlus2, e);
                    } else {
                        this.f2463b.onFailure(iVar, e);
                    }
                    l0Var = iVar.f2467b;
                    l0Var.f27109b.e(this);
                } catch (Throwable th3) {
                    th = th3;
                    z10 = true;
                    iVar.cancel();
                    if (!z10) {
                        IOException iOException = new IOException(Intrinsics.stringPlus("canceled due to ", th));
                        ExceptionsKt.addSuppressed(iOException, th);
                        this.f2463b.onFailure(iVar, iOException);
                    }
                    throw th;
                }
                l0Var.f27109b.e(this);
            } catch (Throwable th4) {
                iVar.f2467b.f27109b.e(this);
                throw th4;
            }
        } finally {
            currentThread.setName(name);
        }
    }
}
