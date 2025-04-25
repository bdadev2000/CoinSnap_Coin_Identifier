package com.glority.android.picturexx.recognize.analyzer;

import android.graphics.RectF;
import kotlin.Metadata;

/* compiled from: NewAreaProcessor.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\r\u001a\u00020\u000e2\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0002\u0010\u0013J%\u0010\u0014\u001a\u00020\u00052\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\u0002\u0010\u0015R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/glority/android/picturexx/recognize/analyzer/NewAreaProcessor;", "Lcom/glority/android/picturexx/recognize/analyzer/AreaProcessDelegate;", "<init>", "()V", "tooSmallRate", "", "maxOverRate", "hold", "", "getHold", "()Z", "setHold", "(Z)V", "process", "Lcom/glority/android/picturexx/recognize/analyzer/AreaStatus;", "detRegion", "", "limitedArea", "Landroid/graphics/RectF;", "([Ljava/lang/Float;Landroid/graphics/RectF;)Lcom/glority/android/picturexx/recognize/analyzer/AreaStatus;", "calculateZoomFactor", "([Ljava/lang/Float;Landroid/graphics/RectF;)F", "recognize_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class NewAreaProcessor implements AreaProcessDelegate {
    private boolean hold;
    private final float tooSmallRate = 0.25f;
    private final float maxOverRate = 0.8f;

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
        RectF rectF = new RectF(detRegion[1].floatValue() * limitedArea.width(), detRegion[0].floatValue() * limitedArea.height(), detRegion[3].floatValue() * limitedArea.width(), detRegion[2].floatValue() * limitedArea.height());
        float f = 2;
        RectF rectF2 = new RectF(limitedArea.centerX() - ((limitedArea.width() * this.maxOverRate) / f), limitedArea.centerY() - ((limitedArea.height() * this.maxOverRate) / f), limitedArea.centerX() + ((limitedArea.width() * this.maxOverRate) / f), limitedArea.centerY() + ((limitedArea.height() * this.maxOverRate) / f));
        if (rectF2.contains(rectF) && (rectF.width() < limitedArea.width() * this.tooSmallRate || rectF.height() < limitedArea.height() * this.tooSmallRate)) {
            return AreaStatus.TOO_SMALL;
        }
        if (rectF.width() > rectF2.width() || rectF.height() > rectF2.height()) {
            return AreaStatus.TOO_CLOSE;
        }
        if (rectF2.contains(rectF)) {
            return AreaStatus.FOUND;
        }
        return AreaStatus.NOT_FOUND;
    }

    public final float calculateZoomFactor(Float[] detRegion, RectF limitedArea) {
        if (detRegion == null || limitedArea == null || process(detRegion, limitedArea) != AreaStatus.TOO_SMALL) {
            return 1.0f;
        }
        RectF rectF = new RectF(detRegion[1].floatValue() * limitedArea.width(), detRegion[0].floatValue() * limitedArea.height(), detRegion[3].floatValue() * limitedArea.width(), detRegion[2].floatValue() * limitedArea.height());
        float f = 2;
        RectF rectF2 = new RectF(limitedArea.centerX() - ((limitedArea.width() * this.maxOverRate) / f), limitedArea.centerY() - ((limitedArea.height() * this.maxOverRate) / f), limitedArea.centerX() + ((limitedArea.width() * this.maxOverRate) / f), limitedArea.centerY() + ((limitedArea.height() * this.maxOverRate) / f));
        float width = rectF.width() / f;
        float centerX = rectF.centerX() - rectF2.left;
        float centerX2 = rectF2.right - rectF.centerX();
        float height = rectF.height() / f;
        return Math.min(Math.min(centerX / width, centerX2 / width), Math.min((rectF.centerY() - rectF2.top) / height, (rectF2.bottom - rectF.centerY()) / height));
    }
}
