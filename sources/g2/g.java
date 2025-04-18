package g2;

import android.graphics.Paint;

/* loaded from: classes.dex */
public final class g extends j {

    /* renamed from: e, reason: collision with root package name */
    public f0.c f17943e;

    /* renamed from: f, reason: collision with root package name */
    public float f17944f;

    /* renamed from: g, reason: collision with root package name */
    public f0.c f17945g;

    /* renamed from: h, reason: collision with root package name */
    public float f17946h;

    /* renamed from: i, reason: collision with root package name */
    public float f17947i;

    /* renamed from: j, reason: collision with root package name */
    public float f17948j;

    /* renamed from: k, reason: collision with root package name */
    public float f17949k;

    /* renamed from: l, reason: collision with root package name */
    public float f17950l;

    /* renamed from: m, reason: collision with root package name */
    public Paint.Cap f17951m;

    /* renamed from: n, reason: collision with root package name */
    public Paint.Join f17952n;

    /* renamed from: o, reason: collision with root package name */
    public float f17953o;

    public g() {
        this.f17944f = 0.0f;
        this.f17946h = 1.0f;
        this.f17947i = 1.0f;
        this.f17948j = 0.0f;
        this.f17949k = 1.0f;
        this.f17950l = 0.0f;
        this.f17951m = Paint.Cap.BUTT;
        this.f17952n = Paint.Join.MITER;
        this.f17953o = 4.0f;
    }

    @Override // g2.i
    public final boolean a() {
        return this.f17945g.k() || this.f17943e.k();
    }

    @Override // g2.i
    public final boolean b(int[] iArr) {
        return this.f17943e.t(iArr) | this.f17945g.t(iArr);
    }

    public float getFillAlpha() {
        return this.f17947i;
    }

    public int getFillColor() {
        return this.f17945g.f17515b;
    }

    public float getStrokeAlpha() {
        return this.f17946h;
    }

    public int getStrokeColor() {
        return this.f17943e.f17515b;
    }

    public float getStrokeWidth() {
        return this.f17944f;
    }

    public float getTrimPathEnd() {
        return this.f17949k;
    }

    public float getTrimPathOffset() {
        return this.f17950l;
    }

    public float getTrimPathStart() {
        return this.f17948j;
    }

    public void setFillAlpha(float f10) {
        this.f17947i = f10;
    }

    public void setFillColor(int i10) {
        this.f17945g.f17515b = i10;
    }

    public void setStrokeAlpha(float f10) {
        this.f17946h = f10;
    }

    public void setStrokeColor(int i10) {
        this.f17943e.f17515b = i10;
    }

    public void setStrokeWidth(float f10) {
        this.f17944f = f10;
    }

    public void setTrimPathEnd(float f10) {
        this.f17949k = f10;
    }

    public void setTrimPathOffset(float f10) {
        this.f17950l = f10;
    }

    public void setTrimPathStart(float f10) {
        this.f17948j = f10;
    }

    public g(g gVar) {
        super(gVar);
        this.f17944f = 0.0f;
        this.f17946h = 1.0f;
        this.f17947i = 1.0f;
        this.f17948j = 0.0f;
        this.f17949k = 1.0f;
        this.f17950l = 0.0f;
        this.f17951m = Paint.Cap.BUTT;
        this.f17952n = Paint.Join.MITER;
        this.f17953o = 4.0f;
        this.f17943e = gVar.f17943e;
        this.f17944f = gVar.f17944f;
        this.f17946h = gVar.f17946h;
        this.f17945g = gVar.f17945g;
        this.f17966c = gVar.f17966c;
        this.f17947i = gVar.f17947i;
        this.f17948j = gVar.f17948j;
        this.f17949k = gVar.f17949k;
        this.f17950l = gVar.f17950l;
        this.f17951m = gVar.f17951m;
        this.f17952n = gVar.f17952n;
        this.f17953o = gVar.f17953o;
    }
}
