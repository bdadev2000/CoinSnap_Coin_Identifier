package com.vungle.ads.internal.ui;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.util.Base64;
import android.widget.ImageView;
import com.mbridge.msdk.MBridgeConstans;

/* loaded from: classes3.dex */
public final class q extends ImageView {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(Context context, String str) {
        super(context);
        G7.j.e(context, "context");
        G7.j.e(str, MBridgeConstans.EXTRA_KEY_WM);
        byte[] decode = Base64.decode(str, 0);
        G7.j.d(decode, "overlayBytes");
        BitmapDrawable bitmapDrawable = new BitmapDrawable(context.getResources(), BitmapFactory.decodeByteArray(decode, 0, decode.length));
        Shader.TileMode tileMode = Shader.TileMode.REPEAT;
        bitmapDrawable.setTileModeXY(tileMode, tileMode);
        bitmapDrawable.setTargetDensity(context.getResources().getDisplayMetrics());
        setBackground(bitmapDrawable);
        setClickable(false);
        setFocusable(false);
    }
}
