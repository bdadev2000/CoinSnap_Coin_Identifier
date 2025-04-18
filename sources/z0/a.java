package z0;

import java.nio.charset.Charset;

/* loaded from: classes3.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f31458a;

    /* renamed from: b, reason: collision with root package name */
    public static final Charset f31459b;

    /* renamed from: c, reason: collision with root package name */
    public static volatile Charset f31460c;
    public static volatile Charset d;

    static {
        Charset forName = Charset.forName("UTF-8");
        p0.a.r(forName, "forName(...)");
        f31458a = forName;
        p0.a.r(Charset.forName("UTF-16"), "forName(...)");
        p0.a.r(Charset.forName("UTF-16BE"), "forName(...)");
        p0.a.r(Charset.forName("UTF-16LE"), "forName(...)");
        Charset forName2 = Charset.forName("US-ASCII");
        p0.a.r(forName2, "forName(...)");
        f31459b = forName2;
        p0.a.r(Charset.forName("ISO-8859-1"), "forName(...)");
    }
}
