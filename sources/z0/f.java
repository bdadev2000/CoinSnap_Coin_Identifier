package z0;

import e0.g0;
import java.util.List;
import java.util.regex.Matcher;

/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final Matcher f31472a;

    /* renamed from: b, reason: collision with root package name */
    public final CharSequence f31473b;

    /* renamed from: c, reason: collision with root package name */
    public final e f31474c;
    public g0 d;

    public f(Matcher matcher, CharSequence charSequence) {
        p0.a.s(charSequence, "input");
        this.f31472a = matcher;
        this.f31473b = charSequence;
        this.f31474c = new e(this);
    }

    public final List a() {
        if (this.d == null) {
            this.d = new g0(this);
        }
        g0 g0Var = this.d;
        p0.a.p(g0Var);
        return g0Var;
    }

    public final w0.g b() {
        Matcher matcher = this.f31472a;
        return p0.a.F0(matcher.start(), matcher.end());
    }
}
