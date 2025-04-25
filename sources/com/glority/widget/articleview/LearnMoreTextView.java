package com.glority.widget.articleview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.glority.android.core.ext.ViewExtensionsKt;
import com.glority.widget.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LearnMoreTextView.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J,\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\b2\b\b\u0002\u0010\u0014\u001a\u00020\b2\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\u0012\u001a\u00020\u0013R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/glority/widget/articleview/LearnMoreTextView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "hideMoreText", "", "isShow", "", "maskView", "Landroid/view/View;", "moreIv", "Landroid/widget/ImageView;", "moreTv", "Landroid/widget/TextView;", "moreView", "showLines", "", "showMoreText", "textTv", "initView", "", "text", "mod_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes12.dex */
public final class LearnMoreTextView extends LinearLayout {
    private String hideMoreText;
    private boolean isShow;
    private View maskView;
    private ImageView moreIv;
    private TextView moreTv;
    private LinearLayout moreView;
    private int showLines;
    private String showMoreText;
    private TextView textTv;

    public LearnMoreTextView(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ LearnMoreTextView(android.content.Context r1, android.util.AttributeSet r2, int r3, kotlin.jvm.internal.DefaultConstructorMarker r4) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.glority.widget.articleview.LearnMoreTextView.<init>(android.content.Context, android.util.AttributeSet, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LearnMoreTextView(final Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.showMoreText = "Learn More";
        this.hideMoreText = "Hide";
        this.showLines = 6;
        View inflate = LayoutInflater.from(context).inflate(R.layout.gl_articleview_learn_more_textview, this);
        View findViewById = inflate.findViewById(R.id.text_tv);
        Intrinsics.checkNotNullExpressionValue(findViewById, "view.findViewById(R.id.text_tv)");
        this.textTv = (TextView) findViewById;
        View findViewById2 = inflate.findViewById(R.id.mask_view);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "view.findViewById(R.id.mask_view)");
        this.maskView = findViewById2;
        View findViewById3 = inflate.findViewById(R.id.more_view);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "view.findViewById(R.id.more_view)");
        this.moreView = (LinearLayout) findViewById3;
        View findViewById4 = inflate.findViewById(R.id.more_iv);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "view.findViewById(R.id.more_iv)");
        this.moreIv = (ImageView) findViewById4;
        View findViewById5 = inflate.findViewById(R.id.more_tv);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "view.findViewById(R.id.more_tv)");
        this.moreTv = (TextView) findViewById5;
        this.textTv.setLines(this.showLines);
        ViewExtensionsKt.setSingleClickListener$default(this.moreView, 0L, new Function1<View, Unit>() { // from class: com.glority.widget.articleview.LearnMoreTextView.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(View it) {
                TextView textView;
                int i;
                Intrinsics.checkNotNullParameter(it, "it");
                LearnMoreTextView.this.isShow = !r2.isShow;
                LearnMoreTextView.this.maskView.setVisibility(LearnMoreTextView.this.isShow ? 8 : 0);
                LearnMoreTextView.this.moreTv.setText(LearnMoreTextView.this.isShow ? LearnMoreTextView.this.hideMoreText : LearnMoreTextView.this.showMoreText);
                if (LearnMoreTextView.this.isShow) {
                    textView = LearnMoreTextView.this.textTv;
                    i = context.getWallpaperDesiredMinimumHeight();
                } else {
                    textView = LearnMoreTextView.this.textTv;
                    i = LearnMoreTextView.this.showLines;
                }
                textView.setMaxLines(i);
                LearnMoreTextView.this.moreIv.setImageResource(LearnMoreTextView.this.isShow ? R.drawable.ic_fold : R.drawable.ic_unfold);
            }
        }, 1, (Object) null);
    }

    public static /* synthetic */ void initView$default(LearnMoreTextView learnMoreTextView, String str, String str2, String str3, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str2 = "Learn More";
        }
        if ((i2 & 4) != 0) {
            str3 = "Hide";
        }
        if ((i2 & 8) != 0) {
            i = 6;
        }
        learnMoreTextView.initView(str, str2, str3, i);
    }

    public final void initView(String text, String showMoreText, String hideMoreText, int showLines) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(showMoreText, "showMoreText");
        Intrinsics.checkNotNullParameter(hideMoreText, "hideMoreText");
        this.textTv.setText(text);
        this.showMoreText = showMoreText;
        this.hideMoreText = hideMoreText;
        this.showLines = showLines;
    }
}
