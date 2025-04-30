package K6;

import F7.p;
import G7.j;
import android.os.Handler;
import android.os.Looper;
import android.widget.FrameLayout;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.tools.arruler.ui.component.language.LanguageActivity;
import r6.EnumC2680a;
import t7.AbstractC2712a;
import t7.y;
import u6.AbstractC2797m;
import y7.AbstractC2960i;

/* loaded from: classes3.dex */
public final class f extends AbstractC2960i implements p {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f1656g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ LanguageActivity f1657h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(LanguageActivity languageActivity, w7.f fVar) {
        super(2, fVar);
        this.f1657h = languageActivity;
    }

    @Override // y7.AbstractC2952a
    public final w7.f c(Object obj, w7.f fVar) {
        f fVar2 = new f(this.f1657h, fVar);
        fVar2.f1656g = obj;
        return fVar2;
    }

    @Override // F7.p
    public final Object g(Object obj, Object obj2) {
        f fVar = (f) c((EnumC2680a) obj, (w7.f) obj2);
        y yVar = y.f23029a;
        fVar.i(yVar);
        return yVar;
    }

    @Override // y7.AbstractC2952a
    public final Object i(Object obj) {
        int i9 = 2;
        AbstractC2712a.f(obj);
        int ordinal = ((EnumC2680a) this.f1656g).ordinal();
        if (ordinal != 0 && ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    throw new RuntimeException();
                }
            } else {
                LanguageActivity languageActivity = this.f1657h;
                ShimmerFrameLayout shimmerFrameLayout = ((AbstractC2797m) languageActivity.k()).f23359t.f23197q;
                j.d(shimmerFrameLayout, "shimmerNativeLarge");
                com.bumptech.glide.d.a0(shimmerFrameLayout);
                FrameLayout frameLayout = ((AbstractC2797m) languageActivity.k()).f23356q;
                j.d(frameLayout, "frAds");
                com.bumptech.glide.d.M(frameLayout);
                new Handler(Looper.getMainLooper()).postDelayed(new a(languageActivity, i9), 300L);
            }
        }
        return y.f23029a;
    }
}
