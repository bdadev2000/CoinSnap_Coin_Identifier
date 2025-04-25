package com.glority.widget.imagepager;

import com.glority.widget.imagepager.GlImagePager;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GlImageStyle.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, d2 = {"Lcom/glority/widget/imagepager/GlImageStyle;", "Ljava/io/Serializable;", "fullScreen", "", "indexLocation", "Lcom/glority/widget/imagepager/GlImagePager$IndexLocation;", "descLineThreshold", "", "(ZLcom/glority/widget/imagepager/GlImagePager$IndexLocation;I)V", "getDescLineThreshold", "()I", "getFullScreen", "()Z", "getIndexLocation", "()Lcom/glority/widget/imagepager/GlImagePager$IndexLocation;", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "toString", "", "Companion", "mod_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes12.dex */
public final /* data */ class GlImageStyle implements Serializable {
    public static final int DEFAULT_DESC_LINE_THRESHOLD = 4;
    public static final boolean DEFAULT_FULL_SCREEN = false;
    private final int descLineThreshold;
    private final boolean fullScreen;
    private final GlImagePager.IndexLocation indexLocation;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final GlImagePager.IndexLocation DEFAULT_INDEX_LOCATION = GlImagePager.IndexLocation.BOTTOM;

    public GlImageStyle() {
        this(false, null, 0, 7, null);
    }

    public static /* synthetic */ GlImageStyle copy$default(GlImageStyle glImageStyle, boolean z, GlImagePager.IndexLocation indexLocation, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = glImageStyle.fullScreen;
        }
        if ((i2 & 2) != 0) {
            indexLocation = glImageStyle.indexLocation;
        }
        if ((i2 & 4) != 0) {
            i = glImageStyle.descLineThreshold;
        }
        return glImageStyle.copy(z, indexLocation, i);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getFullScreen() {
        return this.fullScreen;
    }

    /* renamed from: component2, reason: from getter */
    public final GlImagePager.IndexLocation getIndexLocation() {
        return this.indexLocation;
    }

    /* renamed from: component3, reason: from getter */
    public final int getDescLineThreshold() {
        return this.descLineThreshold;
    }

    public final GlImageStyle copy(boolean fullScreen, GlImagePager.IndexLocation indexLocation, int descLineThreshold) {
        Intrinsics.checkNotNullParameter(indexLocation, "indexLocation");
        return new GlImageStyle(fullScreen, indexLocation, descLineThreshold);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GlImageStyle)) {
            return false;
        }
        GlImageStyle glImageStyle = (GlImageStyle) other;
        return this.fullScreen == glImageStyle.fullScreen && Intrinsics.areEqual(this.indexLocation, glImageStyle.indexLocation) && this.descLineThreshold == glImageStyle.descLineThreshold;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public int hashCode() {
        boolean z = this.fullScreen;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        GlImagePager.IndexLocation indexLocation = this.indexLocation;
        return ((i + (indexLocation != null ? indexLocation.hashCode() : 0)) * 31) + Integer.hashCode(this.descLineThreshold);
    }

    public String toString() {
        return "GlImageStyle(fullScreen=" + this.fullScreen + ", indexLocation=" + this.indexLocation + ", descLineThreshold=" + this.descLineThreshold + ")";
    }

    public GlImageStyle(boolean z, GlImagePager.IndexLocation indexLocation, int i) {
        Intrinsics.checkNotNullParameter(indexLocation, "indexLocation");
        this.fullScreen = z;
        this.indexLocation = indexLocation;
        this.descLineThreshold = i;
    }

    public final boolean getFullScreen() {
        return this.fullScreen;
    }

    public /* synthetic */ GlImageStyle(boolean z, GlImagePager.IndexLocation indexLocation, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? GlImagePager.IndexLocation.BOTTOM : indexLocation, (i2 & 4) != 0 ? 4 : i);
    }

    public final GlImagePager.IndexLocation getIndexLocation() {
        return this.indexLocation;
    }

    public final int getDescLineThreshold() {
        return this.descLineThreshold;
    }

    /* compiled from: GlImageStyle.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/glority/widget/imagepager/GlImageStyle$Companion;", "", "()V", "DEFAULT_DESC_LINE_THRESHOLD", "", "DEFAULT_FULL_SCREEN", "", "DEFAULT_INDEX_LOCATION", "Lcom/glority/widget/imagepager/GlImagePager$IndexLocation;", "getDEFAULT_INDEX_LOCATION", "()Lcom/glority/widget/imagepager/GlImagePager$IndexLocation;", "mod_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes12.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final GlImagePager.IndexLocation getDEFAULT_INDEX_LOCATION() {
            return GlImageStyle.DEFAULT_INDEX_LOCATION;
        }
    }
}
