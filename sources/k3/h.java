package k3;

import java.util.Map;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public String f21415a;
    public Integer b;

    /* renamed from: c, reason: collision with root package name */
    public m f21416c;

    /* renamed from: d, reason: collision with root package name */
    public Long f21417d;

    /* renamed from: e, reason: collision with root package name */
    public Long f21418e;

    /* renamed from: f, reason: collision with root package name */
    public Map f21419f;

    /* renamed from: g, reason: collision with root package name */
    public Integer f21420g;

    /* renamed from: h, reason: collision with root package name */
    public String f21421h;

    /* renamed from: i, reason: collision with root package name */
    public byte[] f21422i;

    /* renamed from: j, reason: collision with root package name */
    public byte[] f21423j;

    public final void a(String str, String str2) {
        Map map = this.f21419f;
        if (map != null) {
            map.put(str, str2);
            return;
        }
        throw new IllegalStateException("Property \"autoMetadata\" has not been set");
    }

    public final i b() {
        String str;
        if (this.f21415a == null) {
            str = " transportName";
        } else {
            str = "";
        }
        if (this.f21416c == null) {
            str = str.concat(" encodedPayload");
        }
        if (this.f21417d == null) {
            str = com.mbridge.msdk.foundation.entity.o.j(str, " eventMillis");
        }
        if (this.f21418e == null) {
            str = com.mbridge.msdk.foundation.entity.o.j(str, " uptimeMillis");
        }
        if (this.f21419f == null) {
            str = com.mbridge.msdk.foundation.entity.o.j(str, " autoMetadata");
        }
        if (str.isEmpty()) {
            return new i(this.f21415a, this.b, this.f21416c, this.f21417d.longValue(), this.f21418e.longValue(), this.f21419f, this.f21420g, this.f21421h, this.f21422i, this.f21423j);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }
}
