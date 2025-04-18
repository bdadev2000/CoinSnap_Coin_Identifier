package of;

import android.widget.TextView;
import androidx.fragment.app.w1;
import androidx.lifecycle.y0;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.internal.i;
import com.plantcare.ai.identifier.plantid.R;
import com.plantcare.ai.identifier.plantid.ui.component.plan_identifier.preview.PreviewModel;
import kf.a1;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import w5.k;

/* loaded from: classes4.dex */
public final class f extends h {

    /* renamed from: j, reason: collision with root package name */
    public final Function0 f23308j;

    /* renamed from: k, reason: collision with root package name */
    public final Function2 f23309k;

    /* renamed from: l, reason: collision with root package name */
    public final y0 f23310l;

    /* renamed from: m, reason: collision with root package name */
    public lg.a f23311m;

    public f(b6.c onCancel, ng.e onItemImageSelected) {
        Intrinsics.checkNotNullParameter(onCancel, "onCancel");
        Intrinsics.checkNotNullParameter(onItemImageSelected, "onItemImageSelected");
        this.f23308j = onCancel;
        this.f23309k = onItemImageSelected;
        Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new c1.d(new w1(1, this), 1));
        this.f23310l = i.l(this, Reflection.getOrCreateKotlinClass(PreviewModel.class), new c(lazy, 0), new d(lazy, 0), new e(this, lazy, 0));
    }

    @Override // mf.b
    public final int e() {
        return R.layout.bottom_sheet_albums;
    }

    @Override // mf.b
    public final void g() {
        RecyclerView recyclerView = ((a1) f()).f20698v;
        lg.a aVar = new lg.a(new k(this, 1));
        this.f23311m = aVar;
        recyclerView.setAdapter(aVar);
        Intrinsics.checkNotNull(recyclerView);
        int dimensionPixelOffset = recyclerView.getResources().getDimensionPixelOffset(R.dimen.size_0);
        int dimensionPixelOffset2 = recyclerView.getResources().getDimensionPixelOffset(R.dimen.size_0);
        int dimensionPixelOffset3 = recyclerView.getResources().getDimensionPixelOffset(R.dimen.size_8);
        int dimensionPixelOffset4 = recyclerView.getResources().getDimensionPixelOffset(R.dimen.size_8);
        Intrinsics.checkNotNullParameter(recyclerView, "<this>");
        recyclerView.addItemDecoration(new xg.c(dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3, dimensionPixelOffset4));
        Intrinsics.checkNotNullExpressionValue(recyclerView, "apply(...)");
        PreviewModel previewModel = (PreviewModel) this.f23310l.getValue();
        BuildersKt__Builders_commonKt.launch$default(previewModel.f22242c, null, null, new og.h(previewModel, null), 3, null);
        setCancelable(false);
    }

    @Override // mf.b
    public final void h() {
        y0 y0Var = this.f23310l;
        ((PreviewModel) y0Var.getValue()).f16695m.observe(getViewLifecycleOwner(), new b(0, new a(this, 0)));
        ((PreviewModel) y0Var.getValue()).f16700r.observe(getViewLifecycleOwner(), new b(0, new a(this, 1)));
    }

    @Override // mf.b
    public final void i() {
        TextView tvCancel = ((a1) f()).f20699w;
        Intrinsics.checkNotNullExpressionValue(tvCancel, "tvCancel");
        com.bumptech.glide.e.p(tvCancel, new a(this, 2));
    }
}
