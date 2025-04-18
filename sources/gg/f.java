package gg;

import android.content.Context;
import android.content.Intent;
import com.plantcare.ai.identifier.plantid.domains.PlantDomain;
import com.plantcare.ai.identifier.plantid.ui.component.main.bottom_bar.myplant.MyPlantDetailActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes4.dex */
public final class f extends Lambda implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f18474b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f18475c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(i iVar, int i10) {
        super(2);
        this.f18474b = i10;
        this.f18475c = iVar;
    }

    public final void a(PlantDomain plantDomain) {
        int i10 = this.f18474b;
        i iVar = this.f18475c;
        switch (i10) {
            case 0:
                Intrinsics.checkNotNullParameter(plantDomain, "plantDomain");
                int i11 = i.f18481l;
                iVar.getClass();
                Intent intent = new Intent(iVar.requireContext(), (Class<?>) MyPlantDetailActivity.class);
                intent.putExtra("KEY_PLANT", plantDomain);
                iVar.startActivity(intent);
                return;
            default:
                Intrinsics.checkNotNullParameter(plantDomain, "plantDomain");
                int i12 = i.f18481l;
                iVar.getClass();
                Context requireContext = iVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                new sf.g(requireContext, b6.c.f2305j, new b1.a(4, iVar, plantDomain), 0).show();
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f18474b) {
            case 0:
                ((Number) obj2).intValue();
                a((PlantDomain) obj);
                return Unit.INSTANCE;
            default:
                ((Number) obj2).intValue();
                a((PlantDomain) obj);
                return Unit.INSTANCE;
        }
    }
}
