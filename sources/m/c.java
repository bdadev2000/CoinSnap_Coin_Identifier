package m;

import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.net.Uri;
import org.objectweb.asm.signature.SignatureVisitor;
import q.n;
import v.g;

/* loaded from: classes2.dex */
public final class c implements b {
    @Override // m.b
    public final String a(Object obj, n nVar) {
        Uri uri = (Uri) obj;
        if (!p0.a.g(uri.getScheme(), "android.resource")) {
            return uri.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(uri);
        sb.append(SignatureVisitor.SUPER);
        Configuration configuration = nVar.f31314a.getResources().getConfiguration();
        Bitmap.Config[] configArr = g.f31378a;
        sb.append(configuration.uiMode & 48);
        return sb.toString();
    }
}
