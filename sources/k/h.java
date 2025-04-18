package k;

import android.webkit.MimeTypeMap;
import h.p;
import java.io.File;
import okio.FileSystem;
import okio.Path;

/* loaded from: classes3.dex */
public final class h implements g {

    /* renamed from: a, reason: collision with root package name */
    public final File f30873a;

    public h(File file) {
        this.f30873a = file;
    }

    @Override // k.g
    public final Object a(h0.g gVar) {
        Path.Companion companion = Path.Companion;
        File file = this.f30873a;
        p pVar = new p(Path.Companion.get$default(companion, file, false, 1, (Object) null), FileSystem.SYSTEM, null, null);
        MimeTypeMap singleton = MimeTypeMap.getSingleton();
        p0.a.s(file, "<this>");
        String name = file.getName();
        p0.a.r(name, "getName(...)");
        return new n(pVar, singleton.getMimeTypeFromExtension(z0.m.u1(name, '.', "")), h.g.f30670c);
    }
}
