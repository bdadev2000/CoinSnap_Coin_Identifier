package N0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class n extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public int f2064a;
    public m b;

    /* renamed from: c, reason: collision with root package name */
    public ColorStateList f2065c;

    /* renamed from: d, reason: collision with root package name */
    public PorterDuff.Mode f2066d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2067e;

    /* renamed from: f, reason: collision with root package name */
    public Bitmap f2068f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f2069g;

    /* renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f2070h;

    /* renamed from: i, reason: collision with root package name */
    public int f2071i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f2072j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f2073k;
    public Paint l;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.f2064a;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new p(this);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new p(this);
    }
}
