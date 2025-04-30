package T;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Objects;

/* loaded from: classes.dex */
public class B0 extends A0 {
    public B0(@NonNull G0 g02, @NonNull WindowInsets windowInsets) {
        super(g02, windowInsets);
    }

    @Override // T.E0
    @NonNull
    public G0 a() {
        WindowInsets consumeDisplayCutout;
        consumeDisplayCutout = this.f2948c.consumeDisplayCutout();
        return G0.h(null, consumeDisplayCutout);
    }

    @Override // T.E0
    @Nullable
    public C0274i e() {
        DisplayCutout displayCutout;
        displayCutout = this.f2948c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new C0274i(displayCutout);
    }

    @Override // T.z0, T.E0
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof B0)) {
            return false;
        }
        B0 b02 = (B0) obj;
        if (Objects.equals(this.f2948c, b02.f2948c) && Objects.equals(this.f2952g, b02.f2952g)) {
            return true;
        }
        return false;
    }

    @Override // T.E0
    public int hashCode() {
        return this.f2948c.hashCode();
    }
}
