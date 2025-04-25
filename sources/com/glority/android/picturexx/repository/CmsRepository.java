package com.glority.android.picturexx.repository;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.glority.android.core.utils.data.PersistData;
import com.glority.android.database.DBManager;
import com.glority.android.database.entities.HistoryItem;
import com.glority.android.repository.BaseRepository;
import com.glority.android.xx.constants.Args;
import com.glority.base.viewmodel.AppViewModel;
import com.glority.component.generatedAPI.kotlinAPI.cms.CmsStaticUrl;
import com.glority.component.generatedAPI.kotlinAPI.cms.GetCmsNameMessage;
import com.glority.component.generatedAPI.kotlinAPI.cms.GetStaticUrlMessage;
import com.glority.component.generatedAPI.kotlinAPI.enums.LanguageCode;
import com.glority.component.generatedAPI.kotlinAPI.item.ChangeItemCmsNameMessage;
import com.glority.network.model.Resource;
import com.glority.network.model.Status;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;

/* compiled from: CmsRepository.kt */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\tJ$\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\tJ&\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00062\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\tH\u0002J*\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00110\u00172\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\tJ\u001a\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\u001a\u001a\u00020\tJ\u001a\u0010\u001b\u001a\u0004\u0018\u00010\u00192\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\u001a\u001a\u00020\tJ.\u0010\u001c\u001a\u00020\u001d2\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\u001a\u001a\u00020\t2\u0014\u0010\u001e\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0019\u0012\u0004\u0012\u00020\u001d0\u001f¨\u0006 "}, d2 = {"Lcom/glority/android/picturexx/repository/CmsRepository;", "Lcom/glority/android/repository/BaseRepository;", "<init>", "()V", "getCmsName", "Landroidx/lifecycle/LiveData;", "Lcom/glority/network/model/Resource;", "Lcom/glority/component/generatedAPI/kotlinAPI/cms/GetCmsNameMessage;", Args.uid, "", RemoteConfigConstants.RequestFieldKey.LANGUAGE_CODE, "Lcom/glority/component/generatedAPI/kotlinAPI/enums/LanguageCode;", RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, "getCmsNameSync", "changeItemCmsNameMessage", "Lcom/glority/component/generatedAPI/kotlinAPI/item/ChangeItemCmsNameMessage;", "itemId", "", "cmsNameUid", "cmsNameName", "Landroidx/lifecycle/MutableLiveData;", "Lcom/glority/network/model/Status;", "itemIds", "", "getStaticUrlCmsMessageByNet", "Lcom/glority/component/generatedAPI/kotlinAPI/cms/CmsStaticUrl;", "contentType", "getStaticUrlMessageByCache", "getStaticUrlMessageByCacheOrNetwork", "", "callback", "Lkotlin/Function1;", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class CmsRepository extends BaseRepository {
    public static final int $stable = 0;
    public static final CmsRepository INSTANCE = new CmsRepository();

    private CmsRepository() {
    }

    public final LiveData<Resource<GetCmsNameMessage>> getCmsName(String uid, LanguageCode languageCode, String countryCode) {
        Intrinsics.checkNotNullParameter(uid, "uid");
        Intrinsics.checkNotNullParameter(languageCode, "languageCode");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        String obj = StringsKt.trim((CharSequence) uid).toString();
        if (obj.length() == 0) {
            MutableLiveData mutableLiveData = new MutableLiveData();
            mutableLiveData.postValue(Resource.Companion.error$default(Resource.INSTANCE, "uid is empty", null, null, 4, null));
            return mutableLiveData;
        }
        return BaseRepository.INSTANCE.getAppServer().sendMessage(new GetCmsNameMessage(obj, languageCode, countryCode));
    }

    public final Resource<GetCmsNameMessage> getCmsNameSync(String uid, LanguageCode languageCode, String countryCode) {
        Intrinsics.checkNotNullParameter(uid, "uid");
        Intrinsics.checkNotNullParameter(languageCode, "languageCode");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        String obj = StringsKt.trim((CharSequence) uid).toString();
        if (obj.length() == 0) {
            return Resource.Companion.error$default(Resource.INSTANCE, "uid is empty", null, null, 4, null);
        }
        return BaseRepository.INSTANCE.getAppServer().sendMessageBlocking(new GetCmsNameMessage(obj, languageCode, countryCode));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Resource<ChangeItemCmsNameMessage> changeItemCmsNameMessage(long itemId, String cmsNameUid, String cmsNameName) {
        HistoryItem itemSync;
        Resource<ChangeItemCmsNameMessage> sendMessageBlocking = BaseRepository.INSTANCE.getAppServer().sendMessageBlocking(new ChangeItemCmsNameMessage(itemId, cmsNameUid, cmsNameName));
        if (sendMessageBlocking.getStatus() == Status.SUCCESS && (itemSync = DBManager.INSTANCE.getHistoryItemDao().getItemSync(itemId)) != null) {
            itemSync.setUid(cmsNameUid);
            itemSync.setName(cmsNameName);
            DBManager.INSTANCE.getHistoryItemDao().insertSync(itemSync);
        }
        return sendMessageBlocking;
    }

    public final MutableLiveData<Status> changeItemCmsNameMessage(List<Long> itemIds, String cmsNameUid, String cmsNameName) {
        Intrinsics.checkNotNullParameter(itemIds, "itemIds");
        Intrinsics.checkNotNullParameter(cmsNameUid, "cmsNameUid");
        Intrinsics.checkNotNullParameter(cmsNameName, "cmsNameName");
        MutableLiveData<Status> mutableLiveData = new MutableLiveData<>();
        if (!itemIds.contains(0L)) {
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new CmsRepository$changeItemCmsNameMessage$2(itemIds, mutableLiveData, cmsNameUid, cmsNameName, null), 3, null);
        } else {
            mutableLiveData.postValue(Status.SUCCESS);
        }
        return mutableLiveData;
    }

    public final CmsStaticUrl getStaticUrlCmsMessageByNet(String uid, String contentType) {
        CmsStaticUrl cmsStaticUrl;
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        LanguageCode languageCode = AppViewModel.INSTANCE.getInstance().getLanguageCode();
        String countryCode = AppViewModel.INSTANCE.getInstance().getCountryCode();
        Resource sendMessageBlocking = BaseRepository.INSTANCE.getAppServer().sendMessageBlocking(new GetStaticUrlMessage(contentType, languageCode, countryCode, uid));
        if (sendMessageBlocking.getStatus() != Status.SUCCESS) {
            return null;
        }
        GetStaticUrlMessage getStaticUrlMessage = (GetStaticUrlMessage) sendMessageBlocking.getData();
        if (getStaticUrlMessage != null && (cmsStaticUrl = getStaticUrlMessage.getCmsStaticUrl()) != null) {
            PersistData persistData = PersistData.INSTANCE;
            if (uid == null) {
                uid = "";
            }
            persistData.set(countryCode + "_" + languageCode + "_" + contentType + "_" + uid, cmsStaticUrl);
        }
        GetStaticUrlMessage getStaticUrlMessage2 = (GetStaticUrlMessage) sendMessageBlocking.getData();
        if (getStaticUrlMessage2 != null) {
            return getStaticUrlMessage2.getCmsStaticUrl();
        }
        return null;
    }

    public final CmsStaticUrl getStaticUrlMessageByCache(String uid, String contentType) {
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        LanguageCode languageCode = AppViewModel.INSTANCE.getInstance().getLanguageCode();
        String countryCode = AppViewModel.INSTANCE.getInstance().getCountryCode();
        PersistData persistData = PersistData.INSTANCE;
        if (uid == null) {
            uid = "";
        }
        return (CmsStaticUrl) persistData.get(countryCode + "_" + languageCode + "_" + contentType + "_" + uid);
    }

    public final void getStaticUrlMessageByCacheOrNetwork(String uid, String contentType, Function1<? super CmsStaticUrl, Unit> callback) {
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(callback, "callback");
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new CmsRepository$getStaticUrlMessageByCacheOrNetwork$1(uid, contentType, callback, null), 3, null);
    }
}
