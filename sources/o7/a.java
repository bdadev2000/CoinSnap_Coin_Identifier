package O7;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.nio.charset.Charset;

/* loaded from: classes3.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f2244a;
    public static volatile Charset b;

    /* renamed from: c, reason: collision with root package name */
    public static volatile Charset f2245c;

    static {
        Charset forName = Charset.forName("UTF-8");
        G7.j.d(forName, "forName(...)");
        f2244a = forName;
        G7.j.d(Charset.forName(C.UTF16_NAME), "forName(...)");
        G7.j.d(Charset.forName("UTF-16BE"), "forName(...)");
        G7.j.d(Charset.forName("UTF-16LE"), "forName(...)");
        G7.j.d(Charset.forName(C.ASCII_NAME), "forName(...)");
        G7.j.d(Charset.forName("ISO-8859-1"), "forName(...)");
    }
}
