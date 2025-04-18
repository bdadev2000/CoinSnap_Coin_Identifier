package ag;

import a4.l;
import a4.m;
import a4.n;
import a4.v;
import a4.w;
import a4.x;
import android.util.Log;
import b0.g;
import com.android.billingclient.api.Purchase;
import com.plantcare.ai.identifier.plantid.domains.IapDomain;
import com.plantcare.ai.identifier.plantid.ui.component.iap.IapActivity;
import eb.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;

/* loaded from: classes4.dex */
public final /* synthetic */ class a implements x, w, n, v {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ IapActivity f482b;

    public /* synthetic */ a(IapActivity iapActivity) {
        this.f482b = iapActivity;
    }

    @Override // a4.x
    public final void a(l billingResult, List list) {
        int i10 = IapActivity.f16628k;
        IapActivity this$0 = this.f482b;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(billingResult, "billingResult");
        if (billingResult.a == 0 && list != null) {
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new c(list, this$0, null), 3, null);
        }
    }

    @Override // a4.n
    public final void b(l billingResult, String str) {
        int i10 = IapActivity.f16628k;
        IapActivity this$0 = this.f482b;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(billingResult, "billingResult");
        Intrinsics.checkNotNullParameter(str, "<anonymous parameter 1>");
        if (billingResult.a == 0) {
            IapDomain iapDomain = this$0.f16631h;
        }
    }

    @Override // a4.w
    public final void d(l lVar, List purchases) {
        int i10 = IapActivity.f16628k;
        IapActivity this$0 = this.f482b;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(lVar, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(purchases, "purchases");
        Iterator it = purchases.iterator();
        while (it.hasNext()) {
            Purchase purchase = (Purchase) it.next();
            this$0.getClass();
            j jVar = null;
            if (purchase.a() == 1) {
                f.a aVar = new f.a(jVar);
                aVar.f17509c = purchase.b();
                m f10 = aVar.f();
                Intrinsics.checkNotNullExpressionValue(f10, "build(...)");
                a aVar2 = new a(this$0);
                a4.d dVar = this$0.f16630g;
                if (dVar != null) {
                    dVar.F(f10, aVar2);
                }
            }
            if (purchase.a() == 1) {
                f.a aVar3 = new f.a(jVar);
                aVar3.f17509c = purchase.b();
                m f11 = aVar3.f();
                Intrinsics.checkNotNullExpressionValue(f11, "build(...)");
                nb.a aVar4 = new nb.a(9);
                a4.d dVar2 = this$0.f16630g;
                if (dVar2 != null) {
                    dVar2.F(f11, aVar4);
                }
            }
        }
    }

    @Override // a4.v
    public final void l(l lVar, ArrayList list) {
        IapActivity this$0 = this.f482b;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(lVar, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(list, "list");
        this$0.f16632i.clear();
        this$0.f16632i.addAll(CollectionsKt.sortedWith(list, new g(7)));
        Log.d("duylt", "List: " + list.size());
    }
}
