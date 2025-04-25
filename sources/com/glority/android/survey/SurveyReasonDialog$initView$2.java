package com.glority.android.survey;

import android.app.Activity;
import android.content.DialogInterface;
import android.view.View;
import android.widget.CheckedTextView;
import android.widget.LinearLayout;
import androidx.core.view.ViewGroupKt;
import com.glority.android.survey.SurveyReasonDialog;
import com.glority.utils.app.ResUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* compiled from: SurveyReasonDialog.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 4, 2})
/* loaded from: classes4.dex */
final class SurveyReasonDialog$initView$2 extends Lambda implements Function1<View, Unit> {
    final /* synthetic */ List $shuffledReasons;
    final /* synthetic */ SurveyReasonDialog this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SurveyReasonDialog$initView$2(SurveyReasonDialog surveyReasonDialog, List list) {
        super(1);
        this.this$0 = surveyReasonDialog;
        this.$shuffledReasons = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(View view) {
        invoke2(view);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(View it) {
        Activity activity;
        Intrinsics.checkNotNullParameter(it, "it");
        LinearLayout ll_reasons = (LinearLayout) this.this$0.findViewById(R.id.ll_reasons);
        Intrinsics.checkNotNullExpressionValue(ll_reasons, "ll_reasons");
        Iterator<View> it2 = ViewGroupKt.getChildren(ll_reasons).iterator();
        int i = 0;
        while (true) {
            if (!it2.hasNext()) {
                i = -1;
                break;
            }
            View next = it2.next();
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            View view = next;
            if (view == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.CheckedTextView");
            }
            if (((CheckedTextView) view).isChecked()) {
                break;
            } else {
                i++;
            }
        }
        if (i >= 0) {
            final Integer num = (Integer) CollectionsKt.getOrNull(this.$shuffledReasons, i);
            this.this$0.dismiss();
            activity = this.this$0.activity;
            SurveyThanksDialog surveyThanksDialog = new SurveyThanksDialog(activity);
            surveyThanksDialog.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.glority.android.survey.SurveyReasonDialog$initView$2$$special$$inlined$let$lambda$1
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    ArrayList arrayList;
                    SurveyReasonDialog.SelectedListener selectedListener;
                    arrayList = this.this$0.reasons;
                    int indexOf = CollectionsKt.indexOf((List<? extends Integer>) arrayList, num);
                    Integer num2 = num;
                    String string = num2 != null ? ResUtils.getString(num2.intValue()) : null;
                    selectedListener = this.this$0.selectedListener;
                    selectedListener.result(indexOf, string);
                }
            });
            surveyThanksDialog.show();
        }
    }
}
