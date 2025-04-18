package dg;

import android.view.View;
import android.widget.ImageView;
import com.plantcare.ai.identifier.plantid.R;
import kf.v2;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import mf.f;
import w5.k;

/* loaded from: classes4.dex */
public final class d extends f {

    /* renamed from: k, reason: collision with root package name */
    public final Function2 f17036k;

    /* renamed from: l, reason: collision with root package name */
    public int f17037l;

    public d(k onLanguageSelected) {
        Intrinsics.checkNotNullParameter(onLanguageSelected, "onLanguageSelected");
        this.f17036k = onLanguageSelected;
        this.f17037l = -1;
    }

    @Override // mf.f
    public final int a() {
        return R.layout.item_language;
    }

    @Override // mf.f
    public final void b(androidx.databinding.e binding, Object obj, int i10) {
        e obj2 = (e) obj;
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(obj2, "obj");
        if (binding instanceof v2) {
            View view = ((v2) binding).f1322i;
            Intrinsics.checkNotNullExpressionValue(view, "getRoot(...)");
            com.bumptech.glide.e.p(view, new uf.a(this, obj2, i10, 3));
        }
    }

    @Override // mf.f
    public final void c(androidx.databinding.e binding, Object obj, int i10) {
        int i11;
        boolean z10;
        e item = (e) obj;
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(item, "item");
        if (binding instanceof v2) {
            v2 v2Var = (v2) binding;
            ImageView imageView = v2Var.f20907v;
            Integer num = item.f17041f;
            if (num != null) {
                i11 = num.intValue();
            } else {
                i11 = R.drawable.ic_vietnamese;
            }
            imageView.setImageResource(i11);
            v2Var.f20908w.setText(item.f17038b);
            boolean z11 = true;
            if (i10 == this.f17037l) {
                z10 = true;
            } else {
                z10 = false;
            }
            v2Var.u.setActivated(z10);
            if (i10 != this.f17037l) {
                z11 = false;
            }
            v2Var.f20906t.setActivated(z11);
        }
    }
}
