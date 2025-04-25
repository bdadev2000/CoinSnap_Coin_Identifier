package com.glority.android.picturexx.vm;

import android.os.Build;
import com.glority.android.base.aws.s3.AwsFileUploader;
import com.glority.android.base.aws.s3.Scope;
import com.glority.android.core.app.AppContext;
import com.glority.android.core.route.analysis.GetLongIdRequest;
import com.glority.android.core.route.analysis.LogEventRequest;
import com.glority.android.core.route.surveyEvent.SurveyAddToMmsRequest;
import com.glority.android.xx.constants.Args;
import com.glority.android.xx.constants.LogEvents;
import com.glority.base.routers.GetS3ScopeRequest;
import com.glority.base.utils.AbTestUtil;
import com.glority.base.viewmodel.AppViewModel;
import com.glority.component.generatedAPI.kotlinAPI.enums.PhotoFrom;
import io.reactivex.functions.Consumer;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: GradingRecognizeProcess.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
@DebugMetadata(c = "com.glority.android.picturexx.vm.GradingRecognizeProcess$uploadUserImageToMMS$1", f = "GradingRecognizeProcess.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class GradingRecognizeProcess$uploadUserImageToMMS$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $grade;
    final /* synthetic */ String $uid;
    final /* synthetic */ List<String> $userImages;
    final /* synthetic */ String $year;
    int label;
    final /* synthetic */ GradingRecognizeProcess this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GradingRecognizeProcess$uploadUserImageToMMS$1(List<String> list, String str, String str2, String str3, GradingRecognizeProcess gradingRecognizeProcess, Continuation<? super GradingRecognizeProcess$uploadUserImageToMMS$1> continuation) {
        super(2, continuation);
        this.$userImages = list;
        this.$uid = str;
        this.$grade = str2;
        this.$year = str3;
        this.this$0 = gradingRecognizeProcess;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GradingRecognizeProcess$uploadUserImageToMMS$1(this.$userImages, this.$uid, this.$grade, this.$year, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GradingRecognizeProcess$uploadUserImageToMMS$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        GetLongIdRequest getLongIdRequest = new GetLongIdRequest();
        final List<String> list = this.$userImages;
        final String str = this.$uid;
        final String str2 = this.$grade;
        final String str3 = this.$year;
        final GradingRecognizeProcess gradingRecognizeProcess = this.this$0;
        getLongIdRequest.subscribe(new Consumer() { // from class: com.glority.android.picturexx.vm.GradingRecognizeProcess$uploadUserImageToMMS$1$$ExternalSyntheticLambda0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj2) {
                GradingRecognizeProcess$uploadUserImageToMMS$1.invokeSuspend$lambda$1(list, str, str2, str3, gradingRecognizeProcess, (Long) obj2);
            }
        }, new Consumer() { // from class: com.glority.android.picturexx.vm.GradingRecognizeProcess$uploadUserImageToMMS$1$$ExternalSyntheticLambda1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj2) {
                GradingRecognizeProcess$uploadUserImageToMMS$1.invokeSuspend$lambda$2((Throwable) obj2);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$1(List list, final String str, final String str2, final String str3, final GradingRecognizeProcess gradingRecognizeProcess, final Long l) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str4 = (String) it.next();
            AwsFileUploader awsFileUploader = AwsFileUploader.INSTANCE;
            String result = new GetS3ScopeRequest().toResult();
            if (result == null) {
                result = Scope.ITEM.getValue();
            }
            awsFileUploader.uploadImageFile(str4, result, new AwsFileUploader.ResultListener() { // from class: com.glority.android.picturexx.vm.GradingRecognizeProcess$uploadUserImageToMMS$1$1$1$1
                @Override // com.glority.android.base.aws.s3.AwsFileUploader.ResultListener
                public void onSuccess(String url) {
                    PhotoFrom photoFrom;
                    new LogEventRequest(LogEvents.grade_tommssuccess_click, null, 2, null).post();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put(Args.uid, str);
                    linkedHashMap.put("grade", str2);
                    linkedHashMap.put(Args.year, str3);
                    linkedHashMap.put("batch_id", String.valueOf(l));
                    linkedHashMap.put("ab", String.valueOf(AbTestUtil.INSTANCE.getCameraAb()));
                    linkedHashMap.put("app_version", AppContext.INSTANCE.getVersionName());
                    linkedHashMap.put("secPhotoTime", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
                    linkedHashMap.put("device_name", Build.MODEL);
                    if (url == null) {
                        url = "";
                    }
                    String countryCode = AppViewModel.INSTANCE.getInstance().getCountryCode();
                    photoFrom = gradingRecognizeProcess.photoFrom;
                    new SurveyAddToMmsRequest("coin_grade", url, null, countryCode, photoFrom, linkedHashMap).post();
                }

                @Override // com.glority.android.base.aws.s3.AwsFileUploader.ResultListener
                public void onError(String msg) {
                    new LogEventRequest(LogEvents.grade_tommsfaild_click, null, 2, null).post();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$2(Throwable th) {
        new LogEventRequest(LogEvents.grade_tommsfaild_click, null, 2, null).post();
    }
}
