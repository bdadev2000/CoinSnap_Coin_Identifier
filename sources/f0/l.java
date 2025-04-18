package f0;

import android.content.res.Resources;
import java.util.Objects;

/* loaded from: classes.dex */
public final class l {
    public final Resources a;

    /* renamed from: b, reason: collision with root package name */
    public final Resources.Theme f17528b;

    public l(Resources resources, Resources.Theme theme) {
        this.a = resources;
        this.f17528b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l.class != obj.getClass()) {
            return false;
        }
        l lVar = (l) obj;
        if (this.a.equals(lVar.a) && Objects.equals(this.f17528b, lVar.f17528b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.f17528b);
    }
}
