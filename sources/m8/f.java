package m8;

import i8.C2365b;
import i8.InterfaceC2374k;
import i8.t;
import i8.u;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;
import t7.AbstractC2712a;

/* loaded from: classes3.dex */
public final class f implements Runnable {
    public final InterfaceC2374k b;

    /* renamed from: c, reason: collision with root package name */
    public volatile AtomicInteger f21779c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i f21780d;

    public f(i iVar, d5.g gVar) {
        G7.j.e(iVar, "this$0");
        this.f21780d = iVar;
        this.b = gVar;
        this.f21779c = new AtomicInteger(0);
    }

    @Override // java.lang.Runnable
    public final void run() {
        t tVar;
        boolean z8;
        Throwable th;
        IOException e4;
        b1.h hVar;
        u uVar = this.f21780d.f21783c.f20754a;
        uVar.getClass();
        try {
            tVar = new t();
            tVar.d(uVar, "/...");
        } catch (IllegalArgumentException unused) {
            tVar = null;
        }
        G7.j.b(tVar);
        tVar.f20879f = C2365b.b("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, 251);
        tVar.f20880g = C2365b.b("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, 251);
        String j7 = G7.j.j(tVar.a().f20891i, "OkHttp ");
        i iVar = this.f21780d;
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        currentThread.setName(j7);
        try {
            iVar.f21787h.h();
            try {
                try {
                    z8 = true;
                    try {
                        this.b.onResponse(iVar, iVar.f());
                        hVar = iVar.b.b;
                    } catch (IOException e9) {
                        e4 = e9;
                        if (z8) {
                            r8.m mVar = r8.m.f22950a;
                            r8.m mVar2 = r8.m.f22950a;
                            String j9 = G7.j.j(i.a(iVar), "Callback failure for ");
                            mVar2.getClass();
                            r8.m.i(4, j9, e4);
                        } else {
                            this.b.onFailure(iVar, e4);
                        }
                        hVar = iVar.b.b;
                        hVar.c(this);
                    } catch (Throwable th2) {
                        th = th2;
                        iVar.cancel();
                        if (!z8) {
                            IOException iOException = new IOException(G7.j.j(th, "canceled due to "));
                            AbstractC2712a.a(iOException, th);
                            this.b.onFailure(iVar, iOException);
                        }
                        throw th;
                    }
                } catch (IOException e10) {
                    z8 = false;
                    e4 = e10;
                } catch (Throwable th3) {
                    z8 = false;
                    th = th3;
                }
                hVar.c(this);
            } catch (Throwable th4) {
                iVar.b.b.c(this);
                throw th4;
            }
        } finally {
            currentThread.setName(name);
        }
    }
}
