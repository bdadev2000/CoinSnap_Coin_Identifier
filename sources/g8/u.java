package g8;

import T.InterfaceC0277j0;
import androidx.appcompat.widget.ActionBarContextView;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import t7.AbstractC2712a;
import x7.EnumC2928a;
import y7.AbstractC2952a;
import y7.AbstractC2954c;
import y7.AbstractC2958g;

/* loaded from: classes3.dex */
public final class u implements InterfaceC0277j0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f20535a;
    public int b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f20536c;

    public u(f8.h hVar, U7.k kVar) {
        G7.j.e(kVar, "lexer");
        this.f20536c = kVar;
        this.f20535a = hVar.f20386c;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object d(g8.u r12, t7.C2713b r13, w7.f r14) {
        /*
            r12.getClass()
            boolean r0 = r14 instanceof g8.t
            if (r0 == 0) goto L16
            r0 = r14
            g8.t r0 = (g8.t) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.l = r1
            goto L1b
        L16:
            g8.t r0 = new g8.t
            r0.<init>(r12, r14)
        L1b:
            java.lang.Object r14 = r0.f20533j
            x7.a r1 = x7.EnumC2928a.b
            int r2 = r0.l
            r3 = 0
            r4 = 6
            r5 = 0
            r6 = 7
            r7 = 1
            r8 = 4
            if (r2 == 0) goto L5e
            if (r2 != r7) goto L56
            java.lang.String r12 = r0.f20532i
            java.util.LinkedHashMap r13 = r0.f20531h
            g8.u r2 = r0.f20530g
            t7.b r9 = r0.f20529f
            t7.AbstractC2712a.f(r14)
            f8.j r14 = (f8.j) r14
            r13.put(r12, r14)
            java.lang.Object r12 = r2.f20536c
            U7.k r12 = (U7.k) r12
            byte r12 = r12.g()
            if (r12 == r8) goto L52
            if (r12 != r6) goto L48
            goto La8
        L48:
            java.lang.Object r12 = r2.f20536c
            U7.k r12 = (U7.k) r12
            java.lang.String r13 = "Expected end of the object or comma"
            U7.k.r(r12, r13, r3, r5, r4)
            throw r5
        L52:
            r11 = r2
            r2 = r12
            r12 = r11
            goto L76
        L56:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L5e:
            t7.AbstractC2712a.f(r14)
            java.lang.Object r14 = r12.f20536c
            U7.k r14 = (U7.k) r14
            byte r2 = r14.h(r4)
            byte r9 = r14.w()
            if (r9 == r8) goto Lc0
            java.util.LinkedHashMap r14 = new java.util.LinkedHashMap
            r14.<init>()
            r9 = r13
            r13 = r14
        L76:
            java.lang.Object r14 = r12.f20536c
            U7.k r14 = (U7.k) r14
            boolean r10 = r14.b()
            if (r10 == 0) goto La5
            boolean r2 = r12.f20535a
            if (r2 == 0) goto L89
            java.lang.String r2 = r14.m()
            goto L8d
        L89:
            java.lang.String r2 = r14.l()
        L8d:
            r3 = 5
            r14.h(r3)
            t7.y r14 = t7.y.f23029a
            r0.f20529f = r9
            r0.f20530g = r12
            r0.f20531h = r13
            r0.f20532i = r2
            r0.l = r7
            r9.getClass()
            r9.f23015d = r0
            r9.f23014c = r14
            goto Lb9
        La5:
            r11 = r2
            r2 = r12
            r12 = r11
        La8:
            java.lang.Object r14 = r2.f20536c
            U7.k r14 = (U7.k) r14
            if (r12 != r4) goto Lb2
            r14.h(r6)
            goto Lb4
        Lb2:
            if (r12 == r8) goto Lba
        Lb4:
            f8.v r1 = new f8.v
            r1.<init>(r13)
        Lb9:
            return r1
        Lba:
            java.lang.String r12 = "Unexpected trailing comma"
            U7.k.r(r14, r12, r3, r5, r4)
            throw r5
        Lc0:
            java.lang.String r12 = "Unexpected leading comma"
            U7.k.r(r14, r12, r3, r5, r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: g8.u.d(g8.u, t7.b, w7.f):java.lang.Object");
    }

    @Override // T.InterfaceC0277j0
    public void a() {
        this.f20535a = true;
    }

    @Override // T.InterfaceC0277j0
    public void b() {
        super/*android.view.View*/.setVisibility(0);
        this.f20535a = false;
    }

    @Override // T.InterfaceC0277j0
    public void c() {
        if (this.f20535a) {
            return;
        }
        ActionBarContextView actionBarContextView = (ActionBarContextView) this.f20536c;
        actionBarContextView.f4154h = null;
        super/*android.view.View*/.setVisibility(this.b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [t7.b, java.lang.Object, w7.f] */
    public f8.j e() {
        f8.j vVar;
        String l;
        Object obj;
        Object b;
        Object abstractC2954c;
        U7.k kVar = (U7.k) this.f20536c;
        byte w2 = kVar.w();
        if (w2 == 1) {
            return g(true);
        }
        if (w2 == 0) {
            return g(false);
        }
        if (w2 == 6) {
            int i9 = this.b + 1;
            this.b = i9;
            if (i9 == 200) {
                s sVar = new s(this, null);
                t7.y yVar = t7.y.f23029a;
                ?? obj2 = new Object();
                obj2.b = sVar;
                obj2.f23014c = yVar;
                obj2.f23015d = obj2;
                EnumC2928a enumC2928a = AbstractC2712a.f23013a;
                obj2.f23016f = enumC2928a;
                while (true) {
                    obj = obj2.f23016f;
                    w7.f fVar = obj2.f23015d;
                    if (fVar == null) {
                        break;
                    }
                    if (G7.j.a(enumC2928a, obj)) {
                        try {
                            F7.q qVar = obj2.b;
                            Object obj3 = obj2.f23014c;
                            if (!(qVar instanceof AbstractC2952a)) {
                                G7.j.e(qVar, "<this>");
                                w7.k context = fVar.getContext();
                                if (context == w7.l.b) {
                                    abstractC2954c = new AbstractC2958g(fVar);
                                } else {
                                    abstractC2954c = new AbstractC2954c(fVar, context);
                                }
                                G7.v.b(3, qVar);
                                b = qVar.b(obj2, obj3, abstractC2954c);
                            } else {
                                G7.v.b(3, qVar);
                                b = qVar.b(obj2, obj3, fVar);
                            }
                            if (b != EnumC2928a.b) {
                                fVar.e(b);
                            }
                        } catch (Throwable th) {
                            fVar.e(AbstractC2712a.b(th));
                        }
                    } else {
                        obj2.f23016f = enumC2928a;
                        fVar.e(obj);
                    }
                }
                AbstractC2712a.f(obj);
                vVar = (f8.j) obj;
            } else {
                byte h6 = kVar.h((byte) 6);
                if (kVar.w() != 4) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    while (true) {
                        if (!kVar.b()) {
                            break;
                        }
                        if (this.f20535a) {
                            l = kVar.m();
                        } else {
                            l = kVar.l();
                        }
                        kVar.h((byte) 5);
                        linkedHashMap.put(l, e());
                        h6 = kVar.g();
                        if (h6 != 4) {
                            if (h6 != 7) {
                                U7.k.r(kVar, "Expected end of the object or comma", 0, null, 6);
                                throw null;
                            }
                        }
                    }
                    if (h6 == 6) {
                        kVar.h((byte) 7);
                    } else if (h6 == 4) {
                        U7.k.r(kVar, "Unexpected trailing comma", 0, null, 6);
                        throw null;
                    }
                    vVar = new f8.v(linkedHashMap);
                } else {
                    U7.k.r(kVar, "Unexpected leading comma", 0, null, 6);
                    throw null;
                }
            }
            this.b--;
            return vVar;
        }
        if (w2 == 8) {
            return f();
        }
        U7.k.r(kVar, com.mbridge.msdk.foundation.entity.o.h(w2, "Cannot begin reading element, unexpected token: "), 0, null, 6);
        throw null;
    }

    public f8.c f() {
        boolean z8;
        U7.k kVar = (U7.k) this.f20536c;
        byte g9 = kVar.g();
        if (kVar.w() != 4) {
            ArrayList arrayList = new ArrayList();
            while (kVar.b()) {
                arrayList.add(e());
                g9 = kVar.g();
                if (g9 != 4) {
                    if (g9 == 9) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    int i9 = kVar.f3372c;
                    if (!z8) {
                        U7.k.r(kVar, "Expected end of the array or comma", i9, null, 4);
                        throw null;
                    }
                }
            }
            if (g9 == 8) {
                kVar.h((byte) 9);
            } else if (g9 == 4) {
                U7.k.r(kVar, "Unexpected trailing comma", 0, null, 6);
                throw null;
            }
            return new f8.c(arrayList);
        }
        U7.k.r(kVar, "Unexpected leading comma", 0, null, 6);
        throw null;
    }

    public f8.y g(boolean z8) {
        String m;
        boolean z9 = this.f20535a;
        U7.k kVar = (U7.k) this.f20536c;
        if (!z9 && z8) {
            m = kVar.l();
        } else {
            m = kVar.m();
        }
        if (!z8 && G7.j.a(m, "null")) {
            return f8.t.b;
        }
        return new f8.q(m, z8);
    }

    public u(ActionBarContextView actionBarContextView) {
        this.f20536c = actionBarContextView;
        this.f20535a = false;
    }
}
