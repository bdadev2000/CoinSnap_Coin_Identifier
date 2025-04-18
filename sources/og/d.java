package og;

import com.plantcare.ai.identifier.plantid.ui.component.plan_identifier.preview.PreviewIdentifyActivity;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.Job;

/* loaded from: classes4.dex */
public final class d extends Lambda implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PreviewIdentifyActivity f23322b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(PreviewIdentifyActivity previewIdentifyActivity) {
        super(1);
        this.f23322b = previewIdentifyActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        PreviewIdentifyActivity previewIdentifyActivity = this.f23322b;
        Job job = previewIdentifyActivity.f16684l;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        previewIdentifyActivity.f16684l = null;
        previewIdentifyActivity.I().f16692j.postValue(Boolean.FALSE);
        previewIdentifyActivity.finish();
        return Unit.INSTANCE;
    }
}
