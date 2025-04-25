package com.glority.android.picturexx.view.dialog;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.navigation.compose.DialogNavigator;
import com.glority.android.core.app.AppContext;
import com.glority.android.core.ext.ViewExtensionsKt;
import com.glority.android.core.route.analysis.LogEventRequest;
import com.glority.android.picturexx.business.R;
import com.glority.android.picturexx.business.databinding.DialogSyncCollectionsBinding;
import com.glority.android.xx.constants.LogEvents;
import com.glority.network.model.Status;
import com.glority.utils.stability.LogUtils;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SyncCollectionDialog.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J&\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J \u0010\u0015\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/glority/android/picturexx/view/dialog/SyncCollectionDialog;", "", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "binding", "Lcom/glority/android/picturexx/business/databinding/DialogSyncCollectionsBinding;", DialogNavigator.NAME, "Landroidx/appcompat/app/AlertDialog;", "open", "", "currentCount", "", "totalCount", "status", "Lcom/glority/network/model/Status;", "retryClickListener", "Landroid/view/View$OnClickListener;", "updateProgress", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class SyncCollectionDialog {
    public static final int $stable = 8;
    private DialogSyncCollectionsBinding binding;
    private final Context context;
    private AlertDialog dialog;

    public SyncCollectionDialog(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        DialogSyncCollectionsBinding inflate = DialogSyncCollectionsBinding.inflate(LayoutInflater.from(context));
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        this.binding = inflate;
        AlertDialog create = new MaterialAlertDialogBuilder(context).setView(this.binding.getRoot()).setBackground(new ColorDrawable(context.getResources().getColor(R.color.transparent))).create();
        Intrinsics.checkNotNullExpressionValue(create, "create(...)");
        this.dialog = create;
    }

    public final Context getContext() {
        return this.context;
    }

    public final void open(int currentCount, int totalCount, Status status, final View.OnClickListener retryClickListener) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(retryClickListener, "retryClickListener");
        new LogEventRequest(LogEvents.syncprogress_show, null, 2, null).post();
        updateProgress(currentCount, totalCount, status);
        ImageView ivClose = this.binding.ivClose;
        Intrinsics.checkNotNullExpressionValue(ivClose, "ivClose");
        ViewExtensionsKt.setSingleClickListener$default(ivClose, 0L, new Function1<View, Unit>() { // from class: com.glority.android.picturexx.view.dialog.SyncCollectionDialog$open$1
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
                AlertDialog alertDialog;
                Intrinsics.checkNotNullParameter(it, "it");
                new LogEventRequest(LogEvents.syncprogress_close_click, null, 2, null).post();
                alertDialog = SyncCollectionDialog.this.dialog;
                alertDialog.dismiss();
            }
        }, 1, (Object) null);
        MaterialButton gotItTv = this.binding.gotItTv;
        Intrinsics.checkNotNullExpressionValue(gotItTv, "gotItTv");
        ViewExtensionsKt.setSingleClickListener$default(gotItTv, 0L, new Function1<View, Unit>() { // from class: com.glority.android.picturexx.view.dialog.SyncCollectionDialog$open$2
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
                AlertDialog alertDialog;
                Intrinsics.checkNotNullParameter(it, "it");
                new LogEventRequest(LogEvents.syncprogress_gotit_click, null, 2, null).post();
                alertDialog = SyncCollectionDialog.this.dialog;
                alertDialog.dismiss();
            }
        }, 1, (Object) null);
        MaterialButton gotit2Tv = this.binding.gotit2Tv;
        Intrinsics.checkNotNullExpressionValue(gotit2Tv, "gotit2Tv");
        ViewExtensionsKt.setSingleClickListener$default(gotit2Tv, 0L, new Function1<View, Unit>() { // from class: com.glority.android.picturexx.view.dialog.SyncCollectionDialog$open$3
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
                AlertDialog alertDialog;
                Intrinsics.checkNotNullParameter(it, "it");
                new LogEventRequest(LogEvents.syncprogress_failgotit_click, null, 2, null).post();
                alertDialog = SyncCollectionDialog.this.dialog;
                alertDialog.dismiss();
            }
        }, 1, (Object) null);
        this.binding.retryTv.setOnClickListener(new View.OnClickListener() { // from class: com.glority.android.picturexx.view.dialog.SyncCollectionDialog$open$4
            @Override // android.view.View.OnClickListener
            public void onClick(View v) {
                new LogEventRequest(LogEvents.syncprogress_retry_click, null, 2, null).post();
                retryClickListener.onClick(v);
            }
        });
        this.dialog.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.glority.android.picturexx.view.dialog.SyncCollectionDialog$$ExternalSyntheticLambda0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                SyncCollectionDialog.open$lambda$0(dialogInterface);
            }
        });
        this.dialog.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void open$lambda$0(DialogInterface dialogInterface) {
        new LogEventRequest(LogEvents.syncprogress_close, null, 2, null).post();
    }

    public final void updateProgress(int currentCount, int totalCount, Status status) {
        Intrinsics.checkNotNullParameter(status, "status");
        try {
            this.binding.tvCount.setText(currentCount + RemoteSettings.FORWARD_SLASH_STRING + totalCount);
            TextView textView = this.binding.tvProgress;
            String format = String.format("%.2f", Arrays.copyOf(new Object[]{Float.valueOf((currentCount / totalCount) * 100)}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "format(...)");
            textView.setText(format + "%");
            this.binding.pb.setMax(totalCount);
            this.binding.pb.setProgress(currentCount, true);
            if (status == Status.LOADING) {
                this.binding.descTv.setText(R.string.collection_syncpopup_caption_synccollections);
                LinearLayout errorLl = this.binding.errorLl;
                Intrinsics.checkNotNullExpressionValue(errorLl, "errorLl");
                errorLl.setVisibility(8);
                MaterialButton gotItTv = this.binding.gotItTv;
                Intrinsics.checkNotNullExpressionValue(gotItTv, "gotItTv");
                gotItTv.setVisibility(0);
            } else if (status == Status.ERROR) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("  " + this.context.getString(R.string.collection_syncpopup_error_networkfail));
                spannableStringBuilder.setSpan(new ImageSpan(this.context, R.drawable.icon_sync_error_tips, 0), 0, 1, 17);
                this.binding.descTv.setText(spannableStringBuilder);
                LinearLayout errorLl2 = this.binding.errorLl;
                Intrinsics.checkNotNullExpressionValue(errorLl2, "errorLl");
                errorLl2.setVisibility(0);
                MaterialButton gotItTv2 = this.binding.gotItTv;
                Intrinsics.checkNotNullExpressionValue(gotItTv2, "gotItTv");
                gotItTv2.setVisibility(8);
            } else {
                this.dialog.dismiss();
            }
            Unit unit = Unit.INSTANCE;
        } catch (Exception e) {
            if (AppContext.INSTANCE.isDebugMode()) {
                LogUtils.e(Log.getStackTraceString(e));
            }
        }
    }
}
