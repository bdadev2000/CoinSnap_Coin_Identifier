package qg;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.AdaptiveTrackSelection;
import com.plantcare.ai.identifier.plantid.data.database.entities.PlantEntity;
import com.plantcare.ai.identifier.plantid.domains.PlantDomain;
import com.plantcare.ai.identifier.plantid.ui.component.plan_identifier.result.id.SearchPlantResultActivity;
import com.plantcare.ai.identifier.plantid.ui.component.plan_identifier.result.id.SearchPlantResultViewModel;
import k8.f;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* loaded from: classes4.dex */
public final class a extends Lambda implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f23904b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SearchPlantResultActivity f23905c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(SearchPlantResultActivity searchPlantResultActivity, int i10) {
        super(1);
        this.f23904b = i10;
        this.f23905c = searchPlantResultActivity;
    }

    public final void a(View view) {
        int i10 = this.f23904b;
        SearchPlantResultActivity searchPlantResultActivity = this.f23905c;
        switch (i10) {
            case 0:
                searchPlantResultActivity.finish();
                return;
            default:
                PlantDomain plantDomain = searchPlantResultActivity.f16705l;
                if (plantDomain != null) {
                    SearchPlantResultViewModel searchPlantResultViewModel = (SearchPlantResultViewModel) searchPlantResultActivity.f16706m.getValue();
                    PlantEntity plant = xg.d.g(plantDomain);
                    searchPlantResultViewModel.getClass();
                    Intrinsics.checkNotNullParameter(plant, "plant");
                    BuildersKt__Builders_commonKt.launch$default(searchPlantResultViewModel.f22242c, null, null, new d(searchPlantResultViewModel, plant, null), 3, null);
                    sf.a aVar = new sf.a(searchPlantResultActivity);
                    aVar.show();
                    new Handler(Looper.getMainLooper()).postDelayed(new f(aVar, 14), AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS);
                    return;
                }
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f23904b) {
            case 0:
                a((View) obj);
                return Unit.INSTANCE;
            default:
                a((View) obj);
                return Unit.INSTANCE;
        }
    }
}
