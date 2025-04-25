package com.glority.android.picturexx.view.dialog;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import androidx.appcompat.app.AlertDialog;
import com.glority.android.core.route.analysis.LogEventRequest;
import com.glority.android.picturexx.business.R;
import com.glority.android.picturexx.business.databinding.DialogExportSuccessBinding;
import com.glority.android.xx.constants.LogEvents;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ExportCustomSeriesSuccessDialog.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/glority/android/picturexx/view/dialog/ExportCustomSeriesSuccessDialog;", "", "<init>", "()V", "open", "", "context", "Landroid/content/Context;", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class ExportCustomSeriesSuccessDialog {
    public static final int $stable = 0;
    public static final ExportCustomSeriesSuccessDialog INSTANCE = new ExportCustomSeriesSuccessDialog();

    private ExportCustomSeriesSuccessDialog() {
    }

    public final void open(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        new LogEventRequest(LogEvents.exportsetsent_show, null, 2, null).post();
        DialogExportSuccessBinding inflate = DialogExportSuccessBinding.inflate(LayoutInflater.from(context));
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        final AlertDialog show = new MaterialAlertDialogBuilder(context).setView(inflate.getRoot()).setBackground(new ColorDrawable(context.getResources().getColor(R.color.transparent))).show();
        inflate.iconClose.setOnClickListener(new View.OnClickListener() { // from class: com.glority.android.picturexx.view.dialog.ExportCustomSeriesSuccessDialog$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ExportCustomSeriesSuccessDialog.open$lambda$0(AlertDialog.this, view);
            }
        });
        inflate.btnConfirm.setOnClickListener(new View.OnClickListener() { // from class: com.glority.android.picturexx.view.dialog.ExportCustomSeriesSuccessDialog$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AlertDialog.this.dismiss();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void open$lambda$0(AlertDialog alertDialog, View view) {
        new LogEventRequest(LogEvents.exportsetsent_close_click, null, 2, null).post();
        alertDialog.dismiss();
    }
}
