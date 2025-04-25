package com.glority.widget.wheelpicker.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WheelPickerDataEntity.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0015"}, d2 = {"Lcom/glority/widget/wheelpicker/model/WheelPickerDataEntity;", "", "text", "", "textSize", "", "(Ljava/lang/String;I)V", "getText", "()Ljava/lang/String;", "getTextSize", "()I", "setTextSize", "(I)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "mod_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes12.dex */
public final /* data */ class WheelPickerDataEntity {
    private final String text;
    private int textSize;

    public static /* synthetic */ WheelPickerDataEntity copy$default(WheelPickerDataEntity wheelPickerDataEntity, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = wheelPickerDataEntity.text;
        }
        if ((i2 & 2) != 0) {
            i = wheelPickerDataEntity.textSize;
        }
        return wheelPickerDataEntity.copy(str, i);
    }

    /* renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* renamed from: component2, reason: from getter */
    public final int getTextSize() {
        return this.textSize;
    }

    public final WheelPickerDataEntity copy(String text, int textSize) {
        Intrinsics.checkNotNullParameter(text, "text");
        return new WheelPickerDataEntity(text, textSize);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WheelPickerDataEntity)) {
            return false;
        }
        WheelPickerDataEntity wheelPickerDataEntity = (WheelPickerDataEntity) other;
        return Intrinsics.areEqual(this.text, wheelPickerDataEntity.text) && this.textSize == wheelPickerDataEntity.textSize;
    }

    public int hashCode() {
        String str = this.text;
        return ((str != null ? str.hashCode() : 0) * 31) + Integer.hashCode(this.textSize);
    }

    public String toString() {
        return "WheelPickerDataEntity(text=" + this.text + ", textSize=" + this.textSize + ")";
    }

    public WheelPickerDataEntity(String text, int i) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.text = text;
        this.textSize = i;
    }

    public final String getText() {
        return this.text;
    }

    public final int getTextSize() {
        return this.textSize;
    }

    public final void setTextSize(int i) {
        this.textSize = i;
    }
}
