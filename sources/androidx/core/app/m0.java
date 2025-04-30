package androidx.core.app;

import androidx.core.graphics.drawable.IconCompat;
import java.util.Objects;

/* loaded from: classes.dex */
public final class m0 {

    /* renamed from: a, reason: collision with root package name */
    public CharSequence f4411a;
    public IconCompat b;

    /* renamed from: c, reason: collision with root package name */
    public String f4412c;

    /* renamed from: d, reason: collision with root package name */
    public String f4413d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f4414e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f4415f;

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj;
        String str = this.f4413d;
        String str2 = m0Var.f4413d;
        if (str == null && str2 == null) {
            if (!Objects.equals(Objects.toString(this.f4411a), Objects.toString(m0Var.f4411a)) || !Objects.equals(this.f4412c, m0Var.f4412c) || !Boolean.valueOf(this.f4414e).equals(Boolean.valueOf(m0Var.f4414e)) || !Boolean.valueOf(this.f4415f).equals(Boolean.valueOf(m0Var.f4415f))) {
                return false;
            }
            return true;
        }
        return Objects.equals(str, str2);
    }

    public final int hashCode() {
        String str = this.f4413d;
        if (str != null) {
            return str.hashCode();
        }
        return Objects.hash(this.f4411a, this.f4412c, Boolean.valueOf(this.f4414e), Boolean.valueOf(this.f4415f));
    }
}
