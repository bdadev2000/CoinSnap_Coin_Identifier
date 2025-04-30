package g8;

import e8.p0;
import e8.s0;
import e8.v0;
import e8.y0;
import java.util.Set;

/* loaded from: classes3.dex */
public abstract class x {

    /* renamed from: a, reason: collision with root package name */
    public static final Set f20549a = com.bumptech.glide.d.W(s0.b, v0.b, p0.b, y0.b);

    public static final boolean a(c8.g gVar) {
        G7.j.e(gVar, "<this>");
        if (gVar.h() && f20549a.contains(gVar)) {
            return true;
        }
        return false;
    }
}
