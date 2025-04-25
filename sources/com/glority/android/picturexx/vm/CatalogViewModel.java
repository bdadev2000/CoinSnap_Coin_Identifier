package com.glority.android.picturexx.vm;

import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModelKt;
import com.glority.android.picturexx.repository.CatalogRepository;
import com.glority.base.viewmodel.AppViewModel;
import com.glority.base.viewmodel.BaseViewModel;
import com.glority.network.model.Resource;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.picturecoin.generatedAPI.kotlinAPI.series.CatalogDetailMessage;
import com.picturecoin.generatedAPI.kotlinAPI.series.CatalogInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;

/* compiled from: CatalogViewModel.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bJ\u001a\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00190\u00182\u0006\u0010\u001b\u001a\u00020\u000bR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR#\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\f0\n¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u001c"}, d2 = {"Lcom/glority/android/picturexx/vm/CatalogViewModel;", "Lcom/glority/base/viewmodel/BaseViewModel;", "<init>", "()V", "displayCatalogList", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "Lcom/picturecoin/generatedAPI/kotlinAPI/series/CatalogInfo;", "getDisplayCatalogList", "()Landroidx/compose/runtime/snapshots/SnapshotStateList;", "catalogCache", "Ljava/util/HashMap;", "", "", "getCatalogCache", "()Ljava/util/HashMap;", "filterCountryCode", "getFilterCountryCode", "()Ljava/lang/String;", "setFilterCountryCode", "(Ljava/lang/String;)V", "fetchCatalogList", "", RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, "requestCatalogDetailMessage", "Landroidx/lifecycle/LiveData;", "Lcom/glority/network/model/Resource;", "Lcom/picturecoin/generatedAPI/kotlinAPI/series/CatalogDetailMessage;", "catalogUid", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class CatalogViewModel extends BaseViewModel {
    public static final int $stable = 8;
    private final SnapshotStateList<CatalogInfo> displayCatalogList = SnapshotStateKt.toMutableStateList(new ArrayList());
    private final HashMap<String, List<CatalogInfo>> catalogCache = new HashMap<>();
    private String filterCountryCode = AppViewModel.INSTANCE.getInstance().getCountryCode();

    public final SnapshotStateList<CatalogInfo> getDisplayCatalogList() {
        return this.displayCatalogList;
    }

    public final HashMap<String, List<CatalogInfo>> getCatalogCache() {
        return this.catalogCache;
    }

    public final String getFilterCountryCode() {
        return this.filterCountryCode;
    }

    public final void setFilterCountryCode(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.filterCountryCode = str;
    }

    public final void fetchCatalogList(String countryCode) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new CatalogViewModel$fetchCatalogList$1(this, countryCode, null), 2, null);
    }

    public final LiveData<Resource<CatalogDetailMessage>> requestCatalogDetailMessage(String catalogUid) {
        Intrinsics.checkNotNullParameter(catalogUid, "catalogUid");
        return CatalogRepository.INSTANCE.requestCatalogDetailMessage(catalogUid);
    }
}
