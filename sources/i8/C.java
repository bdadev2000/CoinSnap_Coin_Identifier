package i8;

import java.util.LinkedHashMap;
import java.util.Map;
import t7.C2720i;
import u7.AbstractC2817h;
import u7.AbstractC2829t;

/* loaded from: classes3.dex */
public final class C {

    /* renamed from: a, reason: collision with root package name */
    public final u f20754a;
    public final String b;

    /* renamed from: c, reason: collision with root package name */
    public final s f20755c;

    /* renamed from: d, reason: collision with root package name */
    public final G f20756d;

    /* renamed from: e, reason: collision with root package name */
    public final Map f20757e;

    /* renamed from: f, reason: collision with root package name */
    public C2371h f20758f;

    public C(u uVar, String str, s sVar, G g9, Map map) {
        G7.j.e(uVar, "url");
        G7.j.e(str, "method");
        this.f20754a = uVar;
        this.b = str;
        this.f20755c = sVar;
        this.f20756d = g9;
        this.f20757e = map;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [i8.B, java.lang.Object] */
    public final B a() {
        LinkedHashMap d02;
        ?? obj = new Object();
        obj.f20753e = new LinkedHashMap();
        obj.f20750a = this.f20754a;
        obj.b = this.b;
        obj.f20752d = this.f20756d;
        Map map = this.f20757e;
        if (map.isEmpty()) {
            d02 = new LinkedHashMap();
        } else {
            d02 = AbstractC2829t.d0(map);
        }
        obj.f20753e = d02;
        obj.f20751c = this.f20755c.d();
        return obj;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Request{method=");
        sb.append(this.b);
        sb.append(", url=");
        sb.append(this.f20754a);
        s sVar = this.f20755c;
        if (sVar.size() != 0) {
            sb.append(", headers=[");
            int i9 = 0;
            for (Object obj : sVar) {
                int i10 = i9 + 1;
                if (i9 >= 0) {
                    C2720i c2720i = (C2720i) obj;
                    String str = (String) c2720i.b;
                    String str2 = (String) c2720i.f23021c;
                    if (i9 > 0) {
                        sb.append(", ");
                    }
                    sb.append(str);
                    sb.append(':');
                    sb.append(str2);
                    i9 = i10;
                } else {
                    AbstractC2817h.D();
                    throw null;
                }
            }
            sb.append(']');
        }
        Map map = this.f20757e;
        if (!map.isEmpty()) {
            sb.append(", tags=");
            sb.append(map);
        }
        sb.append('}');
        String sb2 = sb.toString();
        G7.j.d(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
