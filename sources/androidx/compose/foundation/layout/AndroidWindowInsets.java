package androidx.compose.foundation.layout;

import android.support.v4.media.d;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.StructuralEqualityPolicy;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.graphics.Insets;
import androidx.core.view.WindowInsetsCompat;

@Stable
/* loaded from: classes.dex */
public final class AndroidWindowInsets implements WindowInsets {

    /* renamed from: a, reason: collision with root package name */
    public final int f3769a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3770b;

    /* renamed from: c, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f3771c;
    public final ParcelableSnapshotMutableState d;

    public AndroidWindowInsets(int i2, String str) {
        ParcelableSnapshotMutableState f2;
        ParcelableSnapshotMutableState f3;
        this.f3769a = i2;
        this.f3770b = str;
        f2 = SnapshotStateKt.f(Insets.e, StructuralEqualityPolicy.f14078a);
        this.f3771c = f2;
        f3 = SnapshotStateKt.f(Boolean.TRUE, StructuralEqualityPolicy.f14078a);
        this.d = f3;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int a(Density density) {
        return e().f18534b;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int b(Density density, LayoutDirection layoutDirection) {
        return e().f18535c;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int c(Density density) {
        return e().d;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int d(Density density, LayoutDirection layoutDirection) {
        return e().f18533a;
    }

    public final Insets e() {
        return (Insets) this.f3771c.getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AndroidWindowInsets) {
            return this.f3769a == ((AndroidWindowInsets) obj).f3769a;
        }
        return false;
    }

    public final void f(WindowInsetsCompat windowInsetsCompat, int i2) {
        int i3 = this.f3769a;
        if (i2 == 0 || (i2 & i3) != 0) {
            this.f3771c.setValue(windowInsetsCompat.e(i3));
            this.d.setValue(Boolean.valueOf(windowInsetsCompat.p(i3)));
        }
    }

    public final int hashCode() {
        return this.f3769a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f3770b);
        sb.append('(');
        sb.append(e().f18533a);
        sb.append(", ");
        sb.append(e().f18534b);
        sb.append(", ");
        sb.append(e().f18535c);
        sb.append(", ");
        return d.o(sb, e().d, ')');
    }
}
