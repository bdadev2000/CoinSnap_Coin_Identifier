package com.glority.android.xx;

import com.glority.base.viewmodel.AppViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: ResizeConfig.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/glority/android/xx/ResizeConfig;", "", "uploadAwsImageShortEdgeSize", "", "recognizeImageShortEdgeSize", "<init>", "(II)V", "getUploadAwsImageShortEdgeSize", "()I", "getRecognizeImageShortEdgeSize", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "resourceMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes4.dex */
public final /* data */ class ResizeConfig {
    private final int recognizeImageShortEdgeSize;
    private final int uploadAwsImageShortEdgeSize;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ResizeConfig() {
        /*
            r3 = this;
            r0 = 3
            r1 = 0
            r2 = 0
            r3.<init>(r2, r2, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.android.xx.ResizeConfig.<init>():void");
    }

    /* renamed from: component1, reason: from getter */
    public final int getUploadAwsImageShortEdgeSize() {
        return this.uploadAwsImageShortEdgeSize;
    }

    /* renamed from: component2, reason: from getter */
    public final int getRecognizeImageShortEdgeSize() {
        return this.recognizeImageShortEdgeSize;
    }

    public final ResizeConfig copy(int uploadAwsImageShortEdgeSize, int recognizeImageShortEdgeSize) {
        return new ResizeConfig(uploadAwsImageShortEdgeSize, recognizeImageShortEdgeSize);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ResizeConfig)) {
            return false;
        }
        ResizeConfig resizeConfig = (ResizeConfig) other;
        return this.uploadAwsImageShortEdgeSize == resizeConfig.uploadAwsImageShortEdgeSize && this.recognizeImageShortEdgeSize == resizeConfig.recognizeImageShortEdgeSize;
    }

    public int hashCode() {
        return (Integer.hashCode(this.uploadAwsImageShortEdgeSize) * 31) + Integer.hashCode(this.recognizeImageShortEdgeSize);
    }

    public String toString() {
        return "ResizeConfig(uploadAwsImageShortEdgeSize=" + this.uploadAwsImageShortEdgeSize + ", recognizeImageShortEdgeSize=" + this.recognizeImageShortEdgeSize + ")";
    }

    public ResizeConfig(int i, int i2) {
        this.uploadAwsImageShortEdgeSize = i;
        this.recognizeImageShortEdgeSize = i2;
    }

    public /* synthetic */ ResizeConfig(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? AppViewModel.PICTURE_WIDTH : i, (i3 & 2) != 0 ? 512 : i2);
    }

    public static /* synthetic */ ResizeConfig copy$default(ResizeConfig resizeConfig, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = resizeConfig.uploadAwsImageShortEdgeSize;
        }
        if ((i3 & 2) != 0) {
            i2 = resizeConfig.recognizeImageShortEdgeSize;
        }
        return resizeConfig.copy(i, i2);
    }

    public final int getUploadAwsImageShortEdgeSize() {
        return this.uploadAwsImageShortEdgeSize;
    }

    public final int getRecognizeImageShortEdgeSize() {
        return this.recognizeImageShortEdgeSize;
    }
}
