package androidx.navigation.compose;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.navigation.NavBackStackEntry;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class NavHostKt$NavHost$visibleEntries$2$1 extends r implements q0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ State f20748a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavHostKt$NavHost$visibleEntries$2$1(MutableState mutableState) {
        super(0);
        this.f20748a = mutableState;
    }

    @Override // q0.a
    public final Object invoke() {
        List list = (List) this.f20748a.getValue();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (p0.a.g(((NavBackStackEntry) obj).f20328b.f20431a, "composable")) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
