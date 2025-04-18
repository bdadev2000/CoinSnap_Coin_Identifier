package s7;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class s0 extends m2 {

    /* renamed from: g, reason: collision with root package name */
    public static final String f24742g = n9.h0.E(1);

    /* renamed from: h, reason: collision with root package name */
    public static final String f24743h = n9.h0.E(2);

    /* renamed from: i, reason: collision with root package name */
    public static final com.facebook.appevents.m f24744i = new com.facebook.appevents.m(22);

    /* renamed from: d, reason: collision with root package name */
    public final boolean f24745d;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f24746f;

    public s0() {
        this.f24745d = false;
        this.f24746f = false;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj;
        if (this.f24746f != s0Var.f24746f || this.f24745d != s0Var.f24745d) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f24745d), Boolean.valueOf(this.f24746f)});
    }

    public s0(boolean z10) {
        this.f24745d = true;
        this.f24746f = z10;
    }
}
