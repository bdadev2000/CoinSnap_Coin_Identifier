package zf;

import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.w1;
import androidx.lifecycle.y0;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.internal.i;
import com.plantcare.ai.identifier.plantid.R;
import com.plantcare.ai.identifier.plantid.ui.component.history.HistoryViewModel;
import kf.d2;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import of.e;
import w5.k;
import y0.p0;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lzf/c;", "Lmf/d;", "Lkf/d2;", "<init>", "()V", "Plant_ID_AI_Plant_Identifier_v1.1.5_v115_04.05.2025_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nPlantFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlantFragment.kt\ncom/plantcare/ai/identifier/plantid/ui/component/history/list/plant/PlantFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,127:1\n106#2,15:128\n*S KotlinDebug\n*F\n+ 1 PlantFragment.kt\ncom/plantcare/ai/identifier/plantid/ui/component/history/list/plant/PlantFragment\n*L\n30#1:128,15\n*E\n"})
/* loaded from: classes4.dex */
public final class c extends a<d2> {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f28759l = 0;

    /* renamed from: i, reason: collision with root package name */
    public final y0 f28760i;

    /* renamed from: j, reason: collision with root package name */
    public uf.b f28761j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f28762k;

    public c() {
        Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new c1.d(new w1(3, this), 3));
        this.f28760i = i.l(this, Reflection.getOrCreateKotlinClass(HistoryViewModel.class), new of.c(lazy, 2), new of.d(lazy, 2), new e(this, lazy, 2));
    }

    @Override // mf.d
    public final int b() {
        return R.layout.fragment_plant_history;
    }

    @Override // mf.d
    public final void e() {
        RecyclerView recyclerView = ((d2) c()).f20728v;
        FragmentActivity activity = getActivity();
        if (activity != null) {
            Intrinsics.checkNotNull(activity);
            uf.b bVar = new uf.b(activity, new k(this, 8), 1);
            this.f28761j = bVar;
            recyclerView.setAdapter(bVar);
        }
        Intrinsics.checkNotNullExpressionValue(recyclerView, "apply(...)");
    }

    @Override // mf.d
    public final void f() {
        ((HistoryViewModel) this.f28760i.getValue()).f16617g.observe(this, new of.b(5, new p0(this, 8)));
    }
}
