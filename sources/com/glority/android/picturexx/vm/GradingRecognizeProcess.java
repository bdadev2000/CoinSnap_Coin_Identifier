package com.glority.android.picturexx.vm;

import android.util.Log;
import androidx.core.os.EnvironmentCompat;
import androidx.fragment.app.Fragment;
import com.glority.android.core.app.AppContext;
import com.glority.android.picturexx.recognize.analyzer.RecognizeProcess;
import com.glority.android.picturexx.recognize.fragment.BaseRecognizeLoadingFragment;
import com.glority.android.picturexx.repository.RecognizeRepository;
import com.glority.android.picturexx.utils.CoinConfigUtils;
import com.glority.android.picturexx.view.recognize.GradingLoadingFragment;
import com.glority.android.picturexx.view.recognize.RecognizeErrorFragment;
import com.glority.android.ui.base.BaseActivity;
import com.glority.android.xx.constants.Args;
import com.glority.base.utils.HandOnBundleUtils;
import com.glority.base.viewmodel.AppViewModel;
import com.glority.component.generatedAPI.kotlinAPI.cms.CmsName;
import com.glority.component.generatedAPI.kotlinAPI.enums.PhotoFrom;
import com.glority.component.generatedAPI.kotlinAPI.recognize.Location;
import com.glority.network.model.Resource;
import com.glority.network.model.Status;
import com.glority.utils.stability.LogUtils;
import com.picturecoin.generatedAPI.kotlinAPI.recognize.RecognizeGradeMessage;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;

/* compiled from: GradingRecognizeProcess.kt */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\r\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006JK\u0010\u000f\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\t\u001a\u00020\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0017¢\u0006\u0002\u0010\u0019J\f\u0010\u001a\u001a\u0006\u0012\u0002\b\u00030\u001bH\u0016J\u0010\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001dH\u0016Jh\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u000e\u0010#\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010\u00032\f\u0010%\u001a\b\u0012\u0004\u0012\u00020&0\u00032\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010(\u001a\b\u0012\u0004\u0012\u00020)0\u00032\u0014\u0010*\u001a\u0010\u0012\u0004\u0012\u00020&\u0012\u0006\u0012\u0004\u0018\u00010,0+2\u0006\u0010-\u001a\u00020&H\u0016J<\u0010.\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010/\u001a\u00020\u00132\u0006\u00100\u001a\u00020\u00132\b\u00101\u001a\u0004\u0018\u00010&2\u0006\u00102\u001a\u00020&2\b\u0010-\u001a\u0004\u0018\u00010&H\u0016J\b\u00103\u001a\u00020&H\u0016J.\u00104\u001a\u00020 2\f\u00105\u001a\b\u0012\u0004\u0012\u00020&0\u00032\u0006\u00106\u001a\u00020&2\u0006\u00107\u001a\u00020&2\u0006\u00108\u001a\u00020&H\u0002R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\b¨\u00069"}, d2 = {"Lcom/glority/android/picturexx/vm/GradingRecognizeProcess;", "Lcom/glority/android/picturexx/recognize/analyzer/RecognizeProcess;", "images", "", "Ljava/io/File;", "<init>", "(Ljava/util/List;)V", "getImages", "()Ljava/util/List;", "photoFrom", "Lcom/glority/component/generatedAPI/kotlinAPI/enums/PhotoFrom;", "gradingLoadingFragment", "Lcom/glority/android/picturexx/view/recognize/GradingLoadingFragment;", "inputImages", "getInputImages", "recognizeSync", "Lcom/glority/android/picturexx/recognize/analyzer/RecognizeProcess$RecognizeResult;", "itemImage", "wifi", "", "shootLocation", "Lcom/glority/component/generatedAPI/kotlinAPI/recognize/Location;", "uploadLocation", "shootDate", "Ljava/util/Date;", "(Ljava/util/List;Lcom/glority/component/generatedAPI/kotlinAPI/enums/PhotoFrom;Ljava/lang/Boolean;Lcom/glority/component/generatedAPI/kotlinAPI/recognize/Location;Lcom/glority/component/generatedAPI/kotlinAPI/recognize/Location;Ljava/util/Date;)Lcom/glority/android/picturexx/recognize/analyzer/RecognizeProcess$RecognizeResult;", "customLoadingFragment", "Lcom/glority/android/picturexx/recognize/fragment/BaseRecognizeLoadingFragment;", "getSnapTipsViewActivity", "Ljava/lang/Class;", "Lcom/glority/android/ui/base/BaseActivity;", "toNext", "", "context", "Landroidx/fragment/app/Fragment;", "cmsNames", "Lcom/glority/component/generatedAPI/kotlinAPI/cms/CmsName;", "userCompressedImages", "", "userOriginalImages", "itemIds", "", "otherData", "", "", "captureFrom", "showError", Args.requestError, "findImage", "name", "userImage", "typeName", "uploadUserImageToMMS", "userImages", "grade", Args.year, Args.uid, "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class GradingRecognizeProcess implements RecognizeProcess {
    public static final int $stable = 8;
    private final GradingLoadingFragment gradingLoadingFragment;
    private final List<File> images;
    private PhotoFrom photoFrom;

    public GradingRecognizeProcess() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.glority.android.picturexx.recognize.analyzer.RecognizeProcess
    public Class<BaseActivity> getSnapTipsViewActivity() {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GradingRecognizeProcess(List<? extends File> images) {
        Intrinsics.checkNotNullParameter(images, "images");
        this.images = images;
        this.photoFrom = PhotoFrom.BACK_CAMERA;
        this.gradingLoadingFragment = new GradingLoadingFragment();
    }

    public /* synthetic */ GradingRecognizeProcess(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list);
    }

    public final List<File> getImages() {
        return this.images;
    }

    @Override // com.glority.android.picturexx.recognize.analyzer.RecognizeProcess
    public List<File> getInputImages() {
        return this.images;
    }

    @Override // com.glority.android.picturexx.recognize.analyzer.RecognizeProcess
    public RecognizeProcess.RecognizeResult recognizeSync(List<? extends File> itemImage, PhotoFrom photoFrom, Boolean wifi, Location shootLocation, Location uploadLocation, Date shootDate) {
        ArrayList mutableListOf;
        Intrinsics.checkNotNullParameter(itemImage, "itemImage");
        Intrinsics.checkNotNullParameter(photoFrom, "photoFrom");
        this.photoFrom = photoFrom;
        if (itemImage.size() < 2) {
            return new RecognizeProcess.RecognizeResult(new ArrayList(), null, false, null, 8, null);
        }
        try {
            Resource<RecognizeGradeMessage> gradingBlocking = RecognizeRepository.INSTANCE.gradingBlocking(AppViewModel.INSTANCE.getInstance().getLanguageCode(), CoinConfigUtils.INSTANCE.getCountryCode(), itemImage.get(0), itemImage.get(1));
            if (gradingBlocking.getStatus() == Status.SUCCESS) {
                RecognizeGradeMessage data = gradingBlocking.getData();
                if ((data != null ? data.getCmsName() : null) == null) {
                    mutableListOf = new ArrayList();
                } else {
                    CmsName[] cmsNameArr = new CmsName[1];
                    RecognizeGradeMessage data2 = gradingBlocking.getData();
                    CmsName cmsName = data2 != null ? data2.getCmsName() : null;
                    Intrinsics.checkNotNull(cmsName);
                    cmsNameArr[0] = cmsName;
                    mutableListOf = CollectionsKt.mutableListOf(cmsNameArr);
                }
                ArrayList arrayList = new ArrayList();
                Pair[] pairArr = new Pair[5];
                RecognizeGradeMessage data3 = gradingBlocking.getData();
                pairArr[0] = new Pair("grade", data3 != null ? data3.getGrade() : null);
                RecognizeGradeMessage data4 = gradingBlocking.getData();
                pairArr[1] = new Pair(Args.year, data4 != null ? data4.getYear() : null);
                RecognizeGradeMessage data5 = gradingBlocking.getData();
                pairArr[2] = new Pair("image", data5 != null ? data5.getBeautifiedImageUrl() : null);
                RecognizeGradeMessage data6 = gradingBlocking.getData();
                pairArr[3] = new Pair(Args.subjectSideUrl, data6 != null ? data6.getSubjectSideUrl() : null);
                RecognizeGradeMessage data7 = gradingBlocking.getData();
                pairArr[4] = new Pair(Args.denominationSideUrl, data7 != null ? data7.getDenominationSideUrl() : null);
                return new RecognizeProcess.RecognizeResult(arrayList, mutableListOf, true, MapsKt.hashMapOf(pairArr));
            }
            return new RecognizeProcess.RecognizeResult(new ArrayList(), null, false, null, 8, null);
        } catch (Throwable unused) {
            return new RecognizeProcess.RecognizeResult(new ArrayList(), null, false, null, 8, null);
        }
    }

    @Override // com.glority.android.picturexx.recognize.analyzer.RecognizeProcess
    public BaseRecognizeLoadingFragment<?> customLoadingFragment() {
        return this.gradingLoadingFragment;
    }

    @Override // com.glority.android.picturexx.recognize.analyzer.RecognizeProcess
    public void toNext(Fragment context, List<CmsName> cmsNames, List<String> userCompressedImages, List<? extends File> userOriginalImages, List<Long> itemIds, Map<String, ? extends Object> otherData, String captureFrom) {
        String str;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(userCompressedImages, "userCompressedImages");
        Intrinsics.checkNotNullParameter(userOriginalImages, "userOriginalImages");
        Intrinsics.checkNotNullParameter(itemIds, "itemIds");
        Intrinsics.checkNotNullParameter(otherData, "otherData");
        Intrinsics.checkNotNullParameter(captureFrom, "captureFrom");
        CmsName cmsName = cmsNames != null ? (CmsName) CollectionsKt.firstOrNull((List) cmsNames) : null;
        Object obj = otherData.get("grade");
        String str2 = obj instanceof String ? (String) obj : null;
        String str3 = str2 == null ? EnvironmentCompat.MEDIA_UNKNOWN : str2;
        try {
            Object obj2 = otherData.get(Args.year);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
            String str4 = (String) obj2;
            if (cmsName == null || (str = cmsName.getUid()) == null) {
                str = "";
            }
            uploadUserImageToMMS(userCompressedImages, str3, str4, str);
            Unit unit = Unit.INSTANCE;
        } catch (Exception e) {
            if (AppContext.INSTANCE.isDebugMode()) {
                LogUtils.e(Log.getStackTraceString(e));
            }
        }
        if (cmsName == null) {
            RecognizeErrorFragment.Companion companion = RecognizeErrorFragment.Companion;
            String str5 = (String) CollectionsKt.firstOrNull((List) userCompressedImages);
            companion.open(context, false, null, true, str5 == null ? "" : str5, 1, captureFrom, HandOnBundleUtils.INSTANCE.getHandOnBundleFromBundle(context));
        } else {
            if (StringsKt.equals(str3, EnvironmentCompat.MEDIA_UNKNOWN, true)) {
                RecognizeErrorFragment.Companion companion2 = RecognizeErrorFragment.Companion;
                String preferredName = cmsName.getName().getPreferredName();
                Object obj3 = otherData.get("image");
                String str6 = obj3 instanceof String ? (String) obj3 : null;
                if (str6 == null) {
                    String str7 = (String) CollectionsKt.firstOrNull((List) userCompressedImages);
                    str6 = str7 == null ? "" : str7;
                }
                companion2.open(context, false, preferredName, true, str6, 1, captureFrom, HandOnBundleUtils.INSTANCE.getHandOnBundleFromBundle(context));
                return;
            }
            this.gradingLoadingFragment.readyToNext(context, cmsNames, otherData);
        }
    }

    @Override // com.glority.android.picturexx.recognize.analyzer.RecognizeProcess
    public void showError(Fragment context, boolean requestError, boolean findImage, String name, String userImage, String captureFrom) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(userImage, "userImage");
        RecognizeErrorFragment.Companion.open(context, requestError, name, findImage, userImage, 1, captureFrom == null ? "" : captureFrom, HandOnBundleUtils.INSTANCE.getHandOnBundleFromBundle(context));
    }

    @Override // com.glority.android.picturexx.recognize.analyzer.RecognizeProcess
    public String typeName() {
        return "grade";
    }

    private final void uploadUserImageToMMS(List<String> userImages, String grade, String year, String uid) {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new GradingRecognizeProcess$uploadUserImageToMMS$1(userImages, uid, grade, year, this, null), 3, null);
    }
}
