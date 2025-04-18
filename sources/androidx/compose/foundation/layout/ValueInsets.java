package androidx.compose.foundation.layout;

import android.support.v4.media.d;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.StructuralEqualityPolicy;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;

@Stable
/* loaded from: classes2.dex */
public final class ValueInsets implements WindowInsets {

    /* renamed from: a, reason: collision with root package name */
    public final String f4129a;

    /* renamed from: b, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f4130b;

    public ValueInsets(InsetsValues insetsValues, String str) {
        ParcelableSnapshotMutableState f2;
        this.f4129a = str;
        f2 = SnapshotStateKt.f(insetsValues, StructuralEqualityPolicy.f14078a);
        this.f4130b = f2;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int a(Density density) {
        return e().f4023b;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int b(Density density, LayoutDirection layoutDirection) {
        return e().f4024c;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int c(Density density) {
        return e().d;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int d(Density density, LayoutDirection layoutDirection) {
        return e().f4022a;
    }

    public final InsetsValues e() {
        return (InsetsValues) this.f4130b.getValue();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ValueInsets) {
            return p0.a.g(e(), ((ValueInsets) obj).e());
        }
        return false;
    }

    public final void f(InsetsValues insetsValues) {
        this.f4130b.setValue(insetsValues);
    }

    public final int hashCode() {
        return this.f4129a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f4129a);
        sb.append("(left=");
        sb.append(e().f4022a);
        sb.append(", top=");
        sb.append(e().f4023b);
        sb.append(", right=");
        sb.append(e().f4024c);
        sb.append(", bottom=");
        return d.o(sb, e().d, ')');
    }
}
