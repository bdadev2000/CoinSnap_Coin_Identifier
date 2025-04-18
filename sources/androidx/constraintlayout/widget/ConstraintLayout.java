package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.solver.LinearSystem;
import androidx.constraintlayout.solver.Metrics;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer;
import androidx.constraintlayout.solver.widgets.HelperWidget;
import androidx.constraintlayout.solver.widgets.WidgetContainer;
import androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure;
import com.google.android.gms.common.api.Api;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.google.zxing.aztec.encoder.Encoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import okhttp3.internal.http2.Http2Connection;
import org.objectweb.asm.Opcodes;

/* loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {
    private static final boolean DEBUG = false;
    private static final boolean DEBUG_DRAW_CONSTRAINTS = false;
    public static final int DESIGN_INFO_ID = 0;
    private static final boolean MEASURE = false;
    private static final String TAG = "ConstraintLayout";
    private static final boolean USE_CONSTRAINTS_HELPER = true;
    public static final String VERSION = "ConstraintLayout-2.0.1";
    SparseArray<View> mChildrenByIds;
    private ArrayList<ConstraintHelper> mConstraintHelpers;
    protected ConstraintLayoutStates mConstraintLayoutSpec;
    private ConstraintSet mConstraintSet;
    private int mConstraintSetId;
    private ConstraintsChangedListener mConstraintsChangedListener;
    private HashMap<String, Integer> mDesignIds;
    protected boolean mDirtyHierarchy;
    private int mLastMeasureHeight;
    int mLastMeasureHeightMode;
    int mLastMeasureHeightSize;
    private int mLastMeasureWidth;
    int mLastMeasureWidthMode;
    int mLastMeasureWidthSize;
    protected ConstraintWidgetContainer mLayoutWidget;
    private int mMaxHeight;
    private int mMaxWidth;
    Measurer mMeasurer;
    private Metrics mMetrics;
    private int mMinHeight;
    private int mMinWidth;
    private int mOnMeasureHeightMeasureSpec;
    private int mOnMeasureWidthMeasureSpec;
    private int mOptimizationLevel;
    private SparseArray<ConstraintWidget> mTempMapIdToWidget;

    /* renamed from: androidx.constraintlayout.widget.ConstraintLayout$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f18197a;

        static {
            int[] iArr = new int[ConstraintWidget.DimensionBehaviour.values().length];
            f18197a = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18197a[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f18197a[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f18197a[2] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* loaded from: classes.dex */
    public class Measurer implements BasicMeasure.Measurer {

        /* renamed from: a, reason: collision with root package name */
        public final ConstraintLayout f18233a;

        /* renamed from: b, reason: collision with root package name */
        public int f18234b;

        /* renamed from: c, reason: collision with root package name */
        public int f18235c;
        public int d;
        public int e;

        /* renamed from: f, reason: collision with root package name */
        public int f18236f;

        /* renamed from: g, reason: collision with root package name */
        public int f18237g;

        public Measurer(ConstraintLayout constraintLayout) {
            this.f18233a = constraintLayout;
        }

        @Override // androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure.Measurer
        public final void a() {
            ConstraintLayout constraintLayout = this.f18233a;
            int childCount = constraintLayout.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = constraintLayout.getChildAt(i2);
                if (childAt instanceof Placeholder) {
                    Placeholder placeholder = (Placeholder) childAt;
                    if (placeholder.f18324b != null) {
                        LayoutParams layoutParams = (LayoutParams) placeholder.getLayoutParams();
                        LayoutParams layoutParams2 = (LayoutParams) placeholder.f18324b.getLayoutParams();
                        ConstraintWidget constraintWidget = layoutParams2.f18219l0;
                        constraintWidget.X = 0;
                        ConstraintWidget constraintWidget2 = layoutParams.f18219l0;
                        ConstraintWidget.DimensionBehaviour dimensionBehaviour = constraintWidget2.J[0];
                        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.f18040a;
                        if (dimensionBehaviour != dimensionBehaviour2) {
                            constraintWidget2.z(constraintWidget.m());
                        }
                        ConstraintWidget constraintWidget3 = layoutParams.f18219l0;
                        if (constraintWidget3.J[1] != dimensionBehaviour2) {
                            constraintWidget3.w(layoutParams2.f18219l0.j());
                        }
                        layoutParams2.f18219l0.X = 8;
                    }
                }
            }
            int size = constraintLayout.mConstraintHelpers.size();
            if (size > 0) {
                for (int i3 = 0; i3 < size; i3++) {
                    ((ConstraintHelper) constraintLayout.mConstraintHelpers.get(i3)).getClass();
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:100:0x01ff A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:103:0x0216 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:106:0x021e  */
        /* JADX WARN: Removed duplicated region for block: B:108:0x0229  */
        /* JADX WARN: Removed duplicated region for block: B:110:0x0225  */
        /* JADX WARN: Removed duplicated region for block: B:112:0x020b A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:114:0x01f2  */
        /* JADX WARN: Removed duplicated region for block: B:115:0x01e0  */
        /* JADX WARN: Removed duplicated region for block: B:116:0x01d0  */
        /* JADX WARN: Removed duplicated region for block: B:117:0x01bf  */
        /* JADX WARN: Removed duplicated region for block: B:123:0x014b  */
        /* JADX WARN: Removed duplicated region for block: B:124:0x0146  */
        /* JADX WARN: Removed duplicated region for block: B:155:0x0136  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x00bd  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0144  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0149  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0152 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:36:0x015a A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:40:0x0163  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x016e  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x0181 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:57:0x0242  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x0249  */
        /* JADX WARN: Removed duplicated region for block: B:65:0x0257  */
        /* JADX WARN: Removed duplicated region for block: B:67:0x025a  */
        /* JADX WARN: Removed duplicated region for block: B:75:0x0244  */
        /* JADX WARN: Removed duplicated region for block: B:78:0x0198  */
        /* JADX WARN: Removed duplicated region for block: B:83:0x01b7  */
        /* JADX WARN: Removed duplicated region for block: B:85:0x01c8  */
        /* JADX WARN: Removed duplicated region for block: B:88:0x01db  */
        /* JADX WARN: Removed duplicated region for block: B:91:0x01e5  */
        /* JADX WARN: Removed duplicated region for block: B:94:0x01ed  */
        /* JADX WARN: Removed duplicated region for block: B:97:0x01f7  */
        @Override // androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure.Measurer
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void b(androidx.constraintlayout.solver.widgets.ConstraintWidget r18, androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure.Measure r19) {
            /*
                Method dump skipped, instructions count: 621
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.Measurer.b(androidx.constraintlayout.solver.widgets.ConstraintWidget, androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure$Measure):void");
        }
    }

    public ConstraintLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mChildrenByIds = new SparseArray<>();
        this.mConstraintHelpers = new ArrayList<>(4);
        this.mLayoutWidget = new ConstraintWidgetContainer();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.mMaxHeight = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = 263;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap<>();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new SparseArray<>();
        this.mMeasurer = new Measurer(this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        a(attributeSet, 0);
    }

    private int getPaddingWidth() {
        int max = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int max2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        return max2 > 0 ? max2 : max;
    }

    public final void a(AttributeSet attributeSet, int i2) {
        ConstraintWidgetContainer constraintWidgetContainer = this.mLayoutWidget;
        constraintWidgetContainer.W = this;
        Measurer measurer = this.mMeasurer;
        constraintWidgetContainer.f18046i0 = measurer;
        constraintWidgetContainer.f18045h0.f18120f = measurer;
        this.mChildrenByIds.put(getId(), this);
        this.mConstraintSet = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.f18327b, i2, 0);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = obtainStyledAttributes.getIndex(i3);
                if (index == 9) {
                    this.mMinWidth = obtainStyledAttributes.getDimensionPixelOffset(index, this.mMinWidth);
                } else if (index == 10) {
                    this.mMinHeight = obtainStyledAttributes.getDimensionPixelOffset(index, this.mMinHeight);
                } else if (index == 7) {
                    this.mMaxWidth = obtainStyledAttributes.getDimensionPixelOffset(index, this.mMaxWidth);
                } else if (index == 8) {
                    this.mMaxHeight = obtainStyledAttributes.getDimensionPixelOffset(index, this.mMaxHeight);
                } else if (index == 89) {
                    this.mOptimizationLevel = obtainStyledAttributes.getInt(index, this.mOptimizationLevel);
                } else if (index == 38) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            parseLayoutDescription(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.mConstraintLayoutSpec = null;
                        }
                    }
                } else if (index == 18) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        ConstraintSet constraintSet = new ConstraintSet();
                        this.mConstraintSet = constraintSet;
                        constraintSet.h(resourceId2, getContext());
                    } catch (Resources.NotFoundException unused2) {
                        this.mConstraintSet = null;
                    }
                    this.mConstraintSetId = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        ConstraintWidgetContainer constraintWidgetContainer2 = this.mLayoutWidget;
        int i4 = this.mOptimizationLevel;
        constraintWidgetContainer2.f18055r0 = i4;
        LinearSystem.f17918q = (i4 & 256) == 256;
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i2, layoutParams);
    }

    /* JADX WARN: Removed duplicated region for block: B:165:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x01e9  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:103:0x0308 -> B:79:0x02f7). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void applyConstraintsFromLayoutParams(boolean r22, android.view.View r23, androidx.constraintlayout.solver.widgets.ConstraintWidget r24, androidx.constraintlayout.widget.ConstraintLayout.LayoutParams r25, android.util.SparseArray<androidx.constraintlayout.solver.widgets.ConstraintWidget> r26) {
        /*
            Method dump skipped, instructions count: 879
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.applyConstraintsFromLayoutParams(boolean, android.view.View, androidx.constraintlayout.solver.widgets.ConstraintWidget, androidx.constraintlayout.widget.ConstraintLayout$LayoutParams, android.util.SparseArray):void");
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList<ConstraintHelper> arrayList = this.mConstraintHelpers;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i2 = 0; i2 < size; i2++) {
                this.mConstraintHelpers.get(i2).l(this);
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            int childCount = getChildCount();
            float width = getWidth();
            float height = getHeight();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] split = ((String) tag).split(",");
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int i4 = (int) ((parseInt / 1080.0f) * width);
                        int i5 = (int) ((parseInt2 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(Opcodes.V_PREVIEW);
                        float f2 = i4;
                        float f3 = i5;
                        float f4 = i4 + ((int) ((parseInt3 / 1080.0f) * width));
                        canvas.drawLine(f2, f3, f4, f3, paint);
                        float parseInt4 = i5 + ((int) ((Integer.parseInt(split[3]) / 1920.0f) * height));
                        canvas.drawLine(f4, f3, f4, parseInt4, paint);
                        canvas.drawLine(f4, parseInt4, f2, parseInt4, paint);
                        canvas.drawLine(f2, parseInt4, f2, f3, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f2, f3, f4, parseInt4, paint);
                        canvas.drawLine(f2, parseInt4, f4, f3, paint);
                    }
                }
            }
        }
    }

    public void fillMetrics(Metrics metrics) {
        this.mMetrics = metrics;
        ConstraintWidgetContainer constraintWidgetContainer = this.mLayoutWidget;
        constraintWidgetContainer.getClass();
        constraintWidgetContainer.f18048k0.getClass();
        LinearSystem.f17917p = metrics;
    }

    @Override // android.view.View
    public void forceLayout() {
        this.mDirtyHierarchy = true;
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        super.forceLayout();
    }

    public Object getDesignInformation(int i2, Object obj) {
        if (i2 != 0 || !(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        HashMap<String, Integer> hashMap = this.mDesignIds;
        if (hashMap == null || !hashMap.containsKey(str)) {
            return null;
        }
        return this.mDesignIds.get(str);
    }

    public int getMaxHeight() {
        return this.mMaxHeight;
    }

    public int getMaxWidth() {
        return this.mMaxWidth;
    }

    public int getMinHeight() {
        return this.mMinHeight;
    }

    public int getMinWidth() {
        return this.mMinWidth;
    }

    public int getOptimizationLevel() {
        return this.mLayoutWidget.f18055r0;
    }

    public View getViewById(int i2) {
        return this.mChildrenByIds.get(i2);
    }

    public final ConstraintWidget getViewWidget(View view) {
        if (view == this) {
            return this.mLayoutWidget;
        }
        if (view == null) {
            return null;
        }
        return ((LayoutParams) view.getLayoutParams()).f18219l0;
    }

    public boolean isRtl() {
        return (getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == getLayoutDirection();
    }

    public void loadLayoutDescription(int i2) {
        if (i2 == 0) {
            this.mConstraintLayoutSpec = null;
            return;
        }
        try {
            this.mConstraintLayoutSpec = new ConstraintLayoutStates(getContext(), this, i2);
        } catch (Resources.NotFoundException unused) {
            this.mConstraintLayoutSpec = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        View content;
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            ConstraintWidget constraintWidget = layoutParams.f18219l0;
            if ((childAt.getVisibility() != 8 || layoutParams.Y || layoutParams.Z || isInEditMode) && !layoutParams.f18199a0) {
                int n2 = constraintWidget.n();
                int o2 = constraintWidget.o();
                int m2 = constraintWidget.m() + n2;
                int j2 = constraintWidget.j() + o2;
                childAt.layout(n2, o2, m2, j2);
                if ((childAt instanceof Placeholder) && (content = ((Placeholder) childAt).getContent()) != null) {
                    content.setVisibility(0);
                    content.layout(n2, o2, m2, j2);
                }
            }
        }
        int size = this.mConstraintHelpers.size();
        if (size > 0) {
            for (int i7 = 0; i7 < size; i7++) {
                this.mConstraintHelpers.get(i7).k();
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
        boolean z2;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2;
        ConstraintWidget constraintWidget;
        this.mOnMeasureWidthMeasureSpec = i2;
        this.mOnMeasureHeightMeasureSpec = i3;
        this.mLayoutWidget.f18047j0 = isRtl();
        if (this.mDirtyHierarchy) {
            int i4 = 0;
            this.mDirtyHierarchy = false;
            int childCount = getChildCount();
            int i5 = 0;
            while (true) {
                if (i5 >= childCount) {
                    z2 = false;
                    break;
                } else {
                    if (getChildAt(i5).isLayoutRequested()) {
                        z2 = true;
                        break;
                    }
                    i5++;
                }
            }
            if (z2) {
                boolean isInEditMode = isInEditMode();
                int childCount2 = getChildCount();
                for (int i6 = 0; i6 < childCount2; i6++) {
                    ConstraintWidget viewWidget = getViewWidget(getChildAt(i6));
                    if (viewWidget != null) {
                        viewWidget.t();
                    }
                }
                Object obj = null;
                if (isInEditMode) {
                    for (int i7 = 0; i7 < childCount2; i7++) {
                        View childAt = getChildAt(i7);
                        try {
                            String resourceName = getResources().getResourceName(childAt.getId());
                            setDesignInformation(0, resourceName, Integer.valueOf(childAt.getId()));
                            int indexOf = resourceName.indexOf(47);
                            if (indexOf != -1) {
                                resourceName = resourceName.substring(indexOf + 1);
                            }
                            int id = childAt.getId();
                            if (id == 0) {
                                constraintWidget = this.mLayoutWidget;
                            } else {
                                View view = this.mChildrenByIds.get(id);
                                if (view == null && (view = findViewById(id)) != null && view != this && view.getParent() == this) {
                                    onViewAdded(view);
                                }
                                constraintWidget = view == this ? this.mLayoutWidget : view == null ? null : ((LayoutParams) view.getLayoutParams()).f18219l0;
                            }
                            constraintWidget.Y = resourceName;
                        } catch (Resources.NotFoundException unused) {
                        }
                    }
                }
                if (this.mConstraintSetId != -1) {
                    for (int i8 = 0; i8 < childCount2; i8++) {
                        View childAt2 = getChildAt(i8);
                        if (childAt2.getId() == this.mConstraintSetId && (childAt2 instanceof Constraints)) {
                            this.mConstraintSet = ((Constraints) childAt2).getConstraintSet();
                        }
                    }
                }
                ConstraintSet constraintSet = this.mConstraintSet;
                if (constraintSet != null) {
                    constraintSet.c(this);
                }
                this.mLayoutWidget.f18102f0.clear();
                int size = this.mConstraintHelpers.size();
                if (size > 0) {
                    int i9 = 0;
                    while (i9 < size) {
                        ConstraintHelper constraintHelper = this.mConstraintHelpers.get(i9);
                        if (constraintHelper.isInEditMode()) {
                            constraintHelper.setIds(constraintHelper.f18194f);
                        }
                        HelperWidget helperWidget = constraintHelper.d;
                        if (helperWidget != null) {
                            helperWidget.f18089g0 = i4;
                            Arrays.fill(helperWidget.f18088f0, obj);
                            for (int i10 = i4; i10 < constraintHelper.f18192b; i10++) {
                                int i11 = constraintHelper.f18191a[i10];
                                View viewById = getViewById(i11);
                                if (viewById == null) {
                                    Integer valueOf = Integer.valueOf(i11);
                                    HashMap hashMap = constraintHelper.f18196h;
                                    String str = (String) hashMap.get(valueOf);
                                    int f2 = constraintHelper.f(this, str);
                                    if (f2 != 0) {
                                        constraintHelper.f18191a[i10] = f2;
                                        hashMap.put(Integer.valueOf(f2), str);
                                        viewById = getViewById(f2);
                                    }
                                }
                                if (viewById != null) {
                                    constraintHelper.d.C(getViewWidget(viewById));
                                }
                            }
                            constraintHelper.d.a();
                        }
                        i9++;
                        i4 = 0;
                        obj = null;
                    }
                }
                for (int i12 = 0; i12 < childCount2; i12++) {
                    View childAt3 = getChildAt(i12);
                    if (childAt3 instanceof Placeholder) {
                        Placeholder placeholder = (Placeholder) childAt3;
                        if (placeholder.f18323a == -1 && !placeholder.isInEditMode()) {
                            placeholder.setVisibility(placeholder.f18325c);
                        }
                        View findViewById = findViewById(placeholder.f18323a);
                        placeholder.f18324b = findViewById;
                        if (findViewById != null) {
                            ((LayoutParams) findViewById.getLayoutParams()).f18199a0 = true;
                            placeholder.f18324b.setVisibility(0);
                            placeholder.setVisibility(0);
                        }
                    }
                }
                this.mTempMapIdToWidget.clear();
                this.mTempMapIdToWidget.put(0, this.mLayoutWidget);
                this.mTempMapIdToWidget.put(getId(), this.mLayoutWidget);
                for (int i13 = 0; i13 < childCount2; i13++) {
                    View childAt4 = getChildAt(i13);
                    this.mTempMapIdToWidget.put(childAt4.getId(), getViewWidget(childAt4));
                }
                for (int i14 = 0; i14 < childCount2; i14++) {
                    View childAt5 = getChildAt(i14);
                    ConstraintWidget viewWidget2 = getViewWidget(childAt5);
                    if (viewWidget2 != null) {
                        LayoutParams layoutParams = (LayoutParams) childAt5.getLayoutParams();
                        ConstraintWidgetContainer constraintWidgetContainer = this.mLayoutWidget;
                        constraintWidgetContainer.f18102f0.add(viewWidget2);
                        ConstraintWidget constraintWidget2 = viewWidget2.K;
                        if (constraintWidget2 != null) {
                            ((WidgetContainer) constraintWidget2).f18102f0.remove(viewWidget2);
                            viewWidget2.K = null;
                        }
                        viewWidget2.K = constraintWidgetContainer;
                        applyConstraintsFromLayoutParams(isInEditMode, childAt5, viewWidget2, layoutParams, this.mTempMapIdToWidget);
                    }
                }
            }
            if (z2) {
                ConstraintWidgetContainer constraintWidgetContainer2 = this.mLayoutWidget;
                ArrayList arrayList = constraintWidgetContainer2.f18044g0.f18103a;
                arrayList.clear();
                int size2 = constraintWidgetContainer2.f18102f0.size();
                for (int i15 = 0; i15 < size2; i15++) {
                    ConstraintWidget constraintWidget3 = (ConstraintWidget) constraintWidgetContainer2.f18102f0.get(i15);
                    ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget3.J;
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = dimensionBehaviourArr[0];
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.f18042c;
                    if (dimensionBehaviour3 == dimensionBehaviour4 || dimensionBehaviour3 == (dimensionBehaviour = ConstraintWidget.DimensionBehaviour.d) || (dimensionBehaviour2 = dimensionBehaviourArr[1]) == dimensionBehaviour4 || dimensionBehaviour2 == dimensionBehaviour) {
                        arrayList.add(constraintWidget3);
                    }
                }
                constraintWidgetContainer2.f18045h0.f18118b = true;
            }
        }
        resolveSystem(this.mLayoutWidget, this.mOptimizationLevel, i2, i3);
        int m2 = this.mLayoutWidget.m();
        int j2 = this.mLayoutWidget.j();
        ConstraintWidgetContainer constraintWidgetContainer3 = this.mLayoutWidget;
        resolveMeasuredDimension(i2, i3, m2, j2, constraintWidgetContainer3.f18056s0, constraintWidgetContainer3.f18057t0);
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        ConstraintWidget viewWidget = getViewWidget(view);
        if ((view instanceof Guideline) && !(viewWidget instanceof androidx.constraintlayout.solver.widgets.Guideline)) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            androidx.constraintlayout.solver.widgets.Guideline guideline = new androidx.constraintlayout.solver.widgets.Guideline();
            layoutParams.f18219l0 = guideline;
            layoutParams.Y = true;
            guideline.C(layoutParams.R);
        }
        if (view instanceof ConstraintHelper) {
            ConstraintHelper constraintHelper = (ConstraintHelper) view;
            constraintHelper.m();
            ((LayoutParams) view.getLayoutParams()).Z = true;
            if (!this.mConstraintHelpers.contains(constraintHelper)) {
                this.mConstraintHelpers.add(constraintHelper);
            }
        }
        this.mChildrenByIds.put(view.getId(), view);
        this.mDirtyHierarchy = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.mChildrenByIds.remove(view.getId());
        ConstraintWidget viewWidget = getViewWidget(view);
        this.mLayoutWidget.f18102f0.remove(viewWidget);
        viewWidget.K = null;
        this.mConstraintHelpers.remove(view);
        this.mDirtyHierarchy = true;
    }

    public void parseLayoutDescription(int i2) {
        this.mConstraintLayoutSpec = new ConstraintLayoutStates(getContext(), this, i2);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        super.removeView(view);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.mDirtyHierarchy = true;
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        super.requestLayout();
    }

    public void resolveMeasuredDimension(int i2, int i3, int i4, int i5, boolean z2, boolean z3) {
        Measurer measurer = this.mMeasurer;
        int i6 = measurer.e;
        int resolveSizeAndState = View.resolveSizeAndState(i4 + measurer.d, i2, 0);
        int resolveSizeAndState2 = View.resolveSizeAndState(i5 + i6, i3, 0) & 16777215;
        int min = Math.min(this.mMaxWidth, resolveSizeAndState & 16777215);
        int min2 = Math.min(this.mMaxHeight, resolveSizeAndState2);
        if (z2) {
            min |= Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE;
        }
        if (z3) {
            min2 |= Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE;
        }
        setMeasuredDimension(min, min2);
        this.mLastMeasureWidth = min;
        this.mLastMeasureHeight = min2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:193:0x0422, code lost:
    
        if (r2 != false) goto L226;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0435  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0437  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0258  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void resolveSystem(androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r23, int r24, int r25, int r26) {
        /*
            Method dump skipped, instructions count: 1084
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.resolveSystem(androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer, int, int, int):void");
    }

    public void setConstraintSet(ConstraintSet constraintSet) {
        this.mConstraintSet = constraintSet;
    }

    public void setDesignInformation(int i2, Object obj, Object obj2) {
        if (i2 == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.mDesignIds == null) {
                this.mDesignIds = new HashMap<>();
            }
            String str = (String) obj;
            int indexOf = str.indexOf(RemoteSettings.FORWARD_SLASH_STRING);
            if (indexOf != -1) {
                str = str.substring(indexOf + 1);
            }
            this.mDesignIds.put(str, Integer.valueOf(((Integer) obj2).intValue()));
        }
    }

    @Override // android.view.View
    public void setId(int i2) {
        this.mChildrenByIds.remove(getId());
        super.setId(i2);
        this.mChildrenByIds.put(getId(), this);
    }

    public void setMaxHeight(int i2) {
        if (i2 == this.mMaxHeight) {
            return;
        }
        this.mMaxHeight = i2;
        requestLayout();
    }

    public void setMaxWidth(int i2) {
        if (i2 == this.mMaxWidth) {
            return;
        }
        this.mMaxWidth = i2;
        requestLayout();
    }

    public void setMinHeight(int i2) {
        if (i2 == this.mMinHeight) {
            return;
        }
        this.mMinHeight = i2;
        requestLayout();
    }

    public void setMinWidth(int i2) {
        if (i2 == this.mMinWidth) {
            return;
        }
        this.mMinWidth = i2;
        requestLayout();
    }

    public void setOnConstraintsChanged(ConstraintsChangedListener constraintsChangedListener) {
        this.mConstraintsChangedListener = constraintsChangedListener;
        ConstraintLayoutStates constraintLayoutStates = this.mConstraintLayoutSpec;
        if (constraintLayoutStates != null) {
            constraintLayoutStates.getClass();
        }
    }

    public void setOptimizationLevel(int i2) {
        this.mOptimizationLevel = i2;
        this.mLayoutWidget.f18055r0 = i2;
        LinearSystem.f17918q = (i2 & 256) == 256;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setSelfDimensionBehaviour(androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r9, int r10, int r11, int r12, int r13) {
        /*
            r8 = this;
            androidx.constraintlayout.widget.ConstraintLayout$Measurer r0 = r8.mMeasurer
            int r1 = r0.e
            int r0 = r0.d
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.f18040a
            int r3 = r8.getChildCount()
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r4 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.f18041b
            r5 = 0
            r6 = 1073741824(0x40000000, float:2.0)
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r10 == r7) goto L31
            if (r10 == 0) goto L25
            if (r10 == r6) goto L1c
            r10 = r2
        L1a:
            r11 = r5
            goto L3a
        L1c:
            int r10 = r8.mMaxWidth
            int r10 = r10 - r0
            int r11 = java.lang.Math.min(r10, r11)
            r10 = r2
            goto L3a
        L25:
            if (r3 != 0) goto L2f
            int r10 = r8.mMinWidth
            int r11 = java.lang.Math.max(r5, r10)
        L2d:
            r10 = r4
            goto L3a
        L2f:
            r10 = r4
            goto L1a
        L31:
            if (r3 != 0) goto L2d
            int r10 = r8.mMinWidth
            int r11 = java.lang.Math.max(r5, r10)
            goto L2d
        L3a:
            if (r12 == r7) goto L56
            if (r12 == 0) goto L4a
            if (r12 == r6) goto L42
        L40:
            r13 = r5
            goto L5f
        L42:
            int r12 = r8.mMaxHeight
            int r12 = r12 - r1
            int r13 = java.lang.Math.min(r12, r13)
            goto L5f
        L4a:
            if (r3 != 0) goto L54
            int r12 = r8.mMinHeight
            int r13 = java.lang.Math.max(r5, r12)
        L52:
            r2 = r4
            goto L5f
        L54:
            r2 = r4
            goto L40
        L56:
            if (r3 != 0) goto L52
            int r12 = r8.mMinHeight
            int r13 = java.lang.Math.max(r5, r12)
            goto L52
        L5f:
            int r12 = r9.m()
            r3 = 1
            if (r11 != r12) goto L6c
            int r12 = r9.j()
            if (r13 == r12) goto L70
        L6c:
            androidx.constraintlayout.solver.widgets.analyzer.DependencyGraph r12 = r9.f18045h0
            r12.f18119c = r3
        L70:
            r9.P = r5
            r9.Q = r5
            int r12 = r8.mMaxWidth
            int r12 = r12 - r0
            int[] r4 = r9.f18034u
            r4[r5] = r12
            int r12 = r8.mMaxHeight
            int r12 = r12 - r1
            r4[r3] = r12
            r9.S = r5
            r9.T = r5
            r9.x(r10)
            r9.z(r11)
            r9.y(r2)
            r9.w(r13)
            int r10 = r8.mMinWidth
            int r10 = r10 - r0
            if (r10 >= 0) goto L98
            r9.S = r5
            goto L9a
        L98:
            r9.S = r10
        L9a:
            int r10 = r8.mMinHeight
            int r10 = r10 - r1
            if (r10 >= 0) goto La2
            r9.T = r5
            goto La4
        La2:
            r9.T = r10
        La4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.setSelfDimensionBehaviour(androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer, int, int, int, int):void");
    }

    public void setState(int i2, int i3, int i4) {
        ConstraintLayoutStates constraintLayoutStates = this.mConstraintLayoutSpec;
        if (constraintLayoutStates != null) {
            constraintLayoutStates.b(i3, i4, i2);
        }
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    @Override // android.view.ViewGroup
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.mChildrenByIds = new SparseArray<>();
        this.mConstraintHelpers = new ArrayList<>(4);
        this.mLayoutWidget = new ConstraintWidgetContainer();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.mMaxHeight = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = 263;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap<>();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new SparseArray<>();
        this.mMeasurer = new Measurer(this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        a(attributeSet, i2);
    }

    /* loaded from: classes.dex */
    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        public float A;
        public String B;
        public final int C;
        public float D;
        public float E;
        public int F;
        public int G;
        public int H;
        public int I;
        public int J;
        public int K;
        public int L;
        public int M;
        public float N;
        public float O;
        public int P;
        public int Q;
        public int R;
        public boolean S;
        public boolean T;
        public String U;
        public boolean V;
        public boolean W;
        public boolean X;
        public boolean Y;
        public boolean Z;

        /* renamed from: a, reason: collision with root package name */
        public int f18198a;

        /* renamed from: a0, reason: collision with root package name */
        public boolean f18199a0;

        /* renamed from: b, reason: collision with root package name */
        public int f18200b;

        /* renamed from: b0, reason: collision with root package name */
        public int f18201b0;

        /* renamed from: c, reason: collision with root package name */
        public float f18202c;

        /* renamed from: c0, reason: collision with root package name */
        public int f18203c0;
        public int d;

        /* renamed from: d0, reason: collision with root package name */
        public int f18204d0;
        public int e;

        /* renamed from: e0, reason: collision with root package name */
        public int f18205e0;

        /* renamed from: f, reason: collision with root package name */
        public int f18206f;

        /* renamed from: f0, reason: collision with root package name */
        public int f18207f0;

        /* renamed from: g, reason: collision with root package name */
        public int f18208g;

        /* renamed from: g0, reason: collision with root package name */
        public int f18209g0;

        /* renamed from: h, reason: collision with root package name */
        public int f18210h;

        /* renamed from: h0, reason: collision with root package name */
        public float f18211h0;

        /* renamed from: i, reason: collision with root package name */
        public int f18212i;

        /* renamed from: i0, reason: collision with root package name */
        public int f18213i0;

        /* renamed from: j, reason: collision with root package name */
        public int f18214j;

        /* renamed from: j0, reason: collision with root package name */
        public int f18215j0;

        /* renamed from: k, reason: collision with root package name */
        public int f18216k;

        /* renamed from: k0, reason: collision with root package name */
        public float f18217k0;

        /* renamed from: l, reason: collision with root package name */
        public int f18218l;

        /* renamed from: l0, reason: collision with root package name */
        public ConstraintWidget f18219l0;

        /* renamed from: m, reason: collision with root package name */
        public int f18220m;

        /* renamed from: n, reason: collision with root package name */
        public int f18221n;

        /* renamed from: o, reason: collision with root package name */
        public float f18222o;

        /* renamed from: p, reason: collision with root package name */
        public int f18223p;

        /* renamed from: q, reason: collision with root package name */
        public int f18224q;

        /* renamed from: r, reason: collision with root package name */
        public int f18225r;

        /* renamed from: s, reason: collision with root package name */
        public int f18226s;

        /* renamed from: t, reason: collision with root package name */
        public final int f18227t;

        /* renamed from: u, reason: collision with root package name */
        public int f18228u;

        /* renamed from: v, reason: collision with root package name */
        public final int f18229v;
        public int w;
        public int x;

        /* renamed from: y, reason: collision with root package name */
        public int f18230y;

        /* renamed from: z, reason: collision with root package name */
        public float f18231z;

        /* loaded from: classes.dex */
        public static class Table {

            /* renamed from: a, reason: collision with root package name */
            public static final SparseIntArray f18232a;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                f18232a = sparseIntArray;
                sparseIntArray.append(63, 8);
                sparseIntArray.append(64, 9);
                sparseIntArray.append(66, 10);
                sparseIntArray.append(67, 11);
                sparseIntArray.append(73, 12);
                sparseIntArray.append(72, 13);
                sparseIntArray.append(45, 14);
                sparseIntArray.append(44, 15);
                sparseIntArray.append(42, 16);
                sparseIntArray.append(46, 2);
                sparseIntArray.append(48, 3);
                sparseIntArray.append(47, 4);
                sparseIntArray.append(81, 49);
                sparseIntArray.append(82, 50);
                sparseIntArray.append(52, 5);
                sparseIntArray.append(53, 6);
                sparseIntArray.append(54, 7);
                sparseIntArray.append(0, 1);
                sparseIntArray.append(68, 17);
                sparseIntArray.append(69, 18);
                sparseIntArray.append(51, 19);
                sparseIntArray.append(50, 20);
                sparseIntArray.append(85, 21);
                sparseIntArray.append(88, 22);
                sparseIntArray.append(86, 23);
                sparseIntArray.append(83, 24);
                sparseIntArray.append(87, 25);
                sparseIntArray.append(84, 26);
                sparseIntArray.append(59, 29);
                sparseIntArray.append(74, 30);
                sparseIntArray.append(49, 44);
                sparseIntArray.append(61, 45);
                sparseIntArray.append(76, 46);
                sparseIntArray.append(60, 47);
                sparseIntArray.append(75, 48);
                sparseIntArray.append(40, 27);
                sparseIntArray.append(39, 28);
                sparseIntArray.append(77, 31);
                sparseIntArray.append(55, 32);
                sparseIntArray.append(79, 33);
                sparseIntArray.append(78, 34);
                sparseIntArray.append(80, 35);
                sparseIntArray.append(57, 36);
                sparseIntArray.append(56, 37);
                sparseIntArray.append(58, 38);
                sparseIntArray.append(62, 39);
                sparseIntArray.append(71, 40);
                sparseIntArray.append(65, 41);
                sparseIntArray.append(43, 42);
                sparseIntArray.append(41, 43);
                sparseIntArray.append(70, 51);
            }
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            int i2;
            this.f18198a = -1;
            this.f18200b = -1;
            this.f18202c = -1.0f;
            this.d = -1;
            this.e = -1;
            this.f18206f = -1;
            this.f18208g = -1;
            this.f18210h = -1;
            this.f18212i = -1;
            this.f18214j = -1;
            this.f18216k = -1;
            this.f18218l = -1;
            this.f18220m = -1;
            this.f18221n = 0;
            this.f18222o = 0.0f;
            this.f18223p = -1;
            this.f18224q = -1;
            this.f18225r = -1;
            this.f18226s = -1;
            this.f18227t = -1;
            this.f18228u = -1;
            this.f18229v = -1;
            this.w = -1;
            this.x = -1;
            this.f18230y = -1;
            this.f18231z = 0.5f;
            this.A = 0.5f;
            this.B = null;
            this.C = 1;
            this.D = -1.0f;
            this.E = -1.0f;
            this.F = 0;
            this.G = 0;
            this.H = 0;
            this.I = 0;
            this.J = 0;
            this.K = 0;
            this.L = 0;
            this.M = 0;
            this.N = 1.0f;
            this.O = 1.0f;
            this.P = -1;
            this.Q = -1;
            this.R = -1;
            this.S = false;
            this.T = false;
            this.U = null;
            this.V = true;
            this.W = true;
            this.X = false;
            this.Y = false;
            this.Z = false;
            this.f18199a0 = false;
            this.f18201b0 = -1;
            this.f18203c0 = -1;
            this.f18204d0 = -1;
            this.f18205e0 = -1;
            this.f18207f0 = -1;
            this.f18209g0 = -1;
            this.f18211h0 = 0.5f;
            this.f18219l0 = new ConstraintWidget();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.f18327b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = obtainStyledAttributes.getIndex(i3);
                int i4 = Table.f18232a.get(index);
                switch (i4) {
                    case 1:
                        this.R = obtainStyledAttributes.getInt(index, this.R);
                        break;
                    case 2:
                        int resourceId = obtainStyledAttributes.getResourceId(index, this.f18220m);
                        this.f18220m = resourceId;
                        if (resourceId == -1) {
                            this.f18220m = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        this.f18221n = obtainStyledAttributes.getDimensionPixelSize(index, this.f18221n);
                        break;
                    case 4:
                        float f2 = obtainStyledAttributes.getFloat(index, this.f18222o) % 360.0f;
                        this.f18222o = f2;
                        if (f2 < 0.0f) {
                            this.f18222o = (360.0f - f2) % 360.0f;
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        this.f18198a = obtainStyledAttributes.getDimensionPixelOffset(index, this.f18198a);
                        break;
                    case 6:
                        this.f18200b = obtainStyledAttributes.getDimensionPixelOffset(index, this.f18200b);
                        break;
                    case 7:
                        this.f18202c = obtainStyledAttributes.getFloat(index, this.f18202c);
                        break;
                    case 8:
                        int resourceId2 = obtainStyledAttributes.getResourceId(index, this.d);
                        this.d = resourceId2;
                        if (resourceId2 == -1) {
                            this.d = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        int resourceId3 = obtainStyledAttributes.getResourceId(index, this.e);
                        this.e = resourceId3;
                        if (resourceId3 == -1) {
                            this.e = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        int resourceId4 = obtainStyledAttributes.getResourceId(index, this.f18206f);
                        this.f18206f = resourceId4;
                        if (resourceId4 == -1) {
                            this.f18206f = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        int resourceId5 = obtainStyledAttributes.getResourceId(index, this.f18208g);
                        this.f18208g = resourceId5;
                        if (resourceId5 == -1) {
                            this.f18208g = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        int resourceId6 = obtainStyledAttributes.getResourceId(index, this.f18210h);
                        this.f18210h = resourceId6;
                        if (resourceId6 == -1) {
                            this.f18210h = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        int resourceId7 = obtainStyledAttributes.getResourceId(index, this.f18212i);
                        this.f18212i = resourceId7;
                        if (resourceId7 == -1) {
                            this.f18212i = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        int resourceId8 = obtainStyledAttributes.getResourceId(index, this.f18214j);
                        this.f18214j = resourceId8;
                        if (resourceId8 == -1) {
                            this.f18214j = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        int resourceId9 = obtainStyledAttributes.getResourceId(index, this.f18216k);
                        this.f18216k = resourceId9;
                        if (resourceId9 == -1) {
                            this.f18216k = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        int resourceId10 = obtainStyledAttributes.getResourceId(index, this.f18218l);
                        this.f18218l = resourceId10;
                        if (resourceId10 == -1) {
                            this.f18218l = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        int resourceId11 = obtainStyledAttributes.getResourceId(index, this.f18223p);
                        this.f18223p = resourceId11;
                        if (resourceId11 == -1) {
                            this.f18223p = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        int resourceId12 = obtainStyledAttributes.getResourceId(index, this.f18224q);
                        this.f18224q = resourceId12;
                        if (resourceId12 == -1) {
                            this.f18224q = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 19:
                        int resourceId13 = obtainStyledAttributes.getResourceId(index, this.f18225r);
                        this.f18225r = resourceId13;
                        if (resourceId13 == -1) {
                            this.f18225r = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 20:
                        int resourceId14 = obtainStyledAttributes.getResourceId(index, this.f18226s);
                        this.f18226s = resourceId14;
                        if (resourceId14 == -1) {
                            this.f18226s = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 21:
                        this.f18227t = obtainStyledAttributes.getDimensionPixelSize(index, this.f18227t);
                        break;
                    case 22:
                        this.f18228u = obtainStyledAttributes.getDimensionPixelSize(index, this.f18228u);
                        break;
                    case 23:
                        this.f18229v = obtainStyledAttributes.getDimensionPixelSize(index, this.f18229v);
                        break;
                    case 24:
                        this.w = obtainStyledAttributes.getDimensionPixelSize(index, this.w);
                        break;
                    case 25:
                        this.x = obtainStyledAttributes.getDimensionPixelSize(index, this.x);
                        break;
                    case 26:
                        this.f18230y = obtainStyledAttributes.getDimensionPixelSize(index, this.f18230y);
                        break;
                    case 27:
                        this.S = obtainStyledAttributes.getBoolean(index, this.S);
                        break;
                    case 28:
                        this.T = obtainStyledAttributes.getBoolean(index, this.T);
                        break;
                    case 29:
                        this.f18231z = obtainStyledAttributes.getFloat(index, this.f18231z);
                        break;
                    case 30:
                        this.A = obtainStyledAttributes.getFloat(index, this.A);
                        break;
                    case 31:
                        int i5 = obtainStyledAttributes.getInt(index, 0);
                        this.H = i5;
                        if (i5 == 1) {
                            Log.e(ConstraintLayout.TAG, "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                            break;
                        } else {
                            break;
                        }
                    case 32:
                        int i6 = obtainStyledAttributes.getInt(index, 0);
                        this.I = i6;
                        if (i6 == 1) {
                            Log.e(ConstraintLayout.TAG, "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                            break;
                        } else {
                            break;
                        }
                    case Encoder.DEFAULT_EC_PERCENT /* 33 */:
                        try {
                            this.J = obtainStyledAttributes.getDimensionPixelSize(index, this.J);
                            break;
                        } catch (Exception unused) {
                            if (obtainStyledAttributes.getInt(index, this.J) == -2) {
                                this.J = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 34:
                        try {
                            this.L = obtainStyledAttributes.getDimensionPixelSize(index, this.L);
                            break;
                        } catch (Exception unused2) {
                            if (obtainStyledAttributes.getInt(index, this.L) == -2) {
                                this.L = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 35:
                        this.N = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.N));
                        this.H = 2;
                        break;
                    case 36:
                        try {
                            this.K = obtainStyledAttributes.getDimensionPixelSize(index, this.K);
                            break;
                        } catch (Exception unused3) {
                            if (obtainStyledAttributes.getInt(index, this.K) == -2) {
                                this.K = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 37:
                        try {
                            this.M = obtainStyledAttributes.getDimensionPixelSize(index, this.M);
                            break;
                        } catch (Exception unused4) {
                            if (obtainStyledAttributes.getInt(index, this.M) == -2) {
                                this.M = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 38:
                        this.O = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.O));
                        this.I = 2;
                        break;
                    default:
                        switch (i4) {
                            case 44:
                                String string = obtainStyledAttributes.getString(index);
                                this.B = string;
                                this.C = -1;
                                if (string != null) {
                                    int length = string.length();
                                    int indexOf = this.B.indexOf(44);
                                    if (indexOf <= 0 || indexOf >= length - 1) {
                                        i2 = 0;
                                    } else {
                                        String substring = this.B.substring(0, indexOf);
                                        if (substring.equalsIgnoreCase("W")) {
                                            this.C = 0;
                                        } else if (substring.equalsIgnoreCase("H")) {
                                            this.C = 1;
                                        }
                                        i2 = indexOf + 1;
                                    }
                                    int indexOf2 = this.B.indexOf(58);
                                    if (indexOf2 >= 0 && indexOf2 < length - 1) {
                                        String substring2 = this.B.substring(i2, indexOf2);
                                        String substring3 = this.B.substring(indexOf2 + 1);
                                        if (substring2.length() > 0 && substring3.length() > 0) {
                                            try {
                                                float parseFloat = Float.parseFloat(substring2);
                                                float parseFloat2 = Float.parseFloat(substring3);
                                                if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                                                    if (this.C == 1) {
                                                        Math.abs(parseFloat2 / parseFloat);
                                                        break;
                                                    } else {
                                                        Math.abs(parseFloat / parseFloat2);
                                                        break;
                                                    }
                                                }
                                            } catch (NumberFormatException unused5) {
                                                break;
                                            }
                                        }
                                    } else {
                                        String substring4 = this.B.substring(i2);
                                        if (substring4.length() > 0) {
                                            Float.parseFloat(substring4);
                                            break;
                                        } else {
                                            break;
                                        }
                                    }
                                } else {
                                    break;
                                }
                                break;
                            case 45:
                                this.D = obtainStyledAttributes.getFloat(index, this.D);
                                break;
                            case 46:
                                this.E = obtainStyledAttributes.getFloat(index, this.E);
                                break;
                            case 47:
                                this.F = obtainStyledAttributes.getInt(index, 0);
                                break;
                            case 48:
                                this.G = obtainStyledAttributes.getInt(index, 0);
                                break;
                            case 49:
                                this.P = obtainStyledAttributes.getDimensionPixelOffset(index, this.P);
                                break;
                            case 50:
                                this.Q = obtainStyledAttributes.getDimensionPixelOffset(index, this.Q);
                                break;
                            case 51:
                                this.U = obtainStyledAttributes.getString(index);
                                break;
                        }
                }
            }
            obtainStyledAttributes.recycle();
            a();
        }

        public final void a() {
            this.Y = false;
            this.V = true;
            this.W = true;
            int i2 = ((ViewGroup.MarginLayoutParams) this).width;
            if (i2 == -2 && this.S) {
                this.V = false;
                if (this.H == 0) {
                    this.H = 1;
                }
            }
            int i3 = ((ViewGroup.MarginLayoutParams) this).height;
            if (i3 == -2 && this.T) {
                this.W = false;
                if (this.I == 0) {
                    this.I = 1;
                }
            }
            if (i2 == 0 || i2 == -1) {
                this.V = false;
                if (i2 == 0 && this.H == 1) {
                    ((ViewGroup.MarginLayoutParams) this).width = -2;
                    this.S = true;
                }
            }
            if (i3 == 0 || i3 == -1) {
                this.W = false;
                if (i3 == 0 && this.I == 1) {
                    ((ViewGroup.MarginLayoutParams) this).height = -2;
                    this.T = true;
                }
            }
            if (this.f18202c == -1.0f && this.f18198a == -1 && this.f18200b == -1) {
                return;
            }
            this.Y = true;
            this.V = true;
            this.W = true;
            if (!(this.f18219l0 instanceof androidx.constraintlayout.solver.widgets.Guideline)) {
                this.f18219l0 = new androidx.constraintlayout.solver.widgets.Guideline();
            }
            ((androidx.constraintlayout.solver.widgets.Guideline) this.f18219l0).C(this.R);
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x004f  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0056  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0062  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0074  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x007c  */
        @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void resolveLayoutDirection(int r10) {
            /*
                Method dump skipped, instructions count: 253
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.LayoutParams.resolveLayoutDirection(int):void");
        }

        public LayoutParams() {
            super(-2, -2);
            this.f18198a = -1;
            this.f18200b = -1;
            this.f18202c = -1.0f;
            this.d = -1;
            this.e = -1;
            this.f18206f = -1;
            this.f18208g = -1;
            this.f18210h = -1;
            this.f18212i = -1;
            this.f18214j = -1;
            this.f18216k = -1;
            this.f18218l = -1;
            this.f18220m = -1;
            this.f18221n = 0;
            this.f18222o = 0.0f;
            this.f18223p = -1;
            this.f18224q = -1;
            this.f18225r = -1;
            this.f18226s = -1;
            this.f18227t = -1;
            this.f18228u = -1;
            this.f18229v = -1;
            this.w = -1;
            this.x = -1;
            this.f18230y = -1;
            this.f18231z = 0.5f;
            this.A = 0.5f;
            this.B = null;
            this.C = 1;
            this.D = -1.0f;
            this.E = -1.0f;
            this.F = 0;
            this.G = 0;
            this.H = 0;
            this.I = 0;
            this.J = 0;
            this.K = 0;
            this.L = 0;
            this.M = 0;
            this.N = 1.0f;
            this.O = 1.0f;
            this.P = -1;
            this.Q = -1;
            this.R = -1;
            this.S = false;
            this.T = false;
            this.U = null;
            this.V = true;
            this.W = true;
            this.X = false;
            this.Y = false;
            this.Z = false;
            this.f18199a0 = false;
            this.f18201b0 = -1;
            this.f18203c0 = -1;
            this.f18204d0 = -1;
            this.f18205e0 = -1;
            this.f18207f0 = -1;
            this.f18209g0 = -1;
            this.f18211h0 = 0.5f;
            this.f18219l0 = new ConstraintWidget();
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f18198a = -1;
            this.f18200b = -1;
            this.f18202c = -1.0f;
            this.d = -1;
            this.e = -1;
            this.f18206f = -1;
            this.f18208g = -1;
            this.f18210h = -1;
            this.f18212i = -1;
            this.f18214j = -1;
            this.f18216k = -1;
            this.f18218l = -1;
            this.f18220m = -1;
            this.f18221n = 0;
            this.f18222o = 0.0f;
            this.f18223p = -1;
            this.f18224q = -1;
            this.f18225r = -1;
            this.f18226s = -1;
            this.f18227t = -1;
            this.f18228u = -1;
            this.f18229v = -1;
            this.w = -1;
            this.x = -1;
            this.f18230y = -1;
            this.f18231z = 0.5f;
            this.A = 0.5f;
            this.B = null;
            this.C = 1;
            this.D = -1.0f;
            this.E = -1.0f;
            this.F = 0;
            this.G = 0;
            this.H = 0;
            this.I = 0;
            this.J = 0;
            this.K = 0;
            this.L = 0;
            this.M = 0;
            this.N = 1.0f;
            this.O = 1.0f;
            this.P = -1;
            this.Q = -1;
            this.R = -1;
            this.S = false;
            this.T = false;
            this.U = null;
            this.V = true;
            this.W = true;
            this.X = false;
            this.Y = false;
            this.Z = false;
            this.f18199a0 = false;
            this.f18201b0 = -1;
            this.f18203c0 = -1;
            this.f18204d0 = -1;
            this.f18205e0 = -1;
            this.f18207f0 = -1;
            this.f18209g0 = -1;
            this.f18211h0 = 0.5f;
            this.f18219l0 = new ConstraintWidget();
        }
    }
}
