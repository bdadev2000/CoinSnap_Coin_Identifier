package androidx.navigation.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import d0.b0;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class DialogHostKt$PopulateVisibleList$2 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f20571a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Collection f20572b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f20573c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogHostKt$PopulateVisibleList$2(List list, Collection collection, int i2) {
        super(2);
        this.f20571a = list;
        this.f20572b = collection;
        this.f20573c = i2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int a2 = RecomposeScopeImplKt.a(this.f20573c | 1);
        DialogHostKt.b(this.f20571a, this.f20572b, (Composer) obj, a2);
        return b0.f30125a;
    }
}
