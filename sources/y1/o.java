package y1;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes.dex */
public final class o extends e {

    /* renamed from: i, reason: collision with root package name */
    public final PointF f24314i;

    /* renamed from: j, reason: collision with root package name */
    public final PointF f24315j;

    /* renamed from: k, reason: collision with root package name */
    public final e f24316k;
    public final e l;
    public E1.d m;

    /* renamed from: n, reason: collision with root package name */
    public E1.d f24317n;

    public o(i iVar, i iVar2) {
        super(Collections.emptyList());
        this.f24314i = new PointF();
        this.f24315j = new PointF();
        this.f24316k = iVar;
        this.l = iVar2;
        i(this.f24291d);
    }

    @Override // y1.e
    public final Object e() {
        return k(0.0f);
    }

    @Override // y1.e
    public final /* bridge */ /* synthetic */ Object f(I1.a aVar, float f9) {
        return k(f9);
    }

    @Override // y1.e
    public final void i(float f9) {
        e eVar = this.f24316k;
        eVar.i(f9);
        e eVar2 = this.l;
        eVar2.i(f9);
        this.f24314i.set(((Float) eVar.e()).floatValue(), ((Float) eVar2.e()).floatValue());
        int i9 = 0;
        while (true) {
            ArrayList arrayList = this.f24289a;
            if (i9 < arrayList.size()) {
                ((InterfaceC2942a) arrayList.get(i9)).a();
                i9++;
            } else {
                return;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.PointF k(float r13) {
        /*
            r12 = this;
            E1.d r0 = r12.m
            r1 = 0
            if (r0 == 0) goto L35
            y1.e r0 = r12.f24316k
            y1.b r2 = r0.f24290c
            I1.a r2 = r2.c()
            if (r2 == 0) goto L35
            float r10 = r0.c()
            java.lang.Float r0 = r2.f1414h
            E1.d r3 = r12.m
            float r4 = r2.f1413g
            if (r0 != 0) goto L1d
            r5 = r4
            goto L22
        L1d:
            float r0 = r0.floatValue()
            r5 = r0
        L22:
            java.lang.Object r0 = r2.b
            r6 = r0
            java.lang.Float r6 = (java.lang.Float) r6
            java.lang.Object r0 = r2.f1409c
            r7 = r0
            java.lang.Float r7 = (java.lang.Float) r7
            r8 = r13
            r9 = r13
            java.lang.Object r0 = r3.t(r4, r5, r6, r7, r8, r9, r10)
            java.lang.Float r0 = (java.lang.Float) r0
            goto L36
        L35:
            r0 = r1
        L36:
            E1.d r2 = r12.f24317n
            if (r2 == 0) goto L6a
            y1.e r2 = r12.l
            y1.b r3 = r2.f24290c
            I1.a r3 = r3.c()
            if (r3 == 0) goto L6a
            float r11 = r2.c()
            java.lang.Float r1 = r3.f1414h
            E1.d r4 = r12.f24317n
            float r5 = r3.f1413g
            if (r1 != 0) goto L52
            r6 = r5
            goto L57
        L52:
            float r1 = r1.floatValue()
            r6 = r1
        L57:
            java.lang.Object r1 = r3.b
            r7 = r1
            java.lang.Float r7 = (java.lang.Float) r7
            java.lang.Object r1 = r3.f1409c
            r8 = r1
            java.lang.Float r8 = (java.lang.Float) r8
            r9 = r13
            r10 = r13
            java.lang.Object r13 = r4.t(r5, r6, r7, r8, r9, r10, r11)
            r1 = r13
            java.lang.Float r1 = (java.lang.Float) r1
        L6a:
            android.graphics.PointF r13 = r12.f24314i
            android.graphics.PointF r2 = r12.f24315j
            r3 = 0
            if (r0 != 0) goto L77
            float r0 = r13.x
            r2.set(r0, r3)
            goto L7e
        L77:
            float r0 = r0.floatValue()
            r2.set(r0, r3)
        L7e:
            if (r1 != 0) goto L88
            float r0 = r2.x
            float r13 = r13.y
            r2.set(r0, r13)
            goto L91
        L88:
            float r13 = r2.x
            float r0 = r1.floatValue()
            r2.set(r13, r0)
        L91:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: y1.o.k(float):android.graphics.PointF");
    }
}
