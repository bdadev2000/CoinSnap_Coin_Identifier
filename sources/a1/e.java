package a1;

import java.util.LinkedHashSet;
import ki.o;
import ki.w;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import y0.k1;
import y0.q0;

/* loaded from: classes.dex */
public final class e implements k1 {

    /* renamed from: f, reason: collision with root package name */
    public static final LinkedHashSet f16f = new LinkedHashSet();

    /* renamed from: g, reason: collision with root package name */
    public static final ac.e f17g = new ac.e();
    public final o a;

    /* renamed from: b, reason: collision with root package name */
    public final c f18b;

    /* renamed from: c, reason: collision with root package name */
    public final Function2 f19c;

    /* renamed from: d, reason: collision with root package name */
    public final Function0 f20d;

    /* renamed from: e, reason: collision with root package name */
    public final Lazy f21e;

    public e(w fileSystem, c1.d producePath) {
        e6.c serializer = e6.c.f17117c;
        q0 coordinatorProducer = q0.f27829d;
        Intrinsics.checkNotNullParameter(fileSystem, "fileSystem");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        Intrinsics.checkNotNullParameter(coordinatorProducer, "coordinatorProducer");
        Intrinsics.checkNotNullParameter(producePath, "producePath");
        this.a = fileSystem;
        this.f18b = serializer;
        this.f19c = coordinatorProducer;
        this.f20d = producePath;
        this.f21e = LazyKt.lazy(new d(this, 0));
    }
}
