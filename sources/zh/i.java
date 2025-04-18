package zh;

import bi.l;
import java.io.IOException;
import java.net.Socket;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class i extends ai.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f28800e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f28801f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(int i10, Object obj, String str) {
        super(str, true);
        this.f28800e = i10;
        this.f28801f = obj;
    }

    @Override // ai.a
    public final long a() {
        int i10 = 0;
        switch (this.f28800e) {
            case 0:
                j jVar = (j) this.f28801f;
                synchronized (jVar) {
                    if (jVar.f28819q && !jVar.f28820r) {
                        try {
                            jVar.x();
                        } catch (IOException unused) {
                            jVar.f28821s = true;
                        }
                        try {
                            if (jVar.q()) {
                                jVar.v();
                                jVar.f28816n = 0;
                            }
                        } catch (IOException unused2) {
                            jVar.f28822t = true;
                            jVar.f28814l = a6.k.e(new ki.f());
                        }
                    }
                }
                return -1L;
            default:
                l lVar = (l) this.f28801f;
                long nanoTime = System.nanoTime();
                Iterator it = lVar.f2504e.iterator();
                long j3 = Long.MIN_VALUE;
                bi.k kVar = null;
                int i11 = 0;
                while (it.hasNext()) {
                    bi.k connection = (bi.k) it.next();
                    Intrinsics.checkNotNullExpressionValue(connection, "connection");
                    synchronized (connection) {
                        if (lVar.b(connection, nanoTime) > 0) {
                            i11++;
                        } else {
                            i10++;
                            long j10 = nanoTime - connection.f2500q;
                            if (j10 > j3) {
                                kVar = connection;
                                j3 = j10;
                            }
                            Unit unit = Unit.INSTANCE;
                        }
                    }
                }
                long j11 = lVar.f2501b;
                if (j3 < j11 && i10 <= lVar.a) {
                    if (i10 > 0) {
                        return j11 - j3;
                    }
                    if (i11 <= 0) {
                        return -1L;
                    }
                    return j11;
                }
                Intrinsics.checkNotNull(kVar);
                synchronized (kVar) {
                    if (!(!kVar.f2499p.isEmpty())) {
                        if (kVar.f2500q + j3 == nanoTime) {
                            kVar.f2493j = true;
                            lVar.f2504e.remove(kVar);
                            Socket socket = kVar.f2487d;
                            Intrinsics.checkNotNull(socket);
                            xh.b.d(socket);
                            if (lVar.f2504e.isEmpty()) {
                                lVar.f2502c.a();
                            }
                        }
                    }
                }
                return 0L;
        }
    }
}
