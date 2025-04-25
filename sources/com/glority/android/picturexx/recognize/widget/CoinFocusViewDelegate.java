package com.glority.android.picturexx.recognize.widget;

import android.graphics.RectF;
import com.glority.android.picturexx.recognize.analyzer.AreaStatus;
import kotlin.Metadata;

/* compiled from: CoinFocusViewDelegate.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0007\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H&J\u001d\u0010\u0004\u001a\u00020\u00052\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H&¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"Lcom/glority/android/picturexx/recognize/widget/CoinFocusViewDelegate;", "", "getCircleRectF", "Landroid/graphics/RectF;", "process", "Lcom/glority/android/picturexx/recognize/analyzer/AreaStatus;", "detRegion", "", "", "([Ljava/lang/Float;)Lcom/glority/android/picturexx/recognize/analyzer/AreaStatus;", "recognize_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public interface CoinFocusViewDelegate {
    RectF getCircleRectF();

    AreaStatus process(Float[] detRegion);
}
