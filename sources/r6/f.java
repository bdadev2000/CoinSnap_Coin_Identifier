package r6;

import F7.p;
import Q7.InterfaceC0253v;
import T7.o;
import android.widget.FrameLayout;
import androidx.lifecycle.EnumC0504n;
import androidx.lifecycle.V;
import com.facebook.shimmer.ShimmerFrameLayout;
import k.AbstractActivityC2417f;
import t7.AbstractC2712a;
import t7.y;
import x7.EnumC2928a;
import y7.AbstractC2960i;

/* loaded from: classes3.dex */
public final class f extends AbstractC2960i implements p {

    /* renamed from: g, reason: collision with root package name */
    public int f22912g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC2417f f22913h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ o f22914i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ FrameLayout f22915j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ ShimmerFrameLayout f22916k;
    public final /* synthetic */ String l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(o oVar, FrameLayout frameLayout, ShimmerFrameLayout shimmerFrameLayout, String str, AbstractActivityC2417f abstractActivityC2417f, w7.f fVar) {
        super(2, fVar);
        this.f22913h = abstractActivityC2417f;
        this.f22914i = oVar;
        this.f22915j = frameLayout;
        this.f22916k = shimmerFrameLayout;
        this.l = str;
    }

    @Override // y7.AbstractC2952a
    public final w7.f c(Object obj, w7.f fVar) {
        return new f(this.f22914i, this.f22915j, this.f22916k, this.l, this.f22913h, fVar);
    }

    @Override // F7.p
    public final Object g(Object obj, Object obj2) {
        return ((f) c((InterfaceC0253v) obj, (w7.f) obj2)).i(y.f23029a);
    }

    @Override // y7.AbstractC2952a
    public final Object i(Object obj) {
        EnumC2928a enumC2928a = EnumC2928a.b;
        int i9 = this.f22912g;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC2712a.f(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC2712a.f(obj);
            EnumC0504n enumC0504n = EnumC0504n.f4894f;
            o oVar = this.f22914i;
            FrameLayout frameLayout = this.f22915j;
            ShimmerFrameLayout shimmerFrameLayout = this.f22916k;
            String str = this.l;
            AbstractActivityC2417f abstractActivityC2417f = this.f22913h;
            e eVar = new e(oVar, frameLayout, shimmerFrameLayout, str, abstractActivityC2417f, null);
            this.f22912g = 1;
            if (V.j(abstractActivityC2417f, enumC0504n, eVar, this) == enumC2928a) {
                return enumC2928a;
            }
        }
        return y.f23029a;
    }
}
