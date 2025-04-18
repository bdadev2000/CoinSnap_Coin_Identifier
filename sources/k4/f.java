package k4;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class f implements com.bumptech.glide.load.data.e {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f20233b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f20234c;

    public /* synthetic */ f(Object obj, int i10) {
        this.f20233b = i10;
        this.f20234c = obj;
    }

    @Override // com.bumptech.glide.load.data.e
    public final Class a() {
        switch (this.f20233b) {
            case 0:
                return ByteBuffer.class;
            default:
                return this.f20234c.getClass();
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final void b() {
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
        int i10 = this.f20233b;
        Object obj = this.f20234c;
        switch (i10) {
            case 0:
                try {
                    dVar.f(w4.b.a((File) obj));
                    return;
                } catch (IOException e2) {
                    if (Log.isLoggable("ByteBufferFileLoader", 3)) {
                        Log.d("ByteBufferFileLoader", "Failed to obtain ByteBuffer for file", e2);
                    }
                    dVar.c(e2);
                    return;
                }
            default:
                dVar.f(obj);
                return;
        }
    }
}
