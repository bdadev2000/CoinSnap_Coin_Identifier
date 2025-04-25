package com.glority.android.picturexx.vm;

import com.glority.base.viewmodel.BaseViewModel;
import com.glority.network.model.Resource;
import com.picturecoin.generatedAPI.kotlinAPI.collection.CollectionCountrySummary;
import com.picturecoin.generatedAPI.kotlinAPI.collection.GetCollectionsSummaryNewMessage;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* compiled from: CollectionSummaryViewModel.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/glority/android/picturexx/vm/CollectionSummaryViewModel;", "Lcom/glority/base/viewmodel/BaseViewModel;", "<init>", "()V", "issuerCountrySummaries", "", "Lcom/picturecoin/generatedAPI/kotlinAPI/collection/CollectionCountrySummary;", "getIssuerCountrySummaries", "()Ljava/util/List;", "collectionSummaryRes", "Lcom/glority/network/model/Resource;", "Lcom/picturecoin/generatedAPI/kotlinAPI/collection/GetCollectionsSummaryNewMessage;", "getCollectionSummaryRes", "()Lcom/glority/network/model/Resource;", "setCollectionSummaryRes", "(Lcom/glority/network/model/Resource;)V", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class CollectionSummaryViewModel extends BaseViewModel {
    public static final int $stable = 8;
    private Resource<GetCollectionsSummaryNewMessage> collectionSummaryRes;
    private final List<CollectionCountrySummary> issuerCountrySummaries = new ArrayList();

    public final List<CollectionCountrySummary> getIssuerCountrySummaries() {
        return this.issuerCountrySummaries;
    }

    public final Resource<GetCollectionsSummaryNewMessage> getCollectionSummaryRes() {
        return this.collectionSummaryRes;
    }

    public final void setCollectionSummaryRes(Resource<GetCollectionsSummaryNewMessage> resource) {
        this.collectionSummaryRes = resource;
    }
}
