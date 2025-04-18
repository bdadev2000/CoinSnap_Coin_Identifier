package xb;

import java.nio.charset.Charset;
import java.util.Map;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements vb.d {
    public final /* synthetic */ int a;

    @Override // vb.a
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                throw new vb.b("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                vb.e eVar = (vb.e) obj2;
                Charset charset = yb.f.f28147f;
                eVar.a(yb.f.f28148g, entry.getKey());
                eVar.a(yb.f.f28149h, entry.getValue());
                return;
            default:
                throw new vb.b("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }
    }
}
