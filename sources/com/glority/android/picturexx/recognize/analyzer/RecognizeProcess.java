package com.glority.android.picturexx.recognize.analyzer;

import androidx.fragment.app.Fragment;
import com.glority.android.picturexx.recognize.fragment.BaseRecognizeLoadingFragment;
import com.glority.android.ui.base.BaseActivity;
import com.glority.android.xx.constants.Args;
import com.glority.component.generatedAPI.kotlinAPI.cms.CmsName;
import com.glority.component.generatedAPI.kotlinAPI.enums.PhotoFrom;
import com.glority.component.generatedAPI.kotlinAPI.recognize.Location;
import java.io.File;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RecognizeProcess.kt */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010$\n\u0002\b\t\bf\u0018\u00002\u00020\u0001:\u0001-JK\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H&¢\u0006\u0002\u0010\u0013J\f\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u0015H&J\u0010\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017H&Jh\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u00032\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u00032\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u00032\u0014\u0010$\u001a\u0010\u0012\u0004\u0012\u00020 \u0012\u0006\u0012\u0004\u0018\u00010\u00010%2\u0006\u0010&\u001a\u00020 H&J<\u0010'\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010(\u001a\u00020\r2\u0006\u0010)\u001a\u00020\r2\b\u0010*\u001a\u0004\u0018\u00010 2\u0006\u0010+\u001a\u00020 2\b\u0010&\u001a\u0004\u0018\u00010 H&J\b\u0010,\u001a\u00020 H&R\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006."}, d2 = {"Lcom/glority/android/picturexx/recognize/analyzer/RecognizeProcess;", "", "inputImages", "", "Ljava/io/File;", "getInputImages", "()Ljava/util/List;", "recognizeSync", "Lcom/glority/android/picturexx/recognize/analyzer/RecognizeProcess$RecognizeResult;", "itemImage", "photoFrom", "Lcom/glority/component/generatedAPI/kotlinAPI/enums/PhotoFrom;", "wifi", "", "shootLocation", "Lcom/glority/component/generatedAPI/kotlinAPI/recognize/Location;", "uploadLocation", "shootDate", "Ljava/util/Date;", "(Ljava/util/List;Lcom/glority/component/generatedAPI/kotlinAPI/enums/PhotoFrom;Ljava/lang/Boolean;Lcom/glority/component/generatedAPI/kotlinAPI/recognize/Location;Lcom/glority/component/generatedAPI/kotlinAPI/recognize/Location;Ljava/util/Date;)Lcom/glority/android/picturexx/recognize/analyzer/RecognizeProcess$RecognizeResult;", "customLoadingFragment", "Lcom/glority/android/picturexx/recognize/fragment/BaseRecognizeLoadingFragment;", "getSnapTipsViewActivity", "Ljava/lang/Class;", "Lcom/glority/android/ui/base/BaseActivity;", "toNext", "", "context", "Landroidx/fragment/app/Fragment;", "cmsNames", "Lcom/glority/component/generatedAPI/kotlinAPI/cms/CmsName;", "userCompressedImages", "", "userOriginalImages", "itemIds", "", "otherData", "", "captureFrom", "showError", Args.requestError, "findImage", "name", "userImage", "typeName", "RecognizeResult", "recognize_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public interface RecognizeProcess {
    BaseRecognizeLoadingFragment<?> customLoadingFragment();

    List<File> getInputImages();

    Class<BaseActivity> getSnapTipsViewActivity();

    RecognizeResult recognizeSync(List<? extends File> itemImage, PhotoFrom photoFrom, Boolean wifi, Location shootLocation, Location uploadLocation, Date shootDate);

    void showError(Fragment context, boolean requestError, boolean findImage, String name, String userImage, String captureFrom);

    void toNext(Fragment context, List<CmsName> cmsNames, List<String> userCompressedImages, List<? extends File> userOriginalImages, List<Long> itemIds, Map<String, ? extends Object> otherData, String captureFrom);

    String typeName();

    /* compiled from: RecognizeProcess.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes5.dex */
    public static final class DefaultImpls {
        public static List<File> getInputImages(RecognizeProcess recognizeProcess) {
            return CollectionsKt.emptyList();
        }
    }

    /* compiled from: RecognizeProcess.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BE\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0011\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\bHÆ\u0003J\u0017\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\nHÆ\u0003JM\u0010\u001b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u000bHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R(\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006!"}, d2 = {"Lcom/glority/android/picturexx/recognize/analyzer/RecognizeProcess$RecognizeResult;", "", "itemIds", "", "", "cmsNames", "Lcom/glority/component/generatedAPI/kotlinAPI/cms/CmsName;", "requestSuccess", "", "otherData", "", "", "<init>", "(Ljava/util/List;Ljava/util/List;ZLjava/util/Map;)V", "getItemIds", "()Ljava/util/List;", "getCmsNames", "getRequestSuccess", "()Z", "getOtherData", "()Ljava/util/Map;", "setOtherData", "(Ljava/util/Map;)V", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "recognize_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes5.dex */
    public static final /* data */ class RecognizeResult {
        private final List<CmsName> cmsNames;
        private final List<Long> itemIds;
        private Map<String, ? extends Object> otherData;
        private final boolean requestSuccess;

        public final List<Long> component1() {
            return this.itemIds;
        }

        public final List<CmsName> component2() {
            return this.cmsNames;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getRequestSuccess() {
            return this.requestSuccess;
        }

        public final Map<String, Object> component4() {
            return this.otherData;
        }

        public final RecognizeResult copy(List<Long> itemIds, List<CmsName> cmsNames, boolean requestSuccess, Map<String, ? extends Object> otherData) {
            Intrinsics.checkNotNullParameter(itemIds, "itemIds");
            Intrinsics.checkNotNullParameter(otherData, "otherData");
            return new RecognizeResult(itemIds, cmsNames, requestSuccess, otherData);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RecognizeResult)) {
                return false;
            }
            RecognizeResult recognizeResult = (RecognizeResult) other;
            return Intrinsics.areEqual(this.itemIds, recognizeResult.itemIds) && Intrinsics.areEqual(this.cmsNames, recognizeResult.cmsNames) && this.requestSuccess == recognizeResult.requestSuccess && Intrinsics.areEqual(this.otherData, recognizeResult.otherData);
        }

        public int hashCode() {
            int hashCode = this.itemIds.hashCode() * 31;
            List<CmsName> list = this.cmsNames;
            return ((((hashCode + (list == null ? 0 : list.hashCode())) * 31) + Boolean.hashCode(this.requestSuccess)) * 31) + this.otherData.hashCode();
        }

        public String toString() {
            return "RecognizeResult(itemIds=" + this.itemIds + ", cmsNames=" + this.cmsNames + ", requestSuccess=" + this.requestSuccess + ", otherData=" + this.otherData + ")";
        }

        public RecognizeResult(List<Long> itemIds, List<CmsName> list, boolean z, Map<String, ? extends Object> otherData) {
            Intrinsics.checkNotNullParameter(itemIds, "itemIds");
            Intrinsics.checkNotNullParameter(otherData, "otherData");
            this.itemIds = itemIds;
            this.cmsNames = list;
            this.requestSuccess = z;
            this.otherData = otherData;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ RecognizeResult copy$default(RecognizeResult recognizeResult, List list, List list2, boolean z, Map map, int i, Object obj) {
            if ((i & 1) != 0) {
                list = recognizeResult.itemIds;
            }
            if ((i & 2) != 0) {
                list2 = recognizeResult.cmsNames;
            }
            if ((i & 4) != 0) {
                z = recognizeResult.requestSuccess;
            }
            if ((i & 8) != 0) {
                map = recognizeResult.otherData;
            }
            return recognizeResult.copy(list, list2, z, map);
        }

        public final List<Long> getItemIds() {
            return this.itemIds;
        }

        public final List<CmsName> getCmsNames() {
            return this.cmsNames;
        }

        public final boolean getRequestSuccess() {
            return this.requestSuccess;
        }

        public /* synthetic */ RecognizeResult(List list, List list2, boolean z, HashMap hashMap, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, list2, z, (i & 8) != 0 ? new HashMap() : hashMap);
        }

        public final Map<String, Object> getOtherData() {
            return this.otherData;
        }

        public final void setOtherData(Map<String, ? extends Object> map) {
            Intrinsics.checkNotNullParameter(map, "<set-?>");
            this.otherData = map;
        }
    }
}
