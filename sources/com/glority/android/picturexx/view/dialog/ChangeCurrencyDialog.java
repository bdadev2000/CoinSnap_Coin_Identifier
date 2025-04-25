package com.glority.android.picturexx.view.dialog;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import androidx.appcompat.app.AlertDialog;
import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.glority.android.adapterhelper.BaseQuickAdapter;
import com.glority.android.core.app.AppContext;
import com.glority.android.core.data.LogEventArguments;
import com.glority.android.core.ext.ViewExtensionsKt;
import com.glority.android.picturexx.adapter.ChangeCurrencyAdapter;
import com.glority.android.picturexx.business.R;
import com.glority.android.picturexx.business.databinding.DialogChangeCurrencyBinding;
import com.glority.android.picturexx.repository.CurrencyRepository;
import com.glority.android.picturexx.utils.CoinConfigUtils;
import com.glority.android.picturexx.utils.CoinSPUtils;
import com.glority.android.ui.base.LocaleManager;
import com.glority.android.ui.base.v2.BaseBottomSheetDialogFragment;
import com.glority.android.xx.constants.LogEvents;
import com.glority.base.entity.BaseMultiEntity;
import com.glority.base.server.CacheThenNetworkRequest;
import com.glority.utils.stability.LogUtils;
import com.glority.widget.GlTextView;
import com.glority.widget.alert.GlAlert;
import com.glority.widget.alert.GlAlertOnClickListener;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.picturecoin.generatedAPI.kotlinAPI.config.CountryInfo;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;

/* compiled from: ChangeCurrencyDialog.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000  2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001 B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\nH\u0002J\u0012\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0014J \u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014H\u0002J\b\u0010\u0017\u001a\u00020\u000fH\u0016J\b\u0010\u0018\u001a\u00020\u0014H\u0014J\u001a\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0014J\u0012\u0010\u001e\u001a\u00020\u001f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006!"}, d2 = {"Lcom/glority/android/picturexx/view/dialog/ChangeCurrencyDialog;", "Lcom/glority/android/ui/base/v2/BaseBottomSheetDialogFragment;", "Lcom/glority/android/picturexx/business/databinding/DialogChangeCurrencyBinding;", "<init>", "()V", "adapter", "Lcom/glority/android/picturexx/adapter/ChangeCurrencyAdapter;", "getAdapter", "()Lcom/glority/android/picturexx/adapter/ChangeCurrencyAdapter;", "formatData", "", "Lcom/glority/base/entity/BaseMultiEntity;", LogEvents.result, "Lcom/picturecoin/generatedAPI/kotlinAPI/config/CountryInfo;", "doCreateView", "", "savedInstanceState", "Landroid/os/Bundle;", "showConfirmDialog", "name", "", "currencySymbol", "country", "onStart", "getLogPageName", "getViewBinding", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onCreateDialog", "Landroid/app/Dialog;", "Companion", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class ChangeCurrencyDialog extends BaseBottomSheetDialogFragment<DialogChangeCurrencyBinding> {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final ChangeCurrencyAdapter adapter = new ChangeCurrencyAdapter();

    /* compiled from: ChangeCurrencyDialog.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/glority/android/picturexx/view/dialog/ChangeCurrencyDialog$Companion;", "", "<init>", "()V", "open", "", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final void open(FragmentManager fragmentManager) {
            Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
            try {
                Integer.valueOf(fragmentManager.beginTransaction().add(new ChangeCurrencyDialog(), "ChangeCurrencyDialog").commitAllowingStateLoss());
            } catch (Exception e) {
                if (AppContext.INSTANCE.isDebugMode()) {
                    LogUtils.e(Log.getStackTraceString(e));
                }
            }
        }
    }

    public final ChangeCurrencyAdapter getAdapter() {
        return this.adapter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<BaseMultiEntity> formatData(List<CountryInfo> result) {
        List<CountryInfo> list = result;
        if (list == null || list.isEmpty()) {
            return new ArrayList();
        }
        List<CountryInfo> sortedWith = CollectionsKt.sortedWith(result, new Comparator() { // from class: com.glority.android.picturexx.view.dialog.ChangeCurrencyDialog$formatData$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt.compareValues(((CountryInfo) t).getName(), ((CountryInfo) t2).getName());
            }
        });
        ArrayList arrayList = new ArrayList();
        String settingCurrencyCountryCode = CoinSPUtils.INSTANCE.getSettingCurrencyCountryCode();
        if (settingCurrencyCountryCode == null) {
            settingCurrencyCountryCode = LocaleManager.getInstance().getCountry();
        }
        String str = null;
        for (CountryInfo countryInfo : sortedWith) {
            Character firstOrNull = StringsKt.firstOrNull(countryInfo.getName());
            if (!Intrinsics.areEqual(firstOrNull != null ? firstOrNull.toString() : null, str)) {
                Character firstOrNull2 = StringsKt.firstOrNull(countryInfo.getName());
                str = firstOrNull2 != null ? firstOrNull2.toString() : null;
                arrayList.add(new BaseMultiEntity(2, new ChangeCurrencyAdapter.LabelItem(str == null ? "" : str)));
            }
            arrayList.add(new BaseMultiEntity(1, new ChangeCurrencyAdapter.CurrencyItem(Intrinsics.areEqual(settingCurrencyCountryCode, countryInfo.getCountryCode()), countryInfo)));
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List, T] */
    @Override // com.glority.android.ui.base.v2.BaseBottomSheetDialogFragment
    protected void doCreateView(Bundle savedInstanceState) {
        getBinding().rv.setAdapter(this.adapter);
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = CollectionsKt.emptyList();
        EditText et = getBinding().et;
        Intrinsics.checkNotNullExpressionValue(et, "et");
        et.addTextChangedListener(new TextWatcher() { // from class: com.glority.android.picturexx.view.dialog.ChangeCurrencyDialog$doCreateView$$inlined$doOnTextChanged$1
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable s) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence text, int start, int count, int after) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence text, int start, int before, int count) {
                List formatData;
                if (text == null) {
                    return;
                }
                ChangeCurrencyAdapter adapter = ChangeCurrencyDialog.this.getAdapter();
                ChangeCurrencyDialog changeCurrencyDialog = ChangeCurrencyDialog.this;
                Iterable iterable = (Iterable) objectRef.element;
                ArrayList arrayList = new ArrayList();
                for (Object obj : iterable) {
                    CountryInfo countryInfo = (CountryInfo) obj;
                    if (StringsKt.contains((CharSequence) countryInfo.getName(), text, true) || StringsKt.contains((CharSequence) countryInfo.getCurrencyCode(), text, true) || StringsKt.contains((CharSequence) countryInfo.getCountryCode(), text, true)) {
                        arrayList.add(obj);
                    }
                }
                formatData = changeCurrencyDialog.formatData(arrayList);
                adapter.setNewData(formatData);
            }
        });
        CurrencyRepository.INSTANCE.getExpertPicksMessage().observe(this, new ChangeCurrencyDialog$sam$androidx_lifecycle_Observer$0(new Function1<CacheThenNetworkRequest.ResultData<List<? extends CountryInfo>>, Unit>() { // from class: com.glority.android.picturexx.view.dialog.ChangeCurrencyDialog$doCreateView$2
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(CacheThenNetworkRequest.ResultData<List<? extends CountryInfo>> resultData) {
                invoke2((CacheThenNetworkRequest.ResultData<List<CountryInfo>>) resultData);
                return Unit.INSTANCE;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(CacheThenNetworkRequest.ResultData<List<CountryInfo>> resultData) {
                List formatData;
                Ref.ObjectRef<List<CountryInfo>> objectRef2 = objectRef;
                List<CountryInfo> result = resultData.getResult();
                T t = result;
                if (result == null) {
                    t = CollectionsKt.emptyList();
                }
                objectRef2.element = t;
                formatData = this.formatData(resultData.getResult());
                this.getAdapter().setNewData(formatData);
            }
        }));
        this.adapter.setOnItemClickListener(new Function3<BaseQuickAdapter<?, ?>, View, Integer, Unit>() { // from class: com.glority.android.picturexx.view.dialog.ChangeCurrencyDialog$doCreateView$3
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(BaseQuickAdapter<?, ?> baseQuickAdapter, View view, Integer num) {
                invoke(baseQuickAdapter, view, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(BaseQuickAdapter<?, ?> a2, View view, int i) {
                Intrinsics.checkNotNullParameter(a2, "a");
                Intrinsics.checkNotNullParameter(view, "view");
                Object item = ((BaseMultiEntity) ChangeCurrencyDialog.this.getAdapter().getData().get(i)).getItem();
                if (item instanceof ChangeCurrencyAdapter.CurrencyItem) {
                    ChangeCurrencyAdapter.CurrencyItem currencyItem = (ChangeCurrencyAdapter.CurrencyItem) item;
                    if (currencyItem.getSelected()) {
                        return;
                    }
                    ChangeCurrencyDialog.this.showConfirmDialog(currencyItem.getCountryInfo().getName(), currencyItem.getCountryInfo().getSymbol(), currencyItem.getCountryInfo().getCountryCode());
                }
            }
        });
        GlTextView tvCancel = getBinding().tvCancel;
        Intrinsics.checkNotNullExpressionValue(tvCancel, "tvCancel");
        ViewExtensionsKt.setSingleClickListener$default(tvCancel, 0L, new Function1<View, Unit>() { // from class: com.glority.android.picturexx.view.dialog.ChangeCurrencyDialog$doCreateView$4
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
                BaseBottomSheetDialogFragment.logEvent$default(ChangeCurrencyDialog.this, LogEvents.settings_currencycancel_click, null, 2, null);
                ChangeCurrencyDialog.this.dismiss();
            }
        }, 1, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showConfirmDialog(String name, String currencySymbol, final String country) {
        Context context = getContext();
        if (context != null) {
            GlAlert.Builder message = new GlAlert.Builder(context, GlAlert.DialogStyle.CUSTOM, 0, 4, null).setMessage(R.string.settings_switchcurrency_popup_title);
            String string = getString(R.string.bui_text_cancel);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            GlAlert.Builder negativeButton$default = GlAlert.Builder.setNegativeButton$default(message, string, new GlAlertOnClickListener() { // from class: com.glority.android.picturexx.view.dialog.ChangeCurrencyDialog$showConfirmDialog$1$1
                @Override // com.glority.widget.alert.GlAlertOnClickListener
                public void onClick(AlertDialog glAlert) {
                    Intrinsics.checkNotNullParameter(glAlert, "glAlert");
                    glAlert.dismiss();
                }
            }, (GlAlert.ButtonStyle) null, 4, (Object) null);
            String string2 = getString(R.string.settings_switchcurrency_popup_msg, name + "(" + currencySymbol + ")");
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            GlAlert.Builder.setPositiveButton$default(negativeButton$default, string2, new GlAlertOnClickListener() { // from class: com.glority.android.picturexx.view.dialog.ChangeCurrencyDialog$showConfirmDialog$1$2
                @Override // com.glority.widget.alert.GlAlertOnClickListener
                public void onClick(AlertDialog glAlert) {
                    Intrinsics.checkNotNullParameter(glAlert, "glAlert");
                    ChangeCurrencyDialog.this.logEvent(LogEvents.settings_currencychange_click, BundleKt.bundleOf(TuplesKt.to(LogEventArguments.ARG_STRING_1, CoinConfigUtils.INSTANCE.getCountryCode()), TuplesKt.to(LogEventArguments.ARG_STRING_2, country)));
                    CoinSPUtils.INSTANCE.setSettingCurrencyCountryCode(country);
                    glAlert.dismiss();
                    ChangeCurrencyDialog.this.dismiss();
                }
            }, (GlAlert.ButtonStyle) null, 4, (Object) null).show();
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        Window window;
        Window window2;
        try {
            super.onStart();
            View view = getRootView();
            Object parent = view != null ? view.getParent() : null;
            Intrinsics.checkNotNull(parent, "null cannot be cast to non-null type android.view.View");
            BottomSheetBehavior from = BottomSheetBehavior.from((View) parent);
            Intrinsics.checkNotNullExpressionValue(from, "from(...)");
            FragmentActivity activity = getActivity();
            if (activity != null && (window2 = activity.getWindow()) != null) {
                window2.setLayout(-1, -1);
            }
            FragmentActivity activity2 = getActivity();
            if (activity2 != null && (window = activity2.getWindow()) != null) {
                window.setGravity(80);
            }
            from.setState(3);
            from.setHideable(true);
            Dialog dialog = getDialog();
            if (dialog != null) {
                Intrinsics.checkNotNull(dialog, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
                ((BottomSheetDialog) dialog).setDismissWithAnimation(true);
                Unit unit = Unit.INSTANCE;
            }
        } catch (Exception e) {
            if (AppContext.INSTANCE.isDebugMode()) {
                LogUtils.e(Log.getStackTraceString(e));
            }
        }
    }

    @Override // com.glority.android.ui.base.v2.BaseBottomSheetDialogFragment
    protected String getLogPageName() {
        return "changecurrencydialog";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.glority.android.ui.base.v2.BaseBottomSheetDialogFragment
    public DialogChangeCurrencyBinding getViewBinding(LayoutInflater inflater, ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        DialogChangeCurrencyBinding inflate = DialogChangeCurrencyBinding.inflate(inflater.cloneInContext(getContext()), container, false);
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
