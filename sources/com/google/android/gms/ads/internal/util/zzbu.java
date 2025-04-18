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
import com.google.android.gms.internal.ads.zzbcn;
import com.google.android.gms.internal.ads.zzfet;
import com.google.android.gms.internal.ads.zzfwf;
import com.google.android.gms.internal.ads.zzfxd;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zzbu {
    public static Point zza(MotionEvent motionEvent, @Nullable View view) {
        int[] zzj = zzj(view);
        return new Point(((int) motionEvent.getRawX()) - zzj[0], ((int) motionEvent.getRawY()) - zzj[1]);
    }

    public static WindowManager.LayoutParams zzb() {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-2, -2, 0, 0, -2);
        layoutParams.flags = ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzhI)).intValue();
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
                    jSONObject3.put("x", com.google.android.gms.ads.internal.client.zzbc.zzb().zzb(context, point2.x));
                    jSONObject3.put("y", com.google.android.gms.ads.internal.client.zzbc.zzb().zzb(context, point2.y));
                    jSONObject3.put("start_x", com.google.android.gms.ads.internal.client.zzbc.zzb().zzb(context, point.x));
                    jSONObject3.put("start_y", com.google.android.gms.ads.internal.client.zzbc.zzb().zzb(context, point.y));
                    jSONObject = jSONObject3;
                } catch (JSONException e2) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzh("Error occurred while putting signals into JSON object.", e2);
                }
                jSONObject2.put("click_point", jSONObject);
                jSONObject2.put("asset_id", str);
                return jSONObject2;
            } catch (Exception e10) {
                e = e10;
                jSONObject = jSONObject2;
                com.google.android.gms.ads.internal.util.client.zzm.zzh("Error occurred while grabbing click signals.", e);
                return jSONObject;
            }
        } catch (Exception e11) {
            e = e11;
        }
    }

    public static JSONObject zzd(Context context, @Nullable Map map, @Nullable Map map2, @Nullable View view, @Nullable ImageView.ScaleType scaleType) {
        String str;
        String str2;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        boolean z10;
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
                            jSONObject5.put("width", com.google.android.gms.ads.internal.client.zzbc.zzb().zzb(context, view2.getMeasuredWidth()));
                            jSONObject5.put("height", com.google.android.gms.ads.internal.client.zzbc.zzb().zzb(context, view2.getMeasuredHeight()));
                            jSONObject5.put("x", com.google.android.gms.ads.internal.client.zzbc.zzb().zzb(context, zzj2[0] - zzj[0]));
                            jSONObject5.put("y", com.google.android.gms.ads.internal.client.zzbc.zzb().zzb(context, zzj2[1] - zzj[1]));
                            jSONObject5.put(str4, str3);
                            jSONObject4.put("frame", jSONObject5);
                            Rect rect = new Rect();
                            if (view2.getLocalVisibleRect(rect)) {
                                jSONObject2 = zzk(context, rect);
                            } else {
                                jSONObject2 = new JSONObject();
                                jSONObject2.put("width", 0);
                                jSONObject2.put("height", 0);
                                jSONObject2.put("x", com.google.android.gms.ads.internal.client.zzbc.zzb().zzb(context, zzj2[0] - zzj[0]));
                                jSONObject2.put("y", com.google.android.gms.ads.internal.client.zzbc.zzb().zzb(context, zzj2[1] - zzj[1]));
                                jSONObject2.put(str4, str3);
                            }
                            jSONObject4.put("visible_bounds", jSONObject2);
                            if (((String) entry.getKey()).equals("3010")) {
                                if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzhD)).booleanValue()) {
                                    jSONObject4.put("mediaview_graphics_matrix", view2.getMatrix().toShortString());
                                }
                                if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzhE)).booleanValue()) {
                                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                                    jSONObject4.put("view_width_layout_type", zzl(layoutParams.width) - 1);
                                    jSONObject4.put("view_height_layout_type", zzl(layoutParams.height) - 1);
                                }
                                if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzhF)).booleanValue()) {
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
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            jSONObject4.put("is_clickable", z10);
                            jSONObject = jSONObject6;
                            try {
                                jSONObject.put((String) entry.getKey(), jSONObject4);
                            } catch (JSONException unused2) {
                                com.google.android.gms.ads.internal.util.client.zzm.zzj("Unable to get asset views information");
                                it = it2;
                                jSONObject3 = jSONObject;
                                str3 = str;
                                str4 = str2;
                            }
                        } catch (JSONException unused3) {
                            str = str3;
                            str2 = str4;
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
                com.google.android.gms.ads.internal.zzv.zzq();
                jSONObject.put("can_show_on_lock_screen", zzs.zzn(view));
                com.google.android.gms.ads.internal.zzv.zzq();
                jSONObject.put("is_keyguard_locked", zzs.zzD(context));
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
                boolean z10 = false;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzhC)).booleanValue()) {
                    com.google.android.gms.ads.internal.zzv.zzq();
                    ViewParent parent = view.getParent();
                    while (parent != null && !(parent instanceof ScrollView)) {
                        parent = parent.getParent();
                    }
                    if (parent != null) {
                        z10 = true;
                    }
                    jSONObject.put("contained_in_scroll_view", z10);
                } else {
                    com.google.android.gms.ads.internal.zzv.zzq();
                    ViewParent parent2 = view.getParent();
                    while (parent2 != null && !(parent2 instanceof AdapterView)) {
                        parent2 = parent2.getParent();
                    }
                    if (parent2 == null) {
                        positionForView = -1;
                    } else {
                        positionForView = ((AdapterView) parent2).getPositionForView(view);
                    }
                    if (positionForView != -1) {
                        z10 = true;
                    }
                    jSONObject.put("contained_in_scroll_view", z10);
                }
            } catch (Exception unused) {
            }
        }
        return jSONObject;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:3|(7:4|5|(2:8|6)|9|10|(1:12)(1:57)|13)|14|(7:48|49|17|18|19|20|(8:22|(6:26|27|(2:29|(1:31)(1:40))(1:41)|32|33|(2:35|36))|42|27|(0)(0)|32|33|(0))(8:43|(6:45|27|(0)(0)|32|33|(0))|42|27|(0)(0)|32|33|(0)))|16|17|18|19|20|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0164, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0165, code lost:
    
        com.google.android.gms.ads.internal.util.client.zzm.zzh("Could not log native template signal to JSON", r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x017c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x015f A[Catch: JSONException -> 0x0164, TRY_LEAVE, TryCatch #3 {JSONException -> 0x0164, blocks: (B:19:0x012b, B:31:0x0156, B:40:0x015a, B:41:0x015f), top: B:18:0x012b }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0144  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static org.json.JSONObject zzg(android.content.Context r16, @androidx.annotation.Nullable android.view.View r17) {
        /*
            Method dump skipped, instructions count: 415
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.util.zzbu.zzg(android.content.Context, android.view.View):org.json.JSONObject");
    }

    public static boolean zzh(Context context, zzfet zzfetVar) {
        if (!zzfetVar.zzN) {
            return false;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzhG)).booleanValue()) {
            return ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzhJ)).booleanValue();
        }
        String str = (String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzhH);
        if (!str.isEmpty() && context != null) {
            String packageName = context.getPackageName();
            Iterator it = zzfxd.zzb(zzfwf.zzc(';')).zzc(str).iterator();
            while (it.hasNext()) {
                if (((String) it.next()).equals(packageName)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean zzi(int i10) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzdA)).booleanValue()) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzdB)).booleanValue() && i10 > 15299999) {
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
        jSONObject.put("width", com.google.android.gms.ads.internal.client.zzbc.zzb().zzb(context, rect.right - rect.left));
        jSONObject.put("height", com.google.android.gms.ads.internal.client.zzbc.zzb().zzb(context, rect.bottom - rect.top));
        jSONObject.put("x", com.google.android.gms.ads.internal.client.zzbc.zzb().zzb(context, rect.left));
        jSONObject.put("y", com.google.android.gms.ads.internal.client.zzbc.zzb().zzb(context, rect.top));
        jSONObject.put("relative_to", "self");
        return jSONObject;
    }

    private static int zzl(int i10) {
        if (i10 != -2) {
            return i10 != -1 ? 2 : 3;
        }
        return 4;
    }
}
