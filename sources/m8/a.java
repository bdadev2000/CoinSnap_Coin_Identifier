package m8;

import J1.B;
import i8.I;
import i8.v;
import i8.w;
import i8.z;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class a implements w {

    /* renamed from: a, reason: collision with root package name */
    public static final a f21756a = new Object();

    @Override // i8.w
    public final I intercept(v vVar) {
        n8.f fVar = (n8.f) vVar;
        i iVar = fVar.f21863a;
        iVar.getClass();
        synchronized (iVar) {
            try {
                if (iVar.f21794q) {
                    if (!iVar.f21793p) {
                        if (!(!iVar.f21792o)) {
                            throw new IllegalStateException("Check failed.".toString());
                        }
                    } else {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                } else {
                    throw new IllegalStateException("released".toString());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        e eVar = iVar.f21790k;
        G7.j.b(eVar);
        z zVar = iVar.b;
        G7.j.e(zVar, "client");
        try {
            B b = new B(iVar, eVar, eVar.a(fVar.f21867f, zVar.f20924h, !G7.j.a(fVar.f21866e.b, "GET"), fVar.f21868g, fVar.f21869h).j(zVar, fVar));
            iVar.f21791n = b;
            iVar.f21796s = b;
            synchronized (iVar) {
                iVar.f21792o = true;
                iVar.f21793p = true;
            }
            if (!iVar.f21795r) {
                return n8.f.a(fVar, 0, b, null, 61).b(fVar.f21866e);
            }
            throw new IOException("Canceled");
        } catch (IOException e4) {
            eVar.c(e4);
            throw new m(e4);
        } catch (m e9) {
            eVar.c(e9.f21816c);
            throw e9;
        }
    }
}
