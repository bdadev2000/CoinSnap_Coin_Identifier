package a4;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class h {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public int f133b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f134c;

    /* renamed from: d, reason: collision with root package name */
    public final Runnable f135d;

    /* renamed from: e, reason: collision with root package name */
    public final b0.a f136e;

    public /* synthetic */ h() {
        this.a = 0;
        this.f133b = 0;
    }

    public final void a(int i10) {
        b0.a aVar = this.f136e;
        int i11 = this.a;
        Runnable runnable = this.f135d;
        switch (i11) {
            case 1:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) aVar;
                WeakReference weakReference = bottomSheetBehavior.W;
                if (weakReference != null && weakReference.get() != null) {
                    this.f133b = i10;
                    if (!this.f134c) {
                        ((View) bottomSheetBehavior.W.get()).postOnAnimation(runnable);
                        this.f134c = true;
                        return;
                    }
                    return;
                }
                return;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) aVar;
                WeakReference weakReference2 = sideSheetBehavior.f11787p;
                if (weakReference2 != null && weakReference2.get() != null) {
                    this.f133b = i10;
                    if (!this.f134c) {
                        ((View) sideSheetBehavior.f11787p.get()).postOnAnimation(runnable);
                        this.f134c = true;
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public h(SideSheetBehavior sideSheetBehavior) {
        this.a = 2;
        this.f136e = sideSheetBehavior;
        this.f135d = new k8.f(this, 5);
    }

    public h(BottomSheetBehavior bottomSheetBehavior) {
        this.a = 1;
        this.f136e = bottomSheetBehavior;
        this.f135d = new androidx.activity.i(this, 22);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(BottomSheetBehavior bottomSheetBehavior, int i10) {
        this(bottomSheetBehavior);
        this.a = 1;
    }
}
