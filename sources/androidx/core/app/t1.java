package androidx.core.app;

import androidx.core.graphics.drawable.IconCompat;
import java.util.Objects;

/* loaded from: classes.dex */
public final class t1 {
    public final CharSequence a;

    /* renamed from: b, reason: collision with root package name */
    public final IconCompat f1252b;

    /* renamed from: c, reason: collision with root package name */
    public final String f1253c;

    /* renamed from: d, reason: collision with root package name */
    public final String f1254d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f1255e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f1256f;

    public t1(s1 s1Var) {
        this.a = s1Var.a;
        this.f1252b = s1Var.f1244b;
        this.f1253c = s1Var.f1245c;
        this.f1254d = s1Var.f1246d;
        this.f1255e = s1Var.f1247e;
        this.f1256f = s1Var.f1248f;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof t1)) {
            return false;
        }
        t1 t1Var = (t1) obj;
        String str = this.f1254d;
        String str2 = t1Var.f1254d;
        if (str == null && str2 == null) {
            if (!Objects.equals(Objects.toString(this.a), Objects.toString(t1Var.a)) || !Objects.equals(this.f1253c, t1Var.f1253c) || !Objects.equals(Boolean.valueOf(this.f1255e), Boolean.valueOf(t1Var.f1255e)) || !Objects.equals(Boolean.valueOf(this.f1256f), Boolean.valueOf(t1Var.f1256f))) {
                return false;
            }
            return true;
        }
        return Objects.equals(str, str2);
    }

    public final int hashCode() {
        String str = this.f1254d;
        if (str != null) {
            return str.hashCode();
        }
        return Objects.hash(this.a, this.f1253c, Boolean.valueOf(this.f1255e), Boolean.valueOf(this.f1256f));
    }
}
