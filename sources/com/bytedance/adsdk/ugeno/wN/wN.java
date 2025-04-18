package com.bytedance.adsdk.ugeno.wN;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.app.NotificationCompat;
import androidx.core.view.ViewCompat;
import com.bytedance.adsdk.ugeno.DSW.DSW;
import com.bytedance.adsdk.ugeno.wN.AlY;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class wN extends ViewGroup implements com.bytedance.adsdk.ugeno.wN.YFl {
    private int AlY;
    private Drawable DSW;
    private AlY EH;
    private int[] GA;
    private int NjR;
    private int Sg;
    private AlY.YFl Wwa;
    private int YFl;
    private int YoT;
    private int eT;
    private com.bytedance.adsdk.ugeno.tN lG;

    /* renamed from: nc, reason: collision with root package name */
    private int f10292nc;
    private SparseIntArray pDU;
    private Drawable qsH;
    private List<tN> rkt;
    private int tN;

    /* renamed from: vc, reason: collision with root package name */
    private int f10293vc;
    private int wN;

    /* loaded from: classes.dex */
    public static class YFl extends ViewGroup.MarginLayoutParams implements Sg {
        public static final Parcelable.Creator<YFl> CREATOR = new Parcelable.Creator<YFl>() { // from class: com.bytedance.adsdk.ugeno.wN.wN.YFl.1
            @Override // android.os.Parcelable.Creator
            /* renamed from: YFl, reason: merged with bridge method [inline-methods] */
            public YFl createFromParcel(Parcel parcel) {
                return new YFl(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: YFl, reason: merged with bridge method [inline-methods] */
            public YFl[] newArray(int i10) {
                return new YFl[i10];
            }
        };
        private int AlY;
        private int DSW;
        private int NjR;
        private float Sg;
        private int YFl;

        /* renamed from: nc, reason: collision with root package name */
        private boolean f10294nc;
        private int qsH;
        private float tN;

        /* renamed from: vc, reason: collision with root package name */
        private int f10295vc;
        private float wN;

        public YFl(YFl yFl) {
            super((ViewGroup.MarginLayoutParams) yFl);
            this.YFl = 1;
            this.Sg = 0.0f;
            this.tN = 0.0f;
            this.AlY = -1;
            this.wN = -1.0f;
            this.f10295vc = -1;
            this.DSW = -1;
            this.qsH = ViewCompat.MEASURED_SIZE_MASK;
            this.NjR = ViewCompat.MEASURED_SIZE_MASK;
            this.YFl = yFl.YFl;
            this.Sg = yFl.Sg;
            this.tN = yFl.tN;
            this.AlY = yFl.AlY;
            this.wN = yFl.wN;
            this.f10295vc = yFl.f10295vc;
            this.DSW = yFl.DSW;
            this.qsH = yFl.qsH;
            this.NjR = yFl.NjR;
            this.f10294nc = yFl.f10294nc;
        }

        @Override // com.bytedance.adsdk.ugeno.wN.Sg
        public float AlY() {
            return this.Sg;
        }

        @Override // com.bytedance.adsdk.ugeno.wN.Sg
        public int DSW() {
            return this.f10295vc;
        }

        @Override // com.bytedance.adsdk.ugeno.wN.Sg
        public int EH() {
            return ((ViewGroup.MarginLayoutParams) this).rightMargin;
        }

        @Override // com.bytedance.adsdk.ugeno.wN.Sg
        public int GA() {
            return ((ViewGroup.MarginLayoutParams) this).leftMargin;
        }

        @Override // com.bytedance.adsdk.ugeno.wN.Sg
        public int NjR() {
            return this.qsH;
        }

        @Override // com.bytedance.adsdk.ugeno.wN.Sg
        public int Sg() {
            return ((ViewGroup.MarginLayoutParams) this).height;
        }

        @Override // com.bytedance.adsdk.ugeno.wN.Sg
        public int YFl() {
            return ((ViewGroup.MarginLayoutParams) this).width;
        }

        @Override // com.bytedance.adsdk.ugeno.wN.Sg
        public float YoT() {
            return this.wN;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.bytedance.adsdk.ugeno.wN.Sg
        public boolean eT() {
            return this.f10294nc;
        }

        @Override // com.bytedance.adsdk.ugeno.wN.Sg
        public int nc() {
            return this.NjR;
        }

        @Override // com.bytedance.adsdk.ugeno.wN.Sg
        public int pDU() {
            return ((ViewGroup.MarginLayoutParams) this).topMargin;
        }

        @Override // com.bytedance.adsdk.ugeno.wN.Sg
        public int qsH() {
            return this.DSW;
        }

        @Override // com.bytedance.adsdk.ugeno.wN.Sg
        public int rkt() {
            return ((ViewGroup.MarginLayoutParams) this).bottomMargin;
        }

        @Override // com.bytedance.adsdk.ugeno.wN.Sg
        public int tN() {
            return this.YFl;
        }

        @Override // com.bytedance.adsdk.ugeno.wN.Sg
        public int vc() {
            return this.AlY;
        }

        @Override // com.bytedance.adsdk.ugeno.wN.Sg
        public float wN() {
            return this.tN;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.YFl);
            parcel.writeFloat(this.Sg);
            parcel.writeFloat(this.tN);
            parcel.writeInt(this.AlY);
            parcel.writeFloat(this.wN);
            parcel.writeInt(this.f10295vc);
            parcel.writeInt(this.DSW);
            parcel.writeInt(this.qsH);
            parcel.writeInt(this.NjR);
            parcel.writeByte(this.f10294nc ? (byte) 1 : (byte) 0);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).bottomMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).leftMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).rightMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).topMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).height);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).width);
        }

        public void AlY(int i10) {
            this.AlY = i10;
        }

        public void Sg(float f10) {
            this.tN = f10;
        }

        public void YFl(float f10) {
            this.Sg = f10;
        }

        public void tN(int i10) {
            this.YFl = i10;
        }

        @Override // com.bytedance.adsdk.ugeno.wN.Sg
        public void Sg(int i10) {
            this.DSW = i10;
        }

        @Override // com.bytedance.adsdk.ugeno.wN.Sg
        public void YFl(int i10) {
            this.f10295vc = i10;
        }

        public void tN(float f10) {
            this.wN = f10;
        }

        public YFl(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.YFl = 1;
            this.Sg = 0.0f;
            this.tN = 0.0f;
            this.AlY = -1;
            this.wN = -1.0f;
            this.f10295vc = -1;
            this.DSW = -1;
            this.qsH = ViewCompat.MEASURED_SIZE_MASK;
            this.NjR = ViewCompat.MEASURED_SIZE_MASK;
        }

        public YFl(int i10, int i11) {
            super(new ViewGroup.LayoutParams(i10, i11));
            this.YFl = 1;
            this.Sg = 0.0f;
            this.tN = 0.0f;
            this.AlY = -1;
            this.wN = -1.0f;
            this.f10295vc = -1;
            this.DSW = -1;
            this.qsH = ViewCompat.MEASURED_SIZE_MASK;
            this.NjR = ViewCompat.MEASURED_SIZE_MASK;
        }

        public YFl(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.YFl = 1;
            this.Sg = 0.0f;
            this.tN = 0.0f;
            this.AlY = -1;
            this.wN = -1.0f;
            this.f10295vc = -1;
            this.DSW = -1;
            this.qsH = ViewCompat.MEASURED_SIZE_MASK;
            this.NjR = ViewCompat.MEASURED_SIZE_MASK;
        }

        public YFl(Parcel parcel) {
            super(0, 0);
            this.YFl = 1;
            this.Sg = 0.0f;
            this.tN = 0.0f;
            this.AlY = -1;
            this.wN = -1.0f;
            this.f10295vc = -1;
            this.DSW = -1;
            this.qsH = ViewCompat.MEASURED_SIZE_MASK;
            this.NjR = ViewCompat.MEASURED_SIZE_MASK;
            this.YFl = parcel.readInt();
            this.Sg = parcel.readFloat();
            this.tN = parcel.readFloat();
            this.AlY = parcel.readInt();
            this.wN = parcel.readFloat();
            this.f10295vc = parcel.readInt();
            this.DSW = parcel.readInt();
            this.qsH = parcel.readInt();
            this.NjR = parcel.readInt();
            this.f10294nc = parcel.readByte() != 0;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).leftMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).rightMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).topMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).height = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).width = parcel.readInt();
        }
    }

    public wN(Context context) {
        super(context, null);
        this.f10293vc = -1;
        this.EH = new AlY(this);
        this.rkt = new ArrayList();
        this.Wwa = new AlY.YFl();
    }

    private boolean AlY(int i10, int i11) {
        return wN(i10, i11) ? YFl() ? (this.f10292nc & 1) != 0 : (this.NjR & 1) != 0 : YFl() ? (this.f10292nc & 2) != 0 : (this.NjR & 2) != 0;
    }

    private boolean vc(int i10) {
        if (i10 >= 0 && i10 < this.rkt.size()) {
            for (int i11 = i10 + 1; i11 < this.rkt.size(); i11++) {
                if (this.rkt.get(i11).Sg() > 0) {
                    return false;
                }
            }
            if (YFl()) {
                if ((this.NjR & 4) == 0) {
                    return false;
                }
                return true;
            }
            if ((this.f10292nc & 4) != 0) {
                return true;
            }
        }
        return false;
    }

    private boolean wN(int i10, int i11) {
        for (int i12 = 1; i12 <= i11; i12++) {
            View tN = tN(i10 - i12);
            if (tN != null && tN.getVisibility() != 8) {
                return false;
            }
        }
        return true;
    }

    @Override // com.bytedance.adsdk.ugeno.wN.YFl
    public View Sg(int i10) {
        return tN(i10);
    }

    @Override // com.bytedance.adsdk.ugeno.wN.YFl
    public int YFl(View view) {
        return 0;
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (this.pDU == null) {
            this.pDU = new SparseIntArray(getChildCount());
        }
        this.GA = this.EH.YFl(view, i10, layoutParams, this.pDU);
        super.addView(view, i10, layoutParams);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof YFl;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof YFl) {
            return new YFl((YFl) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new YFl((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new YFl(layoutParams);
    }

    @Override // com.bytedance.adsdk.ugeno.wN.YFl
    public int getAlignContent() {
        return this.wN;
    }

    @Override // com.bytedance.adsdk.ugeno.wN.YFl
    public int getAlignItems() {
        return this.AlY;
    }

    public Drawable getDividerDrawableHorizontal() {
        return this.DSW;
    }

    public Drawable getDividerDrawableVertical() {
        return this.qsH;
    }

    @Override // com.bytedance.adsdk.ugeno.wN.YFl
    public int getFlexDirection() {
        return this.YFl;
    }

    @Override // com.bytedance.adsdk.ugeno.wN.YFl
    public int getFlexItemCount() {
        return getChildCount();
    }

    public List<tN> getFlexLines() {
        ArrayList arrayList = new ArrayList(this.rkt.size());
        for (tN tNVar : this.rkt) {
            if (tNVar.Sg() != 0) {
                arrayList.add(tNVar);
            }
        }
        return arrayList;
    }

    @Override // com.bytedance.adsdk.ugeno.wN.YFl
    public List<tN> getFlexLinesInternal() {
        return this.rkt;
    }

    @Override // com.bytedance.adsdk.ugeno.wN.YFl
    public int getFlexWrap() {
        return this.Sg;
    }

    public int getJustifyContent() {
        return this.tN;
    }

    @Override // com.bytedance.adsdk.ugeno.wN.YFl
    public int getLargestMainSize() {
        Iterator<tN> it = this.rkt.iterator();
        int i10 = Integer.MIN_VALUE;
        while (it.hasNext()) {
            i10 = Math.max(i10, it.next().wN);
        }
        return i10;
    }

    @Override // com.bytedance.adsdk.ugeno.wN.YFl
    public int getMaxLine() {
        return this.f10293vc;
    }

    public int getShowDividerHorizontal() {
        return this.NjR;
    }

    public int getShowDividerVertical() {
        return this.f10292nc;
    }

    @Override // com.bytedance.adsdk.ugeno.wN.YFl
    public int getSumOfCrossSize() {
        int i10;
        int i11;
        int size = this.rkt.size();
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            tN tNVar = this.rkt.get(i13);
            if (AlY(i13)) {
                if (YFl()) {
                    i11 = this.eT;
                } else {
                    i11 = this.YoT;
                }
                i12 += i11;
            }
            if (vc(i13)) {
                if (YFl()) {
                    i10 = this.eT;
                } else {
                    i10 = this.YoT;
                }
                i12 += i10;
            }
            i12 += tNVar.DSW;
        }
        return i12;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.bytedance.adsdk.ugeno.tN tNVar = this.lG;
        if (tNVar != null) {
            tNVar.DSW();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.bytedance.adsdk.ugeno.tN tNVar = this.lG;
        if (tNVar != null) {
            tNVar.qsH();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        boolean z10;
        boolean z11;
        if (this.qsH == null && this.DSW == null) {
            return;
        }
        if (this.NjR == 0 && this.f10292nc == 0) {
            return;
        }
        int YFl2 = DSW.YFl(this);
        int i10 = this.YFl;
        boolean z12 = false;
        boolean z13 = true;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        if (YFl2 == 1) {
                            z12 = true;
                        }
                        if (this.Sg == 2) {
                            z12 = !z12;
                        }
                        Sg(canvas, z12, true);
                        return;
                    }
                    return;
                }
                if (YFl2 != 1) {
                    z13 = false;
                }
                if (this.Sg == 2) {
                    z13 = !z13;
                }
                Sg(canvas, z13, false);
                return;
            }
            if (YFl2 != 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (this.Sg == 2) {
                z12 = true;
            }
            YFl(canvas, z11, z12);
            return;
        }
        if (YFl2 == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.Sg == 2) {
            z12 = true;
        }
        YFl(canvas, z10, z12);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        com.bytedance.adsdk.ugeno.tN tNVar = this.lG;
        if (tNVar != null) {
            tNVar.vc();
        }
        int YFl2 = DSW.YFl(this);
        int i14 = this.YFl;
        boolean z15 = false;
        if (i14 != 0) {
            if (i14 != 1) {
                if (i14 != 2) {
                    if (i14 == 3) {
                        if (YFl2 == 1) {
                            z15 = true;
                        }
                        if (this.Sg == 2) {
                            z14 = !z15;
                        } else {
                            z14 = z15;
                        }
                        YFl(z14, true, i10, i11, i12, i13);
                    } else {
                        throw new IllegalStateException("Invalid flex direction is set: " + this.YFl);
                    }
                } else {
                    if (YFl2 == 1) {
                        z15 = true;
                    }
                    if (this.Sg == 2) {
                        z13 = !z15;
                    } else {
                        z13 = z15;
                    }
                    YFl(z13, false, i10, i11, i12, i13);
                }
            } else {
                if (YFl2 != 1) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                YFl(z12, i10, i11, i12, i13);
            }
        } else {
            if (YFl2 == 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            YFl(z11, i10, i11, i12, i13);
        }
        com.bytedance.adsdk.ugeno.tN tNVar2 = this.lG;
        if (tNVar2 != null) {
            tNVar2.YFl(i10, i11, i12, i13);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        com.bytedance.adsdk.ugeno.tN tNVar = this.lG;
        if (tNVar != null) {
            int[] YFl2 = tNVar.YFl(i10, i11);
            YFl(YFl2[0], YFl2[1]);
        } else {
            YFl(i10, i11);
        }
        com.bytedance.adsdk.ugeno.tN tNVar2 = this.lG;
        if (tNVar2 != null) {
            tNVar2.wN();
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        com.bytedance.adsdk.ugeno.tN tNVar = this.lG;
        if (tNVar != null) {
            tNVar.Sg(i10, i11, i12, i13);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
    }

    public void setAlignContent(int i10) {
        if (this.wN != i10) {
            this.wN = i10;
            requestLayout();
        }
    }

    public void setAlignItems(int i10) {
        if (this.AlY != i10) {
            this.AlY = i10;
            requestLayout();
        }
    }

    public void setDividerDrawable(Drawable drawable) {
        setDividerDrawableHorizontal(drawable);
        setDividerDrawableVertical(drawable);
    }

    public void setDividerDrawableHorizontal(Drawable drawable) {
        if (drawable == this.DSW) {
            return;
        }
        this.DSW = drawable;
        if (drawable != null) {
            this.eT = drawable.getIntrinsicHeight();
        } else {
            this.eT = 0;
        }
        Sg();
        requestLayout();
    }

    public void setDividerDrawableVertical(Drawable drawable) {
        if (drawable == this.qsH) {
            return;
        }
        this.qsH = drawable;
        if (drawable != null) {
            this.YoT = drawable.getIntrinsicWidth();
        } else {
            this.YoT = 0;
        }
        Sg();
        requestLayout();
    }

    public void setFlexDirection(int i10) {
        if (this.YFl != i10) {
            this.YFl = i10;
            requestLayout();
        }
    }

    @Override // com.bytedance.adsdk.ugeno.wN.YFl
    public void setFlexLines(List<tN> list) {
        this.rkt = list;
    }

    public void setFlexWrap(int i10) {
        if (this.Sg != i10) {
            this.Sg = i10;
            requestLayout();
        }
    }

    public void setJustifyContent(int i10) {
        if (this.tN != i10) {
            this.tN = i10;
            requestLayout();
        }
    }

    public void setMaxLine(int i10) {
        if (this.f10293vc != i10) {
            this.f10293vc = i10;
            requestLayout();
        }
    }

    public void setShowDivider(int i10) {
        setShowDividerVertical(i10);
        setShowDividerHorizontal(i10);
    }

    public void setShowDividerHorizontal(int i10) {
        if (i10 != this.NjR) {
            this.NjR = i10;
            requestLayout();
        }
    }

    public void setShowDividerVertical(int i10) {
        if (i10 != this.f10292nc) {
            this.f10292nc = i10;
            requestLayout();
        }
    }

    public View tN(int i10) {
        if (i10 < 0) {
            return null;
        }
        int[] iArr = this.GA;
        if (i10 >= iArr.length) {
            return null;
        }
        return getChildAt(iArr[i10]);
    }

    private void Sg(int i10, int i11) {
        this.rkt.clear();
        this.Wwa.YFl();
        this.EH.YFl(this.Wwa, i10, i11);
        this.rkt = this.Wwa.YFl;
        this.EH.YFl(i10, i11);
        if (this.AlY == 3) {
            for (tN tNVar : this.rkt) {
                int i12 = Integer.MIN_VALUE;
                for (int i13 = 0; i13 < tNVar.qsH; i13++) {
                    View tN = tN(tNVar.EH + i13);
                    if (tN != null && tN.getVisibility() != 8) {
                        YFl yFl = (YFl) tN.getLayoutParams();
                        if (this.Sg != 2) {
                            i12 = Math.max(i12, tN.getMeasuredHeight() + Math.max(tNVar.YoT - tN.getBaseline(), ((ViewGroup.MarginLayoutParams) yFl).topMargin) + ((ViewGroup.MarginLayoutParams) yFl).bottomMargin);
                        } else {
                            i12 = Math.max(i12, tN.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) yFl).topMargin + Math.max(tN.getBaseline() + (tNVar.YoT - tN.getMeasuredHeight()), ((ViewGroup.MarginLayoutParams) yFl).bottomMargin));
                        }
                    }
                }
                tNVar.DSW = i12;
            }
        }
        this.EH.Sg(i10, i11, getPaddingBottom() + getPaddingTop());
        this.EH.YFl();
        YFl(this.YFl, i10, i11, this.Wwa.Sg);
    }

    private void YFl(int i10, int i11) {
        if (this.pDU == null) {
            this.pDU = new SparseIntArray(getChildCount());
        }
        if (this.EH.Sg(this.pDU)) {
            this.GA = this.EH.YFl(this.pDU);
        }
        int i12 = this.YFl;
        if (i12 == 0 || i12 == 1) {
            Sg(i10, i11);
        } else {
            if (i12 != 2 && i12 != 3) {
                throw new IllegalStateException("Invalid value for the flex direction is set: " + this.YFl);
            }
            tN(i10, i11);
        }
    }

    private void tN(int i10, int i11) {
        this.rkt.clear();
        this.Wwa.YFl();
        this.EH.Sg(this.Wwa, i10, i11);
        this.rkt = this.Wwa.YFl;
        this.EH.YFl(i10, i11);
        this.EH.Sg(i10, i11, getPaddingRight() + getPaddingLeft());
        this.EH.YFl();
        YFl(this.YFl, i10, i11, this.Wwa.Sg);
    }

    private boolean wN(int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.rkt.get(i11).Sg() > 0) {
                return false;
            }
        }
        return true;
    }

    private boolean AlY(int i10) {
        if (i10 >= 0 && i10 < this.rkt.size()) {
            if (wN(i10)) {
                return YFl() ? (this.NjR & 1) != 0 : (this.f10292nc & 1) != 0;
            }
            if (YFl()) {
                return (this.NjR & 2) != 0;
            }
            if ((this.f10292nc & 2) != 0) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bytedance.adsdk.ugeno.wN.YFl
    public View YFl(int i10) {
        return getChildAt(i10);
    }

    private void YFl(int i10, int i11, int i12, int i13) {
        int paddingBottom;
        int largestMainSize;
        int resolveSizeAndState;
        int resolveSizeAndState2;
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        int mode2 = View.MeasureSpec.getMode(i12);
        int size2 = View.MeasureSpec.getSize(i12);
        if (i10 == 0 || i10 == 1) {
            paddingBottom = getPaddingBottom() + getPaddingTop() + getSumOfCrossSize();
            largestMainSize = getLargestMainSize();
        } else {
            if (i10 != 2 && i10 != 3) {
                throw new IllegalArgumentException("Invalid flex direction: ".concat(String.valueOf(i10)));
            }
            paddingBottom = getLargestMainSize();
            largestMainSize = getPaddingRight() + getPaddingLeft() + getSumOfCrossSize();
        }
        if (mode == Integer.MIN_VALUE) {
            if (size < largestMainSize) {
                i13 = View.combineMeasuredStates(i13, 16777216);
            } else {
                size = largestMainSize;
            }
            resolveSizeAndState = View.resolveSizeAndState(size, i11, i13);
        } else if (mode == 0) {
            resolveSizeAndState = View.resolveSizeAndState(largestMainSize, i11, i13);
        } else if (mode == 1073741824) {
            if (size < largestMainSize) {
                i13 = View.combineMeasuredStates(i13, 16777216);
            }
            resolveSizeAndState = View.resolveSizeAndState(size, i11, i13);
        } else {
            throw new IllegalStateException("Unknown width mode is set: ".concat(String.valueOf(mode)));
        }
        if (mode2 == Integer.MIN_VALUE) {
            if (size2 < paddingBottom) {
                i13 = View.combineMeasuredStates(i13, NotificationCompat.FLAG_LOCAL_ONLY);
            } else {
                size2 = paddingBottom;
            }
            resolveSizeAndState2 = View.resolveSizeAndState(size2, i12, i13);
        } else if (mode2 == 0) {
            resolveSizeAndState2 = View.resolveSizeAndState(paddingBottom, i12, i13);
        } else if (mode2 == 1073741824) {
            if (size2 < paddingBottom) {
                i13 = View.combineMeasuredStates(i13, NotificationCompat.FLAG_LOCAL_ONLY);
            }
            resolveSizeAndState2 = View.resolveSizeAndState(size2, i12, i13);
        } else {
            throw new IllegalStateException("Unknown height mode is set: ".concat(String.valueOf(mode2)));
        }
        setMeasuredDimension(resolveSizeAndState, resolveSizeAndState2);
    }

    private void Sg(Canvas canvas, boolean z10, boolean z11) {
        int i10;
        int i11;
        int bottom;
        int top;
        int paddingTop = getPaddingTop();
        int max = Math.max(0, (getHeight() - getPaddingBottom()) - paddingTop);
        int size = this.rkt.size();
        for (int i12 = 0; i12 < size; i12++) {
            tN tNVar = this.rkt.get(i12);
            for (int i13 = 0; i13 < tNVar.qsH; i13++) {
                int i14 = tNVar.EH + i13;
                View tN = tN(i14);
                if (tN != null && tN.getVisibility() != 8) {
                    YFl yFl = (YFl) tN.getLayoutParams();
                    if (AlY(i14, i13)) {
                        if (z11) {
                            top = tN.getBottom() + ((ViewGroup.MarginLayoutParams) yFl).bottomMargin;
                        } else {
                            top = (tN.getTop() - ((ViewGroup.MarginLayoutParams) yFl).topMargin) - this.eT;
                        }
                        Sg(canvas, tNVar.YFl, top, tNVar.DSW);
                    }
                    if (i13 == tNVar.qsH - 1 && (this.NjR & 4) > 0) {
                        if (z11) {
                            bottom = (tN.getTop() - ((ViewGroup.MarginLayoutParams) yFl).topMargin) - this.eT;
                        } else {
                            bottom = tN.getBottom() + ((ViewGroup.MarginLayoutParams) yFl).bottomMargin;
                        }
                        Sg(canvas, tNVar.YFl, bottom, tNVar.DSW);
                    }
                }
            }
            if (AlY(i12)) {
                if (z10) {
                    i11 = tNVar.tN;
                } else {
                    i11 = tNVar.YFl - this.YoT;
                }
                YFl(canvas, i11, paddingTop, max);
            }
            if (vc(i12) && (this.f10292nc & 4) > 0) {
                if (z10) {
                    i10 = tNVar.YFl - this.YoT;
                } else {
                    i10 = tNVar.tN;
                }
                YFl(canvas, i10, paddingTop, max);
            }
        }
    }

    @Override // com.bytedance.adsdk.ugeno.wN.YFl
    public boolean YFl() {
        int i10 = this.YFl;
        return i10 == 0 || i10 == 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x017d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void YFl(boolean r29, int r30, int r31, int r32, int r33) {
        /*
            Method dump skipped, instructions count: 552
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.ugeno.wN.wN.YFl(boolean, int, int, int, int):void");
    }

    private void Sg(Canvas canvas, int i10, int i11, int i12) {
        Drawable drawable = this.DSW;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(i10, i11, i12 + i10, this.eT + i11);
        this.DSW.draw(canvas);
    }

    @Override // com.bytedance.adsdk.ugeno.wN.YFl
    public int Sg(int i10, int i11, int i12) {
        return ViewGroup.getChildMeasureSpec(i10, i11, i12);
    }

    private void Sg() {
        if (this.DSW == null && this.qsH == null) {
            setWillNotDraw(true);
        } else {
            setWillNotDraw(false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0179  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void YFl(boolean r30, boolean r31, int r32, int r33, int r34, int r35) {
        /*
            Method dump skipped, instructions count: 536
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.ugeno.wN.wN.YFl(boolean, boolean, int, int, int, int):void");
    }

    private void YFl(Canvas canvas, boolean z10, boolean z11) {
        int i10;
        int i11;
        int right;
        int left;
        int paddingLeft = getPaddingLeft();
        int max = Math.max(0, (getWidth() - getPaddingRight()) - paddingLeft);
        int size = this.rkt.size();
        for (int i12 = 0; i12 < size; i12++) {
            tN tNVar = this.rkt.get(i12);
            for (int i13 = 0; i13 < tNVar.qsH; i13++) {
                int i14 = tNVar.EH + i13;
                View tN = tN(i14);
                if (tN != null && tN.getVisibility() != 8) {
                    YFl yFl = (YFl) tN.getLayoutParams();
                    if (AlY(i14, i13)) {
                        if (z10) {
                            left = tN.getRight() + ((ViewGroup.MarginLayoutParams) yFl).rightMargin;
                        } else {
                            left = (tN.getLeft() - ((ViewGroup.MarginLayoutParams) yFl).leftMargin) - this.YoT;
                        }
                        YFl(canvas, left, tNVar.Sg, tNVar.DSW);
                    }
                    if (i13 == tNVar.qsH - 1 && (this.f10292nc & 4) > 0) {
                        if (z10) {
                            right = (tN.getLeft() - ((ViewGroup.MarginLayoutParams) yFl).leftMargin) - this.YoT;
                        } else {
                            right = tN.getRight() + ((ViewGroup.MarginLayoutParams) yFl).rightMargin;
                        }
                        YFl(canvas, right, tNVar.Sg, tNVar.DSW);
                    }
                }
            }
            if (AlY(i12)) {
                if (z11) {
                    i11 = tNVar.AlY;
                } else {
                    i11 = tNVar.Sg - this.eT;
                }
                Sg(canvas, paddingLeft, i11, max);
            }
            if (vc(i12) && (this.NjR & 4) > 0) {
                if (z11) {
                    i10 = tNVar.Sg - this.eT;
                } else {
                    i10 = tNVar.AlY;
                }
                Sg(canvas, paddingLeft, i10, max);
            }
        }
    }

    private void YFl(Canvas canvas, int i10, int i11, int i12) {
        Drawable drawable = this.qsH;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(i10, i11, this.YoT + i10, i12 + i11);
        this.qsH.draw(canvas);
    }

    @Override // com.bytedance.adsdk.ugeno.wN.YFl
    public int YFl(View view, int i10, int i11) {
        int i12;
        int i13;
        if (YFl()) {
            i12 = AlY(i10, i11) ? 0 + this.YoT : 0;
            if ((this.f10292nc & 4) <= 0) {
                return i12;
            }
            i13 = this.YoT;
        } else {
            i12 = AlY(i10, i11) ? 0 + this.eT : 0;
            if ((this.NjR & 4) <= 0) {
                return i12;
            }
            i13 = this.eT;
        }
        return i12 + i13;
    }

    @Override // com.bytedance.adsdk.ugeno.wN.YFl
    public void YFl(tN tNVar) {
        if (YFl()) {
            if ((this.f10292nc & 4) > 0) {
                int i10 = tNVar.wN;
                int i11 = this.YoT;
                tNVar.wN = i10 + i11;
                tNVar.f10290vc += i11;
                return;
            }
            return;
        }
        if ((this.NjR & 4) > 0) {
            int i12 = tNVar.wN;
            int i13 = this.eT;
            tNVar.wN = i12 + i13;
            tNVar.f10290vc += i13;
        }
    }

    @Override // com.bytedance.adsdk.ugeno.wN.YFl
    public int YFl(int i10, int i11, int i12) {
        return ViewGroup.getChildMeasureSpec(i10, i11, i12);
    }

    @Override // com.bytedance.adsdk.ugeno.wN.YFl
    public void YFl(View view, int i10, int i11, tN tNVar) {
        if (AlY(i10, i11)) {
            if (YFl()) {
                int i12 = tNVar.wN;
                int i13 = this.YoT;
                tNVar.wN = i12 + i13;
                tNVar.f10290vc += i13;
                return;
            }
            int i14 = tNVar.wN;
            int i15 = this.eT;
            tNVar.wN = i14 + i15;
            tNVar.f10290vc += i15;
        }
    }

    public void YFl(com.bytedance.adsdk.ugeno.Sg.Sg sg2) {
        this.lG = sg2;
    }
}
