package z8;

import java.util.Arrays;
import v8.u0;

/* loaded from: classes3.dex */
public final class b {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final String f28588b;

    /* renamed from: c, reason: collision with root package name */
    public final int f28589c;

    /* renamed from: d, reason: collision with root package name */
    public final int f28590d;

    public b(String str, String str2, int i10, int i11) {
        this.a = str;
        this.f28588b = str2;
        this.f28589c = i10;
        this.f28590d = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f28589c == bVar.f28589c && this.f28590d == bVar.f28590d && u0.t(this.a, bVar.a) && u0.t(this.f28588b, bVar.f28588b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.f28588b, Integer.valueOf(this.f28589c), Integer.valueOf(this.f28590d)});
    }
}
