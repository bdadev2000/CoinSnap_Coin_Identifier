package n0;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Objects;

/* loaded from: classes.dex */
public class l2 extends k2 {
    public l2(@NonNull r2 r2Var, @NonNull WindowInsets windowInsets) {
        super(r2Var, windowInsets);
    }

    @Override // n0.o2
    @NonNull
    public r2 a() {
        WindowInsets consumeDisplayCutout;
        consumeDisplayCutout = this.f22297c.consumeDisplayCutout();
        return r2.h(null, consumeDisplayCutout);
    }

    @Override // n0.o2
    @Nullable
    public k e() {
        DisplayCutout displayCutout;
        displayCutout = this.f22297c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new k(displayCutout);
    }

    @Override // n0.j2, n0.o2
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l2)) {
            return false;
        }
        l2 l2Var = (l2) obj;
        if (Objects.equals(this.f22297c, l2Var.f22297c) && Objects.equals(this.f22301g, l2Var.f22301g)) {
            return true;
        }
        return false;
    }

    @Override // n0.o2
    public int hashCode() {
        return this.f22297c.hashCode();
    }
}
