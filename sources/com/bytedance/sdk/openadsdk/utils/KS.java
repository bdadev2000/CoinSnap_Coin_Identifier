package com.bytedance.sdk.openadsdk.utils;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public class KS {

    /* loaded from: classes.dex */
    public static class zp implements View.OnLayoutChangeListener {
        private int KS;
        private int lMd;
        private final Drawable zp;

        public zp(Drawable drawable) {
            this.zp = drawable;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
            int i17 = i11 - i9;
            int i18 = i12 - i10;
            if (i17 == this.lMd && i18 == this.KS) {
                return;
            }
            this.lMd = i17;
            this.KS = i18;
            this.zp.setBounds(0, 0, i17, i18);
        }
    }

    public static void zp(ViewGroup viewGroup, com.bytedance.sdk.openadsdk.core.model.woN won) {
        if (viewGroup == null || won == null || TextUtils.isEmpty(won.cdp())) {
            return;
        }
        try {
            int i9 = vDp.qW;
            if (viewGroup.getTag(i9) != null) {
                return;
            }
            viewGroup.setTag(i9, Integer.valueOf(i9));
            Drawable zp2 = zp(viewGroup.getResources(), won);
            if (zp2 == null) {
                return;
            }
            viewGroup.setForeground(zp2);
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.tG.zp("add overlay fail", th.getMessage());
        }
    }

    public static void zp(Activity activity, com.bytedance.sdk.openadsdk.core.model.woN won) {
        if (activity == null || won == null || TextUtils.isEmpty(won.cdp())) {
            return;
        }
        try {
            View decorView = activity.getWindow().getDecorView();
            int i9 = vDp.qW;
            if (decorView.getTag(i9) != null) {
                return;
            }
            activity.getWindow().getDecorView().setTag(i9, Integer.valueOf(i9));
            Drawable zp2 = zp(activity.getResources(), won);
            if (zp2 == null) {
                return;
            }
            activity.getWindow().getDecorView().setForeground(zp2);
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.tG.zp("add overlay fail", th.getMessage());
        }
    }

    @Nullable
    private static Drawable zp(Resources resources, com.bytedance.sdk.openadsdk.core.model.woN won) {
        try {
            String cdp = won.cdp();
            if (TextUtils.isEmpty(cdp)) {
                return null;
            }
            byte[] decode = Base64.decode(cdp, 0);
            BitmapDrawable bitmapDrawable = new BitmapDrawable(resources, BitmapFactory.decodeByteArray(decode, 0, decode.length));
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            bitmapDrawable.setTileModeXY(tileMode, tileMode);
            bitmapDrawable.setTargetDensity(resources.getDisplayMetrics());
            return bitmapDrawable;
        } catch (Throwable unused) {
            return null;
        }
    }
}
