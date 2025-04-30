package com.applovin.mediation.nativeAds;

import A6.c;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
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
import com.applovin.impl.ee;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.mediation.ads.b;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.nativeAd.AppLovinStarRatingView;
import com.applovin.impl.sdk.t;
import com.applovin.impl.sdk.utils.ImageViewUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.applovin.mediation.nativeAds.MaxNativeAdViewBinder;
import com.applovin.sdk.R;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.AdaptiveTrackSelection;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import x0.AbstractC2914a;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes.dex */
public class MaxNativeAdView extends FrameLayout {
    public static final String MEDIUM_TEMPLATE_1 = "medium_template_1";

    /* renamed from: a */
    private final View f12720a;
    private final TextView b;

    /* renamed from: c */
    private final TextView f12721c;

    /* renamed from: d */
    private final TextView f12722d;

    /* renamed from: f */
    private final Button f12723f;

    /* renamed from: g */
    private final ImageView f12724g;

    /* renamed from: h */
    private final FrameLayout f12725h;

    /* renamed from: i */
    private final ViewGroup f12726i;

    /* renamed from: j */
    private final FrameLayout f12727j;

    /* renamed from: k */
    private final ViewGroup f12728k;
    private final ViewGroup l;
    private final FrameLayout m;

    /* renamed from: n */
    private b f12729n;

    /* loaded from: classes.dex */
    public class a implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: a */
        final /* synthetic */ WeakReference f12730a;
        final /* synthetic */ ViewGroup b;

        public a(WeakReference weakReference, ViewGroup viewGroup) {
            this.f12730a = weakReference;
            this.b = viewGroup;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            ViewTreeObserver viewTreeObserver = (ViewTreeObserver) this.f12730a.get();
            if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this);
            } else {
                k.f10832A0.L();
                if (t.a()) {
                    k.f10832A0.L().k("MaxNativeAdView", "Failed to remove onPreDrawListener since the view tree observer is not alive.");
                }
            }
            this.f12730a.clear();
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.b.getLayoutParams();
            layoutParams.height = ((View) this.b.getParent()).getWidth();
            this.b.setLayoutParams(layoutParams);
            return true;
        }
    }

    public MaxNativeAdView(MaxNativeAd maxNativeAd, Activity activity) {
        this(maxNativeAd, (String) null, activity);
    }

    public static /* synthetic */ void c(MaxNativeAdView maxNativeAdView) {
        maxNativeAdView.a();
    }

    @Nullable
    public b getAdViewTracker() {
        return this.f12729n;
    }

    public TextView getAdvertiserTextView() {
        return this.f12721c;
    }

    public TextView getBodyTextView() {
        return this.f12722d;
    }

    public Button getCallToActionButton() {
        return this.f12723f;
    }

    public List<View> getClickableViews() {
        ArrayList arrayList = new ArrayList(5);
        TextView textView = this.b;
        if (textView != null) {
            arrayList.add(textView);
        }
        TextView textView2 = this.f12721c;
        if (textView2 != null) {
            arrayList.add(textView2);
        }
        TextView textView3 = this.f12722d;
        if (textView3 != null) {
            arrayList.add(textView3);
        }
        Button button = this.f12723f;
        if (button != null) {
            arrayList.add(button);
        }
        ImageView imageView = this.f12724g;
        if (imageView != null) {
            arrayList.add(imageView);
        }
        return arrayList;
    }

    @Deprecated
    public FrameLayout getIconContentView() {
        return this.f12725h;
    }

    public ImageView getIconImageView() {
        return this.f12724g;
    }

    public View getMainView() {
        return this.f12720a;
    }

    @Deprecated
    public FrameLayout getMediaContentView() {
        return this.m;
    }

    public ViewGroup getMediaContentViewGroup() {
        ViewGroup viewGroup = this.l;
        if (viewGroup == null) {
            return this.m;
        }
        return viewGroup;
    }

    @Deprecated
    public FrameLayout getOptionsContentView() {
        return this.f12727j;
    }

    public ViewGroup getOptionsContentViewGroup() {
        ViewGroup viewGroup = this.f12726i;
        if (viewGroup == null) {
            return this.f12727j;
        }
        return viewGroup;
    }

    public ViewGroup getStarRatingContentViewGroup() {
        return this.f12728k;
    }

    public TextView getTitleTextView() {
        return this.b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        b bVar = this.f12729n;
        if (bVar != null) {
            bVar.c();
        }
        if (!isHardwareAccelerated()) {
            t.j("MaxNativeAdView", "Attached to non-hardware accelerated window: some native ad views require hardware accelerated Activities to render properly.");
        }
    }

    public void recycle() {
        setOnClickListener(null);
        b bVar = this.f12729n;
        if (bVar != null) {
            bVar.a();
            this.f12729n = null;
        }
        View view = this.f12720a;
        if (view != null && view.getParent() != this) {
            ViewGroup viewGroup = (ViewGroup) this.f12720a.getParent();
            if (viewGroup != null) {
                viewGroup.removeAllViews();
                removeView(viewGroup);
            }
            addView(this.f12720a);
        }
    }

    public void render(ee eeVar, a.InterfaceC0023a interfaceC0023a, k kVar) {
        recycle();
        if (!eeVar.p0().get() || !eeVar.n0().get()) {
            this.f12729n = new b(eeVar, this, interfaceC0023a, kVar);
        }
        MaxNativeAd nativeAd = eeVar.getNativeAd();
        if (eeVar.q0() && nativeAd.isContainerClickable()) {
            kVar.L();
            if (t.a()) {
                kVar.L().a("MaxNativeAdView", "Enabling container click");
            }
            setOnClickListener(new c(nativeAd, 7));
        }
        if (StringUtils.isValidString(eeVar.o0())) {
            kVar.L();
            if (t.a()) {
                kVar.L().a("MaxNativeAdView", "Rendering template ad view");
            }
            a(nativeAd);
            return;
        }
        kVar.L();
        if (t.a()) {
            kVar.L().a("MaxNativeAdView", "Rendering custom ad view");
        }
        renderCustomNativeAdView(nativeAd);
    }

    public void renderCustomNativeAdView(MaxNativeAd maxNativeAd) {
        TextView textView = this.b;
        if (textView != null) {
            textView.setText(maxNativeAd.getTitle());
        }
        TextView textView2 = this.f12722d;
        if (textView2 != null) {
            textView2.setText(maxNativeAd.getBody());
        }
        TextView textView3 = this.f12721c;
        if (textView3 != null) {
            textView3.setText(maxNativeAd.getAdvertiser());
        }
        Button button = this.f12723f;
        if (button != null) {
            button.setText(maxNativeAd.getCallToAction());
        }
        MaxNativeAd.MaxNativeAdImage icon = maxNativeAd.getIcon();
        ImageView imageView = this.f12724g;
        if (imageView != null) {
            if (icon != null) {
                if (icon.getDrawable() != null) {
                    this.f12724g.setImageDrawable(icon.getDrawable());
                } else if (icon.getUri() != null) {
                    ImageViewUtils.setAndDownscaleImageUri(this.f12724g, icon.getUri());
                } else {
                    this.f12724g.setImageDrawable(null);
                }
            } else {
                imageView.setImageDrawable(null);
            }
        }
        View mediaView = maxNativeAd.getMediaView();
        ViewGroup viewGroup = this.l;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            if (mediaView != null) {
                ViewParent parent = mediaView.getParent();
                if (parent != null) {
                    ((ViewGroup) parent).removeAllViews();
                }
                mediaView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                this.l.addView(mediaView);
            }
        }
        View optionsView = maxNativeAd.getOptionsView();
        ViewGroup viewGroup2 = this.f12726i;
        if (viewGroup2 != null) {
            viewGroup2.removeAllViews();
            if (optionsView != null) {
                ViewParent parent2 = optionsView.getParent();
                if (parent2 != null) {
                    ((ViewGroup) parent2).removeAllViews();
                }
                optionsView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                this.f12726i.addView(optionsView);
                this.f12726i.bringToFront();
            }
        }
        ViewGroup viewGroup3 = this.f12728k;
        if (viewGroup3 != null) {
            viewGroup3.removeAllViews();
            Double starRating = maxNativeAd.getStarRating();
            if (starRating != null) {
                AppLovinStarRatingView appLovinStarRatingView = new AppLovinStarRatingView(starRating, getContext());
                appLovinStarRatingView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                this.f12728k.addView(appLovinStarRatingView);
            }
        }
    }

    public MaxNativeAdView(String str, Context context) {
        this((MaxNativeAd) null, str, context);
    }

    private int a(String str, MaxAdFormat maxAdFormat) {
        if (maxAdFormat == MaxAdFormat.NATIVE) {
            if ("small_template_1".equalsIgnoreCase(str)) {
                return R.layout.max_native_ad_small_template_1;
            }
            if (MEDIUM_TEMPLATE_1.equalsIgnoreCase(str)) {
                return R.layout.max_native_ad_medium_template_1;
            }
            throw new IllegalArgumentException(AbstractC2914a.d("Attempting to render MAX native ad with invalid format: ", str));
        }
        if (maxAdFormat == MaxAdFormat.BANNER) {
            if ("vertical_banner_template".equals(str)) {
                return R.layout.max_native_ad_vertical_banner_view;
            }
            if (!"media_banner_template".equals(str) && !"no_body_banner_template".equals(str)) {
                if ("vertical_media_banner_template".equals(str)) {
                    return R.layout.max_native_ad_vertical_media_banner_view;
                }
                return R.layout.max_native_ad_banner_view;
            }
            return R.layout.max_native_ad_media_banner_view;
        }
        if (maxAdFormat == MaxAdFormat.LEADER) {
            if ("vertical_leader_template".equals(str)) {
                return R.layout.max_native_ad_vertical_leader_view;
            }
            return R.layout.max_native_ad_leader_view;
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

    @Deprecated
    public MaxNativeAdView(@Nullable MaxNativeAd maxNativeAd, @Nullable String str, Activity activity) {
        this(maxNativeAd, str, activity.getApplicationContext());
    }

    public MaxNativeAdView(@Nullable MaxNativeAd maxNativeAd, @Nullable String str, Context context) {
        this(maxNativeAd, new MaxNativeAdViewBinder.Builder(-1).setTemplateType(str).setTitleTextViewId(R.id.applovin_native_title_text_view).setAdvertiserTextViewId(R.id.applovin_native_advertiser_text_view).setBodyTextViewId(R.id.applovin_native_body_text_view).setCallToActionButtonId(R.id.applovin_native_cta_button).setIconImageViewId(R.id.applovin_native_icon_image_view).setIconContentViewId(R.id.applovin_native_icon_view).setOptionsContentViewGroupId(R.id.applovin_native_options_view).setOptionsContentFrameLayoutId(R.id.applovin_native_options_view).setStarRatingContentViewGroupId(R.id.applovin_native_star_rating_view).setMediaContentViewGroupId(R.id.applovin_native_media_content_view).setMediaContentFrameLayoutId(R.id.applovin_native_media_content_view).build(), context);
    }

    public MaxNativeAdView(MaxNativeAdViewBinder maxNativeAdViewBinder, Context context) {
        this((MaxNativeAd) null, maxNativeAdViewBinder, context);
    }

    public MaxNativeAdView(@Nullable MaxNativeAd maxNativeAd, MaxNativeAdViewBinder maxNativeAdViewBinder, Context context) {
        super(context);
        int i9;
        boolean z8 = maxNativeAdViewBinder.templateType != null;
        MaxAdFormat format = maxNativeAd != null ? maxNativeAd.getFormat() : MaxAdFormat.NATIVE;
        View view = maxNativeAdViewBinder.mainView;
        if (view != null) {
            this.f12720a = view;
        } else {
            if (z8) {
                i9 = a(maxNativeAdViewBinder.templateType, format);
            } else {
                i9 = maxNativeAdViewBinder.layoutResourceId;
            }
            this.f12720a = LayoutInflater.from(context).inflate(i9, (ViewGroup) this, false);
        }
        addView(this.f12720a);
        this.b = (TextView) findViewById(maxNativeAdViewBinder.titleTextViewId);
        this.f12721c = (TextView) findViewById(maxNativeAdViewBinder.advertiserTextViewId);
        this.f12722d = (TextView) findViewById(maxNativeAdViewBinder.bodyTextViewId);
        this.f12723f = (Button) findViewById(maxNativeAdViewBinder.callToActionButtonId);
        this.f12724g = (ImageView) findViewById(maxNativeAdViewBinder.iconImageViewId);
        this.f12725h = (FrameLayout) findViewById(maxNativeAdViewBinder.iconContentViewId);
        this.f12726i = (ViewGroup) findViewById(maxNativeAdViewBinder.optionsContentViewGroupId);
        this.f12727j = (FrameLayout) findViewById(maxNativeAdViewBinder.optionsContentFrameLayoutId);
        this.f12728k = (ViewGroup) findViewById(maxNativeAdViewBinder.starRatingContentViewGroupId);
        this.l = (ViewGroup) findViewById(maxNativeAdViewBinder.mediaContentViewGroupId);
        this.m = (FrameLayout) findViewById(maxNativeAdViewBinder.mediaContentFrameLayoutId);
        if (maxNativeAd != null) {
            a(maxNativeAd);
        }
    }

    private void a(MaxNativeAd maxNativeAd) {
        if (this.b == null) {
            t.j("MaxNativeAdView", "Rendering template ad view without title text view");
        } else if (StringUtils.isValidString(maxNativeAd.getTitle())) {
            this.b.setText(maxNativeAd.getTitle());
        } else {
            this.b.setVisibility(8);
        }
        if (this.f12721c != null) {
            if (StringUtils.isValidString(maxNativeAd.getAdvertiser())) {
                this.f12721c.setText(maxNativeAd.getAdvertiser());
            } else {
                this.f12721c.setVisibility(8);
            }
        }
        if (this.f12722d != null) {
            if (StringUtils.isValidString(maxNativeAd.getBody())) {
                this.f12722d.setText(maxNativeAd.getBody());
            } else if (maxNativeAd.getFormat() != MaxAdFormat.NATIVE && maxNativeAd.getFormat() != MaxAdFormat.MREC) {
                this.f12722d.setVisibility(4);
            } else {
                this.f12722d.setVisibility(8);
            }
        }
        if (this.f12723f != null) {
            if (StringUtils.isValidString(maxNativeAd.getCallToAction())) {
                this.f12723f.setText(maxNativeAd.getCallToAction());
            } else if (maxNativeAd.getFormat() != MaxAdFormat.NATIVE && maxNativeAd.getFormat() != MaxAdFormat.MREC) {
                this.f12723f.setVisibility(4);
            } else {
                this.f12723f.setVisibility(8);
            }
        }
        MaxNativeAd.MaxNativeAdImage icon = maxNativeAd.getIcon();
        View iconView = maxNativeAd.getIconView();
        FrameLayout frameLayout = this.f12725h;
        if (frameLayout != null) {
            if (icon == null || this.f12724g == null) {
                if (iconView != null) {
                    iconView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                    this.f12725h.removeAllViews();
                    this.f12725h.addView(iconView);
                } else {
                    frameLayout.setVisibility(8);
                }
            } else if (icon.getDrawable() != null) {
                this.f12724g.setImageDrawable(icon.getDrawable());
            } else if (icon.getUri() != null && StringUtils.isValidString(icon.getUri().toString())) {
                ImageViewUtils.setAndDownscaleImageUri(this.f12724g, icon.getUri());
            } else {
                this.f12725h.setVisibility(8);
            }
        }
        View optionsView = maxNativeAd.getOptionsView();
        FrameLayout frameLayout2 = this.f12727j;
        if (frameLayout2 != null && optionsView != null) {
            optionsView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            this.f12727j.addView(optionsView);
            this.f12727j.bringToFront();
        } else if (frameLayout2 != null) {
            frameLayout2.setVisibility(8);
        }
        View mediaView = maxNativeAd.getMediaView();
        if (this.m != null) {
            if (mediaView != null) {
                mediaView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                this.m.addView(mediaView);
            } else if (maxNativeAd.getFormat() == MaxAdFormat.LEADER) {
                this.m.setVisibility(8);
            }
        }
        if (this.f12728k != null) {
            Double starRating = maxNativeAd.getStarRating();
            if (starRating != null) {
                this.f12728k.removeAllViews();
                AppLovinStarRatingView appLovinStarRatingView = new AppLovinStarRatingView(starRating, getContext());
                appLovinStarRatingView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                this.f12728k.addView(appLovinStarRatingView);
            } else {
                this.f12728k.setVisibility(8);
            }
        }
        b();
        postDelayed(new D3.b(this, 21), AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS);
    }

    public /* synthetic */ void a() {
        setSelected(true);
    }
}
