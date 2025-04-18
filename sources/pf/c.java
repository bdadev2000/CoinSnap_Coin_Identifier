package pf;

import android.content.Intent;
import com.plantcare.ai.identifier.plantid.ui.component.diagnose.DiagnoseActivity;
import com.plantcare.ai.identifier.plantid.ui.component.diagnose.PlantDiseaseDetailActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes4.dex */
public final class c extends Lambda implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f23637b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ DiagnoseActivity f23638c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(DiagnoseActivity diagnoseActivity, int i10) {
        super(1);
        this.f23637b = i10;
        this.f23638c = diagnoseActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        DiagnoseActivity diagnoseActivity = this.f23638c;
        int i10 = this.f23637b;
        switch (i10) {
            case 0:
                rf.a disease = (rf.a) obj;
                Intrinsics.checkNotNullParameter(disease, "disease");
                Intent intent = new Intent(diagnoseActivity, (Class<?>) PlantDiseaseDetailActivity.class);
                intent.putExtra("KEY_PLANT_DISEASE", disease);
                diagnoseActivity.f16611m.a(intent);
                return Unit.INSTANCE;
            case 1:
                switch (i10) {
                    case 1:
                        diagnoseActivity.finish();
                        break;
                    default:
                        int i11 = DiagnoseActivity.f16607n;
                        diagnoseActivity.getClass();
                        DiagnoseActivity.I(diagnoseActivity);
                        break;
                }
                return Unit.INSTANCE;
            default:
                switch (i10) {
                    case 1:
                        diagnoseActivity.finish();
                        break;
                    default:
                        int i12 = DiagnoseActivity.f16607n;
                        diagnoseActivity.getClass();
                        DiagnoseActivity.I(diagnoseActivity);
                        break;
                }
                return Unit.INSTANCE;
        }
    }
}
