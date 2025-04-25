package com.glority.android.picturexx.recognize.analyzer;

import android.graphics.RectF;
import kotlin.Metadata;

/* compiled from: AreaProcessDelegate.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J'\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\bH&¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"Lcom/glority/android/picturexx/recognize/analyzer/AreaProcessDelegate;", "", "process", "Lcom/glority/android/picturexx/recognize/analyzer/AreaStatus;", "detRegion", "", "", "limitedArea", "Landroid/graphics/RectF;", "([Ljava/lang/Float;Landroid/graphics/RectF;)Lcom/glority/android/picturexx/recognize/analyzer/AreaStatus;", "recognize_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public interface AreaProcessDelegate {
    AreaStatus process(Float[] detRegion, RectF limitedArea);
}
