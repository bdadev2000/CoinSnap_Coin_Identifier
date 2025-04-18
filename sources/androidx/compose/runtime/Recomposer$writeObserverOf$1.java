package androidx.compose.runtime;

import androidx.collection.MutableScatterSet;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes4.dex */
final class Recomposer$writeObserverOf$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ControlledComposition f13960a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MutableScatterSet f13961b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Recomposer$writeObserverOf$1(MutableScatterSet mutableScatterSet, ControlledComposition controlledComposition) {
        super(1);
        this.f13960a = controlledComposition;
        this.f13961b = mutableScatterSet;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        this.f13960a.p(obj);
        MutableScatterSet mutableScatterSet = this.f13961b;
        if (mutableScatterSet != null) {
            mutableScatterSet.d(obj);
        }
        return b0.f30125a;
    }
}
