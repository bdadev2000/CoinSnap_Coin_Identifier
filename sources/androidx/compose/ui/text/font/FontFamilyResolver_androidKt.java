package androidx.compose.ui.text.font;

import android.content.Context;
import android.os.Build;

/* loaded from: classes2.dex */
public final class FontFamilyResolver_androidKt {
    public static final FontFamilyResolverImpl a(Context context) {
        return new FontFamilyResolverImpl(new AndroidFontLoader(context), new AndroidFontResolveInterceptor(Build.VERSION.SDK_INT >= 31 ? FontWeightAdjustmentHelperApi31.f17275a.a(context) : 0));
    }
}
