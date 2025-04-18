package m4;

import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.os.Build;
import android.util.Log;
import android.util.Size;
import e4.l;
import e4.m;
import l0.d;
import n4.n;
import n4.p;
import n4.u;

/* loaded from: classes.dex */
public final class b implements ImageDecoder.OnHeaderDecodedListener {
    public final u a;

    /* renamed from: b, reason: collision with root package name */
    public final int f21620b;

    /* renamed from: c, reason: collision with root package name */
    public final int f21621c;

    /* renamed from: d, reason: collision with root package name */
    public final e4.b f21622d;

    /* renamed from: e, reason: collision with root package name */
    public final n f21623e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f21624f;

    /* renamed from: g, reason: collision with root package name */
    public final e4.n f21625g;

    public b(int i10, int i11, m mVar) {
        boolean z10;
        if (u.f22443j == null) {
            synchronized (u.class) {
                if (u.f22443j == null) {
                    u.f22443j = new u();
                }
            }
        }
        this.a = u.f22443j;
        this.f21620b = i10;
        this.f21621c = i11;
        this.f21622d = (e4.b) mVar.c(p.f22427f);
        this.f21623e = (n) mVar.c(n.f22425f);
        l lVar = p.f22430i;
        if (mVar.c(lVar) != null && ((Boolean) mVar.c(lVar)).booleanValue()) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f21624f = z10;
        this.f21625g = (e4.n) mVar.c(p.f22428g);
    }

    @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        ColorSpace.Named w10;
        boolean z10 = false;
        if (this.a.a(this.f21620b, this.f21621c, this.f21624f, false)) {
            d.l(imageDecoder);
        } else {
            d.y(imageDecoder);
        }
        if (this.f21622d == e4.b.PREFER_RGB_565) {
            d.B(imageDecoder);
        }
        d.o(imageDecoder, new a());
        Size e2 = d.e(imageInfo);
        int i10 = this.f21620b;
        if (i10 == Integer.MIN_VALUE) {
            i10 = e2.getWidth();
        }
        int i11 = this.f21621c;
        if (i11 == Integer.MIN_VALUE) {
            i11 = e2.getHeight();
        }
        float b3 = this.f21623e.b(e2.getWidth(), e2.getHeight(), i10, i11);
        int round = Math.round(e2.getWidth() * b3);
        int round2 = Math.round(e2.getHeight() * b3);
        if (Log.isLoggable("ImageDecoder", 2)) {
            Log.v("ImageDecoder", "Resizing from [" + e2.getWidth() + "x" + e2.getHeight() + "] to [" + round + "x" + round2 + "] scaleFactor: " + b3);
        }
        d.m(imageDecoder, round, round2);
        e4.n nVar = this.f21625g;
        if (nVar != null) {
            int i12 = Build.VERSION.SDK_INT;
            if (i12 >= 28) {
                if (nVar == e4.n.DISPLAY_P3 && d.b(imageInfo) != null && l2.d.s(d.b(imageInfo))) {
                    z10 = true;
                }
                if (z10) {
                    w10 = l2.d.e();
                } else {
                    w10 = l2.d.w();
                }
                d.n(imageDecoder, l2.d.f(w10));
                return;
            }
            if (i12 >= 26) {
                d.n(imageDecoder, l2.d.f(l2.d.w()));
            }
        }
    }
}
