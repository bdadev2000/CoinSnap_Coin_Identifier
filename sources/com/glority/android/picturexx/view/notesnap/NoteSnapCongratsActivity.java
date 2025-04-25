package com.glority.android.picturexx.view.notesnap;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.os.BundleKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import com.glority.android.core.data.LogEventArguments;
import com.glority.android.core.ext.ViewExtensionsKt;
import com.glority.android.core.route.analysis.LogEventRequest;
import com.glority.android.picturexx.business.R;
import com.glority.android.picturexx.business.databinding.ActivityBanknoteCongratsBinding;
import com.glority.android.picturexx.vm.NoteSnapViewModel;
import com.glority.android.ui.base.v2.BaseActivity;
import com.glority.android.xx.constants.LogEvents;
import com.glority.network.model.Resource;
import com.glority.network.model.Status;
import com.glority.utils.ui.ToastUtils;
import com.glority.widget.GlProgressDialog;
import com.picturecoin.generatedAPI.kotlinAPI.application.GetAndUseGooglePromoCodeMessage;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: NoteSnapCongratsActivity.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0014J\u0012\u0010\r\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0014J\b\u0010\u000e\u001a\u00020\nH\u0002J\b\u0010\u000f\u001a\u00020\nH\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0014J\b\u0010\u0012\u001a\u00020\u0002H\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/glority/android/picturexx/view/notesnap/NoteSnapCongratsActivity;", "Lcom/glority/android/ui/base/v2/BaseActivity;", "Lcom/glority/android/picturexx/business/databinding/ActivityBanknoteCongratsBinding;", "<init>", "()V", "vm", "Lcom/glority/android/picturexx/vm/NoteSnapViewModel;", "closeByOption", "", "beforeCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "doCreateView", "setHighLightText", "finish", "getLogPageName", "", "getViewBinding", "Companion", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class NoteSnapCongratsActivity extends BaseActivity<ActivityBanknoteCongratsBinding> {
    private static String from;
    private boolean closeByOption;
    private final NoteSnapViewModel vm = new NoteSnapViewModel();

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: NoteSnapCongratsActivity.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0005R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/glority/android/picturexx/view/notesnap/NoteSnapCongratsActivity$Companion;", "", "<init>", "()V", "from", "", "open", "", "context", "Landroid/content/Context;", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final void open(Context context, String from) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(from, "from");
            NoteSnapCongratsActivity.from = from;
            context.startActivity(new Intent(context, (Class<?>) NoteSnapCongratsActivity.class));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.glority.android.ui.base.v2.BaseActivity
    public void beforeCreate(Bundle savedInstanceState) {
        super.beforeCreate(savedInstanceState);
        updateCommonEventArgs(TuplesKt.to("from", from));
    }

    @Override // com.glority.android.ui.base.v2.BaseActivity
    protected void doCreateView(Bundle savedInstanceState) {
        TextView claimTv = getBinding().claimTv;
        Intrinsics.checkNotNullExpressionValue(claimTv, "claimTv");
        ViewExtensionsKt.setSingleClickListener$default(claimTv, 0L, new Function1<View, Unit>() { // from class: com.glority.android.picturexx.view.notesnap.NoteSnapCongratsActivity$doCreateView$1
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
                NoteSnapViewModel noteSnapViewModel;
                Intrinsics.checkNotNullParameter(it, "it");
                NoteSnapCongratsActivity.this.closeByOption = true;
                BaseActivity.logEvent$default(NoteSnapCongratsActivity.this, LogEvents.notesnapoffer_claim_click, null, 2, null);
                GlProgressDialog glProgressDialog = GlProgressDialog.INSTANCE;
                Context context = it.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                final Dialog show$default = GlProgressDialog.show$default(glProgressDialog, context, false, (String) null, 0L, 12, (Object) null);
                noteSnapViewModel = NoteSnapCongratsActivity.this.vm;
                LiveData<Resource<GetAndUseGooglePromoCodeMessage>> requestPromoCode = noteSnapViewModel.requestPromoCode();
                Object context2 = it.getContext();
                Intrinsics.checkNotNull(context2, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
                final NoteSnapCongratsActivity noteSnapCongratsActivity = NoteSnapCongratsActivity.this;
                requestPromoCode.observe((LifecycleOwner) context2, new NoteSnapCongratsActivity$sam$androidx_lifecycle_Observer$0(new Function1<Resource<? extends GetAndUseGooglePromoCodeMessage>, Unit>() { // from class: com.glority.android.picturexx.view.notesnap.NoteSnapCongratsActivity$doCreateView$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                        String str;
                        NoteSnapViewModel noteSnapViewModel2;
                        if (resource.getStatus() == Status.SUCCESS) {
                            NoteSnapCongratsActivity.this.finish();
                            show$default.dismiss();
                            GetAndUseGooglePromoCodeMessage data = resource.getData();
                            if (data == null || (str = data.getCode()) == null) {
                                str = "";
                            }
                            new LogEventRequest(LogEvents.notesnapoffer_claim_click, BundleKt.bundleOf(TuplesKt.to(LogEventArguments.ARG_STRING_2, str), TuplesKt.to("status", "success"))).post();
                            noteSnapViewModel2 = NoteSnapCongratsActivity.this.vm;
                            noteSnapViewModel2.toVerify(str, NoteSnapCongratsActivity.this);
                            return;
                        }
                        if (resource.getStatus() == Status.ERROR) {
                            new LogEventRequest(LogEvents.notesnapoffer_claim_click, BundleKt.bundleOf(TuplesKt.to("status", "failed"))).post();
                            show$default.dismiss();
                            ToastUtils.showError(R.string.text_failed, new Object[0]);
                        }
                    }
                }));
            }
        }, 1, (Object) null);
        TextView notInterestedTv = getBinding().notInterestedTv;
        Intrinsics.checkNotNullExpressionValue(notInterestedTv, "notInterestedTv");
        ViewExtensionsKt.setSingleClickListener$default(notInterestedTv, 0L, new Function1<View, Unit>() { // from class: com.glority.android.picturexx.view.notesnap.NoteSnapCongratsActivity$doCreateView$2
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
                NoteSnapViewModel noteSnapViewModel;
                Intrinsics.checkNotNullParameter(it, "it");
                NoteSnapCongratsActivity.this.closeByOption = true;
                noteSnapViewModel = NoteSnapCongratsActivity.this.vm;
                noteSnapViewModel.notInterested();
                BaseActivity.logEvent$default(NoteSnapCongratsActivity.this, LogEvents.notesnapoffer_close_click, null, 2, null);
                NoteSnapCongratsActivity.this.finish();
            }
        }, 1, (Object) null);
        ImageView tvCancel = getBinding().tvCancel;
        Intrinsics.checkNotNullExpressionValue(tvCancel, "tvCancel");
        ViewExtensionsKt.setSingleClickListener$default(tvCancel, 0L, new Function1<View, Unit>() { // from class: com.glority.android.picturexx.view.notesnap.NoteSnapCongratsActivity$doCreateView$3
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
                NoteSnapCongratsActivity.this.finish();
            }
        }, 1, (Object) null);
        setHighLightText();
    }

    private final void setHighLightText() {
        int indexOf$default = StringsKt.indexOf$default((CharSequence) r0, "30 days", 0, false, 6, (Object) null);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) r0);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(Color.parseColor("#FFFFE712")), indexOf$default, indexOf$default + 7, 33);
        getBinding().contentTv.setText(new SpannedString(spannableStringBuilder));
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        from = null;
    }

    @Override // com.glority.android.ui.base.v2.BaseActivity
    protected String getLogPageName() {
        return LogEvents.notesnapoffer;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.glority.android.ui.base.v2.BaseActivity
    public ActivityBanknoteCongratsBinding getViewBinding() {
        ActivityBanknoteCongratsBinding inflate = ActivityBanknoteCongratsBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return inflate;
    }
}
