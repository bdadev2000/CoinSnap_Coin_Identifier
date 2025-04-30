package R6;

import G7.j;
import P1.l;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.b;
import com.bumptech.glide.k;
import com.bumptech.glide.m;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.tools.arruler.models.GuideModel;
import com.tools.arruler.photomeasure.camera.ruler.R;
import d0.AbstractC2158e;
import f2.AbstractC2263a;
import f2.C2267e;
import n1.C2475f;
import o1.C2493b;
import u6.g0;
import x6.f;

/* loaded from: classes3.dex */
public final class a extends f {

    /* renamed from: k, reason: collision with root package name */
    public Activity f2762k;
    public C2493b l;

    @Override // x6.f
    public final int a() {
        return R.layout.item_on_boarding;
    }

    @Override // x6.f
    public final void c(AbstractC2158e abstractC2158e, Object obj, int i9) {
        String str;
        GuideModel guideModel = (GuideModel) obj;
        j.e(abstractC2158e, "binding");
        j.e(guideModel, "item");
        if (guideModel.getImg() != 0) {
            if (abstractC2158e instanceof g0) {
                g0 g0Var = (g0) abstractC2158e;
                FrameLayout frameLayout = g0Var.f23312q;
                j.d(frameLayout, "frAds");
                frameLayout.setVisibility(8);
                TextView textView = g0Var.f23316u;
                j.d(textView, "tvTitle");
                textView.setVisibility(0);
                ImageView imageView = g0Var.f23313r;
                j.d(imageView, "imgGuide");
                imageView.setVisibility(0);
                TextView textView2 = g0Var.f23315t;
                j.d(textView2, "tvSubText");
                textView2.setVisibility(0);
                Context context = this.f24241j;
                String str2 = null;
                if (context != null) {
                    str = context.getString(guideModel.getTitle());
                } else {
                    str = null;
                }
                textView.setText(str);
                Context context2 = this.f24241j;
                if (context2 != null) {
                    str2 = context2.getString(guideModel.getSubText());
                }
                textView2.setText(str2);
                Context context3 = this.f24241j;
                if (context3 != null) {
                    m c9 = b.a(context3).f12794g.c(context3);
                    Drawable drawable = context3.getDrawable(guideModel.getImg());
                    c9.getClass();
                    new k(c9.b, c9, Drawable.class, c9.f12867c).y(drawable).a((C2267e) new AbstractC2263a().d(l.b)).w(imageView);
                    return;
                }
                return;
            }
            return;
        }
        if (abstractC2158e instanceof g0) {
            g0 g0Var2 = (g0) abstractC2158e;
            FrameLayout frameLayout2 = g0Var2.f23312q;
            j.d(frameLayout2, "frAds");
            frameLayout2.setVisibility(0);
            TextView textView3 = g0Var2.f23316u;
            j.d(textView3, "tvTitle");
            textView3.setVisibility(8);
            ImageView imageView2 = g0Var2.f23313r;
            j.d(imageView2, "imgGuide");
            imageView2.setVisibility(8);
            TextView textView4 = g0Var2.f23315t;
            j.d(textView4, "tvSubText");
            textView4.setVisibility(8);
            C2493b c2493b = this.l;
            if (c2493b != null) {
                C2475f p2 = C2475f.p();
                ShimmerFrameLayout shimmerFrameLayout = g0Var2.f23314s.f23191q;
                Activity activity = this.f2762k;
                p2.getClass();
                C2475f.u(activity, c2493b, frameLayout2, shimmerFrameLayout);
            }
        }
    }
}
