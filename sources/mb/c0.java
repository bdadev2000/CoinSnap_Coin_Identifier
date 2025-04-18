package mb;

import com.applovin.exoplayer2.common.base.Ascii;
import java.util.List;

/* loaded from: classes3.dex */
public final class c0 {
    public int a;

    /* renamed from: b, reason: collision with root package name */
    public String f21861b;

    /* renamed from: c, reason: collision with root package name */
    public int f21862c;

    /* renamed from: d, reason: collision with root package name */
    public int f21863d;

    /* renamed from: e, reason: collision with root package name */
    public long f21864e;

    /* renamed from: f, reason: collision with root package name */
    public long f21865f;

    /* renamed from: g, reason: collision with root package name */
    public long f21866g;

    /* renamed from: h, reason: collision with root package name */
    public String f21867h;

    /* renamed from: i, reason: collision with root package name */
    public List f21868i;

    /* renamed from: j, reason: collision with root package name */
    public byte f21869j;

    public final d0 a() {
        String str;
        if (this.f21869j == 63 && (str = this.f21861b) != null) {
            return new d0(this.a, str, this.f21862c, this.f21863d, this.f21864e, this.f21865f, this.f21866g, this.f21867h, this.f21868i);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.f21869j & 1) == 0) {
            sb2.append(" pid");
        }
        if (this.f21861b == null) {
            sb2.append(" processName");
        }
        if ((this.f21869j & 2) == 0) {
            sb2.append(" reasonCode");
        }
        if ((this.f21869j & 4) == 0) {
            sb2.append(" importance");
        }
        if ((this.f21869j & 8) == 0) {
            sb2.append(" pss");
        }
        if ((this.f21869j & Ascii.DLE) == 0) {
            sb2.append(" rss");
        }
        if ((this.f21869j & 32) == 0) {
            sb2.append(" timestamp");
        }
        throw new IllegalStateException(vd.e.f("Missing required properties:", sb2));
    }
}
