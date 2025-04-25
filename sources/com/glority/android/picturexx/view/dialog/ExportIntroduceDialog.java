package com.glority.android.picturexx.view.dialog;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.app.AlertDialog;
import androidx.core.os.BundleKt;
import com.glority.android.core.ext.ViewExtensionsKt;
import com.glority.android.core.route.analysis.LogEventRequest;
import com.glority.android.picturexx.business.R;
import com.glority.android.picturexx.business.databinding.DialogExportIntroduceBinding;
import com.glority.android.xx.constants.LogEvents;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ExportIntroduceDialog.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/glority/android/picturexx/view/dialog/ExportIntroduceDialog;", "", "<init>", "()V", "open", "", "context", "Landroid/content/Context;", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class ExportIntroduceDialog {
    public static final int $stable = 0;
    public static final ExportIntroduceDialog INSTANCE = new ExportIntroduceDialog();

    private ExportIntroduceDialog() {
    }

    public final void open(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        new LogEventRequest(LogEvents.exportemptyalert_show, null, 2, null).post();
        DialogExportIntroduceBinding inflate = DialogExportIntroduceBinding.inflate(LayoutInflater.from(context));
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        final AlertDialog show = new MaterialAlertDialogBuilder(context).setView(inflate.getRoot()).setCancelable(false).setBackground(new ColorDrawable(context.getResources().getColor(R.color.transparent))).show();
        MaterialButton btnConfirm = inflate.btnConfirm;
        Intrinsics.checkNotNullExpressionValue(btnConfirm, "btnConfirm");
        ViewExtensionsKt.setSingleClickListener$default(btnConfirm, 0L, new Function1<View, Unit>() { // from class: com.glority.android.picturexx.view.dialog.ExportIntroduceDialog$open$1
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
                new LogEventRequest(LogEvents.exportemptyalert_close_click, BundleKt.bundleOf(TuplesKt.to("type", LogEvents.exportemptyalert_close_click_type_get))).post();
                AlertDialog.this.dismiss();
            }
        }, 1, (Object) null);
        ImageView iconClose = inflate.iconClose;
        Intrinsics.checkNotNullExpressionValue(iconClose, "iconClose");
        ViewExtensionsKt.setSingleClickListener$default(iconClose, 0L, new Function1<View, Unit>() { // from class: com.glority.android.picturexx.view.dialog.ExportIntroduceDialog$open$2
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
                new LogEventRequest(LogEvents.exportemptyalert_close_click, BundleKt.bundleOf(TuplesKt.to("type", "close"))).post();
                AlertDialog.this.dismiss();
            }
        }, 1, (Object) null);
    }
}
