package k8;

import G7.j;
import java.io.IOException;
import java.net.Socket;
import java.util.Iterator;
import m8.l;
import p8.s;
import r8.k;

/* loaded from: classes3.dex */
public final class g extends l8.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f21515e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f21516f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(Object obj, String str, int i9) {
        super(str, true);
        this.f21515e = i9;
        this.f21516f = obj;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, w8.x] */
    @Override // l8.a
    public final long a() {
        switch (this.f21515e) {
            case 0:
                h hVar = (h) this.f21516f;
                synchronized (hVar) {
                    if (hVar.f21531o && !hVar.f21532p) {
                        try {
                            hVar.q();
                        } catch (IOException unused) {
                            hVar.f21533q = true;
                        }
                        try {
                            if (hVar.j()) {
                                hVar.o();
                                hVar.l = 0;
                            }
                        } catch (IOException unused2) {
                            hVar.f21534r = true;
                            hVar.f21528j = k.e(new Object());
                        }
                    }
                }
                return -1L;
            case 1:
                ((F7.a) this.f21516f).invoke();
                return -1L;
            case 2:
                l lVar = (l) this.f21516f;
                long nanoTime = System.nanoTime();
                Iterator it = lVar.f21815e.iterator();
                int i9 = 0;
                long j7 = Long.MIN_VALUE;
                m8.k kVar = null;
                int i10 = 0;
                while (it.hasNext()) {
                    m8.k kVar2 = (m8.k) it.next();
                    j.d(kVar2, "connection");
                    synchronized (kVar2) {
                        if (lVar.b(kVar2, nanoTime) > 0) {
                            i10++;
                        } else {
                            i9++;
                            long j9 = nanoTime - kVar2.f21811q;
                            if (j9 > j7) {
                                kVar = kVar2;
                                j7 = j9;
                            }
                        }
                    }
                }
                long j10 = lVar.b;
                if (j7 < j10 && i9 <= lVar.f21812a) {
                    if (i9 > 0) {
                        return j10 - j7;
                    }
                    if (i10 <= 0) {
                        return -1L;
                    }
                    return j10;
                }
                j.b(kVar);
                synchronized (kVar) {
                    if (!kVar.f21810p.isEmpty()) {
                        return 0L;
                    }
                    if (kVar.f21811q + j7 != nanoTime) {
                        return 0L;
                    }
                    kVar.f21806j = true;
                    lVar.f21815e.remove(kVar);
                    Socket socket = kVar.f21800d;
                    j.b(socket);
                    j8.b.d(socket);
                    if (!lVar.f21815e.isEmpty()) {
                        return 0L;
                    }
                    lVar.f21813c.a();
                    return 0L;
                }
            default:
                s sVar = (s) this.f21516f;
                sVar.getClass();
                try {
                    sVar.f22445A.i(false, 2, 0);
                    return -1L;
                } catch (IOException e4) {
                    sVar.b(e4);
                    return -1L;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(String str, Object obj, int i9) {
        super(str, true);
        this.f21515e = i9;
        this.f21516f = obj;
    }
}
