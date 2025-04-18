package j2;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Locale;

/* loaded from: classes.dex */
public final class d extends l {
    public final LinearLayoutManager a;

    /* renamed from: b, reason: collision with root package name */
    public n f19715b;

    public d(LinearLayoutManager linearLayoutManager) {
        this.a = linearLayoutManager;
    }

    @Override // j2.l
    public final void a(int i10) {
    }

    @Override // j2.l
    public final void b(int i10, float f10, int i11) {
        if (this.f19715b == null) {
            return;
        }
        float f11 = -f10;
        int i12 = 0;
        while (true) {
            LinearLayoutManager linearLayoutManager = this.a;
            if (i12 < linearLayoutManager.getChildCount()) {
                View childAt = linearLayoutManager.getChildAt(i12);
                if (childAt != null) {
                    this.f19715b.a(childAt, (linearLayoutManager.getPosition(childAt) - i10) + f11);
                    i12++;
                } else {
                    throw new IllegalStateException(String.format(Locale.US, "LayoutManager returned a null child at pos %d/%d while transforming pages", Integer.valueOf(i12), Integer.valueOf(linearLayoutManager.getChildCount())));
                }
            } else {
                return;
            }
        }
    }

    @Override // j2.l
    public final void c(int i10) {
    }
}
