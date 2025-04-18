package p4;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class b extends Drawable.ConstantState {
    public final h a;

    public b(h hVar) {
        this.a = hVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new c(this);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new c(this);
    }
}
