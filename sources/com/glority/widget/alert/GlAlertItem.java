package com.glority.widget.alert;

import android.graphics.drawable.Drawable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GlAlertItem.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/glority/widget/alert/GlAlertItem;", "", "text", "", "onClickListener", "Lcom/glority/widget/alert/GlAlertOnClickListener;", "drawable", "Landroid/graphics/drawable/Drawable;", "(Ljava/lang/String;Lcom/glority/widget/alert/GlAlertOnClickListener;Landroid/graphics/drawable/Drawable;)V", "getDrawable", "()Landroid/graphics/drawable/Drawable;", "getOnClickListener", "()Lcom/glority/widget/alert/GlAlertOnClickListener;", "getText", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "mod_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes12.dex */
public final /* data */ class GlAlertItem {
    private final Drawable drawable;
    private final GlAlertOnClickListener onClickListener;
    private final String text;

    public static /* synthetic */ GlAlertItem copy$default(GlAlertItem glAlertItem, String str, GlAlertOnClickListener glAlertOnClickListener, Drawable drawable, int i, Object obj) {
        if ((i & 1) != 0) {
            str = glAlertItem.text;
        }
        if ((i & 2) != 0) {
            glAlertOnClickListener = glAlertItem.onClickListener;
        }
        if ((i & 4) != 0) {
            drawable = glAlertItem.drawable;
        }
        return glAlertItem.copy(str, glAlertOnClickListener, drawable);
    }

    /* renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* renamed from: component2, reason: from getter */
    public final GlAlertOnClickListener getOnClickListener() {
        return this.onClickListener;
    }

    /* renamed from: component3, reason: from getter */
    public final Drawable getDrawable() {
        return this.drawable;
    }

    public final GlAlertItem copy(String text, GlAlertOnClickListener onClickListener, Drawable drawable) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(onClickListener, "onClickListener");
        return new GlAlertItem(text, onClickListener, drawable);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GlAlertItem)) {
            return false;
        }
        GlAlertItem glAlertItem = (GlAlertItem) other;
        return Intrinsics.areEqual(this.text, glAlertItem.text) && Intrinsics.areEqual(this.onClickListener, glAlertItem.onClickListener) && Intrinsics.areEqual(this.drawable, glAlertItem.drawable);
    }

    public int hashCode() {
        String str = this.text;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        GlAlertOnClickListener glAlertOnClickListener = this.onClickListener;
        int hashCode2 = (hashCode + (glAlertOnClickListener != null ? glAlertOnClickListener.hashCode() : 0)) * 31;
        Drawable drawable = this.drawable;
        return hashCode2 + (drawable != null ? drawable.hashCode() : 0);
    }

    public String toString() {
        return "GlAlertItem(text=" + this.text + ", onClickListener=" + this.onClickListener + ", drawable=" + this.drawable + ")";
    }

    public GlAlertItem(String text, GlAlertOnClickListener onClickListener, Drawable drawable) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(onClickListener, "onClickListener");
        this.text = text;
        this.onClickListener = onClickListener;
        this.drawable = drawable;
    }

    public final String getText() {
        return this.text;
    }

    public final GlAlertOnClickListener getOnClickListener() {
        return this.onClickListener;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ GlAlertItem(java.lang.String r1, com.glority.widget.alert.GlAlertOnClickListener r2, android.graphics.drawable.Drawable r3, int r4, kotlin.jvm.internal.DefaultConstructorMarker r5) {
        /*
            r0 = this;
            r4 = r4 & 4
            if (r4 == 0) goto L8
            r3 = 0
            r4 = r3
            android.graphics.drawable.Drawable r4 = (android.graphics.drawable.Drawable) r4
        L8:
            r0.<init>(r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.widget.alert.GlAlertItem.<init>(java.lang.String, com.glority.widget.alert.GlAlertOnClickListener, android.graphics.drawable.Drawable, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final Drawable getDrawable() {
        return this.drawable;
    }
}
