package androidx.core.graphics;

import android.graphics.Typeface;
import android.util.Log;
import androidx.annotation.RestrictTo;
import androidx.collection.LongSparseArray;

@RestrictTo
/* loaded from: classes3.dex */
final class WeightTypefaceApi14 {
    static {
        try {
            Typeface.class.getDeclaredField("native_instance").setAccessible(true);
        } catch (Exception e) {
            Log.e("WeightTypeface", e.getClass().getName(), e);
        }
        new LongSparseArray(3);
    }
}
