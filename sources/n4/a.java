package n4;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import g4.g0;
import java.io.InputStream;
import java.util.ArrayDeque;

/* loaded from: classes.dex */
public final class a implements e4.o {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f22397b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f22398c;

    public /* synthetic */ a(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.f22397b = obj;
        this.f22398c = obj2;
    }

    @Override // e4.o
    public final boolean a(Object obj, e4.m mVar) {
        int i10 = this.a;
        Object obj2 = this.f22397b;
        switch (i10) {
            case 0:
                return ((e4.o) obj2).a(obj, mVar);
            case 1:
                return "android.resource".equals(((Uri) obj).getScheme());
            default:
                ((p) obj2).getClass();
                return true;
        }
    }

    @Override // e4.o
    public final g0 b(Object obj, int i10, int i11, e4.m mVar) {
        boolean z10;
        w wVar;
        w4.e eVar;
        switch (this.a) {
            case 0:
                g0 b3 = ((e4.o) this.f22397b).b(obj, i10, i11, mVar);
                Resources resources = (Resources) this.f22398c;
                if (b3 == null) {
                    return null;
                }
                return new d(resources, b3);
            case 1:
                g0 c10 = ((o4.d) this.f22397b).c((Uri) obj, mVar);
                if (c10 == null) {
                    return null;
                }
                return c6.c.f((h4.d) this.f22398c, (Drawable) ((o4.b) c10).get(), i10, i11);
            default:
                InputStream inputStream = (InputStream) obj;
                if (inputStream instanceof w) {
                    wVar = (w) inputStream;
                    z10 = false;
                } else {
                    z10 = true;
                    wVar = new w(inputStream, (h4.h) this.f22398c);
                }
                ArrayDeque arrayDeque = w4.e.f26729d;
                synchronized (arrayDeque) {
                    eVar = (w4.e) arrayDeque.poll();
                }
                if (eVar == null) {
                    eVar = new w4.e();
                }
                w4.e eVar2 = eVar;
                eVar2.f26730b = wVar;
                w4.j jVar = new w4.j(eVar2);
                d3.g gVar = new d3.g(27, wVar, eVar2);
                try {
                    p pVar = (p) this.f22397b;
                    d a = pVar.a(new h.c(pVar.f22434c, jVar, pVar.f22435d), i10, i11, mVar, gVar);
                    eVar2.f26731c = null;
                    eVar2.f26730b = null;
                    synchronized (arrayDeque) {
                        arrayDeque.offer(eVar2);
                    }
                    if (z10) {
                        wVar.release();
                    }
                    return a;
                } catch (Throwable th2) {
                    eVar2.f26731c = null;
                    eVar2.f26730b = null;
                    ArrayDeque arrayDeque2 = w4.e.f26729d;
                    synchronized (arrayDeque2) {
                        arrayDeque2.offer(eVar2);
                        if (z10) {
                            wVar.release();
                        }
                        throw th2;
                    }
                }
        }
    }

    public a(Resources resources, e4.o oVar) {
        this.a = 0;
        this.f22398c = resources;
        this.f22397b = oVar;
    }
}
