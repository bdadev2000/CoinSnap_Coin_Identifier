package bg;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.databinding.e;
import com.plantcare.ai.identifier.plantid.R;
import com.plantcare.ai.identifier.plantid.domains.IapDomain;
import kf.n2;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import mf.f;
import w5.k;

/* loaded from: classes4.dex */
public final class a extends f {

    /* renamed from: k, reason: collision with root package name */
    public final Context f2431k;

    /* renamed from: l, reason: collision with root package name */
    public final Function2 f2432l;

    /* renamed from: m, reason: collision with root package name */
    public int f2433m;

    public a(Context contextParams, k onItemClick) {
        Intrinsics.checkNotNullParameter(contextParams, "contextParams");
        Intrinsics.checkNotNullParameter(onItemClick, "onItemClick");
        this.f2431k = contextParams;
        this.f2432l = onItemClick;
    }

    @Override // mf.f
    public final int a() {
        return R.layout.item_iap;
    }

    @Override // mf.f
    public final void b(e binding, Object obj, int i10) {
        IapDomain obj2 = (IapDomain) obj;
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(obj2, "obj");
        if (binding instanceof n2) {
            View view = ((n2) binding).f1322i;
            Intrinsics.checkNotNullExpressionValue(view, "getRoot(...)");
            com.bumptech.glide.e.p(view, new uf.a(this, obj2, i10, 2));
        }
    }

    @Override // mf.f
    public final void c(e binding, Object obj, int i10) {
        String string;
        boolean z10;
        IapDomain item = (IapDomain) obj;
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(item, "item");
        if (binding instanceof n2) {
            n2 n2Var = (n2) binding;
            TextView textView = n2Var.f20839w;
            boolean isTypeSubYear = item.isTypeSubYear();
            Context context = this.f2431k;
            boolean z11 = false;
            if (isTypeSubYear) {
                string = context.getString(item.getSubNameRes());
            } else {
                string = context.getString(item.getSubNameRes(), String.valueOf(item.getNumberOfScans()));
            }
            textView.setText(string);
            n2Var.f20840x.setText(item.getPrice());
            boolean isShowTagBestChoice = item.getIsShowTagBestChoice();
            TextView tvBestChoice = n2Var.f20838v;
            if (isShowTagBestChoice) {
                Intrinsics.checkNotNullExpressionValue(tvBestChoice, "tvBestChoice");
                com.bumptech.glide.e.V(tvBestChoice);
            } else {
                Intrinsics.checkNotNullExpressionValue(tvBestChoice, "tvBestChoice");
                com.bumptech.glide.e.E(tvBestChoice);
            }
            if (i10 == this.f2433m) {
                z10 = true;
            } else {
                z10 = false;
            }
            n2Var.u.setActivated(z10);
            if (i10 == this.f2433m) {
                z11 = true;
            }
            n2Var.f20837t.setActivated(z11);
        }
    }
}
