package com.bytedance.adsdk.ugeno.component.flexbox;

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
import com.bytedance.adsdk.ugeno.component.flexbox.jU;
import com.bytedance.adsdk.ugeno.lMd.QR;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class FlexboxLayout extends ViewGroup implements com.bytedance.adsdk.ugeno.component.flexbox.zp {
    private int Bj;
    private int COT;
    private int HWF;
    private int KS;
    private List<KS> KVG;
    private Drawable QR;
    private int YW;
    private jU dQp;
    private int dT;
    private int jU;
    private Drawable ku;
    private int lMd;
    private SparseIntArray rV;
    private int[] tG;
    private int vDp;
    private jU.zp vwr;
    private com.bytedance.adsdk.ugeno.lMd woN;
    private int zp;

    /* loaded from: classes.dex */
    public static class zp extends ViewGroup.MarginLayoutParams implements lMd {
        public static final Parcelable.Creator<zp> CREATOR = new Parcelable.Creator<zp>() { // from class: com.bytedance.adsdk.ugeno.component.flexbox.FlexboxLayout.zp.1
            @Override // android.os.Parcelable.Creator
            /* renamed from: zp, reason: merged with bridge method [inline-methods] */
            public zp createFromParcel(Parcel parcel) {
                return new zp(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: zp, reason: merged with bridge method [inline-methods] */
            public zp[] newArray(int i9) {
                return new zp[i9];
            }
        };
        private float COT;
        private int HWF;
        private float KS;
        private int QR;
        private int YW;
        private boolean dT;
        private int jU;
        private int ku;
        private float lMd;
        private int zp;

        public zp(zp zpVar) {
            super((ViewGroup.MarginLayoutParams) zpVar);
            this.zp = 1;
            this.lMd = 0.0f;
            this.KS = 0.0f;
            this.jU = -1;
            this.COT = -1.0f;
            this.HWF = -1;
            this.QR = -1;
            this.ku = ViewCompat.MEASURED_SIZE_MASK;
            this.YW = ViewCompat.MEASURED_SIZE_MASK;
            this.zp = zpVar.zp;
            this.lMd = zpVar.lMd;
            this.KS = zpVar.KS;
            this.jU = zpVar.jU;
            this.COT = zpVar.COT;
            this.HWF = zpVar.HWF;
            this.QR = zpVar.QR;
            this.ku = zpVar.ku;
            this.YW = zpVar.YW;
            this.dT = zpVar.dT;
        }

        @Override // com.bytedance.adsdk.ugeno.component.flexbox.lMd
        public boolean Bj() {
            return this.dT;
        }

        @Override // com.bytedance.adsdk.ugeno.component.flexbox.lMd
        public float COT() {
            return this.KS;
        }

        @Override // com.bytedance.adsdk.ugeno.component.flexbox.lMd
        public int HWF() {
            return this.jU;
        }

        @Override // com.bytedance.adsdk.ugeno.component.flexbox.lMd
        public int KS() {
            return this.zp;
        }

        @Override // com.bytedance.adsdk.ugeno.component.flexbox.lMd
        public int KVG() {
            return ((ViewGroup.MarginLayoutParams) this).bottomMargin;
        }

        @Override // com.bytedance.adsdk.ugeno.component.flexbox.lMd
        public int QR() {
            return this.HWF;
        }

        @Override // com.bytedance.adsdk.ugeno.component.flexbox.lMd
        public int YW() {
            return this.ku;
        }

        @Override // com.bytedance.adsdk.ugeno.component.flexbox.lMd
        public int dQp() {
            return ((ViewGroup.MarginLayoutParams) this).rightMargin;
        }

        @Override // com.bytedance.adsdk.ugeno.component.flexbox.lMd
        public int dT() {
            return this.YW;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.bytedance.adsdk.ugeno.component.flexbox.lMd
        public float jU() {
            return this.lMd;
        }

        @Override // com.bytedance.adsdk.ugeno.component.flexbox.lMd
        public int ku() {
            return this.QR;
        }

        @Override // com.bytedance.adsdk.ugeno.component.flexbox.lMd
        public int lMd() {
            return ((ViewGroup.MarginLayoutParams) this).height;
        }

        @Override // com.bytedance.adsdk.ugeno.component.flexbox.lMd
        public int rV() {
            return ((ViewGroup.MarginLayoutParams) this).topMargin;
        }

        @Override // com.bytedance.adsdk.ugeno.component.flexbox.lMd
        public int tG() {
            return ((ViewGroup.MarginLayoutParams) this).leftMargin;
        }

        @Override // com.bytedance.adsdk.ugeno.component.flexbox.lMd
        public float vDp() {
            return this.COT;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i9) {
            parcel.writeInt(this.zp);
            parcel.writeFloat(this.lMd);
            parcel.writeFloat(this.KS);
            parcel.writeInt(this.jU);
            parcel.writeFloat(this.COT);
            parcel.writeInt(this.HWF);
            parcel.writeInt(this.QR);
            parcel.writeInt(this.ku);
            parcel.writeInt(this.YW);
            parcel.writeByte(this.dT ? (byte) 1 : (byte) 0);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).bottomMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).leftMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).rightMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).topMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).height);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).width);
        }

        @Override // com.bytedance.adsdk.ugeno.component.flexbox.lMd
        public int zp() {
            return ((ViewGroup.MarginLayoutParams) this).width;
        }

        public void KS(int i9) {
            this.zp = i9;
        }

        public void jU(int i9) {
            this.jU = i9;
        }

        public void lMd(float f9) {
            this.KS = f9;
        }

        public void zp(float f9) {
            this.lMd = f9;
        }

        public void KS(float f9) {
            this.COT = f9;
        }

        @Override // com.bytedance.adsdk.ugeno.component.flexbox.lMd
        public void lMd(int i9) {
            this.QR = i9;
        }

        @Override // com.bytedance.adsdk.ugeno.component.flexbox.lMd
        public void zp(int i9) {
            this.HWF = i9;
        }

        public zp(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.zp = 1;
            this.lMd = 0.0f;
            this.KS = 0.0f;
            this.jU = -1;
            this.COT = -1.0f;
            this.HWF = -1;
            this.QR = -1;
            this.ku = ViewCompat.MEASURED_SIZE_MASK;
            this.YW = ViewCompat.MEASURED_SIZE_MASK;
        }

        public zp(int i9, int i10) {
            super(new ViewGroup.LayoutParams(i9, i10));
            this.zp = 1;
            this.lMd = 0.0f;
            this.KS = 0.0f;
            this.jU = -1;
            this.COT = -1.0f;
            this.HWF = -1;
            this.QR = -1;
            this.ku = ViewCompat.MEASURED_SIZE_MASK;
            this.YW = ViewCompat.MEASURED_SIZE_MASK;
        }

        public zp(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.zp = 1;
            this.lMd = 0.0f;
            this.KS = 0.0f;
            this.jU = -1;
            this.COT = -1.0f;
            this.HWF = -1;
            this.QR = -1;
            this.ku = ViewCompat.MEASURED_SIZE_MASK;
            this.YW = ViewCompat.MEASURED_SIZE_MASK;
        }

        public zp(Parcel parcel) {
            super(0, 0);
            this.zp = 1;
            this.lMd = 0.0f;
            this.KS = 0.0f;
            this.jU = -1;
            this.COT = -1.0f;
            this.HWF = -1;
            this.QR = -1;
            this.ku = ViewCompat.MEASURED_SIZE_MASK;
            this.YW = ViewCompat.MEASURED_SIZE_MASK;
            this.zp = parcel.readInt();
            this.lMd = parcel.readFloat();
            this.KS = parcel.readFloat();
            this.jU = parcel.readInt();
            this.COT = parcel.readFloat();
            this.HWF = parcel.readInt();
            this.QR = parcel.readInt();
            this.ku = parcel.readInt();
            this.YW = parcel.readInt();
            this.dT = parcel.readByte() != 0;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).leftMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).rightMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).topMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).height = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).width = parcel.readInt();
        }
    }

    public FlexboxLayout(Context context) {
        super(context, null);
        this.HWF = -1;
        this.dQp = new jU(this);
        this.KVG = new ArrayList();
        this.vwr = new jU.zp();
    }

    private boolean COT(int i9, int i10) {
        for (int i11 = 1; i11 <= i10; i11++) {
            View KS = KS(i9 - i11);
            if (KS != null && KS.getVisibility() != 8) {
                return false;
            }
        }
        return true;
    }

    private boolean HWF(int i9) {
        if (i9 >= 0 && i9 < this.KVG.size()) {
            for (int i10 = i9 + 1; i10 < this.KVG.size(); i10++) {
                if (this.KVG.get(i10).lMd() > 0) {
                    return false;
                }
            }
            if (zp()) {
                if ((this.YW & 4) == 0) {
                    return false;
                }
                return true;
            }
            if ((this.dT & 4) != 0) {
                return true;
            }
        }
        return false;
    }

    private boolean jU(int i9, int i10) {
        return COT(i9, i10) ? zp() ? (this.dT & 1) != 0 : (this.YW & 1) != 0 : zp() ? (this.dT & 2) != 0 : (this.YW & 2) != 0;
    }

    public View KS(int i9) {
        if (i9 < 0) {
            return null;
        }
        int[] iArr = this.tG;
        if (i9 >= iArr.length) {
            return null;
        }
        return getChildAt(iArr[i9]);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i9, ViewGroup.LayoutParams layoutParams) {
        if (this.rV == null) {
            this.rV = new SparseIntArray(getChildCount());
        }
        this.tG = this.dQp.zp(view, i9, layoutParams, this.rV);
        super.addView(view, i9, layoutParams);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof zp;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof zp) {
            return new zp((zp) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new zp((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new zp(layoutParams);
    }

    @Override // com.bytedance.adsdk.ugeno.component.flexbox.zp
    public int getAlignContent() {
        return this.COT;
    }

    @Override // com.bytedance.adsdk.ugeno.component.flexbox.zp
    public int getAlignItems() {
        return this.jU;
    }

    public Drawable getDividerDrawableHorizontal() {
        return this.QR;
    }

    public Drawable getDividerDrawableVertical() {
        return this.ku;
    }

    @Override // com.bytedance.adsdk.ugeno.component.flexbox.zp
    public int getFlexDirection() {
        return this.zp;
    }

    @Override // com.bytedance.adsdk.ugeno.component.flexbox.zp
    public int getFlexItemCount() {
        return getChildCount();
    }

    public List<KS> getFlexLines() {
        ArrayList arrayList = new ArrayList(this.KVG.size());
        for (KS ks : this.KVG) {
            if (ks.lMd() != 0) {
                arrayList.add(ks);
            }
        }
        return arrayList;
    }

    @Override // com.bytedance.adsdk.ugeno.component.flexbox.zp
    public List<KS> getFlexLinesInternal() {
        return this.KVG;
    }

    @Override // com.bytedance.adsdk.ugeno.component.flexbox.zp
    public int getFlexWrap() {
        return this.lMd;
    }

    public int getJustifyContent() {
        return this.KS;
    }

    @Override // com.bytedance.adsdk.ugeno.component.flexbox.zp
    public int getLargestMainSize() {
        Iterator<KS> it = this.KVG.iterator();
        int i9 = Integer.MIN_VALUE;
        while (it.hasNext()) {
            i9 = Math.max(i9, it.next().COT);
        }
        return i9;
    }

    @Override // com.bytedance.adsdk.ugeno.component.flexbox.zp
    public int getMaxLine() {
        return this.HWF;
    }

    public int getShowDividerHorizontal() {
        return this.YW;
    }

    public int getShowDividerVertical() {
        return this.dT;
    }

    @Override // com.bytedance.adsdk.ugeno.component.flexbox.zp
    public int getSumOfCrossSize() {
        int i9;
        int i10;
        int size = this.KVG.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            KS ks = this.KVG.get(i12);
            if (jU(i12)) {
                if (zp()) {
                    i10 = this.Bj;
                } else {
                    i10 = this.vDp;
                }
                i11 += i10;
            }
            if (HWF(i12)) {
                if (zp()) {
                    i9 = this.Bj;
                } else {
                    i9 = this.vDp;
                }
                i11 += i9;
            }
            i11 += ks.QR;
        }
        return i11;
    }

    @Override // com.bytedance.adsdk.ugeno.component.flexbox.zp
    public View lMd(int i9) {
        return KS(i9);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.bytedance.adsdk.ugeno.lMd lmd = this.woN;
        if (lmd != null) {
            lmd.HWF();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.bytedance.adsdk.ugeno.lMd lmd = this.woN;
        if (lmd != null) {
            lmd.QR();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        boolean z8;
        boolean z9;
        if (this.ku == null && this.QR == null) {
            return;
        }
        if (this.YW == 0 && this.dT == 0) {
            return;
        }
        int zp2 = QR.zp(this);
        int i9 = this.zp;
        boolean z10 = false;
        boolean z11 = true;
        if (i9 != 0) {
            if (i9 != 1) {
                if (i9 != 2) {
                    if (i9 == 3) {
                        if (zp2 == 1) {
                            z10 = true;
                        }
                        if (this.lMd == 2) {
                            z10 = !z10;
                        }
                        lMd(canvas, z10, true);
                        return;
                    }
                    return;
                }
                if (zp2 != 1) {
                    z11 = false;
                }
                if (this.lMd == 2) {
                    z11 = !z11;
                }
                lMd(canvas, z11, false);
                return;
            }
            if (zp2 != 1) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (this.lMd == 2) {
                z10 = true;
            }
            zp(canvas, z9, z10);
            return;
        }
        if (zp2 == 1) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (this.lMd == 2) {
            z10 = true;
        }
        zp(canvas, z8, z10);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z8, int i9, int i10, int i11, int i12) {
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        com.bytedance.adsdk.ugeno.lMd lmd = this.woN;
        if (lmd != null) {
            lmd.COT();
        }
        int zp2 = QR.zp(this);
        int i13 = this.zp;
        boolean z13 = false;
        if (i13 != 0) {
            if (i13 != 1) {
                if (i13 != 2) {
                    if (i13 == 3) {
                        if (zp2 == 1) {
                            z13 = true;
                        }
                        if (this.lMd == 2) {
                            z12 = !z13;
                        } else {
                            z12 = z13;
                        }
                        zp(z12, true, i9, i10, i11, i12);
                    } else {
                        throw new IllegalStateException("Invalid flex direction is set: " + this.zp);
                    }
                } else {
                    if (zp2 == 1) {
                        z13 = true;
                    }
                    if (this.lMd == 2) {
                        z11 = !z13;
                    } else {
                        z11 = z13;
                    }
                    zp(z11, false, i9, i10, i11, i12);
                }
            } else {
                if (zp2 != 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                zp(z10, i9, i10, i11, i12);
            }
        } else {
            if (zp2 == 1) {
                z9 = true;
            } else {
                z9 = false;
            }
            zp(z9, i9, i10, i11, i12);
        }
        com.bytedance.adsdk.ugeno.lMd lmd2 = this.woN;
        if (lmd2 != null) {
            lmd2.zp(i9, i10, i11, i12);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i9, int i10) {
        com.bytedance.adsdk.ugeno.lMd lmd = this.woN;
        if (lmd != null) {
            int[] zp2 = lmd.zp(i9, i10);
            zp(zp2[0], zp2[1]);
        } else {
            zp(i9, i10);
        }
        com.bytedance.adsdk.ugeno.lMd lmd2 = this.woN;
        if (lmd2 != null) {
            lmd2.jU();
        }
    }

    public void setAlignContent(int i9) {
        if (this.COT != i9) {
            this.COT = i9;
            requestLayout();
        }
    }

    public void setAlignItems(int i9) {
        if (this.jU != i9) {
            this.jU = i9;
            requestLayout();
        }
    }

    public void setDividerDrawable(Drawable drawable) {
        setDividerDrawableHorizontal(drawable);
        setDividerDrawableVertical(drawable);
    }

    public void setDividerDrawableHorizontal(Drawable drawable) {
        if (drawable == this.QR) {
            return;
        }
        this.QR = drawable;
        if (drawable != null) {
            this.Bj = drawable.getIntrinsicHeight();
        } else {
            this.Bj = 0;
        }
        lMd();
        requestLayout();
    }

    public void setDividerDrawableVertical(Drawable drawable) {
        if (drawable == this.ku) {
            return;
        }
        this.ku = drawable;
        if (drawable != null) {
            this.vDp = drawable.getIntrinsicWidth();
        } else {
            this.vDp = 0;
        }
        lMd();
        requestLayout();
    }

    public void setFlexDirection(int i9) {
        if (this.zp != i9) {
            this.zp = i9;
            requestLayout();
        }
    }

    @Override // com.bytedance.adsdk.ugeno.component.flexbox.zp
    public void setFlexLines(List<KS> list) {
        this.KVG = list;
    }

    public void setFlexWrap(int i9) {
        if (this.lMd != i9) {
            this.lMd = i9;
            requestLayout();
        }
    }

    public void setJustifyContent(int i9) {
        if (this.KS != i9) {
            this.KS = i9;
            requestLayout();
        }
    }

    public void setMaxLine(int i9) {
        if (this.HWF != i9) {
            this.HWF = i9;
            requestLayout();
        }
    }

    public void setShowDivider(int i9) {
        setShowDividerVertical(i9);
        setShowDividerHorizontal(i9);
    }

    public void setShowDividerHorizontal(int i9) {
        if (i9 != this.YW) {
            this.YW = i9;
            requestLayout();
        }
    }

    public void setShowDividerVertical(int i9) {
        if (i9 != this.dT) {
            this.dT = i9;
            requestLayout();
        }
    }

    @Override // com.bytedance.adsdk.ugeno.component.flexbox.zp
    public int zp(View view) {
        return 0;
    }

    private void lMd(int i9, int i10) {
        this.KVG.clear();
        this.vwr.zp();
        this.dQp.zp(this.vwr, i9, i10);
        this.KVG = this.vwr.zp;
        this.dQp.zp(i9, i10);
        if (this.jU == 3) {
            for (KS ks : this.KVG) {
                int i11 = Integer.MIN_VALUE;
                for (int i12 = 0; i12 < ks.ku; i12++) {
                    View KS = KS(ks.dQp + i12);
                    if (KS != null && KS.getVisibility() != 8) {
                        zp zpVar = (zp) KS.getLayoutParams();
                        if (this.lMd != 2) {
                            i11 = Math.max(i11, KS.getMeasuredHeight() + Math.max(ks.vDp - KS.getBaseline(), ((ViewGroup.MarginLayoutParams) zpVar).topMargin) + ((ViewGroup.MarginLayoutParams) zpVar).bottomMargin);
                        } else {
                            i11 = Math.max(i11, KS.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) zpVar).topMargin + Math.max(KS.getBaseline() + (ks.vDp - KS.getMeasuredHeight()), ((ViewGroup.MarginLayoutParams) zpVar).bottomMargin));
                        }
                    }
                }
                ks.QR = i11;
            }
        }
        this.dQp.lMd(i9, i10, getPaddingBottom() + getPaddingTop());
        this.dQp.zp();
        zp(this.zp, i9, i10, this.vwr.lMd);
    }

    private void zp(int i9, int i10) {
        if (this.rV == null) {
            this.rV = new SparseIntArray(getChildCount());
        }
        if (this.dQp.lMd(this.rV)) {
            this.tG = this.dQp.zp(this.rV);
        }
        int i11 = this.zp;
        if (i11 == 0 || i11 == 1) {
            lMd(i9, i10);
        } else {
            if (i11 != 2 && i11 != 3) {
                throw new IllegalStateException("Invalid value for the flex direction is set: " + this.zp);
            }
            KS(i9, i10);
        }
    }

    private boolean COT(int i9) {
        for (int i10 = 0; i10 < i9; i10++) {
            if (this.KVG.get(i10).lMd() > 0) {
                return false;
            }
        }
        return true;
    }

    private void KS(int i9, int i10) {
        this.KVG.clear();
        this.vwr.zp();
        this.dQp.lMd(this.vwr, i9, i10);
        this.KVG = this.vwr.zp;
        this.dQp.zp(i9, i10);
        this.dQp.lMd(i9, i10, getPaddingRight() + getPaddingLeft());
        this.dQp.zp();
        zp(this.zp, i9, i10, this.vwr.lMd);
    }

    private boolean jU(int i9) {
        if (i9 >= 0 && i9 < this.KVG.size()) {
            if (COT(i9)) {
                return zp() ? (this.YW & 1) != 0 : (this.dT & 1) != 0;
            }
            if (zp()) {
                return (this.YW & 2) != 0;
            }
            if ((this.dT & 2) != 0) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bytedance.adsdk.ugeno.component.flexbox.zp
    public View zp(int i9) {
        return getChildAt(i9);
    }

    private void zp(int i9, int i10, int i11, int i12) {
        int paddingBottom;
        int largestMainSize;
        int resolveSizeAndState;
        int resolveSizeAndState2;
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i11);
        if (i9 == 0 || i9 == 1) {
            paddingBottom = getPaddingBottom() + getPaddingTop() + getSumOfCrossSize();
            largestMainSize = getLargestMainSize();
        } else {
            if (i9 != 2 && i9 != 3) {
                throw new IllegalArgumentException("Invalid flex direction: ".concat(String.valueOf(i9)));
            }
            paddingBottom = getLargestMainSize();
            largestMainSize = getPaddingRight() + getPaddingLeft() + getSumOfCrossSize();
        }
        if (mode == Integer.MIN_VALUE) {
            if (size < largestMainSize) {
                i12 = View.combineMeasuredStates(i12, 16777216);
            } else {
                size = largestMainSize;
            }
            resolveSizeAndState = View.resolveSizeAndState(size, i10, i12);
        } else if (mode == 0) {
            resolveSizeAndState = View.resolveSizeAndState(largestMainSize, i10, i12);
        } else if (mode == 1073741824) {
            if (size < largestMainSize) {
                i12 = View.combineMeasuredStates(i12, 16777216);
            }
            resolveSizeAndState = View.resolveSizeAndState(size, i10, i12);
        } else {
            throw new IllegalStateException("Unknown width mode is set: ".concat(String.valueOf(mode)));
        }
        if (mode2 == Integer.MIN_VALUE) {
            if (size2 < paddingBottom) {
                i12 = View.combineMeasuredStates(i12, NotificationCompat.FLAG_LOCAL_ONLY);
            } else {
                size2 = paddingBottom;
            }
            resolveSizeAndState2 = View.resolveSizeAndState(size2, i11, i12);
        } else if (mode2 == 0) {
            resolveSizeAndState2 = View.resolveSizeAndState(paddingBottom, i11, i12);
        } else if (mode2 == 1073741824) {
            if (size2 < paddingBottom) {
                i12 = View.combineMeasuredStates(i12, NotificationCompat.FLAG_LOCAL_ONLY);
            }
            resolveSizeAndState2 = View.resolveSizeAndState(size2, i11, i12);
        } else {
            throw new IllegalStateException("Unknown height mode is set: ".concat(String.valueOf(mode2)));
        }
        setMeasuredDimension(resolveSizeAndState, resolveSizeAndState2);
    }

    private void lMd(Canvas canvas, boolean z8, boolean z9) {
        int i9;
        int i10;
        int bottom;
        int top;
        int paddingTop = getPaddingTop();
        int max = Math.max(0, (getHeight() - getPaddingBottom()) - paddingTop);
        int size = this.KVG.size();
        for (int i11 = 0; i11 < size; i11++) {
            KS ks = this.KVG.get(i11);
            for (int i12 = 0; i12 < ks.ku; i12++) {
                int i13 = ks.dQp + i12;
                View KS = KS(i13);
                if (KS != null && KS.getVisibility() != 8) {
                    zp zpVar = (zp) KS.getLayoutParams();
                    if (jU(i13, i12)) {
                        if (z9) {
                            top = KS.getBottom() + ((ViewGroup.MarginLayoutParams) zpVar).bottomMargin;
                        } else {
                            top = (KS.getTop() - ((ViewGroup.MarginLayoutParams) zpVar).topMargin) - this.Bj;
                        }
                        lMd(canvas, ks.zp, top, ks.QR);
                    }
                    if (i12 == ks.ku - 1 && (this.YW & 4) > 0) {
                        if (z9) {
                            bottom = (KS.getTop() - ((ViewGroup.MarginLayoutParams) zpVar).topMargin) - this.Bj;
                        } else {
                            bottom = KS.getBottom() + ((ViewGroup.MarginLayoutParams) zpVar).bottomMargin;
                        }
                        lMd(canvas, ks.zp, bottom, ks.QR);
                    }
                }
            }
            if (jU(i11)) {
                if (z8) {
                    i10 = ks.KS;
                } else {
                    i10 = ks.zp - this.vDp;
                }
                zp(canvas, i10, paddingTop, max);
            }
            if (HWF(i11) && (this.dT & 4) > 0) {
                if (z8) {
                    i9 = ks.zp - this.vDp;
                } else {
                    i9 = ks.KS;
                }
                zp(canvas, i9, paddingTop, max);
            }
        }
    }

    @Override // com.bytedance.adsdk.ugeno.component.flexbox.zp
    public boolean zp() {
        int i9 = this.zp;
        return i9 == 0 || i9 == 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0181  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void zp(boolean r29, int r30, int r31, int r32, int r33) {
        /*
            Method dump skipped, instructions count: 556
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.ugeno.component.flexbox.FlexboxLayout.zp(boolean, int, int, int, int):void");
    }

    private void lMd(Canvas canvas, int i9, int i10, int i11) {
        Drawable drawable = this.QR;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(i9, i10, i11 + i9, this.Bj + i10);
        this.QR.draw(canvas);
    }

    @Override // com.bytedance.adsdk.ugeno.component.flexbox.zp
    public int lMd(int i9, int i10, int i11) {
        return ViewGroup.getChildMeasureSpec(i9, i10, i11);
    }

    private void lMd() {
        if (this.QR == null && this.ku == null) {
            setWillNotDraw(true);
        } else {
            setWillNotDraw(false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x017b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void zp(boolean r30, boolean r31, int r32, int r33, int r34, int r35) {
        /*
            Method dump skipped, instructions count: 538
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.ugeno.component.flexbox.FlexboxLayout.zp(boolean, boolean, int, int, int, int):void");
    }

    private void zp(Canvas canvas, boolean z8, boolean z9) {
        int i9;
        int i10;
        int right;
        int left;
        int paddingLeft = getPaddingLeft();
        int max = Math.max(0, (getWidth() - getPaddingRight()) - paddingLeft);
        int size = this.KVG.size();
        for (int i11 = 0; i11 < size; i11++) {
            KS ks = this.KVG.get(i11);
            for (int i12 = 0; i12 < ks.ku; i12++) {
                int i13 = ks.dQp + i12;
                View KS = KS(i13);
                if (KS != null && KS.getVisibility() != 8) {
                    zp zpVar = (zp) KS.getLayoutParams();
                    if (jU(i13, i12)) {
                        if (z8) {
                            left = KS.getRight() + ((ViewGroup.MarginLayoutParams) zpVar).rightMargin;
                        } else {
                            left = (KS.getLeft() - ((ViewGroup.MarginLayoutParams) zpVar).leftMargin) - this.vDp;
                        }
                        zp(canvas, left, ks.lMd, ks.QR);
                    }
                    if (i12 == ks.ku - 1 && (this.dT & 4) > 0) {
                        if (z8) {
                            right = (KS.getLeft() - ((ViewGroup.MarginLayoutParams) zpVar).leftMargin) - this.vDp;
                        } else {
                            right = KS.getRight() + ((ViewGroup.MarginLayoutParams) zpVar).rightMargin;
                        }
                        zp(canvas, right, ks.lMd, ks.QR);
                    }
                }
            }
            if (jU(i11)) {
                if (z9) {
                    i10 = ks.jU;
                } else {
                    i10 = ks.lMd - this.Bj;
                }
                lMd(canvas, paddingLeft, i10, max);
            }
            if (HWF(i11) && (this.YW & 4) > 0) {
                if (z9) {
                    i9 = ks.lMd - this.Bj;
                } else {
                    i9 = ks.jU;
                }
                lMd(canvas, paddingLeft, i9, max);
            }
        }
    }

    private void zp(Canvas canvas, int i9, int i10, int i11) {
        Drawable drawable = this.ku;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(i9, i10, this.vDp + i9, i11 + i10);
        this.ku.draw(canvas);
    }

    @Override // com.bytedance.adsdk.ugeno.component.flexbox.zp
    public int zp(View view, int i9, int i10) {
        int i11;
        int i12;
        if (zp()) {
            i11 = jU(i9, i10) ? this.vDp : 0;
            if ((this.dT & 4) <= 0) {
                return i11;
            }
            i12 = this.vDp;
        } else {
            i11 = jU(i9, i10) ? this.Bj : 0;
            if ((this.YW & 4) <= 0) {
                return i11;
            }
            i12 = this.Bj;
        }
        return i11 + i12;
    }

    @Override // com.bytedance.adsdk.ugeno.component.flexbox.zp
    public void zp(KS ks) {
        if (zp()) {
            if ((this.dT & 4) > 0) {
                int i9 = ks.COT;
                int i10 = this.vDp;
                ks.COT = i9 + i10;
                ks.HWF += i10;
                return;
            }
            return;
        }
        if ((this.YW & 4) > 0) {
            int i11 = ks.COT;
            int i12 = this.Bj;
            ks.COT = i11 + i12;
            ks.HWF += i12;
        }
    }

    @Override // com.bytedance.adsdk.ugeno.component.flexbox.zp
    public int zp(int i9, int i10, int i11) {
        return ViewGroup.getChildMeasureSpec(i9, i10, i11);
    }

    @Override // com.bytedance.adsdk.ugeno.component.flexbox.zp
    public void zp(View view, int i9, int i10, KS ks) {
        if (jU(i9, i10)) {
            if (zp()) {
                int i11 = ks.COT;
                int i12 = this.vDp;
                ks.COT = i11 + i12;
                ks.HWF += i12;
                return;
            }
            int i13 = ks.COT;
            int i14 = this.Bj;
            ks.COT = i13 + i14;
            ks.HWF += i14;
        }
    }

    public void zp(com.bytedance.adsdk.ugeno.component.lMd lmd) {
        this.woN = lmd;
    }
}
