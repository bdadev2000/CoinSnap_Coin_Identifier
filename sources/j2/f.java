package j2;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a1;
import androidx.viewpager2.widget.ViewPager2;

/* loaded from: classes.dex */
public final class f extends a1 {
    public l a;

    /* renamed from: b, reason: collision with root package name */
    public final ViewPager2 f19718b;

    /* renamed from: c, reason: collision with root package name */
    public final RecyclerView f19719c;

    /* renamed from: d, reason: collision with root package name */
    public final LinearLayoutManager f19720d;

    /* renamed from: e, reason: collision with root package name */
    public int f19721e;

    /* renamed from: f, reason: collision with root package name */
    public int f19722f;

    /* renamed from: g, reason: collision with root package name */
    public final e f19723g;

    /* renamed from: h, reason: collision with root package name */
    public int f19724h;

    /* renamed from: i, reason: collision with root package name */
    public int f19725i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f19726j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f19727k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f19728l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f19729m;

    public f(ViewPager2 viewPager2) {
        this.f19718b = viewPager2;
        p pVar = viewPager2.f2156l;
        this.f19719c = pVar;
        this.f19720d = (LinearLayoutManager) pVar.getLayoutManager();
        this.f19723g = new e();
        d();
    }

    @Override // androidx.recyclerview.widget.a1
    public final void a(RecyclerView recyclerView, int i10) {
        boolean z10;
        boolean z11;
        l lVar;
        l lVar2;
        int i11 = this.f19721e;
        boolean z12 = true;
        if ((i11 != 1 || this.f19722f != 1) && i10 == 1) {
            this.f19729m = false;
            this.f19721e = 1;
            int i12 = this.f19725i;
            if (i12 != -1) {
                this.f19724h = i12;
                this.f19725i = -1;
            } else if (this.f19724h == -1) {
                this.f19724h = this.f19720d.findFirstVisibleItemPosition();
            }
            c(1);
            return;
        }
        if (i11 != 1 && i11 != 4) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10 && i10 == 2) {
            if (this.f19727k) {
                c(2);
                this.f19726j = true;
                return;
            }
            return;
        }
        if (i11 != 1 && i11 != 4) {
            z11 = false;
        } else {
            z11 = true;
        }
        e eVar = this.f19723g;
        if (z11 && i10 == 0) {
            e();
            if (!this.f19727k) {
                int i13 = eVar.f19716b;
                if (i13 != -1 && (lVar2 = this.a) != null) {
                    lVar2.b(i13, 0.0f, 0);
                }
            } else if (eVar.f19717c == 0) {
                int i14 = this.f19724h;
                int i15 = eVar.f19716b;
                if (i14 != i15 && (lVar = this.a) != null) {
                    lVar.c(i15);
                }
            } else {
                z12 = false;
            }
            if (z12) {
                c(0);
                d();
            }
        }
        if (this.f19721e == 2 && i10 == 0 && this.f19728l) {
            e();
            if (eVar.f19717c == 0) {
                int i16 = this.f19725i;
                int i17 = eVar.f19716b;
                if (i16 != i17) {
                    if (i17 == -1) {
                        i17 = 0;
                    }
                    l lVar3 = this.a;
                    if (lVar3 != null) {
                        lVar3.c(i17);
                    }
                }
                c(0);
                d();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0026, code lost:
    
        if (r7 == r8) goto L17;
     */
    @Override // androidx.recyclerview.widget.a1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(androidx.recyclerview.widget.RecyclerView r6, int r7, int r8) {
        /*
            r5 = this;
            r6 = 1
            r5.f19727k = r6
            r5.e()
            boolean r0 = r5.f19726j
            r1 = -1
            j2.e r2 = r5.f19723g
            r3 = 0
            if (r0 == 0) goto L46
            r5.f19726j = r3
            if (r8 > 0) goto L2b
            if (r8 != 0) goto L29
            if (r7 >= 0) goto L18
            r7 = r6
            goto L19
        L18:
            r7 = r3
        L19:
            androidx.viewpager2.widget.ViewPager2 r8 = r5.f19718b
            j2.k r8 = r8.f2153i
            int r8 = r8.getLayoutDirection()
            if (r8 != r6) goto L25
            r8 = r6
            goto L26
        L25:
            r8 = r3
        L26:
            if (r7 != r8) goto L29
            goto L2b
        L29:
            r7 = r3
            goto L2c
        L2b:
            r7 = r6
        L2c:
            if (r7 == 0) goto L36
            int r7 = r2.f19717c
            if (r7 == 0) goto L36
            int r7 = r2.f19716b
            int r7 = r7 + r6
            goto L38
        L36:
            int r7 = r2.f19716b
        L38:
            r5.f19725i = r7
            int r8 = r5.f19724h
            if (r8 == r7) goto L56
            j2.l r8 = r5.a
            if (r8 == 0) goto L56
            r8.c(r7)
            goto L56
        L46:
            int r7 = r5.f19721e
            if (r7 != 0) goto L56
            int r7 = r2.f19716b
            if (r7 != r1) goto L4f
            r7 = r3
        L4f:
            j2.l r8 = r5.a
            if (r8 == 0) goto L56
            r8.c(r7)
        L56:
            int r7 = r2.f19716b
            if (r7 != r1) goto L5b
            r7 = r3
        L5b:
            float r8 = r2.a
            int r0 = r2.f19717c
            j2.l r4 = r5.a
            if (r4 == 0) goto L66
            r4.b(r7, r8, r0)
        L66:
            int r7 = r2.f19716b
            int r8 = r5.f19725i
            if (r7 == r8) goto L6e
            if (r8 != r1) goto L7c
        L6e:
            int r7 = r2.f19717c
            if (r7 != 0) goto L7c
            int r7 = r5.f19722f
            if (r7 == r6) goto L7c
            r5.c(r3)
            r5.d()
        L7c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j2.f.b(androidx.recyclerview.widget.RecyclerView, int, int):void");
    }

    public final void c(int i10) {
        if ((this.f19721e == 3 && this.f19722f == 0) || this.f19722f == i10) {
            return;
        }
        this.f19722f = i10;
        l lVar = this.a;
        if (lVar != null) {
            lVar.a(i10);
        }
    }

    public final void d() {
        this.f19721e = 0;
        this.f19722f = 0;
        e eVar = this.f19723g;
        eVar.f19716b = -1;
        eVar.a = 0.0f;
        eVar.f19717c = 0;
        this.f19724h = -1;
        this.f19725i = -1;
        this.f19726j = false;
        this.f19727k = false;
        this.f19729m = false;
        this.f19728l = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x012a, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0125, code lost:
    
        if (r6[r3 - 1][1] >= r5) goto L66;
     */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0159  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e() {
        /*
            Method dump skipped, instructions count: 379
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j2.f.e():void");
    }
}
