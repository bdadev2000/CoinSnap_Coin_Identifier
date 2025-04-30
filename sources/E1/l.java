package e1;

import android.content.Context;
import androidx.work.ListenableWorker;
import d1.C2168i;
import f1.C2262k;
import java.util.UUID;

/* loaded from: classes.dex */
public final class l implements Runnable {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C2262k f20044c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m f20045d;

    public /* synthetic */ l(m mVar, C2262k c2262k, int i9) {
        this.b = i9;
        this.f20045d = mVar;
        this.f20044c = c2262k;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [f1.k, java.lang.Object, f4.c] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                this.f20044c.k(this.f20045d.f20049f.getForegroundInfoAsync());
                return;
            default:
                m mVar = this.f20045d;
                try {
                    androidx.work.h hVar = (androidx.work.h) this.f20044c.get();
                    if (hVar != null) {
                        androidx.work.o e4 = androidx.work.o.e();
                        String str = m.f20046i;
                        C2168i c2168i = mVar.f20048d;
                        ListenableWorker listenableWorker = mVar.f20049f;
                        e4.b(str, "Updating notification for " + c2168i.f19802c, new Throwable[0]);
                        listenableWorker.setRunInForeground(true);
                        C2262k c2262k = mVar.b;
                        androidx.work.i iVar = mVar.f20050g;
                        Context context = mVar.f20047c;
                        UUID id = listenableWorker.getId();
                        o oVar = (o) iVar;
                        oVar.getClass();
                        ?? obj = new Object();
                        ((C.c) oVar.f20056a).p(new n(oVar, obj, id, hVar, context));
                        c2262k.k(obj);
                        return;
                    }
                    throw new IllegalStateException("Worker was marked important (" + mVar.f20048d.f19802c + ") but did not provide ForegroundInfo");
                } catch (Throwable th) {
                    mVar.b.j(th);
                    return;
                }
        }
    }
}
