package yg;

import java.io.Closeable;
import java.io.Flushable;

/* loaded from: classes4.dex */
public abstract class s implements Closeable, Flushable {

    /* renamed from: g, reason: collision with root package name */
    public boolean f28265g;

    /* renamed from: b, reason: collision with root package name */
    public int f28261b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int[] f28262c = new int[32];

    /* renamed from: d, reason: collision with root package name */
    public String[] f28263d = new String[32];

    /* renamed from: f, reason: collision with root package name */
    public int[] f28264f = new int[32];

    /* renamed from: h, reason: collision with root package name */
    public int f28266h = -1;

    public abstract r d();

    public abstract r g();

    public abstract r j();

    public abstract r k(String str);

    public abstract r p();

    public final int q() {
        int i10 = this.f28261b;
        if (i10 != 0) {
            return this.f28262c[i10 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public abstract r r(long j3);

    public abstract r s(String str);

    public final String z() {
        return com.bumptech.glide.e.B(this.f28261b, this.f28262c, this.f28264f, this.f28263d);
    }
}
