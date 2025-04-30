package B3;

import android.view.View;
import androidx.core.view.ViewCompat;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f294a;
    public int b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f295c;

    /* renamed from: d, reason: collision with root package name */
    public final Runnable f296d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ G.b f297e;

    public l(SideSheetBehavior sideSheetBehavior) {
        this.f294a = 1;
        this.f297e = sideSheetBehavior;
        this.f296d = new D3.b(this, 4);
    }

    public final void a(int i9) {
        switch (this.f294a) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f297e;
                WeakReference weakReference = bottomSheetBehavior.f13933U;
                if (weakReference != null && weakReference.get() != null) {
                    this.b = i9;
                    if (!this.f295c) {
                        ViewCompat.postOnAnimation((View) bottomSheetBehavior.f13933U.get(), (k) this.f296d);
                        this.f295c = true;
                        return;
                    }
                    return;
                }
                return;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f297e;
                WeakReference weakReference2 = sideSheetBehavior.f14118p;
                if (weakReference2 != null && weakReference2.get() != null) {
                    this.b = i9;
                    if (!this.f295c) {
                        ViewCompat.postOnAnimation((View) sideSheetBehavior.f14118p.get(), (D3.b) this.f296d);
                        this.f295c = true;
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public l(BottomSheetBehavior bottomSheetBehavior) {
        this.f294a = 0;
        this.f297e = bottomSheetBehavior;
        this.f296d = new k(this, 0);
    }
}
