package com.glority.android.picturexx.settings.fragment.setting;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import com.glority.android.base.aws.s3.AwsFileUploader;
import com.glority.android.base.aws.s3.Scope;
import com.glority.android.picturexx.settings.R;
import com.glority.android.picturexx.settings.logevents.SettingsLogEvents;
import com.glority.android.picturexx.settings.vm.FeedbackViewModel;
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
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;

/* compiled from: ReportFragment.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0014J\b\u0010\n\u001a\u00020\u000bH\u0014J\b\u0010\f\u001a\u00020\u0007H\u0002J&\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0016J\b\u0010\u0013\u001a\u00020\u000bH\u0016J\b\u0010\u0014\u001a\u00020\u000bH\u0016J\b\u0010\u0015\u001a\u00020\u000bH\u0016J\b\u0010\u0016\u001a\u00020\u0007H\u0016J\b\u0010\u0017\u001a\u00020\u0007H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/glority/android/picturexx/settings/fragment/setting/ReportFragment;", "Lcom/glority/android/picturexx/settings/fragment/setting/BaseFeedbackFragment;", "<init>", "()V", "vm", "Lcom/glority/android/picturexx/settings/vm/FeedbackViewModel;", "doCreateView", "", "savedInstanceState", "Landroid/os/Bundle;", "getLogPageName", "", "addSubscriptions", "onSubmit", "content", "contact", "imageList", "", "Landroid/net/Uri;", "getTitle", "getContentHint", "getContactHint", "onBack", "onDestroy", "Companion", "settings_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class ReportFragment extends BaseFeedbackFragment {
    public static final String FEEDBACK_TAG = "report";
    private FeedbackViewModel vm;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.glority.android.picturexx.settings.fragment.setting.BaseFeedbackFragment, com.glority.android.ui.base.v2.BaseFragment
    public void doCreateView(Bundle savedInstanceState) {
        BaseFragment.logEvent$default(this, SettingsLogEvents.Report_Page, null, 2, null);
        this.vm = (FeedbackViewModel) getViewModel(FeedbackViewModel.class);
        super.doCreateView(savedInstanceState);
        addSubscriptions();
    }

    @Override // com.glority.android.ui.base.v2.BaseFragment
    protected String getLogPageName() {
        return FEEDBACK_TAG;
    }

    private final void addSubscriptions() {
        FeedbackViewModel feedbackViewModel = this.vm;
        if (feedbackViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("vm");
            feedbackViewModel = null;
        }
        feedbackViewModel.getObservable(SendSupportTicketMessage.class).observe(this, new Observer() { // from class: com.glority.android.picturexx.settings.fragment.setting.ReportFragment$$ExternalSyntheticLambda0
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                ReportFragment.addSubscriptions$lambda$0(ReportFragment.this, (Resource) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addSubscriptions$lambda$0(final ReportFragment this$0, Resource resource) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ResponseUtil responseUtil = ResponseUtil.INSTANCE;
        Intrinsics.checkNotNull(resource);
        responseUtil.handleResult(resource, new DefaultResponseHandler<SendSupportTicketMessage>() { // from class: com.glority.android.picturexx.settings.fragment.setting.ReportFragment$addSubscriptions$1$1
            @Override // com.glority.base.utils.data.DefaultResponseHandler, com.glority.base.utils.data.ResponseHandler
            public void success(SendSupportTicketMessage data) {
                super.success((ReportFragment$addSubscriptions$1$1) data);
                ReportFragment.this.hideProgress();
                if (data == null) {
                    return;
                }
                LogUtils.d("SendSupportTicketMessage Requested Successfully!");
                BaseFragment.logEvent$default(ReportFragment.this, SettingsLogEvents.Report_Send_Success, null, 2, null);
                ReportFragment.this.onBack();
            }

            @Override // com.glority.base.utils.data.DefaultResponseHandler, com.glority.base.utils.data.ResponseHandler
            public void error(Throwable e) {
                ReportFragment.this.hideProgress();
                super.error(e);
                Object[] objArr = new Object[2];
                objArr[0] = "SendSupportTicketMessage Requested Failed!";
                objArr[1] = e != null ? e.getMessage() : null;
                LogUtils.e(objArr);
                BaseFragment.logEvent$default(ReportFragment.this, SettingsLogEvents.Report_Send_Failure, null, 2, null);
            }
        });
    }

    @Override // com.glority.android.picturexx.settings.fragment.setting.BaseFeedbackFragment
    public void onSubmit(final String content, final String contact, final List<? extends Uri> imageList) {
        FeedbackViewModel feedbackViewModel;
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(contact, "contact");
        Intrinsics.checkNotNullParameter(imageList, "imageList");
        ReportFragment reportFragment = this;
        BaseFragment.logEvent$default(reportFragment, SettingsLogEvents.Report_Send, null, 2, null);
        BaseFragment.showProgress$default(reportFragment, null, false, 3, null);
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
                AwsFileUploader.INSTANCE.uploadImageFile((String) it2.next(), Scope.SUPPORT.getValue(), new AwsFileUploader.ResultListener() { // from class: com.glority.android.picturexx.settings.fragment.setting.ReportFragment$onSubmit$2$1
                    private final void upload(List<String> urls) {
                        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getMain(), null, new ReportFragment$onSubmit$2$1$upload$1(ReportFragment.this, contact, content, urls, null), 2, null);
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
        FeedbackViewModel feedbackViewModel2 = this.vm;
        if (feedbackViewModel2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("vm");
            feedbackViewModel = null;
        } else {
            feedbackViewModel = feedbackViewModel2;
        }
        feedbackViewModel.submitSupportTicket(contact, SupportType.NORMAL_SUPPORT, content, null, CollectionsKt.arrayListOf(FEEDBACK_TAG));
    }

    @Override // com.glority.android.picturexx.settings.fragment.setting.BaseFeedbackFragment
    public String getTitle() {
        return "Issues & Questions";
    }

    @Override // com.glority.android.picturexx.settings.fragment.setting.BaseFeedbackFragment
    public String getContentHint() {
        String string = ResUtils.getString(R.string.feedback_text_input_content_placeholder);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    @Override // com.glority.android.picturexx.settings.fragment.setting.BaseFeedbackFragment
    public String getContactHint() {
        return "";
    }

    @Override // com.glority.android.picturexx.settings.fragment.setting.BaseFeedbackFragment
    public void onBack() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    @Override // com.glority.android.ui.base.v2.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        BaseFragment.logEvent$default(this, SettingsLogEvents.Report_Close, null, 2, null);
    }
}
