package androidx.collection;

import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes.dex */
final class ScatterSet$toString$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ScatterSet f1604a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScatterSet$toString$1(ScatterSet scatterSet) {
        super(1);
        this.f1604a = scatterSet;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        return obj == this.f1604a ? "(this)" : String.valueOf(obj);
    }
}
