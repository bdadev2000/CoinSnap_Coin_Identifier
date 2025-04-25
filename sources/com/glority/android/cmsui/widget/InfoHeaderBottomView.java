package com.glority.android.cmsui.widget;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewGroupKt;
import com.glority.android.cmsui.R;
import com.glority.utils.app.ResUtils;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InfoHeaderBottomView.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0007J \u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u0010¨\u0006\u0011"}, d2 = {"Lcom/glority/android/cmsui/widget/InfoHeaderBottomView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "select", "", "index", "setCount", "count", "selectIndex", "questionMarkAtTheEnd", "", "cmsUI_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes14.dex */
public final class InfoHeaderBottomView extends LinearLayout {
    private HashMap _$_findViewCache;

    public InfoHeaderBottomView(Context context) {
        this(context, null, 0, 6, null);
    }

    public InfoHeaderBottomView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this._$_findViewCache;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this._$_findViewCache == null) {
            this._$_findViewCache = new HashMap();
        }
        View view = (View) this._$_findViewCache.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this._$_findViewCache.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InfoHeaderBottomView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        setOrientation(0);
        setGravity(16);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ InfoHeaderBottomView(android.content.Context r1, android.util.AttributeSet r2, int r3, int r4, kotlin.jvm.internal.DefaultConstructorMarker r5) {
        /*
            r0 = this;
            r5 = r4 & 2
            if (r5 == 0) goto L8
            r2 = 0
            r5 = r2
            android.util.AttributeSet r5 = (android.util.AttributeSet) r5
        L8:
            r4 = r4 & 4
            if (r4 == 0) goto Ld
            r3 = 0
        Ld:
            r0.<init>(r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.android.cmsui.widget.InfoHeaderBottomView.<init>(android.content.Context, android.util.AttributeSet, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public static /* synthetic */ void setCount$default(InfoHeaderBottomView infoHeaderBottomView, int i, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            z = true;
        }
        infoHeaderBottomView.setCount(i, i2, z);
    }

    public final void setCount(int count, int selectIndex, boolean questionMarkAtTheEnd) {
        removeAllViews();
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams((int) ResUtils.getDimension(R.dimen.x30), (int) ResUtils.getDimension(R.dimen.x30));
        layoutParams.gravity = 17;
        layoutParams.setMarginStart(0);
        layoutParams.setMarginEnd((int) ResUtils.getDimension(R.dimen.x20));
        String[] strArr = new String[count];
        int i = 0;
        while (i < count) {
            int i2 = i + 1;
            strArr[i] = String.valueOf(i2);
            i = i2;
        }
        if (questionMarkAtTheEnd && count > 1) {
            strArr[count - 1] = "?";
        }
        int i3 = 0;
        while (i3 < count) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
            appCompatTextView.setLayoutParams(layoutParams);
            appCompatTextView.setGravity(17);
            appCompatTextView.setTextColor(ContextCompat.getColorStateList(appCompatTextView.getContext(), R.color.info_header_bottom_view_text_color));
            appCompatTextView.setTextSize(0, ResUtils.getDimension(R.dimen.x20));
            appCompatTextView.setText(strArr[i3]);
            appCompatTextView.setBackground(ResUtils.getDrawable(R.drawable.shape_oval_white));
            appCompatTextView.setSelected(selectIndex == i3);
            Unit unit = Unit.INSTANCE;
            addView(appCompatTextView);
            i3++;
        }
    }

    public final void select(int index) {
        Iterator<View> it = ViewGroupKt.getChildren(this).iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            View next = it.next();
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            if (next.isSelected()) {
                break;
            } else {
                i++;
            }
        }
        Iterator<View> it2 = ViewGroupKt.getChildren(this).iterator();
        int i2 = 0;
        while (true) {
            boolean z = true;
            if (!it2.hasNext()) {
                break;
            }
            View next2 = it2.next();
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            View view = next2;
            if (i2 != index) {
                z = false;
            }
            view.setSelected(z);
            i2 = i3;
        }
        if (index == i) {
            return;
        }
        float dimension = ResUtils.getDimension(R.dimen.x50) * Math.abs(index - i);
        boolean z2 = getLayoutDirection() == 1;
        if (index > i) {
            dimension = -dimension;
        }
        if (z2) {
            dimension = -dimension;
        }
        if (getTranslationX() == index * dimension) {
            return;
        }
        ObjectAnimator anim = ObjectAnimator.ofFloat(this, (Property<InfoHeaderBottomView, Float>) View.TRANSLATION_X, getTranslationX(), getTranslationX() + dimension);
        Intrinsics.checkNotNullExpressionValue(anim, "anim");
        anim.setInterpolator(new AccelerateDecelerateInterpolator());
        anim.setDuration(100L);
        anim.start();
    }
}
