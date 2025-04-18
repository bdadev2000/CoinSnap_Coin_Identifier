package androidx.core.content.res;

import androidx.core.content.res.ResourcesCompat;
import com.applovin.impl.sdk.f;
import com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacer;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* loaded from: classes2.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18526a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f18527b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f18528c;

    public /* synthetic */ b(int i2, int i3, Object obj) {
        this.f18526a = i3;
        this.f18528c = obj;
        this.f18527b = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f18526a;
        int i3 = this.f18527b;
        Object obj = this.f18528c;
        switch (i2) {
            case 0:
                ((ResourcesCompat.FontCallback) obj).onFontRetrievalFailed(i3);
                return;
            case 1:
                com.applovin.impl.adview.a.f((com.applovin.impl.adview.a) obj, i3);
                return;
            case 2:
                f.b((f.a) obj, i3);
                return;
            case 3:
                MaxAdPlacer.a((MaxAdPlacer) obj, i3);
                return;
            default:
                SideSheetBehavior.b((SideSheetBehavior) obj, i3);
                return;
        }
    }
}
