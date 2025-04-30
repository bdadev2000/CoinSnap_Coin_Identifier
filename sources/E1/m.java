package e1;

import android.content.Context;
import androidx.work.ListenableWorker;
import d1.C2168i;
import f1.C2262k;
import g1.InterfaceC2286a;

/* loaded from: classes.dex */
public final class m implements Runnable {

    /* renamed from: i, reason: collision with root package name */
    public static final String f20046i = androidx.work.o.g("WorkForegroundRunnable");
    public final C2262k b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final Context f20047c;

    /* renamed from: d, reason: collision with root package name */
    public final C2168i f20048d;

    /* renamed from: f, reason: collision with root package name */
    public final ListenableWorker f20049f;

    /* renamed from: g, reason: collision with root package name */
    public final androidx.work.i f20050g;

    /* renamed from: h, reason: collision with root package name */
    public final InterfaceC2286a f20051h;

    /* JADX WARN: Type inference failed for: r0v0, types: [f1.k, java.lang.Object] */
    public m(Context context, C2168i c2168i, ListenableWorker listenableWorker, o oVar, InterfaceC2286a interfaceC2286a) {
        this.f20047c = context;
        this.f20048d = c2168i;
        this.f20049f = listenableWorker;
        this.f20050g = oVar;
        this.f20051h = interfaceC2286a;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [f1.k, f1.i, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        if (this.f20048d.f19814q && !P.b.b()) {
            ?? obj = new Object();
            C.c cVar = (C.c) this.f20051h;
            ((P.h) cVar.f349f).execute(new l(this, obj, 0));
            obj.addListener(new l(this, obj, 1), (P.h) cVar.f349f);
            return;
        }
        this.b.i(null);
    }
}
