package com.glority.android.picturexx.vm;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.glority.android.cmsui2.entity.GradeItem;
import com.glority.android.cmsui2.util.GradingLevelScaleConvertor;
import com.glority.android.picturexx.recognize.analyzer.RecognizeProcess;
import com.glority.android.picturexx.recognize.fragment.BaseRecognizeLoadingFragment;
import com.glority.android.picturexx.repository.RecognizeRepository;
import com.glority.android.picturexx.utils.CoinConfigUtils;
import com.glority.android.picturexx.view.recognize.IdentificationResultActivity;
import com.glority.android.picturexx.view.recognize.RecognizeErrorFragment;
import com.glority.android.picturexx.view.recognize.RecognizeLoadingFragment;
import com.glority.android.ui.base.BaseActivity;
import com.glority.android.xx.constants.Args;
import com.glority.base.utils.HandOnBundleUtils;
import com.glority.base.viewmodel.AppViewModel;
import com.glority.component.generatedAPI.kotlinAPI.cms.CmsName;
import com.glority.component.generatedAPI.kotlinAPI.enums.CmsFormat;
import com.glority.component.generatedAPI.kotlinAPI.enums.PhotoFrom;
import com.glority.component.generatedAPI.kotlinAPI.recognize.Location;
import com.glority.network.model.Resource;
import com.glority.network.model.Status;
import com.picturecoin.generatedAPI.kotlinAPI.recognize.RecognizeNewMessage;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;

/* compiled from: MainRecognizeProcess.kt */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JK\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0017¢\u0006\u0002\u0010\u0012J\f\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u0014H\u0016J\u0010\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016H\u0016Jh\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u00072\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00072\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u00072\u0014\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\u001f\u0012\u0006\u0012\u0004\u0018\u00010%0$2\u0006\u0010&\u001a\u00020\u001fH\u0016J<\u0010'\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010(\u001a\u00020\f2\u0006\u0010)\u001a\u00020\f2\b\u0010*\u001a\u0004\u0018\u00010\u001f2\u0006\u0010+\u001a\u00020\u001f2\b\u0010&\u001a\u0004\u0018\u00010\u001fH\u0016J\b\u0010,\u001a\u00020\u001fH\u0016¨\u0006-"}, d2 = {"Lcom/glority/android/picturexx/vm/MainRecognizeProcess;", "Lcom/glority/android/picturexx/recognize/analyzer/RecognizeProcess;", "<init>", "()V", "recognizeSync", "Lcom/glority/android/picturexx/recognize/analyzer/RecognizeProcess$RecognizeResult;", "itemImage", "", "Ljava/io/File;", "photoFrom", "Lcom/glority/component/generatedAPI/kotlinAPI/enums/PhotoFrom;", "wifi", "", "shootLocation", "Lcom/glority/component/generatedAPI/kotlinAPI/recognize/Location;", "uploadLocation", "shootDate", "Ljava/util/Date;", "(Ljava/util/List;Lcom/glority/component/generatedAPI/kotlinAPI/enums/PhotoFrom;Ljava/lang/Boolean;Lcom/glority/component/generatedAPI/kotlinAPI/recognize/Location;Lcom/glority/component/generatedAPI/kotlinAPI/recognize/Location;Ljava/util/Date;)Lcom/glority/android/picturexx/recognize/analyzer/RecognizeProcess$RecognizeResult;", "customLoadingFragment", "Lcom/glority/android/picturexx/recognize/fragment/BaseRecognizeLoadingFragment;", "getSnapTipsViewActivity", "Ljava/lang/Class;", "Lcom/glority/android/ui/base/BaseActivity;", "toNext", "", "context", "Landroidx/fragment/app/Fragment;", "cmsNames", "Lcom/glority/component/generatedAPI/kotlinAPI/cms/CmsName;", "userCompressedImages", "", "userOriginalImages", "itemIds", "", "otherData", "", "", "captureFrom", "showError", Args.requestError, "findImage", "name", "userImage", "typeName", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class MainRecognizeProcess implements RecognizeProcess {
    public static final int $stable = 0;

    @Override // com.glority.android.picturexx.recognize.analyzer.RecognizeProcess
    public Class<BaseActivity> getSnapTipsViewActivity() {
        return null;
    }

    @Override // com.glority.android.picturexx.recognize.analyzer.RecognizeProcess
    public List<File> getInputImages() {
        return RecognizeProcess.DefaultImpls.getInputImages(this);
    }

    @Override // com.glority.android.picturexx.recognize.analyzer.RecognizeProcess
    public RecognizeProcess.RecognizeResult recognizeSync(List<? extends File> itemImage, PhotoFrom photoFrom, Boolean wifi, Location shootLocation, Location uploadLocation, Date shootDate) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(itemImage, "itemImage");
        Intrinsics.checkNotNullParameter(photoFrom, "photoFrom");
        if (itemImage.size() < 2) {
            return new RecognizeProcess.RecognizeResult(new ArrayList(), null, false, null, 8, null);
        }
        try {
            Resource<RecognizeNewMessage> recognizeBlocking = RecognizeRepository.INSTANCE.recognizeBlocking(AppViewModel.INSTANCE.getInstance().getLanguageCode(), CoinConfigUtils.INSTANCE.getCountryCode(), CmsFormat.MARKDOWN, itemImage.get(0), itemImage.get(1), shootLocation, uploadLocation, shootDate, photoFrom, wifi != null ? wifi.booleanValue() : true);
            if (recognizeBlocking.getStatus() == Status.SUCCESS) {
                RecognizeNewMessage data = recognizeBlocking.getData();
                if (data == null || (arrayList = data.getItemIds()) == null) {
                    arrayList = new ArrayList();
                }
                RecognizeNewMessage data2 = recognizeBlocking.getData();
                List<CmsName> cmsNames = data2 != null ? data2.getCmsNames() : null;
                Pair[] pairArr = new Pair[7];
                RecognizeNewMessage data3 = recognizeBlocking.getData();
                pairArr[0] = new Pair("probabilities", data3 != null ? data3.getProbabilities() : null);
                RecognizeNewMessage data4 = recognizeBlocking.getData();
                pairArr[1] = new Pair("mergeImage", data4 != null ? data4.getUrl() : null);
                RecognizeNewMessage data5 = recognizeBlocking.getData();
                pairArr[2] = new Pair(Args.subjectSideUrl, data5 != null ? data5.getSubjectSideUrl() : null);
                RecognizeNewMessage data6 = recognizeBlocking.getData();
                pairArr[3] = new Pair(Args.denominationSideUrl, data6 != null ? data6.getDenominationSideUrl() : null);
                RecognizeNewMessage data7 = recognizeBlocking.getData();
                pairArr[4] = new Pair("years", data7 != null ? data7.getCmsNameUidsWithYear() : null);
                GradingLevelScaleConvertor gradingLevelScaleConvertor = GradingLevelScaleConvertor.INSTANCE;
                RecognizeNewMessage data8 = recognizeBlocking.getData();
                GradeItem gradeConvertLongName = gradingLevelScaleConvertor.gradeConvertLongName(data8 != null ? data8.getGrade() : null, GradingLevelScaleConvertor.ScaleType.sheldon);
                pairArr[5] = new Pair("grade", gradeConvertLongName != null ? gradeConvertLongName.getShortNameId() : null);
                RecognizeNewMessage data9 = recognizeBlocking.getData();
                pairArr[6] = new Pair("uidYearDefaultVarietyUidMap", data9 != null ? data9.getUidYearDefaultVarietyUidMap() : null);
                return new RecognizeProcess.RecognizeResult(arrayList, cmsNames, true, MapsKt.hashMapOf(pairArr));
            }
            return new RecognizeProcess.RecognizeResult(new ArrayList(), null, false, null, 8, null);
        } catch (Throwable unused) {
            return new RecognizeProcess.RecognizeResult(new ArrayList(), null, false, null, 8, null);
        }
    }

    @Override // com.glority.android.picturexx.recognize.analyzer.RecognizeProcess
    public BaseRecognizeLoadingFragment<?> customLoadingFragment() {
        return new RecognizeLoadingFragment();
    }

    @Override // com.glority.android.picturexx.recognize.analyzer.RecognizeProcess
    public void toNext(Fragment context, List<CmsName> cmsNames, List<String> userCompressedImages, List<? extends File> userOriginalImages, List<Long> itemIds, Map<String, ? extends Object> otherData, String captureFrom) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(userCompressedImages, "userCompressedImages");
        Intrinsics.checkNotNullParameter(userOriginalImages, "userOriginalImages");
        Intrinsics.checkNotNullParameter(itemIds, "itemIds");
        Intrinsics.checkNotNullParameter(otherData, "otherData");
        Intrinsics.checkNotNullParameter(captureFrom, "captureFrom");
        Context context2 = context.getContext();
        if (context2 != null && cmsNames != null) {
            IdentificationResultActivity.Companion companion = IdentificationResultActivity.INSTANCE;
            Object obj = otherData.get("probabilities");
            List<Double> list = TypeIntrinsics.isMutableList(obj) ? (List) obj : null;
            Object obj2 = otherData.get("mergeImage");
            String str = obj2 instanceof String ? (String) obj2 : null;
            Object obj3 = otherData.get(Args.subjectSideUrl);
            String str2 = obj3 instanceof String ? (String) obj3 : null;
            Object obj4 = otherData.get(Args.denominationSideUrl);
            String str3 = obj4 instanceof String ? (String) obj4 : null;
            Object obj5 = otherData.get("years");
            Map<String, ? extends Object> map = obj5 instanceof Map ? (Map) obj5 : null;
            Object obj6 = otherData.get("grade");
            String str4 = obj6 instanceof String ? (String) obj6 : null;
            Object obj7 = otherData.get("uidYearDefaultVarietyUidMap");
            companion.open(context2, cmsNames, userCompressedImages, userOriginalImages, itemIds, list, str, str2, str3, map, str4, obj7 instanceof Map ? (Map) obj7 : null);
        }
        FragmentActivity activity = context.getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    @Override // com.glority.android.picturexx.recognize.analyzer.RecognizeProcess
    public void showError(Fragment context, boolean requestError, boolean findImage, String name, String userImage, String captureFrom) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(userImage, "userImage");
        RecognizeErrorFragment.INSTANCE.open(context, requestError, name, findImage, userImage, 2, captureFrom == null ? "" : captureFrom, HandOnBundleUtils.INSTANCE.getHandOnBundleFromBundle(context));
    }

    @Override // com.glority.android.picturexx.recognize.analyzer.RecognizeProcess
    public String typeName() {
        return "recognize";
    }
}
