package j0;

import U4.y;
import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes.dex */
public final class l extends z2.i {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z2.i f20981c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ThreadPoolExecutor f20982d;

    public l(z2.i iVar, ThreadPoolExecutor threadPoolExecutor) {
        this.f20981c = iVar;
        this.f20982d = threadPoolExecutor;
    }

    @Override // z2.i
    public final void l(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.f20982d;
        try {
            this.f20981c.l(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // z2.i
    public final void m(y yVar) {
        ThreadPoolExecutor threadPoolExecutor = this.f20982d;
        try {
            this.f20981c.m(yVar);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
