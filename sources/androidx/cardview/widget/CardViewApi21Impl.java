package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import androidx.annotation.RequiresApi;
import androidx.cardview.widget.CardView;

/* JADX INFO: Access modifiers changed from: package-private */
@RequiresApi
/* loaded from: classes4.dex */
public class CardViewApi21Impl implements CardViewImpl {
    @Override // androidx.cardview.widget.CardViewImpl
    public final void a(CardViewDelegate cardViewDelegate, float f2) {
        RoundRectDrawable roundRectDrawable = (RoundRectDrawable) cardViewDelegate.b();
        if (f2 == roundRectDrawable.f1366a) {
            return;
        }
        roundRectDrawable.f1366a = f2;
        roundRectDrawable.b(null);
        roundRectDrawable.invalidateSelf();
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public final float b(CardViewDelegate cardViewDelegate) {
        return ((RoundRectDrawable) cardViewDelegate.b()).f1366a;
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public final void c(CardViewDelegate cardViewDelegate, float f2) {
        cardViewDelegate.e().setElevation(f2);
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public final float d(CardViewDelegate cardViewDelegate) {
        return ((RoundRectDrawable) cardViewDelegate.b()).e;
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public final ColorStateList e(CardViewDelegate cardViewDelegate) {
        return ((RoundRectDrawable) cardViewDelegate.b()).f1371h;
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public final float f(CardViewDelegate cardViewDelegate) {
        return ((RoundRectDrawable) cardViewDelegate.b()).f1366a * 2.0f;
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public final void g(CardView.AnonymousClass1 anonymousClass1, Context context, ColorStateList colorStateList, float f2, float f3, float f4) {
        anonymousClass1.f(new RoundRectDrawable(f2, colorStateList));
        CardView cardView = CardView.this;
        cardView.setClipToOutline(true);
        cardView.setElevation(f3);
        n(anonymousClass1, f4);
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public final void h(CardViewDelegate cardViewDelegate) {
        n(cardViewDelegate, ((RoundRectDrawable) cardViewDelegate.b()).e);
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public final float i(CardViewDelegate cardViewDelegate) {
        return cardViewDelegate.e().getElevation();
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public final void j(CardViewDelegate cardViewDelegate) {
        n(cardViewDelegate, ((RoundRectDrawable) cardViewDelegate.b()).e);
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public final void k(CardViewDelegate cardViewDelegate) {
        if (!cardViewDelegate.a()) {
            cardViewDelegate.setShadowPadding(0, 0, 0, 0);
            return;
        }
        float f2 = ((RoundRectDrawable) cardViewDelegate.b()).e;
        float f3 = ((RoundRectDrawable) cardViewDelegate.b()).f1366a;
        int ceil = (int) Math.ceil(RoundRectDrawableWithShadow.a(f2, f3, cardViewDelegate.d()));
        int ceil2 = (int) Math.ceil(RoundRectDrawableWithShadow.b(f2, f3, cardViewDelegate.d()));
        cardViewDelegate.setShadowPadding(ceil, ceil2, ceil, ceil2);
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public final float l(CardViewDelegate cardViewDelegate) {
        return ((RoundRectDrawable) cardViewDelegate.b()).f1366a * 2.0f;
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public final void m(CardViewDelegate cardViewDelegate, ColorStateList colorStateList) {
        RoundRectDrawable roundRectDrawable = (RoundRectDrawable) cardViewDelegate.b();
        if (colorStateList == null) {
            roundRectDrawable.getClass();
            colorStateList = ColorStateList.valueOf(0);
        }
        roundRectDrawable.f1371h = colorStateList;
        roundRectDrawable.f1367b.setColor(colorStateList.getColorForState(roundRectDrawable.getState(), roundRectDrawable.f1371h.getDefaultColor()));
        roundRectDrawable.invalidateSelf();
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public final void n(CardViewDelegate cardViewDelegate, float f2) {
        RoundRectDrawable roundRectDrawable = (RoundRectDrawable) cardViewDelegate.b();
        boolean a2 = cardViewDelegate.a();
        boolean d = cardViewDelegate.d();
        if (f2 != roundRectDrawable.e || roundRectDrawable.f1369f != a2 || roundRectDrawable.f1370g != d) {
            roundRectDrawable.e = f2;
            roundRectDrawable.f1369f = a2;
            roundRectDrawable.f1370g = d;
            roundRectDrawable.b(null);
            roundRectDrawable.invalidateSelf();
        }
        k(cardViewDelegate);
    }
}
