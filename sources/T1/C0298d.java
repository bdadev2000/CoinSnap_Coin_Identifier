package T1;

import android.util.Log;
import j2.AbstractC2384b;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: T1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0298d implements com.bumptech.glide.load.data.e {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f2968c;

    public /* synthetic */ C0298d(Object obj, int i9) {
        this.b = i9;
        this.f2968c = obj;
    }

    @Override // com.bumptech.glide.load.data.e
    public final Class a() {
        switch (this.b) {
            case 0:
                return ByteBuffer.class;
            default:
                return this.f2968c.getClass();
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final void b() {
        int i9 = this.b;
    }

    @Override // com.bumptech.glide.load.data.e
    public final void cancel() {
        int i9 = this.b;
    }

    @Override // com.bumptech.glide.load.data.e
    public final int d() {
        switch (this.b) {
            case 0:
                return 1;
            default:
                return 1;
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final void e(com.bumptech.glide.g gVar, com.bumptech.glide.load.data.d dVar) {
        switch (this.b) {
            case 0:
                try {
                    dVar.h(AbstractC2384b.a((File) this.f2968c));
                    return;
                } catch (IOException e4) {
                    if (Log.isLoggable("ByteBufferFileLoader", 3)) {
                        Log.d("ByteBufferFileLoader", "Failed to obtain ByteBuffer for file", e4);
                    }
                    dVar.c(e4);
                    return;
                }
            default:
                dVar.h(this.f2968c);
                return;
        }
    }

    private final void c() {
    }

    private final void f() {
    }

    private final void g() {
    }

    private final void h() {
    }
}
