package K6;

import G7.j;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.tools.arruler.ui.component.language.LanguageActivity;
import q.C2609l;
import u6.AbstractC2797m;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ LanguageActivity f1647c;

    public /* synthetic */ a(LanguageActivity languageActivity, int i9) {
        this.b = i9;
        this.f1647c = languageActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2609l c2609l = r6.h.f22921e;
        LanguageActivity languageActivity = this.f1647c;
        switch (this.b) {
            case 0:
                int i9 = LanguageActivity.m;
                j.e(languageActivity, "this$0");
                ImageView imageView = ((AbstractC2797m) languageActivity.k()).f23357r;
                j.d(imageView, "imvTick");
                com.bumptech.glide.d.a0(imageView);
                return;
            case 1:
                FrameLayout frameLayout = ((AbstractC2797m) languageActivity.k()).f23356q;
                j.d(frameLayout, "frAds");
                com.bumptech.glide.d.a0(frameLayout);
                ShimmerFrameLayout shimmerFrameLayout = ((AbstractC2797m) languageActivity.k()).f23359t.f23197q;
                j.d(shimmerFrameLayout, "shimmerNativeLarge");
                com.bumptech.glide.d.M(shimmerFrameLayout);
                r6.h i10 = c2609l.i();
                FrameLayout frameLayout2 = ((AbstractC2797m) languageActivity.k()).f23356q;
                j.d(frameLayout2, "frAds");
                ShimmerFrameLayout shimmerFrameLayout2 = ((AbstractC2797m) languageActivity.k()).f23359t.f23197q;
                j.d(shimmerFrameLayout2, "shimmerNativeLarge");
                r6.h.c(i10, languageActivity, "ca-app-pub-6691965685689933/8589803081", frameLayout2, shimmerFrameLayout2);
                return;
            default:
                FrameLayout frameLayout3 = ((AbstractC2797m) languageActivity.k()).f23356q;
                j.d(frameLayout3, "frAds");
                com.bumptech.glide.d.a0(frameLayout3);
                ShimmerFrameLayout shimmerFrameLayout3 = ((AbstractC2797m) languageActivity.k()).f23359t.f23197q;
                j.d(shimmerFrameLayout3, "shimmerNativeLarge");
                com.bumptech.glide.d.M(shimmerFrameLayout3);
                r6.h i11 = c2609l.i();
                FrameLayout frameLayout4 = ((AbstractC2797m) languageActivity.k()).f23356q;
                j.d(frameLayout4, "frAds");
                ShimmerFrameLayout shimmerFrameLayout4 = ((AbstractC2797m) languageActivity.k()).f23359t.f23197q;
                j.d(shimmerFrameLayout4, "shimmerNativeLarge");
                r6.h.c(i11, languageActivity, "ca-app-pub-6691965685689933/7276721417", frameLayout4, shimmerFrameLayout4);
                return;
        }
    }
}
