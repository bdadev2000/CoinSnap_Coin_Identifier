package com.glority.android.picturexx.recognize.fragment;

import com.glority.android.picturexx.recognize.analyzer.AreaStatus;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CaptureFragment.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/glority/android/picturexx/recognize/fragment/AnalysisResult;", "", "areaStatus", "Lcom/glority/android/picturexx/recognize/analyzer/AreaStatus;", "zoomInFactor", "", "<init>", "(Lcom/glority/android/picturexx/recognize/analyzer/AreaStatus;F)V", "getAreaStatus", "()Lcom/glority/android/picturexx/recognize/analyzer/AreaStatus;", "getZoomInFactor", "()F", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "recognize_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final /* data */ class AnalysisResult {
    private final AreaStatus areaStatus;
    private final float zoomInFactor;

    /* renamed from: component1, reason: from getter */
    public final AreaStatus getAreaStatus() {
        return this.areaStatus;
    }

    /* renamed from: component2, reason: from getter */
    public final float getZoomInFactor() {
        return this.zoomInFactor;
    }

    public final AnalysisResult copy(AreaStatus areaStatus, float zoomInFactor) {
        Intrinsics.checkNotNullParameter(areaStatus, "areaStatus");
        return new AnalysisResult(areaStatus, zoomInFactor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AnalysisResult)) {
            return false;
        }
        AnalysisResult analysisResult = (AnalysisResult) other;
        return this.areaStatus == analysisResult.areaStatus && Float.compare(this.zoomInFactor, analysisResult.zoomInFactor) == 0;
    }

    public int hashCode() {
        return (this.areaStatus.hashCode() * 31) + Float.hashCode(this.zoomInFactor);
    }

    public String toString() {
        return "AnalysisResult(areaStatus=" + this.areaStatus + ", zoomInFactor=" + this.zoomInFactor + ")";
    }

    public AnalysisResult(AreaStatus areaStatus, float f) {
        Intrinsics.checkNotNullParameter(areaStatus, "areaStatus");
        this.areaStatus = areaStatus;
        this.zoomInFactor = f;
    }

    public /* synthetic */ AnalysisResult(AreaStatus areaStatus, float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(areaStatus, (i & 2) != 0 ? 1.0f : f);
    }

    public static /* synthetic */ AnalysisResult copy$default(AnalysisResult analysisResult, AreaStatus areaStatus, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            areaStatus = analysisResult.areaStatus;
        }
        if ((i & 2) != 0) {
            f = analysisResult.zoomInFactor;
        }
        return analysisResult.copy(areaStatus, f);
    }

    public final AreaStatus getAreaStatus() {
        return this.areaStatus;
    }

    public final float getZoomInFactor() {
        return this.zoomInFactor;
    }
}
