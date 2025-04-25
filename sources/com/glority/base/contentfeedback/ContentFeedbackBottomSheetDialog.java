package com.glority.base.contentfeedback;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentManager;
import androidx.navigation.compose.DialogNavigator;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.glority.android.adapterhelper.BaseQuickAdapter;
import com.glority.android.adapterhelper.BaseViewHolder;
import com.glority.android.core.app.AppContext;
import com.glority.android.core.data.LogEventArguments;
import com.glority.android.xx.constants.LogEvents;
import com.glority.base.R;
import com.glority.base.contentfeedback.ContentFeedbackBottomSheetDialog;
import com.glority.base.contentfeedback.item.AbsContentFeedbackPage;
import com.glority.base.contentfeedback.item.ContentFeedbackControl;
import com.glority.base.contentfeedback.item.ContentFeedbackEditContentPage;
import com.glority.base.contentfeedback.item.ContentFeedbackSelectPage;
import com.glority.base.contentfeedback.item.ContentFeedbackTextItem;
import com.glority.base.databinding.ItemContentFeedbackEditBinding;
import com.glority.base.databinding.ItemContentFeedbackTextBinding;
import com.glority.base.dialog.BaseBottomSheetFragment;
import com.glority.utils.stability.LogUtils;
import com.glority.utils.ui.ToastUtils;
import com.glority.utils.ui.ViewUtils;
import com.glority.widget.GlDividerView;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;

/* compiled from: ContentFeedbackBottomSheetDialog.kt */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 ;2\u00020\u0001:\u0002;<B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J6\u0010!\u001a\u00020\u001c2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007J\b\u0010\"\u001a\u00020\u0014H\u0016J\u0010\u0010#\u001a\u00020\u001c2\u0006\u0010$\u001a\u00020%H\u0016J\b\u0010&\u001a\u00020\tH\u0014J \u0010'\u001a\u00020\u001c2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u0012H\u0002J\u0010\u0010-\u001a\u00020\u001c2\u0006\u0010.\u001a\u00020/H\u0016J\u0018\u00100\u001a\u00020\u001c2\u0006\u00101\u001a\u00020\u000e2\u0006\u0010,\u001a\u00020\u0012H\u0002J \u00102\u001a\u00020\u001c2\u0006\u0010(\u001a\u0002032\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u0012H\u0002J\u001a\u00104\u001a\u00020\u001c2\u0006\u00105\u001a\u00020\t2\b\u00106\u001a\u0004\u0018\u00010\tH\u0002J\u0017\u00107\u001a\u00020\t2\b\u00108\u001a\u0004\u0018\u00010\u0014H\u0002¢\u0006\u0002\u00109J\u001a\u0010:\u001a\u00020\u001c2\u0006\u00105\u001a\u00020\t2\b\u00106\u001a\u0004\u0018\u00010\tH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tX\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u000f\u001a\u00060\u0010R\u00020\u0000X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.¢\u0006\u0002\n\u0000R\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R7\u0010\u0018\u001a\u001f\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u001a\u0012\b\b\u000b\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006="}, d2 = {"Lcom/glority/base/contentfeedback/ContentFeedbackBottomSheetDialog;", "Lcom/glority/base/dialog/BaseBottomSheetFragment;", "<init>", "()V", "contentFeedbackControl", "Lcom/glority/base/contentfeedback/item/ContentFeedbackControl;", "otherEventsParma", "Landroid/os/Bundle;", "target", "", "group", "name", "from", "contentFeedbackPage", "Lcom/glority/base/contentfeedback/item/AbsContentFeedbackPage;", "adapter", "Lcom/glority/base/contentfeedback/ContentFeedbackBottomSheetDialog$ContentFeedbackAdapter;", "vp2", "Landroidx/viewpager2/widget/ViewPager2;", "clickTextRes", "", "Ljava/lang/Integer;", "sended", "", "onclose", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "status", "", "getOnclose", "()Lkotlin/jvm/functions/Function1;", "setOnclose", "(Lkotlin/jvm/functions/Function1;)V", "initData", "layoutResId", "initView", "rootView", "Landroid/view/View;", "getLogPageName", "initSelectPageView", "data", "Lcom/glority/base/contentfeedback/item/ContentFeedbackSelectPage;", TtmlNode.RUBY_CONTAINER, "Landroid/widget/LinearLayout;", "viewPager2", "onDismiss", DialogNavigator.NAME, "Landroid/content/DialogInterface;", "toNextPage", "absContentFeedbackPage", "initEditPageView", "Lcom/glority/base/contentfeedback/item/ContentFeedbackEditContentPage;", "feedbackLogEvent", "clickName", "content", "getEnText", "textRes", "(Ljava/lang/Integer;)Ljava/lang/String;", "sendFeedback", "Companion", "ContentFeedbackAdapter", "base_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes6.dex */
public final class ContentFeedbackBottomSheetDialog extends BaseBottomSheetFragment {
    private final ContentFeedbackAdapter adapter = new ContentFeedbackAdapter();
    private Integer clickTextRes;
    private ContentFeedbackControl contentFeedbackControl;
    private AbsContentFeedbackPage contentFeedbackPage;
    private String from;
    private String group;
    private String name;
    private Function1<? super String, Unit> onclose;
    private Bundle otherEventsParma;
    private boolean sended;
    private String target;
    private ViewPager2 vp2;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: ContentFeedbackBottomSheetDialog.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J>\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0010¨\u0006\u0011"}, d2 = {"Lcom/glority/base/contentfeedback/ContentFeedbackBottomSheetDialog$Companion;", "", "<init>", "()V", "open", "Lcom/glority/base/contentfeedback/ContentFeedbackBottomSheetDialog;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "contentFeedbackControl", "Lcom/glority/base/contentfeedback/item/ContentFeedbackControl;", "from", "", "name", "group", "target", "otherEventsParma", "Landroid/os/Bundle;", "base_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final ContentFeedbackBottomSheetDialog open(FragmentManager fragmentManager, ContentFeedbackControl contentFeedbackControl, String from, String name, String group, String target, Bundle otherEventsParma) {
            Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
            Intrinsics.checkNotNullParameter(contentFeedbackControl, "contentFeedbackControl");
            Intrinsics.checkNotNullParameter(from, "from");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(group, "group");
            Intrinsics.checkNotNullParameter(target, "target");
            Intrinsics.checkNotNullParameter(otherEventsParma, "otherEventsParma");
            ContentFeedbackBottomSheetDialog contentFeedbackBottomSheetDialog = new ContentFeedbackBottomSheetDialog();
            contentFeedbackBottomSheetDialog.initData(contentFeedbackControl, from, name, group, target, otherEventsParma);
            try {
                Integer.valueOf(fragmentManager.beginTransaction().add(contentFeedbackBottomSheetDialog, "ContentFeedbackBottomSheetDialog").commitAllowingStateLoss());
            } catch (Exception e) {
                if (AppContext.INSTANCE.isDebugMode()) {
                    LogUtils.e(Log.getStackTraceString(e));
                }
            }
            return contentFeedbackBottomSheetDialog;
        }
    }

    public final Function1<String, Unit> getOnclose() {
        return this.onclose;
    }

    public final void setOnclose(Function1<? super String, Unit> function1) {
        this.onclose = function1;
    }

    public final void initData(ContentFeedbackControl contentFeedbackControl, String from, String name, String group, String target, Bundle otherEventsParma) {
        Intrinsics.checkNotNullParameter(contentFeedbackControl, "contentFeedbackControl");
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(group, "group");
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(otherEventsParma, "otherEventsParma");
        this.contentFeedbackPage = contentFeedbackControl.getFirstPage();
        this.contentFeedbackControl = contentFeedbackControl;
        this.from = from;
        this.name = name;
        this.group = group;
        this.target = target;
        this.otherEventsParma = otherEventsParma;
        updateCommonEventArgs(TuplesKt.to("from", from), TuplesKt.to("name", name), TuplesKt.to("group", group), TuplesKt.to("target", target));
        Set<String> keySet = otherEventsParma.keySet();
        Intrinsics.checkNotNullExpressionValue(keySet, "keySet(...)");
        for (String str : keySet) {
            updateCommonEventArgs(TuplesKt.to(str, otherEventsParma.get(str)));
        }
    }

    @Override // com.glority.base.dialog.BaseBottomSheetFragment
    public int layoutResId() {
        return R.layout.dialog_content_feedback;
    }

    @Override // com.glority.base.dialog.BaseBottomSheetFragment
    public void initView(View rootView) {
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        ViewPager2 viewPager2 = (ViewPager2) rootView.findViewById(R.id.vp2);
        this.vp2 = viewPager2;
        ViewPager2 viewPager22 = null;
        if (viewPager2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("vp2");
            viewPager2 = null;
        }
        viewPager2.setUserInputEnabled(false);
        AbsContentFeedbackPage absContentFeedbackPage = this.contentFeedbackPage;
        if (absContentFeedbackPage != null) {
            this.adapter.setNewData(CollectionsKt.mutableListOf(absContentFeedbackPage));
        }
        ViewPager2 viewPager23 = this.vp2;
        if (viewPager23 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("vp2");
        } else {
            viewPager22 = viewPager23;
        }
        viewPager22.setAdapter(this.adapter);
        this.adapter.setOnItemChildClickListener(new Function3<BaseQuickAdapter<?, ?>, View, Integer, Unit>() { // from class: com.glority.base.contentfeedback.ContentFeedbackBottomSheetDialog$initView$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(BaseQuickAdapter<?, ?> baseQuickAdapter, View view, Integer num) {
                invoke(baseQuickAdapter, view, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(BaseQuickAdapter<?, ?> adapter, View view, int i) {
                ContentFeedbackBottomSheetDialog.ContentFeedbackAdapter contentFeedbackAdapter;
                ContentFeedbackBottomSheetDialog.ContentFeedbackAdapter contentFeedbackAdapter2;
                Intrinsics.checkNotNullParameter(adapter, "adapter");
                Intrinsics.checkNotNullParameter(view, "view");
                if (view.getId() == R.id.back_iv) {
                    ViewPager2 viewPager24 = ContentFeedbackBottomSheetDialog.this.vp2;
                    if (viewPager24 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("vp2");
                        viewPager24 = null;
                    }
                    viewPager24.setCurrentItem(i - 1, true);
                    contentFeedbackAdapter = ContentFeedbackBottomSheetDialog.this.adapter;
                    List<AbsContentFeedbackPage> data = contentFeedbackAdapter.getData();
                    Intrinsics.checkNotNull(data, "null cannot be cast to non-null type kotlin.collections.MutableList<com.glority.base.contentfeedback.item.AbsContentFeedbackPage>");
                    List asMutableList = TypeIntrinsics.asMutableList(data);
                    contentFeedbackAdapter2 = ContentFeedbackBottomSheetDialog.this.adapter;
                    asMutableList.remove(contentFeedbackAdapter2.getData().get(i));
                    BaseBottomSheetFragment.logEvent$default(ContentFeedbackBottomSheetDialog.this, "feedbackcontent_back_click", null, 2, null);
                }
            }
        });
    }

    @Override // com.glority.base.dialog.BaseBottomSheetFragment
    protected String getLogPageName() {
        return "feedbackcontent";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void initSelectPageView(ContentFeedbackSelectPage data, LinearLayout container, final ViewPager2 viewPager2) {
        for (final ContentFeedbackTextItem contentFeedbackTextItem : data.getList()) {
            ItemContentFeedbackTextBinding inflate = ItemContentFeedbackTextBinding.inflate(getLayoutInflater());
            Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
            ImageView arrowIv = inflate.arrowIv;
            Intrinsics.checkNotNullExpressionValue(arrowIv, "arrowIv");
            arrowIv.setVisibility(contentFeedbackTextItem.getNextPage() != null ? 0 : 8);
            ImageView iconIv = inflate.iconIv;
            Intrinsics.checkNotNullExpressionValue(iconIv, "iconIv");
            iconIv.setVisibility(contentFeedbackTextItem.getIconRes() != null ? 0 : 8);
            Integer iconRes = contentFeedbackTextItem.getIconRes();
            if (iconRes != null) {
                inflate.iconIv.setImageResource(iconRes.intValue());
            }
            GlDividerView dividerV = inflate.dividerV;
            Intrinsics.checkNotNullExpressionValue(dividerV, "dividerV");
            dividerV.setVisibility(contentFeedbackTextItem.getShowDivider() ? 0 : 8);
            TextView infoTv = inflate.infoTv;
            Intrinsics.checkNotNullExpressionValue(infoTv, "infoTv");
            infoTv.setVisibility(contentFeedbackTextItem.getTextInfoRes() != null ? 0 : 8);
            Integer textInfoRes = contentFeedbackTextItem.getTextInfoRes();
            if (textInfoRes != null) {
                inflate.infoTv.setText(textInfoRes.intValue());
            }
            inflate.titleTv.setText(contentFeedbackTextItem.getTextRes());
            inflate.getRoot().setOnClickListener(new View.OnClickListener() { // from class: com.glority.base.contentfeedback.ContentFeedbackBottomSheetDialog$$ExternalSyntheticLambda2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ContentFeedbackBottomSheetDialog.initSelectPageView$lambda$4(ContentFeedbackBottomSheetDialog.this, contentFeedbackTextItem, viewPager2, view);
                }
            });
            container.addView(inflate.getRoot());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initSelectPageView$lambda$4(ContentFeedbackBottomSheetDialog this$0, ContentFeedbackTextItem contentFeedbackTextItem, ViewPager2 viewPager2, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(contentFeedbackTextItem, "$contentFeedbackTextItem");
        Intrinsics.checkNotNullParameter(viewPager2, "$viewPager2");
        this$0.clickTextRes = Integer.valueOf(contentFeedbackTextItem.getTextRes());
        if (contentFeedbackTextItem.getNextPage() != null) {
            contentFeedbackTextItem.getNextPage().setShowBackButton(true);
            this$0.toNextPage(contentFeedbackTextItem.getNextPage(), viewPager2);
        } else {
            this$0.sendFeedback(this$0.getEnText(Integer.valueOf(contentFeedbackTextItem.getTextRes())), null);
        }
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialog) {
        Function1<? super String, Unit> function1;
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        super.onDismiss(dialog);
        if (this.sended || (function1 = this.onclose) == null) {
            return;
        }
        function1.invoke("cancelled");
    }

    private final void toNextPage(AbsContentFeedbackPage absContentFeedbackPage, ViewPager2 viewPager2) {
        RecyclerView.Adapter adapter = viewPager2.getAdapter();
        Intrinsics.checkNotNull(adapter, "null cannot be cast to non-null type com.glority.base.contentfeedback.ContentFeedbackBottomSheetDialog.ContentFeedbackAdapter");
        ContentFeedbackAdapter contentFeedbackAdapter = (ContentFeedbackAdapter) adapter;
        contentFeedbackAdapter.addData((ContentFeedbackAdapter) absContentFeedbackPage);
        viewPager2.setCurrentItem(contentFeedbackAdapter.getData().size(), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void initEditPageView(final ContentFeedbackEditContentPage data, LinearLayout container, final ViewPager2 viewPager2) {
        final ItemContentFeedbackEditBinding inflate = ItemContentFeedbackEditBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        EditText notesEt = inflate.notesEt;
        Intrinsics.checkNotNullExpressionValue(notesEt, "notesEt");
        notesEt.addTextChangedListener(new TextWatcher() { // from class: com.glority.base.contentfeedback.ContentFeedbackBottomSheetDialog$initEditPageView$$inlined$doAfterTextChanged$1
            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence text, int start, int count, int after) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence text, int start, int before, int count) {
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable s) {
                String obj;
                ItemContentFeedbackEditBinding.this.submitBt.setEnabled((s == null || (obj = s.toString()) == null || obj.length() <= 0) ? false : true);
            }
        });
        inflate.submitBt.setText(data.getSubmitTextRes());
        Integer editHintRes = data.getEditHintRes();
        if (editHintRes != null) {
            inflate.notesEt.setHint(editHintRes.intValue());
        }
        inflate.submitBt.setOnClickListener(new View.OnClickListener() { // from class: com.glority.base.contentfeedback.ContentFeedbackBottomSheetDialog$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ContentFeedbackBottomSheetDialog.initEditPageView$lambda$7(ContentFeedbackEditContentPage.this, this, inflate, viewPager2, view);
            }
        });
        container.addView(inflate.getRoot());
        inflate.notesEt.postDelayed(new Runnable() { // from class: com.glority.base.contentfeedback.ContentFeedbackBottomSheetDialog$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                ContentFeedbackBottomSheetDialog.initEditPageView$lambda$8(ItemContentFeedbackEditBinding.this);
            }
        }, 100L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initEditPageView$lambda$7(ContentFeedbackEditContentPage data, ContentFeedbackBottomSheetDialog this$0, ItemContentFeedbackEditBinding binding, ViewPager2 viewPager2, View view) {
        Intrinsics.checkNotNullParameter(data, "$data");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(binding, "$binding");
        Intrinsics.checkNotNullParameter(viewPager2, "$viewPager2");
        if (data.getNextPage() == null) {
            this$0.sendFeedback(this$0.getEnText(this$0.clickTextRes), binding.notesEt.getText().toString());
        } else {
            this$0.toNextPage(data.getNextPage(), viewPager2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initEditPageView$lambda$8(ItemContentFeedbackEditBinding binding) {
        Intrinsics.checkNotNullParameter(binding, "$binding");
        binding.notesEt.requestFocus();
        ViewUtils.showSoftInput(binding.notesEt);
        binding.getRoot().requestLayout();
    }

    private final void feedbackLogEvent(String clickName, String content) {
        Bundle bundleOf = BundleKt.bundleOf(TuplesKt.to(LogEventArguments.ARG_STRING_1, clickName));
        if (content != null) {
            bundleOf.putString("content", content);
        }
        logEvent(LogEvents.feedbackcontent_submit_click, bundleOf);
    }

    private final String getEnText(Integer textRes) {
        Context createConfigurationContext;
        String string;
        if (textRes == null) {
            return "";
        }
        textRes.intValue();
        Configuration configuration = new Configuration(getResources().getConfiguration());
        configuration.setLocale(Locale.US);
        Context context = getContext();
        return (context == null || (createConfigurationContext = context.createConfigurationContext(configuration)) == null || (string = createConfigurationContext.getString(textRes.intValue())) == null) ? "" : string;
    }

    private final void sendFeedback(String clickName, String content) {
        this.sended = true;
        Function1<? super String, Unit> function1 = this.onclose;
        if (function1 != null) {
            function1.invoke("success");
        }
        ContentFeedbackControl contentFeedbackControl = this.contentFeedbackControl;
        if (contentFeedbackControl == null) {
            Intrinsics.throwUninitializedPropertyAccessException("contentFeedbackControl");
            contentFeedbackControl = null;
        }
        ToastUtils.showSuccess(contentFeedbackControl.getFeedbackSuccessToastTextRes(), new Object[0]);
        feedbackLogEvent(clickName, content);
        close(true);
    }

    /* compiled from: ContentFeedbackBottomSheetDialog.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0002H\u0014¨\u0006\n"}, d2 = {"Lcom/glority/base/contentfeedback/ContentFeedbackBottomSheetDialog$ContentFeedbackAdapter;", "Lcom/glority/android/adapterhelper/BaseQuickAdapter;", "Lcom/glority/base/contentfeedback/item/AbsContentFeedbackPage;", "Lcom/glority/android/adapterhelper/BaseViewHolder;", "<init>", "(Lcom/glority/base/contentfeedback/ContentFeedbackBottomSheetDialog;)V", "convert", "", "helper", "item", "base_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes6.dex */
    public final class ContentFeedbackAdapter extends BaseQuickAdapter<AbsContentFeedbackPage, BaseViewHolder> {
        public ContentFeedbackAdapter() {
            super(R.layout.item_content_feedback_layout, null, 2, null);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.glority.android.adapterhelper.BaseQuickAdapter
        public void convert(BaseViewHolder helper, AbsContentFeedbackPage item) {
            Intrinsics.checkNotNullParameter(helper, "helper");
            Intrinsics.checkNotNullParameter(item, "item");
            helper.getView(R.id.bg_ll).setBackground(item.getBackgroundDrawable());
            LinearLayout linearLayout = (LinearLayout) helper.getView(R.id.container_ll);
            helper.getView(R.id.back_iv).setVisibility(item.getShowBackButton() ? 0 : 8);
            helper.addOnClickListener(R.id.back_iv);
            linearLayout.removeAllViews();
            helper.getView(R.id.title_ll).setVisibility(item.getTitleRes() != null ? 0 : 8);
            Integer titleRes = item.getTitleRes();
            if (titleRes != null) {
                helper.setText(R.id.title_tv, titleRes.intValue());
            }
            ViewPager2 viewPager2 = null;
            if (item instanceof ContentFeedbackSelectPage) {
                ContentFeedbackBottomSheetDialog contentFeedbackBottomSheetDialog = ContentFeedbackBottomSheetDialog.this;
                ContentFeedbackSelectPage contentFeedbackSelectPage = (ContentFeedbackSelectPage) item;
                ViewPager2 viewPager22 = contentFeedbackBottomSheetDialog.vp2;
                if (viewPager22 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("vp2");
                } else {
                    viewPager2 = viewPager22;
                }
                contentFeedbackBottomSheetDialog.initSelectPageView(contentFeedbackSelectPage, linearLayout, viewPager2);
                return;
            }
            if (item instanceof ContentFeedbackEditContentPage) {
                ContentFeedbackBottomSheetDialog contentFeedbackBottomSheetDialog2 = ContentFeedbackBottomSheetDialog.this;
                ContentFeedbackEditContentPage contentFeedbackEditContentPage = (ContentFeedbackEditContentPage) item;
                ViewPager2 viewPager23 = contentFeedbackBottomSheetDialog2.vp2;
                if (viewPager23 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("vp2");
                } else {
                    viewPager2 = viewPager23;
                }
                contentFeedbackBottomSheetDialog2.initEditPageView(contentFeedbackEditContentPage, linearLayout, viewPager2);
            }
        }
    }
}
