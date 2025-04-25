package com.glority.android.cmsui.util;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.glority.android.cmsui.R;
import com.glority.utils.app.ResUtils;
import com.glority.utils.ui.ViewUtils;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TipViewRender.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J*\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0001\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0006H\u0002J\u0018\u0010\u0016\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0006H\u0002J\"\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\b\b\u0001\u0010\u001c\u001a\u00020\u00062\b\b\u0002\u0010\u0017\u001a\u00020\u0006R-\u0010\u0003\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00050\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\u001d"}, d2 = {"Lcom/glority/android/cmsui/util/TipViewRender;", "", "()V", "contentData", "", "Lkotlin/Pair;", "", "getContentData", "()Ljava/util/List;", "contentData$delegate", "Lkotlin/Lazy;", "getContentTv", "Landroidx/appcompat/widget/AppCompatTextView;", "context", "Landroid/content/Context;", "content", "", "getContentView", "Landroid/widget/FrameLayout;", "res", "width", "height", "getTitleTv", "marginTop", "render", "", TtmlNode.RUBY_CONTAINER, "Landroid/widget/LinearLayout;", "margin", "cmsUI_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes14.dex */
public final class TipViewRender {
    public static final TipViewRender INSTANCE = new TipViewRender();

    /* renamed from: contentData$delegate, reason: from kotlin metadata */
    private static final Lazy contentData = LazyKt.lazy(new Function0<List<? extends Pair<? extends Integer, ? extends Integer>>>() { // from class: com.glority.android.cmsui.util.TipViewRender$contentData$2
        @Override // kotlin.jvm.functions.Function0
        public final List<? extends Pair<? extends Integer, ? extends Integer>> invoke() {
            return CollectionsKt.listOf((Object[]) new Pair[]{new Pair(Integer.valueOf(R.string.text_instruction_focus_center), Integer.valueOf(R.drawable.pic_tips1)), new Pair(Integer.valueOf(R.string.text_instruction_toobig), Integer.valueOf(R.drawable.pic_tips2)), new Pair(Integer.valueOf(R.string.text_instruction_tooclose), Integer.valueOf(R.drawable.pic_tips3)), new Pair(Integer.valueOf(R.string.text_instruction_focus_theone), Integer.valueOf(R.drawable.pic_tips4)), new Pair(Integer.valueOf(R.string.text_instruction_onlyone_once), Integer.valueOf(R.drawable.pic_tips5))});
        }
    });

    private final List<Pair<Integer, Integer>> getContentData() {
        return (List) contentData.getValue();
    }

    private TipViewRender() {
    }

    public static /* synthetic */ void render$default(TipViewRender tipViewRender, LinearLayout linearLayout, int i, int i2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            i2 = (int) ResUtils.getDimension(R.dimen.x96);
        }
        tipViewRender.render(linearLayout, i, i2);
    }

    public final void render(LinearLayout container, int margin, int marginTop) {
        Intrinsics.checkNotNullParameter(container, "container");
        container.removeAllViews();
        int screenWidth = ViewUtils.getScreenWidth() - (((int) ResUtils.getDimension(margin)) * 2);
        int i = (screenWidth * 170) / 327;
        Context context = container.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "container.context");
        container.addView(getTitleTv(context, marginTop));
        int i2 = 0;
        for (Object obj : getContentData()) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            Pair pair = (Pair) obj;
            TipViewRender tipViewRender = INSTANCE;
            Context context2 = container.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "container.context");
            container.addView(tipViewRender.getContentTv(context2, i3 + ". " + ResUtils.getString(((Number) pair.getFirst()).intValue())));
            Context context3 = container.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "container.context");
            container.addView(tipViewRender.getContentView(context3, ((Number) pair.getSecond()).intValue(), screenWidth, i));
            i2 = i3;
        }
    }

    private final AppCompatTextView getTitleTv(Context context, int marginTop) {
        AppCompatTextView appCompatTextView = new AppCompatTextView(context);
        appCompatTextView.setTextColor(ResUtils.getColor(R.color.DarkGray));
        appCompatTextView.setTextSize(0, ResUtils.getDimension(R.dimen.x32));
        appCompatTextView.setTypeface(Typeface.DEFAULT_BOLD);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = marginTop;
        layoutParams.bottomMargin = (int) ResUtils.getDimension(R.dimen.x48);
        Unit unit = Unit.INSTANCE;
        appCompatTextView.setLayoutParams(layoutParams);
        appCompatTextView.setText(ResUtils.getString(R.string.text_tips_for_taking_pictures));
        appCompatTextView.setCompoundDrawablesWithIntrinsicBounds(ResUtils.getDrawable(R.drawable.icon_tips_instruction), (Drawable) null, (Drawable) null, (Drawable) null);
        appCompatTextView.setCompoundDrawablePadding((int) ResUtils.getDimension(R.dimen.x16));
        return appCompatTextView;
    }

    private final AppCompatTextView getContentTv(Context context, String content) {
        AppCompatTextView appCompatTextView = new AppCompatTextView(context);
        appCompatTextView.setTextColor(ResUtils.getColor(R.color.DarkGray));
        appCompatTextView.setTextSize(0, ResUtils.getDimension(R.dimen.x32));
        appCompatTextView.setLineSpacing(0.0f, 1.2f);
        appCompatTextView.setText(content);
        return appCompatTextView;
    }

    private final FrameLayout getContentView(Context context, int res, int width, int height) {
        int dimension = (int) ResUtils.getDimension(R.dimen.x16);
        FrameLayout frameLayout = new FrameLayout(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(width, height);
        layoutParams.topMargin = dimension;
        layoutParams.bottomMargin = dimension * 4;
        Unit unit = Unit.INSTANCE;
        frameLayout.setLayoutParams(layoutParams);
        frameLayout.setBackgroundResource(res);
        AppCompatTextView appCompatTextView = new AppCompatTextView(context);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.bottomMargin = dimension;
        layoutParams2.setMarginEnd(layoutParams2.bottomMargin);
        layoutParams2.gravity = 8388693;
        Unit unit2 = Unit.INSTANCE;
        appCompatTextView.setLayoutParams(layoutParams2);
        int i = dimension / 4;
        appCompatTextView.setPaddingRelative(dimension, i, dimension, i);
        appCompatTextView.setBackgroundResource(R.drawable.shape_rect_solid_white_r_4);
        appCompatTextView.setTextColor(ResUtils.getColor(R.color.Theme));
        appCompatTextView.setTextSize(0, ResUtils.getDimension(R.dimen.x28));
        appCompatTextView.setText(R.string.text_yes);
        frameLayout.addView(appCompatTextView);
        if (res != R.drawable.pic_tips4) {
            AppCompatTextView appCompatTextView2 = new AppCompatTextView(context);
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
            layoutParams3.bottomMargin = dimension;
            layoutParams3.setMarginEnd(layoutParams3.bottomMargin + (width / 2) + 5);
            layoutParams3.gravity = 8388693;
            Unit unit3 = Unit.INSTANCE;
            appCompatTextView2.setLayoutParams(layoutParams3);
            appCompatTextView2.setPaddingRelative(dimension, i, dimension, i);
            appCompatTextView2.setBackgroundResource(R.drawable.shape_rect_solid_white_r_4);
            appCompatTextView2.setTextColor(ResUtils.getColor(R.color.RedFF6678));
            appCompatTextView2.setTextSize(0, ResUtils.getDimension(R.dimen.x28));
            appCompatTextView2.setText(R.string.text_no);
            frameLayout.addView(appCompatTextView2);
        }
        return frameLayout;
    }
}
