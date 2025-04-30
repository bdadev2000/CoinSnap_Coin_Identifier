package T;

import android.view.DisplayCutout;
import java.util.Objects;

/* renamed from: T.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0274i {

    /* renamed from: a, reason: collision with root package name */
    public final DisplayCutout f2899a;

    public C0274i(DisplayCutout displayCutout) {
        this.f2899a = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0274i.class == obj.getClass()) {
            return Objects.equals(this.f2899a, ((C0274i) obj).f2899a);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        DisplayCutout displayCutout = this.f2899a;
        if (displayCutout != null) {
            hashCode = displayCutout.hashCode();
            return hashCode;
        }
        return 0;
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f2899a + "}";
    }
}
