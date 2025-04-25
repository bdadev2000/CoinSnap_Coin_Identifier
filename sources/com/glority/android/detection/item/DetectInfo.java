package com.glority.android.detection.item;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DetectInfo.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0007\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0002\u0010\u0007J\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\t\u0010\u0011\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0004HÆ\u0003J2\u0010\u0013\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\"\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000e\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\t¨\u0006\u001c"}, d2 = {"Lcom/glority/android/detection/item/DetectInfo;", "", TtmlNode.TAG_REGION, "", "", "detectionScore", "strategyScore", "([Ljava/lang/Float;FF)V", "getDetectionScore", "()F", "getRegion", "()[Ljava/lang/Float;", "setRegion", "([Ljava/lang/Float;)V", "[Ljava/lang/Float;", "getStrategyScore", "component1", "component2", "component3", "copy", "([Ljava/lang/Float;FF)Lcom/glority/android/detection/item/DetectInfo;", "equals", "", "other", "hashCode", "", "toString", "", "lib-image-detection_release"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes13.dex */
public final /* data */ class DetectInfo {
    private final float detectionScore;
    private Float[] region;
    private final float strategyScore;

    public static /* synthetic */ DetectInfo copy$default(DetectInfo detectInfo, Float[] fArr, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            fArr = detectInfo.region;
        }
        if ((i & 2) != 0) {
            f = detectInfo.detectionScore;
        }
        if ((i & 4) != 0) {
            f2 = detectInfo.strategyScore;
        }
        return detectInfo.copy(fArr, f, f2);
    }

    /* renamed from: component1, reason: from getter */
    public final Float[] getRegion() {
        return this.region;
    }

    /* renamed from: component2, reason: from getter */
    public final float getDetectionScore() {
        return this.detectionScore;
    }

    /* renamed from: component3, reason: from getter */
    public final float getStrategyScore() {
        return this.strategyScore;
    }

    public final DetectInfo copy(Float[] region, float detectionScore, float strategyScore) {
        Intrinsics.checkNotNullParameter(region, "region");
        return new DetectInfo(region, detectionScore, strategyScore);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DetectInfo)) {
            return false;
        }
        DetectInfo detectInfo = (DetectInfo) other;
        return Intrinsics.areEqual(this.region, detectInfo.region) && Float.compare(this.detectionScore, detectInfo.detectionScore) == 0 && Float.compare(this.strategyScore, detectInfo.strategyScore) == 0;
    }

    public int hashCode() {
        return (((Arrays.hashCode(this.region) * 31) + Float.hashCode(this.detectionScore)) * 31) + Float.hashCode(this.strategyScore);
    }

    public String toString() {
        return "DetectInfo(region=" + Arrays.toString(this.region) + ", detectionScore=" + this.detectionScore + ", strategyScore=" + this.strategyScore + ")";
    }

    public DetectInfo(Float[] region, float f, float f2) {
        Intrinsics.checkNotNullParameter(region, "region");
        this.region = region;
        this.detectionScore = f;
        this.strategyScore = f2;
    }

    public final Float[] getRegion() {
        return this.region;
    }

    public final void setRegion(Float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<set-?>");
        this.region = fArr;
    }

    public final float getDetectionScore() {
        return this.detectionScore;
    }

    public final float getStrategyScore() {
        return this.strategyScore;
    }
}
