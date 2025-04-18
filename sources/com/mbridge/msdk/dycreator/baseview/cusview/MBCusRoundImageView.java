package com.mbridge.msdk.dycreator.baseview.cusview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Xfermode;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.mbridge.msdk.dycreator.a.b;
import com.mbridge.msdk.dycreator.a.c;
import com.mbridge.msdk.dycreator.baseview.GradientOrientationUtils;
import com.mbridge.msdk.foundation.tools.ad;
import java.util.HashMap;

/* loaded from: classes4.dex */
public class MBCusRoundImageView extends ImageView {
    private int a;

    /* renamed from: b, reason: collision with root package name */
    private int f12735b;

    /* renamed from: c, reason: collision with root package name */
    private int f12736c;

    /* renamed from: d, reason: collision with root package name */
    private int f12737d;

    /* renamed from: e, reason: collision with root package name */
    private Xfermode f12738e;

    /* renamed from: f, reason: collision with root package name */
    private int f12739f;

    /* renamed from: g, reason: collision with root package name */
    private int f12740g;

    /* renamed from: h, reason: collision with root package name */
    private int f12741h;

    /* renamed from: i, reason: collision with root package name */
    private int f12742i;

    /* renamed from: j, reason: collision with root package name */
    private int f12743j;

    /* renamed from: k, reason: collision with root package name */
    private int f12744k;

    /* renamed from: l, reason: collision with root package name */
    private int f12745l;

    /* renamed from: m, reason: collision with root package name */
    private int f12746m;

    /* renamed from: n, reason: collision with root package name */
    private int f12747n;

    /* renamed from: o, reason: collision with root package name */
    private float[] f12748o;

    /* renamed from: p, reason: collision with root package name */
    private float[] f12749p;

    /* renamed from: q, reason: collision with root package name */
    private RectF f12750q;

    /* renamed from: r, reason: collision with root package name */
    private RectF f12751r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f12752s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f12753t;
    private Path u;

    /* renamed from: v, reason: collision with root package name */
    private Paint f12754v;

    /* renamed from: com.mbridge.msdk.dycreator.baseview.cusview.MBCusRoundImageView$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[c.values().length];
            a = iArr;
            try {
                iArr[c.id.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[c.src.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[c.background.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[c.contentDescription.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[c.tag.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[c.visibility.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[c.scaleType.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[c.padding.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[c.paddingTop.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[c.paddingBottom.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[c.paddingLeft.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[c.paddingRight.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                a[c.layout_width.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                a[c.layout_height.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                a[c.gravity.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                a[c.layout_gravity.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
        }
    }

    public MBCusRoundImageView(Context context) {
        this(context, null);
    }

    public ViewGroup.LayoutParams generateLayoutParams(Context context, AttributeSet attributeSet) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        HashMap<String, c> c10 = b.a().c();
        int attributeCount = attributeSet.getAttributeCount();
        for (int i10 = 0; i10 < attributeCount; i10++) {
            c cVar = c10.get(attributeSet.getAttributeName(i10));
            if (cVar != null) {
                int i11 = AnonymousClass1.a[cVar.ordinal()];
                if (i11 != 6) {
                    if (i11 != 13) {
                        if (i11 == 14) {
                            String attributeValue = attributeSet.getAttributeValue(i10);
                            if (!attributeValue.startsWith("f") && !attributeValue.startsWith("m")) {
                                if (attributeValue.startsWith("wrap")) {
                                    layoutParams.height = -2;
                                } else {
                                    layoutParams.height = b.a().b(attributeValue);
                                }
                            } else {
                                layoutParams.height = -1;
                            }
                        }
                    } else {
                        String attributeValue2 = attributeSet.getAttributeValue(i10);
                        if (!attributeValue2.startsWith("f") && !attributeValue2.startsWith("m")) {
                            if (attributeValue2.startsWith("wrap")) {
                                layoutParams.width = -2;
                            } else {
                                layoutParams.width = b.a().b(attributeValue2);
                            }
                        } else {
                            layoutParams.width = -1;
                        }
                    }
                } else {
                    String attributeValue3 = attributeSet.getAttributeValue(i10);
                    if (!TextUtils.isEmpty(attributeValue3)) {
                        if (attributeValue3.equals("invisible")) {
                            setVisibility(4);
                        } else if (attributeValue3.equalsIgnoreCase("gone")) {
                            setVisibility(8);
                        }
                    }
                }
            }
        }
        return layoutParams;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        if (canvas == null) {
            return;
        }
        try {
            canvas.saveLayer(this.f12750q, null, 31);
            int i10 = this.f12739f;
            int i11 = this.f12746m;
            int i12 = this.f12740g;
            canvas.scale(((i10 - (i11 * 2)) * 1.0f) / i10, ((i12 - (i11 * 2)) * 1.0f) / i12, i10 / 2.0f, i12 / 2.0f);
            super.onDraw(canvas);
            Paint paint = this.f12754v;
            if (paint != null) {
                paint.reset();
                this.f12754v.setAntiAlias(true);
                this.f12754v.setStyle(Paint.Style.FILL);
                this.f12754v.setXfermode(this.f12738e);
            }
            Path path = this.u;
            if (path != null) {
                path.reset();
                this.u.addRoundRect(this.f12750q, this.f12749p, Path.Direction.CCW);
            }
            canvas.drawPath(this.u, this.f12754v);
            Paint paint2 = this.f12754v;
            if (paint2 != null) {
                paint2.setXfermode(null);
            }
            canvas.restore();
            if (this.f12752s) {
                int i13 = this.f12746m;
                int i14 = this.f12747n;
                RectF rectF = this.f12751r;
                float[] fArr = this.f12748o;
                try {
                    Path path2 = this.u;
                    if (path2 != null) {
                        path2.reset();
                    }
                    Paint paint3 = this.f12754v;
                    if (paint3 != null) {
                        paint3.setStrokeWidth(i13);
                        this.f12754v.setColor(i14);
                        this.f12754v.setStyle(Paint.Style.STROKE);
                    }
                    Path path3 = this.u;
                    if (path3 != null) {
                        path3.addRoundRect(rectF, fArr, Path.Direction.CCW);
                    }
                    canvas.drawPath(this.u, this.f12754v);
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        } catch (Exception e10) {
            ad.a("MBridgeImageView", e10.getMessage());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x009f A[Catch: Exception -> 0x00c3, TryCatch #2 {Exception -> 0x00c3, blocks: (B:3:0x0003, B:19:0x009b, B:21:0x009f, B:22:0x00b4, B:24:0x00b8, B:6:0x0078, B:8:0x007c, B:18:0x0098, B:53:0x0074, B:11:0x0080, B:13:0x0085, B:30:0x000e, B:32:0x0012, B:36:0x0019, B:40:0x0030, B:44:0x0047, B:48:0x005f), top: B:2:0x0003, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b8 A[Catch: Exception -> 0x00c3, TRY_LEAVE, TryCatch #2 {Exception -> 0x00c3, blocks: (B:3:0x0003, B:19:0x009b, B:21:0x009f, B:22:0x00b4, B:24:0x00b8, B:6:0x0078, B:8:0x007c, B:18:0x0098, B:53:0x0074, B:11:0x0080, B:13:0x0085, B:30:0x000e, B:32:0x0012, B:36:0x0019, B:40:0x0030, B:44:0x0047, B:48:0x005f), top: B:2:0x0003, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onSizeChanged(int r4, int r5, int r6, int r7) {
        /*
            Method dump skipped, instructions count: 206
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.dycreator.baseview.cusview.MBCusRoundImageView.onSizeChanged(int, int, int, int):void");
    }

    public void setAttributeSet(AttributeSet attributeSet) {
        String[] strArr;
        HashMap<String, c> c10 = b.a().c();
        int attributeCount = attributeSet.getAttributeCount();
        for (int i10 = 0; i10 < attributeCount; i10++) {
            c cVar = c10.get(attributeSet.getAttributeName(i10));
            if (cVar != null) {
                switch (AnonymousClass1.a[cVar.ordinal()]) {
                    case 1:
                        String attributeValue = attributeSet.getAttributeValue(i10);
                        if (attributeValue.startsWith("@+id/")) {
                            setId(attributeValue.substring(5).hashCode());
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        b.a().a(attributeSet.getAttributeValue(i10), this);
                        break;
                    case 3:
                        String attributeValue2 = attributeSet.getAttributeValue(i10);
                        if (attributeValue2.startsWith("#")) {
                            try {
                                strArr = attributeValue2.split("-");
                            } catch (Exception unused) {
                                strArr = null;
                            }
                            if (strArr != null && strArr.length <= 2) {
                                setBackgroundColor(b.a().a(attributeSet.getAttributeValue(i10)));
                                break;
                            } else {
                                if (strArr != null && strArr.length == 3) {
                                    try {
                                        GradientDrawable gradientDrawable = new GradientDrawable(GradientOrientationUtils.getOrientation(strArr[2]), new int[]{Color.parseColor(strArr[0]), Color.parseColor(strArr[1])});
                                        gradientDrawable.setGradientType(0);
                                        setBackground(gradientDrawable);
                                        break;
                                    } catch (Exception unused2) {
                                    }
                                }
                                setBackgroundColor(b.a().a(attributeSet.getAttributeValue(i10)));
                                break;
                            }
                        } else {
                            if (attributeValue2.startsWith("@drawable/")) {
                                attributeValue2 = attributeValue2.substring(10);
                            }
                            setBackgroundResource(getResources().getIdentifier(attributeValue2, "drawable", getContext().getPackageName()));
                            break;
                        }
                        break;
                    case 4:
                        String attributeValue3 = attributeSet.getAttributeValue(i10);
                        if (TextUtils.isEmpty(attributeValue3)) {
                            break;
                        } else {
                            CharSequence charSequence = (String) com.mbridge.msdk.dycreator.e.b.a.get(attributeValue3.substring(8));
                            if (TextUtils.isEmpty(charSequence)) {
                                break;
                            } else {
                                setContentDescription(charSequence);
                                break;
                            }
                        }
                    case 5:
                        String attributeValue4 = attributeSet.getAttributeValue(i10);
                        if (TextUtils.isEmpty(attributeValue4)) {
                            break;
                        } else {
                            String str = com.mbridge.msdk.dycreator.e.b.a.get(attributeValue4.substring(8));
                            if (TextUtils.isEmpty(str)) {
                                break;
                            } else {
                                setTag(str);
                                break;
                            }
                        }
                    case 6:
                        String attributeValue5 = attributeSet.getAttributeValue(i10);
                        if (TextUtils.isEmpty(attributeValue5)) {
                            break;
                        } else if (attributeValue5.equals("invisible")) {
                            setVisibility(4);
                            break;
                        } else if (attributeValue5.equalsIgnoreCase("gone")) {
                            setVisibility(8);
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        String attributeValue6 = attributeSet.getAttributeValue(i10);
                        if (TextUtils.isEmpty(attributeValue6)) {
                            break;
                        } else if (attributeValue6.equals("fitXY")) {
                            setScaleType(ImageView.ScaleType.FIT_XY);
                            break;
                        } else if (attributeValue6.equals("centerInside")) {
                            setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                            break;
                        } else if (attributeValue6.equals("centerCrop")) {
                            setScaleType(ImageView.ScaleType.CENTER_CROP);
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        int b3 = b.a().b(attributeSet.getAttributeValue(i10));
                        this.f12737d = b3;
                        this.f12736c = b3;
                        this.f12735b = b3;
                        this.a = b3;
                        setPadding(b3, b3, b3, b3);
                        break;
                    case 9:
                        int b10 = b.a().b(attributeSet.getAttributeValue(i10));
                        this.f12735b = b10;
                        setPadding(this.a, b10, this.f12736c, this.f12737d);
                        break;
                    case 10:
                        int b11 = b.a().b(attributeSet.getAttributeValue(i10));
                        this.f12737d = b11;
                        setPadding(this.a, this.f12735b, this.f12736c, b11);
                        break;
                    case 11:
                        int b12 = b.a().b(attributeSet.getAttributeValue(i10));
                        this.a = b12;
                        setPadding(b12, this.f12735b, this.f12736c, this.f12737d);
                        break;
                    case 12:
                        int b13 = b.a().b(attributeSet.getAttributeValue(i10));
                        this.f12736c = b13;
                        setPadding(this.a, this.f12735b, b13, this.f12737d);
                        break;
                }
            }
        }
    }

    public void setBorder(int i10, int i11, int i12) {
        this.f12752s = true;
        this.f12746m = i11;
        this.f12747n = i12;
        this.f12741h = i10;
    }

    public void setCornerRadius(int i10) {
        this.f12741h = i10;
    }

    public void setCustomBorder(int i10, int i11, int i12, int i13, int i14, int i15) {
        this.f12752s = true;
        this.f12753t = true;
        this.f12746m = i14;
        this.f12747n = i15;
        this.f12742i = i10;
        this.f12744k = i12;
        this.f12743j = i11;
        this.f12745l = i13;
    }

    public MBCusRoundImageView(Context context, AttributeSet attributeSet) {
        this(context, null, 0);
        try {
            setAttributeSet(attributeSet);
            setLayoutParams(generateLayoutParams(context, attributeSet));
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public MBCusRoundImageView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.u = new Path();
        this.f12754v = new Paint();
        this.f12748o = new float[8];
        this.f12749p = new float[8];
        this.f12751r = new RectF();
        this.f12750q = new RectF();
        this.f12738e = new PorterDuffXfermode(PorterDuff.Mode.DST_IN);
    }
}
