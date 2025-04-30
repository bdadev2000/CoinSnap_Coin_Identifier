package P1;

import android.content.Context;
import j5.C2400c;
import java.io.File;

/* loaded from: classes.dex */
public final class m implements j2.h {
    public volatile Object b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f2356c;

    public /* synthetic */ m(Object obj) {
        this.f2356c = obj;
    }

    public R1.a a() {
        if (((R1.a) this.b) == null) {
            synchronized (this) {
                try {
                    if (((R1.a) this.b) == null) {
                        a7.b bVar = (a7.b) ((C2400c) this.f2356c).f21107c;
                        File cacheDir = ((Context) bVar.f4077c).getCacheDir();
                        R1.c cVar = null;
                        if (cacheDir == null) {
                            cacheDir = null;
                        } else {
                            String str = (String) bVar.f4078d;
                            if (str != null) {
                                cacheDir = new File(cacheDir, str);
                            }
                        }
                        if (cacheDir != null && (cacheDir.isDirectory() || cacheDir.mkdirs())) {
                            cVar = new R1.c(cacheDir);
                        }
                        this.b = cVar;
                    }
                    if (((R1.a) this.b) == null) {
                        this.b = new Object();
                    }
                } finally {
                }
            }
        }
        return (R1.a) this.b;
    }

    @Override // j2.h
    public Object get() {
        if (this.b == null) {
            synchronized (this) {
                try {
                    if (this.b == null) {
                        Object obj = ((j2.h) this.f2356c).get();
                        j2.g.c(obj, "Argument must not be null");
                        this.b = obj;
                    }
                } finally {
                }
            }
        }
        return this.b;
    }
}
