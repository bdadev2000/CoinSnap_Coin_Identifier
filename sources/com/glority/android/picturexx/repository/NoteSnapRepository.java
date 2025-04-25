package com.glority.android.picturexx.repository;

import androidx.lifecycle.LiveData;
import com.glority.android.repository.BaseRepository;
import com.glority.network.model.Resource;
import com.picturecoin.generatedAPI.kotlinAPI.application.GetAndUseGooglePromoCodeMessage;
import kotlin.Metadata;

/* compiled from: NoteSnapRepository.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005¨\u0006\b"}, d2 = {"Lcom/glority/android/picturexx/repository/NoteSnapRepository;", "Lcom/glority/android/repository/BaseRepository;", "<init>", "()V", "getPromoCodeMessage", "Landroidx/lifecycle/LiveData;", "Lcom/glority/network/model/Resource;", "Lcom/picturecoin/generatedAPI/kotlinAPI/application/GetAndUseGooglePromoCodeMessage;", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class NoteSnapRepository extends BaseRepository {
    public static final int $stable = 0;
    public static final NoteSnapRepository INSTANCE = new NoteSnapRepository();

    private NoteSnapRepository() {
    }

    public final LiveData<Resource<GetAndUseGooglePromoCodeMessage>> getPromoCodeMessage() {
        return BaseRepository.INSTANCE.getAppServer().sendMessage(new GetAndUseGooglePromoCodeMessage("notesnap30free"));
    }
}
