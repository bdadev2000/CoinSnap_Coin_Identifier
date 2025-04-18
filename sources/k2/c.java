package k2;

import java.util.Objects;

/* loaded from: classes.dex */
public final class c {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final int f20213b;

    public c(String str) {
        this.a = str;
        this.f20213b = 0;
    }

    public final String a() {
        String str;
        int i10 = this.f20213b;
        if (i10 == 0) {
            return this.a;
        }
        StringBuilder sb2 = new StringBuilder("Wrong data accessor type detected. ");
        if (i10 == 0) {
            str = "String";
        } else if (i10 != 1) {
            str = "Unknown";
        } else {
            str = "ArrayBuffer";
        }
        throw new IllegalStateException(kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.n(sb2, str, " expected, but got ", "String"));
    }

    public c(byte[] bArr) {
        Objects.requireNonNull(bArr);
        this.a = null;
        this.f20213b = 1;
    }
}
