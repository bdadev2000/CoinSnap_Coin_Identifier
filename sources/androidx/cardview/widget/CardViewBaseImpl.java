package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import androidx.cardview.widget.CardView;
import androidx.cardview.widget.RoundRectDrawableWithShadow;

/* loaded from: classes4.dex */
class CardViewBaseImpl implements CardViewImpl {

    /* renamed from: androidx.cardview.widget.CardViewBaseImpl$1, reason: invalid class name */
    /* loaded from: classes.dex */
    class AnonymousClass1 implements RoundRectDrawableWithShadow.RoundRectHelper {
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public final void a(CardViewDelegate cardViewDelegate, float f2) {
        RoundRectDrawableWithShadow roundRectDrawableWithShadow = (RoundRectDrawableWithShadow) cardViewDelegate.b();
        if (f2 < 0.0f) {
            roundRectDrawableWithShadow.getClass();
            throw new IllegalArgumentException("Invalid radius " + f2 + ". Must be >= 0");
        }
        float f3 = (int) (f2 + 0.5f);
        if (roundRectDrawableWithShadow.f1379f != f3) {
            roundRectDrawableWithShadow.f1379f = f3;
            roundRectDrawableWithShadow.f1385l = true;
            roundRectDrawableWithShadow.invalidateSelf();
        }
        k(cardViewDelegate);
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public final float b(CardViewDelegate cardViewDelegate) {
        return ((RoundRectDrawableWithShadow) cardViewDelegate.b()).f1379f;
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public final void c(CardViewDelegate cardViewDelegate, float f2) {
        RoundRectDrawableWithShadow roundRectDrawableWithShadow = (RoundRectDrawableWithShadow) cardViewDelegate.b();
        roundRectDrawableWithShadow.c(f2, roundRectDrawableWithShadow.f1381h);
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public final float d(CardViewDelegate cardViewDelegate) {
        return ((RoundRectDrawableWithShadow) cardViewDelegate.b()).f1381h;
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public final ColorStateList e(CardViewDelegate cardViewDelegate) {
        return ((RoundRectDrawableWithShadow) cardViewDelegate.b()).f1384k;
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public final float f(CardViewDelegate cardViewDelegate) {
        RoundRectDrawableWithShadow roundRectDrawableWithShadow = (RoundRectDrawableWithShadow) cardViewDelegate.b();
        float f2 = roundRectDrawableWithShadow.f1381h;
        float f3 = roundRectDrawableWithShadow.f1379f;
        float f4 = roundRectDrawableWithShadow.f1376a;
        return (((roundRectDrawableWithShadow.f1381h * 1.5f) + f4) * 2.0f) + (Math.max(f2, ((f2 * 1.5f) / 2.0f) + f3 + f4) * 2.0f);
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public final void g(CardView.AnonymousClass1 anonymousClass1, Context context, ColorStateList colorStateList, float f2, float f3, float f4) {
        RoundRectDrawableWithShadow roundRectDrawableWithShadow = new RoundRectDrawableWithShadow(context.getResources(), colorStateList, f2, f3, f4);
        roundRectDrawableWithShadow.f1388o = CardView.this.getPreventCornerOverlap();
        roundRectDrawableWithShadow.invalidateSelf();
        anonymousClass1.f(roundRectDrawableWithShadow);
        k(anonymousClass1);
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public final void h(CardViewDelegate cardViewDelegate) {
        RoundRectDrawableWithShadow roundRectDrawableWithShadow = (RoundRectDrawableWithShadow) cardViewDelegate.b();
        roundRectDrawableWithShadow.f1388o = cardViewDelegate.d();
        roundRectDrawableWithShadow.invalidateSelf();
        k(cardViewDelegate);
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public final float i(CardViewDelegate cardViewDelegate) {
        return ((RoundRectDrawableWithShadow) cardViewDelegate.b()).f1383j;
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public final void j(CardViewDelegate cardViewDelegate) {
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public final void k(CardViewDelegate cardViewDelegate) {
        Rect rect = new Rect();
        ((RoundRectDrawableWithShadow) cardViewDelegate.b()).getPadding(rect);
        cardViewDelegate.c((int) Math.ceil(l(cardViewDelegate)), (int) Math.ceil(f(cardViewDelegate)));
        cardViewDelegate.setShadowPadding(rect.left, rect.top, rect.right, rect.bottom);
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public final float l(CardViewDelegate cardViewDelegate) {
        RoundRectDrawableWithShadow roundRectDrawableWithShadow = (RoundRectDrawableWithShadow) cardViewDelegate.b();
        float f2 = roundRectDrawableWithShadow.f1381h;
        float f3 = roundRectDrawableWithShadow.f1379f;
        float f4 = roundRectDrawableWithShadow.f1376a;
        return ((roundRectDrawableWithShadow.f1381h + f4) * 2.0f) + (Math.max(f2, (f2 / 2.0f) + f3 + f4) * 2.0f);
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public final void m(CardViewDelegate cardViewDelegate, ColorStateList colorStateList) {
        RoundRectDrawableWithShadow roundRectDrawableWithShadow = (RoundRectDrawableWithShadow) cardViewDelegate.b();
        if (colorStateList == null) {
            roundRectDrawableWithShadow.getClass();
            colorStateList = ColorStateList.valueOf(0);
        }
        roundRectDrawableWithShadow.f1384k = colorStateList;
        roundRectDrawableWithShadow.f1377b.setColor(colorStateList.getColorForState(roundRectDrawableWithShadow.getState(), roundRectDrawableWithShadow.f1384k.getDefaultColor()));
        roundRectDrawableWithShadow.invalidateSelf();
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public final void n(CardViewDelegate cardViewDelegate, float f2) {
        RoundRectDrawableWithShadow roundRectDrawableWithShadow = (RoundRectDrawableWithShadow) cardViewDelegate.b();
        roundRectDrawableWithShadow.c(roundRectDrawableWithShadow.f1383j, f2);
        k(cardViewDelegate);
    }
}
