package com.applovin.mediation.nativeAds;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.applovin.impl.je;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.mediation.ads.b;
import com.applovin.impl.sdk.j;
import com.applovin.impl.sdk.n;
import com.applovin.impl.sdk.nativeAd.AppLovinStarRatingView;
import com.applovin.impl.sdk.utils.ImageViewUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.applovin.mediation.nativeAds.MaxNativeAdViewBinder;
import com.applovin.sdk.R;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.analytics.events.base.StatsEvent;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.g;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes3.dex */
public class MaxNativeAdView extends FrameLayout {
    public static final String MEDIUM_TEMPLATE_1 = "medium_template_1";

    /* renamed from: a, reason: collision with root package name */
    private final View f28432a;

    /* renamed from: b, reason: collision with root package name */
    private final TextView f28433b;

    /* renamed from: c, reason: collision with root package name */
    private final TextView f28434c;
    private final TextView d;

    /* renamed from: f, reason: collision with root package name */
    private final Button f28435f;

    /* renamed from: g, reason: collision with root package name */
    private final ImageView f28436g;

    /* renamed from: h, reason: collision with root package name */
    private final FrameLayout f28437h;

    /* renamed from: i, reason: collision with root package name */
    private final ViewGroup f28438i;

    /* renamed from: j, reason: collision with root package name */
    private final FrameLayout f28439j;

    /* renamed from: k, reason: collision with root package name */
    private final ViewGroup f28440k;

    /* renamed from: l, reason: collision with root package name */
    private final ViewGroup f28441l;

    /* renamed from: m, reason: collision with root package name */
    private final FrameLayout f28442m;

    /* renamed from: n, reason: collision with root package name */
    private b f28443n;

    /* loaded from: classes3.dex */
    public class a implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ WeakReference f28444a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewGroup f28445b;

        public a(WeakReference weakReference, ViewGroup viewGroup) {
            this.f28444a = weakReference;
            this.f28445b = viewGroup;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            ViewTreeObserver viewTreeObserver = (ViewTreeObserver) this.f28444a.get();
            if (viewTreeObserver == null || !viewTreeObserver.isAlive()) {
                j.f26635v0.J();
                if (n.a()) {
                    j.f26635v0.J().k("MaxNativeAdView", "Failed to remove onPreDrawListener since the view tree observer is not alive.");
                }
            } else {
                viewTreeObserver.removeOnPreDrawListener(this);
            }
            this.f28444a.clear();
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f28445b.getLayoutParams();
            layoutParams.height = ((View) this.f28445b.getParent()).getWidth();
            this.f28445b.setLayoutParams(layoutParams);
            return true;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MaxNativeAdView(MaxNativeAd maxNativeAd, Activity activity) {
        this(maxNativeAd, activity, (StatsEvent) null);
        Logger.d("AppLovin|SafeDK: Execution> Lcom/applovin/mediation/nativeAds/MaxNativeAdView;-><init>(Lcom/applovin/mediation/nativeAds/MaxNativeAd;Landroid/app/Activity;)V");
        CreativeInfoManager.onMaxNativeAdCreated(this);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    private MaxNativeAdView(MaxNativeAd p12, Activity p2, StatsEvent p3) {
        this(p12, (String) null, p2);
        Logger.d("AppLovin|SafeDK: Execution> Lcom/applovin/mediation/nativeAds/MaxNativeAdView;-><init>(Lcom/applovin/mediation/nativeAds/MaxNativeAd;Landroid/app/Activity;)V");
        if ("AppLovin|SafeDK: Execution> Lcom/applovin/mediation/nativeAds/MaxNativeAdView;-><init>(Lcom/applovin/mediation/nativeAds/MaxNativeAd;Landroid/app/Activity;)V" == 0) {
        } else {
            this(p12, (String) null, p2);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MaxNativeAdView(@Nullable MaxNativeAd maxNativeAd, MaxNativeAdViewBinder maxNativeAdViewBinder, Context context) {
        this(maxNativeAd, maxNativeAdViewBinder, context, (StatsEvent) null);
        Logger.d("AppLovin|SafeDK: Execution> Lcom/applovin/mediation/nativeAds/MaxNativeAdView;-><init>(Lcom/applovin/mediation/nativeAds/MaxNativeAd;Lcom/applovin/mediation/nativeAds/MaxNativeAdViewBinder;Landroid/content/Context;)V");
        CreativeInfoManager.onMaxNativeAdCreated(this);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Deprecated
    public MaxNativeAdView(@Nullable MaxNativeAd maxNativeAd, @Nullable String str, Activity activity) {
        this(maxNativeAd, str, activity, (StatsEvent) null);
        Logger.d("AppLovin|SafeDK: Execution> Lcom/applovin/mediation/nativeAds/MaxNativeAdView;-><init>(Lcom/applovin/mediation/nativeAds/MaxNativeAd;Ljava/lang/String;Landroid/app/Activity;)V");
        CreativeInfoManager.onMaxNativeAdCreated(this);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MaxNativeAdView(@Nullable MaxNativeAd maxNativeAd, @Nullable String str, Context context) {
        this(maxNativeAd, str, context, (StatsEvent) null);
        Logger.d("AppLovin|SafeDK: Execution> Lcom/applovin/mediation/nativeAds/MaxNativeAdView;-><init>(Lcom/applovin/mediation/nativeAds/MaxNativeAd;Ljava/lang/String;Landroid/content/Context;)V");
        CreativeInfoManager.onMaxNativeAdCreated(this);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MaxNativeAdView(MaxNativeAdViewBinder maxNativeAdViewBinder, Context context) {
        this(maxNativeAdViewBinder, context, (StatsEvent) null);
        Logger.d("AppLovin|SafeDK: Execution> Lcom/applovin/mediation/nativeAds/MaxNativeAdView;-><init>(Lcom/applovin/mediation/nativeAds/MaxNativeAdViewBinder;Landroid/content/Context;)V");
        CreativeInfoManager.onMaxNativeAdCreated(this);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MaxNativeAdView(String str, Context context) {
        this(str, context, (StatsEvent) null);
        Logger.d("AppLovin|SafeDK: Execution> Lcom/applovin/mediation/nativeAds/MaxNativeAdView;-><init>(Ljava/lang/String;Landroid/content/Context;)V");
        CreativeInfoManager.onMaxNativeAdCreated(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(g.f30048a, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Nullable
    public b getAdViewTracker() {
        return this.f28443n;
    }

    public TextView getAdvertiserTextView() {
        return this.f28434c;
    }

    public TextView getBodyTextView() {
        return this.d;
    }

    public Button getCallToActionButton() {
        return this.f28435f;
    }

    public List<View> getClickableViews() {
        ArrayList arrayList = new ArrayList(5);
        TextView textView = this.f28433b;
        if (textView != null) {
            arrayList.add(textView);
        }
        TextView textView2 = this.f28434c;
        if (textView2 != null) {
            arrayList.add(textView2);
        }
        TextView textView3 = this.d;
        if (textView3 != null) {
            arrayList.add(textView3);
        }
        Button button = this.f28435f;
        if (button != null) {
            arrayList.add(button);
        }
        ImageView imageView = this.f28436g;
        if (imageView != null) {
            arrayList.add(imageView);
        }
        return arrayList;
    }

    @Deprecated
    public FrameLayout getIconContentView() {
        return this.f28437h;
    }

    public ImageView getIconImageView() {
        return this.f28436g;
    }

    public View getMainView() {
        return this.f28432a;
    }

    @Deprecated
    public FrameLayout getMediaContentView() {
        return this.f28442m;
    }

    public ViewGroup getMediaContentViewGroup() {
        ViewGroup viewGroup = this.f28441l;
        return viewGroup != null ? viewGroup : this.f28442m;
    }

    @Deprecated
    public FrameLayout getOptionsContentView() {
        return this.f28439j;
    }

    public ViewGroup getOptionsContentViewGroup() {
        ViewGroup viewGroup = this.f28438i;
        return viewGroup != null ? viewGroup : this.f28439j;
    }

    public ViewGroup getStarRatingContentViewGroup() {
        return this.f28440k;
    }

    public TextView getTitleTextView() {
        return this.f28433b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        b bVar = this.f28443n;
        if (bVar != null) {
            bVar.c();
        }
        if (isHardwareAccelerated()) {
            return;
        }
        n.j("MaxNativeAdView", "Attached to non-hardware accelerated window: some native ad views require hardware accelerated Activities to render properly.");
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public void recycle() {
        setOnClickListener(null);
        b bVar = this.f28443n;
        if (bVar != null) {
            bVar.a();
            this.f28443n = null;
        }
        View view = this.f28432a;
        if (view == null || view.getParent() == this) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) this.f28432a.getParent();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            removeView(viewGroup);
        }
        addView(this.f28432a);
    }

    public void render(je jeVar, a.InterfaceC0085a interfaceC0085a, j jVar) {
        recycle();
        if (!jeVar.u0().get() || !jeVar.s0().get()) {
            this.f28443n = new b(jeVar, this, interfaceC0085a, jVar);
        }
        MaxNativeAd nativeAd = jeVar.getNativeAd();
        if (jeVar.v0() && nativeAd.isContainerClickable()) {
            jVar.J();
            if (n.a()) {
                jVar.J().a("MaxNativeAdView", "Enabling container click");
            }
            setOnClickListener(new com.applovin.mediation.nativeAds.a(nativeAd, 0));
        }
        if (StringUtils.isValidString(jeVar.t0())) {
            jVar.J();
            if (n.a()) {
                jVar.J().a("MaxNativeAdView", "Rendering template ad view");
            }
            a(nativeAd);
            return;
        }
        jVar.J();
        if (n.a()) {
            jVar.J().a("MaxNativeAdView", "Rendering custom ad view");
        }
        renderCustomNativeAdView(nativeAd);
    }

    public void renderCustomNativeAdView(MaxNativeAd maxNativeAd) {
        TextView textView = this.f28433b;
        if (textView != null) {
            textView.setText(maxNativeAd.getTitle());
        }
        TextView textView2 = this.d;
        if (textView2 != null) {
            textView2.setText(maxNativeAd.getBody());
        }
        TextView textView3 = this.f28434c;
        if (textView3 != null) {
            textView3.setText(maxNativeAd.getAdvertiser());
        }
        Button button = this.f28435f;
        if (button != null) {
            button.setText(maxNativeAd.getCallToAction());
        }
        MaxNativeAd.MaxNativeAdImage icon = maxNativeAd.getIcon();
        ImageView imageView = this.f28436g;
        if (imageView != null) {
            if (icon == null) {
                imageView.setImageDrawable(null);
            } else if (icon.getDrawable() != null) {
                this.f28436g.setImageDrawable(icon.getDrawable());
            } else if (icon.getUri() != null) {
                ImageViewUtils.setAndDownscaleImageUri(this.f28436g, icon.getUri());
            } else {
                this.f28436g.setImageDrawable(null);
            }
        }
        View mediaView = maxNativeAd.getMediaView();
        ViewGroup viewGroup = this.f28441l;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            if (mediaView != null) {
                ViewParent parent = mediaView.getParent();
                if (parent != null) {
                    ((ViewGroup) parent).removeAllViews();
                }
                mediaView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                this.f28441l.addView(mediaView);
            }
        }
        View optionsView = maxNativeAd.getOptionsView();
        ViewGroup viewGroup2 = this.f28438i;
        if (viewGroup2 != null) {
            viewGroup2.removeAllViews();
            if (optionsView != null) {
                ViewParent parent2 = optionsView.getParent();
                if (parent2 != null) {
                    ((ViewGroup) parent2).removeAllViews();
                }
                optionsView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                this.f28438i.addView(optionsView);
                this.f28438i.bringToFront();
            }
        }
        ViewGroup viewGroup3 = this.f28440k;
        if (viewGroup3 != null) {
            viewGroup3.removeAllViews();
            Double starRating = maxNativeAd.getStarRating();
            if (starRating != null) {
                AppLovinStarRatingView appLovinStarRatingView = new AppLovinStarRatingView(starRating, getContext());
                appLovinStarRatingView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                this.f28440k.addView(appLovinStarRatingView);
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    private MaxNativeAdView(String p12, Context p2, StatsEvent p3) {
        this((MaxNativeAd) null, p12, p2);
        Logger.d("AppLovin|SafeDK: Execution> Lcom/applovin/mediation/nativeAds/MaxNativeAdView;-><init>(Ljava/lang/String;Landroid/content/Context;)V");
        if ("AppLovin|SafeDK: Execution> Lcom/applovin/mediation/nativeAds/MaxNativeAdView;-><init>(Ljava/lang/String;Landroid/content/Context;)V" == 0) {
        } else {
            this((MaxNativeAd) null, p12, p2);
        }
    }

    private int a(String str, MaxAdFormat maxAdFormat) {
        if (maxAdFormat == MaxAdFormat.NATIVE) {
            if ("small_template_1".equalsIgnoreCase(str)) {
                return R.layout.max_native_ad_small_template_1;
            }
            if (MEDIUM_TEMPLATE_1.equalsIgnoreCase(str)) {
                return R.layout.max_native_ad_medium_template_1;
            }
            throw new IllegalArgumentException(androidx.compose.ui.platform.j.b("Attempting to render MAX native ad with invalid format: ", str));
        }
        if (maxAdFormat == MaxAdFormat.BANNER) {
            return "vertical_banner_template".equals(str) ? R.layout.max_native_ad_vertical_banner_view : ("media_banner_template".equals(str) || "no_body_banner_template".equals(str)) ? R.layout.max_native_ad_media_banner_view : "vertical_media_banner_template".equals(str) ? R.layout.max_native_ad_vertical_media_banner_view : R.layout.max_native_ad_banner_view;
        }
        if (maxAdFormat == MaxAdFormat.LEADER) {
            return "vertical_leader_template".equals(str) ? R.layout.max_native_ad_vertical_leader_view : R.layout.max_native_ad_leader_view;
        }
        if (maxAdFormat == MaxAdFormat.MREC) {
            return R.layout.max_native_ad_mrec_view;
        }
        throw new IllegalArgumentException("Unsupported ad format: " + maxAdFormat);
    }

    private void b() {
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.applovin_native_inner_parent_layout);
        if (viewGroup == null) {
            return;
        }
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.addOnPreDrawListener(new a(new WeakReference(viewTreeObserver), viewGroup));
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    private MaxNativeAdView(MaxNativeAd p12, String p2, Activity p3, StatsEvent p4) {
        this(p12, p2, p3.getApplicationContext());
        Logger.d("AppLovin|SafeDK: Execution> Lcom/applovin/mediation/nativeAds/MaxNativeAdView;-><init>(Lcom/applovin/mediation/nativeAds/MaxNativeAd;Ljava/lang/String;Landroid/app/Activity;)V");
        if ("AppLovin|SafeDK: Execution> Lcom/applovin/mediation/nativeAds/MaxNativeAdView;-><init>(Lcom/applovin/mediation/nativeAds/MaxNativeAd;Ljava/lang/String;Landroid/app/Activity;)V" == 0) {
        } else {
            this(p12, p2, p3.getApplicationContext());
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    private MaxNativeAdView(MaxNativeAd p12, String p2, Context p3, StatsEvent p4) {
        this(p12, new MaxNativeAdViewBinder.Builder(-1).setTemplateType(p2).setTitleTextViewId(R.id.applovin_native_title_text_view).setAdvertiserTextViewId(R.id.applovin_native_advertiser_text_view).setBodyTextViewId(R.id.applovin_native_body_text_view).setCallToActionButtonId(R.id.applovin_native_cta_button).setIconImageViewId(R.id.applovin_native_icon_image_view).setIconContentViewId(R.id.applovin_native_icon_view).setOptionsContentViewGroupId(R.id.applovin_native_options_view).setOptionsContentFrameLayoutId(R.id.applovin_native_options_view).setStarRatingContentViewGroupId(R.id.applovin_native_star_rating_view).setMediaContentViewGroupId(R.id.applovin_native_media_content_view).setMediaContentFrameLayoutId(R.id.applovin_native_media_content_view).build(), p3);
        Logger.d("AppLovin|SafeDK: Execution> Lcom/applovin/mediation/nativeAds/MaxNativeAdView;-><init>(Lcom/applovin/mediation/nativeAds/MaxNativeAd;Ljava/lang/String;Landroid/content/Context;)V");
        if ("AppLovin|SafeDK: Execution> Lcom/applovin/mediation/nativeAds/MaxNativeAdView;-><init>(Lcom/applovin/mediation/nativeAds/MaxNativeAd;Ljava/lang/String;Landroid/content/Context;)V" == 0) {
        } else {
            this(p12, new MaxNativeAdViewBinder.Builder(-1).setTemplateType(p2).setTitleTextViewId(R.id.applovin_native_title_text_view).setAdvertiserTextViewId(R.id.applovin_native_advertiser_text_view).setBodyTextViewId(R.id.applovin_native_body_text_view).setCallToActionButtonId(R.id.applovin_native_cta_button).setIconImageViewId(R.id.applovin_native_icon_image_view).setIconContentViewId(R.id.applovin_native_icon_view).setOptionsContentViewGroupId(R.id.applovin_native_options_view).setOptionsContentFrameLayoutId(R.id.applovin_native_options_view).setStarRatingContentViewGroupId(R.id.applovin_native_star_rating_view).setMediaContentViewGroupId(R.id.applovin_native_media_content_view).setMediaContentFrameLayoutId(R.id.applovin_native_media_content_view).build(), p3);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    private MaxNativeAdView(MaxNativeAdViewBinder p12, Context p2, StatsEvent p3) {
        this((MaxNativeAd) null, p12, p2);
        Logger.d("AppLovin|SafeDK: Execution> Lcom/applovin/mediation/nativeAds/MaxNativeAdView;-><init>(Lcom/applovin/mediation/nativeAds/MaxNativeAdViewBinder;Landroid/content/Context;)V");
        if ("AppLovin|SafeDK: Execution> Lcom/applovin/mediation/nativeAds/MaxNativeAdView;-><init>(Lcom/applovin/mediation/nativeAds/MaxNativeAdViewBinder;Landroid/content/Context;)V" == 0) {
        } else {
            this((MaxNativeAd) null, p12, p2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private MaxNativeAdView(MaxNativeAd p12, MaxNativeAdViewBinder p2, Context p3, StatsEvent p4) {
        super(p3);
        int i2;
        Logger.d("AppLovin|SafeDK: Execution> Lcom/applovin/mediation/nativeAds/MaxNativeAdView;-><init>(Lcom/applovin/mediation/nativeAds/MaxNativeAd;Lcom/applovin/mediation/nativeAds/MaxNativeAdViewBinder;Landroid/content/Context;)V");
        if ("AppLovin|SafeDK: Execution> Lcom/applovin/mediation/nativeAds/MaxNativeAdView;-><init>(Lcom/applovin/mediation/nativeAds/MaxNativeAd;Lcom/applovin/mediation/nativeAds/MaxNativeAdViewBinder;Landroid/content/Context;)V" == 0) {
            return;
        }
        super(p3);
        boolean z2 = p2.templateType != null;
        MaxAdFormat format = p12 != null ? p12.getFormat() : MaxAdFormat.NATIVE;
        View view = p2.mainView;
        if (view != null) {
            this.f28432a = view;
        } else {
            if (z2) {
                i2 = a(p2.templateType, format);
            } else {
                i2 = p2.layoutResourceId;
            }
            this.f28432a = LayoutInflater.from(p3).inflate(i2, (ViewGroup) this, false);
        }
        addView(this.f28432a);
        this.f28433b = (TextView) findViewById(p2.titleTextViewId);
        this.f28434c = (TextView) findViewById(p2.advertiserTextViewId);
        this.d = (TextView) findViewById(p2.bodyTextViewId);
        this.f28435f = (Button) findViewById(p2.callToActionButtonId);
        this.f28436g = (ImageView) findViewById(p2.iconImageViewId);
        this.f28437h = (FrameLayout) findViewById(p2.iconContentViewId);
        this.f28438i = (ViewGroup) findViewById(p2.optionsContentViewGroupId);
        this.f28439j = (FrameLayout) findViewById(p2.optionsContentFrameLayoutId);
        this.f28440k = (ViewGroup) findViewById(p2.starRatingContentViewGroupId);
        this.f28441l = (ViewGroup) findViewById(p2.mediaContentViewGroupId);
        this.f28442m = (FrameLayout) findViewById(p2.mediaContentFrameLayoutId);
        if (p12 != null) {
            a(p12);
        }
    }

    private void a(MaxNativeAd maxNativeAd) {
        if (this.f28433b == null) {
            n.j("MaxNativeAdView", "Rendering template ad view without title text view");
        } else if (StringUtils.isValidString(maxNativeAd.getTitle())) {
            this.f28433b.setText(maxNativeAd.getTitle());
        } else {
            this.f28433b.setVisibility(8);
        }
        if (this.f28434c != null) {
            if (StringUtils.isValidString(maxNativeAd.getAdvertiser())) {
                this.f28434c.setText(maxNativeAd.getAdvertiser());
            } else {
                this.f28434c.setVisibility(8);
            }
        }
        if (this.d != null) {
            if (StringUtils.isValidString(maxNativeAd.getBody())) {
                this.d.setText(maxNativeAd.getBody());
            } else if (maxNativeAd.getFormat() != MaxAdFormat.NATIVE && maxNativeAd.getFormat() != MaxAdFormat.MREC) {
                this.d.setVisibility(4);
            } else {
                this.d.setVisibility(8);
            }
        }
        if (this.f28435f != null) {
            if (StringUtils.isValidString(maxNativeAd.getCallToAction())) {
                this.f28435f.setText(maxNativeAd.getCallToAction());
            } else if (maxNativeAd.getFormat() != MaxAdFormat.NATIVE && maxNativeAd.getFormat() != MaxAdFormat.MREC) {
                this.f28435f.setVisibility(4);
            } else {
                this.f28435f.setVisibility(8);
            }
        }
        MaxNativeAd.MaxNativeAdImage icon = maxNativeAd.getIcon();
        View iconView = maxNativeAd.getIconView();
        FrameLayout frameLayout = this.f28437h;
        if (frameLayout != null) {
            if (icon == null || this.f28436g == null) {
                if (iconView != null) {
                    iconView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                    this.f28437h.removeAllViews();
                    this.f28437h.addView(iconView);
                } else {
                    frameLayout.setVisibility(8);
                }
            } else if (icon.getDrawable() != null) {
                this.f28436g.setImageDrawable(icon.getDrawable());
            } else if (icon.getUri() != null && StringUtils.isValidString(icon.getUri().toString())) {
                ImageViewUtils.setAndDownscaleImageUri(this.f28436g, icon.getUri());
            } else {
                this.f28437h.setVisibility(8);
            }
        }
        View optionsView = maxNativeAd.getOptionsView();
        FrameLayout frameLayout2 = this.f28439j;
        if (frameLayout2 != null && optionsView != null) {
            optionsView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            this.f28439j.addView(optionsView);
            this.f28439j.bringToFront();
        } else if (frameLayout2 != null) {
            frameLayout2.setVisibility(8);
        }
        View mediaView = maxNativeAd.getMediaView();
        if (this.f28442m != null) {
            if (mediaView != null) {
                mediaView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                this.f28442m.addView(mediaView);
            } else if (maxNativeAd.getFormat() == MaxAdFormat.LEADER) {
                this.f28442m.setVisibility(8);
            }
        }
        if (this.f28440k != null) {
            Double starRating = maxNativeAd.getStarRating();
            if (starRating != null) {
                this.f28440k.removeAllViews();
                AppLovinStarRatingView appLovinStarRatingView = new AppLovinStarRatingView(starRating, getContext());
                appLovinStarRatingView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                this.f28440k.addView(appLovinStarRatingView);
            } else {
                this.f28440k.setVisibility(8);
            }
        }
        b();
        postDelayed(new androidx.compose.material.ripple.a(this, 9), 2000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a() {
        setSelected(true);
    }
}
