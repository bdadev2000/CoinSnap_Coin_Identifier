package mb;

import java.util.List;

/* loaded from: classes3.dex */
public final class z0 {
    public String a;

    /* renamed from: b, reason: collision with root package name */
    public int f22140b;

    /* renamed from: c, reason: collision with root package name */
    public List f22141c;

    /* renamed from: d, reason: collision with root package name */
    public byte f22142d;

    public final a1 a() {
        String str;
        List list;
        if (this.f22142d == 1 && (str = this.a) != null && (list = this.f22141c) != null) {
            return new a1(str, this.f22140b, list);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.a == null) {
            sb2.append(" name");
        }
        if ((1 & this.f22142d) == 0) {
            sb2.append(" importance");
        }
        if (this.f22141c == null) {
            sb2.append(" frames");
        }
        throw new IllegalStateException(vd.e.f("Missing required properties:", sb2));
    }
}
