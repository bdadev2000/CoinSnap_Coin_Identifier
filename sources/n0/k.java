package n0;

import android.view.DisplayCutout;
import java.util.Objects;

/* loaded from: classes.dex */
public final class k {
    public final DisplayCutout a;

    public k(DisplayCutout displayCutout) {
        this.a = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && k.class == obj.getClass()) {
            return Objects.equals(this.a, ((k) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        DisplayCutout displayCutout = this.a;
        if (displayCutout == null) {
            return 0;
        }
        hashCode = displayCutout.hashCode();
        return hashCode;
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.a + "}";
    }
}
