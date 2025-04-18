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

/* loaded from: classes3.dex */
public final class zzcrc extends FrameLayout implements ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnGlobalLayoutListener {
    private final Context zza;
    private View zzb;

    private zzcrc(Context context) {
        super(context);
        this.zza = context;
    }

    public static zzcrc zza(Context context, View view, zzfet zzfetVar) {
        Resources resources;
        DisplayMetrics displayMetrics;
        zzcrc zzcrcVar = new zzcrc(context);
        if (!zzfetVar.zzu.isEmpty() && (resources = zzcrcVar.zza.getResources()) != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
            float f10 = ((zzfeu) zzfetVar.zzu.get(0)).zza;
            float f11 = displayMetrics.density;
            zzcrcVar.setLayoutParams(new FrameLayout.LayoutParams((int) (f10 * f11), (int) (r1.zzb * f11)));
        }
        zzcrcVar.zzb = view;
        zzcrcVar.addView(view);
        com.google.android.gms.ads.internal.zzv.zzy();
        zzcaw.zzb(zzcrcVar, zzcrcVar);
        com.google.android.gms.ads.internal.zzv.zzy();
        zzcaw.zza(zzcrcVar, zzcrcVar);
        JSONObject jSONObject = zzfetVar.zzah;
        RelativeLayout relativeLayout = new RelativeLayout(zzcrcVar.zza);
        JSONObject optJSONObject = jSONObject.optJSONObject("header");
        if (optJSONObject != null) {
            zzcrcVar.zzc(optJSONObject, relativeLayout, 10);
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("footer");
        if (optJSONObject2 != null) {
            zzcrcVar.zzc(optJSONObject2, relativeLayout, 12);
        }
        zzcrcVar.addView(relativeLayout);
        return zzcrcVar;
    }

    private final int zzb(double d10) {
        com.google.android.gms.ads.internal.client.zzbc.zzb();
        return com.google.android.gms.ads.internal.util.client.zzf.zzy(this.zza, (int) d10);
    }

    private final void zzc(JSONObject jSONObject, RelativeLayout relativeLayout, int i10) {
        TextView textView = new TextView(this.zza);
        textView.setTextColor(-1);
        textView.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        textView.setGravity(17);
        textView.setText(jSONObject.optString(MimeTypes.BASE_TYPE_TEXT, ""));
        textView.setTextSize((float) jSONObject.optDouble("text_size", 11.0d));
        int zzb = zzb(jSONObject.optDouble("padding", 0.0d));
        textView.setPadding(0, zzb, 0, zzb);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, zzb(jSONObject.optDouble("height", 15.0d)));
        layoutParams.addRule(i10);
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
