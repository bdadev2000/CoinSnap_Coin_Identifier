package com.glority.android.picturexx.view.dialog;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.core.os.BundleKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.navigation.compose.DialogNavigator;
import androidx.webkit.ProxyConfig;
import com.glority.android.cmsui2.util.GradingLevelScaleConvertor;
import com.glority.android.core.data.LogEventArguments;
import com.glority.android.core.ext.ViewExtensionsKt;
import com.glority.android.core.route.analysis.LogEventRequest;
import com.glority.android.core.utils.data.PersistData;
import com.glority.android.picturexx.business.R;
import com.glority.android.picturexx.business.databinding.DialogExportWriteinfoBinding;
import com.glority.android.picturexx.repository.CollectionRepository;
import com.glority.android.picturexx.splash.SplashGlobalLiveData;
import com.glority.android.xx.constants.Args;
import com.glority.android.xx.constants.LogEvents;
import com.glority.base.entity.OnActivityResultEntity;
import com.glority.base.routers.OpenBillingActivityRequest;
import com.glority.base.viewmodel.AppViewModel;
import com.glority.component.generatedAPI.kotlinAPI.vip.VipInfo;
import com.glority.network.exception.NetworkException;
import com.glority.network.model.Resource;
import com.glority.network.model.Status;
import com.glority.utils.data.RegexUtils;
import com.glority.utils.ui.ToastUtils;
import com.glority.utils.ui.ViewUtils;
import com.glority.widget.GlProgressDialog;
import com.glority.widget.GlTextView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.picturecoin.generatedAPI.kotlinAPI.collection.ExportCustomSeriesMessage;
import java.util.Calendar;
import java.util.Date;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: ExportWriteInfoDialog.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u000f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0005¢\u0006\u0002\u0010\u001aJ\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u000fH\u0002J\u0010\u0010\u001f\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020\u000fH\u0002J\b\u0010!\u001a\u00020\u000fH\u0002JG\u0010\"\u001a\u00020\u00122\b\u0010\u0016\u001a\u0004\u0018\u00010\u000f2\u0006\u0010#\u001a\u00020$2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010%\u001a\u00020&2\u0006\u0010\u0019\u001a\u00020\u0005H\u0002¢\u0006\u0002\u0010'J\b\u0010(\u001a\u00020\u0012H\u0002J\u0010\u0010)\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u000fH\u0002J\u0010\u0010*\u001a\u00020\u00122\u0006\u0010+\u001a\u00020,H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u0082D¢\u0006\u0002\n\u0000¨\u0006-"}, d2 = {"Lcom/glority/android/picturexx/view/dialog/ExportWriteInfoDialog;", "", "<init>", "()V", ExportWriteInfoDialog.keyExportEmail, "", ExportWriteInfoDialog.keyStartTime, "keyExportCount", "getKeyExportCount", "()Ljava/lang/String;", "keyExportCount$delegate", "Lkotlin/Lazy;", "progressDialog", "Landroid/app/Dialog;", "REQUEST_BILLING", "", "maxExportMonthly", "open", "", "context", "Landroid/content/Context;", "count", Args.seriesId, "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "from", "(Landroid/content/Context;ILjava/lang/Integer;Landroidx/lifecycle/LifecycleOwner;Ljava/lang/String;)V", "isSendEnable", "", "email", "exportCount", "isCoinCountLessThenMax", "coinCount", "getMaxCoinCount", "confirmSend", "binding", "Lcom/glority/android/picturexx/business/databinding/DialogExportWriteinfoBinding;", DialogNavigator.NAME, "Landroidx/appcompat/app/AlertDialog;", "(Ljava/lang/Integer;Lcom/glority/android/picturexx/business/databinding/DialogExportWriteinfoBinding;Landroidx/lifecycle/LifecycleOwner;ILandroid/content/Context;Landroidx/appcompat/app/AlertDialog;Ljava/lang/String;)V", "resetExportCount", "recordStartTime", "addRedStar", "view", "Landroid/widget/TextView;", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class ExportWriteInfoDialog {
    public static final String keyExportEmail = "keyExportEmail";
    public static final String keyStartTime = "keyStartTime";
    private static Dialog progressDialog;
    public static final ExportWriteInfoDialog INSTANCE = new ExportWriteInfoDialog();

    /* renamed from: keyExportCount$delegate, reason: from kotlin metadata */
    private static final Lazy keyExportCount = LazyKt.lazy(new Function0<String>() { // from class: com.glority.android.picturexx.view.dialog.ExportWriteInfoDialog$keyExportCount$2
        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            Date startAt;
            String l;
            VipInfo value = AppViewModel.INSTANCE.getInstance().getVipInfo().getValue();
            return (value == null || (startAt = value.getStartAt()) == null || (l = Long.valueOf(startAt.getTime()).toString()) == null) ? "keyExportCount" : l;
        }
    });
    private static final int REQUEST_BILLING = 100001;
    private static final int maxExportMonthly = 5000;
    public static final int $stable = 8;

    private ExportWriteInfoDialog() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getKeyExportCount() {
        return (String) keyExportCount.getValue();
    }

    public final void open(final Context context, final int count, final Integer seriesId, final LifecycleOwner lifecycleOwner, final String from) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(from, "from");
        resetExportCount();
        final int intValue = ((Number) PersistData.INSTANCE.get(getKeyExportCount(), 0)).intValue();
        int i = maxExportMonthly;
        new LogEventRequest(LogEvents.exportsetalert_show, BundleKt.bundleOf(TuplesKt.to(LogEventArguments.ARG_INTEGER_1, Integer.valueOf(i - intValue)))).post();
        final DialogExportWriteinfoBinding inflate = DialogExportWriteinfoBinding.inflate(LayoutInflater.from(context));
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        EditText emailEt = inflate.emailEt;
        Intrinsics.checkNotNullExpressionValue(emailEt, "emailEt");
        emailEt.addTextChangedListener(new TextWatcher() { // from class: com.glority.android.picturexx.view.dialog.ExportWriteInfoDialog$open$$inlined$doAfterTextChanged$1
            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence text, int start, int count2, int after) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence text, int start, int before, int count2) {
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable s) {
                String str;
                boolean isSendEnable;
                MaterialButton materialButton = DialogExportWriteinfoBinding.this.btnConfirm;
                ExportWriteInfoDialog exportWriteInfoDialog = ExportWriteInfoDialog.INSTANCE;
                if (s == null || (str = s.toString()) == null) {
                    str = "";
                }
                isSendEnable = exportWriteInfoDialog.isSendEnable(str, intValue);
                materialButton.setEnabled(isSendEnable);
            }
        });
        inflate.emailEt.setText((CharSequence) PersistData.INSTANCE.get(keyExportEmail, ""));
        final AlertDialog show = new MaterialAlertDialogBuilder(context).setView(inflate.getRoot()).setCancelable(false).setBackground(new ColorDrawable(context.getResources().getColor(R.color.transparent))).show();
        inflate.iconClose.setOnClickListener(new View.OnClickListener() { // from class: com.glority.android.picturexx.view.dialog.ExportWriteInfoDialog$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ExportWriteInfoDialog.open$lambda$1(AlertDialog.this, view);
            }
        });
        MaterialButton btnConfirm = inflate.btnConfirm;
        Intrinsics.checkNotNullExpressionValue(btnConfirm, "btnConfirm");
        ViewExtensionsKt.setSingleClickListener$default(btnConfirm, 0L, new Function1<View, Unit>() { // from class: com.glority.android.picturexx.view.dialog.ExportWriteInfoDialog$open$3
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
                new LogEventRequest(LogEvents.exportsetalert_export_click, BundleKt.bundleOf(TuplesKt.to(LogEventArguments.ARG_INTEGER_1, Integer.valueOf(count)), TuplesKt.to(LogEventArguments.ARG_STRING_1, inflate.emailEt.getText().toString()), TuplesKt.to("from", from))).post();
                PersistData.INSTANCE.set(ExportWriteInfoDialog.keyExportEmail, inflate.emailEt.getText().toString());
                ExportWriteInfoDialog exportWriteInfoDialog = ExportWriteInfoDialog.INSTANCE;
                Integer num = seriesId;
                DialogExportWriteinfoBinding dialogExportWriteinfoBinding = inflate;
                LifecycleOwner lifecycleOwner2 = lifecycleOwner;
                int i2 = intValue;
                Context context2 = context;
                AlertDialog dialog = show;
                Intrinsics.checkNotNullExpressionValue(dialog, "$dialog");
                exportWriteInfoDialog.confirmSend(num, dialogExportWriteinfoBinding, lifecycleOwner2, i2, context2, dialog, from);
            }
        }, 1, (Object) null);
        if (count > 1) {
            inflate.titleTv.setText(context.getString(R.string.coinlist_exportinfo_title_summaryplural, Integer.valueOf(count)));
        } else {
            inflate.titleTv.setText(context.getString(R.string.coinlist_exportinfo_title_summarysingle, Integer.valueOf(count)));
        }
        if (intValue >= i) {
            inflate.countTv.setText(context.getString(R.string.coinlist_exportinfo_caption_lastone, (i - intValue) + RemoteSettings.FORWARD_SLASH_STRING + i));
        } else {
            inflate.countTv.setText(context.getString(R.string.coinlist_exportinfo_caption_limit, (i - intValue) + RemoteSettings.FORWARD_SLASH_STRING + i));
        }
        SplashGlobalLiveData.INSTANCE.getOnMainActivityResult().observe(lifecycleOwner, new ExportWriteInfoDialog$sam$androidx_lifecycle_Observer$0(new Function1<OnActivityResultEntity, Unit>() { // from class: com.glority.android.picturexx.view.dialog.ExportWriteInfoDialog$open$4
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(OnActivityResultEntity onActivityResultEntity) {
                invoke2(onActivityResultEntity);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(OnActivityResultEntity it) {
                Intrinsics.checkNotNullParameter(it, "it");
                if (AlertDialog.this.isShowing()) {
                    if (AppViewModel.INSTANCE.isVip()) {
                        ExportWriteInfoDialog exportWriteInfoDialog = ExportWriteInfoDialog.INSTANCE;
                        Integer num = seriesId;
                        DialogExportWriteinfoBinding dialogExportWriteinfoBinding = inflate;
                        LifecycleOwner lifecycleOwner2 = lifecycleOwner;
                        int i2 = intValue;
                        Context context2 = context;
                        AlertDialog dialog = AlertDialog.this;
                        Intrinsics.checkNotNullExpressionValue(dialog, "$dialog");
                        exportWriteInfoDialog.confirmSend(num, dialogExportWriteinfoBinding, lifecycleOwner2, i2, context2, dialog, from);
                        return;
                    }
                    AlertDialog.this.dismiss();
                }
            }
        }));
        GlTextView emailInfoTv = inflate.emailInfoTv;
        Intrinsics.checkNotNullExpressionValue(emailInfoTv, "emailInfoTv");
        addRedStar(emailInfoTv);
        if (isCoinCountLessThenMax(count)) {
            return;
        }
        inflate.maxTv.setText(context.getString(R.string.coinlist_exportpromo_caption_capacitylimit, String.valueOf(getMaxCoinCount())));
        GlTextView maxTv = inflate.maxTv;
        Intrinsics.checkNotNullExpressionValue(maxTv, "maxTv");
        maxTv.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void open$lambda$1(AlertDialog alertDialog, View view) {
        new LogEventRequest(LogEvents.exportsetalert_close_click, null, 2, null).post();
        alertDialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isSendEnable(String email, int exportCount) {
        return RegexUtils.isEmail(email) && exportCount < maxExportMonthly;
    }

    private final boolean isCoinCountLessThenMax(int coinCount) {
        return coinCount <= getMaxCoinCount();
    }

    private final int getMaxCoinCount() {
        String obj;
        Integer intOrNull;
        Object obj2 = AppViewModel.INSTANCE.getInstance().getOtherConfig().get("collectionExportCountLimit");
        if (obj2 == null || (obj = obj2.toString()) == null || (intOrNull = StringsKt.toIntOrNull(obj)) == null) {
            return 50000;
        }
        return intOrNull.intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void confirmSend(Integer seriesId, DialogExportWriteinfoBinding binding, LifecycleOwner lifecycleOwner, final int exportCount, final Context context, AlertDialog dialog, String from) {
        if (AppViewModel.INSTANCE.isVip()) {
            CollectionRepository.INSTANCE.exportCollectionSeries(GradingLevelScaleConvertor.INSTANCE.getDefaultScaleType(AppViewModel.INSTANCE.getInstance().getCountryCode()).name(), seriesId, binding.emailEt.getText().toString()).observe(lifecycleOwner, new ExportWriteInfoDialog$sam$androidx_lifecycle_Observer$0(new Function1<Resource<? extends ExportCustomSeriesMessage>, Unit>() { // from class: com.glority.android.picturexx.view.dialog.ExportWriteInfoDialog$confirmSend$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Resource<? extends ExportCustomSeriesMessage> resource) {
                    invoke2((Resource<ExportCustomSeriesMessage>) resource);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Resource<ExportCustomSeriesMessage> resource) {
                    Dialog dialog2;
                    String keyExportCount2;
                    Dialog dialog3;
                    if (resource.getStatus() == Status.SUCCESS) {
                        ExportWriteInfoDialog.INSTANCE.recordStartTime(exportCount);
                        PersistData persistData = PersistData.INSTANCE;
                        keyExportCount2 = ExportWriteInfoDialog.INSTANCE.getKeyExportCount();
                        persistData.set(keyExportCount2, Integer.valueOf(exportCount + 1));
                        dialog3 = ExportWriteInfoDialog.progressDialog;
                        if (dialog3 != null) {
                            dialog3.dismiss();
                        }
                        ExportCustomSeriesSuccessDialog.INSTANCE.open(context);
                        return;
                    }
                    if (resource.getStatus() != Status.LOADING) {
                        dialog2 = ExportWriteInfoDialog.progressDialog;
                        if (dialog2 != null) {
                            dialog2.dismiss();
                        }
                        NetworkException exception = resource.getException();
                        if (exception != null && exception.getCode() == 1051) {
                            ToastUtils.showShort(R.string.coinlist_exportinfo_toast_exportinprogress);
                            return;
                        } else {
                            ToastUtils.showError(R.string.text_error, new Object[0]);
                            return;
                        }
                    }
                    ExportWriteInfoDialog exportWriteInfoDialog = ExportWriteInfoDialog.INSTANCE;
                    ExportWriteInfoDialog.progressDialog = GlProgressDialog.show$default(GlProgressDialog.INSTANCE, context, false, (String) null, 0L, 12, (Object) null);
                }
            }));
            ViewUtils.hideSoftInput(binding.emailEt);
            dialog.dismiss();
            Unit unit = Unit.INSTANCE;
            return;
        }
        if (AppViewModel.INSTANCE.getInstance().isVipInHistory()) {
            new OpenBillingActivityRequest(from, "100022", Integer.valueOf(REQUEST_BILLING)).post();
        } else {
            new OpenBillingActivityRequest(from, "100021", Integer.valueOf(REQUEST_BILLING)).post();
        }
    }

    private final void resetExportCount() {
        long longValue = ((Number) PersistData.INSTANCE.get(keyStartTime, 0L)).longValue();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(longValue);
        Calendar calendar2 = Calendar.getInstance();
        if (calendar.get(1) == calendar2.get(1) && calendar.get(2) == calendar2.get(2)) {
            return;
        }
        PersistData.INSTANCE.set(getKeyExportCount(), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void recordStartTime(int exportCount) {
        if (exportCount == 0) {
            PersistData.INSTANCE.set(keyStartTime, Long.valueOf(System.currentTimeMillis()));
        }
    }

    private final void addRedStar(TextView view) {
        String obj = view.getText().toString();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(obj + ProxyConfig.MATCH_ALL_SCHEMES);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(Color.parseColor("#FF6666")), obj.length(), spannableStringBuilder.length(), 34);
        view.setText(spannableStringBuilder);
    }
}
