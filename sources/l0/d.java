package l0;

import android.graphics.Rect;
import android.text.PrecomputedText;
import android.text.TextPaint;
import android.view.DisplayCutout;
import android.webkit.TracingConfig;
import java.util.List;

/* loaded from: classes.dex */
public abstract /* synthetic */ class d {
    public static /* synthetic */ void A() {
    }

    public static /* synthetic */ PrecomputedText.Params.Builder d(TextPaint textPaint) {
        return new PrecomputedText.Params.Builder(textPaint);
    }

    public static /* synthetic */ DisplayCutout f(Rect rect, List list) {
        return new DisplayCutout(rect, list);
    }

    public static /* synthetic */ void k() {
        new TracingConfig.Builder();
    }

    public static /* synthetic */ void x() {
    }
}
