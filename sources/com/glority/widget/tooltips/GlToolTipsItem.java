package com.glority.widget.tooltips;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GlToolTipsItem.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\u0018\u00002\u00020\u0001B%\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB/\b\u0016\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0005\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\u000bB#\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0001\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\rB-\b\u0016\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0001\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\u000eR\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\f\u001a\u0004\u0018\u00010\u0001X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lcom/glority/widget/tooltips/GlToolTipsItem;", "", "text", "", "drawableRes", "", "selected", "", "(Ljava/lang/String;Ljava/lang/Integer;Z)V", "context", "Landroid/content/Context;", "(Landroid/content/Context;ILjava/lang/Integer;Z)V", "imageUrl", "(Ljava/lang/String;Ljava/lang/Object;Z)V", "(Landroid/content/Context;ILjava/lang/Object;Z)V", "getDrawableRes", "()Ljava/lang/Integer;", "setDrawableRes", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getImageUrl", "()Ljava/lang/Object;", "setImageUrl", "(Ljava/lang/Object;)V", "getSelected", "()Z", "setSelected", "(Z)V", "getText", "()Ljava/lang/String;", "setText", "(Ljava/lang/String;)V", "mod_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes12.dex */
public final class GlToolTipsItem {
    private Integer drawableRes;
    private Object imageUrl;
    private boolean selected;
    private String text;

    public final boolean getSelected() {
        return this.selected;
    }

    public final void setSelected(boolean z) {
        this.selected = z;
    }

    public final Object getImageUrl() {
        return this.imageUrl;
    }

    public final void setImageUrl(Object obj) {
        this.imageUrl = obj;
    }

    public final Integer getDrawableRes() {
        return this.drawableRes;
    }

    public final void setDrawableRes(Integer num) {
        this.drawableRes = num;
    }

    public final String getText() {
        return this.text;
    }

    public final void setText(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.text = str;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ GlToolTipsItem(java.lang.String r1, java.lang.Integer r2, boolean r3, int r4, kotlin.jvm.internal.DefaultConstructorMarker r5) {
        /*
            r0 = this;
            r5 = r4 & 2
            if (r5 == 0) goto L8
            r2 = 0
            r5 = r2
            java.lang.Integer r5 = (java.lang.Integer) r5
        L8:
            r4 = r4 & 4
            if (r4 == 0) goto Ld
            r3 = 0
        Ld:
            r0.<init>(r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.widget.tooltips.GlToolTipsItem.<init>(java.lang.String, java.lang.Integer, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public GlToolTipsItem(String text, Integer num, boolean z) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.text = text;
        this.drawableRes = num;
        this.selected = z;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ GlToolTipsItem(android.content.Context r1, int r2, java.lang.Integer r3, boolean r4, int r5, kotlin.jvm.internal.DefaultConstructorMarker r6) {
        /*
            r0 = this;
            r6 = r5 & 4
            if (r6 == 0) goto L8
            r3 = 0
            r6 = r3
            java.lang.Integer r6 = (java.lang.Integer) r6
        L8:
            r5 = r5 & 8
            if (r5 == 0) goto Ld
            r4 = 0
        Ld:
            r0.<init>(r1, r2, r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.widget.tooltips.GlToolTipsItem.<init>(android.content.Context, int, java.lang.Integer, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public GlToolTipsItem(Context context, int i, Integer num, boolean z) {
        Intrinsics.checkNotNullParameter(context, "context");
        String string = context.getResources().getString(i);
        Intrinsics.checkNotNullExpressionValue(string, "context.resources.getString(text)");
        this.text = string;
        this.drawableRes = num;
        this.selected = z;
    }

    public /* synthetic */ GlToolTipsItem(String str, Object obj, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, obj, (i & 4) != 0 ? false : z);
    }

    public GlToolTipsItem(String text, Object obj, boolean z) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.text = text;
        this.imageUrl = obj;
        this.selected = z;
    }

    public /* synthetic */ GlToolTipsItem(Context context, int i, Object obj, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, i, obj, (i2 & 8) != 0 ? false : z);
    }

    public GlToolTipsItem(Context context, int i, Object obj, boolean z) {
        Intrinsics.checkNotNullParameter(context, "context");
        String string = context.getResources().getString(i);
        Intrinsics.checkNotNullExpressionValue(string, "context.resources.getString(text)");
        this.text = string;
        this.imageUrl = obj;
        this.selected = z;
    }
}
