package T0;

import Q7.n0;
import java.util.Objects;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f2953a;
    public final int b;

    public c(String str) {
        this.f2953a = str;
        this.b = 0;
    }

    public final String a() {
        String str;
        int i9 = this.b;
        if (i9 == 0) {
            return this.f2953a;
        }
        StringBuilder sb = new StringBuilder("Wrong data accessor type detected. ");
        if (i9 == 0) {
            str = "String";
        } else if (i9 != 1) {
            str = "Unknown";
        } else {
            str = "ArrayBuffer";
        }
        throw new IllegalStateException(n0.l(sb, str, " expected, but got ", "String"));
    }

    public c(byte[] bArr) {
        Objects.requireNonNull(bArr);
        this.f2953a = null;
        this.b = 1;
    }
}
