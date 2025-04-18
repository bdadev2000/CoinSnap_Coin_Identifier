package androidx.navigation;

/* loaded from: classes2.dex */
public final class NavArgument {

    /* renamed from: a, reason: collision with root package name */
    public final NavType f20320a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f20321b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f20322c;
    public final boolean d;
    public final Object e;

    /* loaded from: classes2.dex */
    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        public NavType f20323a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f20324b;

        /* renamed from: c, reason: collision with root package name */
        public Object f20325c;
        public boolean d;
        public boolean e;
    }

    public NavArgument(NavType navType, boolean z2, Object obj, boolean z3, boolean z4) {
        if (!navType.f20505a && z2) {
            throw new IllegalArgumentException((navType.b() + " does not allow nullable values").toString());
        }
        if (!z2 && z3 && obj == null) {
            throw new IllegalArgumentException(("Argument with type " + navType.b() + " has null value but is not nullable.").toString());
        }
        this.f20320a = navType;
        this.f20321b = z2;
        this.e = obj;
        this.f20322c = z3 || z4;
        this.d = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !p0.a.g(NavArgument.class, obj.getClass())) {
            return false;
        }
        NavArgument navArgument = (NavArgument) obj;
        if (this.f20321b != navArgument.f20321b || this.f20322c != navArgument.f20322c || !p0.a.g(this.f20320a, navArgument.f20320a)) {
            return false;
        }
        Object obj2 = navArgument.e;
        Object obj3 = this.e;
        return obj3 != null ? p0.a.g(obj3, obj2) : obj2 == null;
    }

    public final int hashCode() {
        int hashCode = ((((this.f20320a.hashCode() * 31) + (this.f20321b ? 1 : 0)) * 31) + (this.f20322c ? 1 : 0)) * 31;
        Object obj = this.e;
        return hashCode + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NavArgument");
        sb.append(" Type: " + this.f20320a);
        sb.append(" Nullable: " + this.f20321b);
        if (this.f20322c) {
            sb.append(" DefaultValue: " + this.e);
        }
        String sb2 = sb.toString();
        p0.a.r(sb2, "sb.toString()");
        return sb2;
    }
}
