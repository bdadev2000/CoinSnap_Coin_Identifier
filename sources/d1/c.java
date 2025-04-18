package d1;

import ac.e;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public abstract class c {
    public int a;

    /* renamed from: b, reason: collision with root package name */
    public int f16789b;

    /* renamed from: c, reason: collision with root package name */
    public int f16790c;

    /* renamed from: d, reason: collision with root package name */
    public Object f16791d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f16792e;

    public c(int i10) {
        if (i10 != 1) {
            if (e.f433b == null) {
                e.f433b = new e(null);
            }
            this.f16792e = e.f433b;
        } else {
            this.f16791d = new int[4];
            this.a = -1;
            this.f16789b = -1;
            this.f16792e = com.bumptech.glide.e.G(bf.c.a);
        }
    }

    public final int a(int i10) {
        if (i10 < this.f16790c) {
            return ((ByteBuffer) this.f16791d).getShort(this.f16789b + i10);
        }
        return 0;
    }

    public final void b(int i10, ByteBuffer byteBuffer) {
        this.f16791d = byteBuffer;
        if (byteBuffer != null) {
            this.a = i10;
            int i11 = i10 - byteBuffer.getInt(i10);
            this.f16789b = i11;
            this.f16790c = ((ByteBuffer) this.f16791d).getShort(i11);
            return;
        }
        this.a = 0;
        this.f16789b = 0;
        this.f16790c = 0;
    }
}
