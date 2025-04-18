package k4;

import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class h implements com.bumptech.glide.load.data.e {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f20236b;

    /* renamed from: c, reason: collision with root package name */
    public Object f20237c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f20238d;

    /* renamed from: f, reason: collision with root package name */
    public final Object f20239f;

    public /* synthetic */ h(int i10, Object obj, Object obj2) {
        this.f20236b = i10;
        this.f20238d = obj;
        this.f20239f = obj2;
    }

    @Override // com.bumptech.glide.load.data.e
    public final Class a() {
        int i10 = this.f20236b;
        Object obj = this.f20239f;
        switch (i10) {
            case 0:
                ((kc.c) obj).getClass();
                return InputStream.class;
            default:
                return ((o) obj).a();
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final void b() {
        int i10 = this.f20236b;
        Object obj = this.f20239f;
        switch (i10) {
            case 0:
                try {
                    Object obj2 = this.f20237c;
                    ((kc.c) obj).getClass();
                    ((InputStream) obj2).close();
                    return;
                } catch (IOException unused) {
                    return;
                }
            default:
                Object obj3 = this.f20237c;
                if (obj3 != null) {
                    try {
                        ((o) obj).b(obj3);
                        return;
                    } catch (IOException unused2) {
                        return;
                    }
                }
                return;
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final void cancel() {
    }

    @Override // com.bumptech.glide.load.data.e
    public final e4.a d() {
        return e4.a.LOCAL;
    }

    @Override // com.bumptech.glide.load.data.e
    public final void e(com.bumptech.glide.h hVar, com.bumptech.glide.load.data.d dVar) {
        int i10 = this.f20236b;
        Object obj = this.f20238d;
        Object obj2 = this.f20239f;
        switch (i10) {
            case 0:
                try {
                    ((kc.c) obj2).getClass();
                    ByteArrayInputStream p10 = kc.c.p((String) obj);
                    this.f20237c = p10;
                    dVar.f(p10);
                    return;
                } catch (IllegalArgumentException e2) {
                    dVar.c(e2);
                    return;
                }
            default:
                try {
                    Object l10 = ((o) obj2).l((File) obj);
                    this.f20237c = l10;
                    dVar.f(l10);
                    return;
                } catch (FileNotFoundException e10) {
                    if (Log.isLoggable("FileLoader", 3)) {
                        Log.d("FileLoader", "Failed to open file", e10);
                    }
                    dVar.c(e10);
                    return;
                }
        }
    }
}
