package mb;

import java.util.List;

/* loaded from: classes3.dex */
public final class v0 {
    public String a;

    /* renamed from: b, reason: collision with root package name */
    public String f22114b;

    /* renamed from: c, reason: collision with root package name */
    public List f22115c;

    /* renamed from: d, reason: collision with root package name */
    public c2 f22116d;

    /* renamed from: e, reason: collision with root package name */
    public int f22117e;

    /* renamed from: f, reason: collision with root package name */
    public byte f22118f;

    public final w0 a() {
        String str;
        List list;
        if (this.f22118f == 1 && (str = this.a) != null && (list = this.f22115c) != null) {
            return new w0(str, this.f22114b, list, this.f22116d, this.f22117e);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.a == null) {
            sb2.append(" type");
        }
        if (this.f22115c == null) {
            sb2.append(" frames");
        }
        if ((1 & this.f22118f) == 0) {
            sb2.append(" overflowCount");
        }
        throw new IllegalStateException(vd.e.f("Missing required properties:", sb2));
    }
}
