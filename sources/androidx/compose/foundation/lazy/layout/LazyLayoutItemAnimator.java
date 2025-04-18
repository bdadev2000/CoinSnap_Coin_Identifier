package androidx.compose.foundation.lazy.layout;

import androidx.collection.MutableScatterMap;
import androidx.collection.MutableScatterSet;
import androidx.collection.ScatterMapKt;
import androidx.collection.ScatterSetKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.graphics.layer.GraphicsLayerKt;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSizeKt;
import b1.d0;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.jvm.internal.e;
import p0.a;

@StabilityInferred
/* loaded from: classes2.dex */
public final class LazyLayoutItemAnimator<T extends LazyLayoutMeasuredItem> {

    /* renamed from: a, reason: collision with root package name */
    public final MutableScatterMap f4753a;

    /* renamed from: b, reason: collision with root package name */
    public LazyLayoutKeyIndexMap f4754b;

    /* renamed from: c, reason: collision with root package name */
    public int f4755c;
    public final MutableScatterSet d;
    public final ArrayList e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f4756f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f4757g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f4758h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f4759i;

    /* renamed from: j, reason: collision with root package name */
    public DrawModifierNode f4760j;

    /* renamed from: k, reason: collision with root package name */
    public final Modifier f4761k;

    /* loaded from: classes2.dex */
    public static final class DisplayingDisappearingItemsElement extends ModifierNodeElement<DisplayingDisappearingItemsNode> {

        /* renamed from: a, reason: collision with root package name */
        public final LazyLayoutItemAnimator f4766a;

        public DisplayingDisappearingItemsElement(LazyLayoutItemAnimator lazyLayoutItemAnimator) {
            this.f4766a = lazyLayoutItemAnimator;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator$DisplayingDisappearingItemsNode, androidx.compose.ui.Modifier$Node] */
        @Override // androidx.compose.ui.node.ModifierNodeElement
        public final Modifier.Node a() {
            ?? node = new Modifier.Node();
            node.f4767o = this.f4766a;
            return node;
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public final void b(Modifier.Node node) {
            DisplayingDisappearingItemsNode displayingDisappearingItemsNode = (DisplayingDisappearingItemsNode) node;
            LazyLayoutItemAnimator lazyLayoutItemAnimator = displayingDisappearingItemsNode.f4767o;
            LazyLayoutItemAnimator lazyLayoutItemAnimator2 = this.f4766a;
            if (a.g(lazyLayoutItemAnimator, lazyLayoutItemAnimator2) || !displayingDisappearingItemsNode.f14688a.f14699n) {
                return;
            }
            displayingDisappearingItemsNode.f4767o.f();
            lazyLayoutItemAnimator2.f4760j = displayingDisappearingItemsNode;
            displayingDisappearingItemsNode.f4767o = lazyLayoutItemAnimator2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DisplayingDisappearingItemsElement) && a.g(this.f4766a, ((DisplayingDisappearingItemsElement) obj).f4766a);
        }

        public final int hashCode() {
            return this.f4766a.hashCode();
        }

        public final String toString() {
            return "DisplayingDisappearingItemsElement(animator=" + this.f4766a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class DisplayingDisappearingItemsNode extends Modifier.Node implements DrawModifierNode {

        /* renamed from: o, reason: collision with root package name */
        public LazyLayoutItemAnimator f4767o;

        @Override // androidx.compose.ui.Modifier.Node
        public final void W1() {
            this.f4767o.f4760j = this;
        }

        @Override // androidx.compose.ui.Modifier.Node
        public final void X1() {
            this.f4767o.f();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DisplayingDisappearingItemsNode) && a.g(this.f4767o, ((DisplayingDisappearingItemsNode) obj).f4767o);
        }

        public final int hashCode() {
            return this.f4767o.hashCode();
        }

        public final String toString() {
            return "DisplayingDisappearingItemsNode(animator=" + this.f4767o + ')';
        }

        @Override // androidx.compose.ui.node.DrawModifierNode
        public final void z(ContentDrawScope contentDrawScope) {
            ArrayList arrayList = this.f4767o.f4759i;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                LazyLayoutItemAnimation lazyLayoutItemAnimation = (LazyLayoutItemAnimation) arrayList.get(i2);
                GraphicsLayer graphicsLayer = lazyLayoutItemAnimation.f4720n;
                if (graphicsLayer != null) {
                    long j2 = lazyLayoutItemAnimation.f4719m;
                    long j3 = graphicsLayer.f15170s;
                    float f2 = ((int) (j2 >> 32)) - ((int) (j3 >> 32));
                    float f3 = ((int) (j2 & 4294967295L)) - ((int) (4294967295L & j3));
                    contentDrawScope.A1().f15139a.g(f2, f3);
                    try {
                        GraphicsLayerKt.a(contentDrawScope, graphicsLayer);
                    } finally {
                        contentDrawScope.A1().f15139a.g(-f2, -f3);
                    }
                }
            }
            contentDrawScope.P1();
        }
    }

    /* loaded from: classes2.dex */
    public final class ItemInfo {

        /* renamed from: b, reason: collision with root package name */
        public Constraints f4769b;

        /* renamed from: c, reason: collision with root package name */
        public int f4770c;
        public int d;

        /* renamed from: f, reason: collision with root package name */
        public int f4771f;

        /* renamed from: g, reason: collision with root package name */
        public int f4772g;

        /* renamed from: a, reason: collision with root package name */
        public LazyLayoutItemAnimation[] f4768a = LazyLayoutItemAnimatorKt.f4775a;
        public int e = 1;

        public ItemInfo() {
        }

        public static void b(ItemInfo itemInfo, LazyLayoutMeasuredItem lazyLayoutMeasuredItem, d0 d0Var, GraphicsContext graphicsContext, int i2, int i3) {
            LazyLayoutItemAnimator.this.getClass();
            long m2 = lazyLayoutMeasuredItem.m(0);
            itemInfo.a(lazyLayoutMeasuredItem, d0Var, graphicsContext, i2, i3, (int) (!lazyLayoutMeasuredItem.g() ? m2 & 4294967295L : m2 >> 32));
        }

        public final void a(LazyLayoutMeasuredItem lazyLayoutMeasuredItem, d0 d0Var, GraphicsContext graphicsContext, int i2, int i3, int i4) {
            LazyLayoutItemAnimation[] lazyLayoutItemAnimationArr = this.f4768a;
            int length = lazyLayoutItemAnimationArr.length;
            int i5 = 0;
            while (true) {
                if (i5 >= length) {
                    this.f4771f = i2;
                    this.f4772g = i3;
                    break;
                } else {
                    LazyLayoutItemAnimation lazyLayoutItemAnimation = lazyLayoutItemAnimationArr[i5];
                    if (lazyLayoutItemAnimation != null && lazyLayoutItemAnimation.f4713g) {
                        break;
                    } else {
                        i5++;
                    }
                }
            }
            int length2 = this.f4768a.length;
            for (int b2 = lazyLayoutMeasuredItem.b(); b2 < length2; b2++) {
                LazyLayoutItemAnimation lazyLayoutItemAnimation2 = this.f4768a[b2];
                if (lazyLayoutItemAnimation2 != null) {
                    lazyLayoutItemAnimation2.d();
                }
            }
            if (this.f4768a.length != lazyLayoutMeasuredItem.b()) {
                Object[] copyOf = Arrays.copyOf(this.f4768a, lazyLayoutMeasuredItem.b());
                a.r(copyOf, "copyOf(this, newSize)");
                this.f4768a = (LazyLayoutItemAnimation[]) copyOf;
            }
            this.f4769b = new Constraints(lazyLayoutMeasuredItem.e());
            this.f4770c = i4;
            this.d = lazyLayoutMeasuredItem.n();
            this.e = lazyLayoutMeasuredItem.d();
            int b3 = lazyLayoutMeasuredItem.b();
            for (int i6 = 0; i6 < b3; i6++) {
                Object k2 = lazyLayoutMeasuredItem.k(i6);
                LazyLayoutAnimationSpecsNode lazyLayoutAnimationSpecsNode = k2 instanceof LazyLayoutAnimationSpecsNode ? (LazyLayoutAnimationSpecsNode) k2 : null;
                if (lazyLayoutAnimationSpecsNode == null) {
                    LazyLayoutItemAnimation lazyLayoutItemAnimation3 = this.f4768a[i6];
                    if (lazyLayoutItemAnimation3 != null) {
                        lazyLayoutItemAnimation3.d();
                    }
                    this.f4768a[i6] = null;
                } else {
                    LazyLayoutItemAnimation lazyLayoutItemAnimation4 = this.f4768a[i6];
                    if (lazyLayoutItemAnimation4 == null) {
                        lazyLayoutItemAnimation4 = new LazyLayoutItemAnimation(d0Var, graphicsContext, new LazyLayoutItemAnimator$ItemInfo$updateAnimation$1$animation$1(LazyLayoutItemAnimator.this));
                        this.f4768a[i6] = lazyLayoutItemAnimation4;
                    }
                    lazyLayoutItemAnimation4.d = lazyLayoutAnimationSpecsNode.f4692o;
                    lazyLayoutItemAnimation4.e = lazyLayoutAnimationSpecsNode.f4693p;
                    lazyLayoutItemAnimation4.f4712f = lazyLayoutAnimationSpecsNode.f4694q;
                }
            }
        }
    }

    public LazyLayoutItemAnimator() {
        long[] jArr = ScatterMapKt.f1590a;
        this.f4753a = new MutableScatterMap();
        int i2 = ScatterSetKt.f1605a;
        this.d = new MutableScatterSet();
        this.e = new ArrayList();
        this.f4756f = new ArrayList();
        this.f4757g = new ArrayList();
        this.f4758h = new ArrayList();
        this.f4759i = new ArrayList();
        this.f4761k = new DisplayingDisappearingItemsElement(this);
    }

    public static void c(LazyLayoutMeasuredItem lazyLayoutMeasuredItem, int i2, ItemInfo itemInfo) {
        int i3 = 0;
        long m2 = lazyLayoutMeasuredItem.m(0);
        long a2 = lazyLayoutMeasuredItem.g() ? IntOffset.a(0, i2, m2, 1) : IntOffset.a(i2, 0, m2, 2);
        LazyLayoutItemAnimation[] lazyLayoutItemAnimationArr = itemInfo.f4768a;
        int length = lazyLayoutItemAnimationArr.length;
        int i4 = 0;
        while (i3 < length) {
            LazyLayoutItemAnimation lazyLayoutItemAnimation = lazyLayoutItemAnimationArr[i3];
            int i5 = i4 + 1;
            if (lazyLayoutItemAnimation != null) {
                lazyLayoutItemAnimation.f4718l = IntOffset.d(a2, IntOffset.c(lazyLayoutMeasuredItem.m(i4), m2));
            }
            i3++;
            i4 = i5;
        }
    }

    public static int h(int[] iArr, LazyLayoutMeasuredItem lazyLayoutMeasuredItem) {
        int n2 = lazyLayoutMeasuredItem.n();
        int d = lazyLayoutMeasuredItem.d() + n2;
        int i2 = 0;
        while (n2 < d) {
            int j2 = lazyLayoutMeasuredItem.j() + iArr[n2];
            iArr[n2] = j2;
            i2 = Math.max(i2, j2);
            n2++;
        }
        return i2;
    }

    public final LazyLayoutItemAnimation a(int i2, Object obj) {
        LazyLayoutItemAnimation[] lazyLayoutItemAnimationArr;
        ItemInfo itemInfo = (ItemInfo) this.f4753a.c(obj);
        if (itemInfo == null || (lazyLayoutItemAnimationArr = itemInfo.f4768a) == null) {
            return null;
        }
        return lazyLayoutItemAnimationArr[i2];
    }

    public final long b() {
        ArrayList arrayList = this.f4759i;
        int size = arrayList.size();
        long j2 = 0;
        for (int i2 = 0; i2 < size; i2++) {
            LazyLayoutItemAnimation lazyLayoutItemAnimation = (LazyLayoutItemAnimation) arrayList.get(i2);
            GraphicsLayer graphicsLayer = lazyLayoutItemAnimation.f4720n;
            if (graphicsLayer != null) {
                j2 = IntSizeKt.a(Math.max((int) (j2 >> 32), ((int) (lazyLayoutItemAnimation.f4718l >> 32)) + ((int) (graphicsLayer.f15171t >> 32))), Math.max((int) (j2 & 4294967295L), ((int) (lazyLayoutItemAnimation.f4718l & 4294967295L)) + ((int) (graphicsLayer.f15171t & 4294967295L))));
            }
        }
        return j2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01dc, code lost:
    
        if (r15 == false) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01de, code lost:
    
        r2 = r2.f4768a;
        r3 = r2.length;
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01e2, code lost:
    
        if (r4 >= r3) goto L275;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01e4, code lost:
    
        r8 = r2[r4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01e6, code lost:
    
        if (r8 == null) goto L277;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01ec, code lost:
    
        if (r8.c() == false) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01ee, code lost:
    
        r6.remove(r8);
        r12 = r45.f4760j;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01f3, code lost:
    
        if (r12 == null) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01f5, code lost:
    
        androidx.compose.ui.node.DrawModifierNodeKt.a(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01f8, code lost:
    
        r8.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01fb, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x01fe, code lost:
    
        g(r14, false);
        r2 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0124, code lost:
    
        r15 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x011c, code lost:
    
        r13 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0103, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0216, code lost:
    
        r33 = r2;
        r28 = r8;
        r29 = r9;
        r2 = r24;
        e(r14.getKey());
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0235, code lost:
    
        r4 = r54;
        r29 = r9;
        r2 = new int[r4];
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x023c, code lost:
    
        if (r3 >= r4) goto L278;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x023e, code lost:
    
        r2[r3] = 0;
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0245, code lost:
    
        if (r1 == false) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0048, code lost:
    
        r8 = r45.f4755c;
        r9 = (androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem) e0.u.F0(r49);
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0247, code lost:
    
        if (r7 == null) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x024f, code lost:
    
        if ((!r12.isEmpty()) == false) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0255, code lost:
    
        if (r12.size() <= 1) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0257, code lost:
    
        e0.s.s0(r12, new androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator$onMeasured$$inlined$sortByDescending$1(r7));
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x025f, code lost:
    
        r5 = r12.size();
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0264, code lost:
    
        if (r8 >= r5) goto L279;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0266, code lost:
    
        r9 = (androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem) r12.get(r8);
        r13 = r56 - h(r2, r9);
        r14 = r11.c(r9.getKey());
        p0.a.p(r14);
        c(r9, r13, (androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator.ItemInfo) r14);
        g(r9, false);
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0050, code lost:
    
        if (r9 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0289, code lost:
    
        e0.q.X(r2, 0, 0, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0293, code lost:
    
        if ((!r10.isEmpty()) == false) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0299, code lost:
    
        if (r10.size() <= 1) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x029b, code lost:
    
        e0.s.s0(r10, new androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator$onMeasured$$inlined$sortBy$1(r7));
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x02a3, code lost:
    
        r5 = r10.size();
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x02a8, code lost:
    
        if (r8 >= r5) goto L280;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x02aa, code lost:
    
        r9 = (androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem) r10.get(r8);
        r13 = (h(r2, r9) + r57) - r9.j();
        r14 = r11.c(r9.getKey());
        p0.a.p(r14);
        c(r9, r13, (androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator.ItemInfo) r14);
        g(r9, false);
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0052, code lost:
    
        r9 = r9.getIndex();
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x02d2, code lost:
    
        e0.q.X(r2, 0, 0, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x02d6, code lost:
    
        r5 = r29;
        r8 = r5.f1592b;
        r9 = r5.f1591a;
        r13 = r9.length - 2;
        r14 = r45.f4758h;
        r15 = r45.f4757g;
        r25 = r1;
        r27 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x02e7, code lost:
    
        if (r13 < 0) goto L215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x02e9, code lost:
    
        r3 = 0;
        r11 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x02ea, code lost:
    
        r1 = r9[r3];
        r29 = r9;
        r28 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x02f8, code lost:
    
        if (((((~r1) << 7) & r1) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x02fa, code lost:
    
        r9 = 8 - ((~(r3 - r13)) >>> 31);
        r10 = 0;
        r11 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0304, code lost:
    
        if (r10 >= r9) goto L283;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x030a, code lost:
    
        if ((r1 & 255) >= 128) goto L207;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0058, code lost:
    
        r45.f4755c = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x030c, code lost:
    
        r31 = r5;
        r5 = r8[(r3 << 3) + r10];
        r30 = r11.c(r5);
        p0.a.p(r30);
        r32 = r8;
        r8 = (androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator.ItemInfo) r30;
        r40 = r11;
        r30 = r12;
        r11 = r50.b(r5);
        r12 = java.lang.Math.min(r4, r8.e);
        r8.e = r12;
        r8.d = java.lang.Math.min(r4 - r12, r8.d);
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x033e, code lost:
    
        if (r11 != (-1)) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0340, code lost:
    
        r11 = r8.f4768a;
        r12 = r11.length;
        r4 = 0;
        r33 = false;
        r34 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0348, code lost:
    
        if (r4 >= r12) goto L284;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x034a, code lost:
    
        r35 = r12;
        r12 = r11[r4];
        r36 = r34 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0350, code lost:
    
        if (r12 == null) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0356, code lost:
    
        if (r12.c() == false) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0358, code lost:
    
        r41 = r3;
        r43 = r9;
        r44 = r10;
        r37 = r11;
        r42 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0362, code lost:
    
        r33 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005a, code lost:
    
        if (r52 == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x03e6, code lost:
    
        r4 = r4 + 1;
        r12 = r35;
        r34 = r36;
        r11 = r37;
        r3 = r41;
        r13 = r42;
        r9 = r43;
        r10 = r44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0367, code lost:
    
        r37 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x0375, code lost:
    
        if (((java.lang.Boolean) r12.f4717k.getValue()).booleanValue() == false) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0377, code lost:
    
        r12.d();
        r8.f4768a[r34] = null;
        r6.remove(r12);
        r11 = r45.f4760j;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0385, code lost:
    
        if (r11 == null) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x0387, code lost:
    
        androidx.compose.ui.node.DrawModifierNodeKt.a(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x038a, code lost:
    
        r41 = r3;
        r43 = r9;
        r44 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x0390, code lost:
    
        r42 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005c, code lost:
    
        r12 = androidx.compose.ui.unit.IntOffsetKt.a(0, r46);
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x0394, code lost:
    
        r11 = r12.f4720n;
        r41 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x0398, code lost:
    
        if (r11 == null) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x039a, code lost:
    
        r3 = r12.f4712f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x03a0, code lost:
    
        if (r12.c() != false) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x03a2, code lost:
    
        if (r3 != null) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x03a5, code lost:
    
        r42 = r13;
        r12.f(true);
        r43 = r9;
        r44 = r10;
        kotlin.jvm.internal.e.v(r12.f4709a, null, 0, new androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animateDisappearance$1(r12, r3, r11, null), 3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x03c7, code lost:
    
        if (r12.c() == false) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x03c9, code lost:
    
        r6.add(r12);
        r3 = r45.f4760j;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x03ce, code lost:
    
        if (r3 == null) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0067, code lost:
    
        if (r53 != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x03d0, code lost:
    
        androidx.compose.ui.node.DrawModifierNodeKt.a(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x03d4, code lost:
    
        r12.d();
        r8.f4768a[r34] = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x03bd, code lost:
    
        r43 = r9;
        r44 = r10;
        r42 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x03dd, code lost:
    
        r41 = r3;
        r43 = r9;
        r44 = r10;
        r37 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x03f8, code lost:
    
        r41 = r3;
        r43 = r9;
        r44 = r10;
        r42 = r13;
        r40 = r40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x0401, code lost:
    
        if (r33 != false) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x0403, code lost:
    
        e(r5);
        r40 = r40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0069, code lost:
    
        if (r55 != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x0489, code lost:
    
        r1 = r1 >> 8;
        r10 = r44 + 1;
        r4 = r54;
        r12 = r30;
        r5 = r31;
        r8 = r32;
        r11 = r40;
        r3 = r41;
        r13 = r42;
        r9 = r43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x0408, code lost:
    
        r41 = r3;
        r43 = r9;
        r44 = r10;
        r42 = r13;
        r3 = r8.f4769b;
        p0.a.p(r3);
        r3 = r51.a(r11, r8.d, r3.f17480a, r8.e);
        r3.l();
        r4 = r8.f4768a;
        r10 = r4.length;
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x0431, code lost:
    
        if (r12 >= r10) goto L288;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x0433, code lost:
    
        r13 = r4[r12];
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x0435, code lost:
    
        if (r13 == null) goto L290;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x0444, code lost:
    
        if (((java.lang.Boolean) r13.f4714h.getValue()).booleanValue() != true) goto L291;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x0457, code lost:
    
        r8.a(r3, r58, r59, r56, r57, r8.f4770c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x046c, code lost:
    
        if (r11 >= r45.f4755c) goto L205;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006c, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x046e, code lost:
    
        r15.add(r3);
        r40 = r40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x0472, code lost:
    
        r14.add(r3);
        r40 = r40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x0447, code lost:
    
        r12 = r12 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x044b, code lost:
    
        if (r7 == null) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x0451, code lost:
    
        if (r11 != r7.b(r5)) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x0453, code lost:
    
        e(r5);
        r40 = r40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006f, code lost:
    
        r10 = r11.f1558b;
        r14 = r11.f1557a;
        r15 = r14.length - 2;
        r9 = r45.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x0478, code lost:
    
        r41 = r3;
        r31 = r5;
        r32 = r8;
        r43 = r9;
        r44 = r10;
        r40 = r11;
        r30 = r12;
        r42 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x049e, code lost:
    
        r41 = r3;
        r31 = r5;
        r32 = r8;
        r40 = r11;
        r30 = r12;
        r42 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x04ad, code lost:
    
        if (r9 != 8) goto L281;
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x04af, code lost:
    
        r1 = r41;
        r13 = r42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x04c2, code lost:
    
        if (r1 == r13) goto L282;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x04c4, code lost:
    
        r4 = r54;
        r3 = r1 + 1;
        r10 = r28;
        r9 = r29;
        r12 = r30;
        r5 = r31;
        r8 = r32;
        r11 = r40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x04e5, code lost:
    
        if ((!r15.isEmpty()) == false) goto L236;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0083, code lost:
    
        if (r15 < 0) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x04eb, code lost:
    
        if (r15.size() <= 1) goto L221;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x04ed, code lost:
    
        r2 = r50;
        e0.s.s0(r15, new androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator$onMeasured$$inlined$sortByDescending$2(r2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x04fa, code lost:
    
        r1 = r15.size();
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x04ff, code lost:
    
        if (r3 >= r1) goto L292;
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x0501, code lost:
    
        r4 = (androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem) r15.get(r3);
        r6 = r40;
        r5 = r6.c(r4.getKey());
        p0.a.p(r5);
        r5 = (androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator.ItemInfo) r5;
        r7 = r27;
        r8 = h(r7, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x051c, code lost:
    
        if (r53 == false) goto L230;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x051e, code lost:
    
        r9 = (androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem) e0.u.E0(r49);
        r11 = r9.m(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x052d, code lost:
    
        if (r9.g() == false) goto L229;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x052f, code lost:
    
        r9 = (int) (r11 & 4294967295L);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0085, code lost:
    
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x053f, code lost:
    
        r4.i(r9 - r8, r5.f4770c, r47, r48);
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x054a, code lost:
    
        if (r25 == false) goto L294;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x054c, code lost:
    
        g(r4, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x054f, code lost:
    
        r3 = r3 + 1;
        r40 = r6;
        r27 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x0537, code lost:
    
        r9 = (int) (r11 >> 32);
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x053d, code lost:
    
        r9 = r5.f4771f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x0556, code lost:
    
        r8 = r47;
        r10 = r48;
        r7 = r27;
        r6 = r40;
        r5 = 1;
        e0.q.X(r7, 0, 0, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0086, code lost:
    
        r5 = r14[r2];
        r24 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x0575, code lost:
    
        if (((r14.isEmpty() ? 1 : 0) ^ r5) == 0) goto L255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x057b, code lost:
    
        if (r14.size() <= r5) goto L242;
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x057d, code lost:
    
        e0.s.s0(r14, new androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator$onMeasured$$inlined$sortBy$2(r2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x0585, code lost:
    
        r1 = r14.size();
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x058a, code lost:
    
        if (r9 >= r1) goto L295;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x058c, code lost:
    
        r2 = (androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem) r14.get(r9);
        r3 = r6.c(r2.getKey());
        p0.a.p(r3);
        r3 = (androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator.ItemInfo) r3;
        r4 = h(r7, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x05a3, code lost:
    
        if (r53 == false) goto L250;
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x05a5, code lost:
    
        r5 = (androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem) e0.u.L0(r49);
        r12 = r5.m(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0092, code lost:
    
        if (((((~r5) << 7) & r5) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x05b4, code lost:
    
        if (r5.g() == false) goto L249;
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x05b6, code lost:
    
        r11 = (int) (r12 & 4294967295L);
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x05db, code lost:
    
        r2.i(r11 + r4, r3.f4770c, r8, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x05e2, code lost:
    
        if (r25 == false) goto L297;
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x05e4, code lost:
    
        g(r2, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x05e7, code lost:
    
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:268:0x05c2, code lost:
    
        r11 = (int) (r12 >> 32);
     */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x05cd, code lost:
    
        r11 = r3.f4772g - r2.j();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0094, code lost:
    
        r12 = 8 - ((~(r2 - r15)) >>> 31);
        r13 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:271:0x05ea, code lost:
    
        java.util.Collections.reverse(r15);
        r49.addAll(0, r15);
        r49.addAll(r14);
        r30.clear();
        r28.clear();
        r15.clear();
        r14.clear();
        r31.f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:272:0x0605, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:274:0x04f8, code lost:
    
        r2 = r50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:275:0x0565, code lost:
    
        r8 = r47;
        r10 = r48;
        r5 = 1;
        r7 = r27;
        r6 = r40;
        r2 = r50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x04b4, code lost:
    
        r31 = r5;
        r32 = r8;
        r40 = r11;
        r30 = r12;
        r1 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x04d7, code lost:
    
        r31 = r5;
        r28 = r10;
        r40 = r11;
        r30 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x009e, code lost:
    
        if (r13 >= r12) goto L262;
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x00c4, code lost:
    
        r27 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x00cf, code lost:
    
        r24 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:282:0x006e, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x0062, code lost:
    
        r12 = androidx.compose.ui.unit.IntOffsetKt.a(r46, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:284:0x0057, code lost:
    
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a4, code lost:
    
        if ((r5 & 255) >= 128) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a6, code lost:
    
        r27 = r14;
        r9.d(r10[(r2 << 3) + r13]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b7, code lost:
    
        r5 = r5 >> 8;
        r13 = r13 + 1;
        r14 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b4, code lost:
    
        r27 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00bd, code lost:
    
        r27 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c1, code lost:
    
        if (r12 != 8) goto L260;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c6, code lost:
    
        if (r2 == r15) goto L261;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c8, code lost:
    
        r2 = r2 + 1;
        r12 = r24;
        r14 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00d1, code lost:
    
        r2 = r49.size();
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d6, code lost:
    
        r6 = r45.f4759i;
        r10 = r45.f4756f;
        r12 = r45.e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00dc, code lost:
    
        if (r5 >= r2) goto L263;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00de, code lost:
    
        r14 = (androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem) r4.get(r5);
        r9.k(r14.getKey());
        r15 = r14.b();
        r13 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00f2, code lost:
    
        if (r13 >= r15) goto L267;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00f4, code lost:
    
        r33 = r2;
        r2 = r14.k(r13);
        r27 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00fe, code lost:
    
        if ((r2 instanceof androidx.compose.foundation.lazy.layout.LazyLayoutAnimationSpecsNode) == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0100, code lost:
    
        r2 = (androidx.compose.foundation.lazy.layout.LazyLayoutAnimationSpecsNode) r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0104, code lost:
    
        if (r2 == null) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0204, code lost:
    
        r13 = r13 + 1;
        r15 = r27;
        r2 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0106, code lost:
    
        r2 = (androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator.ItemInfo) r11.c(r14.getKey());
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0110, code lost:
    
        if (r7 == null) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0112, code lost:
    
        r13 = r7.b(r14.getKey());
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x011e, code lost:
    
        if (r13 != (-1)) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0120, code lost:
    
        if (r7 == null) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0122, code lost:
    
        r15 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0125, code lost:
    
        if (r2 != null) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0127, code lost:
    
        r2 = new androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator.ItemInfo(r45);
        androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator.ItemInfo.b(r2, r14, r58, r59, r56, r57);
        r11.k(r14.getKey(), r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0146, code lost:
    
        if (r14.getIndex() == r13) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0149, code lost:
    
        if (r13 == (-1)) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x014b, code lost:
    
        if (r13 >= r8) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x014d, code lost:
    
        r12.add(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0150, code lost:
    
        r28 = r8;
        r29 = r9;
        r2 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0225, code lost:
    
        r5 = r5 + 1;
        r4 = r49;
        r24 = r2;
        r8 = r28;
        r9 = r29;
        r2 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0158, code lost:
    
        r10.add(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x015c, code lost:
    
        r12 = r14.m(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0165, code lost:
    
        if (r14.g() == false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0167, code lost:
    
        r12 = r12 & 4294967295L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0174, code lost:
    
        c(r14, (int) r12, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0177, code lost:
    
        if (r15 == false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0179, code lost:
    
        r2 = r2.f4768a;
        r6 = r2.length;
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x017d, code lost:
    
        if (r10 >= r6) goto L269;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x017f, code lost:
    
        r12 = r2[r10];
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0181, code lost:
    
        if (r12 == null) goto L271;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0183, code lost:
    
        r12.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0186, code lost:
    
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0170, code lost:
    
        r12 = r12 >> 32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0189, code lost:
    
        if (r1 == false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x018b, code lost:
    
        androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator.ItemInfo.b(r2, r14, r58, r59, r56, r57);
        r10 = r2.f4768a;
        r12 = r10.length;
        r13 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x019e, code lost:
    
        if (r13 >= r12) goto L272;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01a0, code lost:
    
        r28 = r8;
        r8 = r10[r13];
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01a4, code lost:
    
        if (r8 == null) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01a6, code lost:
    
        r29 = r9;
        r26 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01b2, code lost:
    
        if (androidx.compose.ui.unit.IntOffset.b(r8.f4718l, androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation.f4707s) != false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01b4, code lost:
    
        r9 = r24;
        r8.f4718l = androidx.compose.ui.unit.IntOffset.d(r8.f4718l, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01c7, code lost:
    
        r13 = r13 + 1;
        r24 = r9;
        r10 = r26;
        r8 = r28;
        r9 = r29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01bf, code lost:
    
        r9 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01c2, code lost:
    
        r29 = r9;
        r26 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01d6, code lost:
    
        r28 = r8;
        r29 = r9;
        r9 = r24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(int r46, int r47, int r48, java.util.ArrayList r49, androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap r50, androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItemProvider r51, boolean r52, boolean r53, int r54, boolean r55, int r56, int r57, b1.d0 r58, androidx.compose.ui.graphics.GraphicsContext r59) {
        /*
            Method dump skipped, instructions count: 1542
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator.d(int, int, int, java.util.ArrayList, androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap, androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItemProvider, boolean, boolean, int, boolean, int, int, b1.d0, androidx.compose.ui.graphics.GraphicsContext):void");
    }

    public final void e(Object obj) {
        LazyLayoutItemAnimation[] lazyLayoutItemAnimationArr;
        ItemInfo itemInfo = (ItemInfo) this.f4753a.i(obj);
        if (itemInfo == null || (lazyLayoutItemAnimationArr = itemInfo.f4768a) == null) {
            return;
        }
        for (LazyLayoutItemAnimation lazyLayoutItemAnimation : lazyLayoutItemAnimationArr) {
            if (lazyLayoutItemAnimation != null) {
                lazyLayoutItemAnimation.d();
            }
        }
    }

    public final void f() {
        MutableScatterMap mutableScatterMap = this.f4753a;
        if (mutableScatterMap.e != 0) {
            Object[] objArr = mutableScatterMap.f1559c;
            long[] jArr = mutableScatterMap.f1557a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i2 = 0;
                while (true) {
                    long j2 = jArr[i2];
                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i3 = 8 - ((~(i2 - length)) >>> 31);
                        for (int i4 = 0; i4 < i3; i4++) {
                            if ((255 & j2) < 128) {
                                for (LazyLayoutItemAnimation lazyLayoutItemAnimation : ((ItemInfo) objArr[(i2 << 3) + i4]).f4768a) {
                                    if (lazyLayoutItemAnimation != null) {
                                        lazyLayoutItemAnimation.d();
                                    }
                                }
                            }
                            j2 >>= 8;
                        }
                        if (i3 != 8) {
                            break;
                        }
                    }
                    if (i2 == length) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            mutableScatterMap.e();
        }
        this.f4754b = LazyLayoutKeyIndexMap.Empty.f4795a;
        this.f4755c = -1;
    }

    public final void g(LazyLayoutMeasuredItem lazyLayoutMeasuredItem, boolean z2) {
        LazyLayoutItemAnimation[] lazyLayoutItemAnimationArr;
        int i2;
        long j2;
        Object c2 = this.f4753a.c(lazyLayoutMeasuredItem.getKey());
        a.p(c2);
        LazyLayoutItemAnimation[] lazyLayoutItemAnimationArr2 = ((ItemInfo) c2).f4768a;
        int length = lazyLayoutItemAnimationArr2.length;
        int i3 = 0;
        int i4 = 0;
        while (i3 < length) {
            LazyLayoutItemAnimation lazyLayoutItemAnimation = lazyLayoutItemAnimationArr2[i3];
            int i5 = i4 + 1;
            if (lazyLayoutItemAnimation != null) {
                long m2 = lazyLayoutMeasuredItem.m(i4);
                long j3 = lazyLayoutItemAnimation.f4718l;
                if (!IntOffset.b(j3, LazyLayoutItemAnimation.f4707s) && !IntOffset.b(j3, m2)) {
                    long c3 = IntOffset.c(m2, j3);
                    FiniteAnimationSpec finiteAnimationSpec = lazyLayoutItemAnimation.e;
                    if (finiteAnimationSpec != null) {
                        i2 = i3;
                        long c4 = IntOffset.c(((IntOffset) lazyLayoutItemAnimation.f4723q.getValue()).f17489a, c3);
                        lazyLayoutItemAnimation.h(c4);
                        lazyLayoutItemAnimation.g(true);
                        lazyLayoutItemAnimation.f4713g = z2;
                        lazyLayoutItemAnimationArr = lazyLayoutItemAnimationArr2;
                        j2 = m2;
                        e.v(lazyLayoutItemAnimation.f4709a, null, 0, new LazyLayoutItemAnimation$animatePlacementDelta$1(lazyLayoutItemAnimation, finiteAnimationSpec, c4, null), 3);
                        lazyLayoutItemAnimation.f4718l = j2;
                    }
                }
                lazyLayoutItemAnimationArr = lazyLayoutItemAnimationArr2;
                i2 = i3;
                j2 = m2;
                lazyLayoutItemAnimation.f4718l = j2;
            } else {
                lazyLayoutItemAnimationArr = lazyLayoutItemAnimationArr2;
                i2 = i3;
            }
            i3 = i2 + 1;
            i4 = i5;
            lazyLayoutItemAnimationArr2 = lazyLayoutItemAnimationArr;
        }
    }
}
