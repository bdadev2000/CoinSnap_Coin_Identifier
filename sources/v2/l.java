package v2;

import android.content.Context;
import androidx.work.ListenableWorker;
import java.util.UUID;
import n0.w1;

/* loaded from: classes.dex */
public final class l implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f25995b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w2.j f25996c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m f25997d;

    public /* synthetic */ l(m mVar, w2.j jVar, int i10) {
        this.f25995b = i10;
        this.f25997d = mVar;
        this.f25996c = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f25995b;
        w2.j jVar = this.f25996c;
        m mVar = this.f25997d;
        switch (i10) {
            case 0:
                jVar.j(mVar.f26002f.getForegroundInfoAsync());
                return;
            default:
                try {
                    androidx.work.i iVar = (androidx.work.i) jVar.get();
                    if (iVar != null) {
                        androidx.work.p e2 = androidx.work.p.e();
                        String str = m.f25998i;
                        Object[] objArr = new Object[1];
                        u2.j jVar2 = mVar.f26001d;
                        ListenableWorker listenableWorker = mVar.f26002f;
                        objArr[0] = jVar2.f25453c;
                        e2.b(str, String.format("Updating notification for %s", objArr), new Throwable[0]);
                        listenableWorker.setRunInForeground(true);
                        w2.j jVar3 = mVar.f25999b;
                        androidx.work.j jVar4 = mVar.f26003g;
                        Context context = mVar.f26000c;
                        UUID id2 = listenableWorker.getId();
                        n nVar = (n) jVar4;
                        nVar.getClass();
                        w2.j jVar5 = new w2.j();
                        ((h.c) nVar.a).r(new w1(nVar, jVar5, id2, iVar, context, 1));
                        jVar3.j(jVar5);
                        return;
                    }
                    throw new IllegalStateException(String.format("Worker was marked important (%s) but did not provide ForegroundInfo", mVar.f26001d.f25453c));
                } catch (Throwable th2) {
                    mVar.f25999b.i(th2);
                    return;
                }
        }
    }
}
