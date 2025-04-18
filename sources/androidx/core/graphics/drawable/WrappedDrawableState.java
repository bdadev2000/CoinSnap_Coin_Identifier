package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;

/* loaded from: classes.dex */
final class WrappedDrawableState extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public int f18572a;

    /* renamed from: b, reason: collision with root package name */
    public Drawable.ConstantState f18573b;

    /* renamed from: c, reason: collision with root package name */
    public ColorStateList f18574c;
    public PorterDuff.Mode d;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        int i2 = this.f18572a;
        Drawable.ConstantState constantState = this.f18573b;
        return i2 | (constantState != null ? constantState.getChangingConfigurations() : 0);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return newDrawable(null);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        WrappedDrawableApi14 wrappedDrawableApi14 = new WrappedDrawableApi14(this, resources);
        if (WrappedDrawableApi21.f18571i == null) {
            try {
                WrappedDrawableApi21.f18571i = Drawable.class.getDeclaredMethod("isProjected", new Class[0]);
            } catch (Exception e) {
                Log.w("WrappedDrawableApi21", "Failed to retrieve Drawable#isProjected() method", e);
            }
        }
        return wrappedDrawableApi14;
    }
}
