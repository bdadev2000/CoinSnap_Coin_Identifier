package v1;

import com.airbnb.lottie.LottieAnimationView;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class h implements x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23483a;
    public final WeakReference b;

    public h(LottieAnimationView lottieAnimationView, int i9) {
        this.f23483a = i9;
        switch (i9) {
            case 1:
                this.b = new WeakReference(lottieAnimationView);
                return;
            default:
                this.b = new WeakReference(lottieAnimationView);
                return;
        }
    }

    @Override // v1.x
    public final void onResult(Object obj) {
        switch (this.f23483a) {
            case 0:
                Throwable th = (Throwable) obj;
                LottieAnimationView lottieAnimationView = (LottieAnimationView) this.b.get();
                if (lottieAnimationView != null) {
                    int i9 = lottieAnimationView.f5600f;
                    if (i9 != 0) {
                        lottieAnimationView.setImageResource(i9);
                    }
                    x xVar = lottieAnimationView.f5599d;
                    if (xVar == null) {
                        xVar = LottieAnimationView.f5597p;
                    }
                    xVar.onResult(th);
                    return;
                }
                return;
            default:
                i iVar = (i) obj;
                LottieAnimationView lottieAnimationView2 = (LottieAnimationView) this.b.get();
                if (lottieAnimationView2 != null) {
                    lottieAnimationView2.setComposition(iVar);
                    return;
                }
                return;
        }
    }
}
