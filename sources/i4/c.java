package i4;

import android.content.Context;
import java.io.File;

/* loaded from: classes.dex */
public abstract class c {
    public final long a = 262144000;

    /* renamed from: b, reason: collision with root package name */
    public final d3.g f19142b;

    public c(d3.g gVar) {
        this.f19142b = gVar;
    }

    public final c4.c a() {
        d3.g gVar = this.f19142b;
        File cacheDir = ((Context) gVar.f16812c).getCacheDir();
        if (cacheDir == null) {
            cacheDir = null;
        } else if (((String) gVar.f16813d) != null) {
            cacheDir = new File(cacheDir, (String) gVar.f16813d);
        }
        if (cacheDir == null) {
            return null;
        }
        if (!cacheDir.isDirectory() && !cacheDir.mkdirs()) {
            return null;
        }
        return new c4.c(cacheDir, this.a);
    }
}
