package com.glority.android.picturexx.vm;

import androidx.lifecycle.MutableLiveData;
import com.glority.android.picturexx.extensions.CollectionCountrySummaryWrapper;
import com.glority.base.viewmodel.BaseViewModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* compiled from: SummaryDistributionViewModel.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0019\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/glority/android/picturexx/vm/SummaryDistributionViewModel;", "Lcom/glority/base/viewmodel/BaseViewModel;", "<init>", "()V", "group", "", "Lcom/glority/android/picturexx/extensions/CollectionCountrySummaryWrapper;", "getGroup", "()Ljava/util/List;", "selectedCountryCode", "Landroidx/lifecycle/MutableLiveData;", "", "getSelectedCountryCode", "()Landroidx/lifecycle/MutableLiveData;", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class SummaryDistributionViewModel extends BaseViewModel {
    public static final int $stable = 8;
    private final List<CollectionCountrySummaryWrapper> group = new ArrayList();
    private final MutableLiveData<String> selectedCountryCode = new MutableLiveData<>(null);

    public final List<CollectionCountrySummaryWrapper> getGroup() {
        return this.group;
    }

    public final MutableLiveData<String> getSelectedCountryCode() {
        return this.selectedCountryCode;
    }
}
