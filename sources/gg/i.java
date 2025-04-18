package gg;

import androidx.fragment.app.w1;
import androidx.lifecycle.y0;
import com.plantcare.ai.identifier.plantid.R;
import com.plantcare.ai.identifier.plantid.ui.component.main.bottom_bar.viewmodel.MyPlantViewModel;
import kf.b2;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lgg/i;", "Lmf/d;", "Lkf/b2;", "<init>", "()V", "Plant_ID_AI_Plant_Identifier_v1.1.5_v115_04.05.2025_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nMyPlantFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MyPlantFragment.kt\ncom/plantcare/ai/identifier/plantid/ui/component/main/bottom_bar/MyPlantFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,145:1\n106#2,15:146\n*S KotlinDebug\n*F\n+ 1 MyPlantFragment.kt\ncom/plantcare/ai/identifier/plantid/ui/component/main/bottom_bar/MyPlantFragment\n*L\n36#1:146,15\n*E\n"})
/* loaded from: classes4.dex */
public final class i extends a<b2> {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f18481l = 0;

    /* renamed from: i, reason: collision with root package name */
    public boolean f18482i;

    /* renamed from: j, reason: collision with root package name */
    public final y0 f18483j;

    /* renamed from: k, reason: collision with root package name */
    public qf.a f18484k;

    public i() {
        Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new c1.d(new w1(4, this), 6));
        int i10 = 3;
        this.f18483j = com.facebook.internal.i.l(this, Reflection.getOrCreateKotlinClass(MyPlantViewModel.class), new of.c(lazy, i10), new of.d(lazy, i10), new of.e(this, lazy, i10));
    }

    @Override // mf.d
    public final int b() {
        return R.layout.fragment_my_plant;
    }

    @Override // mf.d
    public final void e() {
        b2 b2Var = (b2) c();
        qf.a aVar = new qf.a(new f(this, 0), new f(this, 1));
        this.f18484k = aVar;
        b2Var.f20707x.setAdapter(aVar);
    }

    @Override // mf.d
    public final void f() {
        BuildersKt__Builders_commonKt.launch$default(com.facebook.internal.i.v(this), null, null, new h(this, null), 3, null);
    }
}
