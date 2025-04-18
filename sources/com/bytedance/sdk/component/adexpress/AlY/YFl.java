package com.bytedance.sdk.component.adexpress.AlY;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import com.bytedance.component.sdk.annotation.RequiresApi;

/* loaded from: classes.dex */
public class YFl {
    @RequiresApi(api = 17)
    public static Bitmap YFl(Context context, Bitmap bitmap, int i10) {
        try {
            if (com.bytedance.sdk.component.adexpress.AlY.Sg() && Build.VERSION.SDK_INT < 26) {
                return null;
            }
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, Math.round(bitmap.getWidth() * 0.2f), Math.round(bitmap.getHeight() * 0.2f), false);
            Bitmap createBitmap = Bitmap.createBitmap(createScaledBitmap);
            RenderScript create = RenderScript.create(context);
            if (create == null) {
                return null;
            }
            ScriptIntrinsicBlur create2 = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
            Allocation createFromBitmap = Allocation.createFromBitmap(create, createScaledBitmap);
            Allocation createFromBitmap2 = Allocation.createFromBitmap(create, createBitmap);
            create2.setRadius(i10);
            create2.setInput(createFromBitmap);
            create2.forEach(createFromBitmap2);
            createFromBitmap2.copyTo(createBitmap);
            return createBitmap;
        } catch (Throwable unused) {
            return null;
        }
    }
}
