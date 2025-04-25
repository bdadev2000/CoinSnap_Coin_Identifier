package com.glority.android.picturexx.view.dialog;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentManager;
import com.glority.android.core.app.AppContext;
import com.glority.android.core.ext.ViewExtensionsKt;
import com.glority.android.database.entities.UserCustomSeriesItem;
import com.glority.android.picturexx.business.R;
import com.glority.android.picturexx.business.databinding.DialogRenameCustomSeriesBinding;
import com.glority.android.picturexx.repository.SeriesRepository;
import com.glority.android.ui.base.v2.BaseBottomSheetDialogFragment;
import com.glority.android.xx.constants.LogEvents;
import com.glority.network.model.Resource;
import com.glority.network.model.Status;
import com.glority.utils.stability.LogUtils;
import com.glority.utils.ui.ToastUtils;
import com.glority.widget.GlProgressDialog;
import com.glority.widget.GlTextView;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.picturecoin.generatedAPI.kotlinAPI.series.EditUserCustomSeriesMessage;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CustomSeriesRenameDialog.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0014J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rH\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0014J\u001a\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0014J\u0012\u0010\u0015\u001a\u00020\u00162\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/glority/android/picturexx/view/dialog/CustomSeriesRenameDialog;", "Lcom/glority/android/ui/base/v2/BaseBottomSheetDialogFragment;", "Lcom/glority/android/picturexx/business/databinding/DialogRenameCustomSeriesBinding;", "customSeriesItem", "Lcom/glority/android/database/entities/UserCustomSeriesItem;", "<init>", "(Lcom/glority/android/database/entities/UserCustomSeriesItem;)V", "doCreateView", "", "savedInstanceState", "Landroid/os/Bundle;", "renameSave", "it", "Landroid/view/View;", "getLogPageName", "", "getViewBinding", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onCreateDialog", "Landroid/app/Dialog;", "Companion", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class CustomSeriesRenameDialog extends BaseBottomSheetDialogFragment<DialogRenameCustomSeriesBinding> {
    private final UserCustomSeriesItem customSeriesItem;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: CustomSeriesRenameDialog.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, d2 = {"Lcom/glority/android/picturexx/view/dialog/CustomSeriesRenameDialog$Companion;", "", "<init>", "()V", "open", "", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "customSeriesItem", "Lcom/glority/android/database/entities/UserCustomSeriesItem;", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final void open(FragmentManager fragmentManager, UserCustomSeriesItem customSeriesItem) {
            Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
            Intrinsics.checkNotNullParameter(customSeriesItem, "customSeriesItem");
            try {
                Integer.valueOf(fragmentManager.beginTransaction().add(new CustomSeriesRenameDialog(customSeriesItem), "CustomSeriesRenameDialog").commitAllowingStateLoss());
            } catch (Exception e) {
                if (AppContext.INSTANCE.isDebugMode()) {
                    LogUtils.e(Log.getStackTraceString(e));
                }
            }
        }
    }

    public CustomSeriesRenameDialog(UserCustomSeriesItem customSeriesItem) {
        Intrinsics.checkNotNullParameter(customSeriesItem, "customSeriesItem");
        this.customSeriesItem = customSeriesItem;
    }

    @Override // com.glority.android.ui.base.v2.BaseBottomSheetDialogFragment
    protected void doCreateView(Bundle savedInstanceState) {
        ImageView cancelIv = getBinding().cancelIv;
        Intrinsics.checkNotNullExpressionValue(cancelIv, "cancelIv");
        ViewExtensionsKt.setSingleClickListener$default(cancelIv, 0L, new Function1<View, Unit>() { // from class: com.glority.android.picturexx.view.dialog.CustomSeriesRenameDialog$doCreateView$1
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
                CustomSeriesRenameDialog.this.dismiss();
            }
        }, 1, (Object) null);
        GlTextView doneTv = getBinding().doneTv;
        Intrinsics.checkNotNullExpressionValue(doneTv, "doneTv");
        ViewExtensionsKt.setSingleClickListener$default(doneTv, 0L, new Function1<View, Unit>() { // from class: com.glority.android.picturexx.view.dialog.CustomSeriesRenameDialog$doCreateView$2
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
                CustomSeriesRenameDialog.this.logEvent(LogEvents.customseries_editnamedone_click, BundleKt.bundleOf(TuplesKt.to("from", LogEvents.button)));
                CustomSeriesRenameDialog.this.renameSave(it);
            }
        }, 1, (Object) null);
        EditText nameEt = getBinding().nameEt;
        Intrinsics.checkNotNullExpressionValue(nameEt, "nameEt");
        nameEt.addTextChangedListener(new TextWatcher() { // from class: com.glority.android.picturexx.view.dialog.CustomSeriesRenameDialog$doCreateView$$inlined$doAfterTextChanged$1
            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence text, int start, int count, int after) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence text, int start, int before, int count) {
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable s) {
                DialogRenameCustomSeriesBinding binding;
                DialogRenameCustomSeriesBinding binding2;
                DialogRenameCustomSeriesBinding binding3;
                DialogRenameCustomSeriesBinding binding4;
                if (s == null || s.length() <= 0) {
                    binding = CustomSeriesRenameDialog.this.getBinding();
                    binding.doneTv.setEnabled(false);
                    binding2 = CustomSeriesRenameDialog.this.getBinding();
                    binding2.doneTv.setAlpha(0.5f);
                    return;
                }
                binding3 = CustomSeriesRenameDialog.this.getBinding();
                binding3.doneTv.setEnabled(true);
                binding4 = CustomSeriesRenameDialog.this.getBinding();
                binding4.doneTv.setAlpha(1.0f);
            }
        });
        getBinding().nameEt.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.glority.android.picturexx.view.dialog.CustomSeriesRenameDialog$$ExternalSyntheticLambda0
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                boolean doCreateView$lambda$1;
                doCreateView$lambda$1 = CustomSeriesRenameDialog.doCreateView$lambda$1(CustomSeriesRenameDialog.this, textView, i, keyEvent);
                return doCreateView$lambda$1;
            }
        });
        getBinding().nameEt.requestFocus();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean doCreateView$lambda$1(CustomSeriesRenameDialog this$0, TextView textView, int i, KeyEvent keyEvent) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (i != 6) {
            return false;
        }
        this$0.logEvent(LogEvents.customseries_editnamedone_click, BundleKt.bundleOf(TuplesKt.to("from", LogEvents.keyboard)));
        if (!this$0.getBinding().doneTv.isEnabled()) {
            return true;
        }
        Intrinsics.checkNotNull(textView);
        this$0.renameSave(textView);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void renameSave(View it) {
        if (Intrinsics.areEqual(getBinding().nameEt.getText().toString(), this.customSeriesItem.getTitle())) {
            dismiss();
            return;
        }
        GlProgressDialog glProgressDialog = GlProgressDialog.INSTANCE;
        Context context = it.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        final Dialog show$default = GlProgressDialog.show$default(glProgressDialog, context, true, (String) null, 0L, 12, (Object) null);
        SeriesRepository.INSTANCE.renameUserCustomSeries(this.customSeriesItem, getBinding().nameEt.getText().toString()).observe(this, new CustomSeriesRenameDialog$sam$androidx_lifecycle_Observer$0(new Function1<Resource<? extends EditUserCustomSeriesMessage>, Unit>() { // from class: com.glority.android.picturexx.view.dialog.CustomSeriesRenameDialog$renameSave$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Resource<? extends EditUserCustomSeriesMessage> resource) {
                invoke2((Resource<EditUserCustomSeriesMessage>) resource);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Resource<EditUserCustomSeriesMessage> resource) {
                UserCustomSeriesItem unused;
                unused = CustomSeriesRenameDialog.this.customSeriesItem;
                show$default.dismiss();
                if (resource.getStatus() == Status.ERROR) {
                    ToastUtils.showError(R.string.text_error, new Object[0]);
                } else if (resource.getStatus() == Status.SUCCESS) {
                    CustomSeriesRenameDialog.this.dismiss();
                }
            }
        }));
    }

    @Override // com.glority.android.ui.base.v2.BaseBottomSheetDialogFragment
    protected String getLogPageName() {
        return LogEvents.createseries;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.glority.android.ui.base.v2.BaseBottomSheetDialogFragment
    public DialogRenameCustomSeriesBinding getViewBinding(LayoutInflater inflater, ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        DialogRenameCustomSeriesBinding inflate = DialogRenameCustomSeriesBinding.inflate(inflater.cloneInContext(requireActivity()), container, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return inflate;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialogFragment, androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        if (getContext() == null) {
            Dialog onCreateDialog = super.onCreateDialog(savedInstanceState);
            Intrinsics.checkNotNullExpressionValue(onCreateDialog, "onCreateDialog(...)");
            return onCreateDialog;
        }
        return new BottomSheetDialog(requireContext(), R.style.TransparentBottomSheetStyle);
    }
}
