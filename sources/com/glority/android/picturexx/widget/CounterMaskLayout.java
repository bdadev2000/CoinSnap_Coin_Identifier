package com.glority.android.picturexx.widget;

import android.content.Context;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.ViewGroupKt;
import com.glority.android.picturexx.business.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;

/* compiled from: CounterMaskLayout.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\t\u0018\u00002\u00020\u0001:\u000212B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u00152\u0006\u0010&\u001a\u00020\u0015J\u001a\u0010'\u001a\u0004\u0018\u00010(2\u0006\u0010%\u001a\u00020\u00152\u0006\u0010&\u001a\u00020\u0015H\u0002J\u0014\u0010)\u001a\u00020$2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0*J\u0010\u0010+\u001a\u00020$2\u0006\u0010,\u001a\u00020\fH\u0002J\u0010\u0010-\u001a\u00020$2\u0006\u0010.\u001a\u00020(H\u0002J\u0010\u0010-\u001a\u00020$2\u0006\u0010/\u001a\u00020\fH\u0002J\u0006\u00100\u001a\u00020$R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R\u001a\u0010\u0014\u001a\u00020\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0017\"\u0004\b\u001c\u0010\u0019R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"¨\u00063"}, d2 = {"Lcom/glority/android/picturexx/widget/CounterMaskLayout;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "data", "", "Lcom/glority/android/picturexx/widget/CounterMaskLayout$CounterData;", "getData", "()Ljava/util/List;", "setData", "(Ljava/util/List;)V", "originalData", "getOriginalData", "setOriginalData", "withRate", "", "getWithRate", "()F", "setWithRate", "(F)V", "heightRate", "getHeightRate", "setHeightRate", "countListener", "Lcom/glority/android/picturexx/widget/CounterMaskLayout$CountListener;", "getCountListener", "()Lcom/glority/android/picturexx/widget/CounterMaskLayout$CountListener;", "setCountListener", "(Lcom/glority/android/picturexx/widget/CounterMaskLayout$CountListener;)V", "tapUp", "", "x", "y", "findTouchView", "Landroid/view/View;", "initData", "", "addPoint", "point", "removePoint", "view", "counterData", "removeAllManualPoints", "CounterData", "CountListener", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class CounterMaskLayout extends ConstraintLayout {
    public static final int $stable = 8;
    private CountListener countListener;
    private List<CounterData> data;
    private float heightRate;
    private List<CounterData> originalData;
    private float withRate;

    /* compiled from: CounterMaskLayout.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/glority/android/picturexx/widget/CounterMaskLayout$CountListener;", "", "count", "", "int", "", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes5.dex */
    public interface CountListener {
        void count(int r1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CounterMaskLayout(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CounterMaskLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ CounterMaskLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CounterMaskLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.data = new ArrayList();
        this.originalData = new ArrayList();
        this.withRate = 0.055f;
        this.heightRate = 0.055f;
    }

    public final List<CounterData> getData() {
        return this.data;
    }

    public final void setData(List<CounterData> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.data = list;
    }

    public final List<CounterData> getOriginalData() {
        return this.originalData;
    }

    public final void setOriginalData(List<CounterData> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.originalData = list;
    }

    public final float getWithRate() {
        return this.withRate;
    }

    public final void setWithRate(float f) {
        this.withRate = f;
    }

    public final float getHeightRate() {
        return this.heightRate;
    }

    public final void setHeightRate(float f) {
        this.heightRate = f;
    }

    public final CountListener getCountListener() {
        return this.countListener;
    }

    public final void setCountListener(CountListener countListener) {
        this.countListener = countListener;
    }

    public final void tapUp(float x, float y) {
        View findTouchView = findTouchView(x, y);
        if (findTouchView != null) {
            removePoint(findTouchView);
            return;
        }
        RectF rectF = new RectF();
        float f = 2;
        rectF.left = (x - ((this.withRate * getWidth()) / f)) / getWidth();
        rectF.right = (x + ((this.withRate * getWidth()) / f)) / getWidth();
        rectF.top = (y - ((this.heightRate * getHeight()) / f)) / getHeight();
        rectF.bottom = (y + ((this.heightRate * getHeight()) / f)) / getHeight();
        addPoint(new CounterData(rectF, true));
    }

    private final View findTouchView(float x, float y) {
        for (View view : ViewGroupKt.getChildren(this)) {
            Object tag = view.getTag();
            Intrinsics.checkNotNull(tag, "null cannot be cast to non-null type com.glority.android.picturexx.widget.CounterMaskLayout.CounterData");
            if (((CounterData) tag).getCoord().contains(x / getWidth(), y / getHeight())) {
                return view;
            }
        }
        return null;
    }

    public final void initData(List<CounterData> data) {
        CountListener countListener;
        Intrinsics.checkNotNullParameter(data, "data");
        this.originalData = new ArrayList(data);
        this.heightRate = (getMeasuredWidth() / getMeasuredHeight()) * this.withRate;
        List<CounterData> list = data;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (CounterData counterData : list) {
            RectF rectF = new RectF();
            float f = 2;
            rectF.left = ((counterData.getCoord().left + counterData.getCoord().right) / f) - (this.withRate / f);
            rectF.right = ((counterData.getCoord().left + counterData.getCoord().right) / f) + (this.withRate / f);
            rectF.top = ((counterData.getCoord().top + counterData.getCoord().bottom) / f) - (this.heightRate / f);
            rectF.bottom = ((counterData.getCoord().top + counterData.getCoord().bottom) / f) + (this.heightRate / f);
            counterData.setCoord(rectF);
            arrayList.add(counterData);
        }
        ArrayList arrayList2 = arrayList;
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            addPoint((CounterData) it.next());
        }
        if (!arrayList2.isEmpty() || (countListener = this.countListener) == null) {
            return;
        }
        countListener.count(arrayList2.size());
    }

    private final void addPoint(CounterData point) {
        this.data.add(point);
        CountListener countListener = this.countListener;
        if (countListener != null) {
            countListener.count(this.data.size());
        }
        int i = point.getIsManual() ? R.drawable.ic_red_point : R.drawable.ic_green_point;
        ImageView imageView = new ImageView(getContext());
        imageView.setId(imageView.hashCode());
        imageView.setImageResource(i);
        imageView.setTag(point);
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(0, 0);
        layoutParams.startToStart = 0;
        layoutParams.topToTop = 0;
        layoutParams.endToEnd = 0;
        layoutParams.bottomToBottom = 0;
        layoutParams.horizontalBias = point.getCoord().centerX();
        layoutParams.verticalBias = point.getCoord().centerY();
        layoutParams.matchConstraintPercentHeight = this.heightRate;
        layoutParams.matchConstraintPercentWidth = this.withRate;
        Unit unit = Unit.INSTANCE;
        addView(imageView, layoutParams);
    }

    private final void removePoint(View view) {
        removeView(view);
        List<CounterData> list = this.data;
        TypeIntrinsics.asMutableCollection(list).remove(view.getTag());
        CountListener countListener = this.countListener;
        if (countListener != null) {
            countListener.count(this.data.size());
        }
    }

    private final void removePoint(CounterData counterData) {
        View view;
        Iterator<View> it = ViewGroupKt.getChildren(this).iterator();
        while (true) {
            if (!it.hasNext()) {
                view = null;
                break;
            } else {
                view = it.next();
                if (Intrinsics.areEqual(view.getTag(), counterData)) {
                    break;
                }
            }
        }
        View view2 = view;
        if (view2 != null) {
            removePoint(view2);
        }
    }

    public final void removeAllManualPoints() {
        removeAllViews();
        this.data.clear();
        initData(this.originalData);
    }

    /* compiled from: CounterMaskLayout.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\f¨\u0006\r"}, d2 = {"Lcom/glority/android/picturexx/widget/CounterMaskLayout$CounterData;", "", "coord", "Landroid/graphics/RectF;", "isManual", "", "<init>", "(Landroid/graphics/RectF;Z)V", "getCoord", "()Landroid/graphics/RectF;", "setCoord", "(Landroid/graphics/RectF;)V", "()Z", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes5.dex */
    public static final class CounterData {
        public static final int $stable = 8;
        private RectF coord;
        private final boolean isManual;

        public CounterData(RectF coord, boolean z) {
            Intrinsics.checkNotNullParameter(coord, "coord");
            this.coord = coord;
            this.isManual = z;
        }

        public final RectF getCoord() {
            return this.coord;
        }

        /* renamed from: isManual, reason: from getter */
        public final boolean getIsManual() {
            return this.isManual;
        }

        public final void setCoord(RectF rectF) {
            Intrinsics.checkNotNullParameter(rectF, "<set-?>");
            this.coord = rectF;
        }
    }
}
