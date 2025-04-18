package og;

import android.graphics.BitmapFactory;
import android.os.Handler;
import com.plantcare.ai.identifier.plantid.ui.component.plan_identifier.preview.PreviewModel;
import fe.k;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes4.dex */
public final class f extends SuspendLambda implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f23323b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function0 f23324c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ PreviewModel f23325d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(k kVar, Function0 function0, PreviewModel previewModel, Continuation continuation) {
        super(2, continuation);
        this.f23323b = kVar;
        this.f23324c = function0;
        this.f23325d = previewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new f(this.f23323b, this.f23324c, this.f23325d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        androidx.fragment.app.e eVar = new androidx.fragment.app.e(29, this.f23324c, this.f23325d);
        k kVar = this.f23323b;
        ge.k kVar2 = kVar.f17855e;
        if (kVar2 == ge.k.JPEG) {
            byte[] bArr = kVar.f17854d;
            BitmapFactory.Options options = new BitmapFactory.Options();
            int i10 = kVar.f17852b;
            fe.c cVar = fe.f.a;
            te.i.a("FallbackCameraThread").f25394c.post(new fe.e(bArr, options, i10, new Handler(), eVar));
        } else if (kVar2 == ge.k.DNG) {
            byte[] bArr2 = kVar.f17854d;
            BitmapFactory.Options options2 = new BitmapFactory.Options();
            int i11 = kVar.f17852b;
            fe.c cVar2 = fe.f.a;
            te.i.a("FallbackCameraThread").f25394c.post(new fe.e(bArr2, options2, i11, new Handler(), eVar));
        } else {
            throw new UnsupportedOperationException("PictureResult.toBitmap() does not support this picture format: " + kVar.f17855e);
        }
        return Unit.INSTANCE;
    }
}
