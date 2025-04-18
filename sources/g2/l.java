package g2;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class l extends Drawable.ConstantState {
    public int a;

    /* renamed from: b, reason: collision with root package name */
    public k f17983b;

    /* renamed from: c, reason: collision with root package name */
    public ColorStateList f17984c;

    /* renamed from: d, reason: collision with root package name */
    public PorterDuff.Mode f17985d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f17986e;

    /* renamed from: f, reason: collision with root package name */
    public Bitmap f17987f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f17988g;

    /* renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f17989h;

    /* renamed from: i, reason: collision with root package name */
    public int f17990i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f17991j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f17992k;

    /* renamed from: l, reason: collision with root package name */
    public Paint f17993l;

    public l(l lVar) {
        this.f17984c = null;
        this.f17985d = n.f17994l;
        if (lVar != null) {
            this.a = lVar.a;
            k kVar = new k(lVar.f17983b);
            this.f17983b = kVar;
            if (lVar.f17983b.f17972e != null) {
                kVar.f17972e = new Paint(lVar.f17983b.f17972e);
            }
            if (lVar.f17983b.f17971d != null) {
                this.f17983b.f17971d = new Paint(lVar.f17983b.f17971d);
            }
            this.f17984c = lVar.f17984c;
            this.f17985d = lVar.f17985d;
            this.f17986e = lVar.f17986e;
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.a;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new n(this);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new n(this);
    }

    public l() {
        this.f17984c = null;
        this.f17985d = n.f17994l;
        this.f17983b = new k();
    }
}
