package g2;

import android.content.res.ColorStateList;
import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class a extends Animatable2.AnimationCallback {
    public final /* synthetic */ y9.a a;

    public a(y9.a aVar) {
        this.a = aVar;
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationEnd(Drawable drawable) {
        ColorStateList colorStateList = this.a.f28122b.f28134q;
        if (colorStateList != null) {
            h0.a.h(drawable, colorStateList);
        }
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationStart(Drawable drawable) {
        y9.c cVar = this.a.f28122b;
        ColorStateList colorStateList = cVar.f28134q;
        if (colorStateList != null) {
            h0.a.g(drawable, colorStateList.getColorForState(cVar.u, colorStateList.getDefaultColor()));
        }
    }
}
