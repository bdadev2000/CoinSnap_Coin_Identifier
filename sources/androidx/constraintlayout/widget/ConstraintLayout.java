package androidx.constraintlayout.widget;

import B.d;
import B.e;
import E.c;
import E.f;
import E.g;
import E.h;
import E.o;
import E.p;
import E.r;
import E.s;
import a7.b;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
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
import androidx.core.view.MotionEventCompat;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;
import z.C2963c;

/* loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {

    /* renamed from: t, reason: collision with root package name */
    public static s f4326t;
    public final SparseArray b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f4327c;

    /* renamed from: d, reason: collision with root package name */
    public final e f4328d;

    /* renamed from: f, reason: collision with root package name */
    public int f4329f;

    /* renamed from: g, reason: collision with root package name */
    public int f4330g;

    /* renamed from: h, reason: collision with root package name */
    public int f4331h;

    /* renamed from: i, reason: collision with root package name */
    public int f4332i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f4333j;

    /* renamed from: k, reason: collision with root package name */
    public int f4334k;
    public o l;
    public b m;

    /* renamed from: n, reason: collision with root package name */
    public int f4335n;

    /* renamed from: o, reason: collision with root package name */
    public HashMap f4336o;

    /* renamed from: p, reason: collision with root package name */
    public final SparseArray f4337p;

    /* renamed from: q, reason: collision with root package name */
    public final f f4338q;

    /* renamed from: r, reason: collision with root package name */
    public int f4339r;

    /* renamed from: s, reason: collision with root package name */
    public int f4340s;

    public ConstraintLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = new SparseArray();
        this.f4327c = new ArrayList(4);
        this.f4328d = new e();
        this.f4329f = 0;
        this.f4330g = 0;
        this.f4331h = Integer.MAX_VALUE;
        this.f4332i = Integer.MAX_VALUE;
        this.f4333j = true;
        this.f4334k = 257;
        this.l = null;
        this.m = null;
        this.f4335n = -1;
        this.f4336o = new HashMap();
        this.f4337p = new SparseArray();
        this.f4338q = new f(this, this);
        this.f4339r = 0;
        this.f4340s = 0;
        i(attributeSet, 0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.ViewGroup$MarginLayoutParams, E.e] */
    public static E.e g() {
        ?? marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        marginLayoutParams.f798a = -1;
        marginLayoutParams.b = -1;
        marginLayoutParams.f801c = -1.0f;
        marginLayoutParams.f803d = true;
        marginLayoutParams.f805e = -1;
        marginLayoutParams.f807f = -1;
        marginLayoutParams.f808g = -1;
        marginLayoutParams.f810h = -1;
        marginLayoutParams.f812i = -1;
        marginLayoutParams.f814j = -1;
        marginLayoutParams.f816k = -1;
        marginLayoutParams.l = -1;
        marginLayoutParams.m = -1;
        marginLayoutParams.f820n = -1;
        marginLayoutParams.f822o = -1;
        marginLayoutParams.f824p = -1;
        marginLayoutParams.f826q = 0;
        marginLayoutParams.f827r = 0.0f;
        marginLayoutParams.f828s = -1;
        marginLayoutParams.f829t = -1;
        marginLayoutParams.f830u = -1;
        marginLayoutParams.f831v = -1;
        marginLayoutParams.f832w = Integer.MIN_VALUE;
        marginLayoutParams.f833x = Integer.MIN_VALUE;
        marginLayoutParams.f834y = Integer.MIN_VALUE;
        marginLayoutParams.f835z = Integer.MIN_VALUE;
        marginLayoutParams.f773A = Integer.MIN_VALUE;
        marginLayoutParams.f774B = Integer.MIN_VALUE;
        marginLayoutParams.f775C = Integer.MIN_VALUE;
        marginLayoutParams.f776D = 0;
        marginLayoutParams.f777E = 0.5f;
        marginLayoutParams.f778F = 0.5f;
        marginLayoutParams.f779G = null;
        marginLayoutParams.f780H = -1.0f;
        marginLayoutParams.f781I = -1.0f;
        marginLayoutParams.f782J = 0;
        marginLayoutParams.f783K = 0;
        marginLayoutParams.f784L = 0;
        marginLayoutParams.f785M = 0;
        marginLayoutParams.f786N = 0;
        marginLayoutParams.O = 0;
        marginLayoutParams.f787P = 0;
        marginLayoutParams.f788Q = 0;
        marginLayoutParams.f789R = 1.0f;
        marginLayoutParams.f790S = 1.0f;
        marginLayoutParams.f791T = -1;
        marginLayoutParams.f792U = -1;
        marginLayoutParams.f793V = -1;
        marginLayoutParams.f794W = false;
        marginLayoutParams.f795X = false;
        marginLayoutParams.f796Y = null;
        marginLayoutParams.f797Z = 0;
        marginLayoutParams.f799a0 = true;
        marginLayoutParams.f800b0 = true;
        marginLayoutParams.f802c0 = false;
        marginLayoutParams.f804d0 = false;
        marginLayoutParams.f806e0 = false;
        marginLayoutParams.f0 = -1;
        marginLayoutParams.f809g0 = -1;
        marginLayoutParams.f811h0 = -1;
        marginLayoutParams.f813i0 = -1;
        marginLayoutParams.f815j0 = Integer.MIN_VALUE;
        marginLayoutParams.f817k0 = Integer.MIN_VALUE;
        marginLayoutParams.f818l0 = 0.5f;
        marginLayoutParams.f825p0 = new d();
        return marginLayoutParams;
    }

    private int getPaddingWidth() {
        int max = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int max2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        if (max2 > 0) {
            return max2;
        }
        return max;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, E.s] */
    public static s getSharedValues() {
        if (f4326t == null) {
            ?? obj = new Object();
            new SparseIntArray();
            new HashMap();
            f4326t = obj;
        }
        return f4326t;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof E.e;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList arrayList = this.f4327c;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i9 = 0; i9 < size; i9++) {
                ((c) arrayList.get(i9)).getClass();
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = getWidth();
            float height = getHeight();
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = getChildAt(i10);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] split = ((String) tag).split(",");
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int i11 = (int) ((parseInt / 1080.0f) * width);
                        int i12 = (int) ((parseInt2 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f9 = i11;
                        float f10 = i12;
                        float f11 = i11 + ((int) ((parseInt3 / 1080.0f) * width));
                        canvas.drawLine(f9, f10, f11, f10, paint);
                        float parseInt4 = i12 + ((int) ((Integer.parseInt(split[3]) / 1920.0f) * height));
                        canvas.drawLine(f11, f10, f11, parseInt4, paint);
                        canvas.drawLine(f11, parseInt4, f9, parseInt4, paint);
                        canvas.drawLine(f9, parseInt4, f9, f10, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f9, f10, f11, parseInt4, paint);
                        canvas.drawLine(f9, parseInt4, f11, f10, paint);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public final void forceLayout() {
        this.f4333j = true;
        super.forceLayout();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return g();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.ViewGroup$LayoutParams, android.view.ViewGroup$MarginLayoutParams, java.lang.Object, E.e] */
    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        ?? marginLayoutParams = new ViewGroup.MarginLayoutParams(context, attributeSet);
        marginLayoutParams.f798a = -1;
        marginLayoutParams.b = -1;
        marginLayoutParams.f801c = -1.0f;
        marginLayoutParams.f803d = true;
        marginLayoutParams.f805e = -1;
        marginLayoutParams.f807f = -1;
        marginLayoutParams.f808g = -1;
        marginLayoutParams.f810h = -1;
        marginLayoutParams.f812i = -1;
        marginLayoutParams.f814j = -1;
        marginLayoutParams.f816k = -1;
        marginLayoutParams.l = -1;
        marginLayoutParams.m = -1;
        marginLayoutParams.f820n = -1;
        marginLayoutParams.f822o = -1;
        marginLayoutParams.f824p = -1;
        marginLayoutParams.f826q = 0;
        marginLayoutParams.f827r = 0.0f;
        marginLayoutParams.f828s = -1;
        marginLayoutParams.f829t = -1;
        marginLayoutParams.f830u = -1;
        marginLayoutParams.f831v = -1;
        marginLayoutParams.f832w = Integer.MIN_VALUE;
        marginLayoutParams.f833x = Integer.MIN_VALUE;
        marginLayoutParams.f834y = Integer.MIN_VALUE;
        marginLayoutParams.f835z = Integer.MIN_VALUE;
        marginLayoutParams.f773A = Integer.MIN_VALUE;
        marginLayoutParams.f774B = Integer.MIN_VALUE;
        marginLayoutParams.f775C = Integer.MIN_VALUE;
        marginLayoutParams.f776D = 0;
        marginLayoutParams.f777E = 0.5f;
        marginLayoutParams.f778F = 0.5f;
        marginLayoutParams.f779G = null;
        marginLayoutParams.f780H = -1.0f;
        marginLayoutParams.f781I = -1.0f;
        marginLayoutParams.f782J = 0;
        marginLayoutParams.f783K = 0;
        marginLayoutParams.f784L = 0;
        marginLayoutParams.f785M = 0;
        marginLayoutParams.f786N = 0;
        marginLayoutParams.O = 0;
        marginLayoutParams.f787P = 0;
        marginLayoutParams.f788Q = 0;
        marginLayoutParams.f789R = 1.0f;
        marginLayoutParams.f790S = 1.0f;
        marginLayoutParams.f791T = -1;
        marginLayoutParams.f792U = -1;
        marginLayoutParams.f793V = -1;
        marginLayoutParams.f794W = false;
        marginLayoutParams.f795X = false;
        marginLayoutParams.f796Y = null;
        marginLayoutParams.f797Z = 0;
        marginLayoutParams.f799a0 = true;
        marginLayoutParams.f800b0 = true;
        marginLayoutParams.f802c0 = false;
        marginLayoutParams.f804d0 = false;
        marginLayoutParams.f806e0 = false;
        marginLayoutParams.f0 = -1;
        marginLayoutParams.f809g0 = -1;
        marginLayoutParams.f811h0 = -1;
        marginLayoutParams.f813i0 = -1;
        marginLayoutParams.f815j0 = Integer.MIN_VALUE;
        marginLayoutParams.f817k0 = Integer.MIN_VALUE;
        marginLayoutParams.f818l0 = 0.5f;
        marginLayoutParams.f825p0 = new d();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.b);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i9 = 0; i9 < indexCount; i9++) {
            int index = obtainStyledAttributes.getIndex(i9);
            int i10 = E.d.f772a.get(index);
            switch (i10) {
                case 1:
                    marginLayoutParams.f793V = obtainStyledAttributes.getInt(index, marginLayoutParams.f793V);
                    break;
                case 2:
                    int resourceId = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f824p);
                    marginLayoutParams.f824p = resourceId;
                    if (resourceId == -1) {
                        marginLayoutParams.f824p = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    marginLayoutParams.f826q = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.f826q);
                    break;
                case 4:
                    float f9 = obtainStyledAttributes.getFloat(index, marginLayoutParams.f827r) % 360.0f;
                    marginLayoutParams.f827r = f9;
                    if (f9 < 0.0f) {
                        marginLayoutParams.f827r = (360.0f - f9) % 360.0f;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    marginLayoutParams.f798a = obtainStyledAttributes.getDimensionPixelOffset(index, marginLayoutParams.f798a);
                    break;
                case 6:
                    marginLayoutParams.b = obtainStyledAttributes.getDimensionPixelOffset(index, marginLayoutParams.b);
                    break;
                case 7:
                    marginLayoutParams.f801c = obtainStyledAttributes.getFloat(index, marginLayoutParams.f801c);
                    break;
                case 8:
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f805e);
                    marginLayoutParams.f805e = resourceId2;
                    if (resourceId2 == -1) {
                        marginLayoutParams.f805e = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    int resourceId3 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f807f);
                    marginLayoutParams.f807f = resourceId3;
                    if (resourceId3 == -1) {
                        marginLayoutParams.f807f = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 10:
                    int resourceId4 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f808g);
                    marginLayoutParams.f808g = resourceId4;
                    if (resourceId4 == -1) {
                        marginLayoutParams.f808g = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    int resourceId5 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f810h);
                    marginLayoutParams.f810h = resourceId5;
                    if (resourceId5 == -1) {
                        marginLayoutParams.f810h = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    int resourceId6 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f812i);
                    marginLayoutParams.f812i = resourceId6;
                    if (resourceId6 == -1) {
                        marginLayoutParams.f812i = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    int resourceId7 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f814j);
                    marginLayoutParams.f814j = resourceId7;
                    if (resourceId7 == -1) {
                        marginLayoutParams.f814j = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    int resourceId8 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f816k);
                    marginLayoutParams.f816k = resourceId8;
                    if (resourceId8 == -1) {
                        marginLayoutParams.f816k = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    int resourceId9 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.l);
                    marginLayoutParams.l = resourceId9;
                    if (resourceId9 == -1) {
                        marginLayoutParams.l = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    int resourceId10 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.m);
                    marginLayoutParams.m = resourceId10;
                    if (resourceId10 == -1) {
                        marginLayoutParams.m = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    int resourceId11 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f828s);
                    marginLayoutParams.f828s = resourceId11;
                    if (resourceId11 == -1) {
                        marginLayoutParams.f828s = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 18:
                    int resourceId12 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f829t);
                    marginLayoutParams.f829t = resourceId12;
                    if (resourceId12 == -1) {
                        marginLayoutParams.f829t = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 19:
                    int resourceId13 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f830u);
                    marginLayoutParams.f830u = resourceId13;
                    if (resourceId13 == -1) {
                        marginLayoutParams.f830u = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 20:
                    int resourceId14 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f831v);
                    marginLayoutParams.f831v = resourceId14;
                    if (resourceId14 == -1) {
                        marginLayoutParams.f831v = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 21:
                    marginLayoutParams.f832w = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.f832w);
                    break;
                case 22:
                    marginLayoutParams.f833x = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.f833x);
                    break;
                case 23:
                    marginLayoutParams.f834y = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.f834y);
                    break;
                case 24:
                    marginLayoutParams.f835z = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.f835z);
                    break;
                case 25:
                    marginLayoutParams.f773A = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.f773A);
                    break;
                case 26:
                    marginLayoutParams.f774B = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.f774B);
                    break;
                case 27:
                    marginLayoutParams.f794W = obtainStyledAttributes.getBoolean(index, marginLayoutParams.f794W);
                    break;
                case 28:
                    marginLayoutParams.f795X = obtainStyledAttributes.getBoolean(index, marginLayoutParams.f795X);
                    break;
                case 29:
                    marginLayoutParams.f777E = obtainStyledAttributes.getFloat(index, marginLayoutParams.f777E);
                    break;
                case AD_PLAY_RESET_ON_DEINIT_VALUE:
                    marginLayoutParams.f778F = obtainStyledAttributes.getFloat(index, marginLayoutParams.f778F);
                    break;
                case 31:
                    int i11 = obtainStyledAttributes.getInt(index, 0);
                    marginLayoutParams.f784L = i11;
                    if (i11 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                        break;
                    } else {
                        break;
                    }
                case 32:
                    int i12 = obtainStyledAttributes.getInt(index, 0);
                    marginLayoutParams.f785M = i12;
                    if (i12 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                        break;
                    } else {
                        break;
                    }
                case 33:
                    try {
                        marginLayoutParams.f786N = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.f786N);
                        break;
                    } catch (Exception unused) {
                        if (obtainStyledAttributes.getInt(index, marginLayoutParams.f786N) == -2) {
                            marginLayoutParams.f786N = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 34:
                    try {
                        marginLayoutParams.f787P = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.f787P);
                        break;
                    } catch (Exception unused2) {
                        if (obtainStyledAttributes.getInt(index, marginLayoutParams.f787P) == -2) {
                            marginLayoutParams.f787P = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 35:
                    marginLayoutParams.f789R = Math.max(0.0f, obtainStyledAttributes.getFloat(index, marginLayoutParams.f789R));
                    marginLayoutParams.f784L = 2;
                    break;
                case 36:
                    try {
                        marginLayoutParams.O = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.O);
                        break;
                    } catch (Exception unused3) {
                        if (obtainStyledAttributes.getInt(index, marginLayoutParams.O) == -2) {
                            marginLayoutParams.O = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 37:
                    try {
                        marginLayoutParams.f788Q = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.f788Q);
                        break;
                    } catch (Exception unused4) {
                        if (obtainStyledAttributes.getInt(index, marginLayoutParams.f788Q) == -2) {
                            marginLayoutParams.f788Q = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case MotionEventCompat.AXIS_GENERIC_7 /* 38 */:
                    marginLayoutParams.f790S = Math.max(0.0f, obtainStyledAttributes.getFloat(index, marginLayoutParams.f790S));
                    marginLayoutParams.f785M = 2;
                    break;
                default:
                    switch (i10) {
                        case 44:
                            o.h(marginLayoutParams, obtainStyledAttributes.getString(index));
                            break;
                        case 45:
                            marginLayoutParams.f780H = obtainStyledAttributes.getFloat(index, marginLayoutParams.f780H);
                            break;
                        case MotionEventCompat.AXIS_GENERIC_15 /* 46 */:
                            marginLayoutParams.f781I = obtainStyledAttributes.getFloat(index, marginLayoutParams.f781I);
                            break;
                        case MotionEventCompat.AXIS_GENERIC_16 /* 47 */:
                            marginLayoutParams.f782J = obtainStyledAttributes.getInt(index, 0);
                            break;
                        case 48:
                            marginLayoutParams.f783K = obtainStyledAttributes.getInt(index, 0);
                            break;
                        case 49:
                            marginLayoutParams.f791T = obtainStyledAttributes.getDimensionPixelOffset(index, marginLayoutParams.f791T);
                            break;
                        case TTAdConstant.IMAGE_MODE_VIDEO_SQUARE /* 50 */:
                            marginLayoutParams.f792U = obtainStyledAttributes.getDimensionPixelOffset(index, marginLayoutParams.f792U);
                            break;
                        case 51:
                            marginLayoutParams.f796Y = obtainStyledAttributes.getString(index);
                            break;
                        case 52:
                            int resourceId15 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f820n);
                            marginLayoutParams.f820n = resourceId15;
                            if (resourceId15 == -1) {
                                marginLayoutParams.f820n = obtainStyledAttributes.getInt(index, -1);
                                break;
                            } else {
                                break;
                            }
                        case 53:
                            int resourceId16 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f822o);
                            marginLayoutParams.f822o = resourceId16;
                            if (resourceId16 == -1) {
                                marginLayoutParams.f822o = obtainStyledAttributes.getInt(index, -1);
                                break;
                            } else {
                                break;
                            }
                        case 54:
                            marginLayoutParams.f776D = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.f776D);
                            break;
                        case 55:
                            marginLayoutParams.f775C = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.f775C);
                            break;
                        default:
                            switch (i10) {
                                case 64:
                                    o.g(marginLayoutParams, obtainStyledAttributes, index, 0);
                                    break;
                                case 65:
                                    o.g(marginLayoutParams, obtainStyledAttributes, index, 1);
                                    break;
                                case 66:
                                    marginLayoutParams.f797Z = obtainStyledAttributes.getInt(index, marginLayoutParams.f797Z);
                                    break;
                                case 67:
                                    marginLayoutParams.f803d = obtainStyledAttributes.getBoolean(index, marginLayoutParams.f803d);
                                    break;
                            }
                    }
            }
        }
        obtainStyledAttributes.recycle();
        marginLayoutParams.a();
        return marginLayoutParams;
    }

    public int getMaxHeight() {
        return this.f4332i;
    }

    public int getMaxWidth() {
        return this.f4331h;
    }

    public int getMinHeight() {
        return this.f4330g;
    }

    public int getMinWidth() {
        return this.f4329f;
    }

    public int getOptimizationLevel() {
        return this.f4328d.f177D0;
    }

    public String getSceneString() {
        int id;
        StringBuilder sb = new StringBuilder();
        e eVar = this.f4328d;
        if (eVar.f152j == null) {
            int id2 = getId();
            if (id2 != -1) {
                eVar.f152j = getContext().getResources().getResourceEntryName(id2);
            } else {
                eVar.f152j = "parent";
            }
        }
        if (eVar.f149h0 == null) {
            eVar.f149h0 = eVar.f152j;
            Log.v("ConstraintLayout", " setDebugName " + eVar.f149h0);
        }
        Iterator it = eVar.f185q0.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            View view = (View) dVar.f0;
            if (view != null) {
                if (dVar.f152j == null && (id = view.getId()) != -1) {
                    dVar.f152j = getContext().getResources().getResourceEntryName(id);
                }
                if (dVar.f149h0 == null) {
                    dVar.f149h0 = dVar.f152j;
                    Log.v("ConstraintLayout", " setDebugName " + dVar.f149h0);
                }
            }
        }
        eVar.n(sb);
        return sb.toString();
    }

    public final d h(View view) {
        if (view == this) {
            return this.f4328d;
        }
        if (view != null) {
            if (view.getLayoutParams() instanceof E.e) {
                return ((E.e) view.getLayoutParams()).f825p0;
            }
            view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
            if (view.getLayoutParams() instanceof E.e) {
                return ((E.e) view.getLayoutParams()).f825p0;
            }
            return null;
        }
        return null;
    }

    public final void i(AttributeSet attributeSet, int i9) {
        e eVar = this.f4328d;
        eVar.f0 = this;
        f fVar = this.f4338q;
        eVar.f189u0 = fVar;
        eVar.f187s0.f355f = fVar;
        this.b.put(getId(), this);
        this.l = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, r.b, i9, 0);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == 16) {
                    this.f4329f = obtainStyledAttributes.getDimensionPixelOffset(index, this.f4329f);
                } else if (index == 17) {
                    this.f4330g = obtainStyledAttributes.getDimensionPixelOffset(index, this.f4330g);
                } else if (index == 14) {
                    this.f4331h = obtainStyledAttributes.getDimensionPixelOffset(index, this.f4331h);
                } else if (index == 15) {
                    this.f4332i = obtainStyledAttributes.getDimensionPixelOffset(index, this.f4332i);
                } else if (index == 113) {
                    this.f4334k = obtainStyledAttributes.getInt(index, this.f4334k);
                } else if (index == 56) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            j(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.m = null;
                        }
                    }
                } else if (index == 34) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        o oVar = new o();
                        this.l = oVar;
                        oVar.e(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.l = null;
                    }
                    this.f4335n = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        eVar.f177D0 = this.f4334k;
        C2963c.f24464p = eVar.W(512);
    }

    public final void j(int i9) {
        int eventType;
        g gVar;
        Context context = getContext();
        b bVar = new b(2, false);
        bVar.f4077c = new SparseArray();
        bVar.f4078d = new SparseArray();
        XmlResourceParser xml = context.getResources().getXml(i9);
        try {
            eventType = xml.getEventType();
            gVar = null;
        } catch (IOException e4) {
            e4.printStackTrace();
        } catch (XmlPullParserException e9) {
            e9.printStackTrace();
        }
        while (true) {
            char c9 = 1;
            if (eventType != 1) {
                if (eventType != 0) {
                    if (eventType == 2) {
                        String name = xml.getName();
                        switch (name.hashCode()) {
                            case -1349929691:
                                if (name.equals("ConstraintSet")) {
                                    c9 = 4;
                                    break;
                                }
                                break;
                            case 80204913:
                                if (name.equals("State")) {
                                    c9 = 2;
                                    break;
                                }
                                break;
                            case 1382829617:
                                if (name.equals("StateSet")) {
                                    break;
                                }
                                break;
                            case 1657696882:
                                if (name.equals("layoutDescription")) {
                                    c9 = 0;
                                    break;
                                }
                                break;
                            case 1901439077:
                                if (name.equals("Variant")) {
                                    c9 = 3;
                                    break;
                                }
                                break;
                        }
                        c9 = 65535;
                        if (c9 != 2) {
                            if (c9 != 3) {
                                if (c9 == 4) {
                                    bVar.z(context, xml);
                                }
                            } else {
                                h hVar = new h(context, xml);
                                if (gVar != null) {
                                    ((ArrayList) gVar.f845f).add(hVar);
                                }
                            }
                        } else {
                            gVar = new g(context, xml);
                            ((SparseArray) bVar.f4077c).put(gVar.f843c, gVar);
                        }
                    }
                } else {
                    xml.getName();
                }
                eventType = xml.next();
            } else {
                this.m = bVar;
                return;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x04d1  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x04d5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x032b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k(B.e r26, int r27, int r28, int r29) {
        /*
            Method dump skipped, instructions count: 1741
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.k(B.e, int, int, int):void");
    }

    public final void l(d dVar, E.e eVar, SparseArray sparseArray, int i9, int i10) {
        View view = (View) this.b.get(i9);
        d dVar2 = (d) sparseArray.get(i9);
        if (dVar2 != null && view != null && (view.getLayoutParams() instanceof E.e)) {
            eVar.f802c0 = true;
            if (i10 == 6) {
                E.e eVar2 = (E.e) view.getLayoutParams();
                eVar2.f802c0 = true;
                eVar2.f825p0.f115E = true;
            }
            dVar.i(6).b(dVar2.i(i10), eVar.f776D, eVar.f775C, true);
            dVar.f115E = true;
            dVar.i(3).j();
            dVar.i(5).j();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z8, int i9, int i10, int i11, int i12) {
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            E.e eVar = (E.e) childAt.getLayoutParams();
            d dVar = eVar.f825p0;
            if (childAt.getVisibility() != 8 || eVar.f804d0 || eVar.f806e0 || isInEditMode) {
                int r9 = dVar.r();
                int s5 = dVar.s();
                childAt.layout(r9, s5, dVar.q() + r9, dVar.k() + s5);
            }
        }
        ArrayList arrayList = this.f4327c;
        int size = arrayList.size();
        if (size > 0) {
            for (int i14 = 0; i14 < size; i14++) {
                ((c) arrayList.get(i14)).j();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:276:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0312  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r24, int r25) {
        /*
            Method dump skipped, instructions count: 1508
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        d h6 = h(view);
        if ((view instanceof Guideline) && !(h6 instanceof B.h)) {
            E.e eVar = (E.e) view.getLayoutParams();
            B.h hVar = new B.h();
            eVar.f825p0 = hVar;
            eVar.f804d0 = true;
            hVar.S(eVar.f793V);
        }
        if (view instanceof c) {
            c cVar = (c) view;
            cVar.k();
            ((E.e) view.getLayoutParams()).f806e0 = true;
            ArrayList arrayList = this.f4327c;
            if (!arrayList.contains(cVar)) {
                arrayList.add(cVar);
            }
        }
        this.b.put(view.getId(), view);
        this.f4333j = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.b.remove(view.getId());
        d h6 = h(view);
        this.f4328d.f185q0.remove(h6);
        h6.C();
        this.f4327c.remove(view);
        this.f4333j = true;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.f4333j = true;
        super.requestLayout();
    }

    public void setConstraintSet(o oVar) {
        this.l = oVar;
    }

    @Override // android.view.View
    public void setId(int i9) {
        int id = getId();
        SparseArray sparseArray = this.b;
        sparseArray.remove(id);
        super.setId(i9);
        sparseArray.put(getId(), this);
    }

    public void setMaxHeight(int i9) {
        if (i9 == this.f4332i) {
            return;
        }
        this.f4332i = i9;
        requestLayout();
    }

    public void setMaxWidth(int i9) {
        if (i9 == this.f4331h) {
            return;
        }
        this.f4331h = i9;
        requestLayout();
    }

    public void setMinHeight(int i9) {
        if (i9 == this.f4330g) {
            return;
        }
        this.f4330g = i9;
        requestLayout();
    }

    public void setMinWidth(int i9) {
        if (i9 == this.f4329f) {
            return;
        }
        this.f4329f = i9;
        requestLayout();
    }

    public void setOnConstraintsChanged(p pVar) {
        b bVar = this.m;
        if (bVar != null) {
            bVar.getClass();
        }
    }

    public void setOptimizationLevel(int i9) {
        this.f4334k = i9;
        e eVar = this.f4328d;
        eVar.f177D0 = i9;
        C2963c.f24464p = eVar.W(512);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i9) {
        super(context, attributeSet, i9);
        this.b = new SparseArray();
        this.f4327c = new ArrayList(4);
        this.f4328d = new e();
        this.f4329f = 0;
        this.f4330g = 0;
        this.f4331h = Integer.MAX_VALUE;
        this.f4332i = Integer.MAX_VALUE;
        this.f4333j = true;
        this.f4334k = 257;
        this.l = null;
        this.m = null;
        this.f4335n = -1;
        this.f4336o = new HashMap();
        this.f4337p = new SparseArray();
        this.f4338q = new f(this, this);
        this.f4339r = 0;
        this.f4340s = 0;
        i(attributeSet, i9);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.ViewGroup$LayoutParams, android.view.ViewGroup$MarginLayoutParams, E.e] */
    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        ?? marginLayoutParams = new ViewGroup.MarginLayoutParams(layoutParams);
        marginLayoutParams.f798a = -1;
        marginLayoutParams.b = -1;
        marginLayoutParams.f801c = -1.0f;
        marginLayoutParams.f803d = true;
        marginLayoutParams.f805e = -1;
        marginLayoutParams.f807f = -1;
        marginLayoutParams.f808g = -1;
        marginLayoutParams.f810h = -1;
        marginLayoutParams.f812i = -1;
        marginLayoutParams.f814j = -1;
        marginLayoutParams.f816k = -1;
        marginLayoutParams.l = -1;
        marginLayoutParams.m = -1;
        marginLayoutParams.f820n = -1;
        marginLayoutParams.f822o = -1;
        marginLayoutParams.f824p = -1;
        marginLayoutParams.f826q = 0;
        marginLayoutParams.f827r = 0.0f;
        marginLayoutParams.f828s = -1;
        marginLayoutParams.f829t = -1;
        marginLayoutParams.f830u = -1;
        marginLayoutParams.f831v = -1;
        marginLayoutParams.f832w = Integer.MIN_VALUE;
        marginLayoutParams.f833x = Integer.MIN_VALUE;
        marginLayoutParams.f834y = Integer.MIN_VALUE;
        marginLayoutParams.f835z = Integer.MIN_VALUE;
        marginLayoutParams.f773A = Integer.MIN_VALUE;
        marginLayoutParams.f774B = Integer.MIN_VALUE;
        marginLayoutParams.f775C = Integer.MIN_VALUE;
        marginLayoutParams.f776D = 0;
        marginLayoutParams.f777E = 0.5f;
        marginLayoutParams.f778F = 0.5f;
        marginLayoutParams.f779G = null;
        marginLayoutParams.f780H = -1.0f;
        marginLayoutParams.f781I = -1.0f;
        marginLayoutParams.f782J = 0;
        marginLayoutParams.f783K = 0;
        marginLayoutParams.f784L = 0;
        marginLayoutParams.f785M = 0;
        marginLayoutParams.f786N = 0;
        marginLayoutParams.O = 0;
        marginLayoutParams.f787P = 0;
        marginLayoutParams.f788Q = 0;
        marginLayoutParams.f789R = 1.0f;
        marginLayoutParams.f790S = 1.0f;
        marginLayoutParams.f791T = -1;
        marginLayoutParams.f792U = -1;
        marginLayoutParams.f793V = -1;
        marginLayoutParams.f794W = false;
        marginLayoutParams.f795X = false;
        marginLayoutParams.f796Y = null;
        marginLayoutParams.f797Z = 0;
        marginLayoutParams.f799a0 = true;
        marginLayoutParams.f800b0 = true;
        marginLayoutParams.f802c0 = false;
        marginLayoutParams.f804d0 = false;
        marginLayoutParams.f806e0 = false;
        marginLayoutParams.f0 = -1;
        marginLayoutParams.f809g0 = -1;
        marginLayoutParams.f811h0 = -1;
        marginLayoutParams.f813i0 = -1;
        marginLayoutParams.f815j0 = Integer.MIN_VALUE;
        marginLayoutParams.f817k0 = Integer.MIN_VALUE;
        marginLayoutParams.f818l0 = 0.5f;
        marginLayoutParams.f825p0 = new d();
        return marginLayoutParams;
    }
}
