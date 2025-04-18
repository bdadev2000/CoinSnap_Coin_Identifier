package androidx.compose.runtime.saveable;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.r;
import q0.p;

/* loaded from: classes2.dex */
final class ListSaverKt$listSaver$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f14489a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListSaverKt$listSaver$1(p pVar) {
        super(2);
        this.f14489a = pVar;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        SaverScope saverScope = (SaverScope) obj;
        List list = (List) this.f14489a.invoke(saverScope, obj2);
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj3 = list.get(i2);
            if (obj3 != null && !saverScope.a(obj3)) {
                throw new IllegalArgumentException("item can't be saved".toString());
            }
        }
        List list2 = list;
        if (!list2.isEmpty()) {
            return new ArrayList(list2);
        }
        return null;
    }
}
