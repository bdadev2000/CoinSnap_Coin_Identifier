package z1;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class e {
    public final Context a;

    /* renamed from: b, reason: collision with root package name */
    public final String f28461b;

    /* renamed from: c, reason: collision with root package name */
    public final b f28462c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f28463d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f28464e;

    public e(Context context, String str, b callback, boolean z10) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.a = context;
        this.f28461b = str;
        this.f28462c = callback;
        this.f28463d = z10;
        this.f28464e = false;
    }
}
