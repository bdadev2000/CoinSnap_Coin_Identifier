package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TableRow;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.impl.R;
import com.google.android.gms.ads.nativead.MediaView;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;

/* loaded from: classes2.dex */
public final class zzdyy {
    public static final void zza(Context context, ViewGroup viewGroup, AdView adView) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setTag(TtmlNode.TAG_LAYOUT);
        zzf(linearLayout, -1, -1);
        linearLayout.setGravity(17);
        linearLayout.addView(adView);
        adView.setTag("ad_view");
        viewGroup.addView(linearLayout);
    }

    public static final void zzb(Context context, ViewGroup viewGroup, NativeAd nativeAd) {
        String string;
        String string2;
        String string3;
        NativeAdView nativeAdView = new NativeAdView(context);
        nativeAdView.setTag("ad_view_tag");
        zzf(nativeAdView, -1, -1);
        viewGroup.addView(nativeAdView);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setTag("layout_tag");
        linearLayout.setOrientation(1);
        zzf(linearLayout, -1, -1);
        linearLayout.setBackgroundColor(-1);
        nativeAdView.addView(linearLayout);
        Resources zze = com.google.android.gms.ads.internal.zzu.zzo().zze();
        if (zze == null) {
            string = "Headline";
        } else {
            string = zze.getString(R.string.native_headline);
        }
        linearLayout.addView(zzc(context, string, "headline_header_tag"));
        View zzd = zzd(context, zzfyv.zzc(nativeAd.getHeadline()), "headline_tag");
        nativeAdView.setHeadlineView(zzd);
        linearLayout.addView(zzd);
        if (zze == null) {
            string2 = "Body";
        } else {
            string2 = zze.getString(R.string.native_body);
        }
        linearLayout.addView(zzc(context, string2, "body_header_tag"));
        View zzd2 = zzd(context, zzfyv.zzc(nativeAd.getBody()), "body_tag");
        nativeAdView.setBodyView(zzd2);
        linearLayout.addView(zzd2);
        if (zze == null) {
            string3 = "Media View";
        } else {
            string3 = zze.getString(R.string.native_media_view);
        }
        linearLayout.addView(zzc(context, string3, "media_view_header_tag"));
        MediaView mediaView = new MediaView(context);
        mediaView.setTag("media_view_tag");
        nativeAdView.setMediaView(mediaView);
        linearLayout.addView(mediaView);
        nativeAdView.setNativeAd(nativeAd);
    }

    private static TextView zzc(Context context, String str, String str2) {
        return zze(context, str, android.R.style.TextAppearance.Small, -9210245, 0.0f, str2);
    }

    private static TextView zzd(Context context, String str, String str2) {
        return zze(context, str, android.R.style.TextAppearance.Medium, ViewCompat.MEASURED_STATE_MASK, 12.0f, str2);
    }

    private static TextView zze(Context context, String str, int i9, int i10, float f9, String str2) {
        TextView textView = new TextView(context);
        textView.setTag(str2);
        zzf(textView, -2, -2);
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new TableRow.LayoutParams();
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(layoutParams);
        marginLayoutParams.bottomMargin = (int) TypedValue.applyDimension(1, f9, textView.getResources().getDisplayMetrics());
        textView.setLayoutParams(marginLayoutParams);
        textView.setTextAppearance(context, i9);
        textView.setTextColor(i10);
        textView.setText(str);
        return textView;
    }

    private static void zzf(View view, int i9, int i10) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new TableRow.LayoutParams();
        }
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(layoutParams);
        layoutParams2.height = i9;
        layoutParams2.width = i10;
        view.setLayoutParams(layoutParams2);
    }
}
