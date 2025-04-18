package m3;

import com.airbnb.lottie.LottieAnimationView;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class i implements z {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final WeakReference f21550b;

    public i(LottieAnimationView lottieAnimationView, int i10) {
        this.a = i10;
        if (i10 != 1) {
            this.f21550b = new WeakReference(lottieAnimationView);
        } else {
            this.f21550b = new WeakReference(lottieAnimationView);
        }
    }

    @Override // m3.z
    public final void onResult(Object obj) {
        WeakReference weakReference = this.f21550b;
        switch (this.a) {
            case 0:
                Throwable th2 = (Throwable) obj;
                LottieAnimationView lottieAnimationView = (LottieAnimationView) weakReference.get();
                if (lottieAnimationView != null) {
                    int i10 = lottieAnimationView.f2923f;
                    if (i10 != 0) {
                        lottieAnimationView.setImageResource(i10);
                    }
                    z zVar = lottieAnimationView.f2922d;
                    if (zVar == null) {
                        zVar = LottieAnimationView.f2919q;
                    }
                    zVar.onResult(th2);
                    return;
                }
                return;
            default:
                j jVar = (j) obj;
                LottieAnimationView lottieAnimationView2 = (LottieAnimationView) weakReference.get();
                if (lottieAnimationView2 != null) {
                    lottieAnimationView2.setComposition(jVar);
                    return;
                }
                return;
        }
    }
}
