package androidx.compose.ui.graphics.colorspace;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements DoubleFunction {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f15125b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Rgb f15126c;

    public /* synthetic */ a(Rgb rgb, int i2) {
        this.f15125b = i2;
        this.f15126c = rgb;
    }

    @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
    public final double c(double d) {
        int i2 = this.f15125b;
        Rgb rgb = this.f15126c;
        switch (i2) {
            case 0:
                return p0.a.y(rgb.f15109k.c(d), rgb.e, rgb.f15104f);
            default:
                return rgb.f15112n.c(p0.a.y(d, rgb.e, rgb.f15104f));
        }
    }
}
