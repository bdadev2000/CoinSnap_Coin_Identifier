package li;

import java.util.ArrayList;
import ki.b0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class g {
    public final b0 a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f21389b;

    /* renamed from: c, reason: collision with root package name */
    public final long f21390c;

    /* renamed from: d, reason: collision with root package name */
    public final long f21391d;

    /* renamed from: e, reason: collision with root package name */
    public final int f21392e;

    /* renamed from: f, reason: collision with root package name */
    public final Long f21393f;

    /* renamed from: g, reason: collision with root package name */
    public final long f21394g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f21395h;

    public /* synthetic */ g(b0 b0Var) {
        this(b0Var, true, "", -1L, -1L, -1, null, -1L);
    }

    public g(b0 canonicalPath, boolean z10, String comment, long j3, long j10, int i10, Long l10, long j11) {
        Intrinsics.checkNotNullParameter(canonicalPath, "canonicalPath");
        Intrinsics.checkNotNullParameter(comment, "comment");
        this.a = canonicalPath;
        this.f21389b = z10;
        this.f21390c = j3;
        this.f21391d = j10;
        this.f21392e = i10;
        this.f21393f = l10;
        this.f21394g = j11;
        this.f21395h = new ArrayList();
    }
}
