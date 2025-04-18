package fg;

import a4.l;
import a4.m;
import a4.v;
import a4.w;
import a4.x;
import android.util.Log;
import com.android.billingclient.api.Purchase;
import com.plantcare.ai.identifier.plantid.ui.component.main.MainActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;

/* loaded from: classes4.dex */
public final /* synthetic */ class a implements w, x, v {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MainActivity f17860b;

    public /* synthetic */ a(MainActivity mainActivity) {
        this.f17860b = mainActivity;
    }

    @Override // a4.x
    public final void a(l billingResult, List list) {
        int i10 = MainActivity.f16644q;
        MainActivity this$0 = this.f17860b;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(billingResult, "billingResult");
        if (billingResult.a == 0 && list != null) {
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new b(list, this$0, null), 3, null);
        }
    }

    @Override // a4.w
    public final void d(l lVar, List purchases) {
        int i10 = MainActivity.f16644q;
        MainActivity this$0 = this.f17860b;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(lVar, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(purchases, "purchases");
        Iterator it = purchases.iterator();
        while (it.hasNext()) {
            Purchase purchase = (Purchase) it.next();
            this$0.getClass();
            eb.j jVar = null;
            if (purchase.a() == 1) {
                f.a aVar = new f.a(jVar);
                aVar.f17509c = purchase.b();
                m f10 = aVar.f();
                Intrinsics.checkNotNullExpressionValue(f10, "build(...)");
                nb.a aVar2 = new nb.a(11);
                a4.d dVar = this$0.f16650o;
                if (dVar != null) {
                    dVar.F(f10, aVar2);
                }
            }
            if (purchase.a() == 1) {
                f.a aVar3 = new f.a(jVar);
                aVar3.f17509c = purchase.b();
                m f11 = aVar3.f();
                Intrinsics.checkNotNullExpressionValue(f11, "build(...)");
                nb.a aVar4 = new nb.a(10);
                a4.d dVar2 = this$0.f16650o;
                if (dVar2 != null) {
                    dVar2.F(f11, aVar4);
                }
            }
        }
    }

    @Override // a4.v
    public final void l(l lVar, ArrayList list) {
        MainActivity this$0 = this.f17860b;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(lVar, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(list, "list");
        this$0.f16647l.clear();
        this$0.f16647l.addAll(CollectionsKt.sortedWith(list, new b0.g(8)));
        Log.d("duylt", "List: " + list.get(0));
    }
}
