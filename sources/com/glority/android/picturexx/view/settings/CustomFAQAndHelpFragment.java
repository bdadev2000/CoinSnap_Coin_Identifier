package com.glority.android.picturexx.view.settings;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.glority.android.adapterhelper.BaseQuickAdapter;
import com.glority.android.core.ext.ViewExtensionsKt;
import com.glority.android.core.route.agreement.OpenDeleteAccountPageRequest;
import com.glority.android.picturexx.business.R;
import com.glority.android.picturexx.business.databinding.CustomFragmentFaqAndHelpBinding;
import com.glority.android.picturexx.settings.adapter.FaqAndHelpAdapter;
import com.glority.android.picturexx.settings.entity.FAQ;
import com.glority.android.picturexx.settings.entity.QACategory;
import com.glority.android.picturexx.settings.entity.QuestionAndAnswer;
import com.glority.android.picturexx.settings.logevents.SettingsLogEvents;
import com.glority.android.ui.base.ContainerActivity;
import com.glority.base.fragment.BaseFragment;
import com.glority.base.routers.OpenFeedbackFragmentRequest;
import com.glority.utils.stability.LogUtils;
import com.google.android.material.button.MaterialButton;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CustomFAQAndHelpFragment.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0014J\u0012\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0014J\b\u0010\u000b\u001a\u00020\bH\u0002J\b\u0010\f\u001a\u00020\bH\u0002J\b\u0010\r\u001a\u00020\bH\u0002J\u0010\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\b\u0010\u0011\u001a\u00020\bH\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0014J\b\u0010\u0014\u001a\u00020\u0010H\u0002¨\u0006\u0016"}, d2 = {"Lcom/glority/android/picturexx/view/settings/CustomFAQAndHelpFragment;", "Lcom/glority/base/fragment/BaseFragment;", "Lcom/glority/android/picturexx/business/databinding/CustomFragmentFaqAndHelpBinding;", "<init>", "()V", "getLayoutId", "", "doCreateView", "", "savedInstanceState", "Landroid/os/Bundle;", "initToolbar", "initListener", "initView", "renderFAQ", "faqs", "Lcom/glority/android/picturexx/settings/entity/FAQ;", "onDestroy", "getLogPageName", "", "makeData", "Companion", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class CustomFAQAndHelpFragment extends BaseFragment<CustomFragmentFaqAndHelpBinding> {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* compiled from: CustomFAQAndHelpFragment.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/glority/android/picturexx/view/settings/CustomFAQAndHelpFragment$Companion;", "", "<init>", "()V", "open", "", "context", "Landroid/content/Context;", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final void open(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            ContainerActivity.INSTANCE.open(CustomFAQAndHelpFragment.class).launch(context);
        }
    }

    @Override // com.glority.base.fragment.BaseFragment
    protected int getLayoutId() {
        return R.layout.custom_fragment_faq_and_help;
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
        ((CustomFragmentFaqAndHelpBinding) getBinding()).naviBar.toolbar.setTitle(R.string.faq_help_text_title);
        ((CustomFragmentFaqAndHelpBinding) getBinding()).naviBar.toolbar.setNavigationIcon(R.drawable.arrow_back_black);
        ((CustomFragmentFaqAndHelpBinding) getBinding()).naviBar.toolbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: com.glority.android.picturexx.view.settings.CustomFAQAndHelpFragment$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CustomFAQAndHelpFragment.initToolbar$lambda$0(CustomFAQAndHelpFragment.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initToolbar$lambda$0(CustomFAQAndHelpFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        FragmentActivity activity = this$0.getActivity();
        if (activity != null) {
            activity.onBackPressed();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initListener() {
        MaterialButton btnContactUs = ((CustomFragmentFaqAndHelpBinding) getBinding()).btnContactUs;
        Intrinsics.checkNotNullExpressionValue(btnContactUs, "btnContactUs");
        ViewExtensionsKt.setSingleClickListener$default(btnContactUs, 0L, new Function1<View, Unit>() { // from class: com.glority.android.picturexx.view.settings.CustomFAQAndHelpFragment$initListener$1
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
                com.glority.android.ui.base.v2.BaseFragment.logEvent$default(CustomFAQAndHelpFragment.this, SettingsLogEvents.FAQ_And_Help_Contact_Us, null, 2, null);
                new OpenFeedbackFragmentRequest("", OpenFeedbackFragmentRequest.Tag.ISSUES).post();
            }
        }, 1, (Object) null);
    }

    private final void initView() {
        renderFAQ(makeData());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void renderFAQ(FAQ faqs) {
        if (getContext() != null) {
            LogUtils.d("start rendering FAQ...");
            Context requireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
            FaqAndHelpAdapter faqAndHelpAdapter = new FaqAndHelpAdapter(requireContext);
            ((CustomFragmentFaqAndHelpBinding) getBinding()).rvFaq.setLayoutManager(new LinearLayoutManager(getContext()));
            RecyclerView rvFaq = ((CustomFragmentFaqAndHelpBinding) getBinding()).rvFaq;
            Intrinsics.checkNotNullExpressionValue(rvFaq, "rvFaq");
            faqAndHelpAdapter.bindToRecyclerView(rvFaq);
            View inflate = LayoutInflater.from(getContext()).inflate(R.layout.layout_faq_and_help_upper_banner, (ViewGroup) null);
            ((TextView) inflate.findViewById(R.id.tv_faq_title)).setText(getString(R.string.faq_managing_your_tittle));
            View inflate2 = LayoutInflater.from(getContext()).inflate(R.layout.item_custom_empty_foot_view, (ViewGroup) null);
            FaqAndHelpAdapter faqAndHelpAdapter2 = faqAndHelpAdapter;
            Intrinsics.checkNotNull(inflate);
            BaseQuickAdapter.addHeaderView$default(faqAndHelpAdapter2, inflate, 0, 0, 6, null);
            Intrinsics.checkNotNull(inflate2);
            BaseQuickAdapter.addFooterView$default(faqAndHelpAdapter2, inflate2, 0, 0, 6, null);
            faqAndHelpAdapter.setNewData(FaqAndHelpAdapter.INSTANCE.convert(faqs.getFaqs()));
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

    private final FAQ makeData() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(Integer.valueOf(R.string.faq_managing_your_account), CollectionsKt.listOf((Object[]) new Pair[]{new Pair(Integer.valueOf(R.string.faq_how_to_restore), Integer.valueOf(R.string.faq_how_to_restore_answer)), new Pair(Integer.valueOf(R.string.faq_delete_account), Integer.valueOf(R.string.data_management_text_delete_account_tip))}));
        linkedHashMap.put(Integer.valueOf(R.string.faq_using_coinsnap), CollectionsKt.listOf((Object[]) new Pair[]{new Pair(Integer.valueOf(R.string.faq_share_identification), Integer.valueOf(R.string.faq_share_identification_answer)), new Pair(Integer.valueOf(R.string.faq_save_photos), Integer.valueOf(R.string.faq_save_photos_answer))}));
        linkedHashMap.put(Integer.valueOf(R.string.faq_subscription), CollectionsKt.listOf((Object[]) new Pair[]{new Pair(Integer.valueOf(R.string.faq_privileges_offer), Integer.valueOf(R.string.faq_privileges_offer_answer)), new Pair(Integer.valueOf(R.string.faq_check_premium), Integer.valueOf(R.string.faq_check_premium_answer)), new Pair(Integer.valueOf(R.string.faq_change_method), Integer.valueOf(R.string.faq_change_method_answer)), new Pair(Integer.valueOf(R.string.faq_turn_off_sub), Integer.valueOf(R.string.faq_turn_off_sub_answer))}));
        linkedHashMap.put(Integer.valueOf(R.string.faq_others), CollectionsKt.listOf((Object[]) new Pair[]{new Pair(Integer.valueOf(R.string.faq_about_function), Integer.valueOf(R.string.faq_about_function_answer)), new Pair(Integer.valueOf(R.string.faq_info_safe), Integer.valueOf(R.string.faq_info_safe_answer))}));
        FAQ faq = new FAQ();
        faq.setTitle(getString(R.string.faq_managing_your_tittle));
        faq.setProdColor("#000000");
        LinkedHashMap linkedHashMap2 = linkedHashMap;
        ArrayList arrayList = new ArrayList(linkedHashMap2.size());
        for (Map.Entry entry : linkedHashMap2.entrySet()) {
            QACategory qACategory = new QACategory();
            qACategory.setCategoryName(getString(((Number) entry.getKey()).intValue()));
            Iterable<Pair> iterable = (Iterable) entry.getValue();
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
            for (Pair pair : iterable) {
                QuestionAndAnswer questionAndAnswer = new QuestionAndAnswer();
                questionAndAnswer.setAppInvisible(false);
                questionAndAnswer.setQuestion(getString(((Number) pair.getFirst()).intValue()));
                questionAndAnswer.setAnswer(getString(((Number) pair.getSecond()).intValue()));
                if (((Number) pair.getFirst()).intValue() == R.string.faq_delete_account) {
                    questionAndAnswer.setClickMethod(new Function0<Unit>() { // from class: com.glority.android.picturexx.view.settings.CustomFAQAndHelpFragment$makeData$1$1$1$1$1$1
                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            new OpenDeleteAccountPageRequest().post();
                        }
                    });
                }
                arrayList2.add(questionAndAnswer);
            }
            qACategory.setQaList(CollectionsKt.toMutableList((Collection) arrayList2));
            arrayList.add(qACategory);
        }
        faq.setFaqs(CollectionsKt.toMutableList((Collection) arrayList));
        return faq;
    }
}
