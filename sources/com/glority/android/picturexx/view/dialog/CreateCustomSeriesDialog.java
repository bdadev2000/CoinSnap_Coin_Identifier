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
import androidx.fragment.app.FragmentTransaction;
import com.glority.android.core.app.AppContext;
import com.glority.android.core.data.LogEventArguments;
import com.glority.android.core.ext.ViewExtensionsKt;
import com.glority.android.database.DBManager;
import com.glority.android.picturexx.business.R;
import com.glority.android.picturexx.business.databinding.DialogCreateSeriesBinding;
import com.glority.android.picturexx.repository.SeriesRepository;
import com.glority.android.picturexx.utils.PersistDataUtils;
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
import com.picturecoin.generatedAPI.kotlinAPI.series.CreateUserCustomSeriesMessage;
import com.picturecoin.generatedAPI.kotlinAPI.series.UserCustomSeries;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CreateCustomSeriesDialog.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00192\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u000b\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0014J\u0010\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\b\u0010\u0011\u001a\u00020\nH\u0014J\u001a\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0014J\u0012\u0010\u0017\u001a\u00020\u00182\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016R\u001c\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/glority/android/picturexx/view/dialog/CreateCustomSeriesDialog;", "Lcom/glority/android/ui/base/v2/BaseBottomSheetDialogFragment;", "Lcom/glority/android/picturexx/business/databinding/DialogCreateSeriesBinding;", "<init>", "()V", "onCreateSuccess", "Lkotlin/Function1;", "Lcom/picturecoin/generatedAPI/kotlinAPI/series/UserCustomSeries;", "", "from", "", "doCreateView", "savedInstanceState", "Landroid/os/Bundle;", "createSeries", "it", "Landroid/view/View;", "getLogPageName", "getViewBinding", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onCreateDialog", "Landroid/app/Dialog;", "Companion", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class CreateCustomSeriesDialog extends BaseBottomSheetDialogFragment<DialogCreateSeriesBinding> {
    private String from = "";
    private Function1<? super UserCustomSeries, Unit> onCreateSuccess;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: CreateCustomSeriesDialog.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J9\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2!\u0010\n\u001a\u001d\u0012\u0013\u0012\u00110\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00050\u000b¨\u0006\u0010"}, d2 = {"Lcom/glority/android/picturexx/view/dialog/CreateCustomSeriesDialog$Companion;", "", "<init>", "()V", "open", "", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "from", "", "onCreateSuccess", "Lkotlin/Function1;", "Lcom/picturecoin/generatedAPI/kotlinAPI/series/UserCustomSeries;", "Lkotlin/ParameterName;", "name", "item", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final void open(FragmentManager fragmentManager, String from, Function1<? super UserCustomSeries, Unit> onCreateSuccess) {
            Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
            Intrinsics.checkNotNullParameter(from, "from");
            Intrinsics.checkNotNullParameter(onCreateSuccess, "onCreateSuccess");
            try {
                FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
                CreateCustomSeriesDialog createCustomSeriesDialog = new CreateCustomSeriesDialog();
                createCustomSeriesDialog.onCreateSuccess = onCreateSuccess;
                createCustomSeriesDialog.from = from;
                Integer.valueOf(beginTransaction.add(createCustomSeriesDialog, "CreateCustomSeriesDialog").commitAllowingStateLoss());
            } catch (Exception e) {
                if (AppContext.INSTANCE.isDebugMode()) {
                    LogUtils.e(Log.getStackTraceString(e));
                }
            }
        }
    }

    @Override // com.glority.android.ui.base.v2.BaseBottomSheetDialogFragment
    protected void doCreateView(Bundle savedInstanceState) {
        ImageView cancelIv = getBinding().cancelIv;
        Intrinsics.checkNotNullExpressionValue(cancelIv, "cancelIv");
        ViewExtensionsKt.setSingleClickListener$default(cancelIv, 0L, new Function1<View, Unit>() { // from class: com.glority.android.picturexx.view.dialog.CreateCustomSeriesDialog$doCreateView$1
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
                CreateCustomSeriesDialog.this.dismiss();
            }
        }, 1, (Object) null);
        GlTextView doneTv = getBinding().doneTv;
        Intrinsics.checkNotNullExpressionValue(doneTv, "doneTv");
        ViewExtensionsKt.setSingleClickListener$default(doneTv, 0L, new Function1<View, Unit>() { // from class: com.glority.android.picturexx.view.dialog.CreateCustomSeriesDialog$doCreateView$2
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
                String str;
                Intrinsics.checkNotNullParameter(it, "it");
                CreateCustomSeriesDialog createCustomSeriesDialog = CreateCustomSeriesDialog.this;
                str = createCustomSeriesDialog.from;
                createCustomSeriesDialog.logEvent(LogEvents.customseries_createnamedone_click, BundleKt.bundleOf(TuplesKt.to("from", str), TuplesKt.to(LogEventArguments.ARG_STRING_1, LogEvents.button)));
                CreateCustomSeriesDialog.this.createSeries(it);
            }
        }, 1, (Object) null);
        getBinding().nameEt.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.glority.android.picturexx.view.dialog.CreateCustomSeriesDialog$$ExternalSyntheticLambda0
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                boolean doCreateView$lambda$0;
                doCreateView$lambda$0 = CreateCustomSeriesDialog.doCreateView$lambda$0(CreateCustomSeriesDialog.this, textView, i, keyEvent);
                return doCreateView$lambda$0;
            }
        });
        EditText nameEt = getBinding().nameEt;
        Intrinsics.checkNotNullExpressionValue(nameEt, "nameEt");
        nameEt.addTextChangedListener(new TextWatcher() { // from class: com.glority.android.picturexx.view.dialog.CreateCustomSeriesDialog$doCreateView$$inlined$doAfterTextChanged$1
            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence text, int start, int count, int after) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence text, int start, int before, int count) {
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable s) {
                DialogCreateSeriesBinding binding;
                DialogCreateSeriesBinding binding2;
                DialogCreateSeriesBinding binding3;
                DialogCreateSeriesBinding binding4;
                if (s == null || s.length() <= 0) {
                    binding = CreateCustomSeriesDialog.this.getBinding();
                    binding.doneTv.setEnabled(false);
                    binding2 = CreateCustomSeriesDialog.this.getBinding();
                    binding2.doneTv.setAlpha(0.5f);
                    return;
                }
                binding3 = CreateCustomSeriesDialog.this.getBinding();
                binding3.doneTv.setEnabled(true);
                binding4 = CreateCustomSeriesDialog.this.getBinding();
                binding4.doneTv.setAlpha(1.0f);
            }
        });
        getBinding().nameEt.requestFocus();
        DBManager.INSTANCE.getUserCustomSeriesItemDao().getCount().observe(this, new CreateCustomSeriesDialog$sam$androidx_lifecycle_Observer$0(new Function1<Integer, Unit>() { // from class: com.glority.android.picturexx.view.dialog.CreateCustomSeriesDialog$doCreateView$5
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                invoke2(num);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Integer num) {
                DialogCreateSeriesBinding binding;
                DialogCreateSeriesBinding binding2;
                DialogCreateSeriesBinding binding3;
                binding = CreateCustomSeriesDialog.this.getBinding();
                binding.nameEt.setText(CreateCustomSeriesDialog.this.getString(R.string.createseries_default_nametitle, String.valueOf(num.intValue() + 1)));
                binding2 = CreateCustomSeriesDialog.this.getBinding();
                EditText editText = binding2.nameEt;
                binding3 = CreateCustomSeriesDialog.this.getBinding();
                editText.setSelection(binding3.nameEt.getText().length());
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean doCreateView$lambda$0(CreateCustomSeriesDialog this$0, TextView textView, int i, KeyEvent keyEvent) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (i != 6) {
            return false;
        }
        this$0.logEvent(LogEvents.customseries_createnamedone_click, BundleKt.bundleOf(TuplesKt.to("from", this$0.from), TuplesKt.to(LogEventArguments.ARG_STRING_1, LogEvents.keyboard)));
        if (!this$0.getBinding().doneTv.isEnabled()) {
            return true;
        }
        Intrinsics.checkNotNull(textView);
        this$0.createSeries(textView);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void createSeries(View it) {
        GlProgressDialog glProgressDialog = GlProgressDialog.INSTANCE;
        Context context = it.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        final Dialog show$default = GlProgressDialog.show$default(glProgressDialog, context, true, (String) null, 0L, 12, (Object) null);
        SeriesRepository.INSTANCE.createCustomSeries(getBinding().nameEt.getText().toString()).observe(this, new CreateCustomSeriesDialog$sam$androidx_lifecycle_Observer$0(new Function1<Resource<? extends CreateUserCustomSeriesMessage>, Unit>() { // from class: com.glority.android.picturexx.view.dialog.CreateCustomSeriesDialog$createSeries$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Resource<? extends CreateUserCustomSeriesMessage> resource) {
                invoke2((Resource<CreateUserCustomSeriesMessage>) resource);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Resource<CreateUserCustomSeriesMessage> resource) {
                UserCustomSeries customSeries;
                Function1 function1;
                show$default.dismiss();
                if (resource.getStatus() == Status.ERROR) {
                    ToastUtils.showError(R.string.text_error, new Object[0]);
                    return;
                }
                if (resource.getStatus() == Status.SUCCESS) {
                    CreateUserCustomSeriesMessage data = resource.getData();
                    if (data != null && (customSeries = data.getCustomSeries()) != null) {
                        CreateCustomSeriesDialog createCustomSeriesDialog = this;
                        PersistDataUtils.INSTANCE.saveDefaultCustomSeriesId(Integer.valueOf(customSeries.getCustomSeriesId()));
                        function1 = createCustomSeriesDialog.onCreateSuccess;
                        if (function1 != null) {
                            function1.invoke(customSeries);
                        }
                    }
                    this.dismiss();
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
    public DialogCreateSeriesBinding getViewBinding(LayoutInflater inflater, ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        DialogCreateSeriesBinding inflate = DialogCreateSeriesBinding.inflate(inflater.cloneInContext(getActivity()), container, false);
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
