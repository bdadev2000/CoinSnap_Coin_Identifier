package W1;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.ArrayList;

/* renamed from: W1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0317a implements N1.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3569a;
    public final Object b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f3570c;

    public /* synthetic */ C0317a(int i9, Object obj, Object obj2) {
        this.f3569a = i9;
        this.b = obj;
        this.f3570c = obj2;
    }

    @Override // N1.k
    public final boolean a(Object obj, N1.i iVar) {
        switch (this.f3569a) {
            case 0:
                return ((N1.k) this.b).a(obj, iVar);
            case 1:
                return "android.resource".equals(((Uri) obj).getScheme());
            default:
                ((q) this.b).getClass();
                return true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.io.InputStream] */
    @Override // N1.k
    public final P1.B b(Object obj, int i9, int i10, N1.i iVar) {
        boolean z8;
        y yVar;
        j2.e eVar;
        j2.e eVar2;
        switch (this.f3569a) {
            case 0:
                P1.B b = ((N1.k) this.b).b(obj, i9, i10, iVar);
                if (b == null) {
                    return null;
                }
                return new C0320d((Resources) this.f3570c, b);
            case 1:
                P1.B c9 = ((Y1.c) this.b).c((Uri) obj, iVar);
                if (c9 == null) {
                    return null;
                }
                return s.a((Q1.a) this.f3570c, (Drawable) ((Y1.b) c9).get(), i9, i10);
            default:
                InputStream inputStream = (InputStream) obj;
                if (inputStream instanceof y) {
                    yVar = (y) inputStream;
                    z8 = false;
                } else {
                    z8 = true;
                    yVar = new y(inputStream, (Q1.f) this.f3570c);
                }
                ArrayDeque arrayDeque = j2.e.f21017d;
                synchronized (arrayDeque) {
                    eVar = (j2.e) arrayDeque.poll();
                    eVar2 = eVar;
                }
                if (eVar == null) {
                    eVar2 = new InputStream();
                }
                j2.e eVar3 = eVar2;
                eVar3.b = yVar;
                j2.k kVar = new j2.k(eVar3);
                a7.b bVar = new a7.b(14, yVar, eVar3);
                try {
                    q qVar = (q) this.b;
                    C0320d a6 = qVar.a(new C.c(kVar, (ArrayList) qVar.f3594d, qVar.f3593c), i9, i10, iVar, bVar);
                    eVar3.f21018c = null;
                    eVar3.b = null;
                    synchronized (arrayDeque) {
                        arrayDeque.offer(eVar3);
                    }
                    if (z8) {
                        yVar.release();
                    }
                    return a6;
                } catch (Throwable th) {
                    eVar3.f21018c = null;
                    eVar3.b = null;
                    ArrayDeque arrayDeque2 = j2.e.f21017d;
                    synchronized (arrayDeque2) {
                        arrayDeque2.offer(eVar3);
                        if (z8) {
                            yVar.release();
                        }
                        throw th;
                    }
                }
        }
    }

    public C0317a(Resources resources, N1.k kVar) {
        this.f3569a = 0;
        this.f3570c = resources;
        this.b = kVar;
    }
}
