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

/* loaded from: classes3.dex */
public class MBCusRoundImageView extends ImageView {

    /* renamed from: a, reason: collision with root package name */
    private int f15060a;
    private int b;

    /* renamed from: c, reason: collision with root package name */
    private int f15061c;

    /* renamed from: d, reason: collision with root package name */
    private int f15062d;

    /* renamed from: e, reason: collision with root package name */
    private Xfermode f15063e;

    /* renamed from: f, reason: collision with root package name */
    private int f15064f;

    /* renamed from: g, reason: collision with root package name */
    private int f15065g;

    /* renamed from: h, reason: collision with root package name */
    private int f15066h;

    /* renamed from: i, reason: collision with root package name */
    private int f15067i;

    /* renamed from: j, reason: collision with root package name */
    private int f15068j;

    /* renamed from: k, reason: collision with root package name */
    private int f15069k;
    private int l;
    private int m;

    /* renamed from: n, reason: collision with root package name */
    private int f15070n;

    /* renamed from: o, reason: collision with root package name */
    private float[] f15071o;

    /* renamed from: p, reason: collision with root package name */
    private float[] f15072p;

    /* renamed from: q, reason: collision with root package name */
    private RectF f15073q;

    /* renamed from: r, reason: collision with root package name */
    private RectF f15074r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f15075s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f15076t;

    /* renamed from: u, reason: collision with root package name */
    private Path f15077u;

    /* renamed from: v, reason: collision with root package name */
    private Paint f15078v;

    /* renamed from: com.mbridge.msdk.dycreator.baseview.cusview.MBCusRoundImageView$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f15079a;

        static {
            int[] iArr = new int[c.values().length];
            f15079a = iArr;
            try {
                iArr[c.id.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15079a[c.src.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15079a[c.background.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15079a[c.contentDescription.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15079a[c.tag.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15079a[c.visibility.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15079a[c.scaleType.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f15079a[c.padding.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f15079a[c.paddingTop.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f15079a[c.paddingBottom.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f15079a[c.paddingLeft.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f15079a[c.paddingRight.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f15079a[c.layout_width.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f15079a[c.layout_height.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f15079a[c.gravity.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f15079a[c.layout_gravity.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
        }
    }

    public MBCusRoundImageView(Context context) {
        this(context, null);
    }

    public ViewGroup.LayoutParams generateLayoutParams(Context context, AttributeSet attributeSet) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        HashMap<String, c> c9 = b.a().c();
        int attributeCount = attributeSet.getAttributeCount();
        for (int i9 = 0; i9 < attributeCount; i9++) {
            c cVar = c9.get(attributeSet.getAttributeName(i9));
            if (cVar != null) {
                int i10 = AnonymousClass1.f15079a[cVar.ordinal()];
                if (i10 != 6) {
                    if (i10 != 13) {
                        if (i10 == 14) {
                            String attributeValue = attributeSet.getAttributeValue(i9);
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
                        String attributeValue2 = attributeSet.getAttributeValue(i9);
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
                    String attributeValue3 = attributeSet.getAttributeValue(i9);
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
            canvas.saveLayer(this.f15073q, null, 31);
            int i9 = this.f15064f;
            int i10 = this.m;
            int i11 = this.f15065g;
            canvas.scale(((i9 - (i10 * 2)) * 1.0f) / i9, ((i11 - (i10 * 2)) * 1.0f) / i11, i9 / 2.0f, i11 / 2.0f);
            super.onDraw(canvas);
            Paint paint = this.f15078v;
            if (paint != null) {
                paint.reset();
                this.f15078v.setAntiAlias(true);
                this.f15078v.setStyle(Paint.Style.FILL);
                this.f15078v.setXfermode(this.f15063e);
            }
            Path path = this.f15077u;
            if (path != null) {
                path.reset();
                this.f15077u.addRoundRect(this.f15073q, this.f15072p, Path.Direction.CCW);
            }
            canvas.drawPath(this.f15077u, this.f15078v);
            Paint paint2 = this.f15078v;
            if (paint2 != null) {
                paint2.setXfermode(null);
            }
            canvas.restore();
            if (this.f15075s) {
                int i12 = this.m;
                int i13 = this.f15070n;
                RectF rectF = this.f15074r;
                float[] fArr = this.f15071o;
                try {
                    Path path2 = this.f15077u;
                    if (path2 != null) {
                        path2.reset();
                    }
                    Paint paint3 = this.f15078v;
                    if (paint3 != null) {
                        paint3.setStrokeWidth(i12);
                        this.f15078v.setColor(i13);
                        this.f15078v.setStyle(Paint.Style.STROKE);
                    }
                    Path path3 = this.f15077u;
                    if (path3 != null) {
                        path3.addRoundRect(rectF, fArr, Path.Direction.CCW);
                    }
                    canvas.drawPath(this.f15077u, this.f15078v);
                } catch (Exception e4) {
                    e4.printStackTrace();
                }
            }
        } catch (Exception e9) {
            ad.a("MBridgeImageView", e9.getMessage());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00a2 A[Catch: Exception -> 0x0079, TryCatch #2 {Exception -> 0x0079, blocks: (B:3:0x0003, B:19:0x009e, B:21:0x00a2, B:22:0x00b7, B:24:0x00bb, B:6:0x007b, B:8:0x007f, B:18:0x009b, B:54:0x0075, B:30:0x000e, B:32:0x0012, B:36:0x0019, B:40:0x0032, B:44:0x0049, B:48:0x0061, B:11:0x0083, B:13:0x0088), top: B:2:0x0003, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00bb A[Catch: Exception -> 0x0079, TRY_LEAVE, TryCatch #2 {Exception -> 0x0079, blocks: (B:3:0x0003, B:19:0x009e, B:21:0x00a2, B:22:0x00b7, B:24:0x00bb, B:6:0x007b, B:8:0x007f, B:18:0x009b, B:54:0x0075, B:30:0x000e, B:32:0x0012, B:36:0x0019, B:40:0x0032, B:44:0x0049, B:48:0x0061, B:11:0x0083, B:13:0x0088), top: B:2:0x0003, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onSizeChanged(int r4, int r5, int r6, int r7) {
        /*
            Method dump skipped, instructions count: 208
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.dycreator.baseview.cusview.MBCusRoundImageView.onSizeChanged(int, int, int, int):void");
    }

    public void setAttributeSet(AttributeSet attributeSet) {
        String[] strArr;
        HashMap<String, c> c9 = b.a().c();
        int attributeCount = attributeSet.getAttributeCount();
        for (int i9 = 0; i9 < attributeCount; i9++) {
            c cVar = c9.get(attributeSet.getAttributeName(i9));
            if (cVar != null) {
                switch (AnonymousClass1.f15079a[cVar.ordinal()]) {
                    case 1:
                        String attributeValue = attributeSet.getAttributeValue(i9);
                        if (attributeValue.startsWith("@+id/")) {
                            setId(attributeValue.substring(5).hashCode());
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        b.a().a(attributeSet.getAttributeValue(i9), this);
                        break;
                    case 3:
                        String attributeValue2 = attributeSet.getAttributeValue(i9);
                        if (attributeValue2.startsWith("#")) {
                            try {
                                strArr = attributeValue2.split("-");
                            } catch (Exception unused) {
                                strArr = null;
                            }
                            if (strArr != null && strArr.length <= 2) {
                                setBackgroundColor(b.a().a(attributeSet.getAttributeValue(i9)));
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
                                setBackgroundColor(b.a().a(attributeSet.getAttributeValue(i9)));
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
                        String attributeValue3 = attributeSet.getAttributeValue(i9);
                        if (TextUtils.isEmpty(attributeValue3)) {
                            break;
                        } else {
                            CharSequence charSequence = (String) com.mbridge.msdk.dycreator.e.b.f15274a.get(attributeValue3.substring(8));
                            if (TextUtils.isEmpty(charSequence)) {
                                break;
                            } else {
                                setContentDescription(charSequence);
                                break;
                            }
                        }
                    case 5:
                        String attributeValue4 = attributeSet.getAttributeValue(i9);
                        if (TextUtils.isEmpty(attributeValue4)) {
                            break;
                        } else {
                            String str = com.mbridge.msdk.dycreator.e.b.f15274a.get(attributeValue4.substring(8));
                            if (TextUtils.isEmpty(str)) {
                                break;
                            } else {
                                setTag(str);
                                break;
                            }
                        }
                    case 6:
                        String attributeValue5 = attributeSet.getAttributeValue(i9);
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
                        String attributeValue6 = attributeSet.getAttributeValue(i9);
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
                        int b = b.a().b(attributeSet.getAttributeValue(i9));
                        this.f15062d = b;
                        this.f15061c = b;
                        this.b = b;
                        this.f15060a = b;
                        setPadding(b, b, b, b);
                        break;
                    case 9:
                        int b8 = b.a().b(attributeSet.getAttributeValue(i9));
                        this.b = b8;
                        setPadding(this.f15060a, b8, this.f15061c, this.f15062d);
                        break;
                    case 10:
                        int b9 = b.a().b(attributeSet.getAttributeValue(i9));
                        this.f15062d = b9;
                        setPadding(this.f15060a, this.b, this.f15061c, b9);
                        break;
                    case 11:
                        int b10 = b.a().b(attributeSet.getAttributeValue(i9));
                        this.f15060a = b10;
                        setPadding(b10, this.b, this.f15061c, this.f15062d);
                        break;
                    case 12:
                        int b11 = b.a().b(attributeSet.getAttributeValue(i9));
                        this.f15061c = b11;
                        setPadding(this.f15060a, this.b, b11, this.f15062d);
                        break;
                }
            }
        }
    }

    public void setBorder(int i9, int i10, int i11) {
        this.f15075s = true;
        this.m = i10;
        this.f15070n = i11;
        this.f15066h = i9;
    }

    public void setCornerRadius(int i9) {
        this.f15066h = i9;
    }

    public void setCustomBorder(int i9, int i10, int i11, int i12, int i13, int i14) {
        this.f15075s = true;
        this.f15076t = true;
        this.m = i13;
        this.f15070n = i14;
        this.f15067i = i9;
        this.f15069k = i11;
        this.f15068j = i10;
        this.l = i12;
    }

    public MBCusRoundImageView(Context context, AttributeSet attributeSet) {
        this(context, null, 0);
        try {
            setAttributeSet(attributeSet);
            setLayoutParams(generateLayoutParams(context, attributeSet));
        } catch (Exception e4) {
            e4.printStackTrace();
        }
    }

    public MBCusRoundImageView(Context context, AttributeSet attributeSet, int i9) {
        super(context, attributeSet, i9);
        this.f15077u = new Path();
        this.f15078v = new Paint();
        this.f15071o = new float[8];
        this.f15072p = new float[8];
        this.f15074r = new RectF();
        this.f15073q = new RectF();
        this.f15063e = new PorterDuffXfermode(PorterDuff.Mode.DST_IN);
    }
}
