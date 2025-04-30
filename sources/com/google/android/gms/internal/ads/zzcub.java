package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzcub extends FrameLayout implements ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnGlobalLayoutListener {
    private final Context zza;
    private View zzb;

    private zzcub(Context context) {
        super(context);
        this.zza = context;
    }

    public static zzcub zza(Context context, View view, zzfgt zzfgtVar) {
        Resources resources;
        DisplayMetrics displayMetrics;
        zzcub zzcubVar = new zzcub(context);
        if (!zzfgtVar.zzv.isEmpty() && (resources = zzcubVar.zza.getResources()) != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
            float f9 = ((zzfgu) zzfgtVar.zzv.get(0)).zza;
            float f10 = displayMetrics.density;
            zzcubVar.setLayoutParams(new FrameLayout.LayoutParams((int) (f9 * f10), (int) (r1.zzb * f10)));
        }
        zzcubVar.zzb = view;
        zzcubVar.addView(view);
        com.google.android.gms.ads.internal.zzu.zzx();
        zzccv.zzb(zzcubVar, zzcubVar);
        com.google.android.gms.ads.internal.zzu.zzx();
        zzccv.zza(zzcubVar, zzcubVar);
        JSONObject jSONObject = zzfgtVar.zzai;
        RelativeLayout relativeLayout = new RelativeLayout(zzcubVar.zza);
        JSONObject optJSONObject = jSONObject.optJSONObject("header");
        if (optJSONObject != null) {
            zzcubVar.zzc(optJSONObject, relativeLayout, 10);
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("footer");
        if (optJSONObject2 != null) {
            zzcubVar.zzc(optJSONObject2, relativeLayout, 12);
        }
        zzcubVar.addView(relativeLayout);
        return zzcubVar;
    }

    private final int zzb(double d2) {
        com.google.android.gms.ads.internal.client.zzay.zzb();
        return com.google.android.gms.ads.internal.util.client.zzf.zzy(this.zza, (int) d2);
    }

    private final void zzc(JSONObject jSONObject, RelativeLayout relativeLayout, int i9) {
        TextView textView = new TextView(this.zza);
        textView.setTextColor(-1);
        textView.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        textView.setGravity(17);
        textView.setText(jSONObject.optString(MimeTypes.BASE_TYPE_TEXT, ""));
        textView.setTextSize((float) jSONObject.optDouble("text_size", 11.0d));
        int zzb = zzb(jSONObject.optDouble("padding", 0.0d));
        textView.setPadding(0, zzb, 0, zzb);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, zzb(jSONObject.optDouble("height", 15.0d)));
        layoutParams.addRule(i9);
        relativeLayout.addView(textView, layoutParams);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        getLocationInWindow(new int[2]);
        this.zzb.setY(-r0[1]);
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        getLocationInWindow(new int[2]);
        this.zzb.setY(-r0[1]);
    }
}
