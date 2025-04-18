package androidx.compose.ui.window;

import android.content.Context;
import android.view.View;
import android.view.Window;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.StructuralEqualityPolicy;
import androidx.compose.ui.platform.AbstractComposeView;
import q0.p;

/* loaded from: classes2.dex */
final class DialogLayout extends AbstractComposeView implements DialogWindowProvider {

    /* renamed from: j, reason: collision with root package name */
    public final Window f17664j;

    /* renamed from: k, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f17665k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f17666l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f17667m;

    public DialogLayout(Context context, Window window) {
        super(context);
        ParcelableSnapshotMutableState f2;
        this.f17664j = window;
        f2 = SnapshotStateKt.f(ComposableSingletons$AndroidDialog_androidKt.f17660a, StructuralEqualityPolicy.f14078a);
        this.f17665k = f2;
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void a(Composer composer, int i2) {
        int i3;
        ComposerImpl g2 = composer.g(1735448596);
        if ((i2 & 6) == 0) {
            i3 = (g2.w(this) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 3) == 2 && g2.i()) {
            g2.A();
        } else {
            ((p) this.f17665k.getValue()).invoke(g2, 0);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new DialogLayout$Content$4(this, i2);
        }
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void f(int i2, int i3, int i4, int i5, boolean z2) {
        View childAt;
        super.f(i2, i3, i4, i5, z2);
        if (this.f17666l || (childAt = getChildAt(0)) == null) {
            return;
        }
        this.f17664j.setLayout(childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void g(int i2, int i3) {
        if (this.f17666l) {
            super.g(i2, i3);
            return;
        }
        super.g(View.MeasureSpec.makeMeasureSpec(Math.round(getContext().getResources().getConfiguration().screenWidthDp * getContext().getResources().getDisplayMetrics().density), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(Math.round(getContext().getResources().getConfiguration().screenHeightDp * getContext().getResources().getDisplayMetrics().density), Integer.MIN_VALUE));
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f17667m;
    }

    @Override // androidx.compose.ui.window.DialogWindowProvider
    public final Window getWindow() {
        return this.f17664j;
    }
}
