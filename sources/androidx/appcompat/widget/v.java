package androidx.appcompat.widget;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import com.google.android.gms.cloudmessaging.Rpc;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.plantcare.ai.identifier.plantid.R;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.concurrent.ExecutionException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class v {
    public final Object a;

    /* renamed from: b, reason: collision with root package name */
    public Object f1057b;

    /* renamed from: c, reason: collision with root package name */
    public Object f1058c;

    /* renamed from: d, reason: collision with root package name */
    public Object f1059d;

    /* renamed from: e, reason: collision with root package name */
    public Object f1060e;

    /* renamed from: f, reason: collision with root package name */
    public Object f1061f;

    public v(JSONObject jSONObject) {
        this.a = jSONObject.getString("productId");
        this.f1057b = jSONObject.optString(CampaignEx.JSON_KEY_TITLE);
        this.f1058c = jSONObject.optString("name");
        this.f1059d = jSONObject.optString("description");
        this.f1060e = jSONObject.optString("basePlanId");
        JSONObject optJSONObject = jSONObject.optJSONObject("pricingPhase");
        this.f1061f = optJSONObject == null ? null : new a4.r(optJSONObject);
    }

    public static boolean b(int i10, int[] iArr) {
        for (int i11 : iArr) {
            if (i11 == i10) {
                return true;
            }
        }
        return false;
    }

    public static ColorStateList c(Context context, int i10) {
        int c10 = p3.c(context, R.attr.colorControlHighlight);
        return new ColorStateList(new int[][]{p3.f994b, p3.f996d, p3.f995c, p3.f998f}, new int[]{p3.b(context, R.attr.colorButtonNormal), g0.d.b(c10, i10), g0.d.b(c10, i10), i10});
    }

    public static v8.z e(s7.h2 h2Var, com.google.common.collect.r0 r0Var, v8.z zVar, s7.v2 v2Var) {
        Object l10;
        int i10;
        s7.i0 i0Var = (s7.i0) h2Var;
        s7.x2 x10 = i0Var.x();
        int u = i0Var.u();
        if (x10.p()) {
            l10 = null;
        } else {
            l10 = x10.l(u);
        }
        if (!i0Var.C() && !x10.p()) {
            i10 = x10.f(u, v2Var, false).b(n9.h0.H(i0Var.v()) - v2Var.f24789g);
        } else {
            i10 = -1;
        }
        for (int i11 = 0; i11 < r0Var.size(); i11++) {
            v8.z zVar2 = (v8.z) r0Var.get(i11);
            if (h(zVar2, l10, i0Var.C(), i0Var.r(), i0Var.s(), i10)) {
                return zVar2;
            }
        }
        if (r0Var.isEmpty() && zVar != null) {
            if (h(zVar, l10, i0Var.C(), i0Var.r(), i0Var.s(), i10)) {
                return zVar;
            }
        }
        return null;
    }

    public static LayerDrawable f(s2 s2Var, Context context, int i10) {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i10);
        Drawable e2 = s2Var.e(context, R.drawable.abc_star_black_48dp);
        Drawable e10 = s2Var.e(context, R.drawable.abc_star_half_black_48dp);
        if ((e2 instanceof BitmapDrawable) && e2.getIntrinsicWidth() == dimensionPixelSize && e2.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable = (BitmapDrawable) e2;
            bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
        } else {
            Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            e2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            e2.draw(canvas);
            bitmapDrawable = new BitmapDrawable(createBitmap);
            bitmapDrawable2 = new BitmapDrawable(createBitmap);
        }
        bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
        if ((e10 instanceof BitmapDrawable) && e10.getIntrinsicWidth() == dimensionPixelSize && e10.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (BitmapDrawable) e10;
        } else {
            Bitmap createBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap2);
            e10.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            e10.draw(canvas2);
            bitmapDrawable3 = new BitmapDrawable(createBitmap2);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
        layerDrawable.setId(0, android.R.id.background);
        layerDrawable.setId(1, android.R.id.secondaryProgress);
        layerDrawable.setId(2, android.R.id.progress);
        return layerDrawable;
    }

    public static boolean h(v8.z zVar, Object obj, boolean z10, int i10, int i11, int i12) {
        if (!zVar.a.equals(obj)) {
            return false;
        }
        int i13 = zVar.f26318b;
        if ((!z10 || i13 != i10 || zVar.f26319c != i11) && (z10 || i13 != -1 || zVar.f26321e != i12)) {
            return false;
        }
        return true;
    }

    public static void j(Drawable drawable, int i10, PorterDuff.Mode mode) {
        PorterDuffColorFilter g10;
        int[] iArr = s1.a;
        Drawable mutate = drawable.mutate();
        if (mode == null) {
            mode = w.f1066b;
        }
        PorterDuff.Mode mode2 = w.f1066b;
        synchronized (w.class) {
            g10 = s2.g(i10, mode);
        }
        mutate.setColorFilter(g10);
    }

    public final void a(m9.s sVar, v8.z zVar, s7.x2 x2Var) {
        if (zVar == null) {
            return;
        }
        if (x2Var.b(zVar.a) != -1) {
            sVar.c(zVar, x2Var);
            return;
        }
        s7.x2 x2Var2 = (s7.x2) ((com.google.common.collect.u0) this.f1058c).get(zVar);
        if (x2Var2 != null) {
            sVar.c(zVar, x2Var2);
        }
    }

    public final Task d(Task task) {
        return task.continueWith(new l.a(18), new gb.d(this, 5));
    }

    public final ColorStateList g(Context context, int i10) {
        if (i10 == R.drawable.abc_edit_text_material) {
            return d0.h.getColorStateList(context, R.color.abc_tint_edittext);
        }
        if (i10 == 2131230878) {
            return d0.h.getColorStateList(context, R.color.abc_tint_switch_track);
        }
        if (i10 == R.drawable.abc_switch_thumb_material) {
            int[][] iArr = new int[3];
            int[] iArr2 = new int[3];
            ColorStateList d10 = p3.d(context, R.attr.colorSwitchThumbNormal);
            if (d10 != null && d10.isStateful()) {
                int[] iArr3 = p3.f994b;
                iArr[0] = iArr3;
                iArr2[0] = d10.getColorForState(iArr3, 0);
                iArr[1] = p3.f997e;
                iArr2[1] = p3.c(context, R.attr.colorControlActivated);
                iArr[2] = p3.f998f;
                iArr2[2] = d10.getDefaultColor();
            } else {
                iArr[0] = p3.f994b;
                iArr2[0] = p3.b(context, R.attr.colorSwitchThumbNormal);
                iArr[1] = p3.f997e;
                iArr2[1] = p3.c(context, R.attr.colorControlActivated);
                iArr[2] = p3.f998f;
                iArr2[2] = p3.c(context, R.attr.colorSwitchThumbNormal);
            }
            return new ColorStateList(iArr, iArr2);
        }
        if (i10 == R.drawable.abc_btn_default_mtrl_shape) {
            return c(context, p3.c(context, R.attr.colorButtonNormal));
        }
        if (i10 == R.drawable.abc_btn_borderless_material) {
            return c(context, 0);
        }
        if (i10 == R.drawable.abc_btn_colored_material) {
            return c(context, p3.c(context, R.attr.colorAccent));
        }
        if (i10 != 2131230873 && i10 != R.drawable.abc_spinner_textfield_background_material) {
            if (b(i10, (int[]) this.f1057b)) {
                return p3.d(context, R.attr.colorControlNormal);
            }
            if (b(i10, (int[]) this.f1060e)) {
                return d0.h.getColorStateList(context, R.color.abc_tint_default);
            }
            if (b(i10, (int[]) this.f1061f)) {
                return d0.h.getColorStateList(context, R.color.abc_tint_btn_checkable);
            }
            if (i10 == R.drawable.abc_seekbar_thumb_material) {
                return d0.h.getColorStateList(context, R.color.abc_tint_seek_thumb);
            }
            return null;
        }
        return d0.h.getColorStateList(context, R.color.abc_tint_spinner);
    }

    public final void i(Bundle bundle, String str, String str2) {
        int i10;
        String str3;
        String str4;
        String str5;
        boolean g10;
        int i11;
        PackageInfo b3;
        bundle.putString("scope", str2);
        bundle.putString("sender", str);
        bundle.putString("subtype", str);
        va.g gVar = (va.g) this.a;
        gVar.a();
        bundle.putString("gmp_app_id", gVar.f26389c.f26406b);
        com.facebook.i iVar = (com.facebook.i) this.f1057b;
        synchronized (iVar) {
            if (iVar.f11015c == 0 && (b3 = iVar.b("com.google.android.gms")) != null) {
                iVar.f11015c = b3.versionCode;
            }
            i10 = iVar.f11015c;
        }
        bundle.putString("gmsv", Integer.toString(i10));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        com.facebook.i iVar2 = (com.facebook.i) this.f1057b;
        synchronized (iVar2) {
            if (iVar2.a == null) {
                iVar2.d();
            }
            str3 = iVar2.a;
        }
        bundle.putString("app_ver", str3);
        com.facebook.i iVar3 = (com.facebook.i) this.f1057b;
        synchronized (iVar3) {
            if (iVar3.f11014b == null) {
                iVar3.d();
            }
            str4 = iVar3.f11014b;
        }
        bundle.putString("app_ver_name", str4);
        va.g gVar2 = (va.g) this.a;
        gVar2.a();
        try {
            str5 = Base64.encodeToString(MessageDigest.getInstance("SHA-1").digest(gVar2.f26388b.getBytes()), 11);
        } catch (NoSuchAlgorithmException unused) {
            str5 = "[HASH-ERROR]";
        }
        bundle.putString("firebase-app-name-hash", str5);
        try {
            String str6 = ((dc.a) Tasks.await(((dc.d) ((dc.e) this.f1061f)).d())).a;
            if (!TextUtils.isEmpty(str6)) {
                bundle.putString("Goog-Firebase-Installations-Auth", str6);
            } else {
                Log.w("FirebaseMessaging", "FIS auth token is empty");
            }
        } catch (InterruptedException | ExecutionException e2) {
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e2);
        }
        bundle.putString("appid", (String) Tasks.await(((dc.d) ((dc.e) this.f1061f)).c()));
        bundle.putString("cliv", "fcm-24.1.0");
        ac.g gVar3 = (ac.g) ((cc.c) this.f1060e).get();
        kc.b bVar = (kc.b) ((cc.c) this.f1059d).get();
        if (gVar3 != null && bVar != null) {
            ac.d dVar = (ac.d) gVar3;
            synchronized (dVar) {
                long currentTimeMillis = System.currentTimeMillis();
                ac.h hVar = (ac.h) dVar.a.get();
                synchronized (hVar) {
                    g10 = hVar.g(currentTimeMillis);
                }
                if (g10) {
                    synchronized (hVar) {
                        String d10 = hVar.d(System.currentTimeMillis());
                        hVar.a.edit().putString("last-used-date", d10).commit();
                        hVar.f(d10);
                    }
                    i11 = 3;
                } else {
                    i11 = 1;
                }
            }
            if (i11 != 1) {
                bundle.putString("Firebase-Client-Log-Type", Integer.toString(t.h.b(i11)));
                bundle.putString("Firebase-Client", bVar.a());
            }
        }
    }

    public final Task k(Bundle bundle, String str, String str2) {
        try {
            i(bundle, str, str2);
            return ((Rpc) this.f1058c).send(bundle);
        } catch (InterruptedException | ExecutionException e2) {
            return Tasks.forException(e2);
        }
    }

    public final void l(s7.x2 x2Var) {
        m9.s sVar = new m9.s(4);
        if (((com.google.common.collect.r0) this.f1057b).isEmpty()) {
            a(sVar, (v8.z) this.f1060e, x2Var);
            if (!v8.u0.t((v8.z) this.f1061f, (v8.z) this.f1060e)) {
                a(sVar, (v8.z) this.f1061f, x2Var);
            }
            if (!v8.u0.t((v8.z) this.f1059d, (v8.z) this.f1060e) && !v8.u0.t((v8.z) this.f1059d, (v8.z) this.f1061f)) {
                a(sVar, (v8.z) this.f1059d, x2Var);
            }
        } else {
            for (int i10 = 0; i10 < ((com.google.common.collect.r0) this.f1057b).size(); i10++) {
                a(sVar, (v8.z) ((com.google.common.collect.r0) this.f1057b).get(i10), x2Var);
            }
            if (!((com.google.common.collect.r0) this.f1057b).contains((v8.z) this.f1059d)) {
                a(sVar, (v8.z) this.f1059d, x2Var);
            }
        }
        this.f1058c = sVar.a();
    }

    public v(Drawable.Callback callback) {
        this.a = new d3.g(11, (com.applovin.impl.mediation.ads.e) null);
        this.f1057b = new HashMap();
        this.f1058c = new HashMap();
        this.f1061f = ".ttf";
        this.f1060e = null;
        if (!(callback instanceof View)) {
            y3.b.b("LottieDrawable must be inside of a view for images to work.");
            this.f1059d = null;
        } else {
            this.f1059d = ((View) callback).getContext().getAssets();
        }
    }

    public v() {
        this.a = new int[]{2131230888, 2131230886, 2131230812};
        this.f1057b = new int[]{2131230836, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};
        this.f1058c = new int[]{2131230885, 2131230887, 2131230829, R.drawable.abc_text_cursor_material, 2131230882, 2131230883, 2131230884};
        this.f1059d = new int[]{2131230861, R.drawable.abc_cab_background_internal_bg, 2131230860};
        this.f1060e = new int[]{R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};
        this.f1061f = new int[]{R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};
    }

    public v(va.g gVar, com.facebook.i iVar, cc.c cVar, cc.c cVar2, dc.e eVar) {
        gVar.a();
        Rpc rpc = new Rpc(gVar.a);
        this.a = gVar;
        this.f1057b = iVar;
        this.f1058c = rpc;
        this.f1059d = cVar;
        this.f1060e = cVar2;
        this.f1061f = eVar;
    }

    public v(s7.v2 v2Var) {
        this.a = v2Var;
        com.google.common.collect.n0 n0Var = com.google.common.collect.r0.f12026c;
        this.f1057b = com.google.common.collect.z1.f12062g;
        this.f1058c = com.google.common.collect.e2.f11936i;
    }
}
