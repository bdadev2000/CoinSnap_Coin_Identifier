package com.glority.android.picturexx;

import com.glority.android.core.utils.data.EventLiveData;
import com.glority.android.picturexx.definition.MainTabSelector;
import com.glority.android.picturexx.vm.SeriesViewModel;
import kotlin.Metadata;

/* compiled from: GlobalLiveBus.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u001e\u001a\u00020#R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0019\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0019\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0010R\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0010R\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u000e¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0010R\u0017\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001f0\u000e¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0010¨\u0006$"}, d2 = {"Lcom/glority/android/picturexx/GlobalLiveBus;", "", "<init>", "()V", "TAG_ME_TAB_COLLECTION", "", "TAG_ME_TAB_CUSTOM_SERIES", "currentRecognizeImageUrl", "", "getCurrentRecognizeImageUrl", "()Ljava/lang/String;", "setCurrentRecognizeImageUrl", "(Ljava/lang/String;)V", "changeCatalogTab", "Lcom/glority/android/core/utils/data/EventLiveData;", "getChangeCatalogTab", "()Lcom/glority/android/core/utils/data/EventLiveData;", "changeMeTab", "getChangeMeTab", "changeCatalogFilter", "Lcom/glority/android/picturexx/vm/SeriesViewModel$SeriesType;", "getChangeCatalogFilter", "changeCatalogFilterCountry", "getChangeCatalogFilterCountry", "changeMainTab", "Lcom/glority/android/picturexx/definition/MainTabSelector;", "getChangeMainTab", "showInAppReviewTab", "", "getShowInAppReviewTab", "collectionCountChanged", "", "getCollectionCountChanged", "currencyChangedLiveData", "getCurrencyChangedLiveData", "", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes2.dex */
public final class GlobalLiveBus {
    public static final int TAG_ME_TAB_COLLECTION = 0;
    public static final int TAG_ME_TAB_CUSTOM_SERIES = 1;
    private static String currentRecognizeImageUrl;
    public static final GlobalLiveBus INSTANCE = new GlobalLiveBus();
    private static final EventLiveData<Integer> changeCatalogTab = new EventLiveData<>();
    private static final EventLiveData<Integer> changeMeTab = new EventLiveData<>();
    private static final EventLiveData<SeriesViewModel.SeriesType> changeCatalogFilter = new EventLiveData<>();
    private static final EventLiveData<String> changeCatalogFilterCountry = new EventLiveData<>();
    private static final EventLiveData<MainTabSelector> changeMainTab = new EventLiveData<>();
    private static final EventLiveData<Double> showInAppReviewTab = new EventLiveData<>();
    private static final EventLiveData<Boolean> collectionCountChanged = new EventLiveData<>();
    private static final EventLiveData<Boolean> currencyChangedLiveData = new EventLiveData<>();
    public static final int $stable = 8;

    private GlobalLiveBus() {
    }

    public final String getCurrentRecognizeImageUrl() {
        return currentRecognizeImageUrl;
    }

    public final void setCurrentRecognizeImageUrl(String str) {
        currentRecognizeImageUrl = str;
    }

    public final EventLiveData<Integer> getChangeCatalogTab() {
        return changeCatalogTab;
    }

    public final EventLiveData<Integer> getChangeMeTab() {
        return changeMeTab;
    }

    public final EventLiveData<SeriesViewModel.SeriesType> getChangeCatalogFilter() {
        return changeCatalogFilter;
    }

    public final EventLiveData<String> getChangeCatalogFilterCountry() {
        return changeCatalogFilterCountry;
    }

    public final EventLiveData<MainTabSelector> getChangeMainTab() {
        return changeMainTab;
    }

    public final EventLiveData<Double> getShowInAppReviewTab() {
        return showInAppReviewTab;
    }

    public final EventLiveData<Boolean> getCollectionCountChanged() {
        return collectionCountChanged;
    }

    public final EventLiveData<Boolean> getCurrencyChangedLiveData() {
        return currencyChangedLiveData;
    }

    public final void collectionCountChanged() {
        collectionCountChanged.postValue(true);
    }
}
