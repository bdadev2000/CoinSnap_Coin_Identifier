package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzcsq extends FrameLayout implements ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnGlobalLayoutListener {
    private final Context zza;
    private View zzb;

    private zzcsq(Context context) {
        super(context);
        this.zza = context;
    }

    public static zzcsq zza(Context context, View view, zzfgh zzfghVar) {
        Resources resources;
        DisplayMetrics displayMetrics;
        zzcsq zzcsqVar = new zzcsq(context);
        if (!zzfghVar.zzu.isEmpty() && (resources = zzcsqVar.zza.getResources()) != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
            float f2 = ((zzfgi) zzfghVar.zzu.get(0)).zza;
            float f3 = displayMetrics.density;
            zzcsqVar.setLayoutParams(new FrameLayout.LayoutParams((int) (f2 * f3), (int) (r1.zzb * f3)));
        }
        zzcsqVar.zzb = view;
        zzcsqVar.addView(view);
        com.google.android.gms.ads.internal.zzu.zzx();
        zzcba.zzb(zzcsqVar, zzcsqVar);
        com.google.android.gms.ads.internal.zzu.zzx();
        zzcba.zza(zzcsqVar, zzcsqVar);
        JSONObject jSONObject = zzfghVar.zzah;
        RelativeLayout relativeLayout = new RelativeLayout(zzcsqVar.zza);
        JSONObject optJSONObject = jSONObject.optJSONObject("header");
        if (optJSONObject != null) {
            zzcsqVar.zzc(optJSONObject, relativeLayout, 10);
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("footer");
        if (optJSONObject2 != null) {
            zzcsqVar.zzc(optJSONObject2, relativeLayout, 12);
        }
        zzcsqVar.addView(relativeLayout);
        return zzcsqVar;
    }

    private final int zzb(double d) {
        com.google.android.gms.ads.internal.client.zzbc.zzb();
        return com.google.android.gms.ads.internal.util.client.zzf.zzy(this.zza, (int) d);
    }

    private final void zzc(JSONObject jSONObject, RelativeLayout relativeLayout, int i2) {
        TextView textView = new TextView(this.zza);
        textView.setTextColor(-1);
        textView.setBackgroundColor(-16777216);
        textView.setGravity(17);
        textView.setText(jSONObject.optString("text", ""));
        textView.setTextSize((float) jSONObject.optDouble("text_size", 11.0d));
        int zzb = zzb(jSONObject.optDouble("padding", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE));
        textView.setPadding(0, zzb, 0, zzb);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, zzb(jSONObject.optDouble(ViewHierarchyConstants.DIMENSION_HEIGHT_KEY, 15.0d)));
        layoutParams.addRule(i2);
        relativeLayout.addView(textView, layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(g.f30053h, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        getLocationInWindow(new int[2]);
        this.zzb.setY(-r0[1]);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        getLocationInWindow(new int[2]);
        this.zzb.setY(-r0[1]);
    }
}
