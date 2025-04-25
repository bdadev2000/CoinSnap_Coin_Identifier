package com.glority.android.detection.item;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.detection.p001enum.Strategy;
import com.google.gson.Gson;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DetectOutput.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0002\u0010\nJ\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003¢\u0006\u0002\u0010\u000eJ\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J\t\u0010\u0016\u001a\u00020\bHÆ\u0003J\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018J<\u0010\u0019\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0002\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006!"}, d2 = {"Lcom/glority/android/detection/item/DetectOutput;", "", "regions", "", "Lcom/glority/android/detection/item/DetectInfo;", "strategy", "Lcom/glority/android/detection/enum/Strategy;", "extend", "", "scoreThreshold", "([Lcom/glority/android/detection/item/DetectInfo;Lcom/glority/android/detection/enum/Strategy;FF)V", "getExtend", "()F", "getRegions", "()[Lcom/glority/android/detection/item/DetectInfo;", "[Lcom/glority/android/detection/item/DetectInfo;", "getScoreThreshold", "getStrategy", "()Lcom/glority/android/detection/enum/Strategy;", "component1", "component2", "component3", "component4", "convertToJson", "", "copy", "([Lcom/glority/android/detection/item/DetectInfo;Lcom/glority/android/detection/enum/Strategy;FF)Lcom/glority/android/detection/item/DetectOutput;", "equals", "", "other", "hashCode", "", "toString", "lib-image-detection_release"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes13.dex */
public final /* data */ class DetectOutput {
    private final float extend;
    private final DetectInfo[] regions;
    private final float scoreThreshold;
    private final Strategy strategy;

    public static /* synthetic */ DetectOutput copy$default(DetectOutput detectOutput, DetectInfo[] detectInfoArr, Strategy strategy, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            detectInfoArr = detectOutput.regions;
        }
        if ((i & 2) != 0) {
            strategy = detectOutput.strategy;
        }
        if ((i & 4) != 0) {
            f = detectOutput.extend;
        }
        if ((i & 8) != 0) {
            f2 = detectOutput.scoreThreshold;
        }
        return detectOutput.copy(detectInfoArr, strategy, f, f2);
    }

    /* renamed from: component1, reason: from getter */
    public final DetectInfo[] getRegions() {
        return this.regions;
    }

    /* renamed from: component2, reason: from getter */
    public final Strategy getStrategy() {
        return this.strategy;
    }

    /* renamed from: component3, reason: from getter */
    public final float getExtend() {
        return this.extend;
    }

    /* renamed from: component4, reason: from getter */
    public final float getScoreThreshold() {
        return this.scoreThreshold;
    }

    public final DetectOutput copy(DetectInfo[] regions, Strategy strategy, float extend, float scoreThreshold) {
        Intrinsics.checkNotNullParameter(regions, "regions");
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        return new DetectOutput(regions, strategy, extend, scoreThreshold);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DetectOutput)) {
            return false;
        }
        DetectOutput detectOutput = (DetectOutput) other;
        return Intrinsics.areEqual(this.regions, detectOutput.regions) && this.strategy == detectOutput.strategy && Float.compare(this.extend, detectOutput.extend) == 0 && Float.compare(this.scoreThreshold, detectOutput.scoreThreshold) == 0;
    }

    public int hashCode() {
        return (((((Arrays.hashCode(this.regions) * 31) + this.strategy.hashCode()) * 31) + Float.hashCode(this.extend)) * 31) + Float.hashCode(this.scoreThreshold);
    }

    public String toString() {
        return "DetectOutput(regions=" + Arrays.toString(this.regions) + ", strategy=" + this.strategy + ", extend=" + this.extend + ", scoreThreshold=" + this.scoreThreshold + ")";
    }

    public DetectOutput(DetectInfo[] regions, Strategy strategy, float f, float f2) {
        Intrinsics.checkNotNullParameter(regions, "regions");
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        this.regions = regions;
        this.strategy = strategy;
        this.extend = f;
        this.scoreThreshold = f2;
    }

    public final DetectInfo[] getRegions() {
        return this.regions;
    }

    public final Strategy getStrategy() {
        return this.strategy;
    }

    public final float getExtend() {
        return this.extend;
    }

    public final float getScoreThreshold() {
        return this.scoreThreshold;
    }

    public final String convertToJson() {
        return new Gson().toJson(this);
    }
}
