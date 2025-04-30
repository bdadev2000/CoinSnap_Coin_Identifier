package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzfgt;
import com.google.android.gms.internal.ads.zzfxr;
import com.google.android.gms.internal.ads.zzfyt;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzbz {
    public static Point zza(MotionEvent motionEvent, @Nullable View view) {
        int[] zzj = zzj(view);
        return new Point(((int) motionEvent.getRawX()) - zzj[0], ((int) motionEvent.getRawY()) - zzj[1]);
    }

    public static WindowManager.LayoutParams zzb() {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-2, -2, 0, 0, -2);
        layoutParams.flags = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzie)).intValue();
        layoutParams.type = 2;
        layoutParams.gravity = 8388659;
        return layoutParams;
    }

    public static JSONObject zzc(@Nullable String str, Context context, Point point, Point point2) {
        JSONObject jSONObject = null;
        try {
            JSONObject jSONObject2 = new JSONObject();
            try {
                JSONObject jSONObject3 = new JSONObject();
                try {
                    jSONObject3.put("x", com.google.android.gms.ads.internal.client.zzay.zzb().zzb(context, point2.x));
                    jSONObject3.put("y", com.google.android.gms.ads.internal.client.zzay.zzb().zzb(context, point2.y));
                    jSONObject3.put("start_x", com.google.android.gms.ads.internal.client.zzay.zzb().zzb(context, point.x));
                    jSONObject3.put("start_y", com.google.android.gms.ads.internal.client.zzay.zzb().zzb(context, point.y));
                    jSONObject = jSONObject3;
                } catch (JSONException e4) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzh("Error occurred while putting signals into JSON object.", e4);
                }
                jSONObject2.put("click_point", jSONObject);
                jSONObject2.put("asset_id", str);
                return jSONObject2;
            } catch (Exception e9) {
                e = e9;
                jSONObject = jSONObject2;
                com.google.android.gms.ads.internal.util.client.zzm.zzh("Error occurred while grabbing click signals.", e);
                return jSONObject;
            }
        } catch (Exception e10) {
            e = e10;
        }
    }

    public static JSONObject zzd(Context context, @Nullable Map map, @Nullable Map map2, @Nullable View view, @Nullable ImageView.ScaleType scaleType) {
        String str;
        String str2;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        boolean z8;
        String str3 = "ad_view";
        String str4 = "relative_to";
        JSONObject jSONObject3 = new JSONObject();
        if (map != null && view != null) {
            int[] zzj = zzj(view);
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                View view2 = (View) ((WeakReference) entry.getValue()).get();
                if (view2 != null) {
                    int[] zzj2 = zzj(view2);
                    JSONObject jSONObject4 = new JSONObject();
                    JSONObject jSONObject5 = new JSONObject();
                    Iterator it2 = it;
                    try {
                        JSONObject jSONObject6 = jSONObject3;
                        try {
                            jSONObject5.put("width", com.google.android.gms.ads.internal.client.zzay.zzb().zzb(context, view2.getMeasuredWidth()));
                            jSONObject5.put("height", com.google.android.gms.ads.internal.client.zzay.zzb().zzb(context, view2.getMeasuredHeight()));
                            jSONObject5.put("x", com.google.android.gms.ads.internal.client.zzay.zzb().zzb(context, zzj2[0] - zzj[0]));
                            jSONObject5.put("y", com.google.android.gms.ads.internal.client.zzay.zzb().zzb(context, zzj2[1] - zzj[1]));
                            jSONObject5.put(str4, str3);
                            jSONObject4.put("frame", jSONObject5);
                            Rect rect = new Rect();
                            if (view2.getLocalVisibleRect(rect)) {
                                jSONObject2 = zzk(context, rect);
                            } else {
                                jSONObject2 = new JSONObject();
                                jSONObject2.put("width", 0);
                                jSONObject2.put("height", 0);
                                jSONObject2.put("x", com.google.android.gms.ads.internal.client.zzay.zzb().zzb(context, zzj2[0] - zzj[0]));
                                jSONObject2.put("y", com.google.android.gms.ads.internal.client.zzay.zzb().zzb(context, zzj2[1] - zzj[1]));
                                jSONObject2.put(str4, str3);
                            }
                            jSONObject4.put("visible_bounds", jSONObject2);
                            if (((String) entry.getKey()).equals("3010")) {
                                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzhZ)).booleanValue()) {
                                    jSONObject4.put("mediaview_graphics_matrix", view2.getMatrix().toShortString());
                                }
                                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzia)).booleanValue()) {
                                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                                    jSONObject4.put("view_width_layout_type", zzl(layoutParams.width) - 1);
                                    jSONObject4.put("view_height_layout_type", zzl(layoutParams.height) - 1);
                                }
                                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzib)).booleanValue()) {
                                    ArrayList arrayList = new ArrayList();
                                    arrayList.add(Integer.valueOf(view2.getId()));
                                    for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                        arrayList.add(Integer.valueOf(((View) parent).getId()));
                                    }
                                    jSONObject4.put("view_path", TextUtils.join("/", arrayList));
                                }
                                if (scaleType != null) {
                                    jSONObject4.put("mediaview_scale_type", scaleType.ordinal());
                                }
                            }
                            if (view2 instanceof TextView) {
                                TextView textView = (TextView) view2;
                                jSONObject4.put("text_color", textView.getCurrentTextColor());
                                str = str3;
                                str2 = str4;
                                try {
                                    jSONObject4.put("font_size", textView.getTextSize());
                                    jSONObject4.put(MimeTypes.BASE_TYPE_TEXT, textView.getText());
                                } catch (JSONException unused) {
                                    jSONObject = jSONObject6;
                                    com.google.android.gms.ads.internal.util.client.zzm.zzj("Unable to get asset views information");
                                    it = it2;
                                    jSONObject3 = jSONObject;
                                    str3 = str;
                                    str4 = str2;
                                }
                            } else {
                                str = str3;
                                str2 = str4;
                            }
                            if (map2 != null && map2.containsKey(entry.getKey()) && view2.isClickable()) {
                                z8 = true;
                            } else {
                                z8 = false;
                            }
                            jSONObject4.put("is_clickable", z8);
                            jSONObject = jSONObject6;
                        } catch (JSONException unused2) {
                            str = str3;
                            str2 = str4;
                        }
                        try {
                            jSONObject.put((String) entry.getKey(), jSONObject4);
                        } catch (JSONException unused3) {
                            com.google.android.gms.ads.internal.util.client.zzm.zzj("Unable to get asset views information");
                            it = it2;
                            jSONObject3 = jSONObject;
                            str3 = str;
                            str4 = str2;
                        }
                    } catch (JSONException unused4) {
                        str = str3;
                        str2 = str4;
                        jSONObject = jSONObject3;
                    }
                    it = it2;
                    jSONObject3 = jSONObject;
                    str3 = str;
                    str4 = str2;
                }
            }
        }
        return jSONObject3;
    }

    public static JSONObject zze(Context context, @Nullable View view) {
        JSONObject jSONObject = new JSONObject();
        if (view != null) {
            try {
                com.google.android.gms.ads.internal.zzu.zzp();
                jSONObject.put("can_show_on_lock_screen", zzt.zzn(view));
                com.google.android.gms.ads.internal.zzu.zzp();
                jSONObject.put("is_keyguard_locked", zzt.zzD(context));
            } catch (JSONException unused) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("Unable to get lock screen information");
            }
        }
        return jSONObject;
    }

    public static JSONObject zzf(@Nullable View view) {
        int positionForView;
        JSONObject jSONObject = new JSONObject();
        if (view != null) {
            try {
                boolean z8 = true;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzhY)).booleanValue()) {
                    com.google.android.gms.ads.internal.zzu.zzp();
                    ViewParent parent = view.getParent();
                    while (parent != null && !(parent instanceof ScrollView)) {
                        parent = parent.getParent();
                    }
                    if (parent == null) {
                        z8 = false;
                    }
                    jSONObject.put("contained_in_scroll_view", z8);
                } else {
                    com.google.android.gms.ads.internal.zzu.zzp();
                    ViewParent parent2 = view.getParent();
                    while (parent2 != null && !(parent2 instanceof AdapterView)) {
                        parent2 = parent2.getParent();
                    }
                    if (parent2 == null) {
                        positionForView = -1;
                    } else {
                        positionForView = ((AdapterView) parent2).getPositionForView(view);
                    }
                    if (positionForView == -1) {
                        z8 = false;
                    }
                    jSONObject.put("contained_in_scroll_view", z8);
                }
            } catch (Exception unused) {
            }
        }
        return jSONObject;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:16|(9:44|45|19|20|21|(3:23|(1:27)|37)(3:38|(1:40)|37)|28|(2:30|(1:32)(1:35))(1:36)|33)|18|19|20|21|(0)(0)|28|(0)(0)|33) */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0169, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0175, code lost:
    
        com.google.android.gms.ads.internal.util.client.zzm.zzh("Could not log native template signal to JSON", r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0170 A[Catch: JSONException -> 0x0169, TRY_LEAVE, TryCatch #5 {JSONException -> 0x0169, blocks: (B:20:0x013a, B:32:0x0165, B:35:0x016b, B:36:0x0170), top: B:19:0x013a }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x018c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x0175 -> B:32:0x017a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static org.json.JSONObject zzg(android.content.Context r16, @androidx.annotation.Nullable android.view.View r17) {
        /*
            Method dump skipped, instructions count: 431
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.util.zzbz.zzg(android.content.Context, android.view.View):org.json.JSONObject");
    }

    public static boolean zzh(Context context, zzfgt zzfgtVar) {
        if (!zzfgtVar.zzO) {
            return false;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzic)).booleanValue()) {
            return ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzif)).booleanValue();
        }
        String str = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzid);
        if (!str.isEmpty() && context != null) {
            String packageName = context.getPackageName();
            Iterator it = zzfyt.zzc(zzfxr.zzc(';')).zzd(str).iterator();
            while (it.hasNext()) {
                if (((String) it.next()).equals(packageName)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean zzi(int i9) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzdv)).booleanValue()) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzdw)).booleanValue() && i9 > 15299999) {
                return false;
            }
            return true;
        }
        return true;
    }

    public static int[] zzj(@Nullable View view) {
        int[] iArr = new int[2];
        if (view != null) {
            view.getLocationOnScreen(iArr);
        }
        return iArr;
    }

    private static JSONObject zzk(Context context, Rect rect) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("width", com.google.android.gms.ads.internal.client.zzay.zzb().zzb(context, rect.right - rect.left));
        jSONObject.put("height", com.google.android.gms.ads.internal.client.zzay.zzb().zzb(context, rect.bottom - rect.top));
        jSONObject.put("x", com.google.android.gms.ads.internal.client.zzay.zzb().zzb(context, rect.left));
        jSONObject.put("y", com.google.android.gms.ads.internal.client.zzay.zzb().zzb(context, rect.top));
        jSONObject.put("relative_to", "self");
        return jSONObject;
    }

    private static int zzl(int i9) {
        if (i9 != -2) {
            return i9 != -1 ? 2 : 3;
        }
        return 4;
    }
}
