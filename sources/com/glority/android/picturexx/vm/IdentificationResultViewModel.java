package com.glority.android.picturexx.vm;

import androidx.lifecycle.MutableLiveData;
import com.glority.android.picturexx.entity.ValueCheckUiEntity;
import com.glority.android.xx.constants.Args;
import com.glority.base.viewmodel.BaseViewModel;
import com.glority.component.generatedAPI.kotlinAPI.cms.CmsName;
import java.io.File;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IdentificationResultViewModel.kt */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u001e\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010G\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006J\b\u0010H\u001a\u0004\u0018\u00010IR\u001d\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rR \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\r\"\u0004\b\u0017\u0010\u000fR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001a\"\u0004\b\u001f\u0010\u001cR\u001c\u0010 \u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001a\"\u0004\b\"\u0010\u001cR\u001c\u0010#\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u001a\"\u0004\b%\u0010\u001cR\u001c\u0010&\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u001a\"\u0004\b(\u0010\u001cR\u001c\u0010)\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u001a\"\u0004\b+\u0010\u001cR\u001c\u0010,\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u001a\"\u0004\b.\u0010\u001cR \u0010/\u001a\b\u0012\u0004\u0012\u00020\u00070\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\t\"\u0004\b1\u00102R \u00103\u001a\b\u0012\u0004\u0012\u0002040\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\r\"\u0004\b6\u0010\u000fR(\u00107\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0018\u000108X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R(\u0010=\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020>\u0018\u000108X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010:\"\u0004\b@\u0010<R(\u0010A\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u000b0BX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010D\"\u0004\bE\u0010F¨\u0006J"}, d2 = {"Lcom/glority/android/picturexx/vm/IdentificationResultViewModel;", "Lcom/glority/base/viewmodel/BaseViewModel;", "<init>", "()V", "identificationResultLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/glority/component/generatedAPI/kotlinAPI/cms/CmsName;", "getIdentificationResultLiveData", "()Landroidx/lifecycle/MutableLiveData;", "userImages", "", "getUserImages", "()Ljava/util/List;", "setUserImages", "(Ljava/util/List;)V", "userOriginalImages", "", "Ljava/io/File;", "getUserOriginalImages", "itemIds", "", "getItemIds", "setItemIds", "mergeImage", "getMergeImage", "()Ljava/lang/String;", "setMergeImage", "(Ljava/lang/String;)V", Args.denominationSideUrl, "getDenominationSideUrl", "setDenominationSideUrl", Args.subjectSideUrl, "getSubjectSideUrl", "setSubjectSideUrl", Args.year, "getYear", "setYear", "grade", "getGrade", "setGrade", Args.varietyUid, "getVarietyUid", "setVarietyUid", Args.speciesUid, "getSpeciesUid", "setSpeciesUid", "currentCmsName", "getCurrentCmsName", "setCurrentCmsName", "(Landroidx/lifecycle/MutableLiveData;)V", "identificationProbabilities", "", "getIdentificationProbabilities", "setIdentificationProbabilities", "uidYearMap", "", "getUidYearMap", "()Ljava/util/Map;", "setUidYearMap", "(Ljava/util/Map;)V", "uidYearDefaultVarietyUidMap", "", "getUidYearDefaultVarietyUidMap", "setUidYearDefaultVarietyUidMap", "addCollectionFromMap", "Ljava/util/LinkedHashMap;", "getAddCollectionFromMap", "()Ljava/util/LinkedHashMap;", "setAddCollectionFromMap", "(Ljava/util/LinkedHashMap;)V", "getDisplayImage", "getValueCheckUiEntity", "Lcom/glority/android/picturexx/entity/ValueCheckUiEntity;", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class IdentificationResultViewModel extends BaseViewModel {
    public static final int $stable = 8;
    private String denominationSideUrl;
    private String grade;
    private String mergeImage;
    private String speciesUid;
    private String subjectSideUrl;
    private Map<String, ? extends Object> uidYearDefaultVarietyUidMap;
    private Map<String, String> uidYearMap;
    private String varietyUid;
    private String year;
    private final MutableLiveData<List<CmsName>> identificationResultLiveData = new MutableLiveData<>();
    private List<String> userImages = new ArrayList();
    private final List<File> userOriginalImages = new ArrayList();
    private List<Long> itemIds = new ArrayList();
    private MutableLiveData<CmsName> currentCmsName = new MutableLiveData<>();
    private List<Double> identificationProbabilities = new ArrayList();
    private LinkedHashMap<Long, String> addCollectionFromMap = new LinkedHashMap<>();

    public final MutableLiveData<List<CmsName>> getIdentificationResultLiveData() {
        return this.identificationResultLiveData;
    }

    public final List<String> getUserImages() {
        return this.userImages;
    }

    public final void setUserImages(List<String> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.userImages = list;
    }

    public final List<File> getUserOriginalImages() {
        return this.userOriginalImages;
    }

    public final List<Long> getItemIds() {
        return this.itemIds;
    }

    public final void setItemIds(List<Long> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.itemIds = list;
    }

    public final String getMergeImage() {
        return this.mergeImage;
    }

    public final void setMergeImage(String str) {
        this.mergeImage = str;
    }

    public final String getDenominationSideUrl() {
        return this.denominationSideUrl;
    }

    public final void setDenominationSideUrl(String str) {
        this.denominationSideUrl = str;
    }

    public final String getSubjectSideUrl() {
        return this.subjectSideUrl;
    }

    public final void setSubjectSideUrl(String str) {
        this.subjectSideUrl = str;
    }

    public final String getYear() {
        return this.year;
    }

    public final void setYear(String str) {
        this.year = str;
    }

    public final String getGrade() {
        return this.grade;
    }

    public final void setGrade(String str) {
        this.grade = str;
    }

    public final String getVarietyUid() {
        return this.varietyUid;
    }

    public final void setVarietyUid(String str) {
        this.varietyUid = str;
    }

    public final String getSpeciesUid() {
        return this.speciesUid;
    }

    public final void setSpeciesUid(String str) {
        this.speciesUid = str;
    }

    public final MutableLiveData<CmsName> getCurrentCmsName() {
        return this.currentCmsName;
    }

    public final void setCurrentCmsName(MutableLiveData<CmsName> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.currentCmsName = mutableLiveData;
    }

    public final List<Double> getIdentificationProbabilities() {
        return this.identificationProbabilities;
    }

    public final void setIdentificationProbabilities(List<Double> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.identificationProbabilities = list;
    }

    public final Map<String, String> getUidYearMap() {
        return this.uidYearMap;
    }

    public final void setUidYearMap(Map<String, String> map) {
        this.uidYearMap = map;
    }

    public final Map<String, Object> getUidYearDefaultVarietyUidMap() {
        return this.uidYearDefaultVarietyUidMap;
    }

    public final void setUidYearDefaultVarietyUidMap(Map<String, ? extends Object> map) {
        this.uidYearDefaultVarietyUidMap = map;
    }

    public final LinkedHashMap<Long, String> getAddCollectionFromMap() {
        return this.addCollectionFromMap;
    }

    public final void setAddCollectionFromMap(LinkedHashMap<Long, String> linkedHashMap) {
        Intrinsics.checkNotNullParameter(linkedHashMap, "<set-?>");
        this.addCollectionFromMap = linkedHashMap;
    }

    public final List<String> getDisplayImage() {
        String str = this.mergeImage;
        if (str == null || str.length() == 0) {
            return this.userImages;
        }
        String str2 = this.mergeImage;
        if (str2 == null) {
            str2 = "";
        }
        return CollectionsKt.listOf(str2);
    }

    public final ValueCheckUiEntity getValueCheckUiEntity() {
        CmsName value = this.currentCmsName.getValue();
        if (value == null) {
            return null;
        }
        Map<String, String> map = this.uidYearMap;
        Map<String, ? extends Object> map2 = this.uidYearDefaultVarietyUidMap;
        String str = this.mergeImage;
        if (str == null) {
            str = "";
        }
        return new ValueCheckUiEntity(value, map, map2, str, this.grade);
    }
}
