package androidx.compose.foundation.text.selection;

import androidx.compose.runtime.saveable.SaverKt$Saver$1;
import java.io.Serializable;
import java.util.Comparator;
import kotlin.jvm.internal.q;
import q0.l;
import q0.p;

/* loaded from: classes4.dex */
public final /* synthetic */ class b implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7364a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7365b;

    public /* synthetic */ b(Serializable serializable, int i2) {
        this.f7364a = i2;
        this.f7365b = serializable;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i2 = this.f7364a;
        Object obj3 = this.f7365b;
        switch (i2) {
            case 0:
                SaverKt$Saver$1 saverKt$Saver$1 = SelectionRegistrarImpl.f7274m;
                return ((Number) ((p) obj3).invoke(obj, obj2)).intValue();
            default:
                l[] lVarArr = (l[]) obj3;
                p0.a.s(lVarArr, "$selectors");
                for (l lVar : lVarArr) {
                    int c2 = q.c((Comparable) lVar.invoke(obj), (Comparable) lVar.invoke(obj2));
                    if (c2 != 0) {
                        return c2;
                    }
                }
                return 0;
        }
    }
}
