package com.facebook.gamingservices.model;

import kotlin.jvm.internal.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p0.a;

/* loaded from: classes4.dex */
public final class CustomUpdateMedia {

    @Nullable
    private final CustomUpdateMediaInfo gif;

    @Nullable
    private final CustomUpdateMediaInfo video;

    public CustomUpdateMedia() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ CustomUpdateMedia copy$default(CustomUpdateMedia customUpdateMedia, CustomUpdateMediaInfo customUpdateMediaInfo, CustomUpdateMediaInfo customUpdateMediaInfo2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            customUpdateMediaInfo = customUpdateMedia.gif;
        }
        if ((i2 & 2) != 0) {
            customUpdateMediaInfo2 = customUpdateMedia.video;
        }
        return customUpdateMedia.copy(customUpdateMediaInfo, customUpdateMediaInfo2);
    }

    @Nullable
    public final CustomUpdateMediaInfo component1() {
        return this.gif;
    }

    @Nullable
    public final CustomUpdateMediaInfo component2() {
        return this.video;
    }

    @NotNull
    public final CustomUpdateMedia copy(@Nullable CustomUpdateMediaInfo customUpdateMediaInfo, @Nullable CustomUpdateMediaInfo customUpdateMediaInfo2) {
        return new CustomUpdateMedia(customUpdateMediaInfo, customUpdateMediaInfo2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomUpdateMedia)) {
            return false;
        }
        CustomUpdateMedia customUpdateMedia = (CustomUpdateMedia) obj;
        return a.g(this.gif, customUpdateMedia.gif) && a.g(this.video, customUpdateMedia.video);
    }

    @Nullable
    public final CustomUpdateMediaInfo getGif() {
        return this.gif;
    }

    @Nullable
    public final CustomUpdateMediaInfo getVideo() {
        return this.video;
    }

    public int hashCode() {
        CustomUpdateMediaInfo customUpdateMediaInfo = this.gif;
        int hashCode = (customUpdateMediaInfo == null ? 0 : customUpdateMediaInfo.hashCode()) * 31;
        CustomUpdateMediaInfo customUpdateMediaInfo2 = this.video;
        return hashCode + (customUpdateMediaInfo2 != null ? customUpdateMediaInfo2.hashCode() : 0);
    }

    @NotNull
    public final JSONObject toJSONObject() {
        JSONObject jSONObject = new JSONObject();
        CustomUpdateMediaInfo customUpdateMediaInfo = this.gif;
        if (customUpdateMediaInfo != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("url", customUpdateMediaInfo.getUrl());
            jSONObject.put("gif", jSONObject2);
        }
        CustomUpdateMediaInfo customUpdateMediaInfo2 = this.video;
        if (customUpdateMediaInfo2 != null) {
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("url", customUpdateMediaInfo2.getUrl());
            jSONObject.put("video", jSONObject3);
        }
        return jSONObject;
    }

    @NotNull
    public String toString() {
        return "CustomUpdateMedia(gif=" + this.gif + ", video=" + this.video + ')';
    }

    public CustomUpdateMedia(@Nullable CustomUpdateMediaInfo customUpdateMediaInfo, @Nullable CustomUpdateMediaInfo customUpdateMediaInfo2) {
        this.gif = customUpdateMediaInfo;
        this.video = customUpdateMediaInfo2;
    }

    public /* synthetic */ CustomUpdateMedia(CustomUpdateMediaInfo customUpdateMediaInfo, CustomUpdateMediaInfo customUpdateMediaInfo2, int i2, k kVar) {
        this((i2 & 1) != 0 ? null : customUpdateMediaInfo, (i2 & 2) != 0 ? null : customUpdateMediaInfo2);
    }
}
