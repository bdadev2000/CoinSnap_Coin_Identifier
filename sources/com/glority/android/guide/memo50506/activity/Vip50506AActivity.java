package com.glority.android.guide.memo50506.activity;

import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.StrikethroughSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.core.data.LogEventArguments;
import com.glority.android.core.route.guide.BillingUIGetCurrencyCodeRequest;
import com.glority.android.core.route.guide.BillingUIGetPriceBySkuRequest;
import com.glority.android.core.route.guide.BillingUIScrollToDataPolicyRequest;
import com.glority.android.core.route.guide.BillingUISetPolicyClickRequest;
import com.glority.android.core.route.guide.GuidePurchaseRequest;
import com.glority.android.core.route.guide.GuideRestoreRequest;
import com.glority.android.guide.base.BasePurchaseActivity;
import com.glority.android.guide.memo50506.R;
import com.glority.android.uimaker.UIMaker;
import com.glority.android.uimaker.parameter.ClickEnum;
import com.glority.android.uimaker.parameter.IUIMakerView;
import com.glority.android.uimaker.parameter.UiMakerOnClickListener;
import com.glority.widget.purchase.policy.GlBasePolicyView;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.SimpleExoPlayer;
import com.google.android.exoplayer2.ui.PlayerView;
import java.io.InputStream;
import java.io.InputStreamReader;
import kotlin.Metadata;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.text.Charsets;

/* compiled from: Vip50506AActivity.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0004H\u0002J\b\u0010\u0013\u001a\u00020\nH\u0002J\u0012\u0010\u0014\u001a\u00020\u00102\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0014J\b\u0010\u0017\u001a\u00020\u0010H\u0014J\b\u0010\u0018\u001a\u00020\u0010H\u0014J\b\u0010\u0019\u001a\u00020\u0010H\u0002J\b\u0010\u001a\u001a\u00020\u0010H\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/glority/android/guide/memo50506/activity/Vip50506AActivity;", "Lcom/glority/android/guide/base/BasePurchaseActivity;", "()V", "currentSku", "", "jsonFile", "monthlySKU", "newPurchaseView", "Landroid/view/View;", "playerView", "Lcom/google/android/exoplayer2/ui/PlayerView;", "rootView", "uiMaker", "Lcom/glority/android/uimaker/UIMaker;", "yearlySKU", "changePrice", "", "changeSKU", LogEventArguments.ARG_SKU, "getPlayerView", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onPause", "onResume", "replaceHeader", "replacePurchase", "showBackPressedCloseRetain", "", "guide-ui_release"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes10.dex */
public final class Vip50506AActivity extends BasePurchaseActivity {
    private View newPurchaseView;
    private PlayerView playerView;
    private View rootView;
    private UIMaker uiMaker;
    private String yearlySKU = "sub_yearly";
    private String monthlySKU = "sub_month_pro";
    private final String jsonFile = "505061.json";
    private String currentSku = "sub_yearly";

    @Override // com.glority.android.guide.base.BasePurchaseActivity
    protected boolean showBackPressedCloseRetain() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.glority.android.guide.base.BasePurchaseActivity, com.glority.android.core.route.RouteableActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        UIMaker uIMaker = new UIMaker(this, true);
        this.uiMaker = uIMaker;
        InputStream open = getAssets().open(this.jsonFile);
        Intrinsics.checkNotNullExpressionValue(open, "assets.open(jsonFile)");
        View view = uIMaker.toView(TextStreamsKt.readText(new InputStreamReader(open, Charsets.UTF_8)), new UiMakerOnClickListener() { // from class: com.glority.android.guide.memo50506.activity.Vip50506AActivity$onCreate$1
            @Override // com.glority.android.uimaker.parameter.UiMakerOnClickListener
            public void onClickByTag(String str) {
                UiMakerOnClickListener.DefaultImpls.onClickByTag(this, str);
            }

            @Override // com.glority.android.uimaker.parameter.UiMakerOnClickListener
            public void onClick(ClickEnum clickEnum) {
                Intrinsics.checkNotNullParameter(clickEnum, "clickEnum");
                if (clickEnum == ClickEnum.restore) {
                    new GuideRestoreRequest(false, null, 3, null).post();
                } else if (clickEnum == ClickEnum.close) {
                    Vip50506AActivity.this.trackClose();
                    Vip50506AActivity.this.postUiCloseRequest();
                }
            }
        });
        this.rootView = view;
        UIMaker uIMaker2 = null;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootView");
            view = null;
        }
        setContentView(view, new ViewGroup.LayoutParams(-1, -1));
        replacePurchase();
        UIMaker uIMaker3 = this.uiMaker;
        if (uIMaker3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("uiMaker");
            uIMaker3 = null;
        }
        UIMaker uIMaker4 = this.uiMaker;
        if (uIMaker4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("uiMaker");
            uIMaker4 = null;
        }
        IUIMakerView findViewByUiMakerTag = uIMaker3.findViewByUiMakerTag("GlBasePolicyView", uIMaker4.getScrollView());
        Intrinsics.checkNotNull(findViewByUiMakerTag);
        TextView policyContentView = ((GlBasePolicyView) findViewByUiMakerTag).getPolicyContentView();
        replaceHeader();
        UIMaker uIMaker5 = this.uiMaker;
        if (uIMaker5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("uiMaker");
        } else {
            uIMaker2 = uIMaker5;
        }
        new BillingUIScrollToDataPolicyRequest(uIMaker2.getScrollView(), policyContentView, null, 4, null).post();
        new BillingUISetPolicyClickRequest(this, policyContentView, 1).post();
    }

    private final void replacePurchase() {
        View view = this.rootView;
        View view2 = null;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootView");
            view = null;
        }
        View findViewWithTag = view.findViewWithTag("icon_purchase_holder");
        View inflate = getLayoutInflater().inflate(R.layout.bui_memo50506_purchase, (ViewGroup) null);
        Intrinsics.checkNotNullExpressionValue(inflate, "layoutInflater.inflate(R…memo50506_purchase, null)");
        this.newPurchaseView = inflate;
        if (inflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("newPurchaseView");
            inflate = null;
        }
        inflate.setId(findViewWithTag.getId());
        ViewParent parent = findViewWithTag.getParent();
        Intrinsics.checkNotNull(parent, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) parent;
        viewGroup.removeView(findViewWithTag);
        View view3 = this.newPurchaseView;
        if (view3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("newPurchaseView");
            view3 = null;
        }
        viewGroup.addView(view3, findViewWithTag.getLayoutParams());
        View view4 = this.newPurchaseView;
        if (view4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("newPurchaseView");
            view4 = null;
        }
        View findViewById = view4.findViewById(R.id.year_ll);
        View view5 = this.newPurchaseView;
        if (view5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("newPurchaseView");
            view5 = null;
        }
        View findViewById2 = view5.findViewById(R.id.month_ll);
        findViewById.setOnClickListener(new View.OnClickListener() { // from class: com.glority.android.guide.memo50506.activity.Vip50506AActivity$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view6) {
                Vip50506AActivity.replacePurchase$lambda$0(Vip50506AActivity.this, view6);
            }
        });
        findViewById2.setOnClickListener(new View.OnClickListener() { // from class: com.glority.android.guide.memo50506.activity.Vip50506AActivity$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view6) {
                Vip50506AActivity.replacePurchase$lambda$1(Vip50506AActivity.this, view6);
            }
        });
        View view6 = this.newPurchaseView;
        if (view6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("newPurchaseView");
        } else {
            view2 = view6;
        }
        view2.findViewById(R.id.continue_tv).setOnClickListener(new View.OnClickListener() { // from class: com.glority.android.guide.memo50506.activity.Vip50506AActivity$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view7) {
                Vip50506AActivity.replacePurchase$lambda$2(Vip50506AActivity.this, view7);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void replacePurchase$lambda$0(Vip50506AActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.changeSKU(this$0.yearlySKU);
        new GuidePurchaseRequest(this$0.yearlySKU, null, 2, null).post();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void replacePurchase$lambda$1(Vip50506AActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.changeSKU(this$0.monthlySKU);
        new GuidePurchaseRequest(this$0.monthlySKU, null, 2, null).post();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void replacePurchase$lambda$2(Vip50506AActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        new GuidePurchaseRequest(this$0.currentSku, null, 2, null).post();
    }

    @Override // com.glority.android.guide.iface.IBillingListener
    public void changePrice() {
        View view = null;
        String result = new BillingUIGetCurrencyCodeRequest(this.yearlySKU, null, 2, null).toResult();
        if (result == null) {
            return;
        }
        String result2 = new BillingUIGetPriceBySkuRequest(this.yearlySKU, null, 2, null).toResult();
        if (result2 == null) {
            result2 = "";
        }
        String result3 = new BillingUIGetPriceBySkuRequest(this.monthlySKU, null, 2, null).toResult();
        String str = result3 != null ? result3 : "";
        int roundToInt = MathKt.roundToInt((1 - ((Float.parseFloat(result2) / 12) / Float.parseFloat(str))) * 100);
        View view2 = this.newPurchaseView;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("newPurchaseView");
            view2 = null;
        }
        ((TextView) view2.findViewById(R.id.off_tv)).setText(roundToInt + "%");
        float parseFloat = ((int) ((Float.parseFloat(result2) / 12.0d) * 100)) / 100.0f;
        View view3 = this.newPurchaseView;
        if (view3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("newPurchaseView");
            view3 = null;
        }
        ((TextView) view3.findViewById(R.id.year_price_tv)).setText(getString(R.string.bui_memo50506_8, new Object[]{result + parseFloat}));
        View view4 = this.newPurchaseView;
        if (view4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("newPurchaseView");
            view4 = null;
        }
        ((TextView) view4.findViewById(R.id.month_price_tv)).setText(getString(R.string.bui_memo50506_8, new Object[]{result + str}));
        String string = getString(R.string.bui_memo50506_7, new Object[]{result + str});
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.bui_m…7,\"$code${monthlyPrice}\")");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string + " " + result + result2);
        spannableStringBuilder.setSpan(new StrikethroughSpan(), 0, string.length(), 18);
        View view5 = this.newPurchaseView;
        if (view5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("newPurchaseView");
            view5 = null;
        }
        ((TextView) view5.findViewById(R.id.year_info_tv)).setText(spannableStringBuilder);
        View view6 = this.newPurchaseView;
        if (view6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("newPurchaseView");
            view6 = null;
        }
        ((TextView) view6.findViewById(R.id.month_info_tv)).setText(result + str);
        View view7 = this.rootView;
        if (view7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootView");
        } else {
            view = view7;
        }
        View findViewById = view.findViewById(R.id.title_tv);
        Intrinsics.checkNotNullExpressionValue(findViewById, "rootView.findViewById<View>(R.id.title_tv)");
        findViewById.setVisibility(8);
    }

    private final void changeSKU(String sku) {
        this.currentSku = sku;
        View view = this.newPurchaseView;
        View view2 = null;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("newPurchaseView");
            view = null;
        }
        View findViewById = view.findViewById(R.id.month_ll);
        View view3 = this.newPurchaseView;
        if (view3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("newPurchaseView");
        } else {
            view2 = view3;
        }
        View findViewById2 = view2.findViewById(R.id.year_ll);
        findViewById.setBackgroundResource(Intrinsics.areEqual(sku, this.monthlySKU) ? R.drawable.bui_memo50506_select : R.drawable.bui_memo50506_unselect);
        findViewById2.setBackgroundResource(Intrinsics.areEqual(sku, this.yearlySKU) ? R.drawable.bui_memo50506_select : R.drawable.bui_memo50506_unselect);
    }

    private final PlayerView getPlayerView() {
        Vip50506AActivity vip50506AActivity = this;
        PlayerView playerView = new PlayerView(vip50506AActivity);
        playerView.setResizeMode(4);
        SimpleExoPlayer build = new SimpleExoPlayer.Builder(vip50506AActivity).build();
        Intrinsics.checkNotNullExpressionValue(build, "Builder(this).build()");
        build.setMediaItem(MediaItem.fromUri(Uri.parse("asset:///md5_601362d89b2a1f9746c141ea27075d99.mp4")));
        build.prepare();
        build.setPlayWhenReady(true);
        build.setRepeatMode(2);
        playerView.setUseController(false);
        playerView.hideController();
        playerView.setPlayer(build);
        return playerView;
    }

    private final void replaceHeader() {
        View view = this.rootView;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootView");
            view = null;
        }
        View findViewWithTag = view.findViewWithTag("bg");
        ViewParent parent = findViewWithTag.getParent();
        Intrinsics.checkNotNull(parent, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) parent;
        int indexOfChild = viewGroup.indexOfChild(findViewWithTag);
        viewGroup.removeView(findViewWithTag);
        PlayerView playerView = getPlayerView();
        this.playerView = playerView;
        playerView.setLayoutParams(findViewWithTag.getLayoutParams());
        playerView.setId(findViewWithTag.getId());
        viewGroup.addView(playerView, indexOfChild);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.glority.android.core.route.RouteableActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        Player player;
        super.onResume();
        PlayerView playerView = this.playerView;
        if (playerView == null || (player = playerView.getPlayer()) == null) {
            return;
        }
        player.play();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.glority.android.core.route.RouteableActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        Player player;
        super.onPause();
        PlayerView playerView = this.playerView;
        if (playerView == null || (player = playerView.getPlayer()) == null) {
            return;
        }
        player.pause();
    }
}
