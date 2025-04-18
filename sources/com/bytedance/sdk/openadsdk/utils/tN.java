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
public class tN {

    /* loaded from: classes.dex */
    public static class YFl implements View.OnLayoutChangeListener {
        private int Sg;
        private final Drawable YFl;
        private int tN;

        public YFl(Drawable drawable) {
            this.YFl = drawable;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            int i18 = i12 - i10;
            int i19 = i13 - i11;
            if (i18 == this.Sg && i19 == this.tN) {
                return;
            }
            this.Sg = i18;
            this.tN = i19;
            this.YFl.setBounds(0, 0, i18, i19);
        }
    }

    public static void YFl(ViewGroup viewGroup, com.bytedance.sdk.openadsdk.core.model.Wwa wwa) {
        if (viewGroup == null || wwa == null || TextUtils.isEmpty(wwa.bwE())) {
            return;
        }
        try {
            int i10 = GA.bwE;
            if (viewGroup.getTag(i10) != null) {
                return;
            }
            viewGroup.setTag(i10, Integer.valueOf(i10));
            Drawable YFl2 = YFl(viewGroup.getResources(), wwa);
            if (YFl2 == null) {
                return;
            }
            viewGroup.setForeground(YFl2);
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.YoT.YFl("add overlay fail", th2.getMessage());
        }
    }

    public static void YFl(Activity activity, com.bytedance.sdk.openadsdk.core.model.Wwa wwa) {
        if (activity == null || wwa == null || TextUtils.isEmpty(wwa.bwE())) {
            return;
        }
        try {
            View decorView = activity.getWindow().getDecorView();
            int i10 = GA.bwE;
            if (decorView.getTag(i10) != null) {
                return;
            }
            activity.getWindow().getDecorView().setTag(i10, Integer.valueOf(i10));
            Drawable YFl2 = YFl(activity.getResources(), wwa);
            if (YFl2 == null) {
                return;
            }
            activity.getWindow().getDecorView().setForeground(YFl2);
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.YoT.YFl("add overlay fail", th2.getMessage());
        }
    }

    @Nullable
    private static Drawable YFl(Resources resources, com.bytedance.sdk.openadsdk.core.model.Wwa wwa) {
        try {
            String bwE = wwa.bwE();
            if (TextUtils.isEmpty(bwE)) {
                return null;
            }
            byte[] decode = Base64.decode(bwE, 0);
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
