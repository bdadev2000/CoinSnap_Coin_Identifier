package O7;

import java.io.Serializable;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public final class d implements Serializable {
    private static final long serialVersionUID = 0;
    public final String b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2254c;

    public d(String str, int i9) {
        this.b = str;
        this.f2254c = i9;
    }

    private final Object readResolve() {
        Pattern compile = Pattern.compile(this.b, this.f2254c);
        G7.j.d(compile, "compile(...)");
        return new e(compile);
    }
}
