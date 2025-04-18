package o4;

import android.graphics.drawable.Drawable;
import g4.c0;
import g4.g0;

/* loaded from: classes.dex */
public abstract class b implements g0, c0 {

    /* renamed from: b, reason: collision with root package name */
    public final Drawable f23131b;

    public b(Drawable drawable) {
        com.bumptech.glide.c.l(drawable);
        this.f23131b = drawable;
    }

    @Override // g4.g0
    public final Object get() {
        Drawable drawable = this.f23131b;
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState != null) {
            return constantState.newDrawable();
        }
        return drawable;
    }
}
