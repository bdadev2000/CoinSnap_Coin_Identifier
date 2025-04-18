package v2;

import android.content.Context;
import androidx.work.ListenableWorker;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class m implements Runnable {

    /* renamed from: i, reason: collision with root package name */
    public static final String f25998i = androidx.work.p.g("WorkForegroundRunnable");

    /* renamed from: b, reason: collision with root package name */
    public final w2.j f25999b = new w2.j();

    /* renamed from: c, reason: collision with root package name */
    public final Context f26000c;

    /* renamed from: d, reason: collision with root package name */
    public final u2.j f26001d;

    /* renamed from: f, reason: collision with root package name */
    public final ListenableWorker f26002f;

    /* renamed from: g, reason: collision with root package name */
    public final androidx.work.j f26003g;

    /* renamed from: h, reason: collision with root package name */
    public final x2.a f26004h;

    public m(Context context, u2.j jVar, ListenableWorker listenableWorker, androidx.work.j jVar2, x2.a aVar) {
        this.f26000c = context;
        this.f26001d = jVar;
        this.f26002f = listenableWorker;
        this.f26003g = jVar2;
        this.f26004h = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f26001d.f25467q && !j0.b.b()) {
            w2.j jVar = new w2.j();
            x2.a aVar = this.f26004h;
            ((Executor) ((h.c) aVar).f18525f).execute(new l(this, jVar, 0));
            jVar.addListener(new l(this, jVar, 1), (Executor) ((h.c) aVar).f18525f);
            return;
        }
        this.f25999b.h(null);
    }
}
