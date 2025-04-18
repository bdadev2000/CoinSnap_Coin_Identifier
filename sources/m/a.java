package m;

import java.io.File;
import q.n;

/* loaded from: classes2.dex */
public final class a implements b {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f31047a;

    public a(boolean z2) {
        this.f31047a = z2;
    }

    @Override // m.b
    public final String a(Object obj, n nVar) {
        File file = (File) obj;
        if (!this.f31047a) {
            return file.getPath();
        }
        return file.getPath() + ':' + file.lastModified();
    }
}
