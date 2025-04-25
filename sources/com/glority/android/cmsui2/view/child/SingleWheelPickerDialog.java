package com.glority.android.cmsui2.view.child;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.glority.android.cmsui2.databinding.CmsGradingYearSelectedDialogBinding;
import com.glority.android.core.ext.ViewExtensionsKt;
import com.glority.widget.GlTextView;
import com.glority.widget.bottomsheet.GlBottomSheetBuilder;
import com.glority.widget.bottomsheet.GlBottomSheetDialog;
import com.glority.widget.wheelpicker.GlWheelPickerView;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SingleWheelPickerDialog.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JT\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\r2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011¨\u0006\u0012"}, d2 = {"Lcom/glority/android/cmsui2/view/child/SingleWheelPickerDialog;", "", "<init>", "()V", "show", "", "context", "Landroid/content/Context;", "list", "", "", "currentValue", "onDismiss", "Lkotlin/Function0;", "onSelected", "Lkotlin/Function1;", "additionalView", "Landroid/view/View;", "cmsUI2_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes14.dex */
public final class SingleWheelPickerDialog {
    public static final SingleWheelPickerDialog INSTANCE = new SingleWheelPickerDialog();

    private SingleWheelPickerDialog() {
    }

    public static /* synthetic */ void show$default(SingleWheelPickerDialog singleWheelPickerDialog, Context context, List list, String str, Function0 function0, Function1 function1, View view, int i, Object obj) {
        if ((i & 32) != 0) {
            view = null;
        }
        singleWheelPickerDialog.show(context, list, str, function0, function1, view);
    }

    public final void show(Context context, final List<String> list, String currentValue, final Function0<Unit> onDismiss, final Function1<? super String, Unit> onSelected, View additionalView) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(list, "list");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Intrinsics.checkNotNullParameter(onSelected, "onSelected");
        CmsGradingYearSelectedDialogBinding inflate = CmsGradingYearSelectedDialogBinding.inflate(LayoutInflater.from(context));
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        final GlWheelPickerView wheel1 = inflate.wheel1;
        Intrinsics.checkNotNullExpressionValue(wheel1, "wheel1");
        TextView cancelTv = inflate.cancelTv;
        Intrinsics.checkNotNullExpressionValue(cancelTv, "cancelTv");
        GlTextView doneTv = inflate.doneTv;
        Intrinsics.checkNotNullExpressionValue(doneTv, "doneTv");
        wheel1.setData(list);
        int indexOf = CollectionsKt.indexOf((List<? extends String>) list, currentValue);
        if (indexOf == -1) {
            indexOf = 0;
        }
        LinearLayout llAdditionalView = inflate.llAdditionalView;
        Intrinsics.checkNotNullExpressionValue(llAdditionalView, "llAdditionalView");
        llAdditionalView.setVisibility(additionalView != null ? 0 : 8);
        inflate.llAdditionalView.removeAllViews();
        if (additionalView != null) {
            inflate.llAdditionalView.addView(additionalView);
        }
        wheel1.setSelectedItemPosition(indexOf, false);
        GlBottomSheetBuilder glBottomSheetBuilder = new GlBottomSheetBuilder(context);
        View root = inflate.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        final GlBottomSheetDialog show = glBottomSheetBuilder.setCustomView(root).showDimBehind(true).show(3);
        Intrinsics.checkNotNull(show, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
        show.setDismissWithAnimation(true);
        ViewExtensionsKt.setSingleClickListener$default(cancelTv, 0L, new Function1<View, Unit>() { // from class: com.glority.android.cmsui2.view.child.SingleWheelPickerDialog$show$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                onDismiss.invoke();
                show.dismiss();
            }
        }, 1, (Object) null);
        ViewExtensionsKt.setSingleClickListener$default(doneTv, 0L, new Function1<View, Unit>() { // from class: com.glority.android.cmsui2.view.child.SingleWheelPickerDialog$show$2
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
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
                GlBottomSheetDialog.this.dismiss();
                onSelected.invoke(list.get(wheel1.getCurrentItemPosition()));
            }
        }, 1, (Object) null);
    }
}
