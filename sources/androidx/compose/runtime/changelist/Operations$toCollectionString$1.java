package androidx.compose.runtime.changelist;

import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes2.dex */
final class Operations$toCollectionString$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Operations f14139a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f14140b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Operations$toCollectionString$1(Operations operations, String str) {
        super(1);
        this.f14139a = operations;
        this.f14140b = str;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        return this.f14139a.e(obj, this.f14140b);
    }
}
