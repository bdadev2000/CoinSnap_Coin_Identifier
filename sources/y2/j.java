package y2;

import com.facebook.H;
import com.facebook.internal.z;
import com.facebook.r;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final HashSet f24364a = com.bumptech.glide.d.N(200, 202);
    public static final HashSet b = com.bumptech.glide.d.N(503, 504, 429);

    /* renamed from: c, reason: collision with root package name */
    public static i f24365c;

    /* renamed from: d, reason: collision with root package name */
    public static List f24366d;

    /* renamed from: e, reason: collision with root package name */
    public static int f24367e;

    public static final void a(String str, String str2, String str3) {
        G7.j.e(str2, "url");
        L4.f fVar = z.f13680c;
        r.h(H.f13413f);
        f24365c = new i(str, str2, str3);
        f24366d = new ArrayList();
    }

    public static List b() {
        List list = f24366d;
        if (list != null) {
            return list;
        }
        G7.j.k("transformedEvents");
        throw null;
    }
}
