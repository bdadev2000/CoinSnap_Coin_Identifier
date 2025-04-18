package androidx.compose.runtime.snapshots;

import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class SnapshotKt$mergedReadObserver$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f14581a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f14582b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnapshotKt$mergedReadObserver$1(l lVar, l lVar2) {
        super(1);
        this.f14581a = lVar;
        this.f14582b = lVar2;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        this.f14581a.invoke(obj);
        this.f14582b.invoke(obj);
        return b0.f30125a;
    }
}
