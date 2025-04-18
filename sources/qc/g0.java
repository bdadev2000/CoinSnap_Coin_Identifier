package qc;

import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.FlowKt;
import n0.l1;

/* loaded from: classes3.dex */
public final class g0 implements w {

    /* renamed from: e, reason: collision with root package name */
    public static final y f23801e = new y();

    /* renamed from: f, reason: collision with root package name */
    public static final b1.b f23802f = d6.g.z(v.a, new z0.a(l1.f22312h));
    public final Context a;

    /* renamed from: b, reason: collision with root package name */
    public final CoroutineContext f23803b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReference f23804c;

    /* renamed from: d, reason: collision with root package name */
    public final d0 f23805d;

    public g0(Context context, CoroutineContext backgroundDispatcher) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(backgroundDispatcher, "backgroundDispatcher");
        this.a = context;
        this.f23803b = backgroundDispatcher;
        this.f23804c = new AtomicReference();
        f23801e.getClass();
        this.f23805d = new d0(FlowKt.m1688catch(((y0.j) f23802f.getValue(context, y.a[0])).getData(), new a0(null)), this);
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(backgroundDispatcher), null, null, new x(this, null), 3, null);
    }
}
