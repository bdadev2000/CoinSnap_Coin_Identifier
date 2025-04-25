package com.glority.android.picturexx.recognize.vm;

import android.graphics.Bitmap;
import com.bumptech.glide.Glide;
import com.glority.android.core.app.AppContext;
import com.glority.android.core.data.LogEventArgumentsKt;
import com.glority.android.core.route.analysis.LogEventRequest;
import com.glority.android.detection.Detection;
import com.glority.android.detection.item.DetectInfo;
import com.glority.android.detection.item.DetectOutput;
import com.glority.android.picturexx.recognize.analyzer.DetSingleton;
import com.glority.android.picturexx.recognize.logevents.RecognizeLogEvents;
import com.glority.android.xx.ResizeConfig;
import com.glority.base.entity.RecognizeImageFile;
import com.glority.utils.stability.LogUtils;
import java.io.File;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CoreViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
@DebugMetadata(c = "com.glority.android.picturexx.recognize.vm.CoreViewModel$compressImageFile$2", f = "CoreViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
public final class CoreViewModel$compressImageFile$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Integer>, Object> {
    final /* synthetic */ RecognizeImageFile $recognizeImageFile;
    int label;
    final /* synthetic */ CoreViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoreViewModel$compressImageFile$2(RecognizeImageFile recognizeImageFile, CoreViewModel coreViewModel, Continuation<? super CoreViewModel$compressImageFile$2> continuation) {
        super(2, continuation);
        this.$recognizeImageFile = recognizeImageFile;
        this.this$0 = coreViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CoreViewModel$compressImageFile$2(this.$recognizeImageFile, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Integer> continuation) {
        return ((CoreViewModel$compressImageFile$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        DetectInfo[] regions;
        DetectInfo detectInfo;
        Float[] region;
        ResizeConfig resizeConfig;
        int imageQuality;
        File saveBitmapToImageFile;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        try {
            LogUtils.e("start compressImageFile");
            long currentTimeMillis = System.currentTimeMillis();
            Bitmap bitmap = (Bitmap) Glide.with(AppContext.INSTANCE.peekContext()).asBitmap().skipMemoryCache(true).load(this.$recognizeImageFile.getOriginalImage()).submit().get();
            long currentTimeMillis2 = System.currentTimeMillis();
            LogUtils.d("to bitmap " + (currentTimeMillis2 - currentTimeMillis));
            long currentTimeMillis3 = System.currentTimeMillis();
            LogUtils.d("load model time " + (currentTimeMillis3 - currentTimeMillis2));
            DetSingleton companion = DetSingleton.INSTANCE.getInstance();
            Intrinsics.checkNotNull(bitmap);
            DetectOutput det = companion.det(bitmap);
            long currentTimeMillis4 = System.currentTimeMillis();
            long j = currentTimeMillis4 - currentTimeMillis3;
            LogUtils.d("det time " + j);
            new LogEventRequest(RecognizeLogEvents.detect_timecost_click, LogEventArgumentsKt.logEventBundleOf(TuplesKt.to("time", Boxing.boxLong(j)))).post();
            if (det != null && (regions = det.getRegions()) != null && (detectInfo = (DetectInfo) ArraysKt.firstOrNull(regions)) != null && (region = detectInfo.getRegion()) != null) {
                Bitmap cropImage = Detection.INSTANCE.cropImage(bitmap, region);
                if (cropImage == null) {
                    return Boxing.boxInt(-1);
                }
                long currentTimeMillis5 = System.currentTimeMillis();
                LogUtils.d("cropImage time " + (currentTimeMillis5 - currentTimeMillis4));
                int height = cropImage.getHeight();
                int width = cropImage.getWidth();
                resizeConfig = this.this$0.mResizeConfig;
                int min = Math.min(height, Math.min(width, resizeConfig.getRecognizeImageShortEdgeSize()));
                CoreViewModel coreViewModel = this.this$0;
                imageQuality = coreViewModel.getImageQuality();
                saveBitmapToImageFile = coreViewModel.saveBitmapToImageFile(cropImage, min, imageQuality);
                LogUtils.d("save crop time " + (System.currentTimeMillis() - currentTimeMillis5));
                this.$recognizeImageFile.setCompressImageFile(saveBitmapToImageFile);
                if (!bitmap.isRecycled()) {
                    bitmap.recycle();
                }
                LogUtils.e("end compressImageFile : " + (System.currentTimeMillis() - currentTimeMillis));
                return Boxing.boxInt(1);
            }
            return Boxing.boxInt(0);
        } catch (Throwable th) {
            LogUtils.e("CoreViewModel", th);
            RecognizeImageFile recognizeImageFile = this.$recognizeImageFile;
            recognizeImageFile.setCompressImageFile(recognizeImageFile.getOriginalImage());
            return Boxing.boxInt(-1);
        }
    }
}
