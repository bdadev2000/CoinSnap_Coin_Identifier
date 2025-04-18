package com.bytedance.adsdk.ugeno.wN;

import a4.j;
import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes.dex */
class AlY {
    static final /* synthetic */ boolean tN = true;
    private final com.bytedance.adsdk.ugeno.wN.YFl AlY;
    long[] Sg;
    int[] YFl;

    /* renamed from: vc, reason: collision with root package name */
    private long[] f10288vc;
    private boolean[] wN;

    /* loaded from: classes.dex */
    public static class Sg implements Comparable<Sg> {
        int Sg;
        int YFl;

        private Sg() {
        }

        @Override // java.lang.Comparable
        /* renamed from: YFl, reason: merged with bridge method [inline-methods] */
        public int compareTo(Sg sg2) {
            int i10 = this.Sg;
            int i11 = sg2.Sg;
            if (i10 != i11) {
                return i10 - i11;
            }
            return this.YFl - sg2.YFl;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("Order{order=");
            sb2.append(this.Sg);
            sb2.append(", index=");
            return j.i(sb2, this.YFl, AbstractJsonLexerKt.END_OBJ);
        }
    }

    /* loaded from: classes.dex */
    public static class YFl {
        int Sg;
        List<tN> YFl;

        public void YFl() {
            this.YFl = null;
            this.Sg = 0;
        }
    }

    public AlY(com.bytedance.adsdk.ugeno.wN.YFl yFl) {
        this.AlY = yFl;
    }

    private int AlY(boolean z10) {
        if (z10) {
            return this.AlY.getPaddingBottom();
        }
        return this.AlY.getPaddingEnd();
    }

    private int tN(boolean z10) {
        if (z10) {
            return this.AlY.getPaddingTop();
        }
        return this.AlY.getPaddingStart();
    }

    private int vc(com.bytedance.adsdk.ugeno.wN.Sg sg2, boolean z10) {
        if (z10) {
            return sg2.rkt();
        }
        return sg2.EH();
    }

    private int wN(com.bytedance.adsdk.ugeno.wN.Sg sg2, boolean z10) {
        if (z10) {
            return sg2.pDU();
        }
        return sg2.GA();
    }

    public int Sg(long j3) {
        return (int) (j3 >> 32);
    }

    public int YFl(long j3) {
        return (int) j3;
    }

    public long Sg(int i10, int i11) {
        return (i10 & 4294967295L) | (i11 << 32);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int[] YFl(View view, int i10, ViewGroup.LayoutParams layoutParams, SparseIntArray sparseIntArray) {
        int flexItemCount = this.AlY.getFlexItemCount();
        List<Sg> Sg2 = Sg(flexItemCount);
        Sg sg2 = new Sg();
        if (view != null && (layoutParams instanceof com.bytedance.adsdk.ugeno.wN.Sg)) {
            sg2.Sg = ((com.bytedance.adsdk.ugeno.wN.Sg) layoutParams).tN();
        } else {
            sg2.Sg = 1;
        }
        if (i10 != -1 && i10 != flexItemCount) {
            if (i10 < this.AlY.getFlexItemCount()) {
                sg2.YFl = i10;
                while (i10 < flexItemCount) {
                    Sg2.get(i10).YFl++;
                    i10++;
                }
            } else {
                sg2.YFl = flexItemCount;
            }
        } else {
            sg2.YFl = flexItemCount;
        }
        Sg2.add(sg2);
        return YFl(flexItemCount + 1, Sg2, sparseIntArray);
    }

    private int AlY(com.bytedance.adsdk.ugeno.wN.Sg sg2, boolean z10) {
        if (z10) {
            return sg2.EH();
        }
        return sg2.rkt();
    }

    private List<Sg> Sg(int i10) {
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            com.bytedance.adsdk.ugeno.wN.Sg sg2 = (com.bytedance.adsdk.ugeno.wN.Sg) this.AlY.YFl(i11).getLayoutParams();
            Sg sg3 = new Sg();
            sg3.Sg = sg2.tN();
            sg3.YFl = i11;
            arrayList.add(sg3);
        }
        return arrayList;
    }

    private int tN(com.bytedance.adsdk.ugeno.wN.Sg sg2, boolean z10) {
        if (z10) {
            return sg2.GA();
        }
        return sg2.pDU();
    }

    private void tN(int i10) {
        boolean[] zArr = this.wN;
        if (zArr == null) {
            this.wN = new boolean[Math.max(i10, 10)];
        } else if (zArr.length < i10) {
            this.wN = new boolean[Math.max(zArr.length * 2, i10)];
        } else {
            Arrays.fill(zArr, false);
        }
    }

    public boolean Sg(SparseIntArray sparseIntArray) {
        int flexItemCount = this.AlY.getFlexItemCount();
        if (sparseIntArray.size() != flexItemCount) {
            return true;
        }
        for (int i10 = 0; i10 < flexItemCount; i10++) {
            View YFl2 = this.AlY.YFl(i10);
            if (YFl2 != null && ((com.bytedance.adsdk.ugeno.wN.Sg) YFl2.getLayoutParams()).tN() != sparseIntArray.get(i10)) {
                return true;
            }
        }
        return false;
    }

    public void Sg(YFl yFl, int i10, int i11) {
        YFl(yFl, i11, i10, Integer.MAX_VALUE, 0, -1, (List<tN>) null);
    }

    private int Sg(boolean z10) {
        if (z10) {
            return this.AlY.getPaddingEnd();
        }
        return this.AlY.getPaddingBottom();
    }

    public int[] YFl(SparseIntArray sparseIntArray) {
        int flexItemCount = this.AlY.getFlexItemCount();
        return YFl(flexItemCount, Sg(flexItemCount), sparseIntArray);
    }

    private int Sg(View view, boolean z10) {
        if (z10) {
            return view.getMeasuredHeight();
        }
        return view.getMeasuredWidth();
    }

    private int[] YFl(int i10, List<Sg> list, SparseIntArray sparseIntArray) {
        Collections.sort(list);
        sparseIntArray.clear();
        int[] iArr = new int[i10];
        int i11 = 0;
        for (Sg sg2 : list) {
            int i12 = sg2.YFl;
            iArr[i11] = i12;
            sparseIntArray.append(i12, sg2.Sg);
            i11++;
        }
        return iArr;
    }

    private int Sg(com.bytedance.adsdk.ugeno.wN.Sg sg2, boolean z10) {
        if (z10) {
            return sg2.Sg();
        }
        return sg2.YFl();
    }

    private void Sg(int i10, int i11, tN tNVar, int i12, int i13, boolean z10) {
        int i14;
        int i15;
        int i16;
        int i17 = tNVar.wN;
        float f10 = tNVar.eT;
        float f11 = 0.0f;
        if (f10 <= 0.0f || i12 > i17) {
            return;
        }
        float f12 = (i17 - i12) / f10;
        tNVar.wN = i13 + tNVar.f10290vc;
        if (!z10) {
            tNVar.DSW = Integer.MIN_VALUE;
        }
        int i18 = 0;
        boolean z11 = false;
        int i19 = 0;
        float f13 = 0.0f;
        while (i18 < tNVar.qsH) {
            int i20 = tNVar.EH + i18;
            View Sg2 = this.AlY.Sg(i20);
            if (Sg2 == null || Sg2.getVisibility() == 8) {
                i14 = i17;
                i15 = i18;
            } else {
                com.bytedance.adsdk.ugeno.wN.Sg sg2 = (com.bytedance.adsdk.ugeno.wN.Sg) Sg2.getLayoutParams();
                int flexDirection = this.AlY.getFlexDirection();
                if (flexDirection != 0 && flexDirection != 1) {
                    int measuredHeight = Sg2.getMeasuredHeight();
                    long[] jArr = this.f10288vc;
                    if (jArr != null) {
                        measuredHeight = Sg(jArr[i20]);
                    }
                    int measuredWidth = Sg2.getMeasuredWidth();
                    long[] jArr2 = this.f10288vc;
                    if (jArr2 != null) {
                        measuredWidth = YFl(jArr2[i20]);
                    }
                    if (this.wN[i20] || sg2.wN() <= f11) {
                        i14 = i17;
                        i15 = i18;
                    } else {
                        float wN = measuredHeight - (sg2.wN() * f12);
                        if (i18 == tNVar.qsH - 1) {
                            wN += f13;
                            f13 = f11;
                        }
                        int round = Math.round(wN);
                        if (round < sg2.qsH()) {
                            round = sg2.qsH();
                            this.wN[i20] = true;
                            tNVar.eT -= sg2.wN();
                            i14 = i17;
                            i15 = i18;
                            z11 = true;
                        } else {
                            float f14 = (wN - round) + f13;
                            i14 = i17;
                            i15 = i18;
                            double d10 = f14;
                            if (d10 > 1.0d) {
                                round++;
                                f14 -= 1.0f;
                            } else if (d10 < -1.0d) {
                                round--;
                                f14 += 1.0f;
                            }
                            f13 = f14;
                        }
                        int YFl2 = YFl(i10, sg2, tNVar.GA);
                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(round, 1073741824);
                        Sg2.measure(YFl2, makeMeasureSpec);
                        measuredWidth = Sg2.getMeasuredWidth();
                        int measuredHeight2 = Sg2.getMeasuredHeight();
                        YFl(i20, YFl2, makeMeasureSpec, Sg2);
                        measuredHeight = measuredHeight2;
                    }
                    i16 = Math.max(i19, sg2.EH() + sg2.GA() + measuredWidth + this.AlY.YFl(Sg2));
                    tNVar.wN = sg2.rkt() + sg2.pDU() + measuredHeight + tNVar.wN;
                } else {
                    i14 = i17;
                    int i21 = i18;
                    int measuredWidth2 = Sg2.getMeasuredWidth();
                    long[] jArr3 = this.f10288vc;
                    if (jArr3 != null) {
                        measuredWidth2 = YFl(jArr3[i20]);
                    }
                    int measuredHeight3 = Sg2.getMeasuredHeight();
                    long[] jArr4 = this.f10288vc;
                    if (jArr4 != null) {
                        measuredHeight3 = Sg(jArr4[i20]);
                    }
                    if (this.wN[i20] || sg2.wN() <= 0.0f) {
                        i15 = i21;
                    } else {
                        float wN2 = measuredWidth2 - (sg2.wN() * f12);
                        i15 = i21;
                        if (i15 == tNVar.qsH - 1) {
                            wN2 += f13;
                            f13 = 0.0f;
                        }
                        int round2 = Math.round(wN2);
                        if (round2 < sg2.DSW()) {
                            round2 = sg2.DSW();
                            this.wN[i20] = true;
                            tNVar.eT -= sg2.wN();
                            z11 = true;
                        } else {
                            float f15 = (wN2 - round2) + f13;
                            double d11 = f15;
                            if (d11 > 1.0d) {
                                round2++;
                                f15 -= 1.0f;
                            } else if (d11 < -1.0d) {
                                round2--;
                                f15 += 1.0f;
                            }
                            f13 = f15;
                        }
                        int Sg3 = Sg(i11, sg2, tNVar.GA);
                        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(round2, 1073741824);
                        Sg2.measure(makeMeasureSpec2, Sg3);
                        int measuredWidth3 = Sg2.getMeasuredWidth();
                        int measuredHeight4 = Sg2.getMeasuredHeight();
                        YFl(i20, makeMeasureSpec2, Sg3, Sg2);
                        measuredWidth2 = measuredWidth3;
                        measuredHeight3 = measuredHeight4;
                    }
                    int max = Math.max(i19, sg2.rkt() + sg2.pDU() + measuredHeight3 + this.AlY.YFl(Sg2));
                    tNVar.wN = sg2.EH() + sg2.GA() + measuredWidth2 + tNVar.wN;
                    i16 = max;
                }
                tNVar.DSW = Math.max(tNVar.DSW, i16);
                i19 = i16;
            }
            i18 = i15 + 1;
            i17 = i14;
            f11 = 0.0f;
        }
        int i22 = i17;
        if (!z11 || i22 == tNVar.wN) {
            return;
        }
        Sg(i10, i11, tNVar, i12, i13, true);
    }

    public void YFl(YFl yFl, int i10, int i11) {
        YFl(yFl, i10, i11, Integer.MAX_VALUE, 0, -1, (List<tN>) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void YFl(YFl yFl, int i10, int i11, int i12, int i13, int i14, List<tN> list) {
        YFl yFl2;
        int i15;
        int i16;
        int i17;
        int Sg2;
        int combineMeasuredStates;
        List<tN> list2;
        int i18;
        View view;
        int i19;
        tN tNVar;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        tN tNVar2;
        tN tNVar3;
        int i25;
        int i26 = i10;
        boolean YFl2 = this.AlY.YFl();
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        List<tN> arrayList = list == null ? new ArrayList() : list;
        yFl.YFl = arrayList;
        int i27 = i14 == -1 ? 1 : 0;
        int YFl3 = YFl(YFl2);
        int Sg3 = Sg(YFl2);
        int tN2 = tN(YFl2);
        int AlY = AlY(YFl2);
        tN tNVar4 = new tN();
        int i28 = i13;
        tNVar4.EH = i28;
        int i29 = Sg3 + YFl3;
        tNVar4.wN = i29;
        int flexItemCount = this.AlY.getFlexItemCount();
        int i30 = 0;
        int i31 = Integer.MIN_VALUE;
        int i32 = 0;
        int i33 = i27;
        int i34 = i11;
        int i35 = 0;
        tN tNVar5 = tNVar4;
        while (true) {
            if (i28 >= flexItemCount) {
                yFl2 = yFl;
                break;
            }
            View Sg4 = this.AlY.Sg(i28);
            if (Sg4 == null) {
                if (YFl(i28, flexItemCount, tNVar5)) {
                    YFl(arrayList, tNVar5, i28, i35);
                }
            } else if (Sg4.getVisibility() == 8) {
                tNVar5.NjR++;
                tNVar5.qsH++;
                if (YFl(i28, flexItemCount, tNVar5)) {
                    YFl(arrayList, tNVar5, i28, i35);
                }
            } else {
                if (Sg4 instanceof CompoundButton) {
                    YFl((CompoundButton) Sg4);
                }
                com.bytedance.adsdk.ugeno.wN.Sg sg2 = (com.bytedance.adsdk.ugeno.wN.Sg) Sg4.getLayoutParams();
                int i36 = flexItemCount;
                if (sg2.vc() == 4) {
                    tNVar5.pDU.add(Integer.valueOf(i28));
                }
                int YFl4 = YFl(sg2, YFl2);
                if (sg2.YoT() != -1.0f && mode == 1073741824) {
                    YFl4 = Math.round(sg2.YoT() * size);
                }
                if (YFl2) {
                    i15 = size;
                    Sg2 = this.AlY.YFl(i26, i29 + tN(sg2, true) + AlY(sg2, true), YFl4);
                    i16 = mode;
                    int Sg5 = this.AlY.Sg(i34, tN2 + AlY + wN(sg2, true) + vc(sg2, true) + i35, Sg(sg2, true));
                    Sg4.measure(Sg2, Sg5);
                    YFl(i28, Sg2, Sg5, Sg4);
                    i17 = i35;
                } else {
                    i15 = size;
                    i16 = mode;
                    i17 = i35;
                    int YFl5 = this.AlY.YFl(i34, tN2 + AlY + wN(sg2, false) + vc(sg2, false) + i35, Sg(sg2, false));
                    Sg2 = this.AlY.Sg(i26, tN(sg2, false) + i29 + AlY(sg2, false), YFl4);
                    Sg4.measure(YFl5, Sg2);
                    YFl(i28, YFl5, Sg2, Sg4);
                }
                int i37 = Sg2;
                YFl(Sg4, i28);
                combineMeasuredStates = View.combineMeasuredStates(i30, Sg4.getMeasuredState());
                int i38 = tNVar5.wN;
                int YFl6 = YFl(Sg4, YFl2) + tN(sg2, YFl2);
                tN tNVar6 = tNVar5;
                int i39 = i17;
                int i40 = i28;
                int i41 = i29;
                list2 = arrayList;
                if (YFl(Sg4, i16, i15, i38, AlY(sg2, YFl2) + YFl6, sg2, i40, i32, arrayList.size())) {
                    if (tNVar6.Sg() > 0) {
                        i28 = i40;
                        if (i28 > 0) {
                            i25 = i28 - 1;
                            tNVar3 = tNVar6;
                        } else {
                            tNVar3 = tNVar6;
                            i25 = 0;
                        }
                        YFl(list2, tNVar3, i25, i39);
                        i35 = tNVar3.DSW + i39;
                    } else {
                        i28 = i40;
                        i35 = i39;
                    }
                    if (YFl2) {
                        if (sg2.Sg() == -1) {
                            com.bytedance.adsdk.ugeno.wN.YFl yFl3 = this.AlY;
                            i18 = i11;
                            view = Sg4;
                            view.measure(i37, yFl3.Sg(i18, sg2.rkt() + sg2.pDU() + yFl3.getPaddingTop() + this.AlY.getPaddingBottom() + i35, sg2.Sg()));
                            YFl(view, i28);
                        } else {
                            i18 = i11;
                            view = Sg4;
                        }
                    } else {
                        i18 = i11;
                        view = Sg4;
                        if (sg2.YFl() == -1) {
                            com.bytedance.adsdk.ugeno.wN.YFl yFl4 = this.AlY;
                            view.measure(yFl4.YFl(i18, sg2.EH() + sg2.GA() + yFl4.getPaddingLeft() + this.AlY.getPaddingRight() + i35, sg2.YFl()), i37);
                            YFl(view, i28);
                        }
                    }
                    tNVar = new tN();
                    i19 = 1;
                    tNVar.qsH = 1;
                    i29 = i41;
                    tNVar.wN = i29;
                    tNVar.EH = i28;
                    i21 = Integer.MIN_VALUE;
                    i20 = 0;
                } else {
                    i18 = i11;
                    view = Sg4;
                    i28 = i40;
                    i29 = i41;
                    i19 = 1;
                    tNVar6.qsH++;
                    tNVar = tNVar6;
                    i35 = i39;
                    i20 = i32 + 1;
                    i21 = i31;
                }
                tNVar.lG = (tNVar.lG ? 1 : 0) | (sg2.AlY() != 0.0f ? i19 : 0);
                tNVar.Wwa = (tNVar.Wwa ? 1 : 0) | (sg2.wN() != 0.0f ? i19 : 0);
                int[] iArr = this.YFl;
                if (iArr != null) {
                    iArr[i28] = list2.size();
                }
                tNVar.wN = YFl(view, YFl2) + tN(sg2, YFl2) + AlY(sg2, YFl2) + tNVar.wN;
                tNVar.f10289nc = sg2.AlY() + tNVar.f10289nc;
                tNVar.eT = sg2.wN() + tNVar.eT;
                this.AlY.YFl(view, i28, i20, tNVar);
                int max = Math.max(i21, Sg(view, YFl2) + wN(sg2, YFl2) + vc(sg2, YFl2) + this.AlY.YFl(view));
                tNVar.DSW = Math.max(tNVar.DSW, max);
                if (YFl2) {
                    if (this.AlY.getFlexWrap() != 2) {
                        tNVar.YoT = Math.max(tNVar.YoT, sg2.pDU() + view.getBaseline());
                    } else {
                        tNVar.YoT = Math.max(tNVar.YoT, sg2.rkt() + (view.getMeasuredHeight() - view.getBaseline()));
                    }
                }
                i22 = i36;
                if (YFl(i28, i22, tNVar)) {
                    YFl(list2, tNVar, i28, i35);
                    i35 += tNVar.DSW;
                }
                i23 = i14;
                if (i23 == -1 || list2.size() <= 0 || list2.get(list2.size() - i19).rkt < i23 || i28 < i23 || i33 != 0) {
                    i24 = i12;
                } else {
                    i35 = -tNVar.YFl();
                    i24 = i12;
                    i33 = i19;
                }
                if (i35 > i24 && i33 != 0) {
                    yFl2 = yFl;
                    i30 = combineMeasuredStates;
                    break;
                }
                tNVar2 = tNVar;
                i34 = i18;
                i32 = i20;
                i31 = max;
                i28++;
                arrayList = list2;
                size = i15;
                mode = i16;
                i26 = i10;
                flexItemCount = i22;
                tNVar5 = tNVar2;
                i30 = combineMeasuredStates;
            }
            i23 = i14;
            combineMeasuredStates = i30;
            list2 = arrayList;
            i15 = size;
            i16 = mode;
            tNVar2 = tNVar5;
            i22 = flexItemCount;
            i18 = i11;
            i28++;
            arrayList = list2;
            size = i15;
            mode = i16;
            i26 = i10;
            flexItemCount = i22;
            tNVar5 = tNVar2;
            i30 = combineMeasuredStates;
        }
        yFl2.Sg = i30;
    }

    private int Sg(int i10, com.bytedance.adsdk.ugeno.wN.Sg sg2, int i11) {
        com.bytedance.adsdk.ugeno.wN.YFl yFl = this.AlY;
        int Sg2 = yFl.Sg(i10, sg2.rkt() + sg2.pDU() + yFl.getPaddingTop() + this.AlY.getPaddingBottom() + i11, sg2.Sg());
        int size = View.MeasureSpec.getSize(Sg2);
        if (size > sg2.nc()) {
            return View.MeasureSpec.makeMeasureSpec(sg2.nc(), View.MeasureSpec.getMode(Sg2));
        }
        return size < sg2.qsH() ? View.MeasureSpec.makeMeasureSpec(sg2.qsH(), View.MeasureSpec.getMode(Sg2)) : Sg2;
    }

    public void Sg(int i10, int i11, int i12) {
        int i13;
        int i14;
        int flexDirection = this.AlY.getFlexDirection();
        if (flexDirection != 0 && flexDirection != 1) {
            if (flexDirection != 2 && flexDirection != 3) {
                throw new IllegalArgumentException("Invalid flex direction: ".concat(String.valueOf(flexDirection)));
            }
            i13 = View.MeasureSpec.getMode(i10);
            i14 = View.MeasureSpec.getSize(i10);
        } else {
            int mode = View.MeasureSpec.getMode(i11);
            int size = View.MeasureSpec.getSize(i11);
            i13 = mode;
            i14 = size;
        }
        List<tN> flexLinesInternal = this.AlY.getFlexLinesInternal();
        if (i13 == 1073741824) {
            int sumOfCrossSize = this.AlY.getSumOfCrossSize() + i12;
            int i15 = 0;
            if (flexLinesInternal.size() == 1) {
                flexLinesInternal.get(0).DSW = i14 - i12;
                return;
            }
            if (flexLinesInternal.size() >= 2) {
                int alignContent = this.AlY.getAlignContent();
                if (alignContent == 1) {
                    int i16 = i14 - sumOfCrossSize;
                    tN tNVar = new tN();
                    tNVar.DSW = i16;
                    flexLinesInternal.add(0, tNVar);
                    return;
                }
                if (alignContent == 2) {
                    this.AlY.setFlexLines(YFl(flexLinesInternal, i14, sumOfCrossSize));
                    return;
                }
                if (alignContent == 3) {
                    if (sumOfCrossSize < i14) {
                        float size2 = (i14 - sumOfCrossSize) / (flexLinesInternal.size() - 1);
                        ArrayList arrayList = new ArrayList();
                        int size3 = flexLinesInternal.size();
                        float f10 = 0.0f;
                        while (i15 < size3) {
                            arrayList.add(flexLinesInternal.get(i15));
                            if (i15 != flexLinesInternal.size() - 1) {
                                tN tNVar2 = new tN();
                                if (i15 == flexLinesInternal.size() - 2) {
                                    tNVar2.DSW = Math.round(f10 + size2);
                                    f10 = 0.0f;
                                } else {
                                    tNVar2.DSW = Math.round(size2);
                                }
                                int i17 = tNVar2.DSW;
                                float f11 = (size2 - i17) + f10;
                                if (f11 > 1.0f) {
                                    tNVar2.DSW = i17 + 1;
                                    f11 -= 1.0f;
                                } else if (f11 < -1.0f) {
                                    tNVar2.DSW = i17 - 1;
                                    f11 += 1.0f;
                                }
                                f10 = f11;
                                arrayList.add(tNVar2);
                            }
                            i15++;
                        }
                        this.AlY.setFlexLines(arrayList);
                        return;
                    }
                    return;
                }
                if (alignContent == 4) {
                    if (sumOfCrossSize >= i14) {
                        this.AlY.setFlexLines(YFl(flexLinesInternal, i14, sumOfCrossSize));
                        return;
                    }
                    int size4 = (i14 - sumOfCrossSize) / (flexLinesInternal.size() * 2);
                    ArrayList arrayList2 = new ArrayList();
                    tN tNVar3 = new tN();
                    tNVar3.DSW = size4;
                    for (tN tNVar4 : flexLinesInternal) {
                        arrayList2.add(tNVar3);
                        arrayList2.add(tNVar4);
                        arrayList2.add(tNVar3);
                    }
                    this.AlY.setFlexLines(arrayList2);
                    return;
                }
                if (alignContent == 5 && sumOfCrossSize < i14) {
                    float size5 = (i14 - sumOfCrossSize) / flexLinesInternal.size();
                    int size6 = flexLinesInternal.size();
                    float f12 = 0.0f;
                    while (i15 < size6) {
                        tN tNVar5 = flexLinesInternal.get(i15);
                        float f13 = tNVar5.DSW + size5;
                        if (i15 == flexLinesInternal.size() - 1) {
                            f13 += f12;
                            f12 = 0.0f;
                        }
                        int round = Math.round(f13);
                        float f14 = (f13 - round) + f12;
                        if (f14 > 1.0f) {
                            round++;
                            f14 -= 1.0f;
                        } else if (f14 < -1.0f) {
                            round--;
                            f14 += 1.0f;
                        }
                        f12 = f14;
                        tNVar5.DSW = round;
                        i15++;
                    }
                }
            }
        }
    }

    private void YFl(CompoundButton compoundButton) {
        com.bytedance.adsdk.ugeno.wN.Sg sg2 = (com.bytedance.adsdk.ugeno.wN.Sg) compoundButton.getLayoutParams();
        int DSW = sg2.DSW();
        int qsH = sg2.qsH();
        Drawable YFl2 = com.bytedance.adsdk.ugeno.DSW.wN.YFl(compoundButton);
        int minimumWidth = YFl2 == null ? 0 : YFl2.getMinimumWidth();
        int minimumHeight = YFl2 != null ? YFl2.getMinimumHeight() : 0;
        if (DSW == -1) {
            DSW = minimumWidth;
        }
        sg2.YFl(DSW);
        if (qsH == -1) {
            qsH = minimumHeight;
        }
        sg2.Sg(qsH);
    }

    private int YFl(boolean z10) {
        if (z10) {
            return this.AlY.getPaddingStart();
        }
        return this.AlY.getPaddingTop();
    }

    private int YFl(View view, boolean z10) {
        if (z10) {
            return view.getMeasuredWidth();
        }
        return view.getMeasuredHeight();
    }

    private void Sg(View view, int i10, int i11) {
        int measuredHeight;
        com.bytedance.adsdk.ugeno.wN.Sg sg2 = (com.bytedance.adsdk.ugeno.wN.Sg) view.getLayoutParams();
        int min = Math.min(Math.max(((i10 - sg2.GA()) - sg2.EH()) - this.AlY.YFl(view), sg2.DSW()), sg2.NjR());
        long[] jArr = this.f10288vc;
        if (jArr != null) {
            measuredHeight = Sg(jArr[i11]);
        } else {
            measuredHeight = view.getMeasuredHeight();
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(min, 1073741824);
        view.measure(makeMeasureSpec2, makeMeasureSpec);
        YFl(i11, makeMeasureSpec2, makeMeasureSpec, view);
    }

    private int YFl(com.bytedance.adsdk.ugeno.wN.Sg sg2, boolean z10) {
        if (z10) {
            return sg2.YFl();
        }
        return sg2.Sg();
    }

    private boolean YFl(View view, int i10, int i11, int i12, int i13, com.bytedance.adsdk.ugeno.wN.Sg sg2, int i14, int i15, int i16) {
        if (this.AlY.getFlexWrap() == 0) {
            return false;
        }
        if (sg2.eT()) {
            return true;
        }
        if (i10 == 0) {
            return false;
        }
        int maxLine = this.AlY.getMaxLine();
        if (maxLine != -1 && maxLine <= i16 + 1) {
            return false;
        }
        int YFl2 = this.AlY.YFl(view, i14, i15);
        if (YFl2 > 0) {
            i13 += YFl2;
        }
        return i11 < i12 + i13;
    }

    private boolean YFl(int i10, int i11, tN tNVar) {
        return i10 == i11 - 1 && tNVar.Sg() != 0;
    }

    private void YFl(List<tN> list, tN tNVar, int i10, int i11) {
        tNVar.GA = i11;
        this.AlY.YFl(tNVar);
        tNVar.rkt = i10;
        list.add(tNVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void YFl(android.view.View r7, int r8) {
        /*
            r6 = this;
            android.view.ViewGroup$LayoutParams r0 = r7.getLayoutParams()
            com.bytedance.adsdk.ugeno.wN.Sg r0 = (com.bytedance.adsdk.ugeno.wN.Sg) r0
            int r1 = r7.getMeasuredWidth()
            int r2 = r7.getMeasuredHeight()
            int r3 = r0.DSW()
            r4 = 1
            if (r1 >= r3) goto L1b
            int r1 = r0.DSW()
        L19:
            r3 = r4
            goto L27
        L1b:
            int r3 = r0.NjR()
            if (r1 <= r3) goto L26
            int r1 = r0.NjR()
            goto L19
        L26:
            r3 = 0
        L27:
            int r5 = r0.qsH()
            if (r2 >= r5) goto L32
            int r2 = r0.qsH()
            goto L3e
        L32:
            int r5 = r0.nc()
            if (r2 <= r5) goto L3d
            int r2 = r0.nc()
            goto L3e
        L3d:
            r4 = r3
        L3e:
            if (r4 == 0) goto L50
            r0 = 1073741824(0x40000000, float:2.0)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r0)
            r7.measure(r1, r0)
            r6.YFl(r8, r1, r0, r7)
        L50:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.ugeno.wN.AlY.YFl(android.view.View, int):void");
    }

    public void YFl(int i10, int i11) {
        YFl(i10, i11, 0);
    }

    public void YFl(int i10, int i11, int i12) {
        int size;
        int paddingLeft;
        int paddingRight;
        tN(this.AlY.getFlexItemCount());
        if (i12 >= this.AlY.getFlexItemCount()) {
            return;
        }
        int flexDirection = this.AlY.getFlexDirection();
        int flexDirection2 = this.AlY.getFlexDirection();
        if (flexDirection2 != 0 && flexDirection2 != 1) {
            if (flexDirection2 != 2 && flexDirection2 != 3) {
                throw new IllegalArgumentException("Invalid flex direction: ".concat(String.valueOf(flexDirection)));
            }
            int mode = View.MeasureSpec.getMode(i11);
            size = View.MeasureSpec.getSize(i11);
            if (mode != 1073741824) {
                size = this.AlY.getLargestMainSize();
            }
            paddingLeft = this.AlY.getPaddingTop();
            paddingRight = this.AlY.getPaddingBottom();
        } else {
            int mode2 = View.MeasureSpec.getMode(i10);
            size = View.MeasureSpec.getSize(i10);
            int largestMainSize = this.AlY.getLargestMainSize();
            if (mode2 != 1073741824) {
                size = Math.min(largestMainSize, size);
            }
            paddingLeft = this.AlY.getPaddingLeft();
            paddingRight = this.AlY.getPaddingRight();
        }
        int i13 = paddingLeft + paddingRight;
        int[] iArr = this.YFl;
        List<tN> flexLinesInternal = this.AlY.getFlexLinesInternal();
        int size2 = flexLinesInternal.size();
        for (int i14 = iArr != null ? iArr[i12] : 0; i14 < size2; i14++) {
            tN tNVar = flexLinesInternal.get(i14);
            int i15 = tNVar.wN;
            if (i15 < size && tNVar.lG) {
                YFl(i10, i11, tNVar, size, i13, false);
            } else if (i15 > size && tNVar.Wwa) {
                Sg(i10, i11, tNVar, size, i13, false);
            }
        }
    }

    private void YFl(int i10, int i11, tN tNVar, int i12, int i13, boolean z10) {
        int i14;
        int i15;
        int i16;
        double d10;
        int i17;
        double d11;
        float f10 = tNVar.f10289nc;
        float f11 = 0.0f;
        if (f10 <= 0.0f || i12 < (i14 = tNVar.wN)) {
            return;
        }
        float f12 = (i12 - i14) / f10;
        tNVar.wN = i13 + tNVar.f10290vc;
        if (!z10) {
            tNVar.DSW = Integer.MIN_VALUE;
        }
        int i18 = 0;
        boolean z11 = false;
        int i19 = 0;
        float f13 = 0.0f;
        while (i18 < tNVar.qsH) {
            int i20 = tNVar.EH + i18;
            View Sg2 = this.AlY.Sg(i20);
            if (Sg2 == null || Sg2.getVisibility() == 8) {
                i15 = i14;
            } else {
                com.bytedance.adsdk.ugeno.wN.Sg sg2 = (com.bytedance.adsdk.ugeno.wN.Sg) Sg2.getLayoutParams();
                int flexDirection = this.AlY.getFlexDirection();
                if (flexDirection != 0 && flexDirection != 1) {
                    int measuredHeight = Sg2.getMeasuredHeight();
                    long[] jArr = this.f10288vc;
                    if (jArr != null) {
                        measuredHeight = Sg(jArr[i20]);
                    }
                    int measuredWidth = Sg2.getMeasuredWidth();
                    long[] jArr2 = this.f10288vc;
                    if (jArr2 != null) {
                        measuredWidth = YFl(jArr2[i20]);
                    }
                    if (this.wN[i20] || sg2.AlY() <= f11) {
                        i17 = i14;
                    } else {
                        float AlY = (sg2.AlY() * f12) + measuredHeight;
                        if (i18 == tNVar.qsH - 1) {
                            AlY += f13;
                            f13 = f11;
                        }
                        int round = Math.round(AlY);
                        if (round > sg2.nc()) {
                            round = sg2.nc();
                            this.wN[i20] = true;
                            tNVar.f10289nc -= sg2.AlY();
                            i17 = i14;
                            z11 = true;
                        } else {
                            float f14 = (AlY - round) + f13;
                            i17 = i14;
                            double d12 = f14;
                            if (d12 > 1.0d) {
                                round++;
                                d11 = d12 - 1.0d;
                            } else if (d12 < -1.0d) {
                                round--;
                                d11 = d12 + 1.0d;
                            } else {
                                f13 = f14;
                            }
                            f13 = (float) d11;
                        }
                        int YFl2 = YFl(i10, sg2, tNVar.GA);
                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(round, 1073741824);
                        Sg2.measure(YFl2, makeMeasureSpec);
                        measuredWidth = Sg2.getMeasuredWidth();
                        int measuredHeight2 = Sg2.getMeasuredHeight();
                        YFl(i20, YFl2, makeMeasureSpec, Sg2);
                        measuredHeight = measuredHeight2;
                    }
                    i16 = Math.max(i19, sg2.EH() + sg2.GA() + measuredWidth + this.AlY.YFl(Sg2));
                    tNVar.wN = sg2.rkt() + sg2.pDU() + measuredHeight + tNVar.wN;
                    i15 = i17;
                } else {
                    int i21 = i14;
                    int measuredWidth2 = Sg2.getMeasuredWidth();
                    long[] jArr3 = this.f10288vc;
                    if (jArr3 != null) {
                        measuredWidth2 = YFl(jArr3[i20]);
                    }
                    int measuredHeight3 = Sg2.getMeasuredHeight();
                    long[] jArr4 = this.f10288vc;
                    i15 = i21;
                    if (jArr4 != null) {
                        measuredHeight3 = Sg(jArr4[i20]);
                    }
                    if (!this.wN[i20] && sg2.AlY() > 0.0f) {
                        float AlY2 = (sg2.AlY() * f12) + measuredWidth2;
                        if (i18 == tNVar.qsH - 1) {
                            AlY2 += f13;
                            f13 = 0.0f;
                        }
                        int round2 = Math.round(AlY2);
                        if (round2 > sg2.NjR()) {
                            round2 = sg2.NjR();
                            this.wN[i20] = true;
                            tNVar.f10289nc -= sg2.AlY();
                            z11 = true;
                        } else {
                            float f15 = (AlY2 - round2) + f13;
                            double d13 = f15;
                            if (d13 > 1.0d) {
                                round2++;
                                d10 = d13 - 1.0d;
                            } else {
                                if (d13 < -1.0d) {
                                    round2--;
                                    d10 = d13 + 1.0d;
                                }
                                f13 = f15;
                            }
                            f15 = (float) d10;
                            f13 = f15;
                        }
                        int Sg3 = Sg(i11, sg2, tNVar.GA);
                        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(round2, 1073741824);
                        Sg2.measure(makeMeasureSpec2, Sg3);
                        int measuredWidth3 = Sg2.getMeasuredWidth();
                        int measuredHeight4 = Sg2.getMeasuredHeight();
                        YFl(i20, makeMeasureSpec2, Sg3, Sg2);
                        measuredWidth2 = measuredWidth3;
                        measuredHeight3 = measuredHeight4;
                    }
                    int max = Math.max(i19, sg2.rkt() + sg2.pDU() + measuredHeight3 + this.AlY.YFl(Sg2));
                    tNVar.wN = sg2.EH() + sg2.GA() + measuredWidth2 + tNVar.wN;
                    i16 = max;
                }
                tNVar.DSW = Math.max(tNVar.DSW, i16);
                i19 = i16;
            }
            i18++;
            i14 = i15;
            f11 = 0.0f;
        }
        int i22 = i14;
        if (!z11 || i22 == tNVar.wN) {
            return;
        }
        YFl(i10, i11, tNVar, i12, i13, true);
    }

    private int YFl(int i10, com.bytedance.adsdk.ugeno.wN.Sg sg2, int i11) {
        com.bytedance.adsdk.ugeno.wN.YFl yFl = this.AlY;
        int YFl2 = yFl.YFl(i10, sg2.EH() + sg2.GA() + yFl.getPaddingLeft() + this.AlY.getPaddingRight() + i11, sg2.YFl());
        int size = View.MeasureSpec.getSize(YFl2);
        if (size > sg2.NjR()) {
            return View.MeasureSpec.makeMeasureSpec(sg2.NjR(), View.MeasureSpec.getMode(YFl2));
        }
        return size < sg2.DSW() ? View.MeasureSpec.makeMeasureSpec(sg2.DSW(), View.MeasureSpec.getMode(YFl2)) : YFl2;
    }

    private List<tN> YFl(List<tN> list, int i10, int i11) {
        int i12 = (i10 - i11) / 2;
        ArrayList arrayList = new ArrayList();
        tN tNVar = new tN();
        tNVar.DSW = i12;
        int size = list.size();
        for (int i13 = 0; i13 < size; i13++) {
            if (i13 == 0) {
                arrayList.add(tNVar);
            }
            arrayList.add(list.get(i13));
            if (i13 == list.size() - 1) {
                arrayList.add(tNVar);
            }
        }
        return arrayList;
    }

    public void YFl() {
        YFl(0);
    }

    public void YFl(int i10) {
        View Sg2;
        if (i10 >= this.AlY.getFlexItemCount()) {
            return;
        }
        int flexDirection = this.AlY.getFlexDirection();
        if (this.AlY.getAlignItems() == 4) {
            int[] iArr = this.YFl;
            List<tN> flexLinesInternal = this.AlY.getFlexLinesInternal();
            int size = flexLinesInternal.size();
            for (int i11 = iArr != null ? iArr[i10] : 0; i11 < size; i11++) {
                tN tNVar = flexLinesInternal.get(i11);
                int i12 = tNVar.qsH;
                for (int i13 = 0; i13 < i12; i13++) {
                    int i14 = tNVar.EH + i13;
                    if (i13 < this.AlY.getFlexItemCount() && (Sg2 = this.AlY.Sg(i14)) != null && Sg2.getVisibility() != 8) {
                        com.bytedance.adsdk.ugeno.wN.Sg sg2 = (com.bytedance.adsdk.ugeno.wN.Sg) Sg2.getLayoutParams();
                        if (sg2.vc() == -1 || sg2.vc() == 4) {
                            if (flexDirection != 0 && flexDirection != 1) {
                                if (flexDirection != 2 && flexDirection != 3) {
                                    throw new IllegalArgumentException("Invalid flex direction: ".concat(String.valueOf(flexDirection)));
                                }
                                Sg(Sg2, tNVar.DSW, i14);
                            } else {
                                YFl(Sg2, tNVar.DSW, i14);
                            }
                        }
                    }
                }
            }
            return;
        }
        for (tN tNVar2 : this.AlY.getFlexLinesInternal()) {
            for (Integer num : tNVar2.pDU) {
                View Sg3 = this.AlY.Sg(num.intValue());
                if (flexDirection != 0 && flexDirection != 1) {
                    if (flexDirection != 2 && flexDirection != 3) {
                        throw new IllegalArgumentException("Invalid flex direction: ".concat(String.valueOf(flexDirection)));
                    }
                    Sg(Sg3, tNVar2.DSW, num.intValue());
                } else {
                    YFl(Sg3, tNVar2.DSW, num.intValue());
                }
            }
        }
    }

    private void YFl(View view, int i10, int i11) {
        int measuredWidth;
        com.bytedance.adsdk.ugeno.wN.Sg sg2 = (com.bytedance.adsdk.ugeno.wN.Sg) view.getLayoutParams();
        int min = Math.min(Math.max(((i10 - sg2.pDU()) - sg2.rkt()) - this.AlY.YFl(view), sg2.qsH()), sg2.nc());
        long[] jArr = this.f10288vc;
        if (jArr != null) {
            measuredWidth = YFl(jArr[i11]);
        } else {
            measuredWidth = view.getMeasuredWidth();
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(min, 1073741824);
        view.measure(makeMeasureSpec, makeMeasureSpec2);
        YFl(i11, makeMeasureSpec, makeMeasureSpec2, view);
    }

    public void YFl(View view, tN tNVar, int i10, int i11, int i12, int i13) {
        com.bytedance.adsdk.ugeno.wN.Sg sg2 = (com.bytedance.adsdk.ugeno.wN.Sg) view.getLayoutParams();
        int alignItems = this.AlY.getAlignItems();
        if (sg2.vc() != -1) {
            alignItems = sg2.vc();
        }
        int i14 = tNVar.DSW;
        if (alignItems != 0) {
            if (alignItems == 1) {
                if (this.AlY.getFlexWrap() != 2) {
                    int i15 = i11 + i14;
                    view.layout(i10, (i15 - view.getMeasuredHeight()) - sg2.rkt(), i12, i15 - sg2.rkt());
                    return;
                }
                view.layout(i10, sg2.pDU() + view.getMeasuredHeight() + (i11 - i14), i12, sg2.pDU() + view.getMeasuredHeight() + (i13 - i14));
                return;
            }
            if (alignItems == 2) {
                int pDU = ((sg2.pDU() + (i14 - view.getMeasuredHeight())) - sg2.rkt()) / 2;
                if (this.AlY.getFlexWrap() != 2) {
                    int i16 = i11 + pDU;
                    view.layout(i10, i16, i12, view.getMeasuredHeight() + i16);
                    return;
                } else {
                    int i17 = i11 - pDU;
                    view.layout(i10, i17, i12, view.getMeasuredHeight() + i17);
                    return;
                }
            }
            if (alignItems == 3) {
                if (this.AlY.getFlexWrap() != 2) {
                    int max = Math.max(tNVar.YoT - view.getBaseline(), sg2.pDU());
                    view.layout(i10, i11 + max, i12, i13 + max);
                    return;
                } else {
                    int max2 = Math.max(view.getBaseline() + (tNVar.YoT - view.getMeasuredHeight()), sg2.rkt());
                    view.layout(i10, i11 - max2, i12, i13 - max2);
                    return;
                }
            }
            if (alignItems != 4) {
                return;
            }
        }
        if (this.AlY.getFlexWrap() != 2) {
            view.layout(i10, sg2.pDU() + i11, i12, sg2.pDU() + i13);
        } else {
            view.layout(i10, i11 - sg2.rkt(), i12, i13 - sg2.rkt());
        }
    }

    public void YFl(View view, tN tNVar, boolean z10, int i10, int i11, int i12, int i13) {
        com.bytedance.adsdk.ugeno.wN.Sg sg2 = (com.bytedance.adsdk.ugeno.wN.Sg) view.getLayoutParams();
        int alignItems = this.AlY.getAlignItems();
        if (sg2.vc() != -1) {
            alignItems = sg2.vc();
        }
        int i14 = tNVar.DSW;
        if (alignItems != 0) {
            if (alignItems == 1) {
                if (!z10) {
                    view.layout(((i10 + i14) - view.getMeasuredWidth()) - sg2.EH(), i11, ((i12 + i14) - view.getMeasuredWidth()) - sg2.EH(), i13);
                    return;
                }
                view.layout(sg2.GA() + view.getMeasuredWidth() + (i10 - i14), i11, sg2.GA() + view.getMeasuredWidth() + (i12 - i14), i13);
                return;
            }
            if (alignItems == 2) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                int YFl2 = ((com.bytedance.adsdk.ugeno.DSW.vc.YFl(marginLayoutParams) + (i14 - view.getMeasuredWidth())) - com.bytedance.adsdk.ugeno.DSW.vc.Sg(marginLayoutParams)) / 2;
                if (!z10) {
                    view.layout(i10 + YFl2, i11, i12 + YFl2, i13);
                    return;
                } else {
                    view.layout(i10 - YFl2, i11, i12 - YFl2, i13);
                    return;
                }
            }
            if (alignItems != 3 && alignItems != 4) {
                return;
            }
        }
        if (!z10) {
            view.layout(sg2.GA() + i10, i11, sg2.GA() + i12, i13);
        } else {
            view.layout(i10 - sg2.EH(), i11, i12 - sg2.EH(), i13);
        }
    }

    private void YFl(int i10, int i11, int i12, View view) {
        long[] jArr = this.Sg;
        if (jArr != null) {
            jArr[i10] = Sg(i11, i12);
        }
        long[] jArr2 = this.f10288vc;
        if (jArr2 != null) {
            jArr2[i10] = Sg(view.getMeasuredWidth(), view.getMeasuredHeight());
        }
    }
}
