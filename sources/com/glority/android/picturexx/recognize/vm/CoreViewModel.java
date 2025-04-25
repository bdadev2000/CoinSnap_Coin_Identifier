package com.glority.android.picturexx.recognize.vm;

import android.graphics.Bitmap;
import android.location.Location;
import android.net.Uri;
import android.util.Log;
import androidx.lifecycle.MutableLiveData;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.glority.abtest.utils.AbtestUtils;
import com.glority.abtesting.generatedAPI.kotlinAPI.config.AbtestingVariable;
import com.glority.android.base.aws.s3.AwsFileUploader;
import com.glority.android.base.aws.s3.Scope;
import com.glority.android.core.app.AppContext;
import com.glority.android.core.route.aws.UpdateItemHighQualityRequest;
import com.glority.android.picturexx.recognize.analyzer.RecognizeProcess;
import com.glority.android.picturexx.recognize.utils.FileHelper;
import com.glority.android.xx.ResizeConfig;
import com.glority.android.xx.constants.Args;
import com.glority.base.entity.RecognizeImageFile;
import com.glority.base.routers.GetS3ScopeRequest;
import com.glority.base.viewmodel.AppViewModel;
import com.glority.base.viewmodel.BaseViewModel;
import com.glority.component.generatedAPI.kotlinAPI.enums.PhotoFrom;
import com.glority.utils.device.NetworkUtils;
import com.glority.utils.stability.LogUtils;
import com.glority.utils.ui.ImageUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;
import kotlinx.coroutines.ExecutorsKt;

/* compiled from: CoreViewModel.kt */
@Metadata(d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u00104\u001a\u0004\u0018\u0001052\u0006\u0010$\u001a\u00020%2\b\b\u0002\u00106\u001a\u0002072\b\b\u0002\u00108\u001a\u000207J\u001e\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020\u001c2\u0006\u0010>\u001a\u00020\u001cJ\u0014\u00109\u001a\u00020:2\f\u0010?\u001a\b\u0012\u0004\u0012\u00020<0@J\u0010\u0010A\u001a\u00020:2\u0006\u0010B\u001a\u00020CH\u0007J\f\u0010D\u001a\b\u0012\u0004\u0012\u00020C0@J\f\u0010E\u001a\b\u0012\u0004\u0012\u00020\u001c0@J\f\u0010F\u001a\b\u0012\u0004\u0012\u00020C0@J\u000e\u0010G\u001a\u00020:2\u0006\u0010H\u001a\u00020\u0016J\u0016\u0010Q\u001a\u00020\u00162\u0006\u0010R\u001a\u00020-H\u0082@¢\u0006\u0002\u0010SJ\u001e\u0010T\u001a\u00020:2\u0006\u0010R\u001a\u00020-2\f\u0010U\u001a\b\u0012\u0004\u0012\u00020:0VH\u0002J$\u0010W\u001a\u0004\u0018\u00010C2\u0006\u0010X\u001a\u00020Y2\u0006\u0010Z\u001a\u00020\u00162\b\b\u0002\u0010[\u001a\u00020\u0016H\u0002J\u001c\u0010\\\u001a\u00020:2\u0006\u0010]\u001a\u00020\u001c2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u001c0@J\b\u0010^\u001a\u00020\u0016H\u0002R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u001cX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\u00020\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0018\"\u0004\b#\u0010\u001aR\u001a\u0010$\u001a\u00020%X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u001d\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020-0,0+¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0013\u00100\u001a\u0004\u0018\u0001018F¢\u0006\u0006\u001a\u0004\b2\u00103R\u000e\u0010I\u001a\u00020JX\u0082\u000e¢\u0006\u0002\n\u0000R(\u0010K\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160L0,X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bM\u0010N\"\u0004\bO\u0010P¨\u0006_"}, d2 = {"Lcom/glority/android/picturexx/recognize/vm/CoreViewModel;", "Lcom/glority/base/viewmodel/BaseViewModel;", "<init>", "()V", "analyseThread", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "getAnalyseThread", "()Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "captureThread", Args.showSnapTips, "", "getShowSnapTips", "()Z", "setShowSnapTips", "(Z)V", "recognizeProcess", "Lcom/glority/android/picturexx/recognize/analyzer/RecognizeProcess;", "getRecognizeProcess", "()Lcom/glority/android/picturexx/recognize/analyzer/RecognizeProcess;", "setRecognizeProcess", "(Lcom/glority/android/picturexx/recognize/analyzer/RecognizeProcess;)V", "captureCount", "", "getCaptureCount", "()I", "setCaptureCount", "(I)V", "captureFrom", "", "getCaptureFrom", "()Ljava/lang/String;", "setCaptureFrom", "(Ljava/lang/String;)V", Args.startAnimationViewId, "getStartAnimationViewId", "setStartAnimationViewId", "photoFrom", "Lcom/glority/component/generatedAPI/kotlinAPI/enums/PhotoFrom;", "getPhotoFrom", "()Lcom/glority/component/generatedAPI/kotlinAPI/enums/PhotoFrom;", "setPhotoFrom", "(Lcom/glority/component/generatedAPI/kotlinAPI/enums/PhotoFrom;)V", "recognizeImageFiles", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/glority/base/entity/RecognizeImageFile;", "getRecognizeImageFiles", "()Landroidx/lifecycle/MutableLiveData;", "displayImageUri", "Landroid/net/Uri;", "getDisplayImageUri", "()Landroid/net/Uri;", "uploadItemToRecognize", "Lcom/glority/android/picturexx/recognize/analyzer/RecognizeProcess$RecognizeResult;", "lat", "", "lng", "uploadOriginalImage", "", "itemId", "", "imageUrl", "filePath", "itemIds", "", "addOriginalImageFile", TransferTable.COLUMN_FILE, "Ljava/io/File;", "getCompressFiles", "getOriginalImageFiles", "getOriginalImageFileList", "deleteImageFile", "index", "mResizeConfig", "Lcom/glority/android/xx/ResizeConfig;", "compressJobs", "Lkotlinx/coroutines/Deferred;", "getCompressJobs", "()Ljava/util/List;", "setCompressJobs", "(Ljava/util/List;)V", "compressImageFile", "recognizeImageFile", "(Lcom/glority/base/entity/RecognizeImageFile;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addCompressJob", "addDone", "Lkotlin/Function0;", "saveBitmapToImageFile", "bitmap", "Landroid/graphics/Bitmap;", "shorterScale", "quality", "uploadNotCoinImage", Args.itemType, "getImageQuality", "recognize_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class CoreViewModel extends BaseViewModel {
    private final ExecutorCoroutineDispatcher analyseThread;
    private int captureCount;
    private String captureFrom;
    private final ExecutorCoroutineDispatcher captureThread;
    private List<Deferred<Integer>> compressJobs;
    private ResizeConfig mResizeConfig;
    private PhotoFrom photoFrom;
    private final MutableLiveData<List<RecognizeImageFile>> recognizeImageFiles;
    private RecognizeProcess recognizeProcess;
    private boolean showSnapTips;
    private int startAnimationViewId;

    public CoreViewModel() {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        Intrinsics.checkNotNullExpressionValue(newSingleThreadExecutor, "newSingleThreadExecutor(...)");
        this.analyseThread = ExecutorsKt.from(newSingleThreadExecutor);
        ExecutorService newSingleThreadExecutor2 = Executors.newSingleThreadExecutor();
        Intrinsics.checkNotNullExpressionValue(newSingleThreadExecutor2, "newSingleThreadExecutor(...)");
        this.captureThread = ExecutorsKt.from(newSingleThreadExecutor2);
        this.captureCount = 1;
        this.captureFrom = "";
        this.photoFrom = PhotoFrom.BACK_CAMERA;
        MutableLiveData<List<RecognizeImageFile>> mutableLiveData = new MutableLiveData<>();
        mutableLiveData.setValue(Collections.synchronizedList(new ArrayList()));
        this.recognizeImageFiles = mutableLiveData;
        this.mResizeConfig = new ResizeConfig(0, 0, 3, null);
        List<Deferred<Integer>> synchronizedList = Collections.synchronizedList(new ArrayList());
        Intrinsics.checkNotNullExpressionValue(synchronizedList, "synchronizedList(...)");
        this.compressJobs = synchronizedList;
    }

    public final ExecutorCoroutineDispatcher getAnalyseThread() {
        return this.analyseThread;
    }

    public final boolean getShowSnapTips() {
        return this.showSnapTips;
    }

    public final void setShowSnapTips(boolean z) {
        this.showSnapTips = z;
    }

    public final RecognizeProcess getRecognizeProcess() {
        return this.recognizeProcess;
    }

    public final void setRecognizeProcess(RecognizeProcess recognizeProcess) {
        this.recognizeProcess = recognizeProcess;
    }

    public final int getCaptureCount() {
        return this.captureCount;
    }

    public final void setCaptureCount(int i) {
        this.captureCount = i;
    }

    public final String getCaptureFrom() {
        return this.captureFrom;
    }

    public final void setCaptureFrom(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.captureFrom = str;
    }

    public final int getStartAnimationViewId() {
        return this.startAnimationViewId;
    }

    public final void setStartAnimationViewId(int i) {
        this.startAnimationViewId = i;
    }

    public final PhotoFrom getPhotoFrom() {
        return this.photoFrom;
    }

    public final void setPhotoFrom(PhotoFrom photoFrom) {
        Intrinsics.checkNotNullParameter(photoFrom, "<set-?>");
        this.photoFrom = photoFrom;
    }

    public final MutableLiveData<List<RecognizeImageFile>> getRecognizeImageFiles() {
        return this.recognizeImageFiles;
    }

    public final Uri getDisplayImageUri() {
        RecognizeImageFile recognizeImageFile;
        File file = (File) CollectionsKt.firstOrNull((List) getCompressFiles());
        if (file == null) {
            List<RecognizeImageFile> value = this.recognizeImageFiles.getValue();
            file = (value == null || (recognizeImageFile = (RecognizeImageFile) CollectionsKt.firstOrNull((List) value)) == null) ? null : recognizeImageFile.getDisplayImageFile();
        }
        if (file == null) {
            return null;
        }
        Uri fromFile = Uri.fromFile(file);
        Intrinsics.checkNotNullExpressionValue(fromFile, "fromFile(this)");
        return fromFile;
    }

    public static /* synthetic */ RecognizeProcess.RecognizeResult uploadItemToRecognize$default(CoreViewModel coreViewModel, PhotoFrom photoFrom, double d, double d2, int i, Object obj) {
        if ((i & 2) != 0) {
            Location location = AppViewModel.INSTANCE.getInstance().getLocation();
            d = location != null ? location.getLatitude() : 0.0d;
        }
        double d3 = d;
        if ((i & 4) != 0) {
            Location location2 = AppViewModel.INSTANCE.getInstance().getLocation();
            d2 = location2 != null ? location2.getLongitude() : 0.0d;
        }
        return coreViewModel.uploadItemToRecognize(photoFrom, d3, d2);
    }

    public final RecognizeProcess.RecognizeResult uploadItemToRecognize(PhotoFrom photoFrom, double lat, double lng) {
        Intrinsics.checkNotNullParameter(photoFrom, "photoFrom");
        this.photoFrom = photoFrom;
        Date date = new Date();
        boolean isWifiConnected = NetworkUtils.isWifiConnected();
        com.glority.component.generatedAPI.kotlinAPI.recognize.Location location = new com.glority.component.generatedAPI.kotlinAPI.recognize.Location(0, 1, null);
        location.setLatitude(lat);
        location.setLongitude(lng);
        com.glority.component.generatedAPI.kotlinAPI.recognize.Location location2 = new com.glority.component.generatedAPI.kotlinAPI.recognize.Location(0, 1, null);
        location2.setLatitude(lat);
        location2.setLongitude(lng);
        List<File> compressFiles = getCompressFiles();
        RecognizeProcess recognizeProcess = this.recognizeProcess;
        if (recognizeProcess != null) {
            return recognizeProcess.recognizeSync(compressFiles, photoFrom, Boolean.valueOf(isWifiConnected), location, location2, date);
        }
        return null;
    }

    public final void uploadOriginalImage(long itemId, String imageUrl, String filePath) {
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        new UpdateItemHighQualityRequest(Long.valueOf(itemId), imageUrl, true, filePath).post();
    }

    public final void uploadOriginalImage(final List<Long> itemIds) {
        Intrinsics.checkNotNullParameter(itemIds, "itemIds");
        ArrayList arrayList = new ArrayList();
        ArrayList value = this.recognizeImageFiles.getValue();
        if (value == null) {
            value = new ArrayList();
        }
        arrayList.addAll(value);
        ArrayList arrayList2 = arrayList;
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(((RecognizeImageFile) it.next()).getOriginalImage().getAbsolutePath());
        }
        final int i = 0;
        for (Object obj : CollectionsKt.filterNotNull(arrayList3)) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            final String str = (String) obj;
            AwsFileUploader awsFileUploader = AwsFileUploader.INSTANCE;
            String result = new GetS3ScopeRequest().toResult();
            if (result == null) {
                result = Scope.ITEM.getValue();
            }
            awsFileUploader.uploadImageFile(str, result, new AwsFileUploader.ResultListener() { // from class: com.glority.android.picturexx.recognize.vm.CoreViewModel$uploadOriginalImage$2$1
                @Override // com.glority.android.base.aws.s3.AwsFileUploader.ResultListener
                public void onSuccess(String url) {
                    BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new CoreViewModel$uploadOriginalImage$2$1$onSuccess$1(str, itemIds, i, url, null), 3, null);
                    String str2 = url;
                    Log.e("CoreViewModel", "uploadCropImage ".concat((str2 == null || str2.length() == 0) ? "failed" : "success"));
                }

                @Override // com.glority.android.base.aws.s3.AwsFileUploader.ResultListener
                public void onError(String msg) {
                    Log.e("CoreViewModel", "uploadCropImage  error " + msg);
                }
            });
            i = i2;
        }
    }

    public final void addOriginalImageFile(File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        final List<RecognizeImageFile> value = this.recognizeImageFiles.getValue();
        final RecognizeImageFile recognizeImageFile = new RecognizeImageFile(file);
        if (value != null) {
            addCompressJob(recognizeImageFile, new Function0<Unit>() { // from class: com.glority.android.picturexx.recognize.vm.CoreViewModel$addOriginalImageFile$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    value.add(recognizeImageFile);
                    MutableLiveData<List<RecognizeImageFile>> recognizeImageFiles = this.getRecognizeImageFiles();
                    List<RecognizeImageFile> list = value;
                    Intrinsics.checkNotNull(list);
                    recognizeImageFiles.postValue(list);
                }
            });
        }
    }

    public final List<File> getCompressFiles() {
        List<RecognizeImageFile> value = this.recognizeImageFiles.getValue();
        if (value == null) {
            return CollectionsKt.emptyList();
        }
        List<RecognizeImageFile> list = value;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (RecognizeImageFile recognizeImageFile : list) {
            File compressImageFile = recognizeImageFile.getCompressImageFile();
            if (compressImageFile == null) {
                compressImageFile = recognizeImageFile.getOriginalImage();
            }
            arrayList.add(compressImageFile);
        }
        return arrayList;
    }

    public final List<String> getOriginalImageFiles() {
        List<RecognizeImageFile> value = this.recognizeImageFiles.getValue();
        if (value != null) {
            List<RecognizeImageFile> list = value;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((RecognizeImageFile) it.next()).getOriginalImage().getAbsolutePath());
            }
            List<String> filterNotNull = CollectionsKt.filterNotNull(arrayList);
            if (filterNotNull != null) {
                return filterNotNull;
            }
        }
        return CollectionsKt.emptyList();
    }

    public final List<File> getOriginalImageFileList() {
        List<RecognizeImageFile> value = this.recognizeImageFiles.getValue();
        if (value == null) {
            return CollectionsKt.emptyList();
        }
        List<RecognizeImageFile> list = value;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((RecognizeImageFile) it.next()).getOriginalImage());
        }
        return arrayList;
    }

    public final void deleteImageFile(int index) {
        try {
            List<RecognizeImageFile> value = this.recognizeImageFiles.getValue();
            if (value == null) {
                Unit unit = Unit.INSTANCE;
                return;
            }
            RecognizeImageFile recognizeImageFile = value.get(index);
            File cropImageFile = recognizeImageFile.getCropImageFile();
            if (cropImageFile != null) {
                cropImageFile.delete();
            }
            File compressImageFile = recognizeImageFile.getCompressImageFile();
            if (compressImageFile != null) {
                compressImageFile.delete();
            }
            recognizeImageFile.getOriginalImage().delete();
            value.remove(index);
            this.compressJobs.remove(index);
            this.recognizeImageFiles.postValue(CollectionsKt.toMutableList((Collection) CollectionsKt.toList(value)));
            Unit unit2 = Unit.INSTANCE;
        } catch (Exception e) {
            if (AppContext.INSTANCE.isDebugMode()) {
                LogUtils.e(Log.getStackTraceString(e));
            }
        }
    }

    public final List<Deferred<Integer>> getCompressJobs() {
        return this.compressJobs;
    }

    public final void setCompressJobs(List<Deferred<Integer>> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.compressJobs = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object compressImageFile(RecognizeImageFile recognizeImageFile, Continuation<? super Integer> continuation) {
        return BuildersKt.withContext(this.captureThread, new CoreViewModel$compressImageFile$2(recognizeImageFile, this, null), continuation);
    }

    private final void addCompressJob(RecognizeImageFile recognizeImageFile, Function0<Unit> addDone) {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new CoreViewModel$addCompressJob$1(this, addDone, recognizeImageFile, null), 3, null);
    }

    static /* synthetic */ File saveBitmapToImageFile$default(CoreViewModel coreViewModel, Bitmap bitmap, int i, int i2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            i2 = 100;
        }
        return coreViewModel.saveBitmapToImageFile(bitmap, i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final File saveBitmapToImageFile(Bitmap bitmap, int shorterScale, int quality) {
        Bitmap bitmap2;
        float f = shorterScale;
        float coerceAtMost = RangesKt.coerceAtMost(Math.max(f / bitmap.getWidth(), f / bitmap.getHeight()), 1.0f);
        try {
            bitmap2 = ImageUtils.scale(bitmap, coerceAtMost, coerceAtMost);
        } catch (Exception | OutOfMemoryError unused) {
            bitmap2 = null;
        }
        if (bitmap2 == null) {
            return null;
        }
        return FileHelper.INSTANCE.cacheImageFileWebp(bitmap2, quality);
    }

    public final void uploadNotCoinImage(String itemType, List<String> recognizeImageFiles) {
        Intrinsics.checkNotNullParameter(itemType, "itemType");
        Intrinsics.checkNotNullParameter(recognizeImageFiles, "recognizeImageFiles");
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new CoreViewModel$uploadNotCoinImage$1(recognizeImageFiles, itemType, this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getImageQuality() {
        String variableData;
        Integer intOrNull;
        try {
            AbtestingVariable abtestingVariable$default = AbtestUtils.getAbtestingVariable$default(AbtestUtils.INSTANCE, "appconfig_image_quality", 0, null, null, 14, null);
            if (abtestingVariable$default == null || (variableData = abtestingVariable$default.getVariableData()) == null || (intOrNull = StringsKt.toIntOrNull(variableData)) == null) {
                return 80;
            }
            return intOrNull.intValue();
        } catch (Exception e) {
            if (AppContext.INSTANCE.isDebugMode()) {
                LogUtils.e(Log.getStackTraceString(e));
            }
            return 80;
        }
    }
}
