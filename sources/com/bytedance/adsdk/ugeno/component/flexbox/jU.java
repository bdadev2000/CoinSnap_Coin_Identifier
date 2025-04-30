package com.bytedance.adsdk.ugeno.component.flexbox;

import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import com.bytedance.adsdk.ugeno.lMd.HWF;
import com.mbridge.msdk.foundation.entity.o;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
class jU {
    static final /* synthetic */ boolean KS = true;
    private boolean[] COT;
    private long[] HWF;
    private final com.bytedance.adsdk.ugeno.component.flexbox.zp jU;
    long[] lMd;
    int[] zp;

    /* loaded from: classes.dex */
    public static class lMd implements Comparable<lMd> {
        int lMd;
        int zp;

        private lMd() {
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Order{order=");
            sb.append(this.lMd);
            sb.append(", index=");
            return o.l(sb, this.zp, '}');
        }

        @Override // java.lang.Comparable
        /* renamed from: zp, reason: merged with bridge method [inline-methods] */
        public int compareTo(lMd lmd) {
            int i9 = this.lMd;
            int i10 = lmd.lMd;
            if (i9 != i10) {
                return i9 - i10;
            }
            return this.zp - lmd.zp;
        }
    }

    /* loaded from: classes.dex */
    public static class zp {
        int lMd;
        List<KS> zp;

        public void zp() {
            this.zp = null;
            this.lMd = 0;
        }
    }

    public jU(com.bytedance.adsdk.ugeno.component.flexbox.zp zpVar) {
        this.jU = zpVar;
    }

    private int COT(com.bytedance.adsdk.ugeno.component.flexbox.lMd lmd, boolean z8) {
        if (z8) {
            return lmd.rV();
        }
        return lmd.tG();
    }

    private int HWF(com.bytedance.adsdk.ugeno.component.flexbox.lMd lmd, boolean z8) {
        if (z8) {
            return lmd.KVG();
        }
        return lmd.dQp();
    }

    private int KS(boolean z8) {
        if (z8) {
            return this.jU.getPaddingTop();
        }
        return this.jU.getPaddingStart();
    }

    private int jU(boolean z8) {
        if (z8) {
            return this.jU.getPaddingBottom();
        }
        return this.jU.getPaddingEnd();
    }

    public int lMd(long j7) {
        return (int) (j7 >> 32);
    }

    public int zp(long j7) {
        return (int) j7;
    }

    public long lMd(int i9, int i10) {
        return (i9 & 4294967295L) | (i10 << 32);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int[] zp(View view, int i9, ViewGroup.LayoutParams layoutParams, SparseIntArray sparseIntArray) {
        int flexItemCount = this.jU.getFlexItemCount();
        List<lMd> lMd2 = lMd(flexItemCount);
        lMd lmd = new lMd();
        if (view != null && (layoutParams instanceof com.bytedance.adsdk.ugeno.component.flexbox.lMd)) {
            lmd.lMd = ((com.bytedance.adsdk.ugeno.component.flexbox.lMd) layoutParams).KS();
        } else {
            lmd.lMd = 1;
        }
        if (i9 != -1 && i9 != flexItemCount) {
            if (i9 < this.jU.getFlexItemCount()) {
                lmd.zp = i9;
                while (i9 < flexItemCount) {
                    lMd2.get(i9).zp++;
                    i9++;
                }
            } else {
                lmd.zp = flexItemCount;
            }
        } else {
            lmd.zp = flexItemCount;
        }
        lMd2.add(lmd);
        return zp(flexItemCount + 1, lMd2, sparseIntArray);
    }

    private int KS(com.bytedance.adsdk.ugeno.component.flexbox.lMd lmd, boolean z8) {
        if (z8) {
            return lmd.tG();
        }
        return lmd.rV();
    }

    private int jU(com.bytedance.adsdk.ugeno.component.flexbox.lMd lmd, boolean z8) {
        if (z8) {
            return lmd.dQp();
        }
        return lmd.KVG();
    }

    private List<lMd> lMd(int i9) {
        ArrayList arrayList = new ArrayList(i9);
        for (int i10 = 0; i10 < i9; i10++) {
            com.bytedance.adsdk.ugeno.component.flexbox.lMd lmd = (com.bytedance.adsdk.ugeno.component.flexbox.lMd) this.jU.zp(i10).getLayoutParams();
            lMd lmd2 = new lMd();
            lmd2.lMd = lmd.KS();
            lmd2.zp = i10;
            arrayList.add(lmd2);
        }
        return arrayList;
    }

    private void KS(int i9) {
        boolean[] zArr = this.COT;
        if (zArr == null) {
            this.COT = new boolean[Math.max(i9, 10)];
        } else if (zArr.length < i9) {
            this.COT = new boolean[Math.max(zArr.length * 2, i9)];
        } else {
            Arrays.fill(zArr, false);
        }
    }

    public boolean lMd(SparseIntArray sparseIntArray) {
        int flexItemCount = this.jU.getFlexItemCount();
        if (sparseIntArray.size() != flexItemCount) {
            return true;
        }
        for (int i9 = 0; i9 < flexItemCount; i9++) {
            View zp2 = this.jU.zp(i9);
            if (zp2 != null && ((com.bytedance.adsdk.ugeno.component.flexbox.lMd) zp2.getLayoutParams()).KS() != sparseIntArray.get(i9)) {
                return true;
            }
        }
        return false;
    }

    public void lMd(zp zpVar, int i9, int i10) {
        zp(zpVar, i10, i9, Integer.MAX_VALUE, 0, -1, (List<KS>) null);
    }

    private int lMd(boolean z8) {
        if (z8) {
            return this.jU.getPaddingEnd();
        }
        return this.jU.getPaddingBottom();
    }

    public int[] zp(SparseIntArray sparseIntArray) {
        int flexItemCount = this.jU.getFlexItemCount();
        return zp(flexItemCount, lMd(flexItemCount), sparseIntArray);
    }

    private int lMd(View view, boolean z8) {
        if (z8) {
            return view.getMeasuredHeight();
        }
        return view.getMeasuredWidth();
    }

    private int[] zp(int i9, List<lMd> list, SparseIntArray sparseIntArray) {
        Collections.sort(list);
        sparseIntArray.clear();
        int[] iArr = new int[i9];
        int i10 = 0;
        for (lMd lmd : list) {
            int i11 = lmd.zp;
            iArr[i10] = i11;
            sparseIntArray.append(i11, lmd.lMd);
            i10++;
        }
        return iArr;
    }

    private int lMd(com.bytedance.adsdk.ugeno.component.flexbox.lMd lmd, boolean z8) {
        if (z8) {
            return lmd.lMd();
        }
        return lmd.zp();
    }

    private void lMd(int i9, int i10, KS ks, int i11, int i12, boolean z8) {
        int i13;
        int i14;
        int i15;
        int i16 = ks.COT;
        float f9 = ks.Bj;
        float f10 = 0.0f;
        if (f9 <= 0.0f || i11 > i16) {
            return;
        }
        float f11 = (i16 - i11) / f9;
        ks.COT = i12 + ks.HWF;
        if (!z8) {
            ks.QR = Integer.MIN_VALUE;
        }
        int i17 = 0;
        boolean z9 = false;
        int i18 = 0;
        float f12 = 0.0f;
        while (i17 < ks.ku) {
            int i19 = ks.dQp + i17;
            View lMd2 = this.jU.lMd(i19);
            if (lMd2 == null || lMd2.getVisibility() == 8) {
                i13 = i16;
                i14 = i17;
            } else {
                com.bytedance.adsdk.ugeno.component.flexbox.lMd lmd = (com.bytedance.adsdk.ugeno.component.flexbox.lMd) lMd2.getLayoutParams();
                int flexDirection = this.jU.getFlexDirection();
                if (flexDirection != 0 && flexDirection != 1) {
                    int measuredHeight = lMd2.getMeasuredHeight();
                    long[] jArr = this.HWF;
                    if (jArr != null) {
                        measuredHeight = lMd(jArr[i19]);
                    }
                    int measuredWidth = lMd2.getMeasuredWidth();
                    long[] jArr2 = this.HWF;
                    if (jArr2 != null) {
                        measuredWidth = zp(jArr2[i19]);
                    }
                    if (this.COT[i19] || lmd.COT() <= f10) {
                        i13 = i16;
                        i14 = i17;
                    } else {
                        float COT = measuredHeight - (lmd.COT() * f11);
                        if (i17 == ks.ku - 1) {
                            COT += f12;
                            f12 = f10;
                        }
                        int round = Math.round(COT);
                        if (round < lmd.ku()) {
                            round = lmd.ku();
                            this.COT[i19] = true;
                            ks.Bj -= lmd.COT();
                            i13 = i16;
                            i14 = i17;
                            z9 = true;
                        } else {
                            float f13 = (COT - round) + f12;
                            i13 = i16;
                            i14 = i17;
                            double d2 = f13;
                            if (d2 > 1.0d) {
                                round++;
                                f13 -= 1.0f;
                            } else if (d2 < -1.0d) {
                                round--;
                                f13 += 1.0f;
                            }
                            f12 = f13;
                        }
                        int zp2 = zp(i9, lmd, ks.tG);
                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(round, 1073741824);
                        lMd2.measure(zp2, makeMeasureSpec);
                        measuredWidth = lMd2.getMeasuredWidth();
                        int measuredHeight2 = lMd2.getMeasuredHeight();
                        zp(i19, zp2, makeMeasureSpec, lMd2);
                        measuredHeight = measuredHeight2;
                    }
                    i15 = Math.max(i18, lmd.dQp() + lmd.tG() + measuredWidth + this.jU.zp(lMd2));
                    ks.COT = lmd.KVG() + lmd.rV() + measuredHeight + ks.COT;
                } else {
                    i13 = i16;
                    int i20 = i17;
                    int measuredWidth2 = lMd2.getMeasuredWidth();
                    long[] jArr3 = this.HWF;
                    if (jArr3 != null) {
                        measuredWidth2 = zp(jArr3[i19]);
                    }
                    int measuredHeight3 = lMd2.getMeasuredHeight();
                    long[] jArr4 = this.HWF;
                    if (jArr4 != null) {
                        measuredHeight3 = lMd(jArr4[i19]);
                    }
                    if (this.COT[i19] || lmd.COT() <= 0.0f) {
                        i14 = i20;
                    } else {
                        float COT2 = measuredWidth2 - (lmd.COT() * f11);
                        i14 = i20;
                        if (i14 == ks.ku - 1) {
                            COT2 += f12;
                            f12 = 0.0f;
                        }
                        int round2 = Math.round(COT2);
                        if (round2 < lmd.QR()) {
                            round2 = lmd.QR();
                            this.COT[i19] = true;
                            ks.Bj -= lmd.COT();
                            z9 = true;
                        } else {
                            float f14 = (COT2 - round2) + f12;
                            double d9 = f14;
                            if (d9 > 1.0d) {
                                round2++;
                                f14 -= 1.0f;
                            } else if (d9 < -1.0d) {
                                round2--;
                                f14 += 1.0f;
                            }
                            f12 = f14;
                        }
                        int lMd3 = lMd(i10, lmd, ks.tG);
                        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(round2, 1073741824);
                        lMd2.measure(makeMeasureSpec2, lMd3);
                        int measuredWidth3 = lMd2.getMeasuredWidth();
                        int measuredHeight4 = lMd2.getMeasuredHeight();
                        zp(i19, makeMeasureSpec2, lMd3, lMd2);
                        measuredWidth2 = measuredWidth3;
                        measuredHeight3 = measuredHeight4;
                    }
                    int max = Math.max(i18, lmd.KVG() + lmd.rV() + measuredHeight3 + this.jU.zp(lMd2));
                    ks.COT = lmd.dQp() + lmd.tG() + measuredWidth2 + ks.COT;
                    i15 = max;
                }
                ks.QR = Math.max(ks.QR, i15);
                i18 = i15;
            }
            i17 = i14 + 1;
            i16 = i13;
            f10 = 0.0f;
        }
        int i21 = i16;
        if (!z9 || i21 == ks.COT) {
            return;
        }
        lMd(i9, i10, ks, i11, i12, true);
    }

    public void zp(zp zpVar, int i9, int i10) {
        zp(zpVar, i9, i10, Integer.MAX_VALUE, 0, -1, (List<KS>) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void zp(zp zpVar, int i9, int i10, int i11, int i12, int i13, List<KS> list) {
        int i14;
        zp zpVar2;
        int i15;
        int i16;
        int i17;
        List<KS> list2;
        int i18;
        View view;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27 = i9;
        int i28 = i10;
        int i29 = i13;
        boolean zp2 = this.jU.zp();
        int mode = View.MeasureSpec.getMode(i9);
        int size = View.MeasureSpec.getSize(i9);
        List<KS> arrayList = list == null ? new ArrayList() : list;
        zpVar.zp = arrayList;
        int i30 = i29 == -1 ? 1 : 0;
        int zp3 = zp(zp2);
        int lMd2 = lMd(zp2);
        int KS2 = KS(zp2);
        int jU = jU(zp2);
        KS ks = new KS();
        int i31 = i12;
        ks.dQp = i31;
        int i32 = lMd2 + zp3;
        ks.COT = i32;
        int flexItemCount = this.jU.getFlexItemCount();
        int i33 = i30;
        int i34 = Integer.MIN_VALUE;
        int i35 = 0;
        int i36 = 0;
        int i37 = 0;
        while (true) {
            if (i31 >= flexItemCount) {
                i14 = i36;
                zpVar2 = zpVar;
                break;
            }
            View lMd3 = this.jU.lMd(i31);
            if (lMd3 == null) {
                if (zp(i31, flexItemCount, ks)) {
                    zp(arrayList, ks, i31, i35);
                }
            } else if (lMd3.getVisibility() == 8) {
                ks.YW++;
                ks.ku++;
                if (zp(i31, flexItemCount, ks)) {
                    zp(arrayList, ks, i31, i35);
                }
            } else {
                if (lMd3 instanceof CompoundButton) {
                    zp((CompoundButton) lMd3);
                }
                com.bytedance.adsdk.ugeno.component.flexbox.lMd lmd = (com.bytedance.adsdk.ugeno.component.flexbox.lMd) lMd3.getLayoutParams();
                int i38 = flexItemCount;
                if (lmd.HWF() == 4) {
                    ks.rV.add(Integer.valueOf(i31));
                }
                int zp4 = zp(lmd, zp2);
                if (lmd.vDp() != -1.0f && mode == 1073741824) {
                    zp4 = Math.round(lmd.vDp() * size);
                }
                if (zp2) {
                    int zp5 = this.jU.zp(i27, i32 + KS(lmd, true) + jU(lmd, true), zp4);
                    i15 = size;
                    i16 = mode;
                    int lMd4 = this.jU.lMd(i28, KS2 + jU + COT(lmd, true) + HWF(lmd, true) + i35, lMd(lmd, true));
                    lMd3.measure(zp5, lMd4);
                    zp(i31, zp5, lMd4, lMd3);
                    i17 = zp5;
                } else {
                    i15 = size;
                    i16 = mode;
                    int zp6 = this.jU.zp(i28, KS2 + jU + COT(lmd, false) + HWF(lmd, false) + i35, lMd(lmd, false));
                    int lMd5 = this.jU.lMd(i27, KS(lmd, false) + i32 + jU(lmd, false), zp4);
                    lMd3.measure(zp6, lMd5);
                    zp(i31, zp6, lMd5, lMd3);
                    i17 = lMd5;
                }
                zp(lMd3, i31);
                i36 = View.combineMeasuredStates(i36, lMd3.getMeasuredState());
                int i39 = i35;
                int i40 = i32;
                KS ks2 = ks;
                int i41 = i31;
                list2 = arrayList;
                int i42 = i17;
                if (zp(lMd3, i16, i15, ks.COT, jU(lmd, zp2) + zp(lMd3, zp2) + KS(lmd, zp2), lmd, i41, i37, arrayList.size())) {
                    i31 = i41;
                    if (ks2.lMd() > 0) {
                        zp(list2, ks2, i31 > 0 ? i31 - 1 : 0, i39);
                        i35 = ks2.QR + i39;
                    } else {
                        i35 = i39;
                    }
                    if (zp2) {
                        if (lmd.lMd() == -1) {
                            com.bytedance.adsdk.ugeno.component.flexbox.zp zpVar3 = this.jU;
                            i18 = i10;
                            i19 = -1;
                            view = lMd3;
                            view.measure(i42, zpVar3.lMd(i18, lmd.KVG() + lmd.rV() + zpVar3.getPaddingTop() + this.jU.getPaddingBottom() + i35, lmd.lMd()));
                            zp(view, i31);
                        } else {
                            i18 = i10;
                            view = lMd3;
                            i19 = -1;
                        }
                    } else {
                        i18 = i10;
                        view = lMd3;
                        i19 = -1;
                        if (lmd.zp() == -1) {
                            com.bytedance.adsdk.ugeno.component.flexbox.zp zpVar4 = this.jU;
                            view.measure(zpVar4.zp(i18, lmd.dQp() + lmd.tG() + zpVar4.getPaddingLeft() + this.jU.getPaddingRight() + i35, lmd.zp()), i42);
                            zp(view, i31);
                        }
                    }
                    ks = new KS();
                    i21 = 1;
                    ks.ku = 1;
                    i20 = i40;
                    ks.COT = i20;
                    ks.dQp = i31;
                    i23 = Integer.MIN_VALUE;
                    i22 = 0;
                } else {
                    i18 = i10;
                    i31 = i41;
                    view = lMd3;
                    i19 = -1;
                    ks = ks2;
                    i20 = i40;
                    i21 = 1;
                    ks.ku++;
                    i22 = i37 + 1;
                    i35 = i39;
                    i23 = i34;
                }
                ks.woN = (ks.woN ? 1 : 0) | (lmd.jU() != 0.0f ? i21 : 0);
                ks.vwr = (ks.vwr ? 1 : 0) | (lmd.COT() != 0.0f ? i21 : 0);
                int[] iArr = this.zp;
                if (iArr != null) {
                    iArr[i31] = list2.size();
                }
                ks.COT = zp(view, zp2) + KS(lmd, zp2) + jU(lmd, zp2) + ks.COT;
                ks.dT = lmd.jU() + ks.dT;
                ks.Bj = lmd.COT() + ks.Bj;
                this.jU.zp(view, i31, i22, ks);
                int max = Math.max(i23, lMd(view, zp2) + COT(lmd, zp2) + HWF(lmd, zp2) + this.jU.zp(view));
                ks.QR = Math.max(ks.QR, max);
                if (zp2) {
                    if (this.jU.getFlexWrap() != 2) {
                        ks.vDp = Math.max(ks.vDp, lmd.rV() + view.getBaseline());
                    } else {
                        ks.vDp = Math.max(ks.vDp, lmd.KVG() + (view.getMeasuredHeight() - view.getBaseline()));
                    }
                }
                i24 = i38;
                if (zp(i31, i24, ks)) {
                    zp(list2, ks, i31, i35);
                    i35 += ks.QR;
                }
                i25 = i13;
                if (i25 == i19 || list2.size() <= 0 || list2.get(list2.size() - i21).KVG < i25 || i31 < i25 || i33 != 0) {
                    i26 = i11;
                } else {
                    i35 = -ks.zp();
                    i26 = i11;
                    i33 = i21;
                }
                if (i35 > i26 && i33 != 0) {
                    zpVar2 = zpVar;
                    i14 = i36;
                    break;
                }
                i37 = i22;
                i34 = max;
                i31++;
                i27 = i9;
                flexItemCount = i24;
                i28 = i18;
                i32 = i20;
                arrayList = list2;
                size = i15;
                mode = i16;
                i29 = i25;
            }
            i15 = size;
            i16 = mode;
            i18 = i28;
            i25 = i29;
            i20 = i32;
            list2 = arrayList;
            i24 = flexItemCount;
            i31++;
            i27 = i9;
            flexItemCount = i24;
            i28 = i18;
            i32 = i20;
            arrayList = list2;
            size = i15;
            mode = i16;
            i29 = i25;
        }
        zpVar2.lMd = i14;
    }

    private int lMd(int i9, com.bytedance.adsdk.ugeno.component.flexbox.lMd lmd, int i10) {
        com.bytedance.adsdk.ugeno.component.flexbox.zp zpVar = this.jU;
        int lMd2 = zpVar.lMd(i9, lmd.KVG() + lmd.rV() + zpVar.getPaddingTop() + this.jU.getPaddingBottom() + i10, lmd.lMd());
        int size = View.MeasureSpec.getSize(lMd2);
        if (size > lmd.dT()) {
            return View.MeasureSpec.makeMeasureSpec(lmd.dT(), View.MeasureSpec.getMode(lMd2));
        }
        return size < lmd.ku() ? View.MeasureSpec.makeMeasureSpec(lmd.ku(), View.MeasureSpec.getMode(lMd2)) : lMd2;
    }

    public void lMd(int i9, int i10, int i11) {
        int i12;
        int i13;
        int flexDirection = this.jU.getFlexDirection();
        if (flexDirection != 0 && flexDirection != 1) {
            if (flexDirection != 2 && flexDirection != 3) {
                throw new IllegalArgumentException("Invalid flex direction: ".concat(String.valueOf(flexDirection)));
            }
            i12 = View.MeasureSpec.getMode(i9);
            i13 = View.MeasureSpec.getSize(i9);
        } else {
            int mode = View.MeasureSpec.getMode(i10);
            int size = View.MeasureSpec.getSize(i10);
            i12 = mode;
            i13 = size;
        }
        List<KS> flexLinesInternal = this.jU.getFlexLinesInternal();
        if (i12 == 1073741824) {
            int sumOfCrossSize = this.jU.getSumOfCrossSize() + i11;
            int i14 = 0;
            if (flexLinesInternal.size() == 1) {
                flexLinesInternal.get(0).QR = i13 - i11;
                return;
            }
            if (flexLinesInternal.size() >= 2) {
                int alignContent = this.jU.getAlignContent();
                if (alignContent == 1) {
                    int i15 = i13 - sumOfCrossSize;
                    KS ks = new KS();
                    ks.QR = i15;
                    flexLinesInternal.add(0, ks);
                    return;
                }
                if (alignContent == 2) {
                    this.jU.setFlexLines(zp(flexLinesInternal, i13, sumOfCrossSize));
                    return;
                }
                if (alignContent == 3) {
                    if (sumOfCrossSize < i13) {
                        float size2 = (i13 - sumOfCrossSize) / (flexLinesInternal.size() - 1);
                        ArrayList arrayList = new ArrayList();
                        int size3 = flexLinesInternal.size();
                        float f9 = 0.0f;
                        while (i14 < size3) {
                            arrayList.add(flexLinesInternal.get(i14));
                            if (i14 != flexLinesInternal.size() - 1) {
                                KS ks2 = new KS();
                                if (i14 == flexLinesInternal.size() - 2) {
                                    ks2.QR = Math.round(f9 + size2);
                                    f9 = 0.0f;
                                } else {
                                    ks2.QR = Math.round(size2);
                                }
                                int i16 = ks2.QR;
                                float f10 = (size2 - i16) + f9;
                                if (f10 > 1.0f) {
                                    ks2.QR = i16 + 1;
                                    f10 -= 1.0f;
                                } else if (f10 < -1.0f) {
                                    ks2.QR = i16 - 1;
                                    f10 += 1.0f;
                                }
                                f9 = f10;
                                arrayList.add(ks2);
                            }
                            i14++;
                        }
                        this.jU.setFlexLines(arrayList);
                        return;
                    }
                    return;
                }
                if (alignContent == 4) {
                    if (sumOfCrossSize >= i13) {
                        this.jU.setFlexLines(zp(flexLinesInternal, i13, sumOfCrossSize));
                        return;
                    }
                    int size4 = (i13 - sumOfCrossSize) / (flexLinesInternal.size() * 2);
                    ArrayList arrayList2 = new ArrayList();
                    KS ks3 = new KS();
                    ks3.QR = size4;
                    for (KS ks4 : flexLinesInternal) {
                        arrayList2.add(ks3);
                        arrayList2.add(ks4);
                        arrayList2.add(ks3);
                    }
                    this.jU.setFlexLines(arrayList2);
                    return;
                }
                if (alignContent == 5 && sumOfCrossSize < i13) {
                    float size5 = (i13 - sumOfCrossSize) / flexLinesInternal.size();
                    int size6 = flexLinesInternal.size();
                    float f11 = 0.0f;
                    while (i14 < size6) {
                        KS ks5 = flexLinesInternal.get(i14);
                        float f12 = ks5.QR + size5;
                        if (i14 == flexLinesInternal.size() - 1) {
                            f12 += f11;
                            f11 = 0.0f;
                        }
                        int round = Math.round(f12);
                        float f13 = (f12 - round) + f11;
                        if (f13 > 1.0f) {
                            round++;
                            f13 -= 1.0f;
                        } else if (f13 < -1.0f) {
                            round--;
                            f13 += 1.0f;
                        }
                        f11 = f13;
                        ks5.QR = round;
                        i14++;
                    }
                }
            }
        }
    }

    private void zp(CompoundButton compoundButton) {
        com.bytedance.adsdk.ugeno.component.flexbox.lMd lmd = (com.bytedance.adsdk.ugeno.component.flexbox.lMd) compoundButton.getLayoutParams();
        int QR = lmd.QR();
        int ku = lmd.ku();
        Drawable zp2 = com.bytedance.adsdk.ugeno.lMd.COT.zp(compoundButton);
        int minimumWidth = zp2 == null ? 0 : zp2.getMinimumWidth();
        int minimumHeight = zp2 != null ? zp2.getMinimumHeight() : 0;
        if (QR == -1) {
            QR = minimumWidth;
        }
        lmd.zp(QR);
        if (ku == -1) {
            ku = minimumHeight;
        }
        lmd.lMd(ku);
    }

    private int zp(boolean z8) {
        if (z8) {
            return this.jU.getPaddingStart();
        }
        return this.jU.getPaddingTop();
    }

    private int zp(View view, boolean z8) {
        if (z8) {
            return view.getMeasuredWidth();
        }
        return view.getMeasuredHeight();
    }

    private void lMd(View view, int i9, int i10) {
        int measuredHeight;
        com.bytedance.adsdk.ugeno.component.flexbox.lMd lmd = (com.bytedance.adsdk.ugeno.component.flexbox.lMd) view.getLayoutParams();
        int min = Math.min(Math.max(((i9 - lmd.tG()) - lmd.dQp()) - this.jU.zp(view), lmd.QR()), lmd.YW());
        long[] jArr = this.HWF;
        if (jArr != null) {
            measuredHeight = lMd(jArr[i10]);
        } else {
            measuredHeight = view.getMeasuredHeight();
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(min, 1073741824);
        view.measure(makeMeasureSpec2, makeMeasureSpec);
        zp(i10, makeMeasureSpec2, makeMeasureSpec, view);
    }

    private int zp(com.bytedance.adsdk.ugeno.component.flexbox.lMd lmd, boolean z8) {
        if (z8) {
            return lmd.zp();
        }
        return lmd.lMd();
    }

    private boolean zp(View view, int i9, int i10, int i11, int i12, com.bytedance.adsdk.ugeno.component.flexbox.lMd lmd, int i13, int i14, int i15) {
        if (this.jU.getFlexWrap() == 0) {
            return false;
        }
        if (lmd.Bj()) {
            return true;
        }
        if (i9 == 0) {
            return false;
        }
        int maxLine = this.jU.getMaxLine();
        if (maxLine != -1 && maxLine <= i15 + 1) {
            return false;
        }
        int zp2 = this.jU.zp(view, i13, i14);
        if (zp2 > 0) {
            i12 += zp2;
        }
        return i10 < i11 + i12;
    }

    private boolean zp(int i9, int i10, KS ks) {
        return i9 == i10 - 1 && ks.lMd() != 0;
    }

    private void zp(List<KS> list, KS ks, int i9, int i10) {
        ks.tG = i10;
        this.jU.zp(ks);
        ks.KVG = i9;
        list.add(ks);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void zp(android.view.View r7, int r8) {
        /*
            r6 = this;
            android.view.ViewGroup$LayoutParams r0 = r7.getLayoutParams()
            com.bytedance.adsdk.ugeno.component.flexbox.lMd r0 = (com.bytedance.adsdk.ugeno.component.flexbox.lMd) r0
            int r1 = r7.getMeasuredWidth()
            int r2 = r7.getMeasuredHeight()
            int r3 = r0.QR()
            r4 = 1
            if (r1 >= r3) goto L1b
            int r1 = r0.QR()
        L19:
            r3 = r4
            goto L27
        L1b:
            int r3 = r0.YW()
            if (r1 <= r3) goto L26
            int r1 = r0.YW()
            goto L19
        L26:
            r3 = 0
        L27:
            int r5 = r0.ku()
            if (r2 >= r5) goto L32
            int r2 = r0.ku()
            goto L3e
        L32:
            int r5 = r0.dT()
            if (r2 <= r5) goto L3d
            int r2 = r0.dT()
            goto L3e
        L3d:
            r4 = r3
        L3e:
            if (r4 == 0) goto L50
            r0 = 1073741824(0x40000000, float:2.0)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r0)
            r7.measure(r1, r0)
            r6.zp(r8, r1, r0, r7)
        L50:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.ugeno.component.flexbox.jU.zp(android.view.View, int):void");
    }

    public void zp(int i9, int i10) {
        zp(i9, i10, 0);
    }

    public void zp(int i9, int i10, int i11) {
        int size;
        int paddingLeft;
        int paddingRight;
        KS(this.jU.getFlexItemCount());
        if (i11 >= this.jU.getFlexItemCount()) {
            return;
        }
        int flexDirection = this.jU.getFlexDirection();
        int flexDirection2 = this.jU.getFlexDirection();
        if (flexDirection2 != 0 && flexDirection2 != 1) {
            if (flexDirection2 != 2 && flexDirection2 != 3) {
                throw new IllegalArgumentException("Invalid flex direction: ".concat(String.valueOf(flexDirection)));
            }
            int mode = View.MeasureSpec.getMode(i10);
            size = View.MeasureSpec.getSize(i10);
            if (mode != 1073741824) {
                size = this.jU.getLargestMainSize();
            }
            paddingLeft = this.jU.getPaddingTop();
            paddingRight = this.jU.getPaddingBottom();
        } else {
            int mode2 = View.MeasureSpec.getMode(i9);
            size = View.MeasureSpec.getSize(i9);
            int largestMainSize = this.jU.getLargestMainSize();
            if (mode2 != 1073741824) {
                size = Math.min(largestMainSize, size);
            }
            paddingLeft = this.jU.getPaddingLeft();
            paddingRight = this.jU.getPaddingRight();
        }
        int i12 = paddingLeft + paddingRight;
        int[] iArr = this.zp;
        List<KS> flexLinesInternal = this.jU.getFlexLinesInternal();
        int size2 = flexLinesInternal.size();
        for (int i13 = iArr != null ? iArr[i11] : 0; i13 < size2; i13++) {
            KS ks = flexLinesInternal.get(i13);
            int i14 = ks.COT;
            if (i14 < size && ks.woN) {
                zp(i9, i10, ks, size, i12, false);
            } else if (i14 > size && ks.vwr) {
                lMd(i9, i10, ks, size, i12, false);
            }
        }
    }

    private void zp(int i9, int i10, KS ks, int i11, int i12, boolean z8) {
        int i13;
        int i14;
        int i15;
        double d2;
        int i16;
        double d9;
        float f9 = ks.dT;
        float f10 = 0.0f;
        if (f9 <= 0.0f || i11 < (i13 = ks.COT)) {
            return;
        }
        float f11 = (i11 - i13) / f9;
        ks.COT = i12 + ks.HWF;
        if (!z8) {
            ks.QR = Integer.MIN_VALUE;
        }
        int i17 = 0;
        boolean z9 = false;
        int i18 = 0;
        float f12 = 0.0f;
        while (i17 < ks.ku) {
            int i19 = ks.dQp + i17;
            View lMd2 = this.jU.lMd(i19);
            if (lMd2 == null || lMd2.getVisibility() == 8) {
                i14 = i13;
            } else {
                com.bytedance.adsdk.ugeno.component.flexbox.lMd lmd = (com.bytedance.adsdk.ugeno.component.flexbox.lMd) lMd2.getLayoutParams();
                int flexDirection = this.jU.getFlexDirection();
                if (flexDirection != 0 && flexDirection != 1) {
                    int measuredHeight = lMd2.getMeasuredHeight();
                    long[] jArr = this.HWF;
                    if (jArr != null) {
                        measuredHeight = lMd(jArr[i19]);
                    }
                    int measuredWidth = lMd2.getMeasuredWidth();
                    long[] jArr2 = this.HWF;
                    if (jArr2 != null) {
                        measuredWidth = zp(jArr2[i19]);
                    }
                    if (this.COT[i19] || lmd.jU() <= f10) {
                        i16 = i13;
                    } else {
                        float jU = (lmd.jU() * f11) + measuredHeight;
                        if (i17 == ks.ku - 1) {
                            jU += f12;
                            f12 = f10;
                        }
                        int round = Math.round(jU);
                        if (round > lmd.dT()) {
                            round = lmd.dT();
                            this.COT[i19] = true;
                            ks.dT -= lmd.jU();
                            i16 = i13;
                            z9 = true;
                        } else {
                            float f13 = (jU - round) + f12;
                            i16 = i13;
                            double d10 = f13;
                            if (d10 > 1.0d) {
                                round++;
                                d9 = d10 - 1.0d;
                            } else if (d10 < -1.0d) {
                                round--;
                                d9 = d10 + 1.0d;
                            } else {
                                f12 = f13;
                            }
                            f12 = (float) d9;
                        }
                        int zp2 = zp(i9, lmd, ks.tG);
                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(round, 1073741824);
                        lMd2.measure(zp2, makeMeasureSpec);
                        measuredWidth = lMd2.getMeasuredWidth();
                        int measuredHeight2 = lMd2.getMeasuredHeight();
                        zp(i19, zp2, makeMeasureSpec, lMd2);
                        measuredHeight = measuredHeight2;
                    }
                    i15 = Math.max(i18, lmd.dQp() + lmd.tG() + measuredWidth + this.jU.zp(lMd2));
                    ks.COT = lmd.KVG() + lmd.rV() + measuredHeight + ks.COT;
                    i14 = i16;
                } else {
                    int i20 = i13;
                    int measuredWidth2 = lMd2.getMeasuredWidth();
                    long[] jArr3 = this.HWF;
                    if (jArr3 != null) {
                        measuredWidth2 = zp(jArr3[i19]);
                    }
                    int measuredHeight3 = lMd2.getMeasuredHeight();
                    long[] jArr4 = this.HWF;
                    i14 = i20;
                    if (jArr4 != null) {
                        measuredHeight3 = lMd(jArr4[i19]);
                    }
                    if (!this.COT[i19] && lmd.jU() > 0.0f) {
                        float jU2 = (lmd.jU() * f11) + measuredWidth2;
                        if (i17 == ks.ku - 1) {
                            jU2 += f12;
                            f12 = 0.0f;
                        }
                        int round2 = Math.round(jU2);
                        if (round2 > lmd.YW()) {
                            round2 = lmd.YW();
                            this.COT[i19] = true;
                            ks.dT -= lmd.jU();
                            z9 = true;
                        } else {
                            float f14 = (jU2 - round2) + f12;
                            double d11 = f14;
                            if (d11 > 1.0d) {
                                round2++;
                                d2 = d11 - 1.0d;
                            } else {
                                if (d11 < -1.0d) {
                                    round2--;
                                    d2 = d11 + 1.0d;
                                }
                                f12 = f14;
                            }
                            f14 = (float) d2;
                            f12 = f14;
                        }
                        int lMd3 = lMd(i10, lmd, ks.tG);
                        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(round2, 1073741824);
                        lMd2.measure(makeMeasureSpec2, lMd3);
                        int measuredWidth3 = lMd2.getMeasuredWidth();
                        int measuredHeight4 = lMd2.getMeasuredHeight();
                        zp(i19, makeMeasureSpec2, lMd3, lMd2);
                        measuredWidth2 = measuredWidth3;
                        measuredHeight3 = measuredHeight4;
                    }
                    int max = Math.max(i18, lmd.KVG() + lmd.rV() + measuredHeight3 + this.jU.zp(lMd2));
                    ks.COT = lmd.dQp() + lmd.tG() + measuredWidth2 + ks.COT;
                    i15 = max;
                }
                ks.QR = Math.max(ks.QR, i15);
                i18 = i15;
            }
            i17++;
            i13 = i14;
            f10 = 0.0f;
        }
        int i21 = i13;
        if (!z9 || i21 == ks.COT) {
            return;
        }
        zp(i9, i10, ks, i11, i12, true);
    }

    private int zp(int i9, com.bytedance.adsdk.ugeno.component.flexbox.lMd lmd, int i10) {
        com.bytedance.adsdk.ugeno.component.flexbox.zp zpVar = this.jU;
        int zp2 = zpVar.zp(i9, lmd.dQp() + lmd.tG() + zpVar.getPaddingLeft() + this.jU.getPaddingRight() + i10, lmd.zp());
        int size = View.MeasureSpec.getSize(zp2);
        if (size > lmd.YW()) {
            return View.MeasureSpec.makeMeasureSpec(lmd.YW(), View.MeasureSpec.getMode(zp2));
        }
        return size < lmd.QR() ? View.MeasureSpec.makeMeasureSpec(lmd.QR(), View.MeasureSpec.getMode(zp2)) : zp2;
    }

    private List<KS> zp(List<KS> list, int i9, int i10) {
        int i11 = (i9 - i10) / 2;
        ArrayList arrayList = new ArrayList();
        KS ks = new KS();
        ks.QR = i11;
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            if (i12 == 0) {
                arrayList.add(ks);
            }
            arrayList.add(list.get(i12));
            if (i12 == list.size() - 1) {
                arrayList.add(ks);
            }
        }
        return arrayList;
    }

    public void zp() {
        zp(0);
    }

    public void zp(int i9) {
        View lMd2;
        if (i9 >= this.jU.getFlexItemCount()) {
            return;
        }
        int flexDirection = this.jU.getFlexDirection();
        if (this.jU.getAlignItems() == 4) {
            int[] iArr = this.zp;
            List<KS> flexLinesInternal = this.jU.getFlexLinesInternal();
            int size = flexLinesInternal.size();
            for (int i10 = iArr != null ? iArr[i9] : 0; i10 < size; i10++) {
                KS ks = flexLinesInternal.get(i10);
                int i11 = ks.ku;
                for (int i12 = 0; i12 < i11; i12++) {
                    int i13 = ks.dQp + i12;
                    if (i12 < this.jU.getFlexItemCount() && (lMd2 = this.jU.lMd(i13)) != null && lMd2.getVisibility() != 8) {
                        com.bytedance.adsdk.ugeno.component.flexbox.lMd lmd = (com.bytedance.adsdk.ugeno.component.flexbox.lMd) lMd2.getLayoutParams();
                        if (lmd.HWF() == -1 || lmd.HWF() == 4) {
                            if (flexDirection != 0 && flexDirection != 1) {
                                if (flexDirection != 2 && flexDirection != 3) {
                                    throw new IllegalArgumentException("Invalid flex direction: ".concat(String.valueOf(flexDirection)));
                                }
                                lMd(lMd2, ks.QR, i13);
                            } else {
                                zp(lMd2, ks.QR, i13);
                            }
                        }
                    }
                }
            }
            return;
        }
        for (KS ks2 : this.jU.getFlexLinesInternal()) {
            for (Integer num : ks2.rV) {
                View lMd3 = this.jU.lMd(num.intValue());
                if (flexDirection != 0 && flexDirection != 1) {
                    if (flexDirection != 2 && flexDirection != 3) {
                        throw new IllegalArgumentException("Invalid flex direction: ".concat(String.valueOf(flexDirection)));
                    }
                    lMd(lMd3, ks2.QR, num.intValue());
                } else {
                    zp(lMd3, ks2.QR, num.intValue());
                }
            }
        }
    }

    private void zp(View view, int i9, int i10) {
        int measuredWidth;
        com.bytedance.adsdk.ugeno.component.flexbox.lMd lmd = (com.bytedance.adsdk.ugeno.component.flexbox.lMd) view.getLayoutParams();
        int min = Math.min(Math.max(((i9 - lmd.rV()) - lmd.KVG()) - this.jU.zp(view), lmd.ku()), lmd.dT());
        long[] jArr = this.HWF;
        if (jArr != null) {
            measuredWidth = zp(jArr[i10]);
        } else {
            measuredWidth = view.getMeasuredWidth();
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(min, 1073741824);
        view.measure(makeMeasureSpec, makeMeasureSpec2);
        zp(i10, makeMeasureSpec, makeMeasureSpec2, view);
    }

    public void zp(View view, KS ks, int i9, int i10, int i11, int i12) {
        com.bytedance.adsdk.ugeno.component.flexbox.lMd lmd = (com.bytedance.adsdk.ugeno.component.flexbox.lMd) view.getLayoutParams();
        int alignItems = this.jU.getAlignItems();
        if (lmd.HWF() != -1) {
            alignItems = lmd.HWF();
        }
        int i13 = ks.QR;
        if (alignItems != 0) {
            if (alignItems == 1) {
                if (this.jU.getFlexWrap() != 2) {
                    int i14 = i10 + i13;
                    view.layout(i9, (i14 - view.getMeasuredHeight()) - lmd.KVG(), i11, i14 - lmd.KVG());
                    return;
                }
                view.layout(i9, lmd.rV() + view.getMeasuredHeight() + (i10 - i13), i11, lmd.rV() + view.getMeasuredHeight() + (i12 - i13));
                return;
            }
            if (alignItems == 2) {
                int rV = ((lmd.rV() + (i13 - view.getMeasuredHeight())) - lmd.KVG()) / 2;
                if (this.jU.getFlexWrap() != 2) {
                    int i15 = i10 + rV;
                    view.layout(i9, i15, i11, view.getMeasuredHeight() + i15);
                    return;
                } else {
                    int i16 = i10 - rV;
                    view.layout(i9, i16, i11, view.getMeasuredHeight() + i16);
                    return;
                }
            }
            if (alignItems == 3) {
                if (this.jU.getFlexWrap() != 2) {
                    int max = Math.max(ks.vDp - view.getBaseline(), lmd.rV());
                    view.layout(i9, i10 + max, i11, i12 + max);
                    return;
                } else {
                    int max2 = Math.max(view.getBaseline() + (ks.vDp - view.getMeasuredHeight()), lmd.KVG());
                    view.layout(i9, i10 - max2, i11, i12 - max2);
                    return;
                }
            }
            if (alignItems != 4) {
                return;
            }
        }
        if (this.jU.getFlexWrap() != 2) {
            view.layout(i9, lmd.rV() + i10, i11, lmd.rV() + i12);
        } else {
            view.layout(i9, i10 - lmd.KVG(), i11, i12 - lmd.KVG());
        }
    }

    public void zp(View view, KS ks, boolean z8, int i9, int i10, int i11, int i12) {
        com.bytedance.adsdk.ugeno.component.flexbox.lMd lmd = (com.bytedance.adsdk.ugeno.component.flexbox.lMd) view.getLayoutParams();
        int alignItems = this.jU.getAlignItems();
        if (lmd.HWF() != -1) {
            alignItems = lmd.HWF();
        }
        int i13 = ks.QR;
        if (alignItems != 0) {
            if (alignItems == 1) {
                if (!z8) {
                    view.layout(((i9 + i13) - view.getMeasuredWidth()) - lmd.dQp(), i10, ((i11 + i13) - view.getMeasuredWidth()) - lmd.dQp(), i12);
                    return;
                }
                view.layout(lmd.tG() + view.getMeasuredWidth() + (i9 - i13), i10, lmd.tG() + view.getMeasuredWidth() + (i11 - i13), i12);
                return;
            }
            if (alignItems == 2) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                int zp2 = ((HWF.zp(marginLayoutParams) + (i13 - view.getMeasuredWidth())) - HWF.lMd(marginLayoutParams)) / 2;
                if (!z8) {
                    view.layout(i9 + zp2, i10, i11 + zp2, i12);
                    return;
                } else {
                    view.layout(i9 - zp2, i10, i11 - zp2, i12);
                    return;
                }
            }
            if (alignItems != 3 && alignItems != 4) {
                return;
            }
        }
        if (!z8) {
            view.layout(lmd.tG() + i9, i10, lmd.tG() + i11, i12);
        } else {
            view.layout(i9 - lmd.dQp(), i10, i11 - lmd.dQp(), i12);
        }
    }

    private void zp(int i9, int i10, int i11, View view) {
        long[] jArr = this.lMd;
        if (jArr != null) {
            jArr[i9] = lMd(i10, i11);
        }
        long[] jArr2 = this.HWF;
        if (jArr2 != null) {
            jArr2[i9] = lMd(view.getMeasuredWidth(), view.getMeasuredHeight());
        }
    }
}
