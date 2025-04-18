package a2;

import android.content.Context;
import androidx.lifecycle.r0;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class h implements z1.g {

    /* renamed from: b, reason: collision with root package name */
    public final Context f68b;

    /* renamed from: c, reason: collision with root package name */
    public final String f69c;

    /* renamed from: d, reason: collision with root package name */
    public final z1.b f70d;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f71f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f72g;

    /* renamed from: h, reason: collision with root package name */
    public final Lazy f73h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f74i;

    public h(Context context, String str, z1.b callback, boolean z10, boolean z11) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f68b = context;
        this.f69c = str;
        this.f70d = callback;
        this.f71f = z10;
        this.f72g = z11;
        this.f73h = LazyKt.lazy(new r0(this, 2));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Lazy lazy = this.f73h;
        if (lazy.isInitialized()) {
            ((g) lazy.getValue()).close();
        }
    }

    public final z1.a d() {
        return ((g) this.f73h.getValue()).d(true);
    }
}
