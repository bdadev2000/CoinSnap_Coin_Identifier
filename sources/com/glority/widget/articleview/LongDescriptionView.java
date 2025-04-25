package com.glority.widget.articleview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.glority.android.xx.constants.Args;
import com.glority.widget.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LongDescriptionView.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0012J\u001f\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00122\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\u0002\u0010\u0019J\u000e\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u001cR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/glority/widget/articleview/LongDescriptionView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "content", "Landroid/widget/TextView;", "dividerV", "Landroid/view/View;", "icon", "Landroid/widget/ImageView;", "infoTv", "titleTv", "setContent", "", "data", "", "setInfo", "text", "setTitle", Args.title, "iconRes", "", "(Ljava/lang/String;Ljava/lang/Integer;)V", "showDivider", "show", "", "mod_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes12.dex */
public final class LongDescriptionView extends LinearLayout {
    private TextView content;
    private View dividerV;
    private ImageView icon;
    private TextView infoTv;
    private TextView titleTv;

    public LongDescriptionView(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ LongDescriptionView(android.content.Context r1, android.util.AttributeSet r2, int r3, kotlin.jvm.internal.DefaultConstructorMarker r4) {
        /*
            r0 = this;
            r3 = r3 & 2
            if (r3 == 0) goto L8
            r2 = 0
            r3 = r2
            android.util.AttributeSet r3 = (android.util.AttributeSet) r3
        L8:
            r0.<init>(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.widget.articleview.LongDescriptionView.<init>(android.content.Context, android.util.AttributeSet, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LongDescriptionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        View inflate = LayoutInflater.from(context).inflate(R.layout.gl_articleview_long_description, this);
        View findViewById = inflate.findViewById(R.id.title_tv);
        Intrinsics.checkNotNullExpressionValue(findViewById, "view.findViewById(R.id.title_tv)");
        this.titleTv = (TextView) findViewById;
        View findViewById2 = inflate.findViewById(R.id.content_tv);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "view.findViewById(R.id.content_tv)");
        this.content = (TextView) findViewById2;
        View findViewById3 = inflate.findViewById(R.id.iv);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "view.findViewById(R.id.iv)");
        this.icon = (ImageView) findViewById3;
        View findViewById4 = inflate.findViewById(R.id.divider_v);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "view.findViewById(R.id.divider_v)");
        this.dividerV = findViewById4;
        View findViewById5 = inflate.findViewById(R.id.info_tv);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "view.findViewById(R.id.info_tv)");
        this.infoTv = (TextView) findViewById5;
    }

    public static /* synthetic */ void setTitle$default(LongDescriptionView longDescriptionView, String str, Integer num, int i, Object obj) {
        if ((i & 2) != 0) {
            num = Integer.valueOf(R.drawable.gl_icon_description);
        }
        longDescriptionView.setTitle(str, num);
    }

    public final void setTitle(String title, Integer iconRes) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.titleTv.setText(title);
        if (iconRes != null) {
            this.icon.setImageResource(iconRes.intValue());
        }
        this.icon.setVisibility(iconRes != null ? 0 : 8);
    }

    public final void setContent(String data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.content.setText(data);
    }

    public final void showDivider(boolean show) {
        this.dividerV.setVisibility(show ? 0 : 8);
    }

    public final void setInfo(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.infoTv.setVisibility(0);
        this.infoTv.setText(text);
    }
}
