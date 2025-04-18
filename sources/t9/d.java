package t9;

import android.view.View;
import androidx.core.view.ViewCompat;

/* loaded from: classes3.dex */
public final class d {
    public final View a;

    /* renamed from: b, reason: collision with root package name */
    public int f25372b;

    /* renamed from: c, reason: collision with root package name */
    public int f25373c;

    /* renamed from: d, reason: collision with root package name */
    public int f25374d;

    public d(View view) {
        this.a = view;
    }

    public final void a() {
        int i10 = this.f25374d;
        View view = this.a;
        ViewCompat.offsetTopAndBottom(view, i10 - (view.getTop() - this.f25372b));
        ViewCompat.offsetLeftAndRight(view, 0 - (view.getLeft() - this.f25373c));
    }
}
