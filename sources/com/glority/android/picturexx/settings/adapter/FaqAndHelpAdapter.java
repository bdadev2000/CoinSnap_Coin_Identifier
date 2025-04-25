package com.glority.android.picturexx.settings.adapter;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.glority.android.adapterhelper.BaseMultiItemQuickAdapter;
import com.glority.android.adapterhelper.BaseViewHolder;
import com.glority.android.picturexx.settings.R;
import com.glority.android.picturexx.settings.entity.QACategory;
import com.glority.android.picturexx.settings.entity.QuestionAndAnswer;
import com.glority.base.entity.BaseMultiEntity;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FaqAndHelpAdapter.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u000e2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000eB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0002H\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u000f"}, d2 = {"Lcom/glority/android/picturexx/settings/adapter/FaqAndHelpAdapter;", "Lcom/glority/android/adapterhelper/BaseMultiItemQuickAdapter;", "Lcom/glority/base/entity/BaseMultiEntity;", "Lcom/glority/android/adapterhelper/BaseViewHolder;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "convert", "", "helper", "item", "Companion", "settings_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class FaqAndHelpAdapter extends BaseMultiItemQuickAdapter<BaseMultiEntity, BaseViewHolder> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final int TYPE_CATEGORY_TITLE = 0;
    private static final int TYPE_QA_ITEM = 1;
    private final Context context;

    /* compiled from: FaqAndHelpAdapter.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/glority/android/picturexx/settings/adapter/FaqAndHelpAdapter$Companion;", "", "<init>", "()V", "TYPE_CATEGORY_TITLE", "", "TYPE_QA_ITEM", "convert", "", "Lcom/glority/base/entity/BaseMultiEntity;", "faqs", "", "Lcom/glority/android/picturexx/settings/entity/QACategory;", "settings_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final List<BaseMultiEntity> convert(List<QACategory> faqs) {
            Intrinsics.checkNotNullParameter(faqs, "faqs");
            ArrayList arrayList = new ArrayList();
            for (QACategory qACategory : faqs) {
                int i = 0;
                arrayList.add(new BaseMultiEntity(0, qACategory.getCategoryName()));
                for (Object obj : qACategory.getQaList()) {
                    int i2 = i + 1;
                    if (i < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    QuestionAndAnswer questionAndAnswer = (QuestionAndAnswer) obj;
                    if (!questionAndAnswer.getAppInvisible()) {
                        arrayList.add(new BaseMultiEntity(1, questionAndAnswer));
                    }
                    i = i2;
                }
            }
            return arrayList;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FaqAndHelpAdapter(Context context) {
        super(null);
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        addItemType(0, R.layout.layout_faq_and_help_category);
        addItemType(1, R.layout.layout_faq_and_help_question_answer);
    }

    public final Context getContext() {
        return this.context;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.glority.android.adapterhelper.BaseQuickAdapter
    public void convert(BaseViewHolder helper, BaseMultiEntity item) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        int itemType = item.getItemType();
        if (itemType == 0) {
            Object item2 = item.getItem();
            String str = item2 instanceof String ? (String) item2 : null;
            if (str != null) {
                ((TextView) helper.getView(R.id.tv_category_title)).setText(str);
                return;
            }
            return;
        }
        if (itemType != 1) {
            return;
        }
        Object item3 = item.getItem();
        final QuestionAndAnswer questionAndAnswer = item3 instanceof QuestionAndAnswer ? (QuestionAndAnswer) item3 : null;
        if (questionAndAnswer != null) {
            TextView textView = (TextView) helper.getView(R.id.tv_faq_question);
            final TextView textView2 = (TextView) helper.getView(R.id.tv_faq_answer);
            final ImageView imageView = (ImageView) helper.getView(R.id.iv_faq_indicator);
            textView.setText(questionAndAnswer.getQuestion());
            textView2.setText(questionAndAnswer.getAnswer());
            textView2.setVisibility(8);
            if (textView2.getVisibility() == 0) {
                imageView.setImageResource(R.drawable.icon_faq_minus);
            } else {
                imageView.setImageResource(R.drawable.icon_faq_plus);
            }
            ((LinearLayout) helper.getView(R.id.ll_faq_question)).setOnClickListener(new View.OnClickListener() { // from class: com.glority.android.picturexx.settings.adapter.FaqAndHelpAdapter$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FaqAndHelpAdapter.convert$lambda$2$lambda$1(QuestionAndAnswer.this, textView2, imageView, view);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void convert$lambda$2$lambda$1(QuestionAndAnswer it, TextView answer, ImageView indicator, View view) {
        Intrinsics.checkNotNullParameter(it, "$it");
        Intrinsics.checkNotNullParameter(answer, "$answer");
        Intrinsics.checkNotNullParameter(indicator, "$indicator");
        if (it.getClickMethod() != null) {
            Function0<Unit> clickMethod = it.getClickMethod();
            if (clickMethod != null) {
                clickMethod.invoke();
                return;
            }
            return;
        }
        int visibility = answer.getVisibility();
        if (visibility == 0) {
            indicator.setImageResource(R.drawable.icon_faq_plus);
            answer.setVisibility(8);
        } else {
            if (visibility != 8) {
                return;
            }
            indicator.setImageResource(R.drawable.icon_faq_minus);
            answer.setVisibility(0);
        }
    }
}
