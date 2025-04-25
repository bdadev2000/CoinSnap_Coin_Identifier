package com.glority.android.picturexx.settings.fragment.setting;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.glority.android.adapterhelper.BaseQuickAdapter;
import com.glority.android.core.ext.ViewExtensionsKt;
import com.glority.android.picturexx.settings.R;
import com.glority.android.picturexx.settings.adapter.FaqAndHelpAdapter;
import com.glority.android.picturexx.settings.databinding.FragmentFaqAndHelpBinding;
import com.glority.android.picturexx.settings.entity.FAQ;
import com.glority.android.picturexx.settings.fragment.setting.FAQAndHelpFragment;
import com.glority.android.picturexx.settings.logevents.SettingsLogEvents;
import com.glority.android.ui.base.LocaleManager;
import com.glority.base.config.ConfigConstants;
import com.glority.base.fragment.BaseFragment;
import com.glority.base.routers.OpenFeedbackFragmentRequest;
import com.glority.utils.stability.LogUtils;
import com.glority.utils.store.IOUtils;
import com.google.firebase.perf.FirebasePerformance;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Charsets;
import org.json.JSONObject;

/* compiled from: FAQAndHelpFragment.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0014J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0014J\b\u0010\r\u001a\u00020\nH\u0002J\b\u0010\u000e\u001a\u00020\nH\u0002J\b\u0010\u000f\u001a\u00020\nH\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0002J\u0010\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\b\u0010\u0015\u001a\u00020\nH\u0016J\b\u0010\u0016\u001a\u00020\u0011H\u0014R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/glority/android/picturexx/settings/fragment/setting/FAQAndHelpFragment;", "Lcom/glority/base/fragment/BaseFragment;", "Lcom/glority/android/picturexx/settings/databinding/FragmentFaqAndHelpBinding;", "<init>", "()V", "getLayoutId", "", "handler", "Landroid/os/Handler;", "doCreateView", "", "savedInstanceState", "Landroid/os/Bundle;", "initToolbar", "initListener", "initView", "getFAQJsonLink", "", "renderFAQ", "faqs", "Lcom/glority/android/picturexx/settings/entity/FAQ;", "onDestroy", "getLogPageName", "GetAndParseJson", "settings_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class FAQAndHelpFragment extends BaseFragment<FragmentFaqAndHelpBinding> {
    private final Handler handler;

    public FAQAndHelpFragment() {
        final Looper mainLooper = Looper.getMainLooper();
        this.handler = new Handler(mainLooper) { // from class: com.glority.android.picturexx.settings.fragment.setting.FAQAndHelpFragment$handler$1
            @Override // android.os.Handler
            public void handleMessage(Message msg) {
                Intrinsics.checkNotNullParameter(msg, "msg");
                if (msg.what == 1) {
                    Object obj = msg.obj;
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.glority.android.picturexx.settings.entity.FAQ");
                    FAQAndHelpFragment.this.renderFAQ((FAQ) obj);
                }
            }
        };
    }

    @Override // com.glority.base.fragment.BaseFragment
    protected int getLayoutId() {
        return R.layout.fragment_faq_and_help;
    }

    @Override // com.glority.android.ui.base.v2.BaseFragment
    protected void doCreateView(Bundle savedInstanceState) {
        com.glority.android.ui.base.v2.BaseFragment.logEvent$default(this, SettingsLogEvents.FAQ_And_Help, null, 2, null);
        initToolbar();
        initView();
        initListener();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initToolbar() {
        ((FragmentFaqAndHelpBinding) getBinding()).naviBar.toolbar.setTitle(R.string.faq_help_text_title);
        ((FragmentFaqAndHelpBinding) getBinding()).naviBar.toolbar.setNavigationIcon(R.drawable.arrow_back_black);
        ((FragmentFaqAndHelpBinding) getBinding()).naviBar.toolbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: com.glority.android.picturexx.settings.fragment.setting.FAQAndHelpFragment$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FAQAndHelpFragment.initToolbar$lambda$0(FAQAndHelpFragment.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initToolbar$lambda$0(FAQAndHelpFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ViewExtensionsKt.navigateUp(this$0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initListener() {
        Button btnContactUs = ((FragmentFaqAndHelpBinding) getBinding()).btnContactUs;
        Intrinsics.checkNotNullExpressionValue(btnContactUs, "btnContactUs");
        ViewExtensionsKt.setSingleClickListener$default(btnContactUs, 0L, new Function1<View, Unit>() { // from class: com.glority.android.picturexx.settings.fragment.setting.FAQAndHelpFragment$initListener$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(View it) {
                Intrinsics.checkNotNullParameter(it, "it");
                com.glority.android.ui.base.v2.BaseFragment.logEvent$default(FAQAndHelpFragment.this, SettingsLogEvents.FAQ_And_Help_Contact_Us, null, 2, null);
                new OpenFeedbackFragmentRequest("", OpenFeedbackFragmentRequest.Tag.ISSUES).post();
            }
        }, 1, (Object) null);
    }

    private final void initView() {
        GetAndParseJson getAndParseJson = new GetAndParseJson(this.handler);
        String fAQJsonLink = getFAQJsonLink();
        LogUtils.d("FAQ and Help json file link: ", fAQJsonLink);
        getAndParseJson.getFAQJson(fAQJsonLink);
    }

    private final String getFAQJsonLink() {
        String language = LocaleManager.getInstance().getLanguage();
        if (Intrinsics.areEqual(language, "zh") && !Intrinsics.areEqual(LocaleManager.getInstance().getCountry(), "CN")) {
            language = language + "-Hant";
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format(ConfigConstants.INSTANCE.getFAQ_JSON_LINK(), Arrays.copyOf(new Object[]{language}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void renderFAQ(FAQ faqs) {
        if (getContext() != null) {
            LogUtils.d("start rendering FAQ...");
            Context context = getContext();
            Intrinsics.checkNotNull(context);
            FaqAndHelpAdapter faqAndHelpAdapter = new FaqAndHelpAdapter(context);
            ((FragmentFaqAndHelpBinding) getBinding()).rvFaq.setLayoutManager(new LinearLayoutManager(getContext()));
            RecyclerView rvFaq = ((FragmentFaqAndHelpBinding) getBinding()).rvFaq;
            Intrinsics.checkNotNullExpressionValue(rvFaq, "rvFaq");
            faqAndHelpAdapter.bindToRecyclerView(rvFaq);
            View inflate = LayoutInflater.from(getContext()).inflate(R.layout.layout_faq_and_help_upper_banner, (ViewGroup) null);
            Intrinsics.checkNotNull(inflate);
            BaseQuickAdapter.addHeaderView$default(faqAndHelpAdapter, inflate, 0, 0, 6, null);
            faqAndHelpAdapter.setNewData(FaqAndHelpAdapter.INSTANCE.convert(faqs.getFaqs()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: FAQAndHelpFragment.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0002\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\r"}, d2 = {"Lcom/glority/android/picturexx/settings/fragment/setting/FAQAndHelpFragment$GetAndParseJson;", "", "handler", "Landroid/os/Handler;", "<init>", "(Landroid/os/Handler;)V", "getHandler", "()Landroid/os/Handler;", "getFAQJson", "", "url", "", "Companion", "settings_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes5.dex */
    public static final class GetAndParseJson {
        public static final int ARG_SUCCESS = 1;
        private final Handler handler;

        public GetAndParseJson(Handler handler) {
            Intrinsics.checkNotNullParameter(handler, "handler");
            this.handler = handler;
        }

        public final Handler getHandler() {
            return this.handler;
        }

        public final void getFAQJson(final String url) {
            Intrinsics.checkNotNullParameter(url, "url");
            new Thread(new Runnable() { // from class: com.glority.android.picturexx.settings.fragment.setting.FAQAndHelpFragment$GetAndParseJson$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    FAQAndHelpFragment.GetAndParseJson.getFAQJson$lambda$1(url, this);
                }
            }).start();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void getFAQJson$lambda$1(String url, GetAndParseJson this$0) {
            Intrinsics.checkNotNullParameter(url, "$url");
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            try {
                URLConnection openConnection = new URL(url).openConnection();
                Intrinsics.checkNotNull(openConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
                HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
                httpURLConnection.setConnectTimeout(3000);
                httpURLConnection.setRequestMethod(FirebasePerformance.HttpMethod.GET);
                if (httpURLConnection.getResponseCode() == 200) {
                    byte[] is2Bytes = IOUtils.is2Bytes(httpURLConnection.getInputStream());
                    Intrinsics.checkNotNullExpressionValue(is2Bytes, "is2Bytes(...)");
                    FAQ faq = new FAQ(new JSONObject(new String(is2Bytes, Charsets.UTF_8)));
                    Message message = new Message();
                    message.what = 1;
                    message.obj = faq;
                    this$0.handler.sendMessage(message);
                    LogUtils.d("Json File Downloaded successfully");
                }
            } catch (Exception e) {
                LogUtils.e("Json File Downloaded Failure", "Cannot render this page!");
                e.printStackTrace();
            }
        }
    }

    @Override // com.glority.android.ui.base.v2.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        com.glority.android.ui.base.v2.BaseFragment.logEvent$default(this, SettingsLogEvents.FAQ_And_Help_Close, null, 2, null);
    }

    @Override // com.glority.android.ui.base.v2.BaseFragment
    /* renamed from: getLogPageName */
    protected String getPageName() {
        String lowerCase = "FAQAndHelp".toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }
}
