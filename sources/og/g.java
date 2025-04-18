package og;

import android.util.Log;
import com.plantcare.ai.identifier.plantid.data.network.dto.res.ResponsePlantDto;
import com.plantcare.ai.identifier.plantid.data.network.repository.PlantRepository;
import com.plantcare.ai.identifier.plantid.ui.component.plan_identifier.preview.PreviewModel;
import com.plantcare.ai.identifier.plantid.utils.network_adapter_factory.ResultWrapper;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import wh.i0;

/* loaded from: classes4.dex */
public final class g extends SuspendLambda implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public int f23326b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PreviewModel f23327c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f23328d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f23329f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f23330g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String f23331h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ i0 f23332i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(PreviewModel previewModel, String str, String str2, String str3, String str4, i0 i0Var, Continuation continuation) {
        super(2, continuation);
        this.f23327c = previewModel;
        this.f23328d = str;
        this.f23329f = str2;
        this.f23330g = str3;
        this.f23331h = str4;
        this.f23332i = i0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new g(this.f23327c, this.f23328d, this.f23329f, this.f23330g, this.f23331h, this.f23332i, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.f23326b;
        PreviewModel previewModel = this.f23327c;
        if (i10 != 0) {
            if (i10 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            previewModel.f16692j.postValue(Boxing.boxBoolean(true));
            PlantRepository plantRepository = previewModel.f16686d;
            String str = this.f23328d;
            String str2 = this.f23329f;
            String str3 = this.f23330g;
            String str4 = this.f23331h;
            i0 i0Var = this.f23332i;
            this.f23326b = 1;
            obj = plantRepository.fetchInformationPlant(str, str2, str3, str4, i0Var, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        ResultWrapper resultWrapper = (ResultWrapper) obj;
        if (resultWrapper instanceof ResultWrapper.Success) {
            ResponsePlantDto responsePlantDto = (ResponsePlantDto) ((ResultWrapper.Success) resultWrapper).getValue();
            previewModel.f16696n.postValue(responsePlantDto);
            Log.d("duylt", "Data: " + responsePlantDto);
        } else if (resultWrapper instanceof ResultWrapper.GenericError) {
            previewModel.f16696n.postValue(new ResponsePlantDto(404, "PLANT_NOT_FOUND", "PLANT_NOT_FOUND", "", String.valueOf(System.currentTimeMillis()), null));
        } else {
            previewModel.f16696n.postValue(null);
            Log.d("duylt", "Something went wrong: " + resultWrapper);
        }
        previewModel.f16692j.postValue(Boxing.boxBoolean(false));
        return Unit.INSTANCE;
    }
}
