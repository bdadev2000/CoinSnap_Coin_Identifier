package d3;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import c3.j;
import com.google.android.gms.ads.AdError;

/* loaded from: classes.dex */
public final class c extends jb.g {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ jb.g f16797h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f16798i = true;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Context f16799j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ e3.a f16800k;

    public c(fg.f fVar, FragmentActivity fragmentActivity, e3.a aVar) {
        this.f16797h = fVar;
        this.f16799j = fragmentActivity;
        this.f16800k = aVar;
    }

    @Override // jb.g
    public final void o() {
        this.f16797h.o();
    }

    @Override // jb.g
    public final void p() {
        this.f16797h.p();
        boolean z10 = this.f16798i;
        e3.a aVar = this.f16800k;
        if (z10) {
            j.b().c(this.f16799j, aVar.f17086d.getAdUnitId(), new b(this, 0));
            return;
        }
        aVar.l(null);
    }

    @Override // jb.g
    public final void r(AdError adError) {
        this.f16797h.r(adError);
        boolean z10 = this.f16798i;
        e3.a aVar = this.f16800k;
        if (z10) {
            j.b().c(this.f16799j, aVar.f17086d.getAdUnitId(), new b(this, 1));
            return;
        }
        aVar.l(null);
    }

    @Override // jb.g
    public final void u() {
        this.f16797h.u();
    }

    @Override // jb.g
    public final void w() {
        this.f16797h.w();
    }
}
