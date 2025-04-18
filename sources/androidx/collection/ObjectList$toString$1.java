package androidx.collection;

import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes2.dex */
final class ObjectList$toString$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ObjectList f1551a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ObjectList$toString$1(ObjectList objectList) {
        super(1);
        this.f1551a = objectList;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        return obj == this.f1551a ? "(this)" : String.valueOf(obj);
    }
}
