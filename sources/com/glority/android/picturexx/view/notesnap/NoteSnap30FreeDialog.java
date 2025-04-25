package com.glority.android.picturexx.view.notesnap;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import androidx.appcompat.app.AlertDialog;
import androidx.core.os.BundleKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import com.glority.android.core.data.LogEventArguments;
import com.glority.android.core.ext.ViewExtensionsKt;
import com.glority.android.core.route.analysis.LogEventRequest;
import com.glority.android.picturexx.business.R;
import com.glority.android.picturexx.business.databinding.DialogNotesnap30freeBinding;
import com.glority.android.picturexx.vm.NoteSnapViewModel;
import com.glority.android.xx.constants.LogEvents;
import com.glority.base.handler.GetVipTypeHandler;
import com.glority.base.viewmodel.AppViewModel;
import com.glority.network.model.Resource;
import com.glority.network.model.Status;
import com.glority.utils.ui.ToastUtils;
import com.glority.widget.GlProgressDialog;
import com.glority.widget.GlTextView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import com.picturecoin.generatedAPI.kotlinAPI.application.GetAndUseGooglePromoCodeMessage;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* compiled from: NoteSnap30FreeDialog.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J9\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2!\u0010\n\u001a\u001d\u0012\u0013\u0012\u00110\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00050\u000bJ\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\tH\u0002¨\u0006\u0012"}, d2 = {"Lcom/glority/android/picturexx/view/notesnap/NoteSnap30FreeDialog;", "", "<init>", "()V", "show", "", "context", "Landroid/content/Context;", "from", "", "onDismiss", "Lkotlin/Function1;", "Lcom/glority/android/picturexx/vm/NoteSnapViewModel$DismissType;", "Lkotlin/ParameterName;", "name", "type", "getLogBundle", "Landroid/os/Bundle;", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class NoteSnap30FreeDialog {
    public static final int $stable = 0;
    public static final NoteSnap30FreeDialog INSTANCE = new NoteSnap30FreeDialog();

    private NoteSnap30FreeDialog() {
    }

    public final void show(final Context context, final String from, final Function1<? super NoteSnapViewModel.DismissType, Unit> onDismiss) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        new LogEventRequest(LogEvents.notesnapofferalert_show, getLogBundle(from)).post();
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        final NoteSnapViewModel noteSnapViewModel = new NoteSnapViewModel();
        DialogNotesnap30freeBinding inflate = DialogNotesnap30freeBinding.inflate(LayoutInflater.from(context));
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        final AlertDialog show = new MaterialAlertDialogBuilder(context).setView(inflate.getRoot()).setBackground(new ColorDrawable(context.getResources().getColor(R.color.transparent))).setCancelable(true).setBackgroundInsetStart(0).setBackgroundInsetEnd(0).setBackgroundInsetTop(0).setBackgroundInsetBottom(0).show();
        MaterialButton claminBt = inflate.claminBt;
        Intrinsics.checkNotNullExpressionValue(claminBt, "claminBt");
        ViewExtensionsKt.setSingleClickListener$default(claminBt, 0L, new Function1<View, Unit>() { // from class: com.glority.android.picturexx.view.notesnap.NoteSnap30FreeDialog$show$1
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
                Ref.BooleanRef.this.element = true;
                GlProgressDialog glProgressDialog = GlProgressDialog.INSTANCE;
                Context context2 = it.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                final Dialog show$default = GlProgressDialog.show$default(glProgressDialog, context2, false, (String) null, 0L, 12, (Object) null);
                LiveData<Resource<GetAndUseGooglePromoCodeMessage>> requestPromoCode = noteSnapViewModel.requestPromoCode();
                Object context3 = it.getContext();
                Intrinsics.checkNotNull(context3, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
                final AlertDialog alertDialog = show;
                final String str = from;
                final NoteSnapViewModel noteSnapViewModel2 = noteSnapViewModel;
                final Context context4 = context;
                final Function1<NoteSnapViewModel.DismissType, Unit> function1 = onDismiss;
                requestPromoCode.observe((LifecycleOwner) context3, new NoteSnap30FreeDialog$sam$androidx_lifecycle_Observer$0(new Function1<Resource<? extends GetAndUseGooglePromoCodeMessage>, Unit>() { // from class: com.glority.android.picturexx.view.notesnap.NoteSnap30FreeDialog$show$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Resource<? extends GetAndUseGooglePromoCodeMessage> resource) {
                        invoke2((Resource<GetAndUseGooglePromoCodeMessage>) resource);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Resource<GetAndUseGooglePromoCodeMessage> resource) {
                        Bundle logBundle;
                        String str2;
                        Bundle logBundle2;
                        if (resource.getStatus() == Status.SUCCESS) {
                            show$default.dismiss();
                            alertDialog.dismiss();
                            GetAndUseGooglePromoCodeMessage data = resource.getData();
                            if (data == null || (str2 = data.getCode()) == null) {
                                str2 = "";
                            }
                            logBundle2 = NoteSnap30FreeDialog.INSTANCE.getLogBundle(str);
                            logBundle2.putString(LogEventArguments.ARG_STRING_2, str2);
                            logBundle2.putString("status", "success");
                            new LogEventRequest(LogEvents.notesnapofferalert_claim_click, logBundle2).post();
                            noteSnapViewModel2.toVerify(str2, context4);
                            function1.invoke(NoteSnapViewModel.DismissType.CLAIM);
                            return;
                        }
                        if (resource.getStatus() == Status.ERROR) {
                            logBundle = NoteSnap30FreeDialog.INSTANCE.getLogBundle(str);
                            logBundle.putString("status", "failed");
                            new LogEventRequest(LogEvents.notesnapofferalert_claim_click, logBundle).post();
                            show$default.dismiss();
                            ToastUtils.showError(R.string.text_failed, new Object[0]);
                        }
                    }
                }));
            }
        }, 1, (Object) null);
        GlTextView notInterstedTv = inflate.notInterstedTv;
        Intrinsics.checkNotNullExpressionValue(notInterstedTv, "notInterstedTv");
        ViewExtensionsKt.setSingleClickListener$default(notInterstedTv, 0L, new Function1<View, Unit>() { // from class: com.glority.android.picturexx.view.notesnap.NoteSnap30FreeDialog$show$2
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
                Bundle logBundle;
                Intrinsics.checkNotNullParameter(it, "it");
                logBundle = NoteSnap30FreeDialog.INSTANCE.getLogBundle(from);
                new LogEventRequest(LogEvents.notesnapofferalert_close_click, logBundle).post();
                booleanRef.element = true;
                noteSnapViewModel.notInterested();
                show.dismiss();
                onDismiss.invoke(NoteSnapViewModel.DismissType.NOT_INTERESTED);
            }
        }, 1, (Object) null);
        show.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.glority.android.picturexx.view.notesnap.NoteSnap30FreeDialog$$ExternalSyntheticLambda0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                NoteSnap30FreeDialog.show$lambda$0(Ref.BooleanRef.this, onDismiss, dialogInterface);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void show$lambda$0(Ref.BooleanRef closeByOption, Function1 onDismiss, DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(closeByOption, "$closeByOption");
        Intrinsics.checkNotNullParameter(onDismiss, "$onDismiss");
        if (closeByOption.element) {
            return;
        }
        onDismiss.invoke(NoteSnapViewModel.DismissType.ONLY_DISMISS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Bundle getLogBundle(String from) {
        String str;
        if (AppViewModel.INSTANCE.isTrial()) {
            str = "trail_vip";
        } else if (AppViewModel.INSTANCE.isVip()) {
            str = "vip";
        } else {
            str = GetVipTypeHandler.FREE;
        }
        return BundleKt.bundleOf(TuplesKt.to(LogEventArguments.ARG_STRING_1, str), TuplesKt.to("from", from));
    }
}
