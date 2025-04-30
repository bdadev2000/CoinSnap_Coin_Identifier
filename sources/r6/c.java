package r6;

import G7.j;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.vungle.ads.L;
import g4.AbstractC2292b;
import java.util.LinkedHashMap;
import n1.C2470a;
import n1.C2475f;
import o1.C2492a;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: g, reason: collision with root package name */
    public static final b f22895g = new Object();

    /* renamed from: h, reason: collision with root package name */
    public static c f22896h;

    /* renamed from: c, reason: collision with root package name */
    public int f22898c;

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f22897a = new LinkedHashMap();
    public final LinkedHashMap b = new LinkedHashMap();

    /* renamed from: d, reason: collision with root package name */
    public boolean f22899d = true;

    /* renamed from: e, reason: collision with root package name */
    public final Handler f22900e = new Handler(Looper.getMainLooper());

    /* renamed from: f, reason: collision with root package name */
    public final L f22901f = new L(this, 9);

    public final void a(Context context, String str) {
        j.e(context, "context");
        LinkedHashMap linkedHashMap = this.b;
        Object obj = linkedHashMap.get(str);
        EnumC2680a enumC2680a = EnumC2680a.f22891c;
        if (obj == enumC2680a) {
            return;
        }
        if (!android.support.v4.media.session.a.v(context)) {
            linkedHashMap.put(str, EnumC2680a.f22893f);
            return;
        }
        LinkedHashMap linkedHashMap2 = this.f22897a;
        if (linkedHashMap2.get(str) != null) {
            Object obj2 = linkedHashMap2.get(str);
            j.b(obj2);
            if (((C2492a) obj2).b != null) {
                linkedHashMap.put(str, EnumC2680a.f22892d);
                return;
            }
        }
        linkedHashMap.put(str, enumC2680a);
        C2475f p2 = C2475f.p();
        C2470a c2470a = new C2470a(1, this, str);
        p2.getClass();
        C2475f.q(context, str, c2470a);
    }

    public final void b(Context context, String str, AbstractC2292b abstractC2292b) {
        j.e(context, "context");
        C2492a c2492a = (C2492a) this.f22897a.get(str);
        if (!this.f22899d) {
            abstractC2292b.h();
            return;
        }
        if (c2492a != null && c2492a.b != null) {
            C2475f p2 = C2475f.p();
            C2470a c2470a = new C2470a(2, this, abstractC2292b);
            p2.getClass();
            C2475f.n(c2470a, context, c2492a);
            return;
        }
        abstractC2292b.h();
    }
}
