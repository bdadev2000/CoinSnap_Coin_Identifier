package androidx.compose.runtime.snapshots;

import d0.b0;
import java.util.List;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes3.dex */
final class GlobalSnapshot$1$1$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f14536a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlobalSnapshot$1$1$1(List list) {
        super(1);
        this.f14536a = list;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        List list = this.f14536a;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((l) list.get(i2)).invoke(obj);
        }
        return b0.f30125a;
    }
}
