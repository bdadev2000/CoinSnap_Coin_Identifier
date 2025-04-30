package r6;

import G7.j;
import Q7.AbstractC0255x;
import T7.o;
import T7.r;
import android.widget.FrameLayout;
import androidx.lifecycle.V;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.tools.arruler.photomeasure.camera.ruler.R;
import java.util.LinkedHashMap;
import k.AbstractActivityC2417f;
import q.C2609l;
import t7.C2720i;
import t7.C2725n;

/* loaded from: classes3.dex */
public final class h {

    /* renamed from: e, reason: collision with root package name */
    public static final C2609l f22921e = new Object();

    /* renamed from: f, reason: collision with root package name */
    public static h f22922f;

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f22923a = new LinkedHashMap();
    public final LinkedHashMap b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f22924c = new LinkedHashMap();

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f22925d = new LinkedHashMap();

    public static void c(h hVar, AbstractActivityC2417f abstractActivityC2417f, String str, FrameLayout frameLayout, ShimmerFrameLayout shimmerFrameLayout) {
        j.e(abstractActivityC2417f, "activity");
        j.e(frameLayout, "adPlaceHolder");
        j.e(shimmerFrameLayout, "containerShimmerLoading");
        LinkedHashMap linkedHashMap = hVar.f22925d;
        Boolean bool = (Boolean) linkedHashMap.get(new C2725n(abstractActivityC2417f.getClass(), str, Integer.valueOf(R.layout.layout_native_language)));
        if (bool == null || !bool.booleanValue()) {
            o a6 = f22921e.i().a(str);
            linkedHashMap.put(new C2725n(abstractActivityC2417f.getClass(), str, Integer.valueOf(R.layout.layout_native_language)), Boolean.TRUE);
            AbstractC0255x.l(V.f(abstractActivityC2417f), null, null, new f(a6, frameLayout, shimmerFrameLayout, str, abstractActivityC2417f, null), 3);
            abstractActivityC2417f.getLifecycle().a(new g(hVar, str, false, abstractActivityC2417f));
        }
    }

    public final o a(String str) {
        o oVar = (o) this.b.get(new C2720i(str, Integer.valueOf(R.layout.layout_native_language)));
        if (oVar == null) {
            return new r(EnumC2680a.b);
        }
        return oVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0065, code lost:
    
        if (r10 != null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0067, code lost:
    
        r3 = (T7.r) r10;
        r5 = r3.getValue();
        r6 = (r6.EnumC2680a) r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0075, code lost:
    
        if (r3.b(r5, r4) == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007b, code lost:
    
        if (android.support.v4.media.session.a.v(r8) == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0083, code lost:
    
        if (p1.C2538b.a().m != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0085, code lost:
    
        r10 = n1.C2475f.p();
        r2 = new n1.C2470a(3, r7, r0);
        r10.getClass();
        n1.C2475f.t(r8, r9, com.tools.arruler.photomeasure.camera.ruler.R.layout.layout_native_language, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b0, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0096, code lost:
    
        r8 = (T7.o) r2.get(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x009c, code lost:
    
        if (r8 == null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x009e, code lost:
    
        r9 = (T7.r) r8;
        r10 = r9.getValue();
        r0 = (r6.EnumC2680a) r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ae, code lost:
    
        if (r9.b(r10, r6.EnumC2680a.f22893f) == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(android.app.Activity r8, java.lang.String r9, boolean r10) {
        /*
            r7 = this;
            java.lang.String r0 = "activity"
            G7.j.e(r8, r0)
            t7.i r0 = new t7.i
            r1 = 2131558527(0x7f0d007f, float:1.8742372E38)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            r0.<init>(r9, r2)
            java.util.LinkedHashMap r2 = r7.b
            java.lang.Object r3 = r2.get(r0)
            if (r3 != 0) goto L23
            r6.a r3 = r6.EnumC2680a.b
            T7.r r4 = new T7.r
            r4.<init>(r3)
            r2.put(r0, r4)
        L23:
            java.lang.Object r3 = r2.get(r0)
            T7.o r3 = (T7.o) r3
            if (r3 == 0) goto L34
            T7.r r3 = (T7.r) r3
            java.lang.Object r3 = r3.getValue()
            r6.a r3 = (r6.EnumC2680a) r3
            goto L35
        L34:
            r3 = 0
        L35:
            r6.a r4 = r6.EnumC2680a.f22891c
            if (r3 != r4) goto L3a
            return
        L3a:
            java.util.LinkedHashMap r3 = r7.f22923a
            java.lang.Object r3 = r3.get(r0)
            if (r3 == 0) goto L5f
            if (r10 != 0) goto L5f
            java.lang.Object r8 = r2.get(r0)
            T7.o r8 = (T7.o) r8
            if (r8 == 0) goto L5e
        L4c:
            r9 = r8
            T7.r r9 = (T7.r) r9
            java.lang.Object r10 = r9.getValue()
            r0 = r10
            r6.a r0 = (r6.EnumC2680a) r0
            r6.a r0 = r6.EnumC2680a.f22892d
            boolean r9 = r9.b(r10, r0)
            if (r9 == 0) goto L4c
        L5e:
            return
        L5f:
            java.lang.Object r10 = r2.get(r0)
            T7.o r10 = (T7.o) r10
            if (r10 == 0) goto L77
        L67:
            r3 = r10
            T7.r r3 = (T7.r) r3
            java.lang.Object r5 = r3.getValue()
            r6 = r5
            r6.a r6 = (r6.EnumC2680a) r6
            boolean r3 = r3.b(r5, r4)
            if (r3 == 0) goto L67
        L77:
            boolean r10 = android.support.v4.media.session.a.v(r8)
            if (r10 == 0) goto L96
            p1.b r10 = p1.C2538b.a()
            boolean r10 = r10.m
            if (r10 != 0) goto L96
            n1.f r10 = n1.C2475f.p()
            n1.a r2 = new n1.a
            r3 = 3
            r2.<init>(r3, r7, r0)
            r10.getClass()
            n1.C2475f.t(r8, r9, r1, r2)
            goto Lb0
        L96:
            java.lang.Object r8 = r2.get(r0)
            T7.o r8 = (T7.o) r8
            if (r8 == 0) goto Lb0
        L9e:
            r9 = r8
            T7.r r9 = (T7.r) r9
            java.lang.Object r10 = r9.getValue()
            r0 = r10
            r6.a r0 = (r6.EnumC2680a) r0
            r6.a r0 = r6.EnumC2680a.f22893f
            boolean r9 = r9.b(r10, r0)
            if (r9 == 0) goto L9e
        Lb0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: r6.h.b(android.app.Activity, java.lang.String, boolean):void");
    }
}
