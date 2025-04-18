package z0;

import java.io.Serializable;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public final class g implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a, reason: collision with root package name */
    public final String f31475a;

    /* renamed from: b, reason: collision with root package name */
    public final int f31476b;

    public g(String str, int i2) {
        this.f31475a = str;
        this.f31476b = i2;
    }

    private final Object readResolve() {
        Pattern compile = Pattern.compile(this.f31475a, this.f31476b);
        p0.a.r(compile, "compile(...)");
        return new h(compile);
    }
}
