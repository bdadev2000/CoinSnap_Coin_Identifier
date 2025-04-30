package r6;

import F7.p;
import Q7.InterfaceC0253v;
import T7.o;
import T7.s;
import android.widget.FrameLayout;
import com.facebook.shimmer.ShimmerFrameLayout;
import k.AbstractActivityC2417f;
import t7.AbstractC2712a;
import t7.y;
import x7.EnumC2928a;
import y7.AbstractC2960i;

/* loaded from: classes3.dex */
public final class e extends AbstractC2960i implements p {

    /* renamed from: g, reason: collision with root package name */
    public int f22907g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ o f22908h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ FrameLayout f22909i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ ShimmerFrameLayout f22910j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ String f22911k;
    public final /* synthetic */ AbstractActivityC2417f l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(o oVar, FrameLayout frameLayout, ShimmerFrameLayout shimmerFrameLayout, String str, AbstractActivityC2417f abstractActivityC2417f, w7.f fVar) {
        super(2, fVar);
        this.f22908h = oVar;
        this.f22909i = frameLayout;
        this.f22910j = shimmerFrameLayout;
        this.f22911k = str;
        this.l = abstractActivityC2417f;
    }

    @Override // y7.AbstractC2952a
    public final w7.f c(Object obj, w7.f fVar) {
        return new e(this.f22908h, this.f22909i, this.f22910j, this.f22911k, this.l, fVar);
    }

    @Override // F7.p
    public final Object g(Object obj, Object obj2) {
        return ((e) c((InterfaceC0253v) obj, (w7.f) obj2)).i(y.f23029a);
    }

    @Override // y7.AbstractC2952a
    public final Object i(Object obj) {
        EnumC2928a enumC2928a = EnumC2928a.b;
        int i9 = this.f22907g;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC2712a.f(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC2712a.f(obj);
            d dVar = new d(this.f22909i, this.f22910j, this.f22911k, this.l, null);
            this.f22907g = 1;
            if (s.b(this.f22908h, dVar, this) == enumC2928a) {
                return enumC2928a;
            }
        }
        return y.f23029a;
    }
}
