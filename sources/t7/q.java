package t7;

import s7.x2;
import v8.z;

/* loaded from: classes3.dex */
public final class q {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public int f25323b;

    /* renamed from: c, reason: collision with root package name */
    public long f25324c;

    /* renamed from: d, reason: collision with root package name */
    public final z f25325d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f25326e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f25327f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r f25328g;

    public q(r rVar, String str, int i10, z zVar) {
        long j3;
        this.f25328g = rVar;
        this.a = str;
        this.f25323b = i10;
        if (zVar == null) {
            j3 = -1;
        } else {
            j3 = zVar.f26320d;
        }
        this.f25324c = j3;
        if (zVar != null && zVar.a()) {
            this.f25325d = zVar;
        }
    }

    public final boolean a(b bVar) {
        z zVar = bVar.f25289d;
        if (zVar == null) {
            if (this.f25323b != bVar.f25288c) {
                return true;
            }
            return false;
        }
        long j3 = this.f25324c;
        if (j3 == -1) {
            return false;
        }
        if (zVar.f26320d > j3) {
            return true;
        }
        z zVar2 = this.f25325d;
        if (zVar2 == null) {
            return false;
        }
        x2 x2Var = bVar.f25287b;
        int b3 = x2Var.b(zVar.a);
        int b10 = x2Var.b(zVar2.a);
        if (zVar.f26320d < zVar2.f26320d || b3 < b10) {
            return false;
        }
        if (b3 > b10) {
            return true;
        }
        boolean a = zVar.a();
        int i10 = zVar2.f26318b;
        if (a) {
            int i11 = zVar.f26318b;
            if (i11 > i10) {
                return true;
            }
            if (i11 == i10) {
                if (zVar.f26319c > zVar2.f26319c) {
                    return true;
                }
            }
            return false;
        }
        int i12 = zVar.f26321e;
        if (i12 == -1 || i12 > i10) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000e, code lost:
    
        if (r0 < r8.o()) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b(s7.x2 r7, s7.x2 r8) {
        /*
            r6 = this;
            int r0 = r6.f25323b
            int r1 = r7.o()
            r2 = 0
            r3 = -1
            if (r0 < r1) goto L13
            int r7 = r8.o()
            if (r0 >= r7) goto L11
            goto L38
        L11:
            r0 = r3
            goto L38
        L13:
            t7.r r1 = r6.f25328g
            s7.w2 r4 = r1.a
            r7.m(r0, r4)
            s7.w2 r0 = r1.a
            int r4 = r0.f24853q
        L1e:
            int r5 = r0.f24854r
            if (r4 > r5) goto L11
            java.lang.Object r5 = r7.l(r4)
            int r5 = r8.b(r5)
            if (r5 == r3) goto L35
            s7.v2 r7 = r1.f25331b
            s7.v2 r7 = r8.f(r5, r7, r2)
            int r0 = r7.f24787d
            goto L38
        L35:
            int r4 = r4 + 1
            goto L1e
        L38:
            r6.f25323b = r0
            if (r0 != r3) goto L3d
            return r2
        L3d:
            r7 = 1
            v8.z r0 = r6.f25325d
            if (r0 != 0) goto L43
            return r7
        L43:
            java.lang.Object r0 = r0.a
            int r8 = r8.b(r0)
            if (r8 == r3) goto L4c
            r2 = r7
        L4c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: t7.q.b(s7.x2, s7.x2):boolean");
    }
}
