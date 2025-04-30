package f8;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;

/* loaded from: classes3.dex */
public final class q extends y {
    public final boolean b;

    /* renamed from: c, reason: collision with root package name */
    public final String f20405c;

    public q(Object obj, boolean z8) {
        G7.j.e(obj, TtmlNode.TAG_BODY);
        this.b = z8;
        this.f20405c = obj.toString();
    }

    @Override // f8.y
    public final String b() {
        return this.f20405c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !G7.s.a(q.class).equals(G7.s.a(obj.getClass()))) {
            return false;
        }
        q qVar = (q) obj;
        if (this.b == qVar.b && G7.j.a(this.f20405c, qVar.f20405c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f20405c.hashCode() + (Boolean.hashCode(this.b) * 31);
    }

    @Override // f8.y
    public final String toString() {
        String str = this.f20405c;
        if (this.b) {
            StringBuilder sb = new StringBuilder();
            g8.y.a(sb, str);
            String sb2 = sb.toString();
            G7.j.d(sb2, "StringBuilder().apply(builderAction).toString()");
            return sb2;
        }
        return str;
    }
}
