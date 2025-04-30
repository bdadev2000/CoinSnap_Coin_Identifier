package O7;

import java.io.Serializable;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public final class e implements Serializable {
    public final Pattern b;

    public e(Pattern pattern) {
        this.b = pattern;
    }

    private final Object writeReplace() {
        Pattern pattern = this.b;
        String pattern2 = pattern.pattern();
        G7.j.d(pattern2, "pattern(...)");
        return new d(pattern2, pattern.flags());
    }

    public final String toString() {
        String pattern = this.b.toString();
        G7.j.d(pattern, "toString(...)");
        return pattern;
    }

    public e(String str) {
        Pattern compile = Pattern.compile(str);
        G7.j.d(compile, "compile(...)");
        this.b = compile;
    }
}
