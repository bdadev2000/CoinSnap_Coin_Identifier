package com.glority.android.uimaker.parameter.attribute;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ImageFile.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u0007\"\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0007¨\u0006\u0016"}, d2 = {"Lcom/glority/android/uimaker/parameter/attribute/ImageFile;", "", "id", "", "remoteUrl", "(Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "localFilePath", "getLocalFilePath", "setLocalFilePath", "(Ljava/lang/String;)V", "getRemoteUrl", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "mod_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes4.dex */
public final /* data */ class ImageFile {
    private final String id;
    private String localFilePath;
    private final String remoteUrl;

    public static /* synthetic */ ImageFile copy$default(ImageFile imageFile, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = imageFile.id;
        }
        if ((i & 2) != 0) {
            str2 = imageFile.remoteUrl;
        }
        return imageFile.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getRemoteUrl() {
        return this.remoteUrl;
    }

    public final ImageFile copy(String id, String remoteUrl) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(remoteUrl, "remoteUrl");
        return new ImageFile(id, remoteUrl);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ImageFile)) {
            return false;
        }
        ImageFile imageFile = (ImageFile) other;
        return Intrinsics.areEqual(this.id, imageFile.id) && Intrinsics.areEqual(this.remoteUrl, imageFile.remoteUrl);
    }

    public int hashCode() {
        String str = this.id;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.remoteUrl;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "ImageFile(id=" + this.id + ", remoteUrl=" + this.remoteUrl + ")";
    }

    public ImageFile(String id, String remoteUrl) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(remoteUrl, "remoteUrl");
        this.id = id;
        this.remoteUrl = remoteUrl;
    }

    public final String getId() {
        return this.id;
    }

    public final String getRemoteUrl() {
        return this.remoteUrl;
    }

    public final String getLocalFilePath() {
        return this.localFilePath;
    }

    public final void setLocalFilePath(String str) {
        this.localFilePath = str;
    }
}
