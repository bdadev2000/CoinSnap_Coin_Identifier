package fa;

import android.os.Build;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* loaded from: classes3.dex */
public final class f {
    public final c a;

    /* renamed from: b, reason: collision with root package name */
    public final b f17760b;

    /* renamed from: c, reason: collision with root package name */
    public final View f17761c;

    public f(BottomSheetBehavior bottomSheetBehavior, FrameLayout frameLayout) {
        c cVar;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 34) {
            cVar = new e();
        } else if (i10 >= 33) {
            cVar = new c();
        } else {
            cVar = null;
        }
        this.a = cVar;
        this.f17760b = bottomSheetBehavior;
        this.f17761c = frameLayout;
    }
}
