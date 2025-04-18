package z0;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import n0.l1;
import y0.b;
import y0.c;

/* loaded from: classes.dex */
public final class a implements c {

    /* renamed from: b, reason: collision with root package name */
    public final Function1 f28456b;

    public a(l1 produceNewData) {
        Intrinsics.checkNotNullParameter(produceNewData, "produceNewData");
        this.f28456b = produceNewData;
    }

    @Override // y0.c
    public final Object a(b bVar) {
        return this.f28456b.invoke(bVar);
    }
}
