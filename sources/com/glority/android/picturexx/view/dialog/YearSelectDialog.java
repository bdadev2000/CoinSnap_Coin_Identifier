package com.glority.android.picturexx.view.dialog;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.glority.android.core.ext.ViewExtensionsKt;
import com.glority.android.picturexx.business.databinding.DialogYearSelectBinding;
import com.glority.widget.bottomsheet.GlBottomSheetBuilder;
import com.glority.widget.bottomsheet.GlBottomSheetDialog;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: YearSelectDialog.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J8\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\r¨\u0006\u000e"}, d2 = {"Lcom/glority/android/picturexx/view/dialog/YearSelectDialog;", "", "<init>", "()V", "show", "", "context", "Landroid/content/Context;", "yearList", "", "", "currentYear", "selectedYear", "Lkotlin/Function1;", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class YearSelectDialog {
    public static final int $stable = 0;
    public static final YearSelectDialog INSTANCE = new YearSelectDialog();

    private YearSelectDialog() {
    }

    public final void show(Context context, final List<String> yearList, String currentYear, final Function1<? super String, Unit> selectedYear) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(yearList, "yearList");
        Intrinsics.checkNotNullParameter(currentYear, "currentYear");
        Intrinsics.checkNotNullParameter(selectedYear, "selectedYear");
        final DialogYearSelectBinding inflate = DialogYearSelectBinding.inflate(LayoutInflater.from(context));
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        inflate.wheel1.setData(yearList);
        inflate.wheel1.setSelectedItemPosition(yearList.indexOf(currentYear), false);
        GlBottomSheetBuilder glBottomSheetBuilder = new GlBottomSheetBuilder(context);
        View root = inflate.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        final GlBottomSheetDialog show = glBottomSheetBuilder.setCustomView(root).showDimBehind(true).show(3);
        TextView tvCancel = inflate.tvCancel;
        Intrinsics.checkNotNullExpressionValue(tvCancel, "tvCancel");
        ViewExtensionsKt.setSingleClickListener$default(tvCancel, 0L, new Function1<View, Unit>() { // from class: com.glority.android.picturexx.view.dialog.YearSelectDialog$show$1
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
                GlBottomSheetDialog.this.dismiss();
            }
        }, 1, (Object) null);
        TextView tvDone = inflate.tvDone;
        Intrinsics.checkNotNullExpressionValue(tvDone, "tvDone");
        ViewExtensionsKt.setSingleClickListener$default(tvDone, 0L, new Function1<View, Unit>() { // from class: com.glority.android.picturexx.view.dialog.YearSelectDialog$show$2
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
                selectedYear.invoke(yearList.get(inflate.wheel1.getCurrentItemPosition()));
                show.dismiss();
            }
        }, 1, (Object) null);
        show.setDismissWithAnimation(true);
        show.show();
    }
}
