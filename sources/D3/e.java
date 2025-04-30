package D3;

import com.google.android.material.carousel.CarouselLayoutManager;

/* loaded from: classes2.dex */
public final class e extends f {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CarouselLayoutManager f742c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(CarouselLayoutManager carouselLayoutManager, int i9) {
        super(1);
        this.b = i9;
        switch (i9) {
            case 1:
                this.f742c = carouselLayoutManager;
                super(0);
                return;
            default:
                this.f742c = carouselLayoutManager;
                return;
        }
    }

    @Override // D3.f
    public final int a() {
        switch (this.b) {
            case 0:
                return this.f742c.getHeight();
            default:
                CarouselLayoutManager carouselLayoutManager = this.f742c;
                return carouselLayoutManager.getHeight() - carouselLayoutManager.getPaddingBottom();
        }
    }

    @Override // D3.f
    public final int b() {
        switch (this.b) {
            case 0:
                return this.f742c.getPaddingLeft();
            default:
                return 0;
        }
    }

    @Override // D3.f
    public final int c() {
        switch (this.b) {
            case 0:
                CarouselLayoutManager carouselLayoutManager = this.f742c;
                return carouselLayoutManager.getWidth() - carouselLayoutManager.getPaddingRight();
            default:
                return this.f742c.getWidth();
        }
    }

    @Override // D3.f
    public final int d() {
        switch (this.b) {
            case 0:
                return 0;
            default:
                CarouselLayoutManager carouselLayoutManager = this.f742c;
                if (carouselLayoutManager.j()) {
                    return carouselLayoutManager.getWidth();
                }
                return 0;
        }
    }

    @Override // D3.f
    public final int e() {
        switch (this.b) {
            case 0:
                return 0;
            default:
                return this.f742c.getPaddingTop();
        }
    }
}
