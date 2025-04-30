package r6;

import F7.p;
import G7.j;
import android.widget.FrameLayout;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.tools.arruler.photomeasure.camera.ruler.R;
import k.AbstractActivityC2417f;
import n1.C2475f;
import o1.C2493b;
import q.C2609l;
import t7.AbstractC2712a;
import t7.C2720i;
import t7.y;
import y7.AbstractC2960i;

/* loaded from: classes3.dex */
public final class d extends AbstractC2960i implements p {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f22902g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ FrameLayout f22903h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ ShimmerFrameLayout f22904i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ String f22905j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f22906k = R.layout.layout_native_language;
    public final /* synthetic */ AbstractActivityC2417f l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(FrameLayout frameLayout, ShimmerFrameLayout shimmerFrameLayout, String str, AbstractActivityC2417f abstractActivityC2417f, w7.f fVar) {
        super(2, fVar);
        this.f22903h = frameLayout;
        this.f22904i = shimmerFrameLayout;
        this.f22905j = str;
        this.l = abstractActivityC2417f;
    }

    @Override // y7.AbstractC2952a
    public final w7.f c(Object obj, w7.f fVar) {
        d dVar = new d(this.f22903h, this.f22904i, this.f22905j, this.l, fVar);
        dVar.f22902g = obj;
        return dVar;
    }

    @Override // F7.p
    public final Object g(Object obj, Object obj2) {
        d dVar = (d) c((EnumC2680a) obj, (w7.f) obj2);
        y yVar = y.f23029a;
        dVar.i(yVar);
        return yVar;
    }

    @Override // y7.AbstractC2952a
    public final Object i(Object obj) {
        AbstractC2712a.f(obj);
        int ordinal = ((EnumC2680a) this.f22902g).ordinal();
        if (ordinal != 0) {
            ShimmerFrameLayout shimmerFrameLayout = this.f22904i;
            FrameLayout frameLayout = this.f22903h;
            if (ordinal != 1) {
                C2609l c2609l = h.f22921e;
                AbstractActivityC2417f abstractActivityC2417f = this.l;
                int i9 = this.f22906k;
                String str = this.f22905j;
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        h i10 = c2609l.i();
                        j.e(str, "nativeId");
                        C2493b c2493b = (C2493b) i10.f22923a.get(new C2720i(str, Integer.valueOf(i9)));
                        if (c2493b == null) {
                            com.bumptech.glide.d.M(frameLayout);
                            com.bumptech.glide.d.M(shimmerFrameLayout);
                        } else {
                            C2475f.p().getClass();
                            C2475f.u(abstractActivityC2417f, c2493b, frameLayout, shimmerFrameLayout);
                        }
                    } else {
                        throw new RuntimeException();
                    }
                } else {
                    h i11 = c2609l.i();
                    j.e(str, "nativeId");
                    C2493b c2493b2 = (C2493b) i11.f22923a.get(new C2720i(str, Integer.valueOf(i9)));
                    if (c2493b2 != null) {
                        C2475f.p().getClass();
                        C2475f.u(abstractActivityC2417f, c2493b2, frameLayout, shimmerFrameLayout);
                    } else {
                        com.bumptech.glide.d.M(frameLayout);
                        com.bumptech.glide.d.M(shimmerFrameLayout);
                    }
                }
            } else {
                com.bumptech.glide.d.a0(frameLayout);
                com.bumptech.glide.d.a0(shimmerFrameLayout);
            }
        }
        return y.f23029a;
    }
}
