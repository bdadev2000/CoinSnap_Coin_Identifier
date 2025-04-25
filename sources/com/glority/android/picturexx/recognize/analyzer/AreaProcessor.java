package com.glority.android.picturexx.recognize.analyzer;

import android.graphics.RectF;
import kotlin.Metadata;

/* compiled from: AreaProcessor.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\r\u001a\u00020\u000e2\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0002\u0010\u0013R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0014"}, d2 = {"Lcom/glority/android/picturexx/recognize/analyzer/AreaProcessor;", "Lcom/glority/android/picturexx/recognize/analyzer/AreaProcessDelegate;", "<init>", "()V", "tooSmallRate", "", "maxOverRate", "hold", "", "getHold", "()Z", "setHold", "(Z)V", "process", "Lcom/glority/android/picturexx/recognize/analyzer/AreaStatus;", "detRegion", "", "limitedArea", "Landroid/graphics/RectF;", "([Ljava/lang/Float;Landroid/graphics/RectF;)Lcom/glority/android/picturexx/recognize/analyzer/AreaStatus;", "recognize_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class AreaProcessor implements AreaProcessDelegate {
    private boolean hold;
    private final float tooSmallRate = 0.45f;
    private final float maxOverRate = 1.3f;

    public final boolean getHold() {
        return this.hold;
    }

    public final void setHold(boolean z) {
        this.hold = z;
    }

    @Override // com.glority.android.picturexx.recognize.analyzer.AreaProcessDelegate
    public AreaStatus process(Float[] detRegion, RectF limitedArea) {
        if (this.hold) {
            return AreaStatus.HOLD;
        }
        if (detRegion == null) {
            return AreaStatus.NOT_FOUND;
        }
        if (limitedArea == null) {
            return AreaStatus.ERROR;
        }
        float f = 1;
        float f2 = 2;
        RectF rectF = new RectF(limitedArea.left - ((limitedArea.width() * (this.maxOverRate - f)) / f2), limitedArea.top - ((limitedArea.height() * (this.maxOverRate - f)) / f2), limitedArea.right + ((limitedArea.width() * (this.maxOverRate - f)) / f2), limitedArea.bottom + ((limitedArea.height() * (this.maxOverRate - f)) / f2));
        RectF rectF2 = new RectF(detRegion[1].floatValue(), detRegion[0].floatValue(), detRegion[3].floatValue(), detRegion[2].floatValue());
        if (rectF.contains(rectF2) && (rectF2.width() < limitedArea.width() * this.tooSmallRate || rectF2.height() < limitedArea.height() * this.tooSmallRate)) {
            return AreaStatus.TOO_SMALL;
        }
        if (rectF.contains(rectF2)) {
            return AreaStatus.FOUND;
        }
        return AreaStatus.NOT_FOUND;
    }
}
