package d7;

import G7.j;
import a.AbstractC0325a;
import i8.M;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class e implements InterfaceC2194a {
    public static final d Companion = new d(null);
    private static final f8.b json = R2.b.a(c.INSTANCE);
    private final M7.d kType;

    public e(M7.d dVar) {
        j.e(dVar, "kType");
        this.kType = dVar;
    }

    @Override // d7.InterfaceC2194a
    public Object convert(M m) throws IOException {
        if (m != null) {
            try {
                String string = m.string();
                if (string != null) {
                    Object a6 = json.a(AbstractC0325a.q(f8.b.f20369d.b, this.kType), string);
                    android.support.v4.media.session.a.f(m, null);
                    return a6;
                }
            } finally {
            }
        }
        android.support.v4.media.session.a.f(m, null);
        return null;
    }
}
