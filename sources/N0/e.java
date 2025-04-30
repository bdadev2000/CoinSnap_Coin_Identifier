package N0;

import a2.C0333b;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class e extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2023a;
    public final Object b;

    public /* synthetic */ e(Object obj, int i9) {
        this.f2023a = i9;
        this.b = obj;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public boolean canApplyTheme() {
        switch (this.f2023a) {
            case 0:
                return ((Drawable.ConstantState) this.b).canApplyTheme();
            default:
                return super.canApplyTheme();
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        switch (this.f2023a) {
            case 0:
                return ((Drawable.ConstantState) this.b).getChangingConfigurations();
            default:
                return 0;
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        switch (this.f2023a) {
            case 0:
                f fVar = new f(null);
                Drawable newDrawable = ((Drawable.ConstantState) this.b).newDrawable();
                fVar.b = newDrawable;
                newDrawable.setCallback(fVar.f2028h);
                return fVar;
            default:
                return new C0333b(this);
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        switch (this.f2023a) {
            case 0:
                f fVar = new f(null);
                Drawable newDrawable = ((Drawable.ConstantState) this.b).newDrawable(resources);
                fVar.b = newDrawable;
                newDrawable.setCallback(fVar.f2028h);
                return fVar;
            default:
                return new C0333b(this);
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable(Resources resources, Resources.Theme theme) {
        switch (this.f2023a) {
            case 0:
                f fVar = new f(null);
                Drawable newDrawable = ((Drawable.ConstantState) this.b).newDrawable(resources, theme);
                fVar.b = newDrawable;
                newDrawable.setCallback(fVar.f2028h);
                return fVar;
            default:
                return super.newDrawable(resources, theme);
        }
    }
}
