package k9;

import java.util.Arrays;
import n9.h0;

/* loaded from: classes3.dex */
public final class i implements s7.i {

    /* renamed from: f, reason: collision with root package name */
    public static final String f20428f = h0.E(0);

    /* renamed from: g, reason: collision with root package name */
    public static final String f20429g = h0.E(1);

    /* renamed from: h, reason: collision with root package name */
    public static final String f20430h = h0.E(2);

    /* renamed from: b, reason: collision with root package name */
    public final int f20431b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f20432c;

    /* renamed from: d, reason: collision with root package name */
    public final int f20433d;

    static {
        new n0.h(7);
    }

    public i(int i10, int[] iArr, int i11) {
        this.f20431b = i10;
        int[] copyOf = Arrays.copyOf(iArr, iArr.length);
        this.f20432c = copyOf;
        this.f20433d = i11;
        Arrays.sort(copyOf);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i.class != obj.getClass()) {
            return false;
        }
        i iVar = (i) obj;
        if (this.f20431b == iVar.f20431b && Arrays.equals(this.f20432c, iVar.f20432c) && this.f20433d == iVar.f20433d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((Arrays.hashCode(this.f20432c) + (this.f20431b * 31)) * 31) + this.f20433d;
    }
}
