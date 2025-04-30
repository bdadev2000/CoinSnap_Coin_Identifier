package R3;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* loaded from: classes2.dex */
public class f extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public k f2643a;
    public J3.a b;

    /* renamed from: c, reason: collision with root package name */
    public ColorStateList f2644c;

    /* renamed from: d, reason: collision with root package name */
    public ColorStateList f2645d;

    /* renamed from: e, reason: collision with root package name */
    public final ColorStateList f2646e;

    /* renamed from: f, reason: collision with root package name */
    public ColorStateList f2647f;

    /* renamed from: g, reason: collision with root package name */
    public PorterDuff.Mode f2648g;

    /* renamed from: h, reason: collision with root package name */
    public Rect f2649h;

    /* renamed from: i, reason: collision with root package name */
    public final float f2650i;

    /* renamed from: j, reason: collision with root package name */
    public float f2651j;

    /* renamed from: k, reason: collision with root package name */
    public float f2652k;
    public int l;
    public float m;

    /* renamed from: n, reason: collision with root package name */
    public float f2653n;

    /* renamed from: o, reason: collision with root package name */
    public final float f2654o;

    /* renamed from: p, reason: collision with root package name */
    public final int f2655p;

    /* renamed from: q, reason: collision with root package name */
    public int f2656q;

    /* renamed from: r, reason: collision with root package name */
    public int f2657r;

    /* renamed from: s, reason: collision with root package name */
    public final int f2658s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f2659t;

    /* renamed from: u, reason: collision with root package name */
    public final Paint.Style f2660u;

    public f(k kVar) {
        this.f2644c = null;
        this.f2645d = null;
        this.f2646e = null;
        this.f2647f = null;
        this.f2648g = PorterDuff.Mode.SRC_IN;
        this.f2649h = null;
        this.f2650i = 1.0f;
        this.f2651j = 1.0f;
        this.l = 255;
        this.m = 0.0f;
        this.f2653n = 0.0f;
        this.f2654o = 0.0f;
        this.f2655p = 0;
        this.f2656q = 0;
        this.f2657r = 0;
        this.f2658s = 0;
        this.f2659t = false;
        this.f2660u = Paint.Style.FILL_AND_STROKE;
        this.f2643a = kVar;
        this.b = null;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        g gVar = new g(this);
        gVar.f2665g = true;
        return gVar;
    }

    public f(f fVar) {
        this.f2644c = null;
        this.f2645d = null;
        this.f2646e = null;
        this.f2647f = null;
        this.f2648g = PorterDuff.Mode.SRC_IN;
        this.f2649h = null;
        this.f2650i = 1.0f;
        this.f2651j = 1.0f;
        this.l = 255;
        this.m = 0.0f;
        this.f2653n = 0.0f;
        this.f2654o = 0.0f;
        this.f2655p = 0;
        this.f2656q = 0;
        this.f2657r = 0;
        this.f2658s = 0;
        this.f2659t = false;
        this.f2660u = Paint.Style.FILL_AND_STROKE;
        this.f2643a = fVar.f2643a;
        this.b = fVar.b;
        this.f2652k = fVar.f2652k;
        this.f2644c = fVar.f2644c;
        this.f2645d = fVar.f2645d;
        this.f2648g = fVar.f2648g;
        this.f2647f = fVar.f2647f;
        this.l = fVar.l;
        this.f2650i = fVar.f2650i;
        this.f2657r = fVar.f2657r;
        this.f2655p = fVar.f2655p;
        this.f2659t = fVar.f2659t;
        this.f2651j = fVar.f2651j;
        this.m = fVar.m;
        this.f2653n = fVar.f2653n;
        this.f2654o = fVar.f2654o;
        this.f2656q = fVar.f2656q;
        this.f2658s = fVar.f2658s;
        this.f2646e = fVar.f2646e;
        this.f2660u = fVar.f2660u;
        if (fVar.f2649h != null) {
            this.f2649h = new Rect(fVar.f2649h);
        }
    }
}
