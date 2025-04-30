package K;

import android.content.res.Resources;
import java.util.Objects;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final Resources f1629a;
    public final Resources.Theme b;

    public l(Resources resources, Resources.Theme theme) {
        this.f1629a = resources;
        this.b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l.class != obj.getClass()) {
            return false;
        }
        l lVar = (l) obj;
        if (this.f1629a.equals(lVar.f1629a) && Objects.equals(this.b, lVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f1629a, this.b);
    }
}
