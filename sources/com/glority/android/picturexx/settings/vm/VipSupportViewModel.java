package com.glority.android.picturexx.settings.vm;

import androidx.lifecycle.LiveData;
import com.glority.base.repository.UserRepository;
import com.glority.base.viewmodel.BaseViewModel;
import com.glority.component.generatedAPI.kotlinAPI.enums.SupportType;
import com.glority.component.generatedAPI.kotlinAPI.support.SendSupportTicketMessage;
import com.glority.network.model.Resource;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: VipSupportViewModel.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JP\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\t2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000e2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000eH\u0007¨\u0006\u0010"}, d2 = {"Lcom/glority/android/picturexx/settings/vm/VipSupportViewModel;", "Lcom/glority/base/viewmodel/BaseViewModel;", "<init>", "()V", "submitSupportTicket", "Landroidx/lifecycle/LiveData;", "Lcom/glority/network/model/Resource;", "Lcom/glority/component/generatedAPI/kotlinAPI/support/SendSupportTicketMessage;", "email", "", "supportType", "Lcom/glority/component/generatedAPI/kotlinAPI/enums/SupportType;", "content", "images", "", "tags", "settings_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class VipSupportViewModel extends BaseViewModel {
    public static /* synthetic */ LiveData submitSupportTicket$default(VipSupportViewModel vipSupportViewModel, String str, SupportType supportType, String str2, List list, List list2, int i, Object obj) {
        if ((i & 16) != 0) {
            list2 = null;
        }
        return vipSupportViewModel.submitSupportTicket(str, supportType, str2, list, list2);
    }

    public final LiveData<Resource<SendSupportTicketMessage>> submitSupportTicket(String email, SupportType supportType, String content, List<String> images, List<String> tags) {
        Intrinsics.checkNotNullParameter(email, "email");
        Intrinsics.checkNotNullParameter(supportType, "supportType");
        return BaseViewModel.request$default(this, SendSupportTicketMessage.class, UserRepository.INSTANCE.getInstance().submitSupportTicketMethod(email, supportType, content, images, tags), null, null, null, 28, null);
    }
}
