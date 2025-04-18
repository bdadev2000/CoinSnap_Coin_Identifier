package ka;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* loaded from: classes3.dex */
public class h extends Drawable.ConstantState {
    public l a;

    /* renamed from: b, reason: collision with root package name */
    public final l f20536b;

    /* renamed from: c, reason: collision with root package name */
    public ca.a f20537c;

    /* renamed from: d, reason: collision with root package name */
    public ColorStateList f20538d;

    /* renamed from: e, reason: collision with root package name */
    public ColorStateList f20539e;

    /* renamed from: f, reason: collision with root package name */
    public final ColorStateList f20540f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f20541g;

    /* renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f20542h;

    /* renamed from: i, reason: collision with root package name */
    public Rect f20543i;

    /* renamed from: j, reason: collision with root package name */
    public final float f20544j;

    /* renamed from: k, reason: collision with root package name */
    public float f20545k;

    /* renamed from: l, reason: collision with root package name */
    public float f20546l;

    /* renamed from: m, reason: collision with root package name */
    public int f20547m;

    /* renamed from: n, reason: collision with root package name */
    public float f20548n;

    /* renamed from: o, reason: collision with root package name */
    public float f20549o;

    /* renamed from: p, reason: collision with root package name */
    public final float f20550p;

    /* renamed from: q, reason: collision with root package name */
    public final int f20551q;

    /* renamed from: r, reason: collision with root package name */
    public int f20552r;

    /* renamed from: s, reason: collision with root package name */
    public int f20553s;

    /* renamed from: t, reason: collision with root package name */
    public final int f20554t;
    public final boolean u;

    /* renamed from: v, reason: collision with root package name */
    public final Paint.Style f20555v;

    public h(l lVar) {
        this.f20538d = null;
        this.f20539e = null;
        this.f20540f = null;
        this.f20541g = null;
        this.f20542h = PorterDuff.Mode.SRC_IN;
        this.f20543i = null;
        this.f20544j = 1.0f;
        this.f20545k = 1.0f;
        this.f20547m = 255;
        this.f20548n = 0.0f;
        this.f20549o = 0.0f;
        this.f20550p = 0.0f;
        this.f20551q = 0;
        this.f20552r = 0;
        this.f20553s = 0;
        this.f20554t = 0;
        this.u = false;
        this.f20555v = Paint.Style.FILL_AND_STROKE;
        this.a = lVar;
        this.f20537c = null;
        this.f20536b = i.f20556z;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        i iVar = new i(this);
        iVar.f20561g = true;
        return iVar;
    }

    public h(h hVar) {
        this.f20538d = null;
        this.f20539e = null;
        this.f20540f = null;
        this.f20541g = null;
        this.f20542h = PorterDuff.Mode.SRC_IN;
        this.f20543i = null;
        this.f20544j = 1.0f;
        this.f20545k = 1.0f;
        this.f20547m = 255;
        this.f20548n = 0.0f;
        this.f20549o = 0.0f;
        this.f20550p = 0.0f;
        this.f20551q = 0;
        this.f20552r = 0;
        this.f20553s = 0;
        this.f20554t = 0;
        this.u = false;
        this.f20555v = Paint.Style.FILL_AND_STROKE;
        this.a = hVar.a;
        this.f20536b = hVar.f20536b;
        this.f20537c = hVar.f20537c;
        this.f20546l = hVar.f20546l;
        this.f20538d = hVar.f20538d;
        this.f20539e = hVar.f20539e;
        this.f20542h = hVar.f20542h;
        this.f20541g = hVar.f20541g;
        this.f20547m = hVar.f20547m;
        this.f20544j = hVar.f20544j;
        this.f20553s = hVar.f20553s;
        this.f20551q = hVar.f20551q;
        this.u = hVar.u;
        this.f20545k = hVar.f20545k;
        this.f20548n = hVar.f20548n;
        this.f20549o = hVar.f20549o;
        this.f20550p = hVar.f20550p;
        this.f20552r = hVar.f20552r;
        this.f20554t = hVar.f20554t;
        this.f20540f = hVar.f20540f;
        this.f20555v = hVar.f20555v;
        if (hVar.f20543i != null) {
            this.f20543i = new Rect(hVar.f20543i);
        }
    }
}
