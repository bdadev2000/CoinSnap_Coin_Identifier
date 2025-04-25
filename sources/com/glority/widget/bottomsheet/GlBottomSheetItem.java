package com.glority.widget.bottomsheet;

import android.graphics.drawable.Drawable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GlBottomSheetItem.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0002\u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\t\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0012\"\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/glority/widget/bottomsheet/GlBottomSheetItem;", "", "text", "", "drawable", "Landroid/graphics/drawable/Drawable;", "desc", "enable", "", "selected", "(Ljava/lang/CharSequence;Landroid/graphics/drawable/Drawable;Ljava/lang/CharSequence;ZZ)V", "getDesc", "()Ljava/lang/CharSequence;", "setDesc", "(Ljava/lang/CharSequence;)V", "getDrawable", "()Landroid/graphics/drawable/Drawable;", "getEnable", "()Z", "getSelected", "setSelected", "(Z)V", "getText", "mod_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes12.dex */
public final class GlBottomSheetItem {
    private CharSequence desc;
    private final Drawable drawable;
    private final boolean enable;
    private boolean selected;
    private final CharSequence text;

    public GlBottomSheetItem(CharSequence text, Drawable drawable, CharSequence charSequence, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.text = text;
        this.drawable = drawable;
        this.desc = charSequence;
        this.enable = z;
        this.selected = z2;
    }

    public final CharSequence getText() {
        return this.text;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ GlBottomSheetItem(java.lang.CharSequence r8, android.graphics.drawable.Drawable r9, java.lang.CharSequence r10, boolean r11, boolean r12, int r13, kotlin.jvm.internal.DefaultConstructorMarker r14) {
        /*
            r7 = this;
            r14 = r13 & 2
            r0 = 0
            if (r14 == 0) goto La
            r9 = r0
            android.graphics.drawable.Drawable r9 = (android.graphics.drawable.Drawable) r9
            r3 = r0
            goto Lb
        La:
            r3 = r9
        Lb:
            r9 = r13 & 4
            if (r9 == 0) goto L14
            r9 = r0
            java.lang.CharSequence r9 = (java.lang.CharSequence) r9
            r4 = r0
            goto L15
        L14:
            r4 = r10
        L15:
            r9 = r13 & 8
            if (r9 == 0) goto L1a
            r11 = 1
        L1a:
            r5 = r11
            r9 = r13 & 16
            if (r9 == 0) goto L20
            r12 = 0
        L20:
            r6 = r12
            r1 = r7
            r2 = r8
            r1.<init>(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.widget.bottomsheet.GlBottomSheetItem.<init>(java.lang.CharSequence, android.graphics.drawable.Drawable, java.lang.CharSequence, boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final Drawable getDrawable() {
        return this.drawable;
    }

    public final CharSequence getDesc() {
        return this.desc;
    }

    public final void setDesc(CharSequence charSequence) {
        this.desc = charSequence;
    }

    public final boolean getEnable() {
        return this.enable;
    }

    public final boolean getSelected() {
        return this.selected;
    }

    public final void setSelected(boolean z) {
        this.selected = z;
    }
}
