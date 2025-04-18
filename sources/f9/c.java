package f9;

import android.graphics.PointF;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import n9.h0;
import n9.o;

/* loaded from: classes3.dex */
public final class c {
    public static final Pattern a = Pattern.compile("\\{([^}]*)\\}");

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f17739b = Pattern.compile(h0.k("\\\\pos\\((%1$s),(%1$s)\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f17740c = Pattern.compile(h0.k("\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f17741d = Pattern.compile("\\\\an(\\d+)");

    public static PointF a(String str) {
        String group;
        String group2;
        Matcher matcher = f17739b.matcher(str);
        Matcher matcher2 = f17740c.matcher(str);
        boolean find = matcher.find();
        boolean find2 = matcher2.find();
        if (find) {
            if (find2) {
                o.e("SsaStyle.Overrides", "Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='" + str + "'");
            }
            group = matcher.group(1);
            group2 = matcher.group(2);
        } else if (find2) {
            group = matcher2.group(1);
            group2 = matcher2.group(2);
        } else {
            return null;
        }
        group.getClass();
        float parseFloat = Float.parseFloat(group.trim());
        group2.getClass();
        return new PointF(parseFloat, Float.parseFloat(group2.trim()));
    }
}
