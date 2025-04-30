package G6;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.tools.arruler.models.InternalImageModel;
import com.tools.arruler.ui.component.iap.IAPActivity;
import com.tools.arruler.ui.component.imagedetail.ImageDetailActivity;
import t7.y;

/* loaded from: classes3.dex */
public final /* synthetic */ class f implements F7.l {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n f1304c;

    public /* synthetic */ f(n nVar, int i9) {
        this.b = i9;
        this.f1304c = nVar;
    }

    @Override // F7.l
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                n nVar = this.f1304c;
                G7.j.e(nVar, "this$0");
                nVar.i();
                return y.f23029a;
            case 1:
                n nVar2 = this.f1304c;
                G7.j.e(nVar2, "this$0");
                nVar2.i();
                return y.f23029a;
            case 2:
                n nVar3 = this.f1304c;
                G7.j.e(nVar3, "this$0");
                Bundle bundle = new Bundle();
                bundle.putBoolean("IAP_FROM_MAIN", true);
                nVar3.g(IAPActivity.class, bundle);
                return y.f23029a;
            case 3:
                InternalImageModel internalImageModel = (InternalImageModel) obj;
                n nVar4 = this.f1304c;
                G7.j.e(nVar4, "this$0");
                G7.j.e(internalImageModel, "it");
                Intent intent = new Intent(nVar4.requireContext(), (Class<?>) ImageDetailActivity.class);
                intent.putExtra("extra_image_path", internalImageModel.getPath());
                nVar4.f1317d.a(intent);
                return y.f23029a;
            default:
                InternalImageModel internalImageModel2 = (InternalImageModel) obj;
                n nVar5 = this.f1304c;
                G7.j.e(nVar5, "this$0");
                G7.j.e(internalImageModel2, "internalImageModel");
                Context requireContext = nVar5.requireContext();
                G7.j.d(requireContext, "requireContext(...)");
                new D6.c(requireContext, new g(nVar5, internalImageModel2, 0)).show();
                return y.f23029a;
        }
    }
}
