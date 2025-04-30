package I6;

import F7.p;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.k;
import com.bumptech.glide.m;
import com.tools.arruler.ui.component.imagedetail.ImageDetailActivity;
import i2.C2341d;
import java.io.File;
import t7.AbstractC2712a;
import t7.y;
import u6.AbstractC2793i;
import y7.AbstractC2960i;

/* loaded from: classes3.dex */
public final class b extends AbstractC2960i implements p {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f1469g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ImageDetailActivity f1470h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ImageDetailActivity imageDetailActivity, w7.f fVar) {
        super(2, fVar);
        this.f1470h = imageDetailActivity;
    }

    @Override // y7.AbstractC2952a
    public final w7.f c(Object obj, w7.f fVar) {
        b bVar = new b(this.f1470h, fVar);
        bVar.f1469g = obj;
        return bVar;
    }

    @Override // F7.p
    public final Object g(Object obj, Object obj2) {
        b bVar = (b) c((g) obj, (w7.f) obj2);
        y yVar = y.f23029a;
        bVar.i(yVar);
        return yVar;
    }

    @Override // y7.AbstractC2952a
    public final Object i(Object obj) {
        File file;
        AbstractC2712a.f(obj);
        g gVar = (g) this.f1469g;
        String str = gVar.f1476a;
        Long l = null;
        if (str != null) {
            file = new File(str);
        } else {
            file = null;
        }
        ImageDetailActivity imageDetailActivity = this.f1470h;
        j2.g.c(imageDetailActivity, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        m d2 = com.bumptech.glide.b.a(imageDetailActivity).f12794g.d(imageDetailActivity);
        d2.getClass();
        k y4 = new k(d2.b, d2, Drawable.class, d2.f12867c).y(gVar.f1476a);
        if (file != null) {
            l = new Long(file.lastModified());
        }
        ((k) ((k) y4.m(new C2341d(String.valueOf(l)))).h(1200, 1200)).w(((AbstractC2793i) imageDetailActivity.k()).f23323r);
        return y.f23029a;
    }
}
