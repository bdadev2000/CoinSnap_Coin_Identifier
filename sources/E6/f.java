package E6;

import G7.j;
import S0.k;
import android.util.Log;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.facebook.appevents.n;
import com.tools.arruler.photomeasure.camera.ruler.R;
import com.tools.arruler.ui.component.home.HomeActivity;
import com.tools.arruler.ui.component.onboarding.OnBoardingActivity;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import o1.C2493b;
import u6.AbstractC2789e;
import u6.AbstractC2799o;

/* loaded from: classes3.dex */
public final class f extends k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1047a;
    public final Object b;

    public /* synthetic */ f(Object obj, int i9) {
        this.f1047a = i9;
        this.b = obj;
    }

    @Override // S0.k
    public void a(int i9) {
        switch (this.f1047a) {
            case 2:
                ((R0.d) this.b).c(false);
                return;
            case 3:
                try {
                    Iterator it = ((ArrayList) this.b).iterator();
                    while (it.hasNext()) {
                        ((k) it.next()).a(i9);
                    }
                    return;
                } catch (ConcurrentModificationException e4) {
                    throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e4);
                }
            default:
                return;
        }
    }

    @Override // S0.k
    public void b(int i9, float f9, int i10) {
        switch (this.f1047a) {
            case 3:
                try {
                    Iterator it = ((ArrayList) this.b).iterator();
                    while (it.hasNext()) {
                        ((k) it.next()).b(i9, f9, i10);
                    }
                    return;
                } catch (ConcurrentModificationException e4) {
                    throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e4);
                }
            default:
                return;
        }
    }

    @Override // S0.k
    public final void c(int i9) {
        R6.a aVar;
        switch (this.f1047a) {
            case 0:
                HomeActivity homeActivity = (HomeActivity) this.b;
                boolean isChecked = ((AbstractC2789e) homeActivity.k()).f23290s.isChecked();
                if (!isChecked && ((AbstractC2789e) homeActivity.k()).f23291t.getCurrentItem() == 1) {
                    ((AbstractC2789e) homeActivity.k()).f23290s.setChecked(true);
                    return;
                } else {
                    if (isChecked && ((AbstractC2789e) homeActivity.k()).f23291t.getCurrentItem() == 0) {
                        ((AbstractC2789e) homeActivity.k()).f23290s.setChecked(false);
                        return;
                    }
                    return;
                }
            case 1:
                C2493b c2493b = n.b;
                OnBoardingActivity onBoardingActivity = (OnBoardingActivity) this.b;
                if (c2493b != null) {
                    if (i9 != 0) {
                        if (i9 != 1) {
                            if (i9 != 2) {
                                if (i9 != 3) {
                                    if (i9 == 4) {
                                        ((AbstractC2799o) onBoardingActivity.k()).f23371v.setText(onBoardingActivity.getString(R.string.get_started));
                                        ((AbstractC2799o) onBoardingActivity.k()).f23371v.setAllCaps(false);
                                        ((AbstractC2799o) onBoardingActivity.k()).f23372w.setImageResource(R.drawable.ic_view_un_select);
                                        ((AbstractC2799o) onBoardingActivity.k()).f23373x.setImageResource(R.drawable.ic_view_un_select);
                                        ((AbstractC2799o) onBoardingActivity.k()).f23374y.setImageResource(R.drawable.ic_view_un_select);
                                        ((AbstractC2799o) onBoardingActivity.k()).f23375z.setImageResource(R.drawable.ic_view_select);
                                        LinearLayout linearLayout = ((AbstractC2799o) onBoardingActivity.k()).f23368s;
                                        j.d(linearLayout, "llCircle");
                                        com.bumptech.glide.d.a0(linearLayout);
                                        if (n.f13500d != null) {
                                            onBoardingActivity.f19678g = false;
                                            Log.e("VinhTQ", "onPageSelected: page4");
                                            onBoardingActivity.t(n.f13500d);
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                                ((AbstractC2799o) onBoardingActivity.k()).f23371v.setText(onBoardingActivity.getString(R.string.next));
                                ((AbstractC2799o) onBoardingActivity.k()).f23371v.setAllCaps(true);
                                ((AbstractC2799o) onBoardingActivity.k()).f23372w.setImageResource(R.drawable.ic_view_un_select);
                                ((AbstractC2799o) onBoardingActivity.k()).f23373x.setImageResource(R.drawable.ic_view_un_select);
                                ((AbstractC2799o) onBoardingActivity.k()).f23374y.setImageResource(R.drawable.ic_view_select);
                                ((AbstractC2799o) onBoardingActivity.k()).f23375z.setImageResource(R.drawable.ic_view_un_select);
                                FrameLayout frameLayout = ((AbstractC2799o) onBoardingActivity.k()).f23367r;
                                j.d(frameLayout, "frAds");
                                com.bumptech.glide.d.M(frameLayout);
                                LinearLayout linearLayout2 = ((AbstractC2799o) onBoardingActivity.k()).f23368s;
                                j.d(linearLayout2, "llCircle");
                                com.bumptech.glide.d.a0(linearLayout2);
                                return;
                            }
                            LottieAnimationView lottieAnimationView = ((AbstractC2799o) onBoardingActivity.k()).f23369t;
                            j.d(lottieAnimationView, "lottieSwipeToNext");
                            com.bumptech.glide.d.M(lottieAnimationView);
                            FrameLayout frameLayout2 = ((AbstractC2799o) onBoardingActivity.k()).f23367r;
                            j.d(frameLayout2, "frAds");
                            com.bumptech.glide.d.M(frameLayout2);
                            LinearLayout linearLayout3 = ((AbstractC2799o) onBoardingActivity.k()).f23368s;
                            j.d(linearLayout3, "llCircle");
                            com.bumptech.glide.d.M(linearLayout3);
                            C2493b c2493b2 = n.b;
                            if (c2493b2 != null && (aVar = onBoardingActivity.f19677f) != null) {
                                aVar.l = c2493b2;
                                aVar.notifyDataSetChanged();
                                return;
                            }
                            return;
                        }
                        onBoardingActivity.f19679h = true;
                        ((AbstractC2799o) onBoardingActivity.k()).f23371v.setText(onBoardingActivity.getString(R.string.next));
                        ((AbstractC2799o) onBoardingActivity.k()).f23371v.setAllCaps(true);
                        ((AbstractC2799o) onBoardingActivity.k()).f23372w.setImageResource(R.drawable.ic_view_un_select);
                        ((AbstractC2799o) onBoardingActivity.k()).f23373x.setImageResource(R.drawable.ic_view_select);
                        ((AbstractC2799o) onBoardingActivity.k()).f23374y.setImageResource(R.drawable.ic_view_un_select);
                        ((AbstractC2799o) onBoardingActivity.k()).f23375z.setImageResource(R.drawable.ic_view_un_select);
                        FrameLayout frameLayout3 = ((AbstractC2799o) onBoardingActivity.k()).f23367r;
                        j.d(frameLayout3, "frAds");
                        com.bumptech.glide.d.M(frameLayout3);
                        LinearLayout linearLayout4 = ((AbstractC2799o) onBoardingActivity.k()).f23368s;
                        j.d(linearLayout4, "llCircle");
                        com.bumptech.glide.d.a0(linearLayout4);
                        LottieAnimationView lottieAnimationView2 = ((AbstractC2799o) onBoardingActivity.k()).f23369t;
                        j.d(lottieAnimationView2, "lottieSwipeToNext");
                        com.bumptech.glide.d.a0(lottieAnimationView2);
                        return;
                    }
                    ((AbstractC2799o) onBoardingActivity.k()).f23371v.setText(onBoardingActivity.getString(R.string.next));
                    ((AbstractC2799o) onBoardingActivity.k()).f23371v.setAllCaps(false);
                    ((AbstractC2799o) onBoardingActivity.k()).f23372w.setImageResource(R.drawable.ic_view_select);
                    ((AbstractC2799o) onBoardingActivity.k()).f23373x.setImageResource(R.drawable.ic_view_un_select);
                    ((AbstractC2799o) onBoardingActivity.k()).f23374y.setImageResource(R.drawable.ic_view_un_select);
                    ((AbstractC2799o) onBoardingActivity.k()).f23375z.setImageResource(R.drawable.ic_view_un_select);
                    LinearLayout linearLayout5 = ((AbstractC2799o) onBoardingActivity.k()).f23368s;
                    j.d(linearLayout5, "llCircle");
                    com.bumptech.glide.d.a0(linearLayout5);
                    if (onBoardingActivity.f19679h) {
                        onBoardingActivity.f19678g = false;
                        onBoardingActivity.t(n.f13499c);
                        return;
                    }
                    return;
                }
                if (i9 != 0) {
                    if (i9 != 1) {
                        if (i9 != 2) {
                            if (i9 == 3) {
                                ((AbstractC2799o) onBoardingActivity.k()).f23371v.setText(onBoardingActivity.getString(R.string.get_started));
                                ((AbstractC2799o) onBoardingActivity.k()).f23371v.setAllCaps(false);
                                ((AbstractC2799o) onBoardingActivity.k()).f23372w.setImageResource(R.drawable.ic_view_un_select);
                                ((AbstractC2799o) onBoardingActivity.k()).f23373x.setImageResource(R.drawable.ic_view_un_select);
                                ((AbstractC2799o) onBoardingActivity.k()).f23374y.setImageResource(R.drawable.ic_view_un_select);
                                ((AbstractC2799o) onBoardingActivity.k()).f23375z.setImageResource(R.drawable.ic_view_select);
                                if (n.f13500d != null) {
                                    onBoardingActivity.f19678g = false;
                                    Log.e("VinhTQ", "onPageSelected: page4");
                                    onBoardingActivity.t(n.f13500d);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        ((AbstractC2799o) onBoardingActivity.k()).f23371v.setText(onBoardingActivity.getString(R.string.next));
                        ((AbstractC2799o) onBoardingActivity.k()).f23371v.setAllCaps(true);
                        ((AbstractC2799o) onBoardingActivity.k()).f23372w.setImageResource(R.drawable.ic_view_un_select);
                        ((AbstractC2799o) onBoardingActivity.k()).f23373x.setImageResource(R.drawable.ic_view_un_select);
                        ((AbstractC2799o) onBoardingActivity.k()).f23374y.setImageResource(R.drawable.ic_view_select);
                        ((AbstractC2799o) onBoardingActivity.k()).f23375z.setImageResource(R.drawable.ic_view_un_select);
                        FrameLayout frameLayout4 = ((AbstractC2799o) onBoardingActivity.k()).f23367r;
                        j.d(frameLayout4, "frAds");
                        com.bumptech.glide.d.M(frameLayout4);
                        return;
                    }
                    onBoardingActivity.f19679h = true;
                    ((AbstractC2799o) onBoardingActivity.k()).f23371v.setText(onBoardingActivity.getString(R.string.next));
                    ((AbstractC2799o) onBoardingActivity.k()).f23371v.setAllCaps(true);
                    ((AbstractC2799o) onBoardingActivity.k()).f23372w.setImageResource(R.drawable.ic_view_un_select);
                    ((AbstractC2799o) onBoardingActivity.k()).f23373x.setImageResource(R.drawable.ic_view_select);
                    ((AbstractC2799o) onBoardingActivity.k()).f23374y.setImageResource(R.drawable.ic_view_un_select);
                    ((AbstractC2799o) onBoardingActivity.k()).f23375z.setImageResource(R.drawable.ic_view_un_select);
                    FrameLayout frameLayout5 = ((AbstractC2799o) onBoardingActivity.k()).f23367r;
                    j.d(frameLayout5, "frAds");
                    com.bumptech.glide.d.M(frameLayout5);
                    return;
                }
                ((AbstractC2799o) onBoardingActivity.k()).f23371v.setText(onBoardingActivity.getString(R.string.next));
                ((AbstractC2799o) onBoardingActivity.k()).f23371v.setAllCaps(false);
                ((AbstractC2799o) onBoardingActivity.k()).f23372w.setImageResource(R.drawable.ic_view_select);
                ((AbstractC2799o) onBoardingActivity.k()).f23373x.setImageResource(R.drawable.ic_view_un_select);
                ((AbstractC2799o) onBoardingActivity.k()).f23374y.setImageResource(R.drawable.ic_view_un_select);
                ((AbstractC2799o) onBoardingActivity.k()).f23375z.setImageResource(R.drawable.ic_view_un_select);
                if (onBoardingActivity.f19679h) {
                    onBoardingActivity.f19678g = false;
                    onBoardingActivity.t(n.f13499c);
                    return;
                }
                return;
            case 2:
                ((R0.d) this.b).c(false);
                return;
            default:
                try {
                    Iterator it = ((ArrayList) this.b).iterator();
                    while (it.hasNext()) {
                        ((k) it.next()).c(i9);
                    }
                    return;
                } catch (ConcurrentModificationException e4) {
                    throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e4);
                }
        }
    }

    public f() {
        this.f1047a = 3;
        this.b = new ArrayList(3);
    }
}
