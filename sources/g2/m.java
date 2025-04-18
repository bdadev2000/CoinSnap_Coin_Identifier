package g2;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;

/* loaded from: classes.dex */
public final class m extends Drawable.ConstantState {
    public final Drawable.ConstantState a;

    public m(Drawable.ConstantState constantState) {
        this.a = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        n nVar = new n();
        nVar.f17942b = (VectorDrawable) this.a.newDrawable();
        return nVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        n nVar = new n();
        nVar.f17942b = (VectorDrawable) this.a.newDrawable(resources);
        return nVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        n nVar = new n();
        nVar.f17942b = (VectorDrawable) this.a.newDrawable(resources, theme);
        return nVar;
    }
}
