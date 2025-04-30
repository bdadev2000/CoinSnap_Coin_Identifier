package K;

import android.view.View;
import com.applovin.impl.sdk.C0754f;
import com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacer;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* loaded from: classes.dex */
public final /* synthetic */ class m implements Runnable {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f1630c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f1631d;

    public /* synthetic */ m(int i9, int i10, Object obj) {
        this.b = i10;
        this.f1631d = obj;
        this.f1630c = i9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                ((b) this.f1631d).g(this.f1630c);
                return;
            case 1:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f1631d;
                View view = (View) sideSheetBehavior.f14118p.get();
                if (view != null) {
                    sideSheetBehavior.y(view, this.f1630c, false);
                    return;
                }
                return;
            case 2:
                com.applovin.impl.adview.a.r((com.applovin.impl.adview.a) this.f1631d, this.f1630c);
                return;
            case 3:
                C0754f.b((C0754f.a) this.f1631d, this.f1630c);
                return;
            default:
                MaxAdPlacer.a((MaxAdPlacer) this.f1631d, this.f1630c);
                return;
        }
    }
}
