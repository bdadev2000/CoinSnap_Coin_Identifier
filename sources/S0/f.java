package S0;

import androidx.recyclerview.widget.AbstractC0519b0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

/* loaded from: classes.dex */
public final class f extends AbstractC0519b0 {

    /* renamed from: a, reason: collision with root package name */
    public k f2776a;
    public final ViewPager2 b;

    /* renamed from: c, reason: collision with root package name */
    public final RecyclerView f2777c;

    /* renamed from: d, reason: collision with root package name */
    public final LinearLayoutManager f2778d;

    /* renamed from: e, reason: collision with root package name */
    public int f2779e;

    /* renamed from: f, reason: collision with root package name */
    public int f2780f;

    /* renamed from: g, reason: collision with root package name */
    public final e f2781g;

    /* renamed from: h, reason: collision with root package name */
    public int f2782h;

    /* renamed from: i, reason: collision with root package name */
    public int f2783i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f2784j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f2785k;
    public boolean l;
    public boolean m;

    /* JADX WARN: Type inference failed for: r1v4, types: [S0.e, java.lang.Object] */
    public f(ViewPager2 viewPager2) {
        this.b = viewPager2;
        n nVar = viewPager2.l;
        this.f2777c = nVar;
        this.f2778d = (LinearLayoutManager) nVar.getLayoutManager();
        this.f2781g = new Object();
        d();
    }

    @Override // androidx.recyclerview.widget.AbstractC0519b0
    public final void a(RecyclerView recyclerView, int i9) {
        boolean z8;
        k kVar;
        k kVar2;
        int i10 = this.f2779e;
        boolean z9 = true;
        if ((i10 != 1 || this.f2780f != 1) && i9 == 1) {
            this.m = false;
            this.f2779e = 1;
            int i11 = this.f2783i;
            if (i11 != -1) {
                this.f2782h = i11;
                this.f2783i = -1;
            } else if (this.f2782h == -1) {
                this.f2782h = this.f2778d.findFirstVisibleItemPosition();
            }
            c(1);
            return;
        }
        if (i10 != 1 && i10 != 4) {
            z8 = false;
        } else {
            z8 = true;
        }
        if (z8 && i9 == 2) {
            if (this.f2785k) {
                c(2);
                this.f2784j = true;
                return;
            }
            return;
        }
        if (i10 != 1 && i10 != 4) {
            z9 = false;
        }
        e eVar = this.f2781g;
        if (z9 && i9 == 0) {
            e();
            if (!this.f2785k) {
                int i12 = eVar.f2774a;
                if (i12 != -1 && (kVar2 = this.f2776a) != null) {
                    kVar2.b(i12, 0.0f, 0);
                }
            } else if (eVar.f2775c == 0) {
                int i13 = this.f2782h;
                int i14 = eVar.f2774a;
                if (i13 != i14 && (kVar = this.f2776a) != null) {
                    kVar.c(i14);
                }
            }
            c(0);
            d();
        }
        if (this.f2779e == 2 && i9 == 0 && this.l) {
            e();
            if (eVar.f2775c == 0) {
                int i15 = this.f2783i;
                int i16 = eVar.f2774a;
                if (i15 != i16) {
                    if (i16 == -1) {
                        i16 = 0;
                    }
                    k kVar3 = this.f2776a;
                    if (kVar3 != null) {
                        kVar3.c(i16);
                    }
                }
                c(0);
                d();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0026, code lost:
    
        if (r7 == r8) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0038  */
    @Override // androidx.recyclerview.widget.AbstractC0519b0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(androidx.recyclerview.widget.RecyclerView r6, int r7, int r8) {
        /*
            r5 = this;
            r6 = 1
            r5.f2785k = r6
            r5.e()
            boolean r0 = r5.f2784j
            S0.e r1 = r5.f2781g
            r2 = -1
            r3 = 0
            if (r0 == 0) goto L40
            r5.f2784j = r3
            if (r8 > 0) goto L28
            if (r8 != 0) goto L30
            if (r7 >= 0) goto L18
            r7 = r6
            goto L19
        L18:
            r7 = r3
        L19:
            androidx.viewpager2.widget.ViewPager2 r8 = r5.b
            S0.j r8 = r8.f5172i
            int r8 = r8.getLayoutDirection()
            if (r8 != r6) goto L25
            r8 = r6
            goto L26
        L25:
            r8 = r3
        L26:
            if (r7 != r8) goto L30
        L28:
            int r7 = r1.f2775c
            if (r7 == 0) goto L30
            int r7 = r1.f2774a
            int r7 = r7 + r6
            goto L32
        L30:
            int r7 = r1.f2774a
        L32:
            r5.f2783i = r7
            int r8 = r5.f2782h
            if (r8 == r7) goto L50
            S0.k r8 = r5.f2776a
            if (r8 == 0) goto L50
            r8.c(r7)
            goto L50
        L40:
            int r7 = r5.f2779e
            if (r7 != 0) goto L50
            int r7 = r1.f2774a
            if (r7 != r2) goto L49
            r7 = r3
        L49:
            S0.k r8 = r5.f2776a
            if (r8 == 0) goto L50
            r8.c(r7)
        L50:
            int r7 = r1.f2774a
            if (r7 != r2) goto L55
            r7 = r3
        L55:
            float r8 = r1.b
            int r0 = r1.f2775c
            S0.k r4 = r5.f2776a
            if (r4 == 0) goto L60
            r4.b(r7, r8, r0)
        L60:
            int r7 = r1.f2774a
            int r8 = r5.f2783i
            if (r7 == r8) goto L68
            if (r8 != r2) goto L76
        L68:
            int r7 = r1.f2775c
            if (r7 != 0) goto L76
            int r7 = r5.f2780f
            if (r7 == r6) goto L76
            r5.c(r3)
            r5.d()
        L76:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: S0.f.b(androidx.recyclerview.widget.RecyclerView, int, int):void");
    }

    public final void c(int i9) {
        if ((this.f2779e == 3 && this.f2780f == 0) || this.f2780f == i9) {
            return;
        }
        this.f2780f = i9;
        k kVar = this.f2776a;
        if (kVar != null) {
            kVar.a(i9);
        }
    }

    public final void d() {
        this.f2779e = 0;
        this.f2780f = 0;
        e eVar = this.f2781g;
        eVar.f2774a = -1;
        eVar.b = 0.0f;
        eVar.f2775c = 0;
        this.f2782h = -1;
        this.f2783i = -1;
        this.f2784j = false;
        this.f2785k = false;
        this.m = false;
        this.l = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0124, code lost:
    
        r1 = r0.getChildCount();
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0128, code lost:
    
        if (r3 >= r1) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0132, code lost:
    
        if (S0.a.a(r0.getChildAt(r3)) != false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0134, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x013e, code lost:
    
        throw new java.lang.IllegalStateException("Page(s) contain a ViewGroup with a LayoutTransition (or animateLayoutChanges=\"true\"), which interferes with the scrolling animation. Make sure to call getLayoutTransition().setAnimateParentHierarchy(false) on all ViewGroups with a LayoutTransition before an animation is started.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x013f, code lost:
    
        r1 = java.util.Locale.US;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x014e, code lost:
    
        throw new java.lang.IllegalStateException(com.mbridge.msdk.foundation.entity.o.h(r2.f2775c, "Page can only be offset by a positive amount, not by "));
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x011b, code lost:
    
        if (r5[r1 - 1][1] >= r6) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0122, code lost:
    
        if (r0.getChildCount() <= 1) goto L63;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e() {
        /*
            Method dump skipped, instructions count: 345
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: S0.f.e():void");
    }
}
