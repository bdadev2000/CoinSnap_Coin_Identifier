package na;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* loaded from: classes3.dex */
public final class f extends ka.h {

    /* renamed from: w, reason: collision with root package name */
    public final RectF f22616w;

    public f(ka.l lVar, RectF rectF) {
        super(lVar);
        this.f22616w = rectF;
    }

    @Override // ka.h, android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        g gVar = new g(this);
        gVar.invalidateSelf();
        return gVar;
    }

    public f(f fVar) {
        super(fVar);
        this.f22616w = fVar.f22616w;
    }
}
