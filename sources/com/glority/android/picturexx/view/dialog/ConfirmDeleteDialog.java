package com.glority.android.picturexx.view.dialog;

import android.content.Context;
import androidx.appcompat.app.AlertDialog;
import com.glority.android.picturexx.business.R;
import com.glority.widget.alert.GlAlert;
import com.glority.widget.alert.GlAlertOnClickListener;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ConfirmDeleteDialog.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\tJ\u001c\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\tJ\u001c\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\tJ$\u0010\f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\t¨\u0006\u0010"}, d2 = {"Lcom/glority/android/picturexx/view/dialog/ConfirmDeleteDialog;", "", "<init>", "()V", "openFromCollection", "", "context", "Landroid/content/Context;", FirebaseAnalytics.Param.METHOD, "Lkotlin/Function0;", "openFromSeries", "deleteCustomSeries", "openChangeResultConfirmDialog", "name", "", "onConfirm", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class ConfirmDeleteDialog {
    public static final int $stable = 0;
    public static final ConfirmDeleteDialog INSTANCE = new ConfirmDeleteDialog();

    private ConfirmDeleteDialog() {
    }

    public final void openFromCollection(Context context, final Function0<Unit> method) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(method, "method");
        GlAlert.Builder.setPositiveButton$default(GlAlert.Builder.setNegativeButton$default(new GlAlert.Builder(context, GlAlert.DialogStyle.SYSTEM, 0, 4, null).setMessage(R.string.personal_center_text_confirm_delete), R.string.text_cancel, new GlAlertOnClickListener() { // from class: com.glority.android.picturexx.view.dialog.ConfirmDeleteDialog$openFromCollection$1
            @Override // com.glority.widget.alert.GlAlertOnClickListener
            public void onClick(AlertDialog glAlert) {
                Intrinsics.checkNotNullParameter(glAlert, "glAlert");
                glAlert.dismiss();
            }
        }, (GlAlert.ButtonStyle) null, 4, (Object) null), R.string.text_delete, new GlAlertOnClickListener() { // from class: com.glority.android.picturexx.view.dialog.ConfirmDeleteDialog$openFromCollection$2
            @Override // com.glority.widget.alert.GlAlertOnClickListener
            public void onClick(AlertDialog glAlert) {
                Intrinsics.checkNotNullParameter(glAlert, "glAlert");
                glAlert.dismiss();
                method.invoke();
            }
        }, (GlAlert.ButtonStyle) null, 4, (Object) null).show();
    }

    public final void openFromSeries(Context context, final Function0<Unit> method) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(method, "method");
        GlAlert.Builder.setPositiveButton$default(GlAlert.Builder.setNegativeButton$default(new GlAlert.Builder(context, GlAlert.DialogStyle.SYSTEM, 0, 4, null).setTitle(R.string.personal_center_text_confirm_delete).setMessage(R.string.series_delete_content), R.string.text_cancel, new GlAlertOnClickListener() { // from class: com.glority.android.picturexx.view.dialog.ConfirmDeleteDialog$openFromSeries$1
            @Override // com.glority.widget.alert.GlAlertOnClickListener
            public void onClick(AlertDialog glAlert) {
                Intrinsics.checkNotNullParameter(glAlert, "glAlert");
                glAlert.dismiss();
            }
        }, (GlAlert.ButtonStyle) null, 4, (Object) null), R.string.text_delete, new GlAlertOnClickListener() { // from class: com.glority.android.picturexx.view.dialog.ConfirmDeleteDialog$openFromSeries$2
            @Override // com.glority.widget.alert.GlAlertOnClickListener
            public void onClick(AlertDialog glAlert) {
                Intrinsics.checkNotNullParameter(glAlert, "glAlert");
                glAlert.dismiss();
                method.invoke();
            }
        }, (GlAlert.ButtonStyle) null, 4, (Object) null).show();
    }

    public final void deleteCustomSeries(Context context, final Function0<Unit> method) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(method, "method");
        GlAlert.Builder.setPositiveButton$default(GlAlert.Builder.setNegativeButton$default(new GlAlert.Builder(context, GlAlert.DialogStyle.SYSTEM, 0, 4, null).setTitle(R.string.Customseries_popup_deletetitle).setMessage(R.string.Customseries_popup_deletetext), R.string.text_cancel, new GlAlertOnClickListener() { // from class: com.glority.android.picturexx.view.dialog.ConfirmDeleteDialog$deleteCustomSeries$1
            @Override // com.glority.widget.alert.GlAlertOnClickListener
            public void onClick(AlertDialog glAlert) {
                Intrinsics.checkNotNullParameter(glAlert, "glAlert");
                glAlert.dismiss();
            }
        }, (GlAlert.ButtonStyle) null, 4, (Object) null), R.string.text_delete, new GlAlertOnClickListener() { // from class: com.glority.android.picturexx.view.dialog.ConfirmDeleteDialog$deleteCustomSeries$2
            @Override // com.glority.widget.alert.GlAlertOnClickListener
            public void onClick(AlertDialog glAlert) {
                Intrinsics.checkNotNullParameter(glAlert, "glAlert");
                glAlert.dismiss();
                method.invoke();
            }
        }, (GlAlert.ButtonStyle) null, 4, (Object) null).show();
    }

    public final void openChangeResultConfirmDialog(Context context, String name, final Function0<Unit> onConfirm) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(onConfirm, "onConfirm");
        GlAlert.Builder.setPositiveButton$default(GlAlert.Builder.setNegativeButton$default(new GlAlert.Builder(context, GlAlert.DialogStyle.SYSTEM, 0, 4, null).setTitle(R.string.global_correctresult_confirmpopup_title).setMessage(context.getResources().getString(R.string.global_correctresult_confirmpopup_text, name)), R.string.text_cancel, new GlAlertOnClickListener() { // from class: com.glority.android.picturexx.view.dialog.ConfirmDeleteDialog$openChangeResultConfirmDialog$1
            @Override // com.glority.widget.alert.GlAlertOnClickListener
            public void onClick(AlertDialog glAlert) {
                Intrinsics.checkNotNullParameter(glAlert, "glAlert");
                glAlert.dismiss();
            }
        }, (GlAlert.ButtonStyle) null, 4, (Object) null), R.string.text_confirm, new GlAlertOnClickListener() { // from class: com.glority.android.picturexx.view.dialog.ConfirmDeleteDialog$openChangeResultConfirmDialog$2
            @Override // com.glority.widget.alert.GlAlertOnClickListener
            public void onClick(AlertDialog glAlert) {
                Intrinsics.checkNotNullParameter(glAlert, "glAlert");
                glAlert.dismiss();
                onConfirm.invoke();
            }
        }, (GlAlert.ButtonStyle) null, 4, (Object) null).show();
    }
}
