package com.glority.android.picturexx.repository;

import com.glority.android.database.DBManager;
import com.glority.android.database.dao.HistoryItemDao;
import com.glority.android.database.dao.RecognizeHistoryItemDao;
import com.glority.android.database.entities.HistoryItem;
import com.glority.android.database.entities.RecognizeHistoryItem;
import com.glority.android.repository.BaseRepository;
import com.glority.base.viewmodel.AppViewModel;
import com.glority.component.generatedAPI.kotlinAPI.cms.CmsName;
import com.glority.component.generatedAPI.kotlinAPI.cms.TaxonomyName;
import com.glority.component.generatedAPI.kotlinAPI.enums.CmsFormat;
import com.glority.component.generatedAPI.kotlinAPI.enums.LanguageCode;
import com.glority.component.generatedAPI.kotlinAPI.enums.PhotoFrom;
import com.glority.component.generatedAPI.kotlinAPI.recognize.Location;
import com.glority.component.generatedAPI.kotlinAPI.user.User;
import com.glority.network.model.Resource;
import com.glority.network.model.Status;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.picturecoin.generatedAPI.kotlinAPI.recognize.RecognizeGradeMessage;
import com.picturecoin.generatedAPI.kotlinAPI.recognize.RecognizeNewMessage;
import java.io.File;
import java.util.Date;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RecognizeRepository.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jf\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0007J.\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¨\u0006\u001b"}, d2 = {"Lcom/glority/android/picturexx/repository/RecognizeRepository;", "Lcom/glority/android/repository/BaseRepository;", "<init>", "()V", "recognizeBlocking", "Lcom/glority/network/model/Resource;", "Lcom/picturecoin/generatedAPI/kotlinAPI/recognize/RecognizeNewMessage;", RemoteConfigConstants.RequestFieldKey.LANGUAGE_CODE, "Lcom/glority/component/generatedAPI/kotlinAPI/enums/LanguageCode;", RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, "", "cmsFormat", "Lcom/glority/component/generatedAPI/kotlinAPI/enums/CmsFormat;", "FrontImgFile", "Ljava/io/File;", "BackImgFile", "shootLocation", "Lcom/glority/component/generatedAPI/kotlinAPI/recognize/Location;", "uploadLocation", "shootAt", "Ljava/util/Date;", "photoFrom", "Lcom/glority/component/generatedAPI/kotlinAPI/enums/PhotoFrom;", "wifi", "", "gradingBlocking", "Lcom/picturecoin/generatedAPI/kotlinAPI/recognize/RecognizeGradeMessage;", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class RecognizeRepository extends BaseRepository {
    public static final int $stable = 0;
    public static final RecognizeRepository INSTANCE = new RecognizeRepository();

    private RecognizeRepository() {
    }

    public final Resource<RecognizeNewMessage> recognizeBlocking(LanguageCode languageCode, String countryCode, CmsFormat cmsFormat, File FrontImgFile, File BackImgFile, Location shootLocation, Location uploadLocation, Date shootAt, PhotoFrom photoFrom, boolean wifi) {
        RecognizeNewMessage data;
        String str;
        TaxonomyName name;
        List<String> commonNames;
        Intrinsics.checkNotNullParameter(languageCode, "languageCode");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(FrontImgFile, "FrontImgFile");
        Intrinsics.checkNotNullParameter(BackImgFile, "BackImgFile");
        Intrinsics.checkNotNullParameter(photoFrom, "photoFrom");
        Resource<RecognizeNewMessage> sendMessageBlocking = BaseRepository.INSTANCE.getAppServer().sendMessageBlocking(new RecognizeNewMessage(languageCode, countryCode, cmsFormat, FrontImgFile, BackImgFile, shootLocation, uploadLocation, shootAt, photoFrom, wifi, null, null, true));
        if (sendMessageBlocking.getStatus() == Status.SUCCESS && (data = sendMessageBlocking.getData()) != null) {
            CmsName cmsName = (CmsName) CollectionsKt.firstOrNull((List) data.getCmsNames());
            String uid = cmsName != null ? cmsName.getUid() : null;
            User value = AppViewModel.INSTANCE.getInstance().getUser().getValue();
            long userId = value != null ? value.getUserId() : 0L;
            String url = data.getUrl();
            CmsName cmsName2 = (CmsName) CollectionsKt.firstOrNull((List) data.getCmsNames());
            if (cmsName2 == null || (name = cmsName2.getName()) == null || (commonNames = name.getCommonNames()) == null || (str = (String) CollectionsKt.firstOrNull((List) commonNames)) == null) {
                str = "";
            }
            String str2 = uid;
            if (str2 != null && str2.length() != 0) {
                Map<String, Object> cmsNameUidsWithYear = data.getCmsNameUidsWithYear();
                Object obj = cmsNameUidsWithYear != null ? cmsNameUidsWithYear.get(uid) : null;
                String str3 = obj instanceof String ? (String) obj : null;
                RecognizeHistoryItemDao recognizeHistoryItemDao = DBManager.INSTANCE.getRecognizeHistoryItemDao();
                RecognizeHistoryItem[] recognizeHistoryItemArr = new RecognizeHistoryItem[1];
                long itemId = data.getItemId();
                Date shootAt2 = data.getShootAt();
                if (shootAt2 == null) {
                    shootAt2 = new Date();
                }
                recognizeHistoryItemArr[0] = new RecognizeHistoryItem(itemId, uid, shootAt2, str3);
                recognizeHistoryItemDao.insert(recognizeHistoryItemArr);
                HistoryItemDao historyItemDao = DBManager.INSTANCE.getHistoryItemDao();
                HistoryItem[] historyItemArr = new HistoryItem[1];
                long itemId2 = data.getItemId();
                Date shootAt3 = data.getShootAt();
                if (shootAt3 == null) {
                    shootAt3 = new Date();
                }
                historyItemArr[0] = new HistoryItem(itemId2, uid, str, userId, url, shootAt3);
                historyItemDao.insert(historyItemArr);
            }
        }
        return sendMessageBlocking;
    }

    public final Resource<RecognizeGradeMessage> gradingBlocking(LanguageCode languageCode, String countryCode, File FrontImgFile, File BackImgFile) {
        Intrinsics.checkNotNullParameter(languageCode, "languageCode");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(FrontImgFile, "FrontImgFile");
        Intrinsics.checkNotNullParameter(BackImgFile, "BackImgFile");
        return BaseRepository.INSTANCE.getAppServer().sendMessageBlocking(new RecognizeGradeMessage(languageCode, countryCode, FrontImgFile, BackImgFile));
    }
}
