package N0;

import android.content.res.ColorStateList;
import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class b extends Animatable2.AnimationCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ E3.a f2019a;

    public b(E3.a aVar) {
        this.f2019a = aVar;
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationEnd(Drawable drawable) {
        ColorStateList colorStateList = this.f2019a.b.f1020q;
        if (colorStateList != null) {
            M.a.h(drawable, colorStateList);
        }
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationStart(Drawable drawable) {
        E3.d dVar = this.f2019a.b;
        ColorStateList colorStateList = dVar.f1020q;
        if (colorStateList != null) {
            M.a.g(drawable, colorStateList.getColorForState(dVar.f1024u, colorStateList.getDefaultColor()));
        }
    }
}
