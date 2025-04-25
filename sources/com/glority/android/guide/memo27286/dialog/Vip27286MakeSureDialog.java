package com.glority.android.guide.memo27286.dialog;

import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import com.glority.android.core.ext.ViewExtensionsKt;
import com.glority.android.core.route.guide.BillingSetPriceBoldRequest;
import com.glority.android.core.route.guide.BillingUIGetCurrencyCodeRequest;
import com.glority.android.core.route.guide.BillingUIGetPriceBySkuRequest;
import com.glority.android.guide.iface.IBillingListener;
import com.glority.android.guide.memo27286.R;
import com.glority.android.guide.memo27286.activity.Vip27286AActivity;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: Vip27286MakeSureDialog.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J&\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\b\u0010\u000f\u001a\u00020\u0005H\u0016J\u001a\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\b\u0010\u0012\u001a\u00020\u0005H\u0016¨\u0006\u0013"}, d2 = {"Lcom/glority/android/guide/memo27286/dialog/Vip27286MakeSureDialog;", "Landroidx/fragment/app/DialogFragment;", "Lcom/glority/android/guide/iface/IBillingListener;", "()V", "changePrice", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onStart", "onViewCreated", "view", "purchaseSuccess", "guide-ui_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes10.dex */
public final class Vip27286MakeSureDialog extends DialogFragment implements IBillingListener {
    private HashMap _$_findViewCache;

    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this._$_findViewCache;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this._$_findViewCache == null) {
            this._$_findViewCache = new HashMap();
        }
        View view = (View) this._$_findViewCache.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View rootView = getRootView();
        if (rootView == null) {
            return null;
        }
        View findViewById = rootView.findViewById(i);
        this._$_findViewCache.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.glority.android.guide.iface.IBillingListener
    public void changePrice() {
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // com.glority.android.guide.iface.IBillingListener
    public void purchaseSuccess() {
    }

    @Override // com.glority.android.guide.iface.IBillingListener
    public void changePayUi(boolean z) {
        IBillingListener.DefaultImpls.changePayUi(this, z);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setStyle(1, R.style.ThemeOverlay_AppCompat_Dialog);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(R.layout.bui_memo27286_fragment_make_sure, container, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        String string = getString(R.string.bui_memo_27286_how_does_the_free_trial_work);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.bui_m…does_the_free_trial_work)");
        TextView tv_how_free_trial = (TextView) _$_findCachedViewById(R.id.tv_how_free_trial);
        Intrinsics.checkNotNullExpressionValue(tv_how_free_trial, "tv_how_free_trial");
        String str = string;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        String string2 = getString(R.string.bui_memo_27286_how_does_the_free_trial_work_color);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.bui_m…he_free_trial_work_color)");
        int indexOf$default = StringsKt.indexOf$default((CharSequence) str, string2, 0, false, 6, (Object) null);
        if (indexOf$default >= 0) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(getResources().getColor(R.color.bui_memo27286_color_faaf19)), indexOf$default, string2.length() + indexOf$default, 33);
        }
        Unit unit = Unit.INSTANCE;
        tv_how_free_trial.setText(spannableStringBuilder);
        TextView tv_try_trial = (TextView) _$_findCachedViewById(R.id.tv_try_trial);
        Intrinsics.checkNotNullExpressionValue(tv_try_trial, "tv_try_trial");
        ViewExtensionsKt.setSingleClickListener$default(tv_try_trial, 0L, new Function1<View, Unit>() { // from class: com.glority.android.guide.memo27286.dialog.Vip27286MakeSureDialog$onViewCreated$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view2) {
                invoke2(view2);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(View it) {
                Intrinsics.checkNotNullParameter(it, "it");
                FragmentActivity activity = Vip27286MakeSureDialog.this.getActivity();
                if (!(activity instanceof Vip27286AActivity)) {
                    activity = null;
                }
                Vip27286AActivity vip27286AActivity = (Vip27286AActivity) activity;
                if (vip27286AActivity != null) {
                    vip27286AActivity.tryTrial();
                }
            }
        }, 1, (Object) null);
        FragmentActivity activity = getActivity();
        if (!(activity instanceof Vip27286AActivity)) {
            activity = null;
        }
        Vip27286AActivity vip27286AActivity = (Vip27286AActivity) activity;
        if (vip27286AActivity != null) {
            TextView tv_7_day_free = (TextView) _$_findCachedViewById(R.id.tv_7_day_free);
            Intrinsics.checkNotNullExpressionValue(tv_7_day_free, "tv_7_day_free");
            new BillingSetPriceBoldRequest(vip27286AActivity, tv_7_day_free, Intrinsics.stringPlus(new BillingUIGetCurrencyCodeRequest(vip27286AActivity.getYearlySKU(), null, 2, null).toResult(), " "), new BillingUIGetPriceBySkuRequest(vip27286AActivity.getYearlySKU(), null, 2, null).toResult()).post();
        }
        ImageView iv_close = (ImageView) _$_findCachedViewById(R.id.iv_close);
        Intrinsics.checkNotNullExpressionValue(iv_close, "iv_close");
        ViewExtensionsKt.setSingleClickListener$default(iv_close, 0L, new Function1<View, Unit>() { // from class: com.glority.android.guide.memo27286.dialog.Vip27286MakeSureDialog$onViewCreated$4
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view2) {
                invoke2(view2);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(View it) {
                Intrinsics.checkNotNullParameter(it, "it");
                Vip27286MakeSureDialog.this.dismiss();
            }
        }, 1, (Object) null);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        Dialog it = getDialog();
        if (it != null) {
            Intrinsics.checkNotNullExpressionValue(it, "it");
            Window window = it.getWindow();
            if (window != null) {
                window.setLayout(-1, -1);
                window.setBackgroundDrawable(new ColorDrawable());
            }
        }
    }
}
