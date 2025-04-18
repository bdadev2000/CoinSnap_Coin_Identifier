package androidx.compose.runtime;

import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes3.dex */
final class Recomposer$readObserverOf$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ControlledComposition f13912a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Recomposer$readObserverOf$1(ControlledComposition controlledComposition) {
        super(1);
        this.f13912a = controlledComposition;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        this.f13912a.a(obj);
        return b0.f30125a;
    }
}
