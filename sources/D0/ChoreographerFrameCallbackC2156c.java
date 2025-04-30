package d0;

import D3.h;
import M0.C;
import M0.s;
import M0.t;
import M0.v;
import M0.w;
import android.os.SystemClock;
import android.view.Choreographer;
import com.facebook.internal.C1838g;
import i0.C2331a;
import i0.C2333c;
import i0.C2334d;
import java.util.ArrayList;
import x.l;

/* renamed from: d0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ChoreographerFrameCallbackC2156c implements Choreographer.FrameCallback {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f19780c;

    public /* synthetic */ ChoreographerFrameCallbackC2156c(Object obj, int i9) {
        this.b = i9;
        this.f19780c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v10, types: [M0.C] */
    /* JADX WARN: Type inference failed for: r6v2, types: [int] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v8 */
    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j7) {
        boolean z8;
        long j9;
        long j10;
        long j11;
        long j12;
        switch (this.b) {
            case 0:
                ((AbstractC2158e) this.f19780c).f19784c.run();
                return;
            default:
                C1838g c1838g = (C1838g) ((C.c) this.f19780c).f347c;
                c1838g.getClass();
                long uptimeMillis = SystemClock.uptimeMillis();
                C2331a c2331a = (C2331a) c1838g.b;
                c2331a.getClass();
                long uptimeMillis2 = SystemClock.uptimeMillis();
                boolean z9 = false;
                int i9 = 0;
                while (true) {
                    ArrayList arrayList = c2331a.b;
                    if (i9 < arrayList.size()) {
                        C2333c c2333c = (C2333c) arrayList.get(i9);
                        if (c2333c != null) {
                            l lVar = c2331a.f20613a;
                            Long l = (Long) lVar.getOrDefault(c2333c, null);
                            if (l != null) {
                                if (l.longValue() < uptimeMillis2) {
                                    lVar.remove(c2333c);
                                }
                            }
                            long j13 = c2333c.f20624h;
                            if (j13 == 0) {
                                c2333c.f20624h = uptimeMillis;
                                c2333c.b(c2333c.b);
                            } else {
                                long j14 = uptimeMillis - j13;
                                c2333c.f20624h = uptimeMillis;
                                if (c2333c.m != Float.MAX_VALUE) {
                                    C2334d c2334d = c2333c.l;
                                    double d2 = c2334d.f20635i;
                                    long j15 = j14 / 2;
                                    h a6 = c2334d.a(c2333c.b, c2333c.f20618a, j15);
                                    C2334d c2334d2 = c2333c.l;
                                    c2334d2.f20635i = c2333c.m;
                                    c2333c.m = Float.MAX_VALUE;
                                    h a9 = c2334d2.a(a6.f744a, a6.b, j15);
                                    c2333c.b = a9.f744a;
                                    c2333c.f20618a = a9.b;
                                } else {
                                    h a10 = c2333c.l.a(c2333c.b, c2333c.f20618a, j14);
                                    c2333c.b = a10.f744a;
                                    c2333c.f20618a = a10.b;
                                }
                                float max = Math.max(c2333c.b, c2333c.f20623g);
                                c2333c.b = max;
                                c2333c.b = Math.min(max, c2333c.f20622f);
                                float f9 = c2333c.f20618a;
                                C2334d c2334d3 = c2333c.l;
                                c2334d3.getClass();
                                if (Math.abs(f9) < c2334d3.f20631e && Math.abs(r9 - ((float) c2334d3.f20635i)) < c2334d3.f20630d) {
                                    c2333c.b = (float) c2333c.l.f20635i;
                                    c2333c.f20618a = 0.0f;
                                    z8 = true;
                                } else {
                                    z8 = z9 ? 1 : 0;
                                }
                                float min = Math.min(c2333c.b, c2333c.f20622f);
                                c2333c.b = min;
                                float max2 = Math.max(min, c2333c.f20623g);
                                c2333c.b = max2;
                                c2333c.b(max2);
                                if (z8) {
                                    c2333c.f20621e = z9;
                                    ThreadLocal threadLocal = C2331a.f20612f;
                                    if (threadLocal.get() == null) {
                                        threadLocal.set(new C2331a());
                                    }
                                    C2331a c2331a2 = (C2331a) threadLocal.get();
                                    c2331a2.f20613a.remove(c2333c);
                                    ArrayList arrayList2 = c2331a2.b;
                                    int indexOf = arrayList2.indexOf(c2333c);
                                    if (indexOf >= 0) {
                                        arrayList2.set(indexOf, null);
                                        c2331a2.f20616e = true;
                                    }
                                    c2333c.f20624h = 0L;
                                    c2333c.f20619c = z9;
                                    int i10 = z9 ? 1 : 0;
                                    boolean z10 = z9;
                                    while (true) {
                                        ArrayList arrayList3 = c2333c.f20626j;
                                        if (i10 < arrayList3.size()) {
                                            if (arrayList3.get(i10) != null) {
                                                s sVar = (s) arrayList3.get(i10);
                                                float f10 = c2333c.b;
                                                t tVar = sVar.f1901a;
                                                A4.a aVar = v.f1909S7;
                                                w wVar = tVar.f1907g;
                                                if (f10 < 1.0f) {
                                                    long j16 = wVar.f1939z;
                                                    w O = ((C) wVar).O(z10);
                                                    w wVar2 = O.f1934u;
                                                    j11 = uptimeMillis;
                                                    O.f1934u = null;
                                                    j12 = uptimeMillis2;
                                                    wVar.E(-1L, tVar.f1902a);
                                                    wVar.E(j16, -1L);
                                                    tVar.f1902a = j16;
                                                    Runnable runnable = tVar.f1906f;
                                                    if (runnable != null) {
                                                        runnable.run();
                                                    }
                                                    wVar.f1936w.clear();
                                                    if (wVar2 != null) {
                                                        wVar2.x(wVar2, aVar, true);
                                                    }
                                                } else {
                                                    j11 = uptimeMillis;
                                                    j12 = uptimeMillis2;
                                                    wVar.x(wVar, aVar, z10);
                                                }
                                            } else {
                                                j11 = uptimeMillis;
                                                j12 = uptimeMillis2;
                                            }
                                            i10++;
                                            uptimeMillis = j11;
                                            uptimeMillis2 = j12;
                                            z10 = 0;
                                        } else {
                                            j9 = uptimeMillis;
                                            j10 = uptimeMillis2;
                                            for (int size = arrayList3.size() - 1; size >= 0; size--) {
                                                if (arrayList3.get(size) == null) {
                                                    arrayList3.remove(size);
                                                }
                                            }
                                            i9++;
                                            uptimeMillis = j9;
                                            uptimeMillis2 = j10;
                                            z9 = false;
                                        }
                                    }
                                }
                            }
                        }
                        j9 = uptimeMillis;
                        j10 = uptimeMillis2;
                        i9++;
                        uptimeMillis = j9;
                        uptimeMillis2 = j10;
                        z9 = false;
                    } else {
                        if (c2331a.f20616e) {
                            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                                if (arrayList.get(size2) == null) {
                                    arrayList.remove(size2);
                                }
                            }
                            c2331a.f20616e = false;
                        }
                        if (arrayList.size() > 0) {
                            if (c2331a.f20615d == null) {
                                c2331a.f20615d = new C.c(c2331a.f20614c);
                            }
                            C.c cVar = c2331a.f20615d;
                            ((Choreographer) cVar.f348d).postFrameCallback((ChoreographerFrameCallbackC2156c) cVar.f349f);
                            return;
                        }
                        return;
                    }
                }
                break;
        }
    }
}
