package yc;

/* loaded from: classes3.dex */
public abstract class g {
    public static final boolean a;

    /* renamed from: b, reason: collision with root package name */
    public static final a f28164b;

    /* renamed from: c, reason: collision with root package name */
    public static final c f28165c;

    /* renamed from: d, reason: collision with root package name */
    public static final e f28166d;

    static {
        boolean z10;
        try {
            Class.forName("java.sql.Date");
            z10 = true;
        } catch (ClassNotFoundException unused) {
            z10 = false;
        }
        a = z10;
        if (z10) {
            f28164b = b.f28161b;
            f28165c = d.f28162b;
            f28166d = f.f28163b;
        } else {
            f28164b = null;
            f28165c = null;
            f28166d = null;
        }
    }
}
