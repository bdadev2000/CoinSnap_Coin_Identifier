package androidx.navigation;

import androidx.navigation.NavDestination;

/* loaded from: classes2.dex */
public final class NavOptions {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f20472a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f20473b;

    /* renamed from: c, reason: collision with root package name */
    public final int f20474c;
    public final boolean d;
    public final boolean e;

    /* renamed from: f, reason: collision with root package name */
    public final int f20475f;

    /* renamed from: g, reason: collision with root package name */
    public final int f20476g;

    /* renamed from: h, reason: collision with root package name */
    public final int f20477h;

    /* renamed from: i, reason: collision with root package name */
    public final int f20478i;

    /* renamed from: j, reason: collision with root package name */
    public String f20479j;

    /* loaded from: classes2.dex */
    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        public boolean f20480a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f20481b;
        public String d;
        public boolean e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f20483f;

        /* renamed from: c, reason: collision with root package name */
        public int f20482c = -1;

        /* renamed from: g, reason: collision with root package name */
        public int f20484g = -1;

        /* renamed from: h, reason: collision with root package name */
        public int f20485h = -1;

        /* renamed from: i, reason: collision with root package name */
        public int f20486i = -1;

        /* renamed from: j, reason: collision with root package name */
        public int f20487j = -1;

        public final NavOptions a() {
            String str = this.d;
            if (str == null) {
                return new NavOptions(this.f20480a, this.f20481b, this.f20482c, this.e, this.f20483f, this.f20484g, this.f20485h, this.f20486i, this.f20487j);
            }
            boolean z2 = this.f20480a;
            boolean z3 = this.f20481b;
            boolean z4 = this.e;
            boolean z5 = this.f20483f;
            int i2 = this.f20484g;
            int i3 = this.f20485h;
            int i4 = this.f20486i;
            int i5 = this.f20487j;
            int i6 = NavDestination.f20430k;
            NavOptions navOptions = new NavOptions(z2, z3, NavDestination.Companion.a(str).hashCode(), z4, z5, i2, i3, i4, i5);
            navOptions.f20479j = str;
            return navOptions;
        }
    }

    public NavOptions(boolean z2, boolean z3, int i2, boolean z4, boolean z5, int i3, int i4, int i5, int i6) {
        this.f20472a = z2;
        this.f20473b = z3;
        this.f20474c = i2;
        this.d = z4;
        this.e = z5;
        this.f20475f = i3;
        this.f20476g = i4;
        this.f20477h = i5;
        this.f20478i = i6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof NavOptions)) {
            return false;
        }
        NavOptions navOptions = (NavOptions) obj;
        if (this.f20472a == navOptions.f20472a && this.f20473b == navOptions.f20473b && this.f20474c == navOptions.f20474c && p0.a.g(this.f20479j, navOptions.f20479j)) {
            navOptions.getClass();
            if (p0.a.g(null, null)) {
                navOptions.getClass();
                if (p0.a.g(null, null) && this.d == navOptions.d && this.e == navOptions.e && this.f20475f == navOptions.f20475f && this.f20476g == navOptions.f20476g && this.f20477h == navOptions.f20477h && this.f20478i == navOptions.f20478i) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i2 = (((((this.f20472a ? 1 : 0) * 31) + (this.f20473b ? 1 : 0)) * 31) + this.f20474c) * 31;
        String str = this.f20479j;
        return ((((((((((((((((i2 + (str != null ? str.hashCode() : 0)) * 31) + 0) * 31) + 0) * 31) + (this.d ? 1 : 0)) * 31) + (this.e ? 1 : 0)) * 31) + this.f20475f) * 31) + this.f20476g) * 31) + this.f20477h) * 31) + this.f20478i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NavOptions(");
        if (this.f20472a) {
            sb.append("launchSingleTop ");
        }
        if (this.f20473b) {
            sb.append("restoreState ");
        }
        int i2 = this.f20474c;
        String str = this.f20479j;
        if ((str != null || i2 != -1) && str != null) {
            sb.append("popUpTo(");
            if (str != null) {
                sb.append(str);
            } else {
                sb.append("0x");
                sb.append(Integer.toHexString(i2));
            }
            if (this.d) {
                sb.append(" inclusive");
            }
            if (this.e) {
                sb.append(" saveState");
            }
            sb.append(")");
        }
        int i3 = this.f20478i;
        int i4 = this.f20477h;
        int i5 = this.f20476g;
        int i6 = this.f20475f;
        if (i6 != -1 || i5 != -1 || i4 != -1 || i3 != -1) {
            sb.append("anim(enterAnim=0x");
            sb.append(Integer.toHexString(i6));
            sb.append(" exitAnim=0x");
            sb.append(Integer.toHexString(i5));
            sb.append(" popEnterAnim=0x");
            sb.append(Integer.toHexString(i4));
            sb.append(" popExitAnim=0x");
            sb.append(Integer.toHexString(i3));
            sb.append(")");
        }
        String sb2 = sb.toString();
        p0.a.r(sb2, "sb.toString()");
        return sb2;
    }
}
