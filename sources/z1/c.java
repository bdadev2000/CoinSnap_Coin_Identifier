package z1;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class c {
    public final Context a;

    /* renamed from: b, reason: collision with root package name */
    public String f28457b;

    /* renamed from: c, reason: collision with root package name */
    public b f28458c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f28459d;

    public c(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.a = context;
    }

    public final e a() {
        boolean z10;
        b bVar = this.f28458c;
        if (bVar != null) {
            boolean z11 = true;
            if (this.f28459d) {
                String str = this.f28457b;
                if (str != null && str.length() != 0) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (z10) {
                    z11 = false;
                }
            }
            if (z11) {
                return new e(this.a, this.f28457b, bVar, this.f28459d);
            }
            throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.".toString());
        }
        throw new IllegalArgumentException("Must set a callback to create the configuration.".toString());
    }
}
