package com.glority.android.picturexx.settings.fragment.setting;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import com.glority.android.base.aws.s3.AwsFileUploader;
import com.glority.android.base.aws.s3.Scope;
import com.glority.android.picturexx.settings.R;
import com.glority.android.picturexx.settings.logevents.SettingsLogEvents;
import com.glority.android.picturexx.settings.vm.VipSupportViewModel;
import com.glority.android.ui.base.v2.BaseFragment;
import com.glority.base.utils.data.DefaultResponseHandler;
import com.glority.base.utils.data.ResponseUtil;
import com.glority.component.generatedAPI.kotlinAPI.enums.SupportType;
import com.glority.component.generatedAPI.kotlinAPI.support.SendSupportTicketMessage;
import com.glority.network.model.Resource;
import com.glority.utils.app.ResUtils;
import com.glority.utils.stability.LogUtils;
import com.glority.utils.store.FileUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;

/* compiled from: VipSupportFragment.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0014J\b\u0010\n\u001a\u00020\u000bH\u0014J&\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0016J\b\u0010\u0012\u001a\u00020\u000bH\u0016J\b\u0010\u0013\u001a\u00020\u000bH\u0016J\b\u0010\u0014\u001a\u00020\u000bH\u0016J\b\u0010\u0015\u001a\u00020\u000bH\u0016J\b\u0010\u0016\u001a\u00020\u000bH\u0016J\b\u0010\u0017\u001a\u00020\u0007H\u0016J\b\u0010\u0018\u001a\u00020\u0007H\u0002J\b\u0010\u0019\u001a\u00020\u0007H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/glority/android/picturexx/settings/fragment/setting/VipSupportFragment;", "Lcom/glority/android/picturexx/settings/fragment/setting/BaseFeedbackFragment;", "<init>", "()V", "vm", "Lcom/glority/android/picturexx/settings/vm/VipSupportViewModel;", "doCreateView", "", "savedInstanceState", "Landroid/os/Bundle;", "getLogPageName", "", "onSubmit", "content", "contact", "imageList", "", "Landroid/net/Uri;", "getTitle", "getContentTip", "getContentHint", "getContactTip", "getContactHint", "onBack", "addSubscriptions", "onDestroy", "Companion", "settings_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class VipSupportFragment extends BaseFeedbackFragment {
    public static final String FEEDBACK_TAG = "vip_support";
    private VipSupportViewModel vm;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.glority.android.picturexx.settings.fragment.setting.BaseFeedbackFragment, com.glority.android.ui.base.v2.BaseFragment
    public void doCreateView(Bundle savedInstanceState) {
        BaseFragment.logEvent$default(this, SettingsLogEvents.VIP_Support_Page, null, 2, null);
        this.vm = (VipSupportViewModel) getViewModel(VipSupportViewModel.class);
        super.doCreateView(savedInstanceState);
        addSubscriptions();
    }

    @Override // com.glority.android.ui.base.v2.BaseFragment
    protected String getLogPageName() {
        String lowerCase = "VipSupport".toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    @Override // com.glority.android.picturexx.settings.fragment.setting.BaseFeedbackFragment
    public void onSubmit(final String content, final String contact, final List<? extends Uri> imageList) {
        VipSupportViewModel vipSupportViewModel;
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(contact, "contact");
        Intrinsics.checkNotNullParameter(imageList, "imageList");
        VipSupportFragment vipSupportFragment = this;
        BaseFragment.logEvent$default(vipSupportFragment, SettingsLogEvents.VIP_Support_Send, null, 2, null);
        BaseFragment.showProgress$default(vipSupportFragment, null, false, 3, null);
        final ArrayList arrayList = new ArrayList();
        if (!imageList.isEmpty()) {
            List<? extends Uri> list = imageList;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(FileUtils.getFilePath((Uri) it.next()));
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                AwsFileUploader.INSTANCE.uploadImageFile((String) it2.next(), Scope.SUPPORT.getValue(), new AwsFileUploader.ResultListener() { // from class: com.glority.android.picturexx.settings.fragment.setting.VipSupportFragment$onSubmit$2$1
                    private final void upload(List<String> urls) {
                        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getMain(), null, new VipSupportFragment$onSubmit$2$1$upload$1(VipSupportFragment.this, contact, content, urls, null), 2, null);
                    }

                    @Override // com.glority.android.base.aws.s3.AwsFileUploader.ResultListener
                    public void onSuccess(String url) {
                        List<String> list2 = arrayList;
                        if (url == null) {
                            url = "";
                        }
                        list2.add(url);
                        if (arrayList.size() == imageList.size()) {
                            upload(arrayList);
                        }
                    }

                    @Override // com.glority.android.base.aws.s3.AwsFileUploader.ResultListener
                    public void onError(String msg) {
                        LogUtils.e("AwsImageFile uploaded failed: ", msg);
                        arrayList.add("");
                        if (arrayList.size() == imageList.size()) {
                            upload(arrayList);
                        }
                    }
                });
            }
            return;
        }
        VipSupportViewModel vipSupportViewModel2 = this.vm;
        if (vipSupportViewModel2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("vm");
            vipSupportViewModel = null;
        } else {
            vipSupportViewModel = vipSupportViewModel2;
        }
        vipSupportViewModel.submitSupportTicket(contact, SupportType.VIP_SUPPORT, content, null, CollectionsKt.arrayListOf(FEEDBACK_TAG));
    }

    @Override // com.glority.android.picturexx.settings.fragment.setting.BaseFeedbackFragment
    public String getTitle() {
        String string = ResUtils.getString(R.string.vip_support_text_title);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    @Override // com.glority.android.picturexx.settings.fragment.setting.BaseFeedbackFragment
    public String getContentTip() {
        String string = ResUtils.getString(R.string.text_description);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    @Override // com.glority.android.picturexx.settings.fragment.setting.BaseFeedbackFragment
    public String getContentHint() {
        String string = getString(R.string.suggestion_text_desc_suggestion);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    @Override // com.glority.android.picturexx.settings.fragment.setting.BaseFeedbackFragment
    public String getContactTip() {
        String string = ResUtils.getString(R.string.vip_support_text_tip_email);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    @Override // com.glority.android.picturexx.settings.fragment.setting.BaseFeedbackFragment
    public String getContactHint() {
        String string = ResUtils.getString(R.string.login_text_email_address);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    @Override // com.glority.android.picturexx.settings.fragment.setting.BaseFeedbackFragment
    public void onBack() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    private final void addSubscriptions() {
        VipSupportViewModel vipSupportViewModel = this.vm;
        if (vipSupportViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("vm");
            vipSupportViewModel = null;
        }
        vipSupportViewModel.getObservable(SendSupportTicketMessage.class).observe(this, new Observer() { // from class: com.glority.android.picturexx.settings.fragment.setting.VipSupportFragment$$ExternalSyntheticLambda0
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                VipSupportFragment.addSubscriptions$lambda$2(VipSupportFragment.this, (Resource) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addSubscriptions$lambda$2(final VipSupportFragment this$0, Resource resource) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ResponseUtil responseUtil = ResponseUtil.INSTANCE;
        Intrinsics.checkNotNull(resource);
        responseUtil.handleResult(resource, new DefaultResponseHandler<SendSupportTicketMessage>() { // from class: com.glority.android.picturexx.settings.fragment.setting.VipSupportFragment$addSubscriptions$1$1
            @Override // com.glority.base.utils.data.DefaultResponseHandler, com.glority.base.utils.data.ResponseHandler
            public void success(SendSupportTicketMessage data) {
                super.success((VipSupportFragment$addSubscriptions$1$1) data);
                VipSupportFragment.this.hideProgress();
                if (data == null) {
                    return;
                }
                LogUtils.d("SendSupportTicketMessage Requested Successfully!");
                BaseFragment.logEvent$default(VipSupportFragment.this, SettingsLogEvents.VIP_Support_Send_Success, null, 2, null);
                VipSupportFragment.this.onBack();
            }

            @Override // com.glority.base.utils.data.DefaultResponseHandler, com.glority.base.utils.data.ResponseHandler
            public void error(Throwable e) {
                VipSupportFragment.this.hideProgress();
                super.error(e);
                Object[] objArr = new Object[2];
                objArr[0] = "SendSupportTicketMessage Requested Failed!";
                objArr[1] = e != null ? e.getMessage() : null;
                LogUtils.e(objArr);
                BaseFragment.logEvent$default(VipSupportFragment.this, SettingsLogEvents.VIP_Support_Send_Failure, null, 2, null);
            }
        });
    }

    @Override // com.glority.android.ui.base.v2.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        BaseFragment.logEvent$default(this, SettingsLogEvents.VIP_Support_Close, null, 2, null);
    }
}
